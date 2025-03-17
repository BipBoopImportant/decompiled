package com.sugarcube.decorate;

import com.squareup.moshi.g;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/sugarcube/decorate/TempModelInstanceInfo;", "", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "instanceId", "Lcom/sugarcube/core/network/models/CatalogItem;", "catalogItem", "<init>", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/core/network/models/CatalogItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "b", "()Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lcom/sugarcube/core/network/models/CatalogItem;", "()Lcom/sugarcube/core/network/models/CatalogItem;", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class TempModelInstanceInfo {

    /* renamed from: a  reason: collision with root package name */
    private final ObjectInstanceId f126120a;

    /* renamed from: b  reason: collision with root package name */
    private final CatalogItem f126121b;

    public TempModelInstanceInfo(ObjectInstanceId objectInstanceId, CatalogItem catalogItem) {
        C17542s.j(objectInstanceId, "instanceId");
        C17542s.j(catalogItem, "catalogItem");
        this.f126120a = objectInstanceId;
        this.f126121b = catalogItem;
    }

    public final CatalogItem a() {
        return this.f126121b;
    }

    public final ObjectInstanceId b() {
        return this.f126120a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TempModelInstanceInfo)) {
            return false;
        }
        TempModelInstanceInfo tempModelInstanceInfo = (TempModelInstanceInfo) obj;
        return C17542s.e(this.f126120a, tempModelInstanceInfo.f126120a) && C17542s.e(this.f126121b, tempModelInstanceInfo.f126121b);
    }

    public int hashCode() {
        return (this.f126120a.hashCode() * 31) + this.f126121b.hashCode();
    }

    public String toString() {
        ObjectInstanceId objectInstanceId = this.f126120a;
        CatalogItem catalogItem = this.f126121b;
        return "TempModelInstanceInfo(instanceId=" + objectInstanceId + ", catalogItem=" + catalogItem + ")";
    }
}
