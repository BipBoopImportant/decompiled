package com.google.android.gms.dynamite;

import K9.C6619q;
import K9.C6620s;
import U9.e;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.l;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {

    /* renamed from: b  reason: collision with root package name */
    public static final b f48093b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final b f48094c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final b f48095d = new f();

    /* renamed from: e  reason: collision with root package name */
    public static final b f48096e = new g();

    /* renamed from: f  reason: collision with root package name */
    public static final b f48097f = new h();

    /* renamed from: g  reason: collision with root package name */
    public static final b f48098g = new i();

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f48099h = null;

    /* renamed from: i  reason: collision with root package name */
    private static String f48100i = null;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f48101j = false;

    /* renamed from: k  reason: collision with root package name */
    private static int f48102k = -1;

    /* renamed from: l  reason: collision with root package name */
    private static Boolean f48103l;

    /* renamed from: m  reason: collision with root package name */
    private static final ThreadLocal f48104m = new ThreadLocal();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadLocal f48105n = new b();

    /* renamed from: o  reason: collision with root package name */
    private static final b.a f48106o = new c();

    /* renamed from: p  reason: collision with root package name */
    public static final b f48107p = new j();

    /* renamed from: q  reason: collision with root package name */
    private static m f48108q;

    /* renamed from: r  reason: collision with root package name */
    private static n f48109r;

    /* renamed from: a  reason: collision with root package name */
    private final Context f48110a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, e eVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th2, e eVar) {
            super(str, th2);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z10);

            int b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public static class C0824b {

            /* renamed from: a  reason: collision with root package name */
            public int f48111a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f48112b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f48113c = 0;
        }

        C0824b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        C6620s.l(context);
        this.f48110a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C6619q.b(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x019a, code lost:
        r0 = (com.google.android.gms.dynamite.k) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a0, code lost:
        if (r0 == null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a2, code lost:
        r0 = r5.P3(T9.d.L3(r18), r3, r14, T9.d.L3(r0.f48114a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01b9, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("No cached result cursor holder", (U9.e) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ba, code lost:
        if (r6 != 2) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01bc, code lost:
        android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
        r0 = r5.Q3(T9.d.L3(r18), r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01cc, code lost:
        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
        r0 = r5.O3(T9.d.L3(r18), r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01db, code lost:
        r0 = T9.d.K3(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01df, code lost:
        if (r0 == null) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01e1, code lost:
        r5 = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01f2, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to load remote module.", (U9.e) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01fb, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to create IDynamiteLoader.", (U9.e) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01fc, code lost:
        r17 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0206, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to determine which loading route to use.", (U9.e) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a1, code lost:
        if (r16 == null) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a8, code lost:
        if (r16.booleanValue() == false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00aa, code lost:
        android.util.Log.i("DynamiteModule", "Selected remote version of " + r3 + ", version >= " + r14);
        r5 = com.google.android.gms.dynamite.DynamiteModule.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ca, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r12 = f48109r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cd, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        if (r12 == null) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r0 = (com.google.android.gms.dynamite.k) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d6, code lost:
        if (r0 == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00da, code lost:
        if (r0.f48114a == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dc, code lost:
        r5 = r18.getApplicationContext();
        r0 = r0.f48114a;
        T9.d.L3(null);
        r15 = com.google.android.gms.dynamite.DynamiteModule.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e8, code lost:
        monitor-enter(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e9, code lost:
        r17 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ed, code lost:
        if (f48102k < 2) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ef, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f1, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f2, code lost:
        monitor-exit(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f3, code lost:
        if (r13 == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
        r0 = r12.M3(T9.d.L3(r5), r3, r14, T9.d.L3(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0109, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0112, code lost:
        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
        r0 = r12.L3(T9.d.L3(r5), r3, r14, T9.d.L3(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0125, code lost:
        r0 = (android.content.Context) T9.d.K3(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012b, code lost:
        if (r0 == null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012d, code lost:
        r5 = new com.google.android.gms.dynamite.DynamiteModule(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0132, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013d, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to get module context", (U9.e) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0150, code lost:
        r17 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015a, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("No result cursor", (U9.e) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015b, code lost:
        r17 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0165, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("DynamiteLoaderV2 was not cached.", (U9.e) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0166, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0167, code lost:
        r17 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x016b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x016d, code lost:
        r17 = r6;
        android.util.Log.i("DynamiteModule", "Selected remote version of " + r3 + ", version >= " + r14);
        r5 = l(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0191, code lost:
        if (r5 == null) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0193, code lost:
        r6 = r5.L3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0198, code lost:
        if (r6 < 3) goto L_0x01ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x026b A[Catch:{ all -> 0x0225 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule e(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.b r19, java.lang.String r20) {
        /*
            r1 = r18
            r2 = r19
            r3 = r20
            android.content.Context r4 = r18.getApplicationContext()
            r5 = 0
            if (r4 == 0) goto L_0x02ff
            java.lang.ThreadLocal r0 = f48104m
            java.lang.Object r6 = r0.get()
            com.google.android.gms.dynamite.k r6 = (com.google.android.gms.dynamite.k) r6
            com.google.android.gms.dynamite.k r7 = new com.google.android.gms.dynamite.k
            r7.<init>(r5)
            r0.set(r7)
            java.lang.ThreadLocal r8 = f48105n
            java.lang.Object r9 = r8.get()
            java.lang.Long r9 = (java.lang.Long) r9
            long r10 = r9.longValue()
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0079 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0079 }
            r8.set(r14)     // Catch:{ all -> 0x0079 }
            com.google.android.gms.dynamite.DynamiteModule$b$a r8 = f48106o     // Catch:{ all -> 0x0079 }
            com.google.android.gms.dynamite.DynamiteModule$b$b r8 = r2.a(r1, r3, r8)     // Catch:{ all -> 0x0079 }
            java.lang.String r14 = "DynamiteModule"
            int r15 = r8.f48111a     // Catch:{ all -> 0x0079 }
            int r12 = r8.f48112b     // Catch:{ all -> 0x0079 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r13.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.String r5 = "Considering local module "
            r13.append(r5)     // Catch:{ all -> 0x0079 }
            r13.append(r3)     // Catch:{ all -> 0x0079 }
            java.lang.String r5 = ":"
            r13.append(r5)     // Catch:{ all -> 0x0079 }
            r13.append(r15)     // Catch:{ all -> 0x0079 }
            java.lang.String r5 = " and remote module "
            r13.append(r5)     // Catch:{ all -> 0x0079 }
            r13.append(r3)     // Catch:{ all -> 0x0079 }
            java.lang.String r5 = ":"
            r13.append(r5)     // Catch:{ all -> 0x0079 }
            r13.append(r12)     // Catch:{ all -> 0x0079 }
            java.lang.String r5 = r13.toString()     // Catch:{ all -> 0x0079 }
            android.util.Log.i(r14, r5)     // Catch:{ all -> 0x0079 }
            int r5 = r8.f48113c     // Catch:{ all -> 0x0079 }
            if (r5 == 0) goto L_0x02b2
            r12 = -1
            if (r5 != r12) goto L_0x007e
            int r5 = r8.f48111a     // Catch:{ all -> 0x0079 }
            if (r5 == 0) goto L_0x02b2
            r5 = r12
            goto L_0x007e
        L_0x0079:
            r0 = move-exception
        L_0x007a:
            r1 = 0
            goto L_0x02e3
        L_0x007e:
            r13 = 1
            if (r5 != r13) goto L_0x0085
            int r14 = r8.f48112b     // Catch:{ all -> 0x0079 }
            if (r14 == 0) goto L_0x02b2
        L_0x0085:
            if (r5 != r12) goto L_0x0091
            com.google.android.gms.dynamite.DynamiteModule r0 = h(r4, r3)     // Catch:{ all -> 0x0079 }
            r17 = r6
        L_0x008d:
            r1 = 0
            goto L_0x0271
        L_0x0091:
            if (r5 != r13) goto L_0x029a
            int r14 = r8.f48112b     // Catch:{ a -> 0x023b, all -> 0x0236 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r15 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r15)     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            boolean r16 = k(r18)     // Catch:{ all -> 0x0207 }
            if (r16 == 0) goto L_0x020b
            java.lang.Boolean r16 = f48099h     // Catch:{ all -> 0x0207 }
            monitor-exit(r15)     // Catch:{ all -> 0x0207 }
            if (r16 == 0) goto L_0x01fc
            boolean r15 = r16.booleanValue()     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            r13 = 2
            if (r15 == 0) goto L_0x016d
            java.lang.String r15 = "DynamiteModule"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            r12.<init>()     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            java.lang.String r5 = "Selected remote version of "
            r12.append(r5)     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            r12.append(r3)     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            java.lang.String r5 = ", version >= "
            r12.append(r5)     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            r12.append(r14)     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            java.lang.String r5 = r12.toString()     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            android.util.Log.i(r15, r5)     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r5 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r5)     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            com.google.android.gms.dynamite.n r12 = f48109r     // Catch:{ all -> 0x0166 }
            monitor-exit(r5)     // Catch:{ all -> 0x0166 }
            if (r12 == 0) goto L_0x015b
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            com.google.android.gms.dynamite.k r0 = (com.google.android.gms.dynamite.k) r0     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            if (r0 == 0) goto L_0x0150
            android.database.Cursor r5 = r0.f48114a     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            if (r5 == 0) goto L_0x0150
            android.content.Context r5 = r18.getApplicationContext()     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            android.database.Cursor r0 = r0.f48114a     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            r15 = 0
            T9.d.L3(r15)     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r15 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r15)     // Catch:{ RemoteException -> 0x014b, a -> 0x0146, all -> 0x0141 }
            r17 = r6
            int r6 = f48102k     // Catch:{ all -> 0x013e }
            if (r6 < r13) goto L_0x00f1
            r13 = 1
            goto L_0x00f2
        L_0x00f1:
            r13 = 0
        L_0x00f2:
            monitor-exit(r15)     // Catch:{ all -> 0x013e }
            if (r13 == 0) goto L_0x0112
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r13 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r6, r13)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            T9.b r5 = T9.d.L3(r5)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            T9.b r0 = T9.d.L3(r0)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            T9.b r0 = r12.M3(r5, r3, r14, r0)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            goto L_0x0125
        L_0x0109:
            r0 = move-exception
            goto L_0x0219
        L_0x010c:
            r0 = move-exception
            goto L_0x022c
        L_0x010f:
            r0 = move-exception
            goto L_0x022d
        L_0x0112:
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r13 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r6, r13)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            T9.b r5 = T9.d.L3(r5)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            T9.b r0 = T9.d.L3(r0)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            T9.b r0 = r12.L3(r5, r3, r14, r0)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
        L_0x0125:
            java.lang.Object r0 = T9.d.K3(r0)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            if (r0 == 0) goto L_0x0135
            com.google.android.gms.dynamite.DynamiteModule r5 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            r5.<init>(r0)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
        L_0x0132:
            r0 = r5
            goto L_0x008d
        L_0x0135:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            java.lang.String r5 = "Failed to get module context"
            r6 = 0
            r0.<init>(r5, r6)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            throw r0     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
        L_0x013e:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x013e }
            throw r0     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
        L_0x0141:
            r0 = move-exception
            r17 = r6
            goto L_0x0219
        L_0x0146:
            r0 = move-exception
            r17 = r6
            goto L_0x022c
        L_0x014b:
            r0 = move-exception
            r17 = r6
            goto L_0x022d
        L_0x0150:
            r17 = r6
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            java.lang.String r5 = "No result cursor"
            r6 = 0
            r0.<init>(r5, r6)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            throw r0     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
        L_0x015b:
            r17 = r6
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            java.lang.String r5 = "DynamiteLoaderV2 was not cached."
            r6 = 0
            r0.<init>(r5, r6)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            throw r0     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
        L_0x0166:
            r0 = move-exception
            r17 = r6
        L_0x0169:
            monitor-exit(r5)     // Catch:{ all -> 0x016b }
            throw r0     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
        L_0x016b:
            r0 = move-exception
            goto L_0x0169
        L_0x016d:
            r17 = r6
            java.lang.String r5 = "DynamiteModule"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            r6.<init>()     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            java.lang.String r12 = "Selected remote version of "
            r6.append(r12)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            r6.append(r3)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            java.lang.String r12 = ", version >= "
            r6.append(r12)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            r6.append(r14)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            java.lang.String r6 = r6.toString()     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            android.util.Log.i(r5, r6)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            com.google.android.gms.dynamite.m r5 = l(r18)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            if (r5 == 0) goto L_0x01f3
            int r6 = r5.L3()     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            r12 = 3
            if (r6 < r12) goto L_0x01ba
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            com.google.android.gms.dynamite.k r0 = (com.google.android.gms.dynamite.k) r0     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            if (r0 == 0) goto L_0x01b1
            T9.b r6 = T9.d.L3(r18)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            android.database.Cursor r0 = r0.f48114a     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            T9.b r0 = T9.d.L3(r0)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            T9.b r0 = r5.P3(r6, r3, r14, r0)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            goto L_0x01db
        L_0x01b1:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            java.lang.String r5 = "No cached result cursor holder"
            r6 = 0
            r0.<init>(r5, r6)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            throw r0     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
        L_0x01ba:
            if (r6 != r13) goto L_0x01cc
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r6 = "IDynamite loader version = 2"
            android.util.Log.w(r0, r6)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            T9.b r0 = T9.d.L3(r18)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            T9.b r0 = r5.Q3(r0, r3, r14)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            goto L_0x01db
        L_0x01cc:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r6 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r0, r6)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            T9.b r0 = T9.d.L3(r18)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            T9.b r0 = r5.O3(r0, r3, r14)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
        L_0x01db:
            java.lang.Object r0 = T9.d.K3(r0)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            if (r0 == 0) goto L_0x01ea
            com.google.android.gms.dynamite.DynamiteModule r5 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            r5.<init>(r0)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            goto L_0x0132
        L_0x01ea:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            java.lang.String r5 = "Failed to load remote module."
            r6 = 0
            r0.<init>(r5, r6)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            throw r0     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
        L_0x01f3:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            java.lang.String r5 = "Failed to create IDynamiteLoader."
            r6 = 0
            r0.<init>(r5, r6)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            throw r0     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
        L_0x01fc:
            r17 = r6
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            java.lang.String r5 = "Failed to determine which loading route to use."
            r6 = 0
            r0.<init>(r5, r6)     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
            throw r0     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
        L_0x0207:
            r0 = move-exception
            r17 = r6
            goto L_0x0217
        L_0x020b:
            r17 = r6
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0216 }
            java.lang.String r5 = "Remote loading disabled"
            r6 = 0
            r0.<init>(r5, r6)     // Catch:{ all -> 0x0216 }
            throw r0     // Catch:{ all -> 0x0216 }
        L_0x0216:
            r0 = move-exception
        L_0x0217:
            monitor-exit(r15)     // Catch:{ all -> 0x0216 }
            throw r0     // Catch:{ RemoteException -> 0x010f, a -> 0x010c, all -> 0x0109 }
        L_0x0219:
            com.google.android.gms.common.util.g.a(r1, r0)     // Catch:{ a -> 0x022a }
            com.google.android.gms.dynamite.DynamiteModule$a r5 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ a -> 0x022a }
            java.lang.String r6 = "Failed to load remote module."
            r12 = 0
            r5.<init>(r6, r0, r12)     // Catch:{ a -> 0x022a }
            throw r5     // Catch:{ a -> 0x022a }
        L_0x0225:
            r0 = move-exception
            r6 = r17
            goto L_0x007a
        L_0x022a:
            r0 = move-exception
            goto L_0x023e
        L_0x022c:
            throw r0     // Catch:{ a -> 0x022a }
        L_0x022d:
            com.google.android.gms.dynamite.DynamiteModule$a r5 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ a -> 0x022a }
            java.lang.String r6 = "Failed to load remote module."
            r12 = 0
            r5.<init>(r6, r0, r12)     // Catch:{ a -> 0x022a }
            throw r5     // Catch:{ a -> 0x022a }
        L_0x0236:
            r0 = move-exception
            r17 = r6
            goto L_0x007a
        L_0x023b:
            r0 = move-exception
            r17 = r6
        L_0x023e:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r6 = r0.getMessage()     // Catch:{ all -> 0x0225 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0225 }
            r12.<init>()     // Catch:{ all -> 0x0225 }
            java.lang.String r13 = "Failed to load remote module: "
            r12.append(r13)     // Catch:{ all -> 0x0225 }
            r12.append(r6)     // Catch:{ all -> 0x0225 }
            java.lang.String r6 = r12.toString()     // Catch:{ all -> 0x0225 }
            android.util.Log.w(r5, r6)     // Catch:{ all -> 0x0225 }
            int r5 = r8.f48111a     // Catch:{ all -> 0x0225 }
            if (r5 == 0) goto L_0x028f
            com.google.android.gms.dynamite.l r6 = new com.google.android.gms.dynamite.l     // Catch:{ all -> 0x0225 }
            r8 = 0
            r6.<init>(r5, r8)     // Catch:{ all -> 0x0225 }
            com.google.android.gms.dynamite.DynamiteModule$b$b r1 = r2.a(r1, r3, r6)     // Catch:{ all -> 0x0225 }
            int r1 = r1.f48113c     // Catch:{ all -> 0x0225 }
            r2 = -1
            if (r1 != r2) goto L_0x028f
            com.google.android.gms.dynamite.DynamiteModule r0 = h(r4, r3)     // Catch:{ all -> 0x0225 }
            goto L_0x008d
        L_0x0271:
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x027b
            java.lang.ThreadLocal r1 = f48105n
            r1.remove()
            goto L_0x0280
        L_0x027b:
            java.lang.ThreadLocal r1 = f48105n
            r1.set(r9)
        L_0x0280:
            android.database.Cursor r1 = r7.f48114a
            if (r1 == 0) goto L_0x0287
            r1.close()
        L_0x0287:
            java.lang.ThreadLocal r1 = f48104m
            r6 = r17
            r1.set(r6)
            return r0
        L_0x028f:
            r6 = r17
            com.google.android.gms.dynamite.DynamiteModule$a r1 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x0079 }
            throw r1     // Catch:{ all -> 0x0079 }
        L_0x029a:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0079 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r1.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "VersionPolicy returned invalid code:"
            r1.append(r2)     // Catch:{ all -> 0x0079 }
            r1.append(r5)     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0079 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0079 }
            throw r0     // Catch:{ all -> 0x0079 }
        L_0x02b2:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0079 }
            int r1 = r8.f48111a     // Catch:{ all -> 0x0079 }
            int r2 = r8.f48112b     // Catch:{ all -> 0x0079 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r4.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.String r5 = "No acceptable module "
            r4.append(r5)     // Catch:{ all -> 0x0079 }
            r4.append(r3)     // Catch:{ all -> 0x0079 }
            java.lang.String r3 = " found. Local version is "
            r4.append(r3)     // Catch:{ all -> 0x0079 }
            r4.append(r1)     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch:{ all -> 0x0079 }
            r4.append(r2)     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0079 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0079 }
            throw r0     // Catch:{ all -> 0x0079 }
        L_0x02e3:
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x02ed
            java.lang.ThreadLocal r1 = f48105n
            r1.remove()
            goto L_0x02f2
        L_0x02ed:
            java.lang.ThreadLocal r1 = f48105n
            r1.set(r9)
        L_0x02f2:
            android.database.Cursor r1 = r7.f48114a
            if (r1 == 0) goto L_0x02f9
            r1.close()
        L_0x02f9:
            java.lang.ThreadLocal r1 = f48104m
            r1.set(r6)
            throw r0
        L_0x02ff:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r1 = "null application Context"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:52:0x00a2=Splitter:B:52:0x00a2, B:33:0x005c=Splitter:B:33:0x005c, B:18:0x003e=Splitter:B:18:0x003e} */
    public static int f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00eb }
            java.lang.Boolean r1 = f48099h     // Catch:{ all -> 0x004b }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00df
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x0036 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x0036 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0036 }
            if (r5 != r6) goto L_0x0039
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0036 }
            goto L_0x00b8
        L_0x0036:
            r1 = move-exception
            goto L_0x00ba
        L_0x0039:
            if (r5 == 0) goto L_0x0042
            i(r5)     // Catch:{ a -> 0x003e }
        L_0x003e:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0036 }
            goto L_0x00b8
        L_0x0042:
            boolean r5 = k(r10)     // Catch:{ all -> 0x0036 }
            if (r5 != 0) goto L_0x004e
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            return r3
        L_0x004b:
            r11 = move-exception
            goto L_0x01cd
        L_0x004e:
            boolean r5 = f48101j     // Catch:{ all -> 0x0036 }
            if (r5 != 0) goto L_0x00af
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0036 }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x0036 }
            if (r6 == 0) goto L_0x005b
            goto L_0x00af
        L_0x005b:
            r6 = 1
            int r6 = g(r10, r11, r12, r6)     // Catch:{ a -> 0x00a5 }
            java.lang.String r7 = f48100i     // Catch:{ a -> 0x00a5 }
            if (r7 == 0) goto L_0x00a2
            boolean r7 = r7.isEmpty()     // Catch:{ a -> 0x00a5 }
            if (r7 == 0) goto L_0x006b
            goto L_0x00a2
        L_0x006b:
            java.lang.ClassLoader r7 = U9.d.a()     // Catch:{ a -> 0x00a5 }
            if (r7 == 0) goto L_0x0072
            goto L_0x0097
        L_0x0072:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x00a5 }
            r8 = 29
            if (r7 < r8) goto L_0x0089
            U9.b.a()     // Catch:{ a -> 0x00a5 }
            java.lang.String r7 = f48100i     // Catch:{ a -> 0x00a5 }
            K9.C6620s.l(r7)     // Catch:{ a -> 0x00a5 }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x00a5 }
            dalvik.system.DelegateLastClassLoader r7 = U9.a.a(r7, r8)     // Catch:{ a -> 0x00a5 }
            goto L_0x0097
        L_0x0089:
            com.google.android.gms.dynamite.a r7 = new com.google.android.gms.dynamite.a     // Catch:{ a -> 0x00a5 }
            java.lang.String r8 = f48100i     // Catch:{ a -> 0x00a5 }
            K9.C6620s.l(r8)     // Catch:{ a -> 0x00a5 }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x00a5 }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x00a5 }
        L_0x0097:
            i(r7)     // Catch:{ a -> 0x00a5 }
            r1.set(r2, r7)     // Catch:{ a -> 0x00a5 }
            f48099h = r5     // Catch:{ a -> 0x00a5 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            return r6
        L_0x00a2:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            return r6
        L_0x00a5:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0036 }
            r1.set(r2, r5)     // Catch:{ all -> 0x0036 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0036 }
            goto L_0x00b8
        L_0x00af:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0036 }
            r1.set(r2, r5)     // Catch:{ all -> 0x0036 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0036 }
        L_0x00b8:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            goto L_0x00dd
        L_0x00ba:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
        L_0x00bc:
            r1 = move-exception
            goto L_0x00c1
        L_0x00be:
            r1 = move-exception
            goto L_0x00c1
        L_0x00c0:
            r1 = move-exception
        L_0x00c1:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            r5.<init>()     // Catch:{ all -> 0x004b }
            java.lang.String r6 = "Failed to load module via V2: "
            r5.append(r6)     // Catch:{ all -> 0x004b }
            r5.append(r1)     // Catch:{ all -> 0x004b }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x004b }
            android.util.Log.w(r4, r1)     // Catch:{ all -> 0x004b }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004b }
        L_0x00dd:
            f48099h = r1     // Catch:{ all -> 0x004b }
        L_0x00df:
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x010a
            int r10 = g(r10, r11, r12, r3)     // Catch:{ a -> 0x00ee }
            return r10
        L_0x00eb:
            r11 = move-exception
            goto L_0x01cf
        L_0x00ee:
            r11 = move-exception
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x00eb }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            r0.<init>()     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch:{ all -> 0x00eb }
            r0.append(r11)     // Catch:{ all -> 0x00eb }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x00eb }
            android.util.Log.w(r12, r11)     // Catch:{ all -> 0x00eb }
            return r3
        L_0x010a:
            com.google.android.gms.dynamite.m r4 = l(r10)     // Catch:{ all -> 0x00eb }
            if (r4 != 0) goto L_0x0112
            goto L_0x01c4
        L_0x0112:
            int r0 = r4.L3()     // Catch:{ RemoteException -> 0x012d }
            r1 = 3
            if (r0 < r1) goto L_0x017f
            java.lang.ThreadLocal r0 = f48104m     // Catch:{ RemoteException -> 0x012d }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x012d }
            com.google.android.gms.dynamite.k r0 = (com.google.android.gms.dynamite.k) r0     // Catch:{ RemoteException -> 0x012d }
            if (r0 == 0) goto L_0x0130
            android.database.Cursor r0 = r0.f48114a     // Catch:{ RemoteException -> 0x012d }
            if (r0 == 0) goto L_0x0130
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x012d }
            goto L_0x01c4
        L_0x012d:
            r11 = move-exception
            goto L_0x01a4
        L_0x0130:
            T9.b r5 = T9.d.L3(r10)     // Catch:{ RemoteException -> 0x012d }
            java.lang.ThreadLocal r0 = f48105n     // Catch:{ RemoteException -> 0x012d }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x012d }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x012d }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x012d }
            r6 = r11
            r7 = r12
            T9.b r11 = r4.R3(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x012d }
            java.lang.Object r11 = T9.d.K3(r11)     // Catch:{ RemoteException -> 0x012d }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x012d }
            if (r11 == 0) goto L_0x016e
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x0164, all -> 0x0162 }
            if (r12 != 0) goto L_0x0155
            goto L_0x016e
        L_0x0155:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x0164, all -> 0x0162 }
            if (r12 <= 0) goto L_0x0166
            boolean r0 = j(r11)     // Catch:{ RemoteException -> 0x0164, all -> 0x0162 }
            if (r0 == 0) goto L_0x0166
            goto L_0x0167
        L_0x0162:
            r12 = move-exception
            goto L_0x017b
        L_0x0164:
            r12 = move-exception
            goto L_0x017d
        L_0x0166:
            r2 = r11
        L_0x0167:
            if (r2 == 0) goto L_0x016c
            r2.close()     // Catch:{ all -> 0x00eb }
        L_0x016c:
            r3 = r12
            goto L_0x01c4
        L_0x016e:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r0)     // Catch:{ RemoteException -> 0x0164, all -> 0x0162 }
            if (r11 == 0) goto L_0x01c4
            r11.close()     // Catch:{ all -> 0x00eb }
            goto L_0x01c4
        L_0x017b:
            r2 = r11
            goto L_0x01c7
        L_0x017d:
            r2 = r11
            goto L_0x01a5
        L_0x017f:
            r1 = 2
            if (r0 != r1) goto L_0x0192
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x012d }
            T9.b r0 = T9.d.L3(r10)     // Catch:{ RemoteException -> 0x012d }
            int r3 = r4.N3(r0, r11, r12)     // Catch:{ RemoteException -> 0x012d }
            goto L_0x01c4
        L_0x0192:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x012d }
            T9.b r0 = T9.d.L3(r10)     // Catch:{ RemoteException -> 0x012d }
            int r3 = r4.M3(r0, r11, r12)     // Catch:{ RemoteException -> 0x012d }
            goto L_0x01c4
        L_0x01a2:
            r12 = r11
            goto L_0x01c7
        L_0x01a4:
            r12 = r11
        L_0x01a5:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r0.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch:{ all -> 0x01c5 }
            r0.append(r12)     // Catch:{ all -> 0x01c5 }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x01c5 }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01c5 }
            if (r2 == 0) goto L_0x01c4
            r2.close()     // Catch:{ all -> 0x00eb }
        L_0x01c4:
            return r3
        L_0x01c5:
            r11 = move-exception
            goto L_0x01a2
        L_0x01c7:
            if (r2 == 0) goto L_0x01cc
            r2.close()     // Catch:{ all -> 0x00eb }
        L_0x01cc:
            throw r12     // Catch:{ all -> 0x00eb }
        L_0x01cd:
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r11     // Catch:{ all -> 0x00eb }
        L_0x01cf:
            com.google.android.gms.common.util.g.a(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0056 */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e8 A[SYNTHETIC, Splitter:B:60:0x00e8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int g(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f48105n     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            java.lang.String r3 = "api_force_staging"
            java.lang.String r4 = "api"
            r5 = 1
            if (r5 == r14) goto L_0x0015
            r3 = r4
        L_0x0015:
            android.net.Uri$Builder r14 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            r14.<init>()     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r14 = r14.scheme(r4)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r14 = r14.authority(r4)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            android.net.Uri$Builder r14 = r14.path(r3)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            android.net.Uri$Builder r13 = r14.appendPath(r13)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            java.lang.String r14 = "requestStartUptime"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            android.net.Uri$Builder r13 = r13.appendQueryParameter(r14, r1)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            android.net.Uri r7 = r13.build()     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            android.content.ContentResolver r12 = r12.getContentResolver()     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            android.content.ContentProviderClient r12 = r12.acquireUnstableContentProviderClient(r7)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            r13 = 2
            r14 = 0
            if (r12 != 0) goto L_0x004b
        L_0x0048:
            r4 = r0
            goto L_0x00e6
        L_0x004b:
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            r6 = r12
            android.database.Cursor r1 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ RemoteException -> 0x0056, all -> 0x00d7 }
            if (r1 != 0) goto L_0x0060
        L_0x0056:
            r12.release()     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            goto L_0x0048
        L_0x005a:
            r12 = move-exception
            goto L_0x0175
        L_0x005d:
            r12 = move-exception
            goto L_0x0154
        L_0x0060:
            int r2 = r1.getCount()     // Catch:{ all -> 0x0096 }
            int r3 = r1.getColumnCount()     // Catch:{ all -> 0x0096 }
            android.database.MatrixCursor r4 = new android.database.MatrixCursor     // Catch:{ all -> 0x0096 }
            java.lang.String[] r6 = r1.getColumnNames()     // Catch:{ all -> 0x0096 }
            r4.<init>(r6, r2)     // Catch:{ all -> 0x0096 }
            r6 = r14
        L_0x0072:
            if (r6 >= r2) goto L_0x00d0
            boolean r7 = r1.moveToPosition(r6)     // Catch:{ all -> 0x0096 }
            if (r7 == 0) goto L_0x00c8
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0096 }
            r8 = r14
        L_0x007d:
            if (r8 >= r3) goto L_0x00c2
            int r9 = r1.getType(r8)     // Catch:{ all -> 0x0096 }
            if (r9 == 0) goto L_0x00bd
            if (r9 == r5) goto L_0x00b2
            if (r9 == r13) goto L_0x00a7
            r10 = 3
            if (r9 == r10) goto L_0x00a0
            r10 = 4
            if (r9 != r10) goto L_0x0098
            byte[] r9 = r1.getBlob(r8)     // Catch:{ all -> 0x0096 }
            r7[r8] = r9     // Catch:{ all -> 0x0096 }
            goto L_0x00bf
        L_0x0096:
            r2 = move-exception
            goto L_0x00d9
        L_0x0098:
            android.os.RemoteException r2 = new android.os.RemoteException     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = "Unknown column type"
            r2.<init>(r3)     // Catch:{ all -> 0x0096 }
            throw r2     // Catch:{ all -> 0x0096 }
        L_0x00a0:
            java.lang.String r9 = r1.getString(r8)     // Catch:{ all -> 0x0096 }
            r7[r8] = r9     // Catch:{ all -> 0x0096 }
            goto L_0x00bf
        L_0x00a7:
            double r9 = r1.getDouble(r8)     // Catch:{ all -> 0x0096 }
            java.lang.Double r9 = java.lang.Double.valueOf(r9)     // Catch:{ all -> 0x0096 }
            r7[r8] = r9     // Catch:{ all -> 0x0096 }
            goto L_0x00bf
        L_0x00b2:
            long r9 = r1.getLong(r8)     // Catch:{ all -> 0x0096 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0096 }
            r7[r8] = r9     // Catch:{ all -> 0x0096 }
            goto L_0x00bf
        L_0x00bd:
            r7[r8] = r0     // Catch:{ all -> 0x0096 }
        L_0x00bf:
            int r8 = r8 + 1
            goto L_0x007d
        L_0x00c2:
            r4.addRow(r7)     // Catch:{ all -> 0x0096 }
            int r6 = r6 + 1
            goto L_0x0072
        L_0x00c8:
            android.os.RemoteException r2 = new android.os.RemoteException     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = "Cursor read incomplete (ContentProvider dead?)"
            r2.<init>(r3)     // Catch:{ all -> 0x0096 }
            throw r2     // Catch:{ all -> 0x0096 }
        L_0x00d0:
            r1.close()     // Catch:{ RemoteException -> 0x0056, all -> 0x00d7 }
            r12.release()     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            goto L_0x00e6
        L_0x00d7:
            r13 = move-exception
            goto L_0x00e2
        L_0x00d9:
            r1.close()     // Catch:{ all -> 0x00dd }
            goto L_0x00e1
        L_0x00dd:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ RemoteException -> 0x0056, all -> 0x00d7 }
        L_0x00e1:
            throw r2     // Catch:{ RemoteException -> 0x0056, all -> 0x00d7 }
        L_0x00e2:
            r12.release()     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            throw r13     // Catch:{ Exception -> 0x005d, all -> 0x005a }
        L_0x00e6:
            if (r4 == 0) goto L_0x0145
            boolean r12 = r4.moveToFirst()     // Catch:{ Exception -> 0x013b }
            if (r12 == 0) goto L_0x0145
            int r12 = r4.getInt(r14)     // Catch:{ Exception -> 0x013b }
            if (r12 <= 0) goto L_0x012c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x013b }
            java.lang.String r13 = r4.getString(r13)     // Catch:{ all -> 0x010c }
            f48100i = r13     // Catch:{ all -> 0x010c }
            java.lang.String r13 = "loaderVersion"
            int r13 = r4.getColumnIndex(r13)     // Catch:{ all -> 0x010c }
            if (r13 < 0) goto L_0x010e
            int r13 = r4.getInt(r13)     // Catch:{ all -> 0x010c }
            f48102k = r13     // Catch:{ all -> 0x010c }
            goto L_0x010e
        L_0x010c:
            r12 = move-exception
            goto L_0x012a
        L_0x010e:
            java.lang.String r13 = "disableStandaloneDynamiteLoader2"
            int r13 = r4.getColumnIndex(r13)     // Catch:{ all -> 0x010c }
            if (r13 < 0) goto L_0x0121
            int r13 = r4.getInt(r13)     // Catch:{ all -> 0x010c }
            if (r13 == 0) goto L_0x011d
            goto L_0x011e
        L_0x011d:
            r5 = r14
        L_0x011e:
            f48101j = r5     // Catch:{ all -> 0x010c }
            r14 = r5
        L_0x0121:
            monitor-exit(r1)     // Catch:{ all -> 0x010c }
            boolean r13 = j(r4)     // Catch:{ Exception -> 0x013b }
            if (r13 == 0) goto L_0x012c
            r4 = r0
            goto L_0x012c
        L_0x012a:
            monitor-exit(r1)     // Catch:{ all -> 0x010c }
            throw r12     // Catch:{ Exception -> 0x013b }
        L_0x012c:
            if (r15 == 0) goto L_0x013f
            if (r14 != 0) goto L_0x0131
            goto L_0x013f
        L_0x0131:
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x013b }
            java.lang.String r13 = "forcing fallback to container DynamiteLoader impl"
            r12.<init>(r13, r0)     // Catch:{ Exception -> 0x013b }
            throw r12     // Catch:{ Exception -> 0x013b }
        L_0x0139:
            r12 = move-exception
            goto L_0x013d
        L_0x013b:
            r12 = move-exception
            goto L_0x0155
        L_0x013d:
            r0 = r4
            goto L_0x0175
        L_0x013f:
            if (r4 == 0) goto L_0x0144
            r4.close()
        L_0x0144:
            return r12
        L_0x0145:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r13 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r13)     // Catch:{ Exception -> 0x013b }
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x013b }
            java.lang.String r13 = "Failed to connect to dynamite module ContentResolver."
            r12.<init>(r13, r0)     // Catch:{ Exception -> 0x013b }
            throw r12     // Catch:{ Exception -> 0x013b }
        L_0x0154:
            r4 = r0
        L_0x0155:
            boolean r13 = r12 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x0139 }
            if (r13 == 0) goto L_0x015a
            throw r12     // Catch:{ all -> 0x0139 }
        L_0x015a:
            com.google.android.gms.dynamite.DynamiteModule$a r13 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0139 }
            java.lang.String r14 = r12.getMessage()     // Catch:{ all -> 0x0139 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r15.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r1 = "V2 version check failed: "
            r15.append(r1)     // Catch:{ all -> 0x0139 }
            r15.append(r14)     // Catch:{ all -> 0x0139 }
            java.lang.String r14 = r15.toString()     // Catch:{ all -> 0x0139 }
            r13.<init>(r14, r12, r0)     // Catch:{ all -> 0x0139 }
            throw r13     // Catch:{ all -> 0x0139 }
        L_0x0175:
            if (r0 == 0) goto L_0x017a
            r0.close()
        L_0x017a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void i(ClassLoader classLoader) {
        n nVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor((Class[]) null).newInstance((Object[]) null);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder);
            }
            f48109r = nVar;
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, (e) null);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, (e) null);
        } catch (InstantiationException e12) {
            e = e12;
            throw new a("Failed to instantiate dynamite loader", e, (e) null);
        } catch (InvocationTargetException e13) {
            e = e13;
            throw new a("Failed to instantiate dynamite loader", e, (e) null);
        } catch (NoSuchMethodException e14) {
            e = e14;
            throw new a("Failed to instantiate dynamite loader", e, (e) null);
        }
    }

    private static boolean j(Cursor cursor) {
        k kVar = (k) f48104m.get();
        if (kVar == null || kVar.f48114a != null) {
            return false;
        }
        kVar.f48114a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f48103l)) {
            return true;
        }
        boolean z10 = false;
        if (f48103l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != l.g() ? 0 : 268435456);
            if (com.google.android.gms.common.b.f().h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            f48103l = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f48101j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    private static m l(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f48108q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f48108q = mVar;
                    return mVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
        }
        return null;
    }

    public Context b() {
        return this.f48110a;
    }

    public IBinder d(String str) {
        try {
            return (IBinder) this.f48110a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, (e) null);
        }
    }
}
