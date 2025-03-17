package go;

import E1.I;
import G1.C4504g;
import L1.v;
import L1.x;
import N1.P;
import Nn.G;
import RC.n;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13593h1;
import SC.C13596i0;
import SC.C13597i1;
import SC.C13604k0;
import SC.C13605k1;
import SC.C13607l;
import SC.K2;
import SC.L1;
import SC.L2;
import SC.S1;
import TC.C13679b;
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
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import rv.C11848a;
import rv.C11849b;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5862h;
import tK.C18029u;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a?\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lgo/U;", "model", "Lkotlin/Function1;", "LNn/G;", "LXH/N;", "onPickUpClick", "onSeeDetailsClick", "g", "(Lgo/U;LnI/l;LnI/l;LU0/m;I)V", "pickupPointHolder", "j", "(LNn/G;LnI/l;LU0/m;I)V", "n", "(Lgo/U;LU0/m;I)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f97789a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<G, C16807N> f97790b;

        a(U u10, C17642l<? super G, C16807N> lVar) {
            this.f97789a = u10;
            this.f97790b = lVar;
        }

        public final void a(C4889m mVar, int i10) {
            d.a aVar;
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2031394131, i11, -1, "com.ingka.ikea.checkout.impl.delivery.compose.PickupPointContent.<anonymous> (PickupPointContent.kt:73)");
                }
                U u10 = this.f97789a;
                C17642l<G, C16807N> lVar = this.f97790b;
                d.a aVar2 = d.f18749a;
                C5073d dVar = C5073d.f18068a;
                C5073d.m g10 = dVar.g();
                C5437c.a aVar3 = C5437c.f24302a;
                I a10 = C5080k.a(g10, aVar3.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar2, aVar2);
                C4504g.a aVar4 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar4.a();
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
                F1.c(a13, a10, aVar4.c());
                F1.c(a13, s10, aVar4.e());
                p<C4504g, Integer, C16807N> b10 = aVar4.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar4.d());
                C5862h hVar = C5862h.f28810a;
                I b11 = androidx.compose.foundation.layout.G.b(dVar.d(), aVar3.l(), mVar2, 54);
                int a14 = C4883j.a(mVar2, 0);
                C4912y s11 = mVar.s();
                d e11 = c.e(mVar2, aVar2);
                C17631a<C4504g> a15 = aVar4.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a15);
                } else {
                    mVar.t();
                }
                C4889m a16 = F1.a(mVar);
                F1.c(a16, b11, aVar4.c());
                F1.c(a16, s11, aVar4.e());
                p<C4504g, Integer, C16807N> b12 = aVar4.b();
                if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                    a16.u(Integer.valueOf(a14));
                    a16.w(Integer.valueOf(a14), b12);
                }
                F1.c(a16, e11, aVar4.d());
                C5843N n10 = C5843N.f28726a;
                d e12 = C5842M.e(n10, aVar2, 1.0f, false, 2, (Object) null);
                I a17 = C5080k.a(dVar.g(), aVar3.k(), mVar2, 0);
                int a18 = C4883j.a(mVar2, 0);
                C4912y s12 = mVar.s();
                d e13 = c.e(mVar2, e12);
                C17631a<C4504g> a19 = aVar4.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a19);
                } else {
                    mVar.t();
                }
                C4889m a20 = F1.a(mVar);
                F1.c(a20, a17, aVar4.c());
                F1.c(a20, s12, aVar4.e());
                p<C4504g, Integer, C16807N> b13 = aVar4.b();
                if (a20.i() || !C17542s.e(a20.D(), Integer.valueOf(a18))) {
                    a20.u(Integer.valueOf(a18));
                    a20.w(Integer.valueOf(a18), b13);
                }
                F1.c(a20, e13, aVar4.d());
                d.a aVar5 = aVar2;
                C17642l<G, C16807N> lVar2 = lVar;
                U u11 = u10;
                C4889m mVar3 = mVar;
                C13607l.j(u10.j().e(), C13679b.C2857b.c.f116685a, D.m(aVar2, 0.0f, 0.0f, 0.0f, h.B((float) 4), 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262136);
                float f10 = (float) 8;
                float f11 = f10;
                C13607l.j(u11.g(), C13679b.a.c.f116681a, D.m(aVar5, 0.0f, 0.0f, 0.0f, h.B(f10), 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262136);
                mVar.x();
                C4889m mVar4 = mVar;
                U u12 = u11;
                b0.n(u12, mVar4, 0);
                mVar.x();
                mVar4.W(-1177855003);
                if (u12.p()) {
                    aVar = aVar5;
                    K2.d(J1.j.a(C11848a.f102161d, u12.i(), new Object[]{Integer.valueOf(u12.i())}, mVar4, 0), L2.Low, D.m(C5116k1.a(aVar, "PickupPointContent.UNAVAILABLE_ITEMS_WARNING"), 0.0f, 0.0f, 0.0f, h.B(f11), 7, (Object) null), false, mVar, 432, 8);
                } else {
                    aVar = aVar5;
                }
                mVar.P();
                I b14 = androidx.compose.foundation.layout.G.b(dVar.f(), aVar3.i(), mVar4, 48);
                int a21 = C4883j.a(mVar4, 0);
                C4912y s13 = mVar.s();
                d e14 = c.e(mVar4, aVar);
                C17631a<C4504g> a22 = aVar4.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar4.p(a22);
                } else {
                    mVar.t();
                }
                C4889m a23 = F1.a(mVar);
                F1.c(a23, b14, aVar4.c());
                F1.c(a23, s13, aVar4.e());
                p<C4504g, Integer, C16807N> b15 = aVar4.b();
                if (a23.i() || !C17542s.e(a23.D(), Integer.valueOf(a21))) {
                    a23.u(Integer.valueOf(a21));
                    a23.w(Integer.valueOf(a21), b15);
                }
                F1.c(a23, e14, aVar4.d());
                b0.j(u12.j(), lVar2, mVar4, 0);
                C5844O.a(C5842M.e(n10, aVar, 1.0f, false, 2, (Object) null), mVar4, 0);
                mVar4.W(65239004);
                if (u12.h()) {
                    C13605k1.b(C5116k1.a(aVar, "PickupPointContent.LOADING"), (C13597i1) null, (C13593h1) null, mVar, 6, 6);
                }
                mVar.P();
                mVar.x();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f97791a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Nn.G$b[] r0 = Nn.G.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.G$b r1 = Nn.G.b.YES     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Nn.G$b r1 = Nn.G.b.UNCERTAIN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Nn.G$b r1 = Nn.G.b.NO     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f97791a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: go.b0.b.<clinit>():void");
        }
    }

    public static final void g(U u10, C17642l<? super G, C16807N> lVar, C17642l<? super G, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        boolean z10;
        U u11 = u10;
        C17642l<? super G, C16807N> lVar3 = lVar;
        C17642l<? super G, C16807N> lVar4 = lVar2;
        int i12 = i10;
        C17542s.j(u11, "model");
        C17542s.j(lVar3, "onPickUpClick");
        C17542s.j(lVar4, "onSeeDetailsClick");
        C4889m k10 = mVar.k(-695057356);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(u11) ? 4 : 2) | i12;
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
                C4895p.S(-695057356, i11, -1, "com.ingka.ikea.checkout.impl.delivery.compose.PickupPointContent (PickupPointContent.kt:55)");
            }
            int i13 = b.f97791a[u10.j().i().ordinal()];
            boolean z11 = false;
            if (i13 == 1 || i13 == 2) {
                z10 = true;
            } else if (i13 == 3) {
                z10 = false;
            } else {
                throw new t();
            }
            d a10 = C5116k1.a(d.f18749a, "PickupPointContent.CONTENT");
            boolean o10 = u10.o();
            C13604k0 k0Var = C13604k0.Small;
            k10.W(-2030373043);
            if ((i11 & 112) == 32) {
                z11 = true;
            }
            boolean F10 = k10.F(u11) | z11;
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new V(lVar3, u11);
                k10.u(D10);
            }
            k10.P();
            boolean z12 = z10;
            mVar2 = k10;
            C13596i0.e(o10, (C17631a) D10, a10, false, z12, 0.0f, k0Var, 0, 0, c1.c.e(-2031394131, true, new a(u11, lVar4), k10, 54), mVar2, 806879616, 424);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new W(u11, lVar3, lVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17642l lVar, U u10) {
        lVar.invoke(u10.j());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(U u10, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        g(u10, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(Nn.G r19, nI.C17642l<? super Nn.G, XH.C16807N> r20, U0.C4889m r21, int r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
            r3 = -789845029(0xffffffffd0ebebdb, float:-3.16648223E10)
            r4 = r21
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            r5 = 2
            if (r4 != 0) goto L_0x001f
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x001c
            r4 = 4
            goto L_0x001d
        L_0x001c:
            r4 = r5
        L_0x001d:
            r4 = r4 | r2
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r6 = r2 & 48
            r7 = 32
            if (r6 != 0) goto L_0x0031
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x002e
            r6 = r7
            goto L_0x0030
        L_0x002e:
            r6 = 16
        L_0x0030:
            r4 = r4 | r6
        L_0x0031:
            r6 = r4 & 19
            r8 = 18
            if (r6 != r8) goto L_0x0044
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x003e
            goto L_0x0044
        L_0x003e:
            r15.L()
            r3 = r15
            goto L_0x0103
        L_0x0044:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0050
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.checkout.impl.delivery.compose.PickupPointDetailsButton (PickupPointContent.kt:138)"
            U0.C4895p.S(r3, r4, r6, r8)
        L_0x0050:
            Nn.G$b r3 = r19.i()
            int[] r6 = go.b0.b.f97791a
            int r3 = r3.ordinal()
            r3 = r6[r3]
            r6 = 1
            if (r3 == r6) goto L_0x006d
            if (r3 == r5) goto L_0x006d
            r4 = 3
            if (r3 != r4) goto L_0x0067
            r3 = r15
            goto L_0x00fa
        L_0x0067:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x006d:
            int r3 = Oo.b.f84698l
            java.lang.String r5 = r19.e()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r8 = 0
            java.lang.String r3 = J1.j.c(r3, r5, r15, r8)
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r9 = 1955190639(0x7489d76f, float:8.736745E31)
            r15.W(r9)
            boolean r9 = r15.V(r3)
            java.lang.Object r10 = r15.D()
            if (r9 != 0) goto L_0x0096
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x009e
        L_0x0096:
            go.X r10 = new go.X
            r10.<init>(r3)
            r15.u(r10)
        L_0x009e:
            nI.l r10 = (nI.C17642l) r10
            r15.P()
            r3 = 0
            androidx.compose.ui.d r5 = L1.o.d(r5, r8, r10, r6, r3)
            int r3 = rv.C11849b.f102167B0
            java.lang.String r3 = J1.j.b(r3, r15, r8)
            SC.N r9 = SC.N.Secondary
            SC.M r10 = SC.M.Small
            r11 = 1955199758(0x7489fb0e, float:8.745565E31)
            r15.W(r11)
            r4 = r4 & 112(0x70, float:1.57E-43)
            if (r4 != r7) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r6 = r8
        L_0x00be:
            boolean r4 = r15.F(r0)
            r4 = r4 | r6
            java.lang.Object r6 = r15.D()
            if (r4 != 0) goto L_0x00d1
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x00d9
        L_0x00d1:
            go.Y r6 = new go.Y
            r6.<init>(r1, r0)
            r15.u(r6)
        L_0x00d9:
            r13 = r6
            nI.a r13 = (nI.C17631a) r13
            r15.P()
            r16 = 27648(0x6c00, float:3.8743E-41)
            r17 = 484(0x1e4, float:6.78E-43)
            r6 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r18 = 0
            r4 = r3
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r14
            r12 = r18
            r14 = r15
            r3 = r15
            r15 = r16
            r16 = r17
            SC.L.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00fa:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0103
            U0.C4895p.R()
        L_0x0103:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x0111
            go.Z r4 = new go.Z
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: go.b0.j(Nn.G, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N k(String str, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.d0(xVar, str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C17642l lVar, G g10) {
        lVar.invoke(g10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(G g10, C17642l lVar, int i10, C4889m mVar, int i11) {
        j(g10, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void n(U u10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        U u11 = u10;
        int i12 = i10;
        C4889m k10 = mVar.k(936226973);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(u11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(936226973, i11, -1, "com.ingka.ikea.checkout.impl.delivery.compose.PickupPointPriceContent (PickupPointContent.kt:169)");
            }
            int i13 = b.f97791a[u10.j().i().ordinal()];
            if (i13 == 1 || i13 == 2) {
                mVar2 = k10;
                mVar2.W(-1163075738);
                n.a n10 = u10.n();
                if (n10 != null) {
                    L1.c(n10.b(), L1.b(n10.a()), C5116k1.a(D.m(d.f18749a, C18029u.f147649a.a(), 0.0f, 0.0f, 0.0f, 14, (Object) null), "SkapaPriceTestTags_PRICE"), S1.Small, mVar2, qx.c.f130485c | 3072, 0);
                    C16807N n11 = C16807N.f139792a;
                }
                mVar2.P();
            } else if (i13 == 3) {
                k10.W(-1162597284);
                C4889m mVar3 = k10;
                C13607l.j(J1.j.b(C11849b.f102245U2, k10, 0), C13679b.a.C2856b.f116680a, (d) null, 0, 0, C4830x.c(C4830x.f13449b.a()), (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262108);
                mVar3.P();
                mVar2 = mVar3;
            } else {
                C4889m mVar4 = k10;
                mVar4.W(239571909);
                mVar4.P();
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n12 = mVar2.n();
        if (n12 != null) {
            n12.a(new a0(u11, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o(U u10, int i10, C4889m mVar, int i11) {
        n(u10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
