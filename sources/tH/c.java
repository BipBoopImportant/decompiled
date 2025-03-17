package Th;

import com.ingka.ikea.core.model.Media;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\b¨\u0006\u0017"}, d2 = {"LTh/c;", "", "Lcom/ingka/ikea/core/model/Media;", "item", "<init>", "(Lcom/ingka/ikea/core/model/Media;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/Media;", "()Lcom/ingka/ikea/core/model/Media;", "b", "Ljava/lang/String;", "getImageUrl", "imageUrl", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Media f64000a;

    /* renamed from: b  reason: collision with root package name */
    private final String f64001b;

    public c(Media media) {
        C17542s.j(media, "item");
        this.f64000a = media;
        String url = media.getUrl();
        this.f64001b = url + "?imwidth=800";
    }

    public final Media a() {
        return this.f64000a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && C17542s.e(this.f64000a, ((c) obj).f64000a);
    }

    public int hashCode() {
        return this.f64000a.hashCode();
    }

    public String toString() {
        Media media = this.f64000a;
        return "ProductImageViewModel(item=" + media + ")";
    }
}
