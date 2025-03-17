package iz;

import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.DiscountsModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.IndividualDiscountsModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.Price;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.F;
import rz.r;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Liz/e;", "", "<init>", "()V", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/DiscountsModel;", "discountsModel", "Lrz/F;", "a", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/DiscountsModel;)Lrz/F;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.e  reason: case insensitive filesystem */
public final class C14591e {
    public final F a(DiscountsModel discountsModel) {
        List<IndividualDiscountsModel> b10;
        if (discountsModel == null || (b10 = discountsModel.b()) == null) {
            return new F((List) null, 0.0d, 3, (DefaultConstructorMarker) null);
        }
        Price c10 = discountsModel.c();
        if (c10 == null) {
            return new F((List) null, 0.0d, 3, (DefaultConstructorMarker) null);
        }
        ArrayList arrayList = new ArrayList();
        for (IndividualDiscountsModel individualDiscountsModel : b10) {
            String c11 = individualDiscountsModel.c();
            Price b11 = individualDiscountsModel.b();
            r rVar = null;
            Double a10 = b11 != null ? b11.a() : null;
            if (!(c11 == null || c11.length() == 0 || a10 == null)) {
                rVar = new r(c11, a10.doubleValue(), individualDiscountsModel.a());
            }
            if (rVar != null) {
                arrayList.add(rVar);
            }
        }
        return (arrayList.isEmpty() || arrayList.size() != b10.size() || c10.a() == null) ? new F((List) null, 0.0d, 3, (DefaultConstructorMarker) null) : new F(arrayList, c10.a().doubleValue());
    }
}
