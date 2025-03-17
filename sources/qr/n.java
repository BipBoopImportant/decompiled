package qr;

import E1.I;
import G1.C4504g;
import Iq.a;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5601g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.i1;
import s0.C5843N;
import s0.C5844O;
import s0.C5857c;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LIq/a;", "model", "Lkotlin/Function1;", "LIq/a$a;", "LXH/N;", "onAction", "Landroidx/compose/ui/d;", "modifier", "h", "(LIq/a;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "e", "(LIq/a;LnI/l;LU0/m;I)V", "familyrewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iq.a f101984a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<a.C1605a, C16807N> f101985b;

        a(Iq.a aVar, C17642l<? super a.C1605a, C16807N> lVar) {
            this.f101984a = aVar;
            this.f101985b = lVar;
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$BaseRewardCard");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2140933225, i10, -1, "com.ingka.ikea.familyrewards.presentation.card.RewardCard.<anonymous> (RewardCard.kt:39)");
                }
                Iq.a aVar = this.f101984a;
                C17642l<a.C1605a, C16807N> lVar = this.f101985b;
                d.a aVar2 = d.f18749a;
                I b10 = G.b(C5073d.f18068a.f(), C5437c.f24302a.l(), mVar, 0);
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar, aVar2);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar3.a();
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
                F1.c(a12, b10, aVar3.c());
                F1.c(a12, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b11 = aVar3.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e10, aVar3.d());
                C5843N n10 = C5843N.f28726a;
                n.e(aVar, lVar, mVar, 0);
                C5844O.a(J.y(aVar2, h.B((float) 16)), mVar, 6);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(Iq.a r18, nI.C17642l<? super Iq.a.C1605a, XH.C16807N> r19, U0.C4889m r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = 1118630821(0x42acf3a5, float:86.47587)
            r4 = r20
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            r5 = 4
            if (r4 != 0) goto L_0x0028
            r4 = r2 & 8
            if (r4 != 0) goto L_0x001d
            boolean r4 = r15.V(r0)
            goto L_0x0021
        L_0x001d:
            boolean r4 = r15.F(r0)
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r4 = r5
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r2
            goto L_0x0029
        L_0x0028:
            r4 = r2
        L_0x0029:
            r6 = r2 & 48
            r7 = 32
            if (r6 != 0) goto L_0x003a
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x0037
            r6 = r7
            goto L_0x0039
        L_0x0037:
            r6 = 16
        L_0x0039:
            r4 = r4 | r6
        L_0x003a:
            r6 = r4 & 19
            r8 = 18
            if (r6 != r8) goto L_0x004d
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x0047
            goto L_0x004d
        L_0x0047:
            r15.L()
            r3 = r15
            goto L_0x0120
        L_0x004d:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0059
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.familyrewards.presentation.card.RewardAction (RewardCard.kt:54)"
            U0.C4895p.S(r3, r4, r6, r8)
        L_0x0059:
            boolean r3 = r0 instanceof Iq.a.b
            if (r3 == 0) goto L_0x0080
            r3 = 1028138403(0x3d4825a3, float:0.04886402)
            r15.W(r3)
            r3 = r0
            Iq.a$b r3 = (Iq.a.b) r3
            int r4 = r3.g()
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            java.lang.String r5 = "RewardCardTestTag-AvailableBadge"
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r3, r5)
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 0
            r6 = 1
            r7 = r15
            pr.C11773b.b(r4, r5, r6, r7, r8, r9)
            r15.P()
        L_0x007d:
            r3 = r15
            goto L_0x0117
        L_0x0080:
            boolean r3 = r0 instanceof Iq.a.d
            if (r3 == 0) goto L_0x00a5
            r3 = 1028394432(0x3d4c0dc0, float:0.0498178)
            r15.W(r3)
            r3 = r0
            Iq.a$d r3 = (Iq.a.d) r3
            int r4 = r3.g()
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            java.lang.String r5 = "RewardCardTestTag-UnavailableBadge"
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r3, r5)
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 0
            r6 = 0
            r7 = r15
            pr.C11773b.b(r4, r5, r6, r7, r8, r9)
            r15.P()
            goto L_0x007d
        L_0x00a5:
            boolean r3 = r0 instanceof Iq.a.c
            if (r3 == 0) goto L_0x012f
            r3 = 1028653220(0x3d5000a4, float:0.05078186)
            r15.W(r3)
            int r3 = Oo.b.f84658h3
            r6 = 0
            java.lang.String r3 = J1.j.b(r3, r15, r6)
            SC.M r8 = SC.M.XSmall
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            java.lang.String r10 = "RewardCardTestTag-UseButton"
            androidx.compose.ui.d r9 = androidx.compose.ui.platform.C5116k1.a(r9, r10)
            r10 = 171735143(0xa3c7867, float:9.074516E-33)
            r15.W(r10)
            r10 = r4 & 112(0x70, float:1.57E-43)
            r11 = 1
            if (r10 != r7) goto L_0x00cd
            r7 = r11
            goto L_0x00ce
        L_0x00cd:
            r7 = r6
        L_0x00ce:
            r10 = r4 & 14
            if (r10 == r5) goto L_0x00dc
            r4 = r4 & 8
            if (r4 == 0) goto L_0x00dd
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x00dd
        L_0x00dc:
            r6 = r11
        L_0x00dd:
            r4 = r7 | r6
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x00ed
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x00f5
        L_0x00ed:
            qr.l r5 = new qr.l
            r5.<init>(r1, r0)
            r15.u(r5)
        L_0x00f5:
            r13 = r5
            nI.a r13 = (nI.C17631a) r13
            r15.P()
            r16 = 24624(0x6030, float:3.4506E-41)
            r17 = 492(0x1ec, float:6.9E-43)
            r6 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r4 = r3
            r5 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            r14 = r15
            r3 = r15
            r15 = r16
            r16 = r17
            SC.L.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.P()
        L_0x0117:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0120
            U0.C4895p.R()
        L_0x0120:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x012e
            qr.m r4 = new qr.m
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x012e:
            return
        L_0x012f:
            r3 = r15
            r0 = 171711999(0xa3c1dff, float:9.0575124E-33)
            r3.W(r0)
            r3.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qr.n.e(Iq.a, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17642l lVar, Iq.a aVar) {
        lVar.invoke(new a.C1605a.b(aVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(Iq.a aVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        e(aVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void h(Iq.a aVar, C17642l<? super a.C1605a, C16807N> lVar, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(aVar, "model");
        C17542s.j(lVar, "onAction");
        C4889m k10 = mVar.k(966368050);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? k10.V(aVar) : k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.F(lVar) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.V(dVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(966368050, i12, -1, "com.ingka.ikea.familyrewards.presentation.card.RewardCard (RewardCard.kt:33)");
            }
            k10.W(2089082236);
            boolean z10 = false;
            boolean z11 = (i12 & 112) == 32;
            int i14 = i12 & 14;
            if (i14 == 4 || ((i12 & 8) != 0 && k10.F(aVar))) {
                z10 = true;
            }
            boolean z12 = z11 | z10;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new j(lVar, aVar);
                k10.u(D10);
            }
            k10.P();
            C11812c.c(aVar, (C17631a) D10, dVar, c1.c.e(2140933225, true, new a(aVar, lVar), k10, 54), (i1) null, (C5601g) null, k10, i14 | 3072 | (i12 & 896), 48);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new k(aVar, lVar, dVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C17642l lVar, Iq.a aVar) {
        lVar.invoke(new a.C1605a.C1606a(aVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(Iq.a aVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(aVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
