package G1;

import XH.C16807N;
import g1.C5357z;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0017\u001a\u00020\u0004\"\b\b\u0000\u0010\u0014*\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001e\u0010\u001aR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010\"¨\u0006-"}, d2 = {"LG1/o0;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "LXH/N;", "onChangedExecutor", "<init>", "(LnI/l;)V", "LG1/G;", "node", "", "affectsLookahead", "block", "e", "(LG1/G;ZLnI/a;)V", "c", "g", "j", "(LG1/G;LnI/a;)V", "LG1/n0;", "T", "target", "onChanged", "i", "(LG1/n0;LnI/l;LnI/a;)V", "b", "()V", "a", "(Ljava/lang/Object;)V", "k", "l", "Lg1/z;", "Lg1/z;", "observer", "LnI/l;", "onCommitAffectingLookaheadMeasure", "onCommitAffectingMeasure", "d", "onCommitAffectingSemantics", "onCommitAffectingLayout", "f", "onCommitAffectingLayoutModifier", "onCommitAffectingLayoutModifierInLookahead", "h", "onCommitAffectingLookahead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o0 {

    /* renamed from: i  reason: collision with root package name */
    public static final int f6560i = C5357z.f23455k;

    /* renamed from: a  reason: collision with root package name */
    private final C5357z f6561a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<G, C16807N> f6562b = f.f6574c;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<G, C16807N> f6563c = g.f6575c;

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<G, C16807N> f6564d = h.f6576c;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<G, C16807N> f6565e = b.f6570c;

    /* renamed from: f  reason: collision with root package name */
    private final C17642l<G, C16807N> f6566f = c.f6571c;

    /* renamed from: g  reason: collision with root package name */
    private final C17642l<G, C16807N> f6567g = d.f6572c;

    /* renamed from: h  reason: collision with root package name */
    private final C17642l<G, C16807N> f6568h = e.f6573c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<Object, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f6569c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            C17542s.h(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
            return Boolean.valueOf(!((n0) obj).f1());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/G;", "layoutNode", "LXH/N;", "a", "(LG1/G;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<G, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f6570c = new b();

        b() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.f1()) {
                G.v1(g10, false, 1, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/G;", "layoutNode", "LXH/N;", "a", "(LG1/G;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<G, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f6571c = new c();

        c() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.f1()) {
                G.v1(g10, false, 1, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/G;", "layoutNode", "LXH/N;", "a", "(LG1/G;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<G, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f6572c = new d();

        d() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.f1()) {
                G.r1(g10, false, 1, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/G;", "layoutNode", "LXH/N;", "a", "(LG1/G;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<G, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f6573c = new e();

        e() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.f1()) {
                G.r1(g10, false, 1, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/G;", "layoutNode", "LXH/N;", "a", "(LG1/G;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<G, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f6574c = new f();

        f() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.f1()) {
                G.t1(g10, false, false, false, 7, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/G;", "layoutNode", "LXH/N;", "a", "(LG1/G;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<G, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final g f6575c = new g();

        g() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.f1()) {
                G.x1(g10, false, false, false, 7, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/G;", "layoutNode", "LXH/N;", "a", "(LG1/G;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<G, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final h f6576c = new h();

        h() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.f1()) {
                g10.J0();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C16807N.f139792a;
        }
    }

    public o0(C17642l<? super C17631a<C16807N>, C16807N> lVar) {
        this.f6561a = new C5357z(lVar);
    }

    public static /* synthetic */ void d(o0 o0Var, G g10, boolean z10, C17631a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        o0Var.c(g10, z10, aVar);
    }

    public static /* synthetic */ void f(o0 o0Var, G g10, boolean z10, C17631a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        o0Var.e(g10, z10, aVar);
    }

    public static /* synthetic */ void h(o0 o0Var, G g10, boolean z10, C17631a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        o0Var.g(g10, z10, aVar);
    }

    public final void a(Object obj) {
        this.f6561a.k(obj);
    }

    public final void b() {
        this.f6561a.l(a.f6569c);
    }

    public final void c(G g10, boolean z10, C17631a<C16807N> aVar) {
        if (!z10 || g10.d0() == null) {
            i(g10, this.f6566f, aVar);
        } else {
            i(g10, this.f6567g, aVar);
        }
    }

    public final void e(G g10, boolean z10, C17631a<C16807N> aVar) {
        if (!z10 || g10.d0() == null) {
            i(g10, this.f6565e, aVar);
        } else {
            i(g10, this.f6568h, aVar);
        }
    }

    public final void g(G g10, boolean z10, C17631a<C16807N> aVar) {
        if (!z10 || g10.d0() == null) {
            i(g10, this.f6563c, aVar);
        } else {
            i(g10, this.f6562b, aVar);
        }
    }

    public final <T extends n0> void i(T t10, C17642l<? super T, C16807N> lVar, C17631a<C16807N> aVar) {
        this.f6561a.o(t10, lVar, aVar);
    }

    public final void j(G g10, C17631a<C16807N> aVar) {
        i(g10, this.f6564d, aVar);
    }

    public final void k() {
        this.f6561a.s();
    }

    public final void l() {
        this.f6561a.t();
        this.f6561a.j();
    }
}
