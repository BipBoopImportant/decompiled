package Mi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\n¨\u0006\u0017"}, d2 = {"LMi/o;", "", "", "title", "tooltip", "sectionText1", "sectionText2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final String f83424a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83425b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83426c;

    /* renamed from: d  reason: collision with root package name */
    private final String f83427d;

    public o(String str, String str2, String str3, String str4) {
        C17542s.j(str, "title");
        C17542s.j(str2, "tooltip");
        C17542s.j(str3, "sectionText1");
        C17542s.j(str4, "sectionText2");
        this.f83424a = str;
        this.f83425b = str2;
        this.f83426c = str3;
        this.f83427d = str4;
    }

    public final String a() {
        return this.f83426c;
    }

    public final String b() {
        return this.f83427d;
    }

    public final String c() {
        return this.f83424a;
    }

    public final String d() {
        return this.f83425b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return C17542s.e(this.f83424a, oVar.f83424a) && C17542s.e(this.f83425b, oVar.f83425b) && C17542s.e(this.f83426c, oVar.f83426c) && C17542s.e(this.f83427d, oVar.f83427d);
    }

    public int hashCode() {
        return (((((this.f83424a.hashCode() * 31) + this.f83425b.hashCode()) * 31) + this.f83426c.hashCode()) * 31) + this.f83427d.hashCode();
    }

    public String toString() {
        String str = this.f83424a;
        String str2 = this.f83425b;
        String str3 = this.f83426c;
        String str4 = this.f83427d;
        return "VerifiedPurchase(title=" + str + ", tooltip=" + str2 + ", sectionText1=" + str3 + ", sectionText2=" + str4 + ")";
    }
}
