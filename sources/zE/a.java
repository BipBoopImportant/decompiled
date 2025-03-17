package Ze;

import Lg.c;
import We.b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LZe/a;", "LLg/a;", "LZe/b;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LZe/a$a;", "e", "(Landroid/view/ViewGroup;)LZe/a$a;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends Lg.a<b> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"LZe/a$a;", "LLg/c;", "LZe/b;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "viewModel", "LXH/N;", "l", "(LZe/b;)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "h", "Landroid/widget/TextView;", "title", "i", "body", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ze.a$a  reason: collision with other inner class name */
    public static final class C1140a extends c<b> {

        /* renamed from: h  reason: collision with root package name */
        private final TextView f65159h;

        /* renamed from: i  reason: collision with root package name */
        private final TextView f65160i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1140a(View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            this.f65159h = (TextView) view.findViewById(We.a.f64706v);
            this.f65160i = (TextView) view.findViewById(We.a.f64686b);
        }

        /* renamed from: l */
        public void c(b bVar) {
            C17542s.j(bVar, "viewModel");
            super.c(bVar);
            this.f65159h.setText(bVar.b());
            this.f65160i.setText(bVar.a());
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof b;
    }

    /* renamed from: e */
    public C1140a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, b.f64718k, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new C1140a(c10);
    }
}
