package Op;

import Op.C10850o;
import Op.Z0;
import Op.a1;
import Op.b1;
import SC.Q1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import androidx.compose.ui.d;
import bI.C17035a;
import com.ingka.ikea.core.model.Link;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a]\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001ac\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001as\u0010#\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b#\u0010$\u001aQ\u0010&\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00142\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b&\u0010'\u001a/\u0010)\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0003¢\u0006\u0004\b)\u0010*\u001a3\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\b-\u0010.\u001a5\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"LOp/a1;", "uiModel", "Landroidx/compose/ui/d;", "modifier", "LSC/Q1;", "priceModuleVariant", "Lc2/h;", "contentHorizontalPadding", "contentVerticalPadding", "imageSize", "Lkotlin/Function1;", "LOp/Z0;", "LXH/N;", "eventHandler", "O", "(LOp/a1;Landroidx/compose/ui/d;LSC/Q1;FFFLnI/l;LU0/m;II)V", "Lkotlin/Function0;", "onEnergyLabelClicked", "P", "(LOp/a1;LSC/Q1;FFFLnI/a;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "", "Z", "(LOp/a1;)Z", "LOp/b1$b;", "uiModelQuantity", "LOp/a1$a;", "fabDetails", "showOptionsMenu", "", "productName", "LOp/Z0$c$a;", "onFabClicked", "onOptionsMenuClicked", "", "onQuantityChanged", "M", "(LOp/b1$b;LOp/a1$a;ZLjava/lang/String;LnI/l;LnI/a;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "showFab", "w", "(LOp/a1;ZLnI/l;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "onClick", "K", "(Ljava/lang/String;Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "LOp/o;", "fabAction", "B", "(LOp/o;Ljava/lang/String;LnI/l;LU0/m;I)V", "LOp/b1;", "quantityRepresentation", "X", "(LOp/b1;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Y0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((C10850o) t10).b()), Integer.valueOf(((C10850o) t11).b()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((C10850o) t10).b()), Integer.valueOf(((C10850o) t11).b()));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(a1 a1Var, boolean z10, C17642l lVar, C17642l lVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        w(a1Var, z10, lVar, lVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void B(Op.C10850o r10, java.lang.String r11, nI.C17642l<? super Op.Z0.c.a, XH.C16807N> r12, U0.C4889m r13, int r14) {
        /*
            r0 = -2133923178(0xffffffff80ceea96, float:-1.9002266E-38)
            U0.m r13 = r13.k(r0)
            r1 = r14 & 6
            r2 = 4
            if (r1 != 0) goto L_0x0017
            boolean r1 = r13.V(r10)
            if (r1 == 0) goto L_0x0014
            r1 = r2
            goto L_0x0015
        L_0x0014:
            r1 = 2
        L_0x0015:
            r1 = r1 | r14
            goto L_0x0018
        L_0x0017:
            r1 = r14
        L_0x0018:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x0028
            boolean r3 = r13.V(r11)
            if (r3 == 0) goto L_0x0025
            r3 = 32
            goto L_0x0027
        L_0x0025:
            r3 = 16
        L_0x0027:
            r1 = r1 | r3
        L_0x0028:
            r3 = r14 & 384(0x180, float:5.38E-43)
            r4 = 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x0039
            boolean r3 = r13.F(r12)
            if (r3 == 0) goto L_0x0036
            r3 = r4
            goto L_0x0038
        L_0x0036:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0038:
            r1 = r1 | r3
        L_0x0039:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r3 != r5) goto L_0x004b
            boolean r3 = r13.l()
            if (r3 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            r13.L()
            goto L_0x0251
        L_0x004b:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0057
            r3 = -1
            java.lang.String r5 = "com.ingka.ikea.design.ui.product.FabActionContent (ProductItemListContent.kt:381)"
            U0.C4895p.S(r0, r1, r3, r5)
        L_0x0057:
            boolean r0 = r10 instanceof Op.C10850o.a
            r3 = 0
            r5 = 1
            if (r0 == 0) goto L_0x009d
            r0 = -259884928(0xfffffffff0827880, float:-3.230298E29)
            r13.W(r0)
            r0 = r10
            Op.o$a r0 = (Op.C10850o.a) r0
            r2 = -1255304935(0xffffffffb52d9119, float:-6.4658667E-7)
            r13.W(r2)
            r2 = r1 & 896(0x380, float:1.256E-42)
            if (r2 != r4) goto L_0x0071
            r3 = r5
        L_0x0071:
            java.lang.Object r2 = r13.D()
            if (r3 != 0) goto L_0x007f
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0087
        L_0x007f:
            Op.G0 r2 = new Op.G0
            r2.<init>(r12)
            r13.u(r2)
        L_0x0087:
            r3 = r2
            nI.a r3 = (nI.C17631a) r3
            r13.P()
            r6 = r1 & 112(0x70, float:1.57E-43)
            r7 = 8
            r4 = 0
            r1 = r0
            r2 = r11
            r5 = r13
            Op.C10865w.h(r1, r2, r3, r4, r5, r6, r7)
            r13.P()
            goto L_0x0248
        L_0x009d:
            Op.o$h r0 = Op.C10850o.h.f85258a
            boolean r0 = kotlin.jvm.internal.C17542s.e(r10, r0)
            if (r0 == 0) goto L_0x00e2
            r0 = -259586832(0xfffffffff08704f0, float:-3.3429156E29)
            r13.W(r0)
            r0 = -1255296745(0xffffffffb52db117, float:-6.470522E-7)
            r13.W(r0)
            r0 = r1 & 896(0x380, float:1.256E-42)
            if (r0 != r4) goto L_0x00b6
            r3 = r5
        L_0x00b6:
            java.lang.Object r0 = r13.D()
            if (r3 != 0) goto L_0x00c4
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x00cc
        L_0x00c4:
            Op.H0 r0 = new Op.H0
            r0.<init>(r12)
            r13.u(r0)
        L_0x00cc:
            r2 = r0
            nI.a r2 = (nI.C17631a) r2
            r13.P()
            int r0 = r1 >> 3
            r5 = r0 & 14
            r6 = 4
            r3 = 0
            r1 = r11
            r4 = r13
            Op.C10865w.t(r1, r2, r3, r4, r5, r6)
            r13.P()
            goto L_0x0248
        L_0x00e2:
            boolean r0 = r10 instanceof Op.C10850o.g
            if (r0 == 0) goto L_0x0123
            r0 = -259324944(0xfffffffff08b03f0, float:-3.441854E29)
            r13.W(r0)
            r0 = r10
            Op.o$g r0 = (Op.C10850o.g) r0
            r2 = -1255288328(0xffffffffb52dd1f8, float:-6.4753067E-7)
            r13.W(r2)
            r1 = r1 & 896(0x380, float:1.256E-42)
            if (r1 != r4) goto L_0x00fa
            r3 = r5
        L_0x00fa:
            java.lang.Object r1 = r13.D()
            if (r3 != 0) goto L_0x0108
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x0110
        L_0x0108:
            Op.I0 r1 = new Op.I0
            r1.<init>(r12)
            r13.u(r1)
        L_0x0110:
            r3 = r1
            nI.a r3 = (nI.C17631a) r3
            r13.P()
            r5 = 0
            r6 = 2
            r2 = 0
            r1 = r0
            r4 = r13
            Op.C10865w.r(r1, r2, r3, r4, r5, r6)
            r13.P()
            goto L_0x0248
        L_0x0123:
            Op.o$c r0 = Op.C10850o.c.f85245a
            boolean r0 = kotlin.jvm.internal.C17542s.e(r10, r0)
            if (r0 == 0) goto L_0x0162
            r0 = -259074371(0xfffffffff08ed6bd, float:-3.536518E29)
            r13.W(r0)
            r0 = -1255281578(0xffffffffb52dec56, float:-6.4791436E-7)
            r13.W(r0)
            r0 = r1 & 896(0x380, float:1.256E-42)
            if (r0 != r4) goto L_0x013d
            r0 = r5
            goto L_0x013e
        L_0x013d:
            r0 = r3
        L_0x013e:
            java.lang.Object r1 = r13.D()
            if (r0 != 0) goto L_0x014c
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0154
        L_0x014c:
            Op.J0 r1 = new Op.J0
            r1.<init>(r12)
            r13.u(r1)
        L_0x0154:
            nI.a r1 = (nI.C17631a) r1
            r13.P()
            r0 = 0
            Op.C10865w.l(r0, r1, r13, r3, r5)
            r13.P()
            goto L_0x0248
        L_0x0162:
            boolean r0 = r10 instanceof Op.C10850o.e
            if (r0 == 0) goto L_0x01a5
            r0 = -258859293(0xfffffffff0921ee3, float:-3.617772E29)
            r13.W(r0)
            r0 = r10
            Op.o$e r0 = (Op.C10850o.e) r0
            r2 = -1255271974(0xffffffffb52e11da, float:-6.484603E-7)
            r13.W(r2)
            r2 = r1 & 896(0x380, float:1.256E-42)
            if (r2 != r4) goto L_0x017a
            r3 = r5
        L_0x017a:
            java.lang.Object r2 = r13.D()
            if (r3 != 0) goto L_0x0188
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0190
        L_0x0188:
            Op.K0 r2 = new Op.K0
            r2.<init>(r12)
            r13.u(r2)
        L_0x0190:
            r4 = r2
            nI.a r4 = (nI.C17631a) r4
            r13.P()
            r6 = r1 & 112(0x70, float:1.57E-43)
            r7 = 4
            r3 = 0
            r1 = r0
            r2 = r11
            r5 = r13
            Op.C10865w.n(r1, r2, r3, r4, r5, r6, r7)
            r13.P()
            goto L_0x0248
        L_0x01a5:
            boolean r0 = r10 instanceof Op.C10850o.b
            if (r0 == 0) goto L_0x0205
            r0 = -258553168(0xfffffffff096cab0, float:-3.733423E29)
            r13.W(r0)
            r0 = r10
            Op.o$b r0 = (Op.C10850o.b) r0
            int r6 = r0.d()
            IC.e r7 = r0.c()
            int r8 = IC.C13023e.f110931a
            java.lang.String r7 = r7.a(r13, r8)
            SC.H0 r0 = r0.f()
            r8 = -1255259185(0xffffffffb52e43cf, float:-6.4918726E-7)
            r13.W(r8)
            r8 = r1 & 896(0x380, float:1.256E-42)
            if (r8 != r4) goto L_0x01d0
            r4 = r5
            goto L_0x01d1
        L_0x01d0:
            r4 = r3
        L_0x01d1:
            r1 = r1 & 14
            if (r1 != r2) goto L_0x01d6
            r3 = r5
        L_0x01d6:
            r1 = r4 | r3
            java.lang.Object r2 = r13.D()
            if (r1 != 0) goto L_0x01e6
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x01ee
        L_0x01e6:
            Op.L0 r2 = new Op.L0
            r2.<init>(r12, r10)
            r13.u(r2)
        L_0x01ee:
            r4 = r2
            nI.a r4 = (nI.C17631a) r4
            r13.P()
            r8 = 0
            r9 = 16
            r5 = 0
            r1 = r6
            r2 = r7
            r3 = r0
            r6 = r13
            r7 = r8
            r8 = r9
            Op.C10865w.j(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.P()
            goto L_0x0248
        L_0x0205:
            Op.o$f r0 = Op.C10850o.f.f85251a
            boolean r0 = kotlin.jvm.internal.C17542s.e(r10, r0)
            if (r0 == 0) goto L_0x0260
            r0 = -258045946(0xfffffffff09e8806, float:-3.925046E29)
            r13.W(r0)
            r0 = -1255246977(0xffffffffb52e737f, float:-6.498812E-7)
            r13.W(r0)
            r0 = r1 & 896(0x380, float:1.256E-42)
            if (r0 != r4) goto L_0x021e
            r3 = r5
        L_0x021e:
            java.lang.Object r0 = r13.D()
            if (r3 != 0) goto L_0x022c
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x0234
        L_0x022c:
            Op.M0 r0 = new Op.M0
            r0.<init>(r12)
            r13.u(r0)
        L_0x0234:
            r2 = r0
            nI.a r2 = (nI.C17631a) r2
            r13.P()
            int r0 = r1 >> 3
            r5 = r0 & 14
            r6 = 4
            r3 = 0
            r1 = r11
            r4 = r13
            Op.C10865w.p(r1, r2, r3, r4, r5, r6)
            r13.P()
        L_0x0248:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0251
            U0.C4895p.R()
        L_0x0251:
            U0.Y0 r13 = r13.n()
            if (r13 == 0) goto L_0x025f
            Op.O0 r0 = new Op.O0
            r0.<init>(r10, r11, r12, r14)
            r13.a(r0)
        L_0x025f:
            return
        L_0x0260:
            r10 = -1255309349(0xffffffffb52d7fdb, float:-6.4633576E-7)
            r13.W(r10)
            r13.P()
            XH.t r10 = new XH.t
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.Y0.B(Op.o, java.lang.String, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N C(C17642l lVar) {
        lVar.invoke(Z0.c.a.C1718a.f85052b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C17642l lVar) {
        lVar.invoke(Z0.c.a.g.f85058b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C17642l lVar) {
        lVar.invoke(Z0.c.a.f.f85057b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(C17642l lVar) {
        lVar.invoke(Z0.c.a.C1719c.f85054b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G(C17642l lVar) {
        lVar.invoke(Z0.c.a.d.f85055b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(C17642l lVar, C10850o oVar) {
        lVar.invoke(new Z0.c.a.b(((C10850o.b) oVar).e()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I(C17642l lVar) {
        lVar.invoke(Z0.c.a.e.f85056b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J(C10850o oVar, String str, C17642l lVar, int i10, C4889m mVar, int i11) {
        B(oVar, str, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void K(java.lang.String r17, androidx.compose.ui.d r18, nI.C17631a<XH.C16807N> r19, U0.C4889m r20, int r21, int r22) {
        /*
            r4 = r21
            r0 = 2108441308(0x7dac42dc, float:2.8621796E37)
            r1 = r20
            U0.m r1 = r1.k(r0)
            r2 = r22 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r4 | 6
            r3 = r2
            r2 = r17
            goto L_0x0029
        L_0x0015:
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r17
            boolean r3 = r1.V(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r4
            goto L_0x0029
        L_0x0026:
            r2 = r17
            r3 = r4
        L_0x0029:
            r5 = r22 & 2
            if (r5 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r6 = r18
            goto L_0x0044
        L_0x0032:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x002f
            r6 = r18
            boolean r7 = r1.V(r6)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r3 = r3 | r7
        L_0x0044:
            r7 = r22 & 4
            if (r7 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
            r15 = r19
            goto L_0x005f
        L_0x004d:
            r7 = r4 & 384(0x180, float:5.38E-43)
            r15 = r19
            if (r7 != 0) goto L_0x005f
            boolean r7 = r1.F(r15)
            if (r7 == 0) goto L_0x005c
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r7
        L_0x005f:
            r7 = r3 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x0071
            boolean r7 = r1.l()
            if (r7 != 0) goto L_0x006c
            goto L_0x0071
        L_0x006c:
            r1.L()
            r3 = r6
            goto L_0x00ba
        L_0x0071:
            if (r5 == 0) goto L_0x0077
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r14 = r5
            goto L_0x0078
        L_0x0077:
            r14 = r6
        L_0x0078:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0084
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.design.ui.product.OptionsMenu (ProductItemListContent.kt:360)"
            U0.C4895p.S(r0, r3, r5, r6)
        L_0x0084:
            int r0 = Oo.b.f84839y
            java.lang.Object[] r5 = new java.lang.Object[]{r17}
            r6 = 0
            java.lang.String r6 = J1.j.c(r0, r5, r1, r6)
            java.lang.String r0 = "ProductItemListContentTestTags_OPTIONS_MENU"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r14, r0)
            int r5 = uK.C18146a.f148098J3
            SC.G0 r10 = SC.G0.Small
            SC.H0 r9 = SC.H0.Tertiary
            int r0 = r3 << 18
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r3
            r3 = 221184(0x36000, float:3.09945E-40)
            r0 = r0 | r3
            r16 = 200(0xc8, float:2.8E-43)
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = r19
            r3 = r14
            r14 = r1
            r15 = r0
            SC.F0.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ba
            U0.C4895p.R()
        L_0x00ba:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x00d2
            Op.P0 r7 = new Op.P0
            r0 = r7
            r1 = r17
            r2 = r3
            r3 = r19
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.Y0.K(java.lang.String, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N L(String str, d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        K(str, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void M(Op.b1.b r29, Op.a1.a r30, boolean r31, java.lang.String r32, nI.C17642l<? super Op.Z0.c.a, XH.C16807N> r33, nI.C17631a<XH.C16807N> r34, nI.C17642l<? super java.lang.Integer, XH.C16807N> r35, androidx.compose.ui.d r36, U0.C4889m r37, int r38, int r39) {
        /*
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r38
            r12 = r39
            r0 = 8
            r1 = 128(0x80, float:1.794E-43)
            r2 = 32
            r13 = 16
            r3 = 4
            r4 = 1233900888(0x498bd558, float:1145515.0)
            r5 = r37
            U0.m r14 = r5.k(r4)
            r5 = 1
            r15 = r12 & 1
            r5 = 2
            if (r15 == 0) goto L_0x0029
            r15 = r11 | 6
            goto L_0x0039
        L_0x0029:
            r15 = r11 & 6
            if (r15 != 0) goto L_0x0038
            boolean r15 = r14.V(r6)
            if (r15 == 0) goto L_0x0035
            r15 = r3
            goto L_0x0036
        L_0x0035:
            r15 = r5
        L_0x0036:
            r15 = r15 | r11
            goto L_0x0039
        L_0x0038:
            r15 = r11
        L_0x0039:
            r16 = r12 & 2
            if (r16 == 0) goto L_0x0040
            r15 = r15 | 48
            goto L_0x0051
        L_0x0040:
            r16 = r11 & 48
            if (r16 != 0) goto L_0x0051
            boolean r16 = r14.V(r7)
            if (r16 == 0) goto L_0x004d
            r16 = r2
            goto L_0x004f
        L_0x004d:
            r16 = r13
        L_0x004f:
            r15 = r15 | r16
        L_0x0051:
            r3 = r3 & r12
            if (r3 == 0) goto L_0x0057
            r15 = r15 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0057:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0066
            boolean r3 = r14.b(r8)
            if (r3 == 0) goto L_0x0064
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0064:
            r3 = r1
        L_0x0065:
            r15 = r15 | r3
        L_0x0066:
            r3 = r12 & 8
            if (r3 == 0) goto L_0x006d
            r15 = r15 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006d:
            r3 = r11 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x007d
            boolean r3 = r14.V(r9)
            if (r3 == 0) goto L_0x007a
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r15 = r15 | r3
        L_0x007d:
            r3 = r12 & 16
            if (r3 == 0) goto L_0x0084
            r15 = r15 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0094
        L_0x0084:
            r3 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0094
            boolean r3 = r14.F(r10)
            if (r3 == 0) goto L_0x0091
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r15 = r15 | r3
        L_0x0094:
            r2 = r2 & r12
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x009d
            r15 = r15 | r3
            r3 = r34
            goto L_0x00af
        L_0x009d:
            r2 = r11 & r3
            r3 = r34
            if (r2 != 0) goto L_0x00af
            boolean r2 = r14.F(r3)
            if (r2 == 0) goto L_0x00ac
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r15 = r15 | r2
        L_0x00af:
            r2 = r12 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00ba
            r15 = r15 | r16
        L_0x00b7:
            r2 = r35
            goto L_0x00cd
        L_0x00ba:
            r2 = r11 & r16
            if (r2 != 0) goto L_0x00b7
            r2 = r35
            boolean r16 = r14.F(r2)
            if (r16 == 0) goto L_0x00c9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r15 = r15 | r16
        L_0x00cd:
            r1 = r1 & r12
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00d7
            r15 = r15 | r16
            r5 = r36
            goto L_0x00ea
        L_0x00d7:
            r16 = r11 & r16
            r5 = r36
            if (r16 != 0) goto L_0x00ea
            boolean r17 = r14.V(r5)
            if (r17 == 0) goto L_0x00e6
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e8
        L_0x00e6:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e8:
            r15 = r15 | r17
        L_0x00ea:
            r17 = 4793491(0x492493, float:6.717112E-39)
            r13 = r15 & r17
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r13 != r0) goto L_0x0102
            boolean r0 = r14.l()
            if (r0 != 0) goto L_0x00fb
            goto L_0x0102
        L_0x00fb:
            r14.L()
            r16 = r5
            goto L_0x036e
        L_0x0102:
            if (r1 == 0) goto L_0x0108
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r13 = r0
            goto L_0x0109
        L_0x0108:
            r13 = r5
        L_0x0109:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0115
            r0 = -1
            java.lang.String r1 = "com.ingka.ikea.design.ui.product.ProductActions (ProductItemListContent.kt:215)"
            U0.C4895p.S(r4, r15, r0, r1)
        L_0x0115:
            r5 = 0
            r4 = 0
            r0 = 1
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.J.h(r13, r5, r0, r4)
            r0 = 8
            float r1 = (float) r0
            float r20 = c2.h.B(r1)
            r23 = 13
            r24 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            float r5 = c2.h.B(r1)
            androidx.compose.foundation.layout.d$f r4 = r4.n(r5)
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$c r5 = r5.i()
            r11 = 54
            E1.I r4 = androidx.compose.foundation.layout.G.b(r4, r5, r14, r11)
            r5 = 0
            int r17 = U0.C4883j.a(r14, r5)
            U0.y r5 = r14.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r14, r0)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r11 = r19.a()
            U0.f r21 = r14.m()
            if (r21 != 0) goto L_0x0163
            U0.C4883j.c()
        L_0x0163:
            r14.I()
            boolean r21 = r14.i()
            if (r21 == 0) goto L_0x0170
            r14.p(r11)
            goto L_0x0173
        L_0x0170:
            r14.t()
        L_0x0173:
            U0.m r11 = U0.F1.a(r14)
            nI.p r2 = r19.c()
            U0.F1.c(r11, r4, r2)
            nI.p r2 = r19.e()
            U0.F1.c(r11, r5, r2)
            nI.p r2 = r19.b()
            boolean r4 = r11.i()
            if (r4 != 0) goto L_0x019d
            java.lang.Object r4 = r11.D()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
            if (r4 != 0) goto L_0x01ab
        L_0x019d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            r11.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            r11.w(r4, r2)
        L_0x01ab:
            nI.p r2 = r19.d()
            U0.F1.c(r11, r0, r2)
            s0.N r21 = s0.C5843N.f28726a
            r0 = -8012333(0xffffffffff85bdd3, float:NaN)
            r14.W(r0)
            if (r6 != 0) goto L_0x01c3
            r11 = r1
            r16 = r13
            r6 = 0
            r12 = 2
            r13 = 0
            goto L_0x01ef
        L_0x01c3:
            androidx.compose.ui.d$a r22 = androidx.compose.ui.d.f18749a
            float r25 = c2.h.B(r1)
            r27 = 11
            r28 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r22, r23, r24, r25, r26, r27, r28)
            int r0 = r15 >> 12
            r0 = r0 & 896(0x380, float:1.256E-42)
            r4 = r0 | 48
            r5 = 0
            r0 = r29
            r11 = r1
            r1 = r2
            r2 = r35
            r3 = r14
            r6 = 0
            r16 = r13
            r12 = 2
            r13 = 0
            X(r0, r1, r2, r3, r4, r5)
            XH.N r0 = XH.C16807N.f139792a
        L_0x01ef:
            r14.P()
            if (r7 == 0) goto L_0x01f9
            KJ.c r4 = r30.a()
            goto L_0x01fa
        L_0x01f9:
            r4 = r6
        L_0x01fa:
            if (r4 != 0) goto L_0x0200
            java.util.List r4 = YH.C16877v.n()
        L_0x0200:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r4.iterator()
        L_0x0210:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x022d
            java.lang.Object r3 = r2.next()
            r4 = r3
            Op.o r4 = (Op.C10850o) r4
            Op.o$d r4 = r4.a()
            Op.o$d r5 = Op.C10850o.d.Start
            if (r4 != r5) goto L_0x0229
            r0.add(r3)
            goto L_0x0210
        L_0x0229:
            r1.add(r3)
            goto L_0x0210
        L_0x022d:
            XH.v r2 = new XH.v
            r2.<init>(r0, r1)
            java.lang.Object r0 = r2.a()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r2.b()
            java.util.List r1 = (java.util.List) r1
            r2 = -7999133(0xffffffffff85f163, float:NaN)
            r14.W(r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            Op.Y0$a r2 = new Op.Y0$a
            r2.<init>()
            java.util.List r0 = YH.C16877v.g1(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0255:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0269
            java.lang.Object r2 = r0.next()
            Op.o r2 = (Op.C10850o) r2
            int r3 = r15 >> 6
            r3 = r3 & 1008(0x3f0, float:1.413E-42)
            B(r2, r9, r10, r14, r3)
            goto L_0x0255
        L_0x0269:
            r14.P()
            if (r8 == 0) goto L_0x027c
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r2 = 16
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.A.c(r0, r2, r13, r12, r6)
            goto L_0x027e
        L_0x027c:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
        L_0x027e:
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r25 = 2
            r26 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = 0
            r22 = r2
            androidx.compose.ui.d r3 = s0.C5842M.e(r21, r22, r23, r24, r25, r26)
            r4 = 0
            s0.C5844O.a(r3, r14, r4)
            androidx.compose.ui.d r0 = r2.s(r0)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            float r3 = c2.h.B(r11)
            androidx.compose.foundation.layout.d$f r2 = r2.n(r3)
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$c r3 = r3.i()
            r5 = 54
            E1.I r2 = androidx.compose.foundation.layout.G.b(r2, r3, r14, r5)
            int r3 = U0.C4883j.a(r14, r4)
            U0.y r4 = r14.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r14, r0)
            G1.g$a r5 = G1.C4504g.f6515W
            nI.a r6 = r5.a()
            U0.f r11 = r14.m()
            if (r11 != 0) goto L_0x02c7
            U0.C4883j.c()
        L_0x02c7:
            r14.I()
            boolean r11 = r14.i()
            if (r11 == 0) goto L_0x02d4
            r14.p(r6)
            goto L_0x02d7
        L_0x02d4:
            r14.t()
        L_0x02d7:
            U0.m r6 = U0.F1.a(r14)
            nI.p r11 = r5.c()
            U0.F1.c(r6, r2, r11)
            nI.p r2 = r5.e()
            U0.F1.c(r6, r4, r2)
            nI.p r2 = r5.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x0301
            java.lang.Object r4 = r6.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r11)
            if (r4 != 0) goto L_0x030f
        L_0x0301:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r2)
        L_0x030f:
            nI.p r2 = r5.d()
            U0.F1.c(r6, r0, r2)
            s0.N r0 = s0.C5843N.f28726a
            r0 = -1980375942(0xffffffff89f5dc7a, float:-5.918894E-33)
            r14.W(r0)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            Op.Y0$b r0 = new Op.Y0$b
            r0.<init>()
            java.util.List r0 = YH.C16877v.g1(r1, r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x032f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0343
            java.lang.Object r1 = r0.next()
            Op.o r1 = (Op.C10850o) r1
            int r2 = r15 >> 6
            r2 = r2 & 1008(0x3f0, float:1.413E-42)
            B(r1, r9, r10, r14, r2)
            goto L_0x032f
        L_0x0343:
            r14.P()
            r0 = -1980368616(0xffffffff89f5f918, float:-5.921585E-33)
            r14.W(r0)
            if (r8 == 0) goto L_0x035c
            int r0 = r15 >> 9
            r4 = r0 & 910(0x38e, float:1.275E-42)
            r5 = 2
            r1 = 0
            r0 = r32
            r2 = r34
            r3 = r14
            K(r0, r1, r2, r3, r4, r5)
        L_0x035c:
            r14.P()
            r14.x()
            r14.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x036e
            U0.C4895p.R()
        L_0x036e:
            U0.Y0 r11 = r14.n()
            if (r11 == 0) goto L_0x0391
            Op.E0 r12 = new Op.E0
            r0 = r12
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r16
            r9 = r38
            r10 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0391:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.Y0.M(Op.b1$b, Op.a1$a, boolean, java.lang.String, nI.l, nI.a, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N N(b1.b bVar, a1.a aVar, boolean z10, String str, C17642l lVar, C17631a aVar2, C17642l lVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        M(bVar, aVar, z10, str, lVar, aVar2, lVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void O(Op.a1 r21, androidx.compose.ui.d r22, SC.Q1 r23, float r24, float r25, float r26, nI.C17642l<? super Op.Z0, XH.C16807N> r27, U0.C4889m r28, int r29, int r30) {
        /*
            r11 = r21
            r0 = r23
            r12 = r27
            r13 = r29
            java.lang.String r1 = "uiModel"
            kotlin.jvm.internal.C17542s.j(r11, r1)
            java.lang.String r1 = "eventHandler"
            kotlin.jvm.internal.C17542s.j(r12, r1)
            r1 = 174420807(0xa657347, float:1.104763E-32)
            r2 = r28
            U0.m r14 = r2.k(r1)
            r2 = r30 & 1
            if (r2 == 0) goto L_0x0022
            r2 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r2 = r13 & 6
            if (r2 != 0) goto L_0x0031
            boolean r2 = r14.V(r11)
            if (r2 == 0) goto L_0x002e
            r2 = 4
            goto L_0x002f
        L_0x002e:
            r2 = 2
        L_0x002f:
            r2 = r2 | r13
            goto L_0x0032
        L_0x0031:
            r2 = r13
        L_0x0032:
            r3 = r30 & 2
            if (r3 == 0) goto L_0x003b
            r2 = r2 | 48
        L_0x0038:
            r4 = r22
            goto L_0x004d
        L_0x003b:
            r4 = r13 & 48
            if (r4 != 0) goto L_0x0038
            r4 = r22
            boolean r5 = r14.V(r4)
            if (r5 == 0) goto L_0x004a
            r5 = 32
            goto L_0x004c
        L_0x004a:
            r5 = 16
        L_0x004c:
            r2 = r2 | r5
        L_0x004d:
            r5 = r13 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x006a
            r5 = r30 & 4
            if (r5 != 0) goto L_0x0067
            r5 = r13 & 512(0x200, float:7.175E-43)
            if (r5 != 0) goto L_0x005e
            boolean r5 = r14.V(r0)
            goto L_0x0062
        L_0x005e:
            boolean r5 = r14.F(r0)
        L_0x0062:
            if (r5 == 0) goto L_0x0067
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r2 = r2 | r5
        L_0x006a:
            r5 = r13 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0083
            r5 = r30 & 8
            if (r5 != 0) goto L_0x007d
            r5 = r24
            boolean r6 = r14.c(r5)
            if (r6 == 0) goto L_0x007f
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007d:
            r5 = r24
        L_0x007f:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r2 = r2 | r6
            goto L_0x0085
        L_0x0083:
            r5 = r24
        L_0x0085:
            r6 = r30 & 16
            if (r6 == 0) goto L_0x008e
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x008b:
            r7 = r25
            goto L_0x00a0
        L_0x008e:
            r7 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x008b
            r7 = r25
            boolean r8 = r14.c(r7)
            if (r8 == 0) goto L_0x009d
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r2 = r2 | r8
        L_0x00a0:
            r8 = r30 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L_0x00aa
            r2 = r2 | r9
        L_0x00a7:
            r9 = r26
            goto L_0x00bb
        L_0x00aa:
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00a7
            r9 = r26
            boolean r10 = r14.c(r9)
            if (r10 == 0) goto L_0x00b8
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r2 = r2 | r10
        L_0x00bb:
            r10 = r30 & 64
            r15 = 1572864(0x180000, float:2.204052E-39)
            if (r10 == 0) goto L_0x00c3
            r2 = r2 | r15
            goto L_0x00d3
        L_0x00c3:
            r10 = r13 & r15
            if (r10 != 0) goto L_0x00d3
            boolean r10 = r14.F(r12)
            if (r10 == 0) goto L_0x00d0
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r2 = r2 | r10
        L_0x00d3:
            r10 = 599187(0x92493, float:8.3964E-40)
            r10 = r10 & r2
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r15) goto L_0x00ed
            boolean r10 = r14.l()
            if (r10 != 0) goto L_0x00e3
            goto L_0x00ed
        L_0x00e3:
            r14.L()
            r3 = r0
            r2 = r4
            r4 = r5
            r5 = r7
            r6 = r9
            goto L_0x01e5
        L_0x00ed:
            r14.G()
            r10 = r13 & 1
            r15 = 0
            r1 = 1
            if (r10 == 0) goto L_0x0116
            boolean r10 = r14.O()
            if (r10 == 0) goto L_0x00fd
            goto L_0x0116
        L_0x00fd:
            r14.L()
            r3 = r30 & 4
            if (r3 == 0) goto L_0x0106
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0106:
            r3 = r30 & 8
            if (r3 == 0) goto L_0x010c
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x010c:
            r17 = r0
            r10 = r4
            r18 = r5
        L_0x0111:
            r19 = r7
            r20 = r9
            goto L_0x0157
        L_0x0116:
            if (r3 == 0) goto L_0x011b
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x011c
        L_0x011b:
            r3 = r4
        L_0x011c:
            r4 = r30 & 4
            if (r4 == 0) goto L_0x0127
            SC.Q1$a r0 = new SC.Q1$a
            r0.<init>(r15, r1, r15)
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0127:
            r4 = r30 & 8
            if (r4 == 0) goto L_0x0134
            tK.u r4 = tK.C18029u.f147649a
            float r4 = r4.d()
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0135
        L_0x0134:
            r4 = r5
        L_0x0135:
            if (r6 == 0) goto L_0x013e
            r5 = 0
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            r7 = r5
        L_0x013e:
            if (r8 == 0) goto L_0x0151
            r5 = 80
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            r17 = r0
            r10 = r3
            r18 = r4
            r20 = r5
            r19 = r7
            goto L_0x0157
        L_0x0151:
            r17 = r0
            r10 = r3
            r18 = r4
            goto L_0x0111
        L_0x0157:
            r14.y()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0169
            r0 = -1
            java.lang.String r3 = "com.ingka.ikea.design.ui.product.ProductItemListContent (ProductItemListContent.kt:60)"
            r4 = 174420807(0xa657347, float:1.104763E-32)
            U0.C4895p.S(r4, r2, r0, r3)
        L_0x0169:
            Op.d r0 = r21.o()
            java.lang.String r0 = r0.f()
            r3 = -1512734075(0xffffffffa5d58285, float:-3.7038054E-16)
            r14.W(r3)
            boolean r0 = r14.V(r0)
            java.lang.Object r3 = r14.D()
            if (r0 != 0) goto L_0x0189
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x0191
        L_0x0189:
            Op.C0 r3 = new Op.C0
            r3.<init>(r12, r11)
            r14.u(r3)
        L_0x0191:
            r5 = r3
            nI.a r5 = (nI.C17631a) r5
            r14.P()
            java.lang.String r0 = "ProductItemListContentTestTags_CONTENT"
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r10, r0)
            r3 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r0, r3, r1, r15)
            r0 = r2 & 14
            int r1 = SC.Q1.f115893a
            int r1 = r1 << 3
            r0 = r0 | r1
            int r1 = r2 >> 3
            r3 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r0 = r0 | r1
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r2
            r9 = r0 | r1
            r15 = 0
            r0 = r21
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r6 = r27
            r8 = r14
            r16 = r10
            r10 = r15
            P(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01db
            U0.C4895p.R()
        L_0x01db:
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
        L_0x01e5:
            U0.Y0 r10 = r14.n()
            if (r10 == 0) goto L_0x01fc
            Op.N0 r14 = new Op.N0
            r0 = r14
            r1 = r21
            r7 = r27
            r8 = r29
            r9 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r14)
        L_0x01fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.Y0.O(Op.a1, androidx.compose.ui.d, SC.Q1, float, float, float, nI.l, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void P(Op.a1 r39, SC.Q1 r40, float r41, float r42, float r43, nI.C17631a<XH.C16807N> r44, nI.C17642l<? super Op.Z0, XH.C16807N> r45, androidx.compose.ui.d r46, U0.C4889m r47, int r48, int r49) {
        /*
            r8 = r39
            r7 = r40
            r6 = r41
            r5 = r42
            r4 = r43
            r3 = r45
            r2 = r48
            r1 = r49
            r0 = 128(0x80, float:1.794E-43)
            r9 = 32
            r10 = 16
            r11 = 1057594715(0x3f099d5b, float:0.5375573)
            r12 = r47
            U0.m r15 = r12.k(r11)
            r14 = 1
            r12 = r1 & 1
            r13 = 2
            r14 = 4
            if (r12 == 0) goto L_0x0029
            r12 = r2 | 6
            goto L_0x0039
        L_0x0029:
            r12 = r2 & 6
            if (r12 != 0) goto L_0x0038
            boolean r12 = r15.V(r8)
            if (r12 == 0) goto L_0x0035
            r12 = r14
            goto L_0x0036
        L_0x0035:
            r12 = r13
        L_0x0036:
            r12 = r12 | r2
            goto L_0x0039
        L_0x0038:
            r12 = r2
        L_0x0039:
            r16 = r1 & 2
            if (r16 == 0) goto L_0x0040
            r12 = r12 | 48
            goto L_0x005a
        L_0x0040:
            r16 = r2 & 48
            if (r16 != 0) goto L_0x005a
            r16 = r2 & 64
            if (r16 != 0) goto L_0x004d
            boolean r16 = r15.V(r7)
            goto L_0x0051
        L_0x004d:
            boolean r16 = r15.F(r7)
        L_0x0051:
            if (r16 == 0) goto L_0x0056
            r16 = r9
            goto L_0x0058
        L_0x0056:
            r16 = r10
        L_0x0058:
            r12 = r12 | r16
        L_0x005a:
            r16 = r1 & 4
            if (r16 == 0) goto L_0x0061
            r12 = r12 | 384(0x180, float:5.38E-43)
            goto L_0x0070
        L_0x0061:
            r13 = r2 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L_0x0070
            boolean r13 = r15.c(r6)
            if (r13 == 0) goto L_0x006e
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x006f
        L_0x006e:
            r13 = r0
        L_0x006f:
            r12 = r12 | r13
        L_0x0070:
            r13 = r1 & 8
            if (r13 == 0) goto L_0x0077
            r12 = r12 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0077:
            r13 = r2 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0087
            boolean r13 = r15.c(r5)
            if (r13 == 0) goto L_0x0084
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r12 = r12 | r13
        L_0x0087:
            r13 = r1 & 16
            if (r13 == 0) goto L_0x008e
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008e:
            r13 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x009e
            boolean r13 = r15.c(r4)
            if (r13 == 0) goto L_0x009b
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r12 = r12 | r13
        L_0x009e:
            r9 = r9 & r1
            r13 = 196608(0x30000, float:2.75506E-40)
            if (r9 == 0) goto L_0x00a7
            r12 = r12 | r13
        L_0x00a4:
            r9 = r44
            goto L_0x00b9
        L_0x00a7:
            r9 = r2 & r13
            if (r9 != 0) goto L_0x00a4
            r9 = r44
            boolean r13 = r15.F(r9)
            if (r13 == 0) goto L_0x00b6
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r12 = r12 | r13
        L_0x00b9:
            r13 = r1 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            r7 = 1048576(0x100000, float:1.469368E-39)
            if (r13 == 0) goto L_0x00c4
            r12 = r12 | r17
            goto L_0x00d3
        L_0x00c4:
            r13 = r2 & r17
            if (r13 != 0) goto L_0x00d3
            boolean r13 = r15.F(r3)
            if (r13 == 0) goto L_0x00d0
            r13 = r7
            goto L_0x00d2
        L_0x00d0:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r12 = r12 | r13
        L_0x00d3:
            r0 = r0 & r1
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00dc
            r12 = r12 | r13
        L_0x00d9:
            r13 = r46
            goto L_0x00ee
        L_0x00dc:
            r13 = r13 & r2
            if (r13 != 0) goto L_0x00d9
            r13 = r46
            boolean r17 = r15.V(r13)
            if (r17 == 0) goto L_0x00ea
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r12 = r12 | r17
        L_0x00ee:
            r17 = 4793491(0x492493, float:6.717112E-39)
            r10 = r12 & r17
            r14 = 4793490(0x492492, float:6.71711E-39)
            if (r10 != r14) goto L_0x0107
            boolean r10 = r15.l()
            if (r10 != 0) goto L_0x00ff
            goto L_0x0107
        L_0x00ff:
            r15.L()
            r23 = r13
            r0 = r15
            goto L_0x0496
        L_0x0107:
            if (r0 == 0) goto L_0x010c
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x010d
        L_0x010c:
            r0 = r13
        L_0x010d:
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x0119
            r10 = -1
            java.lang.String r13 = "com.ingka.ikea.design.ui.product.ProductItemListContentImpl (ProductItemListContent.kt:95)"
            U0.C4895p.S(r11, r12, r10, r13)
        L_0x0119:
            boolean r24 = Z(r39)
            r10 = 1502704300(0x599172ac, float:5.1174943E15)
            r15.W(r10)
            r10 = 3670016(0x380000, float:5.142788E-39)
            r11 = r12 & r10
            if (r11 != r7) goto L_0x012b
            r13 = 1
            goto L_0x012c
        L_0x012b:
            r13 = 0
        L_0x012c:
            r14 = r12 & 14
            r10 = 4
            if (r14 != r10) goto L_0x0133
            r10 = 1
            goto L_0x0134
        L_0x0133:
            r10 = 0
        L_0x0134:
            r10 = r10 | r13
            java.lang.Object r13 = r15.D()
            if (r10 != 0) goto L_0x0143
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r13 != r10) goto L_0x014b
        L_0x0143:
            Op.Q0 r13 = new Op.Q0
            r13.<init>(r3, r8)
            r15.u(r13)
        L_0x014b:
            r25 = r13
            nI.l r25 = (nI.C17642l) r25
            r15.P()
            r10 = 1502713372(0x5991961c, float:5.1223648E15)
            r15.W(r10)
            boolean r10 = r39.r()
            if (r10 == 0) goto L_0x01a2
            androidx.compose.ui.d$a r26 = androidx.compose.ui.d.f18749a
            r10 = 1502715010(0x59919c82, float:5.1232442E15)
            r15.W(r10)
            if (r11 != r7) goto L_0x016b
            r10 = 1
        L_0x0169:
            r13 = 4
            goto L_0x016d
        L_0x016b:
            r10 = 0
            goto L_0x0169
        L_0x016d:
            if (r14 != r13) goto L_0x0172
            r17 = 1
            goto L_0x0174
        L_0x0172:
            r17 = 0
        L_0x0174:
            r10 = r10 | r17
            java.lang.Object r7 = r15.D()
            if (r10 != 0) goto L_0x0184
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r7 != r10) goto L_0x018c
        L_0x0184:
            Op.R0 r7 = new Op.R0
            r7.<init>(r3, r8)
            r15.u(r7)
        L_0x018c:
            r30 = r7
            nI.a r30 = (nI.C17631a) r30
            r15.P()
            r31 = 7
            r32 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.d.d(r26, r27, r28, r29, r30, r31, r32)
            goto L_0x01a5
        L_0x01a2:
            r13 = 4
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
        L_0x01a5:
            r15.P()
            androidx.compose.ui.d r7 = r0.s(r7)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.j(r7, r6, r5)
            androidx.compose.foundation.layout.d r10 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r13 = r10.g()
            i1.c$a r26 = i1.C5437c.f24302a
            r27 = r0
            i1.c$b r0 = r26.k()
            r1 = 0
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r13, r0, r15, r1)
            int r13 = U0.C4883j.a(r15, r1)
            U0.y r1 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r7)
            G1.g$a r28 = G1.C4504g.f6515W
            nI.a r2 = r28.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x01de
            U0.C4883j.c()
        L_0x01de:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x01eb
            r15.p(r2)
            goto L_0x01ee
        L_0x01eb:
            r15.t()
        L_0x01ee:
            U0.m r2 = U0.F1.a(r15)
            nI.p r3 = r28.c()
            U0.F1.c(r2, r0, r3)
            nI.p r0 = r28.e()
            U0.F1.c(r2, r1, r0)
            nI.p r0 = r28.b()
            boolean r1 = r2.i()
            if (r1 != 0) goto L_0x0218
            java.lang.Object r1 = r2.D()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r1 != 0) goto L_0x0226
        L_0x0218:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2.u(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2.w(r1, r0)
        L_0x0226:
            nI.p r0 = r28.d()
            U0.F1.c(r2, r7, r0)
            s0.h r0 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r1 = 0
            r7 = 0
            r2 = 1
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r0, r1, r2, r7)
            androidx.compose.foundation.layout.d$e r3 = r10.f()
            i1.c$c r13 = r26.l()
            r2 = 0
            E1.I r3 = androidx.compose.foundation.layout.G.b(r3, r13, r15, r2)
            int r13 = U0.C4883j.a(r15, r2)
            U0.y r2 = r15.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r15, r1)
            nI.a r7 = r28.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x025e
            U0.C4883j.c()
        L_0x025e:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x026b
            r15.p(r7)
            goto L_0x026e
        L_0x026b:
            r15.t()
        L_0x026e:
            U0.m r7 = U0.F1.a(r15)
            nI.p r5 = r28.c()
            U0.F1.c(r7, r3, r5)
            nI.p r3 = r28.e()
            U0.F1.c(r7, r2, r3)
            nI.p r2 = r28.b()
            boolean r3 = r7.i()
            if (r3 != 0) goto L_0x0298
            java.lang.Object r3 = r7.D()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
            if (r3 != 0) goto L_0x02a6
        L_0x0298:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r7.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r7.w(r3, r2)
        L_0x02a6:
            nI.p r2 = r28.d()
            U0.F1.c(r7, r1, r2)
            s0.N r33 = s0.C5843N.f28726a
            androidx.compose.ui.d r13 = androidx.compose.foundation.layout.J.t(r0, r4)
            Op.d r1 = r39.o()
            KJ.c r1 = r1.d()
            r21 = 0
            r22 = 252(0xfc, float:3.53E-43)
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r18 = 0
            r19 = 0
            r30 = r12
            r12 = r1
            r1 = 2
            r16 = 4
            r4 = r14
            r31 = 1
            r14 = r2
            r2 = r15
            r15 = r3
            r16 = r5
            r17 = r7
            r20 = r2
            Op.C10872z0.R(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r37 = 2
            r38 = 0
            r35 = 1065353216(0x3f800000, float:1.0)
            r36 = 0
            r34 = r0
            androidx.compose.ui.d r12 = s0.C5842M.e(r33, r34, r35, r36, r37, r38)
            r3 = 16
            float r3 = (float) r3
            float r13 = c2.h.B(r3)
            r17 = 14
            r14 = 0
            r15 = 0
            r16 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r12, r13, r14, r15, r16, r17, r18)
            androidx.compose.foundation.layout.d$m r5 = r10.g()
            i1.c$b r7 = r26.k()
            r10 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r7, r2, r10)
            int r7 = U0.C4883j.a(r2, r10)
            U0.y r10 = r2.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r2, r3)
            nI.a r12 = r28.a()
            U0.f r13 = r2.m()
            if (r13 != 0) goto L_0x0321
            U0.C4883j.c()
        L_0x0321:
            r2.I()
            boolean r13 = r2.i()
            if (r13 == 0) goto L_0x032e
            r2.p(r12)
            goto L_0x0331
        L_0x032e:
            r2.t()
        L_0x0331:
            U0.m r12 = U0.F1.a(r2)
            nI.p r13 = r28.c()
            U0.F1.c(r12, r5, r13)
            nI.p r5 = r28.e()
            U0.F1.c(r12, r10, r5)
            nI.p r5 = r28.b()
            boolean r10 = r12.i()
            if (r10 != 0) goto L_0x035b
            java.lang.Object r10 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r13)
            if (r10 != 0) goto L_0x0369
        L_0x035b:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r12.u(r10)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12.w(r7, r5)
        L_0x0369:
            nI.p r5 = r28.d()
            U0.F1.c(r12, r3, r5)
            Op.d r3 = r39.o()
            Op.d$b r3 = r3.h()
            r5 = 212971212(0xcb1aecc, float:2.737637E-31)
            r2.W(r5)
            r5 = 0
            r7 = 0
            if (r3 != 0) goto L_0x0383
            goto L_0x0388
        L_0x0383:
            Op.C10824b.b(r3, r7, r2, r5, r1)
            XH.N r1 = XH.C16807N.f139792a
        L_0x0388:
            r2.P()
            java.lang.String r1 = "ProductItemListContentTestTags_PRICE_MODULE"
            androidx.compose.ui.d r13 = androidx.compose.ui.platform.C5116k1.a(r0, r1)
            Op.d r0 = r39.o()
            Op.d$h r0 = r0.e()
            Op.i1 r10 = new Op.i1
            kp.d r1 = r39.i()
            r10.<init>(r1)
            boolean r1 = r39.n()
            int r3 = r30 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            int r12 = SC.Q1.f115893a
            int r12 = r12 << 15
            r3 = r3 | r12
            int r12 = r30 << 12
            r14 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r14
            r16 = r3 | r12
            r17 = 0
            r9 = r0
            r18 = r5
            r5 = r11
            r11 = r1
            r12 = r44
            r14 = r40
            r15 = r2
            Op.F.g(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r24 ^ 1
            int r0 = r30 >> 12
            r0 = r0 & 896(0x380, float:1.256E-42)
            r9 = r4 | r0
            r10 = 16
            r11 = 0
            r23 = r27
            r0 = r39
            r15 = r2
            r2 = r45
            r14 = r45
            r3 = r25
            r12 = r4
            r4 = r11
            r11 = r5
            r5 = r15
            r6 = r9
            r13 = r7
            r9 = 1048576(0x100000, float:1.469368E-39)
            r7 = r10
            w(r0, r1, r2, r3, r4, r5, r6, r7)
            r15.x()
            r15.x()
            Op.b1 r0 = r39.p()
            boolean r1 = r0 instanceof Op.b1.b
            if (r1 == 0) goto L_0x03fa
            Op.b1$b r0 = (Op.b1.b) r0
            goto L_0x03fb
        L_0x03fa:
            r0 = r13
        L_0x03fb:
            Op.a1$a r1 = r39.j()
            if (r1 == 0) goto L_0x0404
            if (r24 == 0) goto L_0x0404
            r13 = r1
        L_0x0404:
            boolean r1 = r39.q()
            Op.d r2 = r39.o()
            Op.d$h r2 = r2.e()
            java.lang.String r2 = r2.k()
            r3 = -2105908921(0xffffffff827a6147, float:-1.8395016E-37)
            r15.W(r3)
            if (r11 != r9) goto L_0x0420
            r3 = r31
        L_0x041e:
            r4 = 4
            goto L_0x0423
        L_0x0420:
            r3 = r18
            goto L_0x041e
        L_0x0423:
            if (r12 != r4) goto L_0x0428
            r5 = r31
            goto L_0x042a
        L_0x0428:
            r5 = r18
        L_0x042a:
            r3 = r3 | r5
            java.lang.Object r5 = r15.D()
            if (r3 != 0) goto L_0x0439
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x0441
        L_0x0439:
            Op.S0 r5 = new Op.S0
            r5.<init>(r14, r8)
            r15.u(r5)
        L_0x0441:
            r17 = r5
            nI.a r17 = (nI.C17631a) r17
            r15.P()
            r3 = -2105919570(0xffffffff827a37ae, float:-1.8383079E-37)
            r15.W(r3)
            if (r11 != r9) goto L_0x0453
            r3 = r31
            goto L_0x0455
        L_0x0453:
            r3 = r18
        L_0x0455:
            if (r12 != r4) goto L_0x0458
            goto L_0x045a
        L_0x0458:
            r31 = r18
        L_0x045a:
            r3 = r3 | r31
            java.lang.Object r4 = r15.D()
            if (r3 != 0) goto L_0x046a
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0472
        L_0x046a:
            Op.T0 r4 = new Op.T0
            r4.<init>(r14, r8)
            r15.u(r4)
        L_0x0472:
            r18 = r4
            nI.l r18 = (nI.C17642l) r18
            r15.P()
            r21 = 0
            r22 = 128(0x80, float:1.794E-43)
            r19 = 0
            r12 = r0
            r14 = r1
            r0 = r15
            r15 = r2
            r16 = r25
            r20 = r0
            M(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0496
            U0.C4895p.R()
        L_0x0496:
            U0.Y0 r11 = r0.n()
            if (r11 == 0) goto L_0x04b9
            Op.U0 r12 = new Op.U0
            r0 = r12
            r1 = r39
            r2 = r40
            r3 = r41
            r4 = r42
            r5 = r43
            r6 = r44
            r7 = r45
            r8 = r23
            r9 = r48
            r10 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x04b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.Y0.P(Op.a1, SC.Q1, float, float, float, nI.a, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(C17642l lVar, a1 a1Var) {
        lVar.invoke(new Z0.f(a1Var.o().f()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R(C17642l lVar, a1 a1Var, int i10) {
        lVar.invoke(new Z0.g(a1Var.o().f(), i10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N S(a1 a1Var, Q1 q12, float f10, float f11, float f12, C17631a aVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        P(a1Var, q12, f10, f11, f12, aVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N T(C17642l lVar, a1 a1Var, Z0.c.a aVar) {
        C17542s.j(aVar, "type");
        lVar.invoke(new Z0.c(aVar, a1Var.o().f(), a1Var.o().e().k()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U(C17642l lVar, a1 a1Var) {
        lVar.invoke(new Z0.d(a1Var.o().f()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N V(C17642l lVar, a1 a1Var) {
        lVar.invoke(new Z0.b(a1Var.o().f()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W(a1 a1Var, d dVar, Q1 q12, float f10, float f11, float f12, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        O(a1Var, dVar, q12, f10, f11, f12, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void X(Op.b1 r31, androidx.compose.ui.d r32, nI.C17642l<? super java.lang.Integer, XH.C16807N> r33, U0.C4889m r34, int r35, int r36) {
        /*
            r1 = r31
            r4 = r35
            r0 = -305864740(0xffffffffedc4dfdc, float:-7.6162114E27)
            r2 = r34
            U0.m r2 = r2.k(r0)
            r3 = r36 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r4 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r4 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.V(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r4
            goto L_0x0024
        L_0x0023:
            r3 = r4
        L_0x0024:
            r5 = r36 & 2
            if (r5 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r6 = r32
            goto L_0x003f
        L_0x002d:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x002a
            r6 = r32
            boolean r7 = r2.V(r6)
            if (r7 == 0) goto L_0x003c
            r7 = 32
            goto L_0x003e
        L_0x003c:
            r7 = 16
        L_0x003e:
            r3 = r3 | r7
        L_0x003f:
            r7 = r36 & 4
            if (r7 == 0) goto L_0x0048
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r7 = r33
            goto L_0x005a
        L_0x0048:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0045
            r7 = r33
            boolean r8 = r2.F(r7)
            if (r8 == 0) goto L_0x0057
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r8
        L_0x005a:
            r8 = r3 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x006c
            boolean r8 = r2.l()
            if (r8 != 0) goto L_0x0067
            goto L_0x006c
        L_0x0067:
            r2.L()
            goto L_0x0132
        L_0x006c:
            if (r5 == 0) goto L_0x0072
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r15 = r5
            goto L_0x0073
        L_0x0072:
            r15 = r6
        L_0x0073:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x007f
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.design.ui.product.Quantity (ProductItemListContent.kt:459)"
            U0.C4895p.S(r0, r3, r5, r6)
        L_0x007f:
            Op.b1$a r0 = Op.b1.a.f85084a
            boolean r0 = kotlin.jvm.internal.C17542s.e(r1, r0)
            if (r0 == 0) goto L_0x0093
            r0 = -261172539(0xfffffffff06ed2c5, float:-2.9564895E29)
            r2.W(r0)
            r2.P()
            r0 = r15
            goto L_0x0128
        L_0x0093:
            boolean r0 = r1 instanceof Op.b1.c
            if (r0 == 0) goto L_0x00df
            r0 = 493649311(0x1d6c7d9f, float:3.1299285E-21)
            r2.W(r0)
            r0 = r1
            Op.b1$c r0 = (Op.b1.c) r0
            IC.e r0 = r0.a()
            int r5 = IC.C13023e.f110931a
            java.lang.String r5 = r0.a(r2, r5)
            TC.b$a$b r6 = TC.C13679b.a.C2856b.f116680a
            int r0 = r3 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r28 = r0 | 48
            r29 = 0
            r30 = 262136(0x3fff8, float:3.67331E-40)
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r0 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r7 = r0
            r27 = r2
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2.P()
            goto L_0x0128
        L_0x00df:
            r0 = r15
            boolean r5 = r1 instanceof Op.b1.b
            if (r5 == 0) goto L_0x014b
            r5 = 493926265(0x1d70b779, float:3.1858589E-21)
            r2.W(r5)
            java.lang.String r5 = "ProductItemListContentTestTags_QUANTITY_STEPPER"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r0, r5)
            r5 = r1
            Op.b1$b r5 = (Op.b1.b) r5
            int r6 = r5.d()
            SC.c2 r11 = SC.C13574c2.Small
            boolean r12 = r5.a()
            int r9 = r5.c()
            int r10 = r5.b()
            int r5 = Oo.b.f84786t
            r7 = 0
            java.lang.String r13 = J1.j.b(r5, r2, r7)
            int r5 = Oo.b.f84687k
            java.lang.String r7 = J1.j.b(r5, r2, r7)
            int r3 = r3 << 18
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r5
            r5 = 1572864(0x180000, float:2.204052E-39)
            r15 = r3 | r5
            r16 = 0
            r5 = r6
            r6 = r13
            r13 = r33
            r14 = r2
            SC.C13570b2.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.P()
        L_0x0128:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0131
            U0.C4895p.R()
        L_0x0131:
            r6 = r0
        L_0x0132:
            U0.Y0 r7 = r2.n()
            if (r7 == 0) goto L_0x014a
            Op.F0 r8 = new Op.F0
            r0 = r8
            r1 = r31
            r2 = r6
            r3 = r33
            r4 = r35
            r5 = r36
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r8)
        L_0x014a:
            return
        L_0x014b:
            r0 = -261173953(0xfffffffff06ecd3f, float:-2.9562224E29)
            r2.W(r0)
            r2.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.Y0.X(Op.b1, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(b1 b1Var, d dVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        X(b1Var, dVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final boolean Z(a1 a1Var) {
        if (a1Var.q()) {
            return true;
        }
        a1.a j10 = a1Var.j();
        List list = null;
        List a10 = j10 != null ? j10.a() : null;
        if (a10 == null) {
            a10 = C16877v.n();
        }
        if (a10.size() > 1) {
            return true;
        }
        a1.a j11 = a1Var.j();
        if (j11 != null) {
            list = j11.a();
        }
        if (list == null) {
            list = C16877v.n();
        }
        Iterable<C10850o> iterable = list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (C10850o a11 : iterable) {
                if (a11.a() == C10850o.d.Start) {
                    return true;
                }
            }
        }
        b1 p10 = a1Var.p();
        if (p10 instanceof b1.b) {
            return true;
        }
        if (C17542s.e(p10, b1.a.f85084a) || (p10 instanceof b1.c)) {
            return false;
        }
        throw new t();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void w(Op.a1 r28, boolean r29, nI.C17642l<? super Op.Z0, XH.C16807N> r30, nI.C17642l<? super Op.Z0.c.a, XH.C16807N> r31, androidx.compose.ui.d r32, U0.C4889m r33, int r34, int r35) {
        /*
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r6 = r34
            r0 = 8
            r5 = 16
            r7 = 2
            r8 = 48
            r9 = 2025315546(0x78b7dcda, float:2.983343E34)
            r10 = r33
            U0.m r15 = r10.k(r9)
            r14 = 1
            r10 = r35 & 1
            r11 = 4
            if (r10 == 0) goto L_0x0023
            r10 = r6 | 6
            goto L_0x0033
        L_0x0023:
            r10 = r6 & 6
            if (r10 != 0) goto L_0x0032
            boolean r10 = r15.V(r1)
            if (r10 == 0) goto L_0x002f
            r10 = r11
            goto L_0x0030
        L_0x002f:
            r10 = r7
        L_0x0030:
            r10 = r10 | r6
            goto L_0x0033
        L_0x0032:
            r10 = r6
        L_0x0033:
            r7 = r35 & 2
            if (r7 == 0) goto L_0x0039
            r10 = r10 | r8
            goto L_0x0048
        L_0x0039:
            r7 = r6 & 48
            if (r7 != 0) goto L_0x0048
            boolean r7 = r15.b(r2)
            if (r7 == 0) goto L_0x0046
            r7 = 32
            goto L_0x0047
        L_0x0046:
            r7 = r5
        L_0x0047:
            r10 = r10 | r7
        L_0x0048:
            r7 = r35 & 4
            if (r7 == 0) goto L_0x004f
            r10 = r10 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004f:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005f
            boolean r7 = r15.F(r3)
            if (r7 == 0) goto L_0x005c
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r10 = r10 | r7
        L_0x005f:
            r7 = r35 & 8
            if (r7 == 0) goto L_0x0066
            r10 = r10 | 3072(0xc00, float:4.305E-42)
            goto L_0x0076
        L_0x0066:
            r7 = r6 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0076
            boolean r7 = r15.F(r4)
            if (r7 == 0) goto L_0x0073
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r10 = r10 | r7
        L_0x0076:
            r5 = r35 & 16
            if (r5 == 0) goto L_0x0080
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
        L_0x007c:
            r7 = r32
        L_0x007e:
            r13 = r10
            goto L_0x0093
        L_0x0080:
            r7 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x007c
            r7 = r32
            boolean r13 = r15.V(r7)
            if (r13 == 0) goto L_0x008f
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r10 = r10 | r13
            goto L_0x007e
        L_0x0093:
            r10 = r13 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            if (r10 != r8) goto L_0x00a8
            boolean r8 = r15.l()
            if (r8 != 0) goto L_0x00a0
            goto L_0x00a8
        L_0x00a0:
            r15.L()
            r22 = r7
            r5 = r15
            goto L_0x0482
        L_0x00a8:
            if (r5 == 0) goto L_0x00ad
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            goto L_0x00ae
        L_0x00ad:
            r5 = r7
        L_0x00ae:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00ba
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.design.ui.product.AdditionalInformation (ProductItemListContent.kt:280)"
            U0.C4895p.S(r9, r13, r7, r8)
        L_0x00ba:
            r7 = 0
            r8 = 0
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.h(r5, r7, r14, r8)
            androidx.compose.foundation.layout.d r10 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r11 = r10.f()
            i1.c$a r20 = i1.C5437c.f24302a
            i1.c$c r12 = r20.l()
            r7 = 0
            E1.I r11 = androidx.compose.foundation.layout.G.b(r11, r12, r15, r7)
            int r12 = U0.C4883j.a(r15, r7)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r15, r9)
            G1.g$a r21 = G1.C4504g.f6515W
            nI.a r8 = r21.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x00ec
            U0.C4883j.c()
        L_0x00ec:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x00f9
            r15.p(r8)
            goto L_0x00fc
        L_0x00f9:
            r15.t()
        L_0x00fc:
            U0.m r8 = U0.F1.a(r15)
            nI.p r14 = r21.c()
            U0.F1.c(r8, r11, r14)
            nI.p r11 = r21.e()
            U0.F1.c(r8, r7, r11)
            nI.p r7 = r21.b()
            boolean r11 = r8.i()
            if (r11 != 0) goto L_0x0126
            java.lang.Object r11 = r8.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 != 0) goto L_0x0134
        L_0x0126:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r8.u(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r8.w(r11, r7)
        L_0x0134:
            nI.p r7 = r21.d()
            U0.F1.c(r8, r9, r7)
            s0.N r7 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r26 = 2
            r27 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r22 = r7
            r23 = r8
            androidx.compose.ui.d r9 = s0.C5842M.e(r22, r23, r24, r25, r26, r27)
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            r11 = 1
            r12 = 0
            r14 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.k(r9, r12, r0, r11, r14)
            androidx.compose.foundation.layout.d$m r9 = r10.g()
            i1.c$b r11 = r20.k()
            r12 = 0
            E1.I r9 = androidx.compose.foundation.layout.C5080k.a(r9, r11, r15, r12)
            int r11 = U0.C4883j.a(r15, r12)
            U0.y r12 = r15.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r15, r0)
            nI.a r14 = r21.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x0181
            U0.C4883j.c()
        L_0x0181:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x018e
            r15.p(r14)
            goto L_0x0191
        L_0x018e:
            r15.t()
        L_0x0191:
            U0.m r14 = U0.F1.a(r15)
            r22 = r5
            nI.p r5 = r21.c()
            U0.F1.c(r14, r9, r5)
            nI.p r5 = r21.e()
            U0.F1.c(r14, r12, r5)
            nI.p r5 = r21.b()
            boolean r9 = r14.i()
            if (r9 != 0) goto L_0x01bd
            java.lang.Object r9 = r14.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x01cb
        L_0x01bd:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r14.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r14.w(r9, r5)
        L_0x01cb:
            nI.p r5 = r21.d()
            U0.F1.c(r14, r0, r5)
            s0.h r0 = s0.C5862h.f28810a
            r0 = 1
            r5 = 0
            r9 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r8, r5, r0, r9)
            androidx.compose.foundation.layout.d$f r11 = r10.d()
            i1.c$c r12 = r20.a()
            r14 = 54
            E1.I r11 = androidx.compose.foundation.layout.G.b(r11, r12, r15, r14)
            r12 = 0
            int r14 = U0.C4883j.a(r15, r12)
            U0.y r12 = r15.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r15, r5)
            nI.a r0 = r21.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x0203
            U0.C4883j.c()
        L_0x0203:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x0210
            r15.p(r0)
            goto L_0x0213
        L_0x0210:
            r15.t()
        L_0x0213:
            U0.m r0 = U0.F1.a(r15)
            nI.p r9 = r21.c()
            U0.F1.c(r0, r11, r9)
            nI.p r9 = r21.e()
            U0.F1.c(r0, r12, r9)
            nI.p r9 = r21.b()
            boolean r11 = r0.i()
            if (r11 != 0) goto L_0x023d
            java.lang.Object r11 = r0.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r12)
            if (r11 != 0) goto L_0x024b
        L_0x023d:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r0.u(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r0.w(r11, r9)
        L_0x024b:
            nI.p r9 = r21.d()
            U0.F1.c(r0, r5, r9)
            androidx.compose.foundation.layout.d$m r0 = r10.g()
            i1.c$b r5 = r20.k()
            r9 = 0
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r0, r5, r15, r9)
            int r5 = U0.C4883j.a(r15, r9)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r15, r8)
            nI.a r11 = r21.a()
            U0.f r12 = r15.m()
            if (r12 != 0) goto L_0x0278
            U0.C4883j.c()
        L_0x0278:
            r15.I()
            boolean r12 = r15.i()
            if (r12 == 0) goto L_0x0285
            r15.p(r11)
            goto L_0x0288
        L_0x0285:
            r15.t()
        L_0x0288:
            U0.m r11 = U0.F1.a(r15)
            nI.p r12 = r21.c()
            U0.F1.c(r11, r0, r12)
            nI.p r0 = r21.e()
            U0.F1.c(r11, r9, r0)
            nI.p r0 = r21.b()
            boolean r9 = r11.i()
            if (r9 != 0) goto L_0x02b2
            java.lang.Object r9 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x02c0
        L_0x02b2:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r11.u(r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11.w(r5, r0)
        L_0x02c0:
            nI.p r0 = r21.d()
            U0.F1.c(r11, r10, r0)
            Op.d r0 = r28.o()
            java.lang.String r10 = r0.f()
            Op.d r0 = r28.o()
            KJ.c r11 = r0.i()
            r0 = -2001207111(0xffffffff88b800b9, float:-1.1074267E-33)
            r15.W(r0)
            r0 = r13 & 896(0x380, float:1.256E-42)
            r5 = 256(0x100, float:3.59E-43)
            if (r0 != r5) goto L_0x02e5
            r5 = 1
            goto L_0x02e6
        L_0x02e5:
            r5 = 0
        L_0x02e6:
            java.lang.Object r9 = r15.D()
            if (r5 != 0) goto L_0x02f4
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r9 != r5) goto L_0x02fc
        L_0x02f4:
            Op.V0 r9 = new Op.V0
            r9.<init>(r3)
            r15.u(r9)
        L_0x02fc:
            r12 = r9
            nI.l r12 = (nI.C17642l) r12
            r15.P()
            r5 = -2001197075(0xffffffff88b827ed, float:-1.1083484E-33)
            r15.W(r5)
            r5 = 256(0x100, float:3.59E-43)
            if (r0 != r5) goto L_0x030e
            r0 = 1
            goto L_0x030f
        L_0x030e:
            r0 = 0
        L_0x030f:
            r5 = r13 & 14
            r9 = 4
            if (r5 != r9) goto L_0x0316
            r5 = 1
            goto L_0x0317
        L_0x0316:
            r5 = 0
        L_0x0317:
            r0 = r0 | r5
            java.lang.Object r5 = r15.D()
            if (r0 != 0) goto L_0x0326
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r5 != r0) goto L_0x032e
        L_0x0326:
            Op.W0 r5 = new Op.W0
            r5.<init>(r3, r1)
            r15.u(r5)
        L_0x032e:
            r0 = r5
            nI.l r0 = (nI.C17642l) r0
            r15.P()
            Op.d r5 = r28.o()
            Op.d$h r5 = r5.e()
            java.lang.String r5 = r5.k()
            r18 = 24576(0x6000, float:3.4438E-41)
            r19 = 64
            r14 = 0
            r16 = 0
            r9 = r13
            r13 = r0
            r0 = 1
            r32 = r15
            r15 = r5
            r17 = r32
            Op.C10848n.l(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            Op.d r5 = r28.o()
            KJ.c r5 = r5.c()
            r15 = r32
            r10 = 48
            Op.C10872z0.N(r5, r0, r15, r10)
            r15.x()
            r15.x()
            Op.b1 r0 = r28.p()
            r5 = 1169299853(0x45b2198d, float:5699.194)
            r15.W(r5)
            Op.b1$a r5 = Op.b1.a.f85084a
            boolean r5 = kotlin.jvm.internal.C17542s.e(r0, r5)
            if (r5 != 0) goto L_0x037d
            boolean r5 = r0 instanceof Op.b1.b
            if (r5 == 0) goto L_0x037f
        L_0x037d:
            r5 = r15
            goto L_0x03ba
        L_0x037f:
            boolean r0 = r0 instanceof Op.b1.c
            if (r0 == 0) goto L_0x03b4
            Op.b1 r10 = r28.p()
            r0 = 1169314895(0x45b2544f, float:5706.5386)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r0 != r5) goto L_0x03a1
            Op.X0 r0 = new Op.X0
            r0.<init>()
            r15.u(r0)
        L_0x03a1:
            r12 = r0
            nI.l r12 = (nI.C17642l) r12
            r15.P()
            int r0 = IC.C13023e.f110931a
            r14 = r0 | 384(0x180, float:5.38E-43)
            r0 = 2
            r11 = 0
            r13 = r15
            r5 = r15
            r15 = r0
            X(r10, r11, r12, r13, r14, r15)
            goto L_0x03ba
        L_0x03b4:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x03ba:
            r5.P()
            r5.x()
            r0 = -560971096(0xffffffffde9042a8, float:-5.1975278E18)
            r5.W(r0)
            if (r2 == 0) goto L_0x0473
            Op.a1$a r0 = r28.j()
            if (r0 == 0) goto L_0x03db
            KJ.c r0 = r0.a()
            if (r0 == 0) goto L_0x03db
            java.lang.Object r0 = YH.C16877v.y0(r0)
            Op.o r0 = (Op.C10850o) r0
            goto L_0x03dc
        L_0x03db:
            r0 = 0
        L_0x03dc:
            if (r0 != 0) goto L_0x03e0
            goto L_0x0473
        L_0x03e0:
            i1.c$c r10 = r20.a()
            androidx.compose.ui.d r7 = r7.c(r8, r10)
            i1.c r8 = r20.o()
            r10 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5077h.h(r8, r10)
            int r10 = U0.C4883j.a(r5, r10)
            U0.y r11 = r5.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r5, r7)
            nI.a r12 = r21.a()
            U0.f r13 = r5.m()
            if (r13 != 0) goto L_0x040a
            U0.C4883j.c()
        L_0x040a:
            r5.I()
            boolean r13 = r5.i()
            if (r13 == 0) goto L_0x0417
            r5.p(r12)
            goto L_0x041a
        L_0x0417:
            r5.t()
        L_0x041a:
            U0.m r12 = U0.F1.a(r5)
            nI.p r13 = r21.c()
            U0.F1.c(r12, r8, r13)
            nI.p r8 = r21.e()
            U0.F1.c(r12, r11, r8)
            nI.p r8 = r21.b()
            boolean r11 = r12.i()
            if (r11 != 0) goto L_0x0444
            java.lang.Object r11 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r13)
            if (r11 != 0) goto L_0x0452
        L_0x0444:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r12.u(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12.w(r10, r8)
        L_0x0452:
            nI.p r8 = r21.d()
            U0.F1.c(r12, r7, r8)
            androidx.compose.foundation.layout.j r7 = androidx.compose.foundation.layout.C5079j.f18125a
            Op.d r7 = r28.o()
            Op.d$h r7 = r7.e()
            java.lang.String r7 = r7.k()
            int r8 = r9 >> 3
            r8 = r8 & 896(0x380, float:1.256E-42)
            B(r0, r7, r4, r5, r8)
            r5.x()
            XH.N r0 = XH.C16807N.f139792a
        L_0x0473:
            r5.P()
            r5.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0482
            U0.C4895p.R()
        L_0x0482:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x049f
            Op.D0 r9 = new Op.D0
            r0 = r9
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r22
            r6 = r34
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x049f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.Y0.w(Op.a1, boolean, nI.l, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N x(C17642l lVar, String str) {
        C17542s.j(str, "itemNo");
        lVar.invoke(new Z0.a(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C17642l lVar, a1 a1Var, Link link) {
        C17542s.j(link, "it");
        lVar.invoke(new Z0.e(a1Var.o().f(), link));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(int i10) {
        return C16807N.f139792a;
    }
}
