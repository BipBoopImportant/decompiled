package VB;

import U0.C4889m;
import U0.M0;
import WB.C13772d;
import WB.k;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ae\u0010\u000b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onCloseFeature", "Lkotlin/Function1;", "LWB/g$a;", "onGetDirectionsClicked", "onAllOpeningHoursClicked", "onPopularTimesClicked", "onGoToSettingsClicked", "LWB/k;", "viewModel", "b", "(LnI/a;LnI/l;LnI/a;LnI/a;LnI/a;LWB/k;LU0/m;II)V", "storedetails-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: VB.b  reason: case insensitive filesystem */
public final class C13753b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: VB.b$a */
    /* synthetic */ class a extends C17540p implements C17642l<C13772d, C16807N> {
        a(Object obj) {
            super(1, obj, k.class, "onAction", "onAction(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C13772d) obj);
            return C16807N.f139792a;
        }

        public final void t(C13772d dVar) {
            C17542s.j(dVar, "p0");
            ((k) this.receiver).b(dVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(nI.C17631a<XH.C16807N> r21, nI.C17642l<? super WB.C13775g.a, XH.C16807N> r22, nI.C17631a<XH.C16807N> r23, nI.C17631a<XH.C16807N> r24, nI.C17631a<XH.C16807N> r25, WB.k r26, U0.C4889m r27, int r28, int r29) {
        /*
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            r15 = r28
            java.lang.String r0 = "onCloseFeature"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onGetDirectionsClicked"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onAllOpeningHoursClicked"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onPopularTimesClicked"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onGoToSettingsClicked"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = 1563487014(0x5d30eb26, float:7.9677031E17)
            r1 = r27
            U0.m r9 = r1.k(r0)
            r1 = r29 & 1
            if (r1 == 0) goto L_0x0035
            r1 = r15 | 6
            goto L_0x0045
        L_0x0035:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x0044
            boolean r1 = r9.F(r10)
            if (r1 == 0) goto L_0x0041
            r1 = 4
            goto L_0x0042
        L_0x0041:
            r1 = 2
        L_0x0042:
            r1 = r1 | r15
            goto L_0x0045
        L_0x0044:
            r1 = r15
        L_0x0045:
            r2 = r29 & 2
            if (r2 == 0) goto L_0x004c
            r1 = r1 | 48
            goto L_0x005c
        L_0x004c:
            r2 = r15 & 48
            if (r2 != 0) goto L_0x005c
            boolean r2 = r9.F(r11)
            if (r2 == 0) goto L_0x0059
            r2 = 32
            goto L_0x005b
        L_0x0059:
            r2 = 16
        L_0x005b:
            r1 = r1 | r2
        L_0x005c:
            r2 = r29 & 4
            if (r2 == 0) goto L_0x0063
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0073
        L_0x0063:
            r2 = r15 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0073
            boolean r2 = r9.F(r12)
            if (r2 == 0) goto L_0x0070
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0072
        L_0x0070:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0072:
            r1 = r1 | r2
        L_0x0073:
            r2 = r29 & 8
            if (r2 == 0) goto L_0x007a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008a
        L_0x007a:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x008a
            boolean r2 = r9.F(r13)
            if (r2 == 0) goto L_0x0087
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0089
        L_0x0087:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0089:
            r1 = r1 | r2
        L_0x008a:
            r2 = r29 & 16
            if (r2 == 0) goto L_0x0091
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x0091:
            r2 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00a1
            boolean r2 = r9.F(r14)
            if (r2 == 0) goto L_0x009e
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r1 = r1 | r2
        L_0x00a1:
            r16 = 196608(0x30000, float:2.75506E-40)
            r2 = r15 & r16
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r2 != 0) goto L_0x00bf
            r2 = r29 & 32
            if (r2 != 0) goto L_0x00b7
            r2 = r26
            boolean r3 = r9.V(r2)
            if (r3 == 0) goto L_0x00b9
            r3 = r8
            goto L_0x00bb
        L_0x00b7:
            r2 = r26
        L_0x00b9:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r1 = r1 | r3
        L_0x00bc:
            r17 = r1
            goto L_0x00c2
        L_0x00bf:
            r2 = r26
            goto L_0x00bc
        L_0x00c2:
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r17 & r1
            r3 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r3) goto L_0x00db
            boolean r1 = r9.l()
            if (r1 != 0) goto L_0x00d3
            goto L_0x00db
        L_0x00d3:
            r9.L()
            r6 = r2
            r18 = r9
            goto L_0x01f3
        L_0x00db:
            r9.G()
            r1 = r15 & 1
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = 0
            if (r1 == 0) goto L_0x00fa
            boolean r1 = r9.O()
            if (r1 == 0) goto L_0x00ed
            goto L_0x00fa
        L_0x00ed:
            r9.L()
            r1 = r29 & 32
            if (r1 == 0) goto L_0x00f6
            r17 = r17 & r18
        L_0x00f6:
            r8 = r2
        L_0x00f7:
            r1 = r17
            goto L_0x014d
        L_0x00fa:
            r1 = r29 & 32
            if (r1 == 0) goto L_0x00f6
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r9.C(r1)
            m3.a r1 = m3.a.f26247a
            int r2 = m3.a.f26249c
            androidx.lifecycle.k0 r2 = r1.a(r9, r2)
            if (r2 == 0) goto L_0x0145
            androidx.lifecycle.i0$c r4 = f3.a.a(r2, r9, r7)
            r1 = 1729797275(0x671a9c9b, float:7.301333E23)
            r9.C(r1)
            boolean r1 = r2 instanceof androidx.lifecycle.C5212o
            if (r1 == 0) goto L_0x0125
            r1 = r2
            androidx.lifecycle.o r1 = (androidx.lifecycle.C5212o) r1
            l3.a r1 = r1.getDefaultViewModelCreationExtras()
        L_0x0123:
            r5 = r1
            goto L_0x0128
        L_0x0125:
            l3.a$a r1 = l3.a.C0407a.f25486b
            goto L_0x0123
        L_0x0128:
            r19 = 36936(0x9048, float:5.1758E-41)
            r20 = 0
            java.lang.Class<WB.l> r1 = WB.l.class
            r3 = 0
            r6 = r9
            r7 = r19
            r8 = r20
            androidx.lifecycle.f0 r1 = m3.c.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.U()
            r9.U()
            WB.k r1 = (WB.k) r1
            r17 = r17 & r18
            r8 = r1
            goto L_0x00f7
        L_0x0145:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x014d:
            r9.y()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x015c
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.storedetails.impl.map.navigation.StoreDetailsDestination (StoreDetailsDestination.kt:31)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x015c:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r9.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r0 = Xo.c.a(r0)
            if (r0 == 0) goto L_0x0212
            r2 = 0
            T0.c r0 = T0.a.a(r0, r9, r2)
            int r0 = r0.b()
            T0.d$a r3 = T0.d.f13504b
            int r3 = r3.d()
            boolean r3 = T0.d.F(r0, r3)
            r0 = -1587756154(0xffffffffa15cc386, float:-7.479767E-19)
            r9.W(r0)
            r0 = 458752(0x70000, float:6.42848E-40)
            r4 = r1 & r0
            r4 = r4 ^ r16
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r4 <= r5) goto L_0x0195
            boolean r4 = r9.V(r8)
            if (r4 != 0) goto L_0x0199
        L_0x0195:
            r4 = r1 & r16
            if (r4 != r5) goto L_0x019b
        L_0x0199:
            r7 = 1
            goto L_0x019c
        L_0x019b:
            r7 = r2
        L_0x019c:
            java.lang.Object r2 = r9.D()
            if (r7 != 0) goto L_0x01aa
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x01b2
        L_0x01aa:
            VB.b$a r2 = new VB.b$a
            r2.<init>(r8)
            r9.u(r2)
        L_0x01b2:
            uI.h r2 = (uI.C18059h) r2
            r9.P()
            r7 = r2
            nI.l r7 = (nI.C17642l) r7
            int r2 = r1 >> 15
            r2 = r2 & 14
            int r1 = r1 << 6
            r4 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r1
            r2 = r2 | r4
            r0 = r0 & r1
            r0 = r0 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r2
            r16 = r0 | r1
            r0 = r8
            r1 = r3
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r17 = r8
            r8 = r9
            r18 = r9
            r9 = r16
            YB.V.q(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01f1
            U0.C4895p.R()
        L_0x01f1:
            r6 = r17
        L_0x01f3:
            U0.Y0 r9 = r18.n()
            if (r9 == 0) goto L_0x0211
            VB.a r8 = new VB.a
            r0 = r8
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r7 = r28
            r10 = r8
            r8 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0211:
            return
        L_0x0212:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: VB.C13753b.b(nI.a, nI.l, nI.a, nI.a, nI.a, WB.k, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C17631a aVar, C17642l lVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, k kVar, int i10, int i11, C4889m mVar, int i12) {
        b(aVar, lVar, aVar2, aVar3, aVar4, kVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
