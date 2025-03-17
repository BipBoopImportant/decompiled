package S6;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LS6/e;", "LS6/a;", "", "code", "", "reason", "", "cause", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "a", "I", "getCode", "()I", "b", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class e extends a {

    /* renamed from: a  reason: collision with root package name */
    private final int f39920a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39921b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : th2);
    }

    public e(int i10, String str, Throwable th2) {
        super("WebSocket Closed code='" + i10 + "' reason='" + str + '\'', th2);
        this.f39920a = i10;
        this.f39921b = str;
    }
}
