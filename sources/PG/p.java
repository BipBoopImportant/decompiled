package pg;

import Lg.c;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import og.C10127a;
import og.C10128b;
import qg.t;
import sg.m;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00060\u000eR\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpg/p;", "LLg/a;", "Lqg/t;", "Lsg/m;", "urlHandler", "<init>", "(Lsg/m;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lpg/p$a;", "f", "(Landroid/view/ViewGroup;)Lpg/p$a;", "b", "Lsg/m;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends Lg.a<t> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final m f75930b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lpg/p$a;", "LLg/c;", "Lqg/t;", "Landroid/view/View;", "itemView", "<init>", "(Lpg/p;Landroid/view/View;)V", "viewModel", "LXH/N;", "l", "(Lqg/t;)V", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "label", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<t> {

        /* renamed from: h  reason: collision with root package name */
        private final TextView f75931h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p f75932i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar, View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            this.f75932i = pVar;
            View findViewById = view.findViewById(C10127a.f75736d);
            C17542s.i(findViewById, "findViewById(...)");
            this.f75931h = (TextView) findViewById;
        }

        /* renamed from: l */
        public void c(t tVar) {
            C17542s.j(tVar, "viewModel");
            super.c(tVar);
            this.f75931h.setMovementMethod(LinkMovementMethod.getInstance());
            this.f75931h.setText(C10154h.f75903a.a(this.f75932i.f75930b, tVar.x(), tVar.y(), tVar.w()));
        }
    }

    public p(m mVar) {
        C17542s.j(mVar, "urlHandler");
        this.f75930b = mVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof t;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, C10128b.f75743d, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(this, c10);
    }
}
