package com.sugarcube.decorate.v1.internal.v1.adapters;

import JF.C13111s;
import NF.C13291e;
import RF.k;
import TF.C16470m;
import XH.C16807N;
import YH.C16877v;
import aG.C17024c;
import aG.C17025d;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.t;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u000e\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002./B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0019J!\u0010\u001e\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R6\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\"8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010-\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8\u0002@BX\u000e¢\u0006\f\n\u0004\b\u001b\u0010*\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter$a;", "Lcom/squareup/picasso/t;", "picasso", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter$OnItemListInteractionListener;", "listener", "<init>", "(Lcom/squareup/picasso/t;Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter$OnItemListInteractionListener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "j", "(Landroid/view/ViewGroup;I)Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter$a;", "holder", "position", "LXH/N;", "i", "(Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter$a;I)V", "getItemCount", "()I", "LRF/k;", "item", "m", "(LRF/k;)V", "h", "k", "originalItem", "swapItem", "o", "(LRF/k;LRF/k;)V", "Lcom/squareup/picasso/t;", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter$OnItemListInteractionListener;", "", "value", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "l", "(Ljava/util/List;)V", "items", "I", "n", "(I)V", "selectedPosition", "OnItemListInteractionListener", "a", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlacedItemsAdapter extends RecyclerView.h<a> {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final t f141932h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final OnItemListInteractionListener f141933i;

    /* renamed from: j  reason: collision with root package name */
    private List<k> f141934j = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f141935k = -1;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter$OnItemListInteractionListener;", "", "LRF/k;", "item", "LXH/N;", "onItemSelected", "(LRF/k;)V", "", "isEmpty", "onItemListSizeChanged", "(Z)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnItemListInteractionListener {
        void onItemListSizeChanged(boolean z10);

        void onItemSelected(k kVar);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LTF/m;", "binding", "<init>", "(Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter;LTF/m;)V", "LRF/k;", "modelInstanceInfo", "LXH/N;", "d", "(LRF/k;)V", "e", "LTF/m;", "getBinding", "()LTF/m;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends RecyclerView.G {

        /* renamed from: e  reason: collision with root package name */
        private final C16470m f141936e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ PlacedItemsAdapter f141937f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(PlacedItemsAdapter placedItemsAdapter, C16470m mVar) {
            super(mVar.getRoot());
            C17542s.j(mVar, "binding");
            this.f141937f = placedItemsAdapter;
            this.f141936e = mVar;
        }

        /* access modifiers changed from: private */
        public static final void e(PlacedItemsAdapter placedItemsAdapter, a aVar, k kVar, View view) {
            placedItemsAdapter.n(aVar.getAbsoluteAdapterPosition());
            placedItemsAdapter.f141933i.onItemSelected(kVar);
        }

        public final void d(k kVar) {
            C17542s.j(kVar, "modelInstanceInfo");
            CachedCatalogItem d10 = kVar.d();
            PlacedItemsAdapter placedItemsAdapter = this.f141937f;
            if (d10.isValid()) {
                ImageView b10 = this.f141936e.getRoot();
                b10.setSelected(placedItemsAdapter.f141935k == getBindingAdapterPosition());
                Uri thumbUrl = d10.getCatalogItem().getThumbUrl();
                if (thumbUrl != null) {
                    placedItemsAdapter.f141932h.l(C13111s.b(thumbUrl, (String) null, 1, (Object) null)).h().d(b10);
                }
                b10.setOnClickListener(new C17025d(placedItemsAdapter, this, kVar));
            }
        }
    }

    public PlacedItemsAdapter(t tVar, OnItemListInteractionListener onItemListInteractionListener) {
        C17542s.j(tVar, "picasso");
        C17542s.j(onItemListInteractionListener, "listener");
        this.f141932h = tVar;
        this.f141933i = onItemListInteractionListener;
    }

    /* access modifiers changed from: private */
    public final void n(int i10) {
        notifyItemChanged(this.f141935k);
        this.f141935k = i10;
        notifyItemChanged(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N p(PlacedItemsAdapter placedItemsAdapter, k kVar, k kVar2) {
        C17542s.j(kVar, "original");
        C17542s.j(kVar2, "swap");
        Integer valueOf = Integer.valueOf(placedItemsAdapter.f141934j.indexOf(kVar));
        if (valueOf.intValue() <= -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        int intValue = valueOf.intValue();
        placedItemsAdapter.f141934j.set(intValue, kVar2);
        placedItemsAdapter.notifyItemChanged(intValue);
        return C16807N.f139792a;
    }

    public int getItemCount() {
        return this.f141934j.size();
    }

    public final void h(k kVar) {
        C17542s.j(kVar, "item");
        this.f141934j.add(kVar);
        notifyItemInserted(getItemCount() - 1);
        this.f141933i.onItemListSizeChanged(this.f141934j.isEmpty());
    }

    /* renamed from: i */
    public void onBindViewHolder(a aVar, int i10) {
        C17542s.j(aVar, "holder");
        k kVar = (k) C16877v.z0(this.f141934j, i10);
        if (kVar != null) {
            aVar.d(kVar);
        }
    }

    /* renamed from: j */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        C17542s.j(viewGroup, "parent");
        C16470m c10 = C16470m.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }

    public final void k(k kVar) {
        C17542s.j(kVar, "item");
        Integer valueOf = Integer.valueOf(this.f141934j.indexOf(kVar));
        if (valueOf.intValue() <= -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            this.f141934j.remove(intValue);
            n(-1);
            notifyItemRemoved(intValue);
            this.f141933i.onItemListSizeChanged(this.f141934j.isEmpty());
        }
    }

    public final void l(List<k> list) {
        C17542s.j(list, "value");
        if (!C17542s.e(this.f141934j, list)) {
            this.f141934j = list;
            notifyDataSetChanged();
        }
        this.f141933i.onItemListSizeChanged(this.f141934j.isEmpty());
    }

    public final void m(k kVar) {
        if (kVar == null) {
            n(-1);
            return;
        }
        Integer valueOf = Integer.valueOf(this.f141934j.indexOf(kVar));
        if (valueOf.intValue() <= -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            n(valueOf.intValue());
        }
    }

    public final void o(k kVar, k kVar2) {
        C13291e.c(kVar, kVar2, new C17024c(this));
    }
}
