package GD;

import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"LGD/a;", "", "Lcom/ingka/ikea/core/model/Image;", "vertical", "horizontal", "<init>", "(Lcom/ingka/ikea/core/model/Image;Lcom/ingka/ikea/core/model/Image;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/Image;", "b", "()Lcom/ingka/ikea/core/model/Image;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GD.a  reason: case insensitive filesystem */
public final class C12928a {

    /* renamed from: a  reason: collision with root package name */
    private final Image f110331a;

    /* renamed from: b  reason: collision with root package name */
    private final Image f110332b;

    public C12928a(Image image, Image image2) {
        C17542s.j(image, "vertical");
        C17542s.j(image2, "horizontal");
        this.f110331a = image;
        this.f110332b = image2;
    }

    public final Image a() {
        return this.f110332b;
    }

    public final Image b() {
        return this.f110331a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12928a)) {
            return false;
        }
        C12928a aVar = (C12928a) obj;
        return C17542s.e(this.f110331a, aVar.f110331a) && C17542s.e(this.f110332b, aVar.f110332b);
    }

    public int hashCode() {
        return (this.f110331a.hashCode() * 31) + this.f110332b.hashCode();
    }

    public String toString() {
        Image image = this.f110331a;
        Image image2 = this.f110332b;
        return "Background(vertical=" + image + ", horizontal=" + image2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12928a(Image image, Image image2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(image, (i10 & 2) != 0 ? image : image2);
    }
}
