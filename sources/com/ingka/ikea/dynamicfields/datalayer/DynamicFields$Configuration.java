package com.ingka.ikea.dynamicfields.datalayer;

import android.os.Parcel;
import android.os.Parcelable;
import fK.p;
import iK.C17395d;
import jK.C17446c0;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 12\u00020\u0001:\u00022'B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u0010,\u001a\u0004\b-\u0010/¨\u00063"}, d2 = {"com/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration", "Landroid/os/Parcelable;", "", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "fields", "", "", "additionalValues", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/Map;LjK/T0;)V", "Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "getFields$annotations", "()V", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "getAdditionalValues$annotations", "Companion", "$serializer", "dynamicfields-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DynamicFields$Configuration implements Parcelable {
    public static final Parcelable.Creator<DynamicFields$Configuration> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f95663c;

    /* renamed from: a  reason: collision with root package name */
    private final List<FieldAttributes> f95664a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f95665b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "dynamicfields-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<DynamicFields$Configuration> serializer() {
            return DynamicFields$Configuration$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DynamicFields$Configuration> {
        /* renamed from: a */
        public final DynamicFields$Configuration createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(FieldAttributes.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new DynamicFields$Configuration(arrayList, linkedHashMap);
        }

        /* renamed from: b */
        public final DynamicFields$Configuration[] newArray(int i10) {
            return new DynamicFields$Configuration[i10];
        }
    }

    static {
        C17451f fVar = new C17451f(FieldAttributes$$serializer.INSTANCE);
        Y0 y02 = Y0.f144077a;
        f95663c = new KSerializer[]{fVar, new C17446c0(y02, y02)};
    }

    public /* synthetic */ DynamicFields$Configuration(int i10, List list, Map map, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, DynamicFields$Configuration$$serializer.INSTANCE.getDescriptor());
        }
        this.f95664a = list;
        this.f95665b = map;
    }

    public static final /* synthetic */ void d(DynamicFields$Configuration dynamicFields$Configuration, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95663c;
        dVar.i(serialDescriptor, 0, kSerializerArr[0], dynamicFields$Configuration.f95664a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], dynamicFields$Configuration.f95665b);
    }

    public final Map<String, String> b() {
        return this.f95665b;
    }

    public final List<FieldAttributes> c() {
        return this.f95664a;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicFields$Configuration)) {
            return false;
        }
        DynamicFields$Configuration dynamicFields$Configuration = (DynamicFields$Configuration) obj;
        return C17542s.e(this.f95664a, dynamicFields$Configuration.f95664a) && C17542s.e(this.f95665b, dynamicFields$Configuration.f95665b);
    }

    public int hashCode() {
        return (this.f95664a.hashCode() * 31) + this.f95665b.hashCode();
    }

    public String toString() {
        List<FieldAttributes> list = this.f95664a;
        Map<String, String> map = this.f95665b;
        return "Configuration(fields=" + list + ", additionalValues=" + map + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        List<FieldAttributes> list = this.f95664a;
        parcel.writeInt(list.size());
        for (FieldAttributes writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        Map<String, String> map = this.f95665b;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    public DynamicFields$Configuration(List<FieldAttributes> list, Map<String, String> map) {
        C17542s.j(list, "fields");
        C17542s.j(map, "additionalValues");
        this.f95664a = list;
        this.f95665b = map;
    }
}
