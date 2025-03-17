package eu;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import cu.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ae\u0010\u000b\u001a\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/Function1;", "", "LXH/N;", "onBackClicked", "Lkotlin/Function0;", "onLoginClicked", "onUpgradeClicked", "Lkotlin/Function2;", "onRegisterClicked", "Lcu/e;", "viewModel", "c", "(LnI/l;LnI/a;LnI/a;LnI/p;Lcu/e;LU0/m;II)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: nI.l} */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ca, code lost:
        if ((r28 & 16) != 0) goto L_0x00cc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x017c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(nI.C17642l<? super java.lang.String, XH.C16807N> r21, nI.C17631a<XH.C16807N> r22, nI.C17631a<XH.C16807N> r23, nI.p<? super java.lang.String, ? super java.lang.String, XH.C16807N> r24, cu.e r25, U0.C4889m r26, int r27, int r28) {
        /*
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r27
            java.lang.String r0 = "onBackClicked"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "onLoginClicked"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "onUpgradeClicked"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "onRegisterClicked"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            r0 = 634740401(0x25d55eb1, float:3.7013775E-16)
            r1 = r26
            U0.m r6 = r1.k(r0)
            r1 = r28 & 1
            if (r1 == 0) goto L_0x002e
            r1 = r11 | 6
            goto L_0x003e
        L_0x002e:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x003d
            boolean r1 = r6.F(r7)
            if (r1 == 0) goto L_0x003a
            r1 = 4
            goto L_0x003b
        L_0x003a:
            r1 = 2
        L_0x003b:
            r1 = r1 | r11
            goto L_0x003e
        L_0x003d:
            r1 = r11
        L_0x003e:
            r2 = r28 & 2
            if (r2 == 0) goto L_0x0045
            r1 = r1 | 48
            goto L_0x0055
        L_0x0045:
            r2 = r11 & 48
            if (r2 != 0) goto L_0x0055
            boolean r2 = r6.F(r8)
            if (r2 == 0) goto L_0x0052
            r2 = 32
            goto L_0x0054
        L_0x0052:
            r2 = 16
        L_0x0054:
            r1 = r1 | r2
        L_0x0055:
            r2 = r28 & 4
            if (r2 == 0) goto L_0x005c
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x005c:
            r2 = r11 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x006c
            boolean r2 = r6.F(r9)
            if (r2 == 0) goto L_0x0069
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r2 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r1 = r1 | r2
        L_0x006c:
            r2 = r28 & 8
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0075
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0075:
            r2 = r11 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0084
            boolean r2 = r6.F(r10)
            if (r2 == 0) goto L_0x0081
            r2 = r3
            goto L_0x0083
        L_0x0081:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r1 = r1 | r2
        L_0x0084:
            r2 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x009d
            r2 = r28 & 16
            if (r2 != 0) goto L_0x0097
            r2 = r25
            boolean r4 = r6.F(r2)
            if (r4 == 0) goto L_0x0099
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0097:
            r2 = r25
        L_0x0099:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r1 = r1 | r4
            goto L_0x009f
        L_0x009d:
            r2 = r25
        L_0x009f:
            r4 = r1 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r5) goto L_0x00b3
            boolean r4 = r6.l()
            if (r4 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            r6.L()
            r5 = r2
            r14 = r6
            goto L_0x0180
        L_0x00b3:
            r6.G()
            r4 = r11 & 1
            r5 = 0
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            if (r4 == 0) goto L_0x00d0
            boolean r4 = r6.O()
            if (r4 == 0) goto L_0x00c5
            goto L_0x00d0
        L_0x00c5:
            r6.L()
            r4 = r28 & 16
            if (r4 == 0) goto L_0x00ce
        L_0x00cc:
            r1 = r1 & r20
        L_0x00ce:
            r12 = r2
            goto L_0x011e
        L_0x00d0:
            r4 = r28 & 16
            if (r4 == 0) goto L_0x00ce
            r2 = 1890788296(0x70b323c8, float:4.435286E29)
            r6.C(r2)
            m3.a r2 = m3.a.f26247a
            int r4 = m3.a.f26249c
            androidx.lifecycle.k0 r13 = r2.a(r6, r4)
            if (r13 == 0) goto L_0x0116
            androidx.lifecycle.i0$c r15 = f3.a.a(r13, r6, r5)
            r2 = 1729797275(0x671a9c9b, float:7.301333E23)
            r6.C(r2)
            boolean r2 = r13 instanceof androidx.lifecycle.C5212o
            if (r2 == 0) goto L_0x00fc
            r2 = r13
            androidx.lifecycle.o r2 = (androidx.lifecycle.C5212o) r2
            l3.a r2 = r2.getDefaultViewModelCreationExtras()
        L_0x00f9:
            r16 = r2
            goto L_0x00ff
        L_0x00fc:
            l3.a$a r2 = l3.a.C0407a.f25486b
            goto L_0x00f9
        L_0x00ff:
            r18 = 36936(0x9048, float:5.1758E-41)
            r19 = 0
            java.lang.Class<cu.e> r12 = cu.e.class
            r14 = 0
            r17 = r6
            androidx.lifecycle.f0 r2 = m3.c.b(r12, r13, r14, r15, r16, r17, r18, r19)
            r6.U()
            r6.U()
            cu.e r2 = (cu.e) r2
            goto L_0x00cc
        L_0x0116:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x011e:
            r6.y()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x012d
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.instore.impl.storeevents.schedule.ui.StoreEventScheduleDestination (StoreEventScheduleDestination.kt:17)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x012d:
            r0 = -166708018(0xfffffffff6103cce, float:-7.313711E32)
            r6.W(r0)
            r0 = r1 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != r3) goto L_0x0138
            r5 = 1
        L_0x0138:
            boolean r0 = r6.F(r12)
            r0 = r0 | r5
            java.lang.Object r2 = r6.D()
            if (r0 != 0) goto L_0x014b
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0153
        L_0x014b:
            eu.a r2 = new eu.a
            r2.<init>(r10, r12)
            r6.u(r2)
        L_0x0153:
            r4 = r2
            nI.l r4 = (nI.C17642l) r4
            r6.P()
            int r0 = r1 >> 12
            r0 = r0 & 14
            int r1 = r1 << 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r13 = r0 | r1
            r0 = r12
            r1 = r21
            r2 = r22
            r3 = r23
            r5 = r6
            r14 = r6
            r6 = r13
            eu.r.q(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x017f
            U0.C4895p.R()
        L_0x017f:
            r5 = r12
        L_0x0180:
            U0.Y0 r12 = r14.n()
            if (r12 == 0) goto L_0x019b
            eu.b r13 = new eu.b
            r0 = r13
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r6 = r27
            r7 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r12.a(r13)
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eu.c.c(nI.l, nI.a, nI.a, nI.p, cu.e, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(p pVar, e eVar, String str) {
        C17542s.j(str, "timeSlotId");
        pVar.invoke(eVar.F(), str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17642l lVar, C17631a aVar, C17631a aVar2, p pVar, e eVar, int i10, int i11, C4889m mVar, int i12) {
        c(lVar, aVar, aVar2, pVar, eVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
