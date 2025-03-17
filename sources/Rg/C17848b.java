package rG;

import com.sugarcube.app.base.data.database.CachedCatalogItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"LrG/b;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "product", "", "quantity", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "b", "I", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rG.b  reason: case insensitive filesystem */
public final class C17848b {

    /* renamed from: a  reason: collision with root package name */
    private final CachedCatalogItem f146658a;

    /* renamed from: b  reason: collision with root package name */
    private final int f146659b;

    public C17848b(CachedCatalogItem cachedCatalogItem, int i10) {
        C17542s.j(cachedCatalogItem, "product");
        this.f146658a = cachedCatalogItem;
        this.f146659b = i10;
    }

    public final CachedCatalogItem a() {
        return this.f146658a;
    }

    public final int b() {
        return this.f146659b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17848b)) {
            return false;
        }
        C17848b bVar = (C17848b) obj;
        return C17542s.e(this.f146658a, bVar.f146658a) && this.f146659b == bVar.f146659b;
    }

    public int hashCode() {
        return (this.f146658a.hashCode() * 31) + Integer.hashCode(this.f146659b);
    }

    public String toString() {
        CachedCatalogItem cachedCatalogItem = this.f146658a;
        int i10 = this.f146659b;
        return "ItemWithQuantity(product=" + cachedCatalogItem + ", quantity=" + i10 + ")";
    }
}
