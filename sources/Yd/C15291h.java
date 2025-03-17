package yD;

import A0.f;
import A0.g;
import GD.k;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import c2.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import p0.v;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000e\u0010\r\u001a/\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u0002²\u0006\u000e\u0010 \u001a\u00020\u001e8\n@\nX\u0002"}, d2 = {"LGD/k$a;", "model", "Lp0/v;", "orientation", "Lkotlin/Function0;", "LXH/N;", "onShowQrCodeClicked", "Landroidx/compose/ui/d;", "modifier", "r", "(LGD/k$a;Lp0/v;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "onClick", "v", "(LGD/k$a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "t", "", "number", "m", "(Ljava/lang/String;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "h", "Lc2/h;", "a", "F", "BarcodeThickness", "b", "BarcodePadding", "LA0/f;", "c", "LA0/f;", "BarcodeShape", "", "barcodeWidth", "imageWidth", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yD.h  reason: case insensitive filesystem */
public final class C15291h {

    /* renamed from: a  reason: collision with root package name */
    private static final float f132168a = h.B((float) 120);

    /* renamed from: b  reason: collision with root package name */
    private static final float f132169b = h.B((float) 12);

    /* renamed from: c  reason: collision with root package name */
    private static final f f132170c = g.e(h.B((float) 4));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yD.h$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f132171a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                p0.v[] r0 = p0.v.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p0.v r1 = p0.v.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                p0.v r1 = p0.v.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f132171a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yD.C15291h.a.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void h(java.lang.String r24, nI.C17631a<XH.C16807N> r25, androidx.compose.ui.d r26, U0.C4889m r27, int r28, int r29) {
        /*
            r4 = r28
            r0 = 2
            r1 = 4
            r2 = 6
            r3 = 1585435603(0x5e7fd3d3, float:4.60857742E18)
            r5 = r27
            U0.m r15 = r5.k(r3)
            r14 = 1
            r5 = r29 & 1
            if (r5 == 0) goto L_0x0018
            r5 = r4 | 6
            r13 = r24
            goto L_0x002a
        L_0x0018:
            r5 = r4 & 6
            r13 = r24
            if (r5 != 0) goto L_0x0029
            boolean r5 = r15.V(r13)
            if (r5 == 0) goto L_0x0026
            r5 = r1
            goto L_0x0027
        L_0x0026:
            r5 = r0
        L_0x0027:
            r5 = r5 | r4
            goto L_0x002a
        L_0x0029:
            r5 = r4
        L_0x002a:
            r0 = r29 & 2
            if (r0 == 0) goto L_0x0033
            r5 = r5 | 48
        L_0x0030:
            r0 = r25
            goto L_0x0045
        L_0x0033:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x0030
            r0 = r25
            boolean r6 = r15.F(r0)
            if (r6 == 0) goto L_0x0042
            r6 = 32
            goto L_0x0044
        L_0x0042:
            r6 = 16
        L_0x0044:
            r5 = r5 | r6
        L_0x0045:
            r1 = r29 & 4
            if (r1 == 0) goto L_0x004f
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r6 = r26
        L_0x004d:
            r12 = r5
            goto L_0x0062
        L_0x004f:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004b
            r6 = r26
            boolean r7 = r15.V(r6)
            if (r7 == 0) goto L_0x005e
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r5 = r5 | r7
            goto L_0x004d
        L_0x0062:
            r5 = r12 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r5 != r7) goto L_0x0075
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            r15.L()
            r3 = r15
            goto L_0x0208
        L_0x0075:
            if (r1 == 0) goto L_0x007a
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            goto L_0x007b
        L_0x007a:
            r1 = r6
        L_0x007b:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0087
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.wallet.impl.compose.card.familycard.BarcodeHorizontal (FamilyCardBack.kt:164)"
            U0.C4895p.S(r3, r12, r5, r6)
        L_0x0087:
            U0.I0 r3 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r3 = r15.Q(r3)
            c2.d r3 = (c2.d) r3
            r5 = -1123209420(0xffffffffbd0d2f34, float:-0.034468845)
            r15.W(r5)
            java.lang.Object r5 = r15.D()
            U0.m$a r17 = U0.C4889m.f14007a
            java.lang.Object r6 = r17.a()
            if (r5 != r6) goto L_0x00b0
            float r5 = f132168a
            int r5 = r3.K0(r5)
            U0.o0 r5 = U0.C4877g1.a(r5)
            r15.u(r5)
        L_0x00b0:
            r11 = r5
            U0.o0 r11 = (U0.C4894o0) r11
            r15.P()
            int r5 = i(r11)
            float r7 = r3.H(r5)
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.a()
            i1.c$a r18 = i1.C5437c.f24302a
            i1.c$b r5 = r18.g()
            r6 = 54
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r5, r15, r6)
            r10 = 0
            int r5 = U0.C4883j.a(r15, r10)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r15, r1)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x00ec
            U0.C4883j.c()
        L_0x00ec:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x00f9
            r15.p(r10)
            goto L_0x00fc
        L_0x00f9:
            r15.t()
        L_0x00fc:
            U0.m r10 = U0.F1.a(r15)
            nI.p r14 = r9.c()
            U0.F1.c(r10, r3, r14)
            nI.p r3 = r9.e()
            U0.F1.c(r10, r6, r3)
            nI.p r3 = r9.b()
            boolean r6 = r10.i()
            if (r6 != 0) goto L_0x0126
            java.lang.Object r6 = r10.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r14)
            if (r6 != 0) goto L_0x0134
        L_0x0126:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r10.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10.w(r5, r3)
        L_0x0134:
            nI.p r3 = r9.d()
            U0.F1.c(r10, r8, r3)
            s0.h r3 = s0.C5862h.f28810a
            float r3 = f132168a
            vm.a$a r6 = vm.C12190a.C2496a.CODE_128
            r5 = r12 & 14
            r14 = r5 | 3120(0xc30, float:4.372E-42)
            r16 = 496(0x1f0, float:6.95E-43)
            r9 = 0
            r10 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r5 = r24
            r8 = r3
            r2 = 0
            r22 = r11
            r11 = r19
            r19 = r12
            r12 = r20
            r13 = r21
            r20 = r14
            r2 = 1
            r14 = r15
            r23 = r15
            r15 = r20
            t1.a r5 = vm.C12192c.e(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            i1.c r8 = r18.b()
            E1.k$a r6 = E1.C4478k.f5915a
            E1.k r9 = r6.d()
            androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
            java.lang.String r6 = "WalletTestTags-BarcodeHorizontal"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r15, r6)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r6, r3)
            r6 = 0
            r7 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r3, r6, r2, r7)
            r3 = r23
            r6 = 0
            tK.h r7 = SC.C13575d.a(r3, r6)
            long r6 = r7.F0()
            A0.f r10 = f132170c
            androidx.compose.ui.d r2 = androidx.compose.foundation.b.c(r2, r6, r10)
            float r6 = f132169b
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.i(r2, r6)
            r6 = 1754641150(0x6895b2fe, float:5.6554754E24)
            r3.W(r6)
            java.lang.Object r6 = r3.D()
            java.lang.Object r7 = r17.a()
            if (r6 != r7) goto L_0x01b6
            yD.f r6 = new yD.f
            r7 = r22
            r6.<init>(r7)
            r3.u(r6)
        L_0x01b6:
            nI.l r6 = (nI.C17642l) r6
            r3.P()
            androidx.compose.ui.d r7 = androidx.compose.ui.layout.g.a(r2, r6)
            r13 = 27696(0x6c30, float:3.881E-41)
            r14 = 96
            r6 = 0
            r10 = 0
            r11 = 0
            r12 = r3
            n0.C5583F.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = 24
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r15, r2)
            r5 = 6
            s0.C5844O.a(r2, r3, r5)
            int r2 = Oo.b.f84366E8
            r5 = 0
            java.lang.String r5 = J1.j.b(r2, r3, r5)
            SC.J1 r9 = SC.J1.XSmall
            java.lang.String r2 = "WalletTestTags-BarcodeButton"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r15, r2)
            int r2 = r19 << 21
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r7
            r15 = r2 | 24624(0x6030, float:3.4506E-41)
            r16 = 236(0xec, float:3.31E-43)
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = r25
            r14 = r3
            SC.I1.h(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0207
            U0.C4895p.R()
        L_0x0207:
            r6 = r1
        L_0x0208:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x0220
            yD.g r8 = new yD.g
            r0 = r8
            r1 = r24
            r2 = r25
            r3 = r6
            r4 = r28
            r5 = r29
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r8)
        L_0x0220:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yD.C15291h.h(java.lang.String, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    private static final int i(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void j(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C4894o0 o0Var, r rVar) {
        j(o0Var, r.h(rVar.k()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(String str, C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(str, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void m(java.lang.String r34, nI.C17631a<XH.C16807N> r35, androidx.compose.ui.d r36, U0.C4889m r37, int r38, int r39) {
        /*
            r4 = r38
            r0 = -554512063(0xffffffffdef2d141, float:-8.7484187E18)
            r1 = r37
            U0.m r1 = r1.k(r0)
            r2 = r39 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0016
            r2 = r4 | 6
            r5 = r2
            r2 = r34
            goto L_0x002a
        L_0x0016:
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0027
            r2 = r34
            boolean r5 = r1.V(r2)
            if (r5 == 0) goto L_0x0024
            r5 = 4
            goto L_0x0025
        L_0x0024:
            r5 = r3
        L_0x0025:
            r5 = r5 | r4
            goto L_0x002a
        L_0x0027:
            r2 = r34
            r5 = r4
        L_0x002a:
            r6 = r39 & 2
            if (r6 == 0) goto L_0x0033
            r5 = r5 | 48
            r13 = r35
            goto L_0x0045
        L_0x0033:
            r6 = r4 & 48
            r13 = r35
            if (r6 != 0) goto L_0x0045
            boolean r6 = r1.F(r13)
            if (r6 == 0) goto L_0x0042
            r6 = 32
            goto L_0x0044
        L_0x0042:
            r6 = 16
        L_0x0044:
            r5 = r5 | r6
        L_0x0045:
            r6 = r39 & 4
            if (r6 == 0) goto L_0x004f
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r7 = r36
        L_0x004d:
            r12 = r5
            goto L_0x0062
        L_0x004f:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004b
            r7 = r36
            boolean r8 = r1.V(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r5 = r5 | r8
            goto L_0x004d
        L_0x0062:
            r5 = r12 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r5 != r8) goto L_0x0075
            boolean r5 = r1.l()
            if (r5 != 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            r1.L()
            r3 = r7
            goto L_0x0227
        L_0x0075:
            if (r6 == 0) goto L_0x007b
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r11 = r5
            goto L_0x007c
        L_0x007b:
            r11 = r7
        L_0x007c:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0088
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.wallet.impl.compose.card.familycard.BarcodeVertical (FamilyCardBack.kt:115)"
            U0.C4895p.S(r0, r12, r5, r6)
        L_0x0088:
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r0 = r1.Q(r0)
            c2.d r0 = (c2.d) r0
            float r10 = f132168a
            float r9 = f132169b
            float r3 = (float) r3
            float r3 = r3 * r9
            float r3 = c2.h.B(r3)
            float r3 = r10 - r3
            float r8 = c2.h.B(r3)
            r3 = 1355418723(0x50ca0c63, float:2.71184753E10)
            r1.W(r3)
            java.lang.Object r3 = r1.D()
            U0.m$a r17 = U0.C4889m.f14007a
            java.lang.Object r5 = r17.a()
            if (r3 != r5) goto L_0x00bf
            int r3 = r0.K0(r8)
            U0.o0 r3 = U0.C4877g1.a(r3)
            r1.u(r3)
        L_0x00bf:
            U0.o0 r3 = (U0.C4894o0) r3
            r1.P()
            int r5 = p(r3)
            float r7 = r0.H(r5)
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r0 = r0.a()
            i1.c$a r18 = i1.C5437c.f24302a
            i1.c$b r5 = r18.g()
            r6 = 54
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r0, r5, r1, r6)
            r6 = 0
            int r5 = U0.C4883j.a(r1, r6)
            U0.y r6 = r1.s()
            androidx.compose.ui.d r14 = androidx.compose.ui.c.e(r1, r11)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r15 = r16.a()
            U0.f r19 = r1.m()
            if (r19 != 0) goto L_0x00fa
            U0.C4883j.c()
        L_0x00fa:
            r1.I()
            boolean r19 = r1.i()
            if (r19 == 0) goto L_0x0107
            r1.p(r15)
            goto L_0x010a
        L_0x0107:
            r1.t()
        L_0x010a:
            U0.m r15 = U0.F1.a(r1)
            nI.p r2 = r16.c()
            U0.F1.c(r15, r0, r2)
            nI.p r0 = r16.e()
            U0.F1.c(r15, r6, r0)
            nI.p r0 = r16.b()
            boolean r2 = r15.i()
            if (r2 != 0) goto L_0x0134
            java.lang.Object r2 = r15.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r6)
            if (r2 != 0) goto L_0x0142
        L_0x0134:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r15.u(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r15.w(r2, r0)
        L_0x0142:
            nI.p r0 = r16.d()
            U0.F1.c(r15, r14, r0)
            s0.h r19 = s0.C5862h.f28810a
            vm.a$a r6 = vm.C12190a.C2496a.CODE_128
            r0 = r12 & 14
            r2 = 12586032(0xc00c30, float:1.7636787E-38)
            r15 = r0 | r2
            r16 = 368(0x170, float:5.16E-43)
            r0 = 0
            r2 = 0
            r14 = 0
            r20 = 1119092736(0x42b40000, float:90.0)
            r21 = 0
            r5 = r34
            r25 = r9
            r9 = r0
            r0 = r10
            r10 = r2
            r2 = r11
            r11 = r14
            r26 = r12
            r12 = r20
            r13 = r21
            r14 = r1
            t1.a r5 = vm.C12192c.e(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            i1.c r8 = r18.e()
            E1.k$a r6 = E1.C4478k.f5915a
            E1.k r9 = r6.c()
            androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
            java.lang.String r6 = "WalletTestTags-BarcodeVertical"
            androidx.compose.ui.d r27 = androidx.compose.ui.platform.C5116k1.a(r15, r6)
            r6 = 4
            float r6 = (float) r6
            float r29 = c2.h.B(r6)
            r32 = 13
            r33 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            androidx.compose.ui.d r20 = androidx.compose.foundation.layout.D.m(r27, r28, r29, r30, r31, r32, r33)
            r23 = 2
            r24 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            androidx.compose.ui.d r6 = s0.C5861g.c(r19, r20, r21, r22, r23, r24)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r6, r0)
            r14 = 0
            tK.h r6 = SC.C13575d.a(r1, r14)
            long r6 = r6.F0()
            A0.f r10 = f132170c
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.c(r0, r6, r10)
            r6 = r25
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.i(r0, r6)
            r6 = 1077689363(0x403c3c13, float:2.9411666)
            r1.W(r6)
            java.lang.Object r6 = r1.D()
            java.lang.Object r7 = r17.a()
            if (r6 != r7) goto L_0x01d4
            yD.d r6 = new yD.d
            r6.<init>(r3)
            r1.u(r6)
        L_0x01d4:
            nI.l r6 = (nI.C17642l) r6
            r1.P()
            androidx.compose.ui.d r7 = androidx.compose.ui.layout.g.a(r0, r6)
            r13 = 27696(0x6c30, float:3.881E-41)
            r0 = 96
            r6 = 0
            r10 = 0
            r11 = 0
            r12 = r1
            r3 = r14
            r14 = r0
            n0.C5583F.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = 16
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r15, r0)
            r5 = 6
            s0.C5844O.a(r0, r1, r5)
            int r0 = Oo.b.f84366E8
            java.lang.String r5 = J1.j.b(r0, r1, r3)
            SC.J1 r9 = SC.J1.XSmall
            java.lang.String r0 = "WalletTestTags-BarcodeButton"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r15, r0)
            int r0 = r26 << 21
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r3
            r15 = r0 | 24624(0x6030, float:3.4506E-41)
            r16 = 236(0xec, float:3.31E-43)
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = r35
            r14 = r1
            SC.I1.h(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0226
            U0.C4895p.R()
        L_0x0226:
            r3 = r2
        L_0x0227:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x023e
            yD.e r7 = new yD.e
            r0 = r7
            r1 = r34
            r2 = r35
            r4 = r38
            r5 = r39
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x023e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yD.C15291h.m(java.lang.String, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C4894o0 o0Var, r rVar) {
        q(o0Var, r.g(rVar.k()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(String str, C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        m(str, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final int p(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void q(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    public static final void r(k.a aVar, v vVar, C17631a<C16807N> aVar2, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(aVar, "model");
        C17542s.j(vVar, "orientation");
        C17542s.j(aVar2, "onShowQrCodeClicked");
        C4889m k10 = mVar.k(1394868743);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(vVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.F(aVar2) ? 256 : 128;
        }
        int i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= k10.V(dVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(1394868743, i12, -1, "com.ingka.ikea.wallet.impl.compose.card.familycard.FamilyCardBack (FamilyCardBack.kt:56)");
            }
            int i14 = a.f132171a[vVar.ordinal()];
            if (i14 == 1) {
                k10.W(584946453);
                int i15 = i12 & 14;
                int i16 = i12 >> 3;
                v(aVar, aVar2, dVar, k10, i15 | (i16 & 112) | (i16 & 896), 0);
                k10.P();
            } else if (i14 == 2) {
                k10.W(585064563);
                int i17 = i12 & 14;
                int i18 = i12 >> 3;
                t(aVar, aVar2, dVar, k10, i17 | (i18 & 112) | (i18 & 896), 0);
                k10.P();
            } else {
                k10.W(711604385);
                k10.P();
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C15284a(aVar, vVar, aVar2, dVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N s(k.a aVar, v vVar, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        r(aVar, vVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void t(GD.k.a r19, nI.C17631a<XH.C16807N> r20, androidx.compose.ui.d r21, U0.C4889m r22, int r23, int r24) {
        /*
            r4 = r23
            r0 = 2
            r1 = 4
            r2 = 2016117823(0x782b843f, float:1.3915079E34)
            r3 = r22
            U0.m r3 = r3.k(r2)
            r5 = r24 & 1
            if (r5 == 0) goto L_0x0016
            r5 = r4 | 6
            r11 = r19
            goto L_0x0028
        L_0x0016:
            r5 = r4 & 6
            r11 = r19
            if (r5 != 0) goto L_0x0027
            boolean r5 = r3.V(r11)
            if (r5 == 0) goto L_0x0024
            r5 = r1
            goto L_0x0025
        L_0x0024:
            r5 = r0
        L_0x0025:
            r5 = r5 | r4
            goto L_0x0028
        L_0x0027:
            r5 = r4
        L_0x0028:
            r0 = r24 & 2
            r6 = 32
            if (r0 == 0) goto L_0x0033
            r5 = r5 | 48
            r12 = r20
            goto L_0x0044
        L_0x0033:
            r0 = r4 & 48
            r12 = r20
            if (r0 != 0) goto L_0x0044
            boolean r0 = r3.F(r12)
            if (r0 == 0) goto L_0x0041
            r0 = r6
            goto L_0x0043
        L_0x0041:
            r0 = 16
        L_0x0043:
            r5 = r5 | r0
        L_0x0044:
            r0 = r24 & 4
            if (r0 == 0) goto L_0x004d
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r1 = r21
            goto L_0x005f
        L_0x004d:
            r1 = r4 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x004a
            r1 = r21
            boolean r7 = r3.V(r1)
            if (r7 == 0) goto L_0x005c
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r5 = r5 | r7
        L_0x005f:
            r7 = r5 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x0072
            boolean r7 = r3.l()
            if (r7 != 0) goto L_0x006c
            goto L_0x0072
        L_0x006c:
            r3.L()
            r5 = r1
            goto L_0x0133
        L_0x0072:
            if (r0 == 0) goto L_0x0077
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0078
        L_0x0077:
            r0 = r1
        L_0x0078:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0084
            r1 = -1
            java.lang.String r7 = "com.ingka.ikea.wallet.impl.compose.card.familycard.FamilyCardHorizontalBack (FamilyCardBack.kt:96)"
            U0.C4895p.S(r2, r5, r1, r7)
        L_0x0084:
            r1 = 0
            tK.h r2 = SC.C13575d.a(r3, r1)
            long r14 = r2.D0()
            r17 = 2
            r18 = 0
            r16 = 0
            r13 = r0
            androidx.compose.ui.d r2 = androidx.compose.foundation.b.d(r13, r14, r16, r17, r18)
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.i(r2, r6)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c r6 = r6.b()
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r1)
            int r1 = U0.C4883j.a(r3, r1)
            U0.y r7 = r3.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r3, r2)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r3.m()
            if (r10 != 0) goto L_0x00c6
            U0.C4883j.c()
        L_0x00c6:
            r3.I()
            boolean r10 = r3.i()
            if (r10 == 0) goto L_0x00d3
            r3.p(r9)
            goto L_0x00d6
        L_0x00d3:
            r3.t()
        L_0x00d6:
            U0.m r9 = U0.F1.a(r3)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r6, r10)
            nI.p r6 = r8.e()
            U0.F1.c(r9, r7, r6)
            nI.p r6 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x0100
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x010e
        L_0x0100:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r9.u(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.w(r1, r6)
        L_0x010e:
            nI.p r1 = r8.d()
            U0.F1.c(r9, r2, r1)
            androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
            java.lang.String r1 = r19.h()
            r9 = r5 & 112(0x70, float:1.57E-43)
            r10 = 4
            r7 = 0
            r5 = r1
            r6 = r20
            r8 = r3
            h(r5, r6, r7, r8, r9, r10)
            r3.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0132
            U0.C4895p.R()
        L_0x0132:
            r5 = r0
        L_0x0133:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x014b
            yD.c r7 = new yD.c
            r0 = r7
            r1 = r19
            r2 = r20
            r3 = r5
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yD.C15291h.t(GD.k$a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N u(k.a aVar, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        t(aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void v(GD.k.a r27, nI.C17631a<XH.C16807N> r28, androidx.compose.ui.d r29, U0.C4889m r30, int r31, int r32) {
        /*
            r4 = r31
            r0 = 2
            r1 = 4
            r2 = 1255180205(0x4ad087ad, float:6833110.5)
            r3 = r30
            U0.m r3 = r3.k(r2)
            r5 = 1
            r6 = r32 & 1
            if (r6 == 0) goto L_0x0017
            r6 = r4 | 6
            r11 = r27
            goto L_0x0029
        L_0x0017:
            r6 = r4 & 6
            r11 = r27
            if (r6 != 0) goto L_0x0028
            boolean r6 = r3.V(r11)
            if (r6 == 0) goto L_0x0025
            r6 = r1
            goto L_0x0026
        L_0x0025:
            r6 = r0
        L_0x0026:
            r6 = r6 | r4
            goto L_0x0029
        L_0x0028:
            r6 = r4
        L_0x0029:
            r0 = r32 & 2
            if (r0 == 0) goto L_0x0032
            r6 = r6 | 48
            r12 = r28
            goto L_0x0044
        L_0x0032:
            r0 = r4 & 48
            r12 = r28
            if (r0 != 0) goto L_0x0044
            boolean r0 = r3.F(r12)
            if (r0 == 0) goto L_0x0041
            r0 = 32
            goto L_0x0043
        L_0x0041:
            r0 = 16
        L_0x0043:
            r6 = r6 | r0
        L_0x0044:
            r0 = r32 & 4
            if (r0 == 0) goto L_0x004d
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r1 = r29
            goto L_0x005f
        L_0x004d:
            r1 = r4 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x004a
            r1 = r29
            boolean r7 = r3.V(r1)
            if (r7 == 0) goto L_0x005c
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r6 = r6 | r7
        L_0x005f:
            r7 = r6 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x0072
            boolean r7 = r3.l()
            if (r7 != 0) goto L_0x006c
            goto L_0x0072
        L_0x006c:
            r3.L()
            r5 = r1
            goto L_0x01d1
        L_0x0072:
            if (r0 == 0) goto L_0x0077
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0078
        L_0x0077:
            r0 = r1
        L_0x0078:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0084
            r1 = -1
            java.lang.String r7 = "com.ingka.ikea.wallet.impl.compose.card.familycard.FamilyCardVerticalBack (FamilyCardBack.kt:72)"
            U0.C4895p.S(r2, r6, r1, r7)
        L_0x0084:
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r1 = r1.g()
            i1.c$a r2 = i1.C5437c.f24302a
            i1.c$b r7 = r2.k()
            r8 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r7, r3, r8)
            int r7 = U0.C4883j.a(r3, r8)
            U0.y r9 = r3.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r3, r0)
            G1.g$a r13 = G1.C4504g.f6515W
            nI.a r14 = r13.a()
            U0.f r15 = r3.m()
            if (r15 != 0) goto L_0x00b0
            U0.C4883j.c()
        L_0x00b0:
            r3.I()
            boolean r15 = r3.i()
            if (r15 == 0) goto L_0x00bd
            r3.p(r14)
            goto L_0x00c0
        L_0x00bd:
            r3.t()
        L_0x00c0:
            U0.m r14 = U0.F1.a(r3)
            nI.p r15 = r13.c()
            U0.F1.c(r14, r1, r15)
            nI.p r1 = r13.e()
            U0.F1.c(r14, r9, r1)
            nI.p r1 = r13.b()
            boolean r9 = r14.i()
            if (r9 != 0) goto L_0x00ea
            java.lang.Object r9 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r15)
            if (r9 != 0) goto L_0x00f8
        L_0x00ea:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r14.u(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r14.w(r7, r1)
        L_0x00f8:
            nI.p r1 = r13.d()
            U0.F1.c(r14, r10, r1)
            s0.h r15 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r7 = 0
            r9 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r1, r7, r5, r9)
            r19 = 2
            r20 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            androidx.compose.ui.d r21 = s0.C5861g.c(r15, r16, r17, r18, r19, r20)
            tK.h r5 = SC.C13575d.a(r3, r8)
            long r22 = r5.D0()
            r25 = 2
            r26 = 0
            r24 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.b.d(r21, r22, r24, r25, r26)
            i1.c r2 = r2.e()
            E1.I r2 = androidx.compose.foundation.layout.C5077h.h(r2, r8)
            int r7 = U0.C4883j.a(r3, r8)
            U0.y r8 = r3.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r3, r5)
            nI.a r9 = r13.a()
            U0.f r10 = r3.m()
            if (r10 != 0) goto L_0x0148
            U0.C4883j.c()
        L_0x0148:
            r3.I()
            boolean r10 = r3.i()
            if (r10 == 0) goto L_0x0155
            r3.p(r9)
            goto L_0x0158
        L_0x0155:
            r3.t()
        L_0x0158:
            U0.m r9 = U0.F1.a(r3)
            nI.p r10 = r13.c()
            U0.F1.c(r9, r2, r10)
            nI.p r2 = r13.e()
            U0.F1.c(r9, r8, r2)
            nI.p r2 = r13.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x0182
            java.lang.Object r8 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x0190
        L_0x0182:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r2)
        L_0x0190:
            nI.p r2 = r13.d()
            U0.F1.c(r9, r5, r2)
            androidx.compose.foundation.layout.j r2 = androidx.compose.foundation.layout.C5079j.f18125a
            java.lang.String r5 = r27.h()
            r2 = 24
            float r2 = (float) r2
            float r18 = c2.h.B(r2)
            float r20 = c2.h.B(r2)
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            r16 = r1
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r1 = r6 & 112(0x70, float:1.57E-43)
            r9 = r1 | 384(0x180, float:5.38E-43)
            r10 = 0
            r6 = r28
            r8 = r3
            m(r5, r6, r7, r8, r9, r10)
            r3.x()
            r3.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x01d0
            U0.C4895p.R()
        L_0x01d0:
            r5 = r0
        L_0x01d1:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x01e9
            yD.b r7 = new yD.b
            r0 = r7
            r1 = r27
            r2 = r28
            r3 = r5
            r4 = r31
            r5 = r32
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yD.C15291h.v(GD.k$a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N w(k.a aVar, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        v(aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
