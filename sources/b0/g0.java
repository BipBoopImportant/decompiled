package B0;

import L1.v;
import L1.x;
import N1.C4669d;
import N1.C4677l;
import N1.G;
import QJ.Q;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.platform.p1;
import c2.n;
import c2.q;
import c2.t;
import dI.C17164e;
import eI.C17187b;
import g1.C5353v;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import p1.Q0;
import p1.U0;
import p1.i1;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\r\u0010\fJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J;\u0010&\u001a\u00020\u001e2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010!\"\u0004\u0018\u00010\u00012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#H\u0003¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001eH\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0002H\u0000¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010+R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010/\u001a\u0004\u0018\u00010\u00148F@FX\u0002¢\u0006\u0012\n\u0004\b(\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00107\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b&\u0010-\u001a\u0004\b5\u0010+\"\u0004\b6\u0010\u0005R&\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"LB0/g0;", "", "LN1/d;", "initialText", "<init>", "(LN1/d;)V", "Landroidx/compose/ui/d;", "LN1/d$c;", "LN1/l;", "Landroidx/compose/foundation/text/LinkRange;", "link", "t", "(Landroidx/compose/ui/d;LN1/d$c;)Landroidx/compose/ui/d;", "k", "Lp1/i1;", "s", "(LN1/d$c;)Lp1/i1;", "Lp1/U0;", "q", "(LN1/d$c;)Lp1/U0;", "LN1/P;", "textLayoutResult", "j", "(LN1/d$c;LN1/P;)LN1/d$c;", "LN1/G;", "other", "p", "(LN1/G;LN1/G;)LN1/G;", "Landroidx/compose/ui/platform/p1;", "uriHandler", "LXH/N;", "o", "(LN1/l;Landroidx/compose/ui/platform/p1;)V", "", "keys", "Lkotlin/Function1;", "LB0/J;", "block", "c", "([Ljava/lang/Object;LnI/l;LU0/m;I)V", "b", "(LU0/m;I)V", "i", "()LN1/d;", "a", "LN1/d;", "getInitialText$foundation_release", "<set-?>", "LU0/r0;", "n", "()LN1/P;", "r", "(LN1/P;)V", "m", "setText$foundation_release", "text", "Lg1/v;", "d", "Lg1/v;", "annotators", "Lkotlin/Function0;", "", "l", "()LnI/a;", "shouldMeasureLinks", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final C4669d f4862a;

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0 f4863b = u1.e((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private C4669d f4864c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C5353v<C17642l<J, C16807N>> f4865d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f4866c = new a();

        a() {
            super(1);
        }

        public final void a(x xVar) {
            v.z(xVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f4867c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4669d.c<C4677l> f4868d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p1 f4869e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g0 g0Var, C4669d.c<C4677l> cVar, p1 p1Var) {
            super(0);
            this.f4867c = g0Var;
            this.f4868d = cVar;
            this.f4869e = p1Var;
        }

        public final void invoke() {
            this.f4867c.o(this.f4868d.g(), this.f4869e);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", l = {226}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f4870c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C f4871d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r0.m f4872e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C c10, r0.m mVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f4871d = c10;
            this.f4872e = mVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f4871d, this.f4872e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f4870c;
            if (i10 == 0) {
                y.b(obj);
                C c10 = this.f4871d;
                r0.m mVar = this.f4872e;
                this.f4870c = 1;
                if (c10.e(mVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB0/J;", "LXH/N;", "a", "(LB0/J;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<J, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f4873c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4669d.c<C4677l> f4874d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C f4875e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g0 g0Var, C4669d.c<C4677l> cVar, C c10) {
            super(1);
            this.f4873c = g0Var;
            this.f4874d = cVar;
            this.f4875e = c10;
        }

        public final void a(J j10) {
            N1.Q b10;
            N1.Q b11;
            N1.Q b12;
            g0 g0Var = this.f4873c;
            N1.Q b13 = this.f4874d.g().b();
            G g10 = null;
            G g11 = g0Var.p(g0Var.p(b13 != null ? b13.d() : null, (!this.f4875e.f() || (b12 = this.f4874d.g().b()) == null) ? null : b12.a()), (!this.f4875e.g() || (b11 = this.f4874d.g().b()) == null) ? null : b11.b());
            if (this.f4875e.h() && (b10 = this.f4874d.g().b()) != null) {
                g10 = b10.c();
            }
            G g12 = g0Var.p(g11, g10);
            if (g12 != null) {
                C4669d.c<C4677l> cVar = this.f4874d;
                j10.a(g12, cVar.h(), cVar.f());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f4876c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f4877d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g0 g0Var, int i10) {
            super(2);
            this.f4876c = g0Var;
            this.f4877d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f4876c.b(mVar, M0.a(this.f4877d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f4878c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<J, C16807N> f4879d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"B0/g0$f$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g0 f4880a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l f4881b;

            public a(g0 g0Var, C17642l lVar) {
                this.f4880a = g0Var;
                this.f4881b = lVar;
            }

            public void b() {
                this.f4880a.f4865d.remove(this.f4881b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g0 g0Var, C17642l<? super J, C16807N> lVar) {
            super(1);
            this.f4878c = g0Var;
            this.f4879d = lVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f4878c.f4865d.add(this.f4879d);
            return new a(this.f4878c, this.f4879d);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f4882c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object[] f4883d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<J, C16807N> f4884e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f4885f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(g0 g0Var, Object[] objArr, C17642l<? super J, C16807N> lVar, int i10) {
            super(2);
            this.f4882c = g0Var;
            this.f4883d = objArr;
            this.f4884e = lVar;
            this.f4885f = i10;
        }

        public final void a(C4889m mVar, int i10) {
            g0 g0Var = this.f4882c;
            Object[] objArr = this.f4883d;
            g0Var.c(Arrays.copyOf(objArr, objArr.length), this.f4884e, mVar, M0.a(this.f4885f | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "LXH/N;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<androidx.compose.ui.graphics.c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f4886c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4669d.c<C4677l> f4887d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(g0 g0Var, C4669d.c<C4677l> cVar) {
            super(1);
            this.f4886c = g0Var;
            this.f4887d = cVar;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            i1 h10 = this.f4886c.s(this.f4887d);
            if (h10 != null) {
                cVar.Z(h10);
                cVar.A(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"B0/g0$i", "Lp1/i1;", "Lo1/m;", "size", "Lc2/t;", "layoutDirection", "Lc2/d;", "density", "Lp1/Q0;", "a", "(JLc2/t;Lc2/d;)Lp1/Q0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i implements i1 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U0 f4888a;

        i(U0 u02) {
            this.f4888a = u02;
        }

        public Q0 a(long j10, t tVar, c2.d dVar) {
            return new Q0.a(this.f4888a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f4889c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(g0 g0Var) {
            super(0);
            this.f4889c = g0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
            r1 = r1.l();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke() {
            /*
                r2 = this;
                B0.g0 r0 = r2.f4889c
                N1.d r0 = r0.m()
                B0.g0 r1 = r2.f4889c
                N1.P r1 = r1.n()
                if (r1 == 0) goto L_0x0019
                N1.O r1 = r1.l()
                if (r1 == 0) goto L_0x0019
                N1.d r1 = r1.j()
                goto L_0x001a
            L_0x0019:
                r1 = 0
            L_0x001a:
                boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: B0.g0.j.invoke():java.lang.Boolean");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc2/n;", "b", "()J"}, k = 3, mv = {1, 8, 0})
    static final class k extends C17544u implements C17631a<n> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c2.p f4890c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c2.p pVar) {
            super(0);
            this.f4890c = pVar;
        }

        public final long b() {
            return this.f4890c.n();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return n.b(b());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc2/n;", "b", "()J"}, k = 3, mv = {1, 8, 0})
    static final class l extends C17544u implements C17631a<n> {

        /* renamed from: c  reason: collision with root package name */
        public static final l f4891c = new l();

        l() {
            super(0);
        }

        public final long b() {
            return n.f23044b.a();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return n.b(b());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc2/n;", "b", "()J"}, k = 3, mv = {1, 8, 0})
    static final class m extends C17544u implements C17631a<n> {

        /* renamed from: c  reason: collision with root package name */
        public static final m f4892c = new m();

        m() {
            super(0);
        }

        public final long b() {
            return n.f23044b.a();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return n.b(b());
        }
    }

    public g0(C4669d dVar) {
        G d10;
        this.f4862a = dVar;
        C4669d.a aVar = new C4669d.a(dVar);
        List<C4669d.c<C4677l>> d11 = dVar.d(0, dVar.length());
        int size = d11.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4669d.c cVar = d11.get(i10);
            N1.Q b10 = ((C4677l) cVar.g()).b();
            if (!(b10 == null || (d10 = b10.d()) == null)) {
                aVar.d(d10, cVar.h(), cVar.f());
            }
        }
        this.f4864c = aVar.q();
        this.f4865d = U0.p1.f();
    }

    /* access modifiers changed from: private */
    public final void c(Object[] objArr, C17642l<? super J, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-2083052099);
        if ((i10 & 48) == 0) {
            i11 = (k10.F(lVar) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(this) ? 256 : 128;
        }
        k10.H(-416630839, Integer.valueOf(objArr.length));
        int length = objArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            i11 |= k10.F(objArr[i12]) ? 4 : 0;
        }
        k10.T();
        if ((i11 & 14) == 0) {
            i11 |= 2;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2083052099, i11, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:298)");
            }
            U u10 = new U(2);
            u10.a(lVar);
            u10.b(objArr);
            Object[] d10 = u10.d(new Object[u10.c()]);
            boolean F10 = ((i11 & 112) == 32) | k10.F(this);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new f(this, lVar);
                k10.u(D10);
            }
            P.d(d10, (C17642l) D10, k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new g(this, objArr, lVar, i10));
        }
    }

    private final C4669d.c<C4677l> j(C4669d.c<C4677l> cVar, N1.P p10) {
        int p11 = N1.P.p(p10, p10.n() - 1, false, 2, (Object) null);
        if (cVar.h() >= p11) {
            return null;
        }
        return C4669d.c.e(cVar, (Object) null, 0, Math.min(cVar.f(), p11), (String) null, 11, (Object) null);
    }

    private final androidx.compose.ui.d k(androidx.compose.ui.d dVar, C4669d.c<C4677l> cVar) {
        return androidx.compose.ui.graphics.b.a(dVar, new h(this, cVar));
    }

    /* access modifiers changed from: private */
    public final void o(C4677l lVar, p1 p1Var) {
        if (lVar instanceof C4677l.b) {
            lVar.a();
            try {
                p1Var.a(((C4677l.b) lVar).c());
            } catch (IllegalArgumentException unused) {
            }
        } else if (lVar instanceof C4677l.a) {
            lVar.a();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r1.y(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final N1.G p(N1.G r1, N1.G r2) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x000a
            N1.G r1 = r1.y(r2)
            if (r1 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            r2 = r1
        L_0x000a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.g0.p(N1.G, N1.G):N1.G");
    }

    private final U0 q(C4669d.c<C4677l> cVar) {
        N1.P n10;
        U0 u02 = null;
        if (l().invoke().booleanValue() && (n10 = n()) != null) {
            C4669d.c<C4677l> j10 = j(cVar, n10);
            if (j10 == null) {
                return null;
            }
            u02 = n10.z(j10.h(), j10.f());
            C5669i d10 = n10.d(j10.h());
            u02.p(C5667g.u(C5668h.a(n10.q(j10.h()) == n10.q(j10.f() + -1) ? Math.min(n10.d(j10.f() - 1).o(), d10.o()) : 0.0f, d10.r())));
        }
        return u02;
    }

    /* access modifiers changed from: private */
    public final i1 s(C4669d.c<C4677l> cVar) {
        U0 q10 = q(cVar);
        if (q10 != null) {
            return new i(q10);
        }
        return null;
    }

    private final androidx.compose.ui.d t(androidx.compose.ui.d dVar, C4669d.c<C4677l> cVar) {
        return dVar.s(new m0(new f0(this, cVar)));
    }

    /* access modifiers changed from: private */
    public static final k0 u(g0 g0Var, C4669d.c cVar, l0 l0Var) {
        N1.P n10 = g0Var.n();
        if (n10 == null) {
            return l0Var.a(0, 0, l.f4891c);
        }
        C4669d.c<C4677l> j10 = g0Var.j(cVar, n10);
        if (j10 == null) {
            return l0Var.a(0, 0, m.f4892c);
        }
        c2.p b10 = q.b(n10.z(j10.h(), j10.f()).getBounds());
        return l0Var.a(b10.p(), b10.i(), new k(b10));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(U0.C4889m r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            r2 = 1154651354(0x44d294da, float:1684.6516)
            r3 = r26
            U0.m r3 = r3.k(r2)
            r4 = r1 & 6
            r5 = 2
            if (r4 != 0) goto L_0x001d
            boolean r4 = r3.F(r0)
            if (r4 == 0) goto L_0x001a
            r4 = 4
            goto L_0x001b
        L_0x001a:
            r4 = r5
        L_0x001b:
            r4 = r4 | r1
            goto L_0x001e
        L_0x001d:
            r4 = r1
        L_0x001e:
            r6 = r4 & 3
            if (r6 != r5) goto L_0x002e
            boolean r6 = r3.l()
            if (r6 != 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            r3.L()
            goto L_0x01e4
        L_0x002e:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x003a
            r6 = -1
            java.lang.String r7 = "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:200)"
            U0.C4895p.S(r2, r4, r6, r7)
        L_0x003a:
            U0.I0 r2 = androidx.compose.ui.platform.C5100f0.q()
            java.lang.Object r2 = r3.Q(r2)
            androidx.compose.ui.platform.p1 r2 = (androidx.compose.ui.platform.p1) r2
            N1.d r6 = r0.f4864c
            int r7 = r6.length()
            r8 = 0
            java.util.List r6 = r6.d(r8, r7)
            int r7 = r6.size()
            r9 = r8
        L_0x0054:
            if (r9 >= r7) goto L_0x01db
            java.lang.Object r10 = r6.get(r9)
            N1.d$c r10 = (N1.C4669d.c) r10
            int r11 = r10.h()
            int r12 = r10.f()
            if (r11 == r12) goto L_0x01cd
            r11 = 1385536272(0x52959b10, float:3.21275822E11)
            r3.W(r11)
            java.lang.Object r11 = r3.D()
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r13 = r12.a()
            if (r11 != r13) goto L_0x007f
            r0.m r11 = r0.l.a()
            r3.u(r11)
        L_0x007f:
            r0.m r11 = (r0.m) r11
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r13 = r0.k(r13, r10)
            androidx.compose.ui.d r13 = r0.t(r13, r10)
            r15 = 0
            androidx.compose.ui.d r13 = androidx.compose.foundation.h.b(r13, r11, r8, r5, r15)
            A1.w$a r14 = A1.C4355w.f4447a
            A1.w r14 = r14.b()
            androidx.compose.ui.d r13 = A1.C4356x.b(r13, r14, r8, r5, r15)
            B0.g0$a r14 = B0.g0.a.f4866c
            r5 = 1
            androidx.compose.ui.d r13 = L1.o.d(r13, r8, r14, r5, r15)
            boolean r5 = r3.F(r0)
            boolean r14 = r3.V(r10)
            r5 = r5 | r14
            boolean r14 = r3.F(r2)
            r5 = r5 | r14
            java.lang.Object r14 = r3.D()
            if (r5 != 0) goto L_0x00bb
            java.lang.Object r5 = r12.a()
            if (r14 != r5) goto L_0x00c3
        L_0x00bb:
            B0.g0$b r14 = new B0.g0$b
            r14.<init>(r0, r10, r2)
            r3.u(r14)
        L_0x00c3:
            r22 = r14
            nI.a r22 = (nI.C17631a) r22
            r23 = 252(0xfc, float:3.53E-43)
            r24 = 0
            r5 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r14 = r11
            r15 = r5
            androidx.compose.ui.d r5 = androidx.compose.foundation.d.f(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.foundation.layout.C5077h.a(r5, r3, r8)
            java.lang.Object r5 = r10.g()
            N1.l r5 = (N1.C4677l) r5
            N1.Q r5 = r5.b()
            boolean r5 = B0.h0.b(r5)
            if (r5 != 0) goto L_0x01c0
            r5 = 1386296950(0x52a13676, float:3.46201719E11)
            r3.W(r5)
            java.lang.Object r5 = r3.D()
            java.lang.Object r13 = r12.a()
            if (r5 != r13) goto L_0x0109
            B0.C r5 = new B0.C
            r5.<init>()
            r3.u(r5)
        L_0x0109:
            B0.C r5 = (B0.C) r5
            java.lang.Object r13 = r3.D()
            java.lang.Object r14 = r12.a()
            if (r13 != r14) goto L_0x011f
            B0.g0$c r13 = new B0.g0$c
            r14 = 0
            r13.<init>(r5, r11, r14)
            r3.u(r13)
            goto L_0x0120
        L_0x011f:
            r14 = 0
        L_0x0120:
            nI.p r13 = (nI.p) r13
            r15 = 6
            U0.P.g(r11, r13, r3, r15)
            boolean r11 = r5.g()
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r11)
            boolean r11 = r5.f()
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r11)
            boolean r11 = r5.h()
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r11)
            java.lang.Object r11 = r10.g()
            N1.l r11 = (N1.C4677l) r11
            N1.Q r11 = r11.b()
            if (r11 == 0) goto L_0x0151
            N1.G r11 = r11.d()
            r19 = r11
            goto L_0x0153
        L_0x0151:
            r19 = r14
        L_0x0153:
            java.lang.Object r11 = r10.g()
            N1.l r11 = (N1.C4677l) r11
            N1.Q r11 = r11.b()
            if (r11 == 0) goto L_0x0166
            N1.G r11 = r11.a()
            r20 = r11
            goto L_0x0168
        L_0x0166:
            r20 = r14
        L_0x0168:
            java.lang.Object r11 = r10.g()
            N1.l r11 = (N1.C4677l) r11
            N1.Q r11 = r11.b()
            if (r11 == 0) goto L_0x017b
            N1.G r11 = r11.b()
            r21 = r11
            goto L_0x017d
        L_0x017b:
            r21 = r14
        L_0x017d:
            java.lang.Object r11 = r10.g()
            N1.l r11 = (N1.C4677l) r11
            N1.Q r11 = r11.b()
            if (r11 == 0) goto L_0x0190
            N1.G r11 = r11.c()
            r22 = r11
            goto L_0x0192
        L_0x0190:
            r22 = r14
        L_0x0192:
            java.lang.Object[] r11 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21, r22}
            boolean r13 = r3.F(r0)
            boolean r14 = r3.V(r10)
            r13 = r13 | r14
            java.lang.Object r14 = r3.D()
            if (r13 != 0) goto L_0x01ab
            java.lang.Object r12 = r12.a()
            if (r14 != r12) goto L_0x01b3
        L_0x01ab:
            B0.g0$d r14 = new B0.g0$d
            r14.<init>(r0, r10, r5)
            r3.u(r14)
        L_0x01b3:
            nI.l r14 = (nI.C17642l) r14
            int r5 = r4 << 6
            r5 = r5 & 896(0x380, float:1.256E-42)
            r0.c(r11, r14, r3, r5)
            r3.P()
            goto L_0x01c9
        L_0x01c0:
            r5 = 1388165134(0x52bdb80e, float:4.07418372E11)
            r3.W(r5)
            r3.P()
        L_0x01c9:
            r3.P()
            goto L_0x01d6
        L_0x01cd:
            r5 = 1388179022(0x52bdee4e, float:4.07873454E11)
            r3.W(r5)
            r3.P()
        L_0x01d6:
            int r9 = r9 + 1
            r5 = 2
            goto L_0x0054
        L_0x01db:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x01e4
            U0.C4895p.R()
        L_0x01e4:
            U0.Y0 r2 = r3.n()
            if (r2 == 0) goto L_0x01f2
            B0.g0$e r3 = new B0.g0$e
            r3.<init>(r0, r1)
            r2.a(r3)
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.g0.b(U0.m, int):void");
    }

    public final C4669d i() {
        C4669d dVar;
        if (this.f4865d.isEmpty()) {
            dVar = this.f4864c;
        } else {
            C4669d.a aVar = new C4669d.a(0, 1, (DefaultConstructorMarker) null);
            aVar.h(this.f4862a);
            J j10 = new J(aVar);
            C5353v<C17642l<J, C16807N>> vVar = this.f4865d;
            int size = vVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C17642l) vVar.get(i10)).invoke(j10);
            }
            dVar = aVar.q();
        }
        this.f4864c = dVar;
        return dVar;
    }

    public final C17631a<Boolean> l() {
        return new j(this);
    }

    public final C4669d m() {
        return this.f4864c;
    }

    public final N1.P n() {
        return (N1.P) this.f4863b.getValue();
    }

    public final void r(N1.P p10) {
        this.f4863b.setValue(p10);
    }
}
