package ut;

import It.q;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import androidx.compose.ui.d;
import androidx.compose.ui.window.h;
import kotlin.Metadata;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "storeId", "storeName", "", "hasScanAndGoCartItems", "Landroidx/compose/ui/window/h;", "dialogProperties", "Lkotlin/Function1;", "LIt/q$e;", "LXH/N;", "dialogResult", "d", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/window/h;LnI/l;LU0/m;II)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ut.s  reason: case insensitive filesystem */
public final class C12117s {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ut.s$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f104348a;

        a(String str) {
            this.f104348a = str;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(121692361, i11, -1, "com.ingka.ikea.instore.impl.composables.ConfirmChangeStorePrompt.<anonymous> (ConfirmChangeStorePrompt.kt:83)");
                }
                C13607l.j(this.f104348a, C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(java.lang.String r20, java.lang.String r21, boolean r22, androidx.compose.ui.window.h r23, nI.C17642l<? super It.q.C10757e, XH.C16807N> r24, U0.C4889m r25, int r26, int r27) {
        /*
            r1 = r20
            r2 = r21
            r3 = r22
            r5 = r24
            r6 = r26
            java.lang.String r0 = "storeId"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "storeName"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "dialogResult"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            r0 = 881383517(0x3488d85d, float:2.54894E-7)
            r4 = r25
            U0.m r4 = r4.k(r0)
            r7 = r27 & 1
            if (r7 == 0) goto L_0x0029
            r7 = r6 | 6
            goto L_0x0039
        L_0x0029:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0038
            boolean r7 = r4.V(r1)
            if (r7 == 0) goto L_0x0035
            r7 = 4
            goto L_0x0036
        L_0x0035:
            r7 = 2
        L_0x0036:
            r7 = r7 | r6
            goto L_0x0039
        L_0x0038:
            r7 = r6
        L_0x0039:
            r9 = r27 & 2
            if (r9 == 0) goto L_0x0040
            r7 = r7 | 48
            goto L_0x0050
        L_0x0040:
            r9 = r6 & 48
            if (r9 != 0) goto L_0x0050
            boolean r9 = r4.V(r2)
            if (r9 == 0) goto L_0x004d
            r9 = 32
            goto L_0x004f
        L_0x004d:
            r9 = 16
        L_0x004f:
            r7 = r7 | r9
        L_0x0050:
            r9 = r27 & 4
            r10 = 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0059
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0059:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0068
            boolean r9 = r4.b(r3)
            if (r9 == 0) goto L_0x0065
            r9 = r10
            goto L_0x0067
        L_0x0065:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r7 = r7 | r9
        L_0x0068:
            r9 = r27 & 8
            if (r9 == 0) goto L_0x0071
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r11 = r23
            goto L_0x0083
        L_0x0071:
            r11 = r6 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x006e
            r11 = r23
            boolean r12 = r4.V(r11)
            if (r12 == 0) goto L_0x0080
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r7 = r7 | r12
        L_0x0083:
            r12 = r27 & 16
            r13 = 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x008c
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x008c:
            r12 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x009b
            boolean r12 = r4.F(r5)
            if (r12 == 0) goto L_0x0098
            r12 = r13
            goto L_0x009a
        L_0x0098:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r7 = r7 | r12
        L_0x009b:
            r12 = r7 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r14) goto L_0x00ad
            boolean r12 = r4.l()
            if (r12 != 0) goto L_0x00a8
            goto L_0x00ad
        L_0x00a8:
            r4.L()
            goto L_0x01e0
        L_0x00ad:
            if (r9 == 0) goto L_0x00c1
            androidx.compose.ui.window.h r9 = new androidx.compose.ui.window.h
            r18 = 7
            r19 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r14 = r9
            r14.<init>((boolean) r15, (boolean) r16, (boolean) r17, (int) r18, (kotlin.jvm.internal.DefaultConstructorMarker) r19)
            r18 = r9
            goto L_0x00c3
        L_0x00c1:
            r18 = r11
        L_0x00c3:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00cf
            r9 = -1
            java.lang.String r11 = "com.ingka.ikea.instore.impl.composables.ConfirmChangeStorePrompt (ConfirmChangeStorePrompt.kt:31)"
            U0.C4895p.S(r0, r7, r9, r11)
        L_0x00cf:
            r0 = -1775552606(0xffffffff962b37a2, float:-1.3830825E-25)
            r4.W(r0)
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r7
            r9 = 0
            if (r0 != r13) goto L_0x00de
            r12 = 1
            goto L_0x00df
        L_0x00de:
            r12 = r9
        L_0x00df:
            r14 = r7 & 896(0x380, float:1.256E-42)
            if (r14 != r10) goto L_0x00e5
            r15 = 1
            goto L_0x00e6
        L_0x00e5:
            r15 = r9
        L_0x00e6:
            r12 = r12 | r15
            java.lang.Object r15 = r4.D()
            if (r12 != 0) goto L_0x00f5
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r12 = r12.a()
            if (r15 != r12) goto L_0x00fd
        L_0x00f5:
            ut.p r15 = new ut.p
            r15.<init>(r5, r3)
            r4.u(r15)
        L_0x00fd:
            r12 = r15
            nI.a r12 = (nI.C17631a) r12
            r4.P()
            int r15 = st.c.f102778j
            java.lang.String r15 = J1.j.b(r15, r4, r9)
            if (r3 == 0) goto L_0x011c
            r11 = 792914768(0x2f42eb50, float:1.7727797E-10)
            r4.W(r11)
            int r11 = st.c.f102790n
            java.lang.String r11 = J1.j.b(r11, r4, r9)
            r4.P()
            r10 = r11
            goto L_0x012f
        L_0x011c:
            r11 = 793021780(0x2f448d54, float:1.7876306E-10)
            r4.W(r11)
            int r11 = st.c.f102787m
            java.lang.Object[] r10 = new java.lang.Object[]{r21}
            java.lang.String r10 = J1.j.c(r11, r10, r4, r9)
            r4.P()
        L_0x012f:
            if (r3 == 0) goto L_0x0141
            r11 = 793168782(0x2f46cb8e, float:1.8080312E-10)
            r4.W(r11)
            int r11 = st.c.f102784l
            java.lang.String r11 = J1.j.b(r11, r4, r9)
            r4.P()
            goto L_0x0154
        L_0x0141:
            r11 = 793279979(0x2f487deb, float:1.8234629E-10)
            r4.W(r11)
            int r11 = st.c.f102781k
            java.lang.Object[] r8 = new java.lang.Object[]{r15, r2}
            java.lang.String r11 = J1.j.c(r11, r8, r4, r9)
            r4.P()
        L_0x0154:
            r8 = -1775514962(0xffffffff962bcaae, float:-1.3877224E-25)
            r4.W(r8)
            if (r0 != r13) goto L_0x015e
            r0 = 1
            goto L_0x015f
        L_0x015e:
            r0 = r9
        L_0x015f:
            r8 = r7 & 14
            r13 = 4
            if (r8 != r13) goto L_0x0166
            r8 = 1
            goto L_0x0167
        L_0x0166:
            r8 = r9
        L_0x0167:
            r0 = r0 | r8
            r8 = 256(0x100, float:3.59E-43)
            if (r14 != r8) goto L_0x016e
            r8 = 1
            goto L_0x016f
        L_0x016e:
            r8 = r9
        L_0x016f:
            r0 = r0 | r8
            java.lang.Object r8 = r4.D()
            if (r0 != 0) goto L_0x017e
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r8 != r0) goto L_0x0186
        L_0x017e:
            ut.q r8 = new ut.q
            r8.<init>(r5, r1, r3)
            r4.u(r8)
        L_0x0186:
            nI.a r8 = (nI.C17631a) r8
            r4.P()
            SC.W1 r0 = new SC.W1
            r0.<init>(r15, r8)
            SC.W1 r13 = new SC.W1
            int r8 = Oo.b.f84518U0
            java.lang.String r8 = J1.j.b(r8, r4, r9)
            r13.<init>(r8, r12)
            SC.w0 r14 = SC.C13651w0.Stacked
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            java.lang.String r9 = "ConfirmChangeStorePrompt"
            androidx.compose.ui.d r15 = androidx.compose.ui.platform.C5116k1.a(r8, r9)
            ut.s$a r8 = new ut.s$a
            r8.<init>(r11)
            r9 = 54
            r11 = 121692361(0x740e0c9, float:1.4510533E-34)
            r1 = 1
            c1.a r1 = c1.c.e(r11, r1, r8, r4, r9)
            int r8 = SC.W1.f116045c
            int r9 = r8 << 3
            r11 = 12804096(0xc36000, float:1.794236E-38)
            r9 = r9 | r11
            int r8 = r8 << 6
            r8 = r8 | r9
            int r7 = r7 << 9
            r9 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r9
            r16 = r8 | r7
            r17 = 0
            r7 = r10
            r8 = r0
            r9 = r13
            r10 = r12
            r11 = r15
            r12 = r14
            r13 = r18
            r14 = r1
            r15 = r4
            SC.Z1.c(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01de
            U0.C4895p.R()
        L_0x01de:
            r11 = r18
        L_0x01e0:
            U0.Y0 r8 = r4.n()
            if (r8 == 0) goto L_0x01fc
            ut.r r9 = new ut.r
            r0 = r9
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r11
            r5 = r24
            r6 = r26
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x01fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.C12117s.d(java.lang.String, java.lang.String, boolean, androidx.compose.ui.window.h, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17642l lVar, boolean z10) {
        lVar.invoke(new q.C10757e.c(z10 ? q.C10757e.b.CHANGE_STORE_CLEAR_SCAN_AND_GO : q.C10757e.b.CHANGE_STORE));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17642l lVar, String str, boolean z10) {
        lVar.invoke(new q.C10757e.a(str, z10 ? q.C10757e.b.CHANGE_STORE_CLEAR_SCAN_AND_GO : q.C10757e.b.CHANGE_STORE));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(String str, String str2, boolean z10, h hVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        d(str, str2, z10, hVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
