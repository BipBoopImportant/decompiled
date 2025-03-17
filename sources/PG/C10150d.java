package pg;

import Lg.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import og.C10127a;
import og.C10128b;
import qg.C10193c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00060\fR\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpg/d;", "LLg/a;", "Lqg/c;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lpg/d$a;", "e", "(Landroid/view/ViewGroup;)Lpg/d$a;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pg.d  reason: case insensitive filesystem */
public final class C10150d extends Lg.a<C10193c> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lpg/d$a;", "LLg/c;", "Lqg/c;", "Landroid/view/View;", "itemView", "<init>", "(Lpg/d;Landroid/view/View;)V", "viewModel", "LXH/N;", "l", "(Lqg/c;)V", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "title", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pg.d$a */
    public final class a extends c<C10193c> {

        /* renamed from: h  reason: collision with root package name */
        private final TextView f75897h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C10150d f75898i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C10150d dVar, View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            this.f75898i = dVar;
            View findViewById = view.findViewById(C10127a.f75739g);
            C17542s.i(findViewById, "findViewById(...)");
            this.f75897h = (TextView) findViewById;
        }

        /* renamed from: l */
        public void c(C10193c cVar) {
            C17542s.j(cVar, "viewModel");
            super.c(cVar);
            this.f75897h.setText(cVar.x());
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C10193c;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, C10128b.f75745f, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(this, c10);
    }
}
