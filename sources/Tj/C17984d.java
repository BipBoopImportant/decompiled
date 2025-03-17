package tJ;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: tJ.d  reason: case insensitive filesystem */
public class C17984d implements C17991k {

    /* renamed from: b  reason: collision with root package name */
    private final Lock f147349b;

    public C17984d(Lock lock) {
        C17542s.j(lock, "lock");
        this.f147349b = lock;
    }

    /* access modifiers changed from: protected */
    public final Lock a() {
        return this.f147349b;
    }

    public void lock() {
        this.f147349b.lock();
    }

    public void unlock() {
        this.f147349b.unlock();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17984d(Lock lock, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
