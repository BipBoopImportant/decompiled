package Fp;

import Dp.j;
import Dp.k;
import Lg.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00060\fR\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LFp/a;", "LLg/a;", "LFp/e;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LFp/a$a;", "e", "(Landroid/view/ViewGroup;)LFp/a$a;", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends Lg.a<e> {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LFp/a$a;", "LLg/c;", "LFp/e;", "Landroid/view/View;", "itemView", "<init>", "(LFp/a;Landroid/view/View;)V", "viewModel", "LXH/N;", "l", "(LFp/e;)V", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "titleView", "i", "messageView", "Landroid/widget/ImageView;", "j", "Landroid/widget/ImageView;", "imageView", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fp.a$a  reason: collision with other inner class name */
    public final class C1567a extends c<e> {

        /* renamed from: h  reason: collision with root package name */
        private final TextView f81000h;

        /* renamed from: i  reason: collision with root package name */
        private final TextView f81001i;

        /* renamed from: j  reason: collision with root package name */
        private final ImageView f81002j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ a f81003k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1567a(a aVar, View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            this.f81003k = aVar;
            View findViewById = view.findViewById(j.f80132d);
            C17542s.i(findViewById, "findViewById(...)");
            this.f81000h = (TextView) findViewById;
            View findViewById2 = view.findViewById(j.f80131c);
            C17542s.i(findViewById2, "findViewById(...)");
            this.f81001i = (TextView) findViewById2;
            View findViewById3 = view.findViewById(j.f80130b);
            C17542s.i(findViewById3, "findViewById(...)");
            this.f81002j = (ImageView) findViewById3;
        }

        /* renamed from: l */
        public void c(e eVar) {
            C17542s.j(eVar, "viewModel");
            super.c(eVar);
            this.f81000h.setText(eVar.c());
            this.f81001i.setText(eVar.b());
            this.f81002j.setImageResource(eVar.a());
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof e;
    }

    /* renamed from: e */
    public C1567a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, k.f80138b, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new C1567a(this, c10);
    }
}
