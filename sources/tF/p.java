package Tf;

import B0.C4380y;
import E1.I;
import G1.C4504g;
import IC.C13023e;
import J1.j;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import TC.e;
import Tf.u;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import Y1.f;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import dI.C17168i;
import i1.C5437c;
import j3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n1.C5626f;
import nI.C17631a;
import nI.C17642l;
import rv.C11849b;
import s0.C5861g;
import s0.C5862h;
import tK.C18029u;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0011\u0010\u0010\u001ao\u0010\u001c\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00142\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tH\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u0002"}, d2 = {"LTf/u;", "discountViewModel", "Lkotlin/Function0;", "LXH/N;", "onClose", "j", "(LTf/u;LnI/a;LU0/m;I)V", "LTf/u$b;", "state", "Lkotlin/Function1;", "", "onInputChanged", "onSubmitClicked", "o", "(LTf/u$b;LnI/l;LnI/l;LU0/m;I)V", "w", "(LU0/m;I)V", "q", "Ls0/g;", "input", "", "inputEnabled", "LIC/e;", "inputLabel", "buttonText", "", "errorTextRes", "loading", "s", "(Ls0/g;Ljava/lang/String;ZLIC/e;LIC/e;Ljava/lang/Integer;ZLnI/l;LnI/l;LU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {
    public static final void j(u uVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(uVar, "discountViewModel");
        C17542s.j(aVar, "onClose");
        C4889m k10 = mVar.k(1241343594);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(uVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1241343594, i11, -1, "com.ingka.ikea.app.cart.discount.DiscountContent (DiscountContent.kt:41)");
            }
            A1<u.b> c10 = a.c(uVar.m(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7);
            if (k(c10).b()) {
                aVar.invoke();
            }
            u.b k11 = k(c10);
            k10.W(1178858968);
            boolean F10 = k10.F(uVar);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new g(uVar);
                k10.u(D10);
            }
            C17642l lVar = (C17642l) D10;
            k10.P();
            k10.W(1178847941);
            boolean V10 = k10.V(c10) | k10.F(uVar);
            Object D11 = k10.D();
            if (V10 || D11 == C4889m.f14007a.a()) {
                D11 = new h(uVar, c10);
                k10.u(D11);
            }
            k10.P();
            o(k11, lVar, (C17642l) D11, k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new i(uVar, aVar, i10));
        }
    }

    private static final u.b k(A1<? extends u.b> a12) {
        return (u.b) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N l(u uVar, String str) {
        C17542s.j(str, "it");
        uVar.E(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(u uVar, A1 a12, String str) {
        C17542s.j(str, "it");
        u.b k10 = k(a12);
        if (k10 instanceof u.b.a) {
            uVar.k(str);
        } else if (k10 instanceof u.b.C1115b) {
            uVar.C(str);
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(u uVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        j(uVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void o(u.b bVar, C17642l<? super String, C16807N> lVar, C17642l<? super String, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        u.b bVar2 = bVar;
        C17642l<? super String, C16807N> lVar3 = lVar;
        C17642l<? super String, C16807N> lVar4 = lVar2;
        int i12 = i10;
        C17542s.j(bVar2, "state");
        C17542s.j(lVar3, "onInputChanged");
        C17542s.j(lVar4, "onSubmitClicked");
        C4889m k10 = mVar.k(237744210);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(bVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar3) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar4) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(237744210, i11, -1, "com.ingka.ikea.app.cart.discount.DiscountContentImpl (DiscountContent.kt:72)");
            }
            d h10 = J.h(C5116k1.a(d.f18749a, "DISCOUNT_CONTENT_TEST_TAG"), 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar.c());
            F1.c(a13, s10, aVar.e());
            nI.p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar.d());
            C5862h hVar = C5862h.f28810a;
            w(k10, 0);
            q(k10, 0);
            C13023e a14 = bVar.a();
            boolean e11 = bVar.e();
            String d10 = bVar.d();
            C13023e f10 = bVar.f();
            Integer c10 = bVar.c();
            boolean g10 = bVar.g();
            int i13 = C13023e.f110931a;
            int i14 = i11 << 18;
            s(hVar, d10, e11, f10, a14, c10, g10, lVar, lVar2, k10, (i13 << 12) | (i13 << 9) | 6 | (29360128 & i14) | (i14 & 234881024));
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new j(bVar2, lVar3, lVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N p(u.b bVar, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        o(bVar, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void q(C4889m mVar, int i10) {
        C4889m mVar2;
        int i11 = i10;
        C4889m k10 = mVar.k(-863854636);
        if (i11 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-863854636, i11, -1, "com.ingka.ikea.app.cart.discount.DiscountDescription (DiscountContent.kt:111)");
            }
            mVar2 = k10;
            C13607l.j(j.b(C11849b.f102335q, k10, 0), C13679b.a.C2856b.f116680a, D.m(e.i(d.f18749a), 0.0f, 0.0f, 0.0f, C18029u.f147649a.e(), 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262136);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new o(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N r(int i10, C4889m mVar, int i11) {
        q(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void s(s0.C5861g r36, java.lang.String r37, boolean r38, IC.C13023e r39, IC.C13023e r40, java.lang.Integer r41, boolean r42, nI.C17642l<? super java.lang.String, XH.C16807N> r43, nI.C17642l<? super java.lang.String, XH.C16807N> r44, U0.C4889m r45, int r46) {
        /*
            r15 = r37
            r13 = r39
            r11 = r40
            r7 = r41
            r2 = r44
            r1 = r46
            r0 = -742338567(0xffffffffd3c0cff9, float:-1.65624585E12)
            r3 = r45
            U0.m r14 = r3.k(r0)
            r3 = r1 & 48
            if (r3 != 0) goto L_0x0026
            boolean r3 = r14.V(r15)
            if (r3 == 0) goto L_0x0022
            r3 = 32
            goto L_0x0024
        L_0x0022:
            r3 = 16
        L_0x0024:
            r3 = r3 | r1
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            r4 = r1 & 384(0x180, float:5.38E-43)
            r10 = r38
            if (r4 != 0) goto L_0x0039
            boolean r4 = r14.b(r10)
            if (r4 == 0) goto L_0x0036
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0038
        L_0x0036:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0038:
            r3 = r3 | r4
        L_0x0039:
            r4 = r1 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0052
            r4 = r1 & 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x0046
            boolean r4 = r14.V(r13)
            goto L_0x004a
        L_0x0046:
            boolean r4 = r14.F(r13)
        L_0x004a:
            if (r4 == 0) goto L_0x004f
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0051
        L_0x004f:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0051:
            r3 = r3 | r4
        L_0x0052:
            r4 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x006d
            r4 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 & r1
            if (r4 != 0) goto L_0x0061
            boolean r4 = r14.V(r11)
            goto L_0x0065
        L_0x0061:
            boolean r4 = r14.F(r11)
        L_0x0065:
            if (r4 == 0) goto L_0x006a
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006c
        L_0x006a:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x006c:
            r3 = r3 | r4
        L_0x006d:
            r4 = 196608(0x30000, float:2.75506E-40)
            r5 = r1 & r4
            if (r5 != 0) goto L_0x007f
            boolean r5 = r14.V(r7)
            if (r5 == 0) goto L_0x007c
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007e
        L_0x007c:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x007e:
            r3 = r3 | r5
        L_0x007f:
            r5 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 & r1
            r9 = r42
            if (r5 != 0) goto L_0x0092
            boolean r5 = r14.b(r9)
            if (r5 == 0) goto L_0x008f
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0091
        L_0x008f:
            r5 = 524288(0x80000, float:7.34684E-40)
        L_0x0091:
            r3 = r3 | r5
        L_0x0092:
            r5 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 & r1
            r6 = r43
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r14.F(r6)
            if (r5 == 0) goto L_0x00a2
            r5 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00a4
        L_0x00a2:
            r5 = 4194304(0x400000, float:5.877472E-39)
        L_0x00a4:
            r3 = r3 | r5
        L_0x00a5:
            r5 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 & r1
            if (r5 != 0) goto L_0x00b6
            boolean r5 = r14.F(r2)
            if (r5 == 0) goto L_0x00b3
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00b5
        L_0x00b3:
            r5 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00b5:
            r3 = r3 | r5
        L_0x00b6:
            r5 = r3
            r3 = 38347921(0x2492491, float:1.4777642E-37)
            r3 = r3 & r5
            r8 = 38347920(0x2492490, float:1.4777641E-37)
            if (r3 != r8) goto L_0x00cf
            boolean r3 = r14.l()
            if (r3 != 0) goto L_0x00c7
            goto L_0x00cf
        L_0x00c7:
            r14.L()
            r0 = r15
            r15 = r14
            r14 = r11
            goto L_0x026b
        L_0x00cf:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00db
            r3 = -1
            java.lang.String r8 = "com.ingka.ikea.app.cart.discount.DiscountInputContent (DiscountContent.kt:135)"
            U0.C4895p.S(r0, r5, r3, r8)
        L_0x00db:
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.f()
            java.lang.Object r0 = r14.Q(r0)
            n1.f r0 = (n1.C5626f) r0
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            java.lang.String r8 = "DISCOUNT_INPUT_FIELD_TEST_TAG"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r3, r8)
            androidx.compose.ui.d r16 = TC.e.i(r8)
            tK.u r23 = tK.C18029u.f147649a
            float r20 = r23.a()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            int r24 = IC.C13023e.f110931a
            int r8 = r5 >> 9
            r8 = r8 & 14
            r8 = r24 | r8
            java.lang.String r17 = r13.a(r14, r8)
            B0.A r19 = new B0.A
            T1.r$a r8 = T1.r.f13620b
            int r29 = r8.b()
            r33 = 119(0x77, float:1.67E-43)
            r34 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r25 = r19
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r8 = -510972857(0xffffffffe18b2c47, float:-3.20911E20)
            r14.W(r8)
            boolean r8 = r14.F(r0)
            java.lang.Object r12 = r14.D()
            if (r8 != 0) goto L_0x0146
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r12 != r8) goto L_0x014e
        L_0x0146:
            Tf.l r12 = new Tf.l
            r12.<init>(r0)
            r14.u(r12)
        L_0x014e:
            r26 = r12
            nI.l r26 = (nI.C17642l) r26
            r14.P()
            B0.z r34 = new B0.z
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 62
            r33 = 0
            r25 = r34
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            if (r7 == 0) goto L_0x0171
            SC.G r0 = SC.G.ERROR
        L_0x016e:
            r25 = r0
            goto L_0x0174
        L_0x0171:
            SC.G r0 = SC.G.DEFAULT
            goto L_0x016e
        L_0x0174:
            r0 = -510964484(0xffffffffe18b4cfc, float:-3.212056E20)
            r14.W(r0)
            r12 = 0
            if (r7 != 0) goto L_0x0180
            r26 = 0
            goto L_0x018a
        L_0x0180:
            int r8 = r41.intValue()
            java.lang.String r8 = J1.j.b(r8, r14, r12)
            r26 = r8
        L_0x018a:
            r14.P()
            int r20 = uK.C18146a.f148481i3
            SC.K0 r8 = SC.K0.LEADING
            java.lang.Integer r20 = java.lang.Integer.valueOf(r20)
            r35 = r3
            r3 = r20
            int r27 = r5 >> 3
            r20 = r27 & 14
            r21 = 102457344(0x61b6000, float:2.922279E-35)
            r20 = r20 | r21
            int r21 = r5 >> 18
            r21 = r21 & 112(0x70, float:1.57E-43)
            r20 = r20 | r21
            int r0 = r5 << 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r21 = r0 | r4
            r22 = 284160(0x45600, float:3.98193E-40)
            r4 = 0
            r0 = 0
            r28 = r5
            r5 = r0
            r6 = r0
            r9 = r0
            r10 = r0
            r0 = 0
            r29 = r12
            r12 = r0
            r0 = 0
            r30 = r14
            r14 = r0
            r18 = 0
            r0 = r37
            r1 = r43
            r2 = r17
            r7 = r16
            r11 = r26
            r13 = r38
            r15 = r19
            r16 = r34
            r17 = r25
            r19 = r30
            SC.V0.e(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = "DISCOUNT_SUBMIT_BUTTON_TEST_TAG"
            r1 = r35
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r1, r0)
            r1 = 0
            r12 = 1
            r2 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r0, r1, r12, r2)
            float r1 = r23.e()
            float r2 = r23.a()
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.j(r0, r2, r1)
            int r0 = r28 >> 12
            r0 = r0 & 14
            r0 = r24 | r0
            r14 = r40
            r15 = r30
            java.lang.String r1 = r14.a(r15, r0)
            int r0 = r37.length()
            if (r0 <= 0) goto L_0x020b
            r3 = r12
            goto L_0x020d
        L_0x020b:
            r3 = r29
        L_0x020d:
            r0 = -510943153(0xffffffffe18ba04f, float:-3.219561E20)
            r15.W(r0)
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r28 & r0
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            if (r0 != r4) goto L_0x021d
            r0 = r12
            goto L_0x021f
        L_0x021d:
            r0 = r29
        L_0x021f:
            r4 = r28 & 112(0x70, float:1.57E-43)
            r5 = 32
            if (r4 != r5) goto L_0x0226
            goto L_0x0228
        L_0x0226:
            r12 = r29
        L_0x0228:
            r0 = r0 | r12
            java.lang.Object r4 = r15.D()
            if (r0 != 0) goto L_0x023d
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x0238
            goto L_0x023d
        L_0x0238:
            r0 = r37
            r13 = r44
            goto L_0x0249
        L_0x023d:
            Tf.m r4 = new Tf.m
            r0 = r37
            r13 = r44
            r4.<init>(r13, r0)
            r15.u(r4)
        L_0x0249:
            r10 = r4
            nI.a r10 = (nI.C17631a) r10
            r15.P()
            r4 = 458752(0x70000, float:6.42848E-40)
            r12 = r27 & r4
            r16 = 472(0x1d8, float:6.61E-43)
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r6 = r42
            r11 = r15
            r13 = r16
            SC.L.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x026b
            U0.C4895p.R()
        L_0x026b:
            U0.Y0 r11 = r15.n()
            if (r11 == 0) goto L_0x028e
            Tf.n r12 = new Tf.n
            r0 = r12
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
            r7 = r42
            r8 = r43
            r9 = r44
            r10 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x028e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Tf.p.s(s0.g, java.lang.String, boolean, IC.e, IC.e, java.lang.Integer, boolean, nI.l, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C5626f fVar, C4380y yVar) {
        C17542s.j(yVar, "$this$KeyboardActions");
        C5626f.q(fVar, false, 1, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C17642l lVar, String str) {
        lVar.invoke(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C5861g gVar, String str, boolean z10, C13023e eVar, C13023e eVar2, Integer num, boolean z11, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        s(gVar, str, z10, eVar, eVar2, num, z11, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void w(C4889m mVar, int i10) {
        C4889m mVar2;
        int i11 = i10;
        C4889m k10 = mVar.k(-443499720);
        if (i11 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-443499720, i11, -1, "com.ingka.ikea.app.cart.discount.DiscountTitle (DiscountContent.kt:96)");
            }
            mVar2 = k10;
            C13607l.j(j.b(C11849b.f102339r, k10, 0), C13679b.C2857b.a.f116683a, D.k(e.i(d.f18749a), 0.0f, C18029u.f147649a.a(), 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262136);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new k(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N x(int i10, C4889m mVar, int i11) {
        w(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
