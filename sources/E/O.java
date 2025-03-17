package E;

import C.C4391e0;
import C.U;
import C.V;
import E.A;
import E.C4426i;
import E.C4439w;
import H2.i;
import O.A;
import O.B;
import O.C4710u;
import O.C4714y;
import android.graphics.Bitmap;
import androidx.camera.core.impl.R0;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.n;
import java.util.Objects;
import java.util.concurrent.Executor;

public class O {

    /* renamed from: a  reason: collision with root package name */
    final Executor f5538a;

    /* renamed from: b  reason: collision with root package name */
    final C4714y f5539b;

    /* renamed from: c  reason: collision with root package name */
    private a f5540c;

    /* renamed from: d  reason: collision with root package name */
    private A<b, B<n>> f5541d;

    /* renamed from: e  reason: collision with root package name */
    private A<C4439w.a, B<byte[]>> f5542e;

    /* renamed from: f  reason: collision with root package name */
    private A<C4426i.b, B<byte[]>> f5543f;

    /* renamed from: g  reason: collision with root package name */
    private A<A.a, U.h> f5544g;

    /* renamed from: h  reason: collision with root package name */
    private O.A<B<byte[]>, B<Bitmap>> f5545h;

    /* renamed from: i  reason: collision with root package name */
    private O.A<B<n>, n> f5546i;

    /* renamed from: j  reason: collision with root package name */
    private O.A<B<byte[]>, B<n>> f5547j;

    /* renamed from: k  reason: collision with root package name */
    private O.A<B<n>, Bitmap> f5548k;

    /* renamed from: l  reason: collision with root package name */
    private O.A<B<Bitmap>, B<Bitmap>> f5549l;

    /* renamed from: m  reason: collision with root package name */
    private final R0 f5550m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f5551n;

    static abstract class a {
        a() {
        }

        static a e(int i10, int i11) {
            return new C4422e(new C4710u(), new C4710u(), i10, i11);
        }

        /* access modifiers changed from: package-private */
        public abstract C4710u<b> a();

        /* access modifiers changed from: package-private */
        public abstract int b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract C4710u<b> d();
    }

    static abstract class b {
        b() {
        }

        static b c(P p10, n nVar) {
            return new C4423f(p10, nVar);
        }

        /* access modifiers changed from: package-private */
        public abstract n a();

        /* access modifiers changed from: package-private */
        public abstract P b();
    }

    O(Executor executor, C4714y yVar) {
        this(executor, yVar, androidx.camera.core.internal.compat.quirk.a.c());
    }

    private B<byte[]> i(B<byte[]> b10, int i10) {
        i.i(N.b.j(b10.e()));
        B apply = this.f5545h.apply(b10);
        O.A<B<Bitmap>, B<Bitmap>> a10 = this.f5549l;
        if (a10 != null) {
            apply = a10.apply(apply);
        }
        return this.f5543f.apply(C4426i.b.c(apply, i10));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o(b bVar) {
        if (bVar.b().j()) {
            bVar.a().close();
        } else {
            this.f5538a.execute(new J(this, bVar));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(b bVar) {
        if (bVar.b().j()) {
            C4391e0.l("ProcessingNode", "The postview image is closed due to request aborted");
            bVar.a().close();
            return;
        }
        this.f5538a.execute(new I(this, bVar));
    }

    private static void w(P p10, V v10) {
        H.a.d().execute(new N(p10, v10));
    }

    /* access modifiers changed from: package-private */
    public n r(b bVar) {
        P b10 = bVar.b();
        B apply = this.f5541d.apply(bVar);
        if ((apply.e() == 35 || this.f5549l != null || this.f5551n) && this.f5540c.c() == 256) {
            B<byte[]> apply2 = this.f5542e.apply(C4439w.a.c(apply, b10.c()));
            if (this.f5549l != null) {
                apply2 = i(apply2, b10.c());
            }
            apply = this.f5547j.apply(apply2);
        }
        return this.f5546i.apply(apply);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void n(b bVar) {
        P b10 = bVar.b();
        try {
            if (bVar.b().k()) {
                H.a.d().execute(new K(b10, r(bVar)));
                return;
            }
            H.a.d().execute(new L(b10, t(bVar)));
        } catch (V e10) {
            w(b10, e10);
        } catch (OutOfMemoryError e11) {
            w(b10, new V(0, "Processing failed due to low memory.", e11));
        } catch (RuntimeException e12) {
            w(b10, new V(0, "Processing failed.", e12));
        }
    }

    /* access modifiers changed from: package-private */
    public U.h t(b bVar) {
        int c10 = this.f5540c.c();
        i.b(N.b.j(c10), String.format("On-disk capture only support JPEG and JPEG/R output formats. Output format: %s", new Object[]{Integer.valueOf(c10)}));
        P b10 = bVar.b();
        B<byte[]> apply = this.f5542e.apply(C4439w.a.c(this.f5541d.apply(bVar), b10.c()));
        if (apply.i() || this.f5549l != null) {
            apply = i(apply, b10.c());
        }
        O.A<A.a, U.h> a10 = this.f5544g;
        U.g d10 = b10.d();
        Objects.requireNonNull(d10);
        return a10.apply(A.a.c(apply, d10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void p(b bVar) {
        int c10 = this.f5540c.c();
        i.b(c10 == 35 || c10 == 256, String.format("Postview only support YUV and JPEG output formats. Output format: %s", new Object[]{Integer.valueOf(c10)}));
        try {
            H.a.d().execute(new M(bVar.b(), this.f5548k.apply(this.f5541d.apply(bVar))));
        } catch (Exception e10) {
            bVar.a().close();
            C4391e0.d("ProcessingNode", "process postview input packet failed.", e10);
        }
    }

    public void v() {
    }

    public Void x(a aVar) {
        this.f5540c = aVar;
        aVar.a().a(new G(this));
        aVar.d().a(new H(this));
        this.f5541d = new F();
        this.f5542e = new C4439w(this.f5550m);
        this.f5545h = new C4442z();
        this.f5543f = new C4426i();
        this.f5544g = new A();
        this.f5546i = new C();
        this.f5548k = new C4438v();
        if (aVar.b() == 35 || this.f5539b != null || this.f5551n) {
            this.f5547j = new B();
        }
        C4714y yVar = this.f5539b;
        if (yVar == null) {
            return null;
        }
        this.f5549l = new C4427j(yVar);
        return null;
    }

    O(Executor executor, C4714y yVar, R0 r02) {
        if (androidx.camera.core.internal.compat.quirk.a.b(LowMemoryQuirk.class) != null) {
            this.f5538a = H.a.f(executor);
        } else {
            this.f5538a = executor;
        }
        this.f5539b = yVar;
        this.f5550m = r02;
        this.f5551n = r02.a(IncorrectJpegMetadataQuirk.class);
    }
}
