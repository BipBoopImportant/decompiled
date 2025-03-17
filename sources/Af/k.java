package af;

import G2.b;
import HJ.C15854t;
import Lg.c;
import Lg.d;
import XH.C16807N;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C10018a;
import lf.C10023f;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00060\fR\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Laf/k;", "LLg/a;", "Laf/m;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Laf/k$a;", "l", "(Landroid/view/ViewGroup;)Laf/k$a;", "Lkotlin/Function1;", "LLg/d$a;", "LXH/N;", "b", "LnI/l;", "diffBlock", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends Lg.a<m> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<d.a, C16807N> f65307b = new g();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Laf/k$a;", "LLg/c;", "Laf/m;", "Landroid/view/View;", "itemView", "<init>", "(Laf/k;Landroid/view/View;)V", "viewModel", "LXH/N;", "m", "(Laf/m;)V", "Landroidx/recyclerview/widget/RecyclerView;", "h", "Landroidx/recyclerview/widget/RecyclerView;", "list", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "title", "j", "description", "Landroid/view/ViewGroup;", "k", "Landroid/view/ViewGroup;", "linkViewGroup", "LLg/d;", "l", "LLg/d;", "listAdapter", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<m> {

        /* renamed from: h  reason: collision with root package name */
        private final RecyclerView f65308h;

        /* renamed from: i  reason: collision with root package name */
        private final TextView f65309i;

        /* renamed from: j  reason: collision with root package name */
        private final TextView f65310j;

        /* renamed from: k  reason: collision with root package name */
        private final ViewGroup f65311k;

        /* renamed from: l  reason: collision with root package name */
        private final d f65312l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ k f65313m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(k kVar, View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            this.f65313m = kVar;
            View findViewById = view.findViewById(We.a.f64705u);
            C17542s.i(findViewById, "findViewById(...)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            this.f65308h = recyclerView;
            View findViewById2 = view.findViewById(We.a.f64706v);
            C17542s.i(findViewById2, "findViewById(...)");
            this.f65309i = (TextView) findViewById2;
            View findViewById3 = view.findViewById(We.a.f64689e);
            C17542s.i(findViewById3, "findViewById(...)");
            this.f65310j = (TextView) findViewById3;
            View findViewById4 = view.findViewById(We.a.f64704t);
            C17542s.i(findViewById4, "findViewById(...)");
            this.f65311k = (ViewGroup) findViewById4;
            d dVar = new d((Lg.a<?>[]) new Lg.a[]{new n()});
            this.f65312l = dVar;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.setAdapter(dVar);
            recyclerView.setItemAnimator((RecyclerView.n) null);
            recyclerView.m(new C10023f((C10018a) null, 1, (DefaultConstructorMarker) null));
        }

        /* access modifiers changed from: private */
        public static final void n(m mVar, View view) {
            mVar.e().invoke();
        }

        /* renamed from: m */
        public void c(m mVar) {
            C17542s.j(mVar, "viewModel");
            super.c(mVar);
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.c) {
                ((StaggeredGridLayoutManager.c) layoutParams).g(true);
            }
            TextView textView = this.f65309i;
            textView.setText(mVar.g());
            textView.setVisibility(!C15854t.v0(mVar.g()) ? 0 : 8);
            TextView textView2 = this.f65310j;
            textView2.setText(mVar.c());
            textView2.setVisibility(!C15854t.v0(mVar.c()) ? 0 : 8);
            if (!C15854t.v0(mVar.f())) {
                ((TextView) this.f65311k.findViewById(We.a.f64699o)).setText(b.a(mVar.f(), 0));
                this.f65311k.setOnClickListener(new j(mVar));
            } else {
                this.f65311k.setVisibility(8);
                this.f65311k.setOnClickListener((View.OnClickListener) null);
            }
            this.f65312l.p(mVar.d(), true, this.f65313m.f65307b);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(d.a aVar) {
        C17542s.j(aVar, "<this>");
        aVar.g(new h());
        aVar.f(new i());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final boolean j(Object obj, Object obj2) {
        C17542s.j(obj, "old");
        C17542s.j(obj2, "new");
        return C17542s.e(obj, obj2);
    }

    /* access modifiers changed from: private */
    public static final boolean k(Object obj, Object obj2) {
        C17542s.j(obj, "old");
        C17542s.j(obj2, "new");
        return C17542s.e(obj, obj2);
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof m;
    }

    /* renamed from: l */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, We.b.f64714g, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(this, c10);
    }
}
