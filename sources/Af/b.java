package af;

import Lg.c;
import XH.C16807N;
import Xo.f;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import j.C5443a;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00060\u000fR\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Laf/b;", "LLg/a;", "Laf/c;", "Lkotlin/Function0;", "LXH/N;", "learnMoreClicked", "<init>", "(LnI/a;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Laf/b$a;", "f", "(Landroid/view/ViewGroup;)Laf/b$a;", "b", "LnI/a;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends Lg.a<c> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17631a<C16807N> f65283b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\n \f*\u0004\u0018\u00010\u00100\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\n \f*\u0004\u0018\u00010\u00100\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0017\u001a\n \f*\u0004\u0018\u00010\u00100\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0018"}, d2 = {"Laf/b$a;", "LLg/c;", "Laf/c;", "Landroid/view/View;", "itemView", "<init>", "(Laf/b;Landroid/view/View;)V", "viewModel", "LXH/N;", "m", "(Laf/c;)V", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "h", "Landroid/widget/ImageView;", "headerImage", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "title", "j", "body", "k", "learnMore", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<c> {

        /* renamed from: h  reason: collision with root package name */
        private final ImageView f65284h;

        /* renamed from: i  reason: collision with root package name */
        private final TextView f65285i;

        /* renamed from: j  reason: collision with root package name */
        private final TextView f65286j;

        /* renamed from: k  reason: collision with root package name */
        private final TextView f65287k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ b f65288l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            this.f65288l = bVar;
            this.f65284h = (ImageView) view.findViewById(We.a.f64695k);
            this.f65285i = (TextView) view.findViewById(We.a.f64706v);
            this.f65286j = (TextView) view.findViewById(We.a.f64689e);
            this.f65287k = (TextView) view.findViewById(We.a.f64697m);
        }

        /* access modifiers changed from: private */
        public static final void n(b bVar, View view) {
            bVar.f65283b.invoke();
        }

        /* renamed from: m */
        public void c(c cVar) {
            C17542s.j(cVar, "viewModel");
            super.c(cVar);
            this.f65284h.setImageDrawable(C5443a.b(this.itemView.getContext(), cVar.b()));
            this.f65285i.setText(cVar.d());
            this.f65286j.setText(cVar.a());
            if (cVar.c() == -1 || this.f65288l.f65283b == null) {
                this.f65287k.setVisibility(8);
                return;
            }
            TextView textView = this.f65287k;
            b bVar = this.f65288l;
            textView.setText(f.a(textView.getContext().getString(cVar.c())));
            textView.setOnClickListener(new C9413a(bVar));
            textView.setVisibility(0);
        }
    }

    public b(C17631a<C16807N> aVar) {
        this.f65283b = aVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof c;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, We.b.f64709b, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(this, c10);
    }
}
