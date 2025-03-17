package lo;

import Lh.a;
import com.ingka.ikea.appconfig.model.LocationLatLng;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Llo/s;", "LLh/a;", "c", "(Ljava/util/List;)Ljava/util/List;", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "location", "d", "(Llo/s;Lcom/ingka/ikea/appconfig/model/LocationLatLng;)LLh/a;", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {
    /* access modifiers changed from: private */
    public static final List<a<s>> c(List<s> list) {
        ArrayList arrayList = new ArrayList();
        for (s sVar : list) {
            LocationLatLng e10 = sVar.c().e();
            a<s> d10 = e10 != null ? d(sVar, e10) : null;
            if (d10 != null) {
                arrayList.add(d10);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final a<s> d(s sVar, LocationLatLng locationLatLng) {
        return new a<>(sVar.e(), sVar.f(), locationLatLng, sVar);
    }
}
