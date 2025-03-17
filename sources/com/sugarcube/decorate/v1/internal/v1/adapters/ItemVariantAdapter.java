package com.sugarcube.decorate.v1.internal.v1.adapters;

import JF.C13111s;
import RF.k;
import TF.C16472o;
import YH.C16877v;
import aG.C17022a;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.t;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import fI.C17221b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003234B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001d\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u001f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010$R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010%R0\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@BX\u000e¢\u0006\f\n\u0004\b\r\u0010'\"\u0004\b(\u0010)R(\u0010-\u001a\u0004\u0018\u00010\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u001b8\u0006@BX\u000e¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b\"\u0010,R$\u00101\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b8\u0002@BX\u000e¢\u0006\f\n\u0004\b.\u0010/\"\u0004\b.\u00100¨\u00065"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$b;", "Lcom/squareup/picasso/t;", "picasso", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$OnItemListInteractionListener;", "listener", "<init>", "(Lcom/squareup/picasso/t;Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$OnItemListInteractionListener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "k", "(Landroid/view/ViewGroup;I)Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$b;", "holder", "position", "LXH/N;", "j", "(Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$b;I)V", "getItemCount", "()I", "LRF/k;", "selectedInstance", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "variantList", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$a;", "variantType", "n", "(LRF/k;Ljava/util/List;Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$a;)V", "", "i", "(Ljava/util/List;)Z", "h", "Lcom/squareup/picasso/t;", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$OnItemListInteractionListener;", "LRF/k;", "value", "Ljava/util/List;", "l", "(Ljava/util/List;)V", "items", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$a;", "()Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$a;", "type", "m", "I", "(I)V", "selectedPosition", "OnItemListInteractionListener", "a", "b", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ItemVariantAdapter extends RecyclerView.h<b> {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final t f141916h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final OnItemListInteractionListener f141917i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public k f141918j;

    /* renamed from: k  reason: collision with root package name */
    private List<CachedCatalogItem> f141919k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private a f141920l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f141921m = -1;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$OnItemListInteractionListener;", "", "LRF/k;", "instance", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "LXH/N;", "onItemSelected", "(LRF/k;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnItemListInteractionListener {
        void onItemSelected(k kVar, CachedCatalogItem cachedCatalogItem);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$a;", "", "<init>", "(Ljava/lang/String;I)V", "COLOR", "SIZE", "CONFIGURATION", "NONE", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        COLOR,
        SIZE,
        CONFIGURATION,
        NONE;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$b;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LTF/o;", "binding", "<init>", "(Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter;LTF/o;)V", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "LXH/N;", "d", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "e", "LTF/o;", "getBinding", "()LTF/o;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends RecyclerView.G {

        /* renamed from: e  reason: collision with root package name */
        private final C16472o f141922e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ItemVariantAdapter f141923f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ItemVariantAdapter itemVariantAdapter, C16472o oVar) {
            super(oVar.getRoot());
            C17542s.j(oVar, "binding");
            this.f141923f = itemVariantAdapter;
            this.f141922e = oVar;
        }

        /* access modifiers changed from: private */
        public static final void e(ItemVariantAdapter itemVariantAdapter, b bVar, CachedCatalogItem cachedCatalogItem, View view) {
            itemVariantAdapter.m(bVar.getAbsoluteAdapterPosition());
            k e10 = itemVariantAdapter.f141918j;
            if (e10 != null) {
                itemVariantAdapter.f141917i.onItemSelected(e10, cachedCatalogItem);
            }
        }

        public final void d(CachedCatalogItem cachedCatalogItem) {
            C17542s.j(cachedCatalogItem, "item");
            ImageView b10 = this.f141922e.getRoot();
            ItemVariantAdapter itemVariantAdapter = this.f141923f;
            b10.setSelected(itemVariantAdapter.f141921m == getBindingAdapterPosition());
            Uri thumbUrl = cachedCatalogItem.getCatalogItem().getThumbUrl();
            if (thumbUrl != null) {
                itemVariantAdapter.f141916h.l(C13111s.b(thumbUrl, (String) null, 1, (Object) null)).h().d(b10);
            }
            b10.setOnClickListener(new C17022a(itemVariantAdapter, this, cachedCatalogItem));
        }
    }

    public ItemVariantAdapter(t tVar, OnItemListInteractionListener onItemListInteractionListener) {
        C17542s.j(tVar, "picasso");
        C17542s.j(onItemListInteractionListener, "listener");
        this.f141916h = tVar;
        this.f141917i = onItemListInteractionListener;
    }

    private final void l(List<CachedCatalogItem> list) {
        if (!C17542s.e(this.f141919k, list)) {
            this.f141919k = list;
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    public final void m(int i10) {
        notifyItemChanged(this.f141921m);
        this.f141921m = i10;
        notifyItemChanged(i10);
    }

    public int getItemCount() {
        return this.f141919k.size();
    }

    public final a h() {
        return this.f141920l;
    }

    public final boolean i(List<CachedCatalogItem> list) {
        return !C17542s.e(this.f141919k, list);
    }

    /* renamed from: j */
    public void onBindViewHolder(b bVar, int i10) {
        C17542s.j(bVar, "holder");
        CachedCatalogItem cachedCatalogItem = (CachedCatalogItem) C16877v.z0(this.f141919k, i10);
        if (cachedCatalogItem != null) {
            bVar.d(cachedCatalogItem);
        }
    }

    /* renamed from: k */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        C17542s.j(viewGroup, "parent");
        C16472o c10 = C16472o.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new b(this, c10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        r5 = r5.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(RF.k r5, java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem> r6, com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter.a r7) {
        /*
            r4 = this;
            java.lang.String r0 = "variantType"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            r4.f141918j = r5
            if (r6 == 0) goto L_0x0011
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r6 = YH.C16877v.t1(r6)
            if (r6 != 0) goto L_0x0015
        L_0x0011:
            java.util.List r6 = YH.C16877v.n()
        L_0x0015:
            r4.l(r6)
            r4.f141920l = r7
            r6 = 0
            if (r5 == 0) goto L_0x002c
            com.sugarcube.app.base.data.database.CachedCatalogItem r5 = r5.d()
            if (r5 == 0) goto L_0x002c
            int r5 = r5.getId()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x002d
        L_0x002c:
            r5 = r6
        L_0x002d:
            java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem> r7 = r4.f141919k
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
        L_0x0034:
            boolean r1 = r7.hasNext()
            r2 = -1
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r7.next()
            com.sugarcube.app.base.data.database.CachedCatalogItem r1 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r1
            int r1 = r1.getId()
            if (r5 != 0) goto L_0x0048
            goto L_0x004f
        L_0x0048:
            int r3 = r5.intValue()
            if (r1 != r3) goto L_0x004f
            goto L_0x0053
        L_0x004f:
            int r0 = r0 + 1
            goto L_0x0034
        L_0x0052:
            r0 = r2
        L_0x0053:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            int r7 = r5.intValue()
            if (r7 == r2) goto L_0x005e
            r6 = r5
        L_0x005e:
            if (r6 == 0) goto L_0x0067
            int r5 = r6.intValue()
            r4.m(r5)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter.n(RF.k, java.util.List, com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter$a):void");
    }
}
