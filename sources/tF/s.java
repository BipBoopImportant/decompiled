package Tf;

import J1.j;
import Oo.b;
import SC.A0;
import SC.C13659y0;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LTf/t;", "uiState", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "onClick", "c", "(LTf/t;Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "e", "(LU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s {
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(Tf.t r23, androidx.compose.ui.d r24, nI.C17631a<XH.C16807N> r25, U0.C4889m r26, int r27, int r28) {
        /*
            r1 = r23
            r0 = r25
            r15 = r27
            java.lang.String r2 = "uiState"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "onClick"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            r2 = -1273998972(0xffffffffb4105184, float:-1.34407E-7)
            r3 = r26
            U0.m r13 = r3.k(r2)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x0020
            r3 = r15 | 6
            goto L_0x0039
        L_0x0020:
            r3 = r15 & 6
            if (r3 != 0) goto L_0x0038
            r3 = r15 & 8
            if (r3 != 0) goto L_0x002d
            boolean r3 = r13.V(r1)
            goto L_0x0031
        L_0x002d:
            boolean r3 = r13.F(r1)
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r3 = 4
            goto L_0x0036
        L_0x0035:
            r3 = 2
        L_0x0036:
            r3 = r3 | r15
            goto L_0x0039
        L_0x0038:
            r3 = r15
        L_0x0039:
            r4 = r28 & 2
            if (r4 == 0) goto L_0x0042
            r3 = r3 | 48
        L_0x003f:
            r5 = r24
            goto L_0x0054
        L_0x0042:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x003f
            r5 = r24
            boolean r6 = r13.V(r5)
            if (r6 == 0) goto L_0x0051
            r6 = 32
            goto L_0x0053
        L_0x0051:
            r6 = 16
        L_0x0053:
            r3 = r3 | r6
        L_0x0054:
            r6 = r28 & 4
            if (r6 == 0) goto L_0x005b
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x006b
        L_0x005b:
            r6 = r15 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x006b
            boolean r6 = r13.F(r0)
            if (r6 == 0) goto L_0x0068
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r6 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r3 = r3 | r6
        L_0x006b:
            r6 = r3 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x0080
            boolean r6 = r13.l()
            if (r6 != 0) goto L_0x0078
            goto L_0x0080
        L_0x0078:
            r13.L()
            r2 = r5
            r19 = r13
            goto L_0x012f
        L_0x0080:
            if (r4 == 0) goto L_0x0086
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r10 = r4
            goto L_0x0087
        L_0x0086:
            r10 = r5
        L_0x0087:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0093
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.app.cart.discount.DiscountEntryContent (DiscountEntryContent.kt:31)"
            U0.C4895p.S(r2, r3, r4, r5)
        L_0x0093:
            boolean r2 = r23.b()
            if (r2 == 0) goto L_0x009c
            int r2 = tK.C18010a.f147426j
            goto L_0x009e
        L_0x009c:
            int r2 = tK.C18010a.f147429m
        L_0x009e:
            java.lang.String r4 = "DiscountEntry_CONTENT"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r10, r4)
            SC.c1$a r6 = new SC.c1$a
            int r17 = uK.C18146a.f148481i3
            r5 = 0
            long r7 = J1.b.a(r2, r13, r5)
            p1.v0 r20 = p1.C5747v0.k(r7)
            r21 = 4
            r22 = 0
            r18 = 0
            r19 = 0
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22)
            SC.g1 r19 = SC.C13589g1.Large
            IC.e r2 = r23.d()
            int r5 = IC.C13023e.f110931a
            java.lang.String r2 = r2.a(r13, r5)
            boolean r20 = r23.b()
            SC.b1$d r7 = SC.C13569b1.d.f116148b
            IC.e r8 = r23.a()
            r9 = 2140821387(0x7f9a578b, float:NaN)
            r13.W(r9)
            r9 = 0
            if (r8 != 0) goto L_0x00df
            r5 = r9
            goto L_0x00e3
        L_0x00df:
            java.lang.String r5 = r8.a(r13, r5)
        L_0x00e3:
            r13.P()
            boolean r8 = r23.c()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r8)
            if (r8 == 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r11 = r9
        L_0x00f2:
            if (r11 == 0) goto L_0x00fb
            Tf.a r8 = Tf.a.f63892a
            nI.p r8 = r8.a()
            r9 = r8
        L_0x00fb:
            int r3 = r3 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r8 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r8
            int r8 = SC.C13573c1.a.f116164f
            int r8 = r8 << 12
            r3 = r3 | r8
            int r8 = SC.C13569b1.d.f116149c
            int r8 = r8 << 15
            r16 = r3 | r8
            r17 = 6
            r18 = 4672(0x1240, float:6.547E-42)
            r8 = 0
            r11 = 0
            r12 = 1
            r14 = 0
            r3 = r25
            r21 = r10
            r10 = r19
            r19 = r13
            r13 = r20
            r15 = r19
            SC.C13585f1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x012d
            U0.C4895p.R()
        L_0x012d:
            r2 = r21
        L_0x012f:
            U0.Y0 r6 = r19.n()
            if (r6 == 0) goto L_0x0146
            Tf.q r7 = new Tf.q
            r0 = r7
            r1 = r23
            r3 = r25
            r4 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Tf.s.c(Tf.t, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(t tVar, d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        c(tVar, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void e(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-1873607048);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1873607048, i10, -1, "com.ingka.ikea.app.cart.discount.FamilyRequiredWarning (DiscountEntryContent.kt:60)");
            }
            C13659y0.b(j.b(b.f84712m2, k10, 0), A0.Error, (d) null, k10, 48, 4);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new r(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(int i10, C4889m mVar, int i11) {
        e(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
