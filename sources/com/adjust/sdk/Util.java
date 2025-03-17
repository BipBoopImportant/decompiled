package com.adjust.sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.adjust.sdk.scheduler.SingleThreadFutureScheduler;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public class Util {
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z";
    public static final DecimalFormat SecondsDisplayFormat = newLocalDecimalFormat();
    public static final SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT, Locale.US);
    private static final String fieldReadErrorMessage = "Unable to read '%s' field in migration device with message (%s)";
    private static volatile SingleThreadFutureScheduler playAdIdScheduler = null;

    public class a implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f45926a;

        public a(Context context) {
            this.f45926a = context;
        }

        public final Object call() {
            try {
                return Reflection.getAdvertisingInfoObject(this.f45926a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public class b implements Callable<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f45927a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f45928b;

        public b(Context context, Object obj) {
            this.f45927a = context;
            this.f45928b = obj;
        }

        public final Object call() {
            return Reflection.getPlayAdId(this.f45927a, this.f45928b);
        }
    }

    public class c implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f45929a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f45930b;

        public c(Context context, Object obj) {
            this.f45929a = context;
            this.f45930b = obj;
        }

        public final Object call() {
            return Reflection.isPlayTrackingEnabled(this.f45929a, this.f45930b);
        }
    }

    public class d extends AsyncTaskExecutor<Context, String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OnDeviceIdsRead f45931a;

        public d(OnDeviceIdsRead onDeviceIdsRead) {
            this.f45931a = onDeviceIdsRead;
        }

        public final Object doInBackground(Object[] objArr) {
            ILogger logger = AdjustFactory.getLogger();
            String access$000 = Util.getGoogleAdId(((Context[]) objArr)[0]);
            logger.debug("GoogleAdId read " + access$000, new Object[0]);
            return access$000;
        }

        public final void onPostExecute(Object obj) {
            this.f45931a.onGoogleAdIdRead((String) obj);
        }
    }

    public static boolean canReadNonPlayIds(AdjustConfig adjustConfig) {
        return !adjustConfig.playStoreKidsAppEnabled && !adjustConfig.coppaCompliantEnabled;
    }

    public static boolean canReadPlayIds(AdjustConfig adjustConfig) {
        return !adjustConfig.playStoreKidsAppEnabled && !adjustConfig.coppaCompliantEnabled;
    }

    public static boolean checkPermission(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e10) {
            getLogger().debug("Unable to check permission '%s' with message (%s)", str, e10.getMessage());
            return false;
        }
    }

    public static String convertToHex(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return formatString("%0" + (bArr.length << 1) + "x", bigInteger);
    }

    public static String createUuid() {
        return UUID.randomUUID().toString();
    }

    public static boolean equalBoolean(Boolean bool, Boolean bool2) {
        return equalObject(bool, bool2);
    }

    public static boolean equalEnum(Enum enumR, Enum enumR2) {
        return equalObject(enumR, enumR2);
    }

    public static boolean equalInt(Integer num, Integer num2) {
        return equalObject(num, num2);
    }

    public static boolean equalLong(Long l10, Long l11) {
        return equalObject(l10, l11);
    }

    public static boolean equalObject(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : obj.equals(obj2);
    }

    public static boolean equalString(String str, String str2) {
        return equalObject(str, str2);
    }

    public static boolean equalsDouble(Double d10, Double d11) {
        return (d10 == null || d11 == null) ? d10 == null && d11 == null : Double.doubleToLongBits(d10.doubleValue()) == Double.doubleToLongBits(d11.doubleValue());
    }

    public static String formatString(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Object getAdvertisingInfoObject(Context context, long j10) {
        return runSyncInPlayAdIdSchedulerWithTimeout(context, new a(context), j10);
    }

    public static String getAndroidId(Context context) {
        return AndroidIdUtil.getAndroidId(context);
    }

    public static int getConnectivityType(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return -1;
            }
            int i10 = Build.VERSION.SDK_INT;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return -1;
            }
            if (networkCapabilities.hasTransport(1)) {
                return 1;
            }
            if (networkCapabilities.hasTransport(0)) {
                return 0;
            }
            if (networkCapabilities.hasTransport(3)) {
                return 3;
            }
            if (networkCapabilities.hasTransport(4)) {
                return 4;
            }
            if (networkCapabilities.hasTransport(2)) {
                return 2;
            }
            if (networkCapabilities.hasTransport(5)) {
                return 5;
            }
            return (i10 >= 27 && networkCapabilities.hasTransport(6)) ? 6 : -1;
        } catch (Exception e10) {
            getLogger().warn("Couldn't read connectivity type (%s)", e10.getMessage());
        }
    }

    public static String getCpuAbi() {
        return null;
    }

    public static String getFireAdvertisingId(ContentResolver contentResolver) {
        if (contentResolver == null) {
            return null;
        }
        try {
            return Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Exception unused) {
            return null;
        }
    }

    public static Boolean getFireTrackingEnabled(ContentResolver contentResolver) {
        try {
            return Boolean.valueOf(Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r0 = getAdvertisingInfoObject(r3, 11000);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getGoogleAdId(android.content.Context r3) {
        /*
            r0 = 11000(0x2af8, double:5.4347E-320)
            com.adjust.sdk.GooglePlayServicesClient$GooglePlayServicesInfo r2 = com.adjust.sdk.GooglePlayServicesClient.getGooglePlayServicesInfo(r3, r0)     // Catch:{ Exception -> 0x000d }
            if (r2 == 0) goto L_0x000d
            java.lang.String r2 = r2.getGpsAdid()     // Catch:{ Exception -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            if (r2 != 0) goto L_0x001c
            java.lang.Object r0 = getAdvertisingInfoObject(r3, r0)
            if (r0 == 0) goto L_0x001c
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r2 = getPlayAdId(r3, r0, r1)
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.Util.getGoogleAdId(android.content.Context):java.lang.String");
    }

    public static Map<String, String> getImeiParameters(AdjustConfig adjustConfig, ILogger iLogger) {
        if (adjustConfig.coppaCompliantEnabled) {
            return null;
        }
        return Reflection.getImeiParameters(adjustConfig.context, iLogger);
    }

    public static Locale getLocale(Configuration configuration) {
        LocaleList locales = configuration.getLocales();
        if (locales == null || locales.isEmpty()) {
            return null;
        }
        return locales.get(0);
    }

    private static ILogger getLogger() {
        return AdjustFactory.getLogger();
    }

    public static String getMcc(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                return networkOperator.substring(0, 3);
            }
            AdjustFactory.getLogger().warn("Couldn't receive networkOperator string to read MCC", new Object[0]);
            return null;
        } catch (Exception unused) {
            AdjustFactory.getLogger().warn("Couldn't return mcc", new Object[0]);
            return null;
        }
    }

    public static String getMnc(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                return networkOperator.substring(3);
            }
            AdjustFactory.getLogger().warn("Couldn't receive networkOperator string to read MNC", new Object[0]);
            return null;
        } catch (Exception unused) {
            AdjustFactory.getLogger().warn("Couldn't return mnc", new Object[0]);
            return null;
        }
    }

    public static Map<String, String> getOaidParameters(AdjustConfig adjustConfig, ILogger iLogger) {
        if (adjustConfig.coppaCompliantEnabled) {
            return null;
        }
        return Reflection.getOaidParameters(adjustConfig.context, iLogger);
    }

    public static String getPlayAdId(Context context, Object obj, long j10) {
        return (String) runSyncInPlayAdIdSchedulerWithTimeout(context, new b(context, obj), j10);
    }

    public static String getReasonString(String str, Throwable th2) {
        return th2 != null ? formatString("%s: %s", str, th2) : formatString("%s", str);
    }

    public static String getRootCause(Exception exc) {
        if (!hasRootCause(exc)) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int indexOf = stringWriter2.indexOf("Caused by:");
        return stringWriter2.substring(indexOf, stringWriter2.indexOf("\n", indexOf));
    }

    private static String getSdkPrefix(String str) {
        String[] split;
        if (str != null && str.contains("@") && (split = str.split("@")) != null && split.length == 2) {
            return split[0];
        }
        return null;
    }

    public static String getSdkPrefixPlatform(String str) {
        String[] split;
        String sdkPrefix = getSdkPrefix(str);
        if (sdkPrefix == null || (split = sdkPrefix.split("\\d+", 2)) == null || split.length == 0) {
            return null;
        }
        return split[0];
    }

    public static String getSdkVersion() {
        return Constants.CLIENT_SDK;
    }

    public static String[] getSupportedAbis() {
        return Build.SUPPORTED_ABIS;
    }

    public static long getWaitingTime(int i10, BackoffStrategy backoffStrategy) {
        int i11 = backoffStrategy.minRetries;
        if (i10 < i11) {
            return 0;
        }
        return (long) (((double) Math.min(((long) Math.pow(2.0d, (double) (i10 - i11))) * backoffStrategy.milliSecondMultiplier, backoffStrategy.maxWait)) * randomInRange(backoffStrategy.minRange, backoffStrategy.maxRange));
    }

    public static boolean hasRootCause(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString().contains("Caused by:");
    }

    public static String hash(String str, String str2) {
        try {
            byte[] bytes = str.getBytes(Constants.ENCODING);
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(bytes, 0, bytes.length);
            return convertToHex(instance.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static int hashBoolean(Boolean bool, int i10) {
        int i11 = i10 * 37;
        return bool == null ? i11 : bool.hashCode() + i11;
    }

    public static int hashDouble(Double d10, int i10) {
        int i11 = i10 * 37;
        return d10 == null ? i11 : d10.hashCode() + i11;
    }

    public static int hashEnum(Enum enumR, int i10) {
        int i11 = i10 * 37;
        return enumR == null ? i11 : enumR.hashCode() + i11;
    }

    public static int hashLong(Long l10, int i10) {
        int i11 = i10 * 37;
        return l10 == null ? i11 : l10.hashCode() + i11;
    }

    public static int hashObject(Object obj, int i10) {
        int i11 = i10 * 37;
        return obj == null ? i11 : obj.hashCode() + i11;
    }

    public static int hashString(String str, int i10) {
        int i11 = i10 * 37;
        return str == null ? i11 : str.hashCode() + i11;
    }

    public static boolean isAdjustUninstallDetectionPayload(Map<String, String> map) {
        return map != null && map.size() == 1 && Objects.equals(map.get(Constants.FCM_PAYLOAD_KEY), Constants.FCM_PAYLOAD_VALUE);
    }

    private static boolean isEqualGoogleReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTime && referrerDetails.installBeginTimestampSeconds == activityState.installBegin && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServer && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServer && equalString(referrerDetails.installReferrer, activityState.installReferrer) && equalString(referrerDetails.installVersion, activityState.installVersion) && equalBoolean(referrerDetails.googlePlayInstant, activityState.googlePlayInstant);
    }

    private static boolean isEqualHuaweiReferrerAdsDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuawei);
    }

    private static boolean isEqualHuaweiReferrerAppGalleryDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuaweiAppGallery);
    }

    public static boolean isEqualReferrerDetails(ReferrerDetails referrerDetails, String str, ActivityState activityState) {
        if (str.equals(Constants.REFERRER_API_GOOGLE)) {
            return isEqualGoogleReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_HUAWEI_ADS)) {
            return isEqualHuaweiReferrerAdsDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_HUAWEI_APP_GALLERY)) {
            return isEqualHuaweiReferrerAppGalleryDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_SAMSUNG)) {
            return isEqualSamsungReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_XIAOMI)) {
            return isEqualXiaomiReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_VIVO)) {
            return isEqualVivoReferrerDetails(referrerDetails, activityState);
        }
        return false;
    }

    private static boolean isEqualSamsungReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeSamsung && referrerDetails.installBeginTimestampSeconds == activityState.installBeginSamsung && equalString(referrerDetails.installReferrer, activityState.installReferrerSamsung);
    }

    private static boolean isEqualVivoReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeVivo && referrerDetails.installBeginTimestampSeconds == activityState.installBeginVivo && equalString(referrerDetails.installReferrer, activityState.installReferrerVivo) && equalString(referrerDetails.installVersion, activityState.installVersionVivo);
    }

    private static boolean isEqualXiaomiReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeXiaomi && referrerDetails.installBeginTimestampSeconds == activityState.installBeginXiaomi && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServerXiaomi && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServerXiaomi && equalString(referrerDetails.installReferrer, activityState.installReferrerXiaomi) && equalString(referrerDetails.installVersion, activityState.installVersionXiaomi);
    }

    public static Boolean isPlayTrackingEnabled(Context context, Object obj, long j10) {
        return (Boolean) runSyncInPlayAdIdSchedulerWithTimeout(context, new c(context, obj), j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r2 = r2.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isUrlFilteredOut(android.net.Uri r2) {
        /*
            r0 = 1
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L_0x001c
            int r1 = r2.length()
            if (r1 != 0) goto L_0x0011
            goto L_0x001c
        L_0x0011:
            java.lang.String r1 = "^(fb|vk)[0-9]{5,}[^:]*://authorize.*access_token=.*"
            boolean r2 = r2.matches(r1)
            if (r2 == 0) goto L_0x001a
            return r0
        L_0x001a:
            r2 = 0
            return r2
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.Util.isUrlFilteredOut(android.net.Uri):boolean");
    }

    public static boolean isValidParameter(String str, String str2, String str3) {
        if (str == null) {
            getLogger().error("%s parameter %s is missing", str3, str2);
            return false;
        } else if (!str.equals("")) {
            return true;
        } else {
            getLogger().error("%s parameter %s is empty", str3, str2);
            return false;
        }
    }

    public static Map<String, String> mergeParameters(Map<String, String> map, Map<String, String> map2, String str) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        HashMap hashMap = new HashMap(map);
        ILogger logger = getLogger();
        for (Map.Entry next : map2.entrySet()) {
            String str2 = (String) hashMap.put((String) next.getKey(), (String) next.getValue());
            if (str2 != null) {
                logger.warn("Key %s with value %s from %s parameter was replaced by value %s", next.getKey(), str2, str, next.getValue());
            }
        }
        return hashMap;
    }

    private static DecimalFormat newLocalDecimalFormat() {
        return new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.US));
    }

    public static String quote(String str) {
        if (str == null) {
            return null;
        }
        return !Pattern.compile("\\s").matcher(str).find() ? str : formatString("'%s'", str);
    }

    private static double randomInRange(double d10, double d11) {
        return (new Random().nextDouble() * (d11 - d10)) + d10;
    }

    public static boolean readBooleanField(ObjectInputStream.GetField getField, String str, boolean z10) {
        try {
            return getField.get(str, z10);
        } catch (Exception e10) {
            getLogger().debug(fieldReadErrorMessage, str, e10.getMessage());
            return z10;
        }
    }

    public static int readIntField(ObjectInputStream.GetField getField, String str, int i10) {
        try {
            return getField.get(str, i10);
        } catch (Exception e10) {
            getLogger().debug(fieldReadErrorMessage, str, e10.getMessage());
            return i10;
        }
    }

    public static long readLongField(ObjectInputStream.GetField getField, String str, long j10) {
        try {
            return getField.get(str, j10);
        } catch (Exception e10) {
            getLogger().debug(fieldReadErrorMessage, str, e10.getMessage());
            return j10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[SYNTHETIC, Splitter:B:32:0x0096] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T readObject(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.Class<T> r6) {
        /*
            r0 = 0
            java.io.FileInputStream r3 = r3.openFileInput(r4)     // Catch:{ FileNotFoundException -> 0x0083, Exception -> 0x006e }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0044, Exception -> 0x003f }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0044, Exception -> 0x003f }
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x006c }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x006c }
            java.lang.Object r4 = r3.readObject()     // Catch:{ ClassNotFoundException -> 0x002a, ClassCastException -> 0x0028, Exception -> 0x0026 }
            java.lang.Object r0 = r6.cast(r4)     // Catch:{ ClassNotFoundException -> 0x002a, ClassCastException -> 0x0028, Exception -> 0x0026 }
            com.adjust.sdk.ILogger r4 = getLogger()     // Catch:{ ClassNotFoundException -> 0x002a, ClassCastException -> 0x0028, Exception -> 0x0026 }
            java.lang.String r6 = "Read %s: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r0}     // Catch:{ ClassNotFoundException -> 0x002a, ClassCastException -> 0x0028, Exception -> 0x0026 }
            r4.debug(r6, r1)     // Catch:{ ClassNotFoundException -> 0x002a, ClassCastException -> 0x0028, Exception -> 0x0026 }
            goto L_0x0094
        L_0x0026:
            r4 = move-exception
            goto L_0x002c
        L_0x0028:
            r4 = move-exception
            goto L_0x0048
        L_0x002a:
            r4 = move-exception
            goto L_0x005a
        L_0x002c:
            com.adjust.sdk.ILogger r6 = getLogger()     // Catch:{ FileNotFoundException -> 0x0044, Exception -> 0x003f }
            java.lang.String r1 = "Failed to read %s object (%s)"
            java.lang.String r4 = r4.getMessage()     // Catch:{ FileNotFoundException -> 0x0044, Exception -> 0x003f }
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}     // Catch:{ FileNotFoundException -> 0x0044, Exception -> 0x003f }
            r6.error(r1, r4)     // Catch:{ FileNotFoundException -> 0x0044, Exception -> 0x003f }
            goto L_0x0094
        L_0x003f:
            r4 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L_0x0070
        L_0x0044:
            r2 = r0
            r0 = r3
            r3 = r2
            goto L_0x0084
        L_0x0048:
            com.adjust.sdk.ILogger r6 = getLogger()     // Catch:{ FileNotFoundException -> 0x0044, Exception -> 0x003f }
            java.lang.String r1 = "Failed to cast %s object (%s)"
            java.lang.String r4 = r4.getMessage()     // Catch:{ FileNotFoundException -> 0x0044, Exception -> 0x003f }
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}     // Catch:{ FileNotFoundException -> 0x0044, Exception -> 0x003f }
            r6.error(r1, r4)     // Catch:{ FileNotFoundException -> 0x0044, Exception -> 0x003f }
            goto L_0x0094
        L_0x005a:
            com.adjust.sdk.ILogger r6 = getLogger()     // Catch:{ FileNotFoundException -> 0x0044, Exception -> 0x003f }
            java.lang.String r1 = "Failed to find %s class (%s)"
            java.lang.String r4 = r4.getMessage()     // Catch:{ FileNotFoundException -> 0x0044, Exception -> 0x003f }
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}     // Catch:{ FileNotFoundException -> 0x0044, Exception -> 0x003f }
            r6.error(r1, r4)     // Catch:{ FileNotFoundException -> 0x0044, Exception -> 0x003f }
            goto L_0x0094
        L_0x006c:
            r3 = move-exception
            goto L_0x0074
        L_0x006e:
            r4 = move-exception
            r3 = r0
        L_0x0070:
            r2 = r0
            r0 = r3
            r3 = r4
            r4 = r2
        L_0x0074:
            com.adjust.sdk.ILogger r6 = getLogger()
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r3}
            java.lang.String r1 = "Failed to open %s file for reading (%s)"
            r6.error(r1, r3)
        L_0x0081:
            r3 = r4
            goto L_0x0094
        L_0x0083:
            r3 = r0
        L_0x0084:
            r4 = r0
            r0 = r3
        L_0x0086:
            com.adjust.sdk.ILogger r3 = getLogger()
            java.lang.Object[] r6 = new java.lang.Object[]{r5}
            java.lang.String r1 = "%s file not found"
            r3.debug(r1, r6)
            goto L_0x0081
        L_0x0094:
            if (r3 == 0) goto L_0x00a8
            r3.close()     // Catch:{ Exception -> 0x009a }
            goto L_0x00a8
        L_0x009a:
            r3 = move-exception
            com.adjust.sdk.ILogger r4 = getLogger()
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r3}
            java.lang.String r5 = "Failed to close %s file for reading (%s)"
            r4.error(r5, r3)
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.Util.readObject(android.content.Context, java.lang.String, java.lang.String, java.lang.Class):java.lang.Object");
    }

    public static <T> T readObjectField(ObjectInputStream.GetField getField, String str, T t10) {
        try {
            return getField.get(str, t10);
        } catch (Exception e10) {
            getLogger().debug(fieldReadErrorMessage, str, e10.getMessage());
            return t10;
        }
    }

    public static String readStringField(ObjectInputStream.GetField getField, String str, String str2) {
        return (String) readObjectField(getField, str, str2);
    }

    public static boolean resolveContentProvider(Context context, String str) {
        try {
            return context.getPackageManager().resolveContentProvider(str, 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    private static <R> R runSyncInPlayAdIdSchedulerWithTimeout(Context context, Callable<R> callable, long j10) {
        if (playAdIdScheduler == null) {
            synchronized (Util.class) {
                try {
                    if (playAdIdScheduler == null) {
                        playAdIdScheduler = new SingleThreadFutureScheduler("PlayAdIdLibrary", true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        try {
            return playAdIdScheduler.scheduleFutureWithReturn(callable, 0).get(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    public static String sha256(String str) {
        return hash(str, Constants.SHA256);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0022 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045 A[SYNTHETIC, Splitter:B:18:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void writeObject(T r1, android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            java.io.FileOutputStream r2 = r2.openFileOutput(r3, r0)     // Catch:{ Exception -> 0x0032 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0020 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0020 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0030 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0030 }
            r2.writeObject(r1)     // Catch:{ NotSerializableException -> 0x0022 }
            com.adjust.sdk.ILogger r3 = getLogger()     // Catch:{ NotSerializableException -> 0x0022 }
            java.lang.String r0 = "Wrote %s: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1}     // Catch:{ NotSerializableException -> 0x0022 }
            r3.debug(r0, r1)     // Catch:{ NotSerializableException -> 0x0022 }
            goto L_0x0043
        L_0x0020:
            r1 = move-exception
            goto L_0x0034
        L_0x0022:
            com.adjust.sdk.ILogger r1 = getLogger()     // Catch:{ Exception -> 0x0020 }
            java.lang.String r3 = "Failed to serialize %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r4}     // Catch:{ Exception -> 0x0020 }
            r1.error(r3, r0)     // Catch:{ Exception -> 0x0020 }
            goto L_0x0043
        L_0x0030:
            r1 = move-exception
            goto L_0x0035
        L_0x0032:
            r1 = move-exception
            r2 = 0
        L_0x0034:
            r3 = r2
        L_0x0035:
            com.adjust.sdk.ILogger r2 = getLogger()
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1}
            java.lang.String r0 = "Failed to open %s for writing (%s)"
            r2.error(r0, r1)
            r2 = r3
        L_0x0043:
            if (r2 == 0) goto L_0x0057
            r2.close()     // Catch:{ Exception -> 0x0049 }
            goto L_0x0057
        L_0x0049:
            r1 = move-exception
            com.adjust.sdk.ILogger r2 = getLogger()
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1}
            java.lang.String r3 = "Failed to close %s file for writing (%s)"
            r2.error(r3, r1)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.Util.writeObject(java.lang.Object, android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static String getFireAdvertisingId(AdjustConfig adjustConfig) {
        if (adjustConfig.coppaCompliantEnabled) {
            return null;
        }
        return getFireAdvertisingId(adjustConfig.context.getContentResolver());
    }

    public static Boolean getFireTrackingEnabled(AdjustConfig adjustConfig) {
        if (adjustConfig.coppaCompliantEnabled) {
            return null;
        }
        return getFireTrackingEnabled(adjustConfig.context.getContentResolver());
    }

    public static void getGoogleAdId(Context context, OnDeviceIdsRead onDeviceIdsRead) {
        new d(onDeviceIdsRead).execute(context);
    }
}
