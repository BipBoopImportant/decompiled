package QJ;

import dI.C17168i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LQJ/d0;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "cause", "LQJ/M;", "dispatcher", "LdI/i;", "context", "<init>", "(Ljava/lang/Throwable;LQJ/M;LdI/i;)V", "a", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.d0  reason: case insensitive filesystem */
public final class C16301d0 extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f137614a;

    public C16301d0(Throwable th2, M m10, C17168i iVar) {
        super("Coroutine dispatcher " + m10 + " threw an exception, context = " + iVar, th2);
        this.f137614a = th2;
    }

    public Throwable getCause() {
        return this.f137614a;
    }
}
