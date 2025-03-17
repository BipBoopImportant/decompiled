package androidx.compose.foundation.lazy.layout;

import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.y;
import c2.n;
import c2.o;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17536l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.B0;
import m0.C5530a;
import m0.C5554m;
import m0.C5556n;
import m0.N;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.H0;
import s1.C5905c;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R$\u00102\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8\u0006@BX\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R+\u00108\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00101\"\u0004\b6\u00107R+\u0010<\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0002¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00101\"\u0004\b;\u00107R+\u0010@\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0002¢\u0006\u0012\n\u0004\b=\u00104\u001a\u0004\b>\u00101\"\u0004\b?\u00107R+\u0010C\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0002¢\u0006\u0012\n\u0004\b\u0013\u00104\u001a\u0004\bA\u00101\"\u0004\bB\u00107R(\u0010H\u001a\u00020\r8\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010D\u001a\u0004\bE\u0010F\"\u0004\bD\u0010GR(\u0010K\u001a\u00020\r8\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010D\u001a\u0004\bI\u0010F\"\u0004\bJ\u0010GR(\u0010P\u001a\u0004\u0018\u00010L2\b\u0010-\u001a\u0004\u0018\u00010L8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000b\u0010M\u001a\u0004\bN\u0010OR \u0010T\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020R0Q8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010SR \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020U0Q8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010SR1\u0010Z\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r8F@BX\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bW\u00104\u001a\u0004\bX\u0010F\"\u0004\bY\u0010GR(\u0010\\\u001a\u00020\r8\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bX\u0010D\u001a\u0004\bW\u0010F\"\u0004\b[\u0010G\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Landroidx/compose/foundation/lazy/layout/b;", "", "LQJ/Q;", "coroutineScope", "Lp1/H0;", "graphicsContext", "Lkotlin/Function0;", "LXH/N;", "onLayerPropertyChanged", "<init>", "(LQJ/Q;Lp1/H0;LnI/a;)V", "n", "()V", "Lc2/n;", "delta", "", "isMovingAway", "m", "(JZ)V", "k", "l", "y", "a", "LQJ/Q;", "b", "Lp1/H0;", "c", "LnI/a;", "Lm0/N;", "", "d", "Lm0/N;", "getFadeInSpec", "()Lm0/N;", "C", "(Lm0/N;)V", "fadeInSpec", "e", "getPlacementSpec", "I", "placementSpec", "f", "getFadeOutSpec", "D", "fadeOutSpec", "<set-?>", "g", "Z", "x", "()Z", "isRunningMovingAwayAnimation", "h", "LU0/r0;", "w", "G", "(Z)V", "isPlacementAnimationInProgress", "i", "t", "z", "isAppearanceAnimationInProgress", "j", "v", "B", "isDisappearanceAnimationInProgress", "u", "A", "isDisappearanceAnimationFinished", "J", "s", "()J", "(J)V", "rawOffset", "o", "E", "finalOffset", "Ls1/c;", "Ls1/c;", "p", "()Ls1/c;", "layer", "Lm0/a;", "Lm0/n;", "Lm0/a;", "placementDeltaAnimation", "Lm0/m;", "visibilityAnimation", "q", "r", "H", "placementDelta", "F", "lookaheadOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: s  reason: collision with root package name */
    public static final a f18292s = new a((DefaultConstructorMarker) null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f18293t = 8;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static final long f18294u = o.a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: a  reason: collision with root package name */
    private final Q f18295a;

    /* renamed from: b  reason: collision with root package name */
    private final H0 f18296b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17631a<C16807N> f18297c;

    /* renamed from: d  reason: collision with root package name */
    private N<Float> f18298d;

    /* renamed from: e  reason: collision with root package name */
    private N<n> f18299e;

    /* renamed from: f  reason: collision with root package name */
    private N<Float> f18300f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f18301g;

    /* renamed from: h  reason: collision with root package name */
    private final C4899r0 f18302h;

    /* renamed from: i  reason: collision with root package name */
    private final C4899r0 f18303i;

    /* renamed from: j  reason: collision with root package name */
    private final C4899r0 f18304j;

    /* renamed from: k  reason: collision with root package name */
    private final C4899r0 f18305k;

    /* renamed from: l  reason: collision with root package name */
    private long f18306l;

    /* renamed from: m  reason: collision with root package name */
    private long f18307m;

    /* renamed from: n  reason: collision with root package name */
    private C5905c f18308n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C5530a<n, C5556n> f18309o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C5530a<Float, C5554m> f18310p;

    /* renamed from: q  reason: collision with root package name */
    private final C4899r0 f18311q;

    /* renamed from: r  reason: collision with root package name */
    private long f18312r;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/b$a;", "", "<init>", "()V", "Lc2/n;", "NotInitialized", "J", "a", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.f18294u;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", f = "LazyLayoutItemAnimation.kt", l = {182}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.b$b  reason: collision with other inner class name */
    static final class C0267b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18313c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f18314d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0267b(b bVar, C17164e<? super C0267b> eVar) {
            super(2, eVar);
            this.f18314d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C0267b(this.f18314d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C0267b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f18313c;
            if (i10 == 0) {
                y.b(obj);
                C5530a d10 = this.f18314d.f18310p;
                Float d11 = kotlin.coroutines.jvm.internal.b.d(1.0f);
                this.f18313c = 1;
                if (d10.t(d11, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {195, 197}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18315c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f18316d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f18317e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ N<Float> f18318f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5905c f18319g;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/a;", "", "Lm0/m;", "LXH/N;", "a", "(Lm0/a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<C5530a<Float, C5554m>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5905c f18320c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b f18321d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C5905c cVar, b bVar) {
                super(1);
                this.f18320c = cVar;
                this.f18321d = bVar;
            }

            public final void a(C5530a<Float, C5554m> aVar) {
                this.f18320c.J(aVar.m().floatValue());
                this.f18321d.f18297c.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5530a) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, b bVar, N<Float> n10, C5905c cVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f18316d = z10;
            this.f18317e = bVar;
            this.f18318f = n10;
            this.f18319g = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f18316d, this.f18317e, this.f18318f, this.f18319g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f18315c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f18316d) {
                    C5530a d10 = this.f18317e.f18310p;
                    Float d11 = kotlin.coroutines.jvm.internal.b.d(0.0f);
                    this.f18315c = 1;
                    if (d10.t(d11, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                try {
                    y.b(obj);
                    this.f18317e.z(false);
                    return C16807N.f139792a;
                } catch (Throwable th2) {
                    this.f18317e.z(false);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5530a d12 = this.f18317e.f18310p;
            Float d13 = kotlin.coroutines.jvm.internal.b.d(1.0f);
            N<Float> n10 = this.f18318f;
            a aVar = new a(this.f18319g, this.f18317e);
            this.f18315c = 2;
            if (C5530a.f(d12, d13, n10, (Object) null, aVar, this, 4, (Object) null) == f10) {
                return f10;
            }
            this.f18317e.z(false);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {216}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18322c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f18323d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ N<Float> f18324e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5905c f18325f;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/a;", "", "Lm0/m;", "LXH/N;", "a", "(Lm0/a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<C5530a<Float, C5554m>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5905c f18326c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b f18327d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C5905c cVar, b bVar) {
                super(1);
                this.f18326c = cVar;
                this.f18327d = bVar;
            }

            public final void a(C5530a<Float, C5554m> aVar) {
                this.f18326c.J(aVar.m().floatValue());
                this.f18327d.f18297c.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5530a) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, N<Float> n10, C5905c cVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f18323d = bVar;
            this.f18324e = n10;
            this.f18325f = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f18323d, this.f18324e, this.f18325f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f18322c;
            if (i10 == 0) {
                y.b(obj);
                C5530a d10 = this.f18323d.f18310p;
                Float d11 = kotlin.coroutines.jvm.internal.b.d(0.0f);
                N<Float> n10 = this.f18324e;
                a aVar = new a(this.f18325f, this.f18323d);
                this.f18322c = 1;
                if (C5530a.f(d10, d11, n10, (Object) null, aVar, this, 4, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    this.f18323d.B(false);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f18323d.A(true);
            this.f18323d.B(false);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {151, 158}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f18328c;

        /* renamed from: d  reason: collision with root package name */
        int f18329d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f18330e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ N<n> f18331f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f18332g;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/a;", "Lc2/n;", "Lm0/n;", "LXH/N;", "a", "(Lm0/a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<C5530a<n, C5556n>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f18333c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f18334d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, long j10) {
                super(1);
                this.f18333c = bVar;
                this.f18334d = j10;
            }

            public final void a(C5530a<n, C5556n> aVar) {
                this.f18333c.H(n.k(aVar.m().n(), this.f18334d));
                this.f18333c.f18297c.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5530a) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, N<n> n10, long j10, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f18330e = bVar;
            this.f18331f = n10;
            this.f18332g = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f18330e, this.f18331f, this.f18332g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9 A[Catch:{ CancellationException -> 0x00b5 }, RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r11.f18329d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0023
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                XH.y.b(r12)     // Catch:{ CancellationException -> 0x00b5 }
                goto L_0x00aa
            L_0x0013:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001b:
                java.lang.Object r1 = r11.f18328c
                m0.N r1 = (m0.N) r1
                XH.y.b(r12)     // Catch:{ CancellationException -> 0x00b5 }
                goto L_0x0067
            L_0x0023:
                XH.y.b(r12)
                androidx.compose.foundation.lazy.layout.b r12 = r11.f18330e     // Catch:{ CancellationException -> 0x00b5 }
                m0.a r12 = r12.f18309o     // Catch:{ CancellationException -> 0x00b5 }
                boolean r12 = r12.p()     // Catch:{ CancellationException -> 0x00b5 }
                if (r12 == 0) goto L_0x0041
                m0.N<c2.n> r12 = r11.f18331f     // Catch:{ CancellationException -> 0x00b5 }
                boolean r1 = r12 instanceof m0.C5559o0     // Catch:{ CancellationException -> 0x00b5 }
                if (r1 == 0) goto L_0x003b
                m0.o0 r12 = (m0.C5559o0) r12     // Catch:{ CancellationException -> 0x00b5 }
                goto L_0x003f
            L_0x003b:
                m0.o0 r12 = v0.C6150p.f30915a     // Catch:{ CancellationException -> 0x00b5 }
            L_0x003f:
                r1 = r12
                goto L_0x0044
            L_0x0041:
                m0.N<c2.n> r12 = r11.f18331f     // Catch:{ CancellationException -> 0x00b5 }
                goto L_0x003f
            L_0x0044:
                androidx.compose.foundation.lazy.layout.b r12 = r11.f18330e     // Catch:{ CancellationException -> 0x00b5 }
                m0.a r12 = r12.f18309o     // Catch:{ CancellationException -> 0x00b5 }
                boolean r12 = r12.p()     // Catch:{ CancellationException -> 0x00b5 }
                if (r12 != 0) goto L_0x0070
                androidx.compose.foundation.lazy.layout.b r12 = r11.f18330e     // Catch:{ CancellationException -> 0x00b5 }
                m0.a r12 = r12.f18309o     // Catch:{ CancellationException -> 0x00b5 }
                long r4 = r11.f18332g     // Catch:{ CancellationException -> 0x00b5 }
                c2.n r4 = c2.n.b(r4)     // Catch:{ CancellationException -> 0x00b5 }
                r11.f18328c = r1     // Catch:{ CancellationException -> 0x00b5 }
                r11.f18329d = r3     // Catch:{ CancellationException -> 0x00b5 }
                java.lang.Object r12 = r12.t(r4, r11)     // Catch:{ CancellationException -> 0x00b5 }
                if (r12 != r0) goto L_0x0067
                return r0
            L_0x0067:
                androidx.compose.foundation.lazy.layout.b r12 = r11.f18330e     // Catch:{ CancellationException -> 0x00b5 }
                nI.a r12 = r12.f18297c     // Catch:{ CancellationException -> 0x00b5 }
                r12.invoke()     // Catch:{ CancellationException -> 0x00b5 }
            L_0x0070:
                r5 = r1
                androidx.compose.foundation.lazy.layout.b r12 = r11.f18330e     // Catch:{ CancellationException -> 0x00b5 }
                m0.a r12 = r12.f18309o     // Catch:{ CancellationException -> 0x00b5 }
                java.lang.Object r12 = r12.m()     // Catch:{ CancellationException -> 0x00b5 }
                c2.n r12 = (c2.n) r12     // Catch:{ CancellationException -> 0x00b5 }
                long r3 = r12.n()     // Catch:{ CancellationException -> 0x00b5 }
                long r6 = r11.f18332g     // Catch:{ CancellationException -> 0x00b5 }
                long r3 = c2.n.k(r3, r6)     // Catch:{ CancellationException -> 0x00b5 }
                androidx.compose.foundation.lazy.layout.b r12 = r11.f18330e     // Catch:{ CancellationException -> 0x00b5 }
                m0.a r12 = r12.f18309o     // Catch:{ CancellationException -> 0x00b5 }
                c2.n r1 = c2.n.b(r3)     // Catch:{ CancellationException -> 0x00b5 }
                androidx.compose.foundation.lazy.layout.b$e$a r7 = new androidx.compose.foundation.lazy.layout.b$e$a     // Catch:{ CancellationException -> 0x00b5 }
                androidx.compose.foundation.lazy.layout.b r6 = r11.f18330e     // Catch:{ CancellationException -> 0x00b5 }
                r7.<init>(r6, r3)     // Catch:{ CancellationException -> 0x00b5 }
                r3 = 0
                r11.f18328c = r3     // Catch:{ CancellationException -> 0x00b5 }
                r11.f18329d = r2     // Catch:{ CancellationException -> 0x00b5 }
                r6 = 0
                r9 = 4
                r10 = 0
                r3 = r12
                r4 = r1
                r8 = r11
                java.lang.Object r12 = m0.C5530a.f(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ CancellationException -> 0x00b5 }
                if (r12 != r0) goto L_0x00aa
                return r0
            L_0x00aa:
                androidx.compose.foundation.lazy.layout.b r12 = r11.f18330e     // Catch:{ CancellationException -> 0x00b5 }
                r0 = 0
                r12.G(r0)     // Catch:{ CancellationException -> 0x00b5 }
                androidx.compose.foundation.lazy.layout.b r12 = r11.f18330e     // Catch:{ CancellationException -> 0x00b5 }
                r12.f18301g = r0     // Catch:{ CancellationException -> 0x00b5 }
            L_0x00b5:
                XH.N r12 = XH.C16807N.f139792a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", l = {115}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18335c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f18336d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f18336d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f18336d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f18335c;
            if (i10 == 0) {
                y.b(obj);
                C5530a c10 = this.f18336d.f18309o;
                n b10 = n.b(n.f23044b.a());
                this.f18335c = 1;
                if (c10.t(b10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f18336d.H(n.f23044b.a());
            this.f18336d.G(false);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", l = {231}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18337c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f18338d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f18338d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f18338d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f18337c;
            if (i10 == 0) {
                y.b(obj);
                C5530a c10 = this.f18338d.f18309o;
                this.f18337c = 1;
                if (c10.u(this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", l = {237}, m = "invokeSuspend")
    static final class h extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18339c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f18340d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f18340d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f18340d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f18339c;
            if (i10 == 0) {
                y.b(obj);
                C5530a d10 = this.f18340d.f18310p;
                this.f18339c = 1;
                if (d10.u(this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", l = {243}, m = "invokeSuspend")
    static final class i extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18341c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f18342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f18342d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f18342d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f18341c;
            if (i10 == 0) {
                y.b(obj);
                C5530a d10 = this.f18342d.f18310p;
                this.f18341c = 1;
                if (d10.u(this) == f10) {
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

    public b(Q q10, H0 h02, C17631a<C16807N> aVar) {
        H0 h03 = h02;
        this.f18295a = q10;
        this.f18296b = h03;
        this.f18297c = aVar;
        Boolean bool = Boolean.FALSE;
        this.f18302h = u1.e(bool, (o1) null, 2, (Object) null);
        this.f18303i = u1.e(bool, (o1) null, 2, (Object) null);
        this.f18304j = u1.e(bool, (o1) null, 2, (Object) null);
        this.f18305k = u1.e(bool, (o1) null, 2, (Object) null);
        long j10 = f18294u;
        this.f18306l = j10;
        n.a aVar2 = n.f23044b;
        this.f18307m = aVar2.a();
        this.f18308n = h03 != null ? h02.a() : null;
        this.f18309o = new C5530a(n.b(aVar2.a()), B0.d(aVar2), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
        this.f18310p = new C5530a(Float.valueOf(1.0f), B0.f(C17536l.f144385a), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
        this.f18311q = u1.e(n.b(aVar2.a()), (o1) null, 2, (Object) null);
        this.f18312r = j10;
    }

    /* access modifiers changed from: private */
    public final void A(boolean z10) {
        this.f18305k.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public final void B(boolean z10) {
        this.f18304j.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public final void G(boolean z10) {
        this.f18302h.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public final void H(long j10) {
        this.f18311q.setValue(n.b(j10));
    }

    /* access modifiers changed from: private */
    public final void z(boolean z10) {
        this.f18303i.setValue(Boolean.valueOf(z10));
    }

    public final void C(N<Float> n10) {
        this.f18298d = n10;
    }

    public final void D(N<Float> n10) {
        this.f18300f = n10;
    }

    public final void E(long j10) {
        this.f18307m = j10;
    }

    public final void F(long j10) {
        this.f18312r = j10;
    }

    public final void I(N<n> n10) {
        this.f18299e = n10;
    }

    public final void J(long j10) {
        this.f18306l = j10;
    }

    public final void k() {
        C5905c cVar = this.f18308n;
        N<Float> n10 = this.f18298d;
        if (!t() && n10 != null && cVar != null) {
            z(true);
            boolean v10 = v();
            boolean z10 = !v10;
            if (!v10) {
                cVar.J(0.0f);
            }
            F0 unused = C16314k.d(this.f18295a, (C17168i) null, (T) null, new c(z10, this, n10, cVar, (C17164e<? super c>) null), 3, (Object) null);
        } else if (v()) {
            if (cVar != null) {
                cVar.J(1.0f);
            }
            F0 unused2 = C16314k.d(this.f18295a, (C17168i) null, (T) null, new C0267b(this, (C17164e<? super C0267b>) null), 3, (Object) null);
        }
    }

    public final void l() {
        C5905c cVar = this.f18308n;
        N<Float> n10 = this.f18300f;
        if (cVar != null && !v() && n10 != null) {
            B(true);
            F0 unused = C16314k.d(this.f18295a, (C17168i) null, (T) null, new d(this, n10, cVar, (C17164e<? super d>) null), 3, (Object) null);
        }
    }

    public final void m(long j10, boolean z10) {
        N<n> n10 = this.f18299e;
        if (n10 != null) {
            long k10 = n.k(r(), j10);
            H(k10);
            G(true);
            this.f18301g = z10;
            F0 unused = C16314k.d(this.f18295a, (C17168i) null, (T) null, new e(this, n10, k10, (C17164e<? super e>) null), 3, (Object) null);
        }
    }

    public final void n() {
        if (w()) {
            F0 unused = C16314k.d(this.f18295a, (C17168i) null, (T) null, new f(this, (C17164e<? super f>) null), 3, (Object) null);
        }
    }

    public final long o() {
        return this.f18307m;
    }

    public final C5905c p() {
        return this.f18308n;
    }

    public final long q() {
        return this.f18312r;
    }

    public final long r() {
        return ((n) this.f18311q.getValue()).n();
    }

    public final long s() {
        return this.f18306l;
    }

    public final boolean t() {
        return ((Boolean) this.f18303i.getValue()).booleanValue();
    }

    public final boolean u() {
        return ((Boolean) this.f18305k.getValue()).booleanValue();
    }

    public final boolean v() {
        return ((Boolean) this.f18304j.getValue()).booleanValue();
    }

    public final boolean w() {
        return ((Boolean) this.f18302h.getValue()).booleanValue();
    }

    public final boolean x() {
        return this.f18301g;
    }

    public final void y() {
        H0 h02;
        if (w()) {
            G(false);
            F0 unused = C16314k.d(this.f18295a, (C17168i) null, (T) null, new g(this, (C17164e<? super g>) null), 3, (Object) null);
        }
        if (t()) {
            z(false);
            F0 unused2 = C16314k.d(this.f18295a, (C17168i) null, (T) null, new h(this, (C17164e<? super h>) null), 3, (Object) null);
        }
        if (v()) {
            B(false);
            F0 unused3 = C16314k.d(this.f18295a, (C17168i) null, (T) null, new i(this, (C17164e<? super i>) null), 3, (Object) null);
        }
        this.f18301g = false;
        H(n.f23044b.a());
        this.f18306l = f18294u;
        C5905c cVar = this.f18308n;
        if (!(cVar == null || (h02 = this.f18296b) == null)) {
            h02.b(cVar);
        }
        this.f18308n = null;
        this.f18298d = null;
        this.f18300f = null;
        this.f18299e = null;
    }
}
