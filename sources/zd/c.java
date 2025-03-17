package Zd;

import Sd.d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LZd/c;", "LLg/a;", "LZd/d;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LZd/c$a;", "e", "(Landroid/view/ViewGroup;)LZd/c$a;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends Lg.a<d> {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"LZd/c$a;", "LLg/c;", "LZd/d;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "viewModel", "LXH/N;", "l", "(LZd/d;)V", "view", "i", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "title", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "actionIcon", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Lg.c<d> {

        /* renamed from: h  reason: collision with root package name */
        private final TextView f65154h;

        /* renamed from: i  reason: collision with root package name */
        private final ImageView f65155i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view, true);
            C17542s.j(view, "itemView");
            View findViewById = view.findViewById(Sd.c.f63348m);
            C17542s.i(findViewById, "findViewById(...)");
            this.f65154h = (TextView) findViewById;
            View findViewById2 = view.findViewById(Sd.c.f63336a);
            C17542s.i(findViewById2, "findViewById(...)");
            this.f65155i = (ImageView) findViewById2;
        }

        public void i(View view) {
            C17542s.j(view, "view");
            ((d) g()).a().invoke(Integer.valueOf(getBindingAdapterPosition()));
        }

        /* renamed from: l */
        public void c(d dVar) {
            C17542s.j(dVar, "viewModel");
            super.c(dVar);
            this.f65154h.setText(dVar.c());
            this.itemView.setClickable(dVar.b());
            this.f65155i.setVisibility(dVar.b() ? 0 : 8);
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof d;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, d.f63352d, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(c10);
    }
}
