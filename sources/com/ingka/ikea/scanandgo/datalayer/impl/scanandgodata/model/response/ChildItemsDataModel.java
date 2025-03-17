package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 %2\u00020\u0001:\u0002&\u001dB;\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001e\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 ¨\u0006'"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemsDataModel;", "", "", "seen0", "", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoItemReferenceDataModel;", "salesOrders", "pickingList", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemsDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "getSalesOrders$annotations", "()V", "b", "getPickingList$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChildItemsDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f119986c;

    /* renamed from: a  reason: collision with root package name */
    private final List<ShopAndGoItemReferenceDataModel> f119987a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ShopAndGoItemReferenceDataModel> f119988b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemsDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemsDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ChildItemsDataModel> serializer() {
            return ChildItemsDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        ShopAndGoItemReferenceDataModel$$serializer shopAndGoItemReferenceDataModel$$serializer = ShopAndGoItemReferenceDataModel$$serializer.INSTANCE;
        f119986c = new KSerializer[]{new C17451f(shopAndGoItemReferenceDataModel$$serializer), new C17451f(shopAndGoItemReferenceDataModel$$serializer)};
    }

    public /* synthetic */ ChildItemsDataModel(int i10, List list, List list2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ChildItemsDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f119987a = list;
        this.f119988b = list2;
    }

    public static final /* synthetic */ void d(ChildItemsDataModel childItemsDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f119986c;
        dVar.B(serialDescriptor, 0, kSerializerArr[0], childItemsDataModel.f119987a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], childItemsDataModel.f119988b);
    }

    public final List<ShopAndGoItemReferenceDataModel> b() {
        return this.f119988b;
    }

    public final List<ShopAndGoItemReferenceDataModel> c() {
        return this.f119987a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildItemsDataModel)) {
            return false;
        }
        ChildItemsDataModel childItemsDataModel = (ChildItemsDataModel) obj;
        return C17542s.e(this.f119987a, childItemsDataModel.f119987a) && C17542s.e(this.f119988b, childItemsDataModel.f119988b);
    }

    public int hashCode() {
        List<ShopAndGoItemReferenceDataModel> list = this.f119987a;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ShopAndGoItemReferenceDataModel> list2 = this.f119988b;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        List<ShopAndGoItemReferenceDataModel> list = this.f119987a;
        List<ShopAndGoItemReferenceDataModel> list2 = this.f119988b;
        return "ChildItemsDataModel(salesOrders=" + list + ", pickingList=" + list2 + ")";
    }
}
