package yo;

import Lg.c;
import TC.e;
import U0.C4889m;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lyo/d;", "LLg/a;", "Lyo/e;", "Lkotlin/Function1;", "", "LXH/N;", "onEditClicked", "<init>", "(LnI/l;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "LnI/l;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends Lg.a<e> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<String, C16807N> f107193b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lyo/d$a;", "LLg/c;", "Lyo/e;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lyo/d;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(Lyo/e;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<e> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f107194h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ d f107195i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yo.d$a$a  reason: collision with other inner class name */
        static final class C2550a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f107196a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f107197b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f107198c;

            C2550a(e eVar, d dVar, a aVar) {
                this.f107196a = eVar;
                this.f107197b = dVar;
                this.f107198c = aVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(d dVar, a aVar) {
                dVar.f107193b.invoke(((e) aVar.g()).b());
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(U0.C4889m r12, int r13) {
                /*
                    r11 = this;
                    r0 = r13 & 3
                    r1 = 2
                    if (r0 != r1) goto L_0x0011
                    boolean r0 = r12.l()
                    if (r0 != 0) goto L_0x000c
                    goto L_0x0011
                L_0x000c:
                    r12.L()
                    goto L_0x008e
                L_0x0011:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x0020
                    r0 = -1
                    java.lang.String r1 = "com.ingka.ikea.checkout.impl.userdetails.delegates.CollapsedContainerDelegate.ViewHolder.bind.<anonymous>.<anonymous> (CollapsedContainerDelegate.kt:49)"
                    r2 = -410348160(0xffffffffe78a9580, float:-1.3088887E24)
                    U0.C4895p.S(r2, r13, r0, r1)
                L_0x0020:
                    androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
                    r0 = 16
                    float r0 = (float) r0
                    float r0 = c2.h.B(r0)
                    r1 = 1
                    r2 = 0
                    r3 = 0
                    androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.k(r13, r3, r0, r1, r2)
                    Yn.i r13 = new Yn.i
                    yo.e r0 = r11.f107196a
                    java.lang.String r0 = r0.c()
                    yo.e r1 = r11.f107196a
                    java.util.List r1 = r1.a()
                    r13.<init>(r0, r1)
                    Yn.i[] r13 = new Yn.C10994i[]{r13}
                    KJ.f r4 = KJ.C15985a.b(r13)
                    SC.g1 r6 = SC.C13589g1.Large
                    r13 = -845181341(0xffffffffcd9f8e63, float:-3.346136E8)
                    r12.W(r13)
                    yo.d r13 = r11.f107197b
                    boolean r13 = r12.V(r13)
                    yo.d$a r0 = r11.f107198c
                    boolean r0 = r12.F(r0)
                    r13 = r13 | r0
                    yo.d r0 = r11.f107197b
                    yo.d$a r1 = r11.f107198c
                    java.lang.Object r2 = r12.D()
                    if (r13 != 0) goto L_0x0070
                    U0.m$a r13 = U0.C4889m.f14007a
                    java.lang.Object r13 = r13.a()
                    if (r2 != r13) goto L_0x0078
                L_0x0070:
                    yo.c r2 = new yo.c
                    r2.<init>(r0, r1)
                    r12.u(r2)
                L_0x0078:
                    r5 = r2
                    nI.a r5 = (nI.C17631a) r5
                    r12.P()
                    r9 = 3456(0xd80, float:4.843E-42)
                    r10 = 0
                    r8 = r12
                    Yn.C10993h.b(r4, r5, r6, r7, r8, r9, r10)
                    boolean r12 = U0.C4895p.J()
                    if (r12 == 0) goto L_0x008e
                    U0.C4895p.R()
                L_0x008e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: yo.d.a.C2550a.b(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f107195i = dVar;
            this.f107194h = composeView;
        }

        /* renamed from: l */
        public void c(e eVar) {
            C17542s.j(eVar, "viewModel");
            super.c(eVar);
            e.l(this.f107194h, false, c1.c.c(-410348160, true, new C2550a(eVar, this.f107195i, this)), 1, (Object) null);
        }
    }

    public d(C17642l<? super String, C16807N> lVar) {
        C17542s.j(lVar, "onEditClicked");
        this.f107193b = lVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof e;
    }

    public c<e> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
