package zf;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import com.ingka.ikea.core.model.Category;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/core/model/Category;", "category", "Lkotlin/Function1;", "LXH/N;", "onCategoryClicked", "Landroidx/compose/ui/d;", "modifier", "c", "(Lcom/ingka/ikea/core/model/Category;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "browse-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class X {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.ingka.ikea.core.model.Category r32, nI.C17642l<? super com.ingka.ikea.core.model.Category, XH.C16807N> r33, androidx.compose.ui.d r34, U0.C4889m r35, int r36, int r37) {
        /*
            r1 = r32
            r2 = r33
            r4 = r36
            r0 = 4
            java.lang.String r3 = "category"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            java.lang.String r3 = "onCategoryClicked"
            kotlin.jvm.internal.C17542s.j(r2, r3)
            r3 = -644911143(0xffffffffd98f6fd9, float:-5.0467374E15)
            r5 = r35
            U0.m r15 = r5.k(r3)
            r14 = 1
            r5 = r37 & 1
            r13 = 2
            if (r5 == 0) goto L_0x0023
            r5 = r4 | 6
            goto L_0x0033
        L_0x0023:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0032
            boolean r5 = r15.F(r1)
            if (r5 == 0) goto L_0x002f
            r5 = r0
            goto L_0x0030
        L_0x002f:
            r5 = r13
        L_0x0030:
            r5 = r5 | r4
            goto L_0x0033
        L_0x0032:
            r5 = r4
        L_0x0033:
            r6 = r37 & 2
            r7 = 32
            if (r6 == 0) goto L_0x003c
            r5 = r5 | 48
            goto L_0x004b
        L_0x003c:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x004b
            boolean r6 = r15.F(r2)
            if (r6 == 0) goto L_0x0048
            r6 = r7
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r5 = r5 | r6
        L_0x004b:
            r0 = r37 & 4
            if (r0 == 0) goto L_0x0054
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r6 = r34
            goto L_0x0066
        L_0x0054:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0051
            r6 = r34
            boolean r8 = r15.V(r6)
            if (r8 == 0) goto L_0x0063
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r5 = r5 | r8
        L_0x0066:
            r8 = r5 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0079
            boolean r8 = r15.l()
            if (r8 != 0) goto L_0x0073
            goto L_0x0079
        L_0x0073:
            r15.L()
            r3 = r15
            goto L_0x0260
        L_0x0079:
            if (r0 == 0) goto L_0x007e
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x007f
        L_0x007e:
            r0 = r6
        L_0x007f:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x008b
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.CategoryGridCard (CategoryGridCard.kt:41)"
            U0.C4895p.S(r3, r5, r6, r8)
        L_0x008b:
            tK.v r3 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r15, r6)
            long r17 = r3.l0()
            r20 = 2
            r21 = 0
            r19 = 0
            r16 = r0
            androidx.compose.ui.d r22 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            r3 = 712976548(0x2a7f28a4, float:2.266265E-13)
            r15.W(r3)
            r3 = r5 & 112(0x70, float:1.57E-43)
            r12 = 0
            if (r3 != r7) goto L_0x00b0
            r3 = r14
            goto L_0x00b1
        L_0x00b0:
            r3 = r12
        L_0x00b1:
            boolean r5 = r15.F(r1)
            r3 = r3 | r5
            java.lang.Object r5 = r15.D()
            if (r3 != 0) goto L_0x00c4
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x00cc
        L_0x00c4:
            zf.V r5 = new zf.V
            r5.<init>(r2, r1)
            r15.u(r5)
        L_0x00cc:
            r26 = r5
            nI.a r26 = (nI.C17631a) r26
            r15.P()
            r27 = 7
            r28 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.d.d(r22, r23, r24, r25, r26, r27, r28)
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r5.g()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$b r6 = r6.k()
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r15, r12)
            int r6 = U0.C4883j.a(r15, r12)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x010c
            U0.C4883j.c()
        L_0x010c:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x0119
            r15.p(r9)
            goto L_0x011c
        L_0x0119:
            r15.t()
        L_0x011c:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r5, r10)
            nI.p r5 = r8.e()
            U0.F1.c(r9, r7, r5)
            nI.p r5 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x0146
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x0154
        L_0x0146:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x0154:
            nI.p r5 = r8.d()
            U0.F1.c(r9, r3, r5)
            s0.h r3 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            java.lang.String r5 = "CATEGORY_CARD_IMAGE"
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r3, r5)
            r6 = 136(0x88, float:1.9E-43)
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r5, r6)
            r11 = 0
            r10 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r5, r11, r14, r10)
            com.ingka.ikea.core.model.Image r5 = r32.b()
            java.lang.String r5 = r5.getUrl()
            com.ingka.ikea.core.model.Image r6 = r32.b()
            java.lang.String r6 = r6.A0()
            E1.k$a r8 = E1.C4478k.f5915a
            E1.k r16 = r8.a()
            LC.b$a r8 = LC.C13178b.a.f111818a
            int r9 = LC.C13178b.a.f111819b
            int r9 = r9 << 9
            r17 = 196992(0x30180, float:2.76045E-40)
            r18 = r9 | r17
            r19 = 0
            r20 = 4048(0xfd0, float:5.672E-42)
            r9 = 0
            r17 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r10 = r16
            r11 = r17
            r12 = r21
            r13 = r22
            r14 = r23
            r34 = r15
            r15 = r24
            r16 = r25
            r17 = r34
            LC.h.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            U0.I0 r5 = androidx.compose.ui.platform.C5100f0.e()
            r6 = r34
            java.lang.Object r5 = r6.Q(r5)
            c2.d r5 = (c2.d) r5
            float r5 = r5.D1()
            double r7 = (double) r5
            r9 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r7 = 80
            if (r5 <= 0) goto L_0x01ee
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            r8 = 2
            r9 = 0
            r10 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.k(r3, r7, r9, r8, r10)
            r7 = 12
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r3, r7, r9, r8, r10)
            goto L_0x0205
        L_0x01ee:
            r8 = 2
            r9 = 0
            r10 = 0
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r3, r7)
            r7 = 24
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r3, r7, r9, r8, r10)
        L_0x0205:
            java.lang.String r24 = r32.d()
            TC.b$a$b r27 = TC.C13679b.a.C2856b.f116680a
            r7 = 3
            if (r5 <= 0) goto L_0x0215
            r5 = 2147483647(0x7fffffff, float:NaN)
            r31 = r5
        L_0x0213:
            r5 = 1
            goto L_0x0218
        L_0x0215:
            r31 = r7
            goto L_0x0213
        L_0x0218:
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r3, r9, r5, r10)
            r5 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.C(r3, r10, r5, r7, r10)
            java.lang.String r5 = "CATEGORY_CARD_TITLE"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r3, r5)
            r29 = 0
            r30 = 229368(0x37ff8, float:3.21413E-40)
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 48
            r5 = r24
            r3 = r6
            r6 = r27
            r24 = r31
            r27 = r3
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r3.x()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x025f
            U0.C4895p.R()
        L_0x025f:
            r6 = r0
        L_0x0260:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x0278
            zf.W r8 = new zf.W
            r0 = r8
            r1 = r32
            r2 = r33
            r3 = r6
            r4 = r36
            r5 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r8)
        L_0x0278:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.X.c(com.ingka.ikea.core.model.Category, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17642l lVar, Category category) {
        lVar.invoke(category);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(Category category, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(category, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
