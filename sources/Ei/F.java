package ei;

import KJ.C15985a;
import KJ.C15987c;
import Lg.c;
import Oo.b;
import Op.h1;
import TC.e;
import U0.C4889m;
import XH.C16807N;
import YH.C16877v;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ingka.ikea.core.model.product.CustomerBenefit;
import com.ingka.ikea.core.model.product.ProductLarge;
import gi.C9759n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import op.C11702m;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BQ\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lei/F;", "LLg/a;", "Lgi/n;", "Lkotlin/Function2;", "LOp/h1;", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "LXH/N;", "onSectionClicked", "Lkotlin/Function0;", "onExpandedClicked", "onShowMoreClicked", "Lkotlin/Function1;", "", "onLongClickArticleNumber", "<init>", "(LnI/p;LnI/a;LnI/a;LnI/l;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "LnI/p;", "c", "LnI/a;", "e", "LnI/l;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class F extends Lg.a<C9759n> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final p<h1, ProductLarge, C16807N> f72743b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17631a<C16807N> f72744c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C17631a<C16807N> f72745d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C17642l<String, C16807N> f72746e;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lei/F$a;", "LLg/c;", "Lgi/n;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lei/F;Landroidx/compose/ui/platform/ComposeView;)V", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "productLarge", "LKJ/c;", "LOp/h1;", "p", "(Lcom/ingka/ikea/core/model/product/ProductLarge;)LKJ/c;", "viewModel", "Lei/q;", "m", "(Lgi/n;)Lei/q;", "", "Lcom/ingka/ikea/core/model/product/CustomerBenefit;", "n", "(Lgi/n;)Ljava/util/List;", "", "o", "(Lgi/n;)Ljava/lang/String;", "", "q", "(Lgi/n;)Ljava/lang/Integer;", "LXH/N;", "l", "(Lgi/n;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<C9759n> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f72747h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ F f72748i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ei.F$a$a  reason: collision with other inner class name */
        static final class C1250a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C9759n f72749a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C9676q f72750b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C15987c<h1> f72751c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ F f72752d;

            C1250a(C9759n nVar, C9676q qVar, C15987c<? extends h1> cVar, F f10) {
                this.f72749a = nVar;
                this.f72750b = qVar;
                this.f72751c = cVar;
                this.f72752d = f10;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(F f10, C9759n nVar, h1 h1Var) {
                C17542s.j(h1Var, "section");
                f10.f72743b.invoke(h1Var, nVar.h());
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: nI.l} */
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
                    goto L_0x0082
                L_0x0010:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x001f
                    r0 = -1
                    java.lang.String r1 = "com.ingka.ikea.app.productinformationpage.v2.delegates.MoreInfoDelegate.ViewHolder.bind.<anonymous>.<anonymous> (MoreInfoDelegate.kt:55)"
                    r2 = 868015513(0x33bcdd99, float:8.7947406E-8)
                    U0.C4895p.S(r2, r12, r0, r1)
                L_0x001f:
                    gi.n r12 = r10.f72749a
                    java.lang.String r0 = r12.g()
                    gi.n r12 = r10.f72749a
                    boolean r1 = r12.i()
                    ei.q r2 = r10.f72750b
                    KJ.c<Op.h1> r3 = r10.f72751c
                    ei.F r12 = r10.f72752d
                    nI.a r4 = r12.f72744c
                    ei.F r12 = r10.f72752d
                    nI.a r5 = r12.f72745d
                    ei.F r12 = r10.f72752d
                    nI.l r6 = r12.f72746e
                    r12 = 66144976(0x3f14ad0, float:1.4181883E-36)
                    r11.W(r12)
                    ei.F r12 = r10.f72752d
                    boolean r12 = r11.V(r12)
                    gi.n r7 = r10.f72749a
                    boolean r7 = r11.F(r7)
                    r12 = r12 | r7
                    ei.F r7 = r10.f72752d
                    gi.n r8 = r10.f72749a
                    java.lang.Object r9 = r11.D()
                    if (r12 != 0) goto L_0x0066
                    U0.m$a r12 = U0.C4889m.f14007a
                    java.lang.Object r12 = r12.a()
                    if (r9 != r12) goto L_0x006e
                L_0x0066:
                    ei.E r9 = new ei.E
                    r9.<init>(r7, r8)
                    r11.u(r9)
                L_0x006e:
                    r7 = r9
                    nI.l r7 = (nI.C17642l) r7
                    r11.P()
                    r9 = 0
                    r8 = r11
                    ci.G.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    boolean r11 = U0.C4895p.J()
                    if (r11 == 0) goto L_0x0082
                    U0.C4895p.R()
                L_0x0082:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ei.F.a.C1250a.b(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(F f10, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f72748i = f10;
            this.f72747h = composeView;
        }

        private final C9676q m(C9759n nVar) {
            return new C9676q(n(nVar), q(nVar), o(nVar));
        }

        private final List<CustomerBenefit> n(C9759n nVar) {
            List<CustomerBenefit> d10 = nVar.h().m().d();
            return (nVar.j() || d10.size() <= 2) ? d10 : d10.subList(0, 2);
        }

        private final String o(C9759n nVar) {
            List<CustomerBenefit> d10 = nVar.h().m().d();
            if (nVar.j() || d10.size() <= 2) {
                return nVar.h().m().h();
            }
            return null;
        }

        private final C15987c<h1> p(ProductLarge productLarge) {
            List c10 = C16877v.c();
            if (C11702m.b(productLarge)) {
                c10.add(h1.GOOD_TO_KNOW);
            }
            if (C11702m.a(productLarge)) {
                c10.add(h1.ASSEMBLY_AND_DOCUMENTS);
            }
            if (C11702m.c(productLarge)) {
                c10.add(h1.MATERIALS_AND_CARE);
            }
            if (C11702m.d(productLarge)) {
                c10.add(h1.SAFETY_AND_COMPLIANCE);
            }
            if (C11702m.e(productLarge)) {
                c10.add(h1.TECHNICAL_INFORMATION);
            }
            return C15985a.l(C16877v.a(c10));
        }

        private final Integer q(C9759n nVar) {
            if (nVar.h().m().d().size() <= 2) {
                return null;
            }
            return nVar.j() ? Integer.valueOf(b.f84664h9) : Integer.valueOf(b.f84675i9);
        }

        /* renamed from: l */
        public void c(C9759n nVar) {
            C17542s.j(nVar, "viewModel");
            super.c(nVar);
            e.l(this.f72747h, false, c1.c.c(868015513, true, new C1250a(nVar, m(nVar), p(nVar.h()), this.f72748i)), 1, (Object) null);
        }
    }

    public F(p<? super h1, ? super ProductLarge, C16807N> pVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17642l<? super String, C16807N> lVar) {
        C17542s.j(pVar, "onSectionClicked");
        C17542s.j(aVar, "onExpandedClicked");
        C17542s.j(aVar2, "onShowMoreClicked");
        C17542s.j(lVar, "onLongClickArticleNumber");
        this.f72743b = pVar;
        this.f72744c = aVar;
        this.f72745d = aVar2;
        this.f72746e = lVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C9759n;
    }

    public c<C9759n> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
