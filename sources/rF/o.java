package RF;

import XH.v;
import YE.C13868b;
import YH.C16877v;
import YH.X;
import android.util.Log;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.CatalogCombinableNodeMeta;
import com.sugarcube.decorate_engine.CameraParameters;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import com.sugarcube.decorate_engine.ObjectInstanceIdType;
import com.sugarcube.decorate_engine.SceneLayout;
import com.sugarcube.decorate_engine.SceneLayoutAssetItem;
import com.sugarcube.decorate_engine.SceneLayoutInstanceItem;
import com.sugarcube.decorate_engine.Transform3D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001-B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u00020\u00162\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000bj\u0002`\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u001b\u001a\u00020\u00162\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000bj\u0002`\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001d\u001a\u00020\r2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J3\u0010!\u001a\u00020\r2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b¢\u0006\u0004\b!\u0010\u001eJ\u0015\u0010\"\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J)\u0010(\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u001d\u0010+\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020*2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b+\u0010,R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00190/8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00102R0\u0010:\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t06j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`78\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R0\u0010;\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$06j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$`78\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u00109R0\u0010<\u001a\u001e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000206j\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0002`78\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u00109¨\u0006="}, d2 = {"LRF/o;", "", "", "gltfPath", "<init>", "(Ljava/lang/String;)V", "", "isAdditive", "", "", "erasedIds", "", "roomPaint", "Lcom/sugarcube/decorate_engine/SceneLayout;", "q", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;)Lcom/sugarcube/decorate_engine/SceneLayout;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "cf", "f", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)I", "Lcom/sugarcube/app/base/data/database/CachedCombinableMap;", "combinableMap", "LXH/N;", "g", "(Ljava/util/Map;)V", "Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "instanceItem", "h", "(Ljava/util/Map;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;)V", "m", "(Ljava/util/List;Ljava/util/Map;)Lcom/sugarcube/decorate_engine/SceneLayout;", "o", "()Lcom/sugarcube/decorate_engine/SceneLayout;", "p", "e", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "instanceId", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "transform", "i", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/decorate_engine/ModelScreenTransform;)Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "Lcom/sugarcube/core/network/models/PlacedFurniture;", "j", "(Lcom/sugarcube/core/network/models/PlacedFurniture;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "a", "Ljava/lang/String;", "", "Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;", "b", "Ljava/util/List;", "assetItems", "c", "instanceItems", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "d", "Ljava/util/HashMap;", "assetItemIdToIndexMap", "uniqueIdToInstanceId", "stackingParentForInstanceId", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* renamed from: g  reason: collision with root package name */
    public static final a f115562g = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f115563h = 8;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static ObjectInstanceId f115564i = new ObjectInstanceId(ObjectInstanceIdType.Model.getRawType() | 257);

    /* renamed from: a  reason: collision with root package name */
    private String f115565a;

    /* renamed from: b  reason: collision with root package name */
    private final List<SceneLayoutAssetItem> f115566b;

    /* renamed from: c  reason: collision with root package name */
    private final List<SceneLayoutInstanceItem> f115567c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<Integer, Integer> f115568d;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, ObjectInstanceId> f115569e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<ObjectInstanceId, String> f115570f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LRF/o$a;", "", "<init>", "()V", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "b", "()Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "nextInstanceId", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final ObjectInstanceId b() {
            ObjectInstanceId c10 = o.f115564i;
            o.f115564i = ObjectInstanceId.Companion.nextModelInstanceId(c10);
            return c10;
        }

        private a() {
        }
    }

    public o(String str) {
        this.f115565a = str;
        this.f115566b = new ArrayList();
        this.f115567c = new ArrayList();
        this.f115568d = new HashMap<>();
        this.f115569e = new HashMap<>();
        this.f115570f = new HashMap<>();
    }

    private final int f(CachedCatalogItem cachedCatalogItem) {
        int size = this.f115566b.size();
        this.f115568d.put(Integer.valueOf(cachedCatalogItem.getId()), Integer.valueOf(size));
        this.f115566b.add(i.g(cachedCatalogItem, (Boolean) null, 2, (Object) null));
        if (cachedCatalogItem.isCombinableParent()) {
            Map<String, CachedCatalogItem> combinableMap = cachedCatalogItem.getCombinableMap();
            if (combinableMap != null) {
                g(combinableMap);
            } else {
                String name = cachedCatalogItem.getName();
                Log.e(AnyKt.SUGARCUBE_TAG, name + " is a combinable parent but combinableMap is null!");
            }
        }
        return size;
    }

    private final void g(Map<String, CachedCatalogItem> map) {
        for (Map.Entry<String, CachedCatalogItem> value : map.entrySet()) {
            CachedCatalogItem cachedCatalogItem = (CachedCatalogItem) value.getValue();
            if (cachedCatalogItem != null && !this.f115568d.containsKey(Integer.valueOf(cachedCatalogItem.getId()))) {
                f(cachedCatalogItem);
            }
        }
    }

    private final void h(Map<String, CachedCatalogItem> map, CachedCatalogItem cachedCatalogItem, SceneLayoutInstanceItem sceneLayoutInstanceItem) {
        Integer num;
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(new v(cachedCatalogItem, sceneLayoutInstanceItem));
        while (!linkedList.isEmpty()) {
            List<CatalogCombinableNodeMeta> combinableNodesMeta = ((CachedCatalogItem) ((v) linkedList.getLast()).c()).getCombinableNodesMeta();
            if (combinableNodesMeta == null) {
                combinableNodesMeta = C16877v.n();
            }
            ObjectInstanceId instanceId = ((SceneLayoutInstanceItem) ((v) linkedList.getLast()).d()).getInstanceId();
            int size = ((CachedCatalogItem) ((v) linkedList.getLast()).c()).getStackingPolygons().size();
            linkedList.remove(C16877v.p(linkedList));
            for (CatalogCombinableNodeMeta category : combinableNodesMeta) {
                CachedCatalogItem cachedCatalogItem2 = map.get(category.getCategory());
                if (!(cachedCatalogItem2 == null || (num = this.f115568d.get(Integer.valueOf(cachedCatalogItem2.getId()))) == null)) {
                    int intValue = num.intValue();
                    SceneLayoutInstanceItem sceneLayoutInstanceItem2 = r8;
                    SceneLayoutInstanceItem sceneLayoutInstanceItem3 = new SceneLayoutInstanceItem(0, (ObjectInstanceId) null, (Transform3D) null, (ObjectInstanceId) null, (String) null, (String) null, (Integer) null, (List) null, (Integer) null, (Boolean) null, (ModelScreenTransform) null, (List) null, (List) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
                    SceneLayoutInstanceItem sceneLayoutInstanceItem4 = sceneLayoutInstanceItem2;
                    sceneLayoutInstanceItem4.setAssetItemIndex(intValue);
                    sceneLayoutInstanceItem4.setInstanceId(f115562g.b());
                    sceneLayoutInstanceItem4.setParentInstanceId(instanceId);
                    sceneLayoutInstanceItem4.setParentAttachmentSlot(Integer.valueOf(size));
                    this.f115567c.add(sceneLayoutInstanceItem4);
                    linkedList.addLast(new v(cachedCatalogItem2, sceneLayoutInstanceItem4));
                }
                size++;
            }
            Map<String, CachedCatalogItem> map2 = map;
        }
    }

    public static /* synthetic */ SceneLayoutInstanceItem k(o oVar, CachedCatalogItem cachedCatalogItem, ObjectInstanceId objectInstanceId, ModelScreenTransform modelScreenTransform, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            modelScreenTransform = null;
        }
        return oVar.i(cachedCatalogItem, objectInstanceId, modelScreenTransform);
    }

    /* access modifiers changed from: private */
    public static final String l() {
        return "gltfpath empty";
    }

    /* access modifiers changed from: private */
    public static final String n() {
        return "gltfPath empty";
    }

    private final SceneLayout q(Boolean bool, List<Integer> list, Map<String, String> map) {
        Boolean bool2 = bool;
        List<Integer> list2 = list;
        String str = this.f115565a;
        SceneLayout sceneLayout = new SceneLayout((str == null || str.length() == 0) ? SceneLayout.kLegacy2DVersion : SceneLayout.kCurrent3DVersion, false, (List) null, (List) null, (List) null, (List) null, (Map) null, (CameraParameters) null, (String) null, 510, (DefaultConstructorMarker) null);
        if (bool2 != null) {
            sceneLayout.setAdditive(bool.booleanValue());
        }
        sceneLayout.setAssetItems(C16877v.t1(this.f115566b));
        sceneLayout.setInstanceItems(C16877v.t1(this.f115567c));
        if (list2 != null) {
            if (!list.isEmpty()) {
                boolean e10 = C17542s.e(bool2, Boolean.TRUE);
            }
            sceneLayout.setErasedIds(list2);
        }
        sceneLayout.setRoomPaint(map != null ? X.x(map) : null);
        for (SceneLayoutInstanceItem next : sceneLayout.getInstanceItems()) {
            if (this.f115570f.keySet().contains(next.getInstanceId())) {
                next.setParentInstanceId(this.f115569e.get(this.f115570f.get(next.getInstanceId())));
            }
        }
        return sceneLayout;
    }

    public final void e(CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "cf");
        f(cachedCatalogItem);
    }

    public final SceneLayoutInstanceItem i(CachedCatalogItem cachedCatalogItem, ObjectInstanceId objectInstanceId, ModelScreenTransform modelScreenTransform) {
        CachedCatalogItem cachedCatalogItem2 = cachedCatalogItem;
        ObjectInstanceId objectInstanceId2 = objectInstanceId;
        ModelScreenTransform modelScreenTransform2 = modelScreenTransform;
        C17542s.j(cachedCatalogItem2, "cf");
        C17542s.j(objectInstanceId2, "instanceId");
        SceneLayoutInstanceItem sceneLayoutInstanceItem = new SceneLayoutInstanceItem(0, (ObjectInstanceId) null, (Transform3D) null, (ObjectInstanceId) null, (String) null, (String) null, (Integer) null, (List) null, (Integer) null, (Boolean) null, (ModelScreenTransform) null, (List) null, (List) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
        Integer num = this.f115568d.get(Integer.valueOf(cachedCatalogItem.getId()));
        if (num != null) {
            sceneLayoutInstanceItem.setAssetItemIndex(num.intValue());
        } else {
            sceneLayoutInstanceItem.setAssetItemIndex(f(cachedCatalogItem));
        }
        if (C17542s.e(objectInstanceId2, ObjectInstanceId.Companion.getKNone())) {
            objectInstanceId2 = f115562g.b();
        }
        sceneLayoutInstanceItem.setInstanceId(objectInstanceId2);
        if (modelScreenTransform2 != null) {
            sceneLayoutInstanceItem.setLegacyScreenTransform(modelScreenTransform2);
        }
        this.f115567c.add(sceneLayoutInstanceItem);
        Map<String, CachedCatalogItem> combinableMap = cachedCatalogItem.getCombinableMap();
        if (combinableMap != null) {
            h(combinableMap, cachedCatalogItem2, sceneLayoutInstanceItem);
        }
        return sceneLayoutInstanceItem;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0057, code lost:
        r2 = r2.getAnchorCombinationIndex();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sugarcube.decorate_engine.SceneLayoutInstanceItem j(com.sugarcube.core.network.models.PlacedFurniture r5, com.sugarcube.app.base.data.database.CachedCatalogItem r6) {
        /*
            r4 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "cf"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            YE.b r0 = YE.C13868b.f118106a
            java.lang.String r1 = r4.f115565a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0019
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0019
            r2 = r3
        L_0x0019:
            r1 = r2 ^ 1
            RF.m r2 = new RF.m
            r2.<init>()
            r0.a(r1, r2)
            RF.o$a r0 = f115562g
            com.sugarcube.decorate_engine.ObjectInstanceId r0 = r0.b()
            com.sugarcube.decorate_engine.ModelScreenTransform r1 = RF.i.p(r5)
            com.sugarcube.decorate_engine.SceneLayoutInstanceItem r1 = r4.i(r6, r0, r1)
            java.lang.String r2 = r5.getUniqueId()
            if (r2 == 0) goto L_0x003c
            java.util.HashMap<java.lang.String, com.sugarcube.decorate_engine.ObjectInstanceId> r3 = r4.f115569e
            r3.put(r2, r0)
        L_0x003c:
            java.lang.String r2 = r5.getUniqueId()
            r1.setUniqueId(r2)
            java.lang.String r2 = r5.getStackedPlane()
            r1.setStackedPlaneId(r2)
            java.util.List r2 = r5.getLegacyRelativePosition()
            r1.setLegacyRelativePosition(r2)
            com.sugarcube.core.network.models.FurnitureGfxAttributes r2 = r5.getGfxAttributes()
            if (r2 == 0) goto L_0x0062
            java.lang.Integer r2 = r2.getAnchorCombinationIndex()
            if (r2 == 0) goto L_0x0062
            int r2 = r2.intValue()
            goto L_0x0063
        L_0x0062:
            r2 = -1
        L_0x0063:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.setActiveCombination(r2)
            boolean r6 = r6.isMirroringCapable()
            if (r6 == 0) goto L_0x007f
            com.sugarcube.core.network.models.FurnitureGfxAttributes r6 = r5.getGfxAttributes()
            if (r6 == 0) goto L_0x007b
            java.lang.Boolean r6 = r6.getMirrorOptionEnabled()
            goto L_0x007c
        L_0x007b:
            r6 = 0
        L_0x007c:
            r1.setMirrored(r6)
        L_0x007f:
            com.sugarcube.core.network.models.FurnitureGfxAttributes r5 = r5.getGfxAttributes()
            if (r5 == 0) goto L_0x0098
            java.lang.Long r5 = r5.getParentId()
            if (r5 == 0) goto L_0x0098
            long r5 = r5.longValue()
            java.util.HashMap<com.sugarcube.decorate_engine.ObjectInstanceId, java.lang.String> r2 = r4.f115570f
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r2.put(r0, r5)
        L_0x0098:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: RF.o.j(com.sugarcube.core.network.models.PlacedFurniture, com.sugarcube.app.base.data.database.CachedCatalogItem):com.sugarcube.decorate_engine.SceneLayoutInstanceItem");
    }

    public final SceneLayout m(List<Integer> list, Map<String, String> map) {
        C13868b bVar = C13868b.f118106a;
        String str = this.f115565a;
        boolean z10 = false;
        if (str != null && str.length() > 0) {
            z10 = true;
        }
        bVar.a(z10, new n());
        String str2 = this.f115565a;
        SceneLayout sceneLayout = new SceneLayout((str2 == null || str2.length() == 0) ? SceneLayout.kLegacy2DVersion : SceneLayout.kCurrent3DVersion, false, (List) null, (List) null, (List) null, (List) null, (Map) null, (CameraParameters) null, (String) null, 510, (DefaultConstructorMarker) null);
        sceneLayout.setAssetItems(C16877v.t1(this.f115566b));
        sceneLayout.setGltfPath(this.f115565a);
        sceneLayout.setRoomPaint(map);
        sceneLayout.setErasedIds(list);
        return sceneLayout;
    }

    public final SceneLayout o() {
        return q(Boolean.TRUE, (List<Integer>) null, (Map<String, String>) null);
    }

    public final SceneLayout p(List<Integer> list, Map<String, String> map) {
        return q((Boolean) null, list, map);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
