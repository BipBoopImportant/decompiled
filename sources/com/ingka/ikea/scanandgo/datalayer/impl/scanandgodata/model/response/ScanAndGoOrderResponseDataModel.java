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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b)\b\b\u0018\u0000 H2\u00020\u0001:\u0002I)Bu\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010/\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b6\u0010.\u001a\u0004\b3\u00105R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b:\u0010.\u001a\u0004\b7\u00109R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010;\u0012\u0004\b>\u0010.\u001a\u0004\b<\u0010=R(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bB\u0010.\u001a\u0004\b?\u0010AR(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u0010@\u0012\u0004\bD\u0010.\u001a\u0004\bC\u0010AR \u0010\u0014\u001a\u00020\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010E\u0012\u0004\bG\u0010.\u001a\u0004\b\u0014\u0010F¨\u0006J"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoOrderResponseDataModel;", "", "", "seen0", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/FamilySavingsCardDataModel;", "familySavingsCard", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShoppingBagDataModel;", "shoppingBag", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PickingListDataModel;", "pickingList", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesOrderDataModel;", "salesOrder", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/OrderSummaryCardDataModel;", "summaryCard", "", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoSkippedBarcodeDataModel;", "skippedBarcodes", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoSkippedCouponsDataModel;", "skippedCoupons", "", "isCoWorkerDiscountApplied", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/FamilySavingsCardDataModel;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShoppingBagDataModel;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PickingListDataModel;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesOrderDataModel;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/OrderSummaryCardDataModel;Ljava/util/List;Ljava/util/List;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "i", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoOrderResponseDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/FamilySavingsCardDataModel;", "b", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/FamilySavingsCardDataModel;", "getFamilySavingsCard$annotations", "()V", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShoppingBagDataModel;", "e", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShoppingBagDataModel;", "getShoppingBag$annotations", "c", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PickingListDataModel;", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PickingListDataModel;", "getPickingList$annotations", "d", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesOrderDataModel;", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesOrderDataModel;", "getSalesOrder$annotations", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/OrderSummaryCardDataModel;", "h", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/OrderSummaryCardDataModel;", "getSummaryCard$annotations", "f", "Ljava/util/List;", "()Ljava/util/List;", "getSkippedBarcodes$annotations", "g", "getSkippedCoupons$annotations", "Z", "()Z", "isCoWorkerDiscountApplied$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoOrderResponseDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer<Object>[] f120078i = {null, null, null, null, null, new C17451f(ScanAndGoSkippedBarcodeDataModel$$serializer.INSTANCE), new C17451f(ScanAndGoSkippedCouponsDataModel$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final FamilySavingsCardDataModel f120079a;

    /* renamed from: b  reason: collision with root package name */
    private final ShoppingBagDataModel f120080b;

    /* renamed from: c  reason: collision with root package name */
    private final PickingListDataModel f120081c;

    /* renamed from: d  reason: collision with root package name */
    private final SalesOrderDataModel f120082d;

    /* renamed from: e  reason: collision with root package name */
    private final OrderSummaryCardDataModel f120083e;

    /* renamed from: f  reason: collision with root package name */
    private final List<ScanAndGoSkippedBarcodeDataModel> f120084f;

    /* renamed from: g  reason: collision with root package name */
    private final List<ScanAndGoSkippedCouponsDataModel> f120085g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f120086h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoOrderResponseDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoOrderResponseDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ScanAndGoOrderResponseDataModel> serializer() {
            return ScanAndGoOrderResponseDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ScanAndGoOrderResponseDataModel(int i10, FamilySavingsCardDataModel familySavingsCardDataModel, ShoppingBagDataModel shoppingBagDataModel, PickingListDataModel pickingListDataModel, SalesOrderDataModel salesOrderDataModel, OrderSummaryCardDataModel orderSummaryCardDataModel, List list, List list2, boolean z10, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, ScanAndGoOrderResponseDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f120079a = familySavingsCardDataModel;
        this.f120080b = shoppingBagDataModel;
        this.f120081c = pickingListDataModel;
        this.f120082d = salesOrderDataModel;
        this.f120083e = orderSummaryCardDataModel;
        this.f120084f = list;
        this.f120085g = list2;
        if ((i10 & 128) == 0) {
            this.f120086h = false;
        } else {
            this.f120086h = z10;
        }
    }

    public static final /* synthetic */ void i(ScanAndGoOrderResponseDataModel scanAndGoOrderResponseDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120078i;
        dVar.B(serialDescriptor, 0, FamilySavingsCardDataModel$$serializer.INSTANCE, scanAndGoOrderResponseDataModel.f120079a);
        dVar.B(serialDescriptor, 1, ShoppingBagDataModel$$serializer.INSTANCE, scanAndGoOrderResponseDataModel.f120080b);
        dVar.B(serialDescriptor, 2, PickingListDataModel$$serializer.INSTANCE, scanAndGoOrderResponseDataModel.f120081c);
        dVar.B(serialDescriptor, 3, SalesOrderDataModel$$serializer.INSTANCE, scanAndGoOrderResponseDataModel.f120082d);
        dVar.B(serialDescriptor, 4, OrderSummaryCardDataModel$$serializer.INSTANCE, scanAndGoOrderResponseDataModel.f120083e);
        dVar.B(serialDescriptor, 5, kSerializerArr[5], scanAndGoOrderResponseDataModel.f120084f);
        dVar.B(serialDescriptor, 6, kSerializerArr[6], scanAndGoOrderResponseDataModel.f120085g);
        if (dVar.z(serialDescriptor, 7) || scanAndGoOrderResponseDataModel.f120086h) {
            dVar.x(serialDescriptor, 7, scanAndGoOrderResponseDataModel.f120086h);
        }
    }

    public final FamilySavingsCardDataModel b() {
        return this.f120079a;
    }

    public final PickingListDataModel c() {
        return this.f120081c;
    }

    public final SalesOrderDataModel d() {
        return this.f120082d;
    }

    public final ShoppingBagDataModel e() {
        return this.f120080b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanAndGoOrderResponseDataModel)) {
            return false;
        }
        ScanAndGoOrderResponseDataModel scanAndGoOrderResponseDataModel = (ScanAndGoOrderResponseDataModel) obj;
        return C17542s.e(this.f120079a, scanAndGoOrderResponseDataModel.f120079a) && C17542s.e(this.f120080b, scanAndGoOrderResponseDataModel.f120080b) && C17542s.e(this.f120081c, scanAndGoOrderResponseDataModel.f120081c) && C17542s.e(this.f120082d, scanAndGoOrderResponseDataModel.f120082d) && C17542s.e(this.f120083e, scanAndGoOrderResponseDataModel.f120083e) && C17542s.e(this.f120084f, scanAndGoOrderResponseDataModel.f120084f) && C17542s.e(this.f120085g, scanAndGoOrderResponseDataModel.f120085g) && this.f120086h == scanAndGoOrderResponseDataModel.f120086h;
    }

    public final List<ScanAndGoSkippedBarcodeDataModel> f() {
        return this.f120084f;
    }

    public final List<ScanAndGoSkippedCouponsDataModel> g() {
        return this.f120085g;
    }

    public final OrderSummaryCardDataModel h() {
        return this.f120083e;
    }

    public int hashCode() {
        FamilySavingsCardDataModel familySavingsCardDataModel = this.f120079a;
        int i10 = 0;
        int hashCode = (familySavingsCardDataModel == null ? 0 : familySavingsCardDataModel.hashCode()) * 31;
        ShoppingBagDataModel shoppingBagDataModel = this.f120080b;
        int hashCode2 = (hashCode + (shoppingBagDataModel == null ? 0 : shoppingBagDataModel.hashCode())) * 31;
        PickingListDataModel pickingListDataModel = this.f120081c;
        int hashCode3 = (hashCode2 + (pickingListDataModel == null ? 0 : pickingListDataModel.hashCode())) * 31;
        SalesOrderDataModel salesOrderDataModel = this.f120082d;
        int hashCode4 = (hashCode3 + (salesOrderDataModel == null ? 0 : salesOrderDataModel.hashCode())) * 31;
        OrderSummaryCardDataModel orderSummaryCardDataModel = this.f120083e;
        int hashCode5 = (hashCode4 + (orderSummaryCardDataModel == null ? 0 : orderSummaryCardDataModel.hashCode())) * 31;
        List<ScanAndGoSkippedBarcodeDataModel> list = this.f120084f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<ScanAndGoSkippedCouponsDataModel> list2 = this.f120085g;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return ((hashCode6 + i10) * 31) + Boolean.hashCode(this.f120086h);
    }

    public String toString() {
        FamilySavingsCardDataModel familySavingsCardDataModel = this.f120079a;
        ShoppingBagDataModel shoppingBagDataModel = this.f120080b;
        PickingListDataModel pickingListDataModel = this.f120081c;
        SalesOrderDataModel salesOrderDataModel = this.f120082d;
        OrderSummaryCardDataModel orderSummaryCardDataModel = this.f120083e;
        List<ScanAndGoSkippedBarcodeDataModel> list = this.f120084f;
        List<ScanAndGoSkippedCouponsDataModel> list2 = this.f120085g;
        boolean z10 = this.f120086h;
        return "ScanAndGoOrderResponseDataModel(familySavingsCard=" + familySavingsCardDataModel + ", shoppingBag=" + shoppingBagDataModel + ", pickingList=" + pickingListDataModel + ", salesOrder=" + salesOrderDataModel + ", summaryCard=" + orderSummaryCardDataModel + ", skippedBarcodes=" + list + ", skippedCoupons=" + list2 + ", isCoWorkerDiscountApplied=" + z10 + ")";
    }
}
