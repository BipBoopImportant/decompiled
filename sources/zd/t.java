package zD;

import E1.I;
import G1.C4504g;
import GD.C12929b;
import IC.C13026h;
import SC.C13575d;
import SC.H2;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import p0.v;
import p1.i1;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5861g;
import s0.C5862h;
import xD.C15208e;
import xD.k;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lp0/v;", "orientation", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "h", "(Lp0/v;Landroidx/compose/ui/d;LU0/m;II)V", "f", "(Landroidx/compose/ui/d;LU0/m;II)V", "d", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f132525a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: zD.t$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C3274a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f132526a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    p0.v[] r0 = p0.v.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    p0.v r1 = p0.v.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    p0.v r1 = p0.v.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f132526a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: zD.t.a.C3274a.<clinit>():void");
            }
        }

        a(v vVar) {
            this.f132525a = vVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1792706482, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.layout.LoadingCardSkeleton.<anonymous> (LoadingSkeleton.kt:36)");
                }
                int i11 = C3274a.f132526a[this.f132525a.ordinal()];
                if (i11 == 1) {
                    mVar.W(-1457352446);
                    t.f(J.f(d.f18749a, 0.0f, 1, (Object) null), mVar, 6, 0);
                    mVar.P();
                } else if (i11 == 2) {
                    mVar.W(-1457349084);
                    t.d(J.f(d.f18749a, 0.0f, 1, (Object) null), mVar, 6, 0);
                    mVar.P();
                } else {
                    mVar.W(-1457354592);
                    mVar.P();
                    throw new XH.t();
                }
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
    public static final void d(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(-283595727);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            d.a aVar = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-283595727, i12, -1, "com.ingka.ikea.wallet.impl.compose.card.layout.FrontHorizontalLoadingLayout (LoadingSkeleton.kt:107)");
            }
            d d10 = b.d(aVar, C13575d.a(k10, 0).k(), (i1) null, 2, (Object) null);
            C5073d dVar3 = C5073d.f18068a;
            C5073d.e f10 = dVar3.f();
            C5437c.a aVar2 = C5437c.f24302a;
            I b10 = G.b(f10, aVar2.l(), k10, 0);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, d10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar3.a();
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
            F1.c(a12, b10, aVar3.c());
            F1.c(a12, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b11 = aVar3.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar3.d());
            C5843N n10 = C5843N.f28726a;
            d.a aVar4 = d.f18749a;
            I h10 = C5077h.h(aVar2.o(), false);
            int a13 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = c.e(k10, aVar4);
            C17631a<C4504g> a14 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a14);
            } else {
                k10.t();
            }
            C4889m a15 = F1.a(k10);
            F1.c(a15, h10, aVar3.c());
            F1.c(a15, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b12 = aVar3.b();
            if (a15.i() || !C17542s.e(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.w(Integer.valueOf(a13), b12);
            }
            F1.c(a15, e11, aVar3.d());
            C5079j jVar = C5079j.f18125a;
            d.a aVar5 = aVar4;
            v.b(new C12929b(C13026h.c(""), C13026h.c(""), C13026h.c("")), v.Vertical, J.g(J.d(aVar4, 0.0f, 1, (Object) null), 0.45f), (C15208e) null, (C17631a<C16807N>) null, k10, 432, 24);
            float f11 = (float) 40;
            d m10 = D.m(D.k(jVar.e(aVar5), h.B((float) 24), 0.0f, 2, (Object) null), 0.0f, h.B(f11), 0.0f, 0.0f, 13, (Object) null);
            I a16 = C5080k.a(dVar3.g(), aVar2.k(), k10, 0);
            int a17 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            d e12 = c.e(k10, m10);
            C17631a<C4504g> a18 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a18);
            } else {
                k10.t();
            }
            C4889m a19 = F1.a(k10);
            F1.c(a19, a16, aVar3.c());
            F1.c(a19, s12, aVar3.e());
            p<C4504g, Integer, C16807N> b13 = aVar3.b();
            if (a19.i() || !C17542s.e(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.w(Integer.valueOf(a17), b13);
            }
            F1.c(a19, e12, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            H2.b(J.g(J.i(aVar5, h.B((float) 20)), 0.35f), false, k10, 6, 2);
            float f12 = (float) 12;
            C5844O.a(J.i(aVar5, h.B(f12)), k10, 6);
            H2.b(J.g(J.i(aVar5, h.B(f11)), 0.25f), false, k10, 6, 2);
            float f13 = (float) 8;
            C5844O.a(J.i(aVar5, h.B(f13)), k10, 6);
            H2.b(J.g(J.i(aVar5, h.B(f12)), 0.3f), false, k10, 6, 2);
            k10.x();
            k10.x();
            C5844O.a(J.y(J.d(aVar5, 0.0f, 1, (Object) null), h.B(f13)), k10, 6);
            d d11 = J.d(C5842M.e(n10, aVar5, 1.0f, false, 2, (Object) null), 0.0f, 1, (Object) null);
            I h11 = C5077h.h(aVar2.e(), false);
            int a20 = C4883j.a(k10, 0);
            C4912y s13 = k10.s();
            d e13 = c.e(k10, d11);
            C17631a<C4504g> a21 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a21);
            } else {
                k10.t();
            }
            C4889m a22 = F1.a(k10);
            F1.c(a22, h11, aVar3.c());
            F1.c(a22, s13, aVar3.e());
            p<C4504g, Integer, C16807N> b14 = aVar3.b();
            if (a22.i() || !C17542s.e(a22.D(), Integer.valueOf(a20))) {
                a22.u(Integer.valueOf(a20));
                a22.w(Integer.valueOf(a20), b14);
            }
            F1.c(a22, e13, aVar3.d());
            k.h((d) null, k10, 0, 1);
            k10.x();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = aVar;
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new s(dVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(d dVar, int i10, int i11, C4889m mVar, int i12) {
        d(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void f(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(1811203267);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            d.a aVar = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(1811203267, i12, -1, "com.ingka.ikea.wallet.impl.compose.card.layout.FrontVerticalLoadingLayout (LoadingSkeleton.kt:48)");
            }
            d d10 = b.d(aVar, C13575d.a(k10, 0).k(), (i1) null, 2, (Object) null);
            C5073d dVar3 = C5073d.f18068a;
            C5073d.m g10 = dVar3.g();
            C5437c.a aVar2 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar2.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, d10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar3.a();
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
            F1.c(a13, a10, aVar3.c());
            F1.c(a13, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            d.a aVar4 = d.f18749a;
            I h10 = C5077h.h(aVar2.o(), false);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = c.e(k10, aVar4);
            C17631a<C4504g> a15 = aVar3.a();
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
            F1.c(a16, h10, aVar3.c());
            F1.c(a16, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b11 = aVar3.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b11);
            }
            F1.c(a16, e11, aVar3.d());
            C5079j jVar = C5079j.f18125a;
            d.a aVar5 = aVar4;
            v.b(new C12929b(C13026h.c(""), C13026h.c(""), C13026h.c("")), v.Vertical, (d) null, (C15208e) null, (C17631a<C16807N>) null, k10, 48, 28);
            float f10 = (float) 40;
            d m10 = D.m(D.k(jVar.e(aVar5), h.B((float) 24), 0.0f, 2, (Object) null), 0.0f, h.B(f10), 0.0f, 0.0f, 13, (Object) null);
            I a17 = C5080k.a(dVar3.g(), aVar2.k(), k10, 0);
            int a18 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            d e12 = c.e(k10, m10);
            C17631a<C4504g> a19 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a19);
            } else {
                k10.t();
            }
            C4889m a20 = F1.a(k10);
            F1.c(a20, a17, aVar3.c());
            F1.c(a20, s12, aVar3.e());
            p<C4504g, Integer, C16807N> b12 = aVar3.b();
            if (a20.i() || !C17542s.e(a20.D(), Integer.valueOf(a18))) {
                a20.u(Integer.valueOf(a18));
                a20.w(Integer.valueOf(a18), b12);
            }
            F1.c(a20, e12, aVar3.d());
            H2.b(J.g(J.i(aVar5, h.B((float) 20)), 0.35f), false, k10, 6, 2);
            float f11 = (float) 12;
            C5844O.a(J.i(aVar5, h.B(f11)), k10, 6);
            H2.b(J.g(J.i(aVar5, h.B(f10)), 0.25f), false, k10, 6, 2);
            float f12 = (float) 8;
            C5844O.a(J.i(aVar5, h.B(f12)), k10, 6);
            H2.b(J.g(J.i(aVar5, h.B(f11)), 0.3f), false, k10, 6, 2);
            k10.x();
            k10.x();
            C5844O.a(J.h(J.i(aVar5, h.B(f12)), 0.0f, 1, (Object) null), k10, 6);
            d c10 = C5861g.c(hVar, J.h(aVar5, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
            I h11 = C5077h.h(aVar2.e(), false);
            int a21 = C4883j.a(k10, 0);
            C4912y s13 = k10.s();
            d e13 = c.e(k10, c10);
            C17631a<C4504g> a22 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a22);
            } else {
                k10.t();
            }
            C4889m a23 = F1.a(k10);
            F1.c(a23, h11, aVar3.c());
            F1.c(a23, s13, aVar3.e());
            p<C4504g, Integer, C16807N> b13 = aVar3.b();
            if (a23.i() || !C17542s.e(a23.D(), Integer.valueOf(a21))) {
                a23.u(Integer.valueOf(a21));
                a23.w(Integer.valueOf(a21), b13);
            }
            F1.c(a23, e13, aVar3.d());
            k.h((d) null, k10, 0, 1);
            k10.x();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = aVar;
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new r(dVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(d dVar, int i10, int i11, C4889m mVar, int i12) {
        f(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(p0.v r19, androidx.compose.ui.d r20, U0.C4889m r21, int r22, int r23) {
        /*
            r0 = r19
            r1 = r22
            r2 = r23
            java.lang.String r3 = "orientation"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = 967765833(0x39aeef49, float:3.3366148E-4)
            r4 = r21
            U0.m r15 = r4.k(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x001b
            r4 = r1 | 6
            goto L_0x002b
        L_0x001b:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x002a
            boolean r4 = r15.V(r0)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r1
            goto L_0x002b
        L_0x002a:
            r4 = r1
        L_0x002b:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r6 = r20
            goto L_0x0046
        L_0x0034:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r20
            boolean r7 = r15.V(r6)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r4 = r4 | r7
        L_0x0046:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L_0x0059
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            r15.L()
            r18 = r15
            goto L_0x00a2
        L_0x0059:
            if (r5 == 0) goto L_0x0060
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r17 = r5
            goto L_0x0062
        L_0x0060:
            r17 = r6
        L_0x0062:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x006e
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.wallet.impl.compose.card.layout.LoadingCardSkeleton (LoadingSkeleton.kt:33)"
            U0.C4895p.S(r3, r4, r5, r6)
        L_0x006e:
            zD.t$a r3 = new zD.t$a
            r3.<init>(r0)
            r5 = 54
            r6 = -1792706482(0xffffffff9525784e, float:-3.3416388E-26)
            r7 = 1
            c1.a r13 = c1.c.e(r6, r7, r3, r15, r5)
            int r3 = r4 >> 3
            r3 = r3 & 14
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r4
            r16 = 126(0x7e, float:1.77E-43)
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r4 = r17
            r14 = r15
            r18 = r15
            r15 = r3
            O0.P0.a(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00a0
            U0.C4895p.R()
        L_0x00a0:
            r6 = r17
        L_0x00a2:
            U0.Y0 r3 = r18.n()
            if (r3 == 0) goto L_0x00b0
            zD.q r4 = new zD.q
            r4.<init>(r0, r6, r1, r2)
            r3.a(r4)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zD.t.h(p0.v, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(v vVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(vVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
