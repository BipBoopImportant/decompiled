package androidx.compose.foundation;

import G1.C4515s;
import G1.h0;
import G1.i0;
import G1.r;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nI.C17631a;
import o1.C5673m;
import p1.C5728l0;
import p1.C5747v0;
import p1.C5749w0;
import p1.Q0;
import p1.R0;
import p1.c1;
import p1.i1;
import r1.C5817c;
import r1.f;
import r1.g;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u000f*\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00103\u001a\u0002018\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u0010\u001aR\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010,\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Landroidx/compose/foundation/c;", "LG1/r;", "Landroidx/compose/ui/d$c;", "LG1/h0;", "Lp1/v0;", "color", "Lp1/l0;", "brush", "", "alpha", "Lp1/i1;", "shape", "<init>", "(JLp1/l0;FLp1/i1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lr1/c;", "LXH/N;", "D2", "(Lr1/c;)V", "C2", "Lp1/Q0;", "E2", "(Lr1/c;)Lp1/Q0;", "z", "H0", "()V", "n", "J", "getColor-0d7_KjU", "()J", "H2", "(J)V", "o", "Lp1/l0;", "getBrush", "()Lp1/l0;", "G2", "(Lp1/l0;)V", "p", "F", "getAlpha", "()F", "d", "(F)V", "q", "Lp1/i1;", "F2", "()Lp1/i1;", "Z", "(Lp1/i1;)V", "Lo1/m;", "r", "lastSize", "Lc2/t;", "s", "Lc2/t;", "lastLayoutDirection", "t", "Lp1/Q0;", "lastOutline", "u", "lastShape", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c extends d.c implements r, h0 {

    /* renamed from: n  reason: collision with root package name */
    private long f17581n;

    /* renamed from: o  reason: collision with root package name */
    private C5728l0 f17582o;

    /* renamed from: p  reason: collision with root package name */
    private float f17583p;

    /* renamed from: q  reason: collision with root package name */
    private i1 f17584q;

    /* renamed from: r  reason: collision with root package name */
    private long f17585r;

    /* renamed from: s  reason: collision with root package name */
    private t f17586s;

    /* renamed from: t  reason: collision with root package name */
    private Q0 f17587t;

    /* renamed from: u  reason: collision with root package name */
    private i1 f17588u;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O<Q0> f17589c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f17590d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5817c f17591e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(O<Q0> o10, c cVar, C5817c cVar2) {
            super(0);
            this.f17589c = o10;
            this.f17590d = cVar;
            this.f17591e = cVar2;
        }

        public final void invoke() {
            this.f17589c.f144348a = this.f17590d.F2().a(this.f17591e.b(), this.f17591e.getLayoutDirection(), this.f17591e);
        }
    }

    public /* synthetic */ c(long j10, C5728l0 l0Var, float f10, i1 i1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, l0Var, f10, i1Var);
    }

    private final void C2(C5817c cVar) {
        Q0 E22 = E2(cVar);
        if (!C5747v0.q(this.f17581n, C5747v0.f27350b.i())) {
            R0.d(cVar, E22, this.f17581n, 0.0f, (g) null, (C5749w0) null, 0, 60, (Object) null);
        }
        C5728l0 l0Var = this.f17582o;
        if (l0Var != null) {
            R0.b(cVar, E22, l0Var, this.f17583p, (g) null, (C5749w0) null, 0, 56, (Object) null);
        }
    }

    private final void D2(C5817c cVar) {
        if (!C5747v0.q(this.f17581n, C5747v0.f27350b.i())) {
            f.q1(cVar, this.f17581n, 0, 0, 0.0f, (g) null, (C5749w0) null, 0, 126, (Object) null);
        }
        C5728l0 l0Var = this.f17582o;
        if (l0Var != null) {
            f.M0(cVar, l0Var, 0, 0, this.f17583p, (g) null, (C5749w0) null, 0, 118, (Object) null);
        }
    }

    private final Q0 E2(C5817c cVar) {
        O o10 = new O();
        if (!C5673m.h(cVar.b(), this.f17585r) || cVar.getLayoutDirection() != this.f17586s || !C17542s.e(this.f17588u, this.f17584q)) {
            i0.a(this, new a(o10, this, cVar));
        } else {
            T t10 = this.f17587t;
            C17542s.g(t10);
            o10.f144348a = t10;
        }
        this.f17587t = (Q0) o10.f144348a;
        this.f17585r = cVar.b();
        this.f17586s = cVar.getLayoutDirection();
        this.f17588u = this.f17584q;
        T t11 = o10.f144348a;
        C17542s.g(t11);
        return (Q0) t11;
    }

    public final i1 F2() {
        return this.f17584q;
    }

    public final void G2(C5728l0 l0Var) {
        this.f17582o = l0Var;
    }

    public void H0() {
        this.f17585r = C5673m.f26722b.a();
        this.f17586s = null;
        this.f17587t = null;
        this.f17588u = null;
        C4515s.a(this);
    }

    public final void H2(long j10) {
        this.f17581n = j10;
    }

    public final void Z(i1 i1Var) {
        this.f17584q = i1Var;
    }

    public final void d(float f10) {
        this.f17583p = f10;
    }

    public void z(C5817c cVar) {
        if (this.f17584q == c1.a()) {
            D2(cVar);
        } else {
            C2(cVar);
        }
        cVar.V1();
    }

    private c(long j10, C5728l0 l0Var, float f10, i1 i1Var) {
        this.f17581n = j10;
        this.f17582o = l0Var;
        this.f17583p = f10;
        this.f17584q = i1Var;
        this.f17585r = C5673m.f26722b.a();
    }
}
