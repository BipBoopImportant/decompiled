package to;

import E1.I;
import G1.C4504g;
import HJ.C15854t;
import IC.C13023e;
import J1.j;
import N1.P;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.H2;
import TC.C13679b;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.y;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p0.s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import ro.C11835a;
import rv.C11849b;
import s0.C5844O;
import s0.C5862h;
import to.C11970v0;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0001\u0010\u0016\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001am\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00182\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0007H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001aE\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0007H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006!²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u0002"}, d2 = {"Lro/a;", "viewModel", "", "shopperResultUrlString", "Lkotlin/Function0;", "LXH/N;", "onExpressFlowCreated", "Lkotlin/Function1;", "onLinkClicked", "n", "(Lro/a;Ljava/lang/String;LnI/a;LnI/l;LU0/m;I)V", "Lro/a$c;", "uiState", "Lkotlin/Function2;", "", "onTermsCheckedStateChanged", "Lto/F0;", "onTaxIdSelectionChanged", "Lto/v0$a;", "onGooglePayClick", "Lro/a$c$c;", "onNavigationEvent", "u", "(Lro/a$c;LnI/p;LnI/l;LnI/l;LnI/l;LnI/l;LU0/m;I)V", "Lro/a$c$a;", "k", "(Lro/a$c$a;LnI/p;LnI/l;LnI/l;LnI/l;LU0/m;I)V", "Lto/f;", "entry", "y", "(Lto/f;LnI/p;LnI/l;LU0/m;I)V", "w", "(LU0/m;I)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: to.o0  reason: case insensitive filesystem */
public final class C11957o0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.checkout.impl.presentation.compose.ExpressCheckoutScreenKt$ExpressCheckoutScreenImpl$1$1$1", f = "ExpressCheckoutScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: to.o0$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103200c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C11835a.c.C2427c f103201d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C11835a.c.C2427c, C16807N> f103202e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11835a.c.C2427c cVar, C17642l<? super C11835a.c.C2427c, C16807N> lVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f103201d = cVar;
            this.f103202e = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f103201d, this.f103202e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f103200c == 0) {
                y.b(obj);
                C11835a.c.C2427c cVar = this.f103201d;
                if (cVar != null) {
                    this.f103202e.invoke(cVar);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void k(ro.C11835a.c.C2426a r25, nI.p<? super java.lang.String, ? super java.lang.Boolean, XH.C16807N> r26, nI.C17642l<? super to.F0, XH.C16807N> r27, nI.C17642l<? super to.C11970v0.a, XH.C16807N> r28, nI.C17642l<? super java.lang.String, XH.C16807N> r29, U0.C4889m r30, int r31) {
        /*
            r1 = r25
            r2 = r26
            r4 = r28
            r5 = r29
            r6 = r31
            r0 = 1102343854(0x41b46eae, float:22.554043)
            r3 = r30
            U0.m r3 = r3.k(r0)
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0022
            boolean r7 = r3.F(r1)
            if (r7 == 0) goto L_0x001f
            r7 = 4
            goto L_0x0020
        L_0x001f:
            r7 = 2
        L_0x0020:
            r7 = r7 | r6
            goto L_0x0023
        L_0x0022:
            r7 = r6
        L_0x0023:
            r8 = r6 & 48
            r15 = 16
            if (r8 != 0) goto L_0x0034
            boolean r8 = r3.F(r2)
            if (r8 == 0) goto L_0x0032
            r8 = 32
            goto L_0x0033
        L_0x0032:
            r8 = r15
        L_0x0033:
            r7 = r7 | r8
        L_0x0034:
            r8 = r6 & 384(0x180, float:5.38E-43)
            r14 = r27
            if (r8 != 0) goto L_0x0046
            boolean r8 = r3.F(r14)
            if (r8 == 0) goto L_0x0043
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r7 = r7 | r8
        L_0x0046:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0056
            boolean r8 = r3.F(r4)
            if (r8 == 0) goto L_0x0053
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r7 = r7 | r8
        L_0x0056:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0066
            boolean r8 = r3.F(r5)
            if (r8 == 0) goto L_0x0063
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0065
        L_0x0063:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0065:
            r7 = r7 | r8
        L_0x0066:
            r12 = r7
            r7 = r12 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            if (r7 != r8) goto L_0x0079
            boolean r7 = r3.l()
            if (r7 != 0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r3.L()
            goto L_0x021b
        L_0x0079:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0085
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.checkout.impl.presentation.compose.ExpressCheckoutContent (ExpressCheckoutScreen.kt:134)"
            U0.C4895p.S(r0, r12, r7, r8)
        L_0x0085:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r7.g()
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$b r8 = r8.k()
            r11 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r8, r3, r11)
            int r8 = U0.C4883j.a(r3, r11)
            U0.y r9 = r3.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r3, r0)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r11 = r16.a()
            U0.f r17 = r3.m()
            if (r17 != 0) goto L_0x00b3
            U0.C4883j.c()
        L_0x00b3:
            r3.I()
            boolean r17 = r3.i()
            if (r17 == 0) goto L_0x00c0
            r3.p(r11)
            goto L_0x00c3
        L_0x00c0:
            r3.t()
        L_0x00c3:
            U0.m r11 = U0.F1.a(r3)
            nI.p r13 = r16.c()
            U0.F1.c(r11, r7, r13)
            nI.p r7 = r16.e()
            U0.F1.c(r11, r9, r7)
            nI.p r7 = r16.b()
            boolean r9 = r11.i()
            if (r9 != 0) goto L_0x00ed
            java.lang.Object r9 = r11.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r9 != 0) goto L_0x00fb
        L_0x00ed:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r11.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.w(r8, r7)
        L_0x00fb:
            nI.p r7 = r16.d()
            U0.F1.c(r11, r10, r7)
            s0.h r7 = s0.C5862h.f28810a
            to.C0 r7 = r25.e()
            r8 = 1452889630(0x5699561e, float:8.4297575E13)
            r3.W(r8)
            if (r7 != 0) goto L_0x0114
            r14 = r12
            r23 = 0
            goto L_0x013a
        L_0x0114:
            float r8 = (float) r15
            float r20 = c2.h.B(r8)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r0
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            int r8 = r12 >> 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            r11 = r8 | 384(0x180, float:5.38E-43)
            r13 = 0
            r8 = r27
            r10 = r3
            r23 = 0
            r14 = r12
            r12 = r13
            to.i1.Y(r7, r8, r9, r10, r11, r12)
        L_0x013a:
            r3.P()
            to.f r7 = r25.f()
            int r8 = IC.C13023e.f110931a
            r9 = r14 & 112(0x70, float:1.57E-43)
            r10 = r8 | r9
            int r11 = r14 >> 6
            r11 = r11 & 896(0x380, float:1.256E-42)
            r10 = r10 | r11
            y(r7, r2, r5, r3, r10)
            to.f r7 = r25.d()
            r10 = 1452904309(0x56998f75, float:8.4420711E13)
            r3.W(r10)
            if (r7 != 0) goto L_0x015c
            goto L_0x0161
        L_0x015c:
            r9 = r9 | r8
            r9 = r9 | r11
            y(r7, r2, r5, r3, r9)
        L_0x0161:
            r3.P()
            IC.e r7 = r25.c()
            r9 = 1452912321(0x5699aec1, float:8.4487921E13)
            r3.W(r9)
            if (r7 != 0) goto L_0x0174
            r24 = r14
            r2 = r15
            goto L_0x01a7
        L_0x0174:
            float r9 = (float) r15
            float r18 = c2.h.B(r9)
            r9 = 8
            float r9 = (float) r9
            float r20 = c2.h.B(r9)
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            r16 = r0
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r7 = r7.a(r3, r8)
            SC.m r8 = SC.C13611m.NEGATIVE
            r16 = 200112(0x30db0, float:2.80417E-40)
            r17 = 16
            r9 = 0
            r11 = 0
            r12 = 1
            r13 = r3
            r24 = r14
            r14 = r16
            r2 = r15
            r15 = r17
            SC.R0.e(r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x01a7:
            r3.P()
            java.lang.String r7 = "ExpressCheckoutContentTestTags_GOOGLE_PAY_BUTTON"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r0, r7)
            float r0 = (float) r2
            float r10 = c2.h.B(r0)
            r13 = 13
            r14 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r8, r9, r10, r11, r12, r13, r14)
            r2 = 0
            r7 = 0
            r11 = 1
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.h(r0, r2, r11, r7)
            to.v0 r0 = r25.b()
            boolean r7 = r0.c()
            to.v0 r0 = r25.b()
            java.lang.String r8 = r0.a()
            r0 = 1452935251(0x569a0853, float:8.4680271E13)
            r3.W(r0)
            r0 = r24
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 != r2) goto L_0x01e5
            goto L_0x01e7
        L_0x01e5:
            r11 = r23
        L_0x01e7:
            boolean r0 = r3.F(r1)
            r0 = r0 | r11
            java.lang.Object r2 = r3.D()
            if (r0 != 0) goto L_0x01fa
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0202
        L_0x01fa:
            to.g0 r2 = new to.g0
            r2.<init>(r4, r1)
            r3.u(r2)
        L_0x0202:
            r9 = r2
            nI.a r9 = (nI.C17631a) r9
            r3.P()
            r12 = 3072(0xc00, float:4.305E-42)
            r13 = 0
            r11 = r3
            to.C11968u0.c(r7, r8, r9, r10, r11, r12, r13)
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x021b
            U0.C4895p.R()
        L_0x021b:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x0236
            to.h0 r8 = new to.h0
            r0 = r8
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0236:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: to.C11957o0.k(ro.a$c$a, nI.p, nI.l, nI.l, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C17642l lVar, C11835a.c.C2426a aVar) {
        lVar.invoke(aVar.b().b());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C11835a.c.C2426a aVar, p pVar, C17642l lVar, C17642l lVar2, C17642l lVar3, int i10, C4889m mVar, int i11) {
        k(aVar, pVar, lVar, lVar2, lVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void n(C11835a aVar, String str, C17631a<C16807N> aVar2, C17642l<? super String, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C11835a aVar3 = aVar;
        String str2 = str;
        C17631a<C16807N> aVar4 = aVar2;
        C17642l<? super String, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(aVar3, "viewModel");
        C17542s.j(str2, "shopperResultUrlString");
        C17542s.j(aVar4, "onExpressFlowCreated");
        C17542s.j(lVar2, "onLinkClicked");
        C4889m k10 = mVar.k(274262225);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(str2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar4) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(lVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        int i13 = i11;
        if ((i13 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(274262225, i13, -1, "com.ingka.ikea.checkout.impl.presentation.compose.ExpressCheckoutScreen (ExpressCheckoutScreen.kt:42)");
            }
            int i14 = i13;
            C11835a.c o10 = o(j3.a.c(aVar.m(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7));
            k10.W(1633492661);
            boolean F10 = k10.F(aVar3);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new C11947j0(aVar3);
                k10.u(D10);
            }
            p pVar = (p) D10;
            k10.P();
            k10.W(1633488264);
            boolean F11 = k10.F(aVar3);
            Object D11 = k10.D();
            if (F11 || D11 == C4889m.f14007a.a()) {
                D11 = new C11949k0(aVar3);
                k10.u(D11);
            }
            C17642l lVar3 = (C17642l) D11;
            k10.P();
            k10.W(1633479480);
            boolean z10 = false;
            boolean F12 = k10.F(aVar3) | ((i14 & 112) == 32);
            Object D12 = k10.D();
            if (F12 || D12 == C4889m.f14007a.a()) {
                D12 = new C11951l0(aVar3, str2);
                k10.u(D12);
            }
            C17642l lVar4 = (C17642l) D12;
            k10.P();
            k10.W(1633496355);
            if ((i14 & 896) == 256) {
                z10 = true;
            }
            boolean F13 = k10.F(aVar3) | z10;
            Object D13 = k10.D();
            if (F13 || D13 == C4889m.f14007a.a()) {
                D13 = new C11953m0(aVar4, aVar3);
                k10.u(D13);
            }
            k10.P();
            u(o10, pVar, lVar3, lVar4, (C17642l) D13, lVar, k10, (i14 << 6) & ImageMetadata.JPEG_GPS_COORDINATES);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11955n0(aVar, str, aVar2, lVar, i10));
        }
    }

    private static final C11835a.c o(A1<? extends C11835a.c> a12) {
        return (C11835a.c) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C11835a aVar, String str, C17631a aVar2, C17642l lVar, int i10, C4889m mVar, int i11) {
        n(aVar, str, aVar2, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C11835a aVar, String str, boolean z10) {
        C17542s.j(str, "id");
        aVar.I(str, z10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C11835a aVar, F0 f02) {
        C17542s.j(f02, "selection");
        aVar.J(f02);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C11835a aVar, String str, C11970v0.a aVar2) {
        String str2;
        C17542s.j(aVar2, "it");
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str3 = null;
        String str4 = null;
        for (C11819b bVar : arrayList) {
            if (str3 == null) {
                String a10 = C11818a.a("onGooglePayClick callback", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "ExpressCheckoutScreen";
            } else {
                str2 = str4;
            }
            bVar.a(eVar, str2, false, (Throwable) null, str5);
            str3 = str5;
            str4 = str2;
        }
        aVar.G(str, aVar2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C17631a aVar, C11835a aVar2, C11835a.c.C2427c cVar) {
        C17542s.j(cVar, "event");
        if (cVar instanceof C11835a.c.C2427c.C2428a) {
            aVar.invoke();
            aVar2.H();
            return C16807N.f139792a;
        }
        throw new t();
    }

    public static final void u(C11835a.c cVar, p<? super String, ? super Boolean, C16807N> pVar, C17642l<? super F0, C16807N> lVar, C17642l<? super C11970v0.a, C16807N> lVar2, C17642l<? super C11835a.c.C2427c, C16807N> lVar3, C17642l<? super String, C16807N> lVar4, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        int i12;
        boolean z10;
        boolean z11;
        C11835a.c cVar2 = cVar;
        p<? super String, ? super Boolean, C16807N> pVar2 = pVar;
        C17642l<? super F0, C16807N> lVar5 = lVar;
        C17642l<? super C11970v0.a, C16807N> lVar6 = lVar2;
        C17642l<? super C11835a.c.C2427c, C16807N> lVar7 = lVar3;
        C17642l<? super String, C16807N> lVar8 = lVar4;
        int i13 = i10;
        C17542s.j(cVar2, "uiState");
        C17542s.j(pVar2, "onTermsCheckedStateChanged");
        C17542s.j(lVar5, "onTaxIdSelectionChanged");
        C17542s.j(lVar6, "onGooglePayClick");
        C17542s.j(lVar7, "onNavigationEvent");
        C17542s.j(lVar8, "onLinkClicked");
        C4889m k10 = mVar.k(2096783866);
        if ((i13 & 6) == 0) {
            i11 = (k10.V(cVar2) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.F(pVar2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(lVar5) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i11 |= k10.F(lVar6) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i13 & 24576) == 0) {
            i11 |= k10.F(lVar7) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i11 |= k10.F(lVar8) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        int i14 = i11;
        if ((74899 & i14) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2096783866, i14, -1, "com.ingka.ikea.checkout.impl.presentation.compose.ExpressCheckoutScreenImpl (ExpressCheckoutScreen.kt:82)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d k11 = D.k(m.f(TC.e.i(J.h(aVar, 0.0f, 1, (Object) null)), m.c(0, k10, 0, 1), false, (s) null, false, 14, (Object) null), 0.0f, h.B((float) 24), 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = c.e(k10, k11);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            C13607l.j(j.b(C11849b.f102236S1, k10, 0), C13679b.C2857b.a.f116683a, D.m(aVar, 0.0f, 0.0f, 0.0f, h.B((float) 16), 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, 432, 0, 262136);
            if (cVar2 instanceof C11835a.c.C2426a) {
                k10.W(-55133618);
                z10 = true;
                i12 = i14;
                z11 = false;
                C4889m mVar3 = k10;
                k((C11835a.c.C2426a) cVar2, pVar, lVar, lVar2, lVar4, k10, (i14 & 8176) | ((i14 >> 3) & 57344));
                mVar3.P();
                mVar2 = mVar3;
            } else {
                z11 = false;
                i12 = i14;
                C4889m mVar4 = k10;
                z10 = true;
                if (cVar2 instanceof C11835a.c.b) {
                    mVar2 = mVar4;
                    mVar2.W(-54718187);
                    w(mVar2, 0);
                    mVar2.P();
                } else {
                    C4889m mVar5 = mVar4;
                    mVar5.W(-140328080);
                    mVar5.P();
                    throw new t();
                }
            }
            C11835a.c.C2427c a14 = cVar.a();
            mVar2.W(-140307527);
            boolean V10 = mVar2.V(a14) | ((i12 & 57344) == 16384 ? z10 : z11);
            Object D10 = mVar2.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new a(a14, lVar7, (C17164e<? super a>) null);
                mVar2.u(D10);
            }
            mVar2.P();
            U0.P.g(a14, (p) D10, mVar2, z11 ? 1 : 0);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11937e0(cVar, pVar, lVar, lVar2, lVar3, lVar4, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C11835a.c cVar, p pVar, C17642l lVar, C17642l lVar2, C17642l lVar3, C17642l lVar4, int i10, C4889m mVar, int i11) {
        u(cVar, pVar, lVar, lVar2, lVar3, lVar4, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void w(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(1198454027);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1198454027, i10, -1, "com.ingka.ikea.checkout.impl.presentation.compose.Loading (ExpressCheckoutScreen.kt:199)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d a10 = C5116k1.a(aVar, "ExpressCheckoutContentTestTags_LOADING");
            I a11 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = c.e(k10, a10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a13);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, a11, aVar2.c());
            F1.c(a14, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            float f10 = (float) 32;
            H2.b(J.i(aVar, h.B(f10)), false, k10, 6, 2);
            C5844O.a(J.i(aVar, h.B(f10)), k10, 6);
            H2.b(J.i(aVar, h.B(f10)), false, k10, 6, 2);
            C5844O.a(J.i(aVar, h.B((float) 16)), k10, 6);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11939f0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N x(int i10, C4889m mVar, int i11) {
        w(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void y(C11938f fVar, p<? super String, ? super Boolean, C16807N> pVar, C17642l<? super String, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(85660764);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(fVar) : k10.F(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(lVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(85660764, i11, -1, "com.ingka.ikea.checkout.impl.presentation.compose.TermsAndConditionsEntry (ExpressCheckoutScreen.kt:189)");
            }
            C11934d.d(fVar, pVar, lVar, D.m(androidx.compose.ui.d.f18749a, 0.0f, h.B((float) 8), 0.0f, 0.0f, 13, (Object) null), k10, C13023e.f110931a | 3072 | (i11 & 14) | (i11 & 112) | (i11 & 896), 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11945i0(fVar, pVar, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N z(C11938f fVar, p pVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        y(fVar, pVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
