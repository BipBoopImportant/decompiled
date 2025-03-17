package G3;

import A3.v1;
import C3.C6421l;
import C3.t;
import C3.u;
import G3.C6479C;
import G3.J;
import G3.O;
import G3.U;
import J3.C6569b;
import J3.i;
import J3.j;
import K3.C6579a;
import android.net.Uri;
import android.os.Looper;
import com.google.ar.core.ImageMetadata;
import jb.r;
import q3.J;
import q3.w;
import t3.C5950a;
import t3.N;
import w3.C;
import w3.g;

public final class V extends C6481a implements U.c {

    /* renamed from: h  reason: collision with root package name */
    private final g.a f35750h;

    /* renamed from: i  reason: collision with root package name */
    private final O.a f35751i;

    /* renamed from: j  reason: collision with root package name */
    private final u f35752j;

    /* renamed from: k  reason: collision with root package name */
    private final j f35753k;

    /* renamed from: l  reason: collision with root package name */
    private final int f35754l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f35755m;

    /* renamed from: n  reason: collision with root package name */
    private final r<C6579a> f35756n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f35757o;

    /* renamed from: p  reason: collision with root package name */
    private long f35758p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f35759q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f35760r;

    /* renamed from: s  reason: collision with root package name */
    private C f35761s;

    /* renamed from: t  reason: collision with root package name */
    private w f35762t;

    class a extends C6501v {
        a(J j10) {
            super(j10);
        }

        public J.b g(int i10, J.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f27907f = true;
            return bVar;
        }

        public J.c o(int i10, J.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f27935k = true;
            return cVar;
        }
    }

    public static final class b implements K {

        /* renamed from: c  reason: collision with root package name */
        private final g.a f35764c;

        /* renamed from: d  reason: collision with root package name */
        private O.a f35765d;

        /* renamed from: e  reason: collision with root package name */
        private C3.w f35766e;

        /* renamed from: f  reason: collision with root package name */
        private j f35767f;

        /* renamed from: g  reason: collision with root package name */
        private int f35768g;

        /* renamed from: h  reason: collision with root package name */
        private r<C6579a> f35769h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f35770i;

        public b(g.a aVar, N3.u uVar) {
            this(aVar, (O.a) new W(uVar));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ O i(N3.u uVar, v1 v1Var) {
            return new C6483c(uVar);
        }

        /* renamed from: h */
        public V d(w wVar) {
            C5950a.e(wVar.f28319b);
            return new V(wVar, this.f35764c, this.f35765d, this.f35766e.a(wVar), this.f35767f, this.f35768g, this.f35770i, this.f35769h, (a) null);
        }

        /* renamed from: j */
        public b f(C3.w wVar) {
            this.f35766e = (C3.w) C5950a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        /* renamed from: k */
        public b c(j jVar) {
            this.f35767f = (j) C5950a.f(jVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        /* access modifiers changed from: package-private */
        public b l(boolean z10) {
            this.f35770i = z10;
            return this;
        }

        public b(g.a aVar, O.a aVar2) {
            this(aVar, aVar2, new C6421l(), new i(), ImageMetadata.SHADING_MODE);
        }

        public b(g.a aVar, O.a aVar2, C3.w wVar, j jVar, int i10) {
            this.f35764c = aVar;
            this.f35765d = aVar2;
            this.f35766e = wVar;
            this.f35767f = jVar;
            this.f35768g = i10;
        }
    }

    /* synthetic */ V(w wVar, g.a aVar, O.a aVar2, u uVar, j jVar, int i10, boolean z10, r rVar, a aVar3) {
        this(wVar, aVar, aVar2, uVar, jVar, i10, z10, rVar);
    }

    private w.h B() {
        return (w.h) C5950a.e(e().f28319b);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [G3.V$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void C() {
        /*
            r9 = this;
            G3.d0 r8 = new G3.d0
            long r1 = r9.f35758p
            boolean r3 = r9.f35759q
            boolean r5 = r9.f35760r
            r6 = 0
            q3.w r7 = r9.e()
            r4 = 0
            r0 = r8
            r0.<init>(r1, r3, r4, r5, r6, r7)
            boolean r0 = r9.f35757o
            if (r0 == 0) goto L_0x001c
            G3.V$a r0 = new G3.V$a
            r0.<init>(r8)
            r8 = r0
        L_0x001c:
            r9.z(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.V.C():void");
    }

    /* access modifiers changed from: protected */
    public void A() {
        this.f35752j.release();
    }

    public C6478B a(C6479C.b bVar, C6569b bVar2, long j10) {
        g a10 = this.f35750h.a();
        C c10 = this.f35761s;
        if (c10 != null) {
            a10.l(c10);
        }
        w.h B10 = B();
        Uri uri = B10.f28411a;
        O a11 = this.f35751i.a(w());
        u uVar = this.f35752j;
        t.a r10 = r(bVar);
        j jVar = this.f35753k;
        J.a t10 = t(bVar);
        String str = B10.f28415e;
        int i10 = this.f35754l;
        boolean z10 = this.f35755m;
        long P02 = N.P0(B10.f28419i);
        r<C6579a> rVar = this.f35756n;
        return new U(uri, a10, a11, uVar, r10, jVar, t10, this, bVar2, str, i10, z10, P02, rVar != null ? rVar.get() : null);
    }

    public synchronized w e() {
        return this.f35762t;
    }

    public void i(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f35758p;
        }
        if (this.f35757o || this.f35758p != j10 || this.f35759q != z10 || this.f35760r != z11) {
            this.f35758p = j10;
            this.f35759q = z10;
            this.f35760r = z11;
            this.f35757o = false;
            C();
        }
    }

    public void j() {
    }

    public synchronized void l(w wVar) {
        this.f35762t = wVar;
    }

    public void o(C6478B b10) {
        ((U) b10).h0();
    }

    /* access modifiers changed from: protected */
    public void y(C c10) {
        this.f35761s = c10;
        this.f35752j.h((Looper) C5950a.e(Looper.myLooper()), w());
        this.f35752j.d();
        C();
    }

    private V(w wVar, g.a aVar, O.a aVar2, u uVar, j jVar, int i10, boolean z10, r<C6579a> rVar) {
        this.f35762t = wVar;
        this.f35750h = aVar;
        this.f35751i = aVar2;
        this.f35752j = uVar;
        this.f35753k = jVar;
        this.f35754l = i10;
        this.f35755m = z10;
        this.f35757o = true;
        this.f35758p = -9223372036854775807L;
        this.f35756n = rVar;
    }
}
