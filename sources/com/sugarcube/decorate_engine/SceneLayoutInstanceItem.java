package com.sugarcube.decorate_engine;

import XH.C16814e;
import androidx.recyclerview.widget.RecyclerView;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.C17457i;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bT\b\b\u0018\u0000 w2\u00020\u0001:\u0002xwBÉ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bB­\u0001\b\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ(\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#HÁ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010,J\u0012\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b2\u00101J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u00104J\u0012\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b<\u00106J\u0018\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b=\u00106J\u0012\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b>\u00101J\u0012\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b?\u00101JÒ\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bB\u00101J\u0010\u0010C\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bC\u0010*J\u001a\u0010E\u001a\u00020\u00112\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bE\u0010FR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010*\"\u0004\bI\u0010JR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010K\u001a\u0004\bL\u0010,\"\u0004\bM\u0010NR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010O\u001a\u0004\bP\u0010.\"\u0004\bQ\u0010RR$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010K\u001a\u0004\bS\u0010,\"\u0004\bT\u0010NR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010U\u001a\u0004\bV\u00101\"\u0004\bW\u0010XR$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010U\u001a\u0004\bY\u00101\"\u0004\bZ\u0010XR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010[\u001a\u0004\b\\\u00104\"\u0004\b]\u0010^R*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010_\u001a\u0004\b`\u00106\"\u0004\ba\u0010bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010[\u001a\u0004\bc\u00104\"\u0004\bd\u0010^R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010e\u001a\u0004\b\u0012\u00109\"\u0004\bf\u0010gR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010h\u001a\u0004\bi\u0010;\"\u0004\bj\u0010kR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010_\u001a\u0004\bl\u00106\"\u0004\bm\u0010bR*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010_\u001a\u0004\bn\u00106\"\u0004\bo\u0010bR*\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010U\u0012\u0004\br\u0010s\u001a\u0004\bp\u00101\"\u0004\bq\u0010XR*\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010U\u0012\u0004\bv\u0010s\u001a\u0004\bt\u00101\"\u0004\bu\u0010X¨\u0006y"}, d2 = {"Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "", "", "assetItemIndex", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "instanceId", "Lcom/sugarcube/decorate_engine/Transform3D;", "relativeTransform", "parentInstanceId", "", "activeSocketSet", "pluggedSocket", "parentAttachmentSlot", "", "Lcom/sugarcube/decorate_engine/ParentDetails;", "parentPath", "activeCombination", "", "isMirrored", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "legacyScreenTransform", "", "legacyRelativePosition", "additionalContacts", "uniqueId", "stackedPlaneId", "<init>", "(ILcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/decorate_engine/Transform3D;Lcom/sugarcube/decorate_engine/ObjectInstanceId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/sugarcube/decorate_engine/ModelScreenTransform;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "LjK/T0;", "serializationConstructorMarker", "(IILcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/decorate_engine/Transform3D;Lcom/sugarcube/decorate_engine/ObjectInstanceId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/sugarcube/decorate_engine/ModelScreenTransform;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "component3", "()Lcom/sugarcube/decorate_engine/Transform3D;", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "()Ljava/lang/Integer;", "component8", "()Ljava/util/List;", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "()Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "component12", "component13", "component14", "component15", "copy", "(ILcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/decorate_engine/Transform3D;Lcom/sugarcube/decorate_engine/ObjectInstanceId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/sugarcube/decorate_engine/ModelScreenTransform;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getAssetItemIndex", "setAssetItemIndex", "(I)V", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "getInstanceId", "setInstanceId", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;)V", "Lcom/sugarcube/decorate_engine/Transform3D;", "getRelativeTransform", "setRelativeTransform", "(Lcom/sugarcube/decorate_engine/Transform3D;)V", "getParentInstanceId", "setParentInstanceId", "Ljava/lang/String;", "getActiveSocketSet", "setActiveSocketSet", "(Ljava/lang/String;)V", "getPluggedSocket", "setPluggedSocket", "Ljava/lang/Integer;", "getParentAttachmentSlot", "setParentAttachmentSlot", "(Ljava/lang/Integer;)V", "Ljava/util/List;", "getParentPath", "setParentPath", "(Ljava/util/List;)V", "getActiveCombination", "setActiveCombination", "Ljava/lang/Boolean;", "setMirrored", "(Ljava/lang/Boolean;)V", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "getLegacyScreenTransform", "setLegacyScreenTransform", "(Lcom/sugarcube/decorate_engine/ModelScreenTransform;)V", "getLegacyRelativePosition", "setLegacyRelativePosition", "getAdditionalContacts", "setAdditionalContacts", "getUniqueId", "setUniqueId", "getUniqueId$annotations", "()V", "getStackedPlaneId", "setStackedPlaneId", "getStackedPlaneId$annotations", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SceneLayoutInstanceItem {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new C17451f(ParentDetails$$serializer.INSTANCE), null, null, null, new C17451f(C17438C.f144010a), new C17451f(X.f144073a)};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private Integer activeCombination;
    private String activeSocketSet;
    private List<Integer> additionalContacts;
    private int assetItemIndex;
    private ObjectInstanceId instanceId;
    private Boolean isMirrored;
    private List<Double> legacyRelativePosition;
    private ModelScreenTransform legacyScreenTransform;
    private Integer parentAttachmentSlot;
    private ObjectInstanceId parentInstanceId;
    private List<ParentDetails> parentPath;
    private String pluggedSocket;
    private Transform3D relativeTransform;
    private String stackedPlaneId;
    private String uniqueId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SceneLayoutInstanceItem> serializer() {
            return SceneLayoutInstanceItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SceneLayoutInstanceItem() {
        this(0, (ObjectInstanceId) null, (Transform3D) null, (ObjectInstanceId) null, (String) null, (String) null, (Integer) null, (List) null, (Integer) null, (Boolean) null, (ModelScreenTransform) null, (List) null, (List) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SceneLayoutInstanceItem copy$default(SceneLayoutInstanceItem sceneLayoutInstanceItem, int i10, ObjectInstanceId objectInstanceId, Transform3D transform3D, ObjectInstanceId objectInstanceId2, String str, String str2, Integer num, List list, Integer num2, Boolean bool, ModelScreenTransform modelScreenTransform, List list2, List list3, String str3, String str4, int i11, Object obj) {
        SceneLayoutInstanceItem sceneLayoutInstanceItem2 = sceneLayoutInstanceItem;
        int i12 = i11;
        return sceneLayoutInstanceItem.copy((i12 & 1) != 0 ? sceneLayoutInstanceItem2.assetItemIndex : i10, (i12 & 2) != 0 ? sceneLayoutInstanceItem2.instanceId : objectInstanceId, (i12 & 4) != 0 ? sceneLayoutInstanceItem2.relativeTransform : transform3D, (i12 & 8) != 0 ? sceneLayoutInstanceItem2.parentInstanceId : objectInstanceId2, (i12 & 16) != 0 ? sceneLayoutInstanceItem2.activeSocketSet : str, (i12 & 32) != 0 ? sceneLayoutInstanceItem2.pluggedSocket : str2, (i12 & 64) != 0 ? sceneLayoutInstanceItem2.parentAttachmentSlot : num, (i12 & 128) != 0 ? sceneLayoutInstanceItem2.parentPath : list, (i12 & 256) != 0 ? sceneLayoutInstanceItem2.activeCombination : num2, (i12 & 512) != 0 ? sceneLayoutInstanceItem2.isMirrored : bool, (i12 & 1024) != 0 ? sceneLayoutInstanceItem2.legacyScreenTransform : modelScreenTransform, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? sceneLayoutInstanceItem2.legacyRelativePosition : list2, (i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? sceneLayoutInstanceItem2.additionalContacts : list3, (i12 & 8192) != 0 ? sceneLayoutInstanceItem2.uniqueId : str3, (i12 & 16384) != 0 ? sceneLayoutInstanceItem2.stackedPlaneId : str4);
    }

    public static /* synthetic */ void getStackedPlaneId$annotations() {
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(SceneLayoutInstanceItem sceneLayoutInstanceItem, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (dVar.z(serialDescriptor, 0) || sceneLayoutInstanceItem.assetItemIndex != -1) {
            dVar.w(serialDescriptor, 0, sceneLayoutInstanceItem.assetItemIndex);
        }
        if (dVar.z(serialDescriptor, 1) || !C17542s.e(sceneLayoutInstanceItem.instanceId, ObjectInstanceId.Companion.getKNone())) {
            dVar.i(serialDescriptor, 1, ObjectInstanceIdSerializer.INSTANCE, sceneLayoutInstanceItem.instanceId);
        }
        if (dVar.z(serialDescriptor, 2) || sceneLayoutInstanceItem.relativeTransform != null) {
            dVar.B(serialDescriptor, 2, Transform3D$$serializer.INSTANCE, sceneLayoutInstanceItem.relativeTransform);
        }
        if (dVar.z(serialDescriptor, 3) || sceneLayoutInstanceItem.parentInstanceId != null) {
            dVar.B(serialDescriptor, 3, ObjectInstanceIdSerializer.INSTANCE, sceneLayoutInstanceItem.parentInstanceId);
        }
        if (dVar.z(serialDescriptor, 4) || sceneLayoutInstanceItem.activeSocketSet != null) {
            dVar.B(serialDescriptor, 4, Y0.f144077a, sceneLayoutInstanceItem.activeSocketSet);
        }
        if (dVar.z(serialDescriptor, 5) || sceneLayoutInstanceItem.pluggedSocket != null) {
            dVar.B(serialDescriptor, 5, Y0.f144077a, sceneLayoutInstanceItem.pluggedSocket);
        }
        if (dVar.z(serialDescriptor, 6) || sceneLayoutInstanceItem.parentAttachmentSlot != null) {
            dVar.B(serialDescriptor, 6, X.f144073a, sceneLayoutInstanceItem.parentAttachmentSlot);
        }
        if (dVar.z(serialDescriptor, 7) || sceneLayoutInstanceItem.parentPath != null) {
            dVar.B(serialDescriptor, 7, kSerializerArr[7], sceneLayoutInstanceItem.parentPath);
        }
        if (dVar.z(serialDescriptor, 8) || sceneLayoutInstanceItem.activeCombination != null) {
            dVar.B(serialDescriptor, 8, X.f144073a, sceneLayoutInstanceItem.activeCombination);
        }
        if (dVar.z(serialDescriptor, 9) || sceneLayoutInstanceItem.isMirrored != null) {
            dVar.B(serialDescriptor, 9, C17457i.f144111a, sceneLayoutInstanceItem.isMirrored);
        }
        if (dVar.z(serialDescriptor, 10) || sceneLayoutInstanceItem.legacyScreenTransform != null) {
            dVar.B(serialDescriptor, 10, ModelScreenTransformSerializer.INSTANCE, sceneLayoutInstanceItem.legacyScreenTransform);
        }
        if (dVar.z(serialDescriptor, 11) || sceneLayoutInstanceItem.legacyRelativePosition != null) {
            dVar.B(serialDescriptor, 11, kSerializerArr[11], sceneLayoutInstanceItem.legacyRelativePosition);
        }
        if (dVar.z(serialDescriptor, 12) || sceneLayoutInstanceItem.additionalContacts != null) {
            dVar.B(serialDescriptor, 12, kSerializerArr[12], sceneLayoutInstanceItem.additionalContacts);
        }
    }

    public final int component1() {
        return this.assetItemIndex;
    }

    public final Boolean component10() {
        return this.isMirrored;
    }

    public final ModelScreenTransform component11() {
        return this.legacyScreenTransform;
    }

    public final List<Double> component12() {
        return this.legacyRelativePosition;
    }

    public final List<Integer> component13() {
        return this.additionalContacts;
    }

    public final String component14() {
        return this.uniqueId;
    }

    public final String component15() {
        return this.stackedPlaneId;
    }

    public final ObjectInstanceId component2() {
        return this.instanceId;
    }

    public final Transform3D component3() {
        return this.relativeTransform;
    }

    public final ObjectInstanceId component4() {
        return this.parentInstanceId;
    }

    public final String component5() {
        return this.activeSocketSet;
    }

    public final String component6() {
        return this.pluggedSocket;
    }

    public final Integer component7() {
        return this.parentAttachmentSlot;
    }

    public final List<ParentDetails> component8() {
        return this.parentPath;
    }

    public final Integer component9() {
        return this.activeCombination;
    }

    public final SceneLayoutInstanceItem copy(int i10, ObjectInstanceId objectInstanceId, Transform3D transform3D, ObjectInstanceId objectInstanceId2, String str, String str2, Integer num, List<ParentDetails> list, Integer num2, Boolean bool, ModelScreenTransform modelScreenTransform, List<Double> list2, List<Integer> list3, String str3, String str4) {
        ObjectInstanceId objectInstanceId3 = objectInstanceId;
        C17542s.j(objectInstanceId3, "instanceId");
        return new SceneLayoutInstanceItem(i10, objectInstanceId3, transform3D, objectInstanceId2, str, str2, num, list, num2, bool, modelScreenTransform, list2, list3, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SceneLayoutInstanceItem)) {
            return false;
        }
        SceneLayoutInstanceItem sceneLayoutInstanceItem = (SceneLayoutInstanceItem) obj;
        return this.assetItemIndex == sceneLayoutInstanceItem.assetItemIndex && C17542s.e(this.instanceId, sceneLayoutInstanceItem.instanceId) && C17542s.e(this.relativeTransform, sceneLayoutInstanceItem.relativeTransform) && C17542s.e(this.parentInstanceId, sceneLayoutInstanceItem.parentInstanceId) && C17542s.e(this.activeSocketSet, sceneLayoutInstanceItem.activeSocketSet) && C17542s.e(this.pluggedSocket, sceneLayoutInstanceItem.pluggedSocket) && C17542s.e(this.parentAttachmentSlot, sceneLayoutInstanceItem.parentAttachmentSlot) && C17542s.e(this.parentPath, sceneLayoutInstanceItem.parentPath) && C17542s.e(this.activeCombination, sceneLayoutInstanceItem.activeCombination) && C17542s.e(this.isMirrored, sceneLayoutInstanceItem.isMirrored) && C17542s.e(this.legacyScreenTransform, sceneLayoutInstanceItem.legacyScreenTransform) && C17542s.e(this.legacyRelativePosition, sceneLayoutInstanceItem.legacyRelativePosition) && C17542s.e(this.additionalContacts, sceneLayoutInstanceItem.additionalContacts) && C17542s.e(this.uniqueId, sceneLayoutInstanceItem.uniqueId) && C17542s.e(this.stackedPlaneId, sceneLayoutInstanceItem.stackedPlaneId);
    }

    public final Integer getActiveCombination() {
        return this.activeCombination;
    }

    public final String getActiveSocketSet() {
        return this.activeSocketSet;
    }

    public final List<Integer> getAdditionalContacts() {
        return this.additionalContacts;
    }

    public final int getAssetItemIndex() {
        return this.assetItemIndex;
    }

    public final ObjectInstanceId getInstanceId() {
        return this.instanceId;
    }

    public final List<Double> getLegacyRelativePosition() {
        return this.legacyRelativePosition;
    }

    public final ModelScreenTransform getLegacyScreenTransform() {
        return this.legacyScreenTransform;
    }

    public final Integer getParentAttachmentSlot() {
        return this.parentAttachmentSlot;
    }

    public final ObjectInstanceId getParentInstanceId() {
        return this.parentInstanceId;
    }

    public final List<ParentDetails> getParentPath() {
        return this.parentPath;
    }

    public final String getPluggedSocket() {
        return this.pluggedSocket;
    }

    public final Transform3D getRelativeTransform() {
        return this.relativeTransform;
    }

    public final String getStackedPlaneId() {
        return this.stackedPlaneId;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.assetItemIndex) * 31) + this.instanceId.hashCode()) * 31;
        Transform3D transform3D = this.relativeTransform;
        int i10 = 0;
        int hashCode2 = (hashCode + (transform3D == null ? 0 : transform3D.hashCode())) * 31;
        ObjectInstanceId objectInstanceId = this.parentInstanceId;
        int hashCode3 = (hashCode2 + (objectInstanceId == null ? 0 : objectInstanceId.hashCode())) * 31;
        String str = this.activeSocketSet;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pluggedSocket;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.parentAttachmentSlot;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<ParentDetails> list = this.parentPath;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.activeCombination;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isMirrored;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        ModelScreenTransform modelScreenTransform = this.legacyScreenTransform;
        int hashCode10 = (hashCode9 + (modelScreenTransform == null ? 0 : modelScreenTransform.hashCode())) * 31;
        List<Double> list2 = this.legacyRelativePosition;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.additionalContacts;
        int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.uniqueId;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stackedPlaneId;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode13 + i10;
    }

    public final Boolean isMirrored() {
        return this.isMirrored;
    }

    public final void setActiveCombination(Integer num) {
        this.activeCombination = num;
    }

    public final void setActiveSocketSet(String str) {
        this.activeSocketSet = str;
    }

    public final void setAdditionalContacts(List<Integer> list) {
        this.additionalContacts = list;
    }

    public final void setAssetItemIndex(int i10) {
        this.assetItemIndex = i10;
    }

    public final void setInstanceId(ObjectInstanceId objectInstanceId) {
        C17542s.j(objectInstanceId, "<set-?>");
        this.instanceId = objectInstanceId;
    }

    public final void setLegacyRelativePosition(List<Double> list) {
        this.legacyRelativePosition = list;
    }

    public final void setLegacyScreenTransform(ModelScreenTransform modelScreenTransform) {
        this.legacyScreenTransform = modelScreenTransform;
    }

    public final void setMirrored(Boolean bool) {
        this.isMirrored = bool;
    }

    public final void setParentAttachmentSlot(Integer num) {
        this.parentAttachmentSlot = num;
    }

    public final void setParentInstanceId(ObjectInstanceId objectInstanceId) {
        this.parentInstanceId = objectInstanceId;
    }

    public final void setParentPath(List<ParentDetails> list) {
        this.parentPath = list;
    }

    public final void setPluggedSocket(String str) {
        this.pluggedSocket = str;
    }

    public final void setRelativeTransform(Transform3D transform3D) {
        this.relativeTransform = transform3D;
    }

    public final void setStackedPlaneId(String str) {
        this.stackedPlaneId = str;
    }

    public final void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public String toString() {
        int i10 = this.assetItemIndex;
        ObjectInstanceId objectInstanceId = this.instanceId;
        Transform3D transform3D = this.relativeTransform;
        ObjectInstanceId objectInstanceId2 = this.parentInstanceId;
        String str = this.activeSocketSet;
        String str2 = this.pluggedSocket;
        Integer num = this.parentAttachmentSlot;
        List<ParentDetails> list = this.parentPath;
        Integer num2 = this.activeCombination;
        Boolean bool = this.isMirrored;
        ModelScreenTransform modelScreenTransform = this.legacyScreenTransform;
        List<Double> list2 = this.legacyRelativePosition;
        List<Integer> list3 = this.additionalContacts;
        String str3 = this.uniqueId;
        String str4 = this.stackedPlaneId;
        return "SceneLayoutInstanceItem(assetItemIndex=" + i10 + ", instanceId=" + objectInstanceId + ", relativeTransform=" + transform3D + ", parentInstanceId=" + objectInstanceId2 + ", activeSocketSet=" + str + ", pluggedSocket=" + str2 + ", parentAttachmentSlot=" + num + ", parentPath=" + list + ", activeCombination=" + num2 + ", isMirrored=" + bool + ", legacyScreenTransform=" + modelScreenTransform + ", legacyRelativePosition=" + list2 + ", additionalContacts=" + list3 + ", uniqueId=" + str3 + ", stackedPlaneId=" + str4 + ")";
    }

    @C16814e
    public /* synthetic */ SceneLayoutInstanceItem(int i10, int i11, ObjectInstanceId objectInstanceId, Transform3D transform3D, ObjectInstanceId objectInstanceId2, String str, String str2, Integer num, List list, Integer num2, Boolean bool, ModelScreenTransform modelScreenTransform, List list2, List list3, T0 t02) {
        ObjectInstanceId objectInstanceId3;
        int i12 = i10;
        this.assetItemIndex = (i12 & 1) == 0 ? -1 : i11;
        if ((i12 & 2) == 0) {
            objectInstanceId3 = ObjectInstanceId.Companion.getKNone();
        } else {
            objectInstanceId3 = objectInstanceId;
        }
        this.instanceId = objectInstanceId3;
        if ((i12 & 4) == 0) {
            this.relativeTransform = null;
        } else {
            this.relativeTransform = transform3D;
        }
        if ((i12 & 8) == 0) {
            this.parentInstanceId = null;
        } else {
            this.parentInstanceId = objectInstanceId2;
        }
        if ((i12 & 16) == 0) {
            this.activeSocketSet = null;
        } else {
            this.activeSocketSet = str;
        }
        if ((i12 & 32) == 0) {
            this.pluggedSocket = null;
        } else {
            this.pluggedSocket = str2;
        }
        if ((i12 & 64) == 0) {
            this.parentAttachmentSlot = null;
        } else {
            this.parentAttachmentSlot = num;
        }
        if ((i12 & 128) == 0) {
            this.parentPath = null;
        } else {
            this.parentPath = list;
        }
        if ((i12 & 256) == 0) {
            this.activeCombination = null;
        } else {
            this.activeCombination = num2;
        }
        if ((i12 & 512) == 0) {
            this.isMirrored = null;
        } else {
            this.isMirrored = bool;
        }
        if ((i12 & 1024) == 0) {
            this.legacyScreenTransform = null;
        } else {
            this.legacyScreenTransform = modelScreenTransform;
        }
        if ((i12 & RecyclerView.n.FLAG_MOVED) == 0) {
            this.legacyRelativePosition = null;
        } else {
            this.legacyRelativePosition = list2;
        }
        if ((i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.additionalContacts = null;
        } else {
            this.additionalContacts = list3;
        }
        this.uniqueId = null;
        this.stackedPlaneId = null;
    }

    public SceneLayoutInstanceItem(int i10, ObjectInstanceId objectInstanceId, Transform3D transform3D, ObjectInstanceId objectInstanceId2, String str, String str2, Integer num, List<ParentDetails> list, Integer num2, Boolean bool, ModelScreenTransform modelScreenTransform, List<Double> list2, List<Integer> list3, String str3, String str4) {
        C17542s.j(objectInstanceId, "instanceId");
        this.assetItemIndex = i10;
        this.instanceId = objectInstanceId;
        this.relativeTransform = transform3D;
        this.parentInstanceId = objectInstanceId2;
        this.activeSocketSet = str;
        this.pluggedSocket = str2;
        this.parentAttachmentSlot = num;
        this.parentPath = list;
        this.activeCombination = num2;
        this.isMirrored = bool;
        this.legacyScreenTransform = modelScreenTransform;
        this.legacyRelativePosition = list2;
        this.additionalContacts = list3;
        this.uniqueId = str3;
        this.stackedPlaneId = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SceneLayoutInstanceItem(int r17, com.sugarcube.decorate_engine.ObjectInstanceId r18, com.sugarcube.decorate_engine.Transform3D r19, com.sugarcube.decorate_engine.ObjectInstanceId r20, java.lang.String r21, java.lang.String r22, java.lang.Integer r23, java.util.List r24, java.lang.Integer r25, java.lang.Boolean r26, com.sugarcube.decorate_engine.ModelScreenTransform r27, java.util.List r28, java.util.List r29, java.lang.String r30, java.lang.String r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = -1
            goto L_0x000a
        L_0x0008:
            r1 = r17
        L_0x000a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0015
            com.sugarcube.decorate_engine.ObjectInstanceId$Companion r2 = com.sugarcube.decorate_engine.ObjectInstanceId.Companion
            com.sugarcube.decorate_engine.ObjectInstanceId r2 = r2.getKNone()
            goto L_0x0017
        L_0x0015:
            r2 = r18
        L_0x0017:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x001e
            r3 = r4
            goto L_0x0020
        L_0x001e:
            r3 = r19
        L_0x0020:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0026
            r5 = r4
            goto L_0x0028
        L_0x0026:
            r5 = r20
        L_0x0028:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002e
            r6 = r4
            goto L_0x0030
        L_0x002e:
            r6 = r21
        L_0x0030:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0036
            r7 = r4
            goto L_0x0038
        L_0x0036:
            r7 = r22
        L_0x0038:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003e
            r8 = r4
            goto L_0x0040
        L_0x003e:
            r8 = r23
        L_0x0040:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0046
            r9 = r4
            goto L_0x0048
        L_0x0046:
            r9 = r24
        L_0x0048:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004e
            r10 = r4
            goto L_0x0050
        L_0x004e:
            r10 = r25
        L_0x0050:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0056
            r11 = r4
            goto L_0x0058
        L_0x0056:
            r11 = r26
        L_0x0058:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005e
            r12 = r4
            goto L_0x0060
        L_0x005e:
            r12 = r27
        L_0x0060:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0066
            r13 = r4
            goto L_0x0068
        L_0x0066:
            r13 = r28
        L_0x0068:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x006e
            r14 = r4
            goto L_0x0070
        L_0x006e:
            r14 = r29
        L_0x0070:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0076
            r15 = r4
            goto L_0x0078
        L_0x0076:
            r15 = r30
        L_0x0078:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r4 = r31
        L_0x007f:
            r17 = r16
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            r32 = r4
            r17.<init>((int) r18, (com.sugarcube.decorate_engine.ObjectInstanceId) r19, (com.sugarcube.decorate_engine.Transform3D) r20, (com.sugarcube.decorate_engine.ObjectInstanceId) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.Integer) r24, (java.util.List<com.sugarcube.decorate_engine.ParentDetails>) r25, (java.lang.Integer) r26, (java.lang.Boolean) r27, (com.sugarcube.decorate_engine.ModelScreenTransform) r28, (java.util.List<java.lang.Double>) r29, (java.util.List<java.lang.Integer>) r30, (java.lang.String) r31, (java.lang.String) r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.SceneLayoutInstanceItem.<init>(int, com.sugarcube.decorate_engine.ObjectInstanceId, com.sugarcube.decorate_engine.Transform3D, com.sugarcube.decorate_engine.ObjectInstanceId, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.lang.Integer, java.lang.Boolean, com.sugarcube.decorate_engine.ModelScreenTransform, java.util.List, java.util.List, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
