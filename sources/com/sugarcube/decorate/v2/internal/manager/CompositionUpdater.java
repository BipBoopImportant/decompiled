package com.sugarcube.decorate.v2.internal.manager;

import RF.k;
import com.sugarcube.app.base.data.database.CachedCompiledComposition;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import com.sugarcube.decorate_engine.SceneLayout;
import dI.C17164e;
import java.util.HashMap;
import kG.C17497c;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001JL\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0011\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/CompositionUpdater;", "", "Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "cachedCompiledComposition", "Lcom/sugarcube/decorate_engine/SceneLayout;", "sceneLayout", "Ljava/util/HashMap;", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "LRF/k;", "Lkotlin/collections/HashMap;", "modelMap", "", "isForSmarta", "getUpdatedCompiledComposition", "(Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;Lcom/sugarcube/decorate_engine/SceneLayout;Ljava/util/HashMap;ZLdI/e;)Ljava/lang/Object;", "LkG/c;", "metadata", "saveToServer", "updateDesign", "(LkG/c;Lcom/sugarcube/decorate_engine/SceneLayout;Ljava/util/HashMap;ZLdI/e;)Ljava/lang/Object;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CompositionUpdater {
    Object getUpdatedCompiledComposition(CachedCompiledComposition cachedCompiledComposition, SceneLayout sceneLayout, HashMap<ObjectInstanceId, k> hashMap, boolean z10, C17164e<? super CachedCompiledComposition> eVar);

    Object updateDesign(C17497c cVar, SceneLayout sceneLayout, HashMap<ObjectInstanceId, k> hashMap, boolean z10, C17164e<? super C17497c> eVar);
}
