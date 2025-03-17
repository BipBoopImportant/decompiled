package com.sugarcube.decorate_engine;

import XH.C16814e;
import YH.C16877v;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\b\b\u0018\u0000 F2\u00020\u0001:\u0002GFBi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011Bu\b\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J(\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÁ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b/\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b0\u0010-Jx\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b3\u0010-J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010$J\u001a\u00106\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010'R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bC\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bD\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bE\u0010-¨\u0006H"}, d2 = {"Lcom/sugarcube/decorate_engine/ModelInstanceDetails;", "", "", "productId", "featureFlags", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "parentId", "", "children", "", "selected", "", "activeSocketSet", "pluggedSocket", "socketCategory", "linkGroupName", "<init>", "(IILcom/sugarcube/decorate_engine/ObjectInstanceId;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "LjK/T0;", "serializationConstructorMarker", "(IIILcom/sugarcube/decorate_engine/ObjectInstanceId;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/ModelInstanceDetails;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sugarcube/decorate_engine/FeatureFlagBit;", "flag", "hasFeatureFlag", "(Lcom/sugarcube/decorate_engine/FeatureFlagBit;)Z", "component1", "()I", "component2", "component3", "()Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "component4", "()Ljava/util/List;", "component5", "()Z", "component6", "()Ljava/lang/String;", "component7", "component8", "component9", "copy", "(IILcom/sugarcube/decorate_engine/ObjectInstanceId;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sugarcube/decorate_engine/ModelInstanceDetails;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getProductId", "getFeatureFlags", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "getParentId", "Ljava/util/List;", "getChildren", "Z", "getSelected", "Ljava/lang/String;", "getActiveSocketSet", "getPluggedSocket", "getSocketCategory", "getLinkGroupName", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ModelInstanceDetails {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new C17451f(ObjectInstanceIdSerializer.INSTANCE), null, null, null, null, null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String activeSocketSet;
    private final List<ObjectInstanceId> children;
    private final int featureFlags;
    private final String linkGroupName;
    private final ObjectInstanceId parentId;
    private final String pluggedSocket;
    private final int productId;
    private final boolean selected;
    private final String socketCategory;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/ModelInstanceDetails$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/ModelInstanceDetails;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ModelInstanceDetails> serializer() {
            return ModelInstanceDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C16814e
    public /* synthetic */ ModelInstanceDetails(int i10, int i11, int i12, ObjectInstanceId objectInstanceId, List list, boolean z10, String str, String str2, String str3, String str4, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ModelInstanceDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.productId = i11;
        this.featureFlags = i12;
        this.parentId = objectInstanceId;
        if ((i10 & 8) == 0) {
            this.children = C16877v.n();
        } else {
            this.children = list;
        }
        if ((i10 & 16) == 0) {
            this.selected = false;
        } else {
            this.selected = z10;
        }
        if ((i10 & 32) == 0) {
            this.activeSocketSet = null;
        } else {
            this.activeSocketSet = str;
        }
        if ((i10 & 64) == 0) {
            this.pluggedSocket = null;
        } else {
            this.pluggedSocket = str2;
        }
        if ((i10 & 128) == 0) {
            this.socketCategory = null;
        } else {
            this.socketCategory = str3;
        }
        if ((i10 & 256) == 0) {
            this.linkGroupName = null;
        } else {
            this.linkGroupName = str4;
        }
    }

    public static /* synthetic */ ModelInstanceDetails copy$default(ModelInstanceDetails modelInstanceDetails, int i10, int i11, ObjectInstanceId objectInstanceId, List list, boolean z10, String str, String str2, String str3, String str4, int i12, Object obj) {
        ModelInstanceDetails modelInstanceDetails2 = modelInstanceDetails;
        int i13 = i12;
        return modelInstanceDetails.copy((i13 & 1) != 0 ? modelInstanceDetails2.productId : i10, (i13 & 2) != 0 ? modelInstanceDetails2.featureFlags : i11, (i13 & 4) != 0 ? modelInstanceDetails2.parentId : objectInstanceId, (i13 & 8) != 0 ? modelInstanceDetails2.children : list, (i13 & 16) != 0 ? modelInstanceDetails2.selected : z10, (i13 & 32) != 0 ? modelInstanceDetails2.activeSocketSet : str, (i13 & 64) != 0 ? modelInstanceDetails2.pluggedSocket : str2, (i13 & 128) != 0 ? modelInstanceDetails2.socketCategory : str3, (i13 & 256) != 0 ? modelInstanceDetails2.linkGroupName : str4);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(ModelInstanceDetails modelInstanceDetails, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        dVar.w(serialDescriptor, 0, modelInstanceDetails.productId);
        dVar.w(serialDescriptor, 1, modelInstanceDetails.featureFlags);
        dVar.i(serialDescriptor, 2, ObjectInstanceIdSerializer.INSTANCE, modelInstanceDetails.parentId);
        if (dVar.z(serialDescriptor, 3) || !C17542s.e(modelInstanceDetails.children, C16877v.n())) {
            dVar.i(serialDescriptor, 3, kSerializerArr[3], modelInstanceDetails.children);
        }
        if (dVar.z(serialDescriptor, 4) || modelInstanceDetails.selected) {
            dVar.x(serialDescriptor, 4, modelInstanceDetails.selected);
        }
        if (dVar.z(serialDescriptor, 5) || modelInstanceDetails.activeSocketSet != null) {
            dVar.B(serialDescriptor, 5, Y0.f144077a, modelInstanceDetails.activeSocketSet);
        }
        if (dVar.z(serialDescriptor, 6) || modelInstanceDetails.pluggedSocket != null) {
            dVar.B(serialDescriptor, 6, Y0.f144077a, modelInstanceDetails.pluggedSocket);
        }
        if (dVar.z(serialDescriptor, 7) || modelInstanceDetails.socketCategory != null) {
            dVar.B(serialDescriptor, 7, Y0.f144077a, modelInstanceDetails.socketCategory);
        }
        if (dVar.z(serialDescriptor, 8) || modelInstanceDetails.linkGroupName != null) {
            dVar.B(serialDescriptor, 8, Y0.f144077a, modelInstanceDetails.linkGroupName);
        }
    }

    public final int component1() {
        return this.productId;
    }

    public final int component2() {
        return this.featureFlags;
    }

    public final ObjectInstanceId component3() {
        return this.parentId;
    }

    public final List<ObjectInstanceId> component4() {
        return this.children;
    }

    public final boolean component5() {
        return this.selected;
    }

    public final String component6() {
        return this.activeSocketSet;
    }

    public final String component7() {
        return this.pluggedSocket;
    }

    public final String component8() {
        return this.socketCategory;
    }

    public final String component9() {
        return this.linkGroupName;
    }

    public final ModelInstanceDetails copy(int i10, int i11, ObjectInstanceId objectInstanceId, List<ObjectInstanceId> list, boolean z10, String str, String str2, String str3, String str4) {
        C17542s.j(objectInstanceId, "parentId");
        C17542s.j(list, "children");
        return new ModelInstanceDetails(i10, i11, objectInstanceId, list, z10, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelInstanceDetails)) {
            return false;
        }
        ModelInstanceDetails modelInstanceDetails = (ModelInstanceDetails) obj;
        return this.productId == modelInstanceDetails.productId && this.featureFlags == modelInstanceDetails.featureFlags && C17542s.e(this.parentId, modelInstanceDetails.parentId) && C17542s.e(this.children, modelInstanceDetails.children) && this.selected == modelInstanceDetails.selected && C17542s.e(this.activeSocketSet, modelInstanceDetails.activeSocketSet) && C17542s.e(this.pluggedSocket, modelInstanceDetails.pluggedSocket) && C17542s.e(this.socketCategory, modelInstanceDetails.socketCategory) && C17542s.e(this.linkGroupName, modelInstanceDetails.linkGroupName);
    }

    public final String getActiveSocketSet() {
        return this.activeSocketSet;
    }

    public final List<ObjectInstanceId> getChildren() {
        return this.children;
    }

    public final int getFeatureFlags() {
        return this.featureFlags;
    }

    public final String getLinkGroupName() {
        return this.linkGroupName;
    }

    public final ObjectInstanceId getParentId() {
        return this.parentId;
    }

    public final String getPluggedSocket() {
        return this.pluggedSocket;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getSocketCategory() {
        return this.socketCategory;
    }

    public final boolean hasFeatureFlag(FeatureFlagBit featureFlagBit) {
        C17542s.j(featureFlagBit, "flag");
        return (featureFlagBit.getFlagBit() & this.featureFlags) != 0;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.productId) * 31) + Integer.hashCode(this.featureFlags)) * 31) + this.parentId.hashCode()) * 31) + this.children.hashCode()) * 31) + Boolean.hashCode(this.selected)) * 31;
        String str = this.activeSocketSet;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pluggedSocket;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.socketCategory;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.linkGroupName;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        int i10 = this.productId;
        int i11 = this.featureFlags;
        ObjectInstanceId objectInstanceId = this.parentId;
        List<ObjectInstanceId> list = this.children;
        boolean z10 = this.selected;
        String str = this.activeSocketSet;
        String str2 = this.pluggedSocket;
        String str3 = this.socketCategory;
        String str4 = this.linkGroupName;
        return "ModelInstanceDetails(productId=" + i10 + ", featureFlags=" + i11 + ", parentId=" + objectInstanceId + ", children=" + list + ", selected=" + z10 + ", activeSocketSet=" + str + ", pluggedSocket=" + str2 + ", socketCategory=" + str3 + ", linkGroupName=" + str4 + ")";
    }

    public ModelInstanceDetails(int i10, int i11, ObjectInstanceId objectInstanceId, List<ObjectInstanceId> list, boolean z10, String str, String str2, String str3, String str4) {
        C17542s.j(objectInstanceId, "parentId");
        C17542s.j(list, "children");
        this.productId = i10;
        this.featureFlags = i11;
        this.parentId = objectInstanceId;
        this.children = list;
        this.selected = z10;
        this.activeSocketSet = str;
        this.pluggedSocket = str2;
        this.socketCategory = str3;
        this.linkGroupName = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ModelInstanceDetails(int r13, int r14, com.sugarcube.decorate_engine.ObjectInstanceId r15, java.util.List r16, boolean r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 8
            if (r1 == 0) goto L_0x000c
            java.util.List r1 = YH.C16877v.n()
            r6 = r1
            goto L_0x000e
        L_0x000c:
            r6 = r16
        L_0x000e:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0015
            r1 = 0
            r7 = r1
            goto L_0x0017
        L_0x0015:
            r7 = r17
        L_0x0017:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x001e
            r8 = r2
            goto L_0x0020
        L_0x001e:
            r8 = r18
        L_0x0020:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0026
            r9 = r2
            goto L_0x0028
        L_0x0026:
            r9 = r19
        L_0x0028:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x002e
            r10 = r2
            goto L_0x0030
        L_0x002e:
            r10 = r20
        L_0x0030:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0036
            r11 = r2
            goto L_0x0038
        L_0x0036:
            r11 = r21
        L_0x0038:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.ModelInstanceDetails.<init>(int, int, com.sugarcube.decorate_engine.ObjectInstanceId, java.util.List, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
