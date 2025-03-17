package bh;

import B0.C4373q;
import E1.C4478k;
import E1.I;
import G1.C4504g;
import HJ.C15854t;
import IC.C13023e;
import J1.e;
import KC.C13131a;
import KC.r;
import KC.s;
import KC.t;
import KJ.C15988d;
import N1.C4669d;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
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
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import gh.C9742a;
import gh.i;
import i1.C5437c;
import java.text.NumberFormat;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
import lg.C10027d;
import n0.C5583F;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5712d0;
import p1.C5749w0;
import s0.C5842M;
import s0.C5843N;
import s0.C5861g;
import s0.C5862h;
import t1.C5942c;
import tK.C18030v;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a=\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0014*\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LKC/s;", "giftCardValidator", "Lgh/i;", "checkGiftCardBalanceState", "Lkp/d;", "currencyConfig", "LKC/a;", "giftCardFormActions", "Lkotlin/Function0;", "LXH/N;", "onCheckAnotherCard", "d", "(LKC/s;Lgh/i;Lkp/d;LKC/a;LnI/a;LU0/m;I)V", "", "sectionLabel", "Lgh/i$a;", "state", "f", "(ILgh/i$a;Lkp/d;LnI/a;LU0/m;I)V", "Lix/b;", "", "i", "(Lix/b;Lkp/d;)Ljava/lang/String;", "j", "(Ljava/lang/String;)Ljava/lang/String;", "giftcard-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.a f65626a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11522d f65627b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4669d f65628c;

        a(i.a aVar, C11522d dVar, C4669d dVar2) {
            this.f65626a = aVar;
            this.f65627b = dVar;
            this.f65628c = dVar2;
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            long x02;
            long y02;
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(gVar, "$this$Card");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1436016302, i11, -1, "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.GiftCardContent.<anonymous>.<anonymous> (GiftCardBalanceComposables.kt:147)");
                }
                d.a aVar = d.f18749a;
                d h10 = J.h(aVar, 0.0f, 1, (Object) null);
                i.a aVar2 = this.f65626a;
                C11522d dVar = this.f65627b;
                C4669d dVar2 = this.f65628c;
                C5073d dVar3 = C5073d.f18068a;
                C5073d.e f10 = dVar3.f();
                C5437c.a aVar3 = C5437c.f24302a;
                I b10 = G.b(f10, aVar3.l(), mVar2, 0);
                int a10 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar2, h10);
                C4504g.a aVar4 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar4.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, b10, aVar4.c());
                F1.c(a12, s10, aVar4.e());
                p<C4504g, Integer, C16807N> b11 = aVar4.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e10, aVar4.d());
                C5843N n10 = C5843N.f28726a;
                float f11 = (float) 20;
                d l10 = D.l(C5842M.e(n10, aVar, 0.6f, false, 2, (Object) null), h.B(f11), h.B(f11), h.B(f11), h.B((float) 12));
                I a13 = C5080k.a(dVar3.g(), aVar3.k(), mVar2, 0);
                int a14 = C4883j.a(mVar2, 0);
                C4912y s11 = mVar.s();
                d e11 = c.e(mVar2, l10);
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
                F1.c(a16, a13, aVar4.c());
                F1.c(a16, s11, aVar4.e());
                p<C4504g, Integer, C16807N> b12 = aVar4.b();
                if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                    a16.u(Integer.valueOf(a14));
                    a16.w(Integer.valueOf(a14), b12);
                }
                F1.c(a16, e11, aVar4.d());
                C5862h hVar = C5862h.f28810a;
                if (aVar2.a().e()) {
                    mVar2.W(-823565933);
                    x02 = C18030v.f147664a.a(mVar2, C18030v.f147665b).L();
                    mVar.P();
                } else {
                    mVar2.W(-823474948);
                    x02 = C18030v.f147664a.a(mVar2, C18030v.f147665b).x0();
                    mVar.P();
                }
                long j10 = x02;
                C4669d dVar4 = dVar2;
                float f12 = f11;
                i.a aVar5 = aVar2;
                d.a aVar6 = aVar;
                long j11 = j10;
                C4889m mVar3 = mVar;
                C13607l.j(aVar2.b().a(mVar2, C13023e.f110931a), C13679b.C2857b.f.f116688a, (d) null, j11, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262132);
                C13607l.j(x.i(aVar5.a(), dVar), C13679b.C2857b.C2858b.f116684a, (d) null, j11, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262132);
                if (dVar4 != null) {
                    mVar.W(-822888645);
                    C13607l.h(dVar4, C13679b.a.C2856b.f116680a, (d) null, j10, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C15988d<String, C4373q>) null, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 524276);
                    mVar.P();
                } else {
                    C4889m mVar4 = mVar;
                    mVar4.W(-822645729);
                    C13607l.j(J1.j.b(Zg.c.f65263q, mVar4, 0), C13679b.a.C2856b.f116680a, (d) null, j10, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262132);
                    mVar.P();
                }
                d.a aVar7 = aVar6;
                d d10 = J.d(aVar7, 0.0f, 1, (Object) null);
                I h11 = C5077h.h(aVar3.o(), false);
                C4889m mVar5 = mVar;
                int a17 = C4883j.a(mVar5, 0);
                C4912y s12 = mVar.s();
                d e12 = c.e(mVar5, d10);
                C17631a<C4504g> a18 = aVar4.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar5.p(a18);
                } else {
                    mVar.t();
                }
                C4889m a19 = F1.a(mVar);
                F1.c(a19, h11, aVar4.c());
                F1.c(a19, s12, aVar4.e());
                p<C4504g, Integer, C16807N> b13 = aVar4.b();
                if (a19.i() || !C17542s.e(a19.D(), Integer.valueOf(a17))) {
                    a19.u(Integer.valueOf(a17));
                    a19.w(Integer.valueOf(a17), b13);
                }
                F1.c(a19, e12, aVar4.d());
                C5079j jVar = C5079j.f18125a;
                String j12 = x.j(aVar5.a().b());
                C13679b.a.c cVar = C13679b.a.c.f116681a;
                if (aVar5.a().e()) {
                    mVar5.W(-939164956);
                    y02 = C18030v.f147664a.a(mVar5, C18030v.f147665b).L();
                    mVar.P();
                } else {
                    mVar5.W(-939058006);
                    y02 = C18030v.f147664a.a(mVar5, C18030v.f147665b).y0();
                    mVar.P();
                }
                C5079j jVar2 = jVar;
                d.a aVar8 = aVar7;
                C13607l.j(j12, cVar, jVar.a(aVar7, aVar3.d()), y02, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262128);
                mVar.x();
                mVar.x();
                d m10 = D.m(C5842M.e(n10, aVar8, 0.45f, false, 2, (Object) null), h.B((float) 5), 0.0f, h.B(f12), 0.0f, 10, (Object) null);
                I h12 = C5077h.h(aVar3.o(), false);
                C4889m mVar6 = mVar;
                int a20 = C4883j.a(mVar6, 0);
                C4912y s13 = mVar.s();
                d e13 = c.e(mVar6, m10);
                C17631a<C4504g> a21 = aVar4.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar6.p(a21);
                } else {
                    mVar.t();
                }
                C4889m a22 = F1.a(mVar);
                F1.c(a22, h12, aVar4.c());
                F1.c(a22, s13, aVar4.e());
                p<C4504g, Integer, C16807N> b14 = aVar4.b();
                if (a22.i() || !C17542s.e(a22.D(), Integer.valueOf(a20))) {
                    a22.u(Integer.valueOf(a20));
                    a22.w(Integer.valueOf(a20), b14);
                }
                F1.c(a22, e13, aVar4.d());
                C5942c c10 = e.c(Zg.b.f65246a, mVar6, 0);
                mVar6.W(-2104703669);
                C5749w0 a23 = aVar5.a().e() ? C5749w0.f27365b.a(C18030v.f147664a.a(mVar6, C18030v.f147665b).L(), C5712d0.f27280a.z()) : null;
                mVar.P();
                d.a aVar9 = aVar8;
                C5079j jVar3 = jVar2;
                C5583F.a(c10, (String) null, jVar3.a(aVar9, aVar3.h()), aVar3.h(), C4478k.f5915a.c(), 0.0f, a23, mVar, 27696, 32);
                d h13 = J.h(D.m(jVar3.a(aVar9, aVar3.d()), h.B((float) 60), 0.0f, 0.0f, h.B((float) 10), 6, (Object) null), 0.0f, 1, (Object) null);
                I h14 = C5077h.h(aVar3.o(), false);
                int a24 = C4883j.a(mVar6, 0);
                C4912y s14 = mVar.s();
                d e14 = c.e(mVar6, h13);
                C17631a<C4504g> a25 = aVar4.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar6.p(a25);
                } else {
                    mVar.t();
                }
                C4889m a26 = F1.a(mVar);
                F1.c(a26, h14, aVar4.c());
                F1.c(a26, s14, aVar4.e());
                p<C4504g, Integer, C16807N> b15 = aVar4.b();
                if (a26.i() || !C17542s.e(a26.D(), Integer.valueOf(a24))) {
                    a26.u(Integer.valueOf(a24));
                    a26.w(Integer.valueOf(a24), b15);
                }
                F1.c(a26, e14, aVar4.d());
                C5942c c11 = e.c(aVar5.a().e() ? C10027d.f75283n : C10027d.f75285p, mVar6, 0);
                C5437c c12 = aVar3.c();
                mVar6.W(1909434493);
                C5749w0 a27 = aVar5.a().e() ? C5749w0.f27365b.a(C18030v.f147664a.a(mVar6, C18030v.f147665b).x0(), C5712d0.f27280a.z()) : null;
                mVar.P();
                C5583F.a(c11, (String) null, J.v(jVar3.a(aVar9, aVar3.e()), h.B((float) 56), h.B((float) 22)), c12, (C4478k) null, 0.0f, a27, mVar, 3120, 48);
                mVar.x();
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

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f65629a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ix.a[] r0 = ix.C14584a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ix.a r1 = ix.C14584a.EXPIRING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ix.a r1 = ix.C14584a.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ix.a r1 = ix.C14584a.VALID     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f65629a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bh.x.b.<clinit>():void");
        }
    }

    public static final void d(s sVar, i iVar, C11522d dVar, C13131a aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        r.b bVar;
        s sVar2 = sVar;
        i iVar2 = iVar;
        C11522d dVar2 = dVar;
        C13131a aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C17542s.j(sVar2, "giftCardValidator");
        C17542s.j(iVar2, "checkGiftCardBalanceState");
        C17542s.j(dVar2, "currencyConfig");
        C17542s.j(aVar3, "giftCardFormActions");
        C17542s.j(aVar4, "onCheckAnotherCard");
        C4889m k10 = mVar.k(-1417357741);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(sVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(iVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(dVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar3) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(aVar4) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1417357741, i11, -1, "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.GiftCardBalanceScreen (GiftCardBalanceComposables.kt:69)");
            }
            if (iVar2 instanceof i.c) {
                k10.W(284633266);
                i.c cVar = (i.c) iVar2;
                boolean a10 = cVar.a();
                String b10 = J1.j.b(Zg.c.f65260n, k10, 0);
                String b11 = J1.j.b(Zg.c.f65259m, k10, 0);
                String b12 = J1.j.b(Zg.c.f65251e, k10, 0);
                C9742a b13 = cVar.b();
                if (C17542s.e(b13, C9742a.C1275a.f73099a)) {
                    bVar = new r.b(t.f111620c);
                } else if (C17542s.e(b13, C9742a.b.f73100a) || b13 == null) {
                    bVar = null;
                } else {
                    throw new XH.t();
                }
                KC.q.x(sVar, aVar, b10, b11, b12, a10, bVar, k10, (i11 & 14) | ((i11 >> 6) & 112) | (r.b.f111616c << 18));
                k10.P();
            } else if (iVar2 instanceof i.a) {
                k10.W(285678555);
                f(Zg.c.f65260n, (i.a) iVar2, dVar, aVar2, k10, (i11 & 896) | ((i11 >> 3) & 7168));
                k10.P();
            } else if (C17542s.e(iVar2, i.b.f73117a) || C17542s.e(iVar2, i.d.f73120a) || C17542s.e(iVar2, i.e.f73121a)) {
                k10.W(286102294);
                k10.P();
            } else {
                k10.W(1948841976);
                k10.P();
                throw new XH.t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new u(sVar, iVar, dVar, aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(s sVar, i iVar, C11522d dVar, C13131a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        d(sVar, iVar, dVar, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(int r42, gh.i.a r43, kp.C11522d r44, nI.C17631a<XH.C16807N> r45, U0.C4889m r46, int r47) {
        /*
            r1 = r42
            r2 = r43
            r3 = r44
            r4 = r45
            r5 = r47
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "currencyConfig"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "onCheckAnotherCard"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = 1011949418(0x3c511f6a, float:0.012763837)
            r6 = r46
            U0.m r15 = r6.k(r0)
            r14 = 6
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0032
            boolean r6 = r15.d(r1)
            if (r6 == 0) goto L_0x002f
            r6 = 4
            goto L_0x0030
        L_0x002f:
            r6 = 2
        L_0x0030:
            r6 = r6 | r5
            goto L_0x0033
        L_0x0032:
            r6 = r5
        L_0x0033:
            r7 = r5 & 48
            r8 = 16
            if (r7 != 0) goto L_0x0044
            boolean r7 = r15.F(r2)
            if (r7 == 0) goto L_0x0042
            r7 = 32
            goto L_0x0043
        L_0x0042:
            r7 = r8
        L_0x0043:
            r6 = r6 | r7
        L_0x0044:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0054
            boolean r7 = r15.F(r3)
            if (r7 == 0) goto L_0x0051
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0053
        L_0x0051:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0053:
            r6 = r6 | r7
        L_0x0054:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0064
            boolean r7 = r15.F(r4)
            if (r7 == 0) goto L_0x0061
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0063
        L_0x0061:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0063:
            r6 = r6 | r7
        L_0x0064:
            r9 = r6
            r6 = r9 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x0078
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x0072
            goto L_0x0078
        L_0x0072:
            r15.L()
            r0 = r15
            goto L_0x0352
        L_0x0078:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0084
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.GiftCardContent (GiftCardBalanceComposables.kt:117)"
            U0.C4895p.S(r0, r9, r6, r7)
        L_0x0084:
            ix.b r0 = r43.a()
            java.lang.String r0 = r0.f()
            r6 = 1403348235(0x53a5650b, float:1.42072965E12)
            r15.W(r6)
            r7 = 1
            r6 = 0
            if (r0 != 0) goto L_0x0098
            r0 = 0
            goto L_0x00e3
        L_0x0098:
            int r10 = Zg.c.f65249c
            java.lang.String r10 = J1.j.b(r10, r15, r6)
            java.lang.Object[] r11 = new java.lang.Object[]{r0}
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r7)
            java.lang.String r10 = java.lang.String.format(r10, r11)
            java.lang.String r11 = "format(...)"
            kotlin.jvm.internal.C17542s.i(r10, r11)
            N1.G r11 = new N1.G
            r17 = r11
            S1.C$a r18 = S1.C.f13316b
            S1.C r22 = r18.a()
            r38 = 65531(0xfffb, float:9.1828E-41)
            r39 = 0
            r18 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r17.<init>(r18, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r34, r35, r36, r37, r38, r39)
            N1.d r0 = IC.C13021c.e(r10, r0, r11)
        L_0x00e3:
            r15.P()
            androidx.compose.foundation.layout.d r10 = androidx.compose.foundation.layout.C5073d.f18068a
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            androidx.compose.foundation.layout.d$f r8 = r10.n(r8)
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            r10 = 12
            float r12 = (float) r10
            float r7 = c2.h.B(r12)
            r10 = 24
            float r10 = (float) r10
            float r10 = c2.h.B(r10)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.j(r11, r10, r7)
            i1.c$a r10 = i1.C5437c.f24302a
            i1.c$b r10 = r10.k()
            E1.I r8 = androidx.compose.foundation.layout.C5080k.a(r8, r10, r15, r14)
            int r10 = U0.C4883j.a(r15, r6)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r7)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r13 = r19.a()
            U0.f r20 = r15.m()
            if (r20 != 0) goto L_0x012a
            U0.C4883j.c()
        L_0x012a:
            r15.I()
            boolean r20 = r15.i()
            if (r20 == 0) goto L_0x0137
            r15.p(r13)
            goto L_0x013a
        L_0x0137:
            r15.t()
        L_0x013a:
            U0.m r13 = U0.F1.a(r15)
            nI.p r14 = r19.c()
            U0.F1.c(r13, r8, r14)
            nI.p r8 = r19.e()
            U0.F1.c(r13, r6, r8)
            nI.p r6 = r19.b()
            boolean r8 = r13.i()
            if (r8 != 0) goto L_0x0164
            java.lang.Object r8 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r14)
            if (r8 != 0) goto L_0x0172
        L_0x0164:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r13.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r13.w(r8, r6)
        L_0x0172:
            nI.p r6 = r19.d()
            U0.F1.c(r13, r7, r6)
            s0.h r6 = s0.C5862h.f28810a
            r6 = r9 & 14
            java.lang.String r6 = J1.j.b(r1, r15, r6)
            r14 = 0
            TC.b$b$f r7 = TC.C13679b.C2857b.f.f116688a
            r13 = 1
            float r21 = c2.h.B(r12)
            r22 = 7
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r11
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r17, r18, r19, r20, r21, r22, r23)
            r30 = 0
            r31 = 262136(0x3fff8, float:3.67331E-40)
            r17 = 0
            r12 = r9
            r32 = 12
            r9 = r17
            r41 = r11
            r40 = r12
            r11 = r17
            r16 = 0
            r13 = r16
            r33 = 6
            r14 = r16
            r46 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 432(0x1b0, float:6.05E-43)
            r28 = r46
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            O0.q r16 = O0.C4748q.f11441a
            r6 = 8
            float r6 = (float) r6
            float r7 = c2.h.B(r6)
            int r17 = O0.C4748q.f11442b
            int r6 = r17 << 18
            r14 = r6 | 6
            r15 = 62
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r6 = r16
            r13 = r46
            O0.r r18 = r6.c(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            tK.v r6 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            r15 = r46
            tK.h r8 = r6.a(r15, r7)
            long r8 = r8.F0()
            tK.h r6 = r6.a(r15, r7)
            long r10 = r6.x0()
            int r17 = r17 << 12
            r19 = 12
            r12 = 0
            r20 = 0
            r6 = r16
            r7 = r8
            r9 = r10
            r11 = r12
            r13 = r20
            r16 = r17
            r17 = r19
            O0.p r8 = r6.b(r7, r9, r11, r13, r15, r16, r17)
            r6 = 192(0xc0, float:2.69E-43)
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            r15 = r41
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.l(r15, r6)
            r14 = 3
            r12 = 0
            r13 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.C(r6, r13, r12, r14, r13)
            bh.x$a r7 = new bh.x$a
            r7.<init>(r2, r3, r0)
            r0 = 54
            r9 = -1436016302(0xffffffffaa682152, float:-2.06173E-13)
            r11 = r46
            r10 = 1
            c1.a r0 = c1.c.e(r9, r10, r7, r11, r0)
            r16 = 196614(0x30006, float:2.75515E-40)
            r17 = 18
            r7 = 0
            r19 = 0
            r9 = r18
            r10 = r19
            r11 = r0
            r0 = r12
            r12 = r46
            r13 = r16
            r0 = r14
            r14 = r17
            O0.C4751s.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            ix.b r6 = r43.a()
            ix.a r6 = r6.g()
            int[] r7 = bh.x.b.f65629a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            r14 = 1
            if (r6 == r14) goto L_0x02bf
            r7 = 2
            if (r6 == r7) goto L_0x0292
            if (r6 != r0) goto L_0x0281
            r0 = 129059582(0x7b14afe, float:2.6676076E-34)
            r13 = r46
            r13.W(r0)
            r13.P()
            r0 = r13
            r1 = r14
        L_0x027f:
            r6 = 4
            goto L_0x02e6
        L_0x0281:
            r13 = r46
            r0 = -272957265(0xffffffffefbb00af, float:-1.1574905E29)
            r13.W(r0)
            r13.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0292:
            r13 = r46
            r0 = 128700726(0x7abd136, float:2.5852183E-34)
            r13.W(r0)
            int r0 = Zg.c.f65255i
            r6 = 0
            java.lang.String r10 = J1.j.b(r0, r13, r6)
            int r0 = Zg.c.f65254h
            java.lang.String r0 = J1.j.b(r0, r13, r6)
            SC.m r7 = SC.C13611m.NEGATIVE
            r16 = 432(0x1b0, float:6.05E-43)
            r17 = 40
            r8 = 0
            r9 = 0
            r11 = 0
            r6 = r0
            r12 = r13
            r0 = r13
            r13 = r16
            r1 = r14
            r14 = r17
            SC.R0.e(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.P()
            goto L_0x027f
        L_0x02bf:
            r0 = r46
            r1 = r14
            r6 = 128316295(0x7a5f387, float:2.4969573E-34)
            r0.W(r6)
            int r6 = Zg.c.f65253g
            r7 = 0
            java.lang.String r10 = J1.j.b(r6, r0, r7)
            int r6 = Zg.c.f65252f
            java.lang.String r6 = J1.j.b(r6, r0, r7)
            SC.m r7 = SC.C13611m.WARNING
            r13 = 432(0x1b0, float:6.05E-43)
            r14 = 40
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = r0
            SC.R0.e(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.P()
            goto L_0x027f
        L_0x02e6:
            float r6 = (float) r6
            float r19 = c2.h.B(r6)
            r22 = 13
            r23 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r17 = r15
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r17, r18, r19, r20, r21, r22, r23)
            r7 = 0
            r8 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r6, r7, r1, r8)
            SC.N r9 = SC.N.Secondary
            SC.M r10 = SC.M.Medium
            int r6 = Zg.c.f65250d
            r8 = 0
            java.lang.String r6 = J1.j.b(r6, r0, r8)
            r11 = -272925136(0xffffffffefbb7e30, float:-1.160525E29)
            r0.W(r11)
            r11 = r40
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r12 = 2048(0x800, float:2.87E-42)
            if (r11 != r12) goto L_0x031b
            goto L_0x031c
        L_0x031b:
            r1 = r8
        L_0x031c:
            java.lang.Object r8 = r0.D()
            if (r1 != 0) goto L_0x032a
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r8 != r1) goto L_0x0332
        L_0x032a:
            bh.v r8 = new bh.v
            r8.<init>(r4)
            r0.u(r8)
        L_0x0332:
            r15 = r8
            nI.a r15 = (nI.C17631a) r15
            r0.P()
            r17 = 27696(0x6c30, float:3.881E-41)
            r18 = 484(0x1e4, float:6.78E-43)
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = r0
            SC.L.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0352
            U0.C4895p.R()
        L_0x0352:
            U0.Y0 r6 = r0.n()
            if (r6 == 0) goto L_0x036b
            bh.w r7 = new bh.w
            r0 = r7
            r1 = r42
            r2 = r43
            r3 = r44
            r4 = r45
            r5 = r47
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x036b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.x.f(int, gh.i$a, kp.d, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(int i10, i.a aVar, C11522d dVar, C17631a aVar2, int i11, C4889m mVar, int i12) {
        f(i10, aVar, dVar, aVar2, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    public static final String i(ix.b bVar, C11522d dVar) {
        C17542s.j(bVar, "<this>");
        C17542s.j(dVar, "currencyConfig");
        if (C17542s.e(dVar.b(), bVar.d())) {
            return qx.d.f(qx.d.c(dVar), dVar.o(), qx.d.a(bVar.a(), dVar));
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        C17542s.i(currencyInstance, "getCurrencyInstance(...)");
        currencyInstance.setMaximumFractionDigits(2);
        currencyInstance.setCurrency(Currency.getInstance(bVar.d()));
        String format = currencyInstance.format(bVar.a());
        C17542s.g(format);
        return format;
    }

    public static final String j(String str) {
        C17542s.j(str, "<this>");
        int length = C15854t.z1(str).toString().length();
        String str2 = "";
        for (int i10 = 0; i10 < length; i10++) {
            str2 = str2 + C15854t.z1(str).toString().charAt(i10);
            if (i10 % 4 == 3) {
                str2 = str2 + " ";
            }
        }
        return str2;
    }
}
