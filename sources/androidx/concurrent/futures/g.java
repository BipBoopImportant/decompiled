package androidx.concurrent.futures;

import QJ.C16320n;
import XH.x;
import XH.y;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ob.C10101e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/concurrent/futures/g;", "T", "Ljava/lang/Runnable;", "Lob/e;", "futureToObserve", "LQJ/n;", "continuation", "<init>", "(Lob/e;LQJ/n;)V", "LXH/N;", "run", "()V", "a", "Lob/e;", "getFutureToObserve", "()Lob/e;", "b", "LQJ/n;", "getContinuation", "()LQJ/n;", "concurrent-futures-ktx"}, k = 1, mv = {1, 4, 0})
final class g<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C10101e<T> f20001a;

    /* renamed from: b  reason: collision with root package name */
    private final C16320n<T> f20002b;

    public g(C10101e<T> eVar, C16320n<? super T> nVar) {
        C17542s.k(eVar, "futureToObserve");
        C17542s.k(nVar, "continuation");
        this.f20001a = eVar;
        this.f20002b = nVar;
    }

    public void run() {
        if (this.f20001a.isCancelled()) {
            C16320n.a.a(this.f20002b, (Throwable) null, 1, (Object) null);
            return;
        }
        try {
            C16320n<T> nVar = this.f20002b;
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(a.F(this.f20001a)));
        } catch (ExecutionException e10) {
            C16320n<T> nVar2 = this.f20002b;
            Throwable a10 = e.c(e10);
            x.a aVar2 = x.f139812b;
            nVar2.resumeWith(x.b(y.a(a10)));
        }
    }
}
