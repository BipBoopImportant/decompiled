package com.sugarcube.decorate.v1.internal.catalog.adapters;

import TF.C16469l;
import UF.C16563d;
import YH.C16877v;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.core.network.models.CatalogCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R6\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b\u0016\u0010!R\u0016\u0010%\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogCategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogCategoryAdapter$a;", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogCategoryAdapter$OnItemSelectedListener;", "listener", "<init>", "(Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogCategoryAdapter$OnItemSelectedListener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "f", "(Landroid/view/ViewGroup;I)Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogCategoryAdapter$a;", "holder", "position", "LXH/N;", "d", "(Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogCategoryAdapter$a;I)V", "getItemCount", "()I", "g", "()V", "h", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogCategoryAdapter$OnItemSelectedListener;", "getListener", "()Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogCategoryAdapter$OnItemSelectedListener;", "", "Lcom/sugarcube/core/network/models/CatalogCategory;", "value", "i", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "(Ljava/util/List;)V", "items", "j", "I", "selectedPosition", "OnItemSelectedListener", "a", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CatalogCategoryAdapter extends RecyclerView.h<a> {

    /* renamed from: h  reason: collision with root package name */
    private final OnItemSelectedListener f141699h;

    /* renamed from: i  reason: collision with root package name */
    private List<CatalogCategory> f141700i = C16877v.n();

    /* renamed from: j  reason: collision with root package name */
    private int f141701j = -1;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogCategoryAdapter$OnItemSelectedListener;", "", "Lcom/sugarcube/core/network/models/CatalogCategory;", "category", "LXH/N;", "onItemSelected", "(Lcom/sugarcube/core/network/models/CatalogCategory;)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnItemSelectedListener {
        void onItemSelected(CatalogCategory catalogCategory);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogCategoryAdapter$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LTF/l;", "binding", "<init>", "(LTF/l;)V", "Lcom/sugarcube/core/network/models/CatalogCategory;", "data", "LXH/N;", "c", "(Lcom/sugarcube/core/network/models/CatalogCategory;)V", "e", "LTF/l;", "getBinding", "()LTF/l;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends RecyclerView.G {

        /* renamed from: e  reason: collision with root package name */
        private final C16469l f141702e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C16469l lVar) {
            super(lVar.getRoot());
            C17542s.j(lVar, "binding");
            this.f141702e = lVar;
        }

        public final void c(CatalogCategory catalogCategory) {
            C17542s.j(catalogCategory, "data");
            TextView b10 = this.f141702e.getRoot();
            b10.setText(catalogCategory.getName());
            if (b10.isSelected()) {
                b10.setTypeface(b10.getTypeface(), 1);
            } else {
                b10.setTypeface((Typeface) null, 0);
            }
        }
    }

    public CatalogCategoryAdapter(OnItemSelectedListener onItemSelectedListener) {
        C17542s.j(onItemSelectedListener, "listener");
        this.f141699h = onItemSelectedListener;
    }

    /* access modifiers changed from: private */
    public static final void e(CatalogCategoryAdapter catalogCategoryAdapter, a aVar, CatalogCategory catalogCategory, View view) {
        int i10 = catalogCategoryAdapter.f141701j;
        if (i10 != -1) {
            catalogCategoryAdapter.notifyItemChanged(i10);
        }
        int bindingAdapterPosition = aVar.getBindingAdapterPosition();
        catalogCategoryAdapter.f141701j = bindingAdapterPosition;
        catalogCategoryAdapter.notifyItemChanged(bindingAdapterPosition);
        catalogCategoryAdapter.f141699h.onItemSelected(catalogCategory);
    }

    /* renamed from: d */
    public void onBindViewHolder(a aVar, int i10) {
        C17542s.j(aVar, "holder");
        CatalogCategory catalogCategory = !this.f141700i.isEmpty() ? this.f141700i.get(i10) : new CatalogCategory((List) null, (String) null, (String) null, (String) null, (Uri) null, 31, (DefaultConstructorMarker) null);
        View view = aVar.itemView;
        view.setSelected(this.f141701j == i10);
        view.setOnClickListener(new C16563d(this, aVar, catalogCategory));
        aVar.c(catalogCategory);
    }

    /* renamed from: f */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        C17542s.j(viewGroup, "parent");
        C16469l c10 = C16469l.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(c10);
    }

    public final void g() {
        this.f141701j = -1;
        h(C16877v.n());
    }

    public int getItemCount() {
        return this.f141700i.size();
    }

    public final void h(List<CatalogCategory> list) {
        C17542s.j(list, "value");
        this.f141700i = list;
        notifyDataSetChanged();
    }
}
