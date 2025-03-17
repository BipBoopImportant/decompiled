package uB;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"LuB/g;", "", "", "title", "Lp1/v0;", "backgroundColor", "<init>", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uB.g  reason: case insensitive filesystem */
public final class C15109g {

    /* renamed from: c  reason: collision with root package name */
    public static final int f131301c = 0;

    /* renamed from: a  reason: collision with root package name */
    private final String f131302a;

    /* renamed from: b  reason: collision with root package name */
    private final long f131303b;

    public /* synthetic */ C15109g(String str, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10);
    }

    public final long a() {
        return this.f131303b;
    }

    public final String b() {
        return this.f131302a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15109g)) {
            return false;
        }
        C15109g gVar = (C15109g) obj;
        return C17542s.e(this.f131302a, gVar.f131302a) && C5747v0.q(this.f131303b, gVar.f131303b);
    }

    public int hashCode() {
        return (this.f131302a.hashCode() * 31) + C5747v0.w(this.f131303b);
    }

    public String toString() {
        String str = this.f131302a;
        String x10 = C5747v0.x(this.f131303b);
        return "PopulatedStateConfig(title=" + str + ", backgroundColor=" + x10 + ")";
    }

    private C15109g(String str, long j10) {
        C17542s.j(str, "title");
        this.f131302a = str;
        this.f131303b = j10;
    }
}
