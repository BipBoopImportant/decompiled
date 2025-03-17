package U0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"LU0/a0;", "", "left", "right", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "value", "", "a", "(Ljava/lang/Object;)I", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getLeft", "()Ljava/lang/Object;", "b", "getRight", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.a0  reason: case insensitive filesystem */
public final class C4858a0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f13903a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f13904b;

    public C4858a0(Object obj, Object obj2) {
        this.f13903a = obj;
        this.f13904b = obj2;
    }

    private final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4858a0)) {
            return false;
        }
        C4858a0 a0Var = (C4858a0) obj;
        return C17542s.e(this.f13903a, a0Var.f13903a) && C17542s.e(this.f13904b, a0Var.f13904b);
    }

    public int hashCode() {
        return (a(this.f13903a) * 31) + a(this.f13904b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f13903a + ", right=" + this.f13904b + ')';
    }
}
