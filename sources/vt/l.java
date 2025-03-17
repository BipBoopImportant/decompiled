package Vt;

import U0.C4889m;
import U0.M0;
import Ut.c;
import XH.C16807N;
import Xt.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\b\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "", "LXH/N;", "onEventDetailsClicked", "Lkotlin/Function0;", "onBackClicked", "LUt/c;", "viewModel", "c", "(LnI/l;LnI/a;LUt/c;LU0/m;II)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008b, code lost:
        if ((r23 & 4) != 0) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(nI.C17642l<? super java.lang.String, XH.C16807N> r18, nI.C17631a<XH.C16807N> r19, Ut.c r20, U0.C4889m r21, int r22, int r23) {
        /*
            r1 = r18
            r8 = r19
            r9 = r22
            java.lang.String r0 = "onEventDetailsClicked"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onBackClicked"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            r0 = -80941160(0xfffffffffb2cef98, float:-8.979346E35)
            r2 = r21
            U0.m r7 = r2.k(r0)
            r2 = r23 & 1
            r3 = 4
            if (r2 == 0) goto L_0x0021
            r2 = r9 | 6
            goto L_0x0031
        L_0x0021:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x0030
            boolean r2 = r7.F(r1)
            if (r2 == 0) goto L_0x002d
            r2 = r3
            goto L_0x002e
        L_0x002d:
            r2 = 2
        L_0x002e:
            r2 = r2 | r9
            goto L_0x0031
        L_0x0030:
            r2 = r9
        L_0x0031:
            r4 = r23 & 2
            if (r4 == 0) goto L_0x0038
            r2 = r2 | 48
            goto L_0x0048
        L_0x0038:
            r4 = r9 & 48
            if (r4 != 0) goto L_0x0048
            boolean r4 = r7.F(r8)
            if (r4 == 0) goto L_0x0045
            r4 = 32
            goto L_0x0047
        L_0x0045:
            r4 = 16
        L_0x0047:
            r2 = r2 | r4
        L_0x0048:
            r4 = r9 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0061
            r4 = r23 & 4
            if (r4 != 0) goto L_0x005b
            r4 = r20
            boolean r5 = r7.F(r4)
            if (r5 == 0) goto L_0x005d
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005b:
            r4 = r20
        L_0x005d:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r2 = r2 | r5
            goto L_0x0063
        L_0x0061:
            r4 = r20
        L_0x0063:
            r5 = r2 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0077
            boolean r5 = r7.l()
            if (r5 != 0) goto L_0x0070
            goto L_0x0077
        L_0x0070:
            r7.L()
            r3 = r4
            r0 = r7
            goto L_0x015a
        L_0x0077:
            r7.G()
            r5 = r9 & 1
            r6 = 0
            if (r5 == 0) goto L_0x0091
            boolean r5 = r7.O()
            if (r5 == 0) goto L_0x0086
            goto L_0x0091
        L_0x0086:
            r7.L()
            r5 = r23 & 4
            if (r5 == 0) goto L_0x008f
        L_0x008d:
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x008f:
            r10 = r4
            goto L_0x00dd
        L_0x0091:
            r5 = r23 & 4
            if (r5 == 0) goto L_0x008f
            r4 = 1890788296(0x70b323c8, float:4.435286E29)
            r7.C(r4)
            m3.a r4 = m3.a.f26247a
            int r5 = m3.a.f26249c
            androidx.lifecycle.k0 r11 = r4.a(r7, r5)
            if (r11 == 0) goto L_0x00d5
            androidx.lifecycle.i0$c r13 = f3.a.a(r11, r7, r6)
            r4 = 1729797275(0x671a9c9b, float:7.301333E23)
            r7.C(r4)
            boolean r4 = r11 instanceof androidx.lifecycle.C5212o
            if (r4 == 0) goto L_0x00bc
            r4 = r11
            androidx.lifecycle.o r4 = (androidx.lifecycle.C5212o) r4
            l3.a r4 = r4.getDefaultViewModelCreationExtras()
        L_0x00ba:
            r14 = r4
            goto L_0x00bf
        L_0x00bc:
            l3.a$a r4 = l3.a.C0407a.f25486b
            goto L_0x00ba
        L_0x00bf:
            r16 = 36936(0x9048, float:5.1758E-41)
            r17 = 0
            java.lang.Class<Ut.c> r10 = Ut.c.class
            r12 = 0
            r15 = r7
            androidx.lifecycle.f0 r4 = m3.c.b(r10, r11, r12, r13, r14, r15, r16, r17)
            r7.U()
            r7.U()
            Ut.c r4 = (Ut.c) r4
            goto L_0x008d
        L_0x00d5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            r7.y()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00ec
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.instore.impl.storeevents.list.ui.StoreEventsListDestination (StoreEventsListDestination.kt:21)"
            U0.C4895p.S(r0, r2, r4, r5)
        L_0x00ec:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r7.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r0 = Xo.c.a(r0)
            if (r0 == 0) goto L_0x0172
            T0.c r0 = T0.a.a(r0, r7, r6)
            int r0 = r0.b()
            T0.d$a r4 = T0.d.f13504b
            int r4 = r4.d()
            boolean r0 = T0.d.F(r0, r4)
            r4 = 1
            r0 = r0 ^ r4
            r5 = -63609255(0xfffffffffc356659, float:-3.7675264E36)
            r7.W(r5)
            boolean r5 = r7.F(r10)
            r11 = r2 & 14
            if (r11 != r3) goto L_0x011f
            r6 = r4
        L_0x011f:
            r3 = r5 | r6
            java.lang.Object r4 = r7.D()
            if (r3 != 0) goto L_0x012f
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0137
        L_0x012f:
            Vt.j r4 = new Vt.j
            r4.<init>(r10, r1)
            r7.u(r4)
        L_0x0137:
            nI.l r4 = (nI.C17642l) r4
            r7.P()
            int r3 = r2 >> 6
            r3 = r3 & 14
            int r2 = r2 << 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r11 = r3 | r2
            r2 = r10
            r3 = r0
            r5 = r19
            r6 = r7
            r0 = r7
            r7 = r11
            Vt.s.k(r2, r3, r4, r5, r6, r7)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0159
            U0.C4895p.R()
        L_0x0159:
            r3 = r10
        L_0x015a:
            U0.Y0 r6 = r0.n()
            if (r6 == 0) goto L_0x0171
            Vt.k r7 = new Vt.k
            r0 = r7
            r1 = r18
            r2 = r19
            r4 = r22
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0171:
            return
        L_0x0172:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Vt.l.c(nI.l, nI.a, Ut.c, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(c cVar, C17642l lVar, a aVar) {
        C17542s.j(aVar, "event");
        cVar.M(aVar.e());
        lVar.invoke(aVar.e());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17642l lVar, C17631a aVar, c cVar, int i10, int i11, C4889m mVar, int i12) {
        c(lVar, aVar, cVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
