package Vi;

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
import com.ingka.ikea.core.model.Link;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"LVi/Y;", "LLg/a;", "LVi/d0;", "Lkotlin/Function1;", "", "LXH/N;", "energyLabelClicked", "Lcom/ingka/ikea/core/model/Link;", "onLinkClicked", "<init>", "(LnI/l;LnI/l;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "LnI/l;", "c", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Y extends Lg.a<d0> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<String, C16807N> f88533b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17642l<Link, C16807N> f88534c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LVi/Y$a;", "LLg/c;", "LVi/d0;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(LVi/Y;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LVi/d0;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<d0> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f88535h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Y f88536i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Vi.Y$a$a  reason: collision with other inner class name */
        static final class C1869a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d0 f88537a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Y f88538b;

            C1869a(d0 d0Var, Y y10) {
                this.f88537a = d0Var;
                this.f88538b = y10;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(779035577, i10, -1, "com.ingka.ikea.app.scanandgoonlineredesign.adapter.delegate.PricePackageWithStockDelegate.PricePackageDelegateViewHolder.bind.<anonymous>.<anonymous> (PricePackageWithStockDelegate.kt:87)");
                    }
                    c0.d(this.f88537a, this.f88538b.f88533b, this.f88538b.f88534c, mVar, 0);
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
        public a(Y y10, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f88536i = y10;
            this.f88535h = composeView;
        }

        /* renamed from: l */
        public void c(d0 d0Var) {
            C17542s.j(d0Var, "viewModel");
            super.c(d0Var);
            e.l(this.f88535h, false, c1.c.c(779035577, true, new C1869a(d0Var, this.f88536i)), 1, (Object) null);
        }
    }

    public Y(C17642l<? super String, C16807N> lVar, C17642l<? super Link, C16807N> lVar2) {
        C17542s.j(lVar, "energyLabelClicked");
        C17542s.j(lVar2, "onLinkClicked");
        this.f88533b = lVar;
        this.f88534c = lVar2;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof d0;
    }

    public c<d0> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
