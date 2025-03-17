package iz;

import HJ.C15854t;
import XH.u;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.FamilySavingsCardDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.OrderSummaryCardDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PriceDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoBagProductDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoSkippedBarcodeDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoSkippedCouponsDataModel;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rz.C15023p;
import rz.C15032z;
import rz.H;
import rz.L;
import rz.M;
import rz.X;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/FamilySavingsCardDataModel;", "Lrz/p;", "a", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/FamilySavingsCardDataModel;)Lrz/p;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/OrderSummaryCardDataModel;", "Lrz/H;", "e", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/OrderSummaryCardDataModel;)Lrz/H;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoSkippedBarcodeDataModel;", "Lrz/L;", "c", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoSkippedBarcodeDataModel;)Lrz/L;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoSkippedCouponsDataModel;", "Lrz/M;", "d", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoSkippedCouponsDataModel;)Lrz/M;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoBagProductDataModel;", "Lrz/z;", "b", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoBagProductDataModel;)Lrz/z;", "datalayer-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.k  reason: case insensitive filesystem */
public final class C14597k {
    public static final C15023p a(FamilySavingsCardDataModel familySavingsCardDataModel) {
        return familySavingsCardDataModel == null ? C15023p.a.f130880a : familySavingsCardDataModel.a() == null ? C15023p.a.f130880a : familySavingsCardDataModel.a().doubleValue() <= 0.0d ? C15023p.a.f130880a : new C15023p.b(familySavingsCardDataModel.a().doubleValue());
    }

    public static final C15032z b(ScanAndGoBagProductDataModel scanAndGoBagProductDataModel) {
        C17542s.j(scanAndGoBagProductDataModel, "<this>");
        String a10 = scanAndGoBagProductDataModel.a();
        Double d10 = null;
        if (a10 == null || a10.length() == 0 || scanAndGoBagProductDataModel.c() == null || Double.isNaN(scanAndGoBagProductDataModel.c().doubleValue())) {
            return null;
        }
        PriceDataModel b10 = scanAndGoBagProductDataModel.b();
        Double valueOf = b10 != null ? Double.valueOf(b10.b()) : null;
        if (valueOf == null) {
            return null;
        }
        String a11 = scanAndGoBagProductDataModel.a();
        double doubleValue = scanAndGoBagProductDataModel.c().doubleValue();
        double doubleValue2 = valueOf.doubleValue();
        PriceDataModel b11 = scanAndGoBagProductDataModel.b();
        if (b11 != null) {
            d10 = b11.a();
        }
        return new C15032z(a11, doubleValue, doubleValue2, d10);
    }

    public static final L c(ScanAndGoSkippedBarcodeDataModel scanAndGoSkippedBarcodeDataModel) {
        C17542s.j(scanAndGoSkippedBarcodeDataModel, "<this>");
        String a10 = scanAndGoSkippedBarcodeDataModel.a();
        if (a10 == null || a10.length() == 0) {
            return null;
        }
        return new L(scanAndGoSkippedBarcodeDataModel.a());
    }

    public static final M d(ScanAndGoSkippedCouponsDataModel scanAndGoSkippedCouponsDataModel) {
        T t10;
        C17542s.j(scanAndGoSkippedCouponsDataModel, "<this>");
        Iterator<T> it = X.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((X) t10).name(), scanAndGoSkippedCouponsDataModel.b())) {
                break;
            }
        }
        X x10 = (X) t10;
        if (x10 == null) {
            x10 = X.COUPON_GENERIC_ERROR;
            u uVar = new u("No matching local counterpart to " + scanAndGoSkippedCouponsDataModel.b());
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, uVar);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = ScanAndGoSkippedCouponsDataModel.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, uVar, str3);
                str = str3;
                str2 = str4;
            }
        }
        return new M(scanAndGoSkippedCouponsDataModel.a(), x10);
    }

    public static final H e(OrderSummaryCardDataModel orderSummaryCardDataModel) {
        C17542s.j(orderSummaryCardDataModel, "<this>");
        return new H(orderSummaryCardDataModel.b().b(), orderSummaryCardDataModel.b().a(), orderSummaryCardDataModel.b().c());
    }
}
