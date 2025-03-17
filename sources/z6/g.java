package Z6;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LZ6/g;", "LZ6/d;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class g implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f41401a;

    /* renamed from: b  reason: collision with root package name */
    private final String f41402b;

    public g(Throwable th2) {
        C17542s.j(th2, "cause");
        this.f41401a = th2;
    }

    public final Throwable a() {
        return this.f41401a;
    }

    public String getId() {
        return this.f41402b;
    }
}
