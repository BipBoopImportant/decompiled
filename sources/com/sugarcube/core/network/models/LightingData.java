package com.sugarcube.core.network.models;

import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/core/network/models/LightingData;", "", "lightsData", "Lcom/sugarcube/core/network/models/LightsData;", "<init>", "(Lcom/sugarcube/core/network/models/LightsData;)V", "getLightsData", "()Lcom/sugarcube/core/network/models/LightsData;", "setLightsData", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class LightingData {
    private LightsData lightsData;

    public LightingData() {
        this((LightsData) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LightingData copy$default(LightingData lightingData, LightsData lightsData2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lightsData2 = lightingData.lightsData;
        }
        return lightingData.copy(lightsData2);
    }

    public final LightsData component1() {
        return this.lightsData;
    }

    public final LightingData copy(@e(name = "lights") LightsData lightsData2) {
        C17542s.j(lightsData2, "lightsData");
        return new LightingData(lightsData2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LightingData) && C17542s.e(this.lightsData, ((LightingData) obj).lightsData);
    }

    public final LightsData getLightsData() {
        return this.lightsData;
    }

    public int hashCode() {
        return this.lightsData.hashCode();
    }

    public final void setLightsData(LightsData lightsData2) {
        C17542s.j(lightsData2, "<set-?>");
        this.lightsData = lightsData2;
    }

    public String toString() {
        LightsData lightsData2 = this.lightsData;
        return "LightingData(lightsData=" + lightsData2 + ")";
    }

    public LightingData(@e(name = "lights") LightsData lightsData2) {
        C17542s.j(lightsData2, "lightsData");
        this.lightsData = lightsData2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LightingData(LightsData lightsData2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LightsData((AmbientData) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : lightsData2);
    }
}
