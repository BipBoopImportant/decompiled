package androidx.compose.animation;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.y;
import c2.r;
import c2.s;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.q;
import m0.B0;
import m0.C5530a;
import m0.C5538e;
import m0.C5542g;
import m0.C5546i;
import m0.C5556n;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001:\u0001CB=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R6\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u00100\u001a\u00020\u00038\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b.\u0010/R*\u00105\u001a\u00020\f2\u0006\u00101\u001a\u00020\f8\u0002@BX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010/\"\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R/\u0010B\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:8F@FX\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/animation/m;", "Ll0/q;", "Lm0/i;", "Lc2/r;", "animationSpec", "Li1/c;", "alignment", "Lkotlin/Function2;", "LXH/N;", "listener", "<init>", "(Lm0/i;Li1/c;LnI/p;)V", "Lc2/b;", "default", "M2", "(J)J", "o2", "()V", "m2", "LE1/K;", "LE1/H;", "measurable", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "targetSize", "C2", "n", "Lm0/i;", "F2", "()Lm0/i;", "J2", "(Lm0/i;)V", "o", "Li1/c;", "D2", "()Li1/c;", "H2", "(Li1/c;)V", "p", "LnI/p;", "G2", "()LnI/p;", "K2", "(LnI/p;)V", "q", "J", "lookaheadSize", "value", "r", "L2", "(J)V", "lookaheadConstraints", "", "s", "Z", "lookaheadConstraintsAvailable", "Landroidx/compose/animation/m$a;", "<set-?>", "t", "LU0/r0;", "E2", "()Landroidx/compose/animation/m$a;", "I2", "(Landroidx/compose/animation/m$a;)V", "animData", "a", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class m extends q {

    /* renamed from: n  reason: collision with root package name */
    private C5546i<r> f17456n;

    /* renamed from: o  reason: collision with root package name */
    private C5437c f17457o;

    /* renamed from: p  reason: collision with root package name */
    private p<? super r, ? super r, C16807N> f17458p;

    /* renamed from: q  reason: collision with root package name */
    private long f17459q = f.c();

    /* renamed from: r  reason: collision with root package name */
    private long f17460r = c2.c.b(0, 0, 0, 0, 15, (Object) null);

    /* renamed from: s  reason: collision with root package name */
    private boolean f17461s;

    /* renamed from: t  reason: collision with root package name */
    private final C4899r0 f17462t = u1.e((Object) null, (o1) null, 2, (Object) null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/m$a;", "", "Lm0/a;", "Lc2/r;", "Lm0/n;", "anim", "startSize", "<init>", "(Lm0/a;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm0/a;", "()Lm0/a;", "b", "J", "()J", "c", "(J)V", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C5530a<r, C5556n> f17463a;

        /* renamed from: b  reason: collision with root package name */
        private long f17464b;

        public /* synthetic */ a(C5530a aVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, j10);
        }

        public final C5530a<r, C5556n> a() {
            return this.f17463a;
        }

        public final long b() {
            return this.f17464b;
        }

        public final void c(long j10) {
            this.f17464b = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f17463a, aVar.f17463a) && r.f(this.f17464b, aVar.f17464b);
        }

        public int hashCode() {
            return (this.f17463a.hashCode() * 31) + r.i(this.f17464b);
        }

        public String toString() {
            return "AnimData(anim=" + this.f17463a + ", startSize=" + r.j(this.f17464b) + ')';
        }

        private a(C5530a<r, C5556n> aVar, long j10) {
            this.f17463a = aVar;
            this.f17464b = j10;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {228}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17465c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f17466d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f17467e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m f17468f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, long j10, m mVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f17466d = aVar;
            this.f17467e = j10;
            this.f17468f = mVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f17466d, this.f17467e, this.f17468f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            p<r, r, C16807N> G22;
            Object f10 = C17187b.f();
            int i10 = this.f17465c;
            if (i10 == 0) {
                y.b(obj);
                C5530a<r, C5556n> a10 = this.f17466d.a();
                r b10 = r.b(this.f17467e);
                C5546i<r> F22 = this.f17468f.F2();
                this.f17465c = 1;
                obj = C5530a.f(a10, b10, F22, (Object) null, (C17642l) null, this, 12, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5542g gVar = (C5542g) obj;
            if (gVar.a() == C5538e.Finished && (G22 = this.f17468f.G2()) != null) {
                G22.invoke(r.b(this.f17466d.b()), gVar.b().getValue());
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f17469c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f17470d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f17471e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f17472f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ K f17473g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a0 f17474h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar, long j10, int i10, int i11, K k10, a0 a0Var) {
            super(1);
            this.f17469c = mVar;
            this.f17470d = j10;
            this.f17471e = i10;
            this.f17472f = i11;
            this.f17473g = k10;
            this.f17474h = a0Var;
        }

        public final void a(a0.a aVar) {
            a0.a aVar2 = aVar;
            a0.a.k(aVar2, this.f17474h, this.f17469c.D2().a(this.f17470d, s.a(this.f17471e, this.f17472f), this.f17473g.getLayoutDirection()), 0.0f, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public m(C5546i<r> iVar, C5437c cVar, p<? super r, ? super r, C16807N> pVar) {
        this.f17456n = iVar;
        this.f17457o = cVar;
        this.f17458p = pVar;
    }

    private final void L2(long j10) {
        this.f17460r = j10;
        this.f17461s = true;
    }

    private final long M2(long j10) {
        return this.f17461s ? this.f17460r : j10;
    }

    public final long C2(long j10) {
        long j11 = j10;
        a E22 = E2();
        boolean z10 = true;
        if (E22 != null) {
            if (r.f(j11, E22.a().m().k()) || E22.a().p()) {
                z10 = false;
            }
            if (!r.f(j11, E22.a().k().k()) || z10) {
                E22.c(E22.a().m().k());
                F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new b(E22, j10, this, (C17164e<? super b>) null), 3, (Object) null);
            }
        } else {
            E22 = new a(new C5530a(r.b(j10), B0.e(r.f23053b), r.b(s.a(1, 1)), (String) null, 8, (DefaultConstructorMarker) null), j11, (DefaultConstructorMarker) null);
        }
        I2(E22);
        return E22.a().m().k();
    }

    public final C5437c D2() {
        return this.f17457o;
    }

    public final a E2() {
        return (a) this.f17462t.getValue();
    }

    public final C5546i<r> F2() {
        return this.f17456n;
    }

    public final p<r, r, C16807N> G2() {
        return this.f17458p;
    }

    public final void H2(C5437c cVar) {
        this.f17457o = cVar;
    }

    public final void I2(a aVar) {
        this.f17462t.setValue(aVar);
    }

    public final void J2(C5546i<r> iVar) {
        this.f17456n = iVar;
    }

    public final void K2(p<? super r, ? super r, C16807N> pVar) {
        this.f17458p = pVar;
    }

    public J h(K k10, H h10, long j10) {
        a0 i02;
        long j11;
        long j12 = j10;
        if (k10.A0()) {
            L2(j12);
            i02 = h10.i0(j10);
        } else {
            i02 = h10.i0(M2(j12));
        }
        a0 a0Var = i02;
        long a10 = s.a(a0Var.E0(), a0Var.z0());
        if (k10.A0()) {
            this.f17459q = a10;
            j11 = a10;
        } else {
            j11 = c2.c.f(j12, C2(f.d(this.f17459q) ? this.f17459q : a10));
        }
        int h11 = r.h(j11);
        int g10 = r.g(j11);
        return K.v0(k10, h11, g10, (Map) null, new c(this, a10, h11, g10, k10, a0Var), 4, (Object) null);
    }

    public void m2() {
        super.m2();
        this.f17459q = f.c();
        this.f17461s = false;
    }

    public void o2() {
        super.o2();
        I2((a) null);
    }
}
