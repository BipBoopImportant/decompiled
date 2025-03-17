package QJ;

import WJ.C16748i;
import WJ.z;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000b\u0010\u0015\u001a\u00020\r8\u0002X\u0004¨\u0006\u0016"}, d2 = {"LQJ/e0;", "T", "LWJ/z;", "LdI/i;", "context", "LdI/e;", "uCont", "<init>", "(LdI/i;LdI/e;)V", "", "j1", "()Z", "i1", "", "state", "LXH/N;", "L", "(Ljava/lang/Object;)V", "b1", "g1", "()Ljava/lang/Object;", "_decision", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.e0  reason: case insensitive filesystem */
public final class C16303e0<T> extends z<T> {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f137623e = AtomicIntegerFieldUpdater.newUpdater(C16303e0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C16303e0(C17168i iVar, C17164e<? super T> eVar) {
        super(iVar, eVar);
    }

    private final boolean i1() {
        AtomicIntegerFieldUpdater h12 = f137623e;
        do {
            int i10 = h12.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f137623e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean j1() {
        AtomicIntegerFieldUpdater h12 = f137623e;
        do {
            int i10 = h12.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f137623e.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    public void L(Object obj) {
        b1(obj);
    }

    /* access modifiers changed from: protected */
    public void b1(Object obj) {
        if (!i1()) {
            C16748i.b(C17187b.c(this.f139586d), C16287E.a(obj, this.f139586d));
        }
    }

    public final Object g1() {
        if (j1()) {
            return C17187b.f();
        }
        Object h10 = M0.h(r0());
        if (!(h10 instanceof C16285C)) {
            return h10;
        }
        throw ((C16285C) h10).f137555a;
    }
}
