package ho;

import Lg.c;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import Yn.i0;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lho/j;", "LLg/a;", "Lho/i;", "Lkotlin/Function0;", "LXH/N;", "onPostalCodeClicked", "<init>", "(LnI/a;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "LnI/a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends Lg.a<i> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17631a<C16807N> f98130b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lho/j$a;", "LLg/c;", "Lho/i;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lho/j;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(Lho/i;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<i> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f98131h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ j f98132i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ho.j$a$a  reason: collision with other inner class name */
        static final class C2207a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f98133a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ j f98134b;

            C2207a(i iVar, j jVar) {
                this.f98133a = iVar;
                this.f98134b = jVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(600128441, i10, -1, "com.ingka.ikea.checkout.impl.delivery.delegates.PostalCodeInfoDelegate.ViewHolder.bind.<anonymous>.<anonymous> (PostalCodeInfoDelegate.kt:38)");
                    }
                    i0.b(this.f98133a.a(), this.f98134b.f98130b, mVar, 0);
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
        public a(j jVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f98132i = jVar;
            this.f98131h = composeView;
        }

        /* renamed from: l */
        public void c(i iVar) {
            C17542s.j(iVar, "viewModel");
            super.c(iVar);
            e.l(this.f98131h, false, c1.c.c(600128441, true, new C2207a(iVar, this.f98132i)), 1, (Object) null);
        }
    }

    public j(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "onPostalCodeClicked");
        this.f98130b = aVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof i;
    }

    public c<i> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
