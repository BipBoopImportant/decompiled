package G9;

import K9.C6603b0;
import K9.C6605c0;
import K9.C6620s;
import T9.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.j;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;

final class s {

    /* renamed from: a  reason: collision with root package name */
    static final q f36329a = new k(o.K3("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b  reason: collision with root package name */
    static final q f36330b = new l(o.K3("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c  reason: collision with root package name */
    static final q f36331c = new m(o.K3("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d  reason: collision with root package name */
    static final q f36332d = new n(o.K3("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e  reason: collision with root package name */
    private static volatile C6605c0 f36333e;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f36334f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static Context f36335g;

    static B a(String str, o oVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, oVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static B b(String str, boolean z10, boolean z11, boolean z12) {
        return g(str, z10, false, false, true);
    }

    static /* synthetic */ String c(boolean z10, String str, o oVar) {
        String str2 = (z10 || !f(str, oVar, true, false).f36305a) ? "not allowed" : "debug cert rejected";
        MessageDigest b10 = a.b(Constants.SHA256);
        C6620s.l(b10);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, j.a(b10.digest(oVar.L3())), Boolean.valueOf(z10), "12451000.false"});
    }

    static synchronized void d(Context context) {
        synchronized (s.class) {
            if (f36335g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f36335g = context.getApplicationContext();
            }
        }
    }

    static boolean e() {
        boolean z10;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            h();
            z10 = f36333e.b();
        } catch (RemoteException | DynamiteModule.a e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            z10 = false;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return z10;
    }

    private static B f(String str, o oVar, boolean z10, boolean z11) {
        try {
            h();
            C6620s.l(f36335g);
            try {
                return f36333e.v1(new x(str, oVar, z10, z11), d.L3(f36335g.getPackageManager())) ? B.b() : new z(new j(z10, str, oVar), (A) null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return B.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return B.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [T9.b, android.os.IBinder] */
    private static B g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        B b10;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C6620s.l(f36335g);
            try {
                h();
                t tVar = new t(str, z10, false, d.L3(f36335g), false, true);
                v S22 = z13 ? f36333e.S2(tVar) : f36333e.z0(tVar);
                if (S22.B()) {
                    b10 = B.f(S22.F());
                } else {
                    String x10 = S22.x();
                    PackageManager.NameNotFoundException nameNotFoundException = S22.J() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (x10 == null) {
                        x10 = "error checking package certificate";
                    }
                    b10 = B.g(S22.F(), S22.J(), x10, nameNotFoundException);
                }
            } catch (DynamiteModule.a e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                b10 = B.d("module init: ".concat(String.valueOf(e10.getMessage())), e10);
            }
        } catch (RemoteException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            b10 = B.d("module call", e11);
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return b10;
    }

    private static void h() {
        if (f36333e == null) {
            C6620s.l(f36335g);
            synchronized (f36334f) {
                try {
                    if (f36333e == null) {
                        f36333e = C6603b0.J3(DynamiteModule.e(f36335g, DynamiteModule.f48097f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
