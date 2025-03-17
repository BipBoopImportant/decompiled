package O;

import C.C4391e0;
import C.C4417z;
import C.G0;
import C.v0;
import G.m;
import G.q;
import H2.i;
import I.n;
import Q.d;
import XH.C16795B;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.concurrent.futures.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import ob.C10101e;
import q.C5759a;

/* renamed from: O.t  reason: case insensitive filesystem */
public class C4709t implements S, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    private final C4715z f9640a;

    /* renamed from: b  reason: collision with root package name */
    final HandlerThread f9641b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f9642c;

    /* renamed from: d  reason: collision with root package name */
    final Handler f9643d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f9644e;

    /* renamed from: f  reason: collision with root package name */
    private final float[] f9645f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f9646g;

    /* renamed from: h  reason: collision with root package name */
    final Map<v0, Surface> f9647h;

    /* renamed from: i  reason: collision with root package name */
    private int f9648i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9649j;

    /* renamed from: k  reason: collision with root package name */
    private final List<b> f9650k;

    /* renamed from: O.t$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static C5759a<C4417z, S> f9651a = new C4708s();

        public static S a(C4417z zVar) {
            return f9651a.apply(zVar);
        }
    }

    /* renamed from: O.t$b */
    static abstract class b {
        b() {
        }

        static C4691a d(int i10, int i11, c.a<Void> aVar) {
            return new C4691a(i10, i11, aVar);
        }

        /* access modifiers changed from: package-private */
        public abstract c.a<Void> a();

        /* access modifiers changed from: package-private */
        public abstract int b();

        /* access modifiers changed from: package-private */
        public abstract int c();
    }

    C4709t(C4417z zVar) {
        this(zVar, Collections.emptyMap());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(G0 g02, G0.h hVar) {
        d.e eVar = d.e.DEFAULT;
        if (g02.n().d() && hVar.e()) {
            eVar = d.e.YUV;
        }
        this.f9640a.o(eVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void B(G0 g02, SurfaceTexture surfaceTexture, Surface surface, G0.g gVar) {
        g02.k();
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
        surfaceTexture.release();
        surface.release();
        this.f9648i--;
        q();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void C(G0 g02) {
        this.f9648i++;
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f9640a.g());
        surfaceTexture.setDefaultBufferSize(g02.p().getWidth(), g02.p().getHeight());
        Surface surface = new Surface(surfaceTexture);
        g02.E(this.f9642c, new C4706p(this, g02));
        g02.D(surface, this.f9642c, new C4707q(this, g02, surfaceTexture, surface));
        surfaceTexture.setOnFrameAvailableListener(this, this.f9643d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void D(v0 v0Var, v0.b bVar) {
        v0Var.close();
        Surface remove = this.f9647h.remove(v0Var);
        if (remove != null) {
            this.f9640a.r(remove);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(v0 v0Var) {
        Surface i32 = v0Var.i3(this.f9642c, new C4705o(this, v0Var));
        this.f9640a.j(i32);
        this.f9647h.put(v0Var, i32);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.f9649j = true;
        q();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(b bVar) {
        this.f9650k.add(bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object I(int i10, int i11, c.a aVar) {
        s(new C4698h(this, b.d(i10, i11, aVar)), new C4699i(aVar));
        return "DefaultSurfaceProcessor#snapshot";
    }

    private void J(C16795B<Surface, Size, float[]> b10) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (!this.f9650k.isEmpty()) {
            if (b10 == null) {
                t(new Exception("Failed to snapshot: no JPEG Surface."));
                return;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                Iterator<b> it = this.f9650k.iterator();
                int i10 = -1;
                int i11 = -1;
                Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    b next = it.next();
                    if (i10 != next.c() || bitmap == null) {
                        i10 = next.c();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = u(b10.e(), b10.f(), i10);
                        i11 = -1;
                    }
                    if (i11 != next.b()) {
                        byteArrayOutputStream.reset();
                        i11 = next.b();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                    }
                    Objects.requireNonNull(bArr);
                    ImageProcessingUtil.q(b10.d(), bArr);
                    next.a().c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
                return;
            } catch (IOException e10) {
                t(e10);
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            return;
        }
        throw th;
    }

    private void q() {
        if (this.f9649j && this.f9648i == 0) {
            for (v0 close : this.f9647h.keySet()) {
                close.close();
            }
            for (b a10 : this.f9650k) {
                a10.a().f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f9647h.clear();
            this.f9640a.k();
            this.f9641b.quit();
        }
    }

    private void r(Runnable runnable) {
        s(runnable, new C4695e());
    }

    private void s(Runnable runnable, Runnable runnable2) {
        try {
            this.f9642c.execute(new C4696f(this, runnable2, runnable));
        } catch (RejectedExecutionException e10) {
            C4391e0.m("DefaultSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    private void t(Throwable th2) {
        for (b a10 : this.f9650k) {
            a10.a().f(th2);
        }
        this.f9650k.clear();
    }

    private Bitmap u(Size size, float[] fArr, int i10) {
        float[] fArr2 = (float[]) fArr.clone();
        m.c(fArr2, (float) i10, 0.5f, 0.5f);
        m.d(fArr2, 0.5f);
        return this.f9640a.p(q.q(size, i10), fArr2);
    }

    private void v(C4417z zVar, Map<d.e, C> map) {
        try {
            c.a(new C4694d(this, zVar, map)).get();
        } catch (InterruptedException | ExecutionException e10) {
            e = e10;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void w() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(Runnable runnable, Runnable runnable2) {
        if (this.f9649j) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object y(C4417z zVar, Map map, c.a aVar) {
        r(new r(this, zVar, map, aVar));
        return "Init GlRenderer";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z(C4417z zVar, Map map, c.a aVar) {
        try {
            this.f9640a.h(zVar, map);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    public void a(v0 v0Var) {
        if (this.f9644e.get()) {
            v0Var.close();
            return;
        }
        C4700j jVar = new C4700j(this, v0Var);
        Objects.requireNonNull(v0Var);
        s(jVar, new C4701k(v0Var));
    }

    public C10101e<Void> b(int i10, int i11) {
        return n.B(c.a(new C4697g(this, i10, i11)));
    }

    public void c(G0 g02) {
        if (this.f9644e.get()) {
            g02.G();
            return;
        }
        C4702l lVar = new C4702l(this, g02);
        Objects.requireNonNull(g02);
        s(lVar, new C4703m(g02));
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (!this.f9644e.get()) {
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(this.f9645f);
            C16795B b10 = null;
            for (Map.Entry next : this.f9647h.entrySet()) {
                Surface surface = (Surface) next.getValue();
                v0 v0Var = (v0) next.getKey();
                v0Var.G1(this.f9646g, this.f9645f);
                if (v0Var.getFormat() == 34) {
                    try {
                        this.f9640a.n(surfaceTexture.getTimestamp(), this.f9646g, surface);
                    } catch (RuntimeException e10) {
                        C4391e0.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e10);
                    }
                } else {
                    boolean z10 = false;
                    i.j(v0Var.getFormat() == 256, "Unsupported format: " + v0Var.getFormat());
                    if (b10 == null) {
                        z10 = true;
                    }
                    i.j(z10, "Only one JPEG output is supported.");
                    b10 = new C16795B(surface, v0Var.a(), (float[]) this.f9646g.clone());
                }
            }
            try {
                J(b10);
            } catch (RuntimeException e11) {
                t(e11);
            }
        }
    }

    public void release() {
        if (!this.f9644e.getAndSet(true)) {
            r(new C4704n(this));
        }
    }

    C4709t(C4417z zVar, Map<d.e, C> map) {
        this.f9644e = new AtomicBoolean(false);
        this.f9645f = new float[16];
        this.f9646g = new float[16];
        this.f9647h = new LinkedHashMap();
        this.f9648i = 0;
        this.f9649j = false;
        this.f9650k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f9641b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f9643d = handler;
        this.f9642c = H.a.e(handler);
        this.f9640a = new C4715z();
        try {
            v(zVar, map);
        } catch (RuntimeException e10) {
            release();
            throw e10;
        }
    }
}
