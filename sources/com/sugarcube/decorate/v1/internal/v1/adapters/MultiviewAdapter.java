package com.sugarcube.decorate.v1.internal.v1.adapters;

import JF.C13111s;
import RF.j;
import TF.C16471n;
import YH.C16877v;
import aG.C17023b;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.p;
import com.squareup.picasso.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003)*+B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR0\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@BX\u000e¢\u0006\f\n\u0004\b!\u0010\"\"\u0004\b!\u0010\u001aR$\u0010&\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b8\u0002@BX\u000e¢\u0006\f\n\u0004\b\u001c\u0010$\"\u0004\b%\u0010\u001dR\u0011\u0010(\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0010¨\u0006,"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter$b;", "Lcom/squareup/picasso/t;", "picasso", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter$OnItemListInteractionListener;", "listener", "<init>", "(Lcom/squareup/picasso/t;Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter$OnItemListInteractionListener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "i", "(Landroid/view/ViewGroup;I)Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter$b;", "getItemCount", "()I", "holder", "position", "LXH/N;", "h", "(Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter$b;I)V", "", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter$a;", "list", "l", "(Ljava/util/List;)V", "selectedIndex", "k", "(I)V", "Lcom/squareup/picasso/t;", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter$OnItemListInteractionListener;", "value", "j", "Ljava/util/List;", "items", "I", "m", "_selectedPosition", "g", "selectedPosition", "OnItemListInteractionListener", "a", "b", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiviewAdapter extends RecyclerView.h<b> {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final t f141924h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final OnItemListInteractionListener f141925i;

    /* renamed from: j  reason: collision with root package name */
    private List<a> f141926j = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f141927k;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter$OnItemListInteractionListener;", "", "LRF/j;", "viewport", "LXH/N;", "onItemSelected", "(LRF/j;)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnItemListInteractionListener {
        void onItemSelected(j jVar);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter$a;", "", "LRF/j;", "engineViewport", "Landroid/net/Uri;", "image", "<init>", "(LRF/j;Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LRF/j;", "()LRF/j;", "b", "Landroid/net/Uri;", "()Landroid/net/Uri;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final j f141928a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri f141929b;

        public a(j jVar, Uri uri) {
            C17542s.j(jVar, "engineViewport");
            this.f141928a = jVar;
            this.f141929b = uri;
        }

        public final j a() {
            return this.f141928a;
        }

        public final Uri b() {
            return this.f141929b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f141928a == aVar.f141928a && C17542s.e(this.f141929b, aVar.f141929b);
        }

        public int hashCode() {
            int hashCode = this.f141928a.hashCode() * 31;
            Uri uri = this.f141929b;
            return hashCode + (uri == null ? 0 : uri.hashCode());
        }

        public String toString() {
            j jVar = this.f141928a;
            Uri uri = this.f141929b;
            return "MultiviewItemInformation(engineViewport=" + jVar + ", image=" + uri + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter$b;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LTF/n;", "binding", "<init>", "(Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter;LTF/n;)V", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter$a;", "information", "LXH/N;", "d", "(Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter$a;)V", "e", "LTF/n;", "getBinding", "()LTF/n;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends RecyclerView.G {

        /* renamed from: e  reason: collision with root package name */
        private final C16471n f141930e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ MultiviewAdapter f141931f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(MultiviewAdapter multiviewAdapter, C16471n nVar) {
            super(nVar.getRoot());
            C17542s.j(nVar, "binding");
            this.f141931f = multiviewAdapter;
            this.f141930e = nVar;
        }

        /* access modifiers changed from: private */
        public static final void e(b bVar, MultiviewAdapter multiviewAdapter, View view) {
            j a10 = j.Companion.a(bVar.getBindingAdapterPosition());
            multiviewAdapter.m(bVar.getAbsoluteAdapterPosition());
            multiviewAdapter.f141925i.onItemSelected(a10);
        }

        public final void d(a aVar) {
            C17542s.j(aVar, "information");
            C16471n nVar = this.f141930e;
            MultiviewAdapter multiviewAdapter = this.f141931f;
            t d10 = multiviewAdapter.f141924h;
            Uri b10 = aVar.b();
            boolean z10 = true;
            Uri uri = null;
            if (b10 != null) {
                uri = C13111s.b(b10, (String) null, 1, (Object) null);
            }
            d10.l(uri).h().g(p.NO_CACHE, p.NO_STORE).d(nVar.f138446b);
            TextView textView = nVar.f138447c;
            j a10 = aVar.a();
            Resources resources = nVar.getRoot().getResources();
            C17542s.i(resources, "getResources(...)");
            textView.setText(a10.m(resources));
            ConstraintLayout b11 = nVar.getRoot();
            if (multiviewAdapter.f141927k != getBindingAdapterPosition()) {
                z10 = false;
            }
            b11.setSelected(z10);
            b11.setOnClickListener(new C17023b(this, multiviewAdapter));
        }
    }

    public MultiviewAdapter(t tVar, OnItemListInteractionListener onItemListInteractionListener) {
        C17542s.j(tVar, "picasso");
        C17542s.j(onItemListInteractionListener, "listener");
        this.f141924h = tVar;
        this.f141925i = onItemListInteractionListener;
    }

    private final void j(List<a> list) {
        if (!C17542s.e(this.f141926j, list)) {
            this.f141926j = list;
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    public final void m(int i10) {
        notifyItemChanged(this.f141927k);
        this.f141927k = i10;
        notifyItemChanged(i10);
    }

    public final int g() {
        return this.f141927k;
    }

    public int getItemCount() {
        return this.f141926j.size();
    }

    /* renamed from: h */
    public void onBindViewHolder(b bVar, int i10) {
        C17542s.j(bVar, "holder");
        a aVar = (a) C16877v.z0(this.f141926j, i10);
        if (aVar != null) {
            bVar.d(aVar);
        }
    }

    /* renamed from: i */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        C17542s.j(viewGroup, "parent");
        C16471n c10 = C16471n.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new b(this, c10);
    }

    public final void k(int i10) {
        m(i10);
    }

    public final void l(List<a> list) {
        C17542s.j(list, "list");
        j(list);
    }
}
