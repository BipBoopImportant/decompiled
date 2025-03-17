package Mi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LMi/p;", "", "", "id", "title", "typeId", "", "mandatory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getTitle", "c", "getTypeId", "d", "Z", "getMandatory", "()Z", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final String f83428a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83429b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83430c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f83431d;

    public p(String str, String str2, String str3, boolean z10) {
        C17542s.j(str, "id");
        C17542s.j(str2, "title");
        C17542s.j(str3, "typeId");
        this.f83428a = str;
        this.f83429b = str2;
        this.f83430c = str3;
        this.f83431d = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return C17542s.e(this.f83428a, pVar.f83428a) && C17542s.e(this.f83429b, pVar.f83429b) && C17542s.e(this.f83430c, pVar.f83430c) && this.f83431d == pVar.f83431d;
    }

    public int hashCode() {
        return (((((this.f83428a.hashCode() * 31) + this.f83429b.hashCode()) * 31) + this.f83430c.hashCode()) * 31) + Boolean.hashCode(this.f83431d);
    }

    public String toString() {
        String str = this.f83428a;
        String str2 = this.f83429b;
        String str3 = this.f83430c;
        boolean z10 = this.f83431d;
        return "WriteReviewQuestion(id=" + str + ", title=" + str2 + ", typeId=" + str3 + ", mandatory=" + z10 + ")";
    }
}
