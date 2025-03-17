package yD;

import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import G1.C4504g;
import GD.k;
import SC.C13575d;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.ui.d;
import c2.C5267b;
import c2.h;
import i1.C5437c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.M;
import nI.C17631a;
import nI.p;
import nI.q;
import p0.v;
import p1.i1;
import s0.C5857c;
import t1.C5942c;
import vD.C15135c;
import xD.k;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aA\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LGD/k$a;", "model", "Lp0/v;", "orientation", "Lkotlin/Function0;", "LXH/N;", "onShowBarcodeClicked", "Landroidx/compose/ui/d;", "modifier", "Lt1/c;", "qrPainter", "e", "(LGD/k$a;Lp0/v;LnI/a;Landroidx/compose/ui/d;Lt1/c;LU0/m;II)V", "onClick", "c", "(Lt1/c;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yD.l  reason: case insensitive filesystem */
public final class C15295l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yD.l$a */
    static final class a implements I {

        /* renamed from: a  reason: collision with root package name */
        public static final a f132189a = new a();

        a() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c(int i10, a0 a0Var, M m10, a0 a0Var2, M m11, a0.a aVar) {
            C17542s.j(aVar, "$this$layout");
            int i11 = m10.f144346a;
            a0.a.i(aVar, a0Var, (i10 - a0Var.E0()) / 2, i11, 0.0f, 4, (Object) null);
            a0.a.i(aVar, a0Var2, (i10 - a0Var2.E0()) / 2, i11 + a0Var.z0() + m11.f144346a, 0.0f, 4, (Object) null);
            return C16807N.f139792a;
        }

        public final J i(K k10, List<? extends H> list, long j10) {
            int i10;
            int i11;
            int i12;
            K k11 = k10;
            List<? extends H> list2 = list;
            C17542s.j(k11, "$this$Layout");
            C17542s.j(list2, "measurables");
            int i13 = 0;
            H h10 = (H) list2.get(0);
            a0 i02 = ((H) list2.get(1)).i0(j10);
            int k12 = C5267b.k(j10) - i02.z0();
            int K02 = k11.K0(h.B((float) 12));
            int K03 = k11.K0(h.B((float) 16));
            int i14 = K03 * 2;
            int i15 = K02 + i14;
            C15135c cVar = C15135c.f131438a;
            int K04 = k11.K0(cVar.b());
            int K05 = k11.K0(cVar.a());
            int i16 = k12 - K05;
            if (i16 >= i15) {
                i10 = i16;
                i11 = K05;
            } else {
                i10 = k12 - K04;
                i11 = K04;
            }
            a0 i03 = h10.i0(C5267b.c(j10, i11, i11, i11, i11));
            M m10 = new M();
            M m11 = new M();
            if (i10 > 0) {
                if (i10 < i14) {
                    m10.f144346a = i10 / 2;
                    m11.f144346a = 0;
                } else if (i10 < i15) {
                    m10.f144346a = K03;
                    m11.f144346a = i10 - i14;
                } else {
                    m10.f144346a = (i10 - K02) / 2;
                    m11.f144346a = K02;
                }
            }
            Iterable<a0> q10 = C16877v.q(i03, i02);
            Iterator it = q10.iterator();
            if (it.hasNext()) {
                int E02 = ((a0) it.next()).E0();
                loop0:
                while (true) {
                    i12 = E02;
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        E02 = ((a0) it.next()).E0();
                        if (i12 < E02) {
                        }
                    }
                }
                for (a0 z02 : q10) {
                    i13 += z02.z0();
                }
                return K.v0(k10, i12, i13 + m11.f144346a + (m10.f144346a * 2), (Map) null, new C15294k(i12, i03, m10, i02, m11), 4, (Object) null);
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yD.l$b */
    static final class b implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5942c f132190a;

        b(C5942c cVar) {
            this.f132190a = cVar;
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$QrCodeContainer");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2102539823, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.familycard.DataMatrixLayout.<anonymous>.<anonymous> (FamilyCardFront.kt:77)");
                }
                k.d(this.f132190a, (d) null, mVar, 0, 2);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yD.l$c */
    static final class c implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5942c f132191a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f132192b;

        c(C5942c cVar, C17631a<C16807N> aVar) {
            this.f132191a = cVar;
            this.f132192b = aVar;
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$CardFrontScaffold");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(335740633, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.familycard.FamilyCardFront.<anonymous> (FamilyCardFront.kt:53)");
                }
                d d10 = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.f(d.f18749a, 0.0f, 1, (Object) null), C13575d.a(mVar, 0).F0(), (i1) null, 2, (Object) null);
                C5437c e10 = C5437c.f24302a.e();
                C5942c cVar2 = this.f132191a;
                C17631a<C16807N> aVar = this.f132192b;
                I h10 = C5077h.h(e10, false);
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                d e11 = androidx.compose.ui.c.e(mVar, d10);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, h10, aVar2.c());
                F1.c(a12, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e11, aVar2.d());
                C5079j jVar = C5079j.f18125a;
                C15295l.c(cVar2, aVar, (d) null, mVar, 0, 4);
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(t1.C5942c r17, nI.C17631a<XH.C16807N> r18, androidx.compose.ui.d r19, U0.C4889m r20, int r21, int r22) {
        /*
            r1 = r17
            r4 = r21
            r0 = 1742947592(0x67e34508, float:2.1465012E24)
            r2 = r20
            U0.m r2 = r2.k(r0)
            r3 = r22 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r4 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r4 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.F(r1)
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
            r5 = r22 & 2
            if (r5 == 0) goto L_0x002d
            r3 = r3 | 48
            r15 = r18
            goto L_0x003f
        L_0x002d:
            r5 = r4 & 48
            r15 = r18
            if (r5 != 0) goto L_0x003f
            boolean r5 = r2.F(r15)
            if (r5 == 0) goto L_0x003c
            r5 = 32
            goto L_0x003e
        L_0x003c:
            r5 = 16
        L_0x003e:
            r3 = r3 | r5
        L_0x003f:
            r5 = r22 & 4
            if (r5 == 0) goto L_0x0048
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r6 = r19
            goto L_0x005a
        L_0x0048:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0045
            r6 = r19
            boolean r7 = r2.V(r6)
            if (r7 == 0) goto L_0x0057
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r7
        L_0x005a:
            r7 = r3 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x006d
            boolean r7 = r2.l()
            if (r7 != 0) goto L_0x0067
            goto L_0x006d
        L_0x0067:
            r2.L()
            r3 = r6
            goto L_0x014e
        L_0x006d:
            if (r5 == 0) goto L_0x0073
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r14 = r5
            goto L_0x0074
        L_0x0073:
            r14 = r6
        L_0x0074:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0080
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.wallet.impl.compose.card.familycard.DataMatrixLayout (FamilyCardFront.kt:72)"
            U0.C4895p.S(r0, r3, r5, r6)
        L_0x0080:
            r0 = -521050059(0xffffffffe0f16835, float:-1.39161695E20)
            r2.W(r0)
            java.lang.Object r0 = r2.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r0 != r5) goto L_0x0097
            yD.l$a r0 = yD.C15295l.a.f132189a
            r2.u(r0)
        L_0x0097:
            E1.I r0 = (E1.I) r0
            r2.P()
            r5 = 0
            int r6 = U0.C4883j.a(r2, r5)
            U0.y r7 = r2.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r2, r14)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r2.m()
            if (r11 != 0) goto L_0x00b8
            U0.C4883j.c()
        L_0x00b8:
            r2.I()
            boolean r11 = r2.i()
            if (r11 == 0) goto L_0x00c5
            r2.p(r10)
            goto L_0x00c8
        L_0x00c5:
            r2.t()
        L_0x00c8:
            U0.m r10 = U0.F1.a(r2)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r0, r11)
            nI.p r0 = r9.e()
            U0.F1.c(r10, r7, r0)
            nI.p r0 = r9.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x00f2
            java.lang.Object r7 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x0100
        L_0x00f2:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r10.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.w(r6, r0)
        L_0x0100:
            nI.p r0 = r9.d()
            U0.F1.c(r10, r8, r0)
            yD.l$b r0 = new yD.l$b
            r0.<init>(r1)
            r6 = 54
            r7 = 2102539823(0x7d52362f, float:1.7463701E37)
            r8 = 1
            c1.a r0 = c1.c.e(r7, r8, r0, r2, r6)
            r6 = 0
            r7 = 48
            xD.k.f(r6, r0, r2, r7, r8)
            int r0 = Oo.b.f84336B8
            java.lang.String r5 = J1.j.b(r0, r2, r5)
            SC.J1 r9 = SC.J1.XSmall
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            java.lang.String r6 = "WalletTestTags-QrCode-Button"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r0, r6)
            int r0 = r3 << 21
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r3
            r0 = r0 | 24624(0x6030, float:3.4506E-41)
            r16 = 236(0xec, float:3.31E-43)
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = r18
            r3 = r14
            r14 = r2
            r15 = r0
            SC.I1.h(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x014e
            U0.C4895p.R()
        L_0x014e:
            U0.Y0 r6 = r2.n()
            if (r6 == 0) goto L_0x0165
            yD.j r7 = new yD.j
            r0 = r7
            r1 = r17
            r2 = r18
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0165:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yD.C15295l.c(t1.c, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C5942c cVar, C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(cVar, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(GD.k.a r22, p0.v r23, nI.C17631a<XH.C16807N> r24, androidx.compose.ui.d r25, t1.C5942c r26, U0.C4889m r27, int r28, int r29) {
        /*
            r1 = r22
            r0 = r23
            r15 = r24
            r14 = r28
            java.lang.String r2 = "model"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "orientation"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            java.lang.String r2 = "onShowBarcodeClicked"
            kotlin.jvm.internal.C17542s.j(r15, r2)
            r2 = 1694658420(0x65026f74, float:3.8497724E22)
            r3 = r27
            U0.m r13 = r3.k(r2)
            r3 = r29 & 1
            if (r3 == 0) goto L_0x0027
            r3 = r14 | 6
            goto L_0x0037
        L_0x0027:
            r3 = r14 & 6
            if (r3 != 0) goto L_0x0036
            boolean r3 = r13.V(r1)
            if (r3 == 0) goto L_0x0033
            r3 = 4
            goto L_0x0034
        L_0x0033:
            r3 = 2
        L_0x0034:
            r3 = r3 | r14
            goto L_0x0037
        L_0x0036:
            r3 = r14
        L_0x0037:
            r4 = r29 & 2
            if (r4 == 0) goto L_0x003e
            r3 = r3 | 48
            goto L_0x004e
        L_0x003e:
            r4 = r14 & 48
            if (r4 != 0) goto L_0x004e
            boolean r4 = r13.V(r0)
            if (r4 == 0) goto L_0x004b
            r4 = 32
            goto L_0x004d
        L_0x004b:
            r4 = 16
        L_0x004d:
            r3 = r3 | r4
        L_0x004e:
            r4 = r29 & 4
            if (r4 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r4 = r14 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0065
            boolean r4 = r13.F(r15)
            if (r4 == 0) goto L_0x0062
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r4
        L_0x0065:
            r4 = r29 & 8
            if (r4 == 0) goto L_0x006e
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006b:
            r5 = r25
            goto L_0x0080
        L_0x006e:
            r5 = r14 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x006b
            r5 = r25
            boolean r6 = r13.V(r5)
            if (r6 == 0) goto L_0x007d
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r3 = r3 | r6
        L_0x0080:
            r6 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0099
            r6 = r29 & 16
            if (r6 != 0) goto L_0x0093
            r6 = r26
            boolean r7 = r13.F(r6)
            if (r7 == 0) goto L_0x0095
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0093:
            r6 = r26
        L_0x0095:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r3 = r3 | r7
            goto L_0x009b
        L_0x0099:
            r6 = r26
        L_0x009b:
            r7 = r3 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            if (r7 != r8) goto L_0x00b1
            boolean r7 = r13.l()
            if (r7 != 0) goto L_0x00a8
            goto L_0x00b1
        L_0x00a8:
            r13.L()
            r4 = r5
            r5 = r6
            r18 = r13
            goto L_0x014e
        L_0x00b1:
            r13.G()
            r7 = r14 & 1
            r8 = -57345(0xffffffffffff1fff, float:NaN)
            r9 = 0
            if (r7 == 0) goto L_0x00cf
            boolean r7 = r13.O()
            if (r7 == 0) goto L_0x00c3
            goto L_0x00cf
        L_0x00c3:
            r13.L()
            r4 = r29 & 16
            if (r4 == 0) goto L_0x00cb
            r3 = r3 & r8
        L_0x00cb:
            r16 = r5
        L_0x00cd:
            r12 = r6
            goto L_0x00e9
        L_0x00cf:
            if (r4 == 0) goto L_0x00d4
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x00d5
        L_0x00d4:
            r4 = r5
        L_0x00d5:
            r5 = r29 & 16
            if (r5 == 0) goto L_0x00e6
            java.lang.String r5 = r22.h()
            t1.a r5 = xD.k.j(r5, r13, r9)
            r3 = r3 & r8
            r16 = r4
            r12 = r5
            goto L_0x00e9
        L_0x00e6:
            r16 = r4
            goto L_0x00cd
        L_0x00e9:
            r13.y()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00f8
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.wallet.impl.compose.card.familycard.FamilyCardFront (FamilyCardFront.kt:43)"
            U0.C4895p.S(r2, r3, r4, r5)
        L_0x00f8:
            GD.b r2 = r22.g()
            boolean r5 = r1 instanceof GD.k.a.b
            xD.e r7 = xD.C15208e.Light
            tK.h r4 = SC.C13575d.a(r13, r9)
            long r10 = r4.D0()
            tK.h r4 = SC.C13575d.a(r13, r9)
            long r17 = r4.B0()
            yD.l$c r4 = new yD.l$c
            r4.<init>(r12, r15)
            r6 = 54
            r8 = 335740633(0x1402fed9, float:6.6135826E-27)
            r9 = 1
            c1.a r19 = c1.c.e(r8, r9, r4, r13, r6)
            r4 = r3 & 112(0x70, float:1.57E-43)
            r6 = 100859904(0x6030000, float:2.4638362E-35)
            r4 = r4 | r6
            int r3 = r3 >> 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r20 = r4 | r3
            r21 = 16
            r6 = 0
            r3 = r23
            r4 = r16
            r8 = r10
            r10 = r17
            r17 = r12
            r12 = r19
            r18 = r13
            r14 = r20
            r15 = r21
            zD.i.d(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13, r14, r15)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x014a
            U0.C4895p.R()
        L_0x014a:
            r4 = r16
            r5 = r17
        L_0x014e:
            U0.Y0 r8 = r18.n()
            if (r8 == 0) goto L_0x0167
            yD.i r9 = new yD.i
            r0 = r9
            r1 = r22
            r2 = r23
            r3 = r24
            r6 = r28
            r7 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yD.C15295l.e(GD.k$a, p0.v, nI.a, androidx.compose.ui.d, t1.c, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(k.a aVar, v vVar, C17631a aVar2, d dVar, C5942c cVar, int i10, int i11, C4889m mVar, int i12) {
        e(aVar, vVar, aVar2, dVar, cVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
