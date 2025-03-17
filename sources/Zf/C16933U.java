package ZF;

import RF.k;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.decorate.v1.internal.v1.DecorateFragment;
import com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter;

/* renamed from: ZF.U  reason: case insensitive filesystem */
public final /* synthetic */ class C16933U implements ItemVariantAdapter.OnItemListInteractionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DecorateFragment f140581a;

    public /* synthetic */ C16933U(DecorateFragment decorateFragment) {
        this.f140581a = decorateFragment;
    }

    public final void onItemSelected(k kVar, CachedCatalogItem cachedCatalogItem) {
        DecorateFragment.t3(this.f140581a, kVar, cachedCatalogItem);
    }
}
