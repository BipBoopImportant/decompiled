package df;

import Lg.a;
import Lg.c;
import We.b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldf/a;", "LLg/a;", "Ldf/b;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Ldf/a$a;", "e", "(Landroid/view/ViewGroup;)Ldf/a$a;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: df.a  reason: case insensitive filesystem */
public final class C9623a extends a<C9624b> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u0006R\u001c\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ldf/a$a;", "LLg/c;", "Ldf/b;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "viewModel", "LXH/N;", "l", "(Ldf/b;)V", "view", "i", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "h", "Landroid/widget/TextView;", "title", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: df.a$a  reason: collision with other inner class name */
    public static final class C1239a extends c<C9624b> {

        /* renamed from: h  reason: collision with root package name */
        private final TextView f72412h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1239a(View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            this.f72412h = (TextView) view.findViewById(We.a.f64706v);
        }

        public void i(View view) {
            C17542s.j(view, "view");
        }

        /* renamed from: l */
        public void c(C9624b bVar) {
            C17542s.j(bVar, "viewModel");
            super.c(bVar);
            this.f72412h.setText(bVar.a());
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C9624b;
    }

    /* renamed from: e */
    public C1239a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, b.f64717j, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new C1239a(c10);
    }
}
