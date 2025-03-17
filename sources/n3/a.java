package n3;

import QJ.Q;
import dI.C17168i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ln3/a;", "Ljava/lang/AutoCloseable;", "LQJ/Q;", "LdI/i;", "coroutineContext", "<init>", "(LdI/i;)V", "coroutineScope", "(LQJ/Q;)V", "LXH/N;", "close", "()V", "a", "LdI/i;", "getCoroutineContext", "()LdI/i;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements AutoCloseable, Q {

    /* renamed from: a  reason: collision with root package name */
    private final C17168i f26577a;

    public a(C17168i iVar) {
        C17542s.j(iVar, "coroutineContext");
        this.f26577a = iVar;
    }

    public void close() {
        J0.f(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    public C17168i getCoroutineContext() {
        return this.f26577a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(Q q10) {
        this(q10.getCoroutineContext());
        C17542s.j(q10, "coroutineScope");
    }
}
