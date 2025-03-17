package Fy;

import Jy.l;
import Lg.c;
import SC.C13643u0;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import tK.C18030v;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00060\fR\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LFy/g;", "LLg/a;", "LJy/l;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LFy/g$a;", "e", "(Landroid/view/ViewGroup;)LFy/g$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends Lg.a<l> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LFy/g$a;", "LLg/c;", "LJy/l;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(LFy/g;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LJy/l;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<l> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f110008h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g f110009i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fy.g$a$a  reason: collision with other inner class name */
        static final class C2635a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f110010a;

            C2635a(l lVar) {
                this.f110010a = lVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1734175503, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.delegate.DividerDelegate.ViewHolder.bind.<anonymous>.<anonymous> (DividerDelegate.kt:29)");
                    }
                    C13643u0.c((d) null, h.B((float) this.f110010a.g()), C18030v.f147664a.a(mVar, C18030v.f147665b).l0(), mVar, 0, 1);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f110009i = gVar;
            this.f110008h = composeView;
        }

        /* renamed from: l */
        public void c(l lVar) {
            C17542s.j(lVar, "viewModel");
            ComposeView composeView = this.f110008h;
            super.c(lVar);
            e.l(composeView, false, c1.c.c(1734175503, true, new C2635a(lVar)), 1, (Object) null);
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof l;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
