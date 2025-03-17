package com.sugarcube.decorate_engine;

import XH.C16814e;
import YH.C16877v;
import fK.p;
import fK.z;
import iK.C17395d;
import jK.C17451f;
import jK.T0;
import java.util.List;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u0000 22\u00020\u0001:\u000232B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J*\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u001b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010-R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010!\"\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/sugarcube/decorate_engine/SomeAssemblyRequired;", "", "", "Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;", "assetItems", "Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "instanceItem", "<init>", "(Ljava/util/List;Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/SomeAssemblyRequired;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toJson$decorate_engine_release", "()Ljava/lang/String;", "toJson", "", "isEmpty", "()Z", "component1", "()Ljava/util/List;", "component2", "()Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "copy", "(Ljava/util/List;Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;)Lcom/sugarcube/decorate_engine/SomeAssemblyRequired;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAssetItems", "setAssetItems", "(Ljava/util/List;)V", "Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;", "getInstanceItem", "setInstanceItem", "(Lcom/sugarcube/decorate_engine/SceneLayoutInstanceItem;)V", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SomeAssemblyRequired {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {new C17451f(SceneLayoutAssetItem$$serializer.INSTANCE), null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private List<SceneLayoutAssetItem> assetItems;
    private SceneLayoutInstanceItem instanceItem;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/SomeAssemblyRequired$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/SomeAssemblyRequired;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SomeAssemblyRequired> serializer() {
            return SomeAssemblyRequired$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SomeAssemblyRequired() {
        this((List) null, (SceneLayoutInstanceItem) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SomeAssemblyRequired copy$default(SomeAssemblyRequired someAssemblyRequired, List<SceneLayoutAssetItem> list, SceneLayoutInstanceItem sceneLayoutInstanceItem, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = someAssemblyRequired.assetItems;
        }
        if ((i10 & 2) != 0) {
            sceneLayoutInstanceItem = someAssemblyRequired.instanceItem;
        }
        return someAssemblyRequired.copy(list, sceneLayoutInstanceItem);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(SomeAssemblyRequired someAssemblyRequired, C17395d dVar, SerialDescriptor serialDescriptor) {
        SomeAssemblyRequired someAssemblyRequired2 = someAssemblyRequired;
        C17395d dVar2 = dVar;
        SerialDescriptor serialDescriptor2 = serialDescriptor;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (dVar2.z(serialDescriptor2, 0) || !C17542s.e(someAssemblyRequired2.assetItems, C16877v.n())) {
            dVar2.i(serialDescriptor2, 0, kSerializerArr[0], someAssemblyRequired2.assetItems);
        }
        if (!dVar2.z(serialDescriptor2, 1)) {
            SceneLayoutInstanceItem sceneLayoutInstanceItem = someAssemblyRequired2.instanceItem;
            SceneLayoutInstanceItem sceneLayoutInstanceItem2 = r5;
            SceneLayoutInstanceItem sceneLayoutInstanceItem3 = new SceneLayoutInstanceItem(0, (ObjectInstanceId) null, (Transform3D) null, (ObjectInstanceId) null, (String) null, (String) null, (Integer) null, (List) null, (Integer) null, (Boolean) null, (ModelScreenTransform) null, (List) null, (List) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
            if (C17542s.e(sceneLayoutInstanceItem, sceneLayoutInstanceItem2)) {
                return;
            }
        }
        dVar2.i(serialDescriptor2, 1, SceneLayoutInstanceItem$$serializer.INSTANCE, someAssemblyRequired2.instanceItem);
    }

    public final List<SceneLayoutAssetItem> component1() {
        return this.assetItems;
    }

    public final SceneLayoutInstanceItem component2() {
        return this.instanceItem;
    }

    public final SomeAssemblyRequired copy(List<SceneLayoutAssetItem> list, SceneLayoutInstanceItem sceneLayoutInstanceItem) {
        C17542s.j(list, "assetItems");
        C17542s.j(sceneLayoutInstanceItem, "instanceItem");
        return new SomeAssemblyRequired(list, sceneLayoutInstanceItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SomeAssemblyRequired)) {
            return false;
        }
        SomeAssemblyRequired someAssemblyRequired = (SomeAssemblyRequired) obj;
        return C17542s.e(this.assetItems, someAssemblyRequired.assetItems) && C17542s.e(this.instanceItem, someAssemblyRequired.instanceItem);
    }

    public final List<SceneLayoutAssetItem> getAssetItems() {
        return this.assetItems;
    }

    public final SceneLayoutInstanceItem getInstanceItem() {
        return this.instanceItem;
    }

    public int hashCode() {
        return (this.assetItems.hashCode() * 31) + this.instanceItem.hashCode();
    }

    public final boolean isEmpty() {
        return this.assetItems.isEmpty();
    }

    public final void setAssetItems(List<SceneLayoutAssetItem> list) {
        C17542s.j(list, "<set-?>");
        this.assetItems = list;
    }

    public final void setInstanceItem(SceneLayoutInstanceItem sceneLayoutInstanceItem) {
        C17542s.j(sceneLayoutInstanceItem, "<set-?>");
        this.instanceItem = sceneLayoutInstanceItem;
    }

    public final String toJson$decorate_engine_release() {
        if (isEmpty()) {
            return "";
        }
        C17514c json = ConfiguredEncoder.Companion.getJson();
        KSerializer<Object> d10 = z.d(json.a(), P.l(SomeAssemblyRequired.class));
        C17542s.h(d10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return json.b(d10, this);
    }

    public String toString() {
        List<SceneLayoutAssetItem> list = this.assetItems;
        SceneLayoutInstanceItem sceneLayoutInstanceItem = this.instanceItem;
        return "SomeAssemblyRequired(assetItems=" + list + ", instanceItem=" + sceneLayoutInstanceItem + ")";
    }

    @C16814e
    public /* synthetic */ SomeAssemblyRequired(int i10, List list, SceneLayoutInstanceItem sceneLayoutInstanceItem, T0 t02) {
        List list2;
        SceneLayoutInstanceItem sceneLayoutInstanceItem2;
        if ((i10 & 1) == 0) {
            list2 = C16877v.n();
        } else {
            list2 = list;
        }
        this.assetItems = list2;
        if ((i10 & 2) == 0) {
            sceneLayoutInstanceItem2 = new SceneLayoutInstanceItem(0, (ObjectInstanceId) null, (Transform3D) null, (ObjectInstanceId) null, (String) null, (String) null, (Integer) null, (List) null, (Integer) null, (Boolean) null, (ModelScreenTransform) null, (List) null, (List) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
        } else {
            sceneLayoutInstanceItem2 = sceneLayoutInstanceItem;
        }
        this.instanceItem = sceneLayoutInstanceItem2;
    }

    public SomeAssemblyRequired(List<SceneLayoutAssetItem> list, SceneLayoutInstanceItem sceneLayoutInstanceItem) {
        C17542s.j(list, "assetItems");
        C17542s.j(sceneLayoutInstanceItem, "instanceItem");
        this.assetItems = list;
        this.instanceItem = sceneLayoutInstanceItem;
    }

    public /* synthetic */ SomeAssemblyRequired(List list, SceneLayoutInstanceItem sceneLayoutInstanceItem, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        SomeAssemblyRequired someAssemblyRequired;
        SceneLayoutInstanceItem sceneLayoutInstanceItem2;
        List n10 = (i10 & 1) != 0 ? C16877v.n() : list;
        if ((i10 & 2) != 0) {
            sceneLayoutInstanceItem2 = new SceneLayoutInstanceItem(0, (ObjectInstanceId) null, (Transform3D) null, (ObjectInstanceId) null, (String) null, (String) null, (Integer) null, (List) null, (Integer) null, (Boolean) null, (ModelScreenTransform) null, (List) null, (List) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
            someAssemblyRequired = this;
        } else {
            someAssemblyRequired = this;
            sceneLayoutInstanceItem2 = sceneLayoutInstanceItem;
        }
        new SomeAssemblyRequired(n10, sceneLayoutInstanceItem2);
    }
}
