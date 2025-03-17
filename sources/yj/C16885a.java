package YJ;

import QJ.C16298c;
import QJ.V;
import WJ.C16735D;
import WJ.y;
import XH.C16807N;
import XH.t;
import fI.C17221b;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import tI.C17978n;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 82\u00020\u00012\u00020\u0002:\u0003AD\u000fB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!J+\u0010#\u001a\u0004\u0018\u00010\f*\b\u0018\u00010\u0011R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010\u0013J)\u0010(\u001a\u00020\u00182\n\u0010\u0014\u001a\u00060\u0011R\u00020\u00002\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u000e2\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010/\u001a\u00020\u00182\n\u0010.\u001a\u00060,j\u0002`-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u0010\u001aJ1\u00108\u001a\u00020\u00182\n\u00105\u001a\u00060,j\u0002`-2\f\b\u0002\u00107\u001a\u00060\u000ej\u0002`62\b\b\u0002\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\f2\n\u00105\u001a\u00060,j\u0002`-2\n\u00107\u001a\u00060\u000ej\u0002`6¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0018¢\u0006\u0004\b<\u00102J\u000f\u0010=\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\bD\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010ER\u0014\u0010H\u001a\u00020F8\u0006X\u0004¢\u0006\u0006\n\u0004\b \u0010GR\u0014\u0010I\u001a\u00020F8\u0006X\u0004¢\u0006\u0006\n\u0004\b:\u0010GR\u001e\u0010L\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00000J8\u0006X\u0004¢\u0006\u0006\n\u0004\b%\u0010KR\u0011\u0010M\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bM\u0010\u001fR\u000b\u0010O\u001a\u00020N8\u0002X\u0004R\u000b\u0010P\u001a\u00020N8\u0002X\u0004R\u000b\u0010Q\u001a\u00020N8\u0002X\u0004¨\u0006R"}, d2 = {"LYJ/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "LYJ/h;", "task", "", "d", "(LYJ/h;)Z", "LYJ/a$c;", "t", "()LYJ/a$c;", "worker", "s", "(LYJ/a$c;)I", "stateSnapshot", "LXH/N;", "B", "(J)V", "state", "N", "(J)Z", "e0", "()Z", "e", "()I", "fair", "J", "(LYJ/a$c;LYJ/h;Z)LYJ/h;", "g", "oldIndex", "newIndex", "w", "(LYJ/a$c;II)V", "u", "(LYJ/a$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "z", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "h", "(Ljava/lang/Runnable;ZZ)V", "f", "(Ljava/lang/Runnable;Z)LYJ/h;", "F", "toString", "()Ljava/lang/String;", "x", "(LYJ/h;)V", "a", "I", "b", "c", "Ljava/lang/String;", "LYJ/d;", "LYJ/d;", "globalCpuQueue", "globalBlockingQueue", "LWJ/y;", "LWJ/y;", "workers", "isTerminated", "", "parkedWorkersStack", "controlState", "_isTerminated", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YJ.a  reason: case insensitive filesystem */
public final class C16885a implements Executor, Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final C3440a f140488h = new C3440a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f140489i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f140490j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f140491k;

    /* renamed from: l  reason: collision with root package name */
    public static final C16735D f140492l = new C16735D("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final int f140493a;

    /* renamed from: b  reason: collision with root package name */
    public final int f140494b;

    /* renamed from: c  reason: collision with root package name */
    public final long f140495c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d  reason: collision with root package name */
    public final String f140496d;

    /* renamed from: e  reason: collision with root package name */
    public final C16888d f140497e;

    /* renamed from: f  reason: collision with root package name */
    public final C16888d f140498f;

    /* renamed from: g  reason: collision with root package name */
    public final y<c> f140499g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00078\u0000XT¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078\u0000XT¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"LYJ/a$a;", "", "<init>", "()V", "LWJ/D;", "NOT_IN_STACK", "LWJ/D;", "", "PARKED", "I", "CLAIMED", "TERMINATED", "BLOCKING_SHIFT", "", "CREATED_MASK", "J", "BLOCKING_MASK", "CPU_PERMITS_SHIFT", "CPU_PERMITS_MASK", "MIN_SUPPORTED_POOL_SIZE", "MAX_SUPPORTED_POOL_SIZE", "PARKED_INDEX_MASK", "PARKED_VERSION_MASK", "PARKED_VERSION_INC", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YJ.a$a  reason: collision with other inner class name */
    public static final class C3440a {
        public /* synthetic */ C3440a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3440a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YJ.a$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f140500a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                YJ.a$d[] r0 = YJ.C16885a.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                YJ.a$d r1 = YJ.C16885a.d.PARKING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                YJ.a$d r1 = YJ.C16885a.d.BLOCKING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                YJ.a$d r1 = YJ.C16885a.d.CPU_ACQUIRED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                YJ.a$d r1 = YJ.C16885a.d.DORMANT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                YJ.a$d r1 = YJ.C16885a.d.TERMINATED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f140500a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: YJ.C16885a.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LYJ/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YJ.a$d */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

        static {
            d[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    static {
        Class<C16885a> cls = C16885a.class;
        f140489i = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack$volatile");
        f140490j = AtomicLongFieldUpdater.newUpdater(cls, "controlState$volatile");
        f140491k = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated$volatile");
    }

    public C16885a(int i10, int i11, long j10, String str) {
        this.f140493a = i10;
        this.f140494b = i11;
        this.f140495c = j10;
        this.f140496d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        } else if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        } else if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j10 > 0) {
            this.f140497e = new C16888d();
            this.f140498f = new C16888d();
            this.f140499g = new y<>((i10 + 1) * 2);
            this.controlState$volatile = ((long) i10) << 42;
        } else {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
    }

    private final void B(long j10) {
        if (!e0() && !N(j10)) {
            e0();
        }
    }

    private final C16892h J(c cVar, C16892h hVar, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.f140504c) == d.TERMINATED) {
            return hVar;
        }
        if (!hVar.f140520b && dVar == d.BLOCKING) {
            return hVar;
        }
        cVar.f140508g = true;
        return cVar.f140502a.a(hVar, z10);
    }

    private final boolean N(long j10) {
        if (C17978n.e(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f140493a) {
            int e10 = e();
            if (e10 == 1 && this.f140493a > 1) {
                e();
            }
            if (e10 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean U(C16885a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f140490j.get(aVar);
        }
        return aVar.N(j10);
    }

    private final boolean d(C16892h hVar) {
        return hVar.f140520b ? this.f140498f.a(hVar) : this.f140497e.a(hVar);
    }

    private final int e() {
        synchronized (this.f140499g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f140490j.get(this);
                int i10 = (int) (j10 & 2097151);
                int e10 = C17978n.e(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (e10 >= this.f140493a) {
                    return 0;
                }
                if (i10 >= this.f140494b) {
                    return 0;
                }
                int i11 = ((int) (f140490j.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f140499g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f140499g.c(i11, cVar);
                if (i11 == ((int) (2097151 & f140490j.incrementAndGet(this)))) {
                    int i12 = e10 + 1;
                    cVar.start();
                    return i12;
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean e0() {
        c t10;
        do {
            t10 = t();
            if (t10 == null) {
                return false;
            }
        } while (!c.f140501i.compareAndSet(t10, -1, 0));
        LockSupport.unpark(t10);
        return true;
    }

    private final c g() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !C17542s.e(C16885a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void i(C16885a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.h(runnable, z10, z11);
    }

    private final int s(c cVar) {
        Object g10 = cVar.g();
        while (g10 != f140492l) {
            if (g10 == null) {
                return 0;
            }
            c cVar2 = (c) g10;
            int f10 = cVar2.f();
            if (f10 != 0) {
                return f10;
            }
            g10 = cVar2.g();
        }
        return -1;
    }

    private final c t() {
        AtomicLongFieldUpdater o10 = f140489i;
        while (true) {
            long j10 = o10.get(this);
            c b10 = this.f140499g.b((int) (2097151 & j10));
            if (b10 == null) {
                return null;
            }
            long j11 = (2097152 + j10) & -2097152;
            int s10 = s(b10);
            if (s10 >= 0) {
                if (f140489i.compareAndSet(this, j10, ((long) s10) | j11)) {
                    b10.o(f140492l);
                    return b10;
                }
            }
        }
    }

    public final void F() {
        if (!e0() && !U(this, 0, 1, (Object) null)) {
            e0();
        }
    }

    public void close() {
        z(10000);
    }

    public void execute(Runnable runnable) {
        i(this, runnable, false, false, 6, (Object) null);
    }

    public final C16892h f(Runnable runnable, boolean z10) {
        long a10 = j.f140527f.a();
        if (!(runnable instanceof C16892h)) {
            return j.b(runnable, a10, z10);
        }
        C16892h hVar = (C16892h) runnable;
        hVar.f140519a = a10;
        hVar.f140520b = z10;
        return hVar;
    }

    public final void h(Runnable runnable, boolean z10, boolean z11) {
        C16298c.a();
        C16892h f10 = f(runnable, z10);
        boolean z12 = f10.f140520b;
        long addAndGet = z12 ? f140490j.addAndGet(this, 2097152) : 0;
        C16892h J10 = J(g(), f10, z11);
        if (J10 != null && !d(J10)) {
            throw new RejectedExecutionException(this.f140496d + " was terminated");
        } else if (z12) {
            B(addAndGet);
        } else {
            F();
        }
    }

    public final boolean isTerminated() {
        return f140491k.get(this) == 1;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a10 = this.f140499g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c b10 = this.f140499g.b(i15);
            if (b10 != null) {
                int i16 = b10.f140502a.i();
                int i17 = b.f140500a[b10.f140504c.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (i17 == 5) {
                    i14++;
                } else {
                    throw new t();
                }
            }
        }
        long j10 = f140490j.get(this);
        return this.f140496d + '@' + V.b(this) + "[Pool Size {core = " + this.f140493a + ", max = " + this.f140494b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f140497e.c() + ", global blocking queue size = " + this.f140498f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f140493a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final boolean u(c cVar) {
        long j10;
        int f10;
        if (cVar.g() != f140492l) {
            return false;
        }
        AtomicLongFieldUpdater o10 = f140489i;
        do {
            j10 = o10.get(this);
            f10 = cVar.f();
            cVar.o(this.f140499g.b((int) (2097151 & j10)));
        } while (!f140489i.compareAndSet(this, j10, ((2097152 + j10) & -2097152) | ((long) f10)));
        return true;
    }

    public final void w(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater o10 = f140489i;
        while (true) {
            long j10 = o10.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & -2097152;
            if (i12 == i10) {
                i12 = i11 == 0 ? s(cVar) : i11;
            }
            if (i12 >= 0) {
                if (f140489i.compareAndSet(this, j10, j11 | ((long) i12))) {
                    return;
                }
            }
        }
    }

    public final void x(C16892h hVar) {
        try {
            hVar.run();
        } catch (Throwable th2) {
            C16298c.a();
            throw th2;
        }
        C16298c.a();
    }

    public final void z(long j10) {
        int i10;
        C16892h hVar;
        if (f140491k.compareAndSet(this, 0, 1)) {
            c g10 = g();
            synchronized (this.f140499g) {
                i10 = (int) (f140490j.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c b10 = this.f140499g.b(i11);
                    C17542s.g(b10);
                    c cVar = b10;
                    if (cVar != g10) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f140502a.j(this.f140498f);
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            this.f140498f.b();
            this.f140497e.b();
            while (true) {
                if (g10 != null) {
                    hVar = g10.e(true);
                    if (hVar != null) {
                        continue;
                        x(hVar);
                    }
                }
                hVar = (C16892h) this.f140497e.e();
                if (hVar == null && (hVar = (C16892h) this.f140498f.e()) == null) {
                    break;
                }
                x(hVar);
            }
            if (g10 != null) {
                g10.r(d.TERMINATED);
            }
            f140489i.set(this, 0);
            f140490j.set(this, 0);
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\n\u0010\u001c\u001a\u00060\u0004j\u0002`\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\fJ\u0015\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u0004\u0018\u00010\u000f2\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\u0019R*\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0006X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0016\u00107\u001a\u00020\u001f8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0018\u00106R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u00109R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010B\u001a\u0002088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u00109R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010'\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b>\u0010DR\b\u0010E\u001a\u00020;8\u0006¨\u0006F"}, d2 = {"LYJ/a$c;", "Ljava/lang/Thread;", "<init>", "(LYJ/a;)V", "", "index", "(LYJ/a;I)V", "", "p", "()Z", "LXH/N;", "m", "()V", "q", "i", "LYJ/h;", "task", "b", "(LYJ/h;)V", "k", "t", "d", "()LYJ/h;", "scanLocalQueue", "c", "(Z)LYJ/h;", "l", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "s", "(I)LYJ/h;", "LYJ/a$d;", "newState", "r", "(LYJ/a$d;)Z", "run", "upperBound", "j", "(I)I", "mayHaveLocalTasks", "e", "indexInArray", "I", "f", "()I", "n", "(I)V", "LYJ/l;", "a", "LYJ/l;", "localQueue", "Lkotlin/jvm/internal/O;", "Lkotlin/jvm/internal/O;", "stolenTask", "LYJ/a$d;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "workerCtl", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YJ.a$c */
    public final class c extends Thread {
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f140501i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* renamed from: a  reason: collision with root package name */
        public final l f140502a;

        /* renamed from: b  reason: collision with root package name */
        private final O<C16892h> f140503b;

        /* renamed from: c  reason: collision with root package name */
        public d f140504c;

        /* renamed from: d  reason: collision with root package name */
        private long f140505d;

        /* renamed from: e  reason: collision with root package name */
        private long f140506e;

        /* renamed from: f  reason: collision with root package name */
        private int f140507f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f140508g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(C16885a.this.getClass().getClassLoader());
            this.f140502a = new l();
            this.f140503b = new O<>();
            this.f140504c = d.DORMANT;
            this.nextParkedWorker = C16885a.f140492l;
            int nanoTime = (int) System.nanoTime();
            this.f140507f = nanoTime == 0 ? 42 : nanoTime;
        }

        private final void b(C16892h hVar) {
            this.f140505d = 0;
            if (this.f140504c == d.PARKING) {
                this.f140504c = d.BLOCKING;
            }
            if (hVar.f140520b) {
                if (r(d.BLOCKING)) {
                    C16885a.this.F();
                }
                C16885a.this.x(hVar);
                C16885a.f140490j.addAndGet(C16885a.this, -2097152);
                if (this.f140504c != d.TERMINATED) {
                    this.f140504c = d.DORMANT;
                    return;
                }
                return;
            }
            C16885a.this.x(hVar);
        }

        private final C16892h c(boolean z10) {
            C16892h l10;
            C16892h l11;
            if (z10) {
                boolean z11 = j(C16885a.this.f140493a * 2) == 0;
                if (z11 && (l11 = l()) != null) {
                    return l11;
                }
                C16892h k10 = this.f140502a.k();
                if (k10 != null) {
                    return k10;
                }
                if (!z11 && (l10 = l()) != null) {
                    return l10;
                }
            } else {
                C16892h l12 = l();
                if (l12 != null) {
                    return l12;
                }
            }
            return s(3);
        }

        private final C16892h d() {
            C16892h l10 = this.f140502a.l();
            if (l10 != null) {
                return l10;
            }
            C16892h hVar = (C16892h) C16885a.this.f140498f.e();
            return hVar == null ? s(1) : hVar;
        }

        private final boolean i() {
            return this.nextParkedWorker != C16885a.f140492l;
        }

        private final void k() {
            if (this.f140505d == 0) {
                this.f140505d = System.nanoTime() + C16885a.this.f140495c;
            }
            LockSupport.parkNanos(C16885a.this.f140495c);
            if (System.nanoTime() - this.f140505d >= 0) {
                this.f140505d = 0;
                t();
            }
        }

        private final C16892h l() {
            if (j(2) == 0) {
                C16892h hVar = (C16892h) C16885a.this.f140497e.e();
                return hVar != null ? hVar : (C16892h) C16885a.this.f140498f.e();
            }
            C16892h hVar2 = (C16892h) C16885a.this.f140498f.e();
            return hVar2 != null ? hVar2 : (C16892h) C16885a.this.f140497e.e();
        }

        private final void m() {
            loop0:
            while (true) {
                boolean z10 = false;
                while (!C16885a.this.isTerminated() && this.f140504c != d.TERMINATED) {
                    C16892h e10 = e(this.f140508g);
                    if (e10 != null) {
                        this.f140506e = 0;
                        b(e10);
                    } else {
                        this.f140508g = false;
                        if (this.f140506e == 0) {
                            q();
                        } else if (!z10) {
                            z10 = true;
                        } else {
                            r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f140506e);
                            this.f140506e = 0;
                        }
                    }
                }
            }
            r(d.TERMINATED);
        }

        private final boolean p() {
            long j10;
            if (this.f140504c == d.CPU_ACQUIRED) {
                return true;
            }
            C16885a aVar = C16885a.this;
            AtomicLongFieldUpdater c10 = C16885a.f140490j;
            do {
                j10 = c10.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!C16885a.f140490j.compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f140504c = d.CPU_ACQUIRED;
            return true;
        }

        private final void q() {
            if (!i()) {
                C16885a.this.u(this);
                return;
            }
            f140501i.set(this, -1);
            while (i() && f140501i.get(this) == -1 && !C16885a.this.isTerminated() && this.f140504c != d.TERMINATED) {
                r(d.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final C16892h s(int i10) {
            int i11 = (int) (C16885a.f140490j.get(C16885a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int j10 = j(i11);
            C16885a aVar = C16885a.this;
            long j11 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                j10++;
                if (j10 > i11) {
                    j10 = 1;
                }
                c b10 = aVar.f140499g.b(j10);
                if (b10 == null || b10 == this) {
                    int i13 = i10;
                } else {
                    long r10 = b10.f140502a.r(i10, this.f140503b);
                    if (r10 == -1) {
                        O<C16892h> o10 = this.f140503b;
                        C16892h hVar = (C16892h) o10.f144348a;
                        o10.f144348a = null;
                        return hVar;
                    } else if (r10 > 0) {
                        j11 = Math.min(j11, r10);
                    }
                }
            }
            if (j11 == Long.MAX_VALUE) {
                j11 = 0;
            }
            this.f140506e = j11;
            return null;
        }

        private final void t() {
            C16885a aVar = C16885a.this;
            synchronized (aVar.f140499g) {
                try {
                    if (!aVar.isTerminated()) {
                        if (((int) (C16885a.f140490j.get(aVar) & 2097151)) > aVar.f140493a) {
                            if (f140501i.compareAndSet(this, -1, 1)) {
                                int i10 = this.indexInArray;
                                n(0);
                                aVar.w(this, i10, 0);
                                int andDecrement = (int) (C16885a.f140490j.getAndDecrement(aVar) & 2097151);
                                if (andDecrement != i10) {
                                    c b10 = aVar.f140499g.b(andDecrement);
                                    C17542s.g(b10);
                                    c cVar = b10;
                                    aVar.f140499g.c(i10, cVar);
                                    cVar.n(i10);
                                    aVar.w(cVar, andDecrement, i10);
                                }
                                aVar.f140499g.c(andDecrement, null);
                                C16807N n10 = C16807N.f139792a;
                                this.f140504c = d.TERMINATED;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final C16892h e(boolean z10) {
            return p() ? c(z10) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i10) {
            int i11 = this.f140507f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f140507f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void n(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C16885a.this.f140496d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f140504c;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                C16885a.f140490j.addAndGet(C16885a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f140504c = dVar;
            }
            return z10;
        }

        public void run() {
            m();
        }

        public c(C16885a aVar, int i10) {
            this();
            n(i10);
        }
    }
}
