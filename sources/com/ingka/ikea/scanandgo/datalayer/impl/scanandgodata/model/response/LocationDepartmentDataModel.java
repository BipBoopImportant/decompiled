package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u001dB5\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0016R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010!\u001a\u0004\b\"\u0010$¨\u0006("}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/LocationDepartmentDataModel;", "", "", "seen0", "", "id", "", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/LocationDepartmentNamesDataModel;", "names", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/LocationDepartmentDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "b", "Ljava/util/List;", "()Ljava/util/List;", "getNames$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocationDepartmentDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f120024c = {null, new C17451f(LocationDepartmentNamesDataModel$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f120025a;

    /* renamed from: b  reason: collision with root package name */
    private final List<LocationDepartmentNamesDataModel> f120026b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/LocationDepartmentDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/LocationDepartmentDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<LocationDepartmentDataModel> serializer() {
            return LocationDepartmentDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LocationDepartmentDataModel(int i10, String str, List list, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, LocationDepartmentDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f120025a = str;
        this.f120026b = list;
    }

    public static final /* synthetic */ void c(LocationDepartmentDataModel locationDepartmentDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120024c;
        dVar.B(serialDescriptor, 0, Y0.f144077a, locationDepartmentDataModel.f120025a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], locationDepartmentDataModel.f120026b);
    }

    public final List<LocationDepartmentNamesDataModel> b() {
        return this.f120026b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationDepartmentDataModel)) {
            return false;
        }
        LocationDepartmentDataModel locationDepartmentDataModel = (LocationDepartmentDataModel) obj;
        return C17542s.e(this.f120025a, locationDepartmentDataModel.f120025a) && C17542s.e(this.f120026b, locationDepartmentDataModel.f120026b);
    }

    public int hashCode() {
        String str = this.f120025a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<LocationDepartmentNamesDataModel> list = this.f120026b;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.f120025a;
        List<LocationDepartmentNamesDataModel> list = this.f120026b;
        return "LocationDepartmentDataModel(id=" + str + ", names=" + list + ")";
    }
}
