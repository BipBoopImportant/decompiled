package WJ;

import QJ.N;
import QJ.O;
import XH.C16816g;
import dI.C17168i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LdI/i;", "context", "", "exception", "LXH/N;", "a", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: WJ.f  reason: case insensitive filesystem */
public final class C16745f {
    public static final void a(C17168i iVar, Throwable th2) {
        for (N handleException : C16744e.a()) {
            try {
                handleException.handleException(iVar, th2);
            } catch (Throwable th3) {
                C16744e.b(O.b(th2, th3));
            }
        }
        try {
            C16816g.a(th2, new C16746g(iVar));
        } catch (Throwable unused) {
        }
        C16744e.b(th2);
    }
}
