package vn;

import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u001d"}, d2 = {"Lvn/a;", "", "", "id", "Lcom/ingka/ikea/core/model/Image;", "image", "title", "body", "description", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/ingka/ikea/core/model/Image;", "c", "()Lcom/ingka/ikea/core/model/Image;", "d", "getBody", "e", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vn.a  reason: case insensitive filesystem */
public final class C12196a {

    /* renamed from: a  reason: collision with root package name */
    private final String f105217a;

    /* renamed from: b  reason: collision with root package name */
    private final Image f105218b;

    /* renamed from: c  reason: collision with root package name */
    private final String f105219c;

    /* renamed from: d  reason: collision with root package name */
    private final String f105220d;

    /* renamed from: e  reason: collision with root package name */
    private final String f105221e;

    public C12196a(String str, Image image, String str2, String str3, String str4) {
        C17542s.j(str, "id");
        C17542s.j(image, "image");
        C17542s.j(str2, "title");
        this.f105217a = str;
        this.f105218b = image;
        this.f105219c = str2;
        this.f105220d = str3;
        this.f105221e = str4;
    }

    public final String a() {
        return this.f105221e;
    }

    public final String b() {
        return this.f105217a;
    }

    public final Image c() {
        return this.f105218b;
    }

    public final String d() {
        return this.f105219c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12196a)) {
            return false;
        }
        C12196a aVar = (C12196a) obj;
        return C17542s.e(this.f105217a, aVar.f105217a) && C17542s.e(this.f105218b, aVar.f105218b) && C17542s.e(this.f105219c, aVar.f105219c) && C17542s.e(this.f105220d, aVar.f105220d) && C17542s.e(this.f105221e, aVar.f105221e);
    }

    public int hashCode() {
        int hashCode = ((((this.f105217a.hashCode() * 31) + this.f105218b.hashCode()) * 31) + this.f105219c.hashCode()) * 31;
        String str = this.f105220d;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f105221e;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f105217a;
        Image image = this.f105218b;
        String str2 = this.f105219c;
        String str3 = this.f105220d;
        String str4 = this.f105221e;
        return "Category(id=" + str + ", image=" + image + ", title=" + str2 + ", body=" + str3 + ", description=" + str4 + ")";
    }
}
