package jf;

import Lg.c;
import We.b;
import YH.C16877v;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljf/d;", "LLg/a;", "Ljf/b;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jf.d  reason: case insensitive filesystem */
public final class C9913d extends Lg.a<C9911b> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ljf/d$a;", "LLg/c;", "Ljf/b;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "viewModel", "LXH/N;", "m", "(Ljf/b;)V", "Landroid/widget/LinearLayout;", "h", "Landroid/widget/LinearLayout;", "linksView", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jf.d$a */
    public static final class a extends c<C9911b> {

        /* renamed from: h  reason: collision with root package name */
        private final LinearLayout f74838h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            View findViewById = view.findViewById(We.a.f64700p);
            C17542s.i(findViewById, "findViewById(...)");
            this.f74838h = (LinearLayout) findViewById;
        }

        /* access modifiers changed from: private */
        public static final void n(C9911b bVar, p000if.a aVar, View view) {
            bVar.c().invoke(aVar.b());
        }

        /* renamed from: m */
        public void c(C9911b bVar) {
            C17542s.j(bVar, "viewModel");
            super.c(bVar);
            this.f74838h.removeAllViews();
            int i10 = 0;
            for (Object next : bVar.b()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                p000if.a aVar = (p000if.a) next;
                View c10 = h.c(this.f74838h, b.f64711d, false, 2, (Object) null);
                ((TextView) c10.findViewById(We.a.f64706v)).setText(aVar.a());
                c10.setOnClickListener(new C9912c(bVar, aVar));
                if (bVar.b().size() - 1 == i10) {
                    c10.findViewById(We.a.f64690f).setVisibility(8);
                }
                this.f74838h.addView(c10, i10);
                i10 = i11;
            }
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C9911b;
    }

    public c<C9911b> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, b.f64710c, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(c10);
    }
}
