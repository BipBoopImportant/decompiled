package com.oppwa.mobile.connect.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Log;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.utils.LogSender;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class Logger {

    /* renamed from: a  reason: collision with root package name */
    static final String f122162a = "com.oppwa.mobile.connect.utils.Logger";

    /* renamed from: b  reason: collision with root package name */
    private static final Integer f122163b = 4;

    /* renamed from: c  reason: collision with root package name */
    protected static String f122164c;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d  reason: collision with root package name */
    private static Context f122165d;

    /* renamed from: e  reason: collision with root package name */
    private static String f122166e;

    /* renamed from: f  reason: collision with root package name */
    private static Connect.ProviderMode f122167f;

    /* renamed from: g  reason: collision with root package name */
    private static SoftReference<Pattern> f122168g;

    /* renamed from: h  reason: collision with root package name */
    private static File f122169h;

    /* renamed from: i  reason: collision with root package name */
    private static LogLevel f122170i = LogLevel.INFO;

    /* renamed from: j  reason: collision with root package name */
    private static LogSender f122171j = new LogSender();

    public enum LogLevel {
        OFF(0),
        ERROR(100),
        WARN(200),
        INFO(300),
        DEBUG(Integer.MAX_VALUE);
        
        public final int value;

        private LogLevel(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    private static String a(String str, String str2) {
        return (String) Optional.ofNullable(str).map(new g(str2)).orElse(str2);
    }

    public static void checkOutdatedFiles(Context context) {
        File[] listFiles;
        File c10 = c(context);
        if (c10 != null && (listFiles = c10.listFiles()) != null) {
            for (File name : listFiles) {
                String replace = name.getName().replace(".txt", "");
                if (c(replace)) {
                    if (!d(replace)) {
                        a(context, replace, (LogSender.CompleteListener) null);
                    } else {
                        a(context, replace);
                    }
                }
            }
        }
    }

    private static boolean d(String str) {
        return System.currentTimeMillis() - b(str).longValue() > TimeUnit.SECONDS.toMillis(1800);
    }

    public static void debug(String str) {
        debug((String) null, str);
    }

    public static void error(String str) {
        error((String) null, str);
    }

    public static LogLevel getLogLevel() {
        return f122170i;
    }

    public static void info(String str) {
        info((String) null, str);
    }

    public static void init(Context context) {
        f122165d = context;
    }

    public static boolean isReady() {
        return (f122167f == null || f122166e == null) ? false : true;
    }

    public static void sendLogs() {
        String str = f122164c;
        if (str != null) {
            a(f122165d, str, (LogSender.CompleteListener) null);
        }
    }

    public static void setCurrentCheckoutId(String str) {
        if (!TextUtils.equals(f122166e, str)) {
            f122166e = str;
            info(LibraryHelper.getLibrariesInfo());
        }
    }

    public static void setLogLevel(LogLevel logLevel) {
        f122170i = logLevel;
    }

    public static void setProviderMode(Connect.ProviderMode providerMode) {
        f122167f = providerMode;
    }

    public static void warning(String str) {
        warning((String) null, str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(String str, String str2) {
        return str2 + ": " + str;
    }

    protected static File c(Context context) {
        if (f122169h == null) {
            f122169h = b(context);
        }
        return f122169h;
    }

    public static void debug(String str, String str2) {
        a(LogLevel.DEBUG, str, a(str, str2));
    }

    public static void error(String str, String str2) {
        String a10 = a(str, str2);
        LogLevel logLevel = LogLevel.ERROR;
        a(logLevel, str, a10);
        if (f122167f == Connect.ProviderMode.TEST) {
            String str3 = f122162a;
            Log.e(str3, logLevel + ": " + a10);
        }
    }

    public static void info(String str, String str2) {
        a(LogLevel.INFO, str, a(str, str2));
    }

    public static void warning(String str, String str2) {
        String a10 = a(str, str2);
        LogLevel logLevel = LogLevel.WARN;
        a(logLevel, str, a10);
        if (f122167f == Connect.ProviderMode.TEST) {
            String str3 = f122162a;
            Log.w(str3, logLevel + ": " + a10);
        }
    }

    protected static List<c> b(Context context, String str) {
        BufferedReader bufferedReader;
        StringBuilder sb2 = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new FileReader(c(context.getApplicationContext(), str)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
                sb2.append("\n");
            }
            bufferedReader.close();
        } catch (Exception e10) {
            try {
                a(e10);
            } catch (Exception e11) {
                a(e11);
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        return a(sb2.toString().split("\n"));
        throw th;
    }

    public static void sendLogs(LogSender.CompleteListener completeListener) {
        String str = f122164c;
        if (str != null) {
            a(f122165d, str, completeListener);
        }
    }

    private static String a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb2.append(10);
            sb2.append(stackTraceElement.toString());
        }
        return sb2.toString();
    }

    protected static File c(Context context, String str) {
        if (c(context) == null) {
            return null;
        }
        return new File(c(context).getPath() + "/" + str + ".txt");
    }

    public static void error(String str, PaymentError paymentError) {
        error(str, paymentError.getErrorCode() + " - " + paymentError.getErrorMessage());
    }

    private static boolean c(String str) {
        return a().matcher(str).matches();
    }

    public static void error(Throwable th2) {
        String th3 = th2.toString();
        String a10 = a(th2.getStackTrace());
        LogLevel logLevel = LogLevel.ERROR;
        a(logLevel, (String) null, th3 + a10);
    }

    protected static void a(LogLevel logLevel, String str, String str2) {
        if (f122166e != null && f122167f != null && logLevel.getValue() <= f122170i.getValue()) {
            if (f122164c == null) {
                f122164c = a(f122167f, Long.valueOf(System.currentTimeMillis()));
            }
            a(c(f122165d, f122164c), a(new c(f122166e, logLevel.name(), String.valueOf(System.currentTimeMillis()), a(str, str2))));
        }
    }

    public static void error(String str, String str2, Throwable th2) {
        String th3 = th2.toString();
        String a10 = a(th2.getStackTrace());
        a(LogLevel.ERROR, str, a(str, str2) + "\n" + th3 + a10);
    }

    private static File b(Context context) {
        File file = new File(context.getFilesDir().getPath() + "/logs");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    private static void b(Context context, List<c> list, String str, LogSender.CompleteListener completeListener) {
        a(context, str);
        Connect.ProviderMode a10 = a(str);
        long longValue = b(str).longValue();
        for (Map.Entry<String, List<c>> value : a(list).entrySet()) {
            String a11 = a(a10, Long.valueOf(longValue));
            List<c> list2 = (List) value.getValue();
            for (c a12 : list2) {
                a(c(context, a11), a(a12));
            }
            a(context, list2, a11, completeListener);
            longValue++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[SYNTHETIC, Splitter:B:16:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c A[SYNTHETIC, Splitter:B:21:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.io.File r3, java.lang.String r4) {
        /*
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x001b }
            r2 = 1
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x001b }
            byte[] r3 = r4.getBytes()     // Catch:{ Exception -> 0x0016, all -> 0x0014 }
            r1.write(r3)     // Catch:{ Exception -> 0x0016, all -> 0x0014 }
            r1.close()     // Catch:{ IOException -> 0x0012 }
            goto L_0x0028
        L_0x0012:
            r3 = move-exception
            goto L_0x0025
        L_0x0014:
            r3 = move-exception
            goto L_0x002a
        L_0x0016:
            r3 = move-exception
            r0 = r1
            goto L_0x001c
        L_0x0019:
            r3 = move-exception
            goto L_0x0029
        L_0x001b:
            r3 = move-exception
        L_0x001c:
            a((java.lang.Exception) r3)     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0028
            r0.close()     // Catch:{ IOException -> 0x0012 }
            goto L_0x0028
        L_0x0025:
            a((java.lang.Exception) r3)
        L_0x0028:
            return
        L_0x0029:
            r1 = r0
        L_0x002a:
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ IOException -> 0x0030 }
            goto L_0x0034
        L_0x0030:
            r4 = move-exception
            a((java.lang.Exception) r4)
        L_0x0034:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.utils.Logger.a(java.io.File, java.lang.String):void");
    }

    private static Long b(String str) {
        return Long.valueOf(Long.parseLong(str.substring(f122163b.intValue())));
    }

    private static String a(c cVar) {
        return cVar.a() + "\n" + cVar.b() + "\n" + cVar.d() + "\n" + cVar.c() + "\n" + "*****" + "\n";
    }

    private static void a(Context context, String str, LogSender.CompleteListener completeListener) {
        List<c> b10 = b(context, str);
        if (!b10.isEmpty()) {
            String a10 = b10.get(0).a();
            for (c a11 : b10) {
                if (!a10.equals(a11.a())) {
                    b(context, b10, str, completeListener);
                    return;
                }
            }
            a(context, b10, str, completeListener);
        }
    }

    private static void a(Context context, List<c> list, String str, LogSender.CompleteListener completeListener) {
        if (a(context) && !list.isEmpty()) {
            if (str.equals(f122164c)) {
                f122164c = null;
            }
            Optional.ofNullable(c(context, str)).ifPresent(new f(completeListener, list, a(str)));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(LogSender.CompleteListener completeListener, List list, Connect.ProviderMode providerMode, File file) {
        f122171j.a(completeListener);
        f122171j.b(list, providerMode, file);
    }

    private static List<c> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        String str2 = str;
        String str3 = str2;
        int i10 = 0;
        for (String str4 : strArr) {
            if (str4.equals("*****")) {
                arrayList.add(new c(str, str2, str3, sb2.toString()));
                sb2 = new StringBuilder();
                i10 = 0;
            } else {
                if (i10 == 0) {
                    str = str4;
                } else if (i10 == 1) {
                    str2 = str4;
                } else if (i10 != 2) {
                    if (sb2.length() > 0) {
                        sb2.append("\n");
                    }
                    sb2.append(str4);
                } else {
                    str3 = str4;
                }
                i10++;
            }
        }
        return arrayList;
    }

    private static boolean a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    private static void a(Exception exc) {
        Log.e(f122162a, "Error: ", exc);
    }

    private static Pattern a() {
        SoftReference<Pattern> softReference = f122168g;
        if (softReference == null || softReference.get() == null) {
            f122168g = new SoftReference<>(Pattern.compile("[a-zA-Z]{4}[0-9]{10,}$"));
        }
        return f122168g.get();
    }

    private static String a(Connect.ProviderMode providerMode) {
        if (providerMode == Connect.ProviderMode.LIVE) {
            return "logL";
        }
        return "logT";
    }

    protected static Connect.ProviderMode a(String str) {
        if (str.substring(0, Math.min(str.length(), f122163b.intValue())).equals("logL")) {
            return Connect.ProviderMode.LIVE;
        }
        return Connect.ProviderMode.TEST;
    }

    private static String a(Connect.ProviderMode providerMode, Long l10) {
        return a(providerMode) + l10;
    }

    private static void a(Context context, String str) {
        File c10 = c(context, str);
        if (c10 != null && !c10.delete()) {
            String str2 = f122162a;
            Log.e(str2, "Cannot delete the log file: " + c10);
        }
    }

    protected static HashMap<String, List<c>> a(List<c> list) {
        HashMap<String, List<c>> hashMap = new HashMap<>();
        for (c next : list) {
            String a10 = next.a();
            if (hashMap.containsKey(a10)) {
                List list2 = hashMap.get(a10);
                if (list2 != null) {
                    list2.add(next);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(a10, arrayList);
            }
        }
        return hashMap;
    }
}
