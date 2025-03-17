package p0;

import XH.C16807N;
import XH.y;
import androidx.compose.foundation.gestures.g;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.N;
import n0.C5589L;
import n0.T;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import o1.C5668h;
import z1.C6272b;

@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001N\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u0011*\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u0011*\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u0010*\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u00020\u0010*\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u0011*\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001b\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH@ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH@ø\u0001\u0001¢\u0006\u0004\b#\u0010!J\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010%J>\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010'\u001a\u00020&2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0*\u0012\u0006\u0012\u0004\u0018\u00010\u00010(H@¢\u0006\u0004\b,\u0010-J?\u0010.\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\n¢\u0006\u0004\b0\u0010%J\u0016\u00101\u001a\u00020\u0010*\u00020\u001dH\u0002ø\u0001\u0001¢\u0006\u0004\b1\u0010\u0017J\u0016\u00102\u001a\u00020\u001d*\u00020\u001dH\u0002ø\u0001\u0001¢\u0006\u0004\b2\u0010\u0015J\u001e\u00104\u001a\u00020\u001d*\u00020\u001d2\u0006\u00103\u001a\u00020\u0010H\u0002ø\u0001\u0001¢\u0006\u0004\b4\u00105J&\u0010:\u001a\u00020\u0011*\u0002062\u0006\u00107\u001a\u00020\u00112\u0006\u00109\u001a\u000208H\u0002ø\u0001\u0001¢\u0006\u0004\b:\u0010;R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010J\u001a\u0002088\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u0002068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110R8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\bV\u0010%\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006X"}, d2 = {"Lp0/F;", "", "Lp0/D;", "scrollableState", "Ln0/T;", "overscrollEffect", "Lp0/s;", "flingBehavior", "Lp0/v;", "orientation", "", "reverseDirection", "Lz1/b;", "nestedScrollDispatcher", "<init>", "(Lp0/D;Ln0/T;Lp0/s;Lp0/v;ZLz1/b;)V", "", "Lo1/g;", "B", "(F)J", "x", "(J)J", "A", "(J)F", "t", "(F)F", "u", "scroll", "r", "Lc2/y;", "initialVelocity", "LXH/N;", "q", "(JLdI/e;)Ljava/lang/Object;", "available", "n", "w", "()Z", "Ln0/L;", "scrollPriority", "Lkotlin/Function2;", "Lp0/u;", "LdI/e;", "block", "v", "(Ln0/L;LnI/p;LdI/e;)Ljava/lang/Object;", "C", "(Lp0/D;Lp0/v;Ln0/T;ZLp0/s;Lz1/b;)Z", "p", "z", "y", "newValue", "D", "(JF)J", "Lp0/A;", "delta", "Lz1/e;", "source", "s", "(Lp0/A;JI)J", "a", "Lp0/D;", "b", "Ln0/T;", "c", "Lp0/s;", "d", "Lp0/v;", "e", "Z", "f", "Lz1/b;", "g", "I", "latestScrollSource", "h", "Lp0/A;", "outerStateScope", "p0/F$c", "i", "Lp0/F$c;", "nestedScrollScope", "Lkotlin/Function1;", "j", "LnI/l;", "performScrollForOverscroll", "o", "shouldDispatchOverscroll", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class F {

    /* renamed from: a  reason: collision with root package name */
    private C5681D f26793a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public T f26794b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public s f26795c;

    /* renamed from: d  reason: collision with root package name */
    private v f26796d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f26797e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public C6272b f26798f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f26799g = z1.e.f32374a.b();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public C5678A f26800h = g.f17812b;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final c f26801i = new c(this);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final C17642l<C5667g, C5667g> f26802j = new e(this);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {769}, m = "doFlingAnimation-QWom1Mo")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f26803c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f26804d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ F f26805e;

        /* renamed from: f  reason: collision with root package name */
        int f26806f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(F f10, C17164e<? super a> eVar) {
            super(eVar);
            this.f26805e = f10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f26804d = obj;
            this.f26806f |= Integer.MIN_VALUE;
            return this.f26805e.n(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/u;", "LXH/N;", "<anonymous>", "(Lp0/u;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {782}, m = "invokeSuspend")
    static final class b extends l implements p<u, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f26807c;

        /* renamed from: d  reason: collision with root package name */
        Object f26808d;

        /* renamed from: e  reason: collision with root package name */
        long f26809e;

        /* renamed from: f  reason: collision with root package name */
        int f26810f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f26811g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ F f26812h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ N f26813i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f26814j;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"p0/F$b$a", "Lp0/A;", "", "pixels", "a", "(F)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements C5678A {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ F f26815a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ u f26816b;

            a(F f10, u uVar) {
                this.f26815a = f10;
                this.f26816b = uVar;
            }

            public float a(float f10) {
                F f11 = this.f26815a;
                return f11.t(f11.A(this.f26816b.a(f11.u(f11.B(f10)), z1.e.f32374a.a())));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(F f10, N n10, long j10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f26812h = f10;
            this.f26813i = n10;
            this.f26814j = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f26812h, this.f26813i, this.f26814j, eVar);
            bVar.f26811g = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(u uVar, C17164e<? super C16807N> eVar) {
            return ((b) create(uVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            F f10;
            F f11;
            N n10;
            long j10;
            Object f12 = C17187b.f();
            int i10 = this.f26810f;
            if (i10 == 0) {
                y.b(obj);
                a aVar = new a(this.f26812h, (u) this.f26811g);
                f11 = this.f26812h;
                N n11 = this.f26813i;
                long j11 = this.f26814j;
                s a10 = f11.f26795c;
                long j12 = n11.f144347a;
                float t10 = f11.t(f11.z(j11));
                this.f26811g = f11;
                this.f26807c = f11;
                this.f26808d = n11;
                this.f26809e = j12;
                this.f26810f = 1;
                Object a11 = a10.a(aVar, t10, this);
                if (a11 == f12) {
                    return f12;
                }
                n10 = n11;
                obj = a11;
                f10 = f11;
                j10 = j12;
            } else if (i10 == 1) {
                j10 = this.f26809e;
                n10 = (N) this.f26808d;
                f11 = (F) this.f26807c;
                f10 = (F) this.f26811g;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n10.f144347a = f11.D(j10, f10.t(((Number) obj).floatValue()));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"p0/F$c", "Lp0/u;", "Lo1/g;", "offset", "Lz1/e;", "source", "b", "(JI)J", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ F f26817a;

        c(F f10) {
            this.f26817a = f10;
        }

        public long a(long j10, int i10) {
            this.f26817a.f26799g = i10;
            T f10 = this.f26817a.f26794b;
            if (f10 != null && this.f26817a.o()) {
                return f10.c(j10, this.f26817a.f26799g, this.f26817a.f26802j);
            }
            return this.f26817a.s(this.f26817a.f26800h, j10, i10);
        }

        public long b(long j10, int i10) {
            return this.f26817a.s(this.f26817a.f26800h, j10, i10);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc2/y;", "velocity", "<anonymous>", "(Lc2/y;)Lc2/y;"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", l = {745, 748, 751}, m = "invokeSuspend")
    static final class d extends l implements p<c2.y, C17164e<? super c2.y>, Object> {

        /* renamed from: c  reason: collision with root package name */
        long f26818c;

        /* renamed from: d  reason: collision with root package name */
        int f26819d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ long f26820e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ F f26821f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(F f10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f26821f = f10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f26821f, eVar);
            dVar.f26820e = ((c2.y) obj).o();
            return dVar;
        }

        public final Object i(long j10, C17164e<? super c2.y> eVar) {
            return ((d) create(c2.y.b(j10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((c2.y) obj).o(), (C17164e) obj2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r6 = eI.C17187b.f()
                int r0 = r13.f26819d
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L_0x0035
                if (r0 == r3) goto L_0x002e
                if (r0 == r2) goto L_0x0024
                if (r0 != r1) goto L_0x001c
                long r0 = r13.f26818c
                long r2 = r13.f26820e
                XH.y.b(r14)
                r9 = r0
                r0 = r14
                goto L_0x0089
            L_0x001c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0024:
                long r2 = r13.f26818c
                long r4 = r13.f26820e
                XH.y.b(r14)
                r0 = r14
                r7 = r4
                goto L_0x0068
            L_0x002e:
                long r3 = r13.f26820e
                XH.y.b(r14)
                r0 = r14
                goto L_0x004c
            L_0x0035:
                XH.y.b(r14)
                long r4 = r13.f26820e
                p0.F r0 = r13.f26821f
                z1.b r0 = r0.f26798f
                r13.f26820e = r4
                r13.f26819d = r3
                java.lang.Object r0 = r0.c(r4, r13)
                if (r0 != r6) goto L_0x004b
                return r6
            L_0x004b:
                r3 = r4
            L_0x004c:
                c2.y r0 = (c2.y) r0
                long r7 = r0.o()
                long r7 = c2.y.k(r3, r7)
                p0.F r0 = r13.f26821f
                r13.f26820e = r3
                r13.f26818c = r7
                r13.f26819d = r2
                java.lang.Object r0 = r0.n(r7, r13)
                if (r0 != r6) goto L_0x0065
                return r6
            L_0x0065:
                r11 = r3
                r2 = r7
                r7 = r11
            L_0x0068:
                c2.y r0 = (c2.y) r0
                long r9 = r0.o()
                p0.F r0 = r13.f26821f
                z1.b r0 = r0.f26798f
                long r2 = c2.y.k(r2, r9)
                r13.f26820e = r7
                r13.f26818c = r9
                r13.f26819d = r1
                r1 = r2
                r3 = r9
                r5 = r13
                java.lang.Object r0 = r0.a(r1, r3, r5)
                if (r0 != r6) goto L_0x0088
                return r6
            L_0x0088:
                r2 = r7
            L_0x0089:
                c2.y r0 = (c2.y) r0
                long r0 = r0.o()
                long r0 = c2.y.k(r9, r0)
                long r0 = c2.y.k(r2, r0)
                c2.y r0 = c2.y.b(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.F.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo1/g;", "delta", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<C5667g, C5667g> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ F f26822c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(F f10) {
            super(1);
            this.f26822c = f10;
        }

        public final long a(long j10) {
            C5678A e10 = this.f26822c.f26800h;
            F f10 = this.f26822c;
            return f10.s(e10, j10, f10.f26799g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5667g.d(a(((C5667g) obj).v()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/A;", "LXH/N;", "<anonymous>", "(Lp0/A;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {804}, m = "invokeSuspend")
    static final class f extends l implements p<C5678A, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f26823c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f26824d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ F f26825e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<u, C17164e<? super C16807N>, Object> f26826f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(F f10, p<? super u, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f26825e = f10;
            this.f26826f = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f26825e, this.f26826f, eVar);
            fVar.f26824d = obj;
            return fVar;
        }

        /* renamed from: i */
        public final Object invoke(C5678A a10, C17164e<? super C16807N> eVar) {
            return ((f) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f26823c;
            if (i10 == 0) {
                y.b(obj);
                this.f26825e.f26800h = (C5678A) this.f26824d;
                p<u, C17164e<? super C16807N>, Object> pVar = this.f26826f;
                c d10 = this.f26825e.f26801i;
                this.f26823c = 1;
                if (pVar.invoke(d10, this) == f10) {
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

    public F(C5681D d10, T t10, s sVar, v vVar, boolean z10, C6272b bVar) {
        this.f26793a = d10;
        this.f26794b = t10;
        this.f26795c = sVar;
        this.f26796d = vVar;
        this.f26797e = z10;
        this.f26798f = bVar;
    }

    /* access modifiers changed from: private */
    public final long D(long j10, float f10) {
        return this.f26796d == v.Horizontal ? c2.y.e(j10, f10, 0.0f, 2, (Object) null) : c2.y.e(j10, 0.0f, f10, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final boolean o() {
        return this.f26793a.d() || this.f26793a.c();
    }

    /* access modifiers changed from: private */
    public final long s(C5678A a10, long j10, int i10) {
        long d10 = this.f26798f.d(j10, i10);
        long q10 = C5667g.q(j10, d10);
        long u10 = u(B(a10.a(A(u(x(q10))))));
        return C5667g.r(C5667g.r(d10, u10), this.f26798f.b(u10, C5667g.q(q10, u10), i10));
    }

    private final long y(long j10) {
        return this.f26796d == v.Horizontal ? c2.y.e(j10, 0.0f, 0.0f, 1, (Object) null) : c2.y.e(j10, 0.0f, 0.0f, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final float z(long j10) {
        return this.f26796d == v.Horizontal ? c2.y.h(j10) : c2.y.i(j10);
    }

    public final float A(long j10) {
        return this.f26796d == v.Horizontal ? C5667g.m(j10) : C5667g.n(j10);
    }

    public final long B(float f10) {
        return f10 == 0.0f ? C5667g.f26701b.c() : this.f26796d == v.Horizontal ? C5668h.a(f10, 0.0f) : C5668h.a(0.0f, f10);
    }

    public final boolean C(C5681D d10, v vVar, T t10, boolean z10, s sVar, C6272b bVar) {
        boolean z11;
        boolean z12 = true;
        if (!C17542s.e(this.f26793a, d10)) {
            this.f26793a = d10;
            z11 = true;
        } else {
            z11 = false;
        }
        this.f26794b = t10;
        if (this.f26796d != vVar) {
            this.f26796d = vVar;
            z11 = true;
        }
        if (this.f26797e != z10) {
            this.f26797e = z10;
        } else {
            z12 = z11;
        }
        this.f26795c = sVar;
        this.f26798f = bVar;
        return z12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(long r12, dI.C17164e<? super c2.y> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p0.F.a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            p0.F$a r0 = (p0.F.a) r0
            int r1 = r0.f26806f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26806f = r1
            goto L_0x0018
        L_0x0013:
            p0.F$a r0 = new p0.F$a
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f26804d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f26806f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r12 = r0.f26803c
            kotlin.jvm.internal.N r12 = (kotlin.jvm.internal.N) r12
            XH.y.b(r14)
            goto L_0x0057
        L_0x002d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0035:
            XH.y.b(r14)
            kotlin.jvm.internal.N r14 = new kotlin.jvm.internal.N
            r14.<init>()
            r14.f144347a = r12
            n0.L r2 = n0.C5589L.Default
            p0.F$b r10 = new p0.F$b
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r0.f26803c = r14
            r0.f26806f = r3
            java.lang.Object r12 = r11.v(r2, r10, r0)
            if (r12 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r12 = r14
        L_0x0057:
            long r12 = r12.f144347a
            c2.y r12 = c2.y.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.F.n(long, dI.e):java.lang.Object");
    }

    public final boolean p() {
        return this.f26796d == v.Vertical;
    }

    public final Object q(long j10, C17164e<? super C16807N> eVar) {
        long y10 = y(j10);
        d dVar = new d(this, (C17164e<? super d>) null);
        T t10 = this.f26794b;
        if (t10 == null || !o()) {
            Object invoke = dVar.invoke(c2.y.b(y10), eVar);
            return invoke == C17187b.f() ? invoke : C16807N.f139792a;
        }
        Object a10 = t10.a(y10, dVar, eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public final long r(long j10) {
        return this.f26793a.b() ? C5667g.f26701b.c() : B(t(this.f26793a.e(t(A(j10)))));
    }

    public final float t(float f10) {
        return this.f26797e ? f10 * ((float) -1) : f10;
    }

    public final long u(long j10) {
        return this.f26797e ? C5667g.s(j10, -1.0f) : j10;
    }

    public final Object v(C5589L l10, p<? super u, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
        Object f10 = this.f26793a.f(l10, new f(this, pVar, (C17164e<? super f>) null), eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    public final boolean w() {
        if (!this.f26793a.b()) {
            T t10 = this.f26794b;
            return t10 != null ? t10.b() : false;
        }
    }

    public final long x(long j10) {
        return this.f26796d == v.Horizontal ? C5667g.g(j10, 0.0f, 0.0f, 1, (Object) null) : C5667g.g(j10, 0.0f, 0.0f, 2, (Object) null);
    }
}
