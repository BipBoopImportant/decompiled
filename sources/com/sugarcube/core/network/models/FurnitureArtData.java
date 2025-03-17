package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/sugarcube/core/network/models/FurnitureArtData;", "", "sizeId", "", "colorId", "frameId", "matteId", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSizeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getColorId", "getFrameId", "getMatteId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sugarcube/core/network/models/FurnitureArtData;", "equals", "", "other", "hashCode", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class FurnitureArtData {
    private final Integer colorId;
    private final Integer frameId;
    private final Integer matteId;
    private final Integer sizeId;

    public FurnitureArtData() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FurnitureArtData copy$default(FurnitureArtData furnitureArtData, Integer num, Integer num2, Integer num3, Integer num4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = furnitureArtData.sizeId;
        }
        if ((i10 & 2) != 0) {
            num2 = furnitureArtData.colorId;
        }
        if ((i10 & 4) != 0) {
            num3 = furnitureArtData.frameId;
        }
        if ((i10 & 8) != 0) {
            num4 = furnitureArtData.matteId;
        }
        return furnitureArtData.copy(num, num2, num3, num4);
    }

    public final Integer component1() {
        return this.sizeId;
    }

    public final Integer component2() {
        return this.colorId;
    }

    public final Integer component3() {
        return this.frameId;
    }

    public final Integer component4() {
        return this.matteId;
    }

    public final FurnitureArtData copy(Integer num, Integer num2, Integer num3, Integer num4) {
        return new FurnitureArtData(num, num2, num3, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FurnitureArtData)) {
            return false;
        }
        FurnitureArtData furnitureArtData = (FurnitureArtData) obj;
        return C17542s.e(this.sizeId, furnitureArtData.sizeId) && C17542s.e(this.colorId, furnitureArtData.colorId) && C17542s.e(this.frameId, furnitureArtData.frameId) && C17542s.e(this.matteId, furnitureArtData.matteId);
    }

    public final Integer getColorId() {
        return this.colorId;
    }

    public final Integer getFrameId() {
        return this.frameId;
    }

    public final Integer getMatteId() {
        return this.matteId;
    }

    public final Integer getSizeId() {
        return this.sizeId;
    }

    public int hashCode() {
        Integer num = this.sizeId;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.colorId;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.frameId;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.matteId;
        if (num4 != null) {
            i10 = num4.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        Integer num = this.sizeId;
        Integer num2 = this.colorId;
        Integer num3 = this.frameId;
        Integer num4 = this.matteId;
        return "FurnitureArtData(sizeId=" + num + ", colorId=" + num2 + ", frameId=" + num3 + ", matteId=" + num4 + ")";
    }

    public FurnitureArtData(Integer num, Integer num2, Integer num3, Integer num4) {
        this.sizeId = num;
        this.colorId = num2;
        this.frameId = num3;
        this.matteId = num4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FurnitureArtData(Integer num, Integer num2, Integer num3, Integer num4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3, (i10 & 8) != 0 ? null : num4);
    }
}
