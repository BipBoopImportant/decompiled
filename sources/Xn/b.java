package Xn;

import androidx.fragment.app.FragmentManager;
import com.ingka.ikea.checkout.impl.delivery.fragments.DeliveryDetailsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LXn/b;", "LXn/a;", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "", "checkoutId", "deliveryId", "LXH/N;", "a", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Ljava/lang/String;)V", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {
    public void a(FragmentManager fragmentManager, String str, String str2) {
        C17542s.j(fragmentManager, "supportFragmentManager");
        C17542s.j(str, "checkoutId");
        C17542s.j(str2, "deliveryId");
        DeliveryDetailsFragment.f94569S.a(str, str2).show(fragmentManager, "delivery_details_dialog");
    }
}
