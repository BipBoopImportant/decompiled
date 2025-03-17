package Gy;

import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import com.ingka.ikea.scanandgo.cart.impl.dialog.CartOverflowMenuBottomSheet;

public final /* synthetic */ class c implements NavigationView.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CartOverflowMenuBottomSheet f110519a;

    public /* synthetic */ c(CartOverflowMenuBottomSheet cartOverflowMenuBottomSheet) {
        this.f110519a = cartOverflowMenuBottomSheet;
    }

    public final boolean a(MenuItem menuItem) {
        return CartOverflowMenuBottomSheet.O0(this.f110519a, menuItem);
    }
}
