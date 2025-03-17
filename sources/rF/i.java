package RF;

import HJ.C15854t;
import OE.C13313e;
import XH.C16814e;
import YE.C13868b;
import YE.e;
import YH.C16877v;
import YH.X;
import android.net.Uri;
import android.util.Log;
import com.sugarcube.app.base.data.analytics.ProductParentType;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.CachedCompiledComposition;
import com.sugarcube.app.base.data.source.CompositionRepository;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.CameraParameters;
import com.sugarcube.core.network.models.CameraPerspective;
import com.sugarcube.core.network.models.CatalogCombinableNodeMeta;
import com.sugarcube.core.network.models.CatalogPlaceableMetadata;
import com.sugarcube.core.network.models.ClientFeatures;
import com.sugarcube.core.network.models.ClientNames;
import com.sugarcube.core.network.models.CompiledComposition;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.CompositionSavedProperties;
import com.sugarcube.core.network.models.DirectionalLightData;
import com.sugarcube.core.network.models.FurnitureArtData;
import com.sugarcube.core.network.models.FurnitureGfxAttributes;
import com.sugarcube.core.network.models.LocalProduct;
import com.sugarcube.core.network.models.Manifest;
import com.sugarcube.core.network.models.ParentDetails;
import com.sugarcube.core.network.models.PlaceableAnchor;
import com.sugarcube.core.network.models.PlacedFurniture;
import com.sugarcube.core.network.models.PlaneData;
import com.sugarcube.core.network.models.PlanePolygonSet;
import com.sugarcube.core.network.models.PointLightData;
import com.sugarcube.core.network.models.Polygon;
import com.sugarcube.core.network.models.PolygonParameters;
import com.sugarcube.core.network.models.PosXYZ;
import com.sugarcube.core.network.models.SceneResponse;
import com.sugarcube.core.network.models.SmartaPlacement;
import com.sugarcube.core.network.models.StackableAlternate;
import com.sugarcube.decorate.internal.shared.IDecorateEngine;
import com.sugarcube.decorate_engine.AddModelInstanceInfo;
import com.sugarcube.decorate_engine.CloneModelInstanceInfo;
import com.sugarcube.decorate_engine.CombinablePlugRules;
import com.sugarcube.decorate_engine.CombinableSlot;
import com.sugarcube.decorate_engine.DecorateEngineManifest;
import com.sugarcube.decorate_engine.FeatureFlagBit;
import com.sugarcube.decorate_engine.ManifestIntrinsics;
import com.sugarcube.decorate_engine.ManifestLight;
import com.sugarcube.decorate_engine.ManifestPlane;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import com.sugarcube.decorate_engine.ObjectInstanceIdType;
import com.sugarcube.decorate_engine.RoomPolygon;
import com.sugarcube.decorate_engine.RoomPolygonType;
import com.sugarcube.decorate_engine.SceneLayout;
import com.sugarcube.decorate_engine.SceneLayoutAssetItem;
import com.sugarcube.decorate_engine.SceneLayoutInstanceItem;
import com.sugarcube.decorate_engine.StackingPolygon;
import com.sugarcube.decorate_engine.Transform3D;
import dI.C17164e;
import jI.C17423j;
import java.io.File;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;

@Metadata(d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0013\u001a\u00020\u000f*\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0017\u001a\u00020\u0016*\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u001b\u001a\u00020\u001a*\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c\u001aO\u0010'\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\"\u0010#\u001a\u001e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fj\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!`\"2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010+\u001a\u00020\u0019*\u00020\u00192\u0006\u0010*\u001a\u00020)H@¢\u0006\u0004\b+\u0010,\u001a\u001b\u00100\u001a\u00020/*\u00020-2\b\u0010.\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b0\u00101\u001a\u0019\u00105\u001a\u000204*\u00020\u00152\u0006\u00103\u001a\u000202¢\u0006\u0004\b5\u00106\u001a\u0011\u00109\u001a\u000208*\u000207¢\u0006\u0004\b9\u0010:\u001a3\u0010@\u001a\u000204*\u00020\u00152\u0006\u0010;\u001a\u00020 2\b\u0010=\u001a\u0004\u0018\u00010<2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010>¢\u0006\u0004\b@\u0010A\u001a\u0015\u0010E\u001a\u00020D*\u00060Bj\u0002`C¢\u0006\u0004\bE\u0010F\u001a\u0001\u0010O\u001a\u00020G*\u00020G2\u0006\u0010$\u001a\u00020\u001a2\"\u0010H\u001a\u001e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fj\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!`\"2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u00052\"\u0010N\u001a\u001e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020M0\u001fj\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020M`\"2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\bO\u0010P\u001aM\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020<\u0018\u00010V2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020%2\u0006\u0010R\u001a\u00020%2\u0006\u0010S\u001a\u00020%2\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%H\u0002¢\u0006\u0004\bW\u0010X\u001a)\u0010Z\u001a\u00020 *\u00020-2\u0006\u0010Y\u001a\u00020M2\u0006\u0010.\u001a\u00020 2\u0006\u00103\u001a\u00020\u0016¢\u0006\u0004\bZ\u0010[\u001a#\u0010_\u001a\u00020 *\u00020-2\u0006\u0010\\\u001a\u00020 2\b\u0010^\u001a\u0004\u0018\u00010]¢\u0006\u0004\b_\u0010`\u001a+\u0010c\u001a\u00020a*\u00020a2\b\u0010^\u001a\u0004\u0018\u00010]2\u000e\u0010b\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010>¢\u0006\u0004\bc\u0010d\u001a#\u0010e\u001a\u00020 2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020 0>2\u0006\u0010^\u001a\u00020]¢\u0006\u0004\be\u0010f\u001a\u0015\u0010g\u001a\u0002022\u0006\u0010^\u001a\u00020]¢\u0006\u0004\bg\u0010h\u001a+\u0010j\u001a\u00020i*\u00020i2\b\u0010^\u001a\u0004\u0018\u00010]2\u000e\u0010b\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010>¢\u0006\u0004\bj\u0010k\u001a!\u0010o\u001a\u00020n2\u0006\u0010l\u001a\u00020M2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010%¢\u0006\u0004\bo\u0010p\u001a!\u0010t\u001a\b\u0012\u0004\u0012\u00020s0>2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020q0>¢\u0006\u0004\bt\u0010u\u001a!\u0010w\u001a\b\u0012\u0004\u0012\u00020v0>2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020q0>¢\u0006\u0004\bw\u0010u\u001a#\u0010{\u001a\b\u0012\u0004\u0012\u00020z0>2\u000e\u0010y\u001a\n\u0012\u0004\u0012\u00020x\u0018\u00010>¢\u0006\u0004\b{\u0010u*\n\u0010|\"\u00020B2\u00020B¨\u0006}"}, d2 = {"Lcom/sugarcube/core/network/models/Manifest;", "Lcom/sugarcube/decorate_engine/DecorateEngineManifest;", "z", "(Lcom/sugarcube/core/network/models/Manifest;)Lcom/sugarcube/decorate_engine/DecorateEngineManifest;", "Lcom/sugarcube/decorate_engine/RoomPolygonType$Companion;", "", "str", "Lcom/sugarcube/decorate_engine/RoomPolygonType;", "l", "(Lcom/sugarcube/decorate_engine/RoomPolygonType$Companion;Ljava/lang/String;)Lcom/sugarcube/decorate_engine/RoomPolygonType;", "Lcom/sugarcube/core/network/models/PlaneData;", "Lcom/sugarcube/decorate_engine/ManifestPlane;", "A", "(Lcom/sugarcube/core/network/models/PlaneData;)Lcom/sugarcube/decorate_engine/ManifestPlane;", "Lcom/sugarcube/core/network/models/DirectionalLightData;", "Lcom/sugarcube/decorate_engine/ManifestLight;", "x", "(Lcom/sugarcube/core/network/models/DirectionalLightData;)Lcom/sugarcube/decorate_engine/ManifestLight;", "Lcom/sugarcube/core/network/models/PointLightData;", "y", "(Lcom/sugarcube/core/network/models/PointLightData;)Lcom/sugarcube/decorate_engine/ManifestLight;", "Lcom/sugarcube/core/network/models/PlacedFurniture;", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "p", "(Lcom/sugarcube/core/network/models/PlacedFurniture;)Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "Lcom/sugarcube/decorate_engine/SceneLayout;", "D", "(Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;)Lcom/sugarcube/decorate_engine/SceneLayout;", "LOE/e;", "installationConfig", "Ljava/util/HashMap;", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "LRF/k;", "Lkotlin/collections/HashMap;", "modelMap", "sceneLayout", "", "isForSmarta", "F", "(Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;LOE/e;Ljava/util/HashMap;Lcom/sugarcube/decorate_engine/SceneLayout;Z)Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "compositionRepository", "q", "(Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;Lcom/sugarcube/app/base/data/source/CompositionRepository;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "instanceId", "Lcom/sugarcube/app/base/data/analytics/ProductParentType;", "n", "(Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;Lcom/sugarcube/decorate_engine/ObjectInstanceId;)Lcom/sugarcube/app/base/data/analytics/ProductParentType;", "Lcom/sugarcube/decorate_engine/Transform3D;", "transform", "LXH/N;", "w", "(Lcom/sugarcube/core/network/models/PlacedFurniture;Lcom/sugarcube/decorate_engine/Transform3D;)V", "Lcom/sugarcube/decorate_engine/ParentDetails;", "Lcom/sugarcube/core/network/models/ParentDetails;", "C", "(Lcom/sugarcube/decorate_engine/ParentDetails;)Lcom/sugarcube/core/network/models/ParentDetails;", "parentId", "", "attachmentSlot", "", "parentPath", "r", "(Lcom/sugarcube/core/network/models/PlacedFurniture;Lcom/sugarcube/decorate_engine/ObjectInstanceId;Ljava/lang/Integer;Ljava/util/List;)V", "Lcom/sugarcube/decorate_engine/CameraParameters;", "Lcom/sugarcube/decorate/internal/shared/EngineCameraParameters;", "Lcom/sugarcube/core/network/models/CameraParameters;", "B", "(Lcom/sugarcube/decorate_engine/CameraParameters;)Lcom/sugarcube/core/network/models/CameraParameters;", "Lcom/sugarcube/core/network/models/Composition;", "uiModelMap", "Ljava/io/File;", "thumbnailFile", "buildNumberPretty", "libraryVersions", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "catalogItemMap", "G", "(Lcom/sugarcube/core/network/models/Composition;Lcom/sugarcube/decorate_engine/SceneLayout;Ljava/util/HashMap;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Z)Lcom/sugarcube/core/network/models/Composition;", "hasWall2D", "hasWall3D", "hasStackable", "usesMirroringFeature", "usesSnapRotateFeature", "", "e", "(Lcom/sugarcube/decorate_engine/SceneLayout;ZZZZZ)Ljava/util/Map;", "catalogItem", "d", "(Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/decorate_engine/ModelScreenTransform;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "cloneSourceId", "Lcom/sugarcube/core/network/models/SmartaPlacement;", "smartaPlacement", "h", "(Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;Lcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/core/network/models/SmartaPlacement;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lcom/sugarcube/decorate_engine/CloneModelInstanceInfo;", "roomPolygonIdList", "v", "(Lcom/sugarcube/decorate_engine/CloneModelInstanceInfo;Lcom/sugarcube/core/network/models/SmartaPlacement;Ljava/util/List;)Lcom/sugarcube/decorate_engine/CloneModelInstanceInfo;", "m", "(Ljava/util/List;Lcom/sugarcube/core/network/models/SmartaPlacement;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "o", "(Lcom/sugarcube/core/network/models/SmartaPlacement;)Lcom/sugarcube/decorate_engine/Transform3D;", "Lcom/sugarcube/decorate_engine/AddModelInstanceInfo;", "u", "(Lcom/sugarcube/decorate_engine/AddModelInstanceInfo;Lcom/sugarcube/core/network/models/SmartaPlacement;Ljava/util/List;)Lcom/sugarcube/decorate_engine/AddModelInstanceInfo;", "cf", "isPlaceholder", "Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;", "f", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Ljava/lang/Boolean;)Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;", "Lcom/sugarcube/core/network/models/Polygon;", "polygons", "Lcom/sugarcube/decorate_engine/RoomPolygon;", "j", "(Ljava/util/List;)Ljava/util/List;", "Lcom/sugarcube/decorate_engine/StackingPolygon;", "k", "Lcom/sugarcube/core/network/models/CatalogCombinableNodeMeta;", "nodesMeta", "Lcom/sugarcube/decorate_engine/CombinableSlot;", "i", "EngineCameraParameters", "shared_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f115547a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.sugarcube.decorate_engine.ObjectInstanceIdType[] r0 = com.sugarcube.decorate_engine.ObjectInstanceIdType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.decorate_engine.ObjectInstanceIdType r1 = com.sugarcube.decorate_engine.ObjectInstanceIdType.Wall     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.decorate_engine.ObjectInstanceIdType r1 = com.sugarcube.decorate_engine.ObjectInstanceIdType.Model     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.sugarcube.decorate_engine.ObjectInstanceIdType r1 = com.sugarcube.decorate_engine.ObjectInstanceIdType.Floor     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f115547a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: RF.i.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.internal.shared.DecorateExtensionsKt", f = "DecorateExtensions.kt", l = {263, 269, 275, 278}, m = "save")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f115548c;

        /* renamed from: d  reason: collision with root package name */
        Object f115549d;

        /* renamed from: e  reason: collision with root package name */
        Object f115550e;

        /* renamed from: f  reason: collision with root package name */
        Object f115551f;

        /* renamed from: g  reason: collision with root package name */
        Object f115552g;

        /* renamed from: h  reason: collision with root package name */
        Object f115553h;

        /* renamed from: i  reason: collision with root package name */
        Object f115554i;

        /* renamed from: j  reason: collision with root package name */
        Object f115555j;

        /* renamed from: k  reason: collision with root package name */
        Object f115556k;

        /* renamed from: l  reason: collision with root package name */
        int f115557l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f115558m;

        /* renamed from: n  reason: collision with root package name */
        int f115559n;

        b(C17164e<? super b> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f115558m = obj;
            this.f115559n |= Integer.MIN_VALUE;
            return i.q((CachedCompiledComposition) null, (CompositionRepository) null, this);
        }
    }

    public static final ManifestPlane A(PlaneData planeData) {
        C17542s.j(planeData, "<this>");
        return new ManifestPlane(l(RoomPolygonType.Companion, planeData.getCategory()), planeData.getOrientation(), planeData.getDistance());
    }

    public static final CameraParameters B(com.sugarcube.decorate_engine.CameraParameters cameraParameters) {
        C17542s.j(cameraParameters, "<this>");
        return new CameraParameters(cameraParameters.getPos(), cameraParameters.getRotQuat(), (String) null, new CameraPerspective(cameraParameters.getAspect(), cameraParameters.getYfov(), cameraParameters.getNear(), cameraParameters.getFar(), cameraParameters.getCxyNormalized()), 4, (DefaultConstructorMarker) null);
    }

    public static final ParentDetails C(com.sugarcube.decorate_engine.ParentDetails parentDetails) {
        C17542s.j(parentDetails, "<this>");
        List<Double> pos = parentDetails.getPos();
        List<Double> rotQuat = parentDetails.getRotQuat();
        return new ParentDetails(parentDetails.getType().getStringValue(), pos, parentDetails.getSize(), rotQuat);
    }

    public static final SceneLayout D(CachedCompiledComposition cachedCompiledComposition) {
        C17542s.j(cachedCompiledComposition, "<this>");
        List<PlacedFurniture> placedFurnitureSet = cachedCompiledComposition.getComposition().getPlacedFurnitureSet();
        if (placedFurnitureSet == null) {
            placedFurnitureSet = C16877v.n();
        }
        Map<Integer, CachedCatalogItem> cachedCatalogItems = cachedCompiledComposition.getCachedCatalogItems();
        boolean z10 = true;
        Map<String, String> map = null;
        if (cachedCompiledComposition.getComposition().isDownload3D()) {
            C13868b bVar = C13868b.f118106a;
            String gltfPath = cachedCompiledComposition.getGltfPath();
            if (gltfPath == null || gltfPath.length() <= 0) {
                z10 = false;
            }
            bVar.a(z10, new h(cachedCompiledComposition));
            o oVar = new o(cachedCompiledComposition.getGltfPath());
            for (Map.Entry<Integer, CachedCatalogItem> value : cachedCatalogItems.entrySet()) {
                oVar.e((CachedCatalogItem) value.getValue());
            }
            CompositionSavedProperties savedProperties = cachedCompiledComposition.getComposition().getSavedProperties();
            List<Integer> erasedSegments = savedProperties != null ? savedProperties.getErasedSegments() : null;
            CompositionSavedProperties savedProperties2 = cachedCompiledComposition.getComposition().getSavedProperties();
            if (savedProperties2 != null) {
                map = savedProperties2.getWallPaint();
            }
            return oVar.m(erasedSegments, map);
        }
        o oVar2 = new o((String) null, 1, (DefaultConstructorMarker) null);
        for (PlacedFurniture next : placedFurnitureSet) {
            CachedCatalogItem cachedCatalogItem = cachedCatalogItems.get(next.getFurnitureId());
            if (cachedCatalogItem != null) {
                oVar2.j(next, cachedCatalogItem);
            }
        }
        CompositionSavedProperties savedProperties3 = cachedCompiledComposition.getComposition().getSavedProperties();
        List<Integer> erasedSegments2 = savedProperties3 != null ? savedProperties3.getErasedSegments() : null;
        CompositionSavedProperties savedProperties4 = cachedCompiledComposition.getComposition().getSavedProperties();
        if (savedProperties4 != null) {
            map = savedProperties4.getWallPaint();
        }
        return oVar2.p(erasedSegments2, map);
    }

    /* access modifiers changed from: private */
    public static final String E(CachedCompiledComposition cachedCompiledComposition) {
        int compositionId = cachedCompiledComposition.getComposition().getCompositionId();
        return "gltfPath " + compositionId;
    }

    @C16814e
    public static final CachedCompiledComposition F(CachedCompiledComposition cachedCompiledComposition, C13313e eVar, HashMap<ObjectInstanceId, k> hashMap, SceneLayout sceneLayout, boolean z10) {
        CachedCompiledComposition cachedCompiledComposition2 = cachedCompiledComposition;
        C17542s.j(cachedCompiledComposition2, "<this>");
        C17542s.j(eVar, "installationConfig");
        C17542s.j(hashMap, "modelMap");
        C17542s.j(sceneLayout, "sceneLayout");
        String thumbnailPath = sceneLayout.getThumbnailPath();
        File file = new File(thumbnailPath);
        if (file.exists() || z10) {
            HashMap hashMap2 = new HashMap(sceneLayout.getInstanceItems().size());
            CompiledComposition compiledComposition = cachedCompiledComposition.getCompiledComposition();
            return CachedCompiledComposition.copy$default(cachedCompiledComposition, CompiledComposition.copy$default(compiledComposition, G(compiledComposition.getComposition(), sceneLayout, hashMap, file, eVar.h(), eVar.k(), hashMap2, z10), (List) null, (SceneResponse) null, 6, (Object) null), hashMap2, (String) null, 4, (Object) null);
        }
        String uuid = cachedCompiledComposition.getCompositionUuid().toString();
        C17542s.i(uuid, "toString(...)");
        C13868b bVar = C13868b.f118106a;
        bVar.b("thumbnail (" + thumbnailPath + ") invalid for " + uuid, e.Decoration);
        return cachedCompiledComposition2;
    }

    @C16814e
    public static final Composition G(Composition composition, SceneLayout sceneLayout, HashMap<ObjectInstanceId, k> hashMap, File file, String str, String str2, HashMap<Integer, CachedCatalogItem> hashMap2, boolean z10) {
        HashMap hashMap3;
        boolean z11;
        HashMap<ObjectInstanceId, k> hashMap4 = hashMap;
        HashMap<Integer, CachedCatalogItem> hashMap5 = hashMap2;
        C17542s.j(composition, "<this>");
        C17542s.j(sceneLayout, "sceneLayout");
        C17542s.j(hashMap4, "uiModelMap");
        C17542s.j(file, "thumbnailFile");
        C17542s.j(str, "buildNumberPretty");
        C17542s.j(str2, "libraryVersions");
        C17542s.j(hashMap5, "catalogItemMap");
        ArrayList arrayList = new ArrayList();
        HashMap hashMap6 = new HashMap(hashMap4);
        Iterator<SceneLayoutInstanceItem> it = sceneLayout.getInstanceItems().iterator();
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        while (it.hasNext()) {
            SceneLayoutInstanceItem next = it.next();
            k kVar = (k) hashMap6.get(next.getInstanceId());
            if (kVar != null) {
                CachedCatalogItem d10 = kVar.d();
                int intValue = next.getInstanceId().getIntValue();
                boolean z17 = d10.isStackableChild() && sceneLayout.isLegacy2D();
                int id2 = d10.getId();
                String localItemNumber = d10.getCatalogItem().getLocalItemNumber();
                String valueOf = String.valueOf(intValue);
                Iterator<SceneLayoutInstanceItem> it2 = it;
                LocalProduct localProduct = new LocalProduct(kVar.d().getCatalogItem().getLocalItemNumber(), String.valueOf(kVar.d().getCatalogItem().getThumbUrl()));
                hashMap3 = hashMap6;
                FurnitureArtData furnitureArtData = d10.isWallPlaceable2D() ? new FurnitureArtData(1, 1, 1, 1) : null;
                String stackedPlaneId = z17 ? next.getStackedPlaneId() : null;
                List<Double> legacyRelativePosition = next.getLegacyRelativePosition();
                PosXYZ posXYZ = z17 ? legacyRelativePosition != null ? new PosXYZ(legacyRelativePosition.get(0).doubleValue(), legacyRelativePosition.get(1).doubleValue(), legacyRelativePosition.get(2).doubleValue()) : null : null;
                ObjectInstanceId parentInstanceId = next.getParentInstanceId();
                Long valueOf2 = z17 ? parentInstanceId != null ? Long.valueOf((long) parentInstanceId.getIntValue()) : null : null;
                Integer activeCombination = next.getActiveCombination();
                Integer num = (activeCombination == null || activeCombination.intValue() < 0) ? null : activeCombination;
                List<Integer> additionalContacts = next.getAdditionalContacts();
                List<Integer> list = (additionalContacts == null || additionalContacts.isEmpty()) ? null : additionalContacts;
                Boolean isMirrored = next.isMirrored();
                Boolean bool = Boolean.TRUE;
                FurnitureGfxAttributes furnitureGfxAttributes = r26;
                FurnitureGfxAttributes furnitureGfxAttributes2 = new FurnitureGfxAttributes(furnitureArtData, stackedPlaneId, posXYZ, valueOf2, num, d10.isMirroringCapable() ? Boolean.valueOf(C17542s.e(isMirrored, bool)) : null, list);
                PlacedFurniture placedFurniture = new PlacedFurniture(Integer.valueOf(intValue), Integer.valueOf(id2), valueOf, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, localProduct, furnitureGfxAttributes, (String) null, (Integer) null, (List) null, localItemNumber, 29688, (DefaultConstructorMarker) null);
                if (sceneLayout.is3D()) {
                    Transform3D relativeTransform = next.getRelativeTransform();
                    C17542s.g(relativeTransform);
                    w(placedFurniture, relativeTransform);
                    ObjectInstanceId parentInstanceId2 = next.getParentInstanceId();
                    C17542s.g(parentInstanceId2);
                    r(placedFurniture, parentInstanceId2, next.getParentAttachmentSlot(), next.getParentPath());
                    z11 = z16;
                } else {
                    ModelScreenTransform legacyScreenTransform = next.getLegacyScreenTransform();
                    if (legacyScreenTransform != null) {
                        z11 = z16;
                        placedFurniture.setPanoPosX(Double.valueOf((double) legacyScreenTransform.screenX));
                        placedFurniture.setPanoPosY(Double.valueOf((double) legacyScreenTransform.screenY));
                    } else {
                        z11 = z16;
                    }
                    if (d10.isFloorPlaceable()) {
                        ModelScreenTransform legacyScreenTransform2 = next.getLegacyScreenTransform();
                        if (legacyScreenTransform2 != null) {
                            placedFurniture.setHeadingRadians(Double.valueOf((double) legacyScreenTransform2.yawRadians));
                        }
                    } else {
                        placedFurniture.setHeadingRadians((Double) null);
                    }
                }
                if (d10.isWallPlaceable2D()) {
                    z12 = true;
                }
                if (d10.isWallPlaceable3D()) {
                    z13 = true;
                }
                if (C17542s.e(next.isMirrored(), bool)) {
                    z15 = true;
                }
                Integer activeCombination2 = next.getActiveCombination();
                z16 = (activeCombination2 != null ? activeCombination2.intValue() : -1) > 0 ? true : z11;
                if (d10.isStackableChild()) {
                    z14 = true;
                }
                arrayList.add(placedFurniture);
                if (!C17542s.e(kVar.d().getCatalogItem().getHidden(), bool)) {
                    hashMap5.put(Integer.valueOf(kVar.d().getId()), kVar.d());
                }
                Composition composition2 = composition;
                SceneLayout sceneLayout2 = sceneLayout;
                File file2 = file;
                String str3 = str;
                String str4 = str2;
                it = it2;
            } else {
                hashMap3 = hashMap6;
                boolean z18 = z16;
                Composition composition3 = composition;
                SceneLayout sceneLayout3 = sceneLayout;
                File file3 = file;
                String str5 = str;
                String str6 = str2;
            }
            hashMap6 = hashMap3;
        }
        CameraParameters cameraParameters = null;
        Map<String, Integer> e10 = e(sceneLayout, z12, z13, z14, z15, z16);
        CompositionSavedProperties savedProperties = composition.getSavedProperties();
        if (savedProperties == null) {
            savedProperties = new CompositionSavedProperties((String) null, (Object) null, (String) null, (String) null, (List) null, (Map) null, (Map) null, (CameraParameters) null, 255, (DefaultConstructorMarker) null);
        }
        CompositionSavedProperties compositionSavedProperties = savedProperties;
        String client = ClientNames.ANDROID.getClient();
        Map<String, String> roomPaint = sceneLayout.getRoomPaint();
        Map<String, String> x10 = roomPaint != null ? X.x(roomPaint) : null;
        CompositionSavedProperties savedProperties2 = composition.getSavedProperties();
        Map<String, String> wallPaint = savedProperties2 != null ? savedProperties2.getWallPaint() : null;
        List<Integer> erasedIds = sceneLayout.getErasedIds();
        com.sugarcube.decorate_engine.CameraParameters camera = sceneLayout.getCamera();
        if (camera != null) {
            cameraParameters = B(camera);
        }
        Composition copy$default = Composition.copy$default(composition, 0, (String) null, (Uri) null, (Uri) null, (Integer) null, (UUID) null, arrayList, (Instant) null, (Instant) null, false, (Uri) null, false, 0, (UUID) null, (String) null, compositionSavedProperties.copy(client, e10, str, str2, erasedIds, x10, wallPaint, cameraParameters), (Map) null, (Uri) null, 229311, (Object) null);
        if (z10) {
            return copy$default;
        }
        Uri fromFile = Uri.fromFile(file);
        V v10 = V.f144353a;
        String format = String.format("data:image/jpeg;base64,%s", Arrays.copyOf(new Object[]{Base64.getEncoder().encodeToString(C17423j.g(file))}, 1));
        C17542s.i(format, "format(...)");
        return Composition.copy$default(copy$default, 0, (String) null, (Uri) null, fromFile, (Integer) null, (UUID) null, (List) null, (Instant) null, (Instant) null, false, (Uri) null, false, 0, (UUID) null, format, (CompositionSavedProperties) null, (Map) null, (Uri) null, 245751, (Object) null);
    }

    public static final ObjectInstanceId d(IDecorateEngine iDecorateEngine, CachedCatalogItem cachedCatalogItem, ObjectInstanceId objectInstanceId, ModelScreenTransform modelScreenTransform) {
        C17542s.j(iDecorateEngine, "<this>");
        C17542s.j(cachedCatalogItem, "catalogItem");
        C17542s.j(objectInstanceId, "instanceId");
        C17542s.j(modelScreenTransform, "transform");
        o oVar = new o((String) null, 1, (DefaultConstructorMarker) null);
        oVar.i(cachedCatalogItem, objectInstanceId, modelScreenTransform);
        return iDecorateEngine.addCompoundModelInstance(oVar.o(), objectInstanceId);
    }

    private static final Map<String, Integer> e(SceneLayout sceneLayout, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Map<String, String> x10;
        Map c10 = X.c();
        ClientFeatures clientFeatures = ClientFeatures.DESIGN;
        c10.put(clientFeatures.getFeature(), Integer.valueOf(clientFeatures.getVersion()));
        List<Integer> erasedIds = sceneLayout.getErasedIds();
        if (erasedIds != null && (!erasedIds.isEmpty())) {
            ClientFeatures clientFeatures2 = ClientFeatures.ERASED;
            c10.put(clientFeatures2.getFeature(), Integer.valueOf(clientFeatures2.getVersion()));
        }
        if (z10) {
            ClientFeatures clientFeatures3 = ClientFeatures.WALL_ART;
            c10.put(clientFeatures3.getFeature(), Integer.valueOf(clientFeatures3.getVersion()));
        }
        if (z11) {
            ClientFeatures clientFeatures4 = ClientFeatures.WALL_PLACEABLES;
            c10.put(clientFeatures4.getFeature(), Integer.valueOf(clientFeatures4.getVersion()));
        }
        if (z12) {
            ClientFeatures clientFeatures5 = ClientFeatures.STACKABLE;
            c10.put(clientFeatures5.getFeature(), Integer.valueOf(clientFeatures5.getVersion()));
        }
        if (z13) {
            ClientFeatures clientFeatures6 = ClientFeatures.MIRRORING;
            c10.put(clientFeatures6.getFeature(), Integer.valueOf(clientFeatures6.getVersion()));
        }
        if (z14) {
            ClientFeatures clientFeatures7 = ClientFeatures.SNAP_ROTATE;
            c10.put(clientFeatures7.getFeature(), Integer.valueOf(clientFeatures7.getVersion()));
        }
        Map<String, String> roomPaint = sceneLayout.getRoomPaint();
        if (!(roomPaint == null || (x10 = X.x(roomPaint)) == null || !(!x10.isEmpty()))) {
            ClientFeatures clientFeatures8 = ClientFeatures.WALL_PAINT;
            c10.put(clientFeatures8.getFeature(), Integer.valueOf(clientFeatures8.getVersion()));
            ClientFeatures clientFeatures9 = ClientFeatures.WALL_PAINT_INPAINT;
            c10.put(clientFeatures9.getFeature(), Integer.valueOf(clientFeatures9.getVersion()));
        }
        Map<String, Integer> b10 = X.b(c10);
        if (!b10.isEmpty()) {
            return b10;
        }
        return null;
    }

    public static final SceneLayoutAssetItem f(CachedCatalogItem cachedCatalogItem, Boolean bool) {
        String str;
        List<List<Integer>> list;
        List<Integer> list2;
        List<List<Integer>> list3;
        List<StackingPolygon> list4;
        List<PlaceableAnchor> anchors;
        C17542s.j(cachedCatalogItem, "cf");
        SceneLayoutAssetItem sceneLayoutAssetItem = new SceneLayoutAssetItem((String) null, false, 0, 0, (List) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (List) null, (CombinablePlugRules) null, (List) null, (List) null, (List) null, (List) null, 65535, (DefaultConstructorMarker) null);
        sceneLayoutAssetItem.setPlaceholder(bool != null ? bool.booleanValue() : !cachedCatalogItem.isModelCached());
        if (!sceneLayoutAssetItem.isPlaceholder()) {
            str = cachedCatalogItem.getModelFile().getAbsolutePath();
            C17542s.i(str, "getAbsolutePath(...)");
        } else {
            Uri assetUrl = cachedCatalogItem.getCatalogItem().getAssetUrl();
            if (assetUrl == null || (str = assetUrl.getLastPathSegment()) == null) {
                str = "";
            }
        }
        sceneLayoutAssetItem.setAssetPath(str);
        int size = cachedCatalogItem.getBoxMin().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(Double.valueOf(cachedCatalogItem.getBoxMin().get(i10).doubleValue()));
        }
        sceneLayoutAssetItem.setBoxMin(arrayList);
        int size2 = cachedCatalogItem.getBoxMax().size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.add(Double.valueOf(cachedCatalogItem.getBoxMax().get(i11).doubleValue()));
        }
        sceneLayoutAssetItem.setBoxMax(arrayList2);
        sceneLayoutAssetItem.setProductId(cachedCatalogItem.getId());
        if (cachedCatalogItem.isFloorPlaceable()) {
            sceneLayoutAssetItem.addFeatureFlag(FeatureFlagBit.CanPlaceOnFloor);
        }
        if (cachedCatalogItem.isWallPlaceableAny()) {
            sceneLayoutAssetItem.addFeatureFlag(FeatureFlagBit.CanPlaceOnWall);
        }
        if (cachedCatalogItem.isStackableParent()) {
            sceneLayoutAssetItem.setStackingPolygons(k(cachedCatalogItem.getStackingPolygons()));
        }
        if (cachedCatalogItem.isStackableChild()) {
            sceneLayoutAssetItem.addFeatureFlag(FeatureFlagBit.StackableChild);
        }
        if (cachedCatalogItem.isCombinableChild()) {
            sceneLayoutAssetItem.addFeatureFlag(FeatureFlagBit.CombinableChild);
        }
        if (cachedCatalogItem.isCombinableParent()) {
            sceneLayoutAssetItem.setCombinableSlots(i(cachedCatalogItem.getCombinableNodesMeta()));
        }
        if (cachedCatalogItem.getHasPlaceables()) {
            CatalogPlaceableMetadata placeables = cachedCatalogItem.getPlaceables();
            if (!(placeables == null || (anchors = placeables.getAnchors()) == null)) {
                int size3 = anchors.size();
                ArrayList arrayList3 = new ArrayList(size3);
                for (int i12 = 0; i12 < size3; i12++) {
                    String category = anchors.get(i12).getCategory();
                    if (category == null) {
                        category = "";
                    }
                    arrayList3.add(new com.sugarcube.decorate_engine.PlaceableAnchor(category, anchors.get(i12).getConstraint(), anchors.get(i12).getMatrixModel()));
                }
                sceneLayoutAssetItem.setAnchors(arrayList3);
            }
            CatalogPlaceableMetadata placeables2 = cachedCatalogItem.getPlaceables();
            if (placeables2 == null || (list = placeables2.getCombinations()) == null) {
                list = C16877v.n();
            }
            sceneLayoutAssetItem.setCombinations(list);
            CatalogPlaceableMetadata placeables3 = cachedCatalogItem.getPlaceables();
            if (placeables3 == null || (list2 = placeables3.getStackables()) == null) {
                list2 = C16877v.n();
            }
            sceneLayoutAssetItem.setStackableSetIndices(list2);
            CatalogPlaceableMetadata placeables4 = cachedCatalogItem.getPlaceables();
            if (placeables4 == null || (list3 = placeables4.getCombinations()) == null) {
                list3 = C16877v.n();
            }
            sceneLayoutAssetItem.setCombinations(list3);
            List<StackableAlternate> alternateStackingPolygons = cachedCatalogItem.getAlternateStackingPolygons();
            int size4 = alternateStackingPolygons.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i13 = 0; i13 < size4; i13++) {
                List<Polygon> polygons = alternateStackingPolygons.get(i13).getPolygons();
                if (polygons == null || (list4 = k(polygons)) == null) {
                    list4 = C16877v.n();
                }
                arrayList4.add(list4);
            }
            sceneLayoutAssetItem.setStackingPolygonAlternatives(arrayList4);
        }
        return sceneLayoutAssetItem;
    }

    public static /* synthetic */ SceneLayoutAssetItem g(CachedCatalogItem cachedCatalogItem, Boolean bool, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bool = null;
        }
        return f(cachedCatalogItem, bool);
    }

    public static final ObjectInstanceId h(IDecorateEngine iDecorateEngine, ObjectInstanceId objectInstanceId, SmartaPlacement smartaPlacement) {
        IDecorateEngine iDecorateEngine2 = iDecorateEngine;
        C17542s.j(iDecorateEngine2, "<this>");
        ObjectInstanceId objectInstanceId2 = objectInstanceId;
        C17542s.j(objectInstanceId2, "cloneSourceId");
        return iDecorateEngine2.cloneModelInstance(v(new CloneModelInstanceInfo(0, 0, 0, 0, (double[]) null, (double[]) null, objectInstanceId2, (ObjectInstanceId) null, (ModelScreenTransform) null, (ObjectInstanceId) null, (Transform3D) null, 1983, (DefaultConstructorMarker) null), smartaPlacement, iDecorateEngine.getRoomPolygonIdList()));
    }

    public static final List<CombinableSlot> i(List<CatalogCombinableNodeMeta> list) {
        if (list == null) {
            Log.e(AnyKt.SUGARCUBE_TAG, "combinable parent had null combinable nodesMeta!");
            return C16877v.n();
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            List<List<Double>> matrixModel = list.get(i10).getMatrixModel();
            if (matrixModel == null) {
                matrixModel = C16877v.n();
            }
            String category = list.get(i10).getCategory();
            if (category == null) {
                category = "combinableSlot_" + i10;
            }
            arrayList.add(new CombinableSlot(matrixModel, category));
        }
        return arrayList;
    }

    public static final List<RoomPolygon> j(List<Polygon> list) {
        RoomPolygonType l10;
        List<List<Double>> n10;
        C17542s.j(list, "polygons");
        ArrayList arrayList = new ArrayList();
        for (Polygon next : list) {
            String category = next.getCategory();
            if (!(category == null || (l10 = l(RoomPolygonType.Companion, category)) == RoomPolygonType.None || l10 == RoomPolygonType.StackingSurface)) {
                Integer id2 = next.getId();
                int intValue = id2 != null ? id2.intValue() : -1;
                List<List<Double>> transform = next.getTransform();
                if (transform == null) {
                    transform = C16877v.n();
                }
                List<List<Double>> list2 = transform;
                PolygonParameters parameters = next.getParameters();
                if (parameters == null || (n10 = parameters.getVertices()) == null) {
                    n10 = C16877v.n();
                }
                List<List<Double>> list3 = n10;
                PolygonParameters parameters2 = next.getParameters();
                arrayList.add(new RoomPolygon(intValue, l10, list2, list3, parameters2 != null ? parameters2.getIndices() : null, next.getChildren()));
            }
        }
        return C16877v.t1(arrayList);
    }

    public static final List<StackingPolygon> k(List<Polygon> list) {
        List<List<Double>> n10;
        C17542s.j(list, "polygons");
        ArrayList arrayList = new ArrayList();
        for (Polygon next : list) {
            String category = next.getCategory();
            if (category == null) {
                category = "";
            }
            if (C17542s.e(category, "stackable")) {
                Integer id2 = next.getId();
                Integer num = next.getId() != null ? 0 : null;
                List<List<Double>> transform = next.getTransform();
                if (transform == null) {
                    transform = C16877v.n();
                }
                List<List<Double>> list2 = transform;
                PolygonParameters parameters = next.getParameters();
                if (parameters == null || (n10 = parameters.getVertices()) == null) {
                    n10 = C16877v.n();
                }
                List<List<Double>> list3 = n10;
                PolygonParameters parameters2 = next.getParameters();
                arrayList.add(new StackingPolygon(id2, num, list2, list3, parameters2 != null ? parameters2.getIndices() : null));
            }
        }
        return C16877v.t1(arrayList);
    }

    public static final RoomPolygonType l(RoomPolygonType.Companion companion, String str) {
        RoomPolygonType roomPolygonType;
        C17542s.j(companion, "<this>");
        C17542s.j(str, "str");
        RoomPolygonType[] values = RoomPolygonType.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                roomPolygonType = null;
                break;
            }
            roomPolygonType = values[i10];
            if (C17542s.e(roomPolygonType.getStringValue(), str)) {
                break;
            }
            i10++;
        }
        return roomPolygonType == null ? RoomPolygonType.None : roomPolygonType;
    }

    public static final ObjectInstanceId m(List<ObjectInstanceId> list, SmartaPlacement smartaPlacement) {
        C17542s.j(list, "roomPolygonIdList");
        C17542s.j(smartaPlacement, "smartaPlacement");
        ObjectInstanceId kNone = ObjectInstanceId.Companion.getKNone();
        for (ObjectInstanceId next : list) {
            if (next.getIdIndex() == smartaPlacement.getParentAttachment()) {
                return next;
            }
            if (next.isFloor() && C17542s.e(kNone, ObjectInstanceId.Companion.getKNone())) {
                kNone = next;
            }
        }
        return kNone;
    }

    public static final ProductParentType n(IDecorateEngine iDecorateEngine, ObjectInstanceId objectInstanceId) {
        C17542s.j(iDecorateEngine, "<this>");
        ObjectInstanceIdType idType = objectInstanceId != null ? iDecorateEngine.getInstanceParent(objectInstanceId).getIdType() : null;
        int i10 = idType == null ? -1 : a.f115547a[idType.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? ProductParentType.None : ProductParentType.Floor : ProductParentType.Furniture : ProductParentType.Wall;
    }

    public static final Transform3D o(SmartaPlacement smartaPlacement) {
        C17542s.j(smartaPlacement, "smartaPlacement");
        Transform3D transform3D = new Transform3D((List) null, (List) null, 3, (DefaultConstructorMarker) null);
        transform3D.setPos(C16877v.q(Double.valueOf((double) smartaPlacement.getX()), Double.valueOf((double) smartaPlacement.getY()), Double.valueOf((double) smartaPlacement.getZ())));
        transform3D.setRotQuat(C16877v.q(Double.valueOf((double) smartaPlacement.getHeadingI()), Double.valueOf((double) smartaPlacement.getHeadingJ()), Double.valueOf((double) smartaPlacement.getHeadingK()), Double.valueOf((double) smartaPlacement.getHeading())));
        return transform3D;
    }

    public static final ModelScreenTransform p(PlacedFurniture placedFurniture) {
        C17542s.j(placedFurniture, "<this>");
        Double panoPosX = placedFurniture.getPanoPosX();
        double d10 = 0.0d;
        float doubleValue = (float) (panoPosX != null ? panoPosX.doubleValue() : 0.0d);
        Double panoPosY = placedFurniture.getPanoPosY();
        float doubleValue2 = (float) (panoPosY != null ? panoPosY.doubleValue() : 0.0d);
        Double headingRadians = placedFurniture.getHeadingRadians();
        if (headingRadians != null) {
            d10 = headingRadians.doubleValue();
        }
        return new ModelScreenTransform(doubleValue, doubleValue2, (float) d10, true, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    @XH.C16814e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(com.sugarcube.app.base.data.database.CachedCompiledComposition r19, com.sugarcube.app.base.data.source.CompositionRepository r20, dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCompiledComposition> r21) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof RF.i.b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            RF.i$b r3 = (RF.i.b) r3
            int r4 = r3.f115559n
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f115559n = r4
            goto L_0x001e
        L_0x0019:
            RF.i$b r3 = new RF.i$b
            r3.<init>(r2)
        L_0x001e:
            java.lang.Object r4 = r3.f115558m
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f115559n
            java.lang.String r7 = " "
            r8 = 0
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            if (r6 == 0) goto L_0x00e1
            if (r6 == r12) goto L_0x00b9
            if (r6 == r11) goto L_0x0090
            if (r6 == r10) goto L_0x0068
            if (r6 != r9) goto L_0x0060
            java.lang.Object r0 = r3.f115556k
            com.sugarcube.core.network.models.Composition r0 = (com.sugarcube.core.network.models.Composition) r0
            java.lang.Object r0 = r3.f115555j
            com.sugarcube.core.network.models.Composition r0 = (com.sugarcube.core.network.models.Composition) r0
            java.lang.Object r0 = r3.f115554i
            com.sugarcube.core.network.models.Composition r0 = (com.sugarcube.core.network.models.Composition) r0
            java.lang.Object r0 = r3.f115553h
            kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
            java.lang.Object r1 = r3.f115552g
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            java.lang.Object r2 = r3.f115551f
            com.sugarcube.app.base.data.database.CachedCompiledComposition r2 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r2
            java.lang.Object r5 = r3.f115550e
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r5 = r3.f115549d
            com.sugarcube.app.base.data.source.CompositionRepository r5 = (com.sugarcube.app.base.data.source.CompositionRepository) r5
            java.lang.Object r3 = r3.f115548c
            com.sugarcube.app.base.data.database.CachedCompiledComposition r3 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r3
            XH.y.b(r4)
            goto L_0x017c
        L_0x0060:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0068:
            java.lang.Object r0 = r3.f115553h
            kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
            java.lang.Object r1 = r3.f115552g
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            java.lang.Object r2 = r3.f115551f
            com.sugarcube.app.base.data.database.CachedCompiledComposition r2 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r2
            java.lang.Object r6 = r3.f115550e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r10 = r3.f115549d
            com.sugarcube.app.base.data.source.CompositionRepository r10 = (com.sugarcube.app.base.data.source.CompositionRepository) r10
            java.lang.Object r11 = r3.f115548c
            com.sugarcube.app.base.data.database.CachedCompiledComposition r11 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r11
            XH.y.b(r4)
            r17 = r4
            r4 = r0
            r0 = r11
            r11 = r17
            r18 = r10
            r10 = r1
            r1 = r18
            goto L_0x0132
        L_0x0090:
            java.lang.Object r0 = r3.f115556k
            com.sugarcube.core.network.models.Composition r0 = (com.sugarcube.core.network.models.Composition) r0
            java.lang.Object r0 = r3.f115555j
            com.sugarcube.core.network.models.Composition r0 = (com.sugarcube.core.network.models.Composition) r0
            java.lang.Object r0 = r3.f115554i
            com.sugarcube.core.network.models.Composition r0 = (com.sugarcube.core.network.models.Composition) r0
            java.lang.Object r0 = r3.f115553h
            kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
            java.lang.Object r1 = r3.f115552g
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            java.lang.Object r2 = r3.f115551f
            com.sugarcube.app.base.data.database.CachedCompiledComposition r2 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r2
            java.lang.Object r5 = r3.f115550e
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r5 = r3.f115549d
            com.sugarcube.app.base.data.source.CompositionRepository r5 = (com.sugarcube.app.base.data.source.CompositionRepository) r5
            java.lang.Object r3 = r3.f115548c
            com.sugarcube.app.base.data.database.CachedCompiledComposition r3 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r3
            XH.y.b(r4)
            goto L_0x0207
        L_0x00b9:
            java.lang.Object r0 = r3.f115553h
            kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
            java.lang.Object r1 = r3.f115552g
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            java.lang.Object r2 = r3.f115551f
            com.sugarcube.app.base.data.database.CachedCompiledComposition r2 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r2
            java.lang.Object r6 = r3.f115550e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r9 = r3.f115549d
            com.sugarcube.app.base.data.source.CompositionRepository r9 = (com.sugarcube.app.base.data.source.CompositionRepository) r9
            java.lang.Object r10 = r3.f115548c
            com.sugarcube.app.base.data.database.CachedCompiledComposition r10 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r10
            XH.y.b(r4)
            r17 = r4
            r4 = r0
            r0 = r10
            r10 = r17
            r18 = r9
            r9 = r1
            r1 = r18
            goto L_0x01ac
        L_0x00e1:
            XH.y.b(r4)
            kotlin.jvm.internal.O r4 = new kotlin.jvm.internal.O
            r4.<init>()
            com.sugarcube.core.network.models.CompiledComposition r6 = r19.getCompiledComposition()
            r4.f144348a = r6
            kotlin.jvm.internal.O r6 = new kotlin.jvm.internal.O
            r6.<init>()
            T r13 = r4.f144348a
            com.sugarcube.core.network.models.CompiledComposition r13 = (com.sugarcube.core.network.models.CompiledComposition) r13
            com.sugarcube.core.network.models.Composition r13 = r13.getComposition()
            r6.f144348a = r13
            boolean r13 = r13.isStock()
            if (r13 != 0) goto L_0x018e
            T r13 = r6.f144348a
            com.sugarcube.core.network.models.Composition r13 = (com.sugarcube.core.network.models.Composition) r13
            java.util.UUID r13 = r13.getCompositionUuid()
            com.sugarcube.core.network.models.Composition r13 = r1.getComposition((java.util.UUID) r13)
            if (r13 != 0) goto L_0x0114
            goto L_0x018e
        L_0x0114:
            T r11 = r6.f144348a
            com.sugarcube.core.network.models.Composition r11 = (com.sugarcube.core.network.models.Composition) r11
            r3.f115548c = r0
            r3.f115549d = r1
            r3.f115550e = r2
            r3.f115551f = r0
            r3.f115552g = r4
            r3.f115553h = r6
            r3.f115559n = r10
            java.lang.Object r10 = r1.updateComposition(r11, r3)
            if (r10 != r5) goto L_0x012d
            return r5
        L_0x012d:
            r11 = r10
            r10 = r4
            r4 = r6
            r6 = r2
            r2 = r0
        L_0x0132:
            com.sugarcube.core.network.models.Composition r11 = (com.sugarcube.core.network.models.Composition) r11
            if (r11 == 0) goto L_0x018c
            YE.b r12 = YE.C13868b.f118106a
            java.util.UUID r13 = r11.getCompositionUuid()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "composition updated "
            r14.append(r15)
            r14.append(r13)
            r14.append(r7)
            java.lang.String r7 = r14.toString()
            YE.e r13 = YE.e.Decoration
            r12.b(r7, r13)
            java.util.UUID r7 = r11.getCompositionUuid()
            r3.f115548c = r0
            r3.f115549d = r1
            r3.f115550e = r6
            r3.f115551f = r2
            r3.f115552g = r10
            r3.f115553h = r4
            r3.f115554i = r11
            r3.f115555j = r11
            r3.f115556k = r11
            r3.f115557l = r8
            r3.f115559n = r9
            java.lang.Object r0 = r1.fetchCompiledComposition(r7, r3)
            if (r0 != r5) goto L_0x0176
            return r5
        L_0x0176:
            r1 = r10
            r17 = r4
            r4 = r0
            r0 = r17
        L_0x017c:
            com.sugarcube.core.network.models.CompiledComposition r4 = (com.sugarcube.core.network.models.CompiledComposition) r4
            if (r4 == 0) goto L_0x0188
            r1.f144348a = r4
            com.sugarcube.core.network.models.Composition r3 = r4.getComposition()
            r0.f144348a = r3
        L_0x0188:
            r10 = r1
        L_0x0189:
            r4 = r2
            goto L_0x0219
        L_0x018c:
            r0 = r4
            goto L_0x0189
        L_0x018e:
            T r9 = r6.f144348a
            com.sugarcube.core.network.models.Composition r9 = (com.sugarcube.core.network.models.Composition) r9
            r3.f115548c = r0
            r3.f115549d = r1
            r3.f115550e = r2
            r3.f115551f = r0
            r3.f115552g = r4
            r3.f115553h = r6
            r3.f115559n = r12
            java.lang.Object r9 = r1.createComposition(r9, r3)
            if (r9 != r5) goto L_0x01a7
            return r5
        L_0x01a7:
            r10 = r9
            r9 = r4
            r4 = r6
            r6 = r2
            r2 = r0
        L_0x01ac:
            com.sugarcube.core.network.models.Composition r10 = (com.sugarcube.core.network.models.Composition) r10
            if (r10 == 0) goto L_0x0215
            YE.b r12 = YE.C13868b.f118106a
            T r13 = r4.f144348a
            com.sugarcube.core.network.models.Composition r13 = (com.sugarcube.core.network.models.Composition) r13
            java.util.UUID r13 = r13.getCompositionUuid()
            java.util.UUID r14 = r10.getCompositionUuid()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r11 = "new composition created "
            r15.append(r11)
            r15.append(r13)
            java.lang.String r11 = " --> "
            r15.append(r11)
            r15.append(r14)
            r15.append(r7)
            java.lang.String r7 = r15.toString()
            YE.e r11 = YE.e.Decoration
            r12.b(r7, r11)
            java.util.UUID r7 = r10.getCompositionUuid()
            r3.f115548c = r0
            r3.f115549d = r1
            r3.f115550e = r6
            r3.f115551f = r2
            r3.f115552g = r9
            r3.f115553h = r4
            r3.f115554i = r10
            r3.f115555j = r10
            r3.f115556k = r10
            r3.f115557l = r8
            r0 = 2
            r3.f115559n = r0
            java.lang.Object r0 = r1.fetchCompiledComposition(r7, r3)
            if (r0 != r5) goto L_0x0201
            return r5
        L_0x0201:
            r1 = r9
            r17 = r4
            r4 = r0
            r0 = r17
        L_0x0207:
            com.sugarcube.core.network.models.CompiledComposition r4 = (com.sugarcube.core.network.models.CompiledComposition) r4
            if (r4 == 0) goto L_0x0188
            r1.f144348a = r4
            com.sugarcube.core.network.models.Composition r3 = r4.getComposition()
            r0.f144348a = r3
            goto L_0x0188
        L_0x0215:
            r0 = r4
            r10 = r9
            goto L_0x0189
        L_0x0219:
            T r1 = r10.f144348a
            r11 = r1
            com.sugarcube.core.network.models.CompiledComposition r11 = (com.sugarcube.core.network.models.CompiledComposition) r11
            T r0 = r0.f144348a
            r12 = r0
            com.sugarcube.core.network.models.Composition r12 = (com.sugarcube.core.network.models.Composition) r12
            r15 = 6
            r16 = 0
            r13 = 0
            r14 = 0
            com.sugarcube.core.network.models.CompiledComposition r5 = com.sugarcube.core.network.models.CompiledComposition.copy$default(r11, r12, r13, r14, r15, r16)
            r10.f144348a = r5
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            com.sugarcube.app.base.data.database.CachedCompiledComposition r0 = com.sugarcube.app.base.data.database.CachedCompiledComposition.copy$default(r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: RF.i.q(com.sugarcube.app.base.data.database.CachedCompiledComposition, com.sugarcube.app.base.data.source.CompositionRepository, dI.e):java.lang.Object");
    }

    public static final void r(PlacedFurniture placedFurniture, ObjectInstanceId objectInstanceId, Integer num, List<com.sugarcube.decorate_engine.ParentDetails> list) {
        C17542s.j(placedFurniture, "<this>");
        C17542s.j(objectInstanceId, "parentId");
        boolean z10 = false;
        if (objectInstanceId.isModel()) {
            C13868b bVar = C13868b.f118106a;
            if (num != null && num.intValue() >= 0) {
                z10 = true;
            }
            bVar.a(z10, new f(num));
            placedFurniture.setParentId(String.valueOf(objectInstanceId.getIntValue()));
            C17542s.g(num);
            placedFurniture.setParentAttachment(num);
            return;
        }
        C13868b bVar2 = C13868b.f118106a;
        if (num == null || num.intValue() < 0) {
            z10 = true;
        }
        bVar2.a(z10, new g(num));
        placedFurniture.setParentId("SURFACE");
        placedFurniture.setParentAttachment(Integer.valueOf(objectInstanceId.getIdIndex()));
        if (list != null) {
            Iterable<com.sugarcube.decorate_engine.ParentDetails> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (com.sugarcube.decorate_engine.ParentDetails C10 : iterable) {
                arrayList.add(C(C10));
            }
            placedFurniture.setParentPath(arrayList);
        }
    }

    /* access modifiers changed from: private */
    public static final String s(Integer num) {
        return "attachmentSlot: " + num;
    }

    /* access modifiers changed from: private */
    public static final String t(Integer num) {
        return "attachmentSlot: " + num;
    }

    public static final AddModelInstanceInfo u(AddModelInstanceInfo addModelInstanceInfo, SmartaPlacement smartaPlacement, List<ObjectInstanceId> list) {
        C17542s.j(addModelInstanceInfo, "<this>");
        if (smartaPlacement == null) {
            return addModelInstanceInfo;
        }
        addModelInstanceInfo.getInstanceItem().setRelativeTransform(o(smartaPlacement));
        SceneLayoutInstanceItem instanceItem = addModelInstanceInfo.getInstanceItem();
        Integer t10 = C15854t.t(smartaPlacement.getParentId());
        instanceItem.setParentInstanceId(t10 != null ? new ObjectInstanceId(t10.intValue()) : list != null ? m(list, smartaPlacement) : null);
        return addModelInstanceInfo;
    }

    public static final CloneModelInstanceInfo v(CloneModelInstanceInfo cloneModelInstanceInfo, SmartaPlacement smartaPlacement, List<ObjectInstanceId> list) {
        C17542s.j(cloneModelInstanceInfo, "<this>");
        if (smartaPlacement != null) {
            cloneModelInstanceInfo.setParentInstanceId(ObjectInstanceId.Companion.getKNone());
            cloneModelInstanceInfo.setRelativeTransform(o(smartaPlacement));
            cloneModelInstanceInfo.setTransform(new ModelScreenTransform());
            if (list != null) {
                cloneModelInstanceInfo.setParentInstanceId(m(list, smartaPlacement));
            }
        }
        return cloneModelInstanceInfo;
    }

    public static final void w(PlacedFurniture placedFurniture, Transform3D transform3D) {
        C17542s.j(placedFurniture, "<this>");
        C17542s.j(transform3D, "transform");
        placedFurniture.setRelativeRot3D(transform3D.getRotQuat());
        placedFurniture.setRelativePos3D(transform3D.getPos());
    }

    public static final ManifestLight x(DirectionalLightData directionalLightData) {
        C17542s.j(directionalLightData, "<this>");
        return new ManifestLight(directionalLightData.getId(), directionalLightData.getColor(), directionalLightData.getIntensity(), directionalLightData.getSize(), directionalLightData.getPosition(), directionalLightData.getVolume(), directionalLightData.getDirection());
    }

    public static final ManifestLight y(PointLightData pointLightData) {
        C17542s.j(pointLightData, "<this>");
        return new ManifestLight(pointLightData.getId(), (List) pointLightData.getColor(), pointLightData.getIntensity(), pointLightData.getSize(), (List) pointLightData.getPosition(), (List) pointLightData.getVolume(), (List) null, 64, (DefaultConstructorMarker) null);
    }

    public static final DecorateEngineManifest z(Manifest manifest) {
        List<Polygon> polygons;
        C17542s.j(manifest, "<this>");
        DecorateEngineManifest decorateEngineManifest = new DecorateEngineManifest(0, (ManifestIntrinsics) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (List) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (List) null, (List) null, (List) null, 32767, (DefaultConstructorMarker) null);
        decorateEngineManifest.setIntrinsics(new ManifestIntrinsics(manifest.getIntrinsics().getFx(), manifest.getIntrinsics().getFy(), manifest.getIntrinsics().getCx(), manifest.getIntrinsics().getCy(), 0, 0, 48, (DefaultConstructorMarker) null));
        decorateEngineManifest.setEquirectangular(manifest.getEquirectangular());
        ArrayList arrayList = new ArrayList();
        for (DirectionalLightData x10 : manifest.getLightingData().getLightsData().getDirectionalLights()) {
            arrayList.add(x(x10));
        }
        for (PointLightData y10 : manifest.getLightingData().getLightsData().getPointLights()) {
            arrayList.add(y(y10));
        }
        decorateEngineManifest.setLights(C16877v.t1(arrayList));
        decorateEngineManifest.setPano(manifest.getPano());
        decorateEngineManifest.setDepthOcclusion(manifest.getDepthOcclusion());
        decorateEngineManifest.setSegmentation(manifest.getSegmentation());
        Uri segmentationOld = manifest.getSegmentationOld();
        Uri segmentation = manifest.getSegmentation();
        Uri uri = Uri.EMPTY;
        Uri uri2 = null;
        if (!C17542s.e(segmentation, uri)) {
            segmentationOld = null;
        }
        if (segmentationOld == null) {
            C17542s.i(uri, "EMPTY");
            segmentationOld = uri;
        }
        decorateEngineManifest.setSegmentationOld(segmentationOld);
        decorateEngineManifest.setInpaintPano(manifest.getInpaintPano());
        decorateEngineManifest.setInpaintDepthOcclusion(manifest.getInpaintDepthOcclusion());
        decorateEngineManifest.setInpaintSegmentation(manifest.getInpaintSegmentation());
        Uri inpaintSegmentationOld = manifest.getInpaintSegmentationOld();
        if (C17542s.e(manifest.getInpaintSegmentation(), uri)) {
            uri2 = inpaintSegmentationOld;
        }
        if (uri2 == null) {
            C17542s.i(uri, "EMPTY");
        } else {
            uri = uri2;
        }
        decorateEngineManifest.setInpaintSegmentationOld(uri);
        Collection planes = manifest.getInpaintPlanesData().getPlanes();
        if (planes.isEmpty()) {
            planes = manifest.getPlanesData().getPlanes();
        }
        List list = (List) planes;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(A((PlaneData) list.get(i10)));
        }
        decorateEngineManifest.setRoomPlanes(arrayList2);
        PlanePolygonSet planePolygonSet = manifest.getPlanePolygonSet();
        if (!(planePolygonSet == null || (polygons = planePolygonSet.getPolygons()) == null)) {
            decorateEngineManifest.setRoomPolygons(j(polygons));
            decorateEngineManifest.setStackingPolygons(k(polygons));
            List<List<Integer>> instancesToStackables = manifest.getSegmentationMeta().getInstancesToStackables();
            if (instancesToStackables != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (List next : instancesToStackables) {
                    if (next.size() > 1) {
                        linkedHashMap.put(next.get(1), next.get(0));
                    }
                }
                for (StackingPolygon next2 : decorateEngineManifest.getStackingPolygons()) {
                    Integer id2 = next2.getId();
                    if (id2 != null) {
                        int intValue = id2.intValue();
                        if (linkedHashMap.keySet().contains(Integer.valueOf(intValue))) {
                            next2.setErasableId((Integer) linkedHashMap.get(Integer.valueOf(intValue)));
                        }
                    }
                }
            }
        }
        return decorateEngineManifest;
    }
}
