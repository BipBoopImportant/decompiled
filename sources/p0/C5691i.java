package p0;

import E1.C4488v;
import G1.A;
import G1.C4505h;
import G1.C4506i;
import G1.C4508k;
import QJ.C16320n;
import QJ.C16324p;
import QJ.F0;
import QJ.I0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import androidx.compose.ui.d;
import c2.r;
import c2.s;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import n0.C5589L;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import o1.C5673m;
import y0.C6249c;
import z1.e;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001YB)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\"\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\t*\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\"\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020'*\u00020\u001c2\u0006\u0010&\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020'*\u00020*2\u0006\u0010&\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.J \u00100\u001a\u00020\u00142\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110/H@¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\u001a\u00106\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J'\u00108\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b8\u00109R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010>R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010D\u001a\u00020\t8\u0016XD¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u0001028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010>R*\u0010V\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u001c8\u0000@BX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010>\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Lp0/i;", "Landroidx/compose/ui/d$c;", "Ly0/c;", "LG1/A;", "LG1/h;", "Lp0/v;", "orientation", "Lp0/F;", "scrollingLogic", "", "reverseDirection", "Lp0/g;", "bringIntoViewSpec", "<init>", "(Lp0/v;Lp0/F;ZLp0/g;)V", "Y2", "()Lp0/g;", "Lo1/i;", "R2", "()Lo1/i;", "LXH/N;", "V2", "()V", "", "M2", "(Lp0/g;)F", "Q2", "childBounds", "Lc2/r;", "containerSize", "P2", "(Lo1/i;J)Lo1/i;", "size", "T2", "(Lo1/i;J)Z", "Lo1/g;", "X2", "(Lo1/i;J)J", "other", "", "N2", "(JJ)I", "Lo1/m;", "O2", "localRect", "n0", "(Lo1/i;)Lo1/i;", "Lkotlin/Function0;", "Y1", "(LnI/a;LdI/e;)Ljava/lang/Object;", "LE1/v;", "newBounds", "W2", "(LE1/v;)V", "p", "(J)V", "Z2", "(Lp0/v;ZLp0/g;)V", "n", "Lp0/v;", "o", "Lp0/F;", "Z", "q", "Lp0/g;", "r", "h2", "()Z", "shouldAutoInvalidate", "Lp0/f;", "s", "Lp0/f;", "bringIntoViewRequests", "t", "LE1/v;", "focusedChild", "u", "Lo1/i;", "focusedChildBoundsFromPreviousRemeasure", "v", "trackingFocusedChild", "<set-?>", "w", "J", "S2", "()J", "viewportSize", "x", "isAnimationRunning", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p0.i  reason: case insensitive filesystem */
public final class C5691i extends d.c implements C6249c, A, C4505h {

    /* renamed from: n  reason: collision with root package name */
    private v f27009n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final F f27010o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f27011p;

    /* renamed from: q  reason: collision with root package name */
    private C5689g f27012q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f27013r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C5688f f27014s = new C5688f();

    /* renamed from: t  reason: collision with root package name */
    private C4488v f27015t;

    /* renamed from: u  reason: collision with root package name */
    private C5669i f27016u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public boolean f27017v;

    /* renamed from: w  reason: collision with root package name */
    private long f27018w = r.f23053b.a();
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public boolean f27019x;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Lp0/i$a;", "", "Lkotlin/Function0;", "Lo1/i;", "currentBounds", "LQJ/n;", "LXH/N;", "continuation", "<init>", "(LnI/a;LQJ/n;)V", "", "toString", "()Ljava/lang/String;", "a", "LnI/a;", "b", "()LnI/a;", "LQJ/n;", "()LQJ/n;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: p0.i$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C17631a<C5669i> f27020a;

        /* renamed from: b  reason: collision with root package name */
        private final C16320n<C16807N> f27021b;

        public a(C17631a<C5669i> aVar, C16320n<? super C16807N> nVar) {
            this.f27020a = aVar;
            this.f27021b = nVar;
        }

        public final C16320n<C16807N> a() {
            return this.f27021b;
        }

        public final C17631a<C5669i> b() {
            return this.f27020a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
            if (r0 == null) goto L_0x0050;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r4 = this;
                QJ.n<XH.N> r0 = r4.f27021b
                dI.i r0 = r0.getContext()
                QJ.P$a r1 = QJ.P.f137597b
                dI.i$b r0 = r0.get(r1)
                QJ.P r0 = (QJ.P) r0
                if (r0 == 0) goto L_0x0015
                java.lang.String r0 = r0.E0()
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = HJ.C15835a.a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                kotlin.jvm.internal.C17542s.i(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L_0x0050
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L_0x0052
            L_0x0050:
                java.lang.String r0 = "("
            L_0x0052:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                nI.a<o1.i> r0 = r4.f27020a
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                QJ.n<XH.N> r0 = r4.f27021b
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.C5691i.a.toString():java.lang.String");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: p0.i$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27022a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                p0.v[] r0 = p0.v.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p0.v r1 = p0.v.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                p0.v r1 = p0.v.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f27022a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.C5691i.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {196}, m = "invokeSuspend")
    /* renamed from: p0.i$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f27023c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f27024d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5691i f27025e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ L f27026f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5689g f27027g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/u;", "LXH/N;", "<anonymous>", "(Lp0/u;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {201}, m = "invokeSuspend")
        /* renamed from: p0.i$c$a */
        static final class a extends l implements p<u, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f27028c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f27029d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ L f27030e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C5691i f27031f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C5689g f27032g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ F0 f27033h;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "LXH/N;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: p0.i$c$a$a  reason: collision with other inner class name */
            static final class C0439a extends C17544u implements C17642l<Float, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C5691i f27034c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ L f27035d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ F0 f27036e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ u f27037f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0439a(C5691i iVar, L l10, F0 f02, u uVar) {
                    super(1);
                    this.f27034c = iVar;
                    this.f27035d = l10;
                    this.f27036e = f02;
                    this.f27037f = uVar;
                }

                public final void a(float f10) {
                    float f11 = this.f27034c.f27011p ? 1.0f : -1.0f;
                    F G22 = this.f27034c.f27010o;
                    float A10 = f11 * G22.A(G22.u(this.f27037f.b(G22.u(G22.B(f11 * f10)), e.f32374a.b())));
                    if (Math.abs(A10) < Math.abs(f10)) {
                        F0 f02 = this.f27036e;
                        J0.e(f02, "Scroll animation cancelled because scroll was not consumed (" + A10 + " < " + f10 + ')', (Throwable) null, 2, (Object) null);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((Number) obj).floatValue());
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: p0.i$c$a$b */
            static final class b extends C17544u implements C17631a<C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C5691i f27038c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ L f27039d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C5689g f27040e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(C5691i iVar, L l10, C5689g gVar) {
                    super(0);
                    this.f27038c = iVar;
                    this.f27039d = l10;
                    this.f27040e = gVar;
                }

                public final void invoke() {
                    boolean z10;
                    boolean z11;
                    C5688f D22 = this.f27038c.f27014s;
                    C5691i iVar = this.f27038c;
                    while (true) {
                        z10 = true;
                        if (D22.f26996a.v()) {
                            C5669i invoke = ((a) D22.f26996a.w()).b().invoke();
                            if (invoke == null) {
                                z11 = true;
                            } else {
                                z11 = C5691i.U2(iVar, invoke, 0, 1, (Object) null);
                            }
                            if (!z11) {
                                break;
                            }
                            ((a) D22.f26996a.B(D22.f26996a.r() - 1)).a().resumeWith(x.b(C16807N.f139792a));
                        } else {
                            break;
                        }
                    }
                    if (this.f27038c.f27017v) {
                        C5669i E22 = this.f27038c.R2();
                        if (E22 == null || !C5691i.U2(this.f27038c, E22, 0, 1, (Object) null)) {
                            z10 = false;
                        }
                        if (z10) {
                            this.f27038c.f27017v = false;
                        }
                    }
                    this.f27039d.j(this.f27038c.M2(this.f27040e));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(L l10, C5691i iVar, C5689g gVar, F0 f02, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f27030e = l10;
                this.f27031f = iVar;
                this.f27032g = gVar;
                this.f27033h = f02;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f27030e, this.f27031f, this.f27032g, this.f27033h, eVar);
                aVar.f27029d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(u uVar, C17164e<? super C16807N> eVar) {
                return ((a) create(uVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f27028c;
                if (i10 == 0) {
                    y.b(obj);
                    this.f27030e.j(this.f27031f.M2(this.f27032g));
                    L l10 = this.f27030e;
                    C0439a aVar = new C0439a(this.f27031f, l10, this.f27033h, (u) this.f27029d);
                    b bVar = new b(this.f27031f, this.f27030e, this.f27032g);
                    this.f27028c = 1;
                    if (l10.h(aVar, bVar, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5691i iVar, L l10, C5689g gVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f27025e = iVar;
            this.f27026f = l10;
            this.f27027g = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f27025e, this.f27026f, this.f27027g, eVar);
            cVar.f27024d = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            CancellationException cancellationException;
            Object f10 = C17187b.f();
            int i10 = this.f27023c;
            if (i10 == 0) {
                y.b(obj);
                F0 m10 = I0.m(((Q) this.f27024d).getCoroutineContext());
                this.f27025e.f27019x = true;
                F G22 = this.f27025e.f27010o;
                C5589L l10 = C5589L.Default;
                a aVar = new a(this.f27026f, this.f27025e, this.f27027g, m10, (C17164e<? super a>) null);
                this.f27023c = 1;
                if (G22.v(l10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (CancellationException e10) {
                    cancellationException = e10;
                    throw cancellationException;
                } catch (Throwable th2) {
                    this.f27025e.f27019x = false;
                    this.f27025e.f27014s.b(cancellationException);
                    this.f27025e.f27017v = false;
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f27025e.f27014s.d();
            this.f27025e.f27019x = false;
            this.f27025e.f27014s.b((Throwable) null);
            this.f27025e.f27017v = false;
            return C16807N.f139792a;
        }
    }

    public C5691i(v vVar, F f10, boolean z10, C5689g gVar) {
        this.f27009n = vVar;
        this.f27010o = f10;
        this.f27011p = z10;
        this.f27012q = gVar;
    }

    /* access modifiers changed from: private */
    public final float M2(C5689g gVar) {
        if (r.f(this.f27018w, r.f23053b.a())) {
            return 0.0f;
        }
        C5669i Q22 = Q2();
        if (Q22 == null) {
            Q22 = this.f27017v ? R2() : null;
            if (Q22 == null) {
                return 0.0f;
            }
        }
        long d10 = s.d(this.f27018w);
        int i10 = b.f27022a[this.f27009n.ordinal()];
        if (i10 == 1) {
            return gVar.a(Q22.r(), Q22.j() - Q22.r(), C5673m.i(d10));
        }
        if (i10 == 2) {
            return gVar.a(Q22.o(), Q22.p() - Q22.o(), C5673m.l(d10));
        }
        throw new t();
    }

    private final int N2(long j10, long j11) {
        int i10 = b.f27022a[this.f27009n.ordinal()];
        if (i10 == 1) {
            return C17542s.l(r.g(j10), r.g(j11));
        }
        if (i10 == 2) {
            return C17542s.l(r.h(j10), r.h(j11));
        }
        throw new t();
    }

    private final int O2(long j10, long j11) {
        int i10 = b.f27022a[this.f27009n.ordinal()];
        if (i10 == 1) {
            return Float.compare(C5673m.i(j10), C5673m.i(j11));
        }
        if (i10 == 2) {
            return Float.compare(C5673m.l(j10), C5673m.l(j11));
        }
        throw new t();
    }

    private final C5669i P2(C5669i iVar, long j10) {
        return iVar.A(C5667g.u(X2(iVar, j10)));
    }

    private final C5669i Q2() {
        W0.b a10 = this.f27014s.f26996a;
        int r10 = a10.r();
        C5669i iVar = null;
        if (r10 > 0) {
            int i10 = r10 - 1;
            Object[] q10 = a10.q();
            do {
                C5669i invoke = ((a) q10[i10]).b().invoke();
                if (invoke != null) {
                    if (O2(invoke.q(), s.d(this.f27018w)) > 0) {
                        return iVar == null ? invoke : iVar;
                    }
                    iVar = invoke;
                }
                i10--;
            } while (i10 >= 0);
        }
        return iVar;
    }

    /* access modifiers changed from: private */
    public final C5669i R2() {
        if (!j2()) {
            return null;
        }
        C4488v k10 = C4508k.k(this);
        C4488v vVar = this.f27015t;
        if (vVar != null) {
            if (!vVar.c()) {
                vVar = null;
            }
            if (vVar != null) {
                return k10.m0(vVar, false);
            }
        }
        return null;
    }

    private final boolean T2(C5669i iVar, long j10) {
        long X22 = X2(iVar, j10);
        return Math.abs(C5667g.m(X22)) <= 0.5f && Math.abs(C5667g.n(X22)) <= 0.5f;
    }

    static /* synthetic */ boolean U2(C5691i iVar, C5669i iVar2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = iVar.f27018w;
        }
        return iVar.T2(iVar2, j10);
    }

    /* access modifiers changed from: private */
    public final void V2() {
        C5689g Y22 = Y2();
        if (!this.f27019x) {
            F0 unused = C16314k.d(c2(), (C17168i) null, T.UNDISPATCHED, new c(this, new L(Y22.b()), Y22, (C17164e<? super c>) null), 1, (Object) null);
            return;
        }
        throw new IllegalStateException("launchAnimation called when previous animation was running");
    }

    private final long X2(C5669i iVar, long j10) {
        long d10 = s.d(j10);
        int i10 = b.f27022a[this.f27009n.ordinal()];
        if (i10 == 1) {
            return C5668h.a(0.0f, Y2().a(iVar.r(), iVar.j() - iVar.r(), C5673m.i(d10)));
        }
        if (i10 == 2) {
            return C5668h.a(Y2().a(iVar.o(), iVar.p() - iVar.o(), C5673m.l(d10)), 0.0f);
        }
        throw new t();
    }

    private final C5689g Y2() {
        C5689g gVar = this.f27012q;
        return gVar == null ? (C5689g) C4506i.a(this, C5690h.a()) : gVar;
    }

    public final long S2() {
        return this.f27018w;
    }

    public final void W2(C4488v vVar) {
        this.f27015t = vVar;
    }

    public Object Y1(C17631a<C5669i> aVar, C17164e<? super C16807N> eVar) {
        C5669i invoke = aVar.invoke();
        if (invoke == null || U2(this, invoke, 0, 1, (Object) null)) {
            return C16807N.f139792a;
        }
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        if (this.f27014s.c(new a(aVar, pVar)) && !this.f27019x) {
            V2();
        }
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10 == C17187b.f() ? w10 : C16807N.f139792a;
    }

    public final void Z2(v vVar, boolean z10, C5689g gVar) {
        this.f27009n = vVar;
        this.f27011p = z10;
        this.f27012q = gVar;
    }

    public boolean h2() {
        return this.f27013r;
    }

    public C5669i n0(C5669i iVar) {
        if (!r.f(this.f27018w, r.f23053b.a())) {
            return P2(iVar, this.f27018w);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
    }

    public void p(long j10) {
        C5669i R22;
        long j11 = this.f27018w;
        this.f27018w = j10;
        if (N2(j10, j11) < 0 && (R22 = R2()) != null) {
            C5669i iVar = this.f27016u;
            if (iVar == null) {
                iVar = R22;
            }
            if (!this.f27019x && !this.f27017v && T2(iVar, j11) && !T2(R22, j10)) {
                this.f27017v = true;
                V2();
            }
            this.f27016u = R22;
        }
    }
}
