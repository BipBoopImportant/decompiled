package v7;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s7.C8743b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0005\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv7/x;", "Ls7/b;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class x extends C8743b {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected x(String str, Throwable th2) {
        super(str, th2);
        C17542s.j(str, "message");
    }
}
