package BD;

import GD.C12935h;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import p0.v;
import s0.C5857c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lp0/v;", "orientation", "Lkotlin/Function1;", "LGD/h;", "LXH/N;", "onEvent", "Landroidx/compose/ui/d;", "modifier", "c", "(Lp0/v;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "Lkotlin/Function0;", "onButtonClicked", "e", "(LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: BD.B  reason: case insensitive filesystem */
public final class C12619B {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BD.B$a */
    static final class a implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12935h, C16807N> f107849a;

        a(C17642l<? super C12935h, C16807N> lVar) {
            this.f107849a = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar) {
            lVar.invoke(C12935h.f.RetryPrepaid);
            return C16807N.f139792a;
        }

        public final void b(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$FlippableCard");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1444133546, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.ErrorCard.<anonymous> (ErrorCard.kt:45)");
                }
                d f10 = J.f(d.f18749a, 0.0f, 1, (Object) null);
                mVar.W(-497308190);
                boolean V10 = mVar.V(this.f107849a);
                C17642l<C12935h, C16807N> lVar = this.f107849a;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new C12618A(lVar);
                    mVar.u(D10);
                }
                mVar.P();
                C12619B.e((C17631a) D10, f10, mVar, 48, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(p0.v r15, nI.C17642l<? super GD.C12935h, XH.C16807N> r16, androidx.compose.ui.d r17, U0.C4889m r18, int r19, int r20) {
        /*
            r10 = r15
            r11 = r16
            r12 = r19
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 2106989133(0x7d961a4d, float:2.4940095E37)
            r1 = r18
            U0.m r13 = r1.k(r0)
            r1 = r20 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r12 | 6
            goto L_0x002f
        L_0x001f:
            r1 = r12 & 6
            if (r1 != 0) goto L_0x002e
            boolean r1 = r13.V(r15)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r12
            goto L_0x002f
        L_0x002e:
            r1 = r12
        L_0x002f:
            r2 = r20 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0046
        L_0x0036:
            r2 = r12 & 48
            if (r2 != 0) goto L_0x0046
            boolean r2 = r13.F(r11)
            if (r2 == 0) goto L_0x0043
            r2 = 32
            goto L_0x0045
        L_0x0043:
            r2 = 16
        L_0x0045:
            r1 = r1 | r2
        L_0x0046:
            r2 = r20 & 4
            if (r2 == 0) goto L_0x004f
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r3 = r17
            goto L_0x0061
        L_0x004f:
            r3 = r12 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004c
            r3 = r17
            boolean r4 = r13.V(r3)
            if (r4 == 0) goto L_0x005e
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r1 = r1 | r4
        L_0x0061:
            r4 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0072
            boolean r4 = r13.l()
            if (r4 != 0) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            r13.L()
            goto L_0x00bb
        L_0x0072:
            if (r2 == 0) goto L_0x0078
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r14 = r2
            goto L_0x0079
        L_0x0078:
            r14 = r3
        L_0x0079:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0085
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.wallet.impl.compose.card.prepaid.ErrorCard (ErrorCard.kt:39)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x0085:
            BD.B$a r0 = new BD.B$a
            r0.<init>(r11)
            r2 = 54
            r3 = -1444133546(0xffffffffa9ec4556, float:-1.0492533E-13)
            r4 = 1
            c1.a r2 = c1.c.e(r3, r4, r0, r13, r2)
            BD.m r0 = BD.C12635m.f108022a
            nI.q r3 = r0.a()
            r0 = r1 & 14
            r0 = r0 | 3504(0xdb0, float:4.91E-42)
            r4 = 57344(0xe000, float:8.0356E-41)
            int r1 = r1 << 6
            r1 = r1 & r4
            r8 = r0 | r1
            r9 = 32
            r1 = 0
            r5 = 0
            r0 = r15
            r4 = r14
            r7 = r13
            zD.p.j(r0, r1, r2, r3, r4, r5, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ba
            U0.C4895p.R()
        L_0x00ba:
            r3 = r14
        L_0x00bb:
            U0.Y0 r6 = r13.n()
            if (r6 == 0) goto L_0x00d1
            BD.y r7 = new BD.y
            r0 = r7
            r1 = r15
            r2 = r16
            r4 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: BD.C12619B.c(p0.v, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(v vVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(vVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(nI.C17631a<XH.C16807N> r42, androidx.compose.ui.d r43, U0.C4889m r44, int r45, int r46) {
        /*
            r13 = r42
            r14 = r45
            r15 = r46
            r0 = 6
            r1 = 1002122173(0x3bbb2bbd, float:0.005712001)
            r2 = r44
            U0.m r12 = r2.k(r1)
            r2 = r15 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0018
            r2 = r14 | 6
            goto L_0x0028
        L_0x0018:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x0027
            boolean r2 = r12.F(r13)
            if (r2 == 0) goto L_0x0024
            r2 = 4
            goto L_0x0025
        L_0x0024:
            r2 = r3
        L_0x0025:
            r2 = r2 | r14
            goto L_0x0028
        L_0x0027:
            r2 = r14
        L_0x0028:
            r4 = r15 & 2
            r5 = 32
            if (r4 == 0) goto L_0x0033
            r2 = r2 | 48
        L_0x0030:
            r6 = r43
            goto L_0x0044
        L_0x0033:
            r6 = r14 & 48
            if (r6 != 0) goto L_0x0030
            r6 = r43
            boolean r7 = r12.V(r6)
            if (r7 == 0) goto L_0x0041
            r7 = r5
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r2 = r2 | r7
        L_0x0044:
            r7 = r2 & 19
            r8 = 18
            if (r7 != r8) goto L_0x0058
            boolean r7 = r12.l()
            if (r7 != 0) goto L_0x0051
            goto L_0x0058
        L_0x0051:
            r12.L()
            r17 = r12
            goto L_0x01af
        L_0x0058:
            if (r4 == 0) goto L_0x005e
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r11 = r4
            goto L_0x005f
        L_0x005e:
            r11 = r6
        L_0x005f:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x006b
            r4 = -1
            java.lang.String r6 = "com.ingka.ikea.wallet.impl.compose.card.prepaid.ErrorCardFront (ErrorCard.kt:58)"
            U0.C4895p.S(r1, r2, r4, r6)
        L_0x006b:
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r1 = r1.b()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r4 = r4.g()
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            r6 = 0
            r7 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r11, r5, r6, r3, r7)
            r5 = 54
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r4, r12, r5)
            r4 = 0
            int r5 = U0.C4883j.a(r12, r4)
            U0.y r6 = r12.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r12, r3)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r8 = r7.a()
            U0.f r9 = r12.m()
            if (r9 != 0) goto L_0x00a4
            U0.C4883j.c()
        L_0x00a4:
            r12.I()
            boolean r9 = r12.i()
            if (r9 == 0) goto L_0x00b1
            r12.p(r8)
            goto L_0x00b4
        L_0x00b1:
            r12.t()
        L_0x00b4:
            U0.m r8 = U0.F1.a(r12)
            nI.p r9 = r7.c()
            U0.F1.c(r8, r1, r9)
            nI.p r1 = r7.e()
            U0.F1.c(r8, r6, r1)
            nI.p r1 = r7.b()
            boolean r6 = r8.i()
            if (r6 != 0) goto L_0x00de
            java.lang.Object r6 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x00ec
        L_0x00de:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r8.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.w(r5, r1)
        L_0x00ec:
            nI.p r1 = r7.d()
            U0.F1.c(r8, r3, r1)
            s0.h r1 = s0.C5862h.f28810a
            int r1 = Oo.b.f84843y3
            java.lang.String r16 = J1.j.b(r1, r12, r4)
            TC.b$b$e r17 = TC.C13679b.C2857b.e.f116687a
            tK.h r1 = SC.C13575d.a(r12, r4)
            long r19 = r1.G0()
            Y1.j$a r1 = Y1.j.f14783b
            int r3 = r1.a()
            Y1.j r29 = Y1.j.h(r3)
            r40 = 0
            r41 = 261108(0x3fbf4, float:3.6589E-40)
            r18 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 48
            r38 = r12
            SC.C13607l.j(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            float r5 = (float) r0
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r3, r5)
            s0.C5844O.a(r5, r12, r0)
            int r5 = Oo.b.f84833x3
            java.lang.String r16 = J1.j.b(r5, r12, r4)
            TC.b$a$b r17 = TC.C13679b.a.C2856b.f116680a
            tK.h r5 = SC.C13575d.a(r12, r4)
            long r19 = r5.H0()
            int r1 = r1.a()
            Y1.j r29 = Y1.j.h(r1)
            SC.C13607l.j(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r1 = 24
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r3, r1)
            s0.C5844O.a(r1, r12, r0)
            int r0 = Oo.b.f84750p7
            java.lang.String r0 = J1.j.b(r0, r12, r4)
            SC.M r4 = SC.M.Small
            SC.N r5 = SC.N.Secondary
            java.lang.String r1 = "WalletTestTags-RetryButton"
            androidx.compose.ui.d r1 = androidx.compose.ui.platform.C5116k1.a(r3, r1)
            int r2 = r2 << 27
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r3
            r10 = r2 | 27696(0x6c30, float:3.881E-41)
            r16 = 484(0x1e4, float:6.78E-43)
            r2 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r42
            r17 = r10
            r10 = r12
            r18 = r11
            r11 = r17
            r17 = r12
            r12 = r16
            SC.L.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r17.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01ad
            U0.C4895p.R()
        L_0x01ad:
            r6 = r18
        L_0x01af:
            U0.Y0 r0 = r17.n()
            if (r0 == 0) goto L_0x01bd
            BD.z r1 = new BD.z
            r1.<init>(r13, r6, r14, r15)
            r0.a(r1)
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: BD.C12619B.e(nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
