package Tt;

import Rt.b;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import x4.C8948l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lx4/l;", "navBackStackEntry", "Lkotlin/Function0;", "LXH/N;", "onCloseClicked", "Lkotlin/Function2;", "", "onTimeSlotsClicked", "onLoginClicked", "onUpgradeClicked", "onRegisterClicked", "LRt/e;", "viewModel", "e", "(Lx4/l;LnI/a;LnI/p;LnI/a;LnI/a;LnI/p;LRt/e;LU0/m;II)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0247  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(x4.C8948l r22, nI.C17631a<XH.C16807N> r23, nI.p<? super java.lang.String, ? super java.lang.String, XH.C16807N> r24, nI.C17631a<XH.C16807N> r25, nI.C17631a<XH.C16807N> r26, nI.p<? super java.lang.String, ? super java.lang.String, XH.C16807N> r27, Rt.e r28, U0.C4889m r29, int r30, int r31) {
        /*
            r1 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            r15 = r30
            java.lang.String r0 = "navBackStackEntry"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onCloseClicked"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onTimeSlotsClicked"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onLoginClicked"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onUpgradeClicked"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onRegisterClicked"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = 1729889378(0x671c0462, float:7.3677E23)
            r2 = r29
            U0.m r9 = r2.k(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x003c
            r2 = r15 | 6
            goto L_0x004c
        L_0x003c:
            r2 = r15 & 6
            if (r2 != 0) goto L_0x004b
            boolean r2 = r9.F(r1)
            if (r2 == 0) goto L_0x0048
            r2 = 4
            goto L_0x0049
        L_0x0048:
            r2 = 2
        L_0x0049:
            r2 = r2 | r15
            goto L_0x004c
        L_0x004b:
            r2 = r15
        L_0x004c:
            r3 = r31 & 2
            if (r3 == 0) goto L_0x0053
            r2 = r2 | 48
            goto L_0x0063
        L_0x0053:
            r3 = r15 & 48
            if (r3 != 0) goto L_0x0063
            boolean r3 = r9.F(r10)
            if (r3 == 0) goto L_0x0060
            r3 = 32
            goto L_0x0062
        L_0x0060:
            r3 = 16
        L_0x0062:
            r2 = r2 | r3
        L_0x0063:
            r3 = r31 & 4
            r8 = 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x006c
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x007b
        L_0x006c:
            r3 = r15 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x007b
            boolean r3 = r9.F(r11)
            if (r3 == 0) goto L_0x0078
            r3 = r8
            goto L_0x007a
        L_0x0078:
            r3 = 128(0x80, float:1.794E-43)
        L_0x007a:
            r2 = r2 | r3
        L_0x007b:
            r3 = r31 & 8
            if (r3 == 0) goto L_0x0082
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0092
        L_0x0082:
            r3 = r15 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0092
            boolean r3 = r9.F(r12)
            if (r3 == 0) goto L_0x008f
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0091
        L_0x008f:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0091:
            r2 = r2 | r3
        L_0x0092:
            r3 = r31 & 16
            if (r3 == 0) goto L_0x0099
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a9
        L_0x0099:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x00a9
            boolean r3 = r9.F(r13)
            if (r3 == 0) goto L_0x00a6
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r2 = r2 | r3
        L_0x00a9:
            r3 = r31 & 32
            r7 = 131072(0x20000, float:1.83671E-40)
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00b3
            r2 = r2 | r4
            goto L_0x00c2
        L_0x00b3:
            r3 = r15 & r4
            if (r3 != 0) goto L_0x00c2
            boolean r3 = r9.F(r14)
            if (r3 == 0) goto L_0x00bf
            r3 = r7
            goto L_0x00c1
        L_0x00bf:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r2 = r2 | r3
        L_0x00c2:
            r3 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 & r15
            if (r3 != 0) goto L_0x00de
            r3 = r31 & 64
            if (r3 != 0) goto L_0x00d6
            r3 = r28
            boolean r4 = r9.F(r3)
            if (r4 == 0) goto L_0x00d8
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d6:
            r3 = r28
        L_0x00d8:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r2 = r2 | r4
        L_0x00db:
            r16 = r2
            goto L_0x00e1
        L_0x00de:
            r3 = r28
            goto L_0x00db
        L_0x00e1:
            r2 = 599187(0x92493, float:8.3964E-40)
            r2 = r16 & r2
            r4 = 599186(0x92492, float:8.39638E-40)
            if (r2 != r4) goto L_0x00fa
            boolean r2 = r9.l()
            if (r2 != 0) goto L_0x00f2
            goto L_0x00fa
        L_0x00f2:
            r9.L()
            r7 = r3
            r16 = r9
            goto L_0x024c
        L_0x00fa:
            r9.G()
            r2 = r15 & 1
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r6 = 0
            if (r2 == 0) goto L_0x0123
            boolean r2 = r9.O()
            if (r2 == 0) goto L_0x010c
            goto L_0x0123
        L_0x010c:
            r9.L()
            r2 = r31 & 64
            if (r2 == 0) goto L_0x011e
            r16 = r16 & r17
            r21 = r6
            r29 = r9
            r2 = r16
            r9 = r3
            goto L_0x0181
        L_0x011e:
            r21 = r6
            r29 = r9
            goto L_0x017f
        L_0x0123:
            r2 = r31 & 64
            if (r2 == 0) goto L_0x011e
            r2 = 1890788296(0x70b323c8, float:4.435286E29)
            r9.C(r2)
            m3.a r2 = m3.a.f26247a
            int r3 = m3.a.f26249c
            androidx.lifecycle.k0 r3 = r2.a(r9, r3)
            if (r3 == 0) goto L_0x0177
            androidx.lifecycle.i0$c r5 = f3.a.a(r3, r9, r6)
            r2 = 1729797275(0x671a9c9b, float:7.301333E23)
            r9.C(r2)
            boolean r2 = r3 instanceof androidx.lifecycle.C5212o
            if (r2 == 0) goto L_0x014f
            r2 = r3
            androidx.lifecycle.o r2 = (androidx.lifecycle.C5212o) r2
            l3.a r2 = r2.getDefaultViewModelCreationExtras()
        L_0x014c:
            r18 = r2
            goto L_0x0152
        L_0x014f:
            l3.a$a r2 = l3.a.C0407a.f25486b
            goto L_0x014c
        L_0x0152:
            r19 = 36936(0x9048, float:5.1758E-41)
            r20 = 0
            java.lang.Class<Rt.e> r2 = Rt.e.class
            r4 = 0
            r21 = r6
            r6 = r18
            r7 = r9
            r8 = r19
            r29 = r9
            r9 = r20
            androidx.lifecycle.f0 r2 = m3.c.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r29.U()
            r29.U()
            Rt.e r2 = (Rt.e) r2
            r16 = r16 & r17
            r9 = r2
        L_0x0174:
            r2 = r16
            goto L_0x0181
        L_0x0177:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x017f:
            r9 = r3
            goto L_0x0174
        L_0x0181:
            r29.y()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0190
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.instore.impl.storeevents.details.ui.StoreEventDetailsDestination (StoreEventDetailsDestination.kt:23)"
            U0.C4895p.S(r0, r2, r3, r4)
        L_0x0190:
            r0 = -1745209475(0xffffffff97fa377d, float:-1.6169879E-24)
            r8 = r29
            r8.W(r0)
            boolean r0 = r8.F(r9)
            java.lang.Object r3 = r8.D()
            if (r0 != 0) goto L_0x01aa
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x01b2
        L_0x01aa:
            Tt.a r3 = new Tt.a
            r3.<init>(r9)
            r8.u(r3)
        L_0x01b2:
            nI.l r3 = (nI.C17642l) r3
            r8.P()
            r0 = r2 & 14
            r0 = r0 | 48
            java.lang.String r4 = "StoreEventScheduleTimeSlotRequestKey"
            qw.l.c(r1, r4, r3, r8, r0)
            r0 = -1745202512(0xffffffff97fa52b0, float:-1.6176745E-24)
            r8.W(r0)
            boolean r0 = r8.F(r9)
            r3 = r2 & 896(0x380, float:1.256E-42)
            r6 = 1
            r4 = 256(0x100, float:3.59E-43)
            if (r3 != r4) goto L_0x01d3
            r3 = r6
            goto L_0x01d5
        L_0x01d3:
            r3 = r21
        L_0x01d5:
            r0 = r0 | r3
            java.lang.Object r3 = r8.D()
            if (r0 != 0) goto L_0x01e4
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x01ec
        L_0x01e4:
            Tt.b r3 = new Tt.b
            r3.<init>(r9, r11)
            r8.u(r3)
        L_0x01ec:
            r4 = r3
            nI.a r4 = (nI.C17631a) r4
            r8.P()
            r0 = -1745194746(0xffffffff97fa7106, float:-1.6184402E-24)
            r8.W(r0)
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r2
            r3 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r3) goto L_0x0200
            goto L_0x0202
        L_0x0200:
            r6 = r21
        L_0x0202:
            boolean r0 = r8.F(r9)
            r0 = r0 | r6
            java.lang.Object r3 = r8.D()
            if (r0 != 0) goto L_0x0215
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x021d
        L_0x0215:
            Tt.c r3 = new Tt.c
            r3.<init>(r14, r9)
            r8.u(r3)
        L_0x021d:
            r7 = r3
            nI.l r7 = (nI.C17642l) r7
            r8.P()
            int r0 = r2 >> 18
            r0 = r0 & 14
            r3 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r3
            r0 = r0 | r2
            r2 = r9
            r3 = r23
            r5 = r25
            r6 = r26
            r16 = r8
            r17 = r9
            r9 = r0
            Tt.w.E(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x024a
            U0.C4895p.R()
        L_0x024a:
            r7 = r17
        L_0x024c:
            U0.Y0 r9 = r16.n()
            if (r9 == 0) goto L_0x026d
            Tt.d r8 = new Tt.d
            r0 = r8
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r10 = r8
            r8 = r30
            r11 = r9
            r9 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.a(r10)
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Tt.e.e(x4.l, nI.a, nI.p, nI.a, nI.a, nI.p, Rt.e, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(Rt.e eVar, String str) {
        C17542s.j(str, "it");
        eVar.b(new b.d(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(Rt.e eVar, p pVar) {
        pVar.invoke(eVar.F(), eVar.H());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(p pVar, Rt.e eVar, String str) {
        C17542s.j(str, "timeSlotId");
        pVar.invoke(eVar.F(), str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C8948l lVar, C17631a aVar, p pVar, C17631a aVar2, C17631a aVar3, p pVar2, Rt.e eVar, int i10, int i11, C4889m mVar, int i12) {
        e(lVar, aVar, pVar, aVar2, aVar3, pVar2, eVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
