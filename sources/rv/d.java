package Rv;

import Rv.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004¨\u0006\u000f"}, d2 = {"LRv/d;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "deeplink", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c.a.C0643c {

    /* renamed from: a  reason: collision with root package name */
    private final String f39780a;

    public String a() {
        return this.f39780a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && C17542s.e(this.f39780a, ((d) obj).f39780a);
    }

    public int hashCode() {
        return this.f39780a.hashCode();
    }

    public String toString() {
        String str = this.f39780a;
        return "CreateSpace(deeplink=" + str + ")";
    }
}
