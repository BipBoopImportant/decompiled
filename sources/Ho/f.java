package ho;

import Do.a;
import HJ.C15854t;
import IC.C13020b;
import IC.C13023e;
import IC.C13026h;
import Lg.c;
import Nn.C10812o;
import Nn.Q;
import U0.C4889m;
import Wn.b;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import Yn.Y;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.sugarcube.core.logger.DslKt;
import ho.b;
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
import qx.C14956a;
import rv.C11848a;
import rv.C11849b;
import s0.C5861g;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010*¨\u0006+"}, d2 = {"Lho/f;", "LLg/a;", "Lho/c;", "LIl/a;", "appConfigApi", "LWn/b;", "checkoutAnalytics", "Lkotlin/Function1;", "Lho/b;", "LXH/N;", "onDeliveryOptionSelected", "<init>", "(LIl/a;LWn/b;LnI/l;)V", "LDo/a;", "checkoutStep", "", "l", "(Lho/b;LDo/a;)Z", "viewModel", "LYn/Y;", "j", "(Lho/b;Lho/c;)LYn/Y;", "LIC/e;", "k", "(Lho/b;)LIC/e;", "showDeliveryPriceExclVat", "LYn/Y$a;", "i", "(Lho/b;Z)LYn/Y$a;", "", "item", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "LIl/a;", "c", "LWn/b;", "LnI/l;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends Lg.a<c> {

    /* renamed from: b  reason: collision with root package name */
    private final Il.a f98121b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final b f98122c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C17642l<b, C16807N> f98123d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lho/f$a;", "LLg/c;", "Lho/c;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lho/f;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(Lho/c;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<c> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f98124h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ f f98125i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ho.f$a$a  reason: collision with other inner class name */
        static final class C2206a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f98126a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f98127b;

            C2206a(c cVar, f fVar) {
                this.f98126a = cVar;
                this.f98127b = fVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N e(f fVar, b bVar, c cVar, C5861g gVar) {
                if (fVar.l(bVar, cVar.b())) {
                    e eVar = e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar2 : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a("Selecting delivery option: " + bVar, (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = gVar.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar2.a(eVar, str4, false, (Throwable) null, str3);
                        str = str3;
                        str2 = str4;
                    }
                    fVar.f98123d.invoke(bVar);
                }
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N f(f fVar, b bVar) {
                fVar.f98122c.d(bVar);
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c(U0.C4889m r22, int r23) {
                /*
                    r21 = this;
                    r0 = r21
                    r8 = r22
                    r1 = r23
                    r2 = r1 & 3
                    r3 = 2
                    if (r2 != r3) goto L_0x0017
                    boolean r2 = r22.l()
                    if (r2 != 0) goto L_0x0012
                    goto L_0x0017
                L_0x0012:
                    r22.L()
                    goto L_0x0177
                L_0x0017:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x0026
                    r2 = -1
                    java.lang.String r3 = "com.ingka.ikea.checkout.impl.delivery.delegates.DeliveryOptionsDelegate.ViewHolder.bind.<anonymous>.<anonymous> (DeliveryOptionsDelegate.kt:63)"
                    r4 = 1513091275(0x5a2ff0cb, float:1.23807189E16)
                    U0.C4895p.S(r4, r1, r2, r3)
                L_0x0026:
                    androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                    r2 = 16
                    float r2 = (float) r2
                    float r2 = c2.h.B(r2)
                    androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.i(r1, r2)
                    ho.c r9 = r0.f98126a
                    ho.f r10 = r0.f98127b
                    androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
                    androidx.compose.foundation.layout.d$m r2 = r2.g()
                    i1.c$a r3 = i1.C5437c.f24302a
                    i1.c$b r3 = r3.k()
                    r4 = 0
                    E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r3, r8, r4)
                    int r3 = U0.C4883j.a(r8, r4)
                    U0.y r5 = r22.s()
                    androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r8, r1)
                    G1.g$a r6 = G1.C4504g.f6515W
                    nI.a r7 = r6.a()
                    U0.f r11 = r22.m()
                    if (r11 != 0) goto L_0x0063
                    U0.C4883j.c()
                L_0x0063:
                    r22.I()
                    boolean r11 = r22.i()
                    if (r11 == 0) goto L_0x0070
                    r8.p(r7)
                    goto L_0x0073
                L_0x0070:
                    r22.t()
                L_0x0073:
                    U0.m r7 = U0.F1.a(r22)
                    nI.p r11 = r6.c()
                    U0.F1.c(r7, r2, r11)
                    nI.p r2 = r6.e()
                    U0.F1.c(r7, r5, r2)
                    nI.p r2 = r6.b()
                    boolean r5 = r7.i()
                    if (r5 != 0) goto L_0x009d
                    java.lang.Object r5 = r7.D()
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
                    boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r11)
                    if (r5 != 0) goto L_0x00ab
                L_0x009d:
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                    r7.u(r5)
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r7.w(r3, r2)
                L_0x00ab:
                    nI.p r2 = r6.d()
                    U0.F1.c(r7, r1, r2)
                    s0.h r11 = s0.C5862h.f28810a
                    java.util.List r1 = r9.a()
                    r2 = 341249464(0x14570db8, float:1.08574316E-26)
                    r8.W(r2)
                    if (r1 != 0) goto L_0x00c2
                    goto L_0x0168
                L_0x00c2:
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.Iterator r12 = r1.iterator()
                L_0x00c8:
                    boolean r1 = r12.hasNext()
                    if (r1 == 0) goto L_0x0168
                    java.lang.Object r1 = r12.next()
                    int r13 = r4 + 1
                    if (r4 >= 0) goto L_0x00d9
                    YH.C16877v.x()
                L_0x00d9:
                    ho.b r1 = (ho.b) r1
                    androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                    ho.h r3 = ho.h.f98128a
                    java.lang.String r3 = r3.a(r4)
                    androidx.compose.ui.d r14 = androidx.compose.ui.platform.C5116k1.a(r2, r3)
                    r2 = 8
                    float r2 = (float) r2
                    float r18 = c2.h.B(r2)
                    r19 = 7
                    r20 = 0
                    r15 = 0
                    r16 = 0
                    r17 = 0
                    androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r14, r15, r16, r17, r18, r19, r20)
                    Yn.Y r2 = r10.j(r1, r9)
                    r3 = 187203467(0xb287f8b, float:3.2451576E-32)
                    r8.W(r3)
                    boolean r3 = r8.F(r10)
                    boolean r5 = r8.F(r1)
                    r3 = r3 | r5
                    boolean r5 = r8.F(r9)
                    r3 = r3 | r5
                    java.lang.Object r5 = r22.D()
                    if (r3 != 0) goto L_0x0121
                    U0.m$a r3 = U0.C4889m.f14007a
                    java.lang.Object r3 = r3.a()
                    if (r5 != r3) goto L_0x0129
                L_0x0121:
                    ho.d r5 = new ho.d
                    r5.<init>(r10, r1, r9, r11)
                    r8.u(r5)
                L_0x0129:
                    r3 = r5
                    nI.a r3 = (nI.C17631a) r3
                    r22.P()
                    r5 = 187223107(0xb28cc43, float:3.2509293E-32)
                    r8.W(r5)
                    boolean r5 = r8.F(r10)
                    boolean r6 = r8.F(r1)
                    r5 = r5 | r6
                    java.lang.Object r6 = r22.D()
                    if (r5 != 0) goto L_0x014c
                    U0.m$a r5 = U0.C4889m.f14007a
                    java.lang.Object r5 = r5.a()
                    if (r6 != r5) goto L_0x0154
                L_0x014c:
                    ho.e r6 = new ho.e
                    r6.<init>(r10, r1)
                    r8.u(r6)
                L_0x0154:
                    r5 = r6
                    nI.a r5 = (nI.C17631a) r5
                    r22.P()
                    int r6 = IC.C13023e.f110931a
                    r7 = 0
                    r1 = r2
                    r2 = r3
                    r3 = r5
                    r5 = r22
                    Yn.X.o(r1, r2, r3, r4, r5, r6, r7)
                    r4 = r13
                    goto L_0x00c8
                L_0x0168:
                    r22.P()
                    r22.x()
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x0177
                    U0.C4895p.R()
                L_0x0177:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ho.f.a.C2206a.c(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                c((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f98125i = fVar;
            this.f98124h = composeView;
        }

        /* renamed from: l */
        public void c(c cVar) {
            C17542s.j(cVar, "viewModel");
            super.c(cVar);
            TC.e.l(this.f98124h, false, c1.c.c(1513091275, true, new C2206a(cVar, this.f98125i)), 1, (Object) null);
        }
    }

    public f(Il.a aVar, b bVar, C17642l<? super b, C16807N> lVar) {
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(bVar, "checkoutAnalytics");
        C17542s.j(lVar, "onDeliveryOptionSelected");
        this.f98121b = aVar;
        this.f98122c = bVar;
        this.f98123d = lVar;
    }

    private final Y.a i(b bVar, boolean z10) {
        boolean f10 = bVar.f();
        Double e10 = bVar.e(Boolean.valueOf(!z10));
        if (e10 != null) {
            return f10 ? new Y.a.b(C13026h.b(C11849b.f102171C0, C14956a.f130484a.b(e10.doubleValue(), this.f98121b.s()))) : C17542s.a(e10, 0.0d) ? new Y.a.b(C13026h.a(C11849b.f102312k0)) : new Y.a.C1916a(e10.doubleValue(), this.f98121b.s());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final Y j(b bVar, c cVar) {
        return new Y(bVar.g() && cVar.b().a() >= a.C1490a.f79829a.a(), C13026h.a(Co.c.e(bVar)), bVar.b(), bVar.c(), bVar.d(), i(bVar, cVar.c()), k(bVar));
    }

    private final C13023e k(b bVar) {
        if (bVar instanceof b.a) {
            if (((b.a) bVar).h()) {
                return C13026h.a(Oo.b.f84378G0);
            }
            return null;
        } else if (bVar instanceof b.C2205b) {
            b.C2205b bVar2 = (b.C2205b) bVar;
            C10812o i10 = bVar2.i();
            if (i10 instanceof C10812o.a) {
                return null;
            }
            if (i10 instanceof C10812o.d) {
                int i11 = 0;
                for (Q q10 : ((C10812o.d) bVar2.i()).n()) {
                    i11 += q10.c() - q10.a();
                }
                return new C13023e.c(C11848a.f102161d, C13020b.a(i11), C16877v.e(Integer.valueOf(i11)), (DefaultConstructorMarker) null);
            }
            throw new t();
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final boolean l(b bVar, Do.a aVar) {
        return !bVar.g() || aVar.a() < a.C1490a.f79829a.a();
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof c;
    }

    public c<c> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
