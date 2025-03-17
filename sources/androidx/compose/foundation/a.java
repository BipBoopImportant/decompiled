package androidx.compose.foundation;

import A1.C4349p;
import A1.C4352t;
import A1.K;
import A1.U;
import A1.W;
import A1.r;
import G1.B0;
import G1.C4507j;
import G1.C4510m;
import G1.s0;
import G1.w0;
import L1.v;
import L1.x;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import android.view.KeyEvent;
import c2.n;
import c2.s;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5586I;
import n0.C5605k;
import n0.C5618x;
import n0.C5620z;
import n1.C5623c;
import n1.C5635o;
import nI.C17631a;
import nI.p;
import o1.C5667g;
import o1.C5668h;
import p0.w;
import r0.m;
import r0.o;
import y1.C6253a;
import y1.C6256d;
import y1.C6257e;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\n\b \u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0001BE\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u0014\u0010\u001e\u001a\u00020\u0012*\u00020\u001dH¦@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020\u0012*\u00020 H\u0016¢\u0006\u0004\b!\u0010\"JP\u0010#\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0004ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0012¢\u0006\u0004\b%\u0010\u0019J\r\u0010&\u001a\u00020\u0012¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020\u0012H\u0004¢\u0006\u0004\b'\u0010\u0019J(\u0010.\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0012¢\u0006\u0004\b0\u0010\u0019J\u0018\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u000201ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u00020\u000b2\u0006\u00102\u001a\u000201ø\u0001\u0000¢\u0006\u0004\b5\u00104J\u0015\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0011\u0010:\u001a\u00020\u0012*\u00020 ¢\u0006\u0004\b:\u0010\"J\u0011\u0010;\u001a\u0004\u0018\u00010\u0012H\u0004¢\u0006\u0004\b;\u0010<J\u001f\u0010@\u001a\u00020\u0012*\u00020=2\u0006\u0010?\u001a\u00020>H@ø\u0001\u0000¢\u0006\u0004\b@\u0010AR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010\f\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000b8\u0004@BX\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010\u0017R0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0004@BX\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010T\u001a\u00020\u000b8\u0006XD¢\u0006\f\n\u0004\bR\u0010L\u001a\u0004\bS\u0010\u0017R\u0014\u0010X\u001a\u00020U8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010kR \u0010q\u001a\u000e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020e0m8\u0002X\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u001c\u0010s\u001a\u00020>8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\br\u00108R\u0018\u0010u\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bt\u0010CR\u0016\u0010w\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bv\u0010LR\u001a\u0010}\u001a\u00020x8\u0016X\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0011\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b~\u0010\u0017\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/a;", "LG1/m;", "LG1/s0;", "Ly1/e;", "Ln1/c;", "LG1/w0;", "LG1/B0;", "Lr0/m;", "interactionSource", "Ln0/I;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "LL1/i;", "role", "Lkotlin/Function0;", "LXH/N;", "onClick", "<init>", "(Lr0/m;Ln0/I;ZLjava/lang/String;LL1/i;LnI/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Z2", "()Z", "X2", "()V", "Q2", "S2", "T2", "LA1/K;", "P2", "(LA1/K;LdI/e;)Ljava/lang/Object;", "LL1/x;", "O2", "(LL1/x;)V", "a3", "(Lr0/m;Ln0/I;ZLjava/lang/String;LL1/i;LnI/a;)V", "m2", "n2", "R2", "LA1/p;", "pointerEvent", "LA1/r;", "pass", "Lc2/r;", "bounds", "T1", "(LA1/p;LA1/r;J)V", "s1", "Ly1/b;", "event", "p1", "(Landroid/view/KeyEvent;)Z", "Y0", "Ln1/o;", "focusState", "J", "(Ln1/o;)V", "m0", "Y2", "()LXH/N;", "Lp0/w;", "Lo1/g;", "offset", "W2", "(Lp0/w;JLdI/e;)Ljava/lang/Object;", "p", "Lr0/m;", "q", "Ln0/I;", "r", "Ljava/lang/String;", "s", "LL1/i;", "<set-?>", "t", "Z", "U2", "u", "LnI/a;", "V2", "()LnI/a;", "v", "h2", "shouldAutoInvalidate", "Ln0/x;", "w", "Ln0/x;", "focusableInNonTouchMode", "Ln0/z;", "x", "Ln0/z;", "focusableNode", "LA1/W;", "y", "LA1/W;", "pointerInputNode", "LG1/j;", "z", "LG1/j;", "indicationNode", "Lr0/o$b;", "A", "Lr0/o$b;", "pressInteraction", "Lr0/g;", "B", "Lr0/g;", "hoverInteraction", "", "Ly1/a;", "C", "Ljava/util/Map;", "currentKeyPressInteractions", "D", "centerOffset", "E", "userProvidedInteractionSource", "F", "lazilyCreateIndication", "", "G", "Ljava/lang/Object;", "T", "()Ljava/lang/Object;", "traverseKey", "U1", "shouldMergeDescendantSemantics", "H", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a extends C4510m implements s0, C6257e, C5623c, w0, B0 {

    /* renamed from: H  reason: collision with root package name */
    public static final C0244a f17524H = new C0244a((DefaultConstructorMarker) null);

    /* renamed from: I  reason: collision with root package name */
    public static final int f17525I = 8;
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public o.b f17526A;

    /* renamed from: B  reason: collision with root package name */
    private r0.g f17527B;

    /* renamed from: C  reason: collision with root package name */
    private final Map<C6253a, o.b> f17528C;

    /* renamed from: D  reason: collision with root package name */
    private long f17529D;

    /* renamed from: E  reason: collision with root package name */
    private m f17530E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f17531F;

    /* renamed from: G  reason: collision with root package name */
    private final Object f17532G;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public m f17533p;

    /* renamed from: q  reason: collision with root package name */
    private C5586I f17534q;

    /* renamed from: r  reason: collision with root package name */
    private String f17535r;

    /* renamed from: s  reason: collision with root package name */
    private L1.i f17536s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f17537t;

    /* renamed from: u  reason: collision with root package name */
    private C17631a<C16807N> f17538u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f17539v;

    /* renamed from: w  reason: collision with root package name */
    private final C5618x f17540w;

    /* renamed from: x  reason: collision with root package name */
    private final C5620z f17541x;

    /* renamed from: y  reason: collision with root package name */
    private W f17542y;

    /* renamed from: z  reason: collision with root package name */
    private C4507j f17543z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/a$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.a$a  reason: collision with other inner class name */
    public static final class C0244a {
        public /* synthetic */ C0244a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0244a() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f17544c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.f17544c = aVar;
        }

        public final Boolean invoke() {
            this.f17544c.V2().invoke();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1", f = "Clickable.kt", l = {1174}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17545c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f17546d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r0.g f17547e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar, r0.g gVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f17546d = mVar;
            this.f17547e = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f17546d, this.f17547e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17545c;
            if (i10 == 0) {
                y.b(obj);
                m mVar = this.f17546d;
                r0.g gVar = this.f17547e;
                this.f17545c = 1;
                if (mVar.b(gVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverExit$1$1$1", f = "Clickable.kt", l = {1186}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17548c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f17549d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r0.h f17550e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(m mVar, r0.h hVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f17549d = mVar;
            this.f17550e = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f17549d, this.f17550e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17548c;
            if (i10 == 0) {
                y.b(obj);
                m mVar = this.f17549d;
                r0.h hVar = this.f17550e;
                this.f17548c = 1;
                if (mVar.b(hVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {1139, 1141, 1148, 1149, 1158}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f17551c;

        /* renamed from: d  reason: collision with root package name */
        int f17552d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f17553e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w f17554f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f17555g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m f17556h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f17557i;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {1133, 1136}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.a$e$a  reason: collision with other inner class name */
        static final class C0245a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f17558c;

            /* renamed from: d  reason: collision with root package name */
            int f17559d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ a f17560e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f17561f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ m f17562g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0245a(a aVar, long j10, m mVar, C17164e<? super C0245a> eVar) {
                super(2, eVar);
                this.f17560e = aVar;
                this.f17561f = j10;
                this.f17562g = mVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0245a(this.f17560e, this.f17561f, this.f17562g, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0245a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                o.b bVar;
                Object f10 = C17187b.f();
                int i10 = this.f17559d;
                if (i10 == 0) {
                    y.b(obj);
                    if (this.f17560e.Q2()) {
                        long a10 = C5605k.a();
                        this.f17559d = 1;
                        if (C16297b0.b(a10, this) == f10) {
                            return f10;
                        }
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else if (i10 == 2) {
                    bVar = (o.b) this.f17558c;
                    y.b(obj);
                    this.f17560e.f17526A = bVar;
                    return C16807N.f139792a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b bVar2 = new o.b(this.f17561f, (DefaultConstructorMarker) null);
                m mVar = this.f17562g;
                this.f17558c = bVar2;
                this.f17559d = 2;
                if (mVar.b(bVar2, this) == f10) {
                    return f10;
                }
                bVar = bVar2;
                this.f17560e.f17526A = bVar;
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(w wVar, long j10, m mVar, a aVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f17554f = wVar;
            this.f17555g = j10;
            this.f17556h = mVar;
            this.f17557i = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f17554f, this.f17555g, this.f17556h, this.f17557i, eVar);
            eVar2.f17553e = obj;
            return eVar2;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f17552d
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r2 == 0) goto L_0x0041
                if (r2 == r7) goto L_0x0037
                if (r2 == r6) goto L_0x0031
                if (r2 == r5) goto L_0x0028
                if (r2 == r4) goto L_0x0023
                if (r2 != r3) goto L_0x001b
                goto L_0x0023
            L_0x001b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0023:
                XH.y.b(r17)
                goto L_0x00d1
            L_0x0028:
                java.lang.Object r2 = r0.f17553e
                r0.o$c r2 = (r0.o.c) r2
                XH.y.b(r17)
                goto L_0x00a2
            L_0x0031:
                boolean r2 = r0.f17551c
                XH.y.b(r17)
                goto L_0x0086
            L_0x0037:
                java.lang.Object r2 = r0.f17553e
                QJ.F0 r2 = (QJ.F0) r2
                XH.y.b(r17)
                r7 = r17
                goto L_0x006c
            L_0x0041:
                XH.y.b(r17)
                java.lang.Object r2 = r0.f17553e
                r9 = r2
                QJ.Q r9 = (QJ.Q) r9
                androidx.compose.foundation.a$e$a r2 = new androidx.compose.foundation.a$e$a
                androidx.compose.foundation.a r11 = r0.f17557i
                long r12 = r0.f17555g
                r0.m r14 = r0.f17556h
                r15 = 0
                r10 = r2
                r10.<init>(r11, r12, r14, r15)
                r13 = 3
                r14 = 0
                r10 = 0
                r11 = 0
                r12 = r2
                QJ.F0 r2 = QJ.C16314k.d(r9, r10, r11, r12, r13, r14)
                p0.w r9 = r0.f17554f
                r0.f17553e = r2
                r0.f17552d = r7
                java.lang.Object r7 = r9.U0(r0)
                if (r7 != r1) goto L_0x006c
                return r1
            L_0x006c:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                boolean r9 = r2.c()
                if (r9 == 0) goto L_0x00af
                r0.f17553e = r8
                r0.f17551c = r7
                r0.f17552d = r6
                java.lang.Object r2 = QJ.I0.g(r2, r0)
                if (r2 != r1) goto L_0x0085
                return r1
            L_0x0085:
                r2 = r7
            L_0x0086:
                if (r2 == 0) goto L_0x00d1
                r0.o$b r2 = new r0.o$b
                long r6 = r0.f17555g
                r2.<init>(r6, r8)
                r0.o$c r3 = new r0.o$c
                r3.<init>(r2)
                r0.m r6 = r0.f17556h
                r0.f17553e = r3
                r0.f17552d = r5
                java.lang.Object r2 = r6.b(r2, r0)
                if (r2 != r1) goto L_0x00a1
                return r1
            L_0x00a1:
                r2 = r3
            L_0x00a2:
                r0.m r3 = r0.f17556h
                r0.f17553e = r8
                r0.f17552d = r4
                java.lang.Object r2 = r3.b(r2, r0)
                if (r2 != r1) goto L_0x00d1
                return r1
            L_0x00af:
                androidx.compose.foundation.a r2 = r0.f17557i
                r0.o$b r2 = r2.f17526A
                if (r2 == 0) goto L_0x00d1
                r0.m r4 = r0.f17556h
                if (r7 == 0) goto L_0x00c1
                r0.o$c r5 = new r0.o$c
                r5.<init>(r2)
                goto L_0x00c6
            L_0x00c1:
                r0.o$a r5 = new r0.o$a
                r5.<init>(r2)
            L_0x00c6:
                r0.f17553e = r8
                r0.f17552d = r3
                java.lang.Object r2 = r4.b(r5, r0)
                if (r2 != r1) goto L_0x00d1
                return r1
            L_0x00d1:
                androidx.compose.foundation.a r1 = r0.f17557i
                r1.f17526A = r8
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {1074}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17563c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f17564d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o.b f17565e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar, o.b bVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f17564d = aVar;
            this.f17565e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f17564d, this.f17565e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17563c;
            if (i10 == 0) {
                y.b(obj);
                m L22 = this.f17564d.f17533p;
                if (L22 != null) {
                    o.b bVar = this.f17565e;
                    this.f17563c = 1;
                    if (L22.b(bVar, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1", f = "Clickable.kt", l = {1085}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17566c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f17567d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o.b f17568e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, o.b bVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f17567d = aVar;
            this.f17568e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f17567d, this.f17568e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17566c;
            if (i10 == 0) {
                y.b(obj);
                m L22 = this.f17567d.f17533p;
                if (L22 != null) {
                    o.c cVar = new o.c(this.f17568e);
                    this.f17566c = 1;
                    if (L22.b(cVar, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", l = {}, m = "invokeSuspend")
    static final class h extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17569c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f17570d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f17570d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f17570d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f17569c == 0) {
                y.b(obj);
                this.f17570d.S2();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", f = "Clickable.kt", l = {}, m = "invokeSuspend")
    static final class i extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17571c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f17572d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f17572d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f17572d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f17571c == 0) {
                y.b(obj);
                this.f17572d.T2();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$3", f = "Clickable.kt", l = {1042}, m = "invokeSuspend")
    static final class j extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17573c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f17574d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f17575e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f17575e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(this.f17575e, eVar);
            jVar.f17574d = obj;
            return jVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((j) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17573c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = this.f17575e;
                this.f17573c = 1;
                if (aVar.P2((K) this.f17574d, this) == f10) {
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

    public /* synthetic */ a(m mVar, C5586I i10, boolean z10, String str, L1.i iVar, C17631a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, i10, z10, str, iVar, aVar);
    }

    /* access modifiers changed from: private */
    public final boolean Q2() {
        return d.g(this) || C5605k.c(this);
    }

    /* access modifiers changed from: private */
    public final void S2() {
        if (this.f17527B == null) {
            r0.g gVar = new r0.g();
            m mVar = this.f17533p;
            if (mVar != null) {
                F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new c(mVar, gVar, (C17164e<? super c>) null), 3, (Object) null);
            }
            this.f17527B = gVar;
        }
    }

    /* access modifiers changed from: private */
    public final void T2() {
        r0.g gVar = this.f17527B;
        if (gVar != null) {
            r0.h hVar = new r0.h(gVar);
            m mVar = this.f17533p;
            if (mVar != null) {
                F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new d(mVar, hVar, (C17164e<? super d>) null), 3, (Object) null);
            }
            this.f17527B = null;
        }
    }

    private final void X2() {
        C5586I i10;
        if (this.f17543z == null && (i10 = this.f17534q) != null) {
            if (this.f17533p == null) {
                this.f17533p = r0.l.a();
            }
            this.f17541x.I2(this.f17533p);
            m mVar = this.f17533p;
            C17542s.g(mVar);
            C4507j a10 = i10.a(mVar);
            C2(a10);
            this.f17543z = a10;
        }
    }

    private final boolean Z2() {
        return this.f17530E == null && this.f17534q != null;
    }

    public final void J(C5635o oVar) {
        if (oVar.a()) {
            X2();
        }
        if (this.f17537t) {
            this.f17541x.J(oVar);
        }
    }

    public void O2(x xVar) {
    }

    public abstract Object P2(K k10, C17164e<? super C16807N> eVar);

    /* access modifiers changed from: protected */
    public final void R2() {
        m mVar = this.f17533p;
        if (mVar != null) {
            o.b bVar = this.f17526A;
            if (bVar != null) {
                mVar.a(new o.a(bVar));
            }
            r0.g gVar = this.f17527B;
            if (gVar != null) {
                mVar.a(new r0.h(gVar));
            }
            for (o.b aVar : this.f17528C.values()) {
                mVar.a(new o.a(aVar));
            }
        }
        this.f17526A = null;
        this.f17527B = null;
        this.f17528C.clear();
    }

    public Object T() {
        return this.f17532G;
    }

    public final void T1(C4349p pVar, r rVar, long j10) {
        long b10 = s.b(j10);
        this.f17529D = C5668h.a((float) n.h(b10), (float) n.i(b10));
        X2();
        if (this.f17537t && rVar == r.Main) {
            int g10 = pVar.g();
            C4352t.a aVar = C4352t.f4431a;
            if (C4352t.i(g10, aVar.a())) {
                F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new h(this, (C17164e<? super h>) null), 3, (Object) null);
            } else if (C4352t.i(g10, aVar.b())) {
                F0 unused2 = C16314k.d(c2(), (C17168i) null, (T) null, new i(this, (C17164e<? super i>) null), 3, (Object) null);
            }
        }
        if (this.f17542y == null) {
            this.f17542y = (W) C2(U.a(new j(this, (C17164e<? super j>) null)));
        }
        W w10 = this.f17542y;
        if (w10 != null) {
            w10.T1(pVar, rVar, j10);
        }
    }

    public final boolean U1() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean U2() {
        return this.f17537t;
    }

    /* access modifiers changed from: protected */
    public final C17631a<C16807N> V2() {
        return this.f17538u;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r9 = QJ.S.f(new androidx.compose.foundation.a.e(r9, r10, r4, r8, (dI.C17164e<? super androidx.compose.foundation.a.e>) null), r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object W2(p0.w r9, long r10, dI.C17164e<? super XH.C16807N> r12) {
        /*
            r8 = this;
            r0.m r4 = r8.f17533p
            if (r4 == 0) goto L_0x0019
            androidx.compose.foundation.a$e r7 = new androidx.compose.foundation.a$e
            r6 = 0
            r0 = r7
            r1 = r9
            r2 = r10
            r5 = r8
            r0.<init>(r1, r2, r4, r5, r6)
            java.lang.Object r9 = QJ.S.f(r7, r12)
            java.lang.Object r10 = eI.C17187b.f()
            if (r9 != r10) goto L_0x0019
            return r9
        L_0x0019:
            XH.N r9 = XH.C16807N.f139792a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.W2(p0.w, long, dI.e):java.lang.Object");
    }

    public final boolean Y0(KeyEvent keyEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final C16807N Y2() {
        W w10 = this.f17542y;
        if (w10 == null) {
            return null;
        }
        w10.W0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r2.f17543z == null) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a3(r0.m r3, n0.C5586I r4, boolean r5, java.lang.String r6, L1.i r7, nI.C17631a<XH.C16807N> r8) {
        /*
            r2 = this;
            r0.m r0 = r2.f17530E
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r3)
            r1 = 1
            if (r0 != 0) goto L_0x0012
            r2.R2()
            r2.f17530E = r3
            r2.f17533p = r3
            r3 = r1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            n0.I r0 = r2.f17534q
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r4)
            if (r0 != 0) goto L_0x001e
            r2.f17534q = r4
            r3 = r1
        L_0x001e:
            boolean r4 = r2.f17537t
            if (r4 == r5) goto L_0x0041
            if (r5 == 0) goto L_0x002f
            n0.x r4 = r2.f17540w
            r2.C2(r4)
            n0.z r4 = r2.f17541x
            r2.C2(r4)
            goto L_0x003c
        L_0x002f:
            n0.x r4 = r2.f17540w
            r2.F2(r4)
            n0.z r4 = r2.f17541x
            r2.F2(r4)
            r2.R2()
        L_0x003c:
            G1.x0.b(r2)
            r2.f17537t = r5
        L_0x0041:
            java.lang.String r4 = r2.f17535r
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
            if (r4 != 0) goto L_0x004e
            r2.f17535r = r6
            G1.x0.b(r2)
        L_0x004e:
            L1.i r4 = r2.f17536s
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x005b
            r2.f17536s = r7
            G1.x0.b(r2)
        L_0x005b:
            r2.f17538u = r8
            boolean r4 = r2.f17531F
            boolean r5 = r2.Z2()
            if (r4 == r5) goto L_0x0072
            boolean r4 = r2.Z2()
            r2.f17531F = r4
            if (r4 != 0) goto L_0x0072
            G1.j r4 = r2.f17543z
            if (r4 != 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r1 = r3
        L_0x0073:
            if (r1 == 0) goto L_0x0088
            G1.j r3 = r2.f17543z
            if (r3 != 0) goto L_0x007d
            boolean r4 = r2.f17531F
            if (r4 != 0) goto L_0x0088
        L_0x007d:
            if (r3 == 0) goto L_0x0082
            r2.F2(r3)
        L_0x0082:
            r3 = 0
            r2.f17543z = r3
            r2.X2()
        L_0x0088:
            n0.z r3 = r2.f17541x
            r0.m r4 = r2.f17533p
            r3.I2(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.a3(r0.m, n0.I, boolean, java.lang.String, L1.i, nI.a):void");
    }

    public final boolean h2() {
        return this.f17539v;
    }

    public final void m0(x xVar) {
        L1.i iVar = this.f17536s;
        if (iVar != null) {
            C17542s.g(iVar);
            v.l0(xVar, iVar.n());
        }
        v.A(xVar, this.f17535r, new b(this));
        if (this.f17537t) {
            this.f17541x.m0(xVar);
        } else {
            v.l(xVar);
        }
        O2(xVar);
    }

    public final void m2() {
        if (!this.f17531F) {
            X2();
        }
        if (this.f17537t) {
            C2(this.f17540w);
            C2(this.f17541x);
        }
    }

    public final void n2() {
        R2();
        if (this.f17530E == null) {
            this.f17533p = null;
        }
        C4507j jVar = this.f17543z;
        if (jVar != null) {
            F2(jVar);
        }
        this.f17543z = null;
    }

    public final boolean p1(KeyEvent keyEvent) {
        X2();
        if (!this.f17537t || !C5605k.f(keyEvent)) {
            if (!this.f17537t || !C5605k.b(keyEvent)) {
                return false;
            }
            o.b remove = this.f17528C.remove(C6253a.q(C6256d.a(keyEvent)));
            if (!(remove == null || this.f17533p == null)) {
                F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new g(this, remove, (C17164e<? super g>) null), 3, (Object) null);
            }
            this.f17538u.invoke();
        } else if (this.f17528C.containsKey(C6253a.q(C6256d.a(keyEvent)))) {
            return false;
        } else {
            o.b bVar = new o.b(this.f17529D, (DefaultConstructorMarker) null);
            this.f17528C.put(C6253a.q(C6256d.a(keyEvent)), bVar);
            if (this.f17533p != null) {
                F0 unused2 = C16314k.d(c2(), (C17168i) null, (T) null, new f(this, bVar, (C17164e<? super f>) null), 3, (Object) null);
            }
        }
        return true;
    }

    public final void s1() {
        r0.g gVar;
        m mVar = this.f17533p;
        if (!(mVar == null || (gVar = this.f17527B) == null)) {
            mVar.a(new r0.h(gVar));
        }
        this.f17527B = null;
        W w10 = this.f17542y;
        if (w10 != null) {
            w10.s1();
        }
    }

    private a(m mVar, C5586I i10, boolean z10, String str, L1.i iVar, C17631a<C16807N> aVar) {
        this.f17533p = mVar;
        this.f17534q = i10;
        this.f17535r = str;
        this.f17536s = iVar;
        this.f17537t = z10;
        this.f17538u = aVar;
        this.f17540w = new C5618x();
        this.f17541x = new C5620z(this.f17533p);
        this.f17528C = new LinkedHashMap();
        this.f17529D = C5667g.f26701b.c();
        this.f17530E = this.f17533p;
        this.f17531F = Z2();
        this.f17532G = f17524H;
    }
}
