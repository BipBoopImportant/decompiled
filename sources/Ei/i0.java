package ei;

import HJ.C15854t;
import Lg.c;
import U0.C4889m;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ingka.ikea.core.model.Link;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import s0.C5861g;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lei/i0;", "LLg/a;", "Lei/j0;", "Lkotlin/Function1;", "", "LXH/N;", "onEnergyLabelClicked", "Lcom/ingka/ikea/core/model/Link;", "onLinkClicked", "<init>", "(LnI/l;LnI/l;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "LnI/l;", "e", "()LnI/l;", "c", "f", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 extends Lg.a<j0> {

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<String, C16807N> f72864b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<Link, C16807N> f72865c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lei/i0$a;", "LLg/c;", "Lei/j0;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lei/i0;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(Lei/j0;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<j0> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f72866h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ i0 f72867i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ei.i0$a$a  reason: collision with other inner class name */
        static final class C1262a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j0 f72868a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ i0 f72869b;

            C1262a(j0 j0Var, i0 i0Var) {
                this.f72868a = j0Var;
                this.f72869b = i0Var;
            }

            /* access modifiers changed from: private */
            public static final C16807N e(i0 i0Var, j0 j0Var) {
                i0Var.e().invoke(j0Var.d());
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N f(C5861g gVar, String str) {
                C17542s.j(str, "<unused var>");
                IllegalStateException illegalStateException = new IllegalStateException("We should not get color info on the PIP");
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar : arrayList) {
                    if (str2 == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            break;
                        }
                        str2 = C11820c.a(a10);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        String name = gVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str5 = str3;
                    bVar.a(eVar, str5, false, illegalStateException, str4);
                    str2 = str4;
                    str3 = str5;
                }
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c(U0.C4889m r20, int r21) {
                /*
                    r19 = this;
                    r0 = r19
                    r11 = r20
                    r1 = r21
                    r2 = r1 & 3
                    r3 = 2
                    if (r2 != r3) goto L_0x0017
                    boolean r2 = r20.l()
                    if (r2 != 0) goto L_0x0012
                    goto L_0x0017
                L_0x0012:
                    r20.L()
                    goto L_0x0173
                L_0x0017:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x0026
                    r2 = -1
                    java.lang.String r3 = "com.ingka.ikea.app.productinformationpage.v2.delegates.SkapaPricePackageDelegate.ViewHolder.bind.<anonymous>.<anonymous> (SkapaPricePackageDelegate.kt:55)"
                    r4 = -939023065(0xffffffffc807a527, float:-138900.61)
                    U0.C4895p.S(r4, r1, r2, r3)
                L_0x0026:
                    androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
                    androidx.compose.ui.d r1 = TC.e.i(r12)
                    ei.j0 r10 = r0.f72868a
                    ei.i0 r13 = r0.f72869b
                    androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
                    androidx.compose.foundation.layout.d$m r2 = r2.g()
                    i1.c$a r3 = i1.C5437c.f24302a
                    i1.c$b r3 = r3.k()
                    r4 = 0
                    E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r3, r11, r4)
                    int r3 = U0.C4883j.a(r11, r4)
                    U0.y r4 = r20.s()
                    androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r11, r1)
                    G1.g$a r5 = G1.C4504g.f6515W
                    nI.a r6 = r5.a()
                    U0.f r7 = r20.m()
                    if (r7 != 0) goto L_0x005c
                    U0.C4883j.c()
                L_0x005c:
                    r20.I()
                    boolean r7 = r20.i()
                    if (r7 == 0) goto L_0x0069
                    r11.p(r6)
                    goto L_0x006c
                L_0x0069:
                    r20.t()
                L_0x006c:
                    U0.m r6 = U0.F1.a(r20)
                    nI.p r7 = r5.c()
                    U0.F1.c(r6, r2, r7)
                    nI.p r2 = r5.e()
                    U0.F1.c(r6, r4, r2)
                    nI.p r2 = r5.b()
                    boolean r4 = r6.i()
                    if (r4 != 0) goto L_0x0096
                    java.lang.Object r4 = r6.D()
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
                    if (r4 != 0) goto L_0x00a4
                L_0x0096:
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                    r6.u(r4)
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r6.w(r3, r2)
                L_0x00a4:
                    nI.p r2 = r5.d()
                    U0.F1.c(r6, r1, r2)
                    s0.h r15 = s0.C5862h.f28810a
                    Op.d$h r1 = r10.c()
                    Op.i1 r2 = new Op.i1
                    kp.d r3 = r10.a()
                    r2.<init>(r3)
                    SC.Q1$b r14 = new SC.Q1$b
                    SC.P1 r5 = SC.P1.Medium
                    r8 = 4
                    r9 = 0
                    r6 = 0
                    r7 = 0
                    r4 = r14
                    r4.<init>(r5, r6, r7, r8, r9)
                    boolean r3 = r10.b()
                    r4 = -516973951(0xffffffffe12f9a81, float:-2.0245709E20)
                    r11.W(r4)
                    boolean r4 = r11.V(r13)
                    boolean r5 = r11.F(r10)
                    r4 = r4 | r5
                    java.lang.Object r5 = r20.D()
                    if (r4 != 0) goto L_0x00e7
                    U0.m$a r4 = U0.C4889m.f14007a
                    java.lang.Object r4 = r4.a()
                    if (r5 != r4) goto L_0x00ef
                L_0x00e7:
                    ei.g0 r5 = new ei.g0
                    r5.<init>(r13, r10)
                    r11.u(r5)
                L_0x00ef:
                    r4 = r5
                    nI.a r4 = (nI.C17631a) r4
                    r20.P()
                    int r5 = SC.Q1.b.f115896e
                    int r8 = r5 << 15
                    r9 = 16
                    r5 = 0
                    r6 = r14
                    r7 = r20
                    Op.F.g(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    r1 = -516957574(0xffffffffe12fda7a, float:-2.027452E20)
                    r11.W(r1)
                    KJ.c r1 = r10.e()
                    boolean r1 = r1.isEmpty()
                    if (r1 != 0) goto L_0x0164
                    java.lang.String r1 = r10.d()
                    KJ.c r2 = r10.e()
                    nI.l r4 = r13.f()
                    r3 = 8
                    float r3 = (float) r3
                    float r14 = c2.h.B(r3)
                    r17 = 13
                    r18 = 0
                    r13 = 0
                    r3 = 0
                    r16 = 0
                    r5 = r15
                    r15 = r3
                    androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r12, r13, r14, r15, r16, r17, r18)
                    Op.d$h r3 = r10.c()
                    java.lang.String r6 = r3.k()
                    r3 = -516948840(0xffffffffe12ffc98, float:-2.0289884E20)
                    r11.W(r3)
                    java.lang.Object r3 = r20.D()
                    U0.m$a r8 = U0.C4889m.f14007a
                    java.lang.Object r8 = r8.a()
                    if (r3 != r8) goto L_0x0155
                    ei.h0 r3 = new ei.h0
                    r3.<init>(r5)
                    r11.u(r3)
                L_0x0155:
                    nI.l r3 = (nI.C17642l) r3
                    r20.P()
                    r9 = 1597440(0x186000, float:2.23849E-39)
                    r10 = 0
                    r5 = 0
                    r8 = r20
                    Op.C10848n.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                L_0x0164:
                    r20.P()
                    r20.x()
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x0173
                    U0.C4895p.R()
                L_0x0173:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ei.i0.a.C1262a.c(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                c((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i0 i0Var, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f72867i = i0Var;
            this.f72866h = composeView;
        }

        /* renamed from: l */
        public void c(j0 j0Var) {
            C17542s.j(j0Var, "viewModel");
            super.c(j0Var);
            TC.e.l(this.f72866h, false, c1.c.c(-939023065, true, new C1262a(j0Var, this.f72867i)), 1, (Object) null);
        }
    }

    public i0(C17642l<? super String, C16807N> lVar, C17642l<? super Link, C16807N> lVar2) {
        C17542s.j(lVar, "onEnergyLabelClicked");
        C17542s.j(lVar2, "onLinkClicked");
        this.f72864b = lVar;
        this.f72865c = lVar2;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof j0;
    }

    public c<j0> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }

    public final C17642l<String, C16807N> e() {
        return this.f72864b;
    }

    public final C17642l<Link, C16807N> f() {
        return this.f72865c;
    }
}
