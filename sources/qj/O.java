package QJ;

import WJ.C16745f;
import XH.C16816g;
import dI.C17168i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LdI/i;", "context", "", "exception", "LXH/N;", "a", "(LdI/i;Ljava/lang/Throwable;)V", "originalException", "thrownException", "b", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class O {
    public static final void a(C17168i iVar, Throwable th2) {
        if (th2 instanceof C16301d0) {
            th2 = ((C16301d0) th2).getCause();
        }
        try {
            N n10 = (N) iVar.get(N.f137593c0);
            if (n10 != null) {
                n10.handleException(iVar, th2);
            } else {
                C16745f.a(iVar, th2);
            }
        } catch (Throwable th3) {
            C16745f.a(iVar, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        C16816g.a(runtimeException, th2);
        return runtimeException;
    }
}
