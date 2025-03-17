package C;

import I.n;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.c1;
import androidx.concurrent.futures.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import ob.C10101e;

public final class G0 {

    /* renamed from: p  reason: collision with root package name */
    public static final Range<Integer> f5198p = c1.f16864a;

    /* renamed from: a  reason: collision with root package name */
    private final Object f5199a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Size f5200b;

    /* renamed from: c  reason: collision with root package name */
    private final C4417z f5201c;

    /* renamed from: d  reason: collision with root package name */
    private final Range<Integer> f5202d;

    /* renamed from: e  reason: collision with root package name */
    private final J f5203e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5204f;

    /* renamed from: g  reason: collision with root package name */
    final C10101e<Surface> f5205g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a<Surface> f5206h;

    /* renamed from: i  reason: collision with root package name */
    private final C10101e<Void> f5207i;

    /* renamed from: j  reason: collision with root package name */
    private final c.a<Void> f5208j;

    /* renamed from: k  reason: collision with root package name */
    private final c.a<Void> f5209k;

    /* renamed from: l  reason: collision with root package name */
    private final C5019e0 f5210l;

    /* renamed from: m  reason: collision with root package name */
    private h f5211m;

    /* renamed from: n  reason: collision with root package name */
    private i f5212n;

    /* renamed from: o  reason: collision with root package name */
    private Executor f5213o;

    class a implements I.c<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a f5214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C10101e f5215b;

        a(c.a aVar, C10101e eVar) {
            this.f5214a = aVar;
            this.f5215b = eVar;
        }

        public void b(Throwable th2) {
            if (th2 instanceof f) {
                H2.i.i(this.f5215b.cancel(false));
            } else {
                H2.i.i(this.f5214a.c(null));
            }
        }

        /* renamed from: c */
        public void a(Void voidR) {
            H2.i.i(this.f5214a.c(null));
        }
    }

    class b extends C5019e0 {
        b(Size size, int i10) {
            super(size, i10);
        }

        /* access modifiers changed from: protected */
        public C10101e<Surface> r() {
            return G0.this.f5205g;
        }
    }

    class c implements I.c<Surface> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10101e f5218a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c.a f5219b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5220c;

        c(C10101e eVar, c.a aVar, String str) {
            this.f5218a = eVar;
            this.f5219b = aVar;
            this.f5220c = str;
        }

        public void b(Throwable th2) {
            if (th2 instanceof CancellationException) {
                c.a aVar = this.f5219b;
                H2.i.i(aVar.f(new f(this.f5220c + " cancelled.", th2)));
                return;
            }
            this.f5219b.c(null);
        }

        /* renamed from: c */
        public void a(Surface surface) {
            n.C(this.f5218a, this.f5219b);
        }
    }

    class d implements I.c<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H2.a f5222a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Surface f5223b;

        d(H2.a aVar, Surface surface) {
            this.f5222a = aVar;
            this.f5223b = surface;
        }

        public void b(Throwable th2) {
            H2.i.j(th2 instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f5222a.accept(g.c(1, this.f5223b));
        }

        /* renamed from: c */
        public void a(Void voidR) {
            this.f5222a.accept(g.c(0, this.f5223b));
        }
    }

    class e implements I.c<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f5225a;

        e(Runnable runnable) {
            this.f5225a = runnable;
        }

        public void b(Throwable th2) {
        }

        /* renamed from: c */
        public void a(Void voidR) {
            this.f5225a.run();
        }
    }

    private static final class f extends RuntimeException {
        f(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public static abstract class g {
        g() {
        }

        static g c(int i10, Surface surface) {
            return new C4396h(i10, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    public static abstract class h {
        h() {
        }

        public static h g(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
            return new C4398i(rect, i10, i11, z10, matrix, z11);
        }

        public abstract Rect a();

        public abstract int b();

        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    public interface i {
        void a(h hVar);
    }

    public G0(Size size, J j10, boolean z10, C4417z zVar, Range<Integer> range, Runnable runnable) {
        this.f5200b = size;
        this.f5203e = j10;
        this.f5204f = z10;
        this.f5201c = zVar;
        this.f5202d = range;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference((Object) null);
        C10101e a10 = androidx.concurrent.futures.c.a(new y0(atomicReference, str));
        c.a<Void> aVar = (c.a) H2.i.g((c.a) atomicReference.get());
        this.f5209k = aVar;
        AtomicReference atomicReference2 = new AtomicReference((Object) null);
        C10101e<Void> a11 = androidx.concurrent.futures.c.a(new z0(atomicReference2, str));
        this.f5207i = a11;
        n.j(a11, new a(aVar, a10), H.a.a());
        AtomicReference atomicReference3 = new AtomicReference((Object) null);
        C10101e<Surface> a12 = androidx.concurrent.futures.c.a(new A0(atomicReference3, str));
        this.f5205g = a12;
        this.f5206h = (c.a) H2.i.g((c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f5210l = bVar;
        C10101e<Void> k10 = bVar.k();
        n.j(a12, new c(k10, (c.a) H2.i.g((c.a) atomicReference2.get()), str), H.a.a());
        k10.a(new B0(this), H.a.a());
        this.f5208j = q(H.a.a(), runnable);
    }

    private c.a<Void> q(Executor executor, Runnable runnable) {
        AtomicReference atomicReference = new AtomicReference((Object) null);
        n.j(androidx.concurrent.futures.c.a(new C0(this, atomicReference)), new e(runnable), executor);
        return (c.a) H2.i.g((c.a) atomicReference.get());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object u(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + hashCode() + ")";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y() {
        this.f5205g.cancel(true);
    }

    public void D(Surface surface, Executor executor, H2.a<g> aVar) {
        if (this.f5206h.c(surface) || this.f5205g.isCancelled()) {
            n.j(this.f5207i, new d(aVar, surface), executor);
            return;
        }
        H2.i.i(this.f5205g.isDone());
        try {
            this.f5205g.get();
            executor.execute(new E0(aVar, surface));
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new F0(aVar, surface));
        }
    }

    public void E(Executor executor, i iVar) {
        h hVar;
        synchronized (this.f5199a) {
            this.f5212n = iVar;
            this.f5213o = executor;
            hVar = this.f5211m;
        }
        if (hVar != null) {
            executor.execute(new D0(iVar, hVar));
        }
    }

    public void F(h hVar) {
        i iVar;
        Executor executor;
        synchronized (this.f5199a) {
            this.f5211m = hVar;
            iVar = this.f5212n;
            executor = this.f5213o;
        }
        if (iVar != null && executor != null) {
            executor.execute(new x0(iVar, hVar));
        }
    }

    public boolean G() {
        return this.f5206h.f(new C5019e0.b("Surface request will not complete."));
    }

    @SuppressLint({"PairedRegistration"})
    public void j(Executor executor, Runnable runnable) {
        this.f5209k.a(runnable, executor);
    }

    public void k() {
        synchronized (this.f5199a) {
            this.f5212n = null;
            this.f5213o = null;
        }
    }

    public J l() {
        return this.f5203e;
    }

    public C5019e0 m() {
        return this.f5210l;
    }

    public C4417z n() {
        return this.f5201c;
    }

    public Range<Integer> o() {
        return this.f5202d;
    }

    public Size p() {
        return this.f5200b;
    }

    public boolean r() {
        G();
        return this.f5208j.c(null);
    }

    public boolean s() {
        return this.f5204f;
    }

    public boolean t() {
        return this.f5205g.isDone();
    }
}
