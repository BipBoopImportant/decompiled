package WJ;

import QJ.C16295a0;
import QJ.C16315k0;
import QJ.C16320n;
import QJ.M;
import QJ.O;
import QJ.X;
import XH.C16807N;
import dI.C17168i;
import dI.C17169j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u00015B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u00060\rj\u0002`\u000eH\u0017¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0001¢\u0006\u0004\b \u0010!J,\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0015\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010.\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00103\u001a\u00060/j\u0002`08\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u000b\u00104\u001a\u00020/8\u0002X\u0004¨\u00066"}, d2 = {"LWJ/k;", "LQJ/M;", "LQJ/a0;", "dispatcher", "", "parallelism", "", "name", "<init>", "(LQJ/M;ILjava/lang/String;)V", "", "T0", "()Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "S0", "()Ljava/lang/Runnable;", "N0", "(ILjava/lang/String;)LQJ/M;", "LdI/i;", "context", "block", "LXH/N;", "E0", "(LdI/i;Ljava/lang/Runnable;)V", "F0", "toString", "()Ljava/lang/String;", "", "timeMillis", "LQJ/n;", "continuation", "h0", "(JLQJ/n;)V", "LQJ/k0;", "u", "(JLjava/lang/Runnable;LdI/i;)LQJ/k0;", "c", "LQJ/M;", "d", "I", "e", "Ljava/lang/String;", "LWJ/p;", "f", "LWJ/p;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "g", "Ljava/lang/Object;", "workerAllocationLock", "runningWorkers", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WJ.k  reason: case insensitive filesystem */
public final class C16750k extends M implements C16295a0 {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f139557h = AtomicIntegerFieldUpdater.newUpdater(C16750k.class, "runningWorkers$volatile");

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C16295a0 f139558b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final M f139559c;

    /* renamed from: d  reason: collision with root package name */
    private final int f139560d;

    /* renamed from: e  reason: collision with root package name */
    private final String f139561e;

    /* renamed from: f  reason: collision with root package name */
    private final C16755p<Runnable> f139562f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f139563g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LWJ/k$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(LWJ/k;Ljava/lang/Runnable;)V", "LXH/N;", "run", "()V", "a", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WJ.k$a */
    private final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f139564a;

        public a(Runnable runnable) {
            this.f139564a = runnable;
        }

        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f139564a.run();
                } catch (Throwable th2) {
                    O.a(C17169j.f142968a, th2);
                }
                Runnable Q02 = C16750k.this.S0();
                if (Q02 != null) {
                    this.f139564a = Q02;
                    i10++;
                    if (i10 >= 16 && C16748i.d(C16750k.this.f139559c, C16750k.this)) {
                        C16748i.c(C16750k.this.f139559c, C16750k.this, this);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C16750k(M m10, int i10, String str) {
        C16295a0 a0Var = m10 instanceof C16295a0 ? (C16295a0) m10 : null;
        this.f139558b = a0Var == null ? X.a() : a0Var;
        this.f139559c = m10;
        this.f139560d = i10;
        this.f139561e = str;
        this.f139562f = new C16755p<>(false);
        this.f139563g = new Object();
    }

    /* access modifiers changed from: private */
    public final Runnable S0() {
        while (true) {
            Runnable e10 = this.f139562f.e();
            if (e10 != null) {
                return e10;
            }
            synchronized (this.f139563g) {
                f139557h.decrementAndGet(this);
                if (this.f139562f.c() == 0) {
                    return null;
                }
                f139557h.incrementAndGet(this);
            }
        }
    }

    private final boolean T0() {
        synchronized (this.f139563g) {
            if (f139557h.get(this) >= this.f139560d) {
                return false;
            }
            f139557h.incrementAndGet(this);
            return true;
        }
    }

    public void E0(C17168i iVar, Runnable runnable) {
        Runnable S02;
        this.f139562f.a(runnable);
        if (f139557h.get(this) < this.f139560d && T0() && (S02 = S0()) != null) {
            C16748i.c(this.f139559c, this, new a(S02));
        }
    }

    public void F0(C17168i iVar, Runnable runnable) {
        Runnable S02;
        this.f139562f.a(runnable);
        if (f139557h.get(this) < this.f139560d && T0() && (S02 = S0()) != null) {
            this.f139559c.F0(this, new a(S02));
        }
    }

    public M N0(int i10, String str) {
        C16751l.a(i10);
        return i10 >= this.f139560d ? C16751l.b(this, str) : super.N0(i10, str);
    }

    public void h0(long j10, C16320n<? super C16807N> nVar) {
        this.f139558b.h0(j10, nVar);
    }

    public String toString() {
        String str = this.f139561e;
        if (str != null) {
            return str;
        }
        return this.f139559c + ".limitedParallelism(" + this.f139560d + ')';
    }

    public C16315k0 u(long j10, Runnable runnable, C17168i iVar) {
        return this.f139558b.u(j10, runnable, iVar);
    }
}
