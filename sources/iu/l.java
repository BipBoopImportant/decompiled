package Iu;

import Hu.a;
import Hu.b;
import U0.A1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u0002"}, d2 = {"Lkotlin/Function1;", "LIu/m;", "LXH/N;", "onResult", "LHu/b;", "viewModel", "d", "(LnI/l;LHu/b;LU0/m;II)V", "LHu/a;", "state", "wayfinding-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(nI.C17642l<? super Iu.m, XH.C16807N> r16, Hu.b r17, U0.C4889m r18, int r19, int r20) {
        /*
            r0 = r16
            r1 = r19
            r2 = r20
            java.lang.String r3 = "onResult"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = -761974416(0xffffffffd2953170, float:-3.20389775E11)
            r4 = r18
            U0.m r12 = r4.k(r3)
            r4 = r2 & 1
            r13 = 4
            if (r4 == 0) goto L_0x001c
            r4 = r1 | 6
            goto L_0x002c
        L_0x001c:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x002b
            boolean r4 = r12.F(r0)
            if (r4 == 0) goto L_0x0028
            r4 = r13
            goto L_0x0029
        L_0x0028:
            r4 = 2
        L_0x0029:
            r4 = r4 | r1
            goto L_0x002c
        L_0x002b:
            r4 = r1
        L_0x002c:
            r5 = r1 & 48
            if (r5 != 0) goto L_0x0046
            r5 = r2 & 2
            if (r5 != 0) goto L_0x003f
            r5 = r17
            boolean r6 = r12.F(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x003f:
            r5 = r17
        L_0x0041:
            r6 = 16
        L_0x0043:
            r4 = r4 | r6
        L_0x0044:
            r14 = r4
            goto L_0x0049
        L_0x0046:
            r5 = r17
            goto L_0x0044
        L_0x0049:
            r4 = r14 & 19
            r6 = 18
            if (r4 != r6) goto L_0x005c
            boolean r4 = r12.l()
            if (r4 != 0) goto L_0x0056
            goto L_0x005c
        L_0x0056:
            r12.L()
            r11 = r5
            goto L_0x014e
        L_0x005c:
            r12.G()
            r4 = r1 & 1
            r15 = 0
            if (r4 == 0) goto L_0x0076
            boolean r4 = r12.O()
            if (r4 == 0) goto L_0x006b
            goto L_0x0076
        L_0x006b:
            r12.L()
            r4 = r2 & 2
            if (r4 == 0) goto L_0x0074
            r14 = r14 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0074:
            r11 = r5
            goto L_0x00c4
        L_0x0076:
            r4 = r2 & 2
            if (r4 == 0) goto L_0x0074
            r4 = 1890788296(0x70b323c8, float:4.435286E29)
            r12.C(r4)
            m3.a r4 = m3.a.f26247a
            int r5 = m3.a.f26249c
            androidx.lifecycle.k0 r5 = r4.a(r12, r5)
            if (r5 == 0) goto L_0x00bc
            androidx.lifecycle.i0$c r7 = f3.a.a(r5, r12, r15)
            r4 = 1729797275(0x671a9c9b, float:7.301333E23)
            r12.C(r4)
            boolean r4 = r5 instanceof androidx.lifecycle.C5212o
            if (r4 == 0) goto L_0x00a1
            r4 = r5
            androidx.lifecycle.o r4 = (androidx.lifecycle.C5212o) r4
            l3.a r4 = r4.getDefaultViewModelCreationExtras()
        L_0x009f:
            r8 = r4
            goto L_0x00a4
        L_0x00a1:
            l3.a$a r4 = l3.a.C0407a.f25486b
            goto L_0x009f
        L_0x00a4:
            r10 = 36936(0x9048, float:5.1758E-41)
            r11 = 0
            java.lang.Class<Hu.b> r4 = Hu.b.class
            r6 = 0
            r9 = r12
            androidx.lifecycle.f0 r4 = m3.c.b(r4, r5, r6, r7, r8, r9, r10, r11)
            r12.U()
            r12.U()
            Hu.b r4 = (Hu.b) r4
            r14 = r14 & -113(0xffffffffffffff8f, float:NaN)
            r11 = r4
            goto L_0x00c4
        L_0x00bc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x00c4:
            r12.y()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00d3
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.instore.wayfinding.impl.onboarding.ui.OnboardingDestination (OnboardingDestination.kt:18)"
            U0.C4895p.S(r3, r14, r4, r5)
        L_0x00d3:
            TJ.P r4 = r11.getState()
            r9 = 0
            r10 = 7
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = r12
            U0.A1 r3 = j3.a.c(r4, r5, r6, r7, r8, r9, r10)
            Hu.a r3 = e(r3)
            boolean r4 = r3 instanceof Hu.a.C1600a
            if (r4 == 0) goto L_0x013d
            Hu.a$a r3 = (Hu.a.C1600a) r3
            r4 = 1905314491(0x7190cabb, float:1.4339497E30)
            r12.W(r4)
            r4 = r14 & 14
            r5 = 1
            if (r4 != r13) goto L_0x00f8
            r6 = r5
            goto L_0x00f9
        L_0x00f8:
            r6 = r15
        L_0x00f9:
            java.lang.Object r7 = r12.D()
            if (r6 != 0) goto L_0x0107
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x010f
        L_0x0107:
            Iu.i r7 = new Iu.i
            r7.<init>(r0)
            r12.u(r7)
        L_0x010f:
            nI.a r7 = (nI.C17631a) r7
            r12.P()
            r6 = 1905316922(0x7190d43a, float:1.434317E30)
            r12.W(r6)
            if (r4 != r13) goto L_0x011d
            goto L_0x011e
        L_0x011d:
            r5 = r15
        L_0x011e:
            java.lang.Object r4 = r12.D()
            if (r5 != 0) goto L_0x012c
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x0134
        L_0x012c:
            Iu.j r4 = new Iu.j
            r4.<init>(r0)
            r12.u(r4)
        L_0x0134:
            nI.a r4 = (nI.C17631a) r4
            r12.P()
            Iu.h.e(r3, r7, r4, r12, r15)
            goto L_0x0145
        L_0x013d:
            Hu.a$b r4 = Hu.a.b.f81741a
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r3 == 0) goto L_0x015d
        L_0x0145:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x014e
            U0.C4895p.R()
        L_0x014e:
            U0.Y0 r3 = r12.n()
            if (r3 == 0) goto L_0x015c
            Iu.k r4 = new Iu.k
            r4.<init>(r0, r11, r1, r2)
            r3.a(r4)
        L_0x015c:
            return
        L_0x015d:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Iu.l.d(nI.l, Hu.b, U0.m, int, int):void");
    }

    private static final a e(A1<? extends a> a12) {
        return (a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17642l lVar) {
        lVar.invoke(m.DISMISSED);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C17642l lVar) {
        lVar.invoke(m.FINISHED);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17642l lVar, b bVar, int i10, int i11, C4889m mVar, int i12) {
        d(lVar, bVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
