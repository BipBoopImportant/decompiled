package androidx.work;

import XH.C16807N;
import androidx.concurrent.futures.c;
import androidx.lifecycle.K;
import androidx.work.C;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import ob.C10101e;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/work/N;", "tracer", "", "label", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "LXH/N;", "block", "Landroidx/work/C;", "c", "(Landroidx/work/N;Ljava/lang/String;Ljava/util/concurrent/Executor;LnI/a;)Landroidx/work/C;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class G {
    public static final C c(N n10, String str, Executor executor, C17631a<C16807N> aVar) {
        C17542s.j(n10, "tracer");
        C17542s.j(str, "label");
        C17542s.j(executor, "executor");
        C17542s.j(aVar, "block");
        K k10 = new K(C.f45057b);
        C10101e a10 = c.a(new E(executor, n10, str, aVar, k10));
        C17542s.i(a10, "getFuture { completer ->…}\n            }\n        }");
        return new D(k10, a10);
    }

    /* access modifiers changed from: private */
    public static final C16807N d(Executor executor, N n10, String str, C17631a aVar, K k10, c.a aVar2) {
        C17542s.j(aVar2, "completer");
        executor.execute(new F(n10, str, aVar, k10, aVar2));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void e(N n10, String str, C17631a aVar, K k10, c.a aVar2) {
        boolean isEnabled = n10.isEnabled();
        if (isEnabled) {
            try {
                n10.a(str);
            } catch (Throwable th2) {
                if (isEnabled) {
                    n10.d();
                }
                throw th2;
            }
        }
        aVar.invoke();
        C.b.c cVar = C.f45056a;
        k10.postValue(cVar);
        aVar2.c(cVar);
        C16807N n11 = C16807N.f139792a;
        if (isEnabled) {
            n10.d();
        }
    }
}
