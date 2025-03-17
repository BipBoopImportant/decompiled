package com.google.android.libraries.places.api.net;

final class zzt extends IsOpenResponse {
    private final Boolean zza;

    zzt(Boolean bool) {
        this.zza = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IsOpenResponse)) {
            return false;
        }
        IsOpenResponse isOpenResponse = (IsOpenResponse) obj;
        Boolean bool = this.zza;
        return bool == null ? isOpenResponse.isOpen() == null : bool.equals(isOpenResponse.isOpen());
    }

    public final int hashCode() {
        Boolean bool = this.zza;
        return (bool == null ? 0 : bool.hashCode()) ^ 1000003;
    }

    public final Boolean isOpen() {
        return this.zza;
    }

    public final String toString() {
        Boolean bool = this.zza;
        return "IsOpenResponse{isOpen=" + bool + "}";
    }
}
