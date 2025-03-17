package Up;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"LUp/a;", "", "", "personalisationConsented", "isLoggedIn", "isOffersHubEnabled", "<init>", "(ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "c", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f88331a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f88332b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f88333c;

    public a(boolean z10, boolean z11, boolean z12) {
        this.f88331a = z10;
        this.f88332b = z11;
        this.f88333c = z12;
    }

    public final boolean a() {
        return this.f88331a;
    }

    public final boolean b() {
        return this.f88332b;
    }

    public final boolean c() {
        return this.f88333c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f88331a == aVar.f88331a && this.f88332b == aVar.f88332b && this.f88333c == aVar.f88333c;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f88331a) * 31) + Boolean.hashCode(this.f88332b)) * 31) + Boolean.hashCode(this.f88333c);
    }

    public String toString() {
        boolean z10 = this.f88331a;
        boolean z11 = this.f88332b;
        boolean z12 = this.f88333c;
        return "ConsentAndLoginStatus(personalisationConsented=" + z10 + ", isLoggedIn=" + z11 + ", isOffersHubEnabled=" + z12 + ")";
    }
}
