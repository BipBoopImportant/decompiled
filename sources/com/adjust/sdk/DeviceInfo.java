package com.adjust.sdk;

import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.GooglePlayServicesClient;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Date;
import java.util.Locale;

public class DeviceInfo {
    private static final String OFFICIAL_FACEBOOK_SIGNATURE = "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2";
    public String abi;
    public String androidId;
    public String apiLevel;
    public String appInstallTime;
    public String appSetId;
    public String appUpdateTime;
    public String appVersion;
    public String buildName;
    public String clientSdk;
    public String country;
    public String deviceManufacturer;
    public String deviceName;
    public String deviceType;
    public String displayHeight;
    public String displayWidth;
    public String fbAttributionId;
    public String hardwareName;
    public Boolean isTrackingEnabled;
    public String language;
    private boolean nonGoogleIdsReadOnce = false;
    public String osName;
    public String osVersion;
    public String packageName;
    public String playAdId;
    public int playAdIdAttempt = -1;
    public String playAdIdSource;
    public String screenDensity;
    public String screenFormat;
    public String screenSize;
    public int uiMode;

    public DeviceInfo(AdjustConfig adjustConfig) {
        Context context = adjustConfig.context;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        Locale locale = Util.getLocale(configuration);
        int i10 = configuration.screenLayout;
        this.packageName = getPackageName(context);
        this.appVersion = getAppVersion(context);
        this.deviceType = getDeviceType(configuration);
        this.deviceName = getDeviceName();
        this.deviceManufacturer = getDeviceManufacturer();
        this.osName = getOsName();
        this.osVersion = getOsVersion();
        this.apiLevel = getApiLevel();
        this.language = getLanguage(locale);
        this.country = getCountry(locale);
        this.screenSize = getScreenSize(i10);
        this.screenFormat = getScreenFormat(i10);
        this.screenDensity = getScreenDensity(displayMetrics);
        this.displayWidth = getDisplayWidth(displayMetrics);
        this.displayHeight = getDisplayHeight(displayMetrics);
        this.clientSdk = getClientSdk(adjustConfig.sdkPrefix);
        this.fbAttributionId = getFacebookAttributionId(context);
        this.hardwareName = getHardwareName();
        this.abi = getABI();
        this.buildName = getBuildName();
        this.appInstallTime = getAppInstallTime(context);
        this.appUpdateTime = getAppUpdateTime(context);
        this.uiMode = getDeviceUiMode(configuration);
        if (Util.canReadPlayIds(adjustConfig)) {
            this.appSetId = Reflection.getAppSetId(context);
        }
    }

    private String getABI() {
        String[] supportedAbis = Util.getSupportedAbis();
        return (supportedAbis == null || supportedAbis.length == 0) ? Util.getCpuAbi() : supportedAbis[0];
    }

    private String getApiLevel() {
        return "" + Build.VERSION.SDK_INT;
    }

    private String getAppInstallTime(Context context) {
        try {
            return Util.dateFormatter.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT).firstInstallTime));
        } catch (Exception unused) {
            return null;
        }
    }

    private String getAppUpdateTime(Context context) {
        try {
            return Util.dateFormatter.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT).lastUpdateTime));
        } catch (Exception unused) {
            return null;
        }
    }

    private String getAppVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    private String getBuildName() {
        return Build.ID;
    }

    private String getClientSdk(String str) {
        return str == null ? Constants.CLIENT_SDK : Util.formatString("%s@%s", str, Constants.CLIENT_SDK);
    }

    private String getCountry(Locale locale) {
        return locale.getCountry();
    }

    private String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    private String getDeviceName() {
        return Build.MODEL;
    }

    private String getDeviceType(Configuration configuration) {
        if ((configuration.uiMode & 15) == 4) {
            return "tv";
        }
        int i10 = configuration.screenLayout & 15;
        if (i10 == 1 || i10 == 2) {
            return "phone";
        }
        if (i10 == 3 || i10 == 4) {
            return "tablet";
        }
        return null;
    }

    private int getDeviceUiMode(Configuration configuration) {
        return configuration.uiMode & 15;
    }

    private String getDisplayHeight(DisplayMetrics displayMetrics) {
        return String.valueOf(displayMetrics.heightPixels);
    }

    private String getDisplayWidth(DisplayMetrics displayMetrics) {
        return String.valueOf(displayMetrics.widthPixels);
    }

    private String getFacebookAttributionId(Context context) {
        Cursor query;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.facebook.katana", 64).signatures;
            if (signatureArr != null) {
                if (signatureArr.length == 1) {
                    if (!OFFICIAL_FACEBOOK_SIGNATURE.equals(signatureArr[0].toCharsString()) || (query = context.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid"}, (String) null, (String[]) null, (String) null)) == null) {
                        return null;
                    }
                    if (!query.moveToFirst()) {
                        query.close();
                        return null;
                    }
                    String string = query.getString(query.getColumnIndex("aid"));
                    query.close();
                    return string;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private String getHardwareName() {
        return Build.DISPLAY;
    }

    private String getLanguage(Locale locale) {
        return locale.getLanguage();
    }

    private String getOsName() {
        return "android";
    }

    private String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    private String getPackageName(Context context) {
        return context.getPackageName();
    }

    private String getScreenDensity(DisplayMetrics displayMetrics) {
        int i10 = displayMetrics.densityDpi;
        if (i10 == 0) {
            return null;
        }
        return i10 < 140 ? Constants.LOW : i10 > 200 ? Constants.HIGH : Constants.MEDIUM;
    }

    private String getScreenFormat(int i10) {
        int i11 = i10 & 48;
        if (i11 == 16) {
            return Constants.NORMAL;
        }
        if (i11 != 32) {
            return null;
        }
        return Constants.LONG;
    }

    private String getScreenSize(int i10) {
        int i11 = i10 & 15;
        if (i11 == 1) {
            return Constants.SMALL;
        }
        if (i11 == 2) {
            return Constants.NORMAL;
        }
        if (i11 == 3) {
            return Constants.LARGE;
        }
        if (i11 != 4) {
            return null;
        }
        return Constants.XLARGE;
    }

    public void reloadNonPlayIds(AdjustConfig adjustConfig) {
        if (Util.canReadNonPlayIds(adjustConfig) && !this.nonGoogleIdsReadOnce) {
            this.androidId = Util.getAndroidId(adjustConfig.context);
            this.nonGoogleIdsReadOnce = true;
        }
    }

    public void reloadPlayIds(AdjustConfig adjustConfig) {
        if (Util.canReadPlayIds(adjustConfig)) {
            Context context = adjustConfig.context;
            String str = this.playAdId;
            Boolean bool = this.isTrackingEnabled;
            this.playAdId = null;
            this.isTrackingEnabled = null;
            this.playAdIdSource = null;
            this.playAdIdAttempt = -1;
            for (int i10 = 1; i10 <= 3; i10++) {
                try {
                    GooglePlayServicesClient.GooglePlayServicesInfo googlePlayServicesInfo = GooglePlayServicesClient.getGooglePlayServicesInfo(context, (long) (i10 * 3000));
                    if (this.playAdId == null) {
                        this.playAdId = googlePlayServicesInfo.getGpsAdid();
                    }
                    if (this.isTrackingEnabled == null) {
                        this.isTrackingEnabled = googlePlayServicesInfo.isTrackingEnabled();
                    }
                    if (!(this.playAdId == null || this.isTrackingEnabled == null)) {
                        this.playAdIdSource = "service";
                        this.playAdIdAttempt = i10;
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            for (int i11 = 1; i11 <= 3; i11++) {
                Object advertisingInfoObject = Util.getAdvertisingInfoObject(context, 11000);
                if (advertisingInfoObject != null) {
                    if (this.playAdId == null) {
                        this.playAdId = Util.getPlayAdId(context, advertisingInfoObject, 1000);
                    }
                    if (this.isTrackingEnabled == null) {
                        this.isTrackingEnabled = Util.isPlayTrackingEnabled(context, advertisingInfoObject, 1000);
                    }
                    if (!(this.playAdId == null || this.isTrackingEnabled == null)) {
                        this.playAdIdSource = PlaceTypes.LIBRARY;
                        this.playAdIdAttempt = i11;
                        return;
                    }
                }
            }
            if (this.playAdId == null) {
                this.playAdId = str;
            }
            if (this.isTrackingEnabled == null) {
                this.isTrackingEnabled = bool;
            }
        }
    }
}
