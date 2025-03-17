package com.sugarcube.decorate.v1.internal.catalog.adapters;

import TF.C16460c;
import UF.e;
import YH.C16877v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.core.network.models.QuickFilter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B\u001f\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/catalog/adapters/FilterPillAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/FilterPillAdapter$a;", "", "Lcom/sugarcube/core/network/models/QuickFilter;", "items", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/FilterPillAdapter$OnFilterClickedListener;", "listener", "<init>", "(Ljava/util/List;Lcom/sugarcube/decorate/v1/internal/catalog/adapters/FilterPillAdapter$OnFilterClickedListener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "h", "(Landroid/view/ViewGroup;I)Lcom/sugarcube/decorate/v1/internal/catalog/adapters/FilterPillAdapter$a;", "holder", "position", "LXH/N;", "f", "(Lcom/sugarcube/decorate/v1/internal/catalog/adapters/FilterPillAdapter$a;I)V", "getItemCount", "()I", "i", "(Ljava/util/List;)V", "d", "()V", "", "e", "()Z", "Ljava/util/List;", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/FilterPillAdapter$OnFilterClickedListener;", "getListener", "()Lcom/sugarcube/decorate/v1/internal/catalog/adapters/FilterPillAdapter$OnFilterClickedListener;", "j", "I", "selectedPosition", "OnFilterClickedListener", "a", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FilterPillAdapter extends RecyclerView.h<a> {

    /* renamed from: h  reason: collision with root package name */
    private List<QuickFilter> f141703h;

    /* renamed from: i  reason: collision with root package name */
    private final OnFilterClickedListener f141704i;

    /* renamed from: j  reason: collision with root package name */
    private int f141705j;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/catalog/adapters/FilterPillAdapter$OnFilterClickedListener;", "", "", "filter", "LXH/N;", "onFilterClicked", "(Ljava/lang/String;)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnFilterClickedListener {
        void onFilterClicked(String str);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/catalog/adapters/FilterPillAdapter$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LTF/c;", "binding", "<init>", "(LTF/c;)V", "", "data", "LXH/N;", "c", "(Ljava/lang/String;)V", "e", "LTF/c;", "getBinding", "()LTF/c;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends RecyclerView.G {

        /* renamed from: e  reason: collision with root package name */
        private final C16460c f141706e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C16460c cVar) {
            super(cVar.getRoot());
            C17542s.j(cVar, "binding");
            this.f141706e = cVar;
        }

        public final void c(String str) {
            this.f141706e.getRoot().setText(str);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilterPillAdapter(List list, OnFilterClickedListener onFilterClickedListener, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16877v.n() : list, onFilterClickedListener);
    }

    /* access modifiers changed from: private */
    public static final void g(int i10, FilterPillAdapter filterPillAdapter, a aVar, QuickFilter quickFilter, View view) {
        int i11 = filterPillAdapter.f141705j;
        if (i10 == i11) {
            filterPillAdapter.d();
            filterPillAdapter.f141704i.onFilterClicked((String) null);
            return;
        }
        filterPillAdapter.f141705j = aVar.getAbsoluteAdapterPosition();
        filterPillAdapter.notifyItemChanged(i11);
        filterPillAdapter.notifyItemChanged(filterPillAdapter.f141705j);
        filterPillAdapter.f141704i.onFilterClicked(quickFilter.getSearch());
    }

    public final void d() {
        notifyItemChanged(this.f141705j);
        this.f141705j = -1;
    }

    public final boolean e() {
        return this.f141705j != -1;
    }

    /* renamed from: f */
    public void onBindViewHolder(a aVar, int i10) {
        QuickFilter quickFilter;
        C17542s.j(aVar, "holder");
        List<QuickFilter> list = this.f141703h;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null && (quickFilter = list.get(i10)) != null) {
            aVar.itemView.setSelected(i10 == this.f141705j);
            aVar.itemView.setOnClickListener(new e(i10, this, aVar, quickFilter));
            aVar.c(quickFilter.getSearch());
        }
    }

    public int getItemCount() {
        return this.f141703h.size();
    }

    /* renamed from: h */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        C17542s.j(viewGroup, "parent");
        C16460c c10 = C16460c.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(c10);
    }

    public final void i(List<QuickFilter> list) {
        C17542s.j(list, "items");
        this.f141703h = list;
        notifyDataSetChanged();
    }

    public FilterPillAdapter(List<QuickFilter> list, OnFilterClickedListener onFilterClickedListener) {
        C17542s.j(list, "items");
        C17542s.j(onFilterClickedListener, "listener");
        this.f141703h = list;
        this.f141704i = onFilterClickedListener;
        this.f141705j = -1;
    }
}
