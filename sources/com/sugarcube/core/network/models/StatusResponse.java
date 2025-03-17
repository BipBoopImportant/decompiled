package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013¨\u0006("}, d2 = {"Lcom/sugarcube/core/network/models/StatusResponse;", "", "outage", "", "status", "", "minimumVersionSugarcubeIos", "minimumVersionSugarcubeAndroid", "minimumVersionShoppableIos", "minimumVersionShoppableAndroid", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOutage", "()Z", "setOutage", "(Z)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "getMinimumVersionSugarcubeIos", "setMinimumVersionSugarcubeIos", "getMinimumVersionSugarcubeAndroid", "setMinimumVersionSugarcubeAndroid", "getMinimumVersionShoppableIos", "setMinimumVersionShoppableIos", "getMinimumVersionShoppableAndroid", "setMinimumVersionShoppableAndroid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class StatusResponse {
    private String minimumVersionShoppableAndroid;
    private String minimumVersionShoppableIos;
    private String minimumVersionSugarcubeAndroid;
    private String minimumVersionSugarcubeIos;
    private boolean outage;
    private String status;

    public StatusResponse(boolean z10, String str, String str2, String str3, String str4, String str5) {
        C17542s.j(str, "status");
        C17542s.j(str2, "minimumVersionSugarcubeIos");
        C17542s.j(str3, "minimumVersionSugarcubeAndroid");
        C17542s.j(str4, "minimumVersionShoppableIos");
        C17542s.j(str5, "minimumVersionShoppableAndroid");
        this.outage = z10;
        this.status = str;
        this.minimumVersionSugarcubeIos = str2;
        this.minimumVersionSugarcubeAndroid = str3;
        this.minimumVersionShoppableIos = str4;
        this.minimumVersionShoppableAndroid = str5;
    }

    public static /* synthetic */ StatusResponse copy$default(StatusResponse statusResponse, boolean z10, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = statusResponse.outage;
        }
        if ((i10 & 2) != 0) {
            str = statusResponse.status;
        }
        String str6 = str;
        if ((i10 & 4) != 0) {
            str2 = statusResponse.minimumVersionSugarcubeIos;
        }
        String str7 = str2;
        if ((i10 & 8) != 0) {
            str3 = statusResponse.minimumVersionSugarcubeAndroid;
        }
        String str8 = str3;
        if ((i10 & 16) != 0) {
            str4 = statusResponse.minimumVersionShoppableIos;
        }
        String str9 = str4;
        if ((i10 & 32) != 0) {
            str5 = statusResponse.minimumVersionShoppableAndroid;
        }
        return statusResponse.copy(z10, str6, str7, str8, str9, str5);
    }

    public final boolean component1() {
        return this.outage;
    }

    public final String component2() {
        return this.status;
    }

    public final String component3() {
        return this.minimumVersionSugarcubeIos;
    }

    public final String component4() {
        return this.minimumVersionSugarcubeAndroid;
    }

    public final String component5() {
        return this.minimumVersionShoppableIos;
    }

    public final String component6() {
        return this.minimumVersionShoppableAndroid;
    }

    public final StatusResponse copy(boolean z10, String str, String str2, String str3, String str4, String str5) {
        C17542s.j(str, "status");
        C17542s.j(str2, "minimumVersionSugarcubeIos");
        C17542s.j(str3, "minimumVersionSugarcubeAndroid");
        C17542s.j(str4, "minimumVersionShoppableIos");
        C17542s.j(str5, "minimumVersionShoppableAndroid");
        return new StatusResponse(z10, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusResponse)) {
            return false;
        }
        StatusResponse statusResponse = (StatusResponse) obj;
        return this.outage == statusResponse.outage && C17542s.e(this.status, statusResponse.status) && C17542s.e(this.minimumVersionSugarcubeIos, statusResponse.minimumVersionSugarcubeIos) && C17542s.e(this.minimumVersionSugarcubeAndroid, statusResponse.minimumVersionSugarcubeAndroid) && C17542s.e(this.minimumVersionShoppableIos, statusResponse.minimumVersionShoppableIos) && C17542s.e(this.minimumVersionShoppableAndroid, statusResponse.minimumVersionShoppableAndroid);
    }

    public final String getMinimumVersionShoppableAndroid() {
        return this.minimumVersionShoppableAndroid;
    }

    public final String getMinimumVersionShoppableIos() {
        return this.minimumVersionShoppableIos;
    }

    public final String getMinimumVersionSugarcubeAndroid() {
        return this.minimumVersionSugarcubeAndroid;
    }

    public final String getMinimumVersionSugarcubeIos() {
        return this.minimumVersionSugarcubeIos;
    }

    public final boolean getOutage() {
        return this.outage;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.outage) * 31) + this.status.hashCode()) * 31) + this.minimumVersionSugarcubeIos.hashCode()) * 31) + this.minimumVersionSugarcubeAndroid.hashCode()) * 31) + this.minimumVersionShoppableIos.hashCode()) * 31) + this.minimumVersionShoppableAndroid.hashCode();
    }

    public final void setMinimumVersionShoppableAndroid(String str) {
        C17542s.j(str, "<set-?>");
        this.minimumVersionShoppableAndroid = str;
    }

    public final void setMinimumVersionShoppableIos(String str) {
        C17542s.j(str, "<set-?>");
        this.minimumVersionShoppableIos = str;
    }

    public final void setMinimumVersionSugarcubeAndroid(String str) {
        C17542s.j(str, "<set-?>");
        this.minimumVersionSugarcubeAndroid = str;
    }

    public final void setMinimumVersionSugarcubeIos(String str) {
        C17542s.j(str, "<set-?>");
        this.minimumVersionSugarcubeIos = str;
    }

    public final void setOutage(boolean z10) {
        this.outage = z10;
    }

    public final void setStatus(String str) {
        C17542s.j(str, "<set-?>");
        this.status = str;
    }

    public String toString() {
        boolean z10 = this.outage;
        String str = this.status;
        String str2 = this.minimumVersionSugarcubeIos;
        String str3 = this.minimumVersionSugarcubeAndroid;
        String str4 = this.minimumVersionShoppableIos;
        String str5 = this.minimumVersionShoppableAndroid;
        return "StatusResponse(outage=" + z10 + ", status=" + str + ", minimumVersionSugarcubeIos=" + str2 + ", minimumVersionSugarcubeAndroid=" + str3 + ", minimumVersionShoppableIos=" + str4 + ", minimumVersionShoppableAndroid=" + str5 + ")";
    }
}
