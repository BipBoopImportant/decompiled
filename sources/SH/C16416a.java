package SH;

import PH.C16188b;
import PH.C16189c;
import RH.C16368a;
import RH.C16370c;
import TH.C16491e;
import TH.C16492f;
import XH.C16814e;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u0000 +2\u00020\u0001:\u0001,B,\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u00008\u0006@BX\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR(\u0010&\u001a\u0004\u0018\u00010\u00002\b\u0010#\u001a\u0004\u0018\u00010\u00008F@FX\u000e¢\u0006\f\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\fR\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"LSH/a;", "LRH/a;", "LPH/c;", "memory", "origin", "LTH/f;", "parentPool", "<init>", "(Ljava/nio/ByteBuffer;LSH/a;LTH/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "chunk", "LXH/N;", "x", "(LSH/a;)V", "y", "()LSH/a;", "z", "pool", "D", "(LTH/f;)V", "G", "()V", "w", "H", "", "E", "()Z", "r", "h", "LTH/f;", "getParentPool$ktor_io", "()LTH/f;", "<set-?>", "i", "LSH/a;", "B", "newValue", "A", "F", "next", "", "C", "()I", "referenceCount", "j", "d", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
/* renamed from: SH.a  reason: case insensitive filesystem */
public class C16416a extends C16368a {

    /* renamed from: j  reason: collision with root package name */
    public static final d f138260j = new d((DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f138261k;

    /* renamed from: l  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f138262l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final C16492f<C16416a> f138263m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final C16416a f138264n;

    /* renamed from: o  reason: collision with root package name */
    private static final C16492f<C16416a> f138265o = new b();

    /* renamed from: p  reason: collision with root package name */
    private static final C16492f<C16416a> f138266p = new c();

    /* renamed from: h  reason: collision with root package name */
    private final C16492f<C16416a> f138267h;

    /* renamed from: i  reason: collision with root package name */
    private C16416a f138268i;
    private volatile /* synthetic */ Object nextRef;
    private volatile /* synthetic */ int refCount;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"SH/a$a", "LTH/f;", "LSH/a;", "c", "()LSH/a;", "instance", "LXH/N;", "d", "(LSH/a;)V", "b", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: SH.a$a  reason: collision with other inner class name */
    public static final class C3379a implements C16492f<C16416a> {
        C3379a() {
        }

        public void b() {
        }

        /* renamed from: c */
        public C16416a Q1() {
            return C16416a.f138260j.a();
        }

        public void close() {
            C16492f.a.a(this);
        }

        /* renamed from: d */
        public void f3(C16416a aVar) {
            C17542s.j(aVar, "instance");
            if (aVar != C16416a.f138260j.a()) {
                throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"SH/a$b", "LTH/e;", "LSH/a;", "c", "()LSH/a;", "instance", "LXH/N;", "d", "(LSH/a;)V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: SH.a$b */
    public static final class b extends C16491e<C16416a> {
        b() {
        }

        /* renamed from: c */
        public C16416a Q1() {
            return new C16416a(C16188b.f137147a.b(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT), (C16416a) null, this, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public void f3(C16416a aVar) {
            C17542s.j(aVar, "instance");
            C16188b.f137147a.a(aVar.h());
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"SH/a$c", "LTH/e;", "LSH/a;", "c", "()LSH/a;", "instance", "LXH/N;", "d", "(LSH/a;)V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: SH.a$c */
    public static final class c extends C16491e<C16416a> {
        c() {
        }

        /* renamed from: c */
        public C16416a Q1() {
            throw new UnsupportedOperationException("This pool doesn't support borrow");
        }

        /* renamed from: d */
        public void f3(C16416a aVar) {
            C17542s.j(aVar, "instance");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LSH/a$d;", "", "<init>", "()V", "LTH/f;", "LSH/a;", "c", "()LTH/f;", "Pool", "EmptyPool", "LTH/f;", "b", "Empty", "LSH/a;", "a", "()LSH/a;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: SH.a$d */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16416a a() {
            return C16416a.f138264n;
        }

        public final C16492f<C16416a> b() {
            return C16416a.f138263m;
        }

        public final C16492f<C16416a> c() {
            return C16370c.a();
        }

        private d() {
        }
    }

    static {
        C3379a aVar = new C3379a();
        f138263m = aVar;
        f138264n = new C16416a(C16189c.f137148a.a(), (C16416a) null, aVar, (DefaultConstructorMarker) null);
        Class<C16416a> cls = C16416a.class;
        f138261k = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "nextRef");
        f138262l = AtomicIntegerFieldUpdater.newUpdater(cls, "refCount");
    }

    public /* synthetic */ C16416a(ByteBuffer byteBuffer, C16416a aVar, C16492f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, aVar, fVar);
    }

    private final void x(C16416a aVar) {
        if (!androidx.concurrent.futures.b.a(f138261k, this, (Object) null, aVar)) {
            throw new IllegalStateException("This chunk has already a next chunk.");
        }
    }

    public final C16416a A() {
        return (C16416a) this.nextRef;
    }

    public final C16416a B() {
        return this.f138268i;
    }

    public final int C() {
        return this.refCount;
    }

    public void D(C16492f<C16416a> fVar) {
        C17542s.j(fVar, "pool");
        if (E()) {
            C16416a aVar = this.f138268i;
            if (aVar != null) {
                G();
                aVar.D(fVar);
                return;
            }
            C16492f<C16416a> fVar2 = this.f138267h;
            if (fVar2 != null) {
                fVar = fVar2;
            }
            fVar.f3(this);
        }
    }

    public final boolean E() {
        int i10;
        int i11;
        do {
            i10 = this.refCount;
            if (i10 > 0) {
                i11 = i10 - 1;
            } else {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
        } while (!f138262l.compareAndSet(this, i10, i11));
        return i11 == 0;
    }

    public final void F(C16416a aVar) {
        if (aVar == null) {
            y();
        } else {
            x(aVar);
        }
    }

    public final void G() {
        if (f138262l.compareAndSet(this, 0, -1)) {
            y();
            this.f138268i = null;
            return;
        }
        throw new IllegalStateException("Unable to unlink: buffer is in use.");
    }

    public final void H() {
        int i10;
        do {
            i10 = this.refCount;
            if (i10 < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            } else if (i10 > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!f138262l.compareAndSet(this, i10, 1));
    }

    public final void r() {
        if (this.f138268i == null) {
            super.r();
            this.nextRef = null;
            return;
        }
        throw new IllegalArgumentException("Unable to reset buffer with origin");
    }

    public final void w() {
        int i10;
        do {
            i10 = this.refCount;
            if (i10 > 0) {
            } else {
                throw new IllegalStateException("Unable to acquire chunk: it is already released.");
            }
        } while (!f138262l.compareAndSet(this, i10, i10 + 1));
    }

    public final C16416a y() {
        return (C16416a) f138261k.getAndSet(this, (Object) null);
    }

    public C16416a z() {
        C16416a aVar = this.f138268i;
        if (aVar == null) {
            aVar = this;
        }
        aVar.w();
        C16416a aVar2 = new C16416a(h(), aVar, this.f138267h, (DefaultConstructorMarker) null);
        e(aVar2);
        return aVar2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C16416a(ByteBuffer byteBuffer, C16416a aVar, C16492f<C16416a> fVar) {
        super(byteBuffer, (DefaultConstructorMarker) null);
        C17542s.j(byteBuffer, "memory");
        this.f138267h = fVar;
        if (aVar != this) {
            this.nextRef = null;
            this.refCount = 1;
            this.f138268i = aVar;
            return;
        }
        throw new IllegalArgumentException("A chunk couldn't be a view of itself.");
    }
}
