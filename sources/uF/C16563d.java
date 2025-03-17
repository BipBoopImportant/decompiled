package UF;

import android.view.View;
import com.sugarcube.core.network.models.CatalogCategory;
import com.sugarcube.decorate.v1.internal.catalog.adapters.CatalogCategoryAdapter;

/* renamed from: UF.d  reason: case insensitive filesystem */
public final /* synthetic */ class C16563d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CatalogCategoryAdapter f138939a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CatalogCategoryAdapter.a f138940b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CatalogCategory f138941c;

    public /* synthetic */ C16563d(CatalogCategoryAdapter catalogCategoryAdapter, CatalogCategoryAdapter.a aVar, CatalogCategory catalogCategory) {
        this.f138939a = catalogCategoryAdapter;
        this.f138940b = aVar;
        this.f138941c = catalogCategory;
    }

    public final void onClick(View view) {
        CatalogCategoryAdapter.e(this.f138939a, this.f138940b, this.f138941c, view);
    }
}
