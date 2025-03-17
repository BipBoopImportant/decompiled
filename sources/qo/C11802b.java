package qo;

import Nn.C10798a;
import Nn.D;
import Nn.v;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tv.C11996a;
import tv.C11997b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqo/b;", "Lqo/a;", "<init>", "()V", "", "Ltv/a;", "allowedCardAuthMethods", "Ltv/b;", "allowedCardNetworks", "LNn/D$c;", "a", "(Ljava/util/List;Ljava/util/List;)LNn/D$c;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qo.b  reason: case insensitive filesystem */
public final class C11802b implements C11801a {
    public D.c a(List<? extends C11996a> list, List<? extends C11997b> list2) {
        C17542s.j(list, "allowedCardAuthMethods");
        C17542s.j(list2, "allowedCardNetworks");
        return new D.c(0, CheckoutConstants.PaymentBrands.GOOGLEPAY, "Google Pay", false, (String) null, (C10798a) null, new v(list, list2));
    }
}
