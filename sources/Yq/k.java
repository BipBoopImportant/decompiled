package Yq;

import E1.I;
import G1.C4504g;
import QJ.Q;
import SC.C13593h1;
import SC.C13597i1;
import SC.C13605k1;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import or.C11708a;
import s0.C5843N;
import t0.x;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a?\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013²\u0006\f\u0010\t\u001a\u00020\b8\nX\u0002"}, d2 = {"Lor/a;", "viewModel", "Lkotlin/Function0;", "LXH/N;", "onError", "onClose", "i", "(Lor/a;LnI/a;LnI/a;LU0/m;I)V", "Lor/a$b;", "state", "Lkotlin/Function2;", "", "", "onItemExpanded", "onCloseClicked", "f", "(Lor/a$b;LnI/p;LnI/a;LU0/m;I)V", "m", "(LU0/m;I)V", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.familyrewards.implementation.compose.faqbottomsheet.FaqBottomSheetScreenKt$FaqBottomSheetScreen$1$1", f = "FaqBottomSheetScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f89708c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f89709d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<C11708a.b> f89710e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17631a<C16807N> aVar, A1<? extends C11708a.b> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f89709d = aVar;
            this.f89710e = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f89709d, this.f89710e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f89708c == 0) {
                y.b(obj);
                if (C17542s.e(k.j(this.f89710e), C11708a.b.C2351a.f100658a)) {
                    this.f89709d.invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(or.C11708a.b r29, nI.p<? super java.lang.String, ? super java.lang.Boolean, XH.C16807N> r30, nI.C17631a<XH.C16807N> r31, U0.C4889m r32, int r33) {
        /*
            r0 = r29
            r1 = r30
            r14 = r31
            r15 = r33
            r2 = 8
            java.lang.String r3 = "state"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "onItemExpanded"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            java.lang.String r3 = "onCloseClicked"
            kotlin.jvm.internal.C17542s.j(r14, r3)
            r3 = 817054641(0x30b343b1, float:1.3043203E-9)
            r4 = r32
            U0.m r13 = r4.k(r3)
            r4 = 6
            r5 = r15 & 6
            r6 = 4
            if (r5 != 0) goto L_0x003c
            r5 = r15 & 8
            if (r5 != 0) goto L_0x0031
            boolean r5 = r13.V(r0)
            goto L_0x0035
        L_0x0031:
            boolean r5 = r13.F(r0)
        L_0x0035:
            if (r5 == 0) goto L_0x0039
            r5 = r6
            goto L_0x003a
        L_0x0039:
            r5 = 2
        L_0x003a:
            r5 = r5 | r15
            goto L_0x003d
        L_0x003c:
            r5 = r15
        L_0x003d:
            r7 = r15 & 48
            if (r7 != 0) goto L_0x004d
            boolean r7 = r13.F(r1)
            if (r7 == 0) goto L_0x004a
            r7 = 32
            goto L_0x004c
        L_0x004a:
            r7 = 16
        L_0x004c:
            r5 = r5 | r7
        L_0x004d:
            r7 = r15 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005d
            boolean r7 = r13.F(r14)
            if (r7 == 0) goto L_0x005a
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r5 = r5 | r7
        L_0x005d:
            r7 = r5 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r7 != r9) goto L_0x0071
            boolean r7 = r13.l()
            if (r7 != 0) goto L_0x006a
            goto L_0x0071
        L_0x006a:
            r13.L()
            r17 = r13
            goto L_0x024a
        L_0x0071:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x007d
            r7 = -1
            java.lang.String r9 = "com.ingka.ikea.familyrewards.implementation.compose.faqbottomsheet.FaqBottomSheetContent (FaqBottomSheetScreen.kt:71)"
            U0.C4895p.S(r3, r5, r7, r9)
        L_0x007d:
            r3 = 3
            r7 = 0
            t0.A r17 = t0.C5935B.c(r7, r7, r13, r7, r3)
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c r10 = r9.o()
            E1.I r10 = androidx.compose.foundation.layout.C5077h.h(r10, r7)
            int r11 = U0.C4883j.a(r13, r7)
            U0.y r12 = r13.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r13, r3)
            G1.g$a r28 = G1.C4504g.f6515W
            nI.a r4 = r28.a()
            U0.f r16 = r13.m()
            if (r16 != 0) goto L_0x00aa
            U0.C4883j.c()
        L_0x00aa:
            r13.I()
            boolean r16 = r13.i()
            if (r16 == 0) goto L_0x00b7
            r13.p(r4)
            goto L_0x00ba
        L_0x00b7:
            r13.t()
        L_0x00ba:
            U0.m r4 = U0.F1.a(r13)
            nI.p r8 = r28.c()
            U0.F1.c(r4, r10, r8)
            nI.p r8 = r28.e()
            U0.F1.c(r4, r12, r8)
            nI.p r8 = r28.b()
            boolean r10 = r4.i()
            if (r10 != 0) goto L_0x00e4
            java.lang.Object r10 = r4.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r12)
            if (r10 != 0) goto L_0x00f2
        L_0x00e4:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r4.u(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r4.w(r10, r8)
        L_0x00f2:
            nI.p r8 = r28.d()
            U0.F1.c(r4, r7, r8)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            r4 = 72
            float r4 = (float) r4
            float r19 = c2.h.B(r4)
            r4 = 40
            float r4 = (float) r4
            float r21 = c2.h.B(r4)
            r22 = 5
            r23 = 0
            r18 = 0
            r20 = 0
            s0.E r18 = androidx.compose.foundation.layout.D.e(r18, r19, r20, r21, r22, r23)
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            float r7 = (float) r2
            float r7 = c2.h.B(r7)
            androidx.compose.foundation.layout.d$f r20 = r4.n(r7)
            r7 = 476963128(0x1c6de138, float:7.870781E-22)
            r13.W(r7)
            r7 = r5 & 14
            r8 = 1
            if (r7 == r6) goto L_0x0137
            r2 = r2 & r5
            if (r2 == 0) goto L_0x0135
            boolean r2 = r13.F(r0)
            if (r2 == 0) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            r2 = 0
            goto L_0x0138
        L_0x0137:
            r2 = r8
        L_0x0138:
            r6 = r5 & 112(0x70, float:1.57E-43)
            r7 = 32
            if (r6 != r7) goto L_0x0140
            r6 = r8
            goto L_0x0141
        L_0x0140:
            r6 = 0
        L_0x0141:
            r2 = r2 | r6
            java.lang.Object r6 = r13.D()
            if (r2 != 0) goto L_0x0150
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x0158
        L_0x0150:
            Yq.h r6 = new Yq.h
            r6.<init>(r0, r1)
            r13.u(r6)
        L_0x0158:
            r24 = r6
            nI.l r24 = (nI.C17642l) r24
            r13.P()
            r26 = 24960(0x6180, float:3.4976E-41)
            r27 = 233(0xe9, float:3.27E-43)
            r16 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = r13
            t0.C5937b.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            androidx.compose.ui.d r2 = Rq.d.k()
            r6 = 0
            r7 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r2, r6, r8, r7)
            androidx.compose.foundation.layout.d$e r4 = r4.c()
            i1.c$c r6 = r9.l()
            r7 = 6
            E1.I r4 = androidx.compose.foundation.layout.G.b(r4, r6, r13, r7)
            r6 = 0
            int r7 = U0.C4883j.a(r13, r6)
            U0.y r6 = r13.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r13, r2)
            nI.a r8 = r28.a()
            U0.f r9 = r13.m()
            if (r9 != 0) goto L_0x01a3
            U0.C4883j.c()
        L_0x01a3:
            r13.I()
            boolean r9 = r13.i()
            if (r9 == 0) goto L_0x01b0
            r13.p(r8)
            goto L_0x01b3
        L_0x01b0:
            r13.t()
        L_0x01b3:
            U0.m r8 = U0.F1.a(r13)
            nI.p r9 = r28.c()
            U0.F1.c(r8, r4, r9)
            nI.p r4 = r28.e()
            U0.F1.c(r8, r6, r4)
            nI.p r4 = r28.b()
            boolean r6 = r8.i()
            if (r6 != 0) goto L_0x01dd
            java.lang.Object r6 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x01eb
        L_0x01dd:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r8.u(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r8.w(r6, r4)
        L_0x01eb:
            nI.p r4 = r28.d()
            U0.F1.c(r8, r2, r4)
            s0.N r2 = s0.C5843N.f28726a
            int r2 = uK.C18146a.f148097J2
            int r4 = Oo.b.f84665i
            r6 = 0
            java.lang.String r4 = J1.j.b(r4, r13, r6)
            SC.H0 r6 = SC.H0.Tertiary
            SC.G0 r7 = SC.G0.Small
            r8 = 24
            float r8 = (float) r8
            float r20 = c2.h.B(r8)
            r23 = 13
            r24 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r18 = r3
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r8 = "TestTag-CloseButton"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r3, r8)
            int r3 = r5 << 18
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r5
            r5 = 221568(0x36180, float:3.10483E-40)
            r12 = r3 | r5
            r16 = 200(0xc8, float:2.8E-43)
            r5 = 0
            r9 = 0
            r10 = 0
            r3 = r4
            r4 = r8
            r8 = r9
            r9 = r10
            r10 = r31
            r11 = r13
            r17 = r13
            r13 = r16
            SC.F0.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r17.x()
            r17.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x024a
            U0.C4895p.R()
        L_0x024a:
            U0.Y0 r2 = r17.n()
            if (r2 == 0) goto L_0x0258
            Yq.i r3 = new Yq.i
            r3.<init>(r0, r1, r14, r15)
            r2.a(r3)
        L_0x0258:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Yq.k.f(or.a$b, nI.p, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C11708a.b bVar, p pVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        a aVar = a.f89687a;
        x.i(xVar, (Object) null, (Object) null, aVar.a(), 3, (Object) null);
        if (!C17542s.e(bVar, C11708a.b.C2351a.f100658a)) {
            if (C17542s.e(bVar, C11708a.b.C2352b.f100659a)) {
                x.i(xVar, (Object) null, (Object) null, aVar.b(), 3, (Object) null);
            } else if (bVar instanceof C11708a.b.c) {
                o.j(xVar, ((C11708a.b.c) bVar).a().a(), pVar);
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C11708a.b bVar, p pVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        f(bVar, pVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void i(C11708a aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "viewModel");
        C17542s.j(aVar2, "onError");
        C17542s.j(aVar3, "onClose");
        C4889m k10 = mVar.k(1480576663);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar3) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1480576663, i11, -1, "com.ingka.ikea.familyrewards.implementation.compose.faqbottomsheet.FaqBottomSheetScreen (FaqBottomSheetScreen.kt:46)");
            }
            boolean z10 = true;
            A1<C11708a.b> b10 = p1.b(aVar.m(), (C17168i) null, k10, 0, 1);
            C11708a.b j10 = j(b10);
            k10.W(-2143463870);
            boolean V10 = k10.V(b10);
            if ((i11 & 112) != 32) {
                z10 = false;
            }
            boolean z11 = V10 | z10;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                D10 = new a(aVar2, b10, (C17164e<? super a>) null);
                k10.u(D10);
            }
            k10.P();
            P.g(j10, (p) D10, k10, 0);
            C11708a.b j11 = j(b10);
            k10.W(-2143459114);
            boolean F10 = k10.F(aVar);
            Object D11 = k10.D();
            if (F10 || D11 == C4889m.f14007a.a()) {
                D11 = new f(aVar);
                k10.u(D11);
            }
            k10.P();
            f(j11, (p) D11, aVar3, k10, i11 & 896);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new g(aVar, aVar2, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C11708a.b j(A1<? extends C11708a.b> a12) {
        return (C11708a.b) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C11708a aVar, String str, boolean z10) {
        C17542s.j(str, "id");
        aVar.i(new C11708a.C2349a.C2350a(str, z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C11708a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        i(aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void m(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(1683969576);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1683969576, i10, -1, "com.ingka.ikea.familyrewards.implementation.compose.faqbottomsheet.LoadingState (FaqBottomSheetScreen.kt:117)");
            }
            d h10 = J.h(Rq.d.k(), 0.0f, 1, (Object) null);
            I b10 = G.b(C5073d.f18068a.b(), C5437c.f24302a.l(), k10, 6);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, b10, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b11 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar.d());
            C5843N n10 = C5843N.f28726a;
            C13605k1.b((d) null, (C13597i1) null, (C13593h1) null, k10, 0, 7);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new j(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N n(int i10, C4889m mVar, int i11) {
        m(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
