package com.sugarcube.app.base.data.database;

import XH.C16796C;
import XH.v;
import YH.X;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.analytics.TrackableKt;
import com.sugarcube.core.analytics.TrackingKey;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.core.network.models.CompiledComposition;
import com.sugarcube.core.network.models.Composition;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ$\u0010#\u001a\u001e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t0$j\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t`&H\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0006HÖ\u0001J\t\u00100\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011¨\u00061"}, d2 = {"Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "Lcom/sugarcube/core/analytics/Trackable;", "compiledComposition", "Lcom/sugarcube/core/network/models/CompiledComposition;", "cachedCatalogItems", "", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "gltfPath", "", "<init>", "(Lcom/sugarcube/core/network/models/CompiledComposition;Ljava/util/Map;Ljava/lang/String;)V", "getCompiledComposition", "()Lcom/sugarcube/core/network/models/CompiledComposition;", "getCachedCatalogItems", "()Ljava/util/Map;", "getGltfPath", "()Ljava/lang/String;", "name", "getName", "compositionUuid", "Ljava/util/UUID;", "getCompositionUuid", "()Ljava/util/UUID;", "composition", "Lcom/sugarcube/core/network/models/Composition;", "getComposition", "()Lcom/sugarcube/core/network/models/Composition;", "catalogItems", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "getCatalogItems", "()Ljava/util/List;", "displayName", "getDisplayName", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CachedCompiledComposition implements Trackable {
    public static final int $stable = 8;
    private final Map<Integer, CachedCatalogItem> cachedCatalogItems;
    private final CompiledComposition compiledComposition;
    private final String gltfPath;

    public CachedCompiledComposition(CompiledComposition compiledComposition2, Map<Integer, CachedCatalogItem> map, String str) {
        C17542s.j(compiledComposition2, "compiledComposition");
        C17542s.j(map, "cachedCatalogItems");
        this.compiledComposition = compiledComposition2;
        this.cachedCatalogItems = map;
        this.gltfPath = str;
    }

    public static /* synthetic */ CachedCompiledComposition copy$default(CachedCompiledComposition cachedCompiledComposition, CompiledComposition compiledComposition2, Map<Integer, CachedCatalogItem> map, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            compiledComposition2 = cachedCompiledComposition.compiledComposition;
        }
        if ((i10 & 2) != 0) {
            map = cachedCompiledComposition.cachedCatalogItems;
        }
        if ((i10 & 4) != 0) {
            str = cachedCompiledComposition.gltfPath;
        }
        return cachedCompiledComposition.copy(compiledComposition2, map, str);
    }

    public final CompiledComposition component1() {
        return this.compiledComposition;
    }

    public final Map<Integer, CachedCatalogItem> component2() {
        return this.cachedCatalogItems;
    }

    public final String component3() {
        return this.gltfPath;
    }

    public final CachedCompiledComposition copy(CompiledComposition compiledComposition2, Map<Integer, CachedCatalogItem> map, String str) {
        C17542s.j(compiledComposition2, "compiledComposition");
        C17542s.j(map, "cachedCatalogItems");
        return new CachedCompiledComposition(compiledComposition2, map, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedCompiledComposition)) {
            return false;
        }
        CachedCompiledComposition cachedCompiledComposition = (CachedCompiledComposition) obj;
        return C17542s.e(this.compiledComposition, cachedCompiledComposition.compiledComposition) && C17542s.e(this.cachedCatalogItems, cachedCompiledComposition.cachedCatalogItems) && C17542s.e(this.gltfPath, cachedCompiledComposition.gltfPath);
    }

    public final Map<Integer, CachedCatalogItem> getCachedCatalogItems() {
        return this.cachedCatalogItems;
    }

    public final List<CatalogItem> getCatalogItems() {
        return this.compiledComposition.getCatalogItems();
    }

    public final CompiledComposition getCompiledComposition() {
        return this.compiledComposition;
    }

    public final Composition getComposition() {
        return this.compiledComposition.getComposition();
    }

    public final UUID getCompositionUuid() {
        return this.compiledComposition.getComposition().getCompositionUuid();
    }

    public final String getDisplayName() {
        String name = getName();
        if (name == null || name.length() == 0) {
            return null;
        }
        return getName();
    }

    public final String getGltfPath() {
        return this.gltfPath;
    }

    public final String getName() {
        return this.compiledComposition.getComposition().getName();
    }

    public HashMap<TrackingKey, String> getValues() {
        v a10 = C16796C.a(TrackingKey.DesignId, TrackableKt.toTrackableValue(getCompositionUuid()));
        TrackingKey trackingKey = TrackingKey.ItemCount;
        List<CatalogItem> catalogItems = getCatalogItems();
        return X.l(a10, C16796C.a(trackingKey, TrackableKt.toTrackableValue(catalogItems != null ? Integer.valueOf(catalogItems.size()) : null)), C16796C.a(TrackingKey.RoomId, TrackableKt.toTrackableValue(Integer.valueOf(getComposition().getSceneId()))), C16796C.a(TrackingKey.RoomUUID, TrackableKt.toTrackableValue(getComposition().getSceneUuid())), C16796C.a(TrackingKey.DesignName, TrackableKt.toTrackableValue(getDisplayName(), "Untitled Design")), C16796C.a(TrackingKey.DesignUUID, TrackableKt.toTrackableValue(getComposition().getCompositionUuid())));
    }

    public int hashCode() {
        int hashCode = ((this.compiledComposition.hashCode() * 31) + this.cachedCatalogItems.hashCode()) * 31;
        String str = this.gltfPath;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        CompiledComposition compiledComposition2 = this.compiledComposition;
        Map<Integer, CachedCatalogItem> map = this.cachedCatalogItems;
        String str = this.gltfPath;
        return "CachedCompiledComposition(compiledComposition=" + compiledComposition2 + ", cachedCatalogItems=" + map + ", gltfPath=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CachedCompiledComposition(CompiledComposition compiledComposition2, Map map, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(compiledComposition2, (i10 & 2) != 0 ? new HashMap() : map, (i10 & 4) != 0 ? null : str);
    }
}
