package Op;

import KJ.C15987c;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.ui.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0001\u0010\u0015\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LKJ/c;", "LOp/d1;", "products", "", "title", "Lkotlin/Function0;", "LXH/N;", "onViewAllClicked", "Lkotlin/Function1;", "LOp/c1;", "onProductItemEvent", "", "onCarouselViewed", "", "isCompactDesign", "Landroidx/compose/ui/d;", "modifier", "purpose", "showLargeImage", "Lc2/h;", "headerVerticalPadding", "g", "(LKJ/c;Ljava/lang/String;LnI/a;LnI/l;LnI/l;ZLandroidx/compose/ui/d;Ljava/lang/String;ZFLU0/m;II)V", "e", "(ZLandroidx/compose/ui/d;ZLU0/m;II)V", "product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class P {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(boolean r17, androidx.compose.ui.d r18, boolean r19, U0.C4889m r20, int r21, int r22) {
        /*
            r4 = r21
            r0 = 1301757609(0x4d973ea9, float:3.17183264E8)
            r1 = r20
            U0.m r1 = r1.k(r0)
            r2 = 1
            r3 = r22 & 1
            r5 = 2
            r6 = 4
            if (r3 == 0) goto L_0x0018
            r3 = r4 | 6
            r7 = r3
            r3 = r17
            goto L_0x002c
        L_0x0018:
            r3 = r4 & 6
            if (r3 != 0) goto L_0x0029
            r3 = r17
            boolean r7 = r1.b(r3)
            if (r7 == 0) goto L_0x0026
            r7 = r6
            goto L_0x0027
        L_0x0026:
            r7 = r5
        L_0x0027:
            r7 = r7 | r4
            goto L_0x002c
        L_0x0029:
            r3 = r17
            r7 = r4
        L_0x002c:
            r8 = r22 & 2
            if (r8 == 0) goto L_0x0035
            r7 = r7 | 48
        L_0x0032:
            r9 = r18
            goto L_0x0047
        L_0x0035:
            r9 = r4 & 48
            if (r9 != 0) goto L_0x0032
            r9 = r18
            boolean r10 = r1.V(r9)
            if (r10 == 0) goto L_0x0044
            r10 = 32
            goto L_0x0046
        L_0x0044:
            r10 = 16
        L_0x0046:
            r7 = r7 | r10
        L_0x0047:
            r10 = r22 & 4
            if (r10 == 0) goto L_0x0050
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r11 = r19
            goto L_0x0062
        L_0x0050:
            r11 = r4 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x004d
            r11 = r19
            boolean r12 = r1.b(r11)
            if (r12 == 0) goto L_0x005f
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r7 = r7 | r12
        L_0x0062:
            r12 = r7 & 147(0x93, float:2.06E-43)
            r13 = 146(0x92, float:2.05E-43)
            if (r12 != r13) goto L_0x0075
            boolean r12 = r1.l()
            if (r12 != 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            r1.L()
            r2 = r9
            goto L_0x016e
        L_0x0075:
            if (r8 == 0) goto L_0x007b
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r12 = r8
            goto L_0x007c
        L_0x007b:
            r12 = r9
        L_0x007c:
            r8 = 0
            if (r10 == 0) goto L_0x0081
            r13 = r8
            goto L_0x0082
        L_0x0081:
            r13 = r11
        L_0x0082:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x008e
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.design.ui.product.LoadingProductItemCarouselWithTitleAndArrow (ProductItemCarouselWithTitleAndArrow.kt:119)"
            U0.C4895p.S(r0, r7, r9, r10)
        L_0x008e:
            float r0 = (float) r6
            float r0 = c2.h.B(r0)
            A0.f r0 = A0.g.e(r0)
            U0.I0 r6 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r6 = r1.Q(r6)
            c2.d r6 = (c2.d) r6
            r9 = 20
            long r9 = c2.w.i(r9)
            float r6 = r6.q(r9)
            androidx.compose.foundation.layout.d r9 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r9 = r9.g()
            i1.c$a r10 = i1.C5437c.f24302a
            i1.c$b r10 = r10.k()
            E1.I r9 = androidx.compose.foundation.layout.C5080k.a(r9, r10, r1, r8)
            int r10 = U0.C4883j.a(r1, r8)
            U0.y r11 = r1.s()
            androidx.compose.ui.d r14 = androidx.compose.ui.c.e(r1, r12)
            G1.g$a r15 = G1.C4504g.f6515W
            nI.a r5 = r15.a()
            U0.f r16 = r1.m()
            if (r16 != 0) goto L_0x00d6
            U0.C4883j.c()
        L_0x00d6:
            r1.I()
            boolean r16 = r1.i()
            if (r16 == 0) goto L_0x00e3
            r1.p(r5)
            goto L_0x00e6
        L_0x00e3:
            r1.t()
        L_0x00e6:
            U0.m r5 = U0.F1.a(r1)
            nI.p r8 = r15.c()
            U0.F1.c(r5, r9, r8)
            nI.p r8 = r15.e()
            U0.F1.c(r5, r11, r8)
            nI.p r8 = r15.b()
            boolean r9 = r5.i()
            if (r9 != 0) goto L_0x0110
            java.lang.Object r9 = r5.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x011e
        L_0x0110:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r5.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r5.w(r9, r8)
        L_0x011e:
            nI.p r8 = r15.d()
            U0.F1.c(r5, r14, r8)
            s0.h r5 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r5 = TC.e.i(r5)
            r8 = 24
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            r9 = 0
            r10 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.k(r5, r10, r8, r2, r9)
            r5 = 150(0x96, float:2.1E-43)
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.v(r2, r5, r6)
            androidx.compose.ui.d r0 = m1.e.a(r2, r0)
            r2 = 2
            r5 = 0
            SC.H2.b(r0, r5, r1, r5, r2)
            r0 = r7 & 14
            int r2 = r7 << 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r10 = r0 | r2
            r11 = 6
            r6 = 0
            r7 = 0
            r5 = r17
            r8 = r13
            r9 = r1
            Op.K.e(r5, r6, r7, r8, r9, r10, r11)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x016c
            U0.C4895p.R()
        L_0x016c:
            r2 = r12
            r11 = r13
        L_0x016e:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x0184
            Op.L r7 = new Op.L
            r0 = r7
            r1 = r17
            r3 = r11
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.P.e(boolean, androidx.compose.ui.d, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(boolean z10, d dVar, boolean z11, int i10, int i11, C4889m mVar, int i12) {
        e(z10, dVar, z11, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(KJ.C15987c<Op.d1> r45, java.lang.String r46, nI.C17631a<XH.C16807N> r47, nI.C17642l<? super Op.c1, XH.C16807N> r48, nI.C17642l<? super java.util.List<java.lang.String>, XH.C16807N> r49, boolean r50, androidx.compose.ui.d r51, java.lang.String r52, boolean r53, float r54, U0.C4889m r55, int r56, int r57) {
        /*
            r9 = r45
            r8 = r46
            r7 = r47
            r6 = r48
            r5 = r49
            r4 = r56
            r3 = r57
            r0 = 128(0x80, float:1.794E-43)
            r1 = 256(0x100, float:3.59E-43)
            r2 = 32
            r10 = 16
            r11 = 2
            java.lang.String r12 = "products"
            kotlin.jvm.internal.C17542s.j(r9, r12)
            java.lang.String r12 = "title"
            kotlin.jvm.internal.C17542s.j(r8, r12)
            java.lang.String r12 = "onViewAllClicked"
            kotlin.jvm.internal.C17542s.j(r7, r12)
            java.lang.String r12 = "onProductItemEvent"
            kotlin.jvm.internal.C17542s.j(r6, r12)
            java.lang.String r12 = "onCarouselViewed"
            kotlin.jvm.internal.C17542s.j(r5, r12)
            r12 = 452723085(0x1afc018d, float:1.0422726E-22)
            r13 = r55
            U0.m r13 = r13.k(r12)
            r15 = 1
            r14 = r3 & 1
            r15 = 4
            if (r14 == 0) goto L_0x0042
            r14 = r4 | 6
            goto L_0x0052
        L_0x0042:
            r14 = r4 & 6
            if (r14 != 0) goto L_0x0051
            boolean r14 = r13.V(r9)
            if (r14 == 0) goto L_0x004e
            r14 = r15
            goto L_0x004f
        L_0x004e:
            r14 = r11
        L_0x004f:
            r14 = r14 | r4
            goto L_0x0052
        L_0x0051:
            r14 = r4
        L_0x0052:
            r11 = r11 & r3
            if (r11 == 0) goto L_0x0058
            r14 = r14 | 48
            goto L_0x0066
        L_0x0058:
            r11 = r4 & 48
            if (r11 != 0) goto L_0x0066
            boolean r11 = r13.V(r8)
            if (r11 == 0) goto L_0x0064
            r11 = r2
            goto L_0x0065
        L_0x0064:
            r11 = r10
        L_0x0065:
            r14 = r14 | r11
        L_0x0066:
            r11 = r3 & 4
            if (r11 == 0) goto L_0x006d
            r14 = r14 | 384(0x180, float:5.38E-43)
            goto L_0x007b
        L_0x006d:
            r11 = r4 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x007b
            boolean r11 = r13.F(r7)
            if (r11 == 0) goto L_0x0079
            r11 = r1
            goto L_0x007a
        L_0x0079:
            r11 = r0
        L_0x007a:
            r14 = r14 | r11
        L_0x007b:
            r11 = r3 & 8
            if (r11 == 0) goto L_0x0082
            r14 = r14 | 3072(0xc00, float:4.305E-42)
            goto L_0x0092
        L_0x0082:
            r11 = r4 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0092
            boolean r11 = r13.F(r6)
            if (r11 == 0) goto L_0x008f
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0091
        L_0x008f:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0091:
            r14 = r14 | r11
        L_0x0092:
            r11 = r3 & 16
            if (r11 == 0) goto L_0x0099
            r14 = r14 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a9
        L_0x0099:
            r11 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x00a9
            boolean r11 = r13.F(r5)
            if (r11 == 0) goto L_0x00a6
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r14 = r14 | r11
        L_0x00a9:
            r2 = r2 & r3
            r11 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00b2
            r14 = r14 | r11
        L_0x00af:
            r2 = r50
            goto L_0x00c4
        L_0x00b2:
            r2 = r4 & r11
            if (r2 != 0) goto L_0x00af
            r2 = r50
            boolean r11 = r13.b(r2)
            if (r11 == 0) goto L_0x00c1
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r14 = r14 | r11
        L_0x00c4:
            r11 = r3 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r11 == 0) goto L_0x00cf
            r14 = r14 | r16
            r15 = r51
            goto L_0x00e2
        L_0x00cf:
            r16 = r4 & r16
            r15 = r51
            if (r16 != 0) goto L_0x00e2
            boolean r17 = r13.V(r15)
            if (r17 == 0) goto L_0x00de
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r14 = r14 | r17
        L_0x00e2:
            r0 = r0 & r3
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00ec
            r14 = r14 | r17
            r10 = r52
            goto L_0x00ff
        L_0x00ec:
            r17 = r4 & r17
            r10 = r52
            if (r17 != 0) goto L_0x00ff
            boolean r18 = r13.V(r10)
            if (r18 == 0) goto L_0x00fb
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fd
        L_0x00fb:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fd:
            r14 = r14 | r18
        L_0x00ff:
            r12 = r3 & 256(0x100, float:3.59E-43)
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            if (r12 == 0) goto L_0x010a
            r14 = r14 | r19
            r1 = r53
            goto L_0x011d
        L_0x010a:
            r19 = r4 & r19
            r1 = r53
            if (r19 != 0) goto L_0x011d
            boolean r20 = r13.b(r1)
            if (r20 == 0) goto L_0x0119
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011b
        L_0x0119:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011b:
            r14 = r14 | r20
        L_0x011d:
            r1 = r3 & 512(0x200, float:7.175E-43)
            r20 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == 0) goto L_0x0128
            r14 = r14 | r20
            r2 = r54
            goto L_0x013b
        L_0x0128:
            r20 = r4 & r20
            r2 = r54
            if (r20 != 0) goto L_0x013b
            boolean r20 = r13.c(r2)
            if (r20 == 0) goto L_0x0137
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0139
        L_0x0137:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0139:
            r14 = r14 | r20
        L_0x013b:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r14 & r20
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x0157
            boolean r2 = r13.l()
            if (r2 != 0) goto L_0x014c
            goto L_0x0157
        L_0x014c:
            r13.L()
            r40 = r53
            r8 = r10
            r7 = r15
            r10 = r54
            goto L_0x04b7
        L_0x0157:
            if (r11 == 0) goto L_0x015d
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r3 = r2
            goto L_0x015e
        L_0x015d:
            r3 = r15
        L_0x015e:
            r2 = 0
            if (r0 == 0) goto L_0x0164
            r39 = r2
            goto L_0x0166
        L_0x0164:
            r39 = r10
        L_0x0166:
            r0 = 0
            if (r12 == 0) goto L_0x016c
            r40 = r0
            goto L_0x016e
        L_0x016c:
            r40 = r53
        L_0x016e:
            if (r1 == 0) goto L_0x0178
            r1 = 24
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            goto L_0x017a
        L_0x0178:
            r1 = r54
        L_0x017a:
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x0189
            r10 = -1
            java.lang.String r11 = "com.ingka.ikea.design.ui.product.ProductItemCarouselWithTitleAndArrow (ProductItemCarouselWithTitleAndArrow.kt:55)"
            r12 = 452723085(0x1afc018d, float:1.0422726E-22)
            U0.C4895p.S(r12, r14, r10, r11)
        L_0x0189:
            r10 = -1317734688(0xffffffffb174f6e0, float:-3.5647005E-9)
            r13.W(r10)
            r41 = 57344(0xe000, float:8.0356E-41)
            r10 = r14 & r41
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r10 != r11) goto L_0x019a
            r10 = 1
            goto L_0x019b
        L_0x019a:
            r10 = r0
        L_0x019b:
            r12 = r14 & 14
            r11 = 4
            if (r12 != r11) goto L_0x01a2
            r11 = 1
            goto L_0x01a3
        L_0x01a2:
            r11 = r0
        L_0x01a3:
            r10 = r10 | r11
            java.lang.Object r11 = r13.D()
            if (r10 != 0) goto L_0x01b2
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x01ba
        L_0x01b2:
            Op.M r11 = new Op.M
            r11.<init>(r5, r9)
            r13.u(r11)
        L_0x01ba:
            nI.a r11 = (nI.C17631a) r11
            r13.P()
            r10 = 1
            pl.d.d(r2, r11, r13, r0, r10)
            androidx.compose.foundation.layout.d r10 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r11 = r10.g()
            i1.c$a r42 = i1.C5437c.f24302a
            i1.c$b r15 = r42.k()
            E1.I r11 = androidx.compose.foundation.layout.C5080k.a(r11, r15, r13, r0)
            int r15 = U0.C4883j.a(r13, r0)
            U0.y r0 = r13.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r13, r3)
            G1.g$a r43 = G1.C4504g.f6515W
            r44 = r3
            nI.a r3 = r43.a()
            U0.f r18 = r13.m()
            if (r18 != 0) goto L_0x01f0
            U0.C4883j.c()
        L_0x01f0:
            r13.I()
            boolean r18 = r13.i()
            if (r18 == 0) goto L_0x01fd
            r13.p(r3)
            goto L_0x0200
        L_0x01fd:
            r13.t()
        L_0x0200:
            U0.m r3 = U0.F1.a(r13)
            nI.p r4 = r43.c()
            U0.F1.c(r3, r11, r4)
            nI.p r4 = r43.e()
            U0.F1.c(r3, r0, r4)
            nI.p r0 = r43.b()
            boolean r4 = r3.i()
            if (r4 != 0) goto L_0x022a
            java.lang.Object r4 = r3.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r11)
            if (r4 != 0) goto L_0x0238
        L_0x022a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r3.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r3.w(r4, r0)
        L_0x0238:
            nI.p r0 = r43.d()
            U0.F1.c(r3, r2, r0)
            s0.h r0 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r2 = 635142149(0x25db8005, float:3.8077194E-16)
            r13.W(r2)
            int r2 = r45.size()
            r3 = 1
            if (r2 <= r3) goto L_0x028d
            r2 = 635144173(0x25db87ed, float:3.808255E-16)
            r13.W(r2)
            r2 = r14 & 896(0x380, float:1.256E-42)
            r3 = 256(0x100, float:3.59E-43)
            if (r2 != r3) goto L_0x025e
            r2 = 1
            goto L_0x025f
        L_0x025e:
            r2 = 0
        L_0x025f:
            java.lang.Object r3 = r13.D()
            if (r2 != 0) goto L_0x026d
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0275
        L_0x026d:
            Op.N r3 = new Op.N
            r3.<init>(r7)
            r13.u(r3)
        L_0x0275:
            r24 = r3
            nI.a r24 = (nI.C17631a) r24
            r13.P()
            r25 = 7
            r26 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            androidx.compose.ui.d r2 = androidx.compose.foundation.d.d(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x028e
        L_0x028d:
            r2 = r0
        L_0x028e:
            r13.P()
            androidx.compose.ui.d r2 = r0.s(r2)
            androidx.compose.ui.d r2 = TC.e.i(r2)
            r3 = 0
            r4 = 1
            r11 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.k(r2, r3, r1, r4, r11)
            androidx.compose.foundation.layout.d$m r3 = r10.g()
            i1.c$b r11 = r42.k()
            r15 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r11, r13, r15)
            int r11 = U0.C4883j.a(r13, r15)
            U0.y r15 = r13.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r13, r2)
            nI.a r4 = r43.a()
            U0.f r17 = r13.m()
            if (r17 != 0) goto L_0x02c6
            U0.C4883j.c()
        L_0x02c6:
            r13.I()
            boolean r17 = r13.i()
            if (r17 == 0) goto L_0x02d3
            r13.p(r4)
            goto L_0x02d6
        L_0x02d3:
            r13.t()
        L_0x02d6:
            U0.m r4 = U0.F1.a(r13)
            r52 = r1
            nI.p r1 = r43.c()
            U0.F1.c(r4, r3, r1)
            nI.p r1 = r43.e()
            U0.F1.c(r4, r15, r1)
            nI.p r1 = r43.b()
            boolean r3 = r4.i()
            if (r3 != 0) goto L_0x0302
            java.lang.Object r3 = r4.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r15)
            if (r3 != 0) goto L_0x0310
        L_0x0302:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r4.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r4.w(r3, r1)
        L_0x0310:
            nI.p r1 = r43.d()
            U0.F1.c(r4, r2, r1)
            r1 = -1886777156(0xffffffff8f8a10bc, float:-1.3614296E-29)
            r13.W(r1)
            if (r39 != 0) goto L_0x0323
            r4 = r13
            r2 = r14
            r1 = 1
            goto L_0x036b
        L_0x0323:
            TC.b$a$b r1 = TC.C13679b.a.C2856b.f116680a
            r2 = r14
            r14 = r1
            r1 = 4
            float r1 = (float) r1
            float r24 = c2.h.B(r1)
            r25 = 7
            r26 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            androidx.compose.ui.d r15 = androidx.compose.foundation.layout.D.m(r20, r21, r22, r23, r24, r25, r26)
            r1 = 1
            r37 = 0
            r38 = 262136(0x3fff8, float:3.67331E-40)
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r36 = 432(0x1b0, float:6.05E-43)
            r4 = r13
            r13 = r39
            r35 = r4
            SC.C13607l.j(r13, r14, r15, r16, r18, r20, r21, r22, r23, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            XH.N r3 = XH.C16807N.f139792a
        L_0x036b:
            r4.P()
            androidx.compose.foundation.layout.d$e r3 = r10.f()
            i1.c$c r10 = r42.l()
            r11 = 0
            E1.I r3 = androidx.compose.foundation.layout.G.b(r3, r10, r4, r11)
            int r10 = U0.C4883j.a(r4, r11)
            U0.y r11 = r4.s()
            androidx.compose.ui.d r13 = androidx.compose.ui.c.e(r4, r0)
            nI.a r14 = r43.a()
            U0.f r15 = r4.m()
            if (r15 != 0) goto L_0x0394
            U0.C4883j.c()
        L_0x0394:
            r4.I()
            boolean r15 = r4.i()
            if (r15 == 0) goto L_0x03a1
            r4.p(r14)
            goto L_0x03a4
        L_0x03a1:
            r4.t()
        L_0x03a4:
            U0.m r14 = U0.F1.a(r4)
            nI.p r15 = r43.c()
            U0.F1.c(r14, r3, r15)
            nI.p r3 = r43.e()
            U0.F1.c(r14, r11, r3)
            nI.p r3 = r43.b()
            boolean r11 = r14.i()
            if (r11 != 0) goto L_0x03ce
            java.lang.Object r11 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r15)
            if (r11 != 0) goto L_0x03dc
        L_0x03ce:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r14.u(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r14.w(r10, r3)
        L_0x03dc:
            nI.p r3 = r43.d()
            U0.F1.c(r14, r13, r3)
            s0.N r3 = s0.C5843N.f28726a
            TC.b$b$b r11 = TC.C13679b.C2857b.C2858b.f116684a
            r24 = 2
            r25 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r20 = r3
            r21 = r0
            androidx.compose.ui.d r10 = s0.C5842M.e(r20, r21, r22, r23, r24, r25)
            i1.c$c r13 = r42.i()
            androidx.compose.ui.d r3 = r3.c(r10, r13)
            r36 = r12
            r12 = r3
            int r3 = r2 >> 3
            r10 = r3 & 14
            r33 = r10 | 48
            r34 = 0
            r35 = 262136(0x3fff8, float:3.67331E-40)
            r13 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r10 = r46
            r32 = r4
            SC.C13607l.j(r10, r11, r12, r13, r15, r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r10 = -287935358(0xffffffffeed67482, float:-3.318532E28)
            r4.W(r10)
            int r10 = r45.size()
            if (r10 <= r1) goto L_0x0477
            int r1 = uK.C18146a.f148109K
            r10 = 0
            t1.c r13 = J1.e.c(r1, r4, r10)
            int r1 = Oo.b.f84653g9
            java.lang.String r14 = J1.j.b(r1, r4, r10)
            r1 = 16
            float r1 = (float) r1
            float r21 = c2.h.B(r1)
            r25 = 14
            r26 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r20 = r0
            androidx.compose.ui.d r15 = androidx.compose.foundation.layout.D.m(r20, r21, r22, r23, r24, r25, r26)
            tK.v r0 = tK.C18030v.f147664a
            int r1 = tK.C18030v.f147665b
            tK.h r0 = r0.a(r4, r1)
            long r16 = r0.G0()
            r19 = 384(0x180, float:5.38E-43)
            r20 = 0
            r18 = r4
            O0.V.a(r13, r14, r15, r16, r18, r19, r20)
        L_0x0477:
            r4.P()
            r4.x()
            r4.x()
            int r0 = r2 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r36 | r0
            r1 = r3 & r41
            r0 = r0 | r1
            int r1 = r2 >> 9
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r10 = r0 | r1
            r11 = 12
            r2 = 0
            r3 = 0
            r0 = r45
            r12 = r52
            r1 = r48
            r15 = r44
            r13 = r4
            r4 = r50
            r5 = r40
            r6 = r13
            r7 = r10
            r8 = r11
            Op.K.g(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r13.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x04b3
            U0.C4895p.R()
        L_0x04b3:
            r10 = r12
            r7 = r15
            r8 = r39
        L_0x04b7:
            U0.Y0 r13 = r13.n()
            if (r13 == 0) goto L_0x04d8
            Op.O r14 = new Op.O
            r0 = r14
            r1 = r45
            r2 = r46
            r3 = r47
            r4 = r48
            r5 = r49
            r6 = r50
            r9 = r40
            r11 = r56
            r12 = r57
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x04d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.P.g(KJ.c, java.lang.String, nI.a, nI.l, nI.l, boolean, androidx.compose.ui.d, java.lang.String, boolean, float, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17642l lVar, C15987c cVar) {
        ArrayList arrayList = new ArrayList(C16877v.y(cVar, 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((d1) it.next()).p().f());
        }
        lVar.invoke(arrayList);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C15987c cVar, String str, C17631a aVar, C17642l lVar, C17642l lVar2, boolean z10, d dVar, String str2, boolean z11, float f10, int i10, int i11, C4889m mVar, int i12) {
        g(cVar, str, aVar, lVar, lVar2, z10, dVar, str2, z11, f10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
