package Xn;

import androidx.fragment.app.FragmentManager;
import com.ingka.ikea.checkout.impl.delivery.bottomsheets.DeliveryPricesBottomSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LXn/d;", "LXn/c;", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "", "checkoutId", "LXH/N;", "a", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {
    public void a(FragmentManager fragmentManager, String str) {
        C17542s.j(fragmentManager, "supportFragmentManager");
        C17542s.j(str, "checkoutId");
        DeliveryPricesBottomSheet.f94494X.a(str).show(fragmentManager, "delivery_prices_bottom_sheet");
    }
}
