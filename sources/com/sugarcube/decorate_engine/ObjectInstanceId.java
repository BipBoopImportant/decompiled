package com.sugarcube.decorate_engine;

import HJ.C15835a;
import XH.C16814e;
import fK.p;
import jK.E0;
import jK.T0;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u0000 32\u00020\u0001:\u000243B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0011\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b&\u0010%R\u0011\u0010(\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010\u000bR\u0011\u0010)\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b)\u0010%R\u0011\u0010*\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b*\u0010%R\u0011\u0010+\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0011\u0010,\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b,\u0010%R\u0011\u00100\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b1\u0010\u000b¨\u00065"}, d2 = {"Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "", "", "id", "<init>", "(I)V", "seen1", "LjK/T0;", "serializationConstructorMarker", "(IILjK/T0;)V", "component1", "()I", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "copy", "(I)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "I", "Lcom/sugarcube/decorate_engine/RoomPolygonType;", "getPolygonType", "()Lcom/sugarcube/decorate_engine/RoomPolygonType;", "polygonType", "isNone", "()Z", "isAll", "getIntValue", "intValue", "isModel", "isFloor", "isWall", "isStackingSurface", "Lcom/sugarcube/decorate_engine/ObjectInstanceIdType;", "getIdType", "()Lcom/sugarcube/decorate_engine/ObjectInstanceIdType;", "idType", "getIdIndex", "idIndex", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ObjectInstanceId {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final ObjectInstanceId kAll = new ObjectInstanceId(-1);
    /* access modifiers changed from: private */
    public static final ObjectInstanceId kFloor = new ObjectInstanceId(ObjectInstanceIdType.Floor.getRawType());
    private static final int kIndexMask = 268435455;
    private static final int kInstanceIdAll = -1;
    private static final int kInstanceIdNone = 0;
    /* access modifiers changed from: private */
    public static final ObjectInstanceId kNone = new ObjectInstanceId(0);
    private static final int kTypeMask = -268435456;

    /* renamed from: id  reason: collision with root package name */
    private final int f142954id;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013HÆ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u000e\u0010\u000f\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate_engine/ObjectInstanceId$Companion;", "", "()V", "kAll", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "getKAll", "()Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "kFloor", "getKFloor", "kIndexMask", "", "kInstanceIdAll", "kInstanceIdNone", "kNone", "getKNone", "kTypeMask", "nextModelInstanceId", "lastId", "serializer", "Lkotlinx/serialization/KSerializer;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ObjectInstanceId getKAll() {
            return ObjectInstanceId.kAll;
        }

        public final ObjectInstanceId getKFloor() {
            return ObjectInstanceId.kFloor;
        }

        public final ObjectInstanceId getKNone() {
            return ObjectInstanceId.kNone;
        }

        public final ObjectInstanceId nextModelInstanceId(ObjectInstanceId objectInstanceId) {
            C17542s.j(objectInstanceId, "lastId");
            objectInstanceId.isModel();
            return new ObjectInstanceId(Math.max(1, (objectInstanceId.getIdIndex() + 1) & ObjectInstanceId.kIndexMask) | ObjectInstanceIdType.Model.getRawType());
        }

        public final KSerializer<ObjectInstanceId> serializer() {
            return ObjectInstanceId$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ObjectInstanceId(int i10) {
        this.f142954id = i10;
    }

    private final int component1() {
        return this.f142954id;
    }

    public static /* synthetic */ ObjectInstanceId copy$default(ObjectInstanceId objectInstanceId, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = objectInstanceId.f142954id;
        }
        return objectInstanceId.copy(i10);
    }

    public final ObjectInstanceId copy(int i10) {
        return new ObjectInstanceId(i10);
    }

    public boolean equals(Object obj) {
        return obj != null && C17542s.e(obj.getClass(), ObjectInstanceId.class) && ((ObjectInstanceId) obj).f142954id == this.f142954id;
    }

    public final int getIdIndex() {
        return this.f142954id & kIndexMask;
    }

    public final ObjectInstanceIdType getIdType() {
        int i10 = this.f142954id & kTypeMask;
        for (ObjectInstanceIdType objectInstanceIdType : ObjectInstanceIdType.values()) {
            if (objectInstanceIdType.getRawType() == i10) {
                return objectInstanceIdType;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final int getIntValue() {
        return this.f142954id;
    }

    public final RoomPolygonType getPolygonType() {
        int rawType = getIdType().getRawType();
        return rawType == ObjectInstanceIdType.Ceiling.getRawType() ? RoomPolygonType.Ceiling : rawType == ObjectInstanceIdType.Door.getRawType() ? RoomPolygonType.Door : rawType == ObjectInstanceIdType.Floor.getRawType() ? RoomPolygonType.Floor : rawType == ObjectInstanceIdType.Opening.getRawType() ? RoomPolygonType.Opening : rawType == ObjectInstanceIdType.StackingSurface.getRawType() ? RoomPolygonType.StackingSurface : rawType == ObjectInstanceIdType.Wall.getRawType() ? RoomPolygonType.Wall : rawType == ObjectInstanceIdType.Window.getRawType() ? RoomPolygonType.Window : RoomPolygonType.None;
    }

    public int hashCode() {
        return this.f142954id;
    }

    public final boolean isAll() {
        return this.f142954id == -1;
    }

    public final boolean isFloor() {
        return getIdType() == ObjectInstanceIdType.Floor;
    }

    public final boolean isModel() {
        return !isNone() && getIdType() == ObjectInstanceIdType.Model;
    }

    public final boolean isNone() {
        return this.f142954id == 0;
    }

    public final boolean isStackingSurface() {
        return getIdType() == ObjectInstanceIdType.StackingSurface;
    }

    public final boolean isWall() {
        return getIdType() == ObjectInstanceIdType.Wall;
    }

    public String toString() {
        if (isNone()) {
            return "ObjectInstanceId:None";
        }
        if (isAll()) {
            return "ObjectInstanceId:All";
        }
        String num = Integer.toString(this.f142954id, C15835a.a(16));
        C17542s.i(num, "toString(this, checkRadix(radix))");
        return "ObjectInstanceId:0x" + num;
    }

    @C16814e
    public /* synthetic */ ObjectInstanceId(int i10, int i11, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, ObjectInstanceId$$serializer.INSTANCE.getDescriptor());
        }
        this.f142954id = i11;
    }
}
