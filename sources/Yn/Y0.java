package yn;

import A0.f;
import E1.I;
import G1.C4504g;
import SC.H2;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import XH.C16807N;
import XH.t;
import android.content.Context;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.adjust.sdk.Constants;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m1.e;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p0.s;
import s0.C5834E;
import s0.C5848T;
import s0.C5850V;
import s0.C5857c;
import s0.C5862h;
import s0.a0;
import t0.C5934A;
import t0.C5937b;
import t0.x;
import u0.C5968C;
import u0.C5974I;
import u0.C5978b;
import u0.C5984h;
import vn.g;
import wn.C12288c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls0/c;", "Lvn/g;", "plpRowLayout", "", "isSearch", "Lkotlin/Function0;", "LXH/N;", "onTopAppBarBackClicked", "i", "(Ls0/c;Lvn/g;ZLnI/a;LU0/m;I)V", "LA0/f;", "roundedCornerShape", "f", "(Lvn/g;LA0/f;LU0/m;I)V", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Y0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f106785a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                vn.g[] r0 = vn.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                vn.g r1 = vn.g.SINGLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                vn.g r1 = vn.g.MULTI     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f106785a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yn.Y0.a.<clinit>():void");
        }
    }

    private static final void f(g gVar, f fVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        g gVar2 = gVar;
        f fVar2 = fVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-1202527834);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(gVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(fVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1202527834, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.LoadingProductGrid (PlpLoadingScreen.kt:146)");
            }
            int i13 = a.f106785a[gVar.ordinal()];
            if (i13 == 1) {
                mVar2 = k10;
                mVar2.W(446289485);
                H2.b(e.a(J.i(TC.e.i(J.h(D.m(d.f18749a, 0.0f, h.B((float) 24), 0.0f, 0.0f, 13, (Object) null), 0.0f, 1, (Object) null)), h.B((float) Constants.MINIMAL_ERROR_STATUS_CODE)), fVar2), false, mVar2, 0, 2);
                mVar2.P();
            } else if (i13 == 2) {
                k10.W(446628129);
                int integer = ((Context) k10.Q(AndroidCompositionLocals_androidKt.g())).getResources().getInteger(C12288c.f105880a);
                d i14 = TC.e.i(D.m(d.f18749a, 0.0f, h.B((float) 24), 0.0f, 0.0f, 13, (Object) null));
                C5073d dVar = C5073d.f18068a;
                float f10 = (float) 8;
                C5073d.f n10 = dVar.n(h.B(f10));
                C5073d.f n11 = dVar.n(h.B(f10));
                C5978b.a aVar = new C5978b.a(integer);
                k10.W(-2063786327);
                Object D10 = k10.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new W0();
                    k10.u(D10);
                }
                k10.P();
                C4889m mVar3 = k10;
                C5984h.a(aVar, i14, (C5974I) null, (C5834E) null, false, n11, n10, (s) null, false, (C17642l) D10, k10, 807075840, 412);
                mVar3.P();
                mVar2 = mVar3;
            } else {
                C4889m mVar4 = k10;
                mVar4.W(-2063814366);
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
        U0.Y0 n12 = mVar2.n();
        if (n12 != null) {
            n12.a(new X0(gVar2, fVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C5968C c10) {
        C17542s.j(c10, "$this$LazyVerticalGrid");
        C5968C.c(c10, 6, (C17642l) null, (p) null, (C17642l) null, C12380B.f106516a.c(), 14, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(g gVar, f fVar, int i10, C4889m mVar, int i11) {
        f(gVar, fVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void i(C5857c cVar, g gVar, boolean z10, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C5857c cVar2 = cVar;
        g gVar2 = gVar;
        boolean z11 = z10;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(cVar2, "<this>");
        C17542s.j(gVar2, "plpRowLayout");
        C17542s.j(aVar2, "onTopAppBarBackClicked");
        C4889m k10 = mVar.k(392370017);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(gVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.b(z11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        int i13 = i11;
        if ((i13 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(392370017, i13, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.PlpLoadingScreen (PlpLoadingScreen.kt:41)");
            }
            f e10 = A0.g.e(h.B((float) 4));
            d.a aVar3 = d.f18749a;
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar4 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar4.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e11 = c.e(k10, aVar3);
            C4504g.a aVar5 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar5.a();
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
            F1.c(a13, a10, aVar5.c());
            F1.c(a13, s10, aVar5.e());
            p<C4504g, Integer, C16807N> b10 = aVar5.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e11, aVar5.d());
            C5862h hVar = C5862h.f28810a;
            k10.W(-1706362935);
            if (!z11) {
                H2.b(J.i(J.h(aVar3, 0.0f, 1, (Object) null), h.B((float) 214)), false, k10, 6, 2);
            }
            k10.P();
            float f10 = (float) 32;
            H2.b(e.a(J.i(J.g(D.m(TC.e.i(aVar3), 0.0f, z11 ? h.B(h.B((float) 110) + h.B((float) 24)) : h.B((float) 24), 0.0f, 0.0f, 13, (Object) null), 0.4f), h.B(f10)), e10), false, k10, 0, 2);
            float f11 = (float) 24;
            d m10 = D.m(aVar3, h.B(f11), h.B(f11), 0.0f, 0.0f, 12, (Object) null);
            float f12 = (float) 8;
            C5073d.f n10 = dVar.n(h.B(f12));
            k10.W(-1706337469);
            Object D10 = k10.D();
            C4889m.a aVar6 = C4889m.f14007a;
            if (D10 == aVar6.a()) {
                D10 = new T0();
                k10.u(D10);
            }
            k10.P();
            float f13 = f11;
            float f14 = f10;
            int i14 = i13;
            d.a aVar7 = aVar3;
            C4889m mVar3 = k10;
            C5937b.b(m10, (C5934A) null, (C5834E) null, false, n10, (C5437c.C0386c) null, (s) null, false, (C17642l) D10, k10, 100687878, 238);
            d m11 = D.m(aVar7, h.B(f13), h.B(f13), 0.0f, 0.0f, 12, (Object) null);
            C5073d.f n11 = dVar.n(h.B(f12));
            k10.W(-1706324647);
            Object D11 = k10.D();
            if (D11 == aVar6.a()) {
                D11 = new U0();
                k10.u(D11);
            }
            k10.P();
            mVar2 = k10;
            C5937b.b(m11, (C5934A) null, (C5834E) null, false, n11, (C5437c.C0386c) null, (s) null, false, (C17642l) D11, k10, 100687878, 238);
            H2.b(J.i(J.h(D.m(aVar7, 0.0f, h.B(f13), 0.0f, 0.0f, 13, (Object) null), 0.0f, 1, (Object) null), h.B((float) 120)), false, mVar2, 6, 2);
            d.a aVar8 = aVar7;
            d i15 = TC.e.i(J.h(aVar8, 0.0f, 1, (Object) null));
            I h10 = C5077h.h(aVar4.o(), false);
            int a14 = C4883j.a(mVar2, 0);
            C4912y s11 = mVar2.s();
            d e12 = c.e(mVar2, i15);
            C17631a<C4504g> a15 = aVar5.a();
            if (mVar2.m() == null) {
                C4883j.c();
            }
            mVar2.I();
            if (mVar2.i()) {
                mVar2.p(a15);
            } else {
                mVar2.t();
            }
            C4889m a16 = F1.a(mVar2);
            F1.c(a16, h10, aVar5.c());
            F1.c(a16, s11, aVar5.e());
            p<C4504g, Integer, C16807N> b11 = aVar5.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b11);
            }
            F1.c(a16, e12, aVar5.d());
            C5079j jVar = C5079j.f18125a;
            d.a aVar9 = aVar8;
            H2.b(jVar.a(e.a(J.g(J.i(D.m(aVar9, 0.0f, h.B(f13), 0.0f, 0.0f, 13, (Object) null), h.B(f14)), 0.4f), e10), aVar4.h()), false, mVar2, 0, 2);
            H2.b(jVar.a(e.a(J.i(J.y(D.m(aVar9, 0.0f, h.B(f13), 0.0f, 0.0f, 13, (Object) null), h.B((float) 64)), h.B(f14)), e10), aVar4.f()), false, mVar2, 0, 2);
            mVar2.x();
            int i16 = i14 >> 3;
            f(gVar2, e10, mVar2, i16 & 14);
            mVar2.x();
            C1.D(cVar2, C5850V.f(a0.e(C5848T.f28733a, mVar2, 6), mVar2, 0).d(), aVar2, mVar2, (i16 & 896) | (i14 & 14));
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        U0.Y0 n12 = mVar2.n();
        if (n12 != null) {
            n12.a(new V0(cVar, gVar, z10, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N j(x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        x.a(xVar, 10, (C17642l) null, (C17642l) null, C12380B.f106516a.a(), 6, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        x.a(xVar, 6, (C17642l) null, (C17642l) null, C12380B.f106516a.b(), 6, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C5857c cVar, g gVar, boolean z10, C17631a aVar, int i10, C4889m mVar, int i11) {
        i(cVar, gVar, z10, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
