package androidx.camera.core.impl;

import C.C4391e0;
import I.n;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.concurrent.atomic.AtomicInteger;
import ob.C10101e;

/* renamed from: androidx.camera.core.impl.e0  reason: case insensitive filesystem */
public abstract class C5019e0 {

    /* renamed from: k  reason: collision with root package name */
    public static final Size f16877k = new Size(0, 0);

    /* renamed from: l  reason: collision with root package name */
    private static final boolean f16878l = C4391e0.f("DeferrableSurface");

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicInteger f16879m = new AtomicInteger(0);

    /* renamed from: n  reason: collision with root package name */
    private static final AtomicInteger f16880n = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    private final Object f16881a;

    /* renamed from: b  reason: collision with root package name */
    private int f16882b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16883c;

    /* renamed from: d  reason: collision with root package name */
    private c.a<Void> f16884d;

    /* renamed from: e  reason: collision with root package name */
    private final C10101e<Void> f16885e;

    /* renamed from: f  reason: collision with root package name */
    private c.a<Void> f16886f;

    /* renamed from: g  reason: collision with root package name */
    private final C10101e<Void> f16887g;

    /* renamed from: h  reason: collision with root package name */
    private final Size f16888h;

    /* renamed from: i  reason: collision with root package name */
    private final int f16889i;

    /* renamed from: j  reason: collision with root package name */
    Class<?> f16890j;

    /* renamed from: androidx.camera.core.impl.e0$a */
    public static final class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        C5019e0 f16891a;

        public a(String str, C5019e0 e0Var) {
            super(str);
            this.f16891a = e0Var;
        }

        public C5019e0 a() {
            return this.f16891a;
        }
    }

    /* renamed from: androidx.camera.core.impl.e0$b */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public C5019e0() {
        this(f16877k, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object n(c.a aVar) {
        synchronized (this.f16881a) {
            this.f16884d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object o(c.a aVar) {
        synchronized (this.f16881a) {
            this.f16886f = aVar;
        }
        return "DeferrableSurface-close(" + this + ")";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p(String str) {
        try {
            this.f16885e.get();
            q("Surface terminated", f16880n.decrementAndGet(), f16879m.get());
        } catch (Exception e10) {
            C4391e0.c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f16881a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", new Object[]{this, Boolean.valueOf(this.f16883c), Integer.valueOf(this.f16882b)}), e10);
            }
        }
    }

    private void q(String str, int i10, int i11) {
        if (!f16878l && C4391e0.f("DeferrableSurface")) {
            C4391e0.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C4391e0.a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    public void d() {
        c.a<Void> aVar;
        synchronized (this.f16881a) {
            try {
                if (!this.f16883c) {
                    this.f16883c = true;
                    this.f16886f.c(null);
                    if (this.f16882b == 0) {
                        aVar = this.f16884d;
                        this.f16884d = null;
                    } else {
                        aVar = null;
                    }
                    if (C4391e0.f("DeferrableSurface")) {
                        C4391e0.a("DeferrableSurface", "surface closed,  useCount=" + this.f16882b + " closed=true " + this);
                    }
                } else {
                    aVar = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void e() {
        c.a<Void> aVar;
        synchronized (this.f16881a) {
            try {
                int i10 = this.f16882b;
                if (i10 != 0) {
                    int i11 = i10 - 1;
                    this.f16882b = i11;
                    if (i11 != 0 || !this.f16883c) {
                        aVar = null;
                    } else {
                        aVar = this.f16884d;
                        this.f16884d = null;
                    }
                    if (C4391e0.f("DeferrableSurface")) {
                        C4391e0.a("DeferrableSurface", "use count-1,  useCount=" + this.f16882b + " closed=" + this.f16883c + " " + this);
                        if (this.f16882b == 0) {
                            q("Surface no longer in use", f16880n.get(), f16879m.decrementAndGet());
                        }
                    }
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public C10101e<Void> f() {
        return n.B(this.f16887g);
    }

    public Class<?> g() {
        return this.f16890j;
    }

    public Size h() {
        return this.f16888h;
    }

    public int i() {
        return this.f16889i;
    }

    public final C10101e<Surface> j() {
        synchronized (this.f16881a) {
            try {
                if (this.f16883c) {
                    C10101e<Surface> n10 = n.n(new a("DeferrableSurface already closed.", this));
                    return n10;
                }
                C10101e<Surface> r10 = r();
                return r10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C10101e<Void> k() {
        return n.B(this.f16885e);
    }

    public void l() {
        synchronized (this.f16881a) {
            try {
                int i10 = this.f16882b;
                if (i10 == 0) {
                    if (this.f16883c) {
                        throw new a("Cannot begin use on a closed surface.", this);
                    }
                }
                this.f16882b = i10 + 1;
                if (C4391e0.f("DeferrableSurface")) {
                    if (this.f16882b == 1) {
                        q("New surface in use", f16880n.get(), f16879m.incrementAndGet());
                    }
                    C4391e0.a("DeferrableSurface", "use count+1, useCount=" + this.f16882b + " " + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f16881a) {
            z10 = this.f16883c;
        }
        return z10;
    }

    /* access modifiers changed from: protected */
    public abstract C10101e<Surface> r();

    public void s(Class<?> cls) {
        this.f16890j = cls;
    }

    public C5019e0(Size size, int i10) {
        this.f16881a = new Object();
        this.f16882b = 0;
        this.f16883c = false;
        this.f16888h = size;
        this.f16889i = i10;
        C10101e<Void> a10 = c.a(new C5013b0(this));
        this.f16885e = a10;
        this.f16887g = c.a(new C5015c0(this));
        if (C4391e0.f("DeferrableSurface")) {
            q("Surface created", f16880n.incrementAndGet(), f16879m.get());
            a10.a(new C5017d0(this, Log.getStackTraceString(new Exception())), H.a.a());
        }
    }
}
