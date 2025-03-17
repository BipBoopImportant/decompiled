package Op;

import KJ.C15987c;
import L1.v;
import L1.x;
import Op.C10828d;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.t;
import androidx.compose.ui.d;
import com.ingka.ikea.core.model.Link;
import gs.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ag\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", "itemNo", "LKJ/c;", "LOp/d$g;", "productDisclaimers", "Lkotlin/Function1;", "LXH/N;", "onColorInfoClicked", "Lcom/ingka/ikea/core/model/Link;", "onLinkClicked", "", "isCompactDesign", "productName", "Landroidx/compose/ui/d;", "modifier", "l", "(Ljava/lang/String;LKJ/c;LnI/l;LnI/l;ZLjava/lang/String;Landroidx/compose/ui/d;LU0/m;II)V", "disclaimer", "LOp/d$e;", "eventHandler", "h", "(LOp/d$g;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Op.n  reason: case insensitive filesystem */
public final class C10848n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Op.n$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f85235a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                Op.d$g$a[] r0 = Op.C10828d.g.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Op.d$g$a r1 = Op.C10828d.g.a.MATERIALS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Op.d$g$a r1 = Op.C10828d.g.a.PRICE_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Op.d$g$a r1 = Op.C10828d.g.a.LAST_CHANCE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Op.d$g$a r1 = Op.C10828d.g.a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Op.d$g$a r1 = Op.C10828d.g.a.ENERGY_SHEET_URL     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                Op.d$g$a r1 = Op.C10828d.g.a.ENERGY_SHEET_DEEPLINK     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                Op.d$g$a r1 = Op.C10828d.g.a.WARNING_CHOKING_HAZARD     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                Op.d$g$a r1 = Op.C10828d.g.a.SDM_ADVERTISEMENT     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                Op.d$g$a r1 = Op.C10828d.g.a.COLOR_INFO     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                f85235a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Op.C10848n.a.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void h(Op.C10828d.g r32, nI.C17642l<? super Op.C10828d.e, XH.C16807N> r33, androidx.compose.ui.d r34, U0.C4889m r35, int r36, int r37) {
        /*
            r2 = r33
            r4 = r36
            r0 = 2
            r1 = 4
            r3 = 48
            r5 = -122269706(0xfffffffff8b64ff6, float:-2.958187E34)
            r6 = r35
            U0.m r15 = r6.k(r5)
            r6 = 1
            r7 = r37 & 1
            if (r7 == 0) goto L_0x001b
            r7 = r4 | 6
            r14 = r32
            goto L_0x002d
        L_0x001b:
            r7 = r4 & 6
            r14 = r32
            if (r7 != 0) goto L_0x002c
            boolean r7 = r15.V(r14)
            if (r7 == 0) goto L_0x0029
            r7 = r1
            goto L_0x002a
        L_0x0029:
            r7 = r0
        L_0x002a:
            r7 = r7 | r4
            goto L_0x002d
        L_0x002c:
            r7 = r4
        L_0x002d:
            r0 = r37 & 2
            r8 = 32
            if (r0 == 0) goto L_0x0035
            r7 = r7 | r3
            goto L_0x0044
        L_0x0035:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x0044
            boolean r0 = r15.F(r2)
            if (r0 == 0) goto L_0x0041
            r0 = r8
            goto L_0x0043
        L_0x0041:
            r0 = 16
        L_0x0043:
            r7 = r7 | r0
        L_0x0044:
            r0 = r37 & 4
            if (r0 == 0) goto L_0x004d
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r1 = r34
            goto L_0x005f
        L_0x004d:
            r1 = r4 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x004a
            r1 = r34
            boolean r9 = r15.V(r1)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r7 = r7 | r9
        L_0x005f:
            r9 = r7 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r9 != r10) goto L_0x0073
            boolean r9 = r15.l()
            if (r9 != 0) goto L_0x006c
            goto L_0x0073
        L_0x006c:
            r15.L()
            r5 = r1
            r3 = r15
            goto L_0x022d
        L_0x0073:
            if (r0 == 0) goto L_0x0078
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0079
        L_0x0078:
            r0 = r1
        L_0x0079:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0085
            r1 = -1
            java.lang.String r9 = "com.ingka.ikea.design.ui.product.GenericDisclaimer (Disclaimers.kt:133)"
            U0.C4895p.S(r5, r7, r1, r9)
        L_0x0085:
            Op.d$e r1 = r32.b()
            r5 = 965686489(0x398f34d9, float:2.731446E-4)
            r15.W(r5)
            r5 = 0
            if (r1 == 0) goto L_0x00d1
            r9 = 965687910(0x398f3a66, float:2.7318596E-4)
            r15.W(r9)
            r7 = r7 & 112(0x70, float:1.57E-43)
            if (r7 != r8) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r6 = r5
        L_0x009e:
            boolean r7 = r15.V(r1)
            r6 = r6 | r7
            java.lang.Object r7 = r15.D()
            if (r6 != 0) goto L_0x00b1
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x00b9
        L_0x00b1:
            Op.k r7 = new Op.k
            r7.<init>(r2, r1)
            r15.u(r7)
        L_0x00b9:
            r20 = r7
            nI.a r20 = (nI.C17631a) r20
            r15.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r0
            androidx.compose.ui.d r6 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x00d2
        L_0x00d1:
            r6 = r0
        L_0x00d2:
            r15.P()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$c r7 = r7.i()
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            tK.u r9 = tK.C18029u.f147649a
            float r9 = r9.a()
            androidx.compose.foundation.layout.d$f r8 = r8.n(r9)
            E1.I r7 = androidx.compose.foundation.layout.G.b(r8, r7, r15, r3)
            int r8 = U0.C4883j.a(r15, r5)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r6)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r12 = r15.m()
            if (r12 != 0) goto L_0x0106
            U0.C4883j.c()
        L_0x0106:
            r15.I()
            boolean r12 = r15.i()
            if (r12 == 0) goto L_0x0113
            r15.p(r11)
            goto L_0x0116
        L_0x0113:
            r15.t()
        L_0x0116:
            U0.m r11 = U0.F1.a(r15)
            nI.p r12 = r10.c()
            U0.F1.c(r11, r7, r12)
            nI.p r7 = r10.e()
            U0.F1.c(r11, r9, r7)
            nI.p r7 = r10.b()
            boolean r9 = r11.i()
            if (r9 != 0) goto L_0x0140
            java.lang.Object r9 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x014e
        L_0x0140:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r11.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.w(r8, r7)
        L_0x014e:
            nI.p r7 = r10.d()
            U0.F1.c(r11, r6, r7)
            s0.N r6 = s0.C5843N.f28726a
            Op.d$d r6 = r32.a()
            r7 = 2123241528(0x7e8e1838, float:9.443806E37)
            r15.W(r7)
            if (r6 != 0) goto L_0x0166
            r34 = r15
            goto L_0x01cf
        L_0x0166:
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r8 = 24
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.t(r7, r8)
            r7 = 1958075698(0x74b5dd32, float:1.1527003E32)
            r15.W(r7)
            boolean r7 = r15.V(r6)
            java.lang.Object r9 = r15.D()
            if (r7 != 0) goto L_0x018b
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x0193
        L_0x018b:
            Op.l r9 = new Op.l
            r9.<init>(r6)
            r15.u(r9)
        L_0x0193:
            nI.l r9 = (nI.C17642l) r9
            r15.P()
            gs.e r7 = gs.f.a(r9, r15, r5)
            java.lang.String r9 = r6.a()
            int r6 = uK.C18146a.f148160N5
            t1.c r10 = J1.e.c(r6, r15, r5)
            int r5 = gs.e.f97946h
            r5 = r5 | 384(0x180, float:5.38E-43)
            r19 = 0
            r20 = 2024(0x7e8, float:2.836E-42)
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 0
            r6 = r7
            r7 = r9
            r9 = r11
            r11 = r12
            r12 = r13
            r13 = r16
            r14 = r17
            r34 = r15
            r15 = r18
            r16 = r21
            r17 = r34
            r18 = r5
            gs.C11352b.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x01cf:
            r34.P()
            if (r1 == 0) goto L_0x01dd
            Y1.k$a r1 = Y1.k.f14792b
            Y1.k r1 = r1.d()
        L_0x01da:
            r18 = r1
            goto L_0x01e4
        L_0x01dd:
            Y1.k$a r1 = Y1.k.f14792b
            Y1.k r1 = r1.c()
            goto L_0x01da
        L_0x01e4:
            IC.e r6 = r32.c()
            TC.b$a$b r7 = TC.C13679b.a.C2856b.f116680a
            tK.v r1 = tK.C18030v.f147664a
            int r5 = tK.C18030v.f147665b
            r15 = r34
            tK.h r1 = r1.a(r15, r5)
            long r9 = r1.H0()
            int r1 = IC.C13023e.f110931a
            r29 = r1 | 48
            r30 = 0
            r31 = 261620(0x3fdf4, float:3.66608E-40)
            r8 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r1 = 0
            r3 = r15
            r15 = r1
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = r3
            SC.C13607l.i(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r3.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x022c
            U0.C4895p.R()
        L_0x022c:
            r5 = r0
        L_0x022d:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x0245
            Op.m r7 = new Op.m
            r0 = r7
            r1 = r32
            r2 = r33
            r3 = r5
            r4 = r36
            r5 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0245:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.C10848n.h(Op.d$g, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C10828d.C1720d dVar, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(dVar.b());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C10828d.g gVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(gVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17642l lVar, C10828d.e eVar) {
        lVar.invoke(eVar);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(java.lang.String r39, KJ.C15987c<Op.C10828d.g> r40, nI.C17642l<? super java.lang.String, XH.C16807N> r41, nI.C17642l<? super com.ingka.ikea.core.model.Link, XH.C16807N> r42, boolean r43, java.lang.String r44, androidx.compose.ui.d r45, U0.C4889m r46, int r47, int r48) {
        /*
            r1 = r39
            r2 = r40
            r3 = r41
            r4 = r42
            r5 = r43
            r6 = r44
            r8 = r47
            java.lang.String r0 = "itemNo"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "productDisclaimers"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onColorInfoClicked"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "onLinkClicked"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "productName"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            r0 = 1261800622(0x4b358cae, float:1.189803E7)
            r7 = r46
            U0.m r7 = r7.k(r0)
            r9 = r48 & 1
            r10 = 4
            if (r9 == 0) goto L_0x0038
            r9 = r8 | 6
            goto L_0x0048
        L_0x0038:
            r9 = r8 & 6
            if (r9 != 0) goto L_0x0047
            boolean r9 = r7.V(r1)
            if (r9 == 0) goto L_0x0044
            r9 = r10
            goto L_0x0045
        L_0x0044:
            r9 = 2
        L_0x0045:
            r9 = r9 | r8
            goto L_0x0048
        L_0x0047:
            r9 = r8
        L_0x0048:
            r11 = r48 & 2
            if (r11 == 0) goto L_0x004f
            r9 = r9 | 48
            goto L_0x005f
        L_0x004f:
            r11 = r8 & 48
            if (r11 != 0) goto L_0x005f
            boolean r11 = r7.V(r2)
            if (r11 == 0) goto L_0x005c
            r11 = 32
            goto L_0x005e
        L_0x005c:
            r11 = 16
        L_0x005e:
            r9 = r9 | r11
        L_0x005f:
            r11 = r48 & 4
            if (r11 == 0) goto L_0x0066
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x0076
        L_0x0066:
            r11 = r8 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0076
            boolean r11 = r7.F(r3)
            if (r11 == 0) goto L_0x0073
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0075
        L_0x0073:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0075:
            r9 = r9 | r11
        L_0x0076:
            r11 = r48 & 8
            if (r11 == 0) goto L_0x007d
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            goto L_0x008d
        L_0x007d:
            r11 = r8 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x008d
            boolean r11 = r7.F(r4)
            if (r11 == 0) goto L_0x008a
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x008c
        L_0x008a:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x008c:
            r9 = r9 | r11
        L_0x008d:
            r11 = r48 & 16
            if (r11 == 0) goto L_0x0094
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a4
        L_0x0094:
            r11 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x00a4
            boolean r11 = r7.b(r5)
            if (r11 == 0) goto L_0x00a1
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r9 = r9 | r11
        L_0x00a4:
            r11 = r48 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x00ac
            r9 = r9 | r12
            goto L_0x00bc
        L_0x00ac:
            r11 = r8 & r12
            if (r11 != 0) goto L_0x00bc
            boolean r11 = r7.V(r6)
            if (r11 == 0) goto L_0x00b9
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r9 = r9 | r11
        L_0x00bc:
            r11 = r48 & 64
            r12 = 1572864(0x180000, float:2.204052E-39)
            if (r11 == 0) goto L_0x00c7
            r9 = r9 | r12
        L_0x00c3:
            r12 = r45
        L_0x00c5:
            r14 = r9
            goto L_0x00d9
        L_0x00c7:
            r12 = r12 & r8
            if (r12 != 0) goto L_0x00c3
            r12 = r45
            boolean r13 = r7.V(r12)
            if (r13 == 0) goto L_0x00d5
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r9 = r9 | r13
            goto L_0x00c5
        L_0x00d9:
            r9 = 599187(0x92493, float:8.3964E-40)
            r9 = r9 & r14
            r13 = 599186(0x92492, float:8.39638E-40)
            if (r9 != r13) goto L_0x00ee
            boolean r9 = r7.l()
            if (r9 != 0) goto L_0x00e9
            goto L_0x00ee
        L_0x00e9:
            r7.L()
            goto L_0x028f
        L_0x00ee:
            if (r11 == 0) goto L_0x00f4
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r15 = r9
            goto L_0x00f5
        L_0x00f4:
            r15 = r12
        L_0x00f5:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x0101
            r9 = -1
            java.lang.String r11 = "com.ingka.ikea.design.ui.product.ProductDisclaimers (Disclaimers.kt:54)"
            U0.C4895p.S(r0, r14, r9, r11)
        L_0x0101:
            r0 = -1953099400(0xffffffff8b961178, float:-5.780418E-32)
            r7.W(r0)
            r0 = r14 & 14
            r12 = 0
            if (r0 != r10) goto L_0x010e
            r9 = 1
            goto L_0x010f
        L_0x010e:
            r9 = r12
        L_0x010f:
            java.lang.Object r11 = r7.D()
            if (r9 != 0) goto L_0x011d
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r11 != r9) goto L_0x0125
        L_0x011d:
            Op.g r11 = new Op.g
            r11.<init>(r3, r1)
            r7.u(r11)
        L_0x0125:
            r35 = r11
            nI.a r35 = (nI.C17631a) r35
            r7.P()
            r9 = -1953093905(0xffffffff8b9626ef, float:-5.783648E-32)
            r7.W(r9)
            if (r0 != r10) goto L_0x0136
            r0 = 1
            goto L_0x0137
        L_0x0136:
            r0 = r12
        L_0x0137:
            java.lang.Object r9 = r7.D()
            if (r0 != 0) goto L_0x0145
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r9 != r0) goto L_0x014d
        L_0x0145:
            Op.h r9 = new Op.h
            r9.<init>(r4)
            r7.u(r9)
        L_0x014d:
            r0 = r9
            nI.l r0 = (nI.C17642l) r0
            r7.P()
            java.util.Iterator r36 = r40.iterator()
        L_0x0157:
            boolean r9 = r36.hasNext()
            if (r9 == 0) goto L_0x0285
            java.lang.Object r9 = r36.next()
            Op.d$g r9 = (Op.C10828d.g) r9
            Op.d$g$a r10 = r9.d()
            int[] r11 = Op.C10848n.a.f85235a
            int r10 = r10.ordinal()
            r10 = r11[r10]
            switch(r10) {
                case 1: goto L_0x025a;
                case 2: goto L_0x025a;
                case 3: goto L_0x025a;
                case 4: goto L_0x025a;
                case 5: goto L_0x025a;
                case 6: goto L_0x025a;
                case 7: goto L_0x025a;
                case 8: goto L_0x023d;
                case 9: goto L_0x0181;
                default: goto L_0x0172;
            }
        L_0x0172:
            r0 = 167344373(0x9f978f5, float:6.0058317E-33)
            r7.W(r0)
            r7.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0181:
            r10 = 893866925(0x354753ad, float:7.425504E-7)
            r7.W(r10)
            int r10 = Oo.b.f84829x
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r11 = r6.toLowerCase(r11)
            java.lang.String r13 = "toLowerCase(...)"
            kotlin.jvm.internal.C17542s.i(r11, r13)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r10 = J1.j.c(r10, r11, r7, r12)
            r11 = 8
            float r11 = (float) r11
            float r11 = c2.h.B(r11)
            r13 = 0
            r12 = 0
            r1 = 1
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.D.k(r15, r13, r11, r1, r12)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = r35
            androidx.compose.ui.d r1 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            r11 = 167394243(0x9fa3bc3, float:6.024151E-33)
            r7.W(r11)
            boolean r11 = r7.V(r10)
            java.lang.Object r13 = r7.D()
            if (r11 != 0) goto L_0x01d2
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r13 != r11) goto L_0x01da
        L_0x01d2:
            Op.i r13 = new Op.i
            r13.<init>(r10)
            r7.u(r13)
        L_0x01da:
            nI.l r13 = (nI.C17642l) r13
            r7.P()
            r10 = 0
            r11 = 1
            androidx.compose.ui.d r1 = L1.o.d(r1, r10, r13, r11, r12)
            r12 = r11
            r11 = r1
            IC.e r9 = r9.c()
            TC.b$a$b r1 = TC.C13679b.a.C2856b.f116680a
            r13 = r10
            r10 = r1
            Y1.k$a r1 = Y1.k.f14792b
            Y1.k r21 = r1.d()
            tK.v r1 = tK.C18030v.f147664a
            int r12 = tK.C18030v.f147665b
            tK.h r1 = r1.a(r7, r12)
            long r16 = r1.H0()
            r1 = r13
            r37 = 1
            r12 = r16
            r16 = 805306416(0x30000030, float:4.6566395E-10)
            int r17 = IC.C13023e.f110931a
            r32 = r17 | r16
            r33 = 0
            r34 = 261616(0x3fdf0, float:3.66602E-40)
            r16 = 0
            r38 = r14
            r45 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = r7
            SC.C13607l.i(r9, r10, r11, r12, r14, r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r7.P()
            r15 = r45
            goto L_0x027e
        L_0x023d:
            r1 = r12
            r38 = r14
            r45 = r15
            r37 = 1
            r10 = 167376606(0x9f9f6de, float:6.0176722E-33)
            r7.W(r10)
            int r10 = r38 >> 12
            r13 = r10 & 896(0x380, float:1.256E-42)
            r14 = 0
            r10 = r0
            r11 = r45
            r12 = r7
            h(r9, r10, r11, r12, r13, r14)
            r7.P()
            goto L_0x027e
        L_0x025a:
            r1 = r12
            r38 = r14
            r45 = r15
            r37 = 1
            r10 = 893221970(0x353d7c52, float:7.0588897E-7)
            r7.W(r10)
            if (r5 != 0) goto L_0x0279
            java.lang.String r10 = "GENERIC_DISCLAIMER"
            r15 = r45
            androidx.compose.ui.d r11 = androidx.compose.ui.platform.C5116k1.a(r15, r10)
            r13 = 0
            r14 = 0
            r10 = r0
            r12 = r7
            h(r9, r10, r11, r12, r13, r14)
            goto L_0x027b
        L_0x0279:
            r15 = r45
        L_0x027b:
            r7.P()
        L_0x027e:
            r12 = r1
            r14 = r38
            r1 = r39
            goto L_0x0157
        L_0x0285:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x028e
            U0.C4895p.R()
        L_0x028e:
            r12 = r15
        L_0x028f:
            U0.Y0 r10 = r7.n()
            if (r10 == 0) goto L_0x02af
            Op.j r11 = new Op.j
            r0 = r11
            r1 = r39
            r2 = r40
            r3 = r41
            r4 = r42
            r5 = r43
            r6 = r44
            r7 = r12
            r8 = r47
            r9 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x02af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.C10848n.l(java.lang.String, KJ.c, nI.l, nI.l, boolean, java.lang.String, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C17642l lVar, String str) {
        lVar.invoke(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C17642l lVar, C10828d.e eVar) {
        Object obj;
        C17542s.j(eVar, "composeLink");
        if (eVar instanceof C10828d.e.a) {
            C10828d.e.a aVar = (C10828d.e.a) eVar;
            obj = new Link.Deeplink(aVar.a(), aVar.b());
        } else if (eVar instanceof C10828d.e.b) {
            C10828d.e.b bVar = (C10828d.e.b) eVar;
            obj = new Link.External(bVar.a(), bVar.b());
        } else {
            throw new t();
        }
        lVar.invoke(obj);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(String str, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.d0(xVar, str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(String str, C15987c cVar, C17642l lVar, C17642l lVar2, boolean z10, String str2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        l(str, cVar, lVar, lVar2, z10, str2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
