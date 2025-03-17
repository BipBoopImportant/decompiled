package hG;

import OE.C13313e;
import RF.i;
import RF.k;
import YE.C13868b;
import YE.e;
import YH.X;
import android.net.Uri;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.CachedCompiledComposition;
import com.sugarcube.app.base.data.source.CompositionRepository;
import com.sugarcube.core.network.models.CameraParameters;
import com.sugarcube.core.network.models.ClientFeatures;
import com.sugarcube.core.network.models.ClientNames;
import com.sugarcube.core.network.models.CompiledComposition;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.CompositionSavedProperties;
import com.sugarcube.core.network.models.FurnitureArtData;
import com.sugarcube.core.network.models.FurnitureGfxAttributes;
import com.sugarcube.core.network.models.LocalProduct;
import com.sugarcube.core.network.models.PlacedFurniture;
import com.sugarcube.core.network.models.PosXYZ;
import com.sugarcube.core.network.models.SceneResponse;
import com.sugarcube.decorate.v2.internal.manager.CompositionUpdater;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import com.sugarcube.decorate_engine.SceneLayout;
import com.sugarcube.decorate_engine.SceneLayoutInstanceItem;
import com.sugarcube.decorate_engine.Transform3D;
import dI.C17164e;
import jI.C17423j;
import java.io.File;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kG.C17497c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0001\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\"\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\fj\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017`\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010$JL\u0010(\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\n2\"\u0010'\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H@¢\u0006\u0004\b(\u0010)JL\u0010-\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u000b\u001a\u00020\n2\"\u0010'\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010,\u001a\u00020\u0019H@¢\u0006\u0004\b-\u0010.J \u0010/\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0002H@¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00102¨\u00063"}, d2 = {"LhG/a;", "Lcom/sugarcube/decorate/v2/internal/manager/CompositionUpdater;", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "compositionRepository", "LOE/e;", "installationConfig", "<init>", "(Lcom/sugarcube/app/base/data/source/CompositionRepository;LOE/e;)V", "Lcom/sugarcube/core/network/models/Composition;", "composition", "Lcom/sugarcube/decorate_engine/SceneLayout;", "sceneLayout", "Ljava/util/HashMap;", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "LRF/k;", "Lkotlin/collections/HashMap;", "uiModelMap", "Ljava/io/File;", "thumbnailFile", "", "buildNumberPretty", "libraryVersions", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "catalogItemMap", "", "isForSmarta", "c", "(Lcom/sugarcube/core/network/models/Composition;Lcom/sugarcube/decorate_engine/SceneLayout;Ljava/util/HashMap;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Z)Lcom/sugarcube/core/network/models/Composition;", "hasWall2D", "hasWall3D", "hasStackable", "usesMirroringFeature", "usesSnapRotateFeature", "", "a", "(Lcom/sugarcube/decorate_engine/SceneLayout;ZZZZZ)Ljava/util/Map;", "Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "cachedCompiledComposition", "modelMap", "getUpdatedCompiledComposition", "(Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;Lcom/sugarcube/decorate_engine/SceneLayout;Ljava/util/HashMap;ZLdI/e;)Ljava/lang/Object;", "LkG/c;", "metadata", "saveToServer", "updateDesign", "(LkG/c;Lcom/sugarcube/decorate_engine/SceneLayout;Ljava/util/HashMap;ZLdI/e;)Ljava/lang/Object;", "b", "(Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;Lcom/sugarcube/app/base/data/source/CompositionRepository;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "LOE/e;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hG.a  reason: case insensitive filesystem */
public final class C17297a implements CompositionUpdater {

    /* renamed from: c  reason: collision with root package name */
    public static final int f143344c = (C13313e.f112802n | CompositionRepository.$stable);

    /* renamed from: a  reason: collision with root package name */
    private final CompositionRepository f143345a;

    /* renamed from: b  reason: collision with root package name */
    private final C13313e f143346b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.manager.CompositionUpdaterImpl", f = "CompositionUpdater.kt", l = {338, 344, 350, 353}, m = "saveToServer")
    /* renamed from: hG.a$a  reason: collision with other inner class name */
    static final class C3497a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f143347c;

        /* renamed from: d  reason: collision with root package name */
        Object f143348d;

        /* renamed from: e  reason: collision with root package name */
        Object f143349e;

        /* renamed from: f  reason: collision with root package name */
        Object f143350f;

        /* renamed from: g  reason: collision with root package name */
        Object f143351g;

        /* renamed from: h  reason: collision with root package name */
        Object f143352h;

        /* renamed from: i  reason: collision with root package name */
        Object f143353i;

        /* renamed from: j  reason: collision with root package name */
        Object f143354j;

        /* renamed from: k  reason: collision with root package name */
        Object f143355k;

        /* renamed from: l  reason: collision with root package name */
        Object f143356l;

        /* renamed from: m  reason: collision with root package name */
        int f143357m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f143358n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C17297a f143359o;

        /* renamed from: p  reason: collision with root package name */
        int f143360p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3497a(C17297a aVar, C17164e<? super C3497a> eVar) {
            super(eVar);
            this.f143359o = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143358n = obj;
            this.f143360p |= Integer.MIN_VALUE;
            return this.f143359o.b((CachedCompiledComposition) null, (CompositionRepository) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.manager.CompositionUpdaterImpl", f = "CompositionUpdater.kt", l = {310, 318}, m = "updateDesign")
    /* renamed from: hG.a$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f143361c;

        /* renamed from: d  reason: collision with root package name */
        Object f143362d;

        /* renamed from: e  reason: collision with root package name */
        Object f143363e;

        /* renamed from: f  reason: collision with root package name */
        Object f143364f;

        /* renamed from: g  reason: collision with root package name */
        Object f143365g;

        /* renamed from: h  reason: collision with root package name */
        Object f143366h;

        /* renamed from: i  reason: collision with root package name */
        Object f143367i;

        /* renamed from: j  reason: collision with root package name */
        Object f143368j;

        /* renamed from: k  reason: collision with root package name */
        boolean f143369k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f143370l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C17297a f143371m;

        /* renamed from: n  reason: collision with root package name */
        int f143372n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17297a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f143371m = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143370l = obj;
            this.f143372n |= Integer.MIN_VALUE;
            return this.f143371m.updateDesign((C17497c) null, (SceneLayout) null, (HashMap<ObjectInstanceId, k>) null, false, this);
        }
    }

    public C17297a(CompositionRepository compositionRepository, C13313e eVar) {
        C17542s.j(compositionRepository, "compositionRepository");
        C17542s.j(eVar, "installationConfig");
        this.f143345a = compositionRepository;
        this.f143346b = eVar;
    }

    private final Map<String, Integer> a(SceneLayout sceneLayout, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
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

    private final Composition c(Composition composition, SceneLayout sceneLayout, HashMap<ObjectInstanceId, k> hashMap, File file, String str, String str2, HashMap<Integer, CachedCatalogItem> hashMap2, boolean z10) {
        boolean z11;
        PosXYZ posXYZ;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap3 = new HashMap(hashMap);
        Iterator<SceneLayoutInstanceItem> it = sceneLayout.getInstanceItems().iterator();
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        while (it.hasNext()) {
            SceneLayoutInstanceItem next = it.next();
            k kVar = (k) hashMap3.get(next.getInstanceId());
            if (kVar != null) {
                CachedCatalogItem d10 = kVar.d();
                int intValue = next.getInstanceId().getIntValue();
                boolean z17 = d10.isStackableChild() && sceneLayout.isLegacy2D();
                int id2 = d10.getId();
                String localItemNumber = d10.getCatalogItem().getLocalItemNumber();
                String valueOf = String.valueOf(intValue);
                LocalProduct localProduct = new LocalProduct(kVar.d().getCatalogItem().getLocalItemNumber(), String.valueOf(kVar.d().getCatalogItem().getThumbUrl()));
                HashMap hashMap4 = hashMap3;
                Iterator<SceneLayoutInstanceItem> it2 = it;
                boolean z18 = z16;
                boolean z19 = z15;
                FurnitureArtData furnitureArtData = d10.isWallPlaceable2D() ? new FurnitureArtData(1, 1, 1, 1) : null;
                String stackedPlaneId = z17 ? next.getStackedPlaneId() : null;
                List<Double> legacyRelativePosition = next.getLegacyRelativePosition();
                if (legacyRelativePosition != null) {
                    z11 = true;
                    posXYZ = new PosXYZ(legacyRelativePosition.get(0).doubleValue(), legacyRelativePosition.get(1).doubleValue(), legacyRelativePosition.get(2).doubleValue());
                } else {
                    z11 = true;
                    posXYZ = null;
                }
                PosXYZ posXYZ2 = z17 ? posXYZ : null;
                ObjectInstanceId parentInstanceId = next.getParentInstanceId();
                Long valueOf2 = z17 ? parentInstanceId != null ? Long.valueOf((long) parentInstanceId.getIntValue()) : null : null;
                Integer activeCombination = next.getActiveCombination();
                Integer num = (activeCombination == null || activeCombination.intValue() < 0) ? null : activeCombination;
                List<Integer> additionalContacts = next.getAdditionalContacts();
                List<Integer> list = (additionalContacts == null || additionalContacts.isEmpty()) ? null : additionalContacts;
                Boolean isMirrored = next.isMirrored();
                Boolean bool = Boolean.TRUE;
                FurnitureGfxAttributes furnitureGfxAttributes = r22;
                FurnitureGfxAttributes furnitureGfxAttributes2 = new FurnitureGfxAttributes(furnitureArtData, stackedPlaneId, posXYZ2, valueOf2, num, d10.isMirroringCapable() ? Boolean.valueOf(C17542s.e(isMirrored, bool)) : null, list);
                PlacedFurniture placedFurniture = new PlacedFurniture(Integer.valueOf(intValue), Integer.valueOf(id2), valueOf, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, localProduct, furnitureGfxAttributes, (String) null, (Integer) null, (List) null, localItemNumber, 29688, (DefaultConstructorMarker) null);
                if (sceneLayout.is3D()) {
                    Transform3D relativeTransform = next.getRelativeTransform();
                    C17542s.g(relativeTransform);
                    i.w(placedFurniture, relativeTransform);
                    ObjectInstanceId parentInstanceId2 = next.getParentInstanceId();
                    C17542s.g(parentInstanceId2);
                    i.r(placedFurniture, parentInstanceId2, next.getParentAttachmentSlot(), next.getParentPath());
                } else {
                    ModelScreenTransform legacyScreenTransform = next.getLegacyScreenTransform();
                    if (legacyScreenTransform != null) {
                        placedFurniture.setPanoPosX(Double.valueOf((double) legacyScreenTransform.screenX));
                        placedFurniture.setPanoPosY(Double.valueOf((double) legacyScreenTransform.screenY));
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
                    z12 = z11;
                }
                if (d10.isWallPlaceable3D()) {
                    z13 = z11;
                }
                z15 = C17542s.e(next.isMirrored(), bool) ? z11 : z19;
                Integer activeCombination2 = next.getActiveCombination();
                z16 = (activeCombination2 != null ? activeCombination2.intValue() : -1) > 0 ? z11 : z18;
                if (d10.isStackableChild()) {
                    z14 = z11;
                }
                arrayList.add(placedFurniture);
                if (!C17542s.e(kVar.d().getCatalogItem().getHidden(), bool)) {
                    hashMap2.put(Integer.valueOf(kVar.d().getId()), kVar.d());
                } else {
                    HashMap<Integer, CachedCatalogItem> hashMap5 = hashMap2;
                }
                hashMap3 = hashMap4;
                it = it2;
            } else {
                HashMap<Integer, CachedCatalogItem> hashMap6 = hashMap2;
                boolean z20 = z15;
                boolean z21 = z16;
            }
        }
        boolean z22 = z15;
        boolean z23 = z16;
        CameraParameters cameraParameters = null;
        Map<String, Integer> a10 = a(sceneLayout, z12, z13, z14, z15, z16);
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
            cameraParameters = i.B(camera);
        }
        Composition copy$default = Composition.copy$default(composition, 0, (String) null, (Uri) null, (Uri) null, (Integer) null, (UUID) null, arrayList, (Instant) null, (Instant) null, false, (Uri) null, false, 0, (UUID) null, (String) null, compositionSavedProperties.copy(client, a10, str, str2, erasedIds, x10, wallPaint, cameraParameters), (Map) null, (Uri) null, 229311, (Object) null);
        if (z10) {
            return copy$default;
        }
        Uri fromFile = Uri.fromFile(file);
        V v10 = V.f144353a;
        String format = String.format("data:image/jpeg;base64,%s", Arrays.copyOf(new Object[]{Base64.getEncoder().encodeToString(C17423j.g(file))}, 1));
        C17542s.i(format, "format(...)");
        return Composition.copy$default(copy$default, 0, (String) null, (Uri) null, fromFile, (Integer) null, (UUID) null, (List) null, (Instant) null, (Instant) null, false, (Uri) null, false, 0, (UUID) null, format, (CompositionSavedProperties) null, (Map) null, (Uri) null, 245751, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(com.sugarcube.app.base.data.database.CachedCompiledComposition r19, com.sugarcube.app.base.data.source.CompositionRepository r20, dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCompiledComposition> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof hG.C17297a.C3497a
            if (r4 == 0) goto L_0x001b
            r4 = r3
            hG.a$a r4 = (hG.C17297a.C3497a) r4
            int r5 = r4.f143360p
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f143360p = r5
            goto L_0x0020
        L_0x001b:
            hG.a$a r4 = new hG.a$a
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r5 = r4.f143358n
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.f143360p
            java.lang.String r8 = " "
            r10 = 4
            r11 = 3
            r12 = 2
            r13 = 1
            if (r7 == 0) goto L_0x00ed
            if (r7 == r13) goto L_0x00c7
            if (r7 == r12) goto L_0x009a
            if (r7 == r11) goto L_0x006d
            if (r7 != r10) goto L_0x0065
            java.lang.Object r1 = r4.f143356l
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r1 = r4.f143355k
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r1 = r4.f143354j
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r1 = r4.f143353i
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            java.lang.Object r2 = r4.f143352h
            com.sugarcube.core.network.models.CompiledComposition r2 = (com.sugarcube.core.network.models.CompiledComposition) r2
            java.lang.Object r2 = r4.f143351g
            com.sugarcube.app.base.data.database.CachedCompiledComposition r2 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r2
            java.lang.Object r3 = r4.f143350f
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r3 = r4.f143349e
            com.sugarcube.app.base.data.source.CompositionRepository r3 = (com.sugarcube.app.base.data.source.CompositionRepository) r3
            java.lang.Object r3 = r4.f143348d
            com.sugarcube.app.base.data.database.CachedCompiledComposition r3 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r3
            java.lang.Object r3 = r4.f143347c
            hG.a r3 = (hG.C17297a) r3
            XH.y.b(r5)
            goto L_0x017c
        L_0x0065:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x006d:
            java.lang.Object r1 = r4.f143353i
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            java.lang.Object r2 = r4.f143352h
            com.sugarcube.core.network.models.CompiledComposition r2 = (com.sugarcube.core.network.models.CompiledComposition) r2
            java.lang.Object r3 = r4.f143351g
            com.sugarcube.app.base.data.database.CachedCompiledComposition r3 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r3
            java.lang.Object r7 = r4.f143350f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r11 = r4.f143349e
            com.sugarcube.app.base.data.source.CompositionRepository r11 = (com.sugarcube.app.base.data.source.CompositionRepository) r11
            java.lang.Object r12 = r4.f143348d
            com.sugarcube.app.base.data.database.CachedCompiledComposition r12 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r12
            java.lang.Object r13 = r4.f143347c
            hG.a r13 = (hG.C17297a) r13
            XH.y.b(r5)
            r16 = r7
            r7 = r1
            r1 = r3
            r3 = r16
            r17 = r5
            r5 = r2
            r2 = r11
            r11 = r17
            goto L_0x0132
        L_0x009a:
            java.lang.Object r1 = r4.f143356l
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r1 = r4.f143355k
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r1 = r4.f143354j
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r1 = r4.f143353i
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            java.lang.Object r2 = r4.f143352h
            com.sugarcube.core.network.models.CompiledComposition r2 = (com.sugarcube.core.network.models.CompiledComposition) r2
            java.lang.Object r2 = r4.f143351g
            com.sugarcube.app.base.data.database.CachedCompiledComposition r2 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r2
            java.lang.Object r3 = r4.f143350f
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r3 = r4.f143349e
            com.sugarcube.app.base.data.source.CompositionRepository r3 = (com.sugarcube.app.base.data.source.CompositionRepository) r3
            java.lang.Object r3 = r4.f143348d
            com.sugarcube.app.base.data.database.CachedCompiledComposition r3 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r3
            java.lang.Object r3 = r4.f143347c
            hG.a r3 = (hG.C17297a) r3
            XH.y.b(r5)
            goto L_0x020d
        L_0x00c7:
            java.lang.Object r1 = r4.f143353i
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            java.lang.Object r2 = r4.f143352h
            com.sugarcube.core.network.models.CompiledComposition r2 = (com.sugarcube.core.network.models.CompiledComposition) r2
            java.lang.Object r3 = r4.f143351g
            com.sugarcube.app.base.data.database.CachedCompiledComposition r3 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r3
            java.lang.Object r7 = r4.f143350f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r10 = r4.f143349e
            com.sugarcube.app.base.data.source.CompositionRepository r10 = (com.sugarcube.app.base.data.source.CompositionRepository) r10
            java.lang.Object r11 = r4.f143348d
            com.sugarcube.app.base.data.database.CachedCompiledComposition r11 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r11
            java.lang.Object r13 = r4.f143347c
            hG.a r13 = (hG.C17297a) r13
            XH.y.b(r5)
            r9 = r2
            r2 = r10
            r10 = r5
            r5 = r1
            r1 = r11
            goto L_0x01b2
        L_0x00ed:
            XH.y.b(r5)
            com.sugarcube.core.network.models.CompiledComposition r5 = r19.getCompiledComposition()
            kotlin.jvm.internal.O r7 = new kotlin.jvm.internal.O
            r7.<init>()
            com.sugarcube.core.network.models.Composition r14 = r5.getComposition()
            r7.f144348a = r14
            boolean r14 = r14.isStock()
            if (r14 != 0) goto L_0x0191
            T r14 = r7.f144348a
            com.sugarcube.core.network.models.Composition r14 = (com.sugarcube.core.network.models.Composition) r14
            java.util.UUID r14 = r14.getCompositionUuid()
            com.sugarcube.core.network.models.Composition r14 = r2.getComposition((java.util.UUID) r14)
            if (r14 != 0) goto L_0x0115
            goto L_0x0191
        L_0x0115:
            T r12 = r7.f144348a
            com.sugarcube.core.network.models.Composition r12 = (com.sugarcube.core.network.models.Composition) r12
            r4.f143347c = r0
            r4.f143348d = r1
            r4.f143349e = r2
            r4.f143350f = r3
            r4.f143351g = r1
            r4.f143352h = r5
            r4.f143353i = r7
            r4.f143360p = r11
            java.lang.Object r11 = r2.updateComposition(r12, r4)
            if (r11 != r6) goto L_0x0130
            return r6
        L_0x0130:
            r13 = r0
            r12 = r1
        L_0x0132:
            com.sugarcube.core.network.models.Composition r11 = (com.sugarcube.core.network.models.Composition) r11
            if (r11 == 0) goto L_0x0189
            YE.b r14 = YE.C13868b.f118106a
            java.util.UUID r15 = r11.getCompositionUuid()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = "composition updated "
            r10.append(r9)
            r10.append(r15)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            YE.e r9 = YE.e.Decoration
            r14.b(r8, r9)
            java.util.UUID r8 = r11.getCompositionUuid()
            r4.f143347c = r13
            r4.f143348d = r12
            r4.f143349e = r2
            r4.f143350f = r3
            r4.f143351g = r1
            r4.f143352h = r5
            r4.f143353i = r7
            r4.f143354j = r11
            r4.f143355k = r11
            r4.f143356l = r11
            r3 = 0
            r4.f143357m = r3
            r3 = 4
            r4.f143360p = r3
            java.lang.Object r5 = r2.fetchCompiledComposition(r8, r4)
            if (r5 != r6) goto L_0x017a
            return r6
        L_0x017a:
            r2 = r1
            r1 = r7
        L_0x017c:
            com.sugarcube.core.network.models.CompiledComposition r5 = (com.sugarcube.core.network.models.CompiledComposition) r5
            if (r5 == 0) goto L_0x0189
            com.sugarcube.core.network.models.Composition r3 = r5.getComposition()
            r1.f144348a = r3
        L_0x0186:
            r3 = r5
            goto L_0x0219
        L_0x0189:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Composition could not be updated."
            r1.<init>(r2)
            throw r1
        L_0x0191:
            T r9 = r7.f144348a
            com.sugarcube.core.network.models.Composition r9 = (com.sugarcube.core.network.models.Composition) r9
            r4.f143347c = r0
            r4.f143348d = r1
            r4.f143349e = r2
            r4.f143350f = r3
            r4.f143351g = r1
            r4.f143352h = r5
            r4.f143353i = r7
            r4.f143360p = r13
            java.lang.Object r9 = r2.createComposition(r9, r4)
            if (r9 != r6) goto L_0x01ac
            return r6
        L_0x01ac:
            r13 = r0
            r10 = r9
            r9 = r5
            r5 = r7
            r7 = r3
            r3 = r1
        L_0x01b2:
            com.sugarcube.core.network.models.Composition r10 = (com.sugarcube.core.network.models.Composition) r10
            if (r10 == 0) goto L_0x022e
            YE.b r11 = YE.C13868b.f118106a
            T r14 = r5.f144348a
            com.sugarcube.core.network.models.Composition r14 = (com.sugarcube.core.network.models.Composition) r14
            java.util.UUID r14 = r14.getCompositionUuid()
            java.util.UUID r15 = r10.getCompositionUuid()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "new composition created "
            r12.append(r0)
            r12.append(r14)
            java.lang.String r0 = " --> "
            r12.append(r0)
            r12.append(r15)
            r12.append(r8)
            java.lang.String r0 = r12.toString()
            YE.e r8 = YE.e.Decoration
            r11.b(r0, r8)
            java.util.UUID r0 = r10.getCompositionUuid()
            r4.f143347c = r13
            r4.f143348d = r1
            r4.f143349e = r2
            r4.f143350f = r7
            r4.f143351g = r3
            r4.f143352h = r9
            r4.f143353i = r5
            r4.f143354j = r10
            r4.f143355k = r10
            r4.f143356l = r10
            r1 = 0
            r4.f143357m = r1
            r1 = 2
            r4.f143360p = r1
            java.lang.Object r0 = r2.fetchCompiledComposition(r0, r4)
            if (r0 != r6) goto L_0x020a
            return r6
        L_0x020a:
            r2 = r3
            r1 = r5
            r5 = r0
        L_0x020d:
            com.sugarcube.core.network.models.CompiledComposition r5 = (com.sugarcube.core.network.models.CompiledComposition) r5
            if (r5 == 0) goto L_0x022e
            com.sugarcube.core.network.models.Composition r0 = r5.getComposition()
            r1.f144348a = r0
            goto L_0x0186
        L_0x0219:
            T r0 = r1.f144348a
            r4 = r0
            com.sugarcube.core.network.models.Composition r4 = (com.sugarcube.core.network.models.Composition) r4
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            com.sugarcube.core.network.models.CompiledComposition r3 = com.sugarcube.core.network.models.CompiledComposition.copy$default(r3, r4, r5, r6, r7, r8)
            r6 = 6
            r7 = 0
            r4 = 0
            com.sugarcube.app.base.data.database.CachedCompiledComposition r0 = com.sugarcube.app.base.data.database.CachedCompiledComposition.copy$default(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x022e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Composition could not be created."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hG.C17297a.b(com.sugarcube.app.base.data.database.CachedCompiledComposition, com.sugarcube.app.base.data.source.CompositionRepository, dI.e):java.lang.Object");
    }

    public Object getUpdatedCompiledComposition(CachedCompiledComposition cachedCompiledComposition, SceneLayout sceneLayout, HashMap<ObjectInstanceId, k> hashMap, boolean z10, C17164e<? super CachedCompiledComposition> eVar) {
        String thumbnailPath = sceneLayout.getThumbnailPath();
        File file = new File(thumbnailPath);
        if (file.exists() || z10) {
            HashMap hashMap2 = new HashMap(sceneLayout.getInstanceItems().size());
            CompiledComposition compiledComposition = cachedCompiledComposition.getCompiledComposition();
            return CachedCompiledComposition.copy$default(cachedCompiledComposition, CompiledComposition.copy$default(compiledComposition, c(compiledComposition.getComposition(), sceneLayout, hashMap, file, this.f143346b.h(), this.f143346b.k(), hashMap2, z10), (List) null, (SceneResponse) null, 6, (Object) null), hashMap2, (String) null, 4, (Object) null);
        }
        String uuid = cachedCompiledComposition.getCompositionUuid().toString();
        C17542s.i(uuid, "toString(...)");
        C13868b bVar = C13868b.f118106a;
        bVar.b("thumbnail (" + thumbnailPath + ") invalid for " + uuid, e.Decoration);
        return cachedCompiledComposition;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object updateDesign(kG.C17497c r57, com.sugarcube.decorate_engine.SceneLayout r58, java.util.HashMap<com.sugarcube.decorate_engine.ObjectInstanceId, RF.k> r59, boolean r60, dI.C17164e<? super kG.C17497c> r61) {
        /*
            r56 = this;
            r6 = r56
            r7 = r60
            r8 = r61
            boolean r0 = r8 instanceof hG.C17297a.b
            if (r0 == 0) goto L_0x001a
            r0 = r8
            hG.a$b r0 = (hG.C17297a.b) r0
            int r1 = r0.f143372n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x001a
            int r1 = r1 - r2
            r0.f143372n = r1
        L_0x0018:
            r9 = r0
            goto L_0x0020
        L_0x001a:
            hG.a$b r0 = new hG.a$b
            r0.<init>(r6, r8)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r9.f143370l
            java.lang.Object r10 = eI.C17187b.f()
            int r1 = r9.f143372n
            r11 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0088
            if (r1 == r2) goto L_0x005e
            if (r1 != r11) goto L_0x0056
            java.lang.Object r1 = r9.f143368j
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r1 = r9.f143367i
            com.sugarcube.app.base.data.database.CachedCompiledComposition r1 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r1
            java.lang.Object r1 = r9.f143366h
            kG.c r1 = (kG.C17497c) r1
            java.lang.Object r2 = r9.f143365g
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r9.f143364f
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r9.f143363e
            com.sugarcube.decorate_engine.SceneLayout r2 = (com.sugarcube.decorate_engine.SceneLayout) r2
            java.lang.Object r2 = r9.f143362d
            kG.c r2 = (kG.C17497c) r2
            java.lang.Object r2 = r9.f143361c
            hG.a r2 = (hG.C17297a) r2
            XH.y.b(r0)
            r7 = r1
            goto L_0x01b5
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005e:
            boolean r1 = r9.f143369k
            java.lang.Object r2 = r9.f143368j
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r3 = r9.f143367i
            com.sugarcube.app.base.data.database.CachedCompiledComposition r3 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r3
            java.lang.Object r3 = r9.f143366h
            kG.c r3 = (kG.C17497c) r3
            java.lang.Object r4 = r9.f143365g
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r5 = r9.f143364f
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r7 = r9.f143363e
            com.sugarcube.decorate_engine.SceneLayout r7 = (com.sugarcube.decorate_engine.SceneLayout) r7
            java.lang.Object r8 = r9.f143362d
            kG.c r8 = (kG.C17497c) r8
            java.lang.Object r12 = r9.f143361c
            hG.a r12 = (hG.C17297a) r12
            XH.y.b(r0)
            r16 = r3
            r15 = r8
            goto L_0x0179
        L_0x0088:
            XH.y.b(r0)
            com.sugarcube.app.base.data.database.CachedCompiledComposition r13 = r57.c()
            com.sugarcube.core.network.models.Composition r14 = r13.getComposition()
            boolean r0 = r57.k()
            if (r0 == 0) goto L_0x0127
            boolean r0 = r57.j()
            if (r0 == 0) goto L_0x0127
            java.time.Instant r0 = java.time.Instant.now()
            r22 = r0
            java.lang.String r1 = "now(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.time.Instant r0 = java.time.Instant.now()
            r23 = r0
            kotlin.jvm.internal.C17542s.i(r0, r1)
            r33 = 261759(0x3fe7f, float:3.66802E-40)
            r34 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            com.sugarcube.core.network.models.Composition r35 = com.sugarcube.core.network.models.Composition.copy$default(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            if (r7 != 0) goto L_0x010a
            r54 = 262141(0x3fffd, float:3.67338E-40)
            r55 = 0
            r36 = 0
            java.lang.String r37 = ""
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
            com.sugarcube.core.network.models.Composition r35 = com.sugarcube.core.network.models.Composition.copy$default(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
        L_0x010a:
            com.sugarcube.core.network.models.CompiledComposition r14 = r13.getCompiledComposition()
            r18 = 6
            r19 = 0
            r16 = 0
            r17 = 0
            r15 = r35
            com.sugarcube.core.network.models.CompiledComposition r14 = com.sugarcube.core.network.models.CompiledComposition.copy$default(r14, r15, r16, r17, r18, r19)
            r17 = 6
            r18 = 0
            r15 = 0
            com.sugarcube.app.base.data.database.CachedCompiledComposition r13 = com.sugarcube.app.base.data.database.CachedCompiledComposition.copy$default(r13, r14, r15, r16, r17, r18)
            r14 = r35
        L_0x0127:
            r25 = 383(0x17f, float:5.37E-43)
            r26 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r15 = r57
            r23 = r13
            kG.c r12 = kG.C17497c.b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            com.sugarcube.app.base.data.database.CachedCompiledComposition r1 = r12.c()
            r9.f143361c = r6
            r9.f143362d = r15
            r5 = r58
            r9.f143363e = r5
            r4 = r59
            r9.f143364f = r4
            r9.f143365g = r8
            r9.f143366h = r12
            r9.f143367i = r13
            r9.f143368j = r14
            r9.f143369k = r7
            r9.f143372n = r2
            r13 = 0
            r0 = r56
            r2 = r58
            r3 = r59
            r4 = r13
            r5 = r9
            java.lang.Object r0 = r0.getUpdatedCompiledComposition(r1, r2, r3, r4, r5)
            if (r0 != r10) goto L_0x016f
            return r10
        L_0x016f:
            r5 = r59
            r1 = r7
            r4 = r8
            r16 = r12
            r2 = r14
            r7 = r58
            r12 = r6
        L_0x0179:
            com.sugarcube.app.base.data.database.CachedCompiledComposition r0 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r0
            r26 = 383(0x17f, float:5.37E-43)
            r27 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r24 = r0
            kG.c r3 = kG.C17497c.b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r1 == 0) goto L_0x01d0
            com.sugarcube.app.base.data.source.CompositionRepository r8 = r12.f143345a
            r9.f143361c = r12
            r9.f143362d = r15
            r9.f143363e = r7
            r9.f143364f = r5
            r9.f143365g = r4
            r9.f143366h = r3
            r9.f143367i = r0
            r9.f143368j = r2
            r9.f143369k = r1
            r9.f143372n = r11
            java.lang.Object r0 = r12.b(r0, r8, r9)
            if (r0 != r10) goto L_0x01b4
            return r10
        L_0x01b4:
            r7 = r3
        L_0x01b5:
            r15 = r0
            com.sugarcube.app.base.data.database.CachedCompiledComposition r15 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r15
            com.sugarcube.core.network.models.Composition r0 = r15.getComposition()
            java.util.UUID r9 = r0.getCompositionUuid()
            r17 = 377(0x179, float:5.28E-43)
            r18 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            kG.c r3 = kG.C17497c.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x01d0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hG.C17297a.updateDesign(kG.c, com.sugarcube.decorate_engine.SceneLayout, java.util.HashMap, boolean, dI.e):java.lang.Object");
    }
}
