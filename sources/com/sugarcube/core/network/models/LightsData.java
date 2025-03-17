package com.sugarcube.core.network.models;

import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006 "}, d2 = {"Lcom/sugarcube/core/network/models/LightsData;", "", "ambient", "Lcom/sugarcube/core/network/models/AmbientData;", "pointLights", "", "Lcom/sugarcube/core/network/models/PointLightData;", "directionalLights", "Lcom/sugarcube/core/network/models/DirectionalLightData;", "<init>", "(Lcom/sugarcube/core/network/models/AmbientData;Ljava/util/List;Ljava/util/List;)V", "getAmbient", "()Lcom/sugarcube/core/network/models/AmbientData;", "setAmbient", "(Lcom/sugarcube/core/network/models/AmbientData;)V", "getPointLights", "()Ljava/util/List;", "setPointLights", "(Ljava/util/List;)V", "getDirectionalLights", "setDirectionalLights", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class LightsData {
    private AmbientData ambient;
    private List<DirectionalLightData> directionalLights;
    private List<PointLightData> pointLights;

    public LightsData() {
        this((AmbientData) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LightsData copy$default(LightsData lightsData, AmbientData ambientData, List<PointLightData> list, List<DirectionalLightData> list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ambientData = lightsData.ambient;
        }
        if ((i10 & 2) != 0) {
            list = lightsData.pointLights;
        }
        if ((i10 & 4) != 0) {
            list2 = lightsData.directionalLights;
        }
        return lightsData.copy(ambientData, list, list2);
    }

    public final AmbientData component1() {
        return this.ambient;
    }

    public final List<PointLightData> component2() {
        return this.pointLights;
    }

    public final List<DirectionalLightData> component3() {
        return this.directionalLights;
    }

    public final LightsData copy(AmbientData ambientData, @e(name = "point") List<PointLightData> list, @e(name = "directional") List<DirectionalLightData> list2) {
        C17542s.j(ambientData, "ambient");
        C17542s.j(list, "pointLights");
        C17542s.j(list2, "directionalLights");
        return new LightsData(ambientData, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightsData)) {
            return false;
        }
        LightsData lightsData = (LightsData) obj;
        return C17542s.e(this.ambient, lightsData.ambient) && C17542s.e(this.pointLights, lightsData.pointLights) && C17542s.e(this.directionalLights, lightsData.directionalLights);
    }

    public final AmbientData getAmbient() {
        return this.ambient;
    }

    public final List<DirectionalLightData> getDirectionalLights() {
        return this.directionalLights;
    }

    public final List<PointLightData> getPointLights() {
        return this.pointLights;
    }

    public int hashCode() {
        return (((this.ambient.hashCode() * 31) + this.pointLights.hashCode()) * 31) + this.directionalLights.hashCode();
    }

    public final void setAmbient(AmbientData ambientData) {
        C17542s.j(ambientData, "<set-?>");
        this.ambient = ambientData;
    }

    public final void setDirectionalLights(List<DirectionalLightData> list) {
        C17542s.j(list, "<set-?>");
        this.directionalLights = list;
    }

    public final void setPointLights(List<PointLightData> list) {
        C17542s.j(list, "<set-?>");
        this.pointLights = list;
    }

    public String toString() {
        AmbientData ambientData = this.ambient;
        List<PointLightData> list = this.pointLights;
        List<DirectionalLightData> list2 = this.directionalLights;
        return "LightsData(ambient=" + ambientData + ", pointLights=" + list + ", directionalLights=" + list2 + ")";
    }

    public LightsData(AmbientData ambientData, @e(name = "point") List<PointLightData> list, @e(name = "directional") List<DirectionalLightData> list2) {
        C17542s.j(ambientData, "ambient");
        C17542s.j(list, "pointLights");
        C17542s.j(list2, "directionalLights");
        this.ambient = ambientData;
        this.pointLights = list;
        this.directionalLights = list2;
    }

    public /* synthetic */ LightsData(AmbientData ambientData, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        ArrayList arrayList;
        ArrayList arrayList2;
        LightsData lightsData;
        AmbientData ambientData2 = (i10 & 1) != 0 ? new AmbientData((List) null, 0.0d, 3, (DefaultConstructorMarker) null) : ambientData;
        if ((i10 & 2) != 0) {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(new PointLightData(0, (List) null, 0.0d, 0.0d, (List) null, (List) null, 63, (DefaultConstructorMarker) null));
            arrayList = arrayList3;
        } else {
            arrayList = list;
        }
        if ((i10 & 4) != 0) {
            ArrayList arrayList4 = new ArrayList(1);
            arrayList4.add(new DirectionalLightData(0, (List) null, 0.0d, 0.0d, (List) null, (List) null, (List) null, 127, (DefaultConstructorMarker) null));
            lightsData = this;
            arrayList2 = arrayList4;
        } else {
            lightsData = this;
            arrayList2 = list2;
        }
        new LightsData(ambientData2, arrayList, arrayList2);
    }
}
