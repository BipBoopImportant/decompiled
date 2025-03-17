package com.sugarcube.decorate;

import com.squareup.moshi.g;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/sugarcube/decorate/DesignItemInfo;", "", "Lcom/sugarcube/decorate/TempModelInstanceInfo;", "modelInstanceInfo", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "modelScreenTransform", "<init>", "(Lcom/sugarcube/decorate/TempModelInstanceInfo;Lcom/sugarcube/decorate_engine/ModelScreenTransform;)V", "a", "()Lcom/sugarcube/decorate/TempModelInstanceInfo;", "b", "()Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sugarcube/decorate/TempModelInstanceInfo;", "c", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "d", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class DesignItemInfo {

    /* renamed from: a  reason: collision with root package name */
    private final TempModelInstanceInfo f126115a;

    /* renamed from: b  reason: collision with root package name */
    private final ModelScreenTransform f126116b;

    public DesignItemInfo(TempModelInstanceInfo tempModelInstanceInfo, ModelScreenTransform modelScreenTransform) {
        C17542s.j(tempModelInstanceInfo, "modelInstanceInfo");
        C17542s.j(modelScreenTransform, "modelScreenTransform");
        this.f126115a = tempModelInstanceInfo;
        this.f126116b = modelScreenTransform;
    }

    public final TempModelInstanceInfo a() {
        return this.f126115a;
    }

    public final ModelScreenTransform b() {
        return this.f126116b;
    }

    public final TempModelInstanceInfo c() {
        return this.f126115a;
    }

    public final ModelScreenTransform d() {
        return this.f126116b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DesignItemInfo)) {
            return false;
        }
        DesignItemInfo designItemInfo = (DesignItemInfo) obj;
        return C17542s.e(this.f126115a, designItemInfo.f126115a) && C17542s.e(this.f126116b, designItemInfo.f126116b);
    }

    public int hashCode() {
        return (this.f126115a.hashCode() * 31) + this.f126116b.hashCode();
    }

    public String toString() {
        TempModelInstanceInfo tempModelInstanceInfo = this.f126115a;
        ModelScreenTransform modelScreenTransform = this.f126116b;
        return "DesignItemInfo(modelInstanceInfo=" + tempModelInstanceInfo + ", modelScreenTransform=" + modelScreenTransform + ")";
    }
}
