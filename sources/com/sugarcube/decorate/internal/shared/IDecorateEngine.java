package com.sugarcube.decorate.internal.shared;

import android.view.SurfaceHolder;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.SmartaPlacement;
import com.sugarcube.decorate_engine.AddModelInstanceInfo;
import com.sugarcube.decorate_engine.CloneModelInstanceInfo;
import com.sugarcube.decorate_engine.DecorateEngineSetupInfo;
import com.sugarcube.decorate_engine.EraserCounts;
import com.sugarcube.decorate_engine.EraserPickId;
import com.sugarcube.decorate_engine.EraserPickOp;
import com.sugarcube.decorate_engine.FlyCamOrbitParams;
import com.sugarcube.decorate_engine.LayoutThumbnailSpec;
import com.sugarcube.decorate_engine.ModelInstanceDetails;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import com.sugarcube.decorate_engine.PanZoomRegion;
import com.sugarcube.decorate_engine.RoomPolygonType;
import com.sugarcube.decorate_engine.SceneLayout;
import com.sugarcube.decorate_engine.SceneLayoutFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\rH&¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0004H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$H&¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010 \u001a\u00020\rH&¢\u0006\u0004\b)\u0010*J\u001f\u0010)\u001a\u00020(2\u0006\u0010 \u001a\u00020\r2\u0006\u0010+\u001a\u00020\u0004H&¢\u0006\u0004\b)\u0010,J\u001f\u0010.\u001a\u00020\b2\u0006\u0010 \u001a\u00020\r2\u0006\u0010-\u001a\u00020(H&¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\b2\u0006\u0010 \u001a\u00020\rH&¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\b2\u0006\u00102\u001a\u00020\u0004H&¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u0002052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H&¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u0002082\u0006\u0010 \u001a\u000205H&¢\u0006\u0004\b:\u0010;J)\u0010>\u001a\u00020<2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010=\u001a\u00020<H&¢\u0006\u0004\b>\u0010?J!\u0010>\u001a\u00020<2\u0006\u0010 \u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020<H&¢\u0006\u0004\b>\u0010@J\u000f\u0010A\u001a\u00020<H&¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020<2\u0006\u0010=\u001a\u00020<H&¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020$H&¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\b2\u0006\u0010G\u001a\u00020$H&¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH&¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020J2\u0006\u0010M\u001a\u00020JH&¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\bH&¢\u0006\u0004\bP\u0010\nJ\u0017\u0010R\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u0013H&¢\u0006\u0004\bR\u0010SJ#\u0010W\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020U\u0018\u00010Tj\u0004\u0018\u0001`VH&¢\u0006\u0004\bW\u0010XJ!\u0010]\u001a\u0004\u0018\u00010\u00132\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[H&¢\u0006\u0004\b]\u0010^J\u001d\u0010b\u001a\u0010\u0012\u0004\u0012\u00020`\u0018\u00010_j\u0004\u0018\u0001`aH&¢\u0006\u0004\bb\u0010cJ\u000f\u0010e\u001a\u00020dH&¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH&¢\u0006\u0004\bh\u0010iJ\u0017\u0010k\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010jH&¢\u0006\u0004\bk\u0010lJ=\u0010\u000e\u001a\u00020\r2\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010-\u001a\u00020(2\b\u0010q\u001a\u0004\u0018\u00010pH&¢\u0006\u0004\b\u000e\u0010rJ\u0019\u0010t\u001a\u00020\b2\b\u0010s\u001a\u0004\u0018\u00010$H&¢\u0006\u0004\bt\u0010uJ\u0011\u0010w\u001a\u0004\u0018\u00010vH&¢\u0006\u0004\bw\u0010xJ\u000f\u0010y\u001a\u00020$H&¢\u0006\u0004\by\u0010F¨\u0006z"}, d2 = {"Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "", "Lcom/sugarcube/decorate_engine/DecorateEngineSetupInfo;", "setupInfo", "", "setupAndRun", "(Lcom/sugarcube/decorate_engine/DecorateEngineSetupInfo;)Z", "runTests", "LXH/N;", "teardown", "()V", "Lcom/sugarcube/decorate_engine/AddModelInstanceInfo;", "instanceInfo", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "addModelInstance", "(Lcom/sugarcube/decorate_engine/AddModelInstanceInfo;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lcom/sugarcube/decorate_engine/CloneModelInstanceInfo;", "cloneModelInstance", "(Lcom/sugarcube/decorate_engine/CloneModelInstanceInfo;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lcom/sugarcube/decorate_engine/SceneLayout;", "additiveLayout", "instanceId", "addCompoundModelInstance", "(Lcom/sugarcube/decorate_engine/SceneLayout;Lcom/sugarcube/decorate_engine/ObjectInstanceId;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "", "screenX", "screenY", "includeSurfaces", "hitTest", "(FFZ)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "getInstanceParent", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "id", "isSelected", "setModelInstanceSelected", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Z)V", "", "outlineColor", "setSelectionOutlineColor", "(I)I", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "getModelScreenTransform", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;)Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "usePanoSpace", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Z)Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "transform", "moveModelInstance", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/decorate_engine/ModelScreenTransform;)V", "removeModelInstance", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;)V", "isVisible", "setModelInstancesVisible", "(Z)V", "Lcom/sugarcube/decorate_engine/EraserPickId;", "eraserPick", "(FF)Lcom/sugarcube/decorate_engine/EraserPickId;", "Lcom/sugarcube/decorate_engine/EraserPickOp;", "op", "execEraserOp", "(Lcom/sugarcube/decorate_engine/EraserPickOp;Lcom/sugarcube/decorate_engine/EraserPickId;)Z", "Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "orbitParams", "flyCamToPointOfInterest", "(FFLcom/sugarcube/decorate_engine/FlyCamOrbitParams;)Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;)Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "getFlyCamOrbitParams", "()Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "setFlyCamOrbitParams", "(Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;)Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "getFixedViewCount", "()I", "viewIndex", "flyCamToFixedView", "(I)V", "Lcom/sugarcube/decorate_engine/PanZoomRegion;", "getPanZoomRegion", "()Lcom/sugarcube/decorate_engine/PanZoomRegion;", "pzRegion", "setPanZoomRegion", "(Lcom/sugarcube/decorate_engine/PanZoomRegion;)Lcom/sugarcube/decorate_engine/PanZoomRegion;", "restoreWindowFit", "layout", "loadSceneLayout", "(Lcom/sugarcube/decorate_engine/SceneLayout;)Z", "", "Lcom/sugarcube/decorate_engine/ModelInstanceDetails;", "Lcom/sugarcube/decorate_engine/ModelInstanceDetailsMap;", "getInstanceInfo", "()Ljava/util/Map;", "Lcom/sugarcube/decorate_engine/SceneLayoutFormat;", "layoutFormat", "Lcom/sugarcube/decorate_engine/LayoutThumbnailSpec;", "thumbnailSpec", "saveSceneLayout", "(Lcom/sugarcube/decorate_engine/SceneLayoutFormat;Lcom/sugarcube/decorate_engine/LayoutThumbnailSpec;)Lcom/sugarcube/decorate_engine/SceneLayout;", "", "Lcom/sugarcube/decorate_engine/RoomPolygonType;", "Lcom/sugarcube/decorate_engine/RoomPolygonTypeSet;", "getRoomPolygonTypeSet", "()Ljava/util/Set;", "Landroid/view/SurfaceHolder$Callback2;", "getSurfaceHolderCallback", "()Landroid/view/SurfaceHolder$Callback2;", "Lcom/sugarcube/decorate_engine/EraserCounts;", "getEngineEraserCounts", "()Lcom/sugarcube/decorate_engine/EraserCounts;", "", "getRoomPolygonIdList", "()Ljava/util/List;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "catalogItem", "isPlaceholder", "Lcom/sugarcube/core/network/models/SmartaPlacement;", "smartaPlacement", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;ZLcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/decorate_engine/ModelScreenTransform;Lcom/sugarcube/core/network/models/SmartaPlacement;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "color", "setHelaWallColor", "(Ljava/lang/Integer;)V", "", "getHelaWallColor", "()Ljava/lang/String;", "getLastFixedView", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IDecorateEngine {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ ObjectInstanceId a(IDecorateEngine iDecorateEngine, float f10, float f11, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    z10 = false;
                }
                return iDecorateEngine.hitTest(f10, f11, z10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hitTest");
        }
    }

    ObjectInstanceId addCompoundModelInstance(SceneLayout sceneLayout, ObjectInstanceId objectInstanceId);

    ObjectInstanceId addModelInstance(CachedCatalogItem cachedCatalogItem, boolean z10, ObjectInstanceId objectInstanceId, ModelScreenTransform modelScreenTransform, SmartaPlacement smartaPlacement);

    ObjectInstanceId addModelInstance(AddModelInstanceInfo addModelInstanceInfo);

    ObjectInstanceId cloneModelInstance(CloneModelInstanceInfo cloneModelInstanceInfo);

    EraserPickId eraserPick(float f10, float f11);

    boolean execEraserOp(EraserPickOp eraserPickOp, EraserPickId eraserPickId);

    void flyCamToFixedView(int i10);

    FlyCamOrbitParams flyCamToPointOfInterest(float f10, float f11, FlyCamOrbitParams flyCamOrbitParams);

    FlyCamOrbitParams flyCamToPointOfInterest(ObjectInstanceId objectInstanceId, FlyCamOrbitParams flyCamOrbitParams);

    EraserCounts getEngineEraserCounts();

    int getFixedViewCount();

    FlyCamOrbitParams getFlyCamOrbitParams();

    String getHelaWallColor();

    Map<ObjectInstanceId, ModelInstanceDetails> getInstanceInfo();

    ObjectInstanceId getInstanceParent(ObjectInstanceId objectInstanceId);

    int getLastFixedView();

    ModelScreenTransform getModelScreenTransform(ObjectInstanceId objectInstanceId);

    ModelScreenTransform getModelScreenTransform(ObjectInstanceId objectInstanceId, boolean z10);

    PanZoomRegion getPanZoomRegion();

    List<ObjectInstanceId> getRoomPolygonIdList();

    Set<RoomPolygonType> getRoomPolygonTypeSet();

    SurfaceHolder.Callback2 getSurfaceHolderCallback();

    ObjectInstanceId hitTest(float f10, float f11, boolean z10);

    boolean loadSceneLayout(SceneLayout sceneLayout);

    void moveModelInstance(ObjectInstanceId objectInstanceId, ModelScreenTransform modelScreenTransform);

    void removeModelInstance(ObjectInstanceId objectInstanceId);

    void restoreWindowFit();

    boolean runTests(DecorateEngineSetupInfo decorateEngineSetupInfo);

    SceneLayout saveSceneLayout(SceneLayoutFormat sceneLayoutFormat, LayoutThumbnailSpec layoutThumbnailSpec);

    FlyCamOrbitParams setFlyCamOrbitParams(FlyCamOrbitParams flyCamOrbitParams);

    void setHelaWallColor(Integer num);

    void setModelInstanceSelected(ObjectInstanceId objectInstanceId, boolean z10);

    void setModelInstancesVisible(boolean z10);

    PanZoomRegion setPanZoomRegion(PanZoomRegion panZoomRegion);

    int setSelectionOutlineColor(int i10);

    boolean setupAndRun(DecorateEngineSetupInfo decorateEngineSetupInfo);

    void teardown();
}
