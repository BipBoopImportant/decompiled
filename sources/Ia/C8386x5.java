package ia;

import D2.f;
import D2.j;
import K9.C6617o;
import Zc.C9394c;
import Zc.C9398g;
import Zc.n;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import xa.C8971l;

/* renamed from: ia.x5  reason: case insensitive filesystem */
public final class C8386x5 {

    /* renamed from: k  reason: collision with root package name */
    private static N5 f53999k;

    /* renamed from: l  reason: collision with root package name */
    private static final P5 f54000l = P5.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a  reason: collision with root package name */
    private final String f54001a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54002b;

    /* renamed from: c  reason: collision with root package name */
    private final C8338q5 f54003c;

    /* renamed from: d  reason: collision with root package name */
    private final n f54004d;

    /* renamed from: e  reason: collision with root package name */
    private final C8971l f54005e;

    /* renamed from: f  reason: collision with root package name */
    private final C8971l f54006f;

    /* renamed from: g  reason: collision with root package name */
    private final String f54007g;

    /* renamed from: h  reason: collision with root package name */
    private final int f54008h;

    /* renamed from: i  reason: collision with root package name */
    private final Map f54009i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private final Map f54010j = new HashMap();

    public C8386x5(Context context, n nVar, C8338q5 q5Var, String str) {
        this.f54001a = context.getPackageName();
        this.f54002b = C9394c.a(context);
        this.f54004d = nVar;
        this.f54003c = q5Var;
        K5.a();
        this.f54007g = str;
        this.f54005e = C9398g.a().b(new C8365u5(this));
        C9398g a10 = C9398g.a();
        nVar.getClass();
        this.f54006f = a10.b(new C8372v5(nVar));
        P5 p52 = f54000l;
        this.f54008h = p52.containsKey(str) ? DynamiteModule.c(context, (String) p52.get(str)) : -1;
    }

    private static synchronized N5 d() {
        synchronized (C8386x5.class) {
            try {
                N5 n52 = f53999k;
                if (n52 != null) {
                    return n52;
                }
                j a10 = f.a(Resources.getSystem().getConfiguration());
                C8317n5 n5Var = new C8317n5();
                for (int i10 = 0; i10 < a10.f(); i10++) {
                    n5Var.c(C9394c.b(a10.c(i10)));
                }
                N5 d10 = n5Var.d();
                f53999k = d10;
                return d10;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String a() {
        return C6617o.a().b(this.f54007g);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(C8331p5 p5Var, F3 f32, String str) {
        p5Var.a(f32);
        String zzc = p5Var.zzc();
        K4 k42 = new K4();
        k42.b(this.f54001a);
        k42.c(this.f54002b);
        k42.h(d());
        k42.g(Boolean.TRUE);
        k42.l(zzc);
        k42.j(str);
        k42.i(this.f54006f.q() ? (String) this.f54006f.m() : this.f54004d.a());
        k42.d(10);
        k42.k(Integer.valueOf(this.f54008h));
        p5Var.b(k42);
        this.f54003c.a(p5Var);
    }

    public final void c(H5 h52, F3 f32) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f54009i.get(f32) == null || elapsedRealtime - ((Long) this.f54009i.get(f32)).longValue() > TimeUnit.SECONDS.toMillis(30)) {
            this.f54009i.put(f32, Long.valueOf(elapsedRealtime));
            int i10 = h52.f53264a;
            int i11 = h52.f53265b;
            int i12 = h52.f53266c;
            int i13 = h52.f53267d;
            int i14 = h52.f53268e;
            long j10 = h52.f53269f;
            int i15 = h52.f53270g;
            C8384x3 x3Var = new C8384x3();
            x3Var.d(i10 != -1 ? i10 != 35 ? i10 != 842094169 ? i10 != 16 ? i10 != 17 ? C8349s3.UNKNOWN_FORMAT : C8349s3.NV21 : C8349s3.NV16 : C8349s3.YV12 : C8349s3.YUV_420_888 : C8349s3.BITMAP);
            x3Var.f(i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? C8391y3.ANDROID_MEDIA_IMAGE : C8391y3.FILEPATH : C8391y3.BYTEBUFFER : C8391y3.BYTEARRAY : C8391y3.BITMAP);
            x3Var.c(Integer.valueOf(i12));
            x3Var.e(Integer.valueOf(i13));
            x3Var.g(Integer.valueOf(i14));
            x3Var.b(Long.valueOf(j10));
            x3Var.h(Integer.valueOf(i15));
            A3 j11 = x3Var.j();
            G3 g32 = new G3();
            g32.d(j11);
            C9398g.d().execute(new C8379w5(this, y5.d(g32), f32, this.f54005e.q() ? (String) this.f54005e.m() : C6617o.a().b(this.f54007g)));
        }
    }
}
