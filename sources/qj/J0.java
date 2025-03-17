package QJ;

import GJ.C15765h;
import QJ.F0;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import nI.C17642l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H@¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0016\u001a\u00020\u000f*\u00020\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u000f*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001a\u001a\u00020\u000f*\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010\u001f\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010!\u001a\u00020\u000f*\u00020\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b!\u0010\u0017\"\u0015\u0010$\u001a\u00020\u0001*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0015\u0010'\u001a\u00020\u0000*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"LQJ/F0;", "", "invokeImmediately", "LQJ/K0;", "handler", "LQJ/k0;", "n", "(LQJ/F0;ZLQJ/K0;)LQJ/k0;", "parent", "LQJ/A;", "a", "(LQJ/F0;)LQJ/A;", "handle", "j", "(LQJ/F0;LQJ/k0;)LQJ/k0;", "LXH/N;", "g", "(LQJ/F0;LdI/e;)Ljava/lang/Object;", "LdI/i;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "d", "(LdI/i;Ljava/util/concurrent/CancellationException;)V", "k", "(LQJ/F0;)V", "l", "(LdI/i;)V", "", "message", "", "c", "(LQJ/F0;Ljava/lang/String;Ljava/lang/Throwable;)V", "h", "p", "(LdI/i;)Z", "isActive", "m", "(LdI/i;)LQJ/F0;", "job", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
final /* synthetic */ class J0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<Throwable, C16807N> {
        a(Object obj) {
            super(1, obj, K0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((Throwable) obj);
            return C16807N.f139792a;
        }

        public final void t(Throwable th2) {
            ((K0) this.receiver).x(th2);
        }
    }

    public static final C16283A a(F0 f02) {
        return new H0(f02);
    }

    public static /* synthetic */ C16283A b(F0 f02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f02 = null;
        }
        return I0.a(f02);
    }

    public static final void c(F0 f02, String str, Throwable th2) {
        f02.i(C16332t0.a(str, th2));
    }

    public static final void d(C17168i iVar, CancellationException cancellationException) {
        F0 f02 = (F0) iVar.get(F0.f137562d0);
        if (f02 != null) {
            f02.i(cancellationException);
        }
    }

    public static /* synthetic */ void e(F0 f02, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        I0.c(f02, str, th2);
    }

    public static /* synthetic */ void f(C17168i iVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        I0.d(iVar, cancellationException);
    }

    public static final Object g(F0 f02, C17164e<? super C16807N> eVar) {
        F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        Object j02 = f02.j0(eVar);
        return j02 == C17187b.f() ? j02 : C16807N.f139792a;
    }

    public static final void h(C17168i iVar, CancellationException cancellationException) {
        C15765h<F0> e10;
        F0 f02 = (F0) iVar.get(F0.f137562d0);
        if (f02 != null && (e10 = f02.e()) != null) {
            for (F0 i10 : e10) {
                i10.i(cancellationException);
            }
        }
    }

    public static /* synthetic */ void i(C17168i iVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        I0.h(iVar, cancellationException);
    }

    public static final C16315k0 j(F0 f02, C16315k0 k0Var) {
        return o(f02, false, new C16319m0(k0Var), 1, (Object) null);
    }

    public static final void k(F0 f02) {
        if (!f02.c()) {
            throw f02.x();
        }
    }

    public static final void l(C17168i iVar) {
        F0 f02 = (F0) iVar.get(F0.f137562d0);
        if (f02 != null) {
            I0.k(f02);
        }
    }

    public static final F0 m(C17168i iVar) {
        F0 f02 = (F0) iVar.get(F0.f137562d0);
        if (f02 != null) {
            return f02;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final C16315k0 n(F0 f02, boolean z10, K0 k02) {
        return f02 instanceof L0 ? ((L0) f02).y0(z10, k02) : f02.A0(k02.w(), z10, new a(k02));
    }

    public static /* synthetic */ C16315k0 o(F0 f02, boolean z10, K0 k02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return I0.n(f02, z10, k02);
    }

    public static final boolean p(C17168i iVar) {
        F0 f02 = (F0) iVar.get(F0.f137562d0);
        if (f02 != null) {
            return f02.c();
        }
        return true;
    }
}
