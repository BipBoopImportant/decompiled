package xa;

import K9.C6620s;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: xa.o  reason: case insensitive filesystem */
public final class C8974o {
    public static <TResult> TResult a(C8971l<TResult> lVar) {
        C6620s.j();
        C6620s.h();
        C6620s.m(lVar, "Task must not be null");
        if (lVar.p()) {
            return l(lVar);
        }
        s sVar = new s((r) null);
        m(lVar, sVar);
        sVar.b();
        return l(lVar);
    }

    public static <TResult> TResult b(C8971l<TResult> lVar, long j10, TimeUnit timeUnit) {
        C6620s.j();
        C6620s.h();
        C6620s.m(lVar, "Task must not be null");
        C6620s.m(timeUnit, "TimeUnit must not be null");
        if (lVar.p()) {
            return l(lVar);
        }
        s sVar = new s((r) null);
        m(lVar, sVar);
        if (sVar.d(j10, timeUnit)) {
            return l(lVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> C8971l<TResult> c(Executor executor, Callable<TResult> callable) {
        C6620s.m(executor, "Executor must not be null");
        C6620s.m(callable, "Callback must not be null");
        P p10 = new P();
        executor.execute(new Q(p10, callable));
        return p10;
    }

    public static <TResult> C8971l<TResult> d() {
        P p10 = new P();
        p10.v();
        return p10;
    }

    public static <TResult> C8971l<TResult> e(Exception exc) {
        P p10 = new P();
        p10.t(exc);
        return p10;
    }

    public static <TResult> C8971l<TResult> f(TResult tresult) {
        P p10 = new P();
        p10.u(tresult);
        return p10;
    }

    public static C8971l<Void> g(Collection<? extends C8971l<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return f((Object) null);
        }
        for (C8971l lVar : collection) {
            if (lVar == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        P p10 = new P();
        u uVar = new u(collection.size(), p10);
        for (C8971l m10 : collection) {
            m(m10, uVar);
        }
        return p10;
    }

    public static C8971l<Void> h(C8971l<?>... lVarArr) {
        return (lVarArr == null || lVarArr.length == 0) ? f((Object) null) : g(Arrays.asList(lVarArr));
    }

    public static C8971l<List<C8971l<?>>> i(Collection<? extends C8971l<?>> collection) {
        return j(C8973n.f57779a, collection);
    }

    public static C8971l<List<C8971l<?>>> j(Executor executor, Collection<? extends C8971l<?>> collection) {
        return (collection == null || collection.isEmpty()) ? f(Collections.emptyList()) : g(collection).j(executor, new C8976q(collection));
    }

    public static C8971l<List<C8971l<?>>> k(C8971l<?>... lVarArr) {
        return (lVarArr == null || lVarArr.length == 0) ? f(Collections.emptyList()) : i(Arrays.asList(lVarArr));
    }

    private static Object l(C8971l lVar) {
        if (lVar.q()) {
            return lVar.m();
        }
        if (lVar.o()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(lVar.l());
    }

    private static void m(C8971l lVar, t tVar) {
        Executor executor = C8973n.f57780b;
        lVar.f(executor, tVar);
        lVar.d(executor, tVar);
        lVar.a(executor, tVar);
    }
}
