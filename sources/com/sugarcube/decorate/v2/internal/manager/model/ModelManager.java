package com.sugarcube.decorate.v2.internal.manager.model;

import com.sugarcube.app.base.data.AssetItem;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.CachedCompiledComposition;
import com.sugarcube.app.base.data.database.Scene;
import dI.C17164e;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0013\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/model/ModelManager;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "fetchCatalogItemModel", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "", "Lcom/sugarcube/app/base/data/AssetItem;", "fetchDecorationAssets", "(Lcom/sugarcube/app/base/data/database/Scene;LdI/e;)Ljava/lang/Object;", "Ljava/util/UUID;", "sceneUuid", "compositionUuid", "jobId", "", "", "gltfMap", "writeGltfMapToFile", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/Map;)Ljava/lang/String;", "Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "cachedCompiledComposition", "cacheCatalogItems", "(Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;LdI/e;)Ljava/lang/Object;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ModelManager {
    Object cacheCatalogItems(CachedCompiledComposition cachedCompiledComposition, C17164e<? super CachedCompiledComposition> eVar);

    Object fetchCatalogItemModel(CachedCatalogItem cachedCatalogItem, C17164e<? super CachedCatalogItem> eVar);

    Object fetchDecorationAssets(Scene scene, C17164e<? super List<AssetItem>> eVar);

    String writeGltfMapToFile(UUID uuid, UUID uuid2, UUID uuid3, Map<String, ? extends Object> map);
}
