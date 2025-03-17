package UF;

import JF.C13111s;
import TF.C16462e;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.C14194e;
import com.squareup.picasso.t;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.decorate.v1.internal.catalog.adapters.CatalogItemSelectedListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LUF/i;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LTF/e;", "binding", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogItemSelectedListener;", "listener", "Lcom/squareup/picasso/t;", "picasso", "", "addToFavoritesEnabled", "<init>", "(LTF/e;Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogItemSelectedListener;Lcom/squareup/picasso/t;Z)V", "isSelected", "LXH/N;", "j", "(Z)V", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "f", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "e", "LTF/e;", "getBinding", "()LTF/e;", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogItemSelectedListener;", "g", "Lcom/squareup/picasso/t;", "h", "Z", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends RecyclerView.G {

    /* renamed from: e  reason: collision with root package name */
    private final C16462e f138952e;

    /* renamed from: f  reason: collision with root package name */
    private final CatalogItemSelectedListener f138953f;

    /* renamed from: g  reason: collision with root package name */
    private final t f138954g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f138955h;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"UF/i$a", "Lcom/squareup/picasso/e;", "LXH/N;", "onSuccess", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "a", "(Ljava/lang/Exception;)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C14194e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16462e f138956a;

        a(C16462e eVar) {
            this.f138956a = eVar;
        }

        public void a(Exception exc) {
            this.f138956a.f138408h.setVisibility(4);
            this.f138956a.f138408h.setVisibility(4);
        }

        public void onSuccess() {
            this.f138956a.f138408h.setVisibility(4);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(C16462e eVar, CatalogItemSelectedListener catalogItemSelectedListener, t tVar, boolean z10) {
        super(eVar.getRoot());
        C17542s.j(eVar, "binding");
        C17542s.j(catalogItemSelectedListener, "listener");
        C17542s.j(tVar, "picasso");
        this.f138952e = eVar;
        this.f138953f = catalogItemSelectedListener;
        this.f138954g = tVar;
        this.f138955h = z10;
    }

    /* access modifiers changed from: private */
    public static final void g(i iVar, CachedCatalogItem cachedCatalogItem, View view) {
        iVar.f138953f.onItemLiked(cachedCatalogItem, view.isSelected());
    }

    /* access modifiers changed from: private */
    public static final void h(i iVar, CachedCatalogItem cachedCatalogItem, View view) {
        iVar.f138953f.onItemDisclaimerClicked(cachedCatalogItem);
    }

    /* access modifiers changed from: private */
    public static final void i(i iVar, CachedCatalogItem cachedCatalogItem, View view) {
        iVar.f138953f.onItemSelected(cachedCatalogItem);
    }

    public final void f(CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "item");
        C16462e eVar = this.f138952e;
        eVar.f138405e.setVisibility(4);
        eVar.f138408h.setVisibility(4);
        boolean isCombinable = cachedCatalogItem.isCombinable();
        if (!cachedCatalogItem.isValid()) {
            cachedCatalogItem = null;
        }
        if (cachedCatalogItem != null) {
            C16462e eVar2 = this.f138952e;
            Uri thumbUrl = cachedCatalogItem.getCatalogItem().getThumbUrl();
            int i10 = 0;
            if (thumbUrl != null) {
                eVar2.f138405e.setVisibility(0);
                eVar2.f138408h.setVisibility(0);
                this.f138954g.l(C13111s.b(thumbUrl, (String) null, 1, (Object) null)).e(eVar2.f138405e, new a(eVar2));
            }
            eVar2.f138406f.setText(cachedCatalogItem.getName());
            eVar2.f138403c.setText(cachedCatalogItem.getCatalogItem().getDescription());
            eVar2.f138407g.setText(cachedCatalogItem.getPrice());
            ImageView imageView = eVar2.f138404d;
            imageView.setVisibility(this.f138955h ? 0 : 8);
            imageView.setOnClickListener(new f(this, cachedCatalogItem));
            ImageView imageView2 = eVar2.f138409i;
            if (!isCombinable) {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
            imageView2.setOnClickListener(new g(this, cachedCatalogItem));
            eVar2.getRoot().setOnClickListener(new h(this, cachedCatalogItem));
        }
    }

    public final void j(boolean z10) {
        this.f138952e.f138404d.setSelected(z10);
    }
}
