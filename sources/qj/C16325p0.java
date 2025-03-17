package QJ;

import QJ.C16295a0;
import WJ.C16756q;
import WJ.O;
import WJ.P;
import XH.C16807N;
import dI.C17168i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004>?@AB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J%\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00132\n\u0010 \u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\n\u0010 \u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0004¢\u0006\u0004\b.\u0010\u0004R$\u00104\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8B@BX\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00106\u001a\u00020\b8TX\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0014\u00108\u001a\u00020\u00138TX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010%R\u0013\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000109098\u0002X\u0004R\u0013\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;098\u0002X\u0004R\u000b\u0010=\u001a\u0002098\u0002X\u0004¨\u0006B"}, d2 = {"LQJ/p0;", "LQJ/q0;", "LQJ/a0;", "<init>", "()V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "U1", "(Ljava/lang/Runnable;)Z", "L1", "()Ljava/lang/Runnable;", "LXH/N;", "P1", "I1", "LQJ/p0$c;", "z2", "(LQJ/p0$c;)Z", "", "now", "delayedTask", "", "r2", "(JLQJ/p0$c;)I", "m2", "shutdown", "timeMillis", "LQJ/n;", "continuation", "h0", "(JLQJ/n;)V", "block", "LQJ/k0;", "t2", "(JLjava/lang/Runnable;)LQJ/k0;", "b1", "()J", "LdI/i;", "context", "E0", "(LdI/i;Ljava/lang/Runnable;)V", "N1", "(Ljava/lang/Runnable;)V", "p2", "(JLQJ/p0$c;)V", "n2", "value", "h", "()Z", "y2", "(Z)V", "isCompleted", "f2", "isEmpty", "T0", "nextTime", "", "_queue", "LQJ/p0$d;", "_delayed", "_isCompleted", "c", "a", "b", "d", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.p0  reason: case insensitive filesystem */
public abstract class C16325p0 extends C16327q0 implements C16295a0 {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f137667e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f137668f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f137669g;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LQJ/p0$a;", "LQJ/p0$c;", "", "nanoTime", "LQJ/n;", "LXH/N;", "cont", "<init>", "(LQJ/p0;JLQJ/n;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "LQJ/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QJ.p0$a */
    private final class a extends c {

        /* renamed from: c  reason: collision with root package name */
        private final C16320n<C16807N> f137670c;

        public a(long j10, C16320n<? super C16807N> nVar) {
            super(j10);
            this.f137670c = nVar;
        }

        public void run() {
            this.f137670c.E(C16325p0.this, C16807N.f139792a);
        }

        public String toString() {
            return super.toString() + this.f137670c;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LQJ/p0$b;", "LQJ/p0$c;", "", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "<init>", "(JLjava/lang/Runnable;)V", "LXH/N;", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QJ.p0$b */
    private static final class b extends c {

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f137672c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f137672c = runnable;
        }

        public void run() {
            this.f137672c.run();
        }

        public String toString() {
            return super.toString() + this.f137672c;
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010)\u001a\u00020\r8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R0\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010*2\f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010*8V@VX\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b \u0010.¨\u00060"}, d2 = {"LQJ/p0$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "LQJ/k0;", "LWJ/P;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", "other", "", "n", "(LQJ/p0$c;)I", "now", "", "B", "(J)Z", "LQJ/p0$d;", "delayed", "LQJ/p0;", "eventLoop", "v", "(JLQJ/p0$d;LQJ/p0;)I", "LXH/N;", "b", "()V", "", "toString", "()Ljava/lang/String;", "a", "J", "_heap", "Ljava/lang/Object;", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "LWJ/O;", "value", "m", "()LWJ/O;", "(LWJ/O;)V", "heap", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QJ.p0$c */
    public static abstract class c implements Runnable, Comparable<c>, C16315k0, P {
        private volatile Object _heap;

        /* renamed from: a  reason: collision with root package name */
        public long f137673a;

        /* renamed from: b  reason: collision with root package name */
        private int f137674b = -1;

        public c(long j10) {
            this.f137673a = j10;
        }

        public final boolean B(long j10) {
            return j10 - this.f137673a >= 0;
        }

        public void a(O<?> o10) {
            if (this._heap != C16330s0.f137681a) {
                this._heap = o10;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        public final void b() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj != C16330s0.f137681a) {
                        d dVar = obj instanceof d ? (d) obj : null;
                        if (dVar != null) {
                            dVar.h(this);
                        }
                        this._heap = C16330s0.f137681a;
                        C16807N n10 = C16807N.f139792a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public int getIndex() {
            return this.f137674b;
        }

        public O<?> m() {
            Object obj = this._heap;
            if (obj instanceof O) {
                return (O) obj;
            }
            return null;
        }

        /* renamed from: n */
        public int compareTo(c cVar) {
            int i10 = ((this.f137673a - cVar.f137673a) > 0 ? 1 : ((this.f137673a - cVar.f137673a) == 0 ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        public void setIndex(int i10) {
            this.f137674b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f137673a + ']';
        }

        public final int v(long j10, d dVar, C16325p0 p0Var) {
            synchronized (this) {
                if (this._heap == C16330s0.f137681a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (p0Var.h()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f137675c = j10;
                        } else {
                            long j11 = cVar.f137673a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f137675c > 0) {
                                dVar.f137675c = j10;
                            }
                        }
                        long j12 = this.f137673a;
                        long j13 = dVar.f137675c;
                        if (j12 - j13 < 0) {
                            this.f137673a = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LQJ/p0$d;", "LWJ/O;", "LQJ/p0$c;", "", "timeNow", "<init>", "(J)V", "c", "J", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QJ.p0$d */
    public static final class d extends O<c> {

        /* renamed from: c  reason: collision with root package name */
        public long f137675c;

        public d(long j10) {
            this.f137675c = j10;
        }
    }

    static {
        Class<C16325p0> cls = C16325p0.class;
        Class<Object> cls2 = Object.class;
        f137667e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue$volatile");
        f137668f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed$volatile");
        f137669g = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted$volatile");
    }

    private final void I1() {
        AtomicReferenceFieldUpdater e22 = f137667e;
        while (true) {
            Object obj = e22.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f137667e, this, (Object) null, C16330s0.f137682b)) {
                    return;
                }
            } else if (obj instanceof C16756q) {
                ((C16756q) obj).d();
                return;
            } else if (obj != C16330s0.f137682b) {
                C16756q qVar = new C16756q(8, true);
                C17542s.h(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f137667e, this, obj, qVar)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final Runnable L1() {
        AtomicReferenceFieldUpdater e22 = f137667e;
        while (true) {
            Object obj = e22.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C16756q) {
                C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C16756q qVar = (C16756q) obj;
                Object m10 = qVar.m();
                if (m10 != C16756q.f139574h) {
                    return (Runnable) m10;
                }
                androidx.concurrent.futures.b.a(f137667e, this, obj, qVar.l());
            } else if (obj == C16330s0.f137682b) {
                return null;
            } else {
                if (androidx.concurrent.futures.b.a(f137667e, this, obj, (Object) null)) {
                    C17542s.h(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void P1() {
        P p10;
        d dVar = (d) f137668f.get(this);
        if (dVar != null && !dVar.e()) {
            C16298c.a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        P b10 = dVar.b();
                        p10 = null;
                        if (b10 != null) {
                            c cVar = (c) b10;
                            if (cVar.B(nanoTime) ? U1(cVar) : false) {
                                p10 = dVar.i(0);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (((c) p10) != null);
        }
    }

    private final boolean U1(Runnable runnable) {
        AtomicReferenceFieldUpdater e22 = f137667e;
        while (true) {
            Object obj = e22.get(this);
            if (h()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f137667e, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C16756q) {
                C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C16756q qVar = (C16756q) obj;
                int a10 = qVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    androidx.concurrent.futures.b.a(f137667e, this, obj, qVar.l());
                } else if (a10 == 2) {
                    return false;
                }
            } else if (obj == C16330s0.f137682b) {
                return false;
            } else {
                C16756q qVar2 = new C16756q(8, true);
                C17542s.h(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar2.a((Runnable) obj);
                qVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f137667e, this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean h() {
        return f137669g.get(this) == 1;
    }

    private final void m2() {
        c cVar;
        C16298c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f137668f.get(this);
            if (dVar != null && (cVar = (c) dVar.j()) != null) {
                y1(nanoTime, cVar);
            } else {
                return;
            }
        }
    }

    private final int r2(long j10, c cVar) {
        if (h()) {
            return 1;
        }
        d dVar = (d) f137668f.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f137668f, this, (Object) null, new d(j10));
            Object obj = f137668f.get(this);
            C17542s.g(obj);
            dVar = (d) obj;
        }
        return cVar.v(j10, dVar, this);
    }

    private final void y2(boolean z10) {
        f137669g.set(this, z10 ? 1 : 0);
    }

    private final boolean z2(c cVar) {
        d dVar = (d) f137668f.get(this);
        return (dVar != null ? (c) dVar.f() : null) == cVar;
    }

    public final void E0(C17168i iVar, Runnable runnable) {
        N1(runnable);
    }

    public void N1(Runnable runnable) {
        P1();
        if (U1(runnable)) {
            D1();
        } else {
            W.f137603h.N1(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public long T0() {
        c cVar;
        if (super.T0() == 0) {
            return 0;
        }
        Object obj = f137667e.get(this);
        if (obj != null) {
            if (!(obj instanceof C16756q)) {
                return obj == C16330s0.f137682b ? Long.MAX_VALUE : 0;
            }
            if (!((C16756q) obj).j()) {
                return 0;
            }
        }
        d dVar = (d) f137668f.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.f137673a;
        C16298c.a();
        return C17978n.f(j10 - System.nanoTime(), 0);
    }

    public long b1() {
        if (h1()) {
            return 0;
        }
        P1();
        Runnable L12 = L1();
        if (L12 == null) {
            return T0();
        }
        L12.run();
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean f2() {
        if (!a1()) {
            return false;
        }
        d dVar = (d) f137668f.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f137667e.get(this);
        if (obj != null) {
            if (obj instanceof C16756q) {
                return ((C16756q) obj).j();
            }
            if (obj != C16330s0.f137682b) {
                return false;
            }
        }
        return true;
    }

    public void h0(long j10, C16320n<? super C16807N> nVar) {
        long c10 = C16330s0.c(j10);
        if (c10 < 4611686018427387903L) {
            C16298c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c10 + nanoTime, nVar);
            p2(nanoTime, aVar);
            r.a(nVar, aVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void n2() {
        f137667e.set(this, (Object) null);
        f137668f.set(this, (Object) null);
    }

    public final void p2(long j10, c cVar) {
        int r22 = r2(j10, cVar);
        if (r22 != 0) {
            if (r22 == 1) {
                y1(j10, cVar);
            } else if (r22 != 2) {
                throw new IllegalStateException("unexpected result");
            }
        } else if (z2(cVar)) {
            D1();
        }
    }

    public void shutdown() {
        e1.f137624a.c();
        y2(true);
        I1();
        do {
        } while (b1() <= 0);
        m2();
    }

    /* access modifiers changed from: protected */
    public final C16315k0 t2(long j10, Runnable runnable) {
        long c10 = C16330s0.c(j10);
        if (c10 >= 4611686018427387903L) {
            return S0.f137600a;
        }
        C16298c.a();
        long nanoTime = System.nanoTime();
        b bVar = new b(c10 + nanoTime, runnable);
        p2(nanoTime, bVar);
        return bVar;
    }

    public C16315k0 u(long j10, Runnable runnable, C17168i iVar) {
        return C16295a0.a.a(this, j10, runnable, iVar);
    }
}
