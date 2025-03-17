package go;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lgo/a;", "LxB/a;", "", "name", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "g", "", "c", "J", "f", "()J", "stableId", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: go.a  reason: case insensitive filesystem */
public final class C11317a implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final String f97782a;

    /* renamed from: b  reason: collision with root package name */
    private final String f97783b;

    /* renamed from: c  reason: collision with root package name */
    private final long f97784c;

    public C11317a(String str, String str2) {
        C17542s.j(str, "name");
        C17542s.j(str2, "code");
        this.f97782a = str;
        this.f97783b = str2;
        U u10 = new U(3);
        u10.a(P.b(C11317a.class));
        u10.a(str);
        u10.b(new Object[]{str2});
        this.f97784c = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11317a)) {
            return false;
        }
        C11317a aVar = (C11317a) obj;
        return C17542s.e(this.f97782a, aVar.f97782a) && C17542s.e(this.f97783b, aVar.f97783b);
    }

    public long f() {
        return this.f97784c;
    }

    public final String g() {
        return this.f97783b;
    }

    public final String h() {
        return this.f97782a;
    }

    public int hashCode() {
        return (this.f97782a.hashCode() * 31) + this.f97783b.hashCode();
    }

    public String toString() {
        String str = this.f97782a;
        String str2 = this.f97783b;
        return "AmbiguousDeliveryArea(name=" + str + ", code=" + str2 + ")";
    }
}
