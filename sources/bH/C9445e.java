package bh;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import J1.j;
import N1.P;
import O0.F0;
import QJ.Q;
import QJ.T;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import TC.C13679b;
import TC.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.y;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p0.s;
import r0.m;
import s0.C5862h;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LO0/F0;", "bottomSheetState", "LXH/N;", "g", "(LO0/F0;LU0/m;I)V", "e", "(LU0/m;I)V", "giftcard-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: bh.e  reason: case insensitive filesystem */
public final class C9445e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bh.e$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f65529a;

        a(C17631a<C16807N> aVar) {
            this.f65529a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-639624632, i11, -1, "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.AboutGiftCardBottomSheetImpl.<anonymous> (AboutGiftCardComposables.kt:60)");
                }
                L.b(j.b(Oo.b.f84330B2, mVar, 0), J.h(C5116k1.a(d.f18749a, "ABOUT_GIFT_CARD_BOTTOM_SHEET_DISMISS"), 0.0f, 1, (Object) null), false, N.Secondary, M.Medium, false, (Integer) null, (K0) null, (m) null, this.f65529a, mVar, 27696, 484);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.AboutGiftCardComposablesKt$AboutGiftCardBottomSheetImpl$dismissBottomSheet$1$1$1", f = "AboutGiftCardComposables.kt", l = {45}, m = "invokeSuspend")
    /* renamed from: bh.e$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f65530c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F0 f65531d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(F0 f02, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f65531d = f02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f65531d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f65530c;
            if (i10 == 0) {
                y.b(obj);
                F0 f02 = this.f65531d;
                this.f65530c = 1;
                if (f02.k(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final void e(C4889m mVar, int i10) {
        C4889m mVar2;
        int i11 = i10;
        C4889m k10 = mVar.k(-525089565);
        if (i11 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-525089565, i11, -1, "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.AboutGiftCardBottomSheetContentImpl (AboutGiftCardComposables.kt:78)");
            }
            C5437c.b g10 = C5437c.f24302a.g();
            d.a aVar = d.f18749a;
            d f10 = androidx.compose.foundation.m.f(e.i(aVar), androidx.compose.foundation.m.c(0, k10, 0, 1), false, (s) null, false, 14, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), g10, k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, f10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
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
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            n.i(C5116k1.a(D.m(aVar, 0.0f, 0.0f, 0.0f, h.B((float) 36), 7, (Object) null), "ABOUT_IMAGE"), (C4478k) null, k10, 6, 2);
            C4889m mVar3 = k10;
            C13607l.j(j.b(Zg.c.f65258l, k10, 0), C13679b.C2857b.a.f116683a, D.m(aVar, 0.0f, 0.0f, 0.0f, h.B((float) 20), 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262136);
            C4889m mVar4 = mVar3;
            mVar2 = mVar4;
            C13607l.j(j.b(Zg.c.f65257k, mVar4, 0), C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262140);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C9444d(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(int i10, C4889m mVar, int i11) {
        e(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(O0.F0 r18, U0.C4889m r19, int r20) {
        /*
            r14 = r18
            r15 = r20
            java.lang.String r0 = "bottomSheetState"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = 1797185282(0x6b1edf02, float:1.920634E26)
            r1 = r19
            U0.m r13 = r1.k(r0)
            r1 = r15 & 6
            r2 = 2
            r3 = 4
            if (r1 != 0) goto L_0x0023
            boolean r1 = r13.V(r14)
            if (r1 == 0) goto L_0x0020
            r1 = r3
            goto L_0x0021
        L_0x0020:
            r1 = r2
        L_0x0021:
            r1 = r1 | r15
            goto L_0x0024
        L_0x0023:
            r1 = r15
        L_0x0024:
            r4 = r1 & 3
            if (r4 != r2) goto L_0x0036
            boolean r2 = r13.l()
            if (r2 != 0) goto L_0x002f
            goto L_0x0036
        L_0x002f:
            r13.L()
            r17 = r13
            goto L_0x00e5
        L_0x0036:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0042
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.AboutGiftCardBottomSheetImpl (AboutGiftCardComposables.kt:40)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x0042:
            java.lang.Object r0 = r13.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r4 = r2.a()
            if (r0 != r4) goto L_0x005d
            dI.j r0 = dI.C17169j.f142968a
            QJ.Q r0 = U0.P.k(r0, r13)
            U0.B r4 = new U0.B
            r4.<init>(r0)
            r13.u(r4)
            r0 = r4
        L_0x005d:
            U0.B r0 = (U0.B) r0
            QJ.Q r0 = r0.a()
            r4 = 1235706681(0x49a76339, float:1371239.1)
            r13.W(r4)
            boolean r4 = r13.F(r0)
            r5 = r1 & 14
            r6 = 1
            if (r5 != r3) goto L_0x0074
            r3 = r6
            goto L_0x0075
        L_0x0074:
            r3 = 0
        L_0x0075:
            r3 = r3 | r4
            java.lang.Object r4 = r13.D()
            if (r3 != 0) goto L_0x0082
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x008a
        L_0x0082:
            bh.a r4 = new bh.a
            r4.<init>(r0, r14)
            r13.u(r4)
        L_0x008a:
            r0 = r4
            nI.a r0 = (nI.C17631a) r0
            r13.P()
            O0.G0 r2 = r18.e()
            O0.G0 r3 = O0.G0.Hidden
            if (r2 == r3) goto L_0x00f4
            SC.x1$c r3 = SC.C13656x1.c.f116498a
            SC.z1 r4 = new SC.z1
            bh.e$a r2 = new bh.e$a
            r2.<init>(r0)
            r5 = 54
            r7 = -639624632(0xffffffffd9e01a48, float:-7.8849114E15)
            c1.a r9 = c1.c.e(r7, r6, r2, r13, r5)
            r11 = 1
            r12 = 0
            r8 = 0
            r10 = 0
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            bh.t r2 = bh.t.f65609a
            nI.p r10 = r2.a()
            int r1 = r1 << 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r2
            int r2 = SC.C13656x1.c.f116499b
            int r2 = r2 << 9
            r1 = r1 | r2
            int r2 = SC.C13664z1.f116520d
            int r2 = r2 << 12
            r12 = r1 | r2
            r16 = 482(0x1e2, float:6.75E-43)
            r1 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r2 = r18
            r11 = r13
            r17 = r13
            r13 = r16
            SC.J.d(r0, r1, r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00e5
            U0.C4895p.R()
        L_0x00e5:
            U0.Y0 r0 = r17.n()
            if (r0 == 0) goto L_0x00f3
            bh.c r1 = new bh.c
            r1.<init>(r14, r15)
            r0.a(r1)
        L_0x00f3:
            return
        L_0x00f4:
            r17 = r13
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ff
            U0.C4895p.R()
        L_0x00ff:
            U0.Y0 r0 = r17.n()
            if (r0 == 0) goto L_0x010d
            bh.b r1 = new bh.b
            r1.<init>(r14, r15)
            r0.a(r1)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.C9445e.g(O0.F0, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(Q q10, F0 f02) {
        QJ.F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new b(f02, (C17164e<? super b>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(F0 f02, int i10, C4889m mVar, int i11) {
        g(f02, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(F0 f02, int i10, C4889m mVar, int i11) {
        g(f02, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
