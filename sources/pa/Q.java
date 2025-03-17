package pa;

import G9.C6522c;
import K9.C6620s;
import T9.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.c;
import java.util.Objects;
import oa.C8621e;
import qa.m;

public final class Q {

    /* renamed from: a  reason: collision with root package name */
    private static final String f55443a = "Q";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static Context f55444b;

    /* renamed from: c  reason: collision with root package name */
    private static U f55445c;

    public static U a(Context context, C8621e.a aVar) {
        C6620s.l(context);
        Log.d(f55443a, "preferredRenderer: ".concat(String.valueOf(aVar)));
        U u10 = f55445c;
        if (u10 != null) {
            return u10;
        }
        int g10 = c.g(context, 13400000);
        if (g10 == 0) {
            U d10 = d(context, aVar);
            f55445c = d10;
            try {
                if (d10.zzd() == 2) {
                    try {
                        f55445c.u3(d.L3(c(context, aVar)));
                    } catch (UnsatisfiedLinkError unused) {
                        Log.w(f55443a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                        f55444b = null;
                        f55445c = d(context, C8621e.a.LEGACY);
                    } catch (RemoteException e10) {
                        throw new m(e10);
                    }
                }
                try {
                    U u11 = f55445c;
                    Context c10 = c(context, aVar);
                    Objects.requireNonNull(c10);
                    u11.c3(d.L3(c10.getResources()), 19000000);
                    return f55445c;
                } catch (RemoteException e11) {
                    throw new m(e11);
                }
            } catch (RemoteException e12) {
                throw new m(e12);
            }
        } else {
            throw new C6522c(g10);
        }
    }

    private static Context b(Exception exc, Context context) {
        Log.e(f55443a, "Failed to load maps module, use pre-Chimera", exc);
        return c.d(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r0 = "com.google.android.gms.maps_core_dynamite";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r5 != oa.C8621e.a.LEGACY) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r5 != 1) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Context c(android.content.Context r4, oa.C8621e.a r5) {
        /*
            java.lang.String r0 = "com.google.android.gms.maps_legacy_dynamite"
            java.lang.String r1 = "com.google.android.gms.maps_core_dynamite"
            java.lang.String r2 = "com.google.android.gms.maps_dynamite"
            android.content.Context r3 = f55444b
            if (r3 != 0) goto L_0x0054
            java.lang.String r3 = "com.google.android.gms.maps.internal.UseLegacyRendererAsDefault"
            java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x001f }
            if (r5 == 0) goto L_0x001d
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0023
            r0 = 1
            if (r5 == r0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r0 = r1
            goto L_0x0023
        L_0x001d:
            r0 = r2
            goto L_0x0023
        L_0x001f:
            oa.e$a r3 = oa.C8621e.a.LEGACY
            if (r5 != r3) goto L_0x001b
        L_0x0023:
            com.google.android.gms.dynamite.DynamiteModule$b r5 = com.google.android.gms.dynamite.DynamiteModule.f48093b     // Catch:{ Exception -> 0x002e }
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.e(r4, r5, r0)     // Catch:{ Exception -> 0x002e }
            android.content.Context r4 = r5.b()     // Catch:{ Exception -> 0x002e }
            goto L_0x0051
        L_0x002e:
            r5 = move-exception
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x004d
            java.lang.String r5 = f55443a     // Catch:{ Exception -> 0x0047 }
            java.lang.String r0 = "Attempting to load maps_dynamite again."
            android.util.Log.d(r5, r0)     // Catch:{ Exception -> 0x0047 }
            com.google.android.gms.dynamite.DynamiteModule$b r5 = com.google.android.gms.dynamite.DynamiteModule.f48093b     // Catch:{ Exception -> 0x0047 }
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.e(r4, r5, r2)     // Catch:{ Exception -> 0x0047 }
            android.content.Context r4 = r5.b()     // Catch:{ Exception -> 0x0047 }
            goto L_0x0051
        L_0x0047:
            r5 = move-exception
            android.content.Context r4 = b(r5, r4)
            goto L_0x0051
        L_0x004d:
            android.content.Context r4 = b(r5, r4)
        L_0x0051:
            f55444b = r4
            return r4
        L_0x0054:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.Q.c(android.content.Context, oa.e$a):android.content.Context");
    }

    private static U d(Context context, C8621e.a aVar) {
        Log.i(f55443a, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) e(((ClassLoader) C6620s.l(c(context, aVar).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return queryLocalInterface instanceof U ? (U) queryLocalInterface : new T(iBinder);
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e10);
        }
    }

    private static Object e(Class cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException e10) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e10);
        } catch (IllegalAccessException e11) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e11);
        }
    }
}
