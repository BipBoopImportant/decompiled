package com.sugarcube.decorate_engine;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.X;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u0000 B2\u00020\u0001:\u0002CBB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rBy\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\"Jt\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001eJ\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u00103R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010 \"\u0004\b6\u00107R.\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010;R.\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u00108\u001a\u0004\b<\u0010\"\"\u0004\b=\u0010;R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u00108\u001a\u0004\b>\u0010\"\"\u0004\b?\u0010;R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u00108\u001a\u0004\b@\u0010\"\"\u0004\bA\u0010;¨\u0006D"}, d2 = {"Lcom/sugarcube/decorate_engine/RoomPolygon;", "", "", "id", "Lcom/sugarcube/decorate_engine/RoomPolygonType;", "category", "", "", "transform", "vertices", "indices", "children", "<init>", "(ILcom/sugarcube/decorate_engine/RoomPolygonType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen1", "LjK/T0;", "serializationConstructorMarker", "(IILcom/sugarcube/decorate_engine/RoomPolygonType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/RoomPolygon;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "validate", "()V", "component1", "()I", "component2", "()Lcom/sugarcube/decorate_engine/RoomPolygonType;", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "copy", "(ILcom/sugarcube/decorate_engine/RoomPolygonType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sugarcube/decorate_engine/RoomPolygon;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "setId", "(I)V", "Lcom/sugarcube/decorate_engine/RoomPolygonType;", "getCategory", "setCategory", "(Lcom/sugarcube/decorate_engine/RoomPolygonType;)V", "Ljava/util/List;", "getTransform", "setTransform", "(Ljava/util/List;)V", "getVertices", "setVertices", "getIndices", "setIndices", "getChildren", "setChildren", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomPolygon {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private RoomPolygonType category;
    private List<Integer> children;

    /* renamed from: id  reason: collision with root package name */
    private int f142955id;
    private List<Integer> indices;
    private List<? extends List<Double>> transform;
    private List<? extends List<Double>> vertices;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/RoomPolygon$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/RoomPolygon;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RoomPolygon> serializer() {
            return RoomPolygon$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C17438C c10 = C17438C.f144010a;
        C17451f fVar = new C17451f(new C17451f(c10));
        C17451f fVar2 = new C17451f(new C17451f(c10));
        X x10 = X.f144073a;
        $childSerializers = new KSerializer[]{null, null, fVar, fVar2, new C17451f(x10), new C17451f(x10)};
    }

    @C16814e
    public /* synthetic */ RoomPolygon(int i10, int i11, RoomPolygonType roomPolygonType, List list, List list2, List list3, List list4, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, RoomPolygon$$serializer.INSTANCE.getDescriptor());
        }
        this.f142955id = i11;
        this.category = roomPolygonType;
        this.transform = list;
        this.vertices = list2;
        this.indices = list3;
        this.children = list4;
    }

    public static /* synthetic */ RoomPolygon copy$default(RoomPolygon roomPolygon, int i10, RoomPolygonType roomPolygonType, List<? extends List<Double>> list, List<? extends List<Double>> list2, List<Integer> list3, List<Integer> list4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = roomPolygon.f142955id;
        }
        if ((i11 & 2) != 0) {
            roomPolygonType = roomPolygon.category;
        }
        RoomPolygonType roomPolygonType2 = roomPolygonType;
        if ((i11 & 4) != 0) {
            list = roomPolygon.transform;
        }
        List<? extends List<Double>> list5 = list;
        if ((i11 & 8) != 0) {
            list2 = roomPolygon.vertices;
        }
        List<? extends List<Double>> list6 = list2;
        if ((i11 & 16) != 0) {
            list3 = roomPolygon.indices;
        }
        List<Integer> list7 = list3;
        if ((i11 & 32) != 0) {
            list4 = roomPolygon.children;
        }
        return roomPolygon.copy(i10, roomPolygonType2, list5, list6, list7, list4);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(RoomPolygon roomPolygon, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        dVar.w(serialDescriptor, 0, roomPolygon.f142955id);
        dVar.i(serialDescriptor, 1, RoomPolygonTypeSerializer.INSTANCE, roomPolygon.category);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], roomPolygon.transform);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], roomPolygon.vertices);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], roomPolygon.indices);
        dVar.B(serialDescriptor, 5, kSerializerArr[5], roomPolygon.children);
    }

    public final int component1() {
        return this.f142955id;
    }

    public final RoomPolygonType component2() {
        return this.category;
    }

    public final List<List<Double>> component3() {
        return this.transform;
    }

    public final List<List<Double>> component4() {
        return this.vertices;
    }

    public final List<Integer> component5() {
        return this.indices;
    }

    public final List<Integer> component6() {
        return this.children;
    }

    public final RoomPolygon copy(int i10, RoomPolygonType roomPolygonType, List<? extends List<Double>> list, List<? extends List<Double>> list2, List<Integer> list3, List<Integer> list4) {
        C17542s.j(roomPolygonType, "category");
        C17542s.j(list, "transform");
        C17542s.j(list2, "vertices");
        return new RoomPolygon(i10, roomPolygonType, list, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomPolygon)) {
            return false;
        }
        RoomPolygon roomPolygon = (RoomPolygon) obj;
        return this.f142955id == roomPolygon.f142955id && this.category == roomPolygon.category && C17542s.e(this.transform, roomPolygon.transform) && C17542s.e(this.vertices, roomPolygon.vertices) && C17542s.e(this.indices, roomPolygon.indices) && C17542s.e(this.children, roomPolygon.children);
    }

    public final RoomPolygonType getCategory() {
        return this.category;
    }

    public final List<Integer> getChildren() {
        return this.children;
    }

    public final int getId() {
        return this.f142955id;
    }

    public final List<Integer> getIndices() {
        return this.indices;
    }

    public final List<List<Double>> getTransform() {
        return this.transform;
    }

    public final List<List<Double>> getVertices() {
        return this.vertices;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f142955id) * 31) + this.category.hashCode()) * 31) + this.transform.hashCode()) * 31) + this.vertices.hashCode()) * 31;
        List<Integer> list = this.indices;
        int i10 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.children;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode2 + i10;
    }

    public final void setCategory(RoomPolygonType roomPolygonType) {
        C17542s.j(roomPolygonType, "<set-?>");
        this.category = roomPolygonType;
    }

    public final void setChildren(List<Integer> list) {
        this.children = list;
    }

    public final void setId(int i10) {
        this.f142955id = i10;
    }

    public final void setIndices(List<Integer> list) {
        this.indices = list;
    }

    public final void setTransform(List<? extends List<Double>> list) {
        C17542s.j(list, "<set-?>");
        this.transform = list;
    }

    public final void setVertices(List<? extends List<Double>> list) {
        C17542s.j(list, "<set-?>");
        this.vertices = list;
    }

    public String toString() {
        int i10 = this.f142955id;
        RoomPolygonType roomPolygonType = this.category;
        List<? extends List<Double>> list = this.transform;
        List<? extends List<Double>> list2 = this.vertices;
        List<Integer> list3 = this.indices;
        List<Integer> list4 = this.children;
        return "RoomPolygon(id=" + i10 + ", category=" + roomPolygonType + ", transform=" + list + ", vertices=" + list2 + ", indices=" + list3 + ", children=" + list4 + ")";
    }

    public final void validate() {
    }

    public RoomPolygon(int i10, RoomPolygonType roomPolygonType, List<? extends List<Double>> list, List<? extends List<Double>> list2, List<Integer> list3, List<Integer> list4) {
        C17542s.j(roomPolygonType, "category");
        C17542s.j(list, "transform");
        C17542s.j(list2, "vertices");
        this.f142955id = i10;
        this.category = roomPolygonType;
        this.transform = list;
        this.vertices = list2;
        this.indices = list3;
        this.children = list4;
    }
}
