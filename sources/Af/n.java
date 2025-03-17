package af;

import Cp.c;
import Lg.e;
import Oo.b;
import Xo.f;
import Ye.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00060\fR\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Laf/n;", "LLg/a;", "LCp/c;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Laf/n$a;", "e", "(Landroid/view/ViewGroup;)Laf/n$a;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends Lg.a<c> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Laf/n$a;", "LLg/c;", "LCp/c;", "LYe/d;", "binding", "<init>", "(Laf/n;LYe/d;)V", "viewModel", "LXH/N;", "l", "(LCp/c;)V", "Landroid/view/View;", "view", "i", "(Landroid/view/View;)V", "h", "LYe/d;", "getBinding", "()LYe/d;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends Lg.c<c> {

        /* renamed from: h  reason: collision with root package name */
        private final d f65319h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ n f65320i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(af.n r2, Ye.d r3) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                r1.f65320i = r2
                androidx.cardview.widget.CardView r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                r0 = 1
                r1.<init>((android.view.View) r2, (boolean) r0)
                r1.f65319h = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: af.n.a.<init>(af.n, Ye.d):void");
        }

        public void i(View view) {
            C17542s.j(view, "view");
            c cVar = (c) g();
            cVar.g().invoke(cVar.e());
        }

        /* renamed from: l */
        public void c(c cVar) {
            C17542s.j(cVar, "viewModel");
            super.c(cVar);
            this.f65319h.f64986b.setImageResource(cVar.f());
            this.f65319h.f64988d.setText(cVar.h());
            this.f65319h.f64987c.setText(f.a(e.c(this, b.f84390H2)));
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof c;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C17542s.i(from, "from(...)");
        d c10 = d.c(from, viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
