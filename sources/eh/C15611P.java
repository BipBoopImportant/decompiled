package EH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LEH/P;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "header", "<init>", "(Ljava/lang/String;)V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.P  reason: case insensitive filesystem */
public final class C15611P extends IllegalArgumentException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15611P(String str) {
        super("Header(s) " + str + " are controlled by the engine and cannot be set explicitly");
        C17542s.j(str, "header");
    }
}
