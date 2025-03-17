package pg;

import android.view.View;
import android.view.ViewGroup;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import og.C10128b;
import qg.l;
import qg.x;
import sg.g;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00060\u000eR\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpg/k;", "LLg/a;", "Lqg/l;", "Lsg/g;", "formController", "<init>", "(Lsg/g;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lpg/k$a;", "f", "(Landroid/view/ViewGroup;)Lpg/k$a;", "b", "Lsg/g;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends Lg.a<l> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g f75912b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lpg/k$a;", "Lpg/G;", "Lqg/l;", "Landroid/view/View;", "itemView", "<init>", "(Lpg/k;Landroid/view/View;)V", "LXH/N;", "A", "()V", "view", "", "hasFocus", "x", "(Landroid/view/View;Z)V", "", "s", "()I", "imeAction", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends G<l> {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ k f75913i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(k kVar, View view) {
            super(view);
            C17542s.j(view, "itemView");
            this.f75913i = kVar;
        }

        public void A() {
            this.f75913i.f75912b.f0();
        }

        public int s() {
            return this.f75913i.f75912b.h0(getBindingAdapterPosition());
        }

        public void x(View view, boolean z10) {
            C17542s.j(view, "view");
            if (z10) {
                g.a.c(this.f75913i.f75912b, getBindingAdapterPosition(), false, 2, (Object) null);
                t().setImeOptions(this.f75913i.f75912b.h0(getBindingAdapterPosition()));
                return;
            }
            this.f75913i.f75912b.i0(getBindingAdapterPosition());
            ((l) g()).c();
            w((x) g());
        }
    }

    public k(g gVar) {
        C17542s.j(gVar, "formController");
        this.f75912b = gVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof l;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, C10128b.f75744e, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(this, c10);
    }
}
