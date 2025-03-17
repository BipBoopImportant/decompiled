package G8;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"LG8/r;", "T", "", "<init>", "()V", "LG8/q;", "a", "()LG8/q;", "objectToRecycle", "LXH/N;", "b", "(LG8/q;)V", "", "toString", "()Ljava/lang/String;", "LG8/q;", "head", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class r<T> {

    /* renamed from: a  reason: collision with root package name */
    private q<T> f36286a;

    public final q<T> a() {
        q<T> qVar = this.f36286a;
        if (qVar == null) {
            return new q<>();
        }
        this.f36286a = qVar.b();
        return qVar;
    }

    public final void b(q<T> qVar) {
        C17542s.j(qVar, "objectToRecycle");
        qVar.d(this.f36286a);
        this.f36286a = qVar;
    }

    public String toString() {
        return "RecyclerWrapperQueue{head=" + this.f36286a + '}';
    }
}
