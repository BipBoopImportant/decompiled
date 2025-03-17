package com.sugarcube.core.network.models;

import YH.C16877v;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b)\b\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010h\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010i\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010j\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010k\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010l\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010m\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010n\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0011\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0006HÆ\u0003JÔ\u0001\u0010t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010uJ\u0013\u0010v\u001a\u00020Q2\b\u0010w\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010x\u001a\u00020\u0003HÖ\u0001J\t\u0010y\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001e\u0010\n\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$R\u001e\u0010\f\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R\u001e\u0010\r\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b0\u0010\"\"\u0004\b1\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010 \"\u0004\b7\u00108R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b9\u0010\u001c\"\u0004\b:\u0010;R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010 \"\u0004\bA\u00108R.\u0010C\u001a\u0004\u0018\u00010\b2\b\u0010B\u001a\u0004\u0018\u00010\b8F@FX\u000e¢\u0006\u0012\u0012\u0004\bD\u0010E\u001a\u0004\bF\u0010\"\"\u0004\bG\u0010$R.\u0010H\u001a\u0004\u0018\u00010\b2\b\u0010B\u001a\u0004\u0018\u00010\b8F@FX\u000e¢\u0006\u0012\u0012\u0004\bI\u0010E\u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010$R.\u0010L\u001a\u0004\u0018\u00010\b2\b\u0010B\u001a\u0004\u0018\u00010\b8F@FX\u000e¢\u0006\u0012\u0012\u0004\bM\u0010E\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010$R\u0011\u0010P\u001a\u00020Q8F¢\u0006\u0006\u001a\u0004\bP\u0010RR\u0011\u0010S\u001a\u00020Q8F¢\u0006\u0006\u001a\u0004\bS\u0010RR\u0013\u0010T\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\bU\u0010 R\u0019\u0010V\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bW\u0010=R\u0013\u0010X\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bY\u0010\u001cR\u0013\u0010Z\u001a\u0004\u0018\u00010Q8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R:\u0010\\\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00162\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00168F@FX\u000e¢\u0006\u0012\u0012\u0004\b]\u0010E\u001a\u0004\b^\u0010=\"\u0004\b_\u0010?R:\u0010`\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00162\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00168F@FX\u000e¢\u0006\u0012\u0012\u0004\ba\u0010E\u001a\u0004\bb\u0010=\"\u0004\bc\u0010?¨\u0006z"}, d2 = {"Lcom/sugarcube/core/network/models/PlacedFurniture;", "", "id", "", "furnitureId", "uniqueId", "", "x", "", "y", "z", "headingI", "headingJ", "headingK", "heading", "localProduct", "Lcom/sugarcube/core/network/models/LocalProduct;", "gfxAttributes", "Lcom/sugarcube/core/network/models/FurnitureGfxAttributes;", "parentId", "parentAttachment", "parentPath", "", "Lcom/sugarcube/core/network/models/ParentDetails;", "localItemNumber", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/sugarcube/core/network/models/LocalProduct;Lcom/sugarcube/core/network/models/FurnitureGfxAttributes;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFurnitureId", "getUniqueId", "()Ljava/lang/String;", "getX", "()Ljava/lang/Double;", "setX", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getY", "setY", "getZ", "setZ", "getHeadingI", "setHeadingI", "getHeadingJ", "setHeadingJ", "getHeadingK", "setHeadingK", "getHeading", "setHeading", "getLocalProduct", "()Lcom/sugarcube/core/network/models/LocalProduct;", "getGfxAttributes", "()Lcom/sugarcube/core/network/models/FurnitureGfxAttributes;", "getParentId", "setParentId", "(Ljava/lang/String;)V", "getParentAttachment", "setParentAttachment", "(Ljava/lang/Integer;)V", "getParentPath", "()Ljava/util/List;", "setParentPath", "(Ljava/util/List;)V", "getLocalItemNumber", "setLocalItemNumber", "v", "panoPosX", "getPanoPosX$annotations", "()V", "getPanoPosX", "setPanoPosX", "panoPosY", "getPanoPosY$annotations", "getPanoPosY", "setPanoPosY", "headingRadians", "getHeadingRadians$annotations", "getHeadingRadians", "setHeadingRadians", "isLegacy2D", "", "()Z", "is3D", "stackedPlane", "getStackedPlane", "legacyRelativePosition", "getLegacyRelativePosition", "activeCombination", "getActiveCombination", "isMirrored", "()Ljava/lang/Boolean;", "relativePos3D", "getRelativePos3D$annotations", "getRelativePos3D", "setRelativePos3D", "relativeRot3D", "getRelativeRot3D$annotations", "getRelativeRot3D", "setRelativeRot3D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/sugarcube/core/network/models/LocalProduct;Lcom/sugarcube/core/network/models/FurnitureGfxAttributes;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Lcom/sugarcube/core/network/models/PlacedFurniture;", "equals", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class PlacedFurniture {
    private final Integer furnitureId;
    private final FurnitureGfxAttributes gfxAttributes;
    private Double heading;
    private Double headingI;
    private Double headingJ;
    private Double headingK;

    /* renamed from: id  reason: collision with root package name */
    private final Integer f126072id;
    private String localItemNumber;
    private final LocalProduct localProduct;
    private Integer parentAttachment;
    private String parentId;
    private List<ParentDetails> parentPath;
    private final String uniqueId;

    /* renamed from: x  reason: collision with root package name */
    private Double f126073x;

    /* renamed from: y  reason: collision with root package name */
    private Double f126074y;

    /* renamed from: z  reason: collision with root package name */
    private Double f126075z;

    public PlacedFurniture() {
        this((Integer) null, (Integer) null, (String) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (LocalProduct) null, (FurnitureGfxAttributes) null, (String) null, (Integer) null, (List) null, (String) null, 65535, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PlacedFurniture copy$default(PlacedFurniture placedFurniture, Integer num, Integer num2, String str, Double d10, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, LocalProduct localProduct2, FurnitureGfxAttributes furnitureGfxAttributes, String str2, Integer num3, List list, String str3, int i10, Object obj) {
        PlacedFurniture placedFurniture2 = placedFurniture;
        int i11 = i10;
        return placedFurniture.copy((i11 & 1) != 0 ? placedFurniture2.f126072id : num, (i11 & 2) != 0 ? placedFurniture2.furnitureId : num2, (i11 & 4) != 0 ? placedFurniture2.uniqueId : str, (i11 & 8) != 0 ? placedFurniture2.f126073x : d10, (i11 & 16) != 0 ? placedFurniture2.f126074y : d11, (i11 & 32) != 0 ? placedFurniture2.f126075z : d12, (i11 & 64) != 0 ? placedFurniture2.headingI : d13, (i11 & 128) != 0 ? placedFurniture2.headingJ : d14, (i11 & 256) != 0 ? placedFurniture2.headingK : d15, (i11 & 512) != 0 ? placedFurniture2.heading : d16, (i11 & 1024) != 0 ? placedFurniture2.localProduct : localProduct2, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? placedFurniture2.gfxAttributes : furnitureGfxAttributes, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? placedFurniture2.parentId : str2, (i11 & 8192) != 0 ? placedFurniture2.parentAttachment : num3, (i11 & 16384) != 0 ? placedFurniture2.parentPath : list, (i11 & 32768) != 0 ? placedFurniture2.localItemNumber : str3);
    }

    @e(ignore = true)
    public static /* synthetic */ void getHeadingRadians$annotations() {
    }

    @e(ignore = true)
    public static /* synthetic */ void getPanoPosX$annotations() {
    }

    @e(ignore = true)
    public static /* synthetic */ void getPanoPosY$annotations() {
    }

    @e(ignore = true)
    public static /* synthetic */ void getRelativePos3D$annotations() {
    }

    @e(ignore = true)
    public static /* synthetic */ void getRelativeRot3D$annotations() {
    }

    public final Integer component1() {
        return this.f126072id;
    }

    public final Double component10() {
        return this.heading;
    }

    public final LocalProduct component11() {
        return this.localProduct;
    }

    public final FurnitureGfxAttributes component12() {
        return this.gfxAttributes;
    }

    public final String component13() {
        return this.parentId;
    }

    public final Integer component14() {
        return this.parentAttachment;
    }

    public final List<ParentDetails> component15() {
        return this.parentPath;
    }

    public final String component16() {
        return this.localItemNumber;
    }

    public final Integer component2() {
        return this.furnitureId;
    }

    public final String component3() {
        return this.uniqueId;
    }

    public final Double component4() {
        return this.f126073x;
    }

    public final Double component5() {
        return this.f126074y;
    }

    public final Double component6() {
        return this.f126075z;
    }

    public final Double component7() {
        return this.headingI;
    }

    public final Double component8() {
        return this.headingJ;
    }

    public final Double component9() {
        return this.headingK;
    }

    public final PlacedFurniture copy(Integer num, Integer num2, String str, Double d10, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, LocalProduct localProduct2, FurnitureGfxAttributes furnitureGfxAttributes, String str2, Integer num3, List<ParentDetails> list, String str3) {
        return new PlacedFurniture(num, num2, str, d10, d11, d12, d13, d14, d15, d16, localProduct2, furnitureGfxAttributes, str2, num3, list, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacedFurniture)) {
            return false;
        }
        PlacedFurniture placedFurniture = (PlacedFurniture) obj;
        return C17542s.e(this.f126072id, placedFurniture.f126072id) && C17542s.e(this.furnitureId, placedFurniture.furnitureId) && C17542s.e(this.uniqueId, placedFurniture.uniqueId) && C17542s.e(this.f126073x, placedFurniture.f126073x) && C17542s.e(this.f126074y, placedFurniture.f126074y) && C17542s.e(this.f126075z, placedFurniture.f126075z) && C17542s.e(this.headingI, placedFurniture.headingI) && C17542s.e(this.headingJ, placedFurniture.headingJ) && C17542s.e(this.headingK, placedFurniture.headingK) && C17542s.e(this.heading, placedFurniture.heading) && C17542s.e(this.localProduct, placedFurniture.localProduct) && C17542s.e(this.gfxAttributes, placedFurniture.gfxAttributes) && C17542s.e(this.parentId, placedFurniture.parentId) && C17542s.e(this.parentAttachment, placedFurniture.parentAttachment) && C17542s.e(this.parentPath, placedFurniture.parentPath) && C17542s.e(this.localItemNumber, placedFurniture.localItemNumber);
    }

    public final Integer getActiveCombination() {
        FurnitureGfxAttributes furnitureGfxAttributes = this.gfxAttributes;
        if (furnitureGfxAttributes != null) {
            return furnitureGfxAttributes.getAnchorCombinationIndex();
        }
        return null;
    }

    public final Integer getFurnitureId() {
        return this.furnitureId;
    }

    public final FurnitureGfxAttributes getGfxAttributes() {
        return this.gfxAttributes;
    }

    public final Double getHeading() {
        return this.heading;
    }

    public final Double getHeadingI() {
        return this.headingI;
    }

    public final Double getHeadingJ() {
        return this.headingJ;
    }

    public final Double getHeadingK() {
        return this.headingK;
    }

    public final Double getHeadingRadians() {
        return this.heading;
    }

    public final Integer getId() {
        return this.f126072id;
    }

    public final List<Double> getLegacyRelativePosition() {
        PosXYZ legacyRelativePosition;
        FurnitureGfxAttributes furnitureGfxAttributes = this.gfxAttributes;
        if (furnitureGfxAttributes == null || (legacyRelativePosition = furnitureGfxAttributes.getLegacyRelativePosition()) == null) {
            return null;
        }
        return C16877v.q(Double.valueOf(legacyRelativePosition.getX()), Double.valueOf(legacyRelativePosition.getY()), Double.valueOf(legacyRelativePosition.getZ()));
    }

    public final String getLocalItemNumber() {
        return this.localItemNumber;
    }

    public final LocalProduct getLocalProduct() {
        return this.localProduct;
    }

    public final Double getPanoPosX() {
        return this.f126073x;
    }

    public final Double getPanoPosY() {
        return this.f126074y;
    }

    public final Integer getParentAttachment() {
        return this.parentAttachment;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final List<ParentDetails> getParentPath() {
        return this.parentPath;
    }

    public final List<Double> getRelativePos3D() {
        if (!is3D()) {
            return null;
        }
        Double d10 = this.f126073x;
        C17542s.g(d10);
        Double d11 = this.f126074y;
        C17542s.g(d11);
        Double d12 = this.f126075z;
        C17542s.g(d12);
        return C16877v.q(d10, d11, d12);
    }

    public final List<Double> getRelativeRot3D() {
        if (!is3D()) {
            return null;
        }
        Double d10 = this.headingI;
        C17542s.g(d10);
        Double d11 = this.headingJ;
        C17542s.g(d11);
        Double d12 = this.headingK;
        C17542s.g(d12);
        Double d13 = this.heading;
        C17542s.g(d13);
        return C16877v.q(d10, d11, d12, d13);
    }

    public final String getStackedPlane() {
        FurnitureGfxAttributes furnitureGfxAttributes = this.gfxAttributes;
        if (furnitureGfxAttributes != null) {
            return furnitureGfxAttributes.getLegacyStackedPlane();
        }
        return null;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final Double getX() {
        return this.f126073x;
    }

    public final Double getY() {
        return this.f126074y;
    }

    public final Double getZ() {
        return this.f126075z;
    }

    public int hashCode() {
        Integer num = this.f126072id;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.furnitureId;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.uniqueId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d10 = this.f126073x;
        int hashCode4 = (hashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f126074y;
        int hashCode5 = (hashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f126075z;
        int hashCode6 = (hashCode5 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.headingI;
        int hashCode7 = (hashCode6 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.headingJ;
        int hashCode8 = (hashCode7 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.headingK;
        int hashCode9 = (hashCode8 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.heading;
        int hashCode10 = (hashCode9 + (d16 == null ? 0 : d16.hashCode())) * 31;
        LocalProduct localProduct2 = this.localProduct;
        int hashCode11 = (hashCode10 + (localProduct2 == null ? 0 : localProduct2.hashCode())) * 31;
        FurnitureGfxAttributes furnitureGfxAttributes = this.gfxAttributes;
        int hashCode12 = (hashCode11 + (furnitureGfxAttributes == null ? 0 : furnitureGfxAttributes.hashCode())) * 31;
        String str2 = this.parentId;
        int hashCode13 = (hashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.parentAttachment;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<ParentDetails> list = this.parentPath;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.localItemNumber;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode15 + i10;
    }

    public final boolean is3D() {
        return (this.f126073x == null || this.f126074y == null || this.f126075z == null || this.headingI == null || this.headingJ == null || this.headingK == null || this.heading == null) ? false : true;
    }

    public final boolean isLegacy2D() {
        return this.f126073x != null && this.f126074y != null && this.heading != null && this.f126075z == null && this.headingI == null && this.headingJ == null && this.headingK == null;
    }

    public final Boolean isMirrored() {
        FurnitureGfxAttributes furnitureGfxAttributes = this.gfxAttributes;
        if (furnitureGfxAttributes != null) {
            return furnitureGfxAttributes.getMirrorOptionEnabled();
        }
        return null;
    }

    public final void setHeading(Double d10) {
        this.heading = d10;
    }

    public final void setHeadingI(Double d10) {
        this.headingI = d10;
    }

    public final void setHeadingJ(Double d10) {
        this.headingJ = d10;
    }

    public final void setHeadingK(Double d10) {
        this.headingK = d10;
    }

    public final void setHeadingRadians(Double d10) {
        this.heading = d10;
    }

    public final void setLocalItemNumber(String str) {
        this.localItemNumber = str;
    }

    public final void setPanoPosX(Double d10) {
        this.f126073x = d10;
    }

    public final void setPanoPosY(Double d10) {
        this.f126074y = d10;
    }

    public final void setParentAttachment(Integer num) {
        this.parentAttachment = num;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setParentPath(List<ParentDetails> list) {
        this.parentPath = list;
    }

    public final void setRelativePos3D(List<Double> list) {
        if (list != null) {
            list.size();
            this.f126073x = list.get(0);
            this.f126074y = list.get(1);
            this.f126075z = list.get(2);
            return;
        }
        this.f126073x = null;
        this.f126074y = null;
        this.f126075z = null;
    }

    public final void setRelativeRot3D(List<Double> list) {
        if (list != null) {
            list.size();
            this.headingI = list.get(0);
            this.headingJ = list.get(1);
            this.headingK = list.get(2);
            this.heading = list.get(3);
            return;
        }
        this.headingI = null;
        this.headingJ = null;
        this.headingK = null;
        this.heading = null;
    }

    public final void setX(Double d10) {
        this.f126073x = d10;
    }

    public final void setY(Double d10) {
        this.f126074y = d10;
    }

    public final void setZ(Double d10) {
        this.f126075z = d10;
    }

    public String toString() {
        Integer num = this.f126072id;
        Integer num2 = this.furnitureId;
        String str = this.uniqueId;
        Double d10 = this.f126073x;
        Double d11 = this.f126074y;
        Double d12 = this.f126075z;
        Double d13 = this.headingI;
        Double d14 = this.headingJ;
        Double d15 = this.headingK;
        Double d16 = this.heading;
        LocalProduct localProduct2 = this.localProduct;
        FurnitureGfxAttributes furnitureGfxAttributes = this.gfxAttributes;
        String str2 = this.parentId;
        Integer num3 = this.parentAttachment;
        List<ParentDetails> list = this.parentPath;
        String str3 = this.localItemNumber;
        return "PlacedFurniture(id=" + num + ", furnitureId=" + num2 + ", uniqueId=" + str + ", x=" + d10 + ", y=" + d11 + ", z=" + d12 + ", headingI=" + d13 + ", headingJ=" + d14 + ", headingK=" + d15 + ", heading=" + d16 + ", localProduct=" + localProduct2 + ", gfxAttributes=" + furnitureGfxAttributes + ", parentId=" + str2 + ", parentAttachment=" + num3 + ", parentPath=" + list + ", localItemNumber=" + str3 + ")";
    }

    public PlacedFurniture(Integer num, Integer num2, String str, Double d10, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, LocalProduct localProduct2, FurnitureGfxAttributes furnitureGfxAttributes, String str2, Integer num3, List<ParentDetails> list, String str3) {
        this.f126072id = num;
        this.furnitureId = num2;
        this.uniqueId = str;
        this.f126073x = d10;
        this.f126074y = d11;
        this.f126075z = d12;
        this.headingI = d13;
        this.headingJ = d14;
        this.headingK = d15;
        this.heading = d16;
        this.localProduct = localProduct2;
        this.gfxAttributes = furnitureGfxAttributes;
        this.parentId = str2;
        this.parentAttachment = num3;
        this.parentPath = list;
        this.localItemNumber = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PlacedFurniture(java.lang.Integer r18, java.lang.Integer r19, java.lang.String r20, java.lang.Double r21, java.lang.Double r22, java.lang.Double r23, java.lang.Double r24, java.lang.Double r25, java.lang.Double r26, java.lang.Double r27, com.sugarcube.core.network.models.LocalProduct r28, com.sugarcube.core.network.models.FurnitureGfxAttributes r29, java.lang.String r30, java.lang.Integer r31, java.util.List r32, java.lang.String r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r17 = this;
            r0 = r34
            r1 = r0 & 1
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            if (r1 == 0) goto L_0x000d
            r1 = r2
            goto L_0x000f
        L_0x000d:
            r1 = r18
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r2 = r19
        L_0x0016:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x001c
            r3 = 0
            goto L_0x001e
        L_0x001c:
            r3 = r20
        L_0x001e:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L_0x0029
            java.lang.Double r5 = java.lang.Double.valueOf(r6)
            goto L_0x002b
        L_0x0029:
            r5 = r21
        L_0x002b:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0034
            java.lang.Double r8 = java.lang.Double.valueOf(r6)
            goto L_0x0036
        L_0x0034:
            r8 = r22
        L_0x0036:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003c
            r9 = 0
            goto L_0x003e
        L_0x003c:
            r9 = r23
        L_0x003e:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0044
            r10 = 0
            goto L_0x0046
        L_0x0044:
            r10 = r24
        L_0x0046:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004c
            r11 = 0
            goto L_0x004e
        L_0x004c:
            r11 = r25
        L_0x004e:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0054
            r12 = 0
            goto L_0x0056
        L_0x0054:
            r12 = r26
        L_0x0056:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x005f
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            goto L_0x0061
        L_0x005f:
            r6 = r27
        L_0x0061:
            r7 = r0 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x0067
            r7 = 0
            goto L_0x0069
        L_0x0067:
            r7 = r28
        L_0x0069:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x006f
            r13 = 0
            goto L_0x0071
        L_0x006f:
            r13 = r29
        L_0x0071:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0077
            r14 = 0
            goto L_0x0079
        L_0x0077:
            r14 = r30
        L_0x0079:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x007f
            r15 = 0
            goto L_0x0081
        L_0x007f:
            r15 = r31
        L_0x0081:
            r4 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0087
            r4 = 0
            goto L_0x0089
        L_0x0087:
            r4 = r32
        L_0x0089:
            r16 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r16
            if (r0 == 0) goto L_0x0092
            r0 = 0
            goto L_0x0094
        L_0x0092:
            r0 = r33
        L_0x0094:
            r18 = r17
            r19 = r1
            r20 = r2
            r21 = r3
            r22 = r5
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r6
            r29 = r7
            r30 = r13
            r31 = r14
            r32 = r15
            r33 = r4
            r34 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.PlacedFurniture.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, com.sugarcube.core.network.models.LocalProduct, com.sugarcube.core.network.models.FurnitureGfxAttributes, java.lang.String, java.lang.Integer, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
