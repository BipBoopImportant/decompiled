package ci;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import com.ingka.ikea.core.model.product.Warning;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/core/model/product/Warning;", "warning", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Lcom/ingka/ikea/core/model/product/Warning;Landroidx/compose/ui/d;LU0/m;II)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class S {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f65837a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.ingka.ikea.core.model.product.WarningImageType[] r0 = com.ingka.ikea.core.model.product.WarningImageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.core.model.product.WarningImageType r1 = com.ingka.ikea.core.model.product.WarningImageType.TRIANGLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.core.model.product.WarningImageType r1 = com.ingka.ikea.core.model.product.WarningImageType.DOT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f65837a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ci.S.a.<clinit>():void");
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(com.ingka.ikea.core.model.product.Warning r57, androidx.compose.ui.d r58, U0.C4889m r59, int r60, int r61) {
        /*
            r0 = r57
            r1 = r60
            r2 = r61
            r3 = 48
            r4 = 6
            java.lang.String r5 = "warning"
            kotlin.jvm.internal.C17542s.j(r0, r5)
            r5 = 1231177487(0x4962470f, float:926832.94)
            r6 = r59
            U0.m r15 = r6.k(r5)
            r14 = 1
            r6 = r2 & 1
            r7 = 2
            if (r6 == 0) goto L_0x0020
            r6 = r1 | 6
            goto L_0x0030
        L_0x0020:
            r6 = r1 & 6
            if (r6 != 0) goto L_0x002f
            boolean r6 = r15.F(r0)
            if (r6 == 0) goto L_0x002c
            r6 = 4
            goto L_0x002d
        L_0x002c:
            r6 = r7
        L_0x002d:
            r6 = r6 | r1
            goto L_0x0030
        L_0x002f:
            r6 = r1
        L_0x0030:
            r8 = r2 & 2
            if (r8 == 0) goto L_0x0038
            r6 = r6 | r3
        L_0x0035:
            r9 = r58
            goto L_0x004a
        L_0x0038:
            r9 = r1 & 48
            if (r9 != 0) goto L_0x0035
            r9 = r58
            boolean r10 = r15.V(r9)
            if (r10 == 0) goto L_0x0047
            r10 = 32
            goto L_0x0049
        L_0x0047:
            r10 = 16
        L_0x0049:
            r6 = r6 | r10
        L_0x004a:
            r10 = r6 & 19
            r11 = 18
            if (r10 != r11) goto L_0x005d
            boolean r10 = r15.l()
            if (r10 != 0) goto L_0x0057
            goto L_0x005d
        L_0x0057:
            r15.L()
            r4 = r15
            goto L_0x0243
        L_0x005d:
            if (r8 == 0) goto L_0x0063
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r13 = r8
            goto L_0x0064
        L_0x0063:
            r13 = r9
        L_0x0064:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0070
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.app.productinformationpage.v2.compose.WarningComposable (WarningComposable.kt:34)"
            U0.C4895p.S(r5, r6, r8, r9)
        L_0x0070:
            com.ingka.ikea.core.model.product.WarningMoreInfo r5 = r57.d()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$c r6 = r6.i()
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r8 = r8.f()
            E1.I r3 = androidx.compose.foundation.layout.G.b(r8, r6, r15, r3)
            r12 = 0
            int r6 = U0.C4883j.a(r15, r12)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r15, r13)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x00a0
            U0.C4883j.c()
        L_0x00a0:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x00ad
            r15.p(r11)
            goto L_0x00b0
        L_0x00ad:
            r15.t()
        L_0x00b0:
            U0.m r11 = U0.F1.a(r15)
            nI.p r4 = r10.c()
            U0.F1.c(r11, r3, r4)
            nI.p r3 = r10.e()
            U0.F1.c(r11, r8, r3)
            nI.p r3 = r10.b()
            boolean r4 = r11.i()
            if (r4 != 0) goto L_0x00da
            java.lang.Object r4 = r11.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r8)
            if (r4 != 0) goto L_0x00e8
        L_0x00da:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r11.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r11.w(r4, r3)
        L_0x00e8:
            nI.p r3 = r10.d()
            U0.F1.c(r11, r9, r3)
            s0.N r3 = s0.C5843N.f28726a
            com.ingka.ikea.core.model.product.WarningImageType r3 = r57.c()
            int[] r4 = ci.S.a.f65837a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            if (r3 == r14) goto L_0x010a
            if (r3 != r7) goto L_0x0104
            int r3 = uK.C18146a.f148220R5
            goto L_0x010c
        L_0x0104:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x010a:
            int r3 = uK.C18146a.f148718xd
        L_0x010c:
            t1.c r6 = J1.e.c(r3, r15, r12)
            tK.v r3 = tK.C18030v.f147664a
            int r4 = tK.C18030v.f147665b
            tK.h r7 = r3.a(r15, r4)
            long r9 = r7.H0()
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            r7 = 20
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.t(r11, r7)
            r17 = 432(0x1b0, float:6.05E-43)
            r18 = 0
            r7 = 0
            r14 = r11
            r11 = r15
            r12 = r17
            r33 = r13
            r13 = r18
            O0.V.a(r6, r7, r8, r9, r11, r12, r13)
            r6 = 8
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.t(r14, r6)
            r7 = 6
            s0.C5844O.a(r6, r15, r7)
            N1.d$a r6 = new N1.d$a
            r7 = 0
            r8 = 1
            r9 = 0
            r6.<init>(r9, r8, r7)
            java.lang.String r7 = r57.b()
            if (r7 == 0) goto L_0x01b1
            N1.G r7 = new N1.G
            S1.C$a r8 = S1.C.f13316b
            S1.C r39 = r8.a()
            if (r5 == 0) goto L_0x0169
            Y1.k$a r8 = Y1.k.f14792b
            Y1.k r8 = r8.d()
        L_0x0166:
            r51 = r8
            goto L_0x0170
        L_0x0169:
            Y1.k$a r8 = Y1.k.f14792b
            Y1.k r8 = r8.c()
            goto L_0x0166
        L_0x0170:
            r55 = 61435(0xeffb, float:8.6089E-41)
            r56 = 0
            r35 = 0
            r37 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r34 = r7
            r34.<init>(r35, r37, r39, r40, r41, r42, r43, r44, r46, r47, r48, r49, r51, r52, r53, r54, r55, r56)
            int r7 = r6.p(r7)
            java.lang.String r8 = r57.b()     // Catch:{ all -> 0x01ac }
            r6.append(r8)     // Catch:{ all -> 0x01ac }
            java.lang.String r8 = " "
            r6.j(r8)     // Catch:{ all -> 0x01ac }
            XH.N r8 = XH.C16807N.f139792a     // Catch:{ all -> 0x01ac }
            r6.m(r7)
            goto L_0x01b1
        L_0x01ac:
            r0 = move-exception
            r6.m(r7)
            throw r0
        L_0x01b1:
            N1.G r7 = new N1.G
            if (r5 == 0) goto L_0x01be
            Y1.k$a r5 = Y1.k.f14792b
            Y1.k r5 = r5.d()
        L_0x01bb:
            r51 = r5
            goto L_0x01c5
        L_0x01be:
            Y1.k$a r5 = Y1.k.f14792b
            Y1.k r5 = r5.c()
            goto L_0x01bb
        L_0x01c5:
            r55 = 61439(0xefff, float:8.6094E-41)
            r56 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r34 = r7
            r34.<init>(r35, r37, r39, r40, r41, r42, r43, r44, r46, r47, r48, r49, r51, r52, r53, r54, r55, r56)
            int r5 = r6.p(r7)
            java.lang.String r7 = r57.e()     // Catch:{ all -> 0x0252 }
            r6.j(r7)     // Catch:{ all -> 0x0252 }
            XH.N r7 = XH.C16807N.f139792a     // Catch:{ all -> 0x0252 }
            r6.m(r5)
            N1.d r6 = r6.q()
            TC.b$a$c r7 = TC.C13679b.a.c.f116681a
            tK.h r3 = r3.a(r15, r4)
            long r9 = r3.H0()
            r31 = 0
            r32 = 524276(0x7fff4, float:7.34667E-40)
            r8 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r3 = 0
            r4 = r15
            r15 = r3
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 48
            r29 = r4
            SC.C13607l.h(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r4.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0241
            U0.C4895p.R()
        L_0x0241:
            r9 = r33
        L_0x0243:
            U0.Y0 r3 = r4.n()
            if (r3 == 0) goto L_0x0251
            ci.Q r4 = new ci.Q
            r4.<init>(r0, r9, r1, r2)
            r3.a(r4)
        L_0x0251:
            return
        L_0x0252:
            r0 = move-exception
            r6.m(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.S.b(com.ingka.ikea.core.model.product.Warning, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(Warning warning, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(warning, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
