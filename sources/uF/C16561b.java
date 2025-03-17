package UF;

import TF.C16462e;
import TF.C16463f;
import VF.C16647a;
import YH.C16877v;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.t;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.CachedCatalogPage;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.decorate.v1.internal.catalog.adapters.CatalogItemSelectedListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000e¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R:\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,2\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0010R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\f0,8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00100¨\u00069"}, d2 = {"LUF/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogItemSelectedListener;", "listener", "Lcom/squareup/picasso/t;", "picasso", "", "addToFavoritesEnabled", "<init>", "(Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogItemSelectedListener;Lcom/squareup/picasso/t;Z)V", "", "", "itemIds", "LXH/N;", "e", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$G;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$G;I)V", "getItemViewType", "(I)I", "g", "()V", "d", "h", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogItemSelectedListener;", "i", "Lcom/squareup/picasso/t;", "getPicasso", "()Lcom/squareup/picasso/t;", "j", "Z", "getAddToFavoritesEnabled", "()Z", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "value", "k", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "f", "items", "l", "favoritedItems", "m", "a", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UF.b  reason: case insensitive filesystem */
public final class C16561b extends RecyclerView.h<RecyclerView.G> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f138929m = new a((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    public static final int f138930n = 8;

    /* renamed from: o  reason: collision with root package name */
    private static final CachedCatalogItem f138931o = new CachedCatalogItem((File) null, (File) null, false, (CachedCatalogPage) null, (Map) null, (CatalogItem) null, 63, (DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    private final CatalogItemSelectedListener f138932h;

    /* renamed from: i  reason: collision with root package name */
    private final t f138933i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f138934j;

    /* renamed from: k  reason: collision with root package name */
    private List<CachedCatalogItem> f138935k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private final List<String> f138936l = new ArrayList();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LUF/b$a;", "", "<init>", "()V", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "emptyItem", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "", "TYPE_LOADER", "I", "TYPE_CATALOG_ITEM", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: UF.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C16561b(CatalogItemSelectedListener catalogItemSelectedListener, t tVar, boolean z10) {
        C17542s.j(catalogItemSelectedListener, "listener");
        C17542s.j(tVar, "picasso");
        this.f138932h = catalogItemSelectedListener;
        this.f138933i = tVar;
        this.f138934j = z10;
    }

    /* access modifiers changed from: private */
    public static final void h(C16561b bVar) {
        bVar.f138935k.add((Object) null);
        bVar.notifyItemInserted(bVar.f138935k.size() - 1);
    }

    public final void d() {
        if (!this.f138935k.isEmpty()) {
            int p10 = C16877v.p(this.f138935k);
            if (getItemViewType(p10) == 2) {
                this.f138935k.remove(p10);
                notifyItemRemoved(this.f138935k.size());
            }
        }
    }

    public final void e(List<String> list) {
        C17542s.j(list, "itemIds");
        this.f138936l.clear();
        this.f138936l.addAll(list);
        notifyDataSetChanged();
    }

    public final void f(List<CachedCatalogItem> list) {
        C17542s.j(list, "value");
        this.f138935k = list;
        notifyDataSetChanged();
    }

    public final void g() {
        if (getItemViewType(C16877v.p(this.f138935k)) != 2) {
            new Handler().post(new C16560a(this));
        }
    }

    public int getItemCount() {
        return this.f138935k.size();
    }

    public int getItemViewType(int i10) {
        CachedCatalogItem cachedCatalogItem = (CachedCatalogItem) C16877v.z0(this.f138935k, i10);
        return (cachedCatalogItem != null ? cachedCatalogItem.getCatalogItem() : null) != null ? 3 : 2;
    }

    public void onBindViewHolder(RecyclerView.G g10, int i10) {
        C17542s.j(g10, "holder");
        CachedCatalogItem cachedCatalogItem = i10 < this.f138935k.size() ? this.f138935k.get(i10) : f138931o;
        if (getItemViewType(i10) == 3 && cachedCatalogItem != null) {
            i iVar = (i) g10;
            iVar.f(cachedCatalogItem);
            iVar.j(C16877v.l0(this.f138936l, cachedCatalogItem.getCatalogItem().getLocalItemNumber()));
        }
    }

    public RecyclerView.G onCreateViewHolder(ViewGroup viewGroup, int i10) {
        C17542s.j(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i10 == 2) {
            C16463f c10 = C16463f.c(from, viewGroup, false);
            C17542s.i(c10, "inflate(...)");
            return new C16647a(c10);
        }
        C16462e c11 = C16462e.c(from, viewGroup, false);
        C17542s.i(c11, "inflate(...)");
        return new i(c11, this.f138932h, this.f138933i, this.f138934j);
    }
}
