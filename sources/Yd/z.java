package Yd;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"LYd/z;", "LYd/a;", "", "title", "message", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z extends a {

    /* renamed from: a  reason: collision with root package name */
    private final int f64969a;

    /* renamed from: b  reason: collision with root package name */
    private final int f64970b;

    public z(int i10, int i11) {
        super((DefaultConstructorMarker) null);
        this.f64969a = i10;
        this.f64970b = i11;
    }

    public final int a() {
        return this.f64970b;
    }

    public final int b() {
        return this.f64969a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f64969a == zVar.f64969a && this.f64970b == zVar.f64970b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f64969a) * 31) + Integer.hashCode(this.f64970b);
    }

    public String toString() {
        int i10 = this.f64969a;
        int i11 = this.f64970b;
        return "ShowPopup(title=" + i10 + ", message=" + i11 + ")";
    }
}
