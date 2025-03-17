package C;

import E.C4440x;
import E.C4441y;
import E.Z;
import E.f0;
import G.p;
import G.q;
import J.m;
import R.c;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.C5043q0;
import androidx.camera.core.impl.C5044r0;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.C5048t0;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.Z0;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import androidx.camera.core.n;
import java.io.File;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import ob.C10101e;

public final class U extends H0 {

    /* renamed from: C  reason: collision with root package name */
    public static final c f5271C = new c();

    /* renamed from: D  reason: collision with root package name */
    static final M.b f5272D = new M.b();

    /* renamed from: A  reason: collision with root package name */
    private X0.c f5273A;

    /* renamed from: B  reason: collision with root package name */
    private final C4440x f5274B = new a();

    /* renamed from: q  reason: collision with root package name */
    private final C5048t0.a f5275q = new P();

    /* renamed from: r  reason: collision with root package name */
    private final int f5276r;

    /* renamed from: s  reason: collision with root package name */
    private final AtomicReference<Integer> f5277s = new AtomicReference<>((Object) null);

    /* renamed from: t  reason: collision with root package name */
    private final int f5278t;

    /* renamed from: u  reason: collision with root package name */
    private int f5279u = -1;

    /* renamed from: v  reason: collision with root package name */
    private Rational f5280v = null;

    /* renamed from: w  reason: collision with root package name */
    private J.j f5281w;

    /* renamed from: x  reason: collision with root package name */
    X0.b f5282x;

    /* renamed from: y  reason: collision with root package name */
    private C4441y f5283y;

    /* renamed from: z  reason: collision with root package name */
    private Z f5284z;

    class a implements C4440x {
        a() {
        }

        public C10101e<Void> a(List<V> list) {
            return U.this.K0(list);
        }

        public void b() {
            U.this.C0();
        }

        public void c() {
            U.this.P0();
        }
    }

    public static final class b implements o1.a<U, C5043q0, b>, C5046s0.a<b> {

        /* renamed from: a  reason: collision with root package name */
        private final E0 f5286a;

        public b() {
            this(E0.b0());
        }

        public static b g(X x10) {
            return new b(E0.c0(x10));
        }

        public D0 a() {
            return this.f5286a;
        }

        public U f() {
            Integer num = (Integer) a().g(C5043q0.f16996M, null);
            if (num != null) {
                a().q(C5044r0.f17008l, num);
            } else if (U.v0(a())) {
                a().q(C5044r0.f17008l, 4101);
                a().q(C5044r0.f17009m, C4417z.f5464c);
            } else {
                a().q(C5044r0.f17008l, 256);
            }
            C5043q0 h10 = e();
            C5046s0.v(h10);
            U u10 = new U(h10);
            Size size = (Size) a().g(C5046s0.f17014r, null);
            if (size != null) {
                u10.E0(new Rational(size.getWidth(), size.getHeight()));
            }
            H2.i.h((Executor) a().g(J.h.f8773a, H.a.c()), "The IO executor can't be null");
            D0 a10 = a();
            X.a<Integer> aVar = C5043q0.f16994K;
            if (a10.b(aVar)) {
                Integer num2 = (Integer) a().a(aVar);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                } else if (num2.intValue() == 3 && a().g(C5043q0.f17003T, null) == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
            return u10;
        }

        /* renamed from: h */
        public C5043q0 e() {
            return new C5043q0(J0.Z(this.f5286a));
        }

        public b i(int i10) {
            a().q(C5043q0.f16993J, Integer.valueOf(i10));
            return this;
        }

        public b j(p1.b bVar) {
            a().q(o1.f16978F, bVar);
            return this;
        }

        public b k(C4417z zVar) {
            a().q(C5044r0.f17009m, zVar);
            return this;
        }

        public b l(Executor executor) {
            a().q(J.h.f8773a, executor);
            return this;
        }

        public b m(int i10) {
            a().q(C5043q0.f16997N, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: n */
        public b c(R.c cVar) {
            a().q(C5046s0.f17018v, cVar);
            return this;
        }

        public b o(int i10) {
            a().q(o1.f16974B, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        public b p(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().q(C5046s0.f17010n, Integer.valueOf(i10));
            return this;
        }

        public b q(Class<U> cls) {
            a().q(m.f8790c, cls);
            if (a().g(m.f8789b, null) == null) {
                r(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public b r(String str) {
            a().q(m.f8789b, str);
            return this;
        }

        @Deprecated
        /* renamed from: s */
        public b d(Size size) {
            a().q(C5046s0.f17014r, size);
            return this;
        }

        /* renamed from: t */
        public b b(int i10) {
            a().q(C5046s0.f17011o, Integer.valueOf(i10));
            return this;
        }

        private b(E0 e02) {
            this.f5286a = e02;
            Class cls = (Class) e02.g(m.f8790c, null);
            Class<U> cls2 = U.class;
            if (cls == null || cls.equals(cls2)) {
                j(p1.b.IMAGE_CAPTURE);
                q(cls2);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private static final R.c f5287a;

        /* renamed from: b  reason: collision with root package name */
        private static final C5043q0 f5288b;

        /* renamed from: c  reason: collision with root package name */
        private static final C4417z f5289c;

        static {
            R.c a10 = new c.a().d(R.a.f12169c).f(R.d.f12181c).a();
            f5287a = a10;
            C4417z zVar = C4417z.f5465d;
            f5289c = zVar;
            f5288b = new b().o(4).p(0).c(a10).m(0).k(zVar).e();
        }

        public C5043q0 a() {
            return f5288b;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5290a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5291b = false;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5292c;

        /* renamed from: d  reason: collision with root package name */
        private Location f5293d;

        public Location a() {
            return this.f5293d;
        }

        public boolean b() {
            return this.f5290a;
        }

        public boolean c() {
            return this.f5292c;
        }

        public String toString() {
            return "Metadata{mIsReversedHorizontal=" + this.f5290a + ", mIsReversedVertical=" + this.f5292c + ", mLocation=" + this.f5293d + "}";
        }
    }

    public static abstract class e {
        public void a(int i10) {
        }

        public void b() {
        }

        public abstract void c(n nVar);

        public abstract void d(V v10);

        public void e(Bitmap bitmap) {
        }
    }

    public interface f {
        void a(int i10) {
        }

        void b(Bitmap bitmap) {
        }

        void c() {
        }

        void d(h hVar);

        void e(V v10);
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final File f5294a;

        /* renamed from: b  reason: collision with root package name */
        private final ContentResolver f5295b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f5296c;

        /* renamed from: d  reason: collision with root package name */
        private final ContentValues f5297d;

        /* renamed from: e  reason: collision with root package name */
        private final OutputStream f5298e;

        /* renamed from: f  reason: collision with root package name */
        private final d f5299f;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private File f5300a;

            /* renamed from: b  reason: collision with root package name */
            private ContentResolver f5301b;

            /* renamed from: c  reason: collision with root package name */
            private Uri f5302c;

            /* renamed from: d  reason: collision with root package name */
            private ContentValues f5303d;

            /* renamed from: e  reason: collision with root package name */
            private OutputStream f5304e;

            /* renamed from: f  reason: collision with root package name */
            private d f5305f;

            public a(File file) {
                this.f5300a = file;
            }

            public g a() {
                return new g(this.f5300a, this.f5301b, this.f5302c, this.f5303d, this.f5304e, this.f5305f);
            }
        }

        g(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, d dVar) {
            this.f5294a = file;
            this.f5295b = contentResolver;
            this.f5296c = uri;
            this.f5297d = contentValues;
            this.f5298e = outputStream;
            this.f5299f = dVar == null ? new d() : dVar;
        }

        public ContentResolver a() {
            return this.f5295b;
        }

        public ContentValues b() {
            return this.f5297d;
        }

        public File c() {
            return this.f5294a;
        }

        public d d() {
            return this.f5299f;
        }

        public OutputStream e() {
            return this.f5298e;
        }

        public Uri f() {
            return this.f5296c;
        }

        public String toString() {
            return "OutputFileOptions{mFile=" + this.f5294a + ", mContentResolver=" + this.f5295b + ", mSaveCollection=" + this.f5296c + ", mContentValues=" + this.f5297d + ", mOutputStream=" + this.f5298e + ", mMetadata=" + this.f5299f + "}";
        }
    }

    public static class h {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f5306a;

        public h(Uri uri) {
            this.f5306a = uri;
        }
    }

    public interface i {
        void a(long j10, j jVar);

        void clear();
    }

    public interface j {
        void a();
    }

    U(C5043q0 q0Var) {
        super(q0Var);
        C5043q0 q0Var2 = (C5043q0) j();
        if (q0Var2.b(C5043q0.f16993J)) {
            this.f5276r = q0Var2.Y();
        } else {
            this.f5276r = 1;
        }
        this.f5278t = q0Var2.a0(0);
        this.f5281w = J.j.g(q0Var2.e0());
    }

    private void D0(Executor executor, e eVar, f fVar) {
        V v10 = new V(4, "Not bound to a valid Camera [" + this + "]", (Throwable) null);
        if (eVar != null) {
            eVar.d(v10);
        } else if (fVar != null) {
            fVar.e(v10);
        } else {
            throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
        }
    }

    private void H0() {
        I0(this.f5281w);
    }

    private void I0(i iVar) {
        h().m(iVar);
    }

    private void N0(Executor executor, e eVar, f fVar, g gVar) {
        p.a();
        if (n0() == 3 && this.f5281w.h() == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        Log.d("ImageCapture", "takePictureInternal");
        J g10 = g();
        if (g10 == null) {
            D0(executor, eVar, fVar);
            return;
        }
        Z z10 = this.f5284z;
        Objects.requireNonNull(z10);
        z10.j(f0.v(executor, eVar, fVar, gVar, s0(), v(), q(g10), o0(), m0(), this.f5282x.r()));
    }

    private void O0() {
        synchronized (this.f5277s) {
            try {
                if (this.f5277s.get() == null) {
                    h().h(n0());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void f0() {
        this.f5281w.f();
        Z z10 = this.f5284z;
        if (z10 != null) {
            z10.e();
        }
    }

    private void h0() {
        i0(false);
    }

    private void i0(boolean z10) {
        Z z11;
        Log.d("ImageCapture", "clearPipeline");
        p.a();
        X0.c cVar = this.f5273A;
        if (cVar != null) {
            cVar.b();
            this.f5273A = null;
        }
        C4441y yVar = this.f5283y;
        if (yVar != null) {
            yVar.a();
            this.f5283y = null;
        }
        if (!z10 && (z11 = this.f5284z) != null) {
            z11.e();
            this.f5284z = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.camera.core.impl.X0.b j0(java.lang.String r17, androidx.camera.core.impl.C5043q0 r18, androidx.camera.core.impl.c1 r19) {
        /*
            r16 = this;
            r0 = r16
            G.p.a()
            java.lang.String r1 = "createPipeline(cameraId: %s, streamSpec: %s)"
            r2 = r17
            r3 = r19
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String r2 = "ImageCapture"
            android.util.Log.d(r2, r1)
            android.util.Size r6 = r19.e()
            androidx.camera.core.impl.J r1 = r16.g()
            java.util.Objects.requireNonNull(r1)
            androidx.camera.core.impl.J r1 = (androidx.camera.core.impl.J) r1
            boolean r1 = r1.q()
            r2 = 1
            r8 = r1 ^ 1
            E.y r1 = r0.f5283y
            if (r1 == 0) goto L_0x0038
            H2.i.i(r8)
            E.y r1 = r0.f5283y
            r1.a()
        L_0x0038:
            androidx.camera.core.impl.o1 r1 = r16.j()
            androidx.camera.core.impl.X$a<java.lang.Boolean> r4 = androidx.camera.core.impl.C5043q0.f17005V
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.Object r1 = r1.g(r4, r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r4 = 35
            r5 = 0
            if (r1 == 0) goto L_0x00ec
            androidx.camera.core.impl.Z0 r1 = r16.r0()
            if (r1 == 0) goto L_0x00ec
            androidx.camera.core.impl.o1 r7 = r16.j()
            androidx.camera.core.impl.X$a<R.c> r9 = androidx.camera.core.impl.C5043q0.f17004U
            java.lang.Object r7 = r7.g(r9, r5)
            r9 = r7
            R.c r9 = (R.c) r9
            java.util.Map r1 = r1.i(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object r7 = r1.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x007b
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r10 = r7
            goto L_0x0088
        L_0x007b:
            r4 = 256(0x100, float:3.59E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r1.get(r7)
            java.util.List r1 = (java.util.List) r1
            r10 = r1
        L_0x0088:
            if (r10 == 0) goto L_0x00ec
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L_0x00ec
            if (r9 == 0) goto L_0x00e0
            G.d r1 = new G.d
            r1.<init>(r2)
            java.util.Collections.sort(r10, r1)
            androidx.camera.core.impl.J r1 = r16.g()
            androidx.camera.core.impl.F r2 = r1.d()
            android.graphics.Rect r2 = r2.g()
            androidx.camera.core.impl.I r1 = r1.j()
            android.util.Rational r13 = new android.util.Rational
            int r5 = r2.width()
            int r2 = r2.height()
            r13.<init>(r5, r2)
            int r12 = r16.t0()
            int r14 = r1.c()
            int r15 = r1.f()
            r11 = 0
            java.util.List r1 = J.k.p(r9, r10, r11, r12, r13, r14, r15)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x00d8
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            android.util.Size r1 = (android.util.Size) r1
        L_0x00d5:
            r9 = r1
            r10 = r4
            goto L_0x00ee
        L_0x00d8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The postview ResolutionSelector cannot select a valid size for the postview."
            r1.<init>(r2)
            throw r1
        L_0x00e0:
            G.d r1 = new G.d
            r1.<init>()
            java.lang.Object r1 = java.util.Collections.max(r10, r1)
            android.util.Size r1 = (android.util.Size) r1
            goto L_0x00d5
        L_0x00ec:
            r10 = r4
            r9 = r5
        L_0x00ee:
            E.y r1 = new E.y
            C.l r7 = r16.l()
            r4 = r1
            r5 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.f5283y = r1
            E.Z r1 = r0.f5284z
            if (r1 != 0) goto L_0x0109
            E.Z r1 = new E.Z
            E.x r2 = r0.f5274B
            r1.<init>(r2)
            r0.f5284z = r1
        L_0x0109:
            E.Z r1 = r0.f5284z
            E.y r2 = r0.f5283y
            r1.m(r2)
            E.y r1 = r0.f5283y
            android.util.Size r2 = r19.e()
            androidx.camera.core.impl.X0$b r1 = r1.f(r2)
            int r2 = r16.m0()
            r4 = 2
            if (r2 != r4) goto L_0x012e
            boolean r2 = r19.f()
            if (r2 != 0) goto L_0x012e
            androidx.camera.core.impl.F r2 = r16.h()
            r2.b(r1)
        L_0x012e:
            androidx.camera.core.impl.X r2 = r19.d()
            if (r2 == 0) goto L_0x013b
            androidx.camera.core.impl.X r2 = r19.d()
            r1.g(r2)
        L_0x013b:
            androidx.camera.core.impl.X0$c r2 = r0.f5273A
            if (r2 == 0) goto L_0x0142
            r2.b()
        L_0x0142:
            androidx.camera.core.impl.X0$c r2 = new androidx.camera.core.impl.X0$c
            C.Q r3 = new C.Q
            r3.<init>(r0)
            r2.<init>(r3)
            r0.f5273A = r2
            r1.t(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C.U.j0(java.lang.String, androidx.camera.core.impl.q0, androidx.camera.core.impl.c1):androidx.camera.core.impl.X0$b");
    }

    private int l0() {
        J g10 = g();
        if (g10 != null) {
            return g10.b().f();
        }
        return -1;
    }

    private int o0() {
        C5043q0 q0Var = (C5043q0) j();
        if (q0Var.b(C5043q0.f17002S)) {
            return q0Var.d0();
        }
        int i10 = this.f5276r;
        if (i10 == 0) {
            return 100;
        }
        if (i10 == 1 || i10 == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f5276r + " is invalid");
    }

    private Z0 r0() {
        return g().f().W((Z0) null);
    }

    private Rect s0() {
        Rect A10 = A();
        Size f10 = f();
        Objects.requireNonNull(f10);
        if (A10 != null) {
            return A10;
        }
        if (!N.b.i(this.f5280v)) {
            return new Rect(0, 0, f10.getWidth(), f10.getHeight());
        }
        J g10 = g();
        Objects.requireNonNull(g10);
        int q10 = q(g10);
        Rational rational = new Rational(this.f5280v.getDenominator(), this.f5280v.getNumerator());
        if (!q.i(q10)) {
            rational = this.f5280v;
        }
        Rect a10 = N.b.a(f10, rational);
        Objects.requireNonNull(a10);
        return a10;
    }

    private static boolean u0(List<Pair<Integer, Size[]>> list, int i10) {
        if (list == null) {
            return false;
        }
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean v0(D0 d02) {
        return Objects.equals(d02.g(C5043q0.f16997N, null), 1);
    }

    private boolean w0() {
        return (g() == null || g().f().W((Z0) null) == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x0(X0 x02, X0.g gVar) {
        if (g() != null) {
            this.f5284z.k();
            i0(true);
            X0.b j02 = j0(i(), (C5043q0) j(), (c1) H2.i.g(e()));
            this.f5282x = j02;
            X(F.a(new Object[]{j02.o()}));
            G();
            this.f5284z.l();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void y0(C5048t0 t0Var) {
        n b10;
        try {
            b10 = t0Var.b();
            Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + b10);
            if (b10 != null) {
                b10.close();
                return;
            }
            return;
        } catch (IllegalStateException e10) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e10);
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void z0(List list) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void C0() {
        synchronized (this.f5277s) {
            try {
                if (this.f5277s.get() == null) {
                    this.f5277s.set(Integer.valueOf(n0()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void E0(Rational rational) {
        this.f5280v = rational;
    }

    public void F0(int i10) {
        C4391e0.a("ImageCapture", "setFlashMode: flashMode = " + i10);
        if (!(i10 == 0 || i10 == 1 || i10 == 2)) {
            if (i10 != 3) {
                throw new IllegalArgumentException("Invalid flash mode: " + i10);
            } else if (this.f5281w.h() == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            } else if (!(g() == null || l0() == 0)) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        synchronized (this.f5277s) {
            this.f5279u = i10;
            O0();
        }
    }

    public void G0(i iVar) {
        this.f5281w = J.j.g(iVar);
        H0();
    }

    public void J() {
        H2.i.h(g(), "Attached camera cannot be null");
        if (n0() == 3 && l0() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    public void J0(int i10) {
        int t02 = t0();
        if (U(i10) && this.f5280v != null) {
            this.f5280v = N.b.g(Math.abs(G.c.b(i10) - G.c.b(t02)), this.f5280v);
        }
    }

    public void K() {
        C4391e0.a("ImageCapture", "onCameraControlReady");
        O0();
        H0();
    }

    /* access modifiers changed from: package-private */
    public C10101e<Void> K0(List<V> list) {
        p.a();
        return I.n.G(h().e(list, this.f5276r, this.f5278t), new T(), H.a.a());
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [C.A, androidx.camera.core.impl.o1$a<?, ?, ?>, androidx.camera.core.impl.o1$a] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.o1<?> L(androidx.camera.core.impl.I r5, androidx.camera.core.impl.o1.a<?, ?, ?> r6) {
        /*
            r4 = this;
            androidx.camera.core.impl.R0 r5 = r5.h()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk> r0 = androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk.class
            boolean r5 = r5.a(r0)
            if (r5 == 0) goto L_0x0034
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            androidx.camera.core.impl.D0 r0 = r6.a()
            androidx.camera.core.impl.X$a<java.lang.Boolean> r1 = androidx.camera.core.impl.C5043q0.f17000Q
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.g(r1, r2)
            boolean r5 = r5.equals(r0)
            java.lang.String r0 = "ImageCapture"
            if (r5 == 0) goto L_0x0028
            java.lang.String r5 = "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."
            C.C4391e0.l(r0, r5)
            goto L_0x0034
        L_0x0028:
            java.lang.String r5 = "Requesting software JPEG due to device quirk."
            C.C4391e0.e(r0, r5)
            androidx.camera.core.impl.D0 r5 = r6.a()
            r5.q(r1, r2)
        L_0x0034:
            androidx.camera.core.impl.D0 r5 = r6.a()
            boolean r5 = r4.k0(r5)
            androidx.camera.core.impl.D0 r0 = r6.a()
            androidx.camera.core.impl.X$a<java.lang.Integer> r1 = androidx.camera.core.impl.C5043q0.f16996M
            r2 = 0
            java.lang.Object r0 = r0.g(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 35
            r3 = 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x007a
            boolean r2 = r4.w0()
            if (r2 == 0) goto L_0x005e
            int r2 = r0.intValue()
            if (r2 != r3) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r2 = 0
            goto L_0x005f
        L_0x005e:
            r2 = 1
        L_0x005f:
            java.lang.String r3 = "Cannot set non-JPEG buffer format with Extensions enabled."
            H2.i.b(r2, r3)
            androidx.camera.core.impl.D0 r2 = r6.a()
            androidx.camera.core.impl.X$a<java.lang.Integer> r3 = androidx.camera.core.impl.C5044r0.f17008l
            if (r5 == 0) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            int r1 = r0.intValue()
        L_0x0071:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r2.q(r3, r5)
            goto L_0x00f2
        L_0x007a:
            androidx.camera.core.impl.D0 r0 = r6.a()
            boolean r0 = v0(r0)
            if (r0 == 0) goto L_0x009f
            androidx.camera.core.impl.D0 r5 = r6.a()
            androidx.camera.core.impl.X$a<java.lang.Integer> r0 = androidx.camera.core.impl.C5044r0.f17008l
            r1 = 4101(0x1005, float:5.747E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.q(r0, r1)
            androidx.camera.core.impl.D0 r5 = r6.a()
            androidx.camera.core.impl.X$a<C.z> r0 = androidx.camera.core.impl.C5044r0.f17009m
            C.z r1 = C.C4417z.f5464c
            r5.q(r0, r1)
            goto L_0x00f2
        L_0x009f:
            if (r5 == 0) goto L_0x00af
            androidx.camera.core.impl.D0 r5 = r6.a()
            androidx.camera.core.impl.X$a<java.lang.Integer> r0 = androidx.camera.core.impl.C5044r0.f17008l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.q(r0, r1)
            goto L_0x00f2
        L_0x00af:
            androidx.camera.core.impl.D0 r5 = r6.a()
            androidx.camera.core.impl.X$a<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> r0 = androidx.camera.core.impl.C5046s0.f17017u
            java.lang.Object r5 = r5.g(r0, r2)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x00cb
            androidx.camera.core.impl.D0 r5 = r6.a()
            androidx.camera.core.impl.X$a<java.lang.Integer> r0 = androidx.camera.core.impl.C5044r0.f17008l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r5.q(r0, r1)
            goto L_0x00f2
        L_0x00cb:
            boolean r0 = u0(r5, r3)
            if (r0 == 0) goto L_0x00df
            androidx.camera.core.impl.D0 r5 = r6.a()
            androidx.camera.core.impl.X$a<java.lang.Integer> r0 = androidx.camera.core.impl.C5044r0.f17008l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r5.q(r0, r1)
            goto L_0x00f2
        L_0x00df:
            boolean r5 = u0(r5, r1)
            if (r5 == 0) goto L_0x00f2
            androidx.camera.core.impl.D0 r5 = r6.a()
            androidx.camera.core.impl.X$a<java.lang.Integer> r0 = androidx.camera.core.impl.C5044r0.f17008l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.q(r0, r1)
        L_0x00f2:
            androidx.camera.core.impl.o1 r5 = r6.e()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C.U.L(androidx.camera.core.impl.I, androidx.camera.core.impl.o1$a):androidx.camera.core.impl.o1");
    }

    /* renamed from: L0 */
    public void B0(g gVar, Executor executor, f fVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            H.a.d().execute(new S(this, gVar, executor, fVar));
        } else {
            N0(executor, (e) null, fVar, gVar);
        }
    }

    /* renamed from: M0 */
    public void A0(Executor executor, e eVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            H.a.d().execute(new O(this, executor, eVar));
        } else {
            N0(executor, eVar, (f) null, (g) null);
        }
    }

    public void N() {
        f0();
    }

    /* access modifiers changed from: protected */
    public c1 O(X x10) {
        this.f5282x.g(x10);
        X(F.a(new Object[]{this.f5282x.o()}));
        return e().g().d(x10).a();
    }

    /* access modifiers changed from: protected */
    public c1 P(c1 c1Var, c1 c1Var2) {
        X0.b j02 = j0(i(), (C5043q0) j(), c1Var);
        this.f5282x = j02;
        X(F.a(new Object[]{j02.o()}));
        E();
        return c1Var;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void P0() {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = r3.f5277s
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r1 = r3.f5277s     // Catch:{ all -> 0x0010 }
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)     // Catch:{ all -> 0x0010 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0010 }
            if (r1 != 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x0010:
            r1 = move-exception
            goto L_0x0021
        L_0x0012:
            int r1 = r1.intValue()     // Catch:{ all -> 0x0010 }
            int r2 = r3.n0()     // Catch:{ all -> 0x0010 }
            if (r1 == r2) goto L_0x001f
            r3.O0()     // Catch:{ all -> 0x0010 }
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C.U.P0():void");
    }

    public void Q() {
        f0();
        h0();
        I0((i) null);
    }

    public o1<?> k(boolean z10, p1 p1Var) {
        c cVar = f5271C;
        X a10 = p1Var.a(cVar.a().getCaptureType(), m0());
        if (z10) {
            a10 = X.O(a10, cVar.a());
        }
        if (a10 == null) {
            return null;
        }
        return z(a10).e();
    }

    /* access modifiers changed from: package-private */
    public boolean k0(D0 d02) {
        boolean z10;
        Boolean bool = Boolean.TRUE;
        X.a<Boolean> aVar = C5043q0.f17000Q;
        Boolean bool2 = Boolean.FALSE;
        boolean z11 = false;
        if (bool.equals(d02.g(aVar, bool2))) {
            if (w0()) {
                C4391e0.l("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z10 = false;
            } else {
                z10 = true;
            }
            Integer num = (Integer) d02.g(C5043q0.f16996M, null);
            if (num == null || num.intValue() == 256) {
                z11 = z10;
            } else {
                C4391e0.l("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z11) {
                C4391e0.l("ImageCapture", "Unable to support software JPEG. Disabling.");
                d02.q(aVar, bool2);
            }
        }
        return z11;
    }

    public int m0() {
        return this.f5276r;
    }

    public int n0() {
        int i10;
        synchronized (this.f5277s) {
            i10 = this.f5279u;
            if (i10 == -1) {
                i10 = ((C5043q0) j()).Z(2);
            }
        }
        return i10;
    }

    public q0 p0() {
        return q0();
    }

    /* access modifiers changed from: protected */
    public q0 q0() {
        J g10 = g();
        Size f10 = f();
        if (g10 == null || f10 == null) {
            return null;
        }
        Rect A10 = A();
        Rational rational = this.f5280v;
        if (A10 == null) {
            A10 = rational != null ? N.b.a(f10, rational) : new Rect(0, 0, f10.getWidth(), f10.getHeight());
        }
        int q10 = q(g10);
        Objects.requireNonNull(A10);
        return new q0(f10, A10, q10);
    }

    public int t0() {
        return y();
    }

    public String toString() {
        return "ImageCapture:" + o();
    }

    public Set<Integer> x() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public o1.a<?, ?, ?> z(X x10) {
        return b.g(x10);
    }
}
