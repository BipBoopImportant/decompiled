package gd;

import K9.C6612j;
import K9.C6620s;
import Vc.a;
import Zc.C9397f;
import android.graphics.Matrix;
import android.media.Image;
import androidx.lifecycle.C5220x;
import androidx.lifecycle.M;
import androidx.lifecycle.r;
import fd.C9707a;
import ia.C8296k5;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import xa.C8961b;
import xa.C8971l;
import xa.C8974o;

public class e<DetectionResultT> implements Closeable, C5220x {

    /* renamed from: f  reason: collision with root package name */
    private static final C6612j f73047f = new C6612j("MobileVisionBase", "");

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f73048g = 0;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f73049a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final C9397f f73050b;

    /* renamed from: c  reason: collision with root package name */
    private final C8961b f73051c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f73052d;

    /* renamed from: e  reason: collision with root package name */
    private final C8971l f73053e;

    public e(C9397f<DetectionResultT, C9707a> fVar, Executor executor) {
        this.f73050b = fVar;
        C8961b bVar = new C8961b();
        this.f73051c = bVar;
        this.f73052d = executor;
        fVar.c();
        this.f73053e = fVar.a(executor, g.f73056a, bVar.b()).e(h.f73057a);
    }

    public C8971l<DetectionResultT> H1(Image image, int i10, Matrix matrix) {
        return f(C9707a.a(image, i10, matrix));
    }

    @M(r.a.ON_DESTROY)
    public synchronized void close() {
        if (!this.f73049a.getAndSet(true)) {
            this.f73051c.a();
            this.f73050b.e(this.f73052d);
        }
    }

    public synchronized C8971l<DetectionResultT> f(C9707a aVar) {
        C6620s.m(aVar, "InputImage can not be null");
        if (this.f73049a.get()) {
            return C8974o.e(new a("This detector is already closed!", 14));
        } else if (aVar.j() < 32 || aVar.f() < 32) {
            return C8974o.e(new a("InputImage width and height should be at least 32!", 3));
        } else {
            return this.f73050b.a(this.f73052d, new f(this, aVar), this.f73051c.b());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object g(C9707a aVar) {
        Class<Throwable> cls = Throwable.class;
        C8296k5 g10 = C8296k5.g("detectorTaskWithResource#run");
        g10.d();
        try {
            Object i10 = this.f73050b.i(aVar);
            g10.close();
            return i10;
        } catch (Throwable th2) {
            try {
                cls.getDeclaredMethod("addSuppressed", new Class[]{cls}).invoke(th, new Object[]{th2});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
