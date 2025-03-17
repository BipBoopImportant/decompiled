package Qq;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LQq/f;", "LxB/a;", "", "amount", "", "description", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "b", "Ljava/lang/String;", "h", "", "c", "J", "f", "()J", "stableId", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final int f86127a;

    /* renamed from: b  reason: collision with root package name */
    private final String f86128b;

    /* renamed from: c  reason: collision with root package name */
    private final long f86129c;

    public f(int i10, String str) {
        C17542s.j(str, "description");
        this.f86127a = i10;
        this.f86128b = str;
        Integer valueOf = Integer.valueOf(i10);
        U u10 = new U(3);
        u10.a(P.b(f.class));
        u10.a(valueOf);
        u10.b(new Object[]{str});
        this.f86129c = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f86127a == fVar.f86127a && C17542s.e(this.f86128b, fVar.f86128b);
    }

    public long f() {
        return this.f86129c;
    }

    public final int g() {
        return this.f86127a;
    }

    public final String h() {
        return this.f86128b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f86127a) * 31) + this.f86128b.hashCode();
    }

    public String toString() {
        int i10 = this.f86127a;
        String str = this.f86128b;
        return "ExpiringKey(amount=" + i10 + ", description=" + str + ")";
    }
}
