package com.sugarcube.decorate.v2.internal.manager.engine;

import RF.k;
import XH.C16807N;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.SmartaPlacement;
import com.sugarcube.decorate.DesignItemInfo;
import com.sugarcube.decorate.v2.internal.DecorateEngineController;
import com.sugarcube.decorate.v2.internal.manager.MultiviewInfoProvider;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import dI.C17164e;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001bj\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0014`\u001dH¦@¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH&¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH&¢\u0006\u0004\b\"\u0010!J\u0019\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#H&¢\u0006\u0004\b%\u0010&J\u0011\u0010(\u001a\u0004\u0018\u00010'H&¢\u0006\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManager;", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineTouchInteractions;", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineDebugInteractions;", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineMagicEraserInteractions;", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineToolbarInteractions;", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineViewportInteractions;", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineSaveInteractions;", "Lcom/sugarcube/decorate/v2/internal/manager/MultiviewInfoProvider;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "Lcom/sugarcube/core/network/models/SmartaPlacement;", "placement", "LXH/N;", "placeItemInDesign", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/core/network/models/SmartaPlacement;LdI/e;)Ljava/lang/Object;", "", "Lcom/sugarcube/decorate/DesignItemInfo;", "items", "placeAllItemsInDesign", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LRF/k;", "instance", "selectInstance", "(LRF/k;LdI/e;)Ljava/lang/Object;", "smartaPlacement", "duplicateSelectedItem", "(Lcom/sugarcube/core/network/models/SmartaPlacement;LdI/e;)Ljava/lang/Object;", "Ljava/util/HashMap;", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lkotlin/collections/HashMap;", "getModelMap", "(LdI/e;)Ljava/lang/Object;", "clearAllInstances", "()V", "cleanUp", "", "color", "setHelaWallColor", "(Ljava/lang/Integer;)V", "", "getHelaWallColor", "()Ljava/lang/String;", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController;", "getEngineController", "()Lcom/sugarcube/decorate/v2/internal/DecorateEngineController;", "engineController", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface EngineManager extends EngineTouchInteractions, EngineDebugInteractions, EngineMagicEraserInteractions, EngineToolbarInteractions, EngineViewportInteractions, EngineSaveInteractions, MultiviewInfoProvider {
    void cleanUp();

    void clearAllInstances();

    Object duplicateSelectedItem(SmartaPlacement smartaPlacement, C17164e<? super C16807N> eVar);

    DecorateEngineController getEngineController();

    String getHelaWallColor();

    Object getModelMap(C17164e<? super HashMap<ObjectInstanceId, k>> eVar);

    Object placeAllItemsInDesign(List<DesignItemInfo> list, C17164e<? super C16807N> eVar);

    Object placeItemInDesign(CachedCatalogItem cachedCatalogItem, SmartaPlacement smartaPlacement, C17164e<? super C16807N> eVar);

    Object selectInstance(k kVar, C17164e<? super C16807N> eVar);

    void setHelaWallColor(Integer num);
}
