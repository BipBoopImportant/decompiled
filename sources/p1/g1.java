package p1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5667g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0014B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0003\u001a\u00020\u00028\u0006X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001d\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001e\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Lp1/g1;", "", "Lp1/v0;", "color", "Lo1/g;", "offset", "", "blurRadius", "<init>", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "c", "()J", "getColor-0d7_KjU$annotations", "()V", "b", "d", "getOffset-F1C5BW0$annotations", "F", "()F", "getBlurRadius$annotations", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g1 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f27310d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final g1 f27311e = new g1(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f27312a;

    /* renamed from: b  reason: collision with root package name */
    private final long f27313b;

    /* renamed from: c  reason: collision with root package name */
    private final float f27314c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lp1/g1$a;", "", "<init>", "()V", "Lp1/g1;", "None", "Lp1/g1;", "a", "()Lp1/g1;", "getNone$annotations", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g1 a() {
            return g1.f27311e;
        }

        private a() {
        }
    }

    public /* synthetic */ g1(long j10, long j11, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, f10);
    }

    public final float b() {
        return this.f27314c;
    }

    public final long c() {
        return this.f27312a;
    }

    public final long d() {
        return this.f27313b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return C5747v0.q(this.f27312a, g1Var.f27312a) && C5667g.j(this.f27313b, g1Var.f27313b) && this.f27314c == g1Var.f27314c;
    }

    public int hashCode() {
        return (((C5747v0.w(this.f27312a) * 31) + C5667g.o(this.f27313b)) * 31) + Float.hashCode(this.f27314c);
    }

    public String toString() {
        return "Shadow(color=" + C5747v0.x(this.f27312a) + ", offset=" + C5667g.t(this.f27313b) + ", blurRadius=" + this.f27314c + ')';
    }

    private g1(long j10, long j11, float f10) {
        this.f27312a = j10;
        this.f27313b = j11;
        this.f27314c = f10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(long j10, long j11, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C5751x0.d(4278190080L) : j10, (i10 & 2) != 0 ? C5667g.f26701b.c() : j11, (i10 & 4) != 0 ? 0.0f : f10, (DefaultConstructorMarker) null);
    }
}
