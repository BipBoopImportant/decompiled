package R2;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LR2/q;", "T", "LR2/v;", "", "readException", "", "version", "<init>", "(Ljava/lang/Throwable;I)V", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q<T> extends v<T> {

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f12473b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Throwable th2, int i10) {
        super(i10, (DefaultConstructorMarker) null);
        C17542s.j(th2, "readException");
        this.f12473b = th2;
    }

    public final Throwable b() {
        return this.f12473b;
    }
}
