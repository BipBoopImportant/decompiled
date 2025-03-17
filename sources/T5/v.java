package T5;

import QJ.C16311i0;
import QJ.Q;
import QJ.S;
import QJ.T;
import QJ.Y;
import T5.C6704h;
import T5.j;
import XH.C16807N;
import XH.C16824o;
import XH.y;
import android.content.Context;
import c6.C7095a;
import c6.C7099e;
import dI.C17164e;
import eI.C17187b;
import f6.C7853d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k6.C8437d;
import k6.C8441h;
import k6.C8445l;
import k6.C8452s;
import k6.C8453t;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import l6.h;
import nI.p;
import r6.C8690A;
import r6.C8691B;
import r6.s;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0006H@¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u001a\u00104\u001a\u0002008\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u0002058VX\u0004¢\u0006\u0006\u001a\u0004\b*\u00106R\u001d\u0010<\u001a\u0004\u0018\u0001088VX\u0002¢\u0006\f\u001a\u0004\b&\u00109*\u0004\b:\u0010;R\u001d\u0010@\u001a\u0004\u0018\u00010=8VX\u0002¢\u0006\f\u001a\u0004\b!\u0010>*\u0004\b?\u0010;R\u000b\u0010B\u001a\u00020A8\u0002X\u0004¨\u0006C"}, d2 = {"LT5/v;", "LT5/r;", "LT5/v$a;", "options", "<init>", "(LT5/v$a;)V", "Lk6/h;", "initialRequest", "", "type", "Lk6/l;", "g", "(Lk6/h;ILdI/e;)Ljava/lang/Object;", "Lk6/u;", "result", "Lo6/a;", "target", "LT5/j;", "eventListener", "LXH/N;", "k", "(Lk6/u;Lo6/a;LT5/j;)V", "Lk6/e;", "j", "(Lk6/e;Lo6/a;LT5/j;)V", "request", "i", "(Lk6/h;LT5/j;)V", "Lk6/d;", "e", "(Lk6/h;)Lk6/d;", "d", "(Lk6/h;LdI/e;)Ljava/lang/Object;", "a", "LT5/v$a;", "h", "()LT5/v$a;", "LQJ/Q;", "b", "LQJ/Q;", "scope", "Lr6/A;", "c", "Lr6/A;", "systemCallbacks", "Lk6/s;", "Lk6/s;", "requestService", "LT5/h;", "LT5/h;", "getComponents", "()LT5/h;", "components", "Lk6/h$b;", "()Lk6/h$b;", "defaults", "Lf6/d;", "()Lf6/d;", "getMemoryCache$delegate", "(LT5/v;)Ljava/lang/Object;", "memoryCache", "LY5/a;", "()LY5/a;", "getDiskCache$delegate", "diskCache", "", "shutdown", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements r {

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f40069g = AtomicIntegerFieldUpdater.newUpdater(v.class, "f");

    /* renamed from: a  reason: collision with root package name */
    private final a f40070a;

    /* renamed from: b  reason: collision with root package name */
    private final Q f40071b = y.c((s) null);

    /* renamed from: c  reason: collision with root package name */
    private final C8690A f40072c;

    /* renamed from: d  reason: collision with root package name */
    private final C8452s f40073d;

    /* renamed from: e  reason: collision with root package name */
    private final C6704h f40074e;

    /* renamed from: f  reason: collision with root package name */
    private volatile /* synthetic */ int f40075f;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001BU\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b!\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b,\u00100¨\u00061"}, d2 = {"LT5/v$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "application", "Lk6/h$b;", "defaults", "LXH/o;", "Lf6/d;", "memoryCacheLazy", "LY5/a;", "diskCacheLazy", "LT5/j$c;", "eventListenerFactory", "LT5/h;", "componentRegistry", "Lr6/s;", "logger", "<init>", "(Landroid/content/Context;Lk6/h$b;LXH/o;LXH/o;LT5/j$c;LT5/h;Lr6/s;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/Context;", "()Landroid/content/Context;", "b", "Lk6/h$b;", "c", "()Lk6/h$b;", "LXH/o;", "g", "()LXH/o;", "d", "e", "LT5/j$c;", "()LT5/j$c;", "f", "LT5/h;", "()LT5/h;", "Lr6/s;", "()Lr6/s;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f40076a;

        /* renamed from: b  reason: collision with root package name */
        private final C8441h.b f40077b;

        /* renamed from: c  reason: collision with root package name */
        private final C16824o<C7853d> f40078c;

        /* renamed from: d  reason: collision with root package name */
        private final C16824o<Y5.a> f40079d;

        /* renamed from: e  reason: collision with root package name */
        private final j.c f40080e;

        /* renamed from: f  reason: collision with root package name */
        private final C6704h f40081f;

        public a(Context context, C8441h.b bVar, C16824o<? extends C7853d> oVar, C16824o<? extends Y5.a> oVar2, j.c cVar, C6704h hVar, s sVar) {
            this.f40076a = context;
            this.f40077b = bVar;
            this.f40078c = oVar;
            this.f40079d = oVar2;
            this.f40080e = cVar;
            this.f40081f = hVar;
        }

        public final Context a() {
            return this.f40076a;
        }

        public final C6704h b() {
            return this.f40081f;
        }

        public final C8441h.b c() {
            return this.f40077b;
        }

        public final C16824o<Y5.a> d() {
            return this.f40079d;
        }

        public final j.c e() {
            return this.f40080e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f40076a, aVar.f40076a) && C17542s.e(this.f40077b, aVar.f40077b) && C17542s.e(this.f40078c, aVar.f40078c) && C17542s.e(this.f40079d, aVar.f40079d) && C17542s.e(this.f40080e, aVar.f40080e) && C17542s.e(this.f40081f, aVar.f40081f) && C17542s.e((Object) null, (Object) null);
        }

        public final s f() {
            return null;
        }

        public final C16824o<C7853d> g() {
            return this.f40078c;
        }

        public int hashCode() {
            return ((((((((((this.f40076a.hashCode() * 31) + this.f40077b.hashCode()) * 31) + this.f40078c.hashCode()) * 31) + this.f40079d.hashCode()) * 31) + this.f40080e.hashCode()) * 31) + this.f40081f.hashCode()) * 31;
        }

        public String toString() {
            return "Options(application=" + this.f40076a + ", defaults=" + this.f40077b + ", memoryCacheLazy=" + this.f40078c + ", diskCacheLazy=" + this.f40079d + ", eventListenerFactory=" + this.f40080e + ", componentRegistry=" + this.f40081f + ", logger=" + null + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lk6/l;", "<anonymous>", "(LQJ/Q;)Lk6/l;"}, k = 3, mv = {2, 1, 0})
    @f(c = "coil3.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {67}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C8445l>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40082c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f40083d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8441h f40084e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(v vVar, C8441h hVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f40083d = vVar;
            this.f40084e = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f40083d, this.f40084e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C8445l> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f40082c;
            if (i10 == 0) {
                y.b(obj);
                v vVar = this.f40083d;
                C8441h hVar = this.f40084e;
                this.f40082c = 1;
                obj = vVar.g(hVar, 0, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lk6/l;", "<anonymous>", "(LQJ/Q;)Lk6/l;"}, k = 3, mv = {2, 1, 0})
    @f(c = "coil3.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {87}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C8445l>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40085c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f40086d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8441h f40087e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f40088f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lk6/l;", "<anonymous>", "(LQJ/Q;)Lk6/l;"}, k = 3, mv = {2, 1, 0})
        @f(c = "coil3.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {83}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C8445l>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f40089c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ v f40090d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C8441h f40091e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(v vVar, C8441h hVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f40090d = vVar;
                this.f40091e = hVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f40090d, this.f40091e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C8445l> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f40089c;
                if (i10 == 0) {
                    y.b(obj);
                    v vVar = this.f40090d;
                    C8441h hVar = this.f40091e;
                    this.f40089c = 1;
                    obj = vVar.g(hVar, 1, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C8441h hVar, v vVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f40087e = hVar;
            this.f40088f = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f40087e, this.f40088f, eVar);
            cVar.f40086d = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C8445l> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f40085c;
            if (i10 == 0) {
                y.b(obj);
                Y<C8445l> a10 = z.c(this.f40087e, C16314k.b((Q) this.f40086d, C16311i0.c().P0(), (T) null, new a(this.f40088f, this.f40087e, (C17164e<? super a>) null), 2, (Object) null)).a();
                this.f40085c = 1;
                obj = a10.f(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", l = {117, 129, 133}, m = "execute")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f40092c;

        /* renamed from: d  reason: collision with root package name */
        Object f40093d;

        /* renamed from: e  reason: collision with root package name */
        Object f40094e;

        /* renamed from: f  reason: collision with root package name */
        Object f40095f;

        /* renamed from: g  reason: collision with root package name */
        Object f40096g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f40097h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ v f40098i;

        /* renamed from: j  reason: collision with root package name */
        int f40099j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(v vVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f40098i = vVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f40097h = obj;
            this.f40099j |= Integer.MIN_VALUE;
            return this.f40098i.g((C8441h) null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lk6/l;", "<anonymous>", "(LQJ/Q;)Lk6/l;"}, k = 3, mv = {2, 1, 0})
    @f(c = "coil3.RealImageLoader$execute$result$1", f = "RealImageLoader.kt", l = {142}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C8445l>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40100c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C8441h f40101d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f40102e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h f40103f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ j f40104g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ n f40105h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C8441h hVar, v vVar, h hVar2, j jVar, n nVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f40101d = hVar;
            this.f40102e = vVar;
            this.f40103f = hVar2;
            this.f40104g = jVar;
            this.f40105h = nVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f40101d, this.f40102e, this.f40103f, this.f40104g, this.f40105h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C8445l> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f40100c;
            if (i10 == 0) {
                y.b(obj);
                C7099e eVar = new C7099e(this.f40101d, this.f40102e.getComponents().g(), 0, this.f40101d, this.f40103f, this.f40104g, this.f40105h != null);
                this.f40100c = 1;
                obj = eVar.c(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public v(a aVar) {
        this.f40070a = aVar;
        aVar.f();
        C8690A a10 = C8691B.a(this);
        this.f40072c = a10;
        aVar.f();
        C8452s a11 = C8453t.a(this, a10, (s) null);
        this.f40073d = a11;
        aVar.g();
        aVar.d();
        C6704h.a e10 = y.e(B.a(A.a(z.a(y.f(aVar.b().k(), aVar), aVar), aVar), aVar));
        aVar.f();
        this.f40074e = e10.i(new C7095a(this, a10, a11, (s) null)).p();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: T5.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: k6.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: k6.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: T5.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: T5.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: k6.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: k6.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: T5.v} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0103 A[Catch:{ all -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010d A[Catch:{ all -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0114 A[Catch:{ all -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0128 A[Catch:{ all -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0144 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0176 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0181 A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018c A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ae A[Catch:{ all -> 0x01bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01bf A[SYNTHETIC, Splitter:B:99:0x01bf] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(k6.C8441h r21, int r22, dI.C17164e<? super k6.C8445l> r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r23
            boolean r3 = r2 instanceof T5.v.d
            if (r3 == 0) goto L_0x0019
            r3 = r2
            T5.v$d r3 = (T5.v.d) r3
            int r4 = r3.f40099j
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f40099j = r4
            goto L_0x001e
        L_0x0019:
            T5.v$d r3 = new T5.v$d
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f40097h
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r3.f40099j
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r5 == 0) goto L_0x0097
            if (r5 == r9) goto L_0x0078
            if (r5 == r7) goto L_0x0056
            if (r5 != r6) goto L_0x004e
            java.lang.Object r0 = r3.f40095f
            r4 = r0
            T5.j r4 = (T5.j) r4
            java.lang.Object r0 = r3.f40094e
            r5 = r0
            k6.h r5 = (k6.C8441h) r5
            java.lang.Object r0 = r3.f40093d
            r6 = r0
            k6.r r6 = (k6.C8451r) r6
            java.lang.Object r0 = r3.f40092c
            r3 = r0
            T5.v r3 = (T5.v) r3
            XH.y.b(r2)     // Catch:{ all -> 0x004b }
            goto L_0x017b
        L_0x004b:
            r0 = move-exception
            goto L_0x01aa
        L_0x004e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0056:
            java.lang.Object r0 = r3.f40096g
            T5.n r0 = (T5.n) r0
            java.lang.Object r5 = r3.f40095f
            T5.j r5 = (T5.j) r5
            java.lang.Object r7 = r3.f40094e
            k6.h r7 = (k6.C8441h) r7
            java.lang.Object r9 = r3.f40093d
            k6.r r9 = (k6.C8451r) r9
            java.lang.Object r10 = r3.f40092c
            T5.v r10 = (T5.v) r10
            XH.y.b(r2)     // Catch:{ all -> 0x0071 }
            r17 = r0
            goto L_0x014e
        L_0x0071:
            r0 = move-exception
            r4 = r5
            r5 = r7
            r6 = r9
            r3 = r10
            goto L_0x01aa
        L_0x0078:
            java.lang.Object r0 = r3.f40095f
            r5 = r0
            T5.j r5 = (T5.j) r5
            java.lang.Object r0 = r3.f40094e
            r9 = r0
            k6.h r9 = (k6.C8441h) r9
            java.lang.Object r0 = r3.f40093d
            r10 = r0
            k6.r r10 = (k6.C8451r) r10
            java.lang.Object r0 = r3.f40092c
            r11 = r0
            T5.v r11 = (T5.v) r11
            XH.y.b(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x00e6
        L_0x0090:
            r0 = move-exception
            r4 = r5
            r5 = r9
            r6 = r10
        L_0x0094:
            r3 = r11
            goto L_0x01aa
        L_0x0097:
            XH.y.b(r2)
            k6.s r2 = r1.f40073d
            dI.i r5 = r3.getContext()
            QJ.F0 r5 = QJ.I0.m(r5)
            if (r22 != 0) goto L_0x00a8
            r10 = r9
            goto L_0x00a9
        L_0x00a8:
            r10 = 0
        L_0x00a9:
            k6.r r2 = r2.e(r0, r5, r10)
            r2.n()
            k6.s r5 = r1.f40073d
            k6.h r5 = r5.d(r0)
            T5.v$a r0 = r1.f40070a
            T5.j$c r0 = r0.e()
            T5.j r10 = r0.c(r5)
            java.lang.Object r0 = r5.d()     // Catch:{ all -> 0x00e8 }
            k6.n r11 = k6.C8447n.f54251a     // Catch:{ all -> 0x00e8 }
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r11)     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x01a4
            r2.start()     // Catch:{ all -> 0x00e8 }
            if (r22 != 0) goto L_0x00ee
            r3.f40092c = r1     // Catch:{ all -> 0x00e8 }
            r3.f40093d = r2     // Catch:{ all -> 0x00e8 }
            r3.f40094e = r5     // Catch:{ all -> 0x00e8 }
            r3.f40095f = r10     // Catch:{ all -> 0x00e8 }
            r3.f40099j = r9     // Catch:{ all -> 0x00e8 }
            java.lang.Object r0 = r2.b(r3)     // Catch:{ all -> 0x00e8 }
            if (r0 != r4) goto L_0x00e2
            return r4
        L_0x00e2:
            r11 = r1
            r9 = r5
            r5 = r10
            r10 = r2
        L_0x00e6:
            r2 = r10
            goto L_0x00f1
        L_0x00e8:
            r0 = move-exception
            r3 = r1
            r6 = r2
            r4 = r10
            goto L_0x01aa
        L_0x00ee:
            r11 = r1
            r9 = r5
            r5 = r10
        L_0x00f1:
            f6.d$b r0 = r9.u()     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x010d
            f6.d r10 = r11.b()     // Catch:{ all -> 0x0108 }
            if (r10 == 0) goto L_0x010d
            f6.d$c r0 = r10.b(r0)     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x010d
            T5.n r0 = r0.b()     // Catch:{ all -> 0x0108 }
            goto L_0x010e
        L_0x0108:
            r0 = move-exception
            r6 = r2
            r4 = r5
            r5 = r9
            goto L_0x0094
        L_0x010d:
            r0 = r8
        L_0x010e:
            o6.a r10 = r9.y()     // Catch:{ all -> 0x0108 }
            if (r10 == 0) goto L_0x011f
            if (r0 != 0) goto L_0x011b
            T5.n r12 = r9.B()     // Catch:{ all -> 0x0108 }
            goto L_0x011c
        L_0x011b:
            r12 = r0
        L_0x011c:
            r10.b(r12)     // Catch:{ all -> 0x0108 }
        L_0x011f:
            r5.b(r9)     // Catch:{ all -> 0x0108 }
            k6.h$d r10 = r9.p()     // Catch:{ all -> 0x0108 }
            if (r10 == 0) goto L_0x012b
            r10.b(r9)     // Catch:{ all -> 0x0108 }
        L_0x012b:
            l6.j r10 = r9.x()     // Catch:{ all -> 0x0108 }
            r5.n(r9, r10)     // Catch:{ all -> 0x0108 }
            r3.f40092c = r11     // Catch:{ all -> 0x0108 }
            r3.f40093d = r2     // Catch:{ all -> 0x0108 }
            r3.f40094e = r9     // Catch:{ all -> 0x0108 }
            r3.f40095f = r5     // Catch:{ all -> 0x0108 }
            r3.f40096g = r0     // Catch:{ all -> 0x0108 }
            r3.f40099j = r7     // Catch:{ all -> 0x0108 }
            java.lang.Object r7 = r10.b(r3)     // Catch:{ all -> 0x0108 }
            if (r7 != r4) goto L_0x0145
            return r4
        L_0x0145:
            r17 = r0
            r10 = r11
            r19 = r9
            r9 = r2
            r2 = r7
            r7 = r19
        L_0x014e:
            r15 = r2
            l6.h r15 = (l6.h) r15     // Catch:{ all -> 0x0071 }
            r5.m(r7, r15)     // Catch:{ all -> 0x0071 }
            dI.i r0 = r7.o()     // Catch:{ all -> 0x0071 }
            T5.v$e r2 = new T5.v$e     // Catch:{ all -> 0x0071 }
            r18 = 0
            r12 = r2
            r13 = r7
            r14 = r10
            r16 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0071 }
            r3.f40092c = r10     // Catch:{ all -> 0x0071 }
            r3.f40093d = r9     // Catch:{ all -> 0x0071 }
            r3.f40094e = r7     // Catch:{ all -> 0x0071 }
            r3.f40095f = r5     // Catch:{ all -> 0x0071 }
            r3.f40096g = r8     // Catch:{ all -> 0x0071 }
            r3.f40099j = r6     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = QJ.C16310i.g(r0, r2, r3)     // Catch:{ all -> 0x0071 }
            if (r2 != r4) goto L_0x0177
            return r4
        L_0x0177:
            r4 = r5
            r5 = r7
            r6 = r9
            r3 = r10
        L_0x017b:
            k6.l r2 = (k6.C8445l) r2     // Catch:{ all -> 0x004b }
            boolean r0 = r2 instanceof k6.C8454u     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x018c
            r0 = r2
            k6.u r0 = (k6.C8454u) r0     // Catch:{ all -> 0x004b }
            o6.a r7 = r5.y()     // Catch:{ all -> 0x004b }
            r3.k(r0, r7, r4)     // Catch:{ all -> 0x004b }
            goto L_0x019a
        L_0x018c:
            boolean r0 = r2 instanceof k6.C8438e     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x019e
            r0 = r2
            k6.e r0 = (k6.C8438e) r0     // Catch:{ all -> 0x004b }
            o6.a r7 = r5.y()     // Catch:{ all -> 0x004b }
            r3.j(r0, r7, r4)     // Catch:{ all -> 0x004b }
        L_0x019a:
            r6.l()
            return r2
        L_0x019e:
            XH.t r0 = new XH.t     // Catch:{ all -> 0x004b }
            r0.<init>()     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x01a4:
            k6.o r0 = new k6.o     // Catch:{ all -> 0x00e8 }
            r0.<init>()     // Catch:{ all -> 0x00e8 }
            throw r0     // Catch:{ all -> 0x00e8 }
        L_0x01aa:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x01bd }
            if (r2 != 0) goto L_0x01bf
            k6.e r0 = r6.E.c(r5, r0)     // Catch:{ all -> 0x01bd }
            o6.a r2 = r5.y()     // Catch:{ all -> 0x01bd }
            r3.j(r0, r2, r4)     // Catch:{ all -> 0x01bd }
            r6.l()
            return r0
        L_0x01bd:
            r0 = move-exception
            goto L_0x01c3
        L_0x01bf:
            r3.i(r5, r4)     // Catch:{ all -> 0x01bd }
            throw r0     // Catch:{ all -> 0x01bd }
        L_0x01c3:
            r6.l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.v.g(k6.h, int, dI.e):java.lang.Object");
    }

    private final void i(C8441h hVar, j jVar) {
        this.f40070a.f();
        jVar.d(hVar);
        C8441h.d p10 = hVar.p();
        if (p10 != null) {
            p10.d(hVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        if (r5 != null) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j(k6.C8438e r4, o6.C8607a r5, T5.j r6) {
        /*
            r3 = this;
            k6.h r0 = r4.b()
            T5.v$a r1 = r3.f40070a
            r1.f()
            boolean r1 = r5 instanceof q6.C8678e
            if (r1 != 0) goto L_0x0010
            if (r5 == 0) goto L_0x003c
            goto L_0x0023
        L_0x0010:
            k6.h r1 = r4.b()
            q6.d$a r1 = k6.C8444k.p(r1)
            r2 = r5
            q6.e r2 = (q6.C8678e) r2
            q6.d r1 = r1.a(r2, r4)
            boolean r2 = r1 instanceof q6.C8676c
            if (r2 == 0) goto L_0x002b
        L_0x0023:
            T5.n r1 = r4.k()
            r5.e(r1)
            goto L_0x003c
        L_0x002b:
            k6.h r5 = r4.b()
            r6.r(r5, r1)
            r1.a()
            k6.h r5 = r4.b()
            r6.q(r5, r1)
        L_0x003c:
            r6.c(r0, r4)
            k6.h$d r5 = r0.p()
            if (r5 == 0) goto L_0x0048
            r5.c(r0, r4)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.v.j(k6.e, o6.a, T5.j):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        if (r5 != null) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void k(k6.C8454u r4, o6.C8607a r5, T5.j r6) {
        /*
            r3 = this;
            k6.h r0 = r4.b()
            r4.a()
            T5.v$a r1 = r3.f40070a
            r1.f()
            boolean r1 = r5 instanceof q6.C8678e
            if (r1 != 0) goto L_0x0013
            if (r5 == 0) goto L_0x003f
            goto L_0x0026
        L_0x0013:
            k6.h r1 = r4.b()
            q6.d$a r1 = k6.C8444k.p(r1)
            r2 = r5
            q6.e r2 = (q6.C8678e) r2
            q6.d r1 = r1.a(r2, r4)
            boolean r2 = r1 instanceof q6.C8676c
            if (r2 == 0) goto L_0x002e
        L_0x0026:
            T5.n r1 = r4.k()
            r5.d(r1)
            goto L_0x003f
        L_0x002e:
            k6.h r5 = r4.b()
            r6.r(r5, r1)
            r1.a()
            k6.h r5 = r4.b()
            r6.q(r5, r1)
        L_0x003f:
            r6.a(r0, r4)
            k6.h$d r5 = r0.p()
            if (r5 == 0) goto L_0x004b
            r5.a(r0, r4)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.v.k(k6.u, o6.a, T5.j):void");
    }

    public Y5.a a() {
        return this.f40070a.d().getValue();
    }

    public C7853d b() {
        return this.f40070a.g().getValue();
    }

    public C8441h.b c() {
        return this.f40070a.c();
    }

    public Object d(C8441h hVar, C17164e<? super C8445l> eVar) {
        return !z.d(hVar) ? g(hVar, 1, eVar) : S.f(new c(hVar, this, (C17164e<? super c>) null), eVar);
    }

    public C8437d e(C8441h hVar) {
        return z.c(hVar, C16314k.b(this.f40071b, C16311i0.c().P0(), (T) null, new b(this, hVar, (C17164e<? super b>) null), 2, (Object) null));
    }

    public C6704h getComponents() {
        return this.f40074e;
    }

    public final a h() {
        return this.f40070a;
    }
}
