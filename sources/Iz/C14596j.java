package iz;

import YH.C16877v;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.OrderSummaryCardDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PickingListDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesOrderDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoBagProductDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoOrderResponseDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoSkippedBarcodeDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoSkippedCouponsDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShoppingBagDataModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15023p;
import rz.C15032z;
import rz.F;
import rz.G;
import rz.H;
import rz.L;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Liz/j;", "", "Liz/e;", "discountsDataModelMapper", "<init>", "(Liz/e;)V", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoOrderResponseDataModel;", "responseModel", "Lrz/G;", "a", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoOrderResponseDataModel;)Lrz/G;", "Liz/e;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.j  reason: case insensitive filesystem */
public final class C14596j {

    /* renamed from: a  reason: collision with root package name */
    private final C14591e f127779a;

    public C14596j(C14591e eVar) {
        C17542s.j(eVar, "discountsDataModelMapper");
        this.f127779a = eVar;
    }

    public final G a(ScanAndGoOrderResponseDataModel scanAndGoOrderResponseDataModel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List<ScanAndGoBagProductDataModel> n10;
        List<ScanAndGoBagProductDataModel> n11;
        List<ScanAndGoBagProductDataModel> n12;
        C17542s.j(scanAndGoOrderResponseDataModel, "responseModel");
        C15023p a10 = C14597k.a(scanAndGoOrderResponseDataModel.b());
        OrderSummaryCardDataModel h10 = scanAndGoOrderResponseDataModel.h();
        if (h10 != null) {
            H e10 = C14597k.e(h10);
            C14591e eVar = this.f127779a;
            OrderSummaryCardDataModel h11 = scanAndGoOrderResponseDataModel.h();
            if (h11 != null) {
                F a11 = eVar.a(h11.a());
                List<ScanAndGoSkippedBarcodeDataModel> f10 = scanAndGoOrderResponseDataModel.f();
                if (f10 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (ScanAndGoSkippedBarcodeDataModel c10 : f10) {
                        L c11 = C14597k.c(c10);
                        if (c11 != null) {
                            arrayList3.add(c11);
                        }
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = C16877v.n();
                }
                List<ScanAndGoSkippedCouponsDataModel> g10 = scanAndGoOrderResponseDataModel.g();
                if (g10 != null) {
                    Iterable<ScanAndGoSkippedCouponsDataModel> iterable = g10;
                    ArrayList arrayList4 = new ArrayList(C16877v.y(iterable, 10));
                    for (ScanAndGoSkippedCouponsDataModel d10 : iterable) {
                        arrayList4.add(C14597k.d(d10));
                    }
                    arrayList2 = arrayList4;
                } else {
                    arrayList2 = C16877v.n();
                }
                List c12 = C16877v.c();
                ShoppingBagDataModel e11 = scanAndGoOrderResponseDataModel.e();
                if (e11 == null || (n10 = e11.b()) == null) {
                    n10 = C16877v.n();
                }
                c12.addAll(n10);
                PickingListDataModel c13 = scanAndGoOrderResponseDataModel.c();
                if (c13 == null || (n11 = c13.b()) == null) {
                    n11 = C16877v.n();
                }
                c12.addAll(n11);
                SalesOrderDataModel d11 = scanAndGoOrderResponseDataModel.d();
                if (d11 == null || (n12 = d11.b()) == null) {
                    n12 = C16877v.n();
                }
                c12.addAll(n12);
                ArrayList arrayList5 = new ArrayList();
                for (ScanAndGoBagProductDataModel b10 : C16877v.a(c12)) {
                    C15032z b11 = C14597k.b(b10);
                    if (b11 != null) {
                        arrayList5.add(b11);
                    }
                }
                return new G(a10, e10, arrayList, arrayList2, a11, arrayList5);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
