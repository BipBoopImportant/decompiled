package androidx.work;

import XH.C16807N;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import ob.C10101e;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Ljava/util/concurrent/Executor;", "Lkotlin/Function0;", "block", "Lob/e;", "e", "(Ljava/util/concurrent/Executor;LnI/a;)Lob/e;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a0 {
    /* access modifiers changed from: private */
    public static final <T> C10101e<T> e(Executor executor, C17631a<? extends T> aVar) {
        C10101e<T> a10 = c.a(new X(executor, aVar));
        C17542s.i(a10, "getFuture {\n        val …        }\n        }\n    }");
        return a10;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(Executor executor, C17631a aVar, c.a aVar2) {
        C17542s.j(aVar2, "it");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        aVar2.a(new Y(atomicBoolean), C7040i.INSTANCE);
        executor.execute(new Z(atomicBoolean, aVar2, aVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void g(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* access modifiers changed from: private */
    public static final void h(AtomicBoolean atomicBoolean, c.a aVar, C17631a aVar2) {
        if (!atomicBoolean.get()) {
            try {
                aVar.c(aVar2.invoke());
            } catch (Throwable th2) {
                aVar.f(th2);
            }
        }
    }
}
