package RF;

import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LRF/k;", "", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "instanceId", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "catalogItem", "<init>", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "degrees", "c", "(F)F", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "e", "()F", "a", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)LRF/k;", "", "toString", "()Ljava/lang/String;", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "f", "()Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "b", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "d", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final ObjectInstanceId f115560a;

    /* renamed from: b  reason: collision with root package name */
    private final CachedCatalogItem f115561b;

    public k(ObjectInstanceId objectInstanceId, CachedCatalogItem cachedCatalogItem) {
        C17542s.j(objectInstanceId, "instanceId");
        C17542s.j(cachedCatalogItem, "catalogItem");
        this.f115560a = objectInstanceId;
        this.f115561b = cachedCatalogItem;
    }

    public static /* synthetic */ k b(k kVar, ObjectInstanceId objectInstanceId, CachedCatalogItem cachedCatalogItem, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            objectInstanceId = kVar.f115560a;
        }
        if ((i10 & 2) != 0) {
            cachedCatalogItem = kVar.f115561b;
        }
        return kVar.a(objectInstanceId, cachedCatalogItem);
    }

    private final float c(float f10) {
        return C17978n.l((((f10 - 4.5f) / 67.5f) * 1.0f) + 0.0f, 0.0f, 1.0f);
    }

    public final k a(ObjectInstanceId objectInstanceId, CachedCatalogItem cachedCatalogItem) {
        C17542s.j(objectInstanceId, "instanceId");
        C17542s.j(cachedCatalogItem, "catalogItem");
        return new k(objectInstanceId, cachedCatalogItem);
    }

    public final CachedCatalogItem d() {
        return this.f115561b;
    }

    public final float e() {
        return this.f115561b.isStackableParent() ? c(30.0f) : (this.f115561b.isStackableChild() || this.f115561b.isFloorPlaceable()) ? c(20.0f) : c(0.0f);
    }

    public boolean equals(Object obj) {
        if (obj == null || !C17542s.e(obj.getClass(), k.class)) {
            return false;
        }
        k kVar = (k) obj;
        return C17542s.e(this.f115560a, kVar.f115560a) && this.f115561b.getId() == kVar.f115561b.getId();
    }

    public final ObjectInstanceId f() {
        return this.f115560a;
    }

    public int hashCode() {
        return this.f115560a.getIntValue();
    }

    public String toString() {
        ObjectInstanceId objectInstanceId = this.f115560a;
        CachedCatalogItem cachedCatalogItem = this.f115561b;
        return "ModelInstanceInfo(instanceId=" + objectInstanceId + ", catalogItem=" + cachedCatalogItem + ")";
    }
}
