package WJ;

import com.sugarcube.app.base.data.source.CatalogRepository;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001a\b\u0000\u0018\u0000 \f*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0018\u001bB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000b2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000b2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b$\u0010\u001aR\u0011\u0010(\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010'R%\u0010)\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000b0\u00018\u0002X\u0004R\u000b\u0010*\u001a\u00020\u00018\u0002X\u0004R\u0013\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00018\u0002X\u0004¨\u0006,"}, d2 = {"LWJ/q;", "", "E", "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", "index", "element", "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)LWJ/q;", "oldHead", "newHead", "n", "(II)LWJ/q;", "", "k", "()J", "state", "c", "(J)LWJ/q;", "b", "d", "()Z", "a", "(Ljava/lang/Object;)I", "m", "()Ljava/lang/Object;", "l", "()LWJ/q;", "I", "Z", "mask", "j", "isEmpty", "g", "()I", "size", "_next", "_state", "array", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WJ.q  reason: case insensitive filesystem */
public final class C16756q<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f139571e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f139572f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f139573g;

    /* renamed from: h  reason: collision with root package name */
    public static final C16735D f139574h = new C16735D("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a  reason: collision with root package name */
    private final int f139575a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f139576b;

    /* renamed from: c  reason: collision with root package name */
    private final int f139577c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f139578d;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ\u0011\u0010\u000e\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u001e8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u0014\u0010\"\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\"\u0010\u0011R\u0014\u0010#\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b#\u0010\u0011¨\u0006$"}, d2 = {"LWJ/q$a;", "", "<init>", "()V", "", "other", "d", "(JJ)J", "", "newHead", "b", "(JI)J", "newTail", "c", "a", "(J)I", "INITIAL_CAPACITY", "I", "CAPACITY_BITS", "MAX_CAPACITY_MASK", "HEAD_SHIFT", "HEAD_MASK", "J", "TAIL_SHIFT", "TAIL_MASK", "FROZEN_SHIFT", "FROZEN_MASK", "CLOSED_SHIFT", "CLOSED_MASK", "MIN_ADD_SPIN_CAPACITY", "LWJ/D;", "REMOVE_FROZEN", "LWJ/D;", "ADD_SUCCESS", "ADD_FROZEN", "ADD_CLOSED", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WJ.q$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823) | ((long) i10);
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (((long) i10) << 30);
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LWJ/q$b;", "", "", "index", "<init>", "(I)V", "a", "I", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WJ.q$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f139579a;

        public b(int i10) {
            this.f139579a = i10;
        }
    }

    static {
        Class<C16756q> cls = C16756q.class;
        f139572f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next$volatile");
        f139573g = AtomicLongFieldUpdater.newUpdater(cls, "_state$volatile");
    }

    public C16756q(int i10, boolean z10) {
        this.f139575a = i10;
        this.f139576b = z10;
        int i11 = i10 - 1;
        this.f139577c = i11;
        this.f139578d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        } else if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final C16756q<E> b(long j10) {
        C16756q<E> qVar = new C16756q<>(this.f139575a * 2, this.f139576b);
        int i10 = (int) (1073741823 & j10);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f139577c;
            if ((i10 & i12) != (i12 & i11)) {
                Object obj = f().get(this.f139577c & i10);
                if (obj == null) {
                    obj = new b(i10);
                }
                qVar.f().set(qVar.f139577c & i10, obj);
                i10++;
            } else {
                f139573g.set(qVar, f139571e.d(j10, 1152921504606846976L));
                return qVar;
            }
        }
    }

    private final C16756q<E> c(long j10) {
        AtomicReferenceFieldUpdater h10 = f139572f;
        while (true) {
            C16756q<E> qVar = (C16756q) h10.get(this);
            if (qVar != null) {
                return qVar;
            }
            androidx.concurrent.futures.b.a(f139572f, this, (Object) null, b(j10));
        }
    }

    private final C16756q<E> e(int i10, E e10) {
        Object obj = f().get(this.f139577c & i10);
        if (!(obj instanceof b) || ((b) obj).f139579a != i10) {
            return null;
        }
        f().set(i10 & this.f139577c, e10);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray f() {
        return this.f139578d;
    }

    private final long k() {
        long j10;
        long j11;
        AtomicLongFieldUpdater i10 = f139573g;
        do {
            j10 = i10.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!i10.compareAndSet(this, j10, j11));
        return j11;
    }

    private final C16756q<E> n(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater i13 = f139573g;
        do {
            j10 = i13.get(this);
            i12 = (int) (1073741823 & j10);
            if ((1152921504606846976L & j10) != 0) {
                return l();
            }
        } while (!f139573g.compareAndSet(this, j10, f139571e.b(j10, i11)));
        f().set(this.f139577c & i12, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072 A[LOOP:1: B:20:0x0072->B:23:0x0089, LOOP_START, PHI: r0 
      PHI: (r0v3 WJ.q) = (r0v2 WJ.q), (r0v5 WJ.q) binds: [B:19:0x0068, B:23:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(E r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f139573g
        L_0x0004:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0018
            WJ.q$a r13 = f139571e
            int r13 = r13.a(r3)
            return r13
        L_0x0018:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f139577c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L_0x0032
            return r6
        L_0x0032:
            boolean r2 = r12.f139576b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L_0x0053
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f()
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x0053
            int r2 = r12.f139575a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L_0x0052
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L_0x0004
        L_0x0052:
            return r6
        L_0x0053:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f139573g
            WJ.q$a r5 = f139571e
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0004
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f()
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L_0x0072:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f139573g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x008b
            WJ.q r0 = r0.l()
            WJ.q r0 = r0.e(r9, r13)
            if (r0 != 0) goto L_0x0072
        L_0x008b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: WJ.C16756q.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j10;
        AtomicLongFieldUpdater i10 = f139573g;
        do {
            j10 = i10.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!i10.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int g() {
        long j10 = f139573g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & CatalogRepository.FETCH_FLAG_ALL;
    }

    public final boolean j() {
        long j10 = f139573g.get(this);
        return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    public final C16756q<E> l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater i10 = f139573g;
        while (true) {
            long j10 = i10.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f139574h;
            }
            int i11 = (int) (1073741823 & j10);
            int i12 = this.f139577c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i12) == (i12 & i11)) {
                return null;
            }
            Object obj = f().get(this.f139577c & i11);
            if (obj == null) {
                if (this.f139576b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i13 = (i11 + 1) & CatalogRepository.FETCH_FLAG_ALL;
                if (f139573g.compareAndSet(this, j10, f139571e.b(j10, i13))) {
                    f().set(this.f139577c & i11, (Object) null);
                    return obj;
                } else if (this.f139576b) {
                    C16756q qVar = this;
                    do {
                        qVar = qVar.n(i11, i13);
                    } while (qVar != null);
                    return obj;
                }
            }
        }
    }
}
