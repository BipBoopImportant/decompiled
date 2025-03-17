package RF;

import HJ.C15854t;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import YH.C16877v;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.logger.Priority;
import com.sugarcube.core.network.models.SmartaPlacement;
import com.sugarcube.decorate.internal.shared.IDecorateEngine;
import com.sugarcube.decorate_engine.AddModelInstanceInfo;
import com.sugarcube.decorate_engine.CloneModelInstanceInfo;
import com.sugarcube.decorate_engine.DecorateEngine;
import com.sugarcube.decorate_engine.DecorateEngineSetupInfo;
import com.sugarcube.decorate_engine.EraserCounts;
import com.sugarcube.decorate_engine.EraserPickId;
import com.sugarcube.decorate_engine.EraserPickOp;
import com.sugarcube.decorate_engine.FlyCamOrbitParams;
import com.sugarcube.decorate_engine.LayoutThumbnailSpec;
import com.sugarcube.decorate_engine.Metric;
import com.sugarcube.decorate_engine.ModelInstanceDetails;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import com.sugarcube.decorate_engine.PanZoomRegion;
import com.sugarcube.decorate_engine.RoomPolygonType;
import com.sugarcube.decorate_engine.RoomSurfaceDetails;
import com.sugarcube.decorate_engine.SceneLayout;
import com.sugarcube.decorate_engine.SceneLayoutFormat;
import com.sugarcube.decorate_engine.SceneLayoutInstanceItem;
import com.sugarcube.decorate_engine.Transform3D;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;

@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00100\u001a\u00020/2\u0006\u0010'\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u00103J\u001f\u00105\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u00142\u0006\u00104\u001a\u00020/H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000bH\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020<2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?2\u0006\u0010'\u001a\u00020<H\u0016¢\u0006\u0004\bA\u0010BJ'\u0010E\u001a\u00020C2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010E\u001a\u00020C2\u0006\u0010'\u001a\u00020\u00142\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010GJ\u000f\u0010H\u001a\u00020CH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020C2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020+H\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020+H\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020Q2\u0006\u0010T\u001a\u00020QH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u000fH\u0016¢\u0006\u0004\bW\u0010\u0011J\u0017\u0010Y\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u001aH\u0016¢\u0006\u0004\bY\u0010ZJ#\u0010^\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\\\u0018\u00010[j\u0004\u0018\u0001`]H\u0016¢\u0006\u0004\b^\u0010_J!\u0010d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bd\u0010eJ\u001d\u0010i\u001a\u0010\u0012\u0004\u0012\u00020g\u0018\u00010fj\u0004\u0018\u0001`hH\u0016¢\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010kH\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u0002H\u0016¢\u0006\u0004\bn\u0010oJ\u000f\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\bq\u0010rJ9\u0010\u0015\u001a\u00020\u00142\u0006\u0010t\u001a\u00020s2\u0006\u0010u\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u00142\u0006\u00104\u001a\u00020/2\b\u0010w\u001a\u0004\u0018\u00010vH\u0016¢\u0006\u0004\b\u0015\u0010xJ\u0017\u0010{\u001a\u00020\u000f2\u0006\u0010z\u001a\u00020yH\u0016¢\u0006\u0004\b{\u0010|J\u0017\u0010}\u001a\u00020\u000f2\u0006\u0010z\u001a\u00020yH\u0016¢\u0006\u0004\b}\u0010|J3\u0010\u0001\u001a\u00020\u000f2\u0006\u0010z\u001a\u00020y2\u0006\u0010~\u001a\u00020+2\u0006\u0010\u001a\u00020+2\u0007\u0010\u0001\u001a\u00020+H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0001\u001a\u00020\u000f2\u0006\u0010z\u001a\u00020yH\u0016¢\u0006\u0005\b\u0001\u0010|J\u001d\u0010\u0001\u001a\u00020\u000f2\t\u0010\u0001\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0015\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020+H\u0016¢\u0006\u0005\b\u0001\u0010MR\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R!\u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"LRF/d;", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "Landroid/view/SurfaceHolder$Callback2;", "Lcom/sugarcube/decorate_engine/DecorateEngine$StateListener;", "stateListener", "Lcom/sugarcube/decorate_engine/DecorateEngine$Logger;", "logger", "<init>", "(Lcom/sugarcube/decorate_engine/DecorateEngine$StateListener;Lcom/sugarcube/decorate_engine/DecorateEngine$Logger;)V", "Lcom/sugarcube/decorate_engine/DecorateEngineSetupInfo;", "setupInfo", "", "setupAndRun", "(Lcom/sugarcube/decorate_engine/DecorateEngineSetupInfo;)Z", "runTests", "LXH/N;", "teardown", "()V", "Lcom/sugarcube/decorate_engine/AddModelInstanceInfo;", "instanceInfo", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "addModelInstance", "(Lcom/sugarcube/decorate_engine/AddModelInstanceInfo;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lcom/sugarcube/decorate_engine/CloneModelInstanceInfo;", "cloneModelInstance", "(Lcom/sugarcube/decorate_engine/CloneModelInstanceInfo;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lcom/sugarcube/decorate_engine/SceneLayout;", "additiveLayout", "instanceId", "addCompoundModelInstance", "(Lcom/sugarcube/decorate_engine/SceneLayout;Lcom/sugarcube/decorate_engine/ObjectInstanceId;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "", "screenX", "screenY", "includeSurfaces", "hitTest", "(FFZ)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "getInstanceParent", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "id", "isSelected", "setModelInstanceSelected", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Z)V", "", "outlineColor", "setSelectionOutlineColor", "(I)I", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "getModelScreenTransform", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;)Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "usePanoSpace", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Z)Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "transform", "moveModelInstance", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/decorate_engine/ModelScreenTransform;)V", "removeModelInstance", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;)V", "isVisible", "setModelInstancesVisible", "(Z)V", "Lcom/sugarcube/decorate_engine/EraserPickId;", "eraserPick", "(FF)Lcom/sugarcube/decorate_engine/EraserPickId;", "Lcom/sugarcube/decorate_engine/EraserPickOp;", "op", "execEraserOp", "(Lcom/sugarcube/decorate_engine/EraserPickOp;Lcom/sugarcube/decorate_engine/EraserPickId;)Z", "Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "orbitParams", "flyCamToPointOfInterest", "(FFLcom/sugarcube/decorate_engine/FlyCamOrbitParams;)Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;)Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "getFlyCamOrbitParams", "()Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "setFlyCamOrbitParams", "(Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;)Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "getFixedViewCount", "()I", "viewIndex", "flyCamToFixedView", "(I)V", "Lcom/sugarcube/decorate_engine/PanZoomRegion;", "getPanZoomRegion", "()Lcom/sugarcube/decorate_engine/PanZoomRegion;", "pzRegion", "setPanZoomRegion", "(Lcom/sugarcube/decorate_engine/PanZoomRegion;)Lcom/sugarcube/decorate_engine/PanZoomRegion;", "restoreWindowFit", "layout", "loadSceneLayout", "(Lcom/sugarcube/decorate_engine/SceneLayout;)Z", "", "Lcom/sugarcube/decorate_engine/ModelInstanceDetails;", "Lcom/sugarcube/decorate_engine/ModelInstanceDetailsMap;", "getInstanceInfo", "()Ljava/util/Map;", "Lcom/sugarcube/decorate_engine/SceneLayoutFormat;", "layoutFormat", "Lcom/sugarcube/decorate_engine/LayoutThumbnailSpec;", "thumbnailSpec", "saveSceneLayout", "(Lcom/sugarcube/decorate_engine/SceneLayoutFormat;Lcom/sugarcube/decorate_engine/LayoutThumbnailSpec;)Lcom/sugarcube/decorate_engine/SceneLayout;", "", "Lcom/sugarcube/decorate_engine/RoomPolygonType;", "Lcom/sugarcube/decorate_engine/RoomPolygonTypeSet;", "getRoomPolygonTypeSet", "()Ljava/util/Set;", "", "getRoomPolygonIdList", "()Ljava/util/List;", "getSurfaceHolderCallback", "()Landroid/view/SurfaceHolder$Callback2;", "Lcom/sugarcube/decorate_engine/EraserCounts;", "getEngineEraserCounts", "()Lcom/sugarcube/decorate_engine/EraserCounts;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "catalogItem", "isPlaceholder", "Lcom/sugarcube/core/network/models/SmartaPlacement;", "smartaPlacement", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;ZLcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/decorate_engine/ModelScreenTransform;Lcom/sugarcube/core/network/models/SmartaPlacement;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Landroid/view/SurfaceHolder;", "holder", "surfaceRedrawNeeded", "(Landroid/view/SurfaceHolder;)V", "surfaceCreated", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceDestroyed", "color", "setHelaWallColor", "(Ljava/lang/Integer;)V", "", "getHelaWallColor", "()Ljava/lang/String;", "getLastFixedView", "a", "Lcom/sugarcube/decorate_engine/DecorateEngine$StateListener;", "b", "Lcom/sugarcube/decorate_engine/DecorateEngine$Logger;", "Lcom/sugarcube/decorate_engine/DecorateEngine;", "c", "LXH/o;", "d", "()Lcom/sugarcube/decorate_engine/DecorateEngine;", "engine", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RF.d  reason: case insensitive filesystem */
public final class C13551d implements IDecorateEngine, SurfaceHolder.Callback2 {

    /* renamed from: a  reason: collision with root package name */
    private final DecorateEngine.StateListener f115538a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final DecorateEngine.Logger f115539b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f115540c = C16825p.b(new C13550c(this));

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"RF/d$a", "Lcom/sugarcube/decorate_engine/DecorateEngine$Logger;", "", "msg", "LXH/N;", "log", "(Ljava/lang/String;)V", "", "isFatal", "onError", "(Ljava/lang/String;Z)V", "Lcom/sugarcube/decorate_engine/Metric;", "metric", "onMetric", "(Lcom/sugarcube/decorate_engine/Metric;)V", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: RF.d$a */
    public static final class a implements DecorateEngine.Logger {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13551d f115541a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ O<String> f115542b;

        a(C13551d dVar, O<String> o10) {
            this.f115541a = dVar;
            this.f115542b = o10;
        }

        public void log(String str) {
            C17542s.j(str, "msg");
            DecorateEngine.Logger b10 = this.f115541a.f115539b;
            T t10 = this.f115542b.f144348a;
            b10.log("ENGINE REF:  " + t10 + " - " + str);
        }

        public void onError(String str, boolean z10) {
            C17542s.j(str, "msg");
            this.f115541a.f115539b.onError(str, z10);
        }

        public void onMetric(Metric metric) {
            C17542s.j(metric, "metric");
            this.f115541a.f115539b.onMetric(metric);
        }
    }

    public C13551d(DecorateEngine.StateListener stateListener, DecorateEngine.Logger logger) {
        C17542s.j(stateListener, "stateListener");
        C17542s.j(logger, "logger");
        this.f115538a = stateListener;
        this.f115539b = logger;
    }

    /* access modifiers changed from: private */
    public static final DecorateEngine c(C13551d dVar) {
        O o10 = new O();
        o10.f144348a = "";
        DecorateEngine decorateEngine = new DecorateEngine(dVar.f115538a, new a(dVar, o10));
        o10.f144348a = C16877v.I0(C15854t.Y0(decorateEngine.toString(), new String[]{"@"}, false, 0, 6, (Object) null));
        Priority priority = Priority.DEBUG;
        String str = "Created engine, ref: " + decorateEngine;
        if (str == null) {
            str = "";
        }
        int i10 = C13552e.f115543a[priority.ordinal()];
        Class<C13551d> cls = C13551d.class;
        if (i10 == 1) {
            String name = cls.getName();
            C17542s.g(name);
            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o12.length() != 0) {
                name = C15854t.P0(o12, "Kt");
            }
            Log.v(name, str + " " + "");
        } else if (i10 == 2) {
            String name2 = cls.getName();
            C17542s.g(name2);
            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o13.length() != 0) {
                name2 = C15854t.P0(o13, "Kt");
            }
            Log.d(name2, str + " " + "");
        } else if (i10 == 3) {
            String name3 = cls.getName();
            C17542s.g(name3);
            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o14.length() != 0) {
                name3 = C15854t.P0(o14, "Kt");
            }
            Log.i(name3, str + " " + "");
        } else if (i10 == 4) {
            String name4 = cls.getName();
            C17542s.g(name4);
            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o15.length() != 0) {
                name4 = C15854t.P0(o15, "Kt");
            }
            Log.w(name4, str + " " + "");
        } else if (i10 == 5) {
            String name5 = cls.getName();
            C17542s.g(name5);
            String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o16.length() != 0) {
                name5 = C15854t.P0(o16, "Kt");
            }
            Log.e(name5, str + " " + "");
        } else {
            throw new t();
        }
        return decorateEngine;
    }

    private final DecorateEngine d() {
        return (DecorateEngine) this.f115540c.getValue();
    }

    public ObjectInstanceId addCompoundModelInstance(SceneLayout sceneLayout, ObjectInstanceId objectInstanceId) {
        C17542s.j(sceneLayout, "additiveLayout");
        C17542s.j(objectInstanceId, "instanceId");
        return d().addCompoundModelInstance(sceneLayout, objectInstanceId);
    }

    public ObjectInstanceId addModelInstance(AddModelInstanceInfo addModelInstanceInfo) {
        C17542s.j(addModelInstanceInfo, "instanceInfo");
        return d().addModelInstance(addModelInstanceInfo);
    }

    public ObjectInstanceId cloneModelInstance(CloneModelInstanceInfo cloneModelInstanceInfo) {
        C17542s.j(cloneModelInstanceInfo, "instanceInfo");
        return d().cloneModelInstance(cloneModelInstanceInfo);
    }

    public EraserPickId eraserPick(float f10, float f11) {
        return d().eraserPick(f10, f11);
    }

    public boolean execEraserOp(EraserPickOp eraserPickOp, EraserPickId eraserPickId) {
        C17542s.j(eraserPickOp, "op");
        C17542s.j(eraserPickId, "id");
        return d().execEraserOp(eraserPickOp, eraserPickId);
    }

    public void flyCamToFixedView(int i10) {
        d().flyCamToFixedView(i10);
    }

    public FlyCamOrbitParams flyCamToPointOfInterest(float f10, float f11, FlyCamOrbitParams flyCamOrbitParams) {
        C17542s.j(flyCamOrbitParams, "orbitParams");
        return d().flyCamToPointOfInterest(f10, f11, flyCamOrbitParams);
    }

    public EraserCounts getEngineEraserCounts() {
        return d().getEraserCounts();
    }

    public int getFixedViewCount() {
        return d().getFixedViewCount();
    }

    public FlyCamOrbitParams getFlyCamOrbitParams() {
        return d().getFlyCamOrbitParams();
    }

    public String getHelaWallColor() {
        Collection<RoomSurfaceDetails> values;
        Object obj;
        String paint;
        Map<ObjectInstanceId, RoomSurfaceDetails> roomSurfacesDetails = d().getRoomSurfacesDetails();
        if (!(roomSurfacesDetails == null || (values = roomSurfacesDetails.values()) == null)) {
            Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((RoomSurfaceDetails) obj).getPaint() != null) {
                    break;
                }
            }
            RoomSurfaceDetails roomSurfaceDetails = (RoomSurfaceDetails) obj;
            if (roomSurfaceDetails == null || (paint = roomSurfaceDetails.getPaint()) == null) {
                return null;
            }
            return paint;
        }
        return null;
    }

    public Map<ObjectInstanceId, ModelInstanceDetails> getInstanceInfo() {
        return DecorateEngine.getModelInstancesDetails$default(d(), (ObjectInstanceId) null, 1, (Object) null);
    }

    public ObjectInstanceId getInstanceParent(ObjectInstanceId objectInstanceId) {
        C17542s.j(objectInstanceId, "instanceId");
        return d().getInstanceParent(objectInstanceId);
    }

    public int getLastFixedView() {
        return d().getLastFixedView();
    }

    public ModelScreenTransform getModelScreenTransform(ObjectInstanceId objectInstanceId) {
        C17542s.j(objectInstanceId, "id");
        return d().getModelScreenTransform(objectInstanceId);
    }

    public PanZoomRegion getPanZoomRegion() {
        return d().getPanZoomRegion();
    }

    public List<ObjectInstanceId> getRoomPolygonIdList() {
        return d().getRoomPolygonIdList();
    }

    public Set<RoomPolygonType> getRoomPolygonTypeSet() {
        return d().getRoomPolygonTypeSet();
    }

    public SurfaceHolder.Callback2 getSurfaceHolderCallback() {
        return this;
    }

    public ObjectInstanceId hitTest(float f10, float f11, boolean z10) {
        return d().hitTest(f10, f11, z10);
    }

    public boolean loadSceneLayout(SceneLayout sceneLayout) {
        C17542s.j(sceneLayout, "layout");
        return d().loadSceneLayout(sceneLayout);
    }

    public void moveModelInstance(ObjectInstanceId objectInstanceId, ModelScreenTransform modelScreenTransform) {
        C17542s.j(objectInstanceId, "id");
        C17542s.j(modelScreenTransform, "transform");
        d().moveModelInstance(objectInstanceId, modelScreenTransform);
    }

    public void removeModelInstance(ObjectInstanceId objectInstanceId) {
        C17542s.j(objectInstanceId, "id");
        d().removeModelInstance(objectInstanceId);
    }

    public void restoreWindowFit() {
        d().restoreWindowFit();
    }

    public boolean runTests(DecorateEngineSetupInfo decorateEngineSetupInfo) {
        C17542s.j(decorateEngineSetupInfo, "setupInfo");
        return d().runTests(decorateEngineSetupInfo);
    }

    public SceneLayout saveSceneLayout(SceneLayoutFormat sceneLayoutFormat, LayoutThumbnailSpec layoutThumbnailSpec) {
        C17542s.j(sceneLayoutFormat, "layoutFormat");
        C17542s.j(layoutThumbnailSpec, "thumbnailSpec");
        return d().saveSceneLayout(sceneLayoutFormat, layoutThumbnailSpec);
    }

    public FlyCamOrbitParams setFlyCamOrbitParams(FlyCamOrbitParams flyCamOrbitParams) {
        C17542s.j(flyCamOrbitParams, "orbitParams");
        return d().setFlyCamOrbitParams(flyCamOrbitParams);
    }

    public void setHelaWallColor(Integer num) {
        d().setCustomWallColor(ObjectInstanceId.Companion.getKAll(), num);
    }

    public void setModelInstanceSelected(ObjectInstanceId objectInstanceId, boolean z10) {
        C17542s.j(objectInstanceId, "id");
        d().setModelInstanceSelected(objectInstanceId, z10);
    }

    public void setModelInstancesVisible(boolean z10) {
        d().setModelInstancesVisible(z10);
    }

    public PanZoomRegion setPanZoomRegion(PanZoomRegion panZoomRegion) {
        C17542s.j(panZoomRegion, "pzRegion");
        return d().setPanZoomRegion(panZoomRegion);
    }

    public int setSelectionOutlineColor(int i10) {
        return d().setSelectionOutlineColor(i10);
    }

    public boolean setupAndRun(DecorateEngineSetupInfo decorateEngineSetupInfo) {
        C17542s.j(decorateEngineSetupInfo, "setupInfo");
        return d().setupAndRun(decorateEngineSetupInfo);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        C17542s.j(surfaceHolder, "holder");
        DecorateEngine d10 = d();
        Surface surface = surfaceHolder.getSurface();
        C17542s.i(surface, "getSurface(...)");
        d10.surfaceChanged(surface, i10, i11, i12);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C17542s.j(surfaceHolder, "holder");
        DecorateEngine d10 = d();
        Surface surface = surfaceHolder.getSurface();
        C17542s.i(surface, "getSurface(...)");
        d10.surfaceCreated(surface);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C17542s.j(surfaceHolder, "holder");
        d().surfaceDestroyed();
    }

    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        C17542s.j(surfaceHolder, "holder");
        DecorateEngine d10 = d();
        Surface surface = surfaceHolder.getSurface();
        C17542s.i(surface, "getSurface(...)");
        d10.surfaceRedrawNeeded(surface);
    }

    public void teardown() {
        d().teardown();
    }

    public ObjectInstanceId addModelInstance(CachedCatalogItem cachedCatalogItem, boolean z10, ObjectInstanceId objectInstanceId, ModelScreenTransform modelScreenTransform, SmartaPlacement smartaPlacement) {
        CachedCatalogItem cachedCatalogItem2 = cachedCatalogItem;
        ObjectInstanceId objectInstanceId2 = objectInstanceId;
        ModelScreenTransform modelScreenTransform2 = modelScreenTransform;
        C17542s.j(cachedCatalogItem2, "catalogItem");
        C17542s.j(objectInstanceId2, "id");
        C17542s.j(modelScreenTransform2, "transform");
        if (!z10 && cachedCatalogItem.isCombinableRoot()) {
            return i.d(this, cachedCatalogItem2, objectInstanceId2, modelScreenTransform2);
        }
        SceneLayoutInstanceItem sceneLayoutInstanceItem = r1;
        SceneLayoutInstanceItem sceneLayoutInstanceItem2 = new SceneLayoutInstanceItem(0, objectInstanceId, (Transform3D) null, (ObjectInstanceId) null, (String) null, (String) null, (Integer) null, (List) null, (Integer) null, (Boolean) null, modelScreenTransform, (List) null, (List) null, (String) null, (String) null, 31741, (DefaultConstructorMarker) null);
        return addModelInstance(i.u(new AddModelInstanceInfo(i.f(cachedCatalogItem2, Boolean.valueOf(z10)), sceneLayoutInstanceItem), smartaPlacement, getRoomPolygonIdList()));
    }

    public FlyCamOrbitParams flyCamToPointOfInterest(ObjectInstanceId objectInstanceId, FlyCamOrbitParams flyCamOrbitParams) {
        C17542s.j(objectInstanceId, "id");
        C17542s.j(flyCamOrbitParams, "orbitParams");
        return d().flyCamToPointOfInterest(objectInstanceId, flyCamOrbitParams);
    }

    public ModelScreenTransform getModelScreenTransform(ObjectInstanceId objectInstanceId, boolean z10) {
        C17542s.j(objectInstanceId, "id");
        return d().getModelScreenTransform(objectInstanceId, z10);
    }
}
