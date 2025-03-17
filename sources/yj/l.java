package YJ;

import TH.C16488b;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.O;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010,R\u0014\u00100\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8@X\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0013\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00018\u0002X\u0004R\u000b\u00104\u001a\u00020\u00018\u0002X\u0004R\u000b\u00105\u001a\u00020\u00018\u0002X\u0004R\u000b\u00106\u001a\u00020\u00018\u0002X\u0004¨\u00067"}, d2 = {"LYJ/l;", "", "<init>", "()V", "LYJ/h;", "task", "b", "(LYJ/h;)LYJ/h;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "p", "(I)LYJ/h;", "", "onlyBlocking", "o", "(Z)LYJ/h;", "index", "q", "(IZ)LYJ/h;", "Lkotlin/jvm/internal/O;", "stolenTaskRef", "", "s", "(ILkotlin/jvm/internal/O;)J", "LYJ/d;", "queue", "n", "(LYJ/d;)Z", "m", "()LYJ/h;", "LXH/N;", "c", "(LYJ/h;)V", "k", "fair", "a", "(LYJ/h;Z)LYJ/h;", "r", "l", "globalQueue", "j", "(LYJ/d;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "e", "()I", "bufferSize", "i", "size", "lastScheduledTask", "producerIndex", "consumerIndex", "blockingTasksInBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f140529b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f140530c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f140531d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f140532e;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReferenceArray<C16892h> f140533a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Class<l> cls = l.class;
        f140529b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask$volatile");
        f140530c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex$volatile");
        f140531d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex$volatile");
        f140532e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer$volatile");
    }

    private final C16892h b(C16892h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f140520b) {
            f140532e.incrementAndGet(this);
        }
        int i10 = f140530c.get(this) & 127;
        while (this.f140533a.get(i10) != null) {
            Thread.yield();
        }
        this.f140533a.lazySet(i10, hVar);
        f140530c.incrementAndGet(this);
        return null;
    }

    private final void c(C16892h hVar) {
        if (hVar != null && hVar.f140520b) {
            f140532e.decrementAndGet(this);
        }
    }

    private final int e() {
        return f140530c.get(this) - f140531d.get(this);
    }

    private final C16892h m() {
        C16892h andSet;
        while (true) {
            int i10 = f140531d.get(this);
            if (i10 - f140530c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f140531d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f140533a.getAndSet(i11, (Object) null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    private final boolean n(C16888d dVar) {
        C16892h m10 = m();
        if (m10 == null) {
            return false;
        }
        dVar.a(m10);
        return true;
    }

    private final C16892h o(boolean z10) {
        C16892h hVar;
        do {
            hVar = (C16892h) f140529b.get(this);
            if (hVar == null || hVar.f140520b != z10) {
                int i10 = f140531d.get(this);
                int i11 = f140530c.get(this);
                while (i10 != i11) {
                    if (z10 && f140532e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    C16892h q10 = q(i11, z10);
                    if (q10 != null) {
                        return q10;
                    }
                }
                return null;
            }
        } while (!b.a(f140529b, this, hVar, (Object) null));
        return hVar;
    }

    private final C16892h p(int i10) {
        int i11 = f140531d.get(this);
        int i12 = f140530c.get(this);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        while (i11 != i12) {
            if (z10 && f140532e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            C16892h q10 = q(i11, z10);
            if (q10 != null) {
                return q10;
            }
            i11 = i13;
        }
        return null;
    }

    private final C16892h q(int i10, boolean z10) {
        int i11 = i10 & 127;
        C16892h hVar = this.f140533a.get(i11);
        if (hVar == null || hVar.f140520b != z10 || !C16488b.a(this.f140533a, i11, hVar, (Object) null)) {
            return null;
        }
        if (z10) {
            f140532e.decrementAndGet(this);
        }
        return hVar;
    }

    private final long s(int i10, O<C16892h> o10) {
        T t10;
        do {
            t10 = (C16892h) f140529b.get(this);
            if (t10 == null) {
                return -2;
            }
            if (((t10.f140520b ? 1 : 2) & i10) == 0) {
                return -2;
            }
            long a10 = j.f140527f.a() - t10.f140519a;
            long j10 = j.f140523b;
            if (a10 < j10) {
                return j10 - a10;
            }
        } while (!b.a(f140529b, this, t10, (Object) null));
        o10.f144348a = t10;
        return -1;
    }

    public final C16892h a(C16892h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        C16892h hVar2 = (C16892h) f140529b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        return f140529b.get(this) != null ? e() + 1 : e();
    }

    public final void j(C16888d dVar) {
        C16892h hVar = (C16892h) f140529b.getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        do {
        } while (n(dVar));
    }

    public final C16892h k() {
        C16892h hVar = (C16892h) f140529b.getAndSet(this, (Object) null);
        return hVar == null ? m() : hVar;
    }

    public final C16892h l() {
        return o(true);
    }

    public final long r(int i10, O<C16892h> o10) {
        T m10 = i10 == 3 ? m() : p(i10);
        if (m10 == null) {
            return s(i10, o10);
        }
        o10.f144348a = m10;
        return -1;
    }
}
