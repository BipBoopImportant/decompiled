package oo;

import kotlin.Metadata;
import rw.c;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Loo/g;", "", "Lx4/o;", "navController", "", "checkoutId", "deliveryId", "Lx4/C;", "navOptions", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Lx4/C;)V", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(g gVar, C8951o oVar, String str, String str2, C c10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 8) != 0) {
                    c10 = c.f28698a.d().a();
                }
                gVar.a(oVar, str, str2, c10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeDeliveryTimeSlot");
        }
    }

    void a(C8951o oVar, String str, String str2, C c10);
}
