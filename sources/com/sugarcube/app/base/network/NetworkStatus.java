package com.sugarcube.app.base.network;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/sugarcube/app/base/network/NetworkStatus;", "", "outage", "", "status", "", "needsUpdate", "<init>", "(ZLjava/lang/String;Z)V", "getOutage", "()Z", "getStatus", "()Ljava/lang/String;", "getNeedsUpdate", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkStatus {
    public static final int $stable = 0;
    private final boolean needsUpdate;
    private final boolean outage;
    private final String status;

    public NetworkStatus() {
        this(false, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ NetworkStatus copy$default(NetworkStatus networkStatus, boolean z10, String str, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = networkStatus.outage;
        }
        if ((i10 & 2) != 0) {
            str = networkStatus.status;
        }
        if ((i10 & 4) != 0) {
            z11 = networkStatus.needsUpdate;
        }
        return networkStatus.copy(z10, str, z11);
    }

    public final boolean component1() {
        return this.outage;
    }

    public final String component2() {
        return this.status;
    }

    public final boolean component3() {
        return this.needsUpdate;
    }

    public final NetworkStatus copy(boolean z10, String str, boolean z11) {
        C17542s.j(str, "status");
        return new NetworkStatus(z10, str, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkStatus)) {
            return false;
        }
        NetworkStatus networkStatus = (NetworkStatus) obj;
        return this.outage == networkStatus.outage && C17542s.e(this.status, networkStatus.status) && this.needsUpdate == networkStatus.needsUpdate;
    }

    public final boolean getNeedsUpdate() {
        return this.needsUpdate;
    }

    public final boolean getOutage() {
        return this.outage;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.outage) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.needsUpdate);
    }

    public String toString() {
        boolean z10 = this.outage;
        String str = this.status;
        boolean z11 = this.needsUpdate;
        return "NetworkStatus(outage=" + z10 + ", status=" + str + ", needsUpdate=" + z11 + ")";
    }

    public NetworkStatus(boolean z10, String str, boolean z11) {
        C17542s.j(str, "status");
        this.outage = z10;
        this.status = str;
        this.needsUpdate = z11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkStatus(boolean z10, String str, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? false : z11);
    }
}
