package ho;

import IC.C13021c;
import Lg.c;
import N1.C4669d;
import N1.D;
import N1.G;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.C4889m;
import U0.C4895p;
import U1.e;
import XH.C16807N;
import Y1.k;
import Y1.o;
import Yn.P;
import Yn.o0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import nI.p;
import p1.g1;
import qx.C14956a;
import r1.g;
import rv.C11849b;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lho/l;", "LLg/a;", "LYn/o0;", "LIl/a;", "appConfigApi", "Lkotlin/Function2;", "LYn/P;", "", "LXH/N;", "onClicked", "<init>", "(LIl/a;LnI/p;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "LIl/a;", "c", "LnI/p;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends Lg.a<o0> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Il.a f98137b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final p<P, Double, C16807N> f98138c;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lho/l$a;", "LLg/c;", "LYn/o0;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lho/l;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LN1/d;", "p", "(LYn/o0;LU0/m;I)LN1/d;", "", "lowestDeliveryPrice", "Lkp/d;", "currencyConfig", "n", "(DLkp/d;)LN1/d;", "", "hasMultipleLowestPrices", "", "overrideDeliveryDetailsString", "o", "(DZLjava/lang/String;Lkp/d;LU0/m;I)LN1/d;", "enabled", "q", "(Z)LN1/d;", "r", "(DLkp/d;)Ljava/lang/String;", "LXH/N;", "m", "(LYn/o0;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<o0> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f98139h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ l f98140i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ho.l$a$a  reason: collision with other inner class name */
        static final class C2208a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o0 f98141a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f98142b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ l f98143c;

            C2208a(o0 o0Var, a aVar, l lVar) {
                this.f98141a = o0Var;
                this.f98142b = aVar;
                this.f98143c = lVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(l lVar, o0 o0Var) {
                lVar.f98138c.invoke(o0Var.g(), o0Var.f());
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(U0.C4889m r11, int r12) {
                /*
                    r10 = this;
                    r0 = r12 & 3
                    r1 = 2
                    if (r0 != r1) goto L_0x0010
                    boolean r0 = r11.l()
                    if (r0 != 0) goto L_0x000c
                    goto L_0x0010
                L_0x000c:
                    r11.L()
                    goto L_0x0071
                L_0x0010:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x001f
                    r0 = -1
                    java.lang.String r1 = "com.ingka.ikea.checkout.impl.delivery.delegates.SelectDeliveryMethodDelegate.ViewHolder.bind.<anonymous>.<anonymous> (SelectDeliveryMethodDelegate.kt:51)"
                    r2 = 1356755557(0x50de7265, float:2.98563113E10)
                    U0.C4895p.S(r2, r12, r0, r1)
                L_0x001f:
                    Yn.o0 r3 = r10.f98141a
                    ho.l$a r12 = r10.f98142b
                    int r8 = IC.C13023e.f110931a
                    int r0 = androidx.compose.ui.platform.ComposeView.f19171k
                    int r0 = r0 << 3
                    r0 = r0 | r8
                    N1.d r4 = r12.p(r3, r11, r0)
                    r12 = -69590913(0xfffffffffbda207f, float:-2.2651596E36)
                    r11.W(r12)
                    ho.l r12 = r10.f98143c
                    boolean r12 = r11.F(r12)
                    Yn.o0 r0 = r10.f98141a
                    boolean r0 = r11.F(r0)
                    r12 = r12 | r0
                    ho.l r0 = r10.f98143c
                    Yn.o0 r1 = r10.f98141a
                    java.lang.Object r2 = r11.D()
                    if (r12 != 0) goto L_0x0053
                    U0.m$a r12 = U0.C4889m.f14007a
                    java.lang.Object r12 = r12.a()
                    if (r2 != r12) goto L_0x005b
                L_0x0053:
                    ho.k r2 = new ho.k
                    r2.<init>(r0, r1)
                    r11.u(r2)
                L_0x005b:
                    r5 = r2
                    nI.a r5 = (nI.C17631a) r5
                    r11.P()
                    r6 = 0
                    r9 = 8
                    r7 = r11
                    Yn.n0.b(r3, r4, r5, r6, r7, r8, r9)
                    boolean r11 = U0.C4895p.J()
                    if (r11 == 0) goto L_0x0071
                    U0.C4895p.R()
                L_0x0071:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ho.l.a.C2208a.b(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l lVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f98140i = lVar;
            this.f98139h = composeView;
        }

        private final C4669d n(double d10, C11522d dVar) {
            String r10 = r(d10, dVar);
            G g10 = r1;
            G g11 = new G(0, 0, C.f13316b.a(), (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (D) null, (g) null, 65531, (DefaultConstructorMarker) null);
            return C13021c.e(r10, r10, g10);
        }

        private final C4669d o(double d10, boolean z10, String str, C11522d dVar, C4889m mVar, int i10) {
            C4669d dVar2;
            mVar.W(-560863482);
            if (C4895p.J()) {
                C4895p.S(-560863482, i10, -1, "com.ingka.ikea.checkout.impl.delivery.delegates.SelectDeliveryMethodDelegate.ViewHolder.getDeliveryCostSpanned (SelectDeliveryMethodDelegate.kt:100)");
            }
            if (str != null || !z10) {
                dVar2 = n(d10, dVar);
            } else {
                String string = this.itemView.getResources().getString(C11849b.f102188G1, new Object[]{r(d10, dVar)});
                C17542s.i(string, "getString(...)");
                dVar2 = C13021c.b(string, mVar, 0);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return dVar2;
        }

        /* access modifiers changed from: private */
        public final C4669d p(o0 o0Var, C4889m mVar, int i10) {
            C4669d dVar;
            mVar.W(-1922801002);
            if (C4895p.J()) {
                C4895p.S(-1922801002, i10, -1, "com.ingka.ikea.checkout.impl.delivery.delegates.SelectDeliveryMethodDelegate.ViewHolder.getDeliveryText (SelectDeliveryMethodDelegate.kt:67)");
            }
            if (o0Var.f() != null) {
                dVar = o(o0Var.f().doubleValue(), o0Var.d(), o0Var.h(), this.f98140i.f98137b.s(), mVar, (ComposeView.f19171k << 12) | ((i10 << 9) & 57344));
            } else {
                dVar = q(o0Var.c());
            }
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return dVar;
        }

        private final C4669d q(boolean z10) {
            if (z10) {
                return null;
            }
            String string = this.itemView.getResources().getString(C11849b.f102192H1);
            C17542s.i(string, "getString(...)");
            return C13021c.e(string, string, new G(0, 0, (C) null, C4830x.c(C4830x.f13449b.a()), (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (D) null, (g) null, 65527, (DefaultConstructorMarker) null));
        }

        private final String r(double d10, C11522d dVar) {
            return C14956a.f130484a.b(d10, dVar);
        }

        /* renamed from: m */
        public void c(o0 o0Var) {
            C17542s.j(o0Var, "viewModel");
            super.c(o0Var);
            TC.e.l(this.f98139h, false, c1.c.c(1356755557, true, new C2208a(o0Var, this, this.f98140i)), 1, (Object) null);
        }
    }

    public l(Il.a aVar, p<? super P, ? super Double, C16807N> pVar) {
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(pVar, "onClicked");
        this.f98137b = aVar;
        this.f98138c = pVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof o0;
    }

    public c<o0> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
