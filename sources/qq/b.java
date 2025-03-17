package Qq;

import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LQq/b;", "LxB/a;", "", "date", "", "LQq/c;", "events", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "Ljava/util/List;", "h", "()Ljava/util/List;", "", "c", "J", "f", "()J", "stableId", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final String f86113a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f86114b;

    /* renamed from: c  reason: collision with root package name */
    private final long f86115c;

    public b(String str, List<c> list) {
        C17542s.j(str, "date");
        C17542s.j(list, "events");
        this.f86113a = str;
        this.f86114b = list;
        U u10 = new U(3);
        u10.a(P.b(b.class));
        u10.a(str);
        u10.b(new Object[]{list});
        this.f86115c = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f86113a, bVar.f86113a) && C17542s.e(this.f86114b, bVar.f86114b);
    }

    public long f() {
        return this.f86115c;
    }

    public final String g() {
        return this.f86113a;
    }

    public final List<c> h() {
        return this.f86114b;
    }

    public int hashCode() {
        return (this.f86113a.hashCode() * 31) + this.f86114b.hashCode();
    }

    public String toString() {
        String str = this.f86113a;
        List<c> list = this.f86114b;
        return "Date(date=" + str + ", events=" + list + ")";
    }
}
