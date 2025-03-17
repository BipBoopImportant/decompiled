package com.sugarcube.decorate_engine;

import XH.C16814e;
import YH.C16877v;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 (2\u00020\u0001:\u0002)(B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006*"}, d2 = {"Lcom/sugarcube/decorate_engine/RoomSurfaceDetails;", "", "", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "children", "", "paint", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/RoomSurfaceDetails;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/sugarcube/decorate_engine/RoomSurfaceDetails;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getChildren", "Ljava/lang/String;", "getPaint", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomSurfaceDetails {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {new C17451f(ObjectInstanceIdSerializer.INSTANCE), null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final List<ObjectInstanceId> children;
    private final String paint;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/RoomSurfaceDetails$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/RoomSurfaceDetails;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RoomSurfaceDetails> serializer() {
            return RoomSurfaceDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RoomSurfaceDetails() {
        this((List) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RoomSurfaceDetails copy$default(RoomSurfaceDetails roomSurfaceDetails, List<ObjectInstanceId> list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = roomSurfaceDetails.children;
        }
        if ((i10 & 2) != 0) {
            str = roomSurfaceDetails.paint;
        }
        return roomSurfaceDetails.copy(list, str);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(RoomSurfaceDetails roomSurfaceDetails, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (dVar.z(serialDescriptor, 0) || !C17542s.e(roomSurfaceDetails.children, C16877v.n())) {
            dVar.i(serialDescriptor, 0, kSerializerArr[0], roomSurfaceDetails.children);
        }
        if (dVar.z(serialDescriptor, 1) || roomSurfaceDetails.paint != null) {
            dVar.B(serialDescriptor, 1, Y0.f144077a, roomSurfaceDetails.paint);
        }
    }

    public final List<ObjectInstanceId> component1() {
        return this.children;
    }

    public final String component2() {
        return this.paint;
    }

    public final RoomSurfaceDetails copy(List<ObjectInstanceId> list, String str) {
        C17542s.j(list, "children");
        return new RoomSurfaceDetails(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomSurfaceDetails)) {
            return false;
        }
        RoomSurfaceDetails roomSurfaceDetails = (RoomSurfaceDetails) obj;
        return C17542s.e(this.children, roomSurfaceDetails.children) && C17542s.e(this.paint, roomSurfaceDetails.paint);
    }

    public final List<ObjectInstanceId> getChildren() {
        return this.children;
    }

    public final String getPaint() {
        return this.paint;
    }

    public int hashCode() {
        int hashCode = this.children.hashCode() * 31;
        String str = this.paint;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<ObjectInstanceId> list = this.children;
        String str = this.paint;
        return "RoomSurfaceDetails(children=" + list + ", paint=" + str + ")";
    }

    @C16814e
    public /* synthetic */ RoomSurfaceDetails(int i10, List<ObjectInstanceId> list, String str, T0 t02) {
        this.children = (i10 & 1) == 0 ? C16877v.n() : list;
        if ((i10 & 2) == 0) {
            this.paint = null;
        } else {
            this.paint = str;
        }
    }

    public RoomSurfaceDetails(List<ObjectInstanceId> list, String str) {
        C17542s.j(list, "children");
        this.children = list;
        this.paint = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomSurfaceDetails(List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16877v.n() : list, (i10 & 2) != 0 ? null : str);
    }
}
