package oE;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;

/* renamed from: oE.n  reason: case insensitive filesystem */
class C14891n {

    /* renamed from: h  reason: collision with root package name */
    private static C14891n f130130h;

    /* renamed from: i  reason: collision with root package name */
    private static final Object f130131i = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f130132a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f130133b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f130134c;

    /* renamed from: d  reason: collision with root package name */
    private final DisplayMetrics f130135d;

    /* renamed from: e  reason: collision with root package name */
    private final String f130136e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f130137f;

    /* renamed from: g  reason: collision with root package name */
    private final String f130138g;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C14891n(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it."
            java.lang.String r1 = "MixpanelAPI.SysInfo"
            r8.<init>()
            r8.f130132a = r9
            android.content.pm.PackageManager r2 = r9.getPackageManager()
            r3 = 0
            java.lang.String r4 = r9.getPackageName()     // Catch:{ NameNotFoundException -> 0x0020 }
            r5 = 0
            android.content.pm.PackageInfo r4 = r2.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0020 }
            java.lang.String r5 = r4.versionName     // Catch:{ NameNotFoundException -> 0x0020 }
            int r4 = r4.versionCode     // Catch:{ NameNotFoundException -> 0x0021 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NameNotFoundException -> 0x0021 }
            goto L_0x0027
        L_0x0020:
            r5 = r3
        L_0x0021:
            java.lang.String r4 = "System information constructed with a context that apparently doesn't exist."
            pE.C14918c.k(r1, r4)
            r4 = r3
        L_0x0027:
            android.content.pm.ApplicationInfo r6 = r9.getApplicationInfo()
            int r7 = r6.labelRes
            r8.f130136e = r5
            r8.f130137f = r4
            if (r7 != 0) goto L_0x003f
            java.lang.CharSequence r9 = r6.nonLocalizedLabel
            if (r9 != 0) goto L_0x003a
            java.lang.String r9 = "Misc"
            goto L_0x0043
        L_0x003a:
            java.lang.String r9 = r9.toString()
            goto L_0x0043
        L_0x003f:
            java.lang.String r9 = r9.getString(r7)
        L_0x0043:
            r8.f130138g = r9
            java.lang.Class r9 = r2.getClass()
            java.lang.String r4 = "hasSystemFeature"
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch:{ NoSuchMethodException -> 0x0056 }
            java.lang.reflect.Method r9 = r9.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0056 }
            goto L_0x0057
        L_0x0056:
            r9 = r3
        L_0x0057:
            if (r9 == 0) goto L_0x0080
            java.lang.String r4 = "android.hardware.nfc"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch:{ InvocationTargetException -> 0x0075, IllegalAccessException -> 0x0073 }
            java.lang.Object r4 = r9.invoke(r2, r4)     // Catch:{ InvocationTargetException -> 0x0075, IllegalAccessException -> 0x0073 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ InvocationTargetException -> 0x0075, IllegalAccessException -> 0x0073 }
            java.lang.String r5 = "android.hardware.telephony"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch:{ InvocationTargetException -> 0x007c, IllegalAccessException -> 0x0077 }
            java.lang.Object r9 = r9.invoke(r2, r5)     // Catch:{ InvocationTargetException -> 0x007c, IllegalAccessException -> 0x0077 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ InvocationTargetException -> 0x007c, IllegalAccessException -> 0x0077 }
        L_0x0071:
            r3 = r4
            goto L_0x0081
        L_0x0073:
            r4 = r3
            goto L_0x0077
        L_0x0075:
            r4 = r3
            goto L_0x007c
        L_0x0077:
            pE.C14918c.k(r1, r0)
        L_0x007a:
            r9 = r3
            goto L_0x0071
        L_0x007c:
            pE.C14918c.k(r1, r0)
            goto L_0x007a
        L_0x0080:
            r9 = r3
        L_0x0081:
            r8.f130133b = r3
            r8.f130134c = r9
            android.util.DisplayMetrics r9 = new android.util.DisplayMetrics
            r9.<init>()
            r8.f130135d = r9
            android.content.Context r0 = r8.f130132a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oE.C14891n.<init>(android.content.Context):void");
    }

    static C14891n f(Context context) {
        synchronized (f130131i) {
            try {
                if (f130130h == null) {
                    f130130h = new C14891n(context.getApplicationContext());
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f130130h;
    }

    public Integer a() {
        return this.f130137f;
    }

    public String b() {
        return this.f130136e;
    }

    public String c() {
        return this.f130132a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") ? "ble" : this.f130132a.getPackageManager().hasSystemFeature("android.hardware.bluetooth") ? "classic" : "none";
    }

    public String d() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f130132a.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    public DisplayMetrics e() {
        return this.f130135d;
    }

    public boolean g() {
        return this.f130133b.booleanValue();
    }

    public boolean h() {
        return this.f130134c.booleanValue();
    }

    @SuppressLint({"MissingPermission"})
    public Boolean i() {
        BluetoothAdapter defaultAdapter;
        try {
            if (this.f130132a.getPackageManager().checkPermission("android.permission.BLUETOOTH", this.f130132a.getPackageName()) != 0 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
                return null;
            }
            return Boolean.valueOf(defaultAdapter.isEnabled());
        } catch (NoClassDefFoundError | SecurityException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r0.isConnected() != false) goto L_0x0029;
     */
    @android.annotation.SuppressLint({"MissingPermission"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean j() {
        /*
            r3 = this;
            android.content.Context r0 = r3.f130132a
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 != 0) goto L_0x002e
            android.content.Context r0 = r3.f130132a
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L_0x0028
            int r1 = r0.getType()
            r2 = 1
            if (r1 != r2) goto L_0x0028
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oE.C14891n.j():java.lang.Boolean");
    }
}
