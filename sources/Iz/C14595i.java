package iz;

import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CheckoutCardDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CheckoutSalesOrderDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CheckoutSummaryCardDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.DiscountsModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LabelWithValueDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoCheckoutResponseDataModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.B;
import rz.C15007A;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Liz/i;", "", "Liz/e;", "discountsDataModelMapper", "<init>", "(Liz/e;)V", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutResponseDataModel;", "model", "Lrz/A;", "a", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutResponseDataModel;)Lrz/A;", "Liz/e;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.i  reason: case insensitive filesystem */
public final class C14595i {

    /* renamed from: a  reason: collision with root package name */
    private final C14591e f127778a;

    public C14595i(C14591e eVar) {
        C17542s.j(eVar, "discountsDataModelMapper");
        this.f127778a = eVar;
    }

    public final C15007A a(ScanAndGoCheckoutResponseDataModel scanAndGoCheckoutResponseDataModel) {
        LabelWithValueDataModel c10;
        LabelWithValueDataModel c11;
        LabelWithValueDataModel b10;
        LabelWithValueDataModel b11;
        Integer a10;
        C17542s.j(scanAndGoCheckoutResponseDataModel, "model");
        String b12 = scanAndGoCheckoutResponseDataModel.b();
        if (b12 != null) {
            CheckoutCardDataModel a11 = scanAndGoCheckoutResponseDataModel.a();
            DiscountsModel discountsModel = null;
            String b13 = a11 != null ? a11.b() : null;
            if (b13 != null) {
                Long e10 = scanAndGoCheckoutResponseDataModel.e();
                if (e10 != null) {
                    long longValue = e10.longValue();
                    CheckoutSalesOrderDataModel c12 = scanAndGoCheckoutResponseDataModel.c();
                    B b14 = (c12 == null || (a10 = c12.a()) == null) ? null : new B(a10.intValue());
                    CheckoutCardDataModel a12 = scanAndGoCheckoutResponseDataModel.a();
                    String c13 = a12 != null ? a12.c() : null;
                    if (c13 != null) {
                        CheckoutCardDataModel a13 = scanAndGoCheckoutResponseDataModel.a();
                        String a14 = a13 != null ? a13.a() : null;
                        if (a14 != null) {
                            CheckoutSummaryCardDataModel d10 = scanAndGoCheckoutResponseDataModel.d();
                            String a15 = (d10 == null || (b11 = d10.b()) == null) ? null : b11.a();
                            if (a15 != null) {
                                CheckoutSummaryCardDataModel d11 = scanAndGoCheckoutResponseDataModel.d();
                                String b15 = (d11 == null || (b10 = d11.b()) == null) ? null : b10.b();
                                if (b15 != null) {
                                    CheckoutSummaryCardDataModel d12 = scanAndGoCheckoutResponseDataModel.d();
                                    String a16 = (d12 == null || (c11 = d12.c()) == null) ? null : c11.a();
                                    if (a16 != null) {
                                        CheckoutSummaryCardDataModel d13 = scanAndGoCheckoutResponseDataModel.d();
                                        String b16 = (d13 == null || (c10 = d13.c()) == null) ? null : c10.b();
                                        if (b16 != null) {
                                            C14591e eVar = this.f127778a;
                                            CheckoutSummaryCardDataModel d14 = scanAndGoCheckoutResponseDataModel.d();
                                            if (d14 != null) {
                                                discountsModel = d14.a();
                                            }
                                            return new C15007A(b12, b13, longValue, b14, c13, a14, a15, b15, a16, b16, eVar.a(discountsModel));
                                        }
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
