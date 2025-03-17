package androidx.camera.view;

import C.C4391e0;
import C.G0;
import H2.i;
import I.n;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.q;
import androidx.concurrent.futures.c;
import d0.m;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import ob.C10101e;
import u2.C6012a;

final class F extends q {

    /* renamed from: e  reason: collision with root package name */
    TextureView f17094e;

    /* renamed from: f  reason: collision with root package name */
    SurfaceTexture f17095f;

    /* renamed from: g  reason: collision with root package name */
    C10101e<G0.g> f17096g;

    /* renamed from: h  reason: collision with root package name */
    G0 f17097h;

    /* renamed from: i  reason: collision with root package name */
    boolean f17098i = false;

    /* renamed from: j  reason: collision with root package name */
    SurfaceTexture f17099j;

    /* renamed from: k  reason: collision with root package name */
    AtomicReference<c.a<Void>> f17100k = new AtomicReference<>();

    /* renamed from: l  reason: collision with root package name */
    q.a f17101l;

    /* renamed from: m  reason: collision with root package name */
    Executor f17102m;

    class a implements TextureView.SurfaceTextureListener {

        /* renamed from: androidx.camera.view.F$a$a  reason: collision with other inner class name */
        class C0232a implements I.c<G0.g> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SurfaceTexture f17104a;

            C0232a(SurfaceTexture surfaceTexture) {
                this.f17104a = surfaceTexture;
            }

            public void b(Throwable th2) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
            }

            /* renamed from: c */
            public void a(G0.g gVar) {
                i.j(gVar.a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                C4391e0.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f17104a.release();
                F f10 = F.this;
                if (f10.f17099j != null) {
                    f10.f17099j = null;
                }
            }
        }

        a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            C4391e0.a("TextureViewImpl", "SurfaceTexture available. Size: " + i10 + "x" + i11);
            F f10 = F.this;
            f10.f17095f = surfaceTexture;
            if (f10.f17096g != null) {
                i.g(f10.f17097h);
                C4391e0.a("TextureViewImpl", "Surface invalidated " + F.this.f17097h);
                F.this.f17097h.m().d();
                return;
            }
            f10.u();
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            F f10 = F.this;
            f10.f17095f = null;
            C10101e<G0.g> eVar = f10.f17096g;
            if (eVar != null) {
                n.j(eVar, new C0232a(surfaceTexture), C6012a.h(F.this.f17094e.getContext()));
                F.this.f17099j = surfaceTexture;
                return false;
            }
            C4391e0.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            C4391e0.a("TextureViewImpl", "SurfaceTexture size changed: " + i10 + "x" + i11);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            c.a andSet = F.this.f17100k.getAndSet((Object) null);
            if (andSet != null) {
                andSet.c(null);
            }
            F.this.getClass();
            Executor executor = F.this.f17102m;
        }
    }

    F(FrameLayout frameLayout, m mVar) {
        super(frameLayout, mVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o(G0 g02) {
        G0 g03 = this.f17097h;
        if (g03 != null && g03 == g02) {
            this.f17097h = null;
            this.f17096g = null;
        }
        s();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object p(Surface surface, c.a aVar) {
        C4391e0.a("TextureViewImpl", "Surface set on Preview.");
        G0 g02 = this.f17097h;
        Executor a10 = H.a.a();
        Objects.requireNonNull(aVar);
        g02.D(surface, a10, new m(aVar));
        return "provideSurface[request=" + this.f17097h + " surface=" + surface + "]";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(Surface surface, C10101e eVar, G0 g02) {
        C4391e0.a("TextureViewImpl", "Safe to release surface.");
        s();
        surface.release();
        if (this.f17096g == eVar) {
            this.f17096g = null;
        }
        if (this.f17097h == g02) {
            this.f17097h = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object r(c.a aVar) {
        this.f17100k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    private void s() {
        q.a aVar = this.f17101l;
        if (aVar != null) {
            aVar.a();
            this.f17101l = null;
        }
    }

    private void t() {
        SurfaceTexture surfaceTexture;
        if (this.f17098i && this.f17099j != null && this.f17094e.getSurfaceTexture() != (surfaceTexture = this.f17099j)) {
            this.f17094e.setSurfaceTexture(surfaceTexture);
            this.f17099j = null;
            this.f17098i = false;
        }
    }

    /* access modifiers changed from: package-private */
    public View b() {
        return this.f17094e;
    }

    /* access modifiers changed from: package-private */
    public Bitmap c() {
        TextureView textureView = this.f17094e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f17094e.getBitmap();
    }

    /* access modifiers changed from: package-private */
    public void d() {
        t();
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f17098i = true;
    }

    /* access modifiers changed from: package-private */
    public void g(G0 g02, q.a aVar) {
        this.f17214a = g02.p();
        this.f17101l = aVar;
        n();
        G0 g03 = this.f17097h;
        if (g03 != null) {
            g03.G();
        }
        this.f17097h = g02;
        g02.j(C6012a.h(this.f17094e.getContext()), new B(this, g02));
        u();
    }

    /* access modifiers changed from: package-private */
    public C10101e<Void> i() {
        return c.a(new C(this));
    }

    public void n() {
        i.g(this.f17215b);
        i.g(this.f17214a);
        TextureView textureView = new TextureView(this.f17215b.getContext());
        this.f17094e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f17214a.getWidth(), this.f17214a.getHeight()));
        this.f17094e.setSurfaceTextureListener(new a());
        this.f17215b.removeAllViews();
        this.f17215b.addView(this.f17094e);
    }

    /* access modifiers changed from: package-private */
    public void u() {
        SurfaceTexture surfaceTexture;
        Size size = this.f17214a;
        if (size != null && (surfaceTexture = this.f17095f) != null && this.f17097h != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f17214a.getHeight());
            Surface surface = new Surface(this.f17095f);
            G0 g02 = this.f17097h;
            C10101e<G0.g> a10 = c.a(new D(this, surface));
            this.f17096g = a10;
            a10.a(new E(this, surface, a10, g02), C6012a.h(this.f17094e.getContext()));
            f();
        }
    }
}
