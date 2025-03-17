package S6;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LS6/c;", "LS6/a;", "", "message", "", "platformCause", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getPlatformCause", "()Ljava/lang/Object;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f39919a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, Object obj) {
        super(str, obj instanceof Throwable ? (Throwable) obj : null);
        this.f39919a = obj;
    }
}
