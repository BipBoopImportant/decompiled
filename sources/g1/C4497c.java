package G1;

import A1.C4349p;
import A1.I;
import E1.B;
import E1.C4484q;
import E1.C4488v;
import E1.H;
import E1.J;
import E1.K;
import E1.T;
import E1.U;
import E1.V;
import E1.X;
import E1.d0;
import E1.r;
import F1.c;
import F1.h;
import F1.j;
import F1.k;
import G1.m0;
import L1.l;
import L1.n;
import L1.x;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.i;
import c2.s;
import c2.t;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import m1.C5572b;
import m1.g;
import n1.C5622b;
import n1.C5623c;
import n1.C5627g;
import n1.C5628h;
import n1.C5630j;
import n1.C5633m;
import n1.C5634n;
import n1.C5635o;
import nI.C17631a;
import r1.C5817c;

@Metadata(d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u001b\u0010\u001d\u001a\u00020\u00142\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\"\u0010\u0016J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0016J&\u0010*\u001a\u00020)*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J#\u00100\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J#\u00103\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00101J#\u00104\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b4\u00101J#\u00105\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b5\u00101J\u0013\u00107\u001a\u00020\u0014*\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0013\u0010:\u001a\u00020\u0014*\u000209H\u0016¢\u0006\u0004\b:\u0010;J*\u0010B\u001a\u00020\u00142\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0014H\u0016¢\u0006\u0004\bD\u0010\u0016J\u000f\u0010E\u001a\u00020\u0017H\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0017H\u0016¢\u0006\u0004\bG\u0010FJ\u001f\u0010K\u001a\u0004\u0018\u00010I*\u00020H2\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u00142\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u001a\u0010R\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020@H\u0016ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00142\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bT\u0010PJ\u0017\u0010W\u001a\u00020\u00142\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b^\u0010_R*\u0010\u0011\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u00108\u0006@FX\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010\u0013R\u0016\u0010h\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010k\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010jR:\u0010u\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030m0lj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030m`n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0018\u0010x\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010{\u001a\u00020H8VX\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010\u001a\u00020|8VX\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u001d\u0010Q\u001a\u00030\u00018VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R(\u0010\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000m8VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\u00178VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010F\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"LG1/c;", "LG1/B;", "LG1/r;", "LG1/w0;", "LG1/s0;", "LF1/h;", "LF1/k;", "LG1/p0;", "LG1/A;", "LG1/t;", "Ln1/c;", "Ln1/j;", "Ln1/n;", "LG1/n0;", "Lm1/b;", "Landroidx/compose/ui/d$c;", "Landroidx/compose/ui/d$b;", "element", "<init>", "(Landroidx/compose/ui/d$b;)V", "LXH/N;", "I2", "()V", "", "duringAttach", "F2", "(Z)V", "J2", "LF1/j;", "L2", "(LF1/j;)V", "m2", "n2", "v1", "G2", "K2", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "LE1/r;", "LE1/q;", "", "height", "E", "(LE1/r;LE1/q;I)I", "width", "I", "P", "w", "Lr1/c;", "z", "(Lr1/c;)V", "LL1/x;", "m0", "(LL1/x;)V", "LA1/p;", "pointerEvent", "LA1/r;", "pass", "Lc2/r;", "bounds", "T1", "(LA1/p;LA1/r;J)V", "s1", "O1", "()Z", "o0", "Lc2/d;", "", "parentData", "K", "(Lc2/d;Ljava/lang/Object;)Ljava/lang/Object;", "LE1/v;", "coordinates", "u", "(LE1/v;)V", "size", "p", "(J)V", "D", "Ln1/o;", "focusState", "J", "(Ln1/o;)V", "Landroidx/compose/ui/focus/i;", "focusProperties", "m1", "(Landroidx/compose/ui/focus/i;)V", "", "toString", "()Ljava/lang/String;", "value", "n", "Landroidx/compose/ui/d$b;", "D2", "()Landroidx/compose/ui/d$b;", "H2", "o", "Z", "invalidateCache", "LF1/a;", "LF1/a;", "_providedValues", "Ljava/util/HashSet;", "LF1/c;", "Lkotlin/collections/HashSet;", "q", "Ljava/util/HashSet;", "E2", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "readValues", "r", "LE1/v;", "lastOnPlacedCoordinates", "getDensity", "()Lc2/d;", "density", "Lc2/t;", "getLayoutDirection", "()Lc2/t;", "layoutDirection", "Lo1/m;", "b", "()J", "LF1/g;", "s0", "()LF1/g;", "providedValues", "T", "c", "(LF1/c;)Ljava/lang/Object;", "current", "f1", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: G1.c  reason: case insensitive filesystem */
public final class C4497c extends d.c implements B, r, w0, s0, h, k, p0, A, C4516t, C5623c, C5630j, C5634n, n0, C5572b {

    /* renamed from: n  reason: collision with root package name */
    private d.b f6436n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f6437o = true;

    /* renamed from: p  reason: collision with root package name */
    private F1.a f6438p;

    /* renamed from: q  reason: collision with root package name */
    private HashSet<c<?>> f6439q = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public C4488v f6440r;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.c$a */
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4497c f6441c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C4497c cVar) {
            super(0);
            this.f6441c = cVar;
        }

        public final void invoke() {
            this.f6441c.K2();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"G1/c$b", "LG1/m0$b;", "LXH/N;", "i", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: G1.c$b */
    public static final class b implements m0.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4497c f6442a;

        b(C4497c cVar) {
            this.f6442a = cVar;
        }

        public void i() {
            if (this.f6442a.f6440r == null) {
                C4497c cVar = this.f6442a;
                cVar.D(C4508k.h(cVar, C4502e0.a(128)));
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.c$c  reason: collision with other inner class name */
    static final class C0059c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d.b f6443c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4497c f6444d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0059c(d.b bVar, C4497c cVar) {
            super(0);
            this.f6443c = bVar;
            this.f6444d = cVar;
        }

        public final void invoke() {
            ((g) this.f6443c).v(this.f6444d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.c$d */
    static final class d extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4497c f6445c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C4497c cVar) {
            super(0);
            this.f6445c = cVar;
        }

        public final void invoke() {
            d.b D22 = this.f6445c.D2();
            C17542s.h(D22, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((F1.d) D22).q(this.f6445c);
        }
    }

    public C4497c(d.b bVar) {
        w2(f0.f(bVar));
        this.f6436n = bVar;
    }

    private final void F2(boolean z10) {
        if (!j2()) {
            D1.a.b("initializeModifier called on unattached node");
        }
        d.b bVar = this.f6436n;
        if ((C4502e0.a(32) & e2()) != 0) {
            if (bVar instanceof F1.d) {
                A2(new a(this));
            }
            if (bVar instanceof j) {
                L2((j) bVar);
            }
        }
        if ((C4502e0.a(4) & e2()) != 0) {
            if (bVar instanceof g) {
                this.f6437o = true;
            }
            if (!z10) {
                E.a(this);
            }
        }
        if ((C4502e0.a(2) & e2()) != 0) {
            if (C4499d.e(this)) {
                C4498c0 b22 = b2();
                C17542s.g(b22);
                ((C) b22).I3(this);
                b22.Y2();
            }
            if (!z10) {
                E.a(this);
                C4508k.m(this).G0();
            }
        }
        if (bVar instanceof d0) {
            ((d0) bVar).m(C4508k.m(this));
        }
        if ((C4502e0.a(128) & e2()) != 0) {
            if ((bVar instanceof V) && C4499d.e(this)) {
                C4508k.m(this).G0();
            }
            if (bVar instanceof U) {
                this.f6440r = null;
                if (C4499d.e(this)) {
                    C4508k.n(this).r(new b(this));
                }
            }
        }
        if ((C4502e0.a(256) & e2()) != 0 && (bVar instanceof T) && C4499d.e(this)) {
            C4508k.m(this).G0();
        }
        if (bVar instanceof C5633m) {
            ((C5633m) bVar).n().e().b(this);
        }
        if ((C4502e0.a(16) & e2()) != 0 && (bVar instanceof I)) {
            ((I) bVar).t().f(b2());
        }
        if ((C4502e0.a(8) & e2()) != 0) {
            C4508k.n(this).B();
        }
    }

    private final void I2() {
        if (!j2()) {
            D1.a.b("unInitializeModifier called on unattached node");
        }
        d.b bVar = this.f6436n;
        if ((C4502e0.a(32) & e2()) != 0) {
            if (bVar instanceof j) {
                C4508k.n(this).getModifierLocalManager().d(this, ((j) bVar).getKey());
            }
            if (bVar instanceof F1.d) {
                ((F1.d) bVar).q(C4499d.f6507a);
            }
        }
        if ((C4502e0.a(8) & e2()) != 0) {
            C4508k.n(this).B();
        }
        if (bVar instanceof C5633m) {
            ((C5633m) bVar).n().e().y(this);
        }
    }

    private final void J2() {
        d.b bVar = this.f6436n;
        if (bVar instanceof g) {
            C4508k.n(this).getSnapshotObserver().i(this, C4499d.f6508b, new C0059c(bVar, this));
        }
        this.f6437o = false;
    }

    private final void L2(j<?> jVar) {
        F1.a aVar = this.f6438p;
        if (aVar == null || !aVar.a(jVar.getKey())) {
            this.f6438p = new F1.a(jVar);
            if (C4499d.e(this)) {
                C4508k.n(this).getModifierLocalManager().a(this, jVar.getKey());
                return;
            }
            return;
        }
        aVar.c(jVar);
        C4508k.n(this).getModifierLocalManager().f(this, jVar.getKey());
    }

    public void D(C4488v vVar) {
        this.f6440r = vVar;
        d.b bVar = this.f6436n;
        if (bVar instanceof U) {
            ((U) bVar).D(vVar);
        }
    }

    public final d.b D2() {
        return this.f6436n;
    }

    public int E(r rVar, C4484q qVar, int i10) {
        d.b bVar = this.f6436n;
        C17542s.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((B) bVar).E(rVar, qVar, i10);
    }

    public final HashSet<c<?>> E2() {
        return this.f6439q;
    }

    public final void G2() {
        this.f6437o = true;
        C4515s.a(this);
    }

    public final void H2(d.b bVar) {
        if (j2()) {
            I2();
        }
        this.f6436n = bVar;
        w2(f0.f(bVar));
        if (j2()) {
            F2(false);
        }
    }

    public int I(r rVar, C4484q qVar, int i10) {
        d.b bVar = this.f6436n;
        C17542s.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((B) bVar).I(rVar, qVar, i10);
    }

    public void J(C5635o oVar) {
        d.b bVar = this.f6436n;
        if (!(bVar instanceof C5622b)) {
            D1.a.b("onFocusEvent called on wrong node");
        }
        ((C5622b) bVar).J(oVar);
    }

    public Object K(c2.d dVar, Object obj) {
        d.b bVar = this.f6436n;
        C17542s.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((X) bVar).K(dVar, obj);
    }

    public final void K2() {
        if (j2()) {
            this.f6439q.clear();
            C4508k.n(this).getSnapshotObserver().i(this, C4499d.f6509c, new d(this));
        }
    }

    public boolean O1() {
        d.b bVar = this.f6436n;
        C17542s.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((I) bVar).t().c();
    }

    public int P(r rVar, C4484q qVar, int i10) {
        d.b bVar = this.f6436n;
        C17542s.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((B) bVar).P(rVar, qVar, i10);
    }

    public void T1(C4349p pVar, A1.r rVar, long j10) {
        d.b bVar = this.f6436n;
        C17542s.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((I) bVar).t().e(pVar, rVar, j10);
    }

    public long b() {
        return s.d(C4508k.h(this, C4502e0.a(128)).a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
        r1 = r2.m0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T c(F1.c<T> r12) {
        /*
            r11 = this;
            java.util.HashSet<F1.c<?>> r0 = r11.f6439q
            r0.add(r12)
            r0 = 32
            int r0 = G1.C4502e0.a(r0)
            androidx.compose.ui.d$c r1 = r11.E0()
            boolean r1 = r1.j2()
            if (r1 == 0) goto L_0x00c1
            androidx.compose.ui.d$c r1 = r11.E0()
            androidx.compose.ui.d$c r1 = r1.g2()
            G1.G r2 = G1.C4508k.m(r11)
        L_0x0021:
            if (r2 == 0) goto L_0x00b8
            G1.a0 r3 = r2.m0()
            androidx.compose.ui.d$c r3 = r3.k()
            int r3 = r3.Z1()
            r3 = r3 & r0
            r4 = 0
            if (r3 == 0) goto L_0x00a3
        L_0x0033:
            if (r1 == 0) goto L_0x00a3
            int r3 = r1.e2()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x009e
            r3 = r1
            r5 = r4
        L_0x003e:
            if (r3 == 0) goto L_0x009e
            boolean r6 = r3 instanceof F1.h
            if (r6 == 0) goto L_0x0059
            F1.h r3 = (F1.h) r3
            F1.g r6 = r3.s0()
            boolean r6 = r6.a(r12)
            if (r6 == 0) goto L_0x0099
            F1.g r0 = r3.s0()
            java.lang.Object r12 = r0.b(r12)
            return r12
        L_0x0059:
            int r6 = r3.e2()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x0099
            boolean r6 = r3 instanceof G1.C4510m
            if (r6 == 0) goto L_0x0099
            r6 = r3
            G1.m r6 = (G1.C4510m) r6
            androidx.compose.ui.d$c r6 = r6.D2()
            r7 = 0
            r8 = r7
        L_0x006d:
            r9 = 1
            if (r6 == 0) goto L_0x0096
            int r10 = r6.e2()
            r10 = r10 & r0
            if (r10 == 0) goto L_0x0091
            int r8 = r8 + 1
            if (r8 != r9) goto L_0x007d
            r3 = r6
            goto L_0x0091
        L_0x007d:
            if (r5 != 0) goto L_0x0088
            W0.b r5 = new W0.b
            r9 = 16
            androidx.compose.ui.d$c[] r9 = new androidx.compose.ui.d.c[r9]
            r5.<init>(r9, r7)
        L_0x0088:
            if (r3 == 0) goto L_0x008e
            r5.b(r3)
            r3 = r4
        L_0x008e:
            r5.b(r6)
        L_0x0091:
            androidx.compose.ui.d$c r6 = r6.a2()
            goto L_0x006d
        L_0x0096:
            if (r8 != r9) goto L_0x0099
            goto L_0x003e
        L_0x0099:
            androidx.compose.ui.d$c r3 = G1.C4508k.g(r5)
            goto L_0x003e
        L_0x009e:
            androidx.compose.ui.d$c r1 = r1.g2()
            goto L_0x0033
        L_0x00a3:
            G1.G r2 = r2.q0()
            if (r2 == 0) goto L_0x00b5
            G1.a0 r1 = r2.m0()
            if (r1 == 0) goto L_0x00b5
            androidx.compose.ui.d$c r1 = r1.p()
            goto L_0x0021
        L_0x00b5:
            r1 = r4
            goto L_0x0021
        L_0x00b8:
            nI.a r12 = r12.a()
            java.lang.Object r12 = r12.invoke()
            return r12
        L_0x00c1:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitAncestors called on an unattached node"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.C4497c.c(F1.c):java.lang.Object");
    }

    public boolean f1() {
        return j2();
    }

    public c2.d getDensity() {
        return C4508k.m(this).N();
    }

    public t getLayoutDirection() {
        return C4508k.m(this).getLayoutDirection();
    }

    public J h(K k10, H h10, long j10) {
        d.b bVar = this.f6436n;
        C17542s.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((B) bVar).h(k10, h10, j10);
    }

    public void m0(x xVar) {
        d.b bVar = this.f6436n;
        C17542s.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        l x10 = ((n) bVar).x();
        C17542s.h(xVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((l) xVar).i(x10);
    }

    public void m1(i iVar) {
        d.b bVar = this.f6436n;
        if (!(bVar instanceof C5628h)) {
            D1.a.b("applyFocusProperties called on wrong node");
        }
        ((C5628h) bVar).k(new C5627g(iVar));
    }

    public void m2() {
        F2(true);
    }

    public void n2() {
        I2();
    }

    public boolean o0() {
        d.b bVar = this.f6436n;
        C17542s.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((I) bVar).t().a();
    }

    public void p(long j10) {
        d.b bVar = this.f6436n;
        if (bVar instanceof V) {
            ((V) bVar).p(j10);
        }
    }

    public F1.g s0() {
        F1.a aVar = this.f6438p;
        return aVar != null ? aVar : F1.i.a();
    }

    public void s1() {
        d.b bVar = this.f6436n;
        C17542s.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((I) bVar).t().d();
    }

    public String toString() {
        return this.f6436n.toString();
    }

    public void u(C4488v vVar) {
        d.b bVar = this.f6436n;
        C17542s.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((T) bVar).u(vVar);
    }

    public void v1() {
        this.f6437o = true;
        C4515s.a(this);
    }

    public int w(r rVar, C4484q qVar, int i10) {
        d.b bVar = this.f6436n;
        C17542s.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((B) bVar).w(rVar, qVar, i10);
    }

    public void z(C5817c cVar) {
        d.b bVar = this.f6436n;
        C17542s.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        m1.h hVar = (m1.h) bVar;
        if (this.f6437o && (bVar instanceof g)) {
            J2();
        }
        hVar.z(cVar);
    }
}
