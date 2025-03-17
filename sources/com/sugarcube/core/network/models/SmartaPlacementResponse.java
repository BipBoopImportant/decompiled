package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J<\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/sugarcube/core/network/models/SmartaPlacementResponse;", "", "error", "", "errorCode", "", "placedFurniture", "Lcom/sugarcube/core/network/models/SmartaPlacement;", "debug", "Lcom/sugarcube/core/network/models/SmartaDebug;", "<init>", "(ZLjava/lang/Integer;Lcom/sugarcube/core/network/models/SmartaPlacement;Lcom/sugarcube/core/network/models/SmartaDebug;)V", "getError", "()Z", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPlacedFurniture", "()Lcom/sugarcube/core/network/models/SmartaPlacement;", "getDebug", "()Lcom/sugarcube/core/network/models/SmartaDebug;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Integer;Lcom/sugarcube/core/network/models/SmartaPlacement;Lcom/sugarcube/core/network/models/SmartaDebug;)Lcom/sugarcube/core/network/models/SmartaPlacementResponse;", "equals", "other", "hashCode", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class SmartaPlacementResponse {
    private final SmartaDebug debug;
    private final boolean error;
    private final Integer errorCode;
    private final SmartaPlacement placedFurniture;

    public SmartaPlacementResponse(boolean z10, Integer num, SmartaPlacement smartaPlacement, SmartaDebug smartaDebug) {
        this.error = z10;
        this.errorCode = num;
        this.placedFurniture = smartaPlacement;
        this.debug = smartaDebug;
    }

    public static /* synthetic */ SmartaPlacementResponse copy$default(SmartaPlacementResponse smartaPlacementResponse, boolean z10, Integer num, SmartaPlacement smartaPlacement, SmartaDebug smartaDebug, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = smartaPlacementResponse.error;
        }
        if ((i10 & 2) != 0) {
            num = smartaPlacementResponse.errorCode;
        }
        if ((i10 & 4) != 0) {
            smartaPlacement = smartaPlacementResponse.placedFurniture;
        }
        if ((i10 & 8) != 0) {
            smartaDebug = smartaPlacementResponse.debug;
        }
        return smartaPlacementResponse.copy(z10, num, smartaPlacement, smartaDebug);
    }

    public final boolean component1() {
        return this.error;
    }

    public final Integer component2() {
        return this.errorCode;
    }

    public final SmartaPlacement component3() {
        return this.placedFurniture;
    }

    public final SmartaDebug component4() {
        return this.debug;
    }

    public final SmartaPlacementResponse copy(boolean z10, Integer num, SmartaPlacement smartaPlacement, SmartaDebug smartaDebug) {
        return new SmartaPlacementResponse(z10, num, smartaPlacement, smartaDebug);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartaPlacementResponse)) {
            return false;
        }
        SmartaPlacementResponse smartaPlacementResponse = (SmartaPlacementResponse) obj;
        return this.error == smartaPlacementResponse.error && C17542s.e(this.errorCode, smartaPlacementResponse.errorCode) && C17542s.e(this.placedFurniture, smartaPlacementResponse.placedFurniture) && C17542s.e(this.debug, smartaPlacementResponse.debug);
    }

    public final SmartaDebug getDebug() {
        return this.debug;
    }

    public final boolean getError() {
        return this.error;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final SmartaPlacement getPlacedFurniture() {
        return this.placedFurniture;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.error) * 31;
        Integer num = this.errorCode;
        int i10 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        SmartaPlacement smartaPlacement = this.placedFurniture;
        int hashCode3 = (hashCode2 + (smartaPlacement == null ? 0 : smartaPlacement.hashCode())) * 31;
        SmartaDebug smartaDebug = this.debug;
        if (smartaDebug != null) {
            i10 = smartaDebug.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        boolean z10 = this.error;
        Integer num = this.errorCode;
        SmartaPlacement smartaPlacement = this.placedFurniture;
        SmartaDebug smartaDebug = this.debug;
        return "SmartaPlacementResponse(error=" + z10 + ", errorCode=" + num + ", placedFurniture=" + smartaPlacement + ", debug=" + smartaDebug + ")";
    }
}
