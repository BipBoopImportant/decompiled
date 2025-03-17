package Xn;

import androidx.fragment.app.FragmentManager;
import com.ingka.ikea.checkout.impl.userdetails.update.UpdateAddressBottomSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LXn/n;", "LXn/m;", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "LXH/N;", "a", "(Landroidx/fragment/app/FragmentManager;)V", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements m {
    public void a(FragmentManager fragmentManager) {
        C17542s.j(fragmentManager, "fragmentManager");
        UpdateAddressBottomSheet.f94682X.a().show(fragmentManager, "UpdateAddressBottomSheet_TAG");
    }
}
