package com.ikea.kompassmap.model.product;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ikea/kompassmap/model/product/AisleAndBin;", "", "aisle", "", "bin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAisle", "()Ljava/lang/String;", "getBin", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AisleAndBin {
    public static final int $stable = 0;
    private final String aisle;
    private final String bin;

    public AisleAndBin(String str, String str2) {
        C17542s.j(str, "aisle");
        C17542s.j(str2, "bin");
        this.aisle = str;
        this.bin = str2;
    }

    public static /* synthetic */ AisleAndBin copy$default(AisleAndBin aisleAndBin, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aisleAndBin.aisle;
        }
        if ((i10 & 2) != 0) {
            str2 = aisleAndBin.bin;
        }
        return aisleAndBin.copy(str, str2);
    }

    public final String component1() {
        return this.aisle;
    }

    public final String component2() {
        return this.bin;
    }

    public final AisleAndBin copy(String str, String str2) {
        C17542s.j(str, "aisle");
        C17542s.j(str2, "bin");
        return new AisleAndBin(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AisleAndBin)) {
            return false;
        }
        AisleAndBin aisleAndBin = (AisleAndBin) obj;
        return C17542s.e(this.aisle, aisleAndBin.aisle) && C17542s.e(this.bin, aisleAndBin.bin);
    }

    public final String getAisle() {
        return this.aisle;
    }

    public final String getBin() {
        return this.bin;
    }

    public int hashCode() {
        return (this.aisle.hashCode() * 31) + this.bin.hashCode();
    }

    public String toString() {
        return "AisleAndBin(aisle=" + this.aisle + ", bin=" + this.bin + ')';
    }
}
