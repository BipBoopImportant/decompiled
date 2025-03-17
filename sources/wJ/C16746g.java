package WJ;

import dI.C17168i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LWJ/g;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LdI/i;", "context", "<init>", "(LdI/i;)V", "", "getLocalizedMessage", "()Ljava/lang/String;", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "a", "LdI/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WJ.g  reason: case insensitive filesystem */
public final class C16746g extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final transient C17168i f139549a;

    public C16746g(C17168i iVar) {
        this.f139549a = iVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return String.valueOf(this.f139549a);
    }
}
