package m0;

import QJ.C16320n;
import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import U0.P;
import XH.C16807N;
import XH.C16814e;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.x;
import XH.y;
import bK.C17052a;
import dI.C17164e;
import eI.C17187b;
import g1.C5357z;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import m0.v0;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\\\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001ac\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0013R\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aC\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0001\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001ao\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001f\u0010 \"$\u0010&\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"\u0012\u0004\u0012\u00020#0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u001b\u0010+\u001a\u00020'8@X\u0002¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"T", "targetState", "", "label", "Lm0/v0;", "g", "(Ljava/lang/Object;Ljava/lang/String;LU0/m;II)Lm0/v0;", "Lm0/x0;", "transitionState", "f", "(Lm0/x0;Ljava/lang/String;LU0/m;II)Lm0/v0;", "Lm0/d0;", "h", "(Lm0/d0;Ljava/lang/String;LU0/m;II)Lm0/v0;", "S", "Lm0/q;", "V", "Lm0/z0;", "typeConverter", "Lm0/v0$a;", "c", "(Lm0/v0;Lm0/z0;Ljava/lang/String;LU0/m;II)Lm0/v0$a;", "initialState", "childLabel", "b", "(Lm0/v0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;LU0/m;I)Lm0/v0;", "initialValue", "targetValue", "Lm0/N;", "animationSpec", "LU0/A1;", "d", "(Lm0/v0;Ljava/lang/Object;Ljava/lang/Object;Lm0/N;Lm0/z0;Ljava/lang/String;LU0/m;I)LU0/A1;", "Lkotlin/Function1;", "Lm0/j0;", "LXH/N;", "a", "LnI/l;", "SeekableTransitionStateTotalDurationChanged", "Lg1/z;", "LXH/o;", "e", "()Lg1/z;", "SeekableStateObserver", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C17642l<C5549j0<?>, C16807N> f25997a = b.f26001c;

    /* renamed from: b  reason: collision with root package name */
    private static final C16824o f25998b = C16825p.a(s.NONE, a.f25999c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg1/z;", "b", "()Lg1/z;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C5357z> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f25999c = new a();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "it", "a", "(LnI/a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: m0.w0$a$a  reason: collision with other inner class name */
        static final class C0416a extends C17544u implements C17642l<C17631a<? extends C16807N>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0416a f26000c = new C0416a();

            C0416a() {
                super(1);
            }

            public final void a(C17631a<C16807N> aVar) {
                aVar.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C17631a) obj);
                return C16807N.f139792a;
            }
        }

        a() {
            super(0);
        }

        /* renamed from: b */
        public final C5357z invoke() {
            C5357z zVar = new C5357z(C0416a.f26000c);
            zVar.s();
            return zVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/j0;", "it", "LXH/N;", "a", "(Lm0/j0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C5549j0<?>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f26001c = new b();

        b() {
            super(1);
        }

        public final void a(C5549j0<?> j0Var) {
            j0Var.M();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5549j0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "T", "LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v0<S> f26002c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v0<T> f26003d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"m0/w0$c$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v0 f26004a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v0 f26005b;

            public a(v0 v0Var, v0 v0Var2) {
                this.f26004a = v0Var;
                this.f26005b = v0Var2;
            }

            public void b() {
                this.f26004a.D(this.f26005b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(v0<S> v0Var, v0<T> v0Var2) {
            super(1);
            this.f26002c = v0Var;
            this.f26003d = v0Var2;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f26002c.d(this.f26003d);
            return new a(this.f26002c, this.f26003d);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"S", "T", "Lm0/q;", "V", "LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v0<S> f26006c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v0<S>.defpackage.a<T, V> f26007d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"m0/w0$d$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v0 f26008a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v0.a f26009b;

            public a(v0 v0Var, v0.a aVar) {
                this.f26008a = v0Var;
                this.f26009b = aVar;
            }

            public void b() {
                this.f26008a.B(this.f26009b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(v0<S> v0Var, v0<S>.defpackage.a<T, V> aVar) {
            super(1);
            this.f26006c = v0Var;
            this.f26007d = aVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            return new a(this.f26006c, this.f26007d);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"S", "T", "Lm0/q;", "V", "LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v0<S> f26010c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v0<S>.defpackage.d<T, V> f26011d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"m0/w0$e$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v0 f26012a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v0.d f26013b;

            public a(v0 v0Var, v0.d dVar) {
                this.f26012a = v0Var;
                this.f26013b = dVar;
            }

            public void b() {
                this.f26012a.C(this.f26013b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(v0<S> v0Var, v0<S>.defpackage.d<T, V> dVar) {
            super(1);
            this.f26010c = v0Var;
            this.f26011d = dVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f26010c.c(this.f26011d);
            return new a(this.f26010c, this.f26011d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2191}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f26014c;

        /* renamed from: d  reason: collision with root package name */
        Object f26015d;

        /* renamed from: e  reason: collision with root package name */
        int f26016e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ x0<T> f26017f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(x0<T> x0Var, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f26017f = x0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f26017f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17052a aVar;
            x0<T> x0Var;
            Object f10 = C17187b.f();
            int i10 = this.f26016e;
            if (i10 == 0) {
                y.b(obj);
                ((C5549j0) this.f26017f).L();
                aVar = ((C5549j0) this.f26017f).H();
                x0<T> x0Var2 = this.f26017f;
                this.f26014c = aVar;
                this.f26015d = x0Var2;
                this.f26016e = 1;
                if (aVar.e((Object) null, this) == f10) {
                    return f10;
                }
                x0Var = x0Var2;
            } else if (i10 == 1) {
                x0Var = (x0) this.f26015d;
                aVar = (C17052a) this.f26014c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ((C5549j0) x0Var).S(x0Var.b());
                C16320n G10 = ((C5549j0) x0Var).G();
                if (G10 != null) {
                    x.a aVar2 = x.f139812b;
                    G10.resumeWith(x.b(x0Var.b()));
                }
                ((C5549j0) x0Var).T((C16320n) null);
                C16807N n10 = C16807N.f139792a;
                aVar.d((Object) null);
                return C16807N.f139792a;
            } catch (Throwable th2) {
                aVar.d((Object) null);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v0<T> f26018c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"m0/w0$g$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v0 f26019a;

            public a(v0 v0Var) {
                this.f26019a = v0Var;
            }

            public void b() {
                this.f26019a.w();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(v0<T> v0Var) {
            super(1);
            this.f26018c = v0Var;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            return new a(this.f26018c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v0<T> f26020c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"m0/w0$h$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v0 f26021a;

            public a(v0 v0Var) {
                this.f26021a = v0Var;
            }

            public void b() {
                this.f26021a.w();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(v0<T> v0Var) {
            super(1);
            this.f26020c = v0Var;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            return new a(this.f26020c);
        }
    }

    public static final <S, T> v0<T> b(v0<S> v0Var, T t10, T t11, String str, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-198307638, i10, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1825)");
        }
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i11 > 4 && mVar.V(v0Var)) || (i10 & 6) == 4;
        Object D10 = mVar.D();
        if (z11 || D10 == C4889m.f14007a.a()) {
            D10 = new v0(new C5537d0(t10), v0Var, v0Var.k() + " > " + str);
            mVar.u(D10);
        }
        v0<T> v0Var2 = (v0) D10;
        if ((i11 <= 4 || !mVar.V(v0Var)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean V10 = mVar.V(v0Var2) | z10;
        Object D11 = mVar.D();
        if (V10 || D11 == C4889m.f14007a.a()) {
            D11 = new c(v0Var, v0Var2);
            mVar.u(D11);
        }
        P.c(v0Var2, (C17642l) D11, mVar, 0);
        if (v0Var.u()) {
            v0Var2.G(t10, t11, v0Var.l());
        } else {
            v0Var2.R(t11);
            v0Var2.K(false);
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        return v0Var2;
    }

    public static final <S, T, V extends C5562q> v0<S>.defpackage.a<T, V> c(v0<S> v0Var, z0<T, V> z0Var, String str, C4889m mVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (C4895p.J()) {
            C4895p.S(-1714122528, i10, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1779)");
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && mVar.V(v0Var)) || (i10 & 6) == 4;
        Object D10 = mVar.D();
        if (z11 || D10 == C4889m.f14007a.a()) {
            D10 = new v0.a(z0Var, str);
            mVar.u(D10);
        }
        v0<S>.defpackage.a<T, V> aVar = (v0.a) D10;
        if ((i12 <= 4 || !mVar.V(v0Var)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean F10 = mVar.F(aVar) | z10;
        Object D11 = mVar.D();
        if (F10 || D11 == C4889m.f14007a.a()) {
            D11 = new d(v0Var, aVar);
            mVar.u(D11);
        }
        P.c(aVar, (C17642l) D11, mVar, 0);
        if (v0Var.u()) {
            aVar.d();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        return aVar;
    }

    public static final <S, T, V extends C5562q> A1<T> d(v0<S> v0Var, T t10, T t11, N<T> n10, z0<T, V> z0Var, String str, C4889m mVar, int i10) {
        v0<S> v0Var2 = v0Var;
        T t12 = t11;
        N<T> n11 = n10;
        C4889m mVar2 = mVar;
        int i11 = i10;
        if (C4895p.J()) {
            C4895p.S(-304821198, i11, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1900)");
        }
        int i12 = (i11 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && mVar2.V(v0Var2)) || (i11 & 6) == 4;
        Object D10 = mVar.D();
        if (z11 || D10 == C4889m.f14007a.a()) {
            z0<T, V> z0Var2 = z0Var;
            v0.d dVar = new v0.d(t10, C5552l.i(z0Var2, t12), z0Var2, str);
            mVar2.u(dVar);
            D10 = dVar;
        }
        v0.d dVar2 = (v0.d) D10;
        if (v0Var.u()) {
            dVar2.K(t10, t12, n11);
        } else {
            dVar2.M(t12, n11);
        }
        if ((i12 <= 4 || !mVar2.V(v0Var2)) && (i11 & 6) != 4) {
            z10 = false;
        }
        boolean V10 = mVar2.V(dVar2) | z10;
        Object D11 = mVar.D();
        if (V10 || D11 == C4889m.f14007a.a()) {
            D11 = new e(v0Var2, dVar2);
            mVar2.u(D11);
        }
        P.c(dVar2, (C17642l) D11, mVar2, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        return dVar2;
    }

    public static final C5357z e() {
        return (C5357z) f25998b.getValue();
    }

    public static final <T> v0<T> f(x0<T> x0Var, String str, C4889m mVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (C4895p.J()) {
            C4895p.S(1643203617, i10, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:820)");
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && mVar.V(x0Var)) || (i10 & 6) == 4;
        Object D10 = mVar.D();
        if (z11 || D10 == C4889m.f14007a.a()) {
            D10 = new v0(x0Var, str);
            mVar.u(D10);
        }
        v0<T> v0Var = (v0) D10;
        if (x0Var instanceof C5549j0) {
            mVar.W(1030413636);
            T a10 = x0Var.a();
            T b10 = x0Var.b();
            if ((i12 <= 4 || !mVar.V(x0Var)) && (i10 & 6) != 4) {
                z10 = false;
            }
            Object D11 = mVar.D();
            if (z10 || D11 == C4889m.f14007a.a()) {
                D11 = new f(x0Var, (C17164e<? super f>) null);
                mVar.u(D11);
            }
            P.f(a10, b10, (p) D11, mVar, 0);
            mVar.P();
        } else {
            mVar.W(1030875195);
            v0Var.e(x0Var.b(), mVar, 0);
            mVar.P();
        }
        boolean V10 = mVar.V(v0Var);
        Object D12 = mVar.D();
        if (V10 || D12 == C4889m.f14007a.a()) {
            D12 = new g(v0Var);
            mVar.u(D12);
        }
        P.c(v0Var, (C17642l) D12, mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        return v0Var;
    }

    public static final <T> v0<T> g(T t10, String str, C4889m mVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (C4895p.J()) {
            C4895p.S(2029166765, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:91)");
        }
        Object D10 = mVar.D();
        C4889m.a aVar = C4889m.f14007a;
        if (D10 == aVar.a()) {
            D10 = new v0(t10, str);
            mVar.u(D10);
        }
        v0<T> v0Var = (v0) D10;
        v0Var.e(t10, mVar, (i10 & 8) | 48 | (i10 & 14));
        Object D11 = mVar.D();
        if (D11 == aVar.a()) {
            D11 = new h(v0Var);
            mVar.u(D11);
        }
        P.c(v0Var, (C17642l) D11, mVar, 54);
        if (C4895p.J()) {
            C4895p.R();
        }
        return v0Var;
    }

    @C16814e
    public static final <T> v0<T> h(C5537d0<T> d0Var, String str, C4889m mVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (C4895p.J()) {
            C4895p.S(882913843, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:873)");
        }
        v0<T> f10 = f(d0Var, str, mVar, i10 & 126, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        return f10;
    }
}
