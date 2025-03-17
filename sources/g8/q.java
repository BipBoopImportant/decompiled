package G8;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\r\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LG8/q;", "T", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "c", "(Ljava/lang/Object;)V", "item", "b", "LG8/q;", "()LG8/q;", "d", "(LG8/q;)V", "next", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class q<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f36284a;

    /* renamed from: b  reason: collision with root package name */
    private q<T> f36285b;

    public final T a() {
        return this.f36284a;
    }

    public final q<T> b() {
        return this.f36285b;
    }

    public final void c(T t10) {
        this.f36284a = t10;
    }

    public final void d(q<T> qVar) {
        this.f36285b = qVar;
    }

    public String toString() {
        return "RecyclerWrapper{item=" + this.f36284a + ", next=" + this.f36285b + '}';
    }
}
