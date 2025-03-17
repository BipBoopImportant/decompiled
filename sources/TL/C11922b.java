package tl;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltl/c;", "initialSelectedTab", "Lkotlin/Function1;", "LXH/N;", "onTabSelected", "Landroidx/compose/ui/d;", "modifier", "b", "(Ltl/c;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: tl.b  reason: case insensitive filesystem */
public final class C11922b {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(tl.C11923c r22, nI.C17642l<? super tl.C11923c, XH.C16807N> r23, androidx.compose.ui.d r24, U0.C4889m r25, int r26, int r27) {
        /*
            r10 = r22
            r11 = r23
            r12 = r26
            java.lang.String r0 = "initialSelectedTab"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onTabSelected"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 1660862757(0x62fec125, float:2.3496953E21)
            r1 = r25
            U0.m r13 = r1.k(r0)
            r1 = r27 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0021
            r1 = r12 | 6
            goto L_0x0031
        L_0x0021:
            r1 = r12 & 6
            if (r1 != 0) goto L_0x0030
            boolean r1 = r13.V(r10)
            if (r1 == 0) goto L_0x002d
            r1 = 4
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            r1 = r1 | r12
            goto L_0x0031
        L_0x0030:
            r1 = r12
        L_0x0031:
            r3 = r27 & 2
            r4 = 16
            if (r3 == 0) goto L_0x003a
            r1 = r1 | 48
            goto L_0x0049
        L_0x003a:
            r3 = r12 & 48
            if (r3 != 0) goto L_0x0049
            boolean r3 = r13.F(r11)
            if (r3 == 0) goto L_0x0047
            r3 = 32
            goto L_0x0048
        L_0x0047:
            r3 = r4
        L_0x0048:
            r1 = r1 | r3
        L_0x0049:
            r3 = r27 & 4
            if (r3 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r5 = r24
            goto L_0x0064
        L_0x0052:
            r5 = r12 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004f
            r5 = r24
            boolean r6 = r13.V(r5)
            if (r6 == 0) goto L_0x0061
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r6
        L_0x0064:
            r6 = r1 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x0077
            boolean r6 = r13.l()
            if (r6 != 0) goto L_0x0071
            goto L_0x0077
        L_0x0071:
            r13.L()
            r3 = r5
            goto L_0x0103
        L_0x0077:
            if (r3 == 0) goto L_0x007d
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r14 = r3
            goto L_0x007e
        L_0x007d:
            r14 = r5
        L_0x007e:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x008a
            r3 = -1
            java.lang.String r5 = "com.ingka.ikea.app.uicomposables.dualbag.DualBagSegmentedController (DualBagSegmentedController.kt:40)"
            U0.C4895p.S(r0, r1, r3, r5)
        L_0x008a:
            java.lang.String r0 = "SEGMENTED_CONTROLLER"
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r14, r0)
            float r3 = (float) r4
            float r3 = c2.h.B(r3)
            r4 = 0
            r5 = 0
            androidx.compose.ui.d r15 = androidx.compose.foundation.layout.D.k(r0, r3, r4, r2, r5)
            r0 = 8
            float r0 = (float) r0
            float r19 = c2.h.B(r0)
            r20 = 7
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r15, r16, r17, r18, r19, r20, r21)
            SC.m2$a r0 = new SC.m2$a
            tl.c r4 = tl.C11923c.ONLINE
            int r3 = Oo.b.f84445M7
            r9 = 0
            java.lang.String r5 = J1.j.b(r3, r13, r9)
            r7 = 4
            r8 = 0
            r6 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            SC.m2$a r3 = new SC.m2$a
            tl.c r16 = tl.C11923c.STORE
            int r4 = Oo.b.f84455N7
            java.lang.String r17 = J1.j.b(r4, r13, r9)
            r19 = 4
            r20 = 0
            r18 = 0
            r15 = r3
            r15.<init>(r16, r17, r18, r19, r20)
            SC.m2$a[] r0 = new SC.C13614m2.a[]{r0, r3}
            KJ.f r0 = KJ.C15985a.b(r0)
            int r3 = SC.C13614m2.a.f116365d
            int r4 = r1 << 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            int r1 = r1 << 15
            r4 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r4
            r8 = r3 | r1
            r9 = 56
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r22
            r6 = r23
            r7 = r13
            SC.C13630q2.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0102
            U0.C4895p.R()
        L_0x0102:
            r3 = r14
        L_0x0103:
            U0.Y0 r6 = r13.n()
            if (r6 == 0) goto L_0x011a
            tl.a r7 = new tl.a
            r0 = r7
            r1 = r22
            r2 = r23
            r4 = r26
            r5 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.C11922b.b(tl.c, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C11923c cVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(cVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
