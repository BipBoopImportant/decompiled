package N1;

import c2.v;
import c2.w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u000f\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"LN1/A;", "", "Lc2/v;", "width", "height", "LN1/B;", "placeholderVerticalAlign", "<init>", "(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "c", "()J", "b", "I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class A {

    /* renamed from: a  reason: collision with root package name */
    private final long f9269a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9270b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9271c;

    public /* synthetic */ A(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, i10);
    }

    public final long a() {
        return this.f9270b;
    }

    public final int b() {
        return this.f9271c;
    }

    public final long c() {
        return this.f9269a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return v.e(this.f9269a, a10.f9269a) && v.e(this.f9270b, a10.f9270b) && B.i(this.f9271c, a10.f9271c);
    }

    public int hashCode() {
        return (((v.i(this.f9269a) * 31) + v.i(this.f9270b)) * 31) + B.j(this.f9271c);
    }

    public String toString() {
        return "Placeholder(width=" + v.j(this.f9269a) + ", height=" + v.j(this.f9270b) + ", placeholderVerticalAlign=" + B.k(this.f9271c) + ')';
    }

    private A(long j10, long j11, int i10) {
        this.f9269a = j10;
        this.f9270b = j11;
        this.f9271c = i10;
        if (w.j(j10)) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified");
        } else if (w.j(j11)) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }
}
