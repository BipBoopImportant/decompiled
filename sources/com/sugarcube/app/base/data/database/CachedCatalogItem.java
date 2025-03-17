package com.sugarcube.app.base.data.database;

import HJ.C15854t;
import NF.C13291e;
import YH.C16877v;
import android.net.Uri;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.analytics.TrackingKey;
import com.sugarcube.core.network.api.NetworkAPIs;
import com.sugarcube.core.network.models.CatalogCombinableMetadata;
import com.sugarcube.core.network.models.CatalogCombinableNodeMeta;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.core.network.models.CatalogItemMetadata;
import com.sugarcube.core.network.models.CatalogPlaceableMetadata;
import com.sugarcube.core.network.models.FurnitureType;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\nj\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010`\u001a\u00020aJ$\u0010b\u001a\u001e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u000b0cj\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u000b`eH\u0016J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0006HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\bHÆ\u0003J\u001f\u0010j\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\nj\u0004\u0018\u0001`\fHÆ\u0003J\t\u0010k\u001a\u00020\u000eHÆ\u0003J]\u0010l\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\nj\u0004\u0018\u0001`\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010m\u001a\u00020\u00062\b\u0010n\u001a\u0004\u0018\u00010oHÖ\u0003J\t\u0010p\u001a\u00020\u001dHÖ\u0001J\t\u0010q\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R'\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\nj\u0004\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0019\u0010#\u001a\n %*\u0004\u0018\u00010$0$8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010\"R\u0011\u0010*\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b*\u0010\u0015R\u0011\u0010+\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0011\u0010,\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010\u0015R\u0011\u0010-\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b-\u0010\u0015R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b2\u0010\u0015R\u0011\u00103\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b3\u0010\u0015R\u0011\u00104\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b4\u0010\u0015R\u0011\u00105\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b5\u0010\u0015R\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002070/8F¢\u0006\u0006\u001a\u0004\b8\u00101R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020:0/8F¢\u0006\u0006\u001a\u0004\b;\u00101R\u0013\u0010<\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0015\u0010@\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u0015\u0010D\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010C\u001a\u0004\bD\u0010BR\u0011\u0010E\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bF\u0010\u0015R\u0011\u0010G\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bH\u0010\u0015R\u0011\u0010I\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bI\u0010\u0015R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020K0/8F¢\u0006\u0006\u001a\u0004\bL\u00101R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020K0/8F¢\u0006\u0006\u001a\u0004\bN\u00101R\u0019\u0010O\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\bQ\u00101R\u0011\u0010R\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bR\u0010\u0015R\u0011\u0010S\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bS\u0010\u0015R\u0011\u0010T\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bT\u0010\u0015R\u0011\u0010U\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bU\u0010\u0015R\u0011\u0010V\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bW\u0010\u0015R\u0011\u0010X\u001a\u00020Y¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0013\u0010\\\u001a\u0004\u0018\u00010]8F¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006r"}, d2 = {"Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "Lcom/sugarcube/core/analytics/Trackable;", "modelFile", "Ljava/io/File;", "thumbnailFile", "usingDraco", "", "swappables", "Lcom/sugarcube/app/base/data/database/CachedCatalogPage;", "combinableMap", "", "", "Lcom/sugarcube/app/base/data/database/CachedCombinableMap;", "catalogItem", "Lcom/sugarcube/core/network/models/CatalogItem;", "<init>", "(Ljava/io/File;Ljava/io/File;ZLcom/sugarcube/app/base/data/database/CachedCatalogPage;Ljava/util/Map;Lcom/sugarcube/core/network/models/CatalogItem;)V", "getModelFile", "()Ljava/io/File;", "getThumbnailFile", "getUsingDraco", "()Z", "getSwappables", "()Lcom/sugarcube/app/base/data/database/CachedCatalogPage;", "getCombinableMap", "()Ljava/util/Map;", "getCatalogItem", "()Lcom/sugarcube/core/network/models/CatalogItem;", "id", "", "getId", "()I", "name", "getName", "()Ljava/lang/String;", "ecommerceUrl", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "getEcommerceUrl", "()Landroid/net/Uri;", "price", "getPrice", "isValid", "isModelCached", "isStackableChild", "isStackableParent", "geometryTypes", "", "getGeometryTypes", "()Ljava/util/List;", "isWallPlaceable2D", "isWallPlaceable3D", "isWallPlaceableAny", "isFloorPlaceable", "stackingPolygons", "Lcom/sugarcube/core/network/models/Polygon;", "getStackingPolygons", "alternateStackingPolygons", "Lcom/sugarcube/core/network/models/StackableAlternate;", "getAlternateStackingPolygons", "placeables", "Lcom/sugarcube/core/network/models/CatalogPlaceableMetadata;", "getPlaceables", "()Lcom/sugarcube/core/network/models/CatalogPlaceableMetadata;", "hasGoesWell", "getHasGoesWell", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isSupportedAutodecorate", "hasPlaceables", "getHasPlaceables", "canSnapRotate", "getCanSnapRotate", "isMirroringCapable", "boxMin", "", "getBoxMin", "boxMax", "getBoxMax", "combinableNodesMeta", "Lcom/sugarcube/core/network/models/CatalogCombinableNodeMeta;", "getCombinableNodesMeta", "isCombinable", "isCombinableParent", "isCombinableRoot", "isCombinableChild", "hasCombinableSockets", "getHasCombinableSockets", "furnitureType", "Lcom/sugarcube/core/network/models/FurnitureType;", "getFurnitureType", "()Lcom/sugarcube/core/network/models/FurnitureType;", "sdbKey", "Lcom/sugarcube/app/base/data/database/SalesDressedBedDataKey;", "getSdbKey", "()Lcom/sugarcube/app/base/data/database/SalesDressedBedDataKey;", "getProductType", "Lcom/sugarcube/app/base/data/analytics/ProductType;", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CachedCatalogItem implements Trackable {
    public static final int $stable = 0;
    private final CatalogItem catalogItem;
    private final Map<String, CachedCatalogItem> combinableMap;
    private final FurnitureType furnitureType;
    private final Boolean hasGoesWell;
    private final Boolean isSupportedAutodecorate;
    private final File modelFile;
    private final CachedCatalogPage swappables;
    private final File thumbnailFile;
    private final boolean usingDraco;

    public CachedCatalogItem() {
        this((File) null, (File) null, false, (CachedCatalogPage) null, (Map) null, (CatalogItem) null, 63, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final SalesDressedBedDataKey _get_sdbKey_$lambda$2(String str, String str2) {
        C17542s.j(str, "size");
        C17542s.j(str2, "variant");
        return new SalesDressedBedDataKey(str, str2);
    }

    public static /* synthetic */ CachedCatalogItem copy$default(CachedCatalogItem cachedCatalogItem, File file, File file2, boolean z10, CachedCatalogPage cachedCatalogPage, Map<String, CachedCatalogItem> map, CatalogItem catalogItem2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            file = cachedCatalogItem.modelFile;
        }
        if ((i10 & 2) != 0) {
            file2 = cachedCatalogItem.thumbnailFile;
        }
        File file3 = file2;
        if ((i10 & 4) != 0) {
            z10 = cachedCatalogItem.usingDraco;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            cachedCatalogPage = cachedCatalogItem.swappables;
        }
        CachedCatalogPage cachedCatalogPage2 = cachedCatalogPage;
        if ((i10 & 16) != 0) {
            map = cachedCatalogItem.combinableMap;
        }
        Map<String, CachedCatalogItem> map2 = map;
        if ((i10 & 32) != 0) {
            catalogItem2 = cachedCatalogItem.catalogItem;
        }
        return cachedCatalogItem.copy(file, file3, z11, cachedCatalogPage2, map2, catalogItem2);
    }

    public final File component1() {
        return this.modelFile;
    }

    public final File component2() {
        return this.thumbnailFile;
    }

    public final boolean component3() {
        return this.usingDraco;
    }

    public final CachedCatalogPage component4() {
        return this.swappables;
    }

    public final Map<String, CachedCatalogItem> component5() {
        return this.combinableMap;
    }

    public final CatalogItem component6() {
        return this.catalogItem;
    }

    public final CachedCatalogItem copy(File file, File file2, boolean z10, CachedCatalogPage cachedCatalogPage, Map<String, CachedCatalogItem> map, CatalogItem catalogItem2) {
        C17542s.j(file, "modelFile");
        C17542s.j(file2, "thumbnailFile");
        C17542s.j(catalogItem2, "catalogItem");
        return new CachedCatalogItem(file, file2, z10, cachedCatalogPage, map, catalogItem2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedCatalogItem)) {
            return false;
        }
        CachedCatalogItem cachedCatalogItem = (CachedCatalogItem) obj;
        return C17542s.e(this.modelFile, cachedCatalogItem.modelFile) && C17542s.e(this.thumbnailFile, cachedCatalogItem.thumbnailFile) && this.usingDraco == cachedCatalogItem.usingDraco && C17542s.e(this.swappables, cachedCatalogItem.swappables) && C17542s.e(this.combinableMap, cachedCatalogItem.combinableMap) && C17542s.e(this.catalogItem, cachedCatalogItem.catalogItem);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getAlternates();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.sugarcube.core.network.models.StackableAlternate> getAlternateStackingPolygons() {
        /*
            r1 = this;
            com.sugarcube.core.network.models.CatalogItem r0 = r1.catalogItem
            com.sugarcube.core.network.models.Stackables r0 = r0.getStackables()
            if (r0 == 0) goto L_0x000e
            java.util.List r0 = r0.getAlternates()
            if (r0 != 0) goto L_0x0012
        L_0x000e:
            java.util.List r0 = YH.C16877v.n()
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.database.CachedCatalogItem.getAlternateStackingPolygons():java.util.List");
    }

    public final List<Double> getBoxMax() {
        double d10;
        double d11;
        double d12 = 0.0d;
        if (isWallPlaceable2D()) {
            Double displayWidthCm = this.catalogItem.getDisplayWidthCm();
            d11 = ((displayWidthCm != null ? displayWidthCm.doubleValue() : 0.0d) / 100.0d) / 2.0d;
            Double displayHeightCm = this.catalogItem.getDisplayHeightCm();
            d10 = ((displayHeightCm != null ? displayHeightCm.doubleValue() : 0.0d) / 100.0d) / 2.0d;
        } else {
            Double maxX = this.catalogItem.getMaxX();
            d11 = maxX != null ? maxX.doubleValue() : 0.0d;
            Double maxY = this.catalogItem.getMaxY();
            d10 = maxY != null ? maxY.doubleValue() : 0.0d;
            Double maxZ = this.catalogItem.getMaxZ();
            if (maxZ != null) {
                d12 = maxZ.doubleValue();
            }
        }
        return C16877v.q(Double.valueOf(d11), Double.valueOf(d10), Double.valueOf(d12));
    }

    public final List<Double> getBoxMin() {
        double d10;
        double d11;
        double d12 = 0.0d;
        if (isWallPlaceable2D()) {
            Double displayWidthCm = this.catalogItem.getDisplayWidthCm();
            d11 = (-((displayWidthCm != null ? displayWidthCm.doubleValue() : 0.0d) / 100.0d)) / 2.0d;
            Double displayHeightCm = this.catalogItem.getDisplayHeightCm();
            d10 = (-((displayHeightCm != null ? displayHeightCm.doubleValue() : 0.0d) / 100.0d)) / 2.0d;
        } else {
            Double minX = this.catalogItem.getMinX();
            d11 = minX != null ? minX.doubleValue() : 0.0d;
            Double minY = this.catalogItem.getMinY();
            d10 = minY != null ? minY.doubleValue() : 0.0d;
            Double minZ = this.catalogItem.getMinZ();
            if (minZ != null) {
                d12 = minZ.doubleValue();
            }
        }
        return C16877v.q(Double.valueOf(d11), Double.valueOf(d10), Double.valueOf(d12));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r0 = (r0 = (com.sugarcube.core.network.models.StackableAlternate) YH.C16877v.y0((r0 = r0.getAlternates()))).getPolygons();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean getCanSnapRotate() {
        /*
            r3 = this;
            com.sugarcube.core.network.models.CatalogItem r0 = r3.catalogItem
            com.sugarcube.core.network.models.Stackables r0 = r0.getStackables()
            r1 = 0
            if (r0 == 0) goto L_0x0028
            java.util.List r0 = r0.getAlternates()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = YH.C16877v.y0(r0)
            com.sugarcube.core.network.models.StackableAlternate r0 = (com.sugarcube.core.network.models.StackableAlternate) r0
            if (r0 == 0) goto L_0x0028
            java.util.List r0 = r0.getPolygons()
            if (r0 == 0) goto L_0x0028
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 != r2) goto L_0x0028
            r1 = r2
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.database.CachedCatalogItem.getCanSnapRotate():boolean");
    }

    public final CatalogItem getCatalogItem() {
        return this.catalogItem;
    }

    public final Map<String, CachedCatalogItem> getCombinableMap() {
        return this.combinableMap;
    }

    public final List<CatalogCombinableNodeMeta> getCombinableNodesMeta() {
        CatalogCombinableMetadata combinables;
        CatalogItemMetadata metadata = this.catalogItem.getMetadata();
        if (metadata == null || (combinables = metadata.getCombinables()) == null) {
            return null;
        }
        return combinables.getNodesMeta();
    }

    public final Uri getEcommerceUrl() {
        Uri ecommerceUrl = this.catalogItem.getEcommerceUrl();
        return ecommerceUrl == null ? Uri.EMPTY : ecommerceUrl;
    }

    public final FurnitureType getFurnitureType() {
        return this.furnitureType;
    }

    public final List<String> getGeometryTypes() {
        List<String> geometryTypes = this.catalogItem.getGeometryTypes();
        if (geometryTypes != null && !geometryTypes.isEmpty()) {
            return geometryTypes;
        }
        String geometryType = this.catalogItem.getGeometryType();
        return (geometryType == null || geometryType.length() <= 0) ? C16877v.e(NetworkAPIs.GeometryType.Furniture.getQueryParamVal()) : C16877v.e(geometryType);
    }

    public final boolean getHasCombinableSockets() {
        return false;
    }

    public final Boolean getHasGoesWell() {
        return this.hasGoesWell;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r0 = (com.sugarcube.core.network.models.PlaceableAnchor) YH.C16877v.y0((r0 = r0.getAnchors()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        if (r2 != null) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean getHasPlaceables() {
        /*
            r3 = this;
            com.sugarcube.core.network.models.CatalogPlaceableMetadata r0 = r3.getPlaceables()
            if (r0 == 0) goto L_0x007f
            java.util.List r0 = r0.getAnchors()
            if (r0 == 0) goto L_0x007f
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != r1) goto L_0x007f
            com.sugarcube.core.network.models.CatalogPlaceableMetadata r0 = r3.getPlaceables()
            r2 = 0
            if (r0 == 0) goto L_0x0030
            java.util.List r0 = r0.getAnchors()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = YH.C16877v.y0(r0)
            com.sugarcube.core.network.models.PlaceableAnchor r0 = (com.sugarcube.core.network.models.PlaceableAnchor) r0
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r0.getCategory()
            goto L_0x0031
        L_0x0030:
            r0 = r2
        L_0x0031:
            if (r0 == 0) goto L_0x007f
            com.sugarcube.core.network.models.CatalogPlaceableMetadata r0 = r3.getPlaceables()
            if (r0 == 0) goto L_0x004c
            java.util.List r0 = r0.getAnchors()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = YH.C16877v.y0(r0)
            com.sugarcube.core.network.models.PlaceableAnchor r0 = (com.sugarcube.core.network.models.PlaceableAnchor) r0
            if (r0 == 0) goto L_0x004c
            java.util.List r0 = r0.getMatrixModel()
            goto L_0x004d
        L_0x004c:
            r0 = r2
        L_0x004d:
            if (r0 != 0) goto L_0x0069
            com.sugarcube.core.network.models.CatalogPlaceableMetadata r0 = r3.getPlaceables()
            if (r0 == 0) goto L_0x0067
            java.util.List r0 = r0.getAnchors()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = YH.C16877v.y0(r0)
            com.sugarcube.core.network.models.PlaceableAnchor r0 = (com.sugarcube.core.network.models.PlaceableAnchor) r0
            if (r0 == 0) goto L_0x0067
            java.lang.String r2 = r0.getConstraint()
        L_0x0067:
            if (r2 == 0) goto L_0x007f
        L_0x0069:
            com.sugarcube.core.network.models.CatalogPlaceableMetadata r0 = r3.getPlaceables()
            if (r0 == 0) goto L_0x007f
            java.util.List r0 = r0.getCombinations()
            if (r0 == 0) goto L_0x007f
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 != r1) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r1 = 0
        L_0x0080:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.database.CachedCatalogItem.getHasPlaceables():boolean");
    }

    public final int getId() {
        Integer id2 = this.catalogItem.getId();
        if (id2 != null) {
            return id2.intValue();
        }
        return 0;
    }

    public final File getModelFile() {
        return this.modelFile;
    }

    public final String getName() {
        String name = this.catalogItem.getName();
        return name == null ? "" : name;
    }

    public final CatalogPlaceableMetadata getPlaceables() {
        CatalogItemMetadata metadata = this.catalogItem.getMetadata();
        if (metadata != null) {
            return metadata.getPlaceables();
        }
        return null;
    }

    public final String getPrice() {
        String price = this.catalogItem.getPrice();
        return price == null ? "" : price;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r2.catalogItem.getCategories();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sugarcube.app.base.data.analytics.ProductType getProductType() {
        /*
            r2 = this;
            boolean r0 = r2.isCombinable()
            if (r0 == 0) goto L_0x0009
            com.sugarcube.app.base.data.analytics.ProductType r0 = com.sugarcube.app.base.data.analytics.ProductType.Combinable
            goto L_0x0040
        L_0x0009:
            boolean r0 = r2.isWallPlaceable2D()
            if (r0 == 0) goto L_0x0012
            com.sugarcube.app.base.data.analytics.ProductType r0 = com.sugarcube.app.base.data.analytics.ProductType.WallArt
            goto L_0x0040
        L_0x0012:
            boolean r0 = r2.isWallPlaceable3D()
            if (r0 == 0) goto L_0x001b
            com.sugarcube.app.base.data.analytics.ProductType r0 = com.sugarcube.app.base.data.analytics.ProductType.WallPlaceable
            goto L_0x0040
        L_0x001b:
            boolean r0 = r2.isStackableChild()
            if (r0 == 0) goto L_0x0024
            com.sugarcube.app.base.data.analytics.ProductType r0 = com.sugarcube.app.base.data.analytics.ProductType.Stackable
            goto L_0x0040
        L_0x0024:
            boolean r0 = r2.isFloorPlaceable()
            if (r0 == 0) goto L_0x003e
            com.sugarcube.core.network.models.CatalogItem r0 = r2.catalogItem
            java.util.List r0 = r0.getCategories()
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = "Rugs"
            boolean r0 = r0.contains(r1)
            r1 = 1
            if (r0 != r1) goto L_0x003e
            com.sugarcube.app.base.data.analytics.ProductType r0 = com.sugarcube.app.base.data.analytics.ProductType.Rug
            goto L_0x0040
        L_0x003e:
            com.sugarcube.app.base.data.analytics.ProductType r0 = com.sugarcube.app.base.data.analytics.ProductType.Furniture
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.database.CachedCatalogItem.getProductType():com.sugarcube.app.base.data.analytics.ProductType");
    }

    public final SalesDressedBedDataKey getSdbKey() {
        if (C17542s.e(this.catalogItem.getHidden(), Boolean.TRUE) || !this.catalogItem.isCombinable() || !this.catalogItem.isCombinableParent()) {
            return null;
        }
        return (SalesDressedBedDataKey) C13291e.c(this.catalogItem.getCombinableSize(), this.catalogItem.getCombinableVariant(), new a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getPolygons();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.sugarcube.core.network.models.Polygon> getStackingPolygons() {
        /*
            r1 = this;
            com.sugarcube.core.network.models.CatalogItem r0 = r1.catalogItem
            com.sugarcube.core.network.models.Stackables r0 = r0.getStackables()
            if (r0 == 0) goto L_0x000e
            java.util.List r0 = r0.getPolygons()
            if (r0 != 0) goto L_0x0012
        L_0x000e:
            java.util.List r0 = YH.C16877v.n()
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.database.CachedCatalogItem.getStackingPolygons():java.util.List");
    }

    public final CachedCatalogPage getSwappables() {
        return this.swappables;
    }

    public final File getThumbnailFile() {
        return this.thumbnailFile;
    }

    public final boolean getUsingDraco() {
        return this.usingDraco;
    }

    public HashMap<TrackingKey, String> getValues() {
        return this.catalogItem.getValues();
    }

    public int hashCode() {
        int hashCode = ((((this.modelFile.hashCode() * 31) + this.thumbnailFile.hashCode()) * 31) + Boolean.hashCode(this.usingDraco)) * 31;
        CachedCatalogPage cachedCatalogPage = this.swappables;
        int i10 = 0;
        int hashCode2 = (hashCode + (cachedCatalogPage == null ? 0 : cachedCatalogPage.hashCode())) * 31;
        Map<String, CachedCatalogItem> map = this.combinableMap;
        if (map != null) {
            i10 = map.hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.catalogItem.hashCode();
    }

    public final boolean isCombinable() {
        return this.catalogItem.isCombinable();
    }

    public final boolean isCombinableChild() {
        return this.catalogItem.isCombinable() && !isCombinableRoot();
    }

    public final boolean isCombinableParent() {
        return this.catalogItem.isCombinableParent();
    }

    public final boolean isCombinableRoot() {
        return this.catalogItem.isCombinableParent() && !C17542s.e(this.catalogItem.getHidden(), Boolean.TRUE);
    }

    public final boolean isFloorPlaceable() {
        return getGeometryTypes().contains(NetworkAPIs.GeometryType.Furniture.getQueryParamVal());
    }

    public final boolean isMirroringCapable() {
        return C15854t.H(this.catalogItem.getConfigurabilityType(), "MIRROR_X", true);
    }

    public final boolean isModelCached() {
        return this.modelFile.exists();
    }

    public final boolean isStackableChild() {
        return C17542s.e(this.catalogItem.getStacks(), Boolean.TRUE);
    }

    public final boolean isStackableParent() {
        return !getStackingPolygons().isEmpty();
    }

    public final Boolean isSupportedAutodecorate() {
        return this.isSupportedAutodecorate;
    }

    public final boolean isValid() {
        return getId() != 0 && getName().length() > 0;
    }

    public final boolean isWallPlaceable2D() {
        return getGeometryTypes().contains(NetworkAPIs.GeometryType.WallArt.getQueryParamVal());
    }

    public final boolean isWallPlaceable3D() {
        return getGeometryTypes().contains(NetworkAPIs.GeometryType.WallPlaceable.getQueryParamVal());
    }

    public final boolean isWallPlaceableAny() {
        return isWallPlaceable2D() || isWallPlaceable3D();
    }

    public String toString() {
        File file = this.modelFile;
        File file2 = this.thumbnailFile;
        boolean z10 = this.usingDraco;
        CachedCatalogPage cachedCatalogPage = this.swappables;
        Map<String, CachedCatalogItem> map = this.combinableMap;
        CatalogItem catalogItem2 = this.catalogItem;
        return "CachedCatalogItem(modelFile=" + file + ", thumbnailFile=" + file2 + ", usingDraco=" + z10 + ", swappables=" + cachedCatalogPage + ", combinableMap=" + map + ", catalogItem=" + catalogItem2 + ")";
    }

    public CachedCatalogItem(File file, File file2, boolean z10, CachedCatalogPage cachedCatalogPage, Map<String, CachedCatalogItem> map, CatalogItem catalogItem2) {
        C17542s.j(file, "modelFile");
        C17542s.j(file2, "thumbnailFile");
        C17542s.j(catalogItem2, "catalogItem");
        this.modelFile = file;
        this.thumbnailFile = file2;
        this.usingDraco = z10;
        this.swappables = cachedCatalogPage;
        this.combinableMap = map;
        this.catalogItem = catalogItem2;
        this.hasGoesWell = catalogItem2.getHasGoesWell();
        this.isSupportedAutodecorate = catalogItem2.isSupportedAutodecorate();
        this.furnitureType = FurnitureType.Companion.getFurnitureType$default(FurnitureType.Companion, catalogItem2, false, 2, (Object) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CachedCatalogItem(java.io.File r60, java.io.File r61, boolean r62, com.sugarcube.app.base.data.database.CachedCatalogPage r63, java.util.Map r64, com.sugarcube.core.network.models.CatalogItem r65, int r66, kotlin.jvm.internal.DefaultConstructorMarker r67) {
        /*
            r59 = this;
            r0 = r66 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x000c
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            goto L_0x000e
        L_0x000c:
            r0 = r60
        L_0x000e:
            r2 = r66 & 2
            if (r2 == 0) goto L_0x0018
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            goto L_0x001a
        L_0x0018:
            r2 = r61
        L_0x001a:
            r1 = r66 & 4
            if (r1 == 0) goto L_0x0020
            r1 = 0
            goto L_0x0022
        L_0x0020:
            r1 = r62
        L_0x0022:
            r3 = r66 & 8
            r4 = 0
            if (r3 == 0) goto L_0x0029
            r3 = r4
            goto L_0x002b
        L_0x0029:
            r3 = r63
        L_0x002b:
            r5 = r66 & 16
            if (r5 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r4 = r64
        L_0x0032:
            r5 = r66 & 32
            if (r5 == 0) goto L_0x009d
            com.sugarcube.core.network.models.CatalogItem r5 = new com.sugarcube.core.network.models.CatalogItem
            r6 = r5
            r57 = 131071(0x1ffff, float:1.8367E-40)
            r58 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = -1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            goto L_0x009f
        L_0x009d:
            r5 = r65
        L_0x009f:
            r60 = r59
            r61 = r0
            r62 = r2
            r63 = r1
            r64 = r3
            r65 = r4
            r66 = r5
            r60.<init>(r61, r62, r63, r64, r65, r66)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.database.CachedCatalogItem.<init>(java.io.File, java.io.File, boolean, com.sugarcube.app.base.data.database.CachedCatalogPage, java.util.Map, com.sugarcube.core.network.models.CatalogItem, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
