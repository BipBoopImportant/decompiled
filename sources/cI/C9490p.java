package ci;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.core.model.product.Disclaimer;
import gs.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/core/model/product/Disclaimer;", "disclaimer", "Lkotlin/Function1;", "Lcom/ingka/ikea/core/model/Link;", "LXH/N;", "onLinkClicked", "Landroidx/compose/ui/d;", "modifier", "d", "(Lcom/ingka/ikea/core/model/product/Disclaimer;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ci.p  reason: case insensitive filesystem */
public final class C9490p {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(com.ingka.ikea.core.model.product.Disclaimer r32, nI.C17642l<? super com.ingka.ikea.core.model.Link, XH.C16807N> r33, androidx.compose.ui.d r34, U0.C4889m r35, int r36, int r37) {
        /*
            r1 = r32
            r2 = r33
            r4 = r36
            r0 = 2
            r3 = 48
            java.lang.String r5 = "disclaimer"
            kotlin.jvm.internal.C17542s.j(r1, r5)
            java.lang.String r5 = "onLinkClicked"
            kotlin.jvm.internal.C17542s.j(r2, r5)
            r5 = 1802840348(0x6b75291c, float:2.9638096E26)
            r6 = r35
            U0.m r15 = r6.k(r5)
            r6 = 1
            r7 = r37 & 1
            r8 = 4
            if (r7 == 0) goto L_0x0025
            r7 = r4 | 6
            goto L_0x0035
        L_0x0025:
            r7 = r4 & 6
            if (r7 != 0) goto L_0x0034
            boolean r7 = r15.F(r1)
            if (r7 == 0) goto L_0x0031
            r7 = r8
            goto L_0x0032
        L_0x0031:
            r7 = r0
        L_0x0032:
            r7 = r7 | r4
            goto L_0x0035
        L_0x0034:
            r7 = r4
        L_0x0035:
            r0 = r37 & 2
            r9 = 16
            r10 = 32
            if (r0 == 0) goto L_0x003f
            r7 = r7 | r3
            goto L_0x004d
        L_0x003f:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x004d
            boolean r0 = r15.F(r2)
            if (r0 == 0) goto L_0x004b
            r0 = r10
            goto L_0x004c
        L_0x004b:
            r0 = r9
        L_0x004c:
            r7 = r7 | r0
        L_0x004d:
            r0 = r37 & 4
            if (r0 == 0) goto L_0x0056
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0053:
            r11 = r34
            goto L_0x0068
        L_0x0056:
            r11 = r4 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0053
            r11 = r34
            boolean r12 = r15.V(r11)
            if (r12 == 0) goto L_0x0065
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r7 = r7 | r12
        L_0x0068:
            r12 = r7 & 147(0x93, float:2.06E-43)
            r13 = 146(0x92, float:2.05E-43)
            if (r12 != r13) goto L_0x007b
            boolean r12 = r15.l()
            if (r12 != 0) goto L_0x0075
            goto L_0x007b
        L_0x0075:
            r15.L()
            r3 = r15
            goto L_0x0276
        L_0x007b:
            if (r0 == 0) goto L_0x0080
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0081
        L_0x0080:
            r0 = r11
        L_0x0081:
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x008d
            r11 = -1
            java.lang.String r12 = "com.ingka.ikea.app.productinformationpage.v2.compose.GenericDisclaimer (GenericDisclaimerComposable.kt:39)"
            U0.C4895p.S(r5, r7, r11, r12)
        L_0x008d:
            com.ingka.ikea.core.model.Link r5 = r32.c()
            r11 = 1109757418(0x42258dea, float:41.388588)
            r15.W(r11)
            r11 = 0
            if (r5 == 0) goto L_0x00da
            r12 = 1109758839(0x42259377, float:41.39401)
            r15.W(r12)
            r7 = r7 & 112(0x70, float:1.57E-43)
            if (r7 != r10) goto L_0x00a6
            r7 = r6
            goto L_0x00a7
        L_0x00a6:
            r7 = r11
        L_0x00a7:
            boolean r10 = r15.F(r5)
            r7 = r7 | r10
            java.lang.Object r10 = r15.D()
            if (r7 != 0) goto L_0x00ba
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r10 != r7) goto L_0x00c2
        L_0x00ba:
            ci.m r10 = new ci.m
            r10.<init>(r2, r5)
            r15.u(r10)
        L_0x00c2:
            r20 = r10
            nI.a r20 = (nI.C17631a) r20
            r15.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r0
            androidx.compose.ui.d r7 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x00db
        L_0x00da:
            r7 = r0
        L_0x00db:
            r15.P()
            i1.c$a r10 = i1.C5437c.f24302a
            i1.c$c r10 = r10.i()
            androidx.compose.foundation.layout.d r12 = androidx.compose.foundation.layout.C5073d.f18068a
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.foundation.layout.d$f r9 = r12.n(r9)
            r12 = 54
            E1.I r9 = androidx.compose.foundation.layout.G.b(r9, r10, r15, r12)
            int r10 = U0.C4883j.a(r15, r11)
            U0.y r12 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r7)
            G1.g$a r13 = G1.C4504g.f6515W
            nI.a r14 = r13.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x0110
            U0.C4883j.c()
        L_0x0110:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x011d
            r15.p(r14)
            goto L_0x0120
        L_0x011d:
            r15.t()
        L_0x0120:
            U0.m r14 = U0.F1.a(r15)
            nI.p r8 = r13.c()
            U0.F1.c(r14, r9, r8)
            nI.p r8 = r13.e()
            U0.F1.c(r14, r12, r8)
            nI.p r8 = r13.b()
            boolean r9 = r14.i()
            if (r9 != 0) goto L_0x014a
            java.lang.Object r9 = r14.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x0158
        L_0x014a:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r14.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r14.w(r9, r8)
        L_0x0158:
            nI.p r8 = r13.d()
            U0.F1.c(r14, r7, r8)
            s0.N r7 = s0.C5843N.f28726a
            com.ingka.ikea.core.model.product.DisclaimerType r7 = r32.e()
            com.ingka.ikea.core.model.product.DisclaimerType r8 = com.ingka.ikea.core.model.product.DisclaimerType.REPAIRABILITY_INDEX
            if (r7 != r8) goto L_0x016b
            r7 = r6
            goto L_0x016c
        L_0x016b:
            r7 = r11
        L_0x016c:
            if (r7 != r6) goto L_0x017a
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r6, r3)
            goto L_0x0189
        L_0x017a:
            if (r7 != 0) goto L_0x028f
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r6 = 24
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.t(r3, r6)
        L_0x0189:
            com.ingka.ikea.core.model.Image r6 = r32.b()
            r7 = -510775322(0xffffffffe18e2fe6, float:-3.2786114E20)
            r15.W(r7)
            if (r6 != 0) goto L_0x0198
            r3 = r15
            goto L_0x021e
        L_0x0198:
            boolean r7 = TC.e.h(r15, r11)
            if (r7 == 0) goto L_0x01af
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r8 = 4
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            A0.f r8 = A0.g.e(r8)
            androidx.compose.ui.d r7 = m1.e.a(r7, r8)
            goto L_0x01b1
        L_0x01af:
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
        L_0x01b1:
            androidx.compose.ui.d r16 = r3.s(r7)
            tK.v r3 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r15, r7)
            long r17 = r3.F0()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            java.lang.String r7 = "GenericDisclaimerImage"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r3, r7)
            r3 = -656158078(0xffffffffd8e3d282, float:-2.00394611E15)
            r15.W(r3)
            boolean r3 = r15.F(r6)
            java.lang.Object r7 = r15.D()
            if (r3 != 0) goto L_0x01e9
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r7 != r3) goto L_0x01f1
        L_0x01e9:
            ci.n r7 = new ci.n
            r7.<init>(r6)
            r15.u(r7)
        L_0x01f1:
            nI.l r7 = (nI.C17642l) r7
            r15.P()
            gs.e r3 = gs.f.a(r7, r15, r11)
            java.lang.String r7 = r6.A0()
            int r6 = uK.C18146a.f148160N5
            t1.c r10 = J1.e.c(r6, r15, r11)
            int r18 = gs.e.f97946h
            r19 = 0
            r20 = 2024(0x7e8, float:2.836E-42)
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r6 = r3
            r3 = r15
            r15 = r16
            r16 = r17
            r17 = r3
            gs.C11352b.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x021e:
            r3.P()
            if (r5 == 0) goto L_0x022c
            Y1.k$a r5 = Y1.k.f14792b
            Y1.k r5 = r5.d()
        L_0x0229:
            r18 = r5
            goto L_0x0233
        L_0x022c:
            Y1.k$a r5 = Y1.k.f14792b
            Y1.k r5 = r5.c()
            goto L_0x0229
        L_0x0233:
            java.lang.String r6 = r32.d()
            TC.b$a$b r7 = TC.C13679b.a.C2856b.f116680a
            tK.v r5 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r3, r8)
            long r9 = r5.H0()
            r30 = 0
            r31 = 261620(0x3fdf4, float:3.66608E-40)
            r8 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 48
            r28 = r3
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r3.x()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0275
            U0.C4895p.R()
        L_0x0275:
            r11 = r0
        L_0x0276:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x028e
            ci.o r7 = new ci.o
            r0 = r7
            r1 = r32
            r2 = r33
            r3 = r11
            r4 = r36
            r5 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x028e:
            return
        L_0x028f:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.C9490p.d(com.ingka.ikea.core.model.product.Disclaimer, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17642l lVar, Link link) {
        lVar.invoke(link);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(Image image, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(image.getUrl());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(Disclaimer disclaimer, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        d(disclaimer, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
