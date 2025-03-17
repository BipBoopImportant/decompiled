package com.sugarcube.decorate_engine;

import XH.C16814e;
import YH.C16877v;
import YH.X;
import com.optimizely.ab.config.FeatureVariable;
import fK.p;
import fK.z;
import iK.C17395d;
import jK.C17446c0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 @2\u00020\u0001:\u0002A@BC\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bBS\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002j\u0004\u0018\u0001`\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002j\u0004\u0018\u0001`\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJL\u0010 \u001a\u00020\u00002\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u00052\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002j\u0004\u0018\u0001`\bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R6\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010,R6\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002j\u0004\u0018\u0001`\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010)\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010,R$\u00102\u001a\u0012\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`08@X\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001eR(\u00105\u001a\u0016\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002j\u0004\u0018\u0001`38@X\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001eR\u001c\u00109\u001a\n\u0012\u0004\u0012\u00020/\u0018\u0001068@X\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\"\u0010?\u001a\u0010\u0012\u0004\u0012\u00020;\u0018\u00010:j\u0004\u0018\u0001`<8@X\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/sugarcube/decorate_engine/InstancesDetailsInternal;", "", "", "", "Lcom/sugarcube/decorate_engine/ModelInstanceDetails;", "Lcom/sugarcube/decorate_engine/ModelInstanceDetailsMapInternal;", "modelInstancesDetails", "Lcom/sugarcube/decorate_engine/RoomSurfaceDetails;", "Lcom/sugarcube/decorate_engine/RoomSurfaceDetailsMapInternal;", "roomSurfaceDetails", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/InstancesDetailsInternal;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toJson$decorate_engine_release", "()Ljava/lang/String;", "toJson", "component1", "()Ljava/util/Map;", "component2", "copy", "(Ljava/util/Map;Ljava/util/Map;)Lcom/sugarcube/decorate_engine/InstancesDetailsInternal;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getModelInstancesDetails", "setModelInstancesDetails", "(Ljava/util/Map;)V", "getRoomSurfaceDetails", "setRoomSurfaceDetails", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lcom/sugarcube/decorate_engine/ModelInstanceDetailsMap;", "getModelInstanceDetailsMap$decorate_engine_release", "modelInstanceDetailsMap", "Lcom/sugarcube/decorate_engine/RoomSurfaceDetailsMap;", "getRoomSurfaceDetailsMap$decorate_engine_release", "roomSurfaceDetailsMap", "", "getRoomSurfaceIdList$decorate_engine_release", "()Ljava/util/List;", "roomSurfaceIdList", "", "Lcom/sugarcube/decorate_engine/RoomPolygonType;", "Lcom/sugarcube/decorate_engine/RoomPolygonTypeSet;", "getRoomSurfaceTypeSet$decorate_engine_release", "()Ljava/util/Set;", "roomSurfaceTypeSet", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InstancesDetailsInternal {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private Map<String, ModelInstanceDetails> modelInstancesDetails;
    private Map<String, RoomSurfaceDetails> roomSurfaceDetails;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0001¨\u0006\n"}, d2 = {"Lcom/sugarcube/decorate_engine/InstancesDetailsInternal$Companion;", "", "()V", "fromJson", "Lcom/sugarcube/decorate_engine/InstancesDetailsInternal;", "json", "", "fromJson$decorate_engine_release", "serializer", "Lkotlinx/serialization/KSerializer;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InstancesDetailsInternal fromJson$decorate_engine_release(String str) {
            C17542s.j(str, FeatureVariable.JSON_TYPE);
            System.out.println(str);
            C17514c.a aVar = C17514c.f144280d;
            KSerializer<Object> d10 = z.d(aVar.a(), P.l(InstancesDetailsInternal.class));
            C17542s.h(d10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return (InstancesDetailsInternal) aVar.c(d10, str);
        }

        public final KSerializer<InstancesDetailsInternal> serializer() {
            return InstancesDetailsInternal$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Y0 y02 = Y0.f144077a;
        $childSerializers = new KSerializer[]{new C17446c0(y02, ModelInstanceDetails$$serializer.INSTANCE), new C17446c0(y02, RoomSurfaceDetails$$serializer.INSTANCE)};
    }

    public InstancesDetailsInternal() {
        this((Map) null, (Map) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InstancesDetailsInternal copy$default(InstancesDetailsInternal instancesDetailsInternal, Map<String, ModelInstanceDetails> map, Map<String, RoomSurfaceDetails> map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = instancesDetailsInternal.modelInstancesDetails;
        }
        if ((i10 & 2) != 0) {
            map2 = instancesDetailsInternal.roomSurfaceDetails;
        }
        return instancesDetailsInternal.copy(map, map2);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(InstancesDetailsInternal instancesDetailsInternal, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (dVar.z(serialDescriptor, 0) || instancesDetailsInternal.modelInstancesDetails != null) {
            dVar.B(serialDescriptor, 0, kSerializerArr[0], instancesDetailsInternal.modelInstancesDetails);
        }
        if (dVar.z(serialDescriptor, 1) || instancesDetailsInternal.roomSurfaceDetails != null) {
            dVar.B(serialDescriptor, 1, kSerializerArr[1], instancesDetailsInternal.roomSurfaceDetails);
        }
    }

    public final Map<String, ModelInstanceDetails> component1() {
        return this.modelInstancesDetails;
    }

    public final Map<String, RoomSurfaceDetails> component2() {
        return this.roomSurfaceDetails;
    }

    public final InstancesDetailsInternal copy(Map<String, ModelInstanceDetails> map, Map<String, RoomSurfaceDetails> map2) {
        return new InstancesDetailsInternal(map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstancesDetailsInternal)) {
            return false;
        }
        InstancesDetailsInternal instancesDetailsInternal = (InstancesDetailsInternal) obj;
        return C17542s.e(this.modelInstancesDetails, instancesDetailsInternal.modelInstancesDetails) && C17542s.e(this.roomSurfaceDetails, instancesDetailsInternal.roomSurfaceDetails);
    }

    public final Map<ObjectInstanceId, ModelInstanceDetails> getModelInstanceDetailsMap$decorate_engine_release() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ModelInstanceDetails> map = this.modelInstancesDetails;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                linkedHashMap.put(new ObjectInstanceId(Integer.parseInt((String) next.getKey())), next.getValue());
            }
        }
        return X.x(linkedHashMap);
    }

    public final Map<String, ModelInstanceDetails> getModelInstancesDetails() {
        return this.modelInstancesDetails;
    }

    public final Map<String, RoomSurfaceDetails> getRoomSurfaceDetails() {
        return this.roomSurfaceDetails;
    }

    public final Map<ObjectInstanceId, RoomSurfaceDetails> getRoomSurfaceDetailsMap$decorate_engine_release() {
        Map<String, RoomSurfaceDetails> map = this.roomSurfaceDetails;
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            linkedHashMap.put(new ObjectInstanceId(Integer.parseInt((String) next.getKey())), next.getValue());
        }
        return X.x(linkedHashMap);
    }

    public final List<ObjectInstanceId> getRoomSurfaceIdList$decorate_engine_release() {
        Map<String, RoomSurfaceDetails> map = this.roomSurfaceDetails;
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, RoomSurfaceDetails> key : map.entrySet()) {
            arrayList.add(new ObjectInstanceId(Integer.parseInt((String) key.getKey())));
        }
        return C16877v.t1(arrayList);
    }

    public final Set<RoomPolygonType> getRoomSurfaceTypeSet$decorate_engine_release() {
        Map<String, RoomSurfaceDetails> map = this.roomSurfaceDetails;
        if (map == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<String, RoomSurfaceDetails> key : map.entrySet()) {
            RoomPolygonType polygonType = new ObjectInstanceId(Integer.parseInt((String) key.getKey())).getPolygonType();
            if (polygonType != RoomPolygonType.None) {
                linkedHashSet.add(polygonType);
            }
        }
        return C16877v.y1(linkedHashSet);
    }

    public int hashCode() {
        Map<String, ModelInstanceDetails> map = this.modelInstancesDetails;
        int i10 = 0;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, RoomSurfaceDetails> map2 = this.roomSurfaceDetails;
        if (map2 != null) {
            i10 = map2.hashCode();
        }
        return hashCode + i10;
    }

    public final void setModelInstancesDetails(Map<String, ModelInstanceDetails> map) {
        this.modelInstancesDetails = map;
    }

    public final void setRoomSurfaceDetails(Map<String, RoomSurfaceDetails> map) {
        this.roomSurfaceDetails = map;
    }

    public final String toJson$decorate_engine_release() {
        C17514c json = ConfiguredEncoder.Companion.getJson();
        KSerializer<Object> d10 = z.d(json.a(), P.l(InstancesDetailsInternal.class));
        C17542s.h(d10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return json.b(d10, this);
    }

    public String toString() {
        Map<String, ModelInstanceDetails> map = this.modelInstancesDetails;
        Map<String, RoomSurfaceDetails> map2 = this.roomSurfaceDetails;
        return "InstancesDetailsInternal(modelInstancesDetails=" + map + ", roomSurfaceDetails=" + map2 + ")";
    }

    @C16814e
    public /* synthetic */ InstancesDetailsInternal(int i10, Map map, Map map2, T0 t02) {
        if ((i10 & 1) == 0) {
            this.modelInstancesDetails = null;
        } else {
            this.modelInstancesDetails = map;
        }
        if ((i10 & 2) == 0) {
            this.roomSurfaceDetails = null;
        } else {
            this.roomSurfaceDetails = map2;
        }
    }

    public InstancesDetailsInternal(Map<String, ModelInstanceDetails> map, Map<String, RoomSurfaceDetails> map2) {
        this.modelInstancesDetails = map;
        this.roomSurfaceDetails = map2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstancesDetailsInternal(Map map, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : map2);
    }
}
