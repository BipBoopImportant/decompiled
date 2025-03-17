package aG;

import android.view.View;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter;

/* renamed from: aG.a  reason: case insensitive filesystem */
public final /* synthetic */ class C17022a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ItemVariantAdapter f140910a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ItemVariantAdapter.b f140911b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CachedCatalogItem f140912c;

    public /* synthetic */ C17022a(ItemVariantAdapter itemVariantAdapter, ItemVariantAdapter.b bVar, CachedCatalogItem cachedCatalogItem) {
        this.f140910a = itemVariantAdapter;
        this.f140911b = bVar;
        this.f140912c = cachedCatalogItem;
    }

    public final void onClick(View view) {
        ItemVariantAdapter.b.e(this.f140910a, this.f140911b, this.f140912c, view);
    }
}
