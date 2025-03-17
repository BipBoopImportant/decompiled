package P0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o1.C5669i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0006\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0007\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\b\u0010\u001a¨\u0006\u001e"}, d2 = {"LP0/c;", "", "Lo1/i;", "bounds", "", "isFlat", "isVertical", "isSeparating", "isOccluding", "<init>", "(Lo1/i;ZZZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lo1/i;", "getBounds", "()Lo1/i;", "b", "Z", "()Z", "c", "d", "e", "adaptive_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final C5669i f11824a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11825b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11826c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11827d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f11828e;

    public c(C5669i iVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f11824a = iVar;
        this.f11825b = z10;
        this.f11826c = z11;
        this.f11827d = z12;
        this.f11828e = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f11824a, cVar.f11824a) && this.f11825b == cVar.f11825b && this.f11826c == cVar.f11826c && this.f11827d == cVar.f11827d && this.f11828e == cVar.f11828e;
    }

    public int hashCode() {
        return (((((((this.f11824a.hashCode() * 31) + Boolean.hashCode(this.f11825b)) * 31) + Boolean.hashCode(this.f11826c)) * 31) + Boolean.hashCode(this.f11827d)) * 31) + Boolean.hashCode(this.f11828e);
    }

    public String toString() {
        return "HingeInfo(bounds=" + this.f11824a + ", isFlat=" + this.f11825b + ", isVertical=" + this.f11826c + ", isSeparating=" + this.f11827d + ", isOccluding=" + this.f11828e + ')';
    }
}
