package T1;

import N1.C4669d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LT1/Z;", "", "LN1/d;", "text", "LT1/H;", "offsetMapping", "<init>", "(LN1/d;LT1/H;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "LN1/d;", "b", "()LN1/d;", "LT1/H;", "()LT1/H;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Z {

    /* renamed from: a  reason: collision with root package name */
    private final C4669d f13572a;

    /* renamed from: b  reason: collision with root package name */
    private final H f13573b;

    public Z(C4669d dVar, H h10) {
        this.f13572a = dVar;
        this.f13573b = h10;
    }

    public final H a() {
        return this.f13573b;
    }

    public final C4669d b() {
        return this.f13572a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        return C17542s.e(this.f13572a, z10.f13572a) && C17542s.e(this.f13573b, z10.f13573b);
    }

    public int hashCode() {
        return (this.f13572a.hashCode() * 31) + this.f13573b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + this.f13572a + ", offsetMapping=" + this.f13573b + ')';
    }
}
