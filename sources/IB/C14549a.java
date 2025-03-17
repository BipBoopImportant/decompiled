package iB;

import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"LiB/a;", "", "", "inspirationId", "Lcom/ingka/ikea/core/model/Image;", "image", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "shoppinglist-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iB.a  reason: case insensitive filesystem */
public final class C14549a {

    /* renamed from: a  reason: collision with root package name */
    private final String f127523a;

    /* renamed from: b  reason: collision with root package name */
    private final Image f127524b;

    public C14549a(String str, Image image) {
        C17542s.j(str, "inspirationId");
        C17542s.j(image, "image");
        this.f127523a = str;
        this.f127524b = image;
    }

    public final Image a() {
        return this.f127524b;
    }

    public final String b() {
        return this.f127523a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14549a)) {
            return false;
        }
        C14549a aVar = (C14549a) obj;
        return C17542s.e(this.f127523a, aVar.f127523a) && C17542s.e(this.f127524b, aVar.f127524b);
    }

    public int hashCode() {
        return (this.f127523a.hashCode() * 31) + this.f127524b.hashCode();
    }

    public String toString() {
        String str = this.f127523a;
        Image image = this.f127524b;
        return "ShoppingListInspiration(inspirationId=" + str + ", image=" + image + ")";
    }
}
