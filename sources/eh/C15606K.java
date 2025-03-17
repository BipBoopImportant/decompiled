package EH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LEH/K;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "urlString", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.K  reason: case insensitive filesystem */
public final class C15606K extends IllegalStateException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15606K(String str, Throwable th2) {
        super("Fail to parse url: " + str, th2);
        C17542s.j(str, "urlString");
        C17542s.j(th2, "cause");
    }
}
