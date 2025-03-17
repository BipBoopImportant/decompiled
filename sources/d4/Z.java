package D4;

import QJ.C16310i;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004J\u001f\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"LD4/Z;", "", "Key", "Value", "Lkotlin/Function0;", "LD4/P;", "b", "(LdI/e;)Ljava/lang/Object;", "c", "()LD4/P;", "LQJ/M;", "a", "LQJ/M;", "dispatcher", "LnI/a;", "delegate", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Z<Key, Value> implements C17631a<P<Key, Value>> {

    /* renamed from: a  reason: collision with root package name */
    private final M f34262a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17631a<P<Key, Value>> f34263b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "LQJ/Q;", "LD4/P;", "<anonymous>", "(LQJ/Q;)LD4/P;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.SuspendingPagingSourceFactory$create$2", f = "SuspendingPagingSourceFactory.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super P<Key, Value>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34264c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Z<Key, Value> f34265d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Z<Key, Value> z10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f34265d = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f34265d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super P<Key, Value>> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f34264c == 0) {
                y.b(obj);
                return this.f34265d.f34263b.invoke();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object b(C17164e<? super P<Key, Value>> eVar) {
        return C16310i.g(this.f34262a, new a(this, (C17164e<? super a>) null), eVar);
    }

    /* renamed from: c */
    public P<Key, Value> invoke() {
        return this.f34263b.invoke();
    }
}
