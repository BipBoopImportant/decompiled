package androidx.compose.animation;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import U0.A1;
import XH.C16807N;
import c2.n;
import c2.r;
import c2.s;
import c2.t;
import i1.C5437c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import l0.k;
import l0.p;
import l0.q;
import m0.C5556n;
import m0.N;
import m0.v0;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ&\u0010%\u001a\u00020$*\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J \u0010'\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001aR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R:\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R:\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\b\u0012\u0010H\"\u0004\bI\u0010JR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001c\u0010V\u001a\u00020\u00068\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bT\u0010UR*\u0010[\u001a\u00020\"2\u0006\u0010W\u001a\u00020\"8\u0002@BX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bX\u0010U\"\u0004\bY\u0010ZR$\u0010c\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR/\u0010k\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060f0d8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR/\u0010n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0f0d8\u0006¢\u0006\f\n\u0004\bl\u0010h\u001a\u0004\bm\u0010jR\u0013\u0010p\u001a\u0004\u0018\u00010\\8F¢\u0006\u0006\u001a\u0004\bo\u0010`\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, d2 = {"Landroidx/compose/animation/h;", "Ll0/q;", "Lm0/v0;", "Ll0/k;", "transition", "Lm0/v0$a;", "Lc2/r;", "Lm0/n;", "sizeAnimation", "Lc2/n;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/i;", "enter", "Landroidx/compose/animation/k;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Ll0/p;", "graphicsLayerBlock", "<init>", "(Lm0/v0;Lm0/v0$a;Lm0/v0$a;Lm0/v0$a;Landroidx/compose/animation/i;Landroidx/compose/animation/k;LnI/a;Ll0/p;)V", "targetState", "fullSize", "O2", "(Ll0/k;J)J", "LXH/N;", "m2", "()V", "Q2", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "P2", "n", "Lm0/v0;", "getTransition", "()Lm0/v0;", "N2", "(Lm0/v0;)V", "o", "Lm0/v0$a;", "getSizeAnimation", "()Lm0/v0$a;", "L2", "(Lm0/v0$a;)V", "p", "getOffsetAnimation", "K2", "q", "getSlideAnimation", "M2", "r", "Landroidx/compose/animation/i;", "D2", "()Landroidx/compose/animation/i;", "G2", "(Landroidx/compose/animation/i;)V", "s", "Landroidx/compose/animation/k;", "E2", "()Landroidx/compose/animation/k;", "H2", "(Landroidx/compose/animation/k;)V", "t", "LnI/a;", "()LnI/a;", "F2", "(LnI/a;)V", "u", "Ll0/p;", "getGraphicsLayerBlock", "()Ll0/p;", "I2", "(Ll0/p;)V", "v", "Z", "lookaheadConstraintsAvailable", "w", "J", "lookaheadSize", "value", "x", "J2", "(J)V", "lookaheadConstraints", "Li1/c;", "y", "Li1/c;", "getCurrentAlignment", "()Li1/c;", "setCurrentAlignment", "(Li1/c;)V", "currentAlignment", "Lkotlin/Function1;", "Lm0/v0$b;", "Lm0/N;", "z", "LnI/l;", "getSizeTransitionSpec", "()LnI/l;", "sizeTransitionSpec", "A", "getSlideSpec", "slideSpec", "C2", "alignment", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class h extends q {

    /* renamed from: A  reason: collision with root package name */
    private final C17642l<v0.b<k>, N<n>> f17419A = new j(this);

    /* renamed from: n  reason: collision with root package name */
    private v0<k> f17420n;

    /* renamed from: o  reason: collision with root package name */
    private v0<k>.defpackage.a<r, C5556n> f17421o;

    /* renamed from: p  reason: collision with root package name */
    private v0<k>.defpackage.a<n, C5556n> f17422p;

    /* renamed from: q  reason: collision with root package name */
    private v0<k>.defpackage.a<n, C5556n> f17423q;

    /* renamed from: r  reason: collision with root package name */
    private i f17424r;

    /* renamed from: s  reason: collision with root package name */
    private k f17425s;

    /* renamed from: t  reason: collision with root package name */
    private C17631a<Boolean> f17426t;

    /* renamed from: u  reason: collision with root package name */
    private p f17427u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f17428v;

    /* renamed from: w  reason: collision with root package name */
    private long f17429w = f.c();

    /* renamed from: x  reason: collision with root package name */
    private long f17430x = c2.c.b(0, 0, 0, 0, 15, (Object) null);

    /* renamed from: y  reason: collision with root package name */
    private C5437c f17431y;

    /* renamed from: z  reason: collision with root package name */
    private final C17642l<v0.b<k>, N<r>> f17432z = new i(this);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17433a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                l0.k[] r0 = l0.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                l0.k r1 = l0.k.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                l0.k r1 = l0.k.PreEnter     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                l0.k r1 = l0.k.PostExit     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f17433a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.h.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f17434c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a0 a0Var) {
            super(1);
            this.f17434c = a0Var;
        }

        public final void a(a0.a aVar) {
            a0.a.i(aVar, this.f17434c, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f17435c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f17436d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f17437e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.ui.graphics.c, C16807N> f17438f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a0 a0Var, long j10, long j11, C17642l<? super androidx.compose.ui.graphics.c, C16807N> lVar) {
            super(1);
            this.f17435c = a0Var;
            this.f17436d = j10;
            this.f17437e = j11;
            this.f17438f = lVar;
        }

        public final void a(a0.a aVar) {
            a0.a aVar2 = aVar;
            aVar2.v(this.f17435c, n.h(this.f17437e) + n.h(this.f17436d), n.i(this.f17437e) + n.i(this.f17436d), 0.0f, this.f17438f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f17439c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a0 a0Var) {
            super(1);
            this.f17439c = a0Var;
        }

        public final void a(a0.a aVar) {
            a0.a.i(aVar, this.f17439c, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/k;", "it", "Lc2/r;", "a", "(Ll0/k;)J"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<k, r> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f17440c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f17441d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(h hVar, long j10) {
            super(1);
            this.f17440c = hVar;
            this.f17441d = j10;
        }

        public final long a(k kVar) {
            return this.f17440c.O2(kVar, this.f17441d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return r.b(a((k) obj));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/v0$b;", "Ll0/k;", "Lm0/N;", "Lc2/n;", "a", "(Lm0/v0$b;)Lm0/N;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<v0.b<k>, N<n>> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f17442c = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final N<n> invoke(v0.b<k> bVar) {
            return g.f17376c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/k;", "it", "Lc2/n;", "a", "(Ll0/k;)J"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<k, n> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f17443c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f17444d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(h hVar, long j10) {
            super(1);
            this.f17443c = hVar;
            this.f17444d = j10;
        }

        public final long a(k kVar) {
            return this.f17443c.Q2(kVar, this.f17444d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n.b(a((k) obj));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/k;", "it", "Lc2/n;", "a", "(Ll0/k;)J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.animation.h$h  reason: collision with other inner class name */
    static final class C0243h extends C17544u implements C17642l<k, n> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f17445c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f17446d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0243h(h hVar, long j10) {
            super(1);
            this.f17445c = hVar;
            this.f17446d = j10;
        }

        public final long a(k kVar) {
            return this.f17445c.P2(kVar, this.f17446d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n.b(a((k) obj));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/v0$b;", "Ll0/k;", "Lm0/N;", "Lc2/r;", "a", "(Lm0/v0$b;)Lm0/N;"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17642l<v0.b<k>, N<r>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f17447c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h hVar) {
            super(1);
            this.f17447c = hVar;
        }

        /* renamed from: a */
        public final N<r> invoke(v0.b<k> bVar) {
            k kVar = k.PreEnter;
            k kVar2 = k.Visible;
            N<r> n10 = null;
            if (bVar.h(kVar, kVar2)) {
                l0.g a10 = this.f17447c.D2().b().a();
                if (a10 != null) {
                    n10 = a10.b();
                }
            } else if (bVar.h(kVar2, k.PostExit)) {
                l0.g a11 = this.f17447c.E2().b().a();
                if (a11 != null) {
                    n10 = a11.b();
                }
            } else {
                n10 = g.f17377d;
            }
            return n10 == null ? g.f17377d : n10;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/v0$b;", "Ll0/k;", "Lm0/N;", "Lc2/n;", "a", "(Lm0/v0$b;)Lm0/N;"}, k = 3, mv = {1, 8, 0})
    static final class j extends C17544u implements C17642l<v0.b<k>, N<n>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f17448c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(h hVar) {
            super(1);
            this.f17448c = hVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
            r3 = r3.a();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final m0.N<c2.n> invoke(m0.v0.b<l0.k> r3) {
            /*
                r2 = this;
                l0.k r0 = l0.k.PreEnter
                l0.k r1 = l0.k.Visible
                boolean r0 = r3.h(r0, r1)
                if (r0 == 0) goto L_0x0025
                androidx.compose.animation.h r3 = r2.f17448c
                androidx.compose.animation.i r3 = r3.D2()
                l0.A r3 = r3.b()
                l0.w r3 = r3.f()
                if (r3 == 0) goto L_0x0020
                m0.N r3 = r3.a()
                if (r3 != 0) goto L_0x004c
            L_0x0020:
                m0.o0 r3 = androidx.compose.animation.g.f17376c
                goto L_0x004c
            L_0x0025:
                l0.k r0 = l0.k.PostExit
                boolean r3 = r3.h(r1, r0)
                if (r3 == 0) goto L_0x0048
                androidx.compose.animation.h r3 = r2.f17448c
                androidx.compose.animation.k r3 = r3.E2()
                l0.A r3 = r3.b()
                l0.w r3 = r3.f()
                if (r3 == 0) goto L_0x0043
                m0.N r3 = r3.a()
                if (r3 != 0) goto L_0x004c
            L_0x0043:
                m0.o0 r3 = androidx.compose.animation.g.f17376c
                goto L_0x004c
            L_0x0048:
                m0.o0 r3 = androidx.compose.animation.g.f17376c
            L_0x004c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.h.j.invoke(m0.v0$b):m0.N");
        }
    }

    public h(v0<k> v0Var, v0<k>.defpackage.a<r, C5556n> aVar, v0<k>.defpackage.a<n, C5556n> aVar2, v0<k>.defpackage.a<n, C5556n> aVar3, i iVar, k kVar, C17631a<Boolean> aVar4, p pVar) {
        this.f17420n = v0Var;
        this.f17421o = aVar;
        this.f17422p = aVar2;
        this.f17423q = aVar3;
        this.f17424r = iVar;
        this.f17425s = kVar;
        this.f17426t = aVar4;
        this.f17427u = pVar;
    }

    private final void J2(long j10) {
        this.f17428v = true;
        this.f17430x = j10;
    }

    public final C5437c C2() {
        C5437c a10;
        if (this.f17420n.n().h(k.PreEnter, k.Visible)) {
            l0.g a11 = this.f17424r.b().a();
            if (a11 == null || (a10 = a11.a()) == null) {
                l0.g a12 = this.f17425s.b().a();
                if (a12 != null) {
                    return a12.a();
                }
                return null;
            }
        } else {
            l0.g a13 = this.f17425s.b().a();
            if (a13 == null || (a10 = a13.a()) == null) {
                l0.g a14 = this.f17424r.b().a();
                if (a14 != null) {
                    return a14.a();
                }
                return null;
            }
        }
        return a10;
    }

    public final i D2() {
        return this.f17424r;
    }

    public final k E2() {
        return this.f17425s;
    }

    public final void F2(C17631a<Boolean> aVar) {
        this.f17426t = aVar;
    }

    public final void G2(i iVar) {
        this.f17424r = iVar;
    }

    public final void H2(k kVar) {
        this.f17425s = kVar;
    }

    public final void I2(p pVar) {
        this.f17427u = pVar;
    }

    public final void K2(v0<k>.defpackage.a<n, C5556n> aVar) {
        this.f17422p = aVar;
    }

    public final void L2(v0<k>.defpackage.a<r, C5556n> aVar) {
        this.f17421o = aVar;
    }

    public final void M2(v0<k>.defpackage.a<n, C5556n> aVar) {
        this.f17423q = aVar;
    }

    public final void N2(v0<k> v0Var) {
        this.f17420n = v0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r2 = r2.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long O2(l0.k r2, long r3) {
        /*
            r1 = this;
            int[] r0 = androidx.compose.animation.h.a.f17433a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L_0x0058
            r0 = 2
            if (r2 == r0) goto L_0x0038
            r0 = 3
            if (r2 != r0) goto L_0x0032
            androidx.compose.animation.k r2 = r1.f17425s
            l0.A r2 = r2.b()
            l0.g r2 = r2.a()
            if (r2 == 0) goto L_0x0058
            nI.l r2 = r2.d()
            if (r2 == 0) goto L_0x0058
            c2.r r3 = c2.r.b(r3)
            java.lang.Object r2 = r2.invoke(r3)
            c2.r r2 = (c2.r) r2
            long r3 = r2.k()
            goto L_0x0058
        L_0x0032:
            XH.t r2 = new XH.t
            r2.<init>()
            throw r2
        L_0x0038:
            androidx.compose.animation.i r2 = r1.f17424r
            l0.A r2 = r2.b()
            l0.g r2 = r2.a()
            if (r2 == 0) goto L_0x0058
            nI.l r2 = r2.d()
            if (r2 == 0) goto L_0x0058
            c2.r r3 = c2.r.b(r3)
            java.lang.Object r2 = r2.invoke(r3)
            c2.r r2 = (c2.r) r2
            long r3 = r2.k()
        L_0x0058:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.h.O2(l0.k, long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long P2(l0.k r4, long r5) {
        /*
            r3 = this;
            androidx.compose.animation.i r0 = r3.f17424r
            l0.A r0 = r0.b()
            l0.w r0 = r0.f()
            if (r0 == 0) goto L_0x0021
            nI.l r0 = r0.b()
            if (r0 == 0) goto L_0x0021
            c2.r r1 = c2.r.b(r5)
            java.lang.Object r0 = r0.invoke(r1)
            c2.n r0 = (c2.n) r0
            long r0 = r0.n()
            goto L_0x0027
        L_0x0021:
            c2.n$a r0 = c2.n.f23044b
            long r0 = r0.a()
        L_0x0027:
            androidx.compose.animation.k r2 = r3.f17425s
            l0.A r2 = r2.b()
            l0.w r2 = r2.f()
            if (r2 == 0) goto L_0x0048
            nI.l r2 = r2.b()
            if (r2 == 0) goto L_0x0048
            c2.r r5 = c2.r.b(r5)
            java.lang.Object r5 = r2.invoke(r5)
            c2.n r5 = (c2.n) r5
            long r5 = r5.n()
            goto L_0x004e
        L_0x0048:
            c2.n$a r5 = c2.n.f23044b
            long r5 = r5.a()
        L_0x004e:
            int[] r2 = androidx.compose.animation.h.a.f17433a
            int r4 = r4.ordinal()
            r4 = r2[r4]
            r2 = 1
            if (r4 == r2) goto L_0x0067
            r2 = 2
            if (r4 == r2) goto L_0x006d
            r0 = 3
            if (r4 != r0) goto L_0x0061
            r0 = r5
            goto L_0x006d
        L_0x0061:
            XH.t r4 = new XH.t
            r4.<init>()
            throw r4
        L_0x0067:
            c2.n$a r4 = c2.n.f23044b
            long r0 = r4.a()
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.h.P2(l0.k, long):long");
    }

    public final long Q2(k kVar, long j10) {
        if (this.f17431y == null) {
            return n.f23044b.a();
        }
        if (C2() == null) {
            return n.f23044b.a();
        }
        if (C17542s.e(this.f17431y, C2())) {
            return n.f23044b.a();
        }
        int i10 = a.f17433a[kVar.ordinal()];
        if (i10 == 1) {
            return n.f23044b.a();
        }
        if (i10 == 2) {
            return n.f23044b.a();
        }
        if (i10 == 3) {
            l0.g a10 = this.f17425s.b().a();
            if (a10 == null) {
                return n.f23044b.a();
            }
            long k10 = a10.d().invoke(r.b(j10)).k();
            C5437c C22 = C2();
            C17542s.g(C22);
            long j11 = j10;
            long j12 = k10;
            t tVar = t.Ltr;
            long a11 = C22.a(j11, j12, tVar);
            C5437c cVar = this.f17431y;
            C17542s.g(cVar);
            return n.k(a11, cVar.a(j11, j12, tVar));
        }
        throw new XH.t();
    }

    public J h(K k10, H h10, long j10) {
        A1<n> a10;
        A1<n> a11;
        long j11 = j10;
        A1<r> a12 = null;
        if (this.f17420n.i() == this.f17420n.p()) {
            this.f17431y = null;
        } else if (this.f17431y == null) {
            C5437c C22 = C2();
            if (C22 == null) {
                C22 = C5437c.f24302a.o();
            }
            this.f17431y = C22;
        }
        if (k10.A0()) {
            a0 i02 = h10.i0(j10);
            long a13 = s.a(i02.E0(), i02.z0());
            this.f17429w = a13;
            J2(j11);
            return K.v0(k10, r.h(a13), r.g(a13), (Map) null, new b(i02), 4, (Object) null);
        } else if (this.f17426t.invoke().booleanValue()) {
            C17642l<androidx.compose.ui.graphics.c, C16807N> a14 = this.f17427u.a();
            a0 i03 = h10.i0(j10);
            long a15 = s.a(i03.E0(), i03.z0());
            long j12 = f.d(this.f17429w) ? this.f17429w : a15;
            v0<k>.defpackage.a<r, C5556n> aVar = this.f17421o;
            if (aVar != null) {
                a12 = aVar.a(this.f17432z, new e(this, j12));
            }
            if (a12 != null) {
                a15 = a12.getValue().k();
            }
            long f10 = c2.c.f(j11, a15);
            v0<k>.defpackage.a<n, C5556n> aVar2 = this.f17422p;
            long a16 = (aVar2 == null || (a11 = aVar2.a(f.f17442c, new g(this, j12))) == null) ? n.f23044b.a() : a11.getValue().n();
            v0<k>.defpackage.a<n, C5556n> aVar3 = this.f17423q;
            long a17 = (aVar3 == null || (a10 = aVar3.a(this.f17419A, new C0243h(this, j12))) == null) ? n.f23044b.a() : a10.getValue().n();
            C5437c cVar = this.f17431y;
            return K.v0(k10, r.h(f10), r.g(f10), (Map) null, new c(i03, n.l(cVar != null ? cVar.a(j12, f10, t.Ltr) : n.f23044b.a(), a17), a16, a14), 4, (Object) null);
        } else {
            a0 i04 = h10.i0(j10);
            return K.v0(k10, i04.E0(), i04.z0(), (Map) null, new d(i04), 4, (Object) null);
        }
    }

    public void m2() {
        super.m2();
        this.f17428v = false;
        this.f17429w = f.c();
    }
}
