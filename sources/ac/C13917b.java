package aC;

import U0.A1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import bC.C14001b;
import bC.C14002c;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u0002"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onBackClicked", "onPopularTimesClicked", "LbC/c;", "viewModel", "b", "(LnI/a;LnI/a;LbC/c;LU0/m;II)V", "LbC/b;", "state", "storedetails-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: aC.b  reason: case insensitive filesystem */
public final class C13917b {
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007a, code lost:
        if ((r15 & 4) != 0) goto L_0x007c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(nI.C17631a<XH.C16807N> r10, nI.C17631a<XH.C16807N> r11, bC.C14002c r12, U0.C4889m r13, int r14, int r15) {
        /*
            java.lang.String r0 = "onBackClicked"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onPopularTimesClicked"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 656914086(0x2727b6a6, float:2.327492E-15)
            U0.m r13 = r13.k(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r14 | 6
            goto L_0x0028
        L_0x0018:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0027
            boolean r1 = r13.F(r10)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r14
            goto L_0x0028
        L_0x0027:
            r1 = r14
        L_0x0028:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            goto L_0x003f
        L_0x002f:
            r2 = r14 & 48
            if (r2 != 0) goto L_0x003f
            boolean r2 = r13.F(r11)
            if (r2 == 0) goto L_0x003c
            r2 = 32
            goto L_0x003e
        L_0x003c:
            r2 = 16
        L_0x003e:
            r1 = r1 | r2
        L_0x003f:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0053
            r2 = r15 & 4
            if (r2 != 0) goto L_0x0050
            boolean r2 = r13.V(r12)
            if (r2 == 0) goto L_0x0050
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0052
        L_0x0050:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0052:
            r1 = r1 | r2
        L_0x0053:
            r9 = r1
            r1 = r9 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 != r2) goto L_0x0067
            boolean r1 = r13.l()
            if (r1 != 0) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            r13.L()
        L_0x0064:
            r4 = r12
            goto L_0x00fe
        L_0x0067:
            r13.G()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x007f
            boolean r1 = r13.O()
            if (r1 == 0) goto L_0x0075
            goto L_0x007f
        L_0x0075:
            r13.L()
            r1 = r15 & 4
            if (r1 == 0) goto L_0x00cb
        L_0x007c:
            r9 = r9 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00cb
        L_0x007f:
            r1 = r15 & 4
            if (r1 == 0) goto L_0x00cb
            r12 = 1890788296(0x70b323c8, float:4.435286E29)
            r13.C(r12)
            m3.a r12 = m3.a.f26247a
            int r1 = m3.a.f26249c
            androidx.lifecycle.k0 r2 = r12.a(r13, r1)
            if (r2 == 0) goto L_0x00c3
            r12 = 0
            androidx.lifecycle.i0$c r4 = f3.a.a(r2, r13, r12)
            r12 = 1729797275(0x671a9c9b, float:7.301333E23)
            r13.C(r12)
            boolean r12 = r2 instanceof androidx.lifecycle.C5212o
            if (r12 == 0) goto L_0x00ab
            r12 = r2
            androidx.lifecycle.o r12 = (androidx.lifecycle.C5212o) r12
            l3.a r12 = r12.getDefaultViewModelCreationExtras()
        L_0x00a9:
            r5 = r12
            goto L_0x00ae
        L_0x00ab:
            l3.a$a r12 = l3.a.C0407a.f25486b
            goto L_0x00a9
        L_0x00ae:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<bC.d> r1 = bC.C14003d.class
            r3 = 0
            r6 = r13
            androidx.lifecycle.f0 r12 = m3.c.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.U()
            r13.U()
            bC.c r12 = (bC.C14002c) r12
            goto L_0x007c
        L_0x00c3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r10.<init>(r11)
            throw r10
        L_0x00cb:
            r13.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00da
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.storedetails.impl.openinghours.navigation.StoreDetailsAllOpeningHoursDestination (StoreDetailsAllOpeningHoursDestination.kt:23)"
            U0.C4895p.S(r0, r9, r1, r2)
        L_0x00da:
            TJ.P r1 = r12.getState()
            r6 = 0
            r7 = 7
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r13
            U0.A1 r0 = j3.a.c(r1, r2, r3, r4, r5, r6, r7)
            bC.b r0 = c(r0)
            int r1 = r9 << 3
            r1 = r1 & 1008(0x3f0, float:1.413E-42)
            cC.r.V(r0, r10, r11, r13, r1)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0064
            U0.C4895p.R()
            goto L_0x0064
        L_0x00fe:
            U0.Y0 r12 = r13.n()
            if (r12 == 0) goto L_0x0111
            aC.a r13 = new aC.a
            r1 = r13
            r2 = r10
            r3 = r11
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r12.a(r13)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aC.C13917b.b(nI.a, nI.a, bC.c, U0.m, int, int):void");
    }

    private static final C14001b c(A1<C14001b> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17631a aVar, C17631a aVar2, C14002c cVar, int i10, int i11, C4889m mVar, int i12) {
        b(aVar, aVar2, cVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
