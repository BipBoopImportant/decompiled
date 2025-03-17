package D4;

import XH.C16807N;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R$\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00078\u0000@BX\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"LD4/r;", "T", "", "Lkotlin/Function1;", "LXH/N;", "callbackInvoker", "Lkotlin/Function0;", "", "invalidGetter", "<init>", "(LnI/l;LnI/a;)V", "callback", "c", "(Ljava/lang/Object;)V", "d", "b", "()Z", "a", "LnI/l;", "LnI/a;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "Ljava/util/List;", "callbacks", "<set-?>", "e", "Z", "invalid", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<T, C16807N> f34436a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<Boolean> f34437b;

    /* renamed from: c  reason: collision with root package name */
    private final ReentrantLock f34438c;

    /* renamed from: d  reason: collision with root package name */
    private final List<T> f34439d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f34440e;

    public r(C17642l<? super T, C16807N> lVar, C17631a<Boolean> aVar) {
        C17542s.j(lVar, "callbackInvoker");
        this.f34436a = lVar;
        this.f34437b = aVar;
        this.f34438c = new ReentrantLock();
        this.f34439d = new ArrayList();
    }

    public final boolean a() {
        return this.f34440e;
    }

    public final boolean b() {
        if (this.f34440e) {
            return false;
        }
        ReentrantLock reentrantLock = this.f34438c;
        reentrantLock.lock();
        try {
            if (this.f34440e) {
                return false;
            }
            this.f34440e = true;
            List<Object> t12 = C16877v.t1(this.f34439d);
            this.f34439d.clear();
            C16807N n10 = C16807N.f139792a;
            reentrantLock.unlock();
            if (t12 != null) {
                C17642l<T, C16807N> lVar = this.f34436a;
                for (Object invoke : t12) {
                    lVar.invoke(invoke);
                }
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(T t10) {
        C17631a<Boolean> aVar = this.f34437b;
        boolean z10 = true;
        if (aVar != null && aVar.invoke().booleanValue()) {
            b();
        }
        if (this.f34440e) {
            this.f34436a.invoke(t10);
            return;
        }
        ReentrantLock reentrantLock = this.f34438c;
        reentrantLock.lock();
        try {
            if (this.f34440e) {
                C16807N n10 = C16807N.f139792a;
            } else {
                this.f34439d.add(t10);
                z10 = false;
            }
            if (z10) {
                this.f34436a.invoke(t10);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(T t10) {
        ReentrantLock reentrantLock = this.f34438c;
        reentrantLock.lock();
        try {
            this.f34439d.remove(t10);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(C17642l lVar, C17631a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, (i10 & 2) != 0 ? null : aVar);
    }
}
