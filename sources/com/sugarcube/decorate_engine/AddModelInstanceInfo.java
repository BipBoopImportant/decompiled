package com.sugarcube.decorate_engine;

import XH.C16814e;
import fK.p;
import fK.z;
import jK.T0;
import java.util.List;
import java.util.Map;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001d¨\u0006-"}, d2 = {"Lcom/sugarcube/decorate_engine/AddModelInstanceInfo;", "", "Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;", "assetItem", "Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "instanceItem", "<init>", "(Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILcom/sugarcube/decorate_engine/SceneLayoutAssetItem;Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/AddModelInstanceInfo;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toJson$decorate_engine_release", "()Ljava/lang/String;", "toJson", "component1", "()Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;", "component2", "()Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "copy", "(Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;)Lcom/sugarcube/decorate_engine/AddModelInstanceInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;", "getAssetItem", "Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "getInstanceItem", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AddModelInstanceInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final SceneLayoutAssetItem assetItem;
    private final SceneLayoutInstanceItem instanceItem;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/AddModelInstanceInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/AddModelInstanceInfo;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddModelInstanceInfo> serializer() {
            return AddModelInstanceInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AddModelInstanceInfo() {
        this((SceneLayoutAssetItem) null, (SceneLayoutInstanceItem) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AddModelInstanceInfo copy$default(AddModelInstanceInfo addModelInstanceInfo, SceneLayoutAssetItem sceneLayoutAssetItem, SceneLayoutInstanceItem sceneLayoutInstanceItem, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sceneLayoutAssetItem = addModelInstanceInfo.assetItem;
        }
        if ((i10 & 2) != 0) {
            sceneLayoutInstanceItem = addModelInstanceInfo.instanceItem;
        }
        return addModelInstanceInfo.copy(sceneLayoutAssetItem, sceneLayoutInstanceItem);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        if (kotlin.jvm.internal.C17542s.e(r4, r3) == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void write$Self$decorate_engine_release(com.sugarcube.decorate_engine.AddModelInstanceInfo r24, iK.C17395d r25, kotlinx.serialization.descriptors.SerialDescriptor r26) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = 0
            boolean r4 = r1.z(r2, r3)
            if (r4 == 0) goto L_0x000e
            goto L_0x0039
        L_0x000e:
            com.sugarcube.decorate_engine.SceneLayoutAssetItem r4 = r0.assetItem
            com.sugarcube.decorate_engine.SceneLayoutAssetItem r15 = new com.sugarcube.decorate_engine.SceneLayoutAssetItem
            r5 = r15
            r22 = 65535(0xffff, float:9.1834E-41)
            r23 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r3 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r5.<init>((java.lang.String) r6, (boolean) r7, (int) r8, (int) r9, (java.util.List) r10, (java.util.List) r11, (java.util.List) r12, (java.util.List) r13, (java.util.List) r14, (java.util.Map) r15, (java.util.List) r16, (com.sugarcube.decorate_engine.CombinablePlugRules) r17, (java.util.List) r18, (java.util.List) r19, (java.util.List) r20, (java.util.List) r21, (int) r22, (kotlin.jvm.internal.DefaultConstructorMarker) r23)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r4, r3)
            if (r3 != 0) goto L_0x0041
        L_0x0039:
            com.sugarcube.decorate_engine.SceneLayoutAssetItem$$serializer r3 = com.sugarcube.decorate_engine.SceneLayoutAssetItem$$serializer.INSTANCE
            com.sugarcube.decorate_engine.SceneLayoutAssetItem r4 = r0.assetItem
            r5 = 0
            r1.i(r2, r5, r3, r4)
        L_0x0041:
            r3 = 1
            boolean r4 = r1.z(r2, r3)
            if (r4 == 0) goto L_0x0049
            goto L_0x0071
        L_0x0049:
            com.sugarcube.decorate_engine.SceneLayoutInstanceItem r4 = r0.instanceItem
            com.sugarcube.decorate_engine.SceneLayoutInstanceItem r15 = new com.sugarcube.decorate_engine.SceneLayoutInstanceItem
            r5 = r15
            r21 = 32767(0x7fff, float:4.5916E-41)
            r22 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r3 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r4, r3)
            if (r3 != 0) goto L_0x0079
        L_0x0071:
            com.sugarcube.decorate_engine.SceneLayoutInstanceItem$$serializer r3 = com.sugarcube.decorate_engine.SceneLayoutInstanceItem$$serializer.INSTANCE
            com.sugarcube.decorate_engine.SceneLayoutInstanceItem r0 = r0.instanceItem
            r4 = 1
            r1.i(r2, r4, r3, r0)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.AddModelInstanceInfo.write$Self$decorate_engine_release(com.sugarcube.decorate_engine.AddModelInstanceInfo, iK.d, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final SceneLayoutAssetItem component1() {
        return this.assetItem;
    }

    public final SceneLayoutInstanceItem component2() {
        return this.instanceItem;
    }

    public final AddModelInstanceInfo copy(SceneLayoutAssetItem sceneLayoutAssetItem, SceneLayoutInstanceItem sceneLayoutInstanceItem) {
        C17542s.j(sceneLayoutAssetItem, "assetItem");
        C17542s.j(sceneLayoutInstanceItem, "instanceItem");
        return new AddModelInstanceInfo(sceneLayoutAssetItem, sceneLayoutInstanceItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddModelInstanceInfo)) {
            return false;
        }
        AddModelInstanceInfo addModelInstanceInfo = (AddModelInstanceInfo) obj;
        return C17542s.e(this.assetItem, addModelInstanceInfo.assetItem) && C17542s.e(this.instanceItem, addModelInstanceInfo.instanceItem);
    }

    public final SceneLayoutAssetItem getAssetItem() {
        return this.assetItem;
    }

    public final SceneLayoutInstanceItem getInstanceItem() {
        return this.instanceItem;
    }

    public int hashCode() {
        return (this.assetItem.hashCode() * 31) + this.instanceItem.hashCode();
    }

    public final String toJson$decorate_engine_release() {
        this.assetItem.getAssetPath().length();
        C17514c json = ConfiguredEncoder.Companion.getJson();
        KSerializer<Object> d10 = z.d(json.a(), P.l(AddModelInstanceInfo.class));
        C17542s.h(d10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return json.b(d10, this);
    }

    public String toString() {
        SceneLayoutAssetItem sceneLayoutAssetItem = this.assetItem;
        SceneLayoutInstanceItem sceneLayoutInstanceItem = this.instanceItem;
        return "AddModelInstanceInfo(assetItem=" + sceneLayoutAssetItem + ", instanceItem=" + sceneLayoutInstanceItem + ")";
    }

    @C16814e
    public /* synthetic */ AddModelInstanceInfo(int i10, SceneLayoutAssetItem sceneLayoutAssetItem, SceneLayoutInstanceItem sceneLayoutInstanceItem, T0 t02) {
        SceneLayoutAssetItem sceneLayoutAssetItem2;
        SceneLayoutInstanceItem sceneLayoutInstanceItem2;
        if ((i10 & 1) == 0) {
            sceneLayoutAssetItem2 = new SceneLayoutAssetItem((String) null, false, 0, 0, (List) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (List) null, (CombinablePlugRules) null, (List) null, (List) null, (List) null, (List) null, 65535, (DefaultConstructorMarker) null);
        } else {
            sceneLayoutAssetItem2 = sceneLayoutAssetItem;
        }
        this.assetItem = sceneLayoutAssetItem2;
        if ((i10 & 2) == 0) {
            sceneLayoutInstanceItem2 = new SceneLayoutInstanceItem(0, (ObjectInstanceId) null, (Transform3D) null, (ObjectInstanceId) null, (String) null, (String) null, (Integer) null, (List) null, (Integer) null, (Boolean) null, (ModelScreenTransform) null, (List) null, (List) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
        } else {
            sceneLayoutInstanceItem2 = sceneLayoutInstanceItem;
        }
        this.instanceItem = sceneLayoutInstanceItem2;
    }

    public AddModelInstanceInfo(SceneLayoutAssetItem sceneLayoutAssetItem, SceneLayoutInstanceItem sceneLayoutInstanceItem) {
        C17542s.j(sceneLayoutAssetItem, "assetItem");
        C17542s.j(sceneLayoutInstanceItem, "instanceItem");
        this.assetItem = sceneLayoutAssetItem;
        this.instanceItem = sceneLayoutInstanceItem;
    }

    public /* synthetic */ AddModelInstanceInfo(SceneLayoutAssetItem sceneLayoutAssetItem, SceneLayoutInstanceItem sceneLayoutInstanceItem, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        AddModelInstanceInfo addModelInstanceInfo;
        SceneLayoutInstanceItem sceneLayoutInstanceItem2;
        SceneLayoutAssetItem sceneLayoutAssetItem2 = (i10 & 1) != 0 ? new SceneLayoutAssetItem((String) null, false, 0, 0, (List) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (List) null, (CombinablePlugRules) null, (List) null, (List) null, (List) null, (List) null, 65535, (DefaultConstructorMarker) null) : sceneLayoutAssetItem;
        if ((i10 & 2) != 0) {
            sceneLayoutInstanceItem2 = new SceneLayoutInstanceItem(0, (ObjectInstanceId) null, (Transform3D) null, (ObjectInstanceId) null, (String) null, (String) null, (Integer) null, (List) null, (Integer) null, (Boolean) null, (ModelScreenTransform) null, (List) null, (List) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
            addModelInstanceInfo = this;
        } else {
            addModelInstanceInfo = this;
            sceneLayoutInstanceItem2 = sceneLayoutInstanceItem;
        }
        new AddModelInstanceInfo(sceneLayoutAssetItem2, sceneLayoutInstanceItem2);
    }
}
