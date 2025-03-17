package UF;

import android.view.View;
import com.sugarcube.app.base.data.database.CachedCatalogItem;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f138948a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CachedCatalogItem f138949b;

    public /* synthetic */ g(i iVar, CachedCatalogItem cachedCatalogItem) {
        this.f138948a = iVar;
        this.f138949b = cachedCatalogItem;
    }

    public final void onClick(View view) {
        i.h(this.f138948a, this.f138949b, view);
    }
}
