package Hy;

import com.ingka.ikea.core.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LHy/C;", "", "", "Lcom/ingka/ikea/core/model/Image;", "productImages", "", "additionalProductCount", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C {

    /* renamed from: a  reason: collision with root package name */
    private final List<Image> f110839a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f110840b;

    public C(List<Image> list, Integer num) {
        C17542s.j(list, "productImages");
        this.f110839a = list;
        this.f110840b = num;
    }

    public final Integer a() {
        return this.f110840b;
    }

    public final List<Image> b() {
        return this.f110839a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return C17542s.e(this.f110839a, c10.f110839a) && C17542s.e(this.f110840b, c10.f110840b);
    }

    public int hashCode() {
        int hashCode = this.f110839a.hashCode() * 31;
        Integer num = this.f110840b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        List<Image> list = this.f110839a;
        Integer num = this.f110840b;
        return "NonCollectedFullserveProductImagesData(productImages=" + list + ", additionalProductCount=" + num + ")";
    }
}
