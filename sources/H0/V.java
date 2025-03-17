package H0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"LH0/V;", "", "Lp1/v0;", "handleColor", "backgroundColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class V {

    /* renamed from: a  reason: collision with root package name */
    private final long f6880a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6881b;

    public /* synthetic */ V(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public final long a() {
        return this.f6881b;
    }

    public final long b() {
        return this.f6880a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return C5747v0.q(this.f6880a, v10.f6880a) && C5747v0.q(this.f6881b, v10.f6881b);
    }

    public int hashCode() {
        return (C5747v0.w(this.f6880a) * 31) + C5747v0.w(this.f6881b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + C5747v0.x(this.f6880a) + ", selectionBackgroundColor=" + C5747v0.x(this.f6881b) + ')';
    }

    private V(long j10, long j11) {
        this.f6880a = j10;
        this.f6881b = j11;
    }
}
