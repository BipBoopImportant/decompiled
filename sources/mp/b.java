package Mp;

import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006\u001e"}, d2 = {"LMp/b;", "", "", "id", "saying", "quotee", "role", "organisation", "Lcom/ingka/ikea/core/model/Image;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "f", "c", "d", "e", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f83627a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83628b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83629c;

    /* renamed from: d  reason: collision with root package name */
    private final String f83630d;

    /* renamed from: e  reason: collision with root package name */
    private final String f83631e;

    /* renamed from: f  reason: collision with root package name */
    private final Image f83632f;

    public b(String str, String str2, String str3, String str4, String str5, Image image) {
        C17542s.j(str, "id");
        C17542s.j(str2, "saying");
        C17542s.j(str3, "quotee");
        C17542s.j(str4, "role");
        C17542s.j(str5, "organisation");
        this.f83627a = str;
        this.f83628b = str2;
        this.f83629c = str3;
        this.f83630d = str4;
        this.f83631e = str5;
        this.f83632f = image;
    }

    public final String a() {
        return this.f83627a;
    }

    public final Image b() {
        return this.f83632f;
    }

    public final String c() {
        return this.f83631e;
    }

    public final String d() {
        return this.f83629c;
    }

    public final String e() {
        return this.f83630d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f83627a, bVar.f83627a) && C17542s.e(this.f83628b, bVar.f83628b) && C17542s.e(this.f83629c, bVar.f83629c) && C17542s.e(this.f83630d, bVar.f83630d) && C17542s.e(this.f83631e, bVar.f83631e) && C17542s.e(this.f83632f, bVar.f83632f);
    }

    public final String f() {
        return this.f83628b;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f83627a.hashCode() * 31) + this.f83628b.hashCode()) * 31) + this.f83629c.hashCode()) * 31) + this.f83630d.hashCode()) * 31) + this.f83631e.hashCode()) * 31;
        Image image = this.f83632f;
        return hashCode + (image == null ? 0 : image.hashCode());
    }

    public String toString() {
        String str = this.f83627a;
        String str2 = this.f83628b;
        String str3 = this.f83629c;
        String str4 = this.f83630d;
        String str5 = this.f83631e;
        Image image = this.f83632f;
        return "Quote(id=" + str + ", saying=" + str2 + ", quotee=" + str3 + ", role=" + str4 + ", organisation=" + str5 + ", image=" + image + ")";
    }
}
