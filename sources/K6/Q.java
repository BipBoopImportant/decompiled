package K6;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.BatteryManager;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Pair;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

final class Q {
    Q() {
    }

    static int a(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        return "0";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        java.lang.Class.forName("io.flutter.plugins.GeneratedPluginRegistrant");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        return "3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        java.lang.Class.forName("org.apache.cordova.CordovaPlugin");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return "2";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b() {
        /*
            java.lang.String r0 = "com.akamai.react.RNAkamaibmpModule"
            java.lang.String r1 = "io.flutter.plugins.GeneratedPluginRegistrant"
            java.lang.String r2 = "org.apache.cordova.CordovaPlugin"
            java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x000c }
            java.lang.String r0 = "4"
            return r0
        L_0x000c:
            java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r0 = "3"
            return r0
        L_0x0012:
            java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x0018 }
            java.lang.String r0 = "2"
            return r0
        L_0x0018:
            java.lang.String r0 = "0"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.Q.b():java.lang.String");
    }

    public static String c(Application application) {
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Application application2 = application;
        C6595p.c("SystemInfoListener", "Getting system information", new Throwable[0]);
        if (application2 == null) {
            return "-1";
        }
        application.getPackageManager();
        DisplayMetrics displayMetrics = application.getResources().getDisplayMetrics();
        int i11 = displayMetrics.heightPixels;
        int i12 = displayMetrics.widthPixels;
        BatteryManager batteryManager = (BatteryManager) application2.getSystemService("batterymanager");
        Pair pair = new Pair(Boolean.valueOf(batteryManager.isCharging()), Integer.valueOf(batteryManager.getIntProperty(4)));
        int i13 = 1;
        if (application.getResources().getConfiguration().orientation == 1) {
            i10 = 1;
        } else {
            i10 = 2;
            if (application.getResources().getConfiguration().orientation != 2) {
                i10 = -1;
            }
        }
        String language = Locale.getDefault().getLanguage();
        String str15 = Build.VERSION.RELEASE;
        int i14 = Settings.System.getInt(application.getContentResolver(), "accelerometer_rotation", 0) == 1 ? 1 : 0;
        String str16 = Build.MODEL;
        String str17 = Build.BOOTLOADER;
        int i15 = Build.VERSION.SDK_INT;
        String str18 = Build.HARDWARE;
        String packageName = application.getPackageName();
        String e10 = e(application);
        if (application.getResources().getConfiguration().keyboard == 1) {
            i13 = 0;
        }
        int a10 = a(application);
        try {
            str12 = Build.VERSION.CODENAME;
            try {
                str13 = Build.VERSION.INCREMENTAL;
                try {
                    str11 = Build.MANUFACTURER;
                    try {
                        str10 = Build.PRODUCT;
                        try {
                            str9 = Build.TAGS;
                        } catch (Exception unused) {
                            str9 = "-1";
                            str8 = str9;
                            str7 = str8;
                            str6 = str7;
                            str5 = str6;
                            str4 = str5;
                            str3 = str4;
                            str2 = str3;
                            str = str2;
                            str14 = "-1";
                            String str19 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
                            C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str19)), new Throwable[0]);
                            return str19;
                        }
                    } catch (Exception unused2) {
                        str10 = "-1";
                        str9 = str10;
                        str8 = str9;
                        str7 = str8;
                        str6 = str7;
                        str5 = str6;
                        str4 = str5;
                        str3 = str4;
                        str2 = str3;
                        str = str2;
                        str14 = "-1";
                        String str192 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
                        C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str192)), new Throwable[0]);
                        return str192;
                    }
                } catch (Exception unused3) {
                    str11 = "-1";
                    str10 = str11;
                    str9 = str10;
                    str8 = str9;
                    str7 = str8;
                    str6 = str7;
                    str5 = str6;
                    str4 = str5;
                    str3 = str4;
                    str2 = str3;
                    str = str2;
                    str14 = "-1";
                    String str1922 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
                    C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str1922)), new Throwable[0]);
                    return str1922;
                }
            } catch (Exception unused4) {
                str13 = "-1";
                str11 = str13;
                str10 = str11;
                str9 = str10;
                str8 = str9;
                str7 = str8;
                str6 = str7;
                str5 = str6;
                str4 = str5;
                str3 = str4;
                str2 = str3;
                str = str2;
                i15 = -1;
                str14 = "-1";
                String str19222 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
                C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str19222)), new Throwable[0]);
                return str19222;
            }
            try {
                str8 = Build.TYPE;
                try {
                    str7 = Build.USER;
                    try {
                        str6 = Build.DISPLAY;
                        try {
                            str5 = Build.BOARD;
                            try {
                                str4 = Build.BRAND;
                                try {
                                    str3 = Build.DEVICE;
                                    try {
                                        str2 = Build.FINGERPRINT;
                                        try {
                                            str = Build.HOST;
                                            try {
                                                str14 = Build.ID;
                                            } catch (Exception unused5) {
                                                str14 = "-1";
                                                String str192222 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
                                                C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str192222)), new Throwable[0]);
                                                return str192222;
                                            }
                                        } catch (Exception unused6) {
                                            str = "-1";
                                            str14 = "-1";
                                            String str1922222 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
                                            C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str1922222)), new Throwable[0]);
                                            return str1922222;
                                        }
                                    } catch (Exception unused7) {
                                        str2 = "-1";
                                        str = str2;
                                        str14 = "-1";
                                        String str19222222 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
                                        C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str19222222)), new Throwable[0]);
                                        return str19222222;
                                    }
                                } catch (Exception unused8) {
                                    str3 = "-1";
                                    str2 = str3;
                                    str = str2;
                                    str14 = "-1";
                                    String str192222222 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
                                    C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str192222222)), new Throwable[0]);
                                    return str192222222;
                                }
                            } catch (Exception unused9) {
                                str4 = "-1";
                                str3 = str4;
                                str2 = str3;
                                str = str2;
                                str14 = "-1";
                                String str1922222222 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
                                C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str1922222222)), new Throwable[0]);
                                return str1922222222;
                            }
                        } catch (Exception unused10) {
                            str5 = "-1";
                            str4 = str5;
                            str3 = str4;
                            str2 = str3;
                            str = str2;
                            str14 = "-1";
                            String str19222222222 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
                            C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str19222222222)), new Throwable[0]);
                            return str19222222222;
                        }
                    } catch (Exception unused11) {
                        str6 = "-1";
                        str5 = str6;
                        str4 = str5;
                        str3 = str4;
                        str2 = str3;
                        str = str2;
                        str14 = "-1";
                        String str192222222222 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
                        C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str192222222222)), new Throwable[0]);
                        return str192222222222;
                    }
                } catch (Exception unused12) {
                    str7 = "-1";
                    str6 = str7;
                    str5 = str6;
                    str4 = str5;
                    str3 = str4;
                    str2 = str3;
                    str = str2;
                    str14 = "-1";
                    String str1922222222222 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
                    C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str1922222222222)), new Throwable[0]);
                    return str1922222222222;
                }
            } catch (Exception unused13) {
                str8 = "-1";
                str7 = str8;
                str6 = str7;
                str5 = str6;
                str4 = str5;
                str3 = str4;
                str2 = str3;
                str = str2;
                str14 = "-1";
                String str19222222222222 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
                C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str19222222222222)), new Throwable[0]);
                return str19222222222222;
            }
        } catch (Exception unused14) {
            str13 = "-1";
            str12 = str13;
            str11 = str12;
            str10 = str11;
            str9 = str10;
            str8 = str9;
            str7 = str8;
            str6 = str7;
            str5 = str6;
            str4 = str5;
            str3 = str4;
            str2 = str3;
            str = str2;
            i15 = -1;
            str14 = "-1";
            String str192222222222222 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
            C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str192222222222222)), new Throwable[0]);
            return str192222222222222;
        }
        String str1922222222222222 = "-1" + ",uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + P.c(language) + "," + P.c(str15) + "," + i14 + "," + P.c(str16) + "," + P.c(str17) + "," + P.c(str18) + "," + P.c("-1") + "," + packageName + "," + P.c("-1") + ",-1," + e10 + ",-1," + i13 + "," + a10 + "," + P.c(str12) + "," + P.c(str13) + "," + i15 + "," + P.c(str11) + "," + P.c(str10) + "," + P.c(str9) + "," + P.c(str8) + "," + P.c(str7) + "," + P.c(str6) + "," + P.c(str5) + "," + P.c(str4) + "," + P.c(str3) + "," + P.c(str2) + "," + P.c(str) + "," + P.c(str14);
        C6595p.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str1922222222222222)), new Throwable[0]);
        return str1922222222222222;
    }

    static String d() {
        return "Akamai BMPSDK/3.3.8-rc2 (Android; " + Build.VERSION.RELEASE + "; " + Build.MANUFACTURER + "; " + Build.MODEL + "; " + Locale.getDefault().getLanguage() + ")";
    }

    static String e(Application application) {
        return Settings.Secure.getString(application.getContentResolver(), "android_id");
    }

    public static String f() {
        String readLine;
        try {
            Process exec = Runtime.getRuntime().exec("cat /proc/cpuinfo");
            exec.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            do {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return readLine;
                }
            } while (!readLine.contains("architecture"));
            return readLine.split("architecture: ")[1];
        } catch (Exception e10) {
            y.a(e10);
            return "default-arch";
        }
    }

    public static String g(Application application) {
        String str;
        try {
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            str = packageInfo.versionName + " " + packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "-1";
        }
        C6595p.c("SystemInfoListener", "appVersion ".concat(String.valueOf(str)), new Throwable[0]);
        return str;
    }
}
