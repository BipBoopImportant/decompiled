package QJ;

import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a.\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "LdI/i;", "context", "Lkotlin/Function0;", "block", "b", "(LdI/i;LnI/a;LdI/e;)Ljava/lang/Object;", "coroutineContext", "d", "(LdI/i;LnI/a;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C0 {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "LQJ/Q;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super T>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f137556c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f137557d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<T> f137558e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17631a<? extends T> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f137558e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f137558e, eVar);
            aVar.f137557d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super T> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f137556c == 0) {
                y.b(obj);
                return C0.d(((Q) this.f137557d).getCoroutineContext(), this.f137558e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <T> Object b(C17168i iVar, C17631a<? extends T> aVar, C17164e<? super T> eVar) {
        return C16310i.g(iVar, new a(aVar, (C17164e<? super a>) null), eVar);
    }

    public static /* synthetic */ Object c(C17168i iVar, C17631a aVar, C17164e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        return b(iVar, aVar, eVar);
    }

    /* access modifiers changed from: private */
    public static final <T> T d(C17168i iVar, C17631a<? extends T> aVar) {
        j1 j1Var;
        try {
            j1Var = new j1();
            j1Var.C(I0.m(iVar));
            T invoke = aVar.invoke();
            j1Var.z();
            return invoke;
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        } catch (Throwable th2) {
            j1Var.z();
            throw th2;
        }
    }
}
