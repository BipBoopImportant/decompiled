package mi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lmi/g;", "", "", "title", "", "rating", "reviewText", "reviewerNameAndMarket", "<init>", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;)Lmi/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "F", "c", "()F", "d", "e", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final String f75471a;

    /* renamed from: b  reason: collision with root package name */
    private final float f75472b;

    /* renamed from: c  reason: collision with root package name */
    private final String f75473c;

    /* renamed from: d  reason: collision with root package name */
    private final String f75474d;

    public g(String str, float f10, String str2, String str3) {
        C17542s.j(str, "title");
        C17542s.j(str2, "reviewText");
        C17542s.j(str3, "reviewerNameAndMarket");
        this.f75471a = str;
        this.f75472b = f10;
        this.f75473c = str2;
        this.f75474d = str3;
    }

    public static /* synthetic */ g b(g gVar, String str, float f10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gVar.f75471a;
        }
        if ((i10 & 2) != 0) {
            f10 = gVar.f75472b;
        }
        if ((i10 & 4) != 0) {
            str2 = gVar.f75473c;
        }
        if ((i10 & 8) != 0) {
            str3 = gVar.f75474d;
        }
        return gVar.a(str, f10, str2, str3);
    }

    public final g a(String str, float f10, String str2, String str3) {
        C17542s.j(str, "title");
        C17542s.j(str2, "reviewText");
        C17542s.j(str3, "reviewerNameAndMarket");
        return new g(str, f10, str2, str3);
    }

    public final float c() {
        return this.f75472b;
    }

    public final String d() {
        return this.f75473c;
    }

    public final String e() {
        return this.f75474d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return C17542s.e(this.f75471a, gVar.f75471a) && Float.compare(this.f75472b, gVar.f75472b) == 0 && C17542s.e(this.f75473c, gVar.f75473c) && C17542s.e(this.f75474d, gVar.f75474d);
    }

    public final String f() {
        return this.f75471a;
    }

    public int hashCode() {
        return (((((this.f75471a.hashCode() * 31) + Float.hashCode(this.f75472b)) * 31) + this.f75473c.hashCode()) * 31) + this.f75474d.hashCode();
    }

    public String toString() {
        String str = this.f75471a;
        float f10 = this.f75472b;
        String str2 = this.f75473c;
        String str3 = this.f75474d;
        return "ReviewItemUiModel(title=" + str + ", rating=" + f10 + ", reviewText=" + str2 + ", reviewerNameAndMarket=" + str3 + ")";
    }
}
