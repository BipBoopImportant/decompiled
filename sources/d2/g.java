package D2;

import XH.x;
import XH.y;
import android.os.OutcomeReceiver;
import dI.C17164e;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LD2/g;", "R", "", "E", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "LdI/e;", "continuation", "<init>", "(LdI/e;)V", "result", "LXH/N;", "onResult", "(Ljava/lang/Object;)V", "error", "onError", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "a", "LdI/e;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class g<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final C17164e<R> f5509a;

    public g(C17164e<? super R> eVar) {
        super(false);
        this.f5509a = eVar;
    }

    public void onError(E e10) {
        if (compareAndSet(false, true)) {
            C17164e<R> eVar = this.f5509a;
            x.a aVar = x.f139812b;
            eVar.resumeWith(x.b(y.a(e10)));
        }
    }

    public void onResult(R r10) {
        if (compareAndSet(false, true)) {
            this.f5509a.resumeWith(x.b(r10));
        }
    }

    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
