package Mo;

import KJ.C15987c;
import Op.f1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001au\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "imageUrl", "imageDescription", "LKJ/c;", "LOp/f1;", "products", "Lkotlin/Function1;", "LXH/N;", "onProductTagClicked", "content", "Landroidx/compose/ui/d;", "modifier", "Landroid/graphics/drawable/Drawable;", "onImageLoaded", "k", "(Ljava/lang/String;Ljava/lang/String;LKJ/c;LnI/l;LnI/q;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "product", "onTagClicked", "onEnergylabelClicked", "g", "(LOp/f1;LnI/l;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "commercialcontent-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q<f1, C4889m, Integer, C16807N> f83553a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f1 f83554b;

        a(q<? super f1, ? super C4889m, ? super Integer, C16807N> qVar, f1 f1Var) {
            this.f83553a = qVar;
            this.f83554b = f1Var;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(654023869, i10, -1, "com.ingka.ikea.commercialcontent.impl.view.SkapaShoppableImageWithProducts.<anonymous>.<anonymous> (SkapaShoppableImageWithProducts.kt:52)");
                }
                this.f83553a.invoke(this.f83554b, mVar, Integer.valueOf(f1.f85176d));
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(Op.f1 r23, nI.C17642l<? super Op.f1, XH.C16807N> r24, nI.C17642l<? super Op.f1, XH.C16807N> r25, androidx.compose.ui.d r26, U0.C4889m r27, int r28, int r29) {
        /*
            r1 = r23
            r2 = r24
            r3 = r25
            r5 = r28
            r0 = 2
            java.lang.String r4 = "product"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            java.lang.String r4 = "onTagClicked"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            java.lang.String r4 = "onEnergylabelClicked"
            kotlin.jvm.internal.C17542s.j(r3, r4)
            r4 = -1035204390(0xffffffffc24c08da, float:-51.008644)
            r6 = r27
            U0.m r15 = r6.k(r4)
            r6 = 1
            r7 = r29 & 1
            r8 = 4
            if (r7 == 0) goto L_0x002a
            r7 = r5 | 6
            goto L_0x0043
        L_0x002a:
            r7 = r5 & 6
            if (r7 != 0) goto L_0x0042
            r7 = r5 & 8
            if (r7 != 0) goto L_0x0037
            boolean r7 = r15.V(r1)
            goto L_0x003b
        L_0x0037:
            boolean r7 = r15.F(r1)
        L_0x003b:
            if (r7 == 0) goto L_0x003f
            r7 = r8
            goto L_0x0040
        L_0x003f:
            r7 = r0
        L_0x0040:
            r7 = r7 | r5
            goto L_0x0043
        L_0x0042:
            r7 = r5
        L_0x0043:
            r0 = r29 & 2
            r9 = 32
            if (r0 == 0) goto L_0x004c
            r7 = r7 | 48
            goto L_0x005b
        L_0x004c:
            r0 = r5 & 48
            if (r0 != 0) goto L_0x005b
            boolean r0 = r15.F(r2)
            if (r0 == 0) goto L_0x0058
            r0 = r9
            goto L_0x005a
        L_0x0058:
            r0 = 16
        L_0x005a:
            r7 = r7 | r0
        L_0x005b:
            r0 = r29 & 4
            r10 = 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0064
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0073
        L_0x0064:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0073
            boolean r0 = r15.F(r3)
            if (r0 == 0) goto L_0x0070
            r0 = r10
            goto L_0x0072
        L_0x0070:
            r0 = 128(0x80, float:1.794E-43)
        L_0x0072:
            r7 = r7 | r0
        L_0x0073:
            r0 = r29 & 8
            if (r0 == 0) goto L_0x007c
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0079:
            r11 = r26
            goto L_0x008e
        L_0x007c:
            r11 = r5 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0079
            r11 = r26
            boolean r12 = r15.V(r11)
            if (r12 == 0) goto L_0x008b
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x008d
        L_0x008b:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x008d:
            r7 = r7 | r12
        L_0x008e:
            r12 = r7 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            if (r12 != r13) goto L_0x00a1
            boolean r12 = r15.l()
            if (r12 != 0) goto L_0x009b
            goto L_0x00a1
        L_0x009b:
            r15.L()
            r4 = r11
            goto L_0x01f6
        L_0x00a1:
            if (r0 == 0) goto L_0x00a6
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00a7
        L_0x00a6:
            r0 = r11
        L_0x00a7:
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x00b3
            r11 = -1
            java.lang.String r12 = "com.ingka.ikea.commercialcontent.impl.view.ShoppableImageProductTag (SkapaShoppableImageWithProducts.kt:84)"
            U0.C4895p.S(r4, r7, r11, r12)
        L_0x00b3:
            r4 = 872409458(0x33ffe972, float:1.1916826E-7)
            r15.W(r4)
            r4 = r7 & 112(0x70, float:1.57E-43)
            r11 = 0
            if (r4 != r9) goto L_0x00c0
            r4 = r6
            goto L_0x00c1
        L_0x00c0:
            r4 = r11
        L_0x00c1:
            r9 = r7 & 14
            if (r9 == r8) goto L_0x00d2
            r12 = r7 & 8
            if (r12 == 0) goto L_0x00d0
            boolean r12 = r15.F(r1)
            if (r12 == 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r12 = r11
            goto L_0x00d3
        L_0x00d2:
            r12 = r6
        L_0x00d3:
            r4 = r4 | r12
            java.lang.Object r12 = r15.D()
            if (r4 != 0) goto L_0x00e2
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r12 != r4) goto L_0x00ea
        L_0x00e2:
            Mo.N r12 = new Mo.N
            r12.<init>(r2, r1)
            r15.u(r12)
        L_0x00ea:
            r20 = r12
            nI.a r20 = (nI.C17631a) r20
            r15.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r0
            androidx.compose.ui.d r4 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            i1.c$a r12 = i1.C5437c.f24302a
            i1.c r12 = r12.o()
            E1.I r12 = androidx.compose.foundation.layout.C5077h.h(r12, r11)
            int r13 = U0.C4883j.a(r15, r11)
            U0.y r14 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r6 = r16.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x0126
            U0.C4883j.c()
        L_0x0126:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x0133
            r15.p(r6)
            goto L_0x0136
        L_0x0133:
            r15.t()
        L_0x0136:
            U0.m r6 = U0.F1.a(r15)
            nI.p r11 = r16.c()
            U0.F1.c(r6, r12, r11)
            nI.p r11 = r16.e()
            U0.F1.c(r6, r14, r11)
            nI.p r11 = r16.b()
            boolean r12 = r6.i()
            if (r12 != 0) goto L_0x0160
            java.lang.Object r12 = r6.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            boolean r12 = kotlin.jvm.internal.C17542s.e(r12, r14)
            if (r12 != 0) goto L_0x016e
        L_0x0160:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r6.u(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r6.w(r12, r11)
        L_0x016e:
            nI.p r11 = r16.d()
            U0.F1.c(r6, r4, r11)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            Op.d1 r4 = r23.b()
            Op.d r6 = r4.p()
            Op.d$h r6 = r6.e()
            Op.i1 r11 = new Op.i1
            kp.d r12 = r4.j()
            r11.<init>(r12)
            SC.Q1$b r12 = new SC.Q1$b
            SC.P1 r17 = SC.P1.XSmall
            r20 = 4
            r21 = 0
            r18 = 0
            r19 = 0
            r16 = r12
            r16.<init>(r17, r18, r19, r20, r21)
            boolean r4 = r4.n()
            r13 = -1223682343(0xffffffffb71016d9, float:-8.5883885E-6)
            r15.W(r13)
            r13 = r7 & 896(0x380, float:1.256E-42)
            if (r13 != r10) goto L_0x01ad
            r10 = 1
            goto L_0x01ae
        L_0x01ad:
            r10 = 0
        L_0x01ae:
            if (r9 == r8) goto L_0x01bd
            r7 = r7 & 8
            if (r7 == 0) goto L_0x01bb
            boolean r7 = r15.F(r1)
            if (r7 == 0) goto L_0x01bb
            goto L_0x01bd
        L_0x01bb:
            r7 = 0
            goto L_0x01be
        L_0x01bd:
            r7 = 1
        L_0x01be:
            r7 = r7 | r10
            java.lang.Object r8 = r15.D()
            if (r7 != 0) goto L_0x01cd
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x01d5
        L_0x01cd:
            Mo.O r8 = new Mo.O
            r8.<init>(r3, r1)
            r15.u(r8)
        L_0x01d5:
            r9 = r8
            nI.a r9 = (nI.C17631a) r9
            r15.P()
            int r7 = SC.Q1.b.f115896e
            int r13 = r7 << 15
            r14 = 16
            r10 = 0
            r7 = r11
            r8 = r4
            r11 = r12
            r12 = r15
            Op.F.g(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x01f5
            U0.C4895p.R()
        L_0x01f5:
            r4 = r0
        L_0x01f6:
            U0.Y0 r7 = r15.n()
            if (r7 == 0) goto L_0x020f
            Mo.P r8 = new Mo.P
            r0 = r8
            r1 = r23
            r2 = r24
            r3 = r25
            r5 = r28
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x020f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Mo.Q.g(Op.f1, nI.l, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17642l lVar, f1 f1Var) {
        lVar.invoke(f1Var);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(f1 f1Var, C17642l lVar, C17642l lVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        g(f1Var, lVar, lVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17642l lVar, f1 f1Var) {
        lVar.invoke(f1Var);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(java.lang.String r24, java.lang.String r25, KJ.C15987c<Op.f1> r26, nI.C17642l<? super Op.f1, XH.C16807N> r27, nI.q<? super Op.f1, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r28, androidx.compose.ui.d r29, nI.C17642l<? super android.graphics.drawable.Drawable, XH.C16807N> r30, U0.C4889m r31, int r32, int r33) {
        /*
            r12 = r24
            r13 = r25
            r14 = r26
            r15 = r27
            r11 = r28
            r10 = r32
            java.lang.String r0 = "imageUrl"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "imageDescription"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "products"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "onProductTagClicked"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 961088070(0x39490a46, float:1.9172681E-4)
            r1 = r31
            U0.m r9 = r1.k(r0)
            r1 = r33 & 1
            if (r1 == 0) goto L_0x0035
            r1 = r10 | 6
            goto L_0x0045
        L_0x0035:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0044
            boolean r1 = r9.V(r12)
            if (r1 == 0) goto L_0x0041
            r1 = 4
            goto L_0x0042
        L_0x0041:
            r1 = 2
        L_0x0042:
            r1 = r1 | r10
            goto L_0x0045
        L_0x0044:
            r1 = r10
        L_0x0045:
            r2 = r33 & 2
            if (r2 == 0) goto L_0x004c
            r1 = r1 | 48
            goto L_0x005c
        L_0x004c:
            r2 = r10 & 48
            if (r2 != 0) goto L_0x005c
            boolean r2 = r9.V(r13)
            if (r2 == 0) goto L_0x0059
            r2 = 32
            goto L_0x005b
        L_0x0059:
            r2 = 16
        L_0x005b:
            r1 = r1 | r2
        L_0x005c:
            r2 = r33 & 4
            if (r2 == 0) goto L_0x0063
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x007c
        L_0x0063:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x007c
            r2 = r10 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x0070
            boolean r2 = r9.V(r14)
            goto L_0x0074
        L_0x0070:
            boolean r2 = r9.F(r14)
        L_0x0074:
            if (r2 == 0) goto L_0x0079
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x007b
        L_0x0079:
            r2 = 128(0x80, float:1.794E-43)
        L_0x007b:
            r1 = r1 | r2
        L_0x007c:
            r2 = r33 & 8
            if (r2 == 0) goto L_0x0083
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0093
        L_0x0083:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0093
            boolean r2 = r9.F(r15)
            if (r2 == 0) goto L_0x0090
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0092
        L_0x0090:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0092:
            r1 = r1 | r2
        L_0x0093:
            r2 = r33 & 16
            if (r2 == 0) goto L_0x009a
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00aa
        L_0x009a:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00aa
            boolean r2 = r9.F(r11)
            if (r2 == 0) goto L_0x00a7
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a9
        L_0x00a7:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00a9:
            r1 = r1 | r2
        L_0x00aa:
            r2 = r33 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00b4
            r1 = r1 | r4
        L_0x00b1:
            r4 = r29
            goto L_0x00c5
        L_0x00b4:
            r4 = r4 & r10
            if (r4 != 0) goto L_0x00b1
            r4 = r29
            boolean r5 = r9.V(r4)
            if (r5 == 0) goto L_0x00c2
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r1 = r1 | r5
        L_0x00c5:
            r5 = r33 & 64
            r6 = 1572864(0x180000, float:2.204052E-39)
            if (r5 == 0) goto L_0x00cf
            r1 = r1 | r6
        L_0x00cc:
            r6 = r30
            goto L_0x00e0
        L_0x00cf:
            r6 = r6 & r10
            if (r6 != 0) goto L_0x00cc
            r6 = r30
            boolean r7 = r9.F(r6)
            if (r7 == 0) goto L_0x00dd
            r7 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r7 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r1 = r1 | r7
        L_0x00e0:
            r7 = 599187(0x92493, float:8.3964E-40)
            r7 = r7 & r1
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r7 != r8) goto L_0x00f9
            boolean r7 = r9.l()
            if (r7 != 0) goto L_0x00f0
            goto L_0x00f9
        L_0x00f0:
            r9.L()
            r7 = r6
            r20 = r9
            r6 = r4
            goto L_0x0219
        L_0x00f9:
            if (r2 == 0) goto L_0x0100
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r16 = r2
            goto L_0x0102
        L_0x0100:
            r16 = r4
        L_0x0102:
            if (r5 == 0) goto L_0x0126
            r2 = 10822310(0xa522a6, float:1.5165286E-38)
            r9.W(r2)
            java.lang.Object r2 = r9.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x011e
            Mo.K r2 = new Mo.K
            r2.<init>()
            r9.u(r2)
        L_0x011e:
            nI.l r2 = (nI.C17642l) r2
            r9.P()
            r17 = r2
            goto L_0x0128
        L_0x0126:
            r17 = r6
        L_0x0128:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0134
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.commercialcontent.impl.view.SkapaShoppableImageWithProducts (SkapaShoppableImageWithProducts.kt:44)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x0134:
            r0 = 10824314(0xa52a7a, float:1.5168095E-38)
            r9.W(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r26.iterator()
        L_0x0143:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01cf
            java.lang.Object r4 = r2.next()
            Op.f1 r4 = (Op.f1) r4
            com.ingka.ikea.core.model.inspiration.Coordinates r5 = r4.a()
            r6 = 10826726(0xa533e6, float:1.5171475E-38)
            r9.W(r6)
            if (r5 == 0) goto L_0x01be
            Op.d1 r6 = r4.b()
            Op.d r6 = r6.p()
            java.lang.String r19 = r6.f()
            double r6 = r5.a()
            float r6 = (float) r6
            double r7 = r5.b()
            float r5 = (float) r7
            Mo.Q$a r7 = new Mo.Q$a
            r7.<init>(r11, r4)
            r8 = 54
            r3 = 654023869(0x26fb9cbd, float:1.7459108E-15)
            r29 = r2
            r2 = 1
            c1.a r22 = c1.c.e(r3, r2, r7, r9, r8)
            r3 = 1992968003(0x76ca4743, float:2.0513463E33)
            r9.W(r3)
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 != r7) goto L_0x018f
            goto L_0x0190
        L_0x018f:
            r2 = 0
        L_0x0190:
            boolean r3 = r9.F(r4)
            r2 = r2 | r3
            java.lang.Object r3 = r9.D()
            if (r2 != 0) goto L_0x01a3
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x01ab
        L_0x01a3:
            Mo.L r3 = new Mo.L
            r3.<init>(r15, r4)
            r9.u(r3)
        L_0x01ab:
            r23 = r3
            nI.a r23 = (nI.C17631a) r23
            r9.P()
            SC.v2 r2 = new SC.v2
            r18 = r2
            r20 = r6
            r21 = r5
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x01c3
        L_0x01be:
            r29 = r2
            r7 = 2048(0x800, float:2.87E-42)
            r2 = 0
        L_0x01c3:
            r9.P()
            if (r2 == 0) goto L_0x01cb
            r0.add(r2)
        L_0x01cb:
            r2 = r29
            goto L_0x0143
        L_0x01cf:
            r9.P()
            KJ.c r2 = KJ.C15985a.h(r0)
            java.lang.Object r0 = YH.C16877v.w0(r2)
            SC.v2 r0 = (SC.C13649v2) r0
            java.lang.Object r0 = r0.b()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            r0 = r1 & 126(0x7e, float:1.77E-43)
            int r3 = SC.C13649v2.f116466f
            int r3 = r3 << 6
            r0 = r0 | r3
            int r3 = r1 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            int r1 = r1 << 3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r3
            r18 = r0 | r1
            r19 = 336(0x150, float:4.71E-43)
            r4 = 0
            r6 = 0
            r8 = 0
            r0 = r24
            r1 = r25
            r3 = r16
            r7 = r17
            r20 = r9
            r10 = r18
            r11 = r19
            SC.F2.h(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0215
            U0.C4895p.R()
        L_0x0215:
            r6 = r16
            r7 = r17
        L_0x0219:
            U0.Y0 r10 = r20.n()
            if (r10 == 0) goto L_0x0236
            Mo.M r11 = new Mo.M
            r0 = r11
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0236:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Mo.Q.k(java.lang.String, java.lang.String, KJ.c, nI.l, nI.q, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N l(Drawable drawable) {
        C17542s.j(drawable, "it");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C17642l lVar, f1 f1Var) {
        lVar.invoke(f1Var);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(String str, String str2, C15987c cVar, C17642l lVar, q qVar, d dVar, C17642l lVar2, int i10, int i11, C4889m mVar, int i12) {
        k(str, str2, cVar, lVar, qVar, dVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
