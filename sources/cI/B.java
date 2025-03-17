package ci;

import E1.I;
import G1.C4504g;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.C13643u0;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import com.ingka.ikea.core.model.product.Information;
import com.ingka.ikea.core.model.product.ItemPackages;
import com.ingka.ikea.core.model.product.Measurements;
import com.ingka.ikea.core.model.product.PackagesQuantity;
import com.ingka.ikea.core.model.product.Packaging;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5842M;
import s0.C5843N;
import s0.C5862h;
import tK.C18030v;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/ingka/ikea/core/model/product/Measurements;", "measurements", "", "isSectionExpanded", "Lkotlin/Function0;", "LXH/N;", "onExpandedClicked", "Lkotlin/Function1;", "", "onImageClicked", "Landroidx/compose/ui/d;", "modifier", "n", "(Lcom/ingka/ikea/core/model/product/Measurements;ZLnI/a;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "imageUrl", "k", "(Ljava/lang/String;LnI/l;LU0/m;I)V", "Lcom/ingka/ikea/core/model/product/ItemPackages;", "itemPackages", "s", "(Lcom/ingka/ikea/core/model/product/ItemPackages;Landroidx/compose/ui/d;LU0/m;II)V", "Lcom/ingka/ikea/core/model/product/Information;", "information", "i", "(Lcom/ingka/ikea/core/model/product/Information;Landroidx/compose/ui/d;LU0/m;II)V", "Lcom/ingka/ikea/core/model/product/PackagesQuantity;", "quantity", "q", "(Lcom/ingka/ikea/core/model/product/PackagesQuantity;Landroidx/compose/ui/d;LU0/m;II)V", "Lcom/ingka/ikea/core/model/product/Packaging;", "packaging", "u", "(Lcom/ingka/ikea/core/model/product/Packaging;LU0/m;I)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class B {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Measurements f65788a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f65789b;

        a(Measurements measurements, C17642l<? super String, C16807N> lVar) {
            this.f65788a = measurements;
            this.f65789b = lVar;
        }

        public final void a(C4889m mVar, int i10) {
            Measurements measurements;
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-427961159, i11, -1, "com.ingka.ikea.app.productinformationpage.v2.compose.MeasurementsComposable.<anonymous> (MeasurementsComposable.kt:60)");
                }
                Measurements measurements2 = this.f65788a;
                C17642l<String, C16807N> lVar = this.f65789b;
                d.a aVar = d.f18749a;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar2, aVar);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar2.c());
                F1.c(a13, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar2.d());
                C5862h hVar = C5862h.f28810a;
                B.k(measurements2.b().c(), lVar, mVar2, 0);
                mVar2.W(-845241543);
                for (Information w10 : measurements2.b().d()) {
                    B.i(w10, (d) null, mVar2, 0, 2);
                }
                mVar.P();
                String b11 = measurements2.b().b();
                mVar2.W(-845234897);
                if (b11 == null) {
                    measurements = measurements2;
                } else {
                    measurements = measurements2;
                    C13607l.j(b11, C13679b.a.c.f116681a, D.m(d.f18749a, 0.0f, h.B((float) 24), 0.0f, 0.0f, 13, (Object) null), C18030v.f147664a.a(mVar2, C18030v.f147665b).H0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 432, 0, 262128);
                }
                mVar.P();
                Packaging a14 = measurements.a();
                C4889m mVar3 = mVar;
                mVar3.W(-845224638);
                if (a14 == null) {
                    C4889m mVar4 = mVar3;
                } else {
                    String c10 = a14.c();
                    C13679b.C2857b.c cVar = C13679b.C2857b.c.f116685a;
                    d.a aVar3 = d.f18749a;
                    float f10 = (float) 24;
                    float f11 = f10;
                    C13607l.j(c10, cVar, D.k(aVar3, 0.0f, h.B(f10), 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 432, 0, 262136);
                    C4889m mVar5 = mVar;
                    Packaging packaging = a14;
                    B.u(packaging, mVar5, 0);
                    C13643u0.c(D.k(aVar3, 0.0f, h.B(f11), 1, (Object) null), 0.0f, 0, mVar, 6, 6);
                    mVar5.W(-845211136);
                    int i12 = 0;
                    for (Object next : packaging.b()) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C16877v.x();
                        }
                        B.s((ItemPackages) next, D.m(d.f18749a, 0.0f, 0.0f, 0.0f, i12 == packaging.b().size() - 1 ? h.B((float) 0) : h.B(f11), 7, (Object) null), mVar5, 0, 0);
                        i12 = i13;
                    }
                    mVar.P();
                }
                mVar.P();
                mVar.x();
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
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(com.ingka.ikea.core.model.product.Information r57, androidx.compose.ui.d r58, U0.C4889m r59, int r60, int r61) {
        /*
            r0 = r57
            r1 = r60
            r2 = r61
            r3 = 1760847971(0x68f46863, float:9.233464E24)
            r4 = r59
            U0.m r14 = r4.k(r3)
            r4 = r2 & 1
            r5 = 4
            if (r4 == 0) goto L_0x0017
            r4 = r1 | 6
            goto L_0x0027
        L_0x0017:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0026
            boolean r4 = r14.F(r0)
            if (r4 == 0) goto L_0x0023
            r4 = r5
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r1
            goto L_0x0027
        L_0x0026:
            r4 = r1
        L_0x0027:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x0030
            r4 = r4 | 48
        L_0x002d:
            r7 = r58
            goto L_0x0042
        L_0x0030:
            r7 = r1 & 48
            if (r7 != 0) goto L_0x002d
            r7 = r58
            boolean r8 = r14.V(r7)
            if (r8 == 0) goto L_0x003f
            r8 = 32
            goto L_0x0041
        L_0x003f:
            r8 = 16
        L_0x0041:
            r4 = r4 | r8
        L_0x0042:
            r8 = r4 & 19
            r9 = 18
            if (r8 != r9) goto L_0x0055
            boolean r8 = r14.l()
            if (r8 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            r14.L()
            r3 = r14
            goto L_0x017b
        L_0x0055:
            if (r6 == 0) goto L_0x005b
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r15 = r6
            goto L_0x005c
        L_0x005b:
            r15 = r7
        L_0x005c:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0068
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.productinformationpage.v2.compose.InformationRow (MeasurementsComposable.kt:181)"
            U0.C4895p.S(r3, r4, r6, r7)
        L_0x0068:
            float r3 = (float) r5
            float r3 = c2.h.B(r3)
            r4 = 0
            r5 = 0
            r6 = 1
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r15, r5, r3, r6, r4)
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r4 = r4.f()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$c r5 = r5.l()
            r6 = 0
            E1.I r4 = androidx.compose.foundation.layout.G.b(r4, r5, r14, r6)
            int r5 = U0.C4883j.a(r14, r6)
            U0.y r6 = r14.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r14, r3)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r8 = r7.a()
            U0.f r9 = r14.m()
            if (r9 != 0) goto L_0x00a0
            U0.C4883j.c()
        L_0x00a0:
            r14.I()
            boolean r9 = r14.i()
            if (r9 == 0) goto L_0x00ad
            r14.p(r8)
            goto L_0x00b0
        L_0x00ad:
            r14.t()
        L_0x00b0:
            U0.m r8 = U0.F1.a(r14)
            nI.p r9 = r7.c()
            U0.F1.c(r8, r4, r9)
            nI.p r4 = r7.e()
            U0.F1.c(r8, r6, r4)
            nI.p r4 = r7.b()
            boolean r6 = r8.i()
            if (r6 != 0) goto L_0x00da
            java.lang.Object r6 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x00e8
        L_0x00da:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r8.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.w(r5, r4)
        L_0x00e8:
            nI.p r4 = r7.d()
            U0.F1.c(r8, r3, r4)
            s0.N r16 = s0.C5843N.f28726a
            java.lang.String r4 = r57.a()
            TC.b$a$c r5 = TC.C13679b.a.c.f116681a
            r31 = r5
            androidx.compose.ui.d$a r17 = androidx.compose.ui.d.f18749a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            androidx.compose.ui.d r6 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            tK.v r3 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r14, r7)
            long r7 = r3.G0()
            r28 = 0
            r29 = 262128(0x3fff0, float:3.6732E-40)
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r3 = r14
            r56 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 48
            r26 = r3
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r30 = r57.b()
            r54 = 0
            r55 = 262140(0x3fffc, float:3.67336E-40)
            r32 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r53 = 48
            r52 = r3
            SC.C13607l.j(r30, r31, r32, r33, r35, r37, r38, r39, r40, r42, r43, r44, r45, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r3.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0179
            U0.C4895p.R()
        L_0x0179:
            r7 = r56
        L_0x017b:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x0189
            ci.v r4 = new ci.v
            r4.<init>(r0, r7, r1, r2)
            r3.a(r4)
        L_0x0189:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.B.i(com.ingka.ikea.core.model.product.Information, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(Information information, d dVar, int i10, int i11, C4889m mVar, int i12) {
        i(information, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(java.lang.String r23, nI.C17642l<? super java.lang.String, XH.C16807N> r24, U0.C4889m r25, int r26) {
        /*
            r15 = r23
            r14 = r24
            r0 = -2116885363(0xffffffff81d2e48d, float:-7.746977E-38)
            r1 = r25
            U0.m r13 = r1.k(r0)
            r1 = r26 & 6
            r2 = 2
            r3 = 4
            if (r1 != 0) goto L_0x001f
            boolean r1 = r13.V(r15)
            if (r1 == 0) goto L_0x001b
            r1 = r3
            goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            r1 = r26 | r1
            goto L_0x0021
        L_0x001f:
            r1 = r26
        L_0x0021:
            r4 = r26 & 48
            r5 = 32
            if (r4 != 0) goto L_0x0032
            boolean r4 = r13.F(r14)
            if (r4 == 0) goto L_0x002f
            r4 = r5
            goto L_0x0031
        L_0x002f:
            r4 = 16
        L_0x0031:
            r1 = r1 | r4
        L_0x0032:
            r4 = r1 & 19
            r6 = 18
            if (r4 != r6) goto L_0x0046
            boolean r4 = r13.l()
            if (r4 != 0) goto L_0x003f
            goto L_0x0046
        L_0x003f:
            r13.L()
            r19 = r13
            goto L_0x00d7
        L_0x0046:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0052
            r4 = -1
            java.lang.String r6 = "com.ingka.ikea.app.productinformationpage.v2.compose.MeasurementImage (MeasurementsComposable.kt:114)"
            U0.C4895p.S(r0, r1, r4, r6)
        L_0x0052:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r4 = 0
            r6 = 1
            r7 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r0, r4, r6, r7)
            r4 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.C5074e.b(r0, r4, r8, r2, r7)
            r2 = 24
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.D.i(r0, r2)
            r0 = -224522851(0xfffffffff29e0d9d, float:-6.2611314E30)
            r13.W(r0)
            r0 = r1 & 112(0x70, float:1.57E-43)
            if (r0 != r5) goto L_0x0079
            r0 = r6
            goto L_0x007a
        L_0x0079:
            r0 = r8
        L_0x007a:
            r1 = r1 & 14
            if (r1 != r3) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r6 = r8
        L_0x0080:
            r0 = r0 | r6
            java.lang.Object r2 = r13.D()
            if (r0 != 0) goto L_0x008f
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0097
        L_0x008f:
            ci.x r2 = new ci.x
            r2.<init>(r14, r15)
            r13.u(r2)
        L_0x0097:
            r20 = r2
            nI.a r20 = (nI.C17631a) r20
            r13.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = "MeasurementsComposable.Image"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r0, r2)
            r16 = r1 | 48
            r18 = 4088(0xff8, float:5.729E-42)
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r0 = r23
            r12 = r13
            r19 = r13
            r13 = r16
            r14 = r17
            r15 = r18
            LC.h.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00d7
            U0.C4895p.R()
        L_0x00d7:
            U0.Y0 r0 = r19.n()
            if (r0 == 0) goto L_0x00eb
            ci.y r1 = new ci.y
            r2 = r23
            r3 = r24
            r4 = r26
            r1.<init>(r2, r3, r4)
            r0.a(r1)
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.B.k(java.lang.String, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C17642l lVar, String str) {
        lVar.invoke(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(String str, C17642l lVar, int i10, C4889m mVar, int i11) {
        k(str, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n(com.ingka.ikea.core.model.product.Measurements r25, boolean r26, nI.C17631a<XH.C16807N> r27, nI.C17642l<? super java.lang.String, XH.C16807N> r28, androidx.compose.ui.d r29, U0.C4889m r30, int r31, int r32) {
        /*
            r1 = r25
            r3 = r27
            r4 = r28
            r6 = r31
            java.lang.String r0 = "measurements"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onExpandedClicked"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "onImageClicked"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = -2106567771(0xffffffff827053a5, float:-1.765642E-37)
            r2 = r30
            U0.m r2 = r2.k(r0)
            r5 = r32 & 1
            if (r5 == 0) goto L_0x0027
            r5 = r6 | 6
            goto L_0x0037
        L_0x0027:
            r5 = r6 & 6
            if (r5 != 0) goto L_0x0036
            boolean r5 = r2.F(r1)
            if (r5 == 0) goto L_0x0033
            r5 = 4
            goto L_0x0034
        L_0x0033:
            r5 = 2
        L_0x0034:
            r5 = r5 | r6
            goto L_0x0037
        L_0x0036:
            r5 = r6
        L_0x0037:
            r7 = r32 & 2
            if (r7 == 0) goto L_0x0040
            r5 = r5 | 48
            r14 = r26
            goto L_0x0052
        L_0x0040:
            r7 = r6 & 48
            r14 = r26
            if (r7 != 0) goto L_0x0052
            boolean r7 = r2.b(r14)
            if (r7 == 0) goto L_0x004f
            r7 = 32
            goto L_0x0051
        L_0x004f:
            r7 = 16
        L_0x0051:
            r5 = r5 | r7
        L_0x0052:
            r7 = r32 & 4
            r8 = 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x005b
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005b:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x006a
            boolean r7 = r2.F(r3)
            if (r7 == 0) goto L_0x0067
            r7 = r8
            goto L_0x0069
        L_0x0067:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r5 = r5 | r7
        L_0x006a:
            r7 = r32 & 8
            if (r7 == 0) goto L_0x0071
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x0071:
            r7 = r6 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0081
            boolean r7 = r2.F(r4)
            if (r7 == 0) goto L_0x007e
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r5 = r5 | r7
        L_0x0081:
            r7 = r32 & 16
            if (r7 == 0) goto L_0x008a
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0087:
            r9 = r29
            goto L_0x009c
        L_0x008a:
            r9 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0087
            r9 = r29
            boolean r10 = r2.V(r9)
            if (r10 == 0) goto L_0x0099
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r5 = r5 | r10
        L_0x009c:
            r10 = r5 & 9363(0x2493, float:1.312E-41)
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r10 != r11) goto L_0x00af
            boolean r10 = r2.l()
            if (r10 != 0) goto L_0x00a9
            goto L_0x00af
        L_0x00a9:
            r2.L()
            r5 = r9
            goto L_0x0134
        L_0x00af:
            if (r7 == 0) goto L_0x00b6
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r24 = r7
            goto L_0x00b8
        L_0x00b6:
            r24 = r9
        L_0x00b8:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00c4
            r7 = -1
            java.lang.String r9 = "com.ingka.ikea.app.productinformationpage.v2.compose.MeasurementsComposable (MeasurementsComposable.kt:48)"
            U0.C4895p.S(r0, r5, r7, r9)
        L_0x00c4:
            java.lang.String r7 = r25.c()
            SC.r r13 = SC.r.Large
            SC.s r0 = SC.C13634s.Subtle
            r9 = -918230891(0xffffffffc944e895, float:-806537.3)
            r2.W(r9)
            r9 = r5 & 896(0x380, float:1.256E-42)
            r10 = 1
            if (r9 != r8) goto L_0x00d9
            r8 = r10
            goto L_0x00da
        L_0x00d9:
            r8 = 0
        L_0x00da:
            java.lang.Object r9 = r2.D()
            if (r8 != 0) goto L_0x00e8
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x00f0
        L_0x00e8:
            ci.t r9 = new ci.t
            r9.<init>(r3)
            r2.u(r9)
        L_0x00f0:
            r8 = r9
            nI.l r8 = (nI.C17642l) r8
            r2.P()
            ci.B$a r9 = new ci.B$a
            r9.<init>(r1, r4)
            r11 = 54
            r12 = -427961159(0xffffffffe67dd4b9, float:-2.9967069E23)
            c1.a r19 = c1.c.e(r12, r10, r9, r2, r11)
            int r9 = r5 >> 6
            r9 = r9 & 896(0x380, float:1.256E-42)
            r10 = 114819072(0x6d80000, float:8.125017E-35)
            r9 = r9 | r10
            int r5 = r5 << 12
            r10 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r10
            r21 = r9 | r5
            r22 = 384(0x180, float:5.38E-43)
            r23 = 3608(0xe18, float:5.056E-42)
            r10 = 0
            r11 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r9 = r24
            r12 = r26
            r14 = r0
            r20 = r2
            SC.C13627q.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0132
            U0.C4895p.R()
        L_0x0132:
            r5 = r24
        L_0x0134:
            U0.Y0 r8 = r2.n()
            if (r8 == 0) goto L_0x014f
            ci.u r9 = new ci.u
            r0 = r9
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r6 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.B.n(com.ingka.ikea.core.model.product.Measurements, boolean, nI.a, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C17631a aVar, boolean z10) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(Measurements measurements, boolean z10, C17631a aVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        n(measurements, z10, aVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void q(com.ingka.ikea.core.model.product.PackagesQuantity r57, androidx.compose.ui.d r58, U0.C4889m r59, int r60, int r61) {
        /*
            r0 = r57
            r1 = r60
            r2 = r61
            r3 = 1551596012(0x5c7b79ec, float:2.83137095E17)
            r4 = r59
            U0.m r14 = r4.k(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r1 | 6
            goto L_0x0026
        L_0x0016:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0025
            boolean r4 = r14.F(r0)
            if (r4 == 0) goto L_0x0022
            r4 = 4
            goto L_0x0023
        L_0x0022:
            r4 = 2
        L_0x0023:
            r4 = r4 | r1
            goto L_0x0026
        L_0x0025:
            r4 = r1
        L_0x0026:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x002f
            r4 = r4 | 48
        L_0x002c:
            r6 = r58
            goto L_0x0041
        L_0x002f:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x002c
            r6 = r58
            boolean r7 = r14.V(r6)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003e:
            r7 = 16
        L_0x0040:
            r4 = r4 | r7
        L_0x0041:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L_0x0054
            boolean r7 = r14.l()
            if (r7 != 0) goto L_0x004e
            goto L_0x0054
        L_0x004e:
            r14.L()
            r3 = r14
            goto L_0x0168
        L_0x0054:
            if (r5 == 0) goto L_0x005a
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r15 = r5
            goto L_0x005b
        L_0x005a:
            r15 = r6
        L_0x005b:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0067
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.productinformationpage.v2.compose.PackageQuantityRow (MeasurementsComposable.kt:201)"
            U0.C4895p.S(r3, r4, r5, r6)
        L_0x0067:
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r3 = r3.f()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$c r4 = r4.l()
            r5 = 0
            E1.I r3 = androidx.compose.foundation.layout.G.b(r3, r4, r14, r5)
            int r4 = U0.C4883j.a(r14, r5)
            U0.y r5 = r14.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r14, r15)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r8 = r7.a()
            U0.f r9 = r14.m()
            if (r9 != 0) goto L_0x0093
            U0.C4883j.c()
        L_0x0093:
            r14.I()
            boolean r9 = r14.i()
            if (r9 == 0) goto L_0x00a0
            r14.p(r8)
            goto L_0x00a3
        L_0x00a0:
            r14.t()
        L_0x00a3:
            U0.m r8 = U0.F1.a(r14)
            nI.p r9 = r7.c()
            U0.F1.c(r8, r3, r9)
            nI.p r3 = r7.e()
            U0.F1.c(r8, r5, r3)
            nI.p r3 = r7.b()
            boolean r5 = r8.i()
            if (r5 != 0) goto L_0x00cd
            java.lang.Object r5 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r9)
            if (r5 != 0) goto L_0x00db
        L_0x00cd:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r8.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.w(r4, r3)
        L_0x00db:
            nI.p r3 = r7.d()
            U0.F1.c(r8, r6, r3)
            s0.N r16 = s0.C5843N.f28726a
            java.lang.String r4 = r57.a()
            TC.b$b$f r5 = TC.C13679b.C2857b.f.f116688a
            r31 = r5
            androidx.compose.ui.d$a r17 = androidx.compose.ui.d.f18749a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            androidx.compose.ui.d r6 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            r28 = 0
            r29 = 262136(0x3fff8, float:3.67331E-40)
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r3 = r14
            r56 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 48
            r26 = r3
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            int r4 = r57.b()
            java.lang.String r30 = java.lang.String.valueOf(r4)
            r54 = 0
            r55 = 262140(0x3fffc, float:3.67336E-40)
            r32 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r53 = 48
            r52 = r3
            SC.C13607l.j(r30, r31, r32, r33, r35, r37, r38, r39, r40, r42, r43, r44, r45, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r3.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0166
            U0.C4895p.R()
        L_0x0166:
            r6 = r56
        L_0x0168:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x0176
            ci.A r4 = new ci.A
            r4.<init>(r0, r6, r1, r2)
            r3.a(r4)
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.B.q(com.ingka.ikea.core.model.product.PackagesQuantity, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N r(PackagesQuantity packagesQuantity, d dVar, int i10, int i11, C4889m mVar, int i12) {
        q(packagesQuantity, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void s(com.ingka.ikea.core.model.product.ItemPackages r37, androidx.compose.ui.d r38, U0.C4889m r39, int r40, int r41) {
        /*
            r0 = r37
            r1 = r40
            r2 = r41
            r3 = 0
            r4 = 48
            r5 = 6
            r6 = 0
            r7 = 757343134(0x2d24239e, float:9.330229E-12)
            r8 = r39
            U0.m r15 = r8.k(r7)
            r13 = 1
            r8 = r2 & 1
            r14 = 2
            if (r8 == 0) goto L_0x001d
            r8 = r1 | 6
            goto L_0x002d
        L_0x001d:
            r8 = r1 & 6
            if (r8 != 0) goto L_0x002c
            boolean r8 = r15.F(r0)
            if (r8 == 0) goto L_0x0029
            r8 = 4
            goto L_0x002a
        L_0x0029:
            r8 = r14
        L_0x002a:
            r8 = r8 | r1
            goto L_0x002d
        L_0x002c:
            r8 = r1
        L_0x002d:
            r9 = r2 & 2
            if (r9 == 0) goto L_0x0035
            r8 = r8 | r4
        L_0x0032:
            r10 = r38
            goto L_0x0047
        L_0x0035:
            r10 = r1 & 48
            if (r10 != 0) goto L_0x0032
            r10 = r38
            boolean r12 = r15.V(r10)
            if (r12 == 0) goto L_0x0044
            r12 = 32
            goto L_0x0046
        L_0x0044:
            r12 = 16
        L_0x0046:
            r8 = r8 | r12
        L_0x0047:
            r12 = r8 & 19
            r11 = 18
            if (r12 != r11) goto L_0x005a
            boolean r11 = r15.l()
            if (r11 != 0) goto L_0x0054
            goto L_0x005a
        L_0x0054:
            r15.L()
            r8 = r15
            goto L_0x027f
        L_0x005a:
            if (r9 == 0) goto L_0x0060
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r11 = r9
            goto L_0x0061
        L_0x0060:
            r11 = r10
        L_0x0061:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x006d
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.app.productinformationpage.v2.compose.PackageSection (MeasurementsComposable.kt:130)"
            U0.C4895p.S(r7, r8, r9, r10)
        L_0x006d:
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r7.g()
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$b r8 = r8.k()
            r12 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r8, r15, r12)
            int r8 = U0.C4883j.a(r15, r12)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r15, r11)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r12 = r16.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x0099
            U0.C4883j.c()
        L_0x0099:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x00a6
            r15.p(r12)
            goto L_0x00a9
        L_0x00a6:
            r15.t()
        L_0x00a9:
            U0.m r12 = U0.F1.a(r15)
            nI.p r13 = r16.c()
            U0.F1.c(r12, r7, r13)
            nI.p r7 = r16.e()
            U0.F1.c(r12, r9, r7)
            nI.p r7 = r16.b()
            boolean r9 = r12.i()
            if (r9 != 0) goto L_0x00d3
            java.lang.Object r9 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r9 != 0) goto L_0x00e1
        L_0x00d3:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.w(r8, r7)
        L_0x00e1:
            nI.p r7 = r16.d()
            U0.F1.c(r12, r10, r7)
            s0.h r7 = s0.C5862h.f28810a
            java.lang.String r8 = r37.d()
            TC.b$b$f r7 = TC.C13679b.C2857b.f.f116688a
            r9 = r7
            r32 = 0
            r33 = 262140(0x3fffc, float:3.67336E-40)
            r10 = 0
            r12 = 0
            r34 = r11
            r4 = 16
            r5 = 0
            r11 = r12
            r18 = 0
            r4 = 1
            r13 = r18
            r16 = 0
            r38 = r15
            r15 = r16
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 48
            r30 = r38
            SC.C13607l.j(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.String r8 = r37.b()
            TC.b$a$b r9 = TC.C13679b.a.C2856b.f116680a
            r11 = 0
            r13 = 0
            r15 = 0
            SC.C13607l.j(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            int r8 = Oo.b.f84567Z
            r15 = r38
            java.lang.String r8 = J1.j.b(r8, r15, r5)
            TC.b$a$c r9 = TC.C13679b.a.c.f116681a
            tK.v r10 = tK.C18030v.f147664a
            int r11 = tK.C18030v.f147665b
            tK.h r10 = r10.a(r15, r11)
            long r11 = r10.H0()
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            r10 = 8
            float r14 = (float) r10
            float r10 = c2.h.B(r14)
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.D.k(r13, r3, r10, r4, r6)
            r33 = 262128(0x3fff0, float:3.6732E-40)
            r16 = 0
            r38 = r13
            r35 = r14
            r13 = r16
            r16 = 0
            r36 = r15
            r15 = r16
            r17 = 0
            r31 = 432(0x1b0, float:6.05E-43)
            r30 = r36
            SC.C13607l.j(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            il.g r8 = il.g.f98371a
            java.lang.String r9 = r37.c()
            java.lang.String r8 = r8.a(r9)
            r9 = 16
            float r15 = (float) r9
            float r20 = c2.h.B(r15)
            r21 = 7
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r38
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r13 = 48
            r14 = 12
            r10 = 0
            r11 = 0
            r12 = r36
            SC.U1.b(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r8 = r37.f()
            r9 = -1686929600(0xffffffff9b737f40, float:-2.0141606E-22)
            r13 = r36
            r13.W(r9)
            if (r8 != 0) goto L_0x01ad
            r38 = r13
            r36 = r15
            goto L_0x01e9
        L_0x01ad:
            float r9 = c2.h.B(r15)
            r10 = r38
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.D.k(r10, r3, r9, r4, r6)
            r32 = 0
            r33 = 262136(0x3fff8, float:3.67331E-40)
            r11 = 0
            r16 = 0
            r9 = r13
            r13 = r16
            r16 = 0
            r36 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 432(0x1b0, float:6.05E-43)
            r38 = r9
            r9 = r7
            r30 = r38
            SC.C13607l.j(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x01e9:
            r38.P()
            r7 = -1686921885(0xffffffff9b739d63, float:-2.0151343E-22)
            r8 = r38
            r8.W(r7)
            java.util.List r7 = r37.e()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r12 = r5
        L_0x01ff:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x026e
            java.lang.Object r9 = r7.next()
            int r10 = r12 + 1
            if (r12 >= 0) goto L_0x0210
            YH.C16877v.x()
        L_0x0210:
            com.ingka.ikea.core.model.product.PackagesMeasurements r9 = (com.ingka.ikea.core.model.product.PackagesMeasurements) r9
            r11 = -1686919538(0xffffffff9b73a68e, float:-2.0154306E-22)
            r8.W(r11)
            java.util.List r11 = r9.c()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x0222:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0233
            java.lang.Object r13 = r11.next()
            com.ingka.ikea.core.model.product.Information r13 = (com.ingka.ikea.core.model.product.Information) r13
            r14 = 2
            i(r13, r6, r8, r5, r14)
            goto L_0x0222
        L_0x0233:
            r14 = 2
            r8.P()
            com.ingka.ikea.core.model.product.PackagesQuantity r9 = r9.b()
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            float r13 = c2.h.B(r35)
            androidx.compose.ui.d r13 = androidx.compose.foundation.layout.D.k(r11, r3, r13, r4, r6)
            r15 = 48
            q(r9, r13, r8, r15, r5)
            r9 = -1686910363(0xffffffff9b73ca65, float:-2.0165886E-22)
            r8.W(r9)
            java.util.List r9 = r37.e()
            int r9 = r9.size()
            int r9 = r9 - r4
            if (r12 == r9) goto L_0x0268
            float r9 = c2.h.B(r36)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.i(r11, r9)
            r11 = 6
            s0.C5844O.a(r9, r8, r11)
            goto L_0x0269
        L_0x0268:
            r11 = 6
        L_0x0269:
            r8.P()
            r12 = r10
            goto L_0x01ff
        L_0x026e:
            r8.P()
            r8.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x027d
            U0.C4895p.R()
        L_0x027d:
            r10 = r34
        L_0x027f:
            U0.Y0 r3 = r8.n()
            if (r3 == 0) goto L_0x028d
            ci.w r4 = new ci.w
            r4.<init>(r0, r10, r1, r2)
            r3.a(r4)
        L_0x028d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.B.s(com.ingka.ikea.core.model.product.ItemPackages, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N t(ItemPackages itemPackages, d dVar, int i10, int i11, C4889m mVar, int i12) {
        s(itemPackages, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void u(Packaging packaging, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        Packaging packaging2 = packaging;
        int i12 = i10;
        C4889m k10 = mVar.k(-2069418530);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(packaging2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2069418530, i11, -1, "com.ingka.ikea.app.productinformationpage.v2.compose.PackagingDetailsRow (MeasurementsComposable.kt:217)");
            }
            C5073d.f n10 = C5073d.f18068a.n(h.B((float) 8));
            d.a aVar = d.f18749a;
            I b10 = G.b(n10, C5437c.f24302a.l(), k10, 6);
            int i13 = 0;
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, aVar);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, b10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar2.d());
            C5843N n11 = C5843N.f28726a;
            k10.W(-472409558);
            int i14 = 0;
            for (Object next : packaging.d()) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C16877v.x();
                }
                Information information = (Information) next;
                d.a aVar3 = d.f18749a;
                d e11 = C5842M.e(n11, aVar3, 1.0f, false, 2, (Object) null);
                I a13 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, i13);
                int a14 = C4883j.a(k10, i13);
                C4912y s11 = k10.s();
                d e12 = c.e(k10, e11);
                C4504g.a aVar4 = C4504g.f6515W;
                C17631a<C4504g> a15 = aVar4.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a15);
                } else {
                    k10.t();
                }
                C4889m a16 = F1.a(k10);
                F1.c(a16, a13, aVar4.c());
                F1.c(a16, s11, aVar4.e());
                p<C4504g, Integer, C16807N> b12 = aVar4.b();
                if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                    a16.u(Integer.valueOf(a14));
                    a16.w(Integer.valueOf(a14), b12);
                }
                F1.c(a16, e12, aVar4.d());
                C5862h hVar = C5862h.f28810a;
                int b13 = i14 == packaging.d().size() - 1 ? j.f14783b.b() : j.f14783b.f();
                C4889m mVar3 = k10;
                C4889m mVar4 = mVar3;
                C13607l.j(information.a(), C13679b.a.c.f116681a, J.h(aVar3, 0.0f, 1, (Object) null), C18030v.f147664a.a(k10, C18030v.f147665b).H0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, j.h(b13), (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar4, 432, 0, 261104);
                C13607l.j(information.b(), C13679b.C2857b.a.f116683a, J.h(aVar3, 0.0f, 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, j.h(b13), (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar4, 432, 0, 261112);
                mVar3.x();
                i14 = i15;
                k10 = mVar3;
                i13 = i13;
            }
            mVar2 = k10;
            mVar2.P();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n12 = mVar2.n();
        if (n12 != null) {
            n12.a(new z(packaging2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N v(Packaging packaging, int i10, C4889m mVar, int i11) {
        u(packaging, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
