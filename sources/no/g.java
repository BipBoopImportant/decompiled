package No;

import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"LNo/g;", "", "", "id", "saying", "quotee", "roleAndOrganisation", "Lcom/ingka/ikea/core/model/Image;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;)LNo/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "f", "c", "d", "e", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final String f84209a;

    /* renamed from: b  reason: collision with root package name */
    private final String f84210b;

    /* renamed from: c  reason: collision with root package name */
    private final String f84211c;

    /* renamed from: d  reason: collision with root package name */
    private final String f84212d;

    /* renamed from: e  reason: collision with root package name */
    private final Image f84213e;

    public g(String str, String str2, String str3, String str4, Image image) {
        C17542s.j(str, "id");
        C17542s.j(str2, "saying");
        C17542s.j(str3, "quotee");
        C17542s.j(str4, "roleAndOrganisation");
        this.f84209a = str;
        this.f84210b = str2;
        this.f84211c = str3;
        this.f84212d = str4;
        this.f84213e = image;
    }

    public static /* synthetic */ g b(g gVar, String str, String str2, String str3, String str4, Image image, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gVar.f84209a;
        }
        if ((i10 & 2) != 0) {
            str2 = gVar.f84210b;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = gVar.f84211c;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = gVar.f84212d;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            image = gVar.f84213e;
        }
        return gVar.a(str, str5, str6, str7, image);
    }

    public final g a(String str, String str2, String str3, String str4, Image image) {
        C17542s.j(str, "id");
        C17542s.j(str2, "saying");
        C17542s.j(str3, "quotee");
        C17542s.j(str4, "roleAndOrganisation");
        return new g(str, str2, str3, str4, image);
    }

    public final Image c() {
        return this.f84213e;
    }

    public final String d() {
        return this.f84211c;
    }

    public final String e() {
        return this.f84212d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return C17542s.e(this.f84209a, gVar.f84209a) && C17542s.e(this.f84210b, gVar.f84210b) && C17542s.e(this.f84211c, gVar.f84211c) && C17542s.e(this.f84212d, gVar.f84212d) && C17542s.e(this.f84213e, gVar.f84213e);
    }

    public final String f() {
        return this.f84210b;
    }

    public int hashCode() {
        int hashCode = ((((((this.f84209a.hashCode() * 31) + this.f84210b.hashCode()) * 31) + this.f84211c.hashCode()) * 31) + this.f84212d.hashCode()) * 31;
        Image image = this.f84213e;
        return hashCode + (image == null ? 0 : image.hashCode());
    }

    public String toString() {
        String str = this.f84209a;
        String str2 = this.f84210b;
        String str3 = this.f84211c;
        String str4 = this.f84212d;
        Image image = this.f84213e;
        return "QuoteUiModel(id=" + str + ", saying=" + str2 + ", quotee=" + str3 + ", roleAndOrganisation=" + str4 + ", image=" + image + ")";
    }
}
