package Tj;

import com.ingka.ikea.app.base.ProductKey;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"LTj/f;", "", "Lcom/ingka/ikea/app/base/ProductKey;", "productKey", "", "isInFavourites", "<init>", "(Lcom/ingka/ikea/app/base/ProductKey;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/base/ProductKey;", "getProductKey", "()Lcom/ingka/ikea/app/base/ProductKey;", "b", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tj.f  reason: case insensitive filesystem */
public final class C10941f {

    /* renamed from: a  reason: collision with root package name */
    private final ProductKey f87489a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f87490b;

    public C10941f(ProductKey productKey, boolean z10) {
        C17542s.j(productKey, "productKey");
        this.f87489a = productKey;
        this.f87490b = z10;
    }

    public final boolean a() {
        return this.f87490b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10941f)) {
            return false;
        }
        C10941f fVar = (C10941f) obj;
        return C17542s.e(this.f87489a, fVar.f87489a) && this.f87490b == fVar.f87490b;
    }

    public int hashCode() {
        return (this.f87489a.hashCode() * 31) + Boolean.hashCode(this.f87490b);
    }

    public String toString() {
        ProductKey productKey = this.f87489a;
        boolean z10 = this.f87490b;
        return "CanAddToFavourites(productKey=" + productKey + ", isInFavourites=" + z10 + ")";
    }
}
