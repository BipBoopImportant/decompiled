package com.sugarcube.decorate_engine;

import XH.C16814e;
import YH.C16877v;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 62\u00020\u0001:\u000276BA\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBU\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJJ\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010-R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010*\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010-R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010*\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010-R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/sugarcube/decorate_engine/ParentDetails;", "", "", "", "pos", "rotQuat", "size", "Lcom/sugarcube/decorate_engine/RoomPolygonType;", "type", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/sugarcube/decorate_engine/RoomPolygonType;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/sugarcube/decorate_engine/RoomPolygonType;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/ParentDetails;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "()Lcom/sugarcube/decorate_engine/RoomPolygonType;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/sugarcube/decorate_engine/RoomPolygonType;)Lcom/sugarcube/decorate_engine/ParentDetails;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPos", "setPos", "(Ljava/util/List;)V", "getRotQuat", "setRotQuat", "getSize", "setSize", "Lcom/sugarcube/decorate_engine/RoomPolygonType;", "getType", "setType", "(Lcom/sugarcube/decorate_engine/RoomPolygonType;)V", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ParentDetails {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private List<Double> pos;
    private List<Double> rotQuat;
    private List<Double> size;
    private RoomPolygonType type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/ParentDetails$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/ParentDetails;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ParentDetails> serializer() {
            return ParentDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C17438C c10 = C17438C.f144010a;
        $childSerializers = new KSerializer[]{new C17451f(c10), new C17451f(c10), new C17451f(c10), null};
    }

    public ParentDetails() {
        this((List) null, (List) null, (List) null, (RoomPolygonType) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ParentDetails copy$default(ParentDetails parentDetails, List<Double> list, List<Double> list2, List<Double> list3, RoomPolygonType roomPolygonType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = parentDetails.pos;
        }
        if ((i10 & 2) != 0) {
            list2 = parentDetails.rotQuat;
        }
        if ((i10 & 4) != 0) {
            list3 = parentDetails.size;
        }
        if ((i10 & 8) != 0) {
            roomPolygonType = parentDetails.type;
        }
        return parentDetails.copy(list, list2, list3, roomPolygonType);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(ParentDetails parentDetails, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        boolean z10 = dVar.z(serialDescriptor, 0);
        Double valueOf = Double.valueOf(0.0d);
        if (z10 || !C17542s.e(parentDetails.pos, C16877v.q(valueOf, valueOf, valueOf))) {
            dVar.i(serialDescriptor, 0, kSerializerArr[0], parentDetails.pos);
        }
        if (dVar.z(serialDescriptor, 1) || !C17542s.e(parentDetails.rotQuat, Transform3D.Companion.getIdentityQuat())) {
            dVar.i(serialDescriptor, 1, kSerializerArr[1], parentDetails.rotQuat);
        }
        if (dVar.z(serialDescriptor, 2) || !C17542s.e(parentDetails.size, C16877v.q(valueOf, valueOf, valueOf))) {
            dVar.i(serialDescriptor, 2, kSerializerArr[2], parentDetails.size);
        }
        if (dVar.z(serialDescriptor, 3) || parentDetails.type != RoomPolygonType.None) {
            dVar.i(serialDescriptor, 3, RoomPolygonTypeSerializer.INSTANCE, parentDetails.type);
        }
    }

    public final List<Double> component1() {
        return this.pos;
    }

    public final List<Double> component2() {
        return this.rotQuat;
    }

    public final List<Double> component3() {
        return this.size;
    }

    public final RoomPolygonType component4() {
        return this.type;
    }

    public final ParentDetails copy(List<Double> list, List<Double> list2, List<Double> list3, RoomPolygonType roomPolygonType) {
        C17542s.j(list, "pos");
        C17542s.j(list2, "rotQuat");
        C17542s.j(list3, "size");
        C17542s.j(roomPolygonType, "type");
        return new ParentDetails(list, list2, list3, roomPolygonType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentDetails)) {
            return false;
        }
        ParentDetails parentDetails = (ParentDetails) obj;
        return C17542s.e(this.pos, parentDetails.pos) && C17542s.e(this.rotQuat, parentDetails.rotQuat) && C17542s.e(this.size, parentDetails.size) && this.type == parentDetails.type;
    }

    public final List<Double> getPos() {
        return this.pos;
    }

    public final List<Double> getRotQuat() {
        return this.rotQuat;
    }

    public final List<Double> getSize() {
        return this.size;
    }

    public final RoomPolygonType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.pos.hashCode() * 31) + this.rotQuat.hashCode()) * 31) + this.size.hashCode()) * 31) + this.type.hashCode();
    }

    public final void setPos(List<Double> list) {
        C17542s.j(list, "<set-?>");
        this.pos = list;
    }

    public final void setRotQuat(List<Double> list) {
        C17542s.j(list, "<set-?>");
        this.rotQuat = list;
    }

    public final void setSize(List<Double> list) {
        C17542s.j(list, "<set-?>");
        this.size = list;
    }

    public final void setType(RoomPolygonType roomPolygonType) {
        C17542s.j(roomPolygonType, "<set-?>");
        this.type = roomPolygonType;
    }

    public String toString() {
        List<Double> list = this.pos;
        List<Double> list2 = this.rotQuat;
        List<Double> list3 = this.size;
        RoomPolygonType roomPolygonType = this.type;
        return "ParentDetails(pos=" + list + ", rotQuat=" + list2 + ", size=" + list3 + ", type=" + roomPolygonType + ")";
    }

    @C16814e
    public /* synthetic */ ParentDetails(int i10, List<Double> list, List list2, List list3, RoomPolygonType roomPolygonType, T0 t02) {
        this.pos = (i10 & 1) == 0 ? C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)) : list;
        if ((i10 & 2) == 0) {
            this.rotQuat = Transform3D.Companion.getIdentityQuat();
        } else {
            this.rotQuat = list2;
        }
        if ((i10 & 4) == 0) {
            this.size = C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d));
        } else {
            this.size = list3;
        }
        if ((i10 & 8) == 0) {
            this.type = RoomPolygonType.None;
        } else {
            this.type = roomPolygonType;
        }
    }

    public ParentDetails(List<Double> list, List<Double> list2, List<Double> list3, RoomPolygonType roomPolygonType) {
        C17542s.j(list, "pos");
        C17542s.j(list2, "rotQuat");
        C17542s.j(list3, "size");
        C17542s.j(roomPolygonType, "type");
        this.pos = list;
        this.rotQuat = list2;
        this.size = list3;
        this.type = roomPolygonType;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ParentDetails(java.util.List r3, java.util.List<java.lang.Double> r4, java.util.List r5, com.sugarcube.decorate_engine.RoomPolygonType r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r2 = this;
            r8 = r7 & 1
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            if (r8 == 0) goto L_0x0012
            java.lang.Double[] r3 = new java.lang.Double[]{r0, r0, r0}
            java.util.List r3 = YH.C16877v.q(r3)
        L_0x0012:
            r8 = r7 & 2
            if (r8 == 0) goto L_0x001c
            com.sugarcube.decorate_engine.Transform3D$Companion r4 = com.sugarcube.decorate_engine.Transform3D.Companion
            java.util.List r4 = r4.getIdentityQuat()
        L_0x001c:
            r8 = r7 & 4
            if (r8 == 0) goto L_0x0028
            java.lang.Double[] r5 = new java.lang.Double[]{r0, r0, r0}
            java.util.List r5 = YH.C16877v.q(r5)
        L_0x0028:
            r7 = r7 & 8
            if (r7 == 0) goto L_0x002e
            com.sugarcube.decorate_engine.RoomPolygonType r6 = com.sugarcube.decorate_engine.RoomPolygonType.None
        L_0x002e:
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.ParentDetails.<init>(java.util.List, java.util.List, java.util.List, com.sugarcube.decorate_engine.RoomPolygonType, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
