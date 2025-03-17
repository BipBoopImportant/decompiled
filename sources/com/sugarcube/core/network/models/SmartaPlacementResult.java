package com.sugarcube.core.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JF\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/sugarcube/core/network/models/SmartaPlacementResult;", "", "smartaPlacement", "Lcom/sugarcube/core/network/models/SmartaPlacement;", "result", "", "error", "", "errorMessage", "latency", "", "<init>", "(Lcom/sugarcube/core/network/models/SmartaPlacement;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;)V", "getSmartaPlacement", "()Lcom/sugarcube/core/network/models/SmartaPlacement;", "getResult", "()Ljava/lang/String;", "getError", "()Z", "getErrorMessage", "getLatency", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/sugarcube/core/network/models/SmartaPlacement;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;)Lcom/sugarcube/core/network/models/SmartaPlacementResult;", "equals", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SmartaPlacementResult {
    private final boolean error;
    private final String errorMessage;
    private final Long latency;
    private final String result;
    private final SmartaPlacement smartaPlacement;

    public SmartaPlacementResult(SmartaPlacement smartaPlacement2, String str, boolean z10, String str2, Long l10) {
        C17542s.j(str, "result");
        this.smartaPlacement = smartaPlacement2;
        this.result = str;
        this.error = z10;
        this.errorMessage = str2;
        this.latency = l10;
    }

    public static /* synthetic */ SmartaPlacementResult copy$default(SmartaPlacementResult smartaPlacementResult, SmartaPlacement smartaPlacement2, String str, boolean z10, String str2, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            smartaPlacement2 = smartaPlacementResult.smartaPlacement;
        }
        if ((i10 & 2) != 0) {
            str = smartaPlacementResult.result;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            z10 = smartaPlacementResult.error;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            str2 = smartaPlacementResult.errorMessage;
        }
        String str4 = str2;
        if ((i10 & 16) != 0) {
            l10 = smartaPlacementResult.latency;
        }
        return smartaPlacementResult.copy(smartaPlacement2, str3, z11, str4, l10);
    }

    public final SmartaPlacement component1() {
        return this.smartaPlacement;
    }

    public final String component2() {
        return this.result;
    }

    public final boolean component3() {
        return this.error;
    }

    public final String component4() {
        return this.errorMessage;
    }

    public final Long component5() {
        return this.latency;
    }

    public final SmartaPlacementResult copy(SmartaPlacement smartaPlacement2, String str, boolean z10, String str2, Long l10) {
        C17542s.j(str, "result");
        return new SmartaPlacementResult(smartaPlacement2, str, z10, str2, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartaPlacementResult)) {
            return false;
        }
        SmartaPlacementResult smartaPlacementResult = (SmartaPlacementResult) obj;
        return C17542s.e(this.smartaPlacement, smartaPlacementResult.smartaPlacement) && C17542s.e(this.result, smartaPlacementResult.result) && this.error == smartaPlacementResult.error && C17542s.e(this.errorMessage, smartaPlacementResult.errorMessage) && C17542s.e(this.latency, smartaPlacementResult.latency);
    }

    public final boolean getError() {
        return this.error;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Long getLatency() {
        return this.latency;
    }

    public final String getResult() {
        return this.result;
    }

    public final SmartaPlacement getSmartaPlacement() {
        return this.smartaPlacement;
    }

    public int hashCode() {
        SmartaPlacement smartaPlacement2 = this.smartaPlacement;
        int i10 = 0;
        int hashCode = (((((smartaPlacement2 == null ? 0 : smartaPlacement2.hashCode()) * 31) + this.result.hashCode()) * 31) + Boolean.hashCode(this.error)) * 31;
        String str = this.errorMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.latency;
        if (l10 != null) {
            i10 = l10.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        SmartaPlacement smartaPlacement2 = this.smartaPlacement;
        String str = this.result;
        boolean z10 = this.error;
        String str2 = this.errorMessage;
        Long l10 = this.latency;
        return "SmartaPlacementResult(smartaPlacement=" + smartaPlacement2 + ", result=" + str + ", error=" + z10 + ", errorMessage=" + str2 + ", latency=" + l10 + ")";
    }
}
