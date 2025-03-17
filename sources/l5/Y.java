package l5;

import QJ.C16324p;
import XH.C16807N;
import androidx.work.C7040i;
import androidx.work.C7054x;
import androidx.work.C7055y;
import dI.C17164e;
import eI.C17187b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import ob.C10101e;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"T", "Lob/e;", "Landroidx/work/x;", "worker", "d", "(Lob/e;Landroidx/work/x;LdI/e;)Ljava/lang/Object;", "V", "Ljava/util/concurrent/Future;", "future", "e", "(Ljava/util/concurrent/Future;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "f", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Y {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f54711a;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C7054x f54712c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C10101e<T> f54713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C7054x xVar, C10101e<T> eVar) {
            super(1);
            this.f54712c = xVar;
            this.f54713d = eVar;
        }

        public final void a(Throwable th2) {
            if (th2 instanceof Q) {
                this.f54712c.stop(((Q) th2).a());
            }
            this.f54713d.cancel(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    static {
        String i10 = C7055y.i("WorkerWrapper");
        C17542s.i(i10, "tagWithPrefix(\"WorkerWrapper\")");
        f54711a = i10;
    }

    public static final <T> Object d(C10101e<T> eVar, C7054x xVar, C17164e<? super T> eVar2) {
        try {
            if (eVar.isDone()) {
                return e(eVar);
            }
            C16324p pVar = new C16324p(C17187b.c(eVar2), 1);
            pVar.C();
            eVar.a(new C8498C(eVar, pVar), C7040i.INSTANCE);
            pVar.K(new a(xVar, eVar));
            Object w10 = pVar.w();
            if (w10 == C17187b.f()) {
                h.c(eVar2);
            }
            return w10;
        } catch (ExecutionException e10) {
            throw f(e10);
        }
    }

    /* access modifiers changed from: private */
    public static final <V> V e(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    /* access modifiers changed from: private */
    public static final Throwable f(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        C17542s.g(cause);
        return cause;
    }
}
