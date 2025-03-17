package g2;

import c2.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5667g;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lg2/N;", "", "", "isDragging", "Lo1/g;", "dragAmount", "Lc2/y;", "velocity", "<init>", "(ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "J", "()J", "d", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.N  reason: case insensitive filesystem */
public final class C5371N {

    /* renamed from: d  reason: collision with root package name */
    public static final a f23569d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f23570a;

    /* renamed from: b  reason: collision with root package name */
    private final long f23571b;

    /* renamed from: c  reason: collision with root package name */
    private final long f23572c;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lg2/N$a;", "", "<init>", "()V", "Lo1/g;", "dragAmount", "Lg2/N;", "a", "(J)Lg2/N;", "Lc2/y;", "velocity", "b", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g2.N$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5371N a(long j10) {
            return new C5371N(true, j10, y.f23066b.a(), (DefaultConstructorMarker) null);
        }

        public final C5371N b(long j10) {
            return new C5371N(false, C5667g.f26701b.b(), j10, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C5371N(boolean z10, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, j10, j11);
    }

    public final long a() {
        return this.f23571b;
    }

    public final long b() {
        return this.f23572c;
    }

    public final boolean c() {
        return this.f23570a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5371N)) {
            return false;
        }
        C5371N n10 = (C5371N) obj;
        return this.f23570a == n10.f23570a && C5667g.j(this.f23571b, n10.f23571b) && y.g(this.f23572c, n10.f23572c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f23570a) * 31) + C5667g.o(this.f23571b)) * 31) + y.j(this.f23572c);
    }

    public String toString() {
        return "MotionDragState(isDragging=" + this.f23570a + ", dragAmount=" + C5667g.t(this.f23571b) + ", velocity=" + y.n(this.f23572c) + ')';
    }

    private C5371N(boolean z10, long j10, long j11) {
        this.f23570a = z10;
        this.f23571b = j10;
        this.f23572c = j11;
    }
}
