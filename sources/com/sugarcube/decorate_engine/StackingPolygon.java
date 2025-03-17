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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 <2\u00020\u0001:\u0002=<BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bBk\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010 Jf\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u00101R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010.\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u00101R.\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010 \"\u0004\b6\u00107R.\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u00104\u001a\u0004\b8\u0010 \"\u0004\b9\u00107R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u00104\u001a\u0004\b:\u0010 \"\u0004\b;\u00107¨\u0006>"}, d2 = {"Lcom/sugarcube/decorate_engine/StackingPolygon;", "", "", "id", "erasableId", "", "", "transform", "vertices", "indices", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/StackingPolygon;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "validate$decorate_engine_release", "()V", "validate", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sugarcube/decorate_engine/StackingPolygon;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "getErasableId", "setErasableId", "Ljava/util/List;", "getTransform", "setTransform", "(Ljava/util/List;)V", "getVertices", "setVertices", "getIndices", "setIndices", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StackingPolygon {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private Integer erasableId;

    /* renamed from: id  reason: collision with root package name */
    private Integer f142956id;
    private List<Integer> indices;
    private List<? extends List<Double>> transform;
    private List<? extends List<Double>> vertices;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/StackingPolygon$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/StackingPolygon;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StackingPolygon> serializer() {
            return StackingPolygon$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C17438C c10 = C17438C.f144010a;
        $childSerializers = new KSerializer[]{null, null, new C17451f(new C17451f(c10)), new C17451f(new C17451f(c10)), new C17451f(X.f144073a)};
    }

    @C16814e
    public /* synthetic */ StackingPolygon(int i10, Integer num, Integer num2, List list, List list2, List list3, T0 t02) {
        if (12 != (i10 & 12)) {
            E0.b(i10, 12, StackingPolygon$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f142956id = null;
        } else {
            this.f142956id = num;
        }
        if ((i10 & 2) == 0) {
            this.erasableId = null;
        } else {
            this.erasableId = num2;
        }
        this.transform = list;
        this.vertices = list2;
        if ((i10 & 16) == 0) {
            this.indices = null;
        } else {
            this.indices = list3;
        }
    }

    public static /* synthetic */ StackingPolygon copy$default(StackingPolygon stackingPolygon, Integer num, Integer num2, List<? extends List<Double>> list, List<? extends List<Double>> list2, List<Integer> list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = stackingPolygon.f142956id;
        }
        if ((i10 & 2) != 0) {
            num2 = stackingPolygon.erasableId;
        }
        Integer num3 = num2;
        if ((i10 & 4) != 0) {
            list = stackingPolygon.transform;
        }
        List<? extends List<Double>> list4 = list;
        if ((i10 & 8) != 0) {
            list2 = stackingPolygon.vertices;
        }
        List<? extends List<Double>> list5 = list2;
        if ((i10 & 16) != 0) {
            list3 = stackingPolygon.indices;
        }
        return stackingPolygon.copy(num, num3, list4, list5, list3);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(StackingPolygon stackingPolygon, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (dVar.z(serialDescriptor, 0) || stackingPolygon.f142956id != null) {
            dVar.B(serialDescriptor, 0, X.f144073a, stackingPolygon.f142956id);
        }
        if (dVar.z(serialDescriptor, 1) || stackingPolygon.erasableId != null) {
            dVar.B(serialDescriptor, 1, X.f144073a, stackingPolygon.erasableId);
        }
        dVar.i(serialDescriptor, 2, kSerializerArr[2], stackingPolygon.transform);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], stackingPolygon.vertices);
        if (dVar.z(serialDescriptor, 4) || stackingPolygon.indices != null) {
            dVar.B(serialDescriptor, 4, kSerializerArr[4], stackingPolygon.indices);
        }
    }

    public final Integer component1() {
        return this.f142956id;
    }

    public final Integer component2() {
        return this.erasableId;
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

    public final StackingPolygon copy(Integer num, Integer num2, List<? extends List<Double>> list, List<? extends List<Double>> list2, List<Integer> list3) {
        C17542s.j(list, "transform");
        C17542s.j(list2, "vertices");
        return new StackingPolygon(num, num2, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackingPolygon)) {
            return false;
        }
        StackingPolygon stackingPolygon = (StackingPolygon) obj;
        return C17542s.e(this.f142956id, stackingPolygon.f142956id) && C17542s.e(this.erasableId, stackingPolygon.erasableId) && C17542s.e(this.transform, stackingPolygon.transform) && C17542s.e(this.vertices, stackingPolygon.vertices) && C17542s.e(this.indices, stackingPolygon.indices);
    }

    public final Integer getErasableId() {
        return this.erasableId;
    }

    public final Integer getId() {
        return this.f142956id;
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
        Integer num = this.f142956id;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.erasableId;
        int hashCode2 = (((((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.transform.hashCode()) * 31) + this.vertices.hashCode()) * 31;
        List<Integer> list = this.indices;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public final void setErasableId(Integer num) {
        this.erasableId = num;
    }

    public final void setId(Integer num) {
        this.f142956id = num;
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
        Integer num = this.f142956id;
        Integer num2 = this.erasableId;
        List<? extends List<Double>> list = this.transform;
        List<? extends List<Double>> list2 = this.vertices;
        List<Integer> list3 = this.indices;
        return "StackingPolygon(id=" + num + ", erasableId=" + num2 + ", transform=" + list + ", vertices=" + list2 + ", indices=" + list3 + ")";
    }

    public final void validate$decorate_engine_release() {
    }

    public StackingPolygon(Integer num, Integer num2, List<? extends List<Double>> list, List<? extends List<Double>> list2, List<Integer> list3) {
        C17542s.j(list, "transform");
        C17542s.j(list2, "vertices");
        this.f142956id = num;
        this.erasableId = num2;
        this.transform = list;
        this.vertices = list2;
        this.indices = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StackingPolygon(Integer num, Integer num2, List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, list, list2, (i10 & 16) != 0 ? null : list3);
    }
}
