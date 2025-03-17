package androidx.compose.foundation.gestures;

import A1.B;
import A1.C4349p;
import A1.C4352t;
import A1.r;
import E1.C4488v;
import G1.C4505h;
import G1.C4506i;
import G1.C4508k;
import G1.h0;
import G1.i0;
import G1.w0;
import G1.x0;
import QJ.F0;
import QJ.Q;
import XH.C16807N;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.c;
import androidx.compose.ui.platform.C5100f0;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import l0.x;
import n0.C5589L;
import n0.T;
import n1.C5630j;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import o1.C5668h;
import p0.C5679B;
import p0.C5681D;
import p0.C5687e;
import p0.C5689g;
import p0.C5691i;
import p0.C5693k;
import p0.F;
import p0.s;
import p0.u;
import p0.v;
import p0.y;
import r0.m;
import y1.C6253a;
import y1.C6255c;
import y1.C6256d;
import y1.C6257e;
import z1.C6272b;

@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006BO\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\"\u0010!\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J@\u0010)\u001a\u00020\u00182.\u0010(\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00180$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180&\u0012\u0006\u0012\u0004\u0018\u00010'0#H@¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00182\u0006\u0010,\u001a\u00020+H\u0016ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00182\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u0010.J\u000f\u00102\u001a\u00020\u000fH\u0016¢\u0006\u0004\b2\u00103JU\u00104\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0018H\u0016¢\u0006\u0004\b6\u0010\u001aJ\u000f\u00107\u001a\u00020\u0018H\u0016¢\u0006\u0004\b7\u0010\u001aJ\u0017\u0010:\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001a\u0010?\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\b?\u0010>J*\u0010D\u001a\u00020\u00182\u0006\u0010@\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0013\u0010G\u001a\u00020\u0018*\u00020FH\u0016¢\u0006\u0004\bG\u0010HR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010P\u001a\u00020\u000f8\u0016XD¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u00103R\u0014\u0010T\u001a\u00020Q8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010kR*\u0010p\u001a\u0016\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020\u000f\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bn\u0010oR4\u0010r\u001a \b\u0001\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0&\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bq\u0010o\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006s"}, d2 = {"Landroidx/compose/foundation/gestures/i;", "Landroidx/compose/foundation/gestures/d;", "LG1/h0;", "LG1/h;", "Ln1/j;", "Ly1/e;", "LG1/w0;", "Lp0/D;", "state", "Ln0/T;", "overscrollEffect", "Lp0/s;", "flingBehavior", "Lp0/v;", "orientation", "", "enabled", "reverseDirection", "Lr0/m;", "interactionSource", "Lp0/g;", "bringIntoViewSpec", "<init>", "(Lp0/D;Ln0/T;Lp0/s;Lp0/v;ZZLr0/m;Lp0/g;)V", "LXH/N;", "l3", "()V", "j3", "h3", "LA1/p;", "event", "Lc2/r;", "size", "i3", "(LA1/p;J)V", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/c$b;", "LdI/e;", "", "forEachDelta", "R2", "(LnI/p;LdI/e;)Ljava/lang/Object;", "Lo1/g;", "startedPosition", "V2", "(J)V", "Lc2/y;", "velocity", "W2", "a3", "()Z", "k3", "(Lp0/D;Lp0/v;Ln0/T;ZZLp0/s;Lr0/m;Lp0/g;)V", "m2", "H0", "Landroidx/compose/ui/focus/i;", "focusProperties", "m1", "(Landroidx/compose/ui/focus/i;)V", "Ly1/b;", "p1", "(Landroid/view/KeyEvent;)Z", "Y0", "pointerEvent", "LA1/r;", "pass", "bounds", "T1", "(LA1/p;LA1/r;J)V", "LL1/x;", "m0", "(LL1/x;)V", "y", "Ln0/T;", "z", "Lp0/s;", "A", "Z", "h2", "shouldAutoInvalidate", "Lz1/b;", "B", "Lz1/b;", "nestedScrollDispatcher", "Lp0/B;", "C", "Lp0/B;", "scrollableContainerNode", "Lp0/k;", "D", "Lp0/k;", "defaultFlingBehavior", "Lp0/F;", "E", "Lp0/F;", "scrollingLogic", "Landroidx/compose/foundation/gestures/h;", "F", "Landroidx/compose/foundation/gestures/h;", "nestedScrollConnection", "Lp0/i;", "G", "Lp0/i;", "contentInViewNode", "Lp0/y;", "H", "Lp0/y;", "scrollConfig", "", "I", "LnI/p;", "scrollByAction", "J", "scrollByOffsetAction", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class i extends d implements h0, C4505h, C5630j, C6257e, w0 {

    /* renamed from: A  reason: collision with root package name */
    private final boolean f17834A;

    /* renamed from: B  reason: collision with root package name */
    private final C6272b f17835B;

    /* renamed from: C  reason: collision with root package name */
    private final C5679B f17836C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final C5693k f17837D;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public final F f17838E;

    /* renamed from: F  reason: collision with root package name */
    private final h f17839F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public final C5691i f17840G;

    /* renamed from: H  reason: collision with root package name */
    private y f17841H;

    /* renamed from: I  reason: collision with root package name */
    private p<? super Float, ? super Float, Boolean> f17842I;

    /* renamed from: J  reason: collision with root package name */
    private p<? super C5667g, ? super C17164e<? super C5667g>, ? extends Object> f17843J;

    /* renamed from: y  reason: collision with root package name */
    private T f17844y;

    /* renamed from: z  reason: collision with root package name */
    private s f17845z;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE1/v;", "it", "LXH/N;", "a", "(LE1/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C4488v, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f17846c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(1);
            this.f17846c = iVar;
        }

        public final void a(C4488v vVar) {
            this.f17846c.f17840G.W2(vVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4488v) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/u;", "LXH/N;", "<anonymous>", "(Lp0/u;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {344}, m = "invokeSuspend")
    static final class b extends l implements p<u, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17847c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f17848d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C17642l<? super c.b, C16807N>, C17164e<? super C16807N>, Object> f17849e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ F f17850f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/c$b;", "it", "LXH/N;", "a", "(Landroidx/compose/foundation/gestures/c$b;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<c.b, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ u f17851c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ F f17852d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(u uVar, F f10) {
                super(1);
                this.f17851c = uVar;
                this.f17852d = f10;
            }

            public final void a(c.b bVar) {
                this.f17851c.a(this.f17852d.x(bVar.a()), z1.e.f32374a.b());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((c.b) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p<? super C17642l<? super c.b, C16807N>, ? super C17164e<? super C16807N>, ? extends Object> pVar, F f10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f17849e = pVar;
            this.f17850f = f10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f17849e, this.f17850f, eVar);
            bVar.f17848d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(u uVar, C17164e<? super C16807N> eVar) {
            return ((b) create(uVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17847c;
            if (i10 == 0) {
                XH.y.b(obj);
                p<C17642l<? super c.b, C16807N>, C17164e<? super C16807N>, Object> pVar = this.f17849e;
                a aVar = new a((u) this.f17848d, this.f17850f);
                this.f17847c = 1;
                if (pVar.invoke(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", l = {358}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17853c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f17854d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f17855e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar, long j10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f17854d = iVar;
            this.f17855e = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f17854d, this.f17855e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17853c;
            if (i10 == 0) {
                XH.y.b(obj);
                F g32 = this.f17854d.f17838E;
                long j10 = this.f17855e;
                this.f17853c = 1;
                if (g32.q(j10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", l = {477}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17856c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f17857d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f17858e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/u;", "LXH/N;", "<anonymous>", "(Lp0/u;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
        static final class a extends l implements p<u, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f17859c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f17860d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f17861e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(long j10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f17861e = j10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f17861e, eVar);
                aVar.f17860d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(u uVar, C17164e<? super C16807N> eVar) {
                return ((a) create(uVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f17859c == 0) {
                    XH.y.b(obj);
                    ((u) this.f17860d).b(this.f17861e, z1.e.f32374a.b());
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar, long j10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f17857d = iVar;
            this.f17858e = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f17857d, this.f17858e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17856c;
            if (i10 == 0) {
                XH.y.b(obj);
                F g32 = this.f17857d.f17838E;
                C5589L l10 = C5589L.UserInput;
                a aVar = new a(this.f17858e, (C17164e<? super a>) null);
                this.f17856c = 1;
                if (g32.v(l10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$processMouseWheelEvent$2$1", f = "Scrollable.kt", l = {549}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17862c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f17863d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f17864e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/u;", "LXH/N;", "<anonymous>", "(Lp0/u;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$processMouseWheelEvent$2$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
        static final class a extends l implements p<u, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f17865c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f17866d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f17867e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(long j10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f17867e = j10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f17867e, eVar);
                aVar.f17866d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(u uVar, C17164e<? super C16807N> eVar) {
                return ((a) create(uVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f17865c == 0) {
                    XH.y.b(obj);
                    ((u) this.f17866d).b(this.f17867e, z1.e.f32374a.b());
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar, long j10, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f17863d = iVar;
            this.f17864e = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f17863d, this.f17864e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17862c;
            if (i10 == 0) {
                XH.y.b(obj);
                F g32 = this.f17863d.f17838E;
                C5589L l10 = C5589L.UserInput;
                a aVar = new a(this.f17864e, (C17164e<? super a>) null);
                this.f17862c = 1;
                if (g32.v(l10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "x", "y", "", "a", "(FF)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements p<Float, Float, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f17868c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", l = {522}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f17869c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ i f17870d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ float f17871e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ float f17872f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(i iVar, float f10, float f11, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f17870d = iVar;
                this.f17871e = f10;
                this.f17872f = f11;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f17870d, this.f17871e, this.f17872f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f17869c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    F g32 = this.f17870d.f17838E;
                    long a10 = C5668h.a(this.f17871e, this.f17872f);
                    this.f17869c = 1;
                    if (g.j(g32, a10, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    XH.y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(i iVar) {
            super(2);
            this.f17868c = iVar;
        }

        public final Boolean a(float f10, float f11) {
            F0 unused = C16314k.d(this.f17868c.c2(), (C17168i) null, (QJ.T) null, new a(this.f17868c, f10, f11, (C17164e<? super a>) null), 3, (Object) null);
            return Boolean.TRUE;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo1/g;", "offset", "<anonymous>", "(Lo1/g;)Lo1/g;"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {527}, m = "invokeSuspend")
    static final class g extends l implements p<C5667g, C17164e<? super C5667g>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17873c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ long f17874d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f17875e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(i iVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f17875e = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f17875e, eVar);
            gVar.f17874d = ((C5667g) obj).v();
            return gVar;
        }

        public final Object i(long j10, C17164e<? super C5667g> eVar) {
            return ((g) create(C5667g.d(j10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((C5667g) obj).v(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17873c;
            if (i10 == 0) {
                XH.y.b(obj);
                long j10 = this.f17874d;
                F g32 = this.f17875e.f17838E;
                this.f17873c = 1;
                obj = g.j(g32, j10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f17876c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(i iVar) {
            super(0);
            this.f17876c = iVar;
        }

        public final void invoke() {
            this.f17876c.f17837D.f(x.c((c2.d) C4506i.a(this.f17876c, C5100f0.e())));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(p0.C5681D r13, n0.T r14, p0.s r15, p0.v r16, boolean r17, boolean r18, r0.m r19, p0.C5689g r20) {
        /*
            r12 = this;
            r0 = r12
            r8 = r16
            r9 = r17
            nI.l r1 = androidx.compose.foundation.gestures.g.f17811a
            r2 = r19
            r12.<init>(r1, r9, r2, r8)
            r1 = r14
            r0.f17844y = r1
            r1 = r15
            r0.f17845z = r1
            z1.b r10 = new z1.b
            r10.<init>()
            r0.f17835B = r10
            p0.B r1 = new p0.B
            r1.<init>(r9)
            G1.j r1 = r12.C2(r1)
            p0.B r1 = (p0.C5679B) r1
            r0.f17836C = r1
            p0.k r1 = new p0.k
            androidx.compose.foundation.gestures.g$d r2 = androidx.compose.foundation.gestures.g.f17814d
            m0.z r2 = l0.x.c(r2)
            r3 = 0
            r4 = 2
            r1.<init>(r2, r3, r4, r3)
            r0.f17837D = r1
            n0.T r3 = r0.f17844y
            p0.s r2 = r0.f17845z
            if (r2 != 0) goto L_0x0041
            r4 = r1
            goto L_0x0042
        L_0x0041:
            r4 = r2
        L_0x0042:
            p0.F r11 = new p0.F
            r1 = r11
            r2 = r13
            r5 = r16
            r6 = r18
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.f17838E = r11
            androidx.compose.foundation.gestures.h r1 = new androidx.compose.foundation.gestures.h
            r1.<init>(r11, r9)
            r0.f17839F = r1
            p0.i r2 = new p0.i
            r3 = r18
            r4 = r20
            r2.<init>(r8, r11, r3, r4)
            G1.j r2 = r12.C2(r2)
            p0.i r2 = (p0.C5691i) r2
            r0.f17840G = r2
            G1.j r1 = z1.C6274d.a(r1, r10)
            r12.C2(r1)
            n1.q r1 = n1.C5638r.a()
            r12.C2(r1)
            androidx.compose.foundation.relocation.f r1 = new androidx.compose.foundation.relocation.f
            r1.<init>(r2)
            r12.C2(r1)
            n0.D r1 = new n0.D
            androidx.compose.foundation.gestures.i$a r2 = new androidx.compose.foundation.gestures.i$a
            r2.<init>(r12)
            r1.<init>(r2)
            r12.C2(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.i.<init>(p0.D, n0.T, p0.s, p0.v, boolean, boolean, r0.m, p0.g):void");
    }

    private final void h3() {
        this.f17842I = null;
        this.f17843J = null;
    }

    private final void i3(C4349p pVar, long j10) {
        List<B> c10 = pVar.c();
        int size = c10.size();
        int i10 = 0;
        while (i10 < size) {
            if (!c10.get(i10).p()) {
                i10++;
            } else {
                return;
            }
        }
        y yVar = this.f17841H;
        C17542s.g(yVar);
        F0 unused = C16314k.d(c2(), (C17168i) null, (QJ.T) null, new e(this, yVar.a(C4508k.i(this), pVar, j10), (C17164e<? super e>) null), 3, (Object) null);
        List<B> c11 = pVar.c();
        int size2 = c11.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c11.get(i11).a();
        }
    }

    private final void j3() {
        this.f17842I = new f(this);
        this.f17843J = new g(this, (C17164e<? super g>) null);
    }

    private final void l3() {
        i0.a(this, new h(this));
    }

    public void H0() {
        l3();
    }

    public Object R2(p<? super C17642l<? super c.b, C16807N>, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
        F f10 = this.f17838E;
        Object v10 = f10.v(C5589L.UserInput, new b(pVar, f10, (C17164e<? super b>) null), eVar);
        return v10 == C17187b.f() ? v10 : C16807N.f139792a;
    }

    public void T1(C4349p pVar, r rVar, long j10) {
        List<B> c10 = pVar.c();
        int size = c10.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (S2().invoke(c10.get(i10)).booleanValue()) {
                super.T1(pVar, rVar, j10);
                break;
            }
            i10++;
        }
        if (rVar == r.Main && C4352t.i(pVar.g(), C4352t.f4431a.f())) {
            i3(pVar, j10);
        }
    }

    public void V2(long j10) {
    }

    public void W2(long j10) {
        F0 unused = C16314k.d(this.f17835B.e(), (C17168i) null, (QJ.T) null, new c(this, j10, (C17164e<? super c>) null), 3, (Object) null);
    }

    public boolean Y0(KeyEvent keyEvent) {
        return false;
    }

    public boolean a3() {
        return this.f17838E.w();
    }

    public boolean h2() {
        return this.f17834A;
    }

    public final void k3(C5681D d10, v vVar, T t10, boolean z10, boolean z11, s sVar, m mVar, C5689g gVar) {
        boolean z12;
        boolean z13 = z10;
        s sVar2 = sVar;
        if (T2() != z13) {
            this.f17839F.a(z13);
            this.f17836C.D2(z13);
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z14 = z12;
        boolean C10 = this.f17838E.C(d10, vVar, t10, z11, sVar2 == null ? this.f17837D : sVar2, this.f17835B);
        this.f17840G.Z2(vVar, z11, gVar);
        this.f17844y = t10;
        this.f17845z = sVar2;
        c3(g.f17811a, z10, mVar, this.f17838E.p() ? v.Vertical : v.Horizontal, C10);
        if (z14) {
            h3();
            x0.b(this);
        }
    }

    public void m0(L1.x xVar) {
        if (T2() && (this.f17842I == null || this.f17843J == null)) {
            j3();
        }
        p<? super Float, ? super Float, Boolean> pVar = this.f17842I;
        if (pVar != null) {
            L1.v.V(xVar, (String) null, pVar, 1, (Object) null);
        }
        p<? super C5667g, ? super C17164e<? super C5667g>, ? extends Object> pVar2 = this.f17843J;
        if (pVar2 != null) {
            L1.v.W(xVar, pVar2);
        }
    }

    public void m1(androidx.compose.ui.focus.i iVar) {
        iVar.w(false);
    }

    public void m2() {
        l3();
        this.f17841H = C5687e.a(this);
    }

    public boolean p1(KeyEvent keyEvent) {
        long j10;
        if (T2()) {
            long a10 = C6256d.a(keyEvent);
            C6253a.C0496a aVar = C6253a.f32108b;
            if ((C6253a.t(a10, aVar.l()) || C6253a.t(C6256d.a(keyEvent), aVar.m())) && C6255c.e(C6256d.b(keyEvent), C6255c.f32260a.a()) && !C6256d.e(keyEvent)) {
                if (this.f17838E.p()) {
                    int g10 = c2.r.g(this.f17840G.S2());
                    j10 = C5668h.a(0.0f, C6253a.t(C6256d.a(keyEvent), aVar.m()) ? (float) g10 : -((float) g10));
                } else {
                    int h10 = c2.r.h(this.f17840G.S2());
                    j10 = C5668h.a(C6253a.t(C6256d.a(keyEvent), aVar.m()) ? (float) h10 : -((float) h10), 0.0f);
                }
                F0 unused = C16314k.d(c2(), (C17168i) null, (QJ.T) null, new d(this, j10, (C17164e<? super d>) null), 3, (Object) null);
                return true;
            }
        }
        return false;
    }
}
