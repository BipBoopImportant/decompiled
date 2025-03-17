package com.sugarcube.decorate_engine;

import HJ.C15854t;
import XH.C16814e;
import YH.C16877v;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import fK.p;
import fK.z;
import iK.C17395d;
import jK.C17446c0;
import jK.C17451f;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\b\b\u0018\u0000 a2\u00020\u0001:\u0002baB\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014B\u0001\b\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010#\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fHÁ\u0001¢\u0006\u0004\b!\u0010\"J\u000f\u0010&\u001a\u00020\u0007H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010(\u001a\u00020\u0019H\u0000¢\u0006\u0004\b'\u0010\u001bJ\r\u0010)\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u0010\u0010-\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010*J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b/\u00100J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b1\u00100J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003¢\u0006\u0004\b2\u00100J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b3\u00100J\u001e\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b8\u0010%J\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b;\u0010%J\u0010\u0010<\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b<\u0010,J\u001a\u0010>\u001a\u00020\u00042\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b>\u0010?R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010,\"\u0004\bB\u0010CR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010D\u001a\u0004\b\u0005\u0010*\"\u0004\bE\u0010FR(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010G\u001a\u0004\bH\u00100\"\u0004\bI\u0010JR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010G\u001a\u0004\bK\u00100\"\u0004\bL\u0010JR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010G\u001a\u0004\bM\u00100\"\u0004\bN\u0010JR*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010G\u001a\u0004\bO\u00100\"\u0004\bP\u0010JR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010Q\u001a\u0004\bR\u00105\"\u0004\bS\u0010TR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010U\u001a\u0004\bV\u00107\"\u0004\bW\u0010XR$\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010Y\u001a\u0004\bZ\u0010%\"\u0004\b[\u0010\\R\u0011\u0010^\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b]\u0010%R\u0011\u0010_\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b_\u0010*R\u0011\u0010`\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b`\u0010*¨\u0006c"}, d2 = {"Lcom/sugarcube/decorate_engine/SceneLayout;", "", "", "version", "", "isAdditive", "", "", "thumbnails", "Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;", "assetItems", "Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "instanceItems", "erasedIds", "", "roomPaint", "Lcom/sugarcube/decorate_engine/CameraParameters;", "camera", "gltfPath", "<init>", "(IZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/sugarcube/decorate_engine/CameraParameters;Ljava/lang/String;)V", "seen1", "LjK/T0;", "serializationConstructorMarker", "(IIZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/sugarcube/decorate_engine/CameraParameters;Ljava/lang/String;LjK/T0;)V", "LXH/N;", "decodeStackedPlaneIds", "()V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/SceneLayout;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toJson$decorate_engine_release", "()Ljava/lang/String;", "toJson", "encodeStackedPlaneIds$decorate_engine_release", "encodeStackedPlaneIds", "isEmpty", "()Z", "component1$decorate_engine_release", "()I", "component1", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "component7", "()Ljava/util/Map;", "component8", "()Lcom/sugarcube/decorate_engine/CameraParameters;", "component9", "copy", "(IZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/sugarcube/decorate_engine/CameraParameters;Ljava/lang/String;)Lcom/sugarcube/decorate_engine/SceneLayout;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getVersion$decorate_engine_release", "setVersion$decorate_engine_release", "(I)V", "Z", "setAdditive", "(Z)V", "Ljava/util/List;", "getThumbnails", "setThumbnails", "(Ljava/util/List;)V", "getAssetItems", "setAssetItems", "getInstanceItems", "setInstanceItems", "getErasedIds", "setErasedIds", "Ljava/util/Map;", "getRoomPaint", "setRoomPaint", "(Ljava/util/Map;)V", "Lcom/sugarcube/decorate_engine/CameraParameters;", "getCamera", "setCamera", "(Lcom/sugarcube/decorate_engine/CameraParameters;)V", "Ljava/lang/String;", "getGltfPath", "setGltfPath", "(Ljava/lang/String;)V", "getThumbnailPath", "thumbnailPath", "isLegacy2D", "is3D", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SceneLayout {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int kCurrent3DVersion = 1280;
    public static final int kLegacy2DVersion = 770;
    private List<SceneLayoutAssetItem> assetItems;
    private CameraParameters camera;
    private List<Integer> erasedIds;
    private String gltfPath;
    private List<SceneLayoutInstanceItem> instanceItems;
    private boolean isAdditive;
    private Map<String, String> roomPaint;
    private List<String> thumbnails;
    private int version;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/sugarcube/decorate_engine/SceneLayout$Companion;", "", "()V", "kCurrent3DVersion", "", "kLegacy2DVersion", "fromJson", "Lcom/sugarcube/decorate_engine/SceneLayout;", "json", "", "fromJson$decorate_engine_release", "serializer", "Lkotlinx/serialization/KSerializer;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SceneLayout fromJson$decorate_engine_release(String str) {
            C17542s.j(str, FeatureVariable.JSON_TYPE);
            if (str.length() <= 0) {
                return null;
            }
            C17514c.a aVar = C17514c.f144280d;
            KSerializer<Object> d10 = z.d(aVar.a(), P.l(SceneLayout.class));
            C17542s.h(d10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            SceneLayout sceneLayout = (SceneLayout) aVar.c(d10, str);
            sceneLayout.encodeStackedPlaneIds$decorate_engine_release();
            return sceneLayout;
        }

        public final KSerializer<SceneLayout> serializer() {
            return SceneLayout$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Y0 y02 = Y0.f144077a;
        $childSerializers = new KSerializer[]{null, null, new C17451f(y02), new C17451f(SceneLayoutAssetItem$$serializer.INSTANCE), new C17451f(SceneLayoutInstanceItem$$serializer.INSTANCE), new C17451f(X.f144073a), new C17446c0(y02, y02), null, null};
    }

    public SceneLayout() {
        this(0, false, (List) null, (List) null, (List) null, (List) null, (Map) null, (CameraParameters) null, (String) null, 511, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SceneLayout copy$default(SceneLayout sceneLayout, int i10, boolean z10, List list, List list2, List list3, List list4, Map map, CameraParameters cameraParameters, String str, int i11, Object obj) {
        SceneLayout sceneLayout2 = sceneLayout;
        int i12 = i11;
        return sceneLayout.copy((i12 & 1) != 0 ? sceneLayout2.version : i10, (i12 & 2) != 0 ? sceneLayout2.isAdditive : z10, (i12 & 4) != 0 ? sceneLayout2.thumbnails : list, (i12 & 8) != 0 ? sceneLayout2.assetItems : list2, (i12 & 16) != 0 ? sceneLayout2.instanceItems : list3, (i12 & 32) != 0 ? sceneLayout2.erasedIds : list4, (i12 & 64) != 0 ? sceneLayout2.roomPaint : map, (i12 & 128) != 0 ? sceneLayout2.camera : cameraParameters, (i12 & 256) != 0 ? sceneLayout2.gltfPath : str);
    }

    private final void decodeStackedPlaneIds() {
        if (this.version != 1280) {
            for (SceneLayoutInstanceItem next : this.instanceItems) {
                String stackedPlaneId = next.getStackedPlaneId();
                if (stackedPlaneId != null) {
                    ObjectInstanceId parentInstanceId = next.getParentInstanceId();
                    if (parentInstanceId == null) {
                        parentInstanceId = ObjectInstanceId.Companion.getKNone();
                    }
                    ObjectInstanceId.Companion companion = ObjectInstanceId.Companion;
                    int i10 = 0;
                    if (C17542s.e(parentInstanceId, companion.getKNone())) {
                        next.setParentInstanceId(companion.getKNone());
                        Iterator<SceneLayoutInstanceItem> it = this.instanceItems.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                SceneLayoutInstanceItem next2 = it.next();
                                String uniqueId = next2.getUniqueId();
                                if (uniqueId == null) {
                                    uniqueId = "_";
                                }
                                if (!C17542s.e(next2, next) && C15854t.W(stackedPlaneId, uniqueId, false, 2, (Object) null)) {
                                    next.setParentInstanceId(next2.getInstanceId());
                                    stackedPlaneId = stackedPlaneId.substring(uniqueId.length());
                                    C17542s.i(stackedPlaneId, "this as java.lang.String).substring(startIndex)");
                                    break;
                                }
                            }
                        }
                    } else {
                        Iterator<SceneLayoutInstanceItem> it2 = this.instanceItems.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                SceneLayoutInstanceItem next3 = it2.next();
                                if (C17542s.e(next3.getInstanceId(), next.getParentInstanceId())) {
                                    String uniqueId2 = next3.getUniqueId();
                                    if (uniqueId2 != null) {
                                        i10 = uniqueId2.length();
                                    }
                                    stackedPlaneId = stackedPlaneId.substring(i10);
                                    C17542s.i(stackedPlaneId, "this as java.lang.String).substring(startIndex)");
                                }
                            }
                        }
                    }
                    try {
                        next.setParentAttachmentSlot(Integer.valueOf(Integer.parseInt(stackedPlaneId)));
                        break;
                    } catch (NumberFormatException unused) {
                        next.setParentAttachmentSlot(Integer.valueOf((int) 4294967295L));
                    }
                }
            }
        }
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(SceneLayout sceneLayout, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (dVar.z(serialDescriptor, 0) || sceneLayout.version != 0) {
            dVar.w(serialDescriptor, 0, sceneLayout.version);
        }
        if (dVar.z(serialDescriptor, 1) || sceneLayout.isAdditive) {
            dVar.x(serialDescriptor, 1, sceneLayout.isAdditive);
        }
        if (dVar.z(serialDescriptor, 2) || !C17542s.e(sceneLayout.thumbnails, C16877v.n())) {
            dVar.i(serialDescriptor, 2, kSerializerArr[2], sceneLayout.thumbnails);
        }
        if (dVar.z(serialDescriptor, 3) || !C17542s.e(sceneLayout.assetItems, C16877v.n())) {
            dVar.i(serialDescriptor, 3, kSerializerArr[3], sceneLayout.assetItems);
        }
        if (dVar.z(serialDescriptor, 4) || !C17542s.e(sceneLayout.instanceItems, C16877v.n())) {
            dVar.i(serialDescriptor, 4, kSerializerArr[4], sceneLayout.instanceItems);
        }
        if (dVar.z(serialDescriptor, 5) || sceneLayout.erasedIds != null) {
            dVar.B(serialDescriptor, 5, kSerializerArr[5], sceneLayout.erasedIds);
        }
        if (dVar.z(serialDescriptor, 6) || sceneLayout.roomPaint != null) {
            dVar.B(serialDescriptor, 6, kSerializerArr[6], sceneLayout.roomPaint);
        }
        if (dVar.z(serialDescriptor, 7) || sceneLayout.camera != null) {
            dVar.B(serialDescriptor, 7, CameraParameters$$serializer.INSTANCE, sceneLayout.camera);
        }
        if (dVar.z(serialDescriptor, 8) || sceneLayout.gltfPath != null) {
            dVar.B(serialDescriptor, 8, Y0.f144077a, sceneLayout.gltfPath);
        }
    }

    public final int component1$decorate_engine_release() {
        return this.version;
    }

    public final boolean component2() {
        return this.isAdditive;
    }

    public final List<String> component3() {
        return this.thumbnails;
    }

    public final List<SceneLayoutAssetItem> component4() {
        return this.assetItems;
    }

    public final List<SceneLayoutInstanceItem> component5() {
        return this.instanceItems;
    }

    public final List<Integer> component6() {
        return this.erasedIds;
    }

    public final Map<String, String> component7() {
        return this.roomPaint;
    }

    public final CameraParameters component8() {
        return this.camera;
    }

    public final String component9() {
        return this.gltfPath;
    }

    public final SceneLayout copy(int i10, boolean z10, List<String> list, List<SceneLayoutAssetItem> list2, List<SceneLayoutInstanceItem> list3, List<Integer> list4, Map<String, String> map, CameraParameters cameraParameters, String str) {
        C17542s.j(list, "thumbnails");
        C17542s.j(list2, "assetItems");
        List<SceneLayoutInstanceItem> list5 = list3;
        C17542s.j(list5, "instanceItems");
        return new SceneLayout(i10, z10, list, list2, list5, list4, map, cameraParameters, str);
    }

    public final void encodeStackedPlaneIds$decorate_engine_release() {
        ObjectInstanceId parentInstanceId;
        Integer parentAttachmentSlot;
        if (this.version != 1280) {
            for (SceneLayoutInstanceItem next : this.instanceItems) {
                if (!(!this.assetItems.get(next.getAssetItemIndex()).hasFeatureFlag(FeatureFlagBit.StackableChild) || (parentInstanceId = next.getParentInstanceId()) == null || (parentAttachmentSlot = next.getParentAttachmentSlot()) == null)) {
                    int intValue = parentAttachmentSlot.intValue();
                    if (parentInstanceId.isNone()) {
                        next.setStackedPlaneId(String.valueOf(intValue));
                    } else {
                        int intValue2 = parentInstanceId.getIntValue();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(intValue2);
                        sb2.append(intValue);
                        next.setStackedPlaneId(sb2.toString());
                    }
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SceneLayout)) {
            return false;
        }
        SceneLayout sceneLayout = (SceneLayout) obj;
        return this.version == sceneLayout.version && this.isAdditive == sceneLayout.isAdditive && C17542s.e(this.thumbnails, sceneLayout.thumbnails) && C17542s.e(this.assetItems, sceneLayout.assetItems) && C17542s.e(this.instanceItems, sceneLayout.instanceItems) && C17542s.e(this.erasedIds, sceneLayout.erasedIds) && C17542s.e(this.roomPaint, sceneLayout.roomPaint) && C17542s.e(this.camera, sceneLayout.camera) && C17542s.e(this.gltfPath, sceneLayout.gltfPath);
    }

    public final List<SceneLayoutAssetItem> getAssetItems() {
        return this.assetItems;
    }

    public final CameraParameters getCamera() {
        return this.camera;
    }

    public final List<Integer> getErasedIds() {
        return this.erasedIds;
    }

    public final String getGltfPath() {
        return this.gltfPath;
    }

    public final List<SceneLayoutInstanceItem> getInstanceItems() {
        return this.instanceItems;
    }

    public final Map<String, String> getRoomPaint() {
        return this.roomPaint;
    }

    public final String getThumbnailPath() {
        Object obj;
        Iterator it = this.thumbnails.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((String) obj).length() > 0) {
                break;
            }
        }
        String str = (String) obj;
        return str == null ? "" : str;
    }

    public final List<String> getThumbnails() {
        return this.thumbnails;
    }

    public final int getVersion$decorate_engine_release() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.version) * 31) + Boolean.hashCode(this.isAdditive)) * 31) + this.thumbnails.hashCode()) * 31) + this.assetItems.hashCode()) * 31) + this.instanceItems.hashCode()) * 31;
        List<Integer> list = this.erasedIds;
        int i10 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.roomPaint;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        CameraParameters cameraParameters = this.camera;
        int hashCode4 = (hashCode3 + (cameraParameters == null ? 0 : cameraParameters.hashCode())) * 31;
        String str = this.gltfPath;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode4 + i10;
    }

    public final boolean is3D() {
        return this.version == 1280;
    }

    public final boolean isAdditive() {
        return this.isAdditive;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.erasedIds;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r0 = r2.gltfPath;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isEmpty() {
        /*
            r2 = this;
            java.util.List<com.sugarcube.decorate_engine.SceneLayoutAssetItem> r0 = r2.assetItems
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0021
            java.util.List<java.lang.Integer> r0 = r2.erasedIds
            r1 = 1
            if (r0 == 0) goto L_0x0017
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 != r1) goto L_0x0017
            goto L_0x0021
        L_0x0017:
            java.lang.String r0 = r2.gltfPath
            if (r0 == 0) goto L_0x0022
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.SceneLayout.isEmpty():boolean");
    }

    public final boolean isLegacy2D() {
        return this.version == 770;
    }

    public final void setAdditive(boolean z10) {
        this.isAdditive = z10;
    }

    public final void setAssetItems(List<SceneLayoutAssetItem> list) {
        C17542s.j(list, "<set-?>");
        this.assetItems = list;
    }

    public final void setCamera(CameraParameters cameraParameters) {
        this.camera = cameraParameters;
    }

    public final void setErasedIds(List<Integer> list) {
        this.erasedIds = list;
    }

    public final void setGltfPath(String str) {
        this.gltfPath = str;
    }

    public final void setInstanceItems(List<SceneLayoutInstanceItem> list) {
        C17542s.j(list, "<set-?>");
        this.instanceItems = list;
    }

    public final void setRoomPaint(Map<String, String> map) {
        this.roomPaint = map;
    }

    public final void setThumbnails(List<String> list) {
        C17542s.j(list, "<set-?>");
        this.thumbnails = list;
    }

    public final void setVersion$decorate_engine_release(int i10) {
        this.version = i10;
    }

    public final String toJson$decorate_engine_release() {
        if (isEmpty()) {
            return "";
        }
        this.instanceItems.isEmpty();
        this.instanceItems.isEmpty();
        String str = this.gltfPath;
        this.version = (str == null || str.length() <= 0) ? kLegacy2DVersion : kCurrent3DVersion;
        decodeStackedPlaneIds();
        C17514c json = ConfiguredEncoder.Companion.getJson();
        KSerializer<Object> d10 = z.d(json.a(), P.l(SceneLayout.class));
        C17542s.h(d10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return json.b(d10, this);
    }

    public String toString() {
        int i10 = this.version;
        boolean z10 = this.isAdditive;
        List<String> list = this.thumbnails;
        List<SceneLayoutAssetItem> list2 = this.assetItems;
        List<SceneLayoutInstanceItem> list3 = this.instanceItems;
        List<Integer> list4 = this.erasedIds;
        Map<String, String> map = this.roomPaint;
        CameraParameters cameraParameters = this.camera;
        String str = this.gltfPath;
        return "SceneLayout(version=" + i10 + ", isAdditive=" + z10 + ", thumbnails=" + list + ", assetItems=" + list2 + ", instanceItems=" + list3 + ", erasedIds=" + list4 + ", roomPaint=" + map + ", camera=" + cameraParameters + ", gltfPath=" + str + ")";
    }

    @C16814e
    public /* synthetic */ SceneLayout(int i10, int i11, boolean z10, List list, List list2, List list3, List list4, Map map, CameraParameters cameraParameters, String str, T0 t02) {
        if ((i10 & 1) == 0) {
            this.version = 0;
        } else {
            this.version = i11;
        }
        if ((i10 & 2) == 0) {
            this.isAdditive = false;
        } else {
            this.isAdditive = z10;
        }
        if ((i10 & 4) == 0) {
            this.thumbnails = C16877v.n();
        } else {
            this.thumbnails = list;
        }
        if ((i10 & 8) == 0) {
            this.assetItems = C16877v.n();
        } else {
            this.assetItems = list2;
        }
        if ((i10 & 16) == 0) {
            this.instanceItems = C16877v.n();
        } else {
            this.instanceItems = list3;
        }
        if ((i10 & 32) == 0) {
            this.erasedIds = null;
        } else {
            this.erasedIds = list4;
        }
        if ((i10 & 64) == 0) {
            this.roomPaint = null;
        } else {
            this.roomPaint = map;
        }
        if ((i10 & 128) == 0) {
            this.camera = null;
        } else {
            this.camera = cameraParameters;
        }
        if ((i10 & 256) == 0) {
            this.gltfPath = null;
        } else {
            this.gltfPath = str;
        }
    }

    public SceneLayout(int i10, boolean z10, List<String> list, List<SceneLayoutAssetItem> list2, List<SceneLayoutInstanceItem> list3, List<Integer> list4, Map<String, String> map, CameraParameters cameraParameters, String str) {
        C17542s.j(list, "thumbnails");
        C17542s.j(list2, "assetItems");
        C17542s.j(list3, "instanceItems");
        this.version = i10;
        this.isAdditive = z10;
        this.thumbnails = list;
        this.assetItems = list2;
        this.instanceItems = list3;
        this.erasedIds = list4;
        this.roomPaint = map;
        this.camera = cameraParameters;
        this.gltfPath = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SceneLayout(int r11, boolean r12, java.util.List r13, java.util.List r14, java.util.List r15, java.util.List r16, java.util.Map r17, com.sugarcube.decorate_engine.CameraParameters r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r2 = r12
        L_0x0010:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0019
            java.util.List r3 = YH.C16877v.n()
            goto L_0x001a
        L_0x0019:
            r3 = r13
        L_0x001a:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0023
            java.util.List r4 = YH.C16877v.n()
            goto L_0x0024
        L_0x0023:
            r4 = r14
        L_0x0024:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x002d
            java.util.List r5 = YH.C16877v.n()
            goto L_0x002e
        L_0x002d:
            r5 = r15
        L_0x002e:
            r6 = r0 & 32
            r7 = 0
            if (r6 == 0) goto L_0x0035
            r6 = r7
            goto L_0x0037
        L_0x0035:
            r6 = r16
        L_0x0037:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003d
            r8 = r7
            goto L_0x003f
        L_0x003d:
            r8 = r17
        L_0x003f:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0045
            r9 = r7
            goto L_0x0047
        L_0x0045:
            r9 = r18
        L_0x0047:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r7 = r19
        L_0x004e:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r8
            r19 = r9
            r20 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.SceneLayout.<init>(int, boolean, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, com.sugarcube.decorate_engine.CameraParameters, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
