package aq;

import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Laq/d;", "", "", "filter", "title", "inspirationId", "Lcom/ingka/ikea/core/model/Image;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f90414a;

    /* renamed from: b  reason: collision with root package name */
    private final String f90415b;

    /* renamed from: c  reason: collision with root package name */
    private final String f90416c;

    /* renamed from: d  reason: collision with root package name */
    private final Image f90417d;

    public d(String str, String str2, String str3, Image image) {
        C17542s.j(str, "filter");
        C17542s.j(str2, "title");
        C17542s.j(str3, "inspirationId");
        C17542s.j(image, "image");
        this.f90414a = str;
        this.f90415b = str2;
        this.f90416c = str3;
        this.f90417d = image;
    }

    public final String a() {
        return this.f90414a;
    }

    public final Image b() {
        return this.f90417d;
    }

    public final String c() {
        return this.f90416c;
    }

    public final String d() {
        return this.f90415b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return C17542s.e(this.f90414a, dVar.f90414a) && C17542s.e(this.f90415b, dVar.f90415b) && C17542s.e(this.f90416c, dVar.f90416c) && C17542s.e(this.f90417d, dVar.f90417d);
    }

    public int hashCode() {
        return (((((this.f90414a.hashCode() * 31) + this.f90415b.hashCode()) * 31) + this.f90416c.hashCode()) * 31) + this.f90417d.hashCode();
    }

    public String toString() {
        String str = this.f90414a;
        String str2 = this.f90415b;
        String str3 = this.f90416c;
        Image image = this.f90417d;
        return "Inspiration(filter=" + str + ", title=" + str2 + ", inspirationId=" + str3 + ", image=" + image + ")";
    }
}
