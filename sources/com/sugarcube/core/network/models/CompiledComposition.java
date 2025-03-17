package com.sugarcube.core.network.models;

import com.squareup.moshi.e;
import com.squareup.moshi.g;
import com.sugarcube.core.network.api.NetworkAPIs;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010!\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014¨\u0006'"}, d2 = {"Lcom/sugarcube/core/network/models/CompiledComposition;", "", "composition", "Lcom/sugarcube/core/network/models/Composition;", "catalogItems", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "scene", "Lcom/sugarcube/core/network/models/SceneResponse;", "<init>", "(Lcom/sugarcube/core/network/models/Composition;Ljava/util/List;Lcom/sugarcube/core/network/models/SceneResponse;)V", "getComposition", "()Lcom/sugarcube/core/network/models/Composition;", "getCatalogItems", "()Ljava/util/List;", "getScene", "()Lcom/sugarcube/core/network/models/SceneResponse;", "hasWallPlacedFurniture", "", "getHasWallPlacedFurniture", "()Z", "hasSnapRotatedFurniture", "getHasSnapRotatedFurniture", "hasMirroredFurniture", "getHasMirroredFurniture", "hasGltfScene", "getHasGltfScene", "hasGltfComposition", "getHasGltfComposition", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CompiledComposition {
    private final List<CatalogItem> catalogItems;
    private final Composition composition;
    private final SceneResponse scene;

    public CompiledComposition(Composition composition2, @e(name = "furnitures") List<CatalogItem> list, @e(name = "scene") SceneResponse sceneResponse) {
        C17542s.j(composition2, "composition");
        this.composition = composition2;
        this.catalogItems = list;
        this.scene = sceneResponse;
    }

    public static /* synthetic */ CompiledComposition copy$default(CompiledComposition compiledComposition, Composition composition2, List<CatalogItem> list, SceneResponse sceneResponse, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            composition2 = compiledComposition.composition;
        }
        if ((i10 & 2) != 0) {
            list = compiledComposition.catalogItems;
        }
        if ((i10 & 4) != 0) {
            sceneResponse = compiledComposition.scene;
        }
        return compiledComposition.copy(composition2, list, sceneResponse);
    }

    public final Composition component1() {
        return this.composition;
    }

    public final List<CatalogItem> component2() {
        return this.catalogItems;
    }

    public final SceneResponse component3() {
        return this.scene;
    }

    public final CompiledComposition copy(Composition composition2, @e(name = "furnitures") List<CatalogItem> list, @e(name = "scene") SceneResponse sceneResponse) {
        C17542s.j(composition2, "composition");
        return new CompiledComposition(composition2, list, sceneResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompiledComposition)) {
            return false;
        }
        CompiledComposition compiledComposition = (CompiledComposition) obj;
        return C17542s.e(this.composition, compiledComposition.composition) && C17542s.e(this.catalogItems, compiledComposition.catalogItems) && C17542s.e(this.scene, compiledComposition.scene);
    }

    public final List<CatalogItem> getCatalogItems() {
        return this.catalogItems;
    }

    public final Composition getComposition() {
        return this.composition;
    }

    public final boolean getHasGltfComposition() {
        return this.composition.isDownload3D();
    }

    public final boolean getHasGltfScene() {
        SceneResponse sceneResponse = this.scene;
        return sceneResponse != null && sceneResponse.getHasGltf();
    }

    public final boolean getHasMirroredFurniture() {
        List<PlacedFurniture> placedFurnitureSet = this.composition.getPlacedFurnitureSet();
        if (placedFurnitureSet == null) {
            return false;
        }
        Iterable<PlacedFurniture> iterable = placedFurnitureSet;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (PlacedFurniture isMirrored : iterable) {
            if (C17542s.e(isMirrored.isMirrored(), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.sugarcube.core.network.models.PlacedFurniture} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.sugarcube.core.network.models.PlacedFurniture} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.sugarcube.core.network.models.PlacedFurniture} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.sugarcube.core.network.models.PlacedFurniture} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.sugarcube.core.network.models.PlacedFurniture} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean getHasSnapRotatedFurniture() {
        /*
            r6 = this;
            com.sugarcube.core.network.models.Composition r0 = r6.composition
            java.util.List r0 = r0.getPlacedFurnitureSet()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0034
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0011:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0032
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.sugarcube.core.network.models.PlacedFurniture r5 = (com.sugarcube.core.network.models.PlacedFurniture) r5
            java.lang.Integer r5 = r5.getActiveCombination()
            if (r5 == 0) goto L_0x0029
            int r5 = r5.intValue()
            goto L_0x002a
        L_0x0029:
            r5 = -1
        L_0x002a:
            if (r5 < 0) goto L_0x002e
            r5 = r3
            goto L_0x002f
        L_0x002e:
            r5 = r2
        L_0x002f:
            if (r5 == 0) goto L_0x0011
            r1 = r4
        L_0x0032:
            com.sugarcube.core.network.models.PlacedFurniture r1 = (com.sugarcube.core.network.models.PlacedFurniture) r1
        L_0x0034:
            if (r1 == 0) goto L_0x0037
            r2 = r3
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.CompiledComposition.getHasSnapRotatedFurniture():boolean");
    }

    public final boolean getHasWallPlacedFurniture() {
        List<CatalogItem> list = this.catalogItems;
        if (list == null) {
            return false;
        }
        for (CatalogItem geometryType : list) {
            if (C17542s.e(geometryType.getGeometryType(), NetworkAPIs.GeometryType.WallPlaceable.getQueryParamVal())) {
                return true;
            }
        }
        return false;
    }

    public final SceneResponse getScene() {
        return this.scene;
    }

    public int hashCode() {
        int hashCode = this.composition.hashCode() * 31;
        List<CatalogItem> list = this.catalogItems;
        int i10 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        SceneResponse sceneResponse = this.scene;
        if (sceneResponse != null) {
            i10 = sceneResponse.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        Composition composition2 = this.composition;
        List<CatalogItem> list = this.catalogItems;
        SceneResponse sceneResponse = this.scene;
        return "CompiledComposition(composition=" + composition2 + ", catalogItems=" + list + ", scene=" + sceneResponse + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompiledComposition(Composition composition2, List list, SceneResponse sceneResponse, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(composition2, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : sceneResponse);
    }
}
