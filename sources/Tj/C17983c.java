package tJ;

import XH.C16807N;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: tJ.c  reason: case insensitive filesystem */
public final class C17983c extends C17984d {

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f147347c;

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<InterruptedException, C16807N> f147348d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17983c(Lock lock, Runnable runnable, C17642l<? super InterruptedException, C16807N> lVar) {
        super(lock);
        C17542s.j(lock, "lock");
        C17542s.j(runnable, "checkCancelled");
        C17542s.j(lVar, "interruptedExceptionHandler");
        this.f147347c = runnable;
        this.f147348d = lVar;
    }

    public void lock() {
        while (!a().tryLock(50, TimeUnit.MILLISECONDS)) {
            try {
                this.f147347c.run();
            } catch (InterruptedException e10) {
                this.f147348d.invoke(e10);
                return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17983c(Runnable runnable, C17642l<? super InterruptedException, C16807N> lVar) {
        this(new ReentrantLock(), runnable, lVar);
        C17542s.j(runnable, "checkCancelled");
        C17542s.j(lVar, "interruptedExceptionHandler");
    }
}
