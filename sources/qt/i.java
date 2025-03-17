package Qt;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "isLoggedIn", "isFamilyUpgradeNecessary", "", "actionLabel", "actionLoading", "Lkotlin/Function0;", "LXH/N;", "onLoginClicked", "onUpgradeClicked", "onRegisterClicked", "e", "(ZZLjava/lang/String;ZLnI/a;LnI/a;LnI/a;LU0/m;I)V", "Landroidx/compose/ui/d;", "modifier", "c", "(Ljava/lang/String;ZLandroidx/compose/ui/d;LnI/a;LU0/m;II)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r19, boolean r20, androidx.compose.ui.d r21, nI.C17631a<XH.C16807N> r22, U0.C4889m r23, int r24, int r25) {
        /*
            r13 = r19
            r14 = r22
            r15 = r24
            java.lang.String r0 = "actionLabel"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onRegisterClicked"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = -256230842(0xfffffffff0ba3a46, float:-4.6107728E29)
            r1 = r23
            U0.m r12 = r1.k(r0)
            r1 = r25 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r15 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002f
            boolean r1 = r12.V(r13)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r15
            goto L_0x0030
        L_0x002f:
            r1 = r15
        L_0x0030:
            r2 = r25 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            r11 = r20
            goto L_0x004b
        L_0x0039:
            r2 = r15 & 48
            r11 = r20
            if (r2 != 0) goto L_0x004b
            boolean r2 = r12.b(r11)
            if (r2 == 0) goto L_0x0048
            r2 = 32
            goto L_0x004a
        L_0x0048:
            r2 = 16
        L_0x004a:
            r1 = r1 | r2
        L_0x004b:
            r2 = r25 & 4
            if (r2 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r3 = r21
            goto L_0x0066
        L_0x0054:
            r3 = r15 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0051
            r3 = r21
            boolean r4 = r12.V(r3)
            if (r4 == 0) goto L_0x0063
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r4
        L_0x0066:
            r4 = r25 & 8
            if (r4 == 0) goto L_0x006d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006d:
            r4 = r15 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x007d
            boolean r4 = r12.F(r14)
            if (r4 == 0) goto L_0x007a
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r1 = r1 | r4
        L_0x007d:
            r4 = r1 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 != r5) goto L_0x0090
            boolean r4 = r12.l()
            if (r4 != 0) goto L_0x008a
            goto L_0x0090
        L_0x008a:
            r12.L()
            r16 = r12
            goto L_0x00ee
        L_0x0090:
            if (r2 == 0) goto L_0x0096
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r10 = r2
            goto L_0x0097
        L_0x0096:
            r10 = r3
        L_0x0097:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00a3
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.instore.impl.storeevents.composables.RegistrationButton (RegistrationContent.kt:96)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x00a3:
            SC.N r3 = SC.N.Primary
            r0 = 0
            r2 = 0
            r4 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r10, r0, r4, r2)
            androidx.compose.ui.d r0 = TC.e.i(r0)
            java.lang.String r2 = "store_events_registration-register_button"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r0, r2)
            r0 = r1 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r4 = r1 << 12
            r5 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r5
            r0 = r0 | r4
            int r1 = r1 << 18
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r4
            r16 = r0 | r1
            r17 = 468(0x1d4, float:6.56E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r19
            r1 = r2
            r2 = r4
            r4 = r5
            r5 = r20
            r9 = r22
            r18 = r10
            r10 = r12
            r11 = r16
            r16 = r12
            r12 = r17
            SC.L.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ec
            U0.C4895p.R()
        L_0x00ec:
            r3 = r18
        L_0x00ee:
            U0.Y0 r7 = r16.n()
            if (r7 == 0) goto L_0x0107
            Qt.h r8 = new Qt.h
            r0 = r8
            r1 = r19
            r2 = r20
            r4 = r22
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Qt.i.c(java.lang.String, boolean, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(String str, boolean z10, d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        c(str, z10, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(boolean r21, boolean r22, java.lang.String r23, boolean r24, nI.C17631a<XH.C16807N> r25, nI.C17631a<XH.C16807N> r26, nI.C17631a<XH.C16807N> r27, U0.C4889m r28, int r29) {
        /*
            r1 = r21
            r2 = r22
            r10 = r23
            r0 = r25
            r9 = r26
            r8 = r27
            r7 = r29
            java.lang.String r3 = "onLoginClicked"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "onUpgradeClicked"
            kotlin.jvm.internal.C17542s.j(r9, r3)
            java.lang.String r3 = "onRegisterClicked"
            kotlin.jvm.internal.C17542s.j(r8, r3)
            r3 = -660140790(0xffffffffd8a70d0a, float:-1.46939555E15)
            r4 = r28
            U0.m r6 = r4.k(r3)
            r4 = r7 & 6
            if (r4 != 0) goto L_0x0035
            boolean r4 = r6.b(r1)
            if (r4 == 0) goto L_0x0032
            r4 = 4
            goto L_0x0033
        L_0x0032:
            r4 = 2
        L_0x0033:
            r4 = r4 | r7
            goto L_0x0036
        L_0x0035:
            r4 = r7
        L_0x0036:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x0046
            boolean r5 = r6.b(r2)
            if (r5 == 0) goto L_0x0043
            r5 = 32
            goto L_0x0045
        L_0x0043:
            r5 = 16
        L_0x0045:
            r4 = r4 | r5
        L_0x0046:
            r5 = r7 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0056
            boolean r5 = r6.V(r10)
            if (r5 == 0) goto L_0x0053
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0055
        L_0x0053:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0055:
            r4 = r4 | r5
        L_0x0056:
            r5 = r7 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0069
            r5 = r24
            boolean r11 = r6.b(r5)
            if (r11 == 0) goto L_0x0065
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0067
        L_0x0065:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0067:
            r4 = r4 | r11
            goto L_0x006b
        L_0x0069:
            r5 = r24
        L_0x006b:
            r11 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x007b
            boolean r11 = r6.F(r0)
            if (r11 == 0) goto L_0x0078
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x007a
        L_0x0078:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x007a:
            r4 = r4 | r11
        L_0x007b:
            r11 = 196608(0x30000, float:2.75506E-40)
            r12 = r7 & r11
            if (r12 != 0) goto L_0x008d
            boolean r12 = r6.F(r9)
            if (r12 == 0) goto L_0x008a
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x008c
        L_0x008a:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x008c:
            r4 = r4 | r12
        L_0x008d:
            r12 = 1572864(0x180000, float:2.204052E-39)
            r12 = r12 & r7
            if (r12 != 0) goto L_0x009e
            boolean r12 = r6.F(r8)
            if (r12 == 0) goto L_0x009b
            r12 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x009d
        L_0x009b:
            r12 = 524288(0x80000, float:7.34684E-40)
        L_0x009d:
            r4 = r4 | r12
        L_0x009e:
            r12 = 599187(0x92493, float:8.3964E-40)
            r12 = r12 & r4
            r13 = 599186(0x92492, float:8.39638E-40)
            if (r12 != r13) goto L_0x00b4
            boolean r12 = r6.l()
            if (r12 != 0) goto L_0x00ae
            goto L_0x00b4
        L_0x00ae:
            r6.L()
            r13 = r6
            goto L_0x01ab
        L_0x00b4:
            boolean r12 = U0.C4895p.J()
            if (r12 == 0) goto L_0x00c0
            r12 = -1
            java.lang.String r13 = "com.ingka.ikea.instore.impl.storeevents.composables.RegistrationContent (RegistrationContent.kt:37)"
            U0.C4895p.S(r3, r4, r12, r13)
        L_0x00c0:
            r3 = 3670016(0x380000, float:5.142788E-39)
            r12 = 0
            if (r1 != 0) goto L_0x0135
            r13 = 51829484(0x316daec, float:4.433235E-37)
            r6.W(r13)
            if (r2 == 0) goto L_0x00e8
            r13 = 52001875(0x3197c53, float:4.5105376E-37)
            r6.W(r13)
            int r13 = st.c.f102704C0
            java.lang.String r13 = J1.j.b(r13, r6, r12)
            int r14 = st.c.f102702B0
            java.lang.String r14 = J1.j.b(r14, r6, r12)
            XH.v r13 = XH.C16796C.a(r13, r14)
            r6.P()
            r14 = 1
            goto L_0x0102
        L_0x00e8:
            r13 = 52256881(0x31d6071, float:4.6248863E-37)
            r6.W(r13)
            int r13 = st.c.f102718J0
            java.lang.String r13 = J1.j.b(r13, r6, r12)
            int r14 = st.c.f102716I0
            java.lang.String r14 = J1.j.b(r14, r6, r12)
            XH.v r13 = XH.C16796C.a(r13, r14)
            r6.P()
            r14 = r12
        L_0x0102:
            java.lang.Object r15 = r13.a()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r13 = r13.b()
            java.lang.String r13 = (java.lang.String) r13
            int r11 = Oo.b.f84824w4
            java.lang.String r16 = J1.j.b(r11, r6, r12)
            SC.N r17 = SC.N.Primary
            int r4 = r4 << 6
            r3 = r3 & r4
            r4 = 196608(0x30000, float:2.75506E-40)
            r19 = r3 | r4
            r20 = 16
            r3 = 0
            r11 = r15
            r12 = r13
            r13 = r14
            r14 = r16
            r15 = r3
            r16 = r17
            r17 = r25
            r18 = r6
            ut.G.l(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r6.P()
        L_0x0132:
            r13 = r6
            goto L_0x01a2
        L_0x0135:
            if (r2 == 0) goto L_0x016a
            r11 = 52963898(0x3282a3a, float:4.9419236E-37)
            r6.W(r11)
            int r11 = st.c.f102708E0
            java.lang.String r11 = J1.j.b(r11, r6, r12)
            int r13 = st.c.f102706D0
            java.lang.String r13 = J1.j.b(r13, r6, r12)
            int r14 = st.c.f102795o1
            java.lang.String r14 = J1.j.b(r14, r6, r12)
            SC.N r16 = SC.N.Primary
            int r4 = r4 << 3
            r3 = r3 & r4
            r4 = 196992(0x30180, float:2.76045E-40)
            r19 = r3 | r4
            r20 = 16
            r3 = 1
            r15 = 0
            r12 = r13
            r13 = r3
            r17 = r26
            r18 = r6
            ut.G.l(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r6.P()
            goto L_0x0132
        L_0x016a:
            r3 = 53513497(0x3308d19, float:5.1883724E-37)
            r6.W(r3)
            if (r10 != 0) goto L_0x0174
            r13 = r6
            goto L_0x019f
        L_0x0174:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            tK.u r11 = tK.C18029u.f147649a
            float r11 = r11.g()
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r3, r11)
            s0.C5844O.a(r3, r6, r12)
            int r3 = r4 >> 6
            r3 = r3 & 126(0x7e, float:1.77E-43)
            int r4 = r4 >> 9
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r11 = r3 | r4
            r12 = 4
            r13 = 0
            r3 = r23
            r4 = r24
            r5 = r13
            r13 = r6
            r6 = r27
            r7 = r13
            r8 = r11
            r9 = r12
            c(r3, r4, r5, r6, r7, r8, r9)
            XH.N r3 = XH.C16807N.f139792a
        L_0x019f:
            r13.P()
        L_0x01a2:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01ab
            U0.C4895p.R()
        L_0x01ab:
            U0.Y0 r9 = r13.n()
            if (r9 == 0) goto L_0x01ca
            Qt.g r11 = new Qt.g
            r0 = r11
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r11)
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Qt.i.e(boolean, boolean, java.lang.String, boolean, nI.a, nI.a, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(boolean z10, boolean z11, String str, boolean z12, C17631a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        e(z10, z11, str, z12, aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
