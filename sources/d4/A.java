package D4;

import D4.E;
import QJ.Q;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"LD4/A;", "", "T", "LQJ/Q;", "scope", "LD4/M;", "parent", "LD4/a;", "tracker", "<init>", "(LQJ/Q;LD4/M;LD4/a;)V", "b", "()LD4/M;", "LXH/N;", "c", "(LdI/e;)Ljava/lang/Object;", "a", "LQJ/Q;", "getScope", "()LQJ/Q;", "LD4/M;", "getParent", "LD4/b;", "LD4/b;", "accumulated", "LD4/a;", "d", "()LD4/a;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class A<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Q f33843a;

    /* renamed from: b  reason: collision with root package name */
    private final M<T> f33844b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6428b<T> f33845c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "LTJ/h;", "LD4/E;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.MulticastedPagingData$asPagingData$1", f = "CachedPagingData.kt", l = {51}, m = "invokeSuspend")
    static final class a extends l implements p<C16533h<? super E<T>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f33846c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A<T> f33847d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(A<T> a10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f33847d = a10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f33847d, eVar);
        }

        public final Object invoke(C16533h<? super E<T>> hVar, C17164e<? super C16807N> eVar) {
            return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            int i10 = this.f33846c;
            if (i10 == 0) {
                y.b(obj);
                this.f33847d.d();
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "LTJ/h;", "LD4/E;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.MulticastedPagingData$asPagingData$2", f = "CachedPagingData.kt", l = {53}, m = "invokeSuspend")
    static final class b extends l implements q<C16533h<? super E<T>>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f33848c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A<T> f33849d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(A<T> a10, C17164e<? super b> eVar) {
            super(3, eVar);
            this.f33849d = a10;
        }

        public final Object invoke(C16533h<? super E<T>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            return new b(this.f33849d, eVar).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            int i10 = this.f33848c;
            if (i10 == 0) {
                y.b(obj);
                this.f33849d.d();
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "LD4/E$b;", "b", "()LD4/E$b;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<E.b<T>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A<T> f33850c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(A<T> a10) {
            super(0);
            this.f33850c = a10;
        }

        /* renamed from: b */
        public final E.b<T> invoke() {
            return this.f33850c.f33845c.f();
        }
    }

    public A(Q q10, M<T> m10, C6427a aVar) {
        C17542s.j(q10, "scope");
        C17542s.j(m10, "parent");
        this.f33843a = q10;
        this.f33844b = m10;
        this.f33845c = new C6428b<>(m10.d(), q10);
    }

    public final M<T> b() {
        return new M<>(C16534i.Q(C16534i.S(this.f33845c.g(), new a(this, (C17164e<? super a>) null)), new b(this, (C17164e<? super b>) null)), this.f33844b.f(), this.f33844b.e(), new c(this));
    }

    public final Object c(C17164e<? super C16807N> eVar) {
        this.f33845c.e();
        return C16807N.f139792a;
    }

    public final C6427a d() {
        return null;
    }
}
