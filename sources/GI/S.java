package gi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, d2 = {"Lgi/S;", "", "", "itemNo", "imageUrl", "contentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class S {

    /* renamed from: a  reason: collision with root package name */
    private final String f73338a;

    /* renamed from: b  reason: collision with root package name */
    private final String f73339b;

    /* renamed from: c  reason: collision with root package name */
    private final String f73340c;

    public S(String str, String str2, String str3) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "imageUrl");
        C17542s.j(str3, "contentDescription");
        this.f73338a = str;
        this.f73339b = str2;
        this.f73340c = str3;
    }

    public final String a() {
        return this.f73340c;
    }

    public final String b() {
        return this.f73339b;
    }

    public final String c() {
        return this.f73338a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return C17542s.e(this.f73338a, s10.f73338a) && C17542s.e(this.f73339b, s10.f73339b) && C17542s.e(this.f73340c, s10.f73340c);
    }

    public int hashCode() {
        return (((this.f73338a.hashCode() * 31) + this.f73339b.hashCode()) * 31) + this.f73340c.hashCode();
    }

    public String toString() {
        String str = this.f73338a;
        String str2 = this.f73339b;
        String str3 = this.f73340c;
        return "ShowOnPipRepresentation(itemNo=" + str + ", imageUrl=" + str2 + ", contentDescription=" + str3 + ")";
    }
}
