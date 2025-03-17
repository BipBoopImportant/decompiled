package WJ;

import QJ.Q;
import dI.C17168i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LWJ/d;", "LQJ/Q;", "LdI/i;", "context", "<init>", "(LdI/i;)V", "", "toString", "()Ljava/lang/String;", "a", "LdI/i;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WJ.d  reason: case insensitive filesystem */
public final class C16743d implements Q {

    /* renamed from: a  reason: collision with root package name */
    private final C17168i f139547a;

    public C16743d(C17168i iVar) {
        this.f139547a = iVar;
    }

    public C17168i getCoroutineContext() {
        return this.f139547a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
