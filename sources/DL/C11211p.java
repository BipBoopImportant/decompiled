package dl;

import Lg.c;
import Xo.e;
import al.C11068b;
import android.view.View;
import android.view.ViewGroup;
import ip.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldl/p;", "LLg/a;", "Ldl/o;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Ldl/p$a;", "e", "(Landroid/view/ViewGroup;)Ldl/p$a;", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dl.p  reason: case insensitive filesystem */
public final class C11211p extends Lg.a<C11210o> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ldl/p$a;", "LLg/c;", "Ldl/o;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "viewModel", "LXH/N;", "l", "(Ldl/o;)V", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dl.p$a */
    public static final class a extends c<C11210o> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view, false);
            C17542s.j(view, "itemView");
        }

        /* renamed from: l */
        public void c(C11210o oVar) {
            C17542s.j(oVar, "viewModel");
            super.c(oVar);
            View view = this.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = h.a(e.a(oVar.a()));
            view.setLayoutParams(layoutParams);
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C11210o;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = jp.h.c(viewGroup, C11068b.f90323k, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(c10);
    }
}
