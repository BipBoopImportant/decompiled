package An;

import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"LAn/e;", "", "", "id", "Lcom/ingka/ikea/core/model/Image;", "image", "title", "description", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "c", "d", "getDescription", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f78993a;

    /* renamed from: b  reason: collision with root package name */
    private final Image f78994b;

    /* renamed from: c  reason: collision with root package name */
    private final String f78995c;

    /* renamed from: d  reason: collision with root package name */
    private final String f78996d;

    public e(String str, Image image, String str2, String str3) {
        C17542s.j(str, "id");
        C17542s.j(image, "image");
        C17542s.j(str2, "title");
        this.f78993a = str;
        this.f78994b = image;
        this.f78995c = str2;
        this.f78996d = str3;
    }

    public final String a() {
        return this.f78993a;
    }

    public final Image b() {
        return this.f78994b;
    }

    public final String c() {
        return this.f78995c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f78993a, eVar.f78993a) && C17542s.e(this.f78994b, eVar.f78994b) && C17542s.e(this.f78995c, eVar.f78995c) && C17542s.e(this.f78996d, eVar.f78996d);
    }

    public int hashCode() {
        int hashCode = ((((this.f78993a.hashCode() * 31) + this.f78994b.hashCode()) * 31) + this.f78995c.hashCode()) * 31;
        String str = this.f78996d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f78993a;
        Image image = this.f78994b;
        String str2 = this.f78995c;
        String str3 = this.f78996d;
        return "CategoryUiModel(id=" + str + ", image=" + image + ", title=" + str2 + ", description=" + str3 + ")";
    }
}
