package R2;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"LR2/l;", "T", "LR2/v;", "", "finalException", "<init>", "(Ljava/lang/Throwable;)V", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l<T> extends v<T> {

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f12468b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Throwable th2) {
        super(Integer.MAX_VALUE, (DefaultConstructorMarker) null);
        C17542s.j(th2, "finalException");
        this.f12468b = th2;
    }

    public final Throwable b() {
        return this.f12468b;
    }
}
