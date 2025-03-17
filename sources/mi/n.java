package Mi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0017"}, d2 = {"LMi/n;", "", "", "reviewId", "title", "text", "response", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f83420a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83421b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83422c;

    /* renamed from: d  reason: collision with root package name */
    private final String f83423d;

    public n(String str, String str2, String str3, String str4) {
        C17542s.j(str, "reviewId");
        C17542s.j(str2, "title");
        C17542s.j(str3, "text");
        this.f83420a = str;
        this.f83421b = str2;
        this.f83422c = str3;
        this.f83423d = str4;
    }

    public final String a() {
        return this.f83423d;
    }

    public final String b() {
        return this.f83420a;
    }

    public final String c() {
        return this.f83422c;
    }

    public final String d() {
        return this.f83421b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return C17542s.e(this.f83420a, nVar.f83420a) && C17542s.e(this.f83421b, nVar.f83421b) && C17542s.e(this.f83422c, nVar.f83422c) && C17542s.e(this.f83423d, nVar.f83423d);
    }

    public int hashCode() {
        int hashCode = ((((this.f83420a.hashCode() * 31) + this.f83421b.hashCode()) * 31) + this.f83422c.hashCode()) * 31;
        String str = this.f83423d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f83420a;
        String str2 = this.f83421b;
        String str3 = this.f83422c;
        String str4 = this.f83423d;
        return "Translation(reviewId=" + str + ", title=" + str2 + ", text=" + str3 + ", response=" + str4 + ")";
    }
}
