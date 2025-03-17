package QJ;

import WJ.C16747h;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "LQJ/n;", "LQJ/m;", "handler", "LXH/N;", "c", "(LQJ/n;LQJ/m;)V", "LdI/e;", "delegate", "LQJ/p;", "b", "(LdI/e;)LQJ/p;", "LQJ/k0;", "handle", "a", "(LQJ/n;LQJ/k0;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {
    public static final void a(C16320n<?> nVar, C16315k0 k0Var) {
        c(nVar, new C16317l0(k0Var));
    }

    public static final <T> C16324p<T> b(C17164e<? super T> eVar) {
        if (!(eVar instanceof C16747h)) {
            return new C16324p<>(eVar, 1);
        }
        C16324p<T> k10 = ((C16747h) eVar).k();
        if (k10 != null) {
            if (!k10.Q()) {
                k10 = null;
            }
            if (k10 != null) {
                return k10;
            }
        }
        return new C16324p<>(eVar, 2);
    }

    public static final <T> void c(C16320n<? super T> nVar, C16318m mVar) {
        if (nVar instanceof C16324p) {
            ((C16324p) nVar).H(mVar);
            return;
        }
        throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
    }
}
