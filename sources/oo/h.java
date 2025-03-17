package oo;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Loo/h;", "Loo/g;", "<init>", "()V", "Lx4/o;", "navController", "", "checkoutId", "deliveryId", "Lx4/C;", "navOptions", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Lx4/C;)V", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements g {
    public void a(C8951o oVar, String str, String str2, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "checkoutId");
        C17542s.j(str2, "deliveryId");
        Uri build = Uri.parse(c.b("ikea://navigation/checkout/changeDeliveryTimeSlot?checkoutId={checkoutId}&deliveryId={deliveryId}")).buildUpon().appendQueryParameter("checkoutId", str).appendQueryParameter("deliveryId", str2).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, c10);
    }
}
