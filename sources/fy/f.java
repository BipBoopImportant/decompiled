package Fy;

import Dy.q0;
import Jy.k;
import Lg.c;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00060\u000fR\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LFy/f;", "LLg/a;", "LJy/k;", "Lkotlin/Function0;", "LXH/N;", "onItemClick", "<init>", "(LnI/a;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LFy/f$a;", "f", "(Landroid/view/ViewGroup;)LFy/f$a;", "b", "LnI/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends Lg.a<k> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17631a<C16807N> f110003b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LFy/f$a;", "LLg/c;", "LJy/k;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(LFy/f;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LJy/k;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<k> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f110004h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ f f110005i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fy.f$a$a  reason: collision with other inner class name */
        static final class C2634a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f110006a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f110007b;

            C2634a(k kVar, f fVar) {
                this.f110006a = kVar;
                this.f110007b = fVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1112777649, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.delegate.DiscountRowDelegate.ViewHolder.bind.<anonymous>.<anonymous> (DiscountRowDelegate.kt:26)");
                    }
                    q0.b(this.f110006a, this.f110007b.f110003b, mVar, 0);
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
        public a(f fVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f110005i = fVar;
            this.f110004h = composeView;
        }

        /* renamed from: l */
        public void c(k kVar) {
            C17542s.j(kVar, "viewModel");
            ComposeView composeView = this.f110004h;
            f fVar = this.f110005i;
            super.c(kVar);
            e.l(composeView, false, c1.c.c(-1112777649, true, new C2634a(kVar, fVar)), 1, (Object) null);
        }
    }

    public f(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "onItemClick");
        this.f110003b = aVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof k;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
