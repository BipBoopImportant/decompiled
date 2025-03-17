package Op;

import E1.C4478k;
import L1.i;
import Op.C10828d;
import SC.Q1;
import SC.R1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import gs.C11352b;
import gs.e;
import gs.f;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5749w0;
import t1.C5942c;
import uK.C18146a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aK\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LOp/d$h;", "productInfo", "LOp/i1;", "currencyConfig", "", "familyAndRegularPriceSameSize", "Lkotlin/Function0;", "LXH/N;", "onEnergyLabelClicked", "Landroidx/compose/ui/d;", "modifier", "LSC/Q1;", "variant", "g", "(LOp/d$h;LOp/i1;ZLnI/a;Landroidx/compose/ui/d;LSC/Q1;LU0/m;II)V", "LSC/R1;", "j", "(LOp/d$h;LOp/i1;ZLU0/m;I)LSC/R1;", "LOp/d$c;", "energyDisclaimer", "onClick", "d", "(LOp/d$c;LnI/a;LU0/m;I)V", "product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class F {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10828d.h f84896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f84897b;

        a(C10828d.h hVar, C17631a<C16807N> aVar) {
            this.f84896a = hVar;
            this.f84897b = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-210329809, i10, -1, "com.ingka.ikea.design.ui.product.PriceModule.<anonymous>.<anonymous> (PriceModule.kt:70)");
                }
                F.d(this.f84896a.f(), this.f84897b, mVar, 0);
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

    /* access modifiers changed from: private */
    public static final void d(C10828d.c cVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C10828d.c cVar2 = cVar;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-133122066);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-133122066, i11, -1, "com.ingka.ikea.design.ui.product.EnergyLabel (PriceModule.kt:97)");
            }
            k10.W(1034839571);
            boolean z10 = (i11 & 14) == 4;
            Object D10 = k10.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new D(cVar2);
                k10.u(D10);
            }
            k10.P();
            mVar2 = k10;
            C11352b.b(f.a((C17642l) D10, k10, 0), cVar.a().a(), J.i(C5116k1.a(d.d(androidx.compose.ui.d.f18749a, false, (String) null, (i) null, aVar, 7, (Object) null), "ENERGY_LABEL"), h.B((float) 32)), (C5942c) null, (C5942c) null, (C5942c) null, (C5437c) null, (C4478k) null, 0.0f, (C5749w0) null, 0, mVar2, e.f97946h, 0, 2040);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new E(cVar2, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C10828d.c cVar, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(cVar.a().b());
        aVar.k(Integer.valueOf(C18146a.f148160N5));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C10828d.c cVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        d(cVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: SC.Q1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: SC.Q1$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: SC.Q1$b} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(Op.C10828d.h r22, Op.i1 r23, boolean r24, nI.C17631a<XH.C16807N> r25, androidx.compose.ui.d r26, SC.Q1 r27, U0.C4889m r28, int r29, int r30) {
        /*
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r0 = r27
            r7 = r29
            java.lang.String r5 = "productInfo"
            kotlin.jvm.internal.C17542s.j(r1, r5)
            java.lang.String r5 = "onEnergyLabelClicked"
            kotlin.jvm.internal.C17542s.j(r4, r5)
            r5 = -300604278(0xffffffffee15248a, float:-1.153936E28)
            r6 = r28
            U0.m r6 = r6.k(r5)
            r8 = r30 & 1
            if (r8 == 0) goto L_0x0026
            r8 = r7 | 6
            goto L_0x0036
        L_0x0026:
            r8 = r7 & 6
            if (r8 != 0) goto L_0x0035
            boolean r8 = r6.V(r1)
            if (r8 == 0) goto L_0x0032
            r8 = 4
            goto L_0x0033
        L_0x0032:
            r8 = 2
        L_0x0033:
            r8 = r8 | r7
            goto L_0x0036
        L_0x0035:
            r8 = r7
        L_0x0036:
            r9 = r30 & 2
            if (r9 == 0) goto L_0x003d
            r8 = r8 | 48
            goto L_0x004d
        L_0x003d:
            r9 = r7 & 48
            if (r9 != 0) goto L_0x004d
            boolean r9 = r6.V(r2)
            if (r9 == 0) goto L_0x004a
            r9 = 32
            goto L_0x004c
        L_0x004a:
            r9 = 16
        L_0x004c:
            r8 = r8 | r9
        L_0x004d:
            r9 = r30 & 4
            if (r9 == 0) goto L_0x0054
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0054:
            r9 = r7 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0064
            boolean r9 = r6.b(r3)
            if (r9 == 0) goto L_0x0061
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r8 = r8 | r9
        L_0x0064:
            r9 = r30 & 8
            if (r9 == 0) goto L_0x006b
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x006b:
            r9 = r7 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x007b
            boolean r9 = r6.F(r4)
            if (r9 == 0) goto L_0x0078
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r8 = r8 | r9
        L_0x007b:
            r9 = r30 & 16
            if (r9 == 0) goto L_0x0084
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x0081:
            r10 = r26
            goto L_0x0096
        L_0x0084:
            r10 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0081
            r10 = r26
            boolean r11 = r6.V(r10)
            if (r11 == 0) goto L_0x0093
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r8 = r8 | r11
        L_0x0096:
            r11 = 196608(0x30000, float:2.75506E-40)
            r11 = r11 & r7
            if (r11 != 0) goto L_0x00b5
            r11 = r30 & 32
            if (r11 != 0) goto L_0x00b2
            r11 = 262144(0x40000, float:3.67342E-40)
            r11 = r11 & r7
            if (r11 != 0) goto L_0x00a9
            boolean r11 = r6.V(r0)
            goto L_0x00ad
        L_0x00a9:
            boolean r11 = r6.F(r0)
        L_0x00ad:
            if (r11 == 0) goto L_0x00b2
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r8 = r8 | r11
        L_0x00b5:
            r11 = 74899(0x12493, float:1.04956E-40)
            r11 = r11 & r8
            r12 = 74898(0x12492, float:1.04954E-40)
            if (r11 != r12) goto L_0x00cd
            boolean r11 = r6.l()
            if (r11 != 0) goto L_0x00c5
            goto L_0x00cd
        L_0x00c5:
            r6.L()
            r21 = r0
            r5 = r10
            goto L_0x01d6
        L_0x00cd:
            r6.G()
            r11 = r7 & 1
            r12 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r11 == 0) goto L_0x00ea
            boolean r11 = r6.O()
            if (r11 == 0) goto L_0x00de
            goto L_0x00ea
        L_0x00de:
            r6.L()
            r9 = r30 & 32
            if (r9 == 0) goto L_0x00e6
            r8 = r8 & r12
        L_0x00e6:
            r21 = r0
            r0 = r10
            goto L_0x0107
        L_0x00ea:
            if (r9 == 0) goto L_0x00ef
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            goto L_0x00f0
        L_0x00ef:
            r9 = r10
        L_0x00f0:
            r10 = r30 & 32
            if (r10 == 0) goto L_0x0104
            SC.Q1$b r0 = new SC.Q1$b
            SC.P1 r14 = SC.P1.Medium
            r17 = 4
            r18 = 0
            r15 = 1
            r16 = 0
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            r8 = r8 & r12
        L_0x0104:
            r21 = r0
            r0 = r9
        L_0x0107:
            r6.y()
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x0116
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.design.ui.product.PriceModule (PriceModule.kt:45)"
            U0.C4895p.S(r5, r8, r9, r10)
        L_0x0116:
            r5 = -574260982(0xffffffffddc5790a, float:-1.77867694E18)
            r6.W(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = r22.d()
            r5.append(r9)
            IC.e r9 = r22.e()
            r10 = -574258167(0xffffffffddc58409, float:-1.77906383E18)
            r6.W(r10)
            if (r9 != 0) goto L_0x0135
            goto L_0x0143
        L_0x0135:
            r10 = 10
            r5.append(r10)
            int r10 = IC.C13023e.f110931a
            java.lang.String r9 = r9.a(r6, r10)
            r5.append(r9)
        L_0x0143:
            r6.P()
            java.lang.String r9 = r5.toString()
            r6.P()
            java.lang.String r5 = r22.k()
            Op.d$l r10 = r22.i()
            Op.d$l$e r10 = r10.a()
            qx.c r10 = r10.c()
            Op.d$l r11 = r22.i()
            Op.d$l$e r11 = r11.a()
            java.lang.String r13 = r11.e()
            r11 = 0
            if (r2 == 0) goto L_0x0171
            kp.d r12 = r23.a()
            goto L_0x0172
        L_0x0171:
            r12 = r11
        L_0x0172:
            SC.n r12 = SC.L1.b(r12)
            r14 = r8 & 1022(0x3fe, float:1.432E-42)
            SC.R1 r16 = j(r1, r2, r3, r6, r14)
            KJ.c r17 = r22.j()
            Op.d$c r14 = r22.f()
            r15 = -574234633(0xffffffffddc5dff7, float:-1.78229832E18)
            r6.W(r15)
            if (r14 != 0) goto L_0x018e
            r15 = r11
            goto L_0x019e
        L_0x018e:
            Op.F$a r11 = new Op.F$a
            r11.<init>(r1, r4)
            r14 = 54
            r15 = -210329809(0xfffffffff3769f2f, float:-1.9539393E31)
            r1 = 1
            c1.a r1 = c1.c.e(r15, r1, r11, r6, r14)
            r15 = r1
        L_0x019e:
            r6.P()
            int r1 = qx.c.f130485c
            int r1 = r1 << 6
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r8
            r1 = r1 | r11
            int r11 = SC.Q1.f115893a
            int r11 = r11 << 18
            r1 = r1 | r11
            int r8 = r8 << 3
            r11 = 3670016(0x380000, float:5.142788E-39)
            r8 = r8 & r11
            r1 = r1 | r8
            int r8 = SC.R1.f115902a
            int r8 = r8 << 24
            r1 = r1 | r8
            int r8 = IC.C13023e.f110931a
            int r8 = r8 << 27
            r19 = r1 | r8
            r20 = 0
            r8 = r5
            r11 = r12
            r12 = r0
            r14 = r21
            r18 = r6
            SC.N1.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x01d5
            U0.C4895p.R()
        L_0x01d5:
            r5 = r0
        L_0x01d6:
            U0.Y0 r9 = r6.n()
            if (r9 == 0) goto L_0x01f3
            Op.C r10 = new Op.C
            r0 = r10
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r6 = r21
            r7 = r29
            r8 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x01f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.F.g(Op.d$h, Op.i1, boolean, nI.a, androidx.compose.ui.d, SC.Q1, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C10828d.h hVar, i1 i1Var, boolean z10, C17631a aVar, androidx.compose.ui.d dVar, Q1 q12, int i10, int i11, C4889m mVar, int i12) {
        g(hVar, i1Var, z10, aVar, dVar, q12, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final R1 j(C10828d.h hVar, i1 i1Var, boolean z10, C4889m mVar, int i10) {
        R1 r12;
        mVar.W(-1998781904);
        if (C4895p.J()) {
            C4895p.S(-1998781904, i10, -1, "com.ingka.ikea.design.ui.product.mapPriceOfferType (PriceModule.kt:83)");
        }
        if (i1Var == null) {
            r12 = null;
        } else {
            r12 = e1.a(hVar.i(), hVar.g(), i1Var.a(), z10, mVar, (i10 << 3) & 7168);
        }
        if (r12 == null) {
            r12 = R1.h.f115917b;
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return r12;
    }
}
