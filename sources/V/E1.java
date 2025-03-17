package v;

import C.C4391e0;
import C.H0;
import I.n;
import J.m;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.C5044r0;
import androidx.camera.core.impl.C5050u0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import w.B;
import z.w;

class E1 {

    /* renamed from: a  reason: collision with root package name */
    private C5019e0 f30180a;

    /* renamed from: b  reason: collision with root package name */
    private X0 f30181b;

    /* renamed from: c  reason: collision with root package name */
    private final b f30182c = new b();

    /* renamed from: d  reason: collision with root package name */
    private final Size f30183d;

    /* renamed from: e  reason: collision with root package name */
    private final w f30184e = new w();

    /* renamed from: f  reason: collision with root package name */
    private final c f30185f;

    /* renamed from: g  reason: collision with root package name */
    private X0.c f30186g = null;

    class a implements I.c<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Surface f30187a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f30188b;

        a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f30187a = surface;
            this.f30188b = surfaceTexture;
        }

        public void b(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }

        /* renamed from: c */
        public void a(Void voidR) {
            this.f30187a.release();
            this.f30188b.release();
        }
    }

    private static class b implements o1<H0> {

        /* renamed from: I  reason: collision with root package name */
        private final X f30190I;

        b() {
            E0 b02 = E0.b0();
            b02.q(o1.f16983z, new J0());
            b02.q(C5044r0.f17008l, 34);
            X(b02);
            this.f30190I = b02;
        }

        private void X(E0 e02) {
            Class<E1> cls = E1.class;
            e02.q(m.f8790c, cls);
            e02.q(m.f8789b, cls.getCanonicalName() + "-" + UUID.randomUUID());
        }

        public p1.b getCaptureType() {
            return p1.b.METERING_REPEATING;
        }

        public X getConfig() {
            return this.f30190I;
        }
    }

    interface c {
        void a();
    }

    E1(B b10, C6072h1 h1Var, c cVar) {
        this.f30185f = cVar;
        Size g10 = g(b10, h1Var);
        this.f30183d = g10;
        C4391e0.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + g10);
        this.f30181b = d();
    }

    private Size g(B b10, C6072h1 h1Var) {
        Size[] c10 = b10.b().c(34);
        if (c10 == null) {
            C4391e0.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] a10 = this.f30184e.a(c10);
        List asList = Arrays.asList(a10);
        Collections.sort(asList, new D1());
        Size f10 = h1Var.f();
        long min = Math.min(((long) f10.getWidth()) * ((long) f10.getHeight()), 307200);
        int length = a10.length;
        Size size = null;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Size size2 = a10[i10];
            int i11 = ((((long) size2.getWidth()) * ((long) size2.getHeight())) > min ? 1 : ((((long) size2.getWidth()) * ((long) size2.getHeight())) == min ? 0 : -1));
            if (i11 == 0) {
                return size2;
            }
            if (i11 <= 0) {
                i10++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) asList.get(0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(X0 x02, X0.g gVar) {
        this.f30181b = d();
        c cVar = this.f30185f;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        C4391e0.a("MeteringRepeating", "MeteringRepeating clear!");
        C5019e0 e0Var = this.f30180a;
        if (e0Var != null) {
            e0Var.d();
        }
        this.f30180a = null;
    }

    /* access modifiers changed from: package-private */
    public X0 d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f30183d.getWidth(), this.f30183d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        X0.b q10 = X0.b.q(this.f30182c, this.f30183d);
        q10.z(1);
        C5050u0 u0Var = new C5050u0(surface);
        this.f30180a = u0Var;
        n.j(u0Var.k(), new a(surface, surfaceTexture), H.a.a());
        q10.l(this.f30180a);
        X0.c cVar = this.f30186g;
        if (cVar != null) {
            cVar.b();
        }
        X0.c cVar2 = new X0.c(new C1(this));
        this.f30186g = cVar2;
        q10.t(cVar2);
        return q10.o();
    }

    /* access modifiers changed from: package-private */
    public Size e() {
        return this.f30183d;
    }

    /* access modifiers changed from: package-private */
    public String f() {
        return "MeteringRepeating";
    }

    /* access modifiers changed from: package-private */
    public X0 h() {
        return this.f30181b;
    }

    /* access modifiers changed from: package-private */
    public o1<?> i() {
        return this.f30182c;
    }
}
