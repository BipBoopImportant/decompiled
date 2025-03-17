package TH;

import TH.C16492f;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\b&\u0018\u0000 \u0018*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H$¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0014\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\rJ\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0017J\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010%\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+¨\u0006-"}, d2 = {"LTH/c;", "", "T", "LTH/f;", "", "capacity", "<init>", "(I)V", "instance", "", "n", "(Ljava/lang/Object;)Z", "l", "()Ljava/lang/Object;", "index", "LXH/N;", "i", "g", "()I", "h", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "f", "Q1", "f3", "b", "()V", "a", "I", "getCapacity", "", "top", "J", "maxIndex", "c", "shift", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "d", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "instances", "", "[I", "next", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: TH.c  reason: case insensitive filesystem */
public abstract class C16489c<T> implements C16492f<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final b f138529f = new b((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicLongFieldUpdater<C16489c<?>> f138530g;

    /* renamed from: a  reason: collision with root package name */
    private final int f138531a;

    /* renamed from: b  reason: collision with root package name */
    private final int f138532b;

    /* renamed from: c  reason: collision with root package name */
    private final int f138533c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReferenceArray<T> f138534d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f138535e;
    /* access modifiers changed from: private */
    public volatile long top;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: TH.c$a */
    /* synthetic */ class a extends A {

        /* renamed from: b  reason: collision with root package name */
        public static final a f138536b = new a();

        a() {
            super(C16489c.class, "top", "getTop()J", 0);
        }

        public Object get(Object obj) {
            return Long.valueOf(((C16489c) obj).top);
        }

        public void r(Object obj, Object obj2) {
            ((C16489c) obj).top = ((Number) obj2).longValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LTH/c$b;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;", "LTH/c;", "Top", "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: TH.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        AtomicLongFieldUpdater<C16489c<?>> newUpdater = AtomicLongFieldUpdater.newUpdater(C16489c.class, a.f138536b.getName());
        C17542s.i(newUpdater, "newUpdater(Owner::class.java, p.name)");
        f138530g = newUpdater;
    }

    public C16489c(int i10) {
        this.f138531a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("capacity should be positive but it is " + i10).toString());
        } else if (i10 <= 536870911) {
            int highestOneBit = Integer.highestOneBit((i10 * 4) - 1) * 2;
            this.f138532b = highestOneBit;
            this.f138533c = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            this.f138534d = new AtomicReferenceArray<>(highestOneBit + 1);
            this.f138535e = new int[(highestOneBit + 1)];
        } else {
            throw new IllegalArgumentException(("capacity should be less or equal to 536870911 but it is " + i10).toString());
        }
    }

    private final int g() {
        long j10;
        long j11;
        int i10;
        do {
            j10 = this.top;
            if (j10 == 0) {
                return 0;
            }
            j11 = ((j10 >> 32) & 4294967295L) + 1;
            i10 = (int) (4294967295L & j10);
            if (i10 == 0) {
                return 0;
            }
        } while (!f138530g.compareAndSet(this, j10, (j11 << 32) | ((long) this.f138535e[i10])));
        return i10;
    }

    private final void i(int i10) {
        long j10;
        if (i10 > 0) {
            do {
                j10 = this.top;
                this.f138535e[i10] = (int) (4294967295L & j10);
            } while (!f138530g.compareAndSet(this, j10, ((((j10 >> 32) & 4294967295L) + 1) << 32) | ((long) i10)));
            return;
        }
        throw new IllegalArgumentException("index should be positive");
    }

    private final T l() {
        int g10 = g();
        if (g10 == 0) {
            return null;
        }
        return this.f138534d.getAndSet(g10, (Object) null);
    }

    private final boolean n(T t10) {
        int identityHashCode = ((System.identityHashCode(t10) * -1640531527) >>> this.f138533c) + 1;
        for (int i10 = 0; i10 < 8; i10++) {
            if (C16488b.a(this.f138534d, identityHashCode, (Object) null, t10)) {
                i(identityHashCode);
                return true;
            }
            identityHashCode--;
            if (identityHashCode == 0) {
                identityHashCode = this.f138532b;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = e(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T Q1() {
        /*
            r1 = this;
            java.lang.Object r0 = r1.l()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r1.e(r0)
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            java.lang.Object r0 = r1.h()
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: TH.C16489c.Q1():java.lang.Object");
    }

    public final void b() {
        while (true) {
            Object l10 = l();
            if (l10 != null) {
                f(l10);
            } else {
                return;
            }
        }
    }

    public void close() {
        C16492f.a.a(this);
    }

    /* access modifiers changed from: protected */
    public T e(T t10) {
        C17542s.j(t10, "instance");
        return t10;
    }

    /* access modifiers changed from: protected */
    public void f(T t10) {
        C17542s.j(t10, "instance");
    }

    public final void f3(T t10) {
        C17542s.j(t10, "instance");
        o(t10);
        if (!n(t10)) {
            f(t10);
        }
    }

    /* access modifiers changed from: protected */
    public abstract T h();

    /* access modifiers changed from: protected */
    public void o(T t10) {
        C17542s.j(t10, "instance");
    }
}
