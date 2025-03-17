package QJ;

import WJ.C16743d;
import WJ.z;
import XJ.C16833b;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import nI.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH@\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0019\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u00020\u0013*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"\u001b\u0010!\u001a\u00020\u001d*\u00020\u00008F¢\u0006\f\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"LQJ/Q;", "LdI/i;", "context", "i", "(LQJ/Q;LdI/i;)LQJ/Q;", "b", "()LQJ/Q;", "R", "Lkotlin/Function2;", "LdI/e;", "", "block", "f", "(LnI/p;LdI/e;)Ljava/lang/Object;", "a", "(LdI/i;)LQJ/Q;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "LXH/N;", "d", "(LQJ/Q;Ljava/util/concurrent/CancellationException;)V", "", "message", "", "c", "(LQJ/Q;Ljava/lang/String;Ljava/lang/Throwable;)V", "g", "(LQJ/Q;)V", "", "h", "(LQJ/Q;)Z", "isActive$annotations", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class S {
    public static final Q a(C17168i iVar) {
        if (iVar.get(F0.f137562d0) == null) {
            iVar = iVar.plus(J0.b((F0) null, 1, (Object) null));
        }
        return new C16743d(iVar);
    }

    public static final Q b() {
        return new C16743d(b1.b((F0) null, 1, (Object) null).plus(C16311i0.c()));
    }

    public static final void c(Q q10, String str, Throwable th2) {
        d(q10, C16332t0.a(str, th2));
    }

    public static final void d(Q q10, CancellationException cancellationException) {
        F0 f02 = (F0) q10.getCoroutineContext().get(F0.f137562d0);
        if (f02 != null) {
            f02.i(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + q10).toString());
    }

    public static /* synthetic */ void e(Q q10, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d(q10, cancellationException);
    }

    public static final <R> Object f(p<? super Q, ? super C17164e<? super R>, ? extends Object> pVar, C17164e<? super R> eVar) {
        z zVar = new z(eVar.getContext(), eVar);
        Object b10 = C16833b.b(zVar, zVar, pVar);
        if (b10 == C17187b.f()) {
            h.c(eVar);
        }
        return b10;
    }

    public static final void g(Q q10) {
        I0.l(q10.getCoroutineContext());
    }

    public static final boolean h(Q q10) {
        F0 f02 = (F0) q10.getCoroutineContext().get(F0.f137562d0);
        if (f02 != null) {
            return f02.c();
        }
        return true;
    }

    public static final Q i(Q q10, C17168i iVar) {
        return new C16743d(q10.getCoroutineContext().plus(iVar));
    }
}
