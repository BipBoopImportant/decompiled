package U0;

import U0.I;
import XH.C16807N;
import c1.d;
import g1.C5326G;
import g1.C5327H;
import g1.C5328I;
import g1.C5342k;
import g1.C5347p;
import j0.K;
import j0.Q;
import j0.S;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001.B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJA\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000*8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"LU0/H;", "T", "Lg1/H;", "LU0/I;", "Lkotlin/Function0;", "calculation", "LU0/o1;", "policy", "<init>", "(LnI/a;LU0/o1;)V", "LU0/H$a;", "readable", "Lg1/k;", "snapshot", "", "forceDependencyReads", "u", "(LU0/H$a;Lg1/k;ZLnI/a;)LU0/H$a;", "", "v", "()Ljava/lang/String;", "Lg1/I;", "t", "(Lg1/k;)Lg1/I;", "value", "LXH/N;", "p", "(Lg1/I;)V", "toString", "b", "LnI/a;", "c", "LU0/o1;", "()LU0/o1;", "d", "LU0/H$a;", "first", "m", "()Lg1/I;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "LU0/I$a;", "r", "()LU0/I$a;", "currentRecord", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class H<T> extends C5327H implements I<T> {

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<T> f13753b;

    /* renamed from: c  reason: collision with root package name */
    private final o1<T> f13754c;

    /* renamed from: d  reason: collision with root package name */
    private a<T> f13755d = new a<>();

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u0000 6*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u00014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00132\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR(\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0016\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u0014\u00105\u001a\u00028\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b4\u0010,¨\u00067"}, d2 = {"LU0/H$a;", "T", "Lg1/I;", "LU0/I$a;", "<init>", "()V", "value", "LXH/N;", "c", "(Lg1/I;)V", "d", "()Lg1/I;", "LU0/I;", "derivedState", "Lg1/k;", "snapshot", "", "k", "(LU0/I;Lg1/k;)Z", "", "l", "(LU0/I;Lg1/k;)I", "I", "getValidSnapshotId", "()I", "p", "(I)V", "validSnapshotId", "getValidSnapshotWriteCount", "q", "validSnapshotWriteCount", "Lj0/Q;", "Lg1/G;", "e", "Lj0/Q;", "b", "()Lj0/Q;", "m", "(Lj0/Q;)V", "dependencies", "", "f", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "n", "(Ljava/lang/Object;)V", "result", "g", "getResultHash", "o", "resultHash", "a", "currentValue", "h", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> extends C5328I implements I.a<T> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0202a f13756h = new C0202a((DefaultConstructorMarker) null);

        /* renamed from: i  reason: collision with root package name */
        public static final int f13757i = 8;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public static final Object f13758j = new Object();

        /* renamed from: c  reason: collision with root package name */
        private int f13759c;

        /* renamed from: d  reason: collision with root package name */
        private int f13760d;

        /* renamed from: e  reason: collision with root package name */
        private Q<C5326G> f13761e = S.a();

        /* renamed from: f  reason: collision with root package name */
        private Object f13762f = f13758j;

        /* renamed from: g  reason: collision with root package name */
        private int f13763g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LU0/H$a$a;", "", "<init>", "()V", "Unset", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: U0.H$a$a  reason: collision with other inner class name */
        public static final class C0202a {
            public /* synthetic */ C0202a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Object a() {
                return a.f13758j;
            }

            private C0202a() {
            }
        }

        public T a() {
            return this.f13762f;
        }

        public Q<C5326G> b() {
            return this.f13761e;
        }

        public void c(C5328I i10) {
            C17542s.h(i10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) i10;
            m(aVar.b());
            this.f13762f = aVar.f13762f;
            this.f13763g = aVar.f13763g;
        }

        public C5328I d() {
            return new a();
        }

        public final Object j() {
            return this.f13762f;
        }

        public final boolean k(I<?> i10, C5342k kVar) {
            boolean z10;
            boolean z11;
            synchronized (C5347p.I()) {
                z10 = true;
                z11 = (this.f13759c == kVar.f() && this.f13760d == kVar.j()) ? false : true;
            }
            if (this.f13762f == f13758j || (z11 && this.f13763g != l(i10, kVar))) {
                z10 = false;
            }
            if (z10 && z11) {
                synchronized (C5347p.I()) {
                    this.f13759c = kVar.f();
                    this.f13760d = kVar.j();
                    C16807N n10 = C16807N.f139792a;
                }
            }
            return z10;
        }

        /* JADX INFO: finally extract failed */
        public final int l(I<?> i10, C5342k kVar) {
            Q<C5326G> b10;
            int i11;
            int i12;
            I<?> i13 = i10;
            C5342k kVar2 = kVar;
            synchronized (C5347p.I()) {
                try {
                    b10 = b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            char c10 = 7;
            if (!b10.h()) {
                return 7;
            }
            W0.b<J> c11 = p1.c();
            int r10 = c11.r();
            if (r10 > 0) {
                Object[] q10 = c11.q();
                int i14 = 0;
                do {
                    ((J) q10[i14]).a(i13);
                    i14++;
                } while (i14 < r10);
            }
            try {
                Object[] objArr = b10.f24552b;
                int[] iArr = b10.f24553c;
                long[] jArr = b10.f24551a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 7;
                    int i16 = 0;
                    while (true) {
                        long j10 = jArr[i16];
                        if ((((~j10) << c10) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                            int i17 = 8;
                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j10 & 255) < 128) {
                                    int i20 = (i16 << 3) + i19;
                                    C5326G g10 = (C5326G) objArr[i20];
                                    if (iArr[i20] == 1) {
                                        C5328I t10 = g10 instanceof H ? ((H) g10).t(kVar2) : C5347p.G(g10.m(), kVar2);
                                        i15 = (((i15 * 31) + C4863c.c(t10)) * 31) + t10.f();
                                    }
                                    i12 = 8;
                                } else {
                                    i12 = i17;
                                }
                                j10 >>= i12;
                                i19++;
                                i17 = i12;
                            }
                            if (i18 != i17) {
                                break;
                            }
                        }
                        if (i16 == length) {
                            break;
                        }
                        i16++;
                        c10 = 7;
                    }
                    i11 = i15;
                } else {
                    i11 = 7;
                }
                C16807N n10 = C16807N.f139792a;
                int r11 = c11.r();
                if (r11 <= 0) {
                    return i11;
                }
                Object[] q11 = c11.q();
                int i21 = 0;
                do {
                    ((J) q11[i21]).b(i13);
                    i21++;
                } while (i21 < r11);
                return i11;
            } catch (Throwable th3) {
                int r12 = c11.r();
                if (r12 > 0) {
                    Object[] q12 = c11.q();
                    int i22 = 0;
                    do {
                        ((J) q12[i22]).b(i13);
                        i22++;
                    } while (i22 < r12);
                }
                throw th3;
            }
        }

        public void m(Q<C5326G> q10) {
            this.f13761e = q10;
        }

        public final void n(Object obj) {
            this.f13762f = obj;
        }

        public final void o(int i10) {
            this.f13763g = i10;
        }

        public final void p(int i10) {
            this.f13759c = i10;
        }

        public final void q(int i10) {
            this.f13760d = i10;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Object, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H<T> f13764c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f13765d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K<C5326G> f13766e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f13767f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(H<T> h10, d dVar, K<C5326G> k10, int i10) {
            super(1);
            this.f13764c = h10;
            this.f13765d = dVar;
            this.f13766e = k10;
            this.f13767f = i10;
        }

        public final void a(Object obj) {
            if (obj == this.f13764c) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            } else if (obj instanceof C5326G) {
                int a10 = this.f13765d.a();
                K<C5326G> k10 = this.f13766e;
                k10.s(obj, Math.min(a10 - this.f13767f, k10.e(obj, Integer.MAX_VALUE)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    public H(C17631a<? extends T> aVar, o1<T> o1Var) {
        this.f13753b = aVar;
        this.f13754c = o1Var;
    }

    private final a<T> u(a<T> aVar, C5342k kVar, boolean z10, C17631a<? extends T> aVar2) {
        C5342k.a aVar3;
        o1 c10;
        int i10;
        int i11;
        a<T> aVar4 = aVar;
        int i12 = 1;
        if (aVar4.k(this, kVar)) {
            if (z10) {
                W0.b<J> c11 = p1.c();
                int r10 = c11.r();
                if (r10 > 0) {
                    Object[] q10 = c11.q();
                    int i13 = 0;
                    do {
                        ((J) q10[i13]).a(this);
                        i13++;
                    } while (i13 < r10);
                }
                try {
                    Q<C5326G> b10 = aVar.b();
                    d dVar = (d) q1.f14094a.a();
                    if (dVar == null) {
                        dVar = new d(0);
                        q1.f14094a.b(dVar);
                    }
                    int a10 = dVar.a();
                    Object[] objArr = b10.f24552b;
                    int[] iArr = b10.f24553c;
                    long[] jArr = b10.f24551a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j10 = jArr[i14];
                            long[] jArr2 = jArr;
                            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                int i15 = 8;
                                int i16 = 8 - ((~(i14 - length)) >>> 31);
                                int i17 = 0;
                                while (i17 < i16) {
                                    if ((j10 & 255) < 128) {
                                        int i18 = (i14 << 3) + i17;
                                        C5326G g10 = (C5326G) objArr[i18];
                                        dVar.b(a10 + iArr[i18]);
                                        C17642l<Object, C16807N> h10 = kVar.h();
                                        if (h10 != null) {
                                            h10.invoke(g10);
                                        }
                                        i11 = 8;
                                    } else {
                                        i11 = i15;
                                    }
                                    j10 >>= i11;
                                    i17++;
                                    i15 = i11;
                                    i12 = 1;
                                }
                                int i19 = i15;
                                i10 = i12;
                                if (i16 != i19) {
                                    break;
                                }
                            } else {
                                i10 = i12;
                            }
                            if (i14 == length) {
                                break;
                            }
                            i14 += i10;
                            i12 = i10;
                            jArr = jArr2;
                        }
                    }
                    dVar.b(a10);
                    C16807N n10 = C16807N.f139792a;
                    int r11 = c11.r();
                    if (r11 > 0) {
                        Object[] q11 = c11.q();
                        int i20 = 0;
                        do {
                            ((J) q11[i20]).b(this);
                            i20++;
                        } while (i20 < r11);
                    }
                } catch (Throwable th2) {
                    int r12 = c11.r();
                    if (r12 > 0) {
                        Object[] q12 = c11.q();
                        int i21 = 0;
                        do {
                            ((J) q12[i21]).b(this);
                            i21++;
                        } while (i21 < r12);
                    }
                    throw th2;
                }
            }
            return aVar4;
        }
        int i22 = 0;
        K k10 = new K(0, 1, (DefaultConstructorMarker) null);
        d dVar2 = (d) q1.f14094a.a();
        if (dVar2 == null) {
            dVar2 = new d(0);
            q1.f14094a.b(dVar2);
        }
        int a11 = dVar2.a();
        W0.b<J> c12 = p1.c();
        int r13 = c12.r();
        if (r13 > 0) {
            Object[] q13 = c12.q();
            int i23 = 0;
            while (true) {
                ((J) q13[i23]).a(this);
                int i24 = i23 + 1;
                if (i24 >= r13) {
                    break;
                }
                i23 = i24;
            }
        }
        try {
            dVar2.b(a11 + 1);
            Object h11 = C5342k.f23395e.h(new b(this, dVar2, k10, a11), (C17642l<Object, C16807N>) null, aVar2);
            dVar2.b(a11);
            int r14 = c12.r();
            if (r14 > 0) {
                Object[] q14 = c12.q();
                do {
                    ((J) q14[i22]).b(this);
                    i22++;
                } while (i22 < r14);
            }
            synchronized (C5347p.I()) {
                try {
                    aVar3 = C5342k.f23395e;
                    C5342k c13 = aVar3.c();
                    if (aVar.j() == a.f13756h.a() || (c10 = c()) == null || !c10.b(h11, aVar.j())) {
                        aVar4 = (a) C5347p.O(this.f13755d, this, c13);
                        aVar4.m(k10);
                        aVar4.o(aVar4.l(this, c13));
                        aVar4.n(h11);
                    } else {
                        aVar4.m(k10);
                        aVar4.o(aVar4.l(this, c13));
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            d dVar3 = (d) q1.f14094a.a();
            if (dVar3 != null && dVar3.a() == 0) {
                aVar3.g();
                synchronized (C5347p.I()) {
                    C5342k c14 = aVar3.c();
                    aVar4.p(c14.f());
                    aVar4.q(c14.j());
                    C16807N n11 = C16807N.f139792a;
                }
            }
            return aVar4;
        } catch (Throwable th4) {
            int r15 = c12.r();
            if (r15 > 0) {
                Object[] q15 = c12.q();
                do {
                    ((J) q15[i22]).b(this);
                    i22++;
                } while (i22 < r15);
            }
            throw th4;
        }
    }

    private final String v() {
        a aVar = (a) C5347p.F(this.f13755d);
        return aVar.k(this, C5342k.f23395e.c()) ? String.valueOf(aVar.j()) : "<Not calculated>";
    }

    public o1<T> c() {
        return this.f13754c;
    }

    public T getValue() {
        C5342k.a aVar = C5342k.f23395e;
        C17642l<Object, C16807N> h10 = aVar.c().h();
        if (h10 != null) {
            h10.invoke(this);
        }
        C5342k c10 = aVar.c();
        return u((a) C5347p.G(this.f13755d, c10), c10, true, this.f13753b).j();
    }

    public C5328I m() {
        return this.f13755d;
    }

    public void p(C5328I i10) {
        C17542s.h(i10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f13755d = (a) i10;
    }

    public I.a<T> r() {
        C5342k c10 = C5342k.f23395e.c();
        return u((a) C5347p.G(this.f13755d, c10), c10, false, this.f13753b);
    }

    public final C5328I t(C5342k kVar) {
        return u((a) C5347p.G(this.f13755d, kVar), kVar, false, this.f13753b);
    }

    public String toString() {
        a aVar = (a) C5347p.F(this.f13755d);
        return "DerivedState(value=" + v() + ")@" + hashCode();
    }
}
