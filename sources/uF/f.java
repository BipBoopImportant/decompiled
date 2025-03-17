package UF;

import android.view.View;
import com.sugarcube.app.base.data.database.CachedCatalogItem;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f138946a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CachedCatalogItem f138947b;

    public /* synthetic */ f(i iVar, CachedCatalogItem cachedCatalogItem) {
        this.f138946a = iVar;
        this.f138947b = cachedCatalogItem;
    }

    public final void onClick(View view) {
        i.g(this.f138946a, this.f138947b, view);
    }
}
