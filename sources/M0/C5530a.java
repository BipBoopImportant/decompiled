package m0;

import U0.A1;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import m0.C5562q;
import nI.C17642l;
import tI.C17978n;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJZ\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000f\u001a\u00028\u00002 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJb\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u001b\u001a\u00028\u00002\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u000f\u001a\u00028\u00002\"\b\u0002\u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00028\u0000H@¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0011H@¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b%\u0010&R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R&\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001018\u0000X\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R+\u0010>\u001a\u0002072\u0006\u00108\u001a\u0002078F@BX\u0002¢\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010\u001b\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u00008F@BX\u0002¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010ER \u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000G8\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010N\u001a\u00028\u00018\u0002X\u0004¢\u0006\f\n\u0004\b\u0019\u0010L\u0012\u0004\bM\u0010\u001aR\u001a\u0010P\u001a\u00028\u00018\u0002X\u0004¢\u0006\f\n\u0004\b4\u0010L\u0012\u0004\bO\u0010\u001aR\u0016\u0010Q\u001a\u00028\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010LR\u0016\u0010R\u001a\u00028\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010LR\u0011\u0010\u0016\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bS\u0010AR\u0011\u0010V\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010X\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bW\u0010A¨\u0006Y"}, d2 = {"Lm0/a;", "T", "Lm0/q;", "V", "", "initialValue", "Lm0/z0;", "typeConverter", "visibilityThreshold", "", "label", "<init>", "(Ljava/lang/Object;Lm0/z0;Ljava/lang/Object;Ljava/lang/String;)V", "Lm0/d;", "animation", "initialVelocity", "Lkotlin/Function1;", "LXH/N;", "block", "Lm0/g;", "q", "(Lm0/d;Ljava/lang/Object;LnI/l;LdI/e;)Ljava/lang/Object;", "value", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "i", "()V", "targetValue", "Lm0/i;", "animationSpec", "e", "(Ljava/lang/Object;Lm0/i;Ljava/lang/Object;LnI/l;LdI/e;)Ljava/lang/Object;", "t", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "u", "(LdI/e;)Ljava/lang/Object;", "LU0/A1;", "g", "()LU0/A1;", "a", "Lm0/z0;", "l", "()Lm0/z0;", "b", "Ljava/lang/Object;", "c", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lm0/k;", "d", "Lm0/k;", "j", "()Lm0/k;", "internalState", "", "<set-?>", "LU0/r0;", "p", "()Z", "r", "(Z)V", "isRunning", "f", "k", "()Ljava/lang/Object;", "s", "(Ljava/lang/Object;)V", "Lm0/g0;", "Lm0/g0;", "mutatorMutex", "Lm0/o0;", "Lm0/o0;", "getDefaultSpringSpec$animation_core_release", "()Lm0/o0;", "defaultSpringSpec", "Lm0/q;", "getNegativeInfinityBounds$annotations", "negativeInfinityBounds", "getPositiveInfinityBounds$annotations", "positiveInfinityBounds", "lowerBoundVector", "upperBoundVector", "m", "o", "()Lm0/q;", "velocityVector", "n", "velocity", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.a  reason: case insensitive filesystem */
public final class C5530a<T, V extends C5562q> {

    /* renamed from: m  reason: collision with root package name */
    public static final int f25673m = 8;

    /* renamed from: a  reason: collision with root package name */
    private final z0<T, V> f25674a;

    /* renamed from: b  reason: collision with root package name */
    private final T f25675b;

    /* renamed from: c  reason: collision with root package name */
    private final String f25676c;

    /* renamed from: d  reason: collision with root package name */
    private final C5550k<T, V> f25677d;

    /* renamed from: e  reason: collision with root package name */
    private final C4899r0 f25678e;

    /* renamed from: f  reason: collision with root package name */
    private final C4899r0 f25679f;

    /* renamed from: g  reason: collision with root package name */
    private final C5543g0 f25680g;

    /* renamed from: h  reason: collision with root package name */
    private final C5559o0<T> f25681h;

    /* renamed from: i  reason: collision with root package name */
    private final V f25682i;

    /* renamed from: j  reason: collision with root package name */
    private final V f25683j;

    /* renamed from: k  reason: collision with root package name */
    private V f25684k;

    /* renamed from: l  reason: collision with root package name */
    private V f25685l;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lm0/q;", "V", "Lm0/g;", "<anonymous>", "()Lm0/g;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {312}, m = "invokeSuspend")
    /* renamed from: m0.a$a  reason: collision with other inner class name */
    static final class C0410a extends l implements C17642l<C17164e<? super C5542g<T, V>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f25686c;

        /* renamed from: d  reason: collision with root package name */
        Object f25687d;

        /* renamed from: e  reason: collision with root package name */
        int f25688e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5530a<T, V> f25689f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ T f25690g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5536d<T, V> f25691h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f25692i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<C5530a<T, V>, C16807N> f25693j;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lm0/q;", "V", "Lm0/h;", "LXH/N;", "a", "(Lm0/h;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: m0.a$a$a  reason: collision with other inner class name */
        static final class C0411a extends C17544u implements C17642l<C5544h<T, V>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5530a<T, V> f25694c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5550k<T, V> f25695d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C17642l<C5530a<T, V>, C16807N> f25696e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ K f25697f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0411a(C5530a<T, V> aVar, C5550k<T, V> kVar, C17642l<? super C5530a<T, V>, C16807N> lVar, K k10) {
                super(1);
                this.f25694c = aVar;
                this.f25695d = kVar;
                this.f25696e = lVar;
                this.f25697f = k10;
            }

            public final void a(C5544h<T, V> hVar) {
                t0.o(hVar, this.f25694c.j());
                Object a10 = this.f25694c.h(hVar.e());
                if (!C17542s.e(a10, hVar.e())) {
                    this.f25694c.j().x(a10);
                    this.f25695d.x(a10);
                    C17642l<C5530a<T, V>, C16807N> lVar = this.f25696e;
                    if (lVar != null) {
                        lVar.invoke(this.f25694c);
                    }
                    hVar.a();
                    this.f25697f.f144344a = true;
                    return;
                }
                C17642l<C5530a<T, V>, C16807N> lVar2 = this.f25696e;
                if (lVar2 != null) {
                    lVar2.invoke(this.f25694c);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5544h) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0410a(C5530a<T, V> aVar, T t10, C5536d<T, V> dVar, long j10, C17642l<? super C5530a<T, V>, C16807N> lVar, C17164e<? super C0410a> eVar) {
            super(1, eVar);
            this.f25689f = aVar;
            this.f25690g = t10;
            this.f25691h = dVar;
            this.f25692i = j10;
            this.f25693j = lVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new C0410a(this.f25689f, this.f25690g, this.f25691h, this.f25692i, this.f25693j, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C5542g<T, V>> eVar) {
            return ((C0410a) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C5550k kVar;
            K k10;
            Object f10 = C17187b.f();
            int i10 = this.f25688e;
            if (i10 == 0) {
                y.b(obj);
                this.f25689f.j().y((C5562q) this.f25689f.l().a().invoke(this.f25690g));
                this.f25689f.s(this.f25691h.g());
                this.f25689f.r(true);
                C5550k h10 = C5552l.h(this.f25689f.j(), (Object) null, (C5562q) null, 0, Long.MIN_VALUE, false, 23, (Object) null);
                K k11 = new K();
                C5536d<T, V> dVar = this.f25691h;
                long j10 = this.f25692i;
                C0411a aVar = new C0411a(this.f25689f, h10, this.f25693j, k11);
                this.f25686c = h10;
                this.f25687d = k11;
                this.f25688e = 1;
                if (t0.c(h10, dVar, j10, aVar, this) == f10) {
                    return f10;
                }
                kVar = h10;
                k10 = k11;
            } else if (i10 == 1) {
                k10 = (K) this.f25687d;
                kVar = (C5550k) this.f25686c;
                try {
                    y.b(obj);
                } catch (CancellationException e10) {
                    this.f25689f.i();
                    throw e10;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5538e eVar = k10.f144344a ? C5538e.BoundReached : C5538e.Finished;
            this.f25689f.i();
            return new C5542g(kVar, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lm0/q;", "V", "LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: m0.a$b */
    static final class b extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f25698c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5530a<T, V> f25699d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ T f25700e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5530a<T, V> aVar, T t10, C17164e<? super b> eVar) {
            super(1, eVar);
            this.f25699d = aVar;
            this.f25700e = t10;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new b(this.f25699d, this.f25700e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((b) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f25698c == 0) {
                y.b(obj);
                this.f25699d.i();
                Object a10 = this.f25699d.h(this.f25700e);
                this.f25699d.j().x(a10);
                this.f25699d.s(a10);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lm0/q;", "V", "LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: m0.a$c */
    static final class c extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f25701c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5530a<T, V> f25702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5530a<T, V> aVar, C17164e<? super c> eVar) {
            super(1, eVar);
            this.f25702d = aVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new c(this.f25702d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((c) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f25701c == 0) {
                y.b(obj);
                this.f25702d.i();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C5530a(T t10, z0<T, V> z0Var, T t11, String str) {
        V v10;
        V v11;
        this.f25674a = z0Var;
        this.f25675b = t11;
        this.f25676c = str;
        this.f25677d = new C5550k(z0Var, t10, (C5562q) null, 0, 0, false, 60, (DefaultConstructorMarker) null);
        this.f25678e = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
        this.f25679f = u1.e(t10, (o1) null, 2, (Object) null);
        this.f25680g = new C5543g0();
        this.f25681h = new C5559o0(0.0f, 0.0f, t11, 3, (DefaultConstructorMarker) null);
        C5562q o10 = o();
        if (o10 instanceof C5554m) {
            v10 = C5532b.f25709e;
        } else if (o10 instanceof C5556n) {
            v10 = C5532b.f25710f;
        } else if (o10 instanceof C5558o) {
            v10 = C5532b.f25711g;
        } else {
            v10 = C5532b.f25712h;
        }
        C17542s.h(v10, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f25682i = v10;
        C5562q o11 = o();
        if (o11 instanceof C5554m) {
            v11 = C5532b.f25705a;
        } else if (o11 instanceof C5556n) {
            v11 = C5532b.f25706b;
        } else if (o11 instanceof C5558o) {
            v11 = C5532b.f25707c;
        } else {
            v11 = C5532b.f25708d;
        }
        C17542s.h(v11, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f25683j = v11;
        this.f25684k = v10;
        this.f25685l = v11;
    }

    public static /* synthetic */ Object f(C5530a aVar, Object obj, C5546i iVar, Object obj2, C17642l lVar, C17164e eVar, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            iVar = aVar.f25681h;
        }
        C5546i iVar2 = iVar;
        if ((i10 & 4) != 0) {
            obj2 = aVar.n();
        }
        Object obj4 = obj2;
        if ((i10 & 8) != 0) {
            lVar = null;
        }
        return aVar.e(obj, iVar2, obj4, lVar, eVar);
    }

    /* access modifiers changed from: private */
    public final T h(T t10) {
        if (C17542s.e(this.f25684k, this.f25682i) && C17542s.e(this.f25685l, this.f25683j)) {
            return t10;
        }
        C5562q qVar = (C5562q) this.f25674a.a().invoke(t10);
        int b10 = qVar.b();
        boolean z10 = false;
        for (int i10 = 0; i10 < b10; i10++) {
            if (qVar.a(i10) < this.f25684k.a(i10) || qVar.a(i10) > this.f25685l.a(i10)) {
                qVar.e(i10, C17978n.l(qVar.a(i10), this.f25684k.a(i10), this.f25685l.a(i10)));
                z10 = true;
            }
        }
        return z10 ? this.f25674a.b().invoke(qVar) : t10;
    }

    /* access modifiers changed from: private */
    public final void i() {
        C5550k<T, V> kVar = this.f25677d;
        kVar.s().d();
        kVar.v(Long.MIN_VALUE);
        r(false);
    }

    private final Object q(C5536d<T, V> dVar, T t10, C17642l<? super C5530a<T, V>, C16807N> lVar, C17164e<? super C5542g<T, V>> eVar) {
        return C5543g0.e(this.f25680g, (C5539e0) null, new C0410a(this, t10, dVar, this.f25677d.i(), lVar, (C17164e<? super C0410a>) null), eVar, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void r(boolean z10) {
        this.f25678e.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public final void s(T t10) {
        this.f25679f.setValue(t10);
    }

    public final Object e(T t10, C5546i<T> iVar, T t11, C17642l<? super C5530a<T, V>, C16807N> lVar, C17164e<? super C5542g<T, V>> eVar) {
        return q(C5540f.a(iVar, this.f25674a, m(), t10, t11), t11, lVar, eVar);
    }

    public final A1<T> g() {
        return this.f25677d;
    }

    public final C5550k<T, V> j() {
        return this.f25677d;
    }

    public final T k() {
        return this.f25679f.getValue();
    }

    public final z0<T, V> l() {
        return this.f25674a;
    }

    public final T m() {
        return this.f25677d.getValue();
    }

    public final T n() {
        return this.f25674a.b().invoke(o());
    }

    public final V o() {
        return this.f25677d.s();
    }

    public final boolean p() {
        return ((Boolean) this.f25678e.getValue()).booleanValue();
    }

    public final Object t(T t10, C17164e<? super C16807N> eVar) {
        Object e10 = C5543g0.e(this.f25680g, (C5539e0) null, new b(this, t10, (C17164e<? super b>) null), eVar, 1, (Object) null);
        return e10 == C17187b.f() ? e10 : C16807N.f139792a;
    }

    public final Object u(C17164e<? super C16807N> eVar) {
        Object e10 = C5543g0.e(this.f25680g, (C5539e0) null, new c(this, (C17164e<? super c>) null), eVar, 1, (Object) null);
        return e10 == C17187b.f() ? e10 : C16807N.f139792a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5530a(Object obj, z0 z0Var, Object obj2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z0Var, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }
}
