package ei;

import Lg.c;
import TC.e;
import Th.d;
import U0.C4889m;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ingka.ikea.core.model.product.WarningMoreInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001d\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00060\u0010R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lei/l0;", "LLg/a;", "LTh/d;", "Lkotlin/Function1;", "Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "LXH/N;", "onClicked", "<init>", "(LnI/l;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lei/l0$a;", "f", "(Landroid/view/ViewGroup;)Lei/l0$a;", "b", "LnI/l;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 extends Lg.a<d> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<WarningMoreInfo, C16807N> f72886b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lei/l0$a;", "LLg/c;", "LTh/d;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lei/l0;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LTh/d;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<d> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f72887h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ l0 f72888i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ei.l0$a$a  reason: collision with other inner class name */
        static final class C1265a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f72889a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l0 f72890b;

            C1265a(d dVar, l0 l0Var) {
                this.f72889a = dVar;
                this.f72890b = l0Var;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(l0 l0Var, WarningMoreInfo warningMoreInfo) {
                l0Var.f72886b.invoke(warningMoreInfo);
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(U0.C4889m r9, int r10) {
                /*
                    r8 = this;
                    r0 = r10 & 3
                    r1 = 2
                    if (r0 != r1) goto L_0x0011
                    boolean r0 = r9.l()
                    if (r0 != 0) goto L_0x000c
                    goto L_0x0011
                L_0x000c:
                    r9.L()
                    goto L_0x009a
                L_0x0011:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x0020
                    r0 = -1
                    java.lang.String r1 = "com.ingka.ikea.app.productinformationpage.v2.delegates.WarningDelegate.ViewHolder.bind.<anonymous>.<anonymous> (WarningDelegate.kt:41)"
                    r2 = -298039230(0xffffffffee3c4842, float:-1.4567634E28)
                    U0.C4895p.S(r2, r10, r0, r1)
                L_0x0020:
                    Th.d r10 = r8.f72889a
                    com.ingka.ikea.core.model.product.Warning r10 = r10.a()
                    com.ingka.ikea.core.model.product.WarningMoreInfo r10 = r10.d()
                    r0 = 194895683(0xb9ddf43, float:6.081013E-32)
                    r9.W(r0)
                    if (r10 == 0) goto L_0x006d
                    androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                    r0 = 194897676(0xb9de70c, float:6.082184E-32)
                    r9.W(r0)
                    ei.l0 r0 = r8.f72890b
                    boolean r0 = r9.V(r0)
                    boolean r2 = r9.F(r10)
                    r0 = r0 | r2
                    ei.l0 r2 = r8.f72890b
                    java.lang.Object r3 = r9.D()
                    if (r0 != 0) goto L_0x0055
                    U0.m$a r0 = U0.C4889m.f14007a
                    java.lang.Object r0 = r0.a()
                    if (r3 != r0) goto L_0x005d
                L_0x0055:
                    ei.k0 r3 = new ei.k0
                    r3.<init>(r2, r10)
                    r9.u(r3)
                L_0x005d:
                    r5 = r3
                    nI.a r5 = (nI.C17631a) r5
                    r9.P()
                    r6 = 7
                    r7 = 0
                    r2 = 0
                    r3 = 0
                    r4 = 0
                    androidx.compose.ui.d r10 = androidx.compose.foundation.d.d(r1, r2, r3, r4, r5, r6, r7)
                    goto L_0x006f
                L_0x006d:
                    androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
                L_0x006f:
                    r9.P()
                    Th.d r0 = r8.f72889a
                    com.ingka.ikea.core.model.product.Warning r0 = r0.a()
                    r1 = 0
                    r2 = 1
                    r3 = 0
                    androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.h(r10, r1, r2, r3)
                    androidx.compose.ui.d r10 = TC.e.i(r10)
                    r4 = 4
                    float r4 = (float) r4
                    float r4 = c2.h.B(r4)
                    androidx.compose.ui.d r10 = androidx.compose.foundation.layout.D.k(r10, r1, r4, r2, r3)
                    r1 = 0
                    ci.S.b(r0, r10, r9, r1, r1)
                    boolean r9 = U0.C4895p.J()
                    if (r9 == 0) goto L_0x009a
                    U0.C4895p.R()
                L_0x009a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ei.l0.a.C1265a.b(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l0 l0Var, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f72888i = l0Var;
            this.f72887h = composeView;
        }

        /* renamed from: l */
        public void c(d dVar) {
            C17542s.j(dVar, "viewModel");
            super.c(dVar);
            e.l(this.f72887h, false, c1.c.c(-298039230, true, new C1265a(dVar, this.f72888i)), 1, (Object) null);
        }
    }

    public l0(C17642l<? super WarningMoreInfo, C16807N> lVar) {
        C17542s.j(lVar, "onClicked");
        this.f72886b = lVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof d;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
