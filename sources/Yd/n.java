package Yd;

import com.ingka.ikea.account.impl.modalsettings.addresslist.a;
import com.ingka.ikea.useraccount.model.Address;
import java.util.Comparator;

public final /* synthetic */ class n implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f64956a;

    public /* synthetic */ n(a aVar) {
        this.f64956a = aVar;
    }

    public final int compare(Object obj, Object obj2) {
        return a.G(this.f64956a, (Address) obj, (Address) obj2);
    }
}
