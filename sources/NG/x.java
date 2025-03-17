package NG;

import com.sugarcube.app.base.external.interactions.AccountInteractions;
import com.sugarcube.app.base.external.shoppinglist.AddToShoppingListUseCase;
import com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment;

public final class x {
    public static void a(DecorateSurfaceFragment decorateSurfaceFragment, AccountInteractions accountInteractions) {
        decorateSurfaceFragment.f142569K = accountInteractions;
    }

    public static void b(DecorateSurfaceFragment decorateSurfaceFragment, AddToShoppingListUseCase addToShoppingListUseCase) {
        decorateSurfaceFragment.f142568J = addToShoppingListUseCase;
    }
}
