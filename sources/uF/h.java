package UF;

import android.view.View;
import com.sugarcube.app.base.data.database.CachedCatalogItem;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f138950a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CachedCatalogItem f138951b;

    public /* synthetic */ h(i iVar, CachedCatalogItem cachedCatalogItem) {
        this.f138950a = iVar;
        this.f138951b = cachedCatalogItem;
    }

    public final void onClick(View view) {
        i.i(this.f138950a, this.f138951b, view);
    }
}
