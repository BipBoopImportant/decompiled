package NA;

import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"LNA/g0;", "", "Lcom/ingka/ikea/core/model/Image;", "icon", "", "name", "<init>", "(Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "b", "Ljava/lang/String;", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final Image f112339a;

    /* renamed from: b  reason: collision with root package name */
    private final String f112340b;

    public g0(Image image, String str) {
        C17542s.j(image, "icon");
        C17542s.j(str, "name");
        this.f112339a = image;
        this.f112340b = str;
    }

    public final Image a() {
        return this.f112339a;
    }

    public final String b() {
        return this.f112340b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return C17542s.e(this.f112339a, g0Var.f112339a) && C17542s.e(this.f112340b, g0Var.f112340b);
    }

    public int hashCode() {
        return (this.f112339a.hashCode() * 31) + this.f112340b.hashCode();
    }

    public String toString() {
        Image image = this.f112339a;
        String str = this.f112340b;
        return "UserContentSourceUiModel(icon=" + image + ", name=" + str + ")";
    }
}
