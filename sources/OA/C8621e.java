package oa;

import android.content.Context;

/* renamed from: oa.e  reason: case insensitive filesystem */
public final class C8621e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f55340a = "e";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f55341b = false;

    /* renamed from: c  reason: collision with root package name */
    private static a f55342c = a.LEGACY;

    /* renamed from: oa.e$a */
    public enum a {
        LEGACY,
        LATEST
    }

    private C8621e() {
    }

    public static synchronized int a(Context context) {
        int b10;
        synchronized (C8621e.class) {
            b10 = b(context, (a) null, (C8623g) null);
        }
        return b10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f A[Catch:{ RemoteException -> 0x007f, RemoteException -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078 A[Catch:{ RemoteException -> 0x007f, RemoteException -> 0x0054 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int b(android.content.Context r5, oa.C8621e.a r6, oa.C8623g r7) {
        /*
            java.lang.Class<oa.e> r0 = oa.C8621e.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            K9.C6620s.m(r5, r1)     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = f55340a     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0024 }
            java.lang.String r3 = "preferredRenderer: "
            java.lang.String r2 = r3.concat(r2)     // Catch:{ all -> 0x0024 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0024 }
            boolean r1 = f55341b     // Catch:{ all -> 0x0024 }
            r2 = 0
            if (r1 == 0) goto L_0x0026
            if (r7 == 0) goto L_0x007d
            oa.e$a r5 = f55342c     // Catch:{ all -> 0x0024 }
            r7.a(r5)     // Catch:{ all -> 0x0024 }
            goto L_0x007d
        L_0x0024:
            r5 = move-exception
            goto L_0x008b
        L_0x0026:
            pa.U r1 = pa.Q.a(r5, r6)     // Catch:{ c -> 0x0086 }
            pa.a r3 = r1.h()     // Catch:{ RemoteException -> 0x007f }
            oa.C8618b.f(r3)     // Catch:{ RemoteException -> 0x007f }
            fa.o r3 = r1.f()     // Catch:{ RemoteException -> 0x007f }
            qa.c.b(r3)     // Catch:{ RemoteException -> 0x007f }
            r3 = 1
            f55341b = r3     // Catch:{ all -> 0x0024 }
            r4 = 2
            if (r6 == 0) goto L_0x0046
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0024 }
            if (r6 == 0) goto L_0x0049
            if (r6 == r3) goto L_0x0048
        L_0x0046:
            r3 = r2
            goto L_0x0049
        L_0x0048:
            r3 = r4
        L_0x0049:
            int r6 = r1.zzd()     // Catch:{ RemoteException -> 0x0054 }
            if (r6 != r4) goto L_0x0056
            oa.e$a r6 = oa.C8621e.a.LATEST     // Catch:{ RemoteException -> 0x0054 }
            f55342c = r6     // Catch:{ RemoteException -> 0x0054 }
            goto L_0x0056
        L_0x0054:
            r5 = move-exception
            goto L_0x005e
        L_0x0056:
            T9.b r5 = T9.d.L3(r5)     // Catch:{ RemoteException -> 0x0054 }
            r1.R1(r5, r3)     // Catch:{ RemoteException -> 0x0054 }
            goto L_0x0065
        L_0x005e:
            java.lang.String r6 = f55340a     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r6, r1, r5)     // Catch:{ all -> 0x0024 }
        L_0x0065:
            java.lang.String r5 = f55340a     // Catch:{ all -> 0x0024 }
            oa.e$a r6 = f55342c     // Catch:{ all -> 0x0024 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = "loadedRenderer: "
            java.lang.String r6 = r1.concat(r6)     // Catch:{ all -> 0x0024 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0024 }
            if (r7 == 0) goto L_0x007d
            oa.e$a r5 = f55342c     // Catch:{ all -> 0x0024 }
            r7.a(r5)     // Catch:{ all -> 0x0024 }
        L_0x007d:
            monitor-exit(r0)
            return r2
        L_0x007f:
            r5 = move-exception
            qa.m r6 = new qa.m     // Catch:{ all -> 0x0024 }
            r6.<init>(r5)     // Catch:{ all -> 0x0024 }
            throw r6     // Catch:{ all -> 0x0024 }
        L_0x0086:
            r5 = move-exception
            int r5 = r5.f36314a     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)
            return r5
        L_0x008b:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.C8621e.b(android.content.Context, oa.e$a, oa.g):int");
    }
}
