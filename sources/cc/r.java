package cC;

import E1.I;
import G1.C4504g;
import IC.C13023e;
import KJ.C15985a;
import KJ.C15987c;
import L1.o;
import L1.x;
import N1.P;
import O0.C4762x0;
import O0.O;
import O0.V;
import O0.e1;
import O0.g1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SB.C13561a;
import SC.C13607l;
import SC.C13643u0;
import TC.C13679b;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import Y1.j;
import Y1.k;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.m;
import androidx.compose.ui.d;
import bC.C14001b;
import c2.h;
import eC.C14379b;
import i1.C5437c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.C5534c;
import m0.C5546i;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import ol.u;
import p0.s;
import p1.C5747v0;
import p1.i1;
import s0.C5834E;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5848T;
import s0.C5862h;
import tK.C18030v;
import uK.C18146a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0016\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u001b\u001a\u00020\u00032\u001c\u0010\u001a\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00180\u00102\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001b\u0010\u0017\u001a'\u0010\u001d\u001a\u00020\u00032\u0016\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010!\u001a\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b!\u0010\u0017\u001a!\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b#\u0010$\u001a7\u0010(\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b(\u0010)\u001a#\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\u00182\u0006\u0010+\u001a\u00020*H\u0003¢\u0006\u0004\b.\u0010/\u001a!\u00100\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b0\u00101¨\u00064²\u0006\u000e\u0010&\u001a\u00020%8\n@\nX\u0002²\u0006\u000e\u0010&\u001a\u00020%8\n@\nX\u0002²\u0006\u000e\u0010&\u001a\u00020%8\n@\nX\u0002²\u0006\f\u00103\u001a\u0002028\nX\u0002"}, d2 = {"LbC/b;", "state", "Lkotlin/Function0;", "LXH/N;", "onBackClicked", "onPopularTimesClicked", "V", "(LbC/b;LnI/a;LnI/a;LU0/m;I)V", "LbC/b$d;", "hours", "Landroidx/compose/ui/d;", "modifier", "X", "(LbC/b$d;Landroidx/compose/ui/d;LU0/m;II)V", "", "dayLabel", "LKJ/c;", "timeLabels", "S", "(Ljava/lang/String;LKJ/c;Landroidx/compose/ui/d;LU0/m;II)V", "LbC/b$b;", "deviationHours", "B", "(LKJ/c;Landroidx/compose/ui/d;LU0/m;II)V", "LXH/v;", "LIC/e;", "extras", "K", "extra", "P", "(LXH/v;LU0/m;I)V", "LbC/b$a;", "amenitiesHours", "r", "amenityHours", "x", "(LbC/b$a;Landroidx/compose/ui/d;LU0/m;II)V", "", "isExpanded", "onClick", "z", "(ZLnI/a;LbC/b$a;Landroidx/compose/ui/d;LU0/m;II)V", "LbC/b$c;", "openStatus", "Lp1/v0;", "", "f0", "(LbC/b$c;LU0/m;I)LXH/v;", "H", "(ZLandroidx/compose/ui/d;LU0/m;II)V", "", "iconRotationValue", "storedetails-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14001b.a f119110a;

        a(C14001b.a aVar) {
            this.f119110a = aVar;
        }

        public final void a(l0.e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(-1937428607, i10, -1, "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.AmenitiesOpeningHours.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StoreDetailsOpeningHoursScreen.kt:331)");
            }
            r.x(this.f119110a, D.m(TC.e.i(androidx.compose.ui.d.f18749a), 0.0f, 0.0f, 0.0f, h.B((float) 32), 7, (Object) null), mVar, 0, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<C14001b.C2970b> f119111a;

        b(C15987c<C14001b.C2970b> cVar) {
            this.f119111a = cVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(x xVar) {
            C17542s.j(xVar, "$this$semantics");
            return C16807N.f139792a;
        }

        public final void b(l0.e eVar, C4889m mVar, int i10) {
            C18030v vVar;
            int i11;
            int i12;
            long G02;
            String G03;
            C4889m mVar2 = mVar;
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(-1086204249, i10, -1, "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.DeviationAndClosedDays.<anonymous>.<anonymous> (StoreDetailsOpeningHoursScreen.kt:191)");
            }
            C5073d.f n10 = C5073d.f18068a.n(h.B((float) 16));
            androidx.compose.ui.d i13 = TC.e.i(androidx.compose.ui.d.f18749a);
            C15987c<C14001b.C2970b> cVar = this.f119111a;
            I a10 = C5080k.a(n10, C5437c.f24302a.k(), mVar2, 6);
            int i14 = 0;
            int a11 = C4883j.a(mVar2, 0);
            C4912y s10 = mVar.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, i13);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar.a();
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
            F1.c(a13, a10, aVar.c());
            F1.c(a13, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar.d());
            C5862h hVar = C5862h.f28810a;
            mVar2.W(-600395370);
            for (C14001b.C2970b bVar : cVar) {
                d.a aVar2 = androidx.compose.ui.d.f18749a;
                mVar2.W(1504987719);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new s();
                    mVar2.u(D10);
                }
                mVar.P();
                androidx.compose.ui.d c10 = o.c(aVar2, true, (C17642l) D10);
                C5073d dVar = C5073d.f18068a;
                C5073d.e f10 = dVar.f();
                C5437c.a aVar3 = C5437c.f24302a;
                I b11 = G.b(f10, aVar3.l(), mVar2, i14);
                int a14 = C4883j.a(mVar2, i14);
                C4912y s11 = mVar.s();
                androidx.compose.ui.d e11 = androidx.compose.ui.c.e(mVar2, c10);
                C4504g.a aVar4 = C4504g.f6515W;
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
                androidx.compose.ui.d e12 = C5842M.e(C5843N.f28726a, aVar2, 1.0f, false, 2, (Object) null);
                I a17 = C5080k.a(dVar.g(), aVar3.k(), mVar2, i14);
                int a18 = C4883j.a(mVar2, i14);
                C4912y s12 = mVar.s();
                androidx.compose.ui.d e13 = androidx.compose.ui.c.e(mVar2, e12);
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
                C5862h hVar2 = C5862h.f28810a;
                String a21 = bVar.a().a(mVar2, C13023e.f110931a);
                C13679b.a.C2856b bVar2 = C13679b.a.C2856b.f116680a;
                C18030v vVar2 = C18030v.f147664a;
                int i15 = C18030v.f147665b;
                int i16 = i15;
                C18030v vVar3 = vVar2;
                C13607l.j(a21, bVar2, (androidx.compose.ui.d) null, vVar2.a(mVar2, i15).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262132);
                String c11 = bVar.c();
                C4889m mVar3 = mVar;
                mVar3.W(-960164245);
                if (c11 == null) {
                    i11 = i16;
                    vVar = vVar3;
                } else {
                    int i17 = i16;
                    C18030v vVar4 = vVar3;
                    i11 = i17;
                    vVar = vVar4;
                    C13607l.j(c11, bVar2, (androidx.compose.ui.d) null, vVar4.a(mVar3, i17).I0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262132);
                    C16807N n11 = C16807N.f139792a;
                }
                mVar.P();
                mVar.x();
                if (bVar.b().isEmpty()) {
                    C4889m mVar4 = mVar;
                    mVar4.W(2089361959);
                    G02 = vVar.a(mVar4, i11).v0();
                    i12 = 0;
                    G03 = J1.j.b(C13561a.f115643f, mVar4, 0);
                    mVar.P();
                } else {
                    C4889m mVar5 = mVar;
                    i12 = 0;
                    mVar5.W(2089645857);
                    G02 = vVar.a(mVar5, i11).G0();
                    C15987c<C13023e> b14 = bVar.b();
                    ArrayList arrayList = new ArrayList(C16877v.y(b14, 10));
                    for (C13023e a22 : b14) {
                        arrayList.add(a22.a(mVar5, C13023e.f110931a));
                    }
                    G03 = C16877v.G0(arrayList, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
                    mVar.P();
                }
                long j10 = G02;
                C13607l.j(G03, C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, j10, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262132);
                mVar.x();
                mVar2 = mVar;
                i14 = i12;
            }
            mVar.P();
            mVar.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<v<C13023e, C13023e>> f119112a;

        c(C15987c<? extends v<? extends C13023e, ? extends C13023e>> cVar) {
            this.f119112a = cVar;
        }

        public final void a(l0.e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(1903938114, i10, -1, "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.ExtraInfo.<anonymous>.<anonymous> (StoreDetailsOpeningHoursScreen.kt:269)");
            }
            androidx.compose.ui.d i11 = TC.e.i(androidx.compose.ui.d.f18749a);
            C5073d.f n10 = C5073d.f18068a.n(h.B((float) 8));
            C15987c<v<C13023e, C13023e>> cVar = this.f119112a;
            I a10 = C5080k.a(n10, C5437c.f24302a.k(), mVar, 6);
            int a11 = C4883j.a(mVar, 0);
            C4912y s10 = mVar.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, i11);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar.a();
            if (mVar.m() == null) {
                C4883j.c();
            }
            mVar.I();
            if (mVar.i()) {
                mVar.p(a12);
            } else {
                mVar.t();
            }
            C4889m a13 = F1.a(mVar);
            F1.c(a13, a10, aVar.c());
            F1.c(a13, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar.d());
            C5862h hVar = C5862h.f28810a;
            mVar.W(848934628);
            for (v d02 : cVar) {
                r.P(d02, mVar, C13023e.f110931a);
            }
            mVar.P();
            mVar.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f119113a;

        d(C17631a<C16807N> aVar) {
            this.f119113a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1971291452, i11, -1, "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.StoreDetailsOpeningHoursScreen.<anonymous> (StoreDetailsOpeningHoursScreen.kt:71)");
                }
                C17631a<C16807N> aVar = this.f119113a;
                d.a aVar2 = androidx.compose.ui.d.f18749a;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar, 0);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, aVar2);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar3.c());
                F1.c(a13, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b10 = aVar3.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar3.d());
                C5862h hVar = C5862h.f28810a;
                ol.p.c(ol.v.BACK, aVar, (androidx.compose.ui.d) null, (String) null, (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, mVar, 6, 508);
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
    static final class e implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14001b f119114a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f119115b;

        e(C14001b bVar, C17631a<C16807N> aVar) {
            this.f119114a = bVar;
            this.f119115b = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-195760095, i10, -1, "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.StoreDetailsOpeningHoursScreen.<anonymous> (StoreDetailsOpeningHoursScreen.kt:79)");
                }
                C14379b.b(this.f119114a.e(), (androidx.compose.ui.d) null, this.f119115b, mVar, 0, 2);
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
    static final class f implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14001b f119116a;

        f(C14001b bVar) {
            this.f119116a = bVar;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            int i11;
            d.a aVar;
            int i12;
            C5834E e11 = e10;
            C4889m mVar2 = mVar;
            C17542s.j(e11, "contentPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(e11) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1250458713, i11, -1, "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.StoreDetailsOpeningHoursScreen.<anonymous> (StoreDetailsOpeningHoursScreen.kt:86)");
                }
                d.a aVar2 = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d h10 = D.h(m.f(aVar2, m.c(0, mVar2, 0, 1), false, (s) null, false, 14, (Object) null), e11);
                C14001b bVar = this.f119116a;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e12 = androidx.compose.ui.c.e(mVar2, h10);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar3.a();
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
                F1.c(a13, a10, aVar3.c());
                F1.c(a13, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b10 = aVar3.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e12, aVar3.d());
                C5862h hVar = C5862h.f28810a;
                C14001b.d d10 = bVar.d();
                mVar2.W(1402247296);
                if (d10 == null) {
                    i12 = 1;
                    aVar = aVar2;
                } else {
                    C14001b.d d11 = bVar.d();
                    int i13 = C13023e.f110931a;
                    r.X(d11, (androidx.compose.ui.d) null, mVar2, i13, 2);
                    mVar2.W(1402249807);
                    if (!bVar.d().a().isEmpty()) {
                        i12 = 1;
                        aVar = aVar2;
                        C13643u0.c(TC.e.i(aVar2), 0.0f, 0, mVar, 0, 6);
                        r.B(bVar.d().a(), (androidx.compose.ui.d) null, mVar2, i13, 2);
                    } else {
                        i12 = 1;
                        aVar = aVar2;
                    }
                    mVar.P();
                    mVar2.W(1402258442);
                    if (!bVar.d().b().isEmpty()) {
                        C13643u0.c(TC.e.i(aVar), 0.0f, 0, mVar, 0, 6);
                        r.K(bVar.d().b(), (androidx.compose.ui.d) null, mVar2, i13, 2);
                    }
                    mVar.P();
                }
                mVar.P();
                mVar2.W(1402266404);
                if (!bVar.c().isEmpty()) {
                    C5844O.a(androidx.compose.foundation.b.d(J.i(J.h(aVar, 0.0f, i12, (Object) null), h.B((float) 12)), C18030v.f147664a.a(mVar2, C18030v.f147665b).l0(), (i1) null, 2, (Object) null), mVar2, 0);
                    r.r(bVar.c(), (androidx.compose.ui.d) null, mVar2, 0, 2);
                }
                mVar.P();
                C5844O.a(J.i(aVar, h.B((float) 80)), mVar2, 6);
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
            a((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14001b.d f119117a;

        g(C14001b.d dVar) {
            this.f119117a = dVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(89776992, i10, -1, "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.StoreOpeningHours.<anonymous> (StoreDetailsOpeningHoursScreen.kt:125)");
                }
                float f10 = (float) 16;
                androidx.compose.ui.d k10 = D.k(androidx.compose.ui.d.f18749a, 0.0f, h.B(f10), 1, (Object) null);
                C5073d.f n10 = C5073d.f18068a.n(h.B(f10));
                C14001b.d dVar = this.f119117a;
                I a10 = C5080k.a(n10, C5437c.f24302a.k(), mVar, 6);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, k10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar.c());
                F1.c(a13, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar.d());
                C5862h hVar = C5862h.f28810a;
                mVar.W(-890578789);
                for (v vVar : dVar.c()) {
                    String a14 = ((C13023e) vVar.c()).a(mVar, C13023e.f110931a);
                    mVar.W(-890573764);
                    Iterable<C13023e> iterable = (Iterable) vVar.d();
                    ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                    for (C13023e a15 : iterable) {
                        arrayList.add(a15.a(mVar, C13023e.f110931a));
                    }
                    mVar.P();
                    r.S(a14, C15985a.h(arrayList), (androidx.compose.ui.d) null, mVar, 0, 4);
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
    public static final C16807N A(boolean z10, C17631a aVar, C14001b.a aVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        z(z10, aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: androidx.compose.ui.d$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void B(KJ.C15987c<bC.C14001b.C2970b> r37, androidx.compose.ui.d r38, U0.C4889m r39, int r40, int r41) {
        /*
            r0 = r37
            r1 = r40
            r2 = r41
            r3 = 312905433(0x12a68ed9, float:1.05112875E-27)
            r4 = r39
            U0.m r14 = r4.k(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r1 | 6
            goto L_0x002f
        L_0x0016:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x002e
            r4 = r1 & 8
            if (r4 != 0) goto L_0x0023
            boolean r4 = r14.V(r0)
            goto L_0x0027
        L_0x0023:
            boolean r4 = r14.F(r0)
        L_0x0027:
            if (r4 == 0) goto L_0x002b
            r4 = 4
            goto L_0x002c
        L_0x002b:
            r4 = 2
        L_0x002c:
            r4 = r4 | r1
            goto L_0x002f
        L_0x002e:
            r4 = r1
        L_0x002f:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x0038
            r4 = r4 | 48
        L_0x0035:
            r6 = r38
            goto L_0x004a
        L_0x0038:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x0035
            r6 = r38
            boolean r7 = r14.V(r6)
            if (r7 == 0) goto L_0x0047
            r7 = 32
            goto L_0x0049
        L_0x0047:
            r7 = 16
        L_0x0049:
            r4 = r4 | r7
        L_0x004a:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L_0x005d
            boolean r7 = r14.l()
            if (r7 != 0) goto L_0x0057
            goto L_0x005d
        L_0x0057:
            r14.L()
            r0 = r14
            goto L_0x02a7
        L_0x005d:
            if (r5 == 0) goto L_0x0063
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r13 = r5
            goto L_0x0064
        L_0x0063:
            r13 = r6
        L_0x0064:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0070
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.DeviationAndClosedDays (StoreDetailsOpeningHoursScreen.kt:163)"
            U0.C4895p.S(r3, r4, r5, r6)
        L_0x0070:
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = -486331104(0xffffffffe3032d20, float:-2.419775E21)
            r14.W(r5)
            java.lang.Object r5 = r14.D()
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r6 = r12.a()
            if (r5 != r6) goto L_0x008d
            cC.m r5 = new cC.m
            r5.<init>()
            r14.u(r5)
        L_0x008d:
            r7 = r5
            nI.a r7 = (nI.C17631a) r7
            r14.P()
            r9 = 3072(0xc00, float:4.305E-42)
            r10 = 6
            r5 = 0
            r6 = 0
            r8 = r14
            java.lang.Object r4 = f1.C5301c.e(r4, r5, r6, r7, r8, r9, r10)
            r9 = r4
            U0.r0 r9 = (U0.C4899r0) r9
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r4.g()
            i1.c$a r30 = i1.C5437c.f24302a
            i1.c$b r6 = r30.k()
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r14, r3)
            int r6 = U0.C4883j.a(r14, r3)
            U0.y r7 = r14.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r14, r13)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r15 = r10.a()
            U0.f r16 = r14.m()
            if (r16 != 0) goto L_0x00cb
            U0.C4883j.c()
        L_0x00cb:
            r14.I()
            boolean r16 = r14.i()
            if (r16 == 0) goto L_0x00d8
            r14.p(r15)
            goto L_0x00db
        L_0x00d8:
            r14.t()
        L_0x00db:
            U0.m r15 = U0.F1.a(r14)
            nI.p r11 = r10.c()
            U0.F1.c(r15, r5, r11)
            nI.p r5 = r10.e()
            U0.F1.c(r15, r7, r5)
            nI.p r5 = r10.b()
            boolean r7 = r15.i()
            if (r7 != 0) goto L_0x0105
            java.lang.Object r7 = r15.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x0113
        L_0x0105:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r15.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r15.w(r6, r5)
        L_0x0113:
            nI.p r5 = r10.d()
            U0.F1.c(r15, r8, r5)
            s0.h r31 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
            r5 = -2048669183(0xffffffff85e3ca01, float:-2.1421182E-35)
            r14.W(r5)
            boolean r5 = F(r9)
            if (r5 == 0) goto L_0x012d
            int r5 = Oo.b.f84742p
            goto L_0x012f
        L_0x012d:
            int r5 = Oo.b.f84731o
        L_0x012f:
            java.lang.String r19 = J1.j.b(r5, r14, r3)
            r14.P()
            r5 = -2048678045(0xffffffff85e3a763, float:-2.1408466E-35)
            r14.W(r5)
            boolean r5 = r14.V(r9)
            java.lang.Object r6 = r14.D()
            if (r5 != 0) goto L_0x014c
            java.lang.Object r5 = r12.a()
            if (r6 != r5) goto L_0x0154
        L_0x014c:
            cC.n r6 = new cC.n
            r6.<init>(r9)
            r14.u(r6)
        L_0x0154:
            r21 = r6
            nI.a r21 = (nI.C17631a) r21
            r14.P()
            r22 = 5
            r23 = 0
            r18 = 0
            r20 = 0
            r17 = r15
            androidx.compose.ui.d r5 = androidx.compose.foundation.d.d(r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.d r5 = TC.e.i(r5)
            r6 = 32
            float r12 = (float) r6
            float r6 = c2.h.B(r12)
            r7 = 0
            r8 = 0
            r11 = 1
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.k(r5, r8, r6, r11, r7)
            androidx.compose.foundation.layout.d$e r4 = r4.f()
            i1.c$c r6 = r30.l()
            E1.I r4 = androidx.compose.foundation.layout.G.b(r4, r6, r14, r3)
            int r6 = U0.C4883j.a(r14, r3)
            U0.y r7 = r14.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r14, r5)
            nI.a r8 = r10.a()
            U0.f r16 = r14.m()
            if (r16 != 0) goto L_0x01a0
            U0.C4883j.c()
        L_0x01a0:
            r14.I()
            boolean r16 = r14.i()
            if (r16 == 0) goto L_0x01ad
            r14.p(r8)
            goto L_0x01b0
        L_0x01ad:
            r14.t()
        L_0x01b0:
            U0.m r8 = U0.F1.a(r14)
            nI.p r11 = r10.c()
            U0.F1.c(r8, r4, r11)
            nI.p r4 = r10.e()
            U0.F1.c(r8, r7, r4)
            nI.p r4 = r10.b()
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x01da
            java.lang.Object r7 = r8.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x01e8
        L_0x01da:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.w(r6, r4)
        L_0x01e8:
            nI.p r4 = r10.d()
            U0.F1.c(r8, r5, r4)
            s0.N r11 = s0.C5843N.f28726a
            int r4 = TB.C13677a.f116668i
            java.lang.String r4 = J1.j.b(r4, r14, r3)
            TC.b$b$f r5 = TC.C13679b.C2857b.f.f116688a
            r21 = 2
            r22 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r17 = r11
            r18 = r15
            androidx.compose.ui.d r6 = s0.C5842M.e(r17, r18, r19, r20, r21, r22)
            r28 = 0
            r29 = 262136(0x3fff8, float:3.67331E-40)
            r7 = 0
            r16 = 0
            r32 = r9
            r9 = r16
            r16 = 0
            r3 = r11
            r11 = r16
            r33 = r12
            r12 = r16
            r34 = r13
            r13 = r16
            r16 = 0
            r35 = r14
            r36 = r15
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
            r26 = r35
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r4 = 16
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            r14 = r36
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.y(r14, r4)
            r15 = 6
            r13 = r35
            s0.C5844O.a(r4, r13, r15)
            boolean r4 = F(r32)
            i1.c$c r5 = r30.i()
            androidx.compose.ui.d r3 = r3.c(r14, r5)
            r5 = 0
            H(r4, r3, r13, r5, r5)
            r13.x()
            boolean r5 = F(r32)
            cC.r$b r3 = new cC.r$b
            r3.<init>(r0)
            r4 = 54
            r6 = -1086204249(0xffffffffbf41d6a7, float:-0.7571816)
            r7 = 1
            c1.a r10 = c1.c.e(r6, r7, r3, r13, r4)
            r12 = 1572870(0x180006, float:2.20406E-39)
            r3 = 30
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r31
            r11 = r13
            r0 = r13
            r13 = r3
            l0.d.e(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            float r3 = c2.h.B(r33)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r14, r3)
            s0.C5844O.a(r3, r0, r15)
            r0.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x02a5
            U0.C4895p.R()
        L_0x02a5:
            r6 = r34
        L_0x02a7:
            U0.Y0 r0 = r0.n()
            if (r0 == 0) goto L_0x02b7
            cC.o r3 = new cC.o
            r4 = r37
            r3.<init>(r4, r6, r1, r2)
            r0.a(r3)
        L_0x02b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cC.r.B(KJ.c, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N C(C4899r0 r0Var) {
        G(r0Var, !F(r0Var));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C15987c cVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        B(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 E() {
        return u1.e(Boolean.TRUE, (o1) null, 2, (Object) null);
    }

    private static final boolean F(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void G(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final void H(boolean z10, androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(233414000);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.b(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(233414000, i12, -1, "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.ExpandedIndicator (StoreDetailsOpeningHoursScreen.kt:466)");
            }
            C4889m mVar2 = k10;
            V.a(J1.e.c(C18146a.f148021E1, k10, 0), (String) null, m1.k.a(J.t(dVar, h.B((float) 24)), I(C5534c.d(z10 ? 180.0f : 0.0f, (C5546i<Float>) null, 0.0f, "expand icon rotation", (C17642l<? super Float, C16807N>) null, mVar2, 3072, 22))), C18030v.f147664a.a(k10, C18030v.f147665b).I0(), mVar2, 48, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C14027d(z10, dVar, i10, i11));
        }
    }

    private static final float I(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N J(boolean z10, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        H(z10, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void K(KJ.C15987c<? extends XH.v<? extends IC.C13023e, ? extends IC.C13023e>> r36, androidx.compose.ui.d r37, U0.C4889m r38, int r39, int r40) {
        /*
            r0 = r36
            r1 = r39
            r2 = r40
            r3 = 1284876496(0x4c95a8d0, float:7.846464E7)
            r4 = r38
            U0.m r14 = r4.k(r3)
            r4 = r2 & 1
            r5 = 2
            if (r4 == 0) goto L_0x0017
            r4 = r1 | 6
            goto L_0x0030
        L_0x0017:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x002f
            r4 = r1 & 8
            if (r4 != 0) goto L_0x0024
            boolean r4 = r14.V(r0)
            goto L_0x0028
        L_0x0024:
            boolean r4 = r14.F(r0)
        L_0x0028:
            if (r4 == 0) goto L_0x002c
            r4 = 4
            goto L_0x002d
        L_0x002c:
            r4 = r5
        L_0x002d:
            r4 = r4 | r1
            goto L_0x0030
        L_0x002f:
            r4 = r1
        L_0x0030:
            r6 = r2 & 2
            r7 = 32
            if (r6 == 0) goto L_0x003b
            r4 = r4 | 48
        L_0x0038:
            r8 = r37
            goto L_0x004c
        L_0x003b:
            r8 = r1 & 48
            if (r8 != 0) goto L_0x0038
            r8 = r37
            boolean r9 = r14.V(r8)
            if (r9 == 0) goto L_0x0049
            r9 = r7
            goto L_0x004b
        L_0x0049:
            r9 = 16
        L_0x004b:
            r4 = r4 | r9
        L_0x004c:
            r9 = r4 & 19
            r10 = 18
            if (r9 != r10) goto L_0x005f
            boolean r9 = r14.l()
            if (r9 != 0) goto L_0x0059
            goto L_0x005f
        L_0x0059:
            r14.L()
            r0 = r14
            goto L_0x0294
        L_0x005f:
            if (r6 == 0) goto L_0x0065
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r13 = r6
            goto L_0x0066
        L_0x0065:
            r13 = r8
        L_0x0066:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0072
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.ExtraInfo (StoreDetailsOpeningHoursScreen.kt:241)"
            U0.C4895p.S(r3, r4, r6, r8)
        L_0x0072:
            r3 = 1261072689(0x4b2a7131, float:1.1170097E7)
            r14.W(r3)
            java.lang.Object r3 = r14.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r6 = r4.a()
            r8 = 0
            if (r3 != r6) goto L_0x008e
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            U0.r0 r3 = U0.u1.e(r3, r8, r5, r8)
            r14.u(r3)
        L_0x008e:
            U0.r0 r3 = (U0.C4899r0) r3
            r14.P()
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r5.g()
            i1.c$a r30 = i1.C5437c.f24302a
            i1.c$b r9 = r30.k()
            r12 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r9, r14, r12)
            int r9 = U0.C4883j.a(r14, r12)
            U0.y r10 = r14.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r14, r13)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r15 = r16.a()
            U0.f r17 = r14.m()
            if (r17 != 0) goto L_0x00bf
            U0.C4883j.c()
        L_0x00bf:
            r14.I()
            boolean r17 = r14.i()
            if (r17 == 0) goto L_0x00cc
            r14.p(r15)
            goto L_0x00cf
        L_0x00cc:
            r14.t()
        L_0x00cf:
            U0.m r15 = U0.F1.a(r14)
            nI.p r8 = r16.c()
            U0.F1.c(r15, r6, r8)
            nI.p r6 = r16.e()
            U0.F1.c(r15, r10, r6)
            nI.p r6 = r16.b()
            boolean r8 = r15.i()
            if (r8 != 0) goto L_0x00f9
            java.lang.Object r8 = r15.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x0107
        L_0x00f9:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r15.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r15.w(r8, r6)
        L_0x0107:
            nI.p r6 = r16.d()
            U0.F1.c(r15, r11, r6)
            s0.h r31 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
            r6 = 1515666632(0x5a573cc8, float:1.51459874E16)
            r14.W(r6)
            boolean r6 = L(r3)
            if (r6 == 0) goto L_0x0121
            int r6 = Oo.b.f84742p
            goto L_0x0123
        L_0x0121:
            int r6 = Oo.b.f84731o
        L_0x0123:
            java.lang.String r19 = J1.j.b(r6, r14, r12)
            r14.P()
            r6 = 1515657770(0x5a571a2a, float:1.51364719E16)
            r14.W(r6)
            java.lang.Object r6 = r14.D()
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x0142
            cC.p r6 = new cC.p
            r6.<init>(r3)
            r14.u(r6)
        L_0x0142:
            r21 = r6
            nI.a r21 = (nI.C17631a) r21
            r14.P()
            r22 = 5
            r23 = 0
            r18 = 0
            r20 = 0
            r17 = r15
            androidx.compose.ui.d r4 = androidx.compose.foundation.d.d(r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.d r4 = TC.e.i(r4)
            float r11 = (float) r7
            float r6 = c2.h.B(r11)
            r7 = 0
            r9 = 1
            r8 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.k(r4, r7, r6, r9, r8)
            androidx.compose.foundation.layout.d$e r5 = r5.f()
            i1.c$c r6 = r30.l()
            E1.I r5 = androidx.compose.foundation.layout.G.b(r5, r6, r14, r12)
            int r6 = U0.C4883j.a(r14, r12)
            U0.y r7 = r14.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r14, r4)
            nI.a r8 = r16.a()
            U0.f r10 = r14.m()
            if (r10 != 0) goto L_0x018c
            U0.C4883j.c()
        L_0x018c:
            r14.I()
            boolean r10 = r14.i()
            if (r10 == 0) goto L_0x0199
            r14.p(r8)
            goto L_0x019c
        L_0x0199:
            r14.t()
        L_0x019c:
            U0.m r8 = U0.F1.a(r14)
            nI.p r10 = r16.c()
            U0.F1.c(r8, r5, r10)
            nI.p r5 = r16.e()
            U0.F1.c(r8, r7, r5)
            nI.p r5 = r16.b()
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x01c6
            java.lang.Object r7 = r8.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x01d4
        L_0x01c6:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.w(r6, r5)
        L_0x01d4:
            nI.p r5 = r16.d()
            U0.F1.c(r8, r4, r5)
            s0.N r10 = s0.C5843N.f28726a
            int r4 = TB.C13677a.f116669j
            java.lang.String r4 = J1.j.b(r4, r14, r12)
            TC.b$b$f r5 = TC.C13679b.C2857b.f.f116688a
            r21 = 2
            r22 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r17 = r10
            r18 = r15
            androidx.compose.ui.d r6 = s0.C5842M.e(r17, r18, r19, r20, r21, r22)
            r28 = 0
            r29 = 262136(0x3fff8, float:3.67331E-40)
            r7 = 0
            r16 = 0
            r32 = r10
            r9 = r16
            r16 = 0
            r33 = r11
            r11 = r16
            r12 = r16
            r34 = r13
            r13 = r16
            r16 = 0
            r37 = r14
            r35 = r15
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
            r26 = r37
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r4 = 16
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            r14 = r35
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.y(r14, r4)
            r15 = 6
            r13 = r37
            s0.C5844O.a(r4, r13, r15)
            boolean r4 = L(r3)
            i1.c$c r5 = r30.i()
            r6 = r32
            androidx.compose.ui.d r5 = r6.c(r14, r5)
            r6 = 0
            H(r4, r5, r13, r6, r6)
            r13.x()
            boolean r5 = L(r3)
            cC.r$c r3 = new cC.r$c
            r3.<init>(r0)
            r4 = 54
            r6 = 1903938114(0x717bca42, float:1.246804E30)
            r7 = 1
            c1.a r10 = c1.c.e(r6, r7, r3, r13, r4)
            r12 = 1572870(0x180006, float:2.20406E-39)
            r3 = 30
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r31
            r11 = r13
            r0 = r13
            r13 = r3
            l0.d.e(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            float r3 = c2.h.B(r33)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r14, r3)
            s0.C5844O.a(r3, r0, r15)
            r0.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0292
            U0.C4895p.R()
        L_0x0292:
            r8 = r34
        L_0x0294:
            U0.Y0 r0 = r0.n()
            if (r0 == 0) goto L_0x02a4
            cC.q r3 = new cC.q
            r4 = r36
            r3.<init>(r4, r8, r1, r2)
            r0.a(r3)
        L_0x02a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cC.r.K(KJ.c, androidx.compose.ui.d, U0.m, int, int):void");
    }

    private static final boolean L(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void M(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C4899r0 r0Var) {
        M(r0Var, !L(r0Var));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C15987c cVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        K(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void P(v<? extends C13023e, ? extends C13023e> vVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        v<? extends C13023e, ? extends C13023e> vVar2 = vVar;
        int i12 = i10;
        C4889m k10 = mVar.k(2119172860);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(vVar2) : k10.F(vVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2119172860, i11, -1, "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.ExtraTitleAndDescription (StoreDetailsOpeningHoursScreen.kt:283)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d h10 = J.h(aVar, 0.0f, 1, (Object) null);
            k10.W(-2013162273);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new C14028e();
                k10.u(D10);
            }
            k10.P();
            androidx.compose.ui.d c10 = o.c(h10, true, (C17642l) D10);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, c10);
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
            C13023e eVar = (C13023e) vVar.c();
            k10.W(-1442119167);
            if (eVar != null) {
                C4889m mVar3 = k10;
                C13607l.i(eVar, C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, C18030v.f147664a.a(k10, C18030v.f147665b).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, C13023e.f110931a | 48, 0, 262132);
                k10 = mVar3;
                C5844O.a(J.i(aVar, h.B((float) 4)), k10, 6);
            }
            k10.P();
            C13023e eVar2 = (C13023e) vVar.d();
            k10.W(-1442111124);
            if (eVar2 == null) {
                mVar2 = k10;
            } else {
                mVar2 = k10;
                C13607l.i(eVar2, C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, C18030v.f147664a.a(k10, C18030v.f147665b).I0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, C13023e.f110931a | 48, 0, 262132);
            }
            mVar2.P();
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
            n10.a(new f(vVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R(v vVar, int i10, C4889m mVar, int i11) {
        P(vVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void S(java.lang.String r54, KJ.C15987c<java.lang.String> r55, androidx.compose.ui.d r56, U0.C4889m r57, int r58, int r59) {
        /*
            r0 = r54
            r15 = r55
            r14 = r58
            java.lang.String r1 = "dayLabel"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            java.lang.String r1 = "timeLabels"
            kotlin.jvm.internal.C17542s.j(r15, r1)
            r1 = -996537030(0xffffffffc49a0d3a, float:-1232.4133)
            r2 = r57
            U0.m r13 = r2.k(r1)
            r2 = r59 & 1
            if (r2 == 0) goto L_0x0020
            r2 = r14 | 6
            goto L_0x0030
        L_0x0020:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x002f
            boolean r2 = r13.V(r0)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r14
            goto L_0x0030
        L_0x002f:
            r2 = r14
        L_0x0030:
            r3 = r59 & 2
            if (r3 == 0) goto L_0x0037
            r2 = r2 | 48
            goto L_0x0047
        L_0x0037:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x0047
            boolean r3 = r13.V(r15)
            if (r3 == 0) goto L_0x0044
            r3 = 32
            goto L_0x0046
        L_0x0044:
            r3 = 16
        L_0x0046:
            r2 = r2 | r3
        L_0x0047:
            r3 = r59 & 4
            if (r3 == 0) goto L_0x0051
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r4 = r56
        L_0x004f:
            r5 = r2
            goto L_0x0064
        L_0x0051:
            r4 = r14 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004d
            r4 = r56
            boolean r5 = r13.V(r4)
            if (r5 == 0) goto L_0x0060
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r2 = r2 | r5
            goto L_0x004f
        L_0x0064:
            r2 = r5 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r2 != r6) goto L_0x0079
            boolean r2 = r13.l()
            if (r2 != 0) goto L_0x0071
            goto L_0x0079
        L_0x0071:
            r13.L()
            r3 = r4
            r53 = r13
            goto L_0x01bd
        L_0x0079:
            if (r3 == 0) goto L_0x007f
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r12 = r2
            goto L_0x0080
        L_0x007f:
            r12 = r4
        L_0x0080:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x008c
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.OpeningHoursLabel (StoreDetailsOpeningHoursScreen.kt:147)"
            U0.C4895p.S(r1, r5, r2, r3)
        L_0x008c:
            r1 = 0
            r2 = 0
            r3 = 1
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r12, r1, r3, r2)
            r2 = 560423441(0x21676211, float:7.8395634E-19)
            r13.W(r2)
            java.lang.Object r2 = r13.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x00ad
            cC.b r2 = new cC.b
            r2.<init>()
            r13.u(r2)
        L_0x00ad:
            nI.l r2 = (nI.C17642l) r2
            r13.P()
            androidx.compose.ui.d r1 = L1.o.c(r1, r3, r2)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r2 = r2.f()
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$c r3 = r3.l()
            r4 = 0
            E1.I r2 = androidx.compose.foundation.layout.G.b(r2, r3, r13, r4)
            int r3 = U0.C4883j.a(r13, r4)
            U0.y r4 = r13.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r13, r1)
            G1.g$a r6 = G1.C4504g.f6515W
            nI.a r7 = r6.a()
            U0.f r8 = r13.m()
            if (r8 != 0) goto L_0x00e2
            U0.C4883j.c()
        L_0x00e2:
            r13.I()
            boolean r8 = r13.i()
            if (r8 == 0) goto L_0x00ef
            r13.p(r7)
            goto L_0x00f2
        L_0x00ef:
            r13.t()
        L_0x00f2:
            U0.m r7 = U0.F1.a(r13)
            nI.p r8 = r6.c()
            U0.F1.c(r7, r2, r8)
            nI.p r2 = r6.e()
            U0.F1.c(r7, r4, r2)
            nI.p r2 = r6.b()
            boolean r4 = r7.i()
            if (r4 != 0) goto L_0x011c
            java.lang.Object r4 = r7.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r8)
            if (r4 != 0) goto L_0x012a
        L_0x011c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r7.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.w(r3, r2)
        L_0x012a:
            nI.p r2 = r6.d()
            U0.F1.c(r7, r1, r2)
            s0.N r16 = s0.C5843N.f28726a
            TC.b$a$b r1 = TC.C13679b.a.C2856b.f116680a
            r27 = r1
            androidx.compose.ui.d$a r17 = androidx.compose.ui.d.f18749a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            androidx.compose.ui.d r2 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            r3 = r5 & 14
            r23 = r3 | 48
            r24 = 0
            r25 = 262136(0x3fff8, float:3.67331E-40)
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r16 = 0
            r52 = r12
            r12 = r16
            r53 = r13
            r13 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r20 = 0
            r0 = r54
            r22 = r53
            SC.C13607l.j(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7 = 62
            java.lang.String r1 = "\n"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r55
            java.lang.String r26 = YH.C16877v.G0(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r50 = 0
            r51 = 262140(0x3fffc, float:3.67336E-40)
            r28 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r49 = 48
            r48 = r53
            SC.C13607l.j(r26, r27, r28, r29, r31, r33, r34, r35, r36, r38, r39, r40, r41, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            r53.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01bb
            U0.C4895p.R()
        L_0x01bb:
            r3 = r52
        L_0x01bd:
            U0.Y0 r6 = r53.n()
            if (r6 == 0) goto L_0x01d4
            cC.c r7 = new cC.c
            r0 = r7
            r1 = r54
            r2 = r55
            r4 = r58
            r5 = r59
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cC.r.S(java.lang.String, KJ.c, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N T(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U(String str, C15987c cVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        S(str, cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void V(C14001b bVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C14001b bVar2 = bVar;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C17542s.j(bVar2, "state");
        C17542s.j(aVar3, "onBackClicked");
        C17542s.j(aVar4, "onPopularTimesClicked");
        C4889m k10 = mVar.k(327131912);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(bVar2) : k10.F(bVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar3) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar4) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(327131912, i11, -1, "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.StoreDetailsOpeningHoursScreen (StoreDetailsOpeningHoursScreen.kt:68)");
            }
            mVar2 = k10;
            C4762x0.a((androidx.compose.ui.d) null, c1.c.e(-1971291452, true, new d(aVar3), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, c1.c.e(-195760095, true, new e(bVar2, aVar4), k10, 54), O.f9935a.a(), 0, 0, (C5848T) null, c1.c.e(1250458713, true, new f(bVar2), k10, 54), mVar2, 805330992, 461);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C14024a(bVar2, aVar3, aVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N W(C14001b bVar, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        V(bVar, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void X(bC.C14001b.d r22, androidx.compose.ui.d r23, U0.C4889m r24, int r25, int r26) {
        /*
            r0 = r22
            r1 = r25
            r2 = r26
            r3 = -2056644866(0xffffffff856a16fe, float:-1.100685E-35)
            r4 = r24
            U0.m r6 = r4.k(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r1 | 6
            goto L_0x002f
        L_0x0016:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x002e
            r4 = r1 & 8
            if (r4 != 0) goto L_0x0023
            boolean r4 = r6.V(r0)
            goto L_0x0027
        L_0x0023:
            boolean r4 = r6.F(r0)
        L_0x0027:
            if (r4 == 0) goto L_0x002b
            r4 = 4
            goto L_0x002c
        L_0x002b:
            r4 = 2
        L_0x002c:
            r4 = r4 | r1
            goto L_0x002f
        L_0x002e:
            r4 = r1
        L_0x002f:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x0039
            r4 = r4 | 48
        L_0x0035:
            r7 = r23
        L_0x0037:
            r8 = r4
            goto L_0x004c
        L_0x0039:
            r7 = r1 & 48
            if (r7 != 0) goto L_0x0035
            r7 = r23
            boolean r8 = r6.V(r7)
            if (r8 == 0) goto L_0x0048
            r8 = 32
            goto L_0x004a
        L_0x0048:
            r8 = 16
        L_0x004a:
            r4 = r4 | r8
            goto L_0x0037
        L_0x004c:
            r4 = r8 & 19
            r9 = 18
            if (r4 != r9) goto L_0x005e
            boolean r4 = r6.l()
            if (r4 != 0) goto L_0x0059
            goto L_0x005e
        L_0x0059:
            r6.L()
            r3 = r6
            goto L_0x00b4
        L_0x005e:
            if (r5 == 0) goto L_0x0065
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r21 = r4
            goto L_0x0067
        L_0x0065:
            r21 = r7
        L_0x0067:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0073
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.StoreOpeningHours (StoreDetailsOpeningHoursScreen.kt:120)"
            U0.C4895p.S(r3, r8, r4, r5)
        L_0x0073:
            int r3 = TB.C13677a.f116670k
            r4 = 0
            java.lang.String r4 = J1.j.b(r3, r6, r4)
            cC.r$g r3 = new cC.r$g
            r3.<init>(r0)
            r5 = 54
            r7 = 89776992(0x559e360, float:1.0245053E-35)
            r9 = 1
            c1.a r11 = c1.c.e(r7, r9, r3, r6, r5)
            int r3 = r8 << 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r5 = 12582960(0xc00030, float:1.7632483E-38)
            r18 = r3 | r5
            r19 = 6
            r20 = 7032(0x1b78, float:9.854E-42)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = 0
            r16 = 0
            r3 = r6
            r6 = r21
            r17 = r3
            SC.C13585f1.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00b2
            U0.C4895p.R()
        L_0x00b2:
            r7 = r21
        L_0x00b4:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x00c2
            cC.l r4 = new cC.l
            r4.<init>(r0, r7, r1, r2)
            r3.a(r4)
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cC.r.X(bC.b$d, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(C14001b.d dVar, androidx.compose.ui.d dVar2, int i10, int i11, C4889m mVar, int i12) {
        X(dVar, dVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final v<C5747v0, Integer> f0(C14001b.c cVar, C4889m mVar, int i10) {
        v<C5747v0, Integer> vVar;
        mVar.W(-403979771);
        if (C4895p.J()) {
            C4895p.S(-403979771, i10, -1, "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.getStatusTextAttributes (StoreDetailsOpeningHoursScreen.kt:438)");
        }
        if (cVar instanceof C14001b.c.C2972c) {
            mVar.W(1123610345);
            vVar = C16796C.a(C5747v0.k(C18030v.f147664a.a(mVar, C18030v.f147665b).w0()), Integer.valueOf(C13561a.f115645h));
            mVar.P();
        } else if (cVar instanceof C14001b.c.d) {
            mVar.W(1123776288);
            vVar = C16796C.a(C5747v0.k(C18030v.f147664a.a(mVar, C18030v.f147665b).s0()), Integer.valueOf(C13561a.f115650m));
            mVar.P();
        } else if (cVar instanceof C14001b.c.a) {
            mVar.W(1123947873);
            vVar = C16796C.a(C5747v0.k(C18030v.f147664a.a(mVar, C18030v.f147665b).v0()), Integer.valueOf(C13561a.f115643f));
            mVar.P();
        } else if (cVar instanceof C14001b.c.C2971b) {
            mVar.W(1124119489);
            vVar = C16796C.a(C5747v0.k(C18030v.f147664a.a(mVar, C18030v.f147665b).s0()), Integer.valueOf(C13561a.f115644g));
            mVar.P();
        } else {
            mVar.W(-2041965696);
            mVar.P();
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return vVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(KJ.C15987c<bC.C14001b.a> r33, androidx.compose.ui.d r34, U0.C4889m r35, int r36, int r37) {
        /*
            r0 = r33
            r1 = r36
            r2 = r37
            r3 = 2
            r4 = 6
            r5 = 803055456(0x2fdda760, float:4.0318593E-10)
            r6 = r35
            U0.m r15 = r6.k(r5)
            r14 = 1
            r6 = r2 & 1
            if (r6 == 0) goto L_0x0019
            r6 = r1 | 6
            goto L_0x0032
        L_0x0019:
            r6 = r1 & 6
            if (r6 != 0) goto L_0x0031
            r6 = r1 & 8
            if (r6 != 0) goto L_0x0026
            boolean r6 = r15.V(r0)
            goto L_0x002a
        L_0x0026:
            boolean r6 = r15.F(r0)
        L_0x002a:
            if (r6 == 0) goto L_0x002e
            r6 = 4
            goto L_0x002f
        L_0x002e:
            r6 = r3
        L_0x002f:
            r6 = r6 | r1
            goto L_0x0032
        L_0x0031:
            r6 = r1
        L_0x0032:
            r3 = r3 & r2
            r7 = 32
            if (r3 == 0) goto L_0x003c
            r6 = r6 | 48
        L_0x0039:
            r8 = r34
            goto L_0x004d
        L_0x003c:
            r8 = r1 & 48
            if (r8 != 0) goto L_0x0039
            r8 = r34
            boolean r9 = r15.V(r8)
            if (r9 == 0) goto L_0x004a
            r9 = r7
            goto L_0x004c
        L_0x004a:
            r9 = 16
        L_0x004c:
            r6 = r6 | r9
        L_0x004d:
            r9 = r6 & 19
            r10 = 18
            if (r9 != r10) goto L_0x0060
            boolean r9 = r15.l()
            if (r9 != 0) goto L_0x005a
            goto L_0x0060
        L_0x005a:
            r15.L()
            r3 = r15
            goto L_0x02c7
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x0066
        L_0x0065:
            r3 = r8
        L_0x0066:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0072
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.AmenitiesOpeningHours (StoreDetailsOpeningHoursScreen.kt:311)"
            U0.C4895p.S(r5, r6, r8, r9)
        L_0x0072:
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r5.g()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$b r6 = r6.k()
            r13 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r15, r13)
            int r6 = U0.C4883j.a(r15, r13)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r12 = r15.m()
            if (r12 != 0) goto L_0x009e
            U0.C4883j.c()
        L_0x009e:
            r15.I()
            boolean r12 = r15.i()
            if (r12 == 0) goto L_0x00ab
            r15.p(r11)
            goto L_0x00ae
        L_0x00ab:
            r15.t()
        L_0x00ae:
            U0.m r11 = U0.F1.a(r15)
            nI.p r12 = r10.c()
            U0.F1.c(r11, r5, r12)
            nI.p r5 = r10.e()
            U0.F1.c(r11, r8, r5)
            nI.p r5 = r10.b()
            boolean r8 = r11.i()
            if (r8 != 0) goto L_0x00d8
            java.lang.Object r8 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
            if (r8 != 0) goto L_0x00e6
        L_0x00d8:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r11.u(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11.w(r6, r5)
        L_0x00e6:
            nI.p r5 = r10.d()
            U0.F1.c(r11, r9, r5)
            s0.h r5 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            float r11 = (float) r7
            float r6 = c2.h.B(r11)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r5, r6)
            s0.C5844O.a(r6, r15, r4)
            int r4 = TB.C13677a.f116674o
            java.lang.String r6 = J1.j.b(r4, r15, r13)
            TC.b$b$f r7 = TC.C13679b.C2857b.f.f116688a
            androidx.compose.ui.d r8 = TC.e.i(r5)
            r30 = 0
            r31 = 262136(0x3fff8, float:3.67331E-40)
            r9 = 0
            r4 = 0
            r32 = r11
            r11 = r4
            r4 = 0
            r5 = r13
            r13 = r4
            r5 = r14
            r14 = r4
            r35 = r15
            r15 = r4
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
            r29 = 48
            r28 = r35
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r4 = 1524050042(0x5ad7287a, float:3.02808122E16)
            r15 = r35
            r15.W(r4)
            java.util.Iterator r4 = r33.iterator()
            r14 = 0
        L_0x0145:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x02b3
            java.lang.Object r6 = r4.next()
            int r16 = r14 + 1
            if (r14 >= 0) goto L_0x0156
            YH.C16877v.x()
        L_0x0156:
            r13 = r6
            bC.b$a r13 = (bC.C14001b.a) r13
            androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r6.g()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$b r7 = r7.k()
            r8 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r15, r8)
            int r7 = U0.C4883j.a(r15, r8)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r15, r12)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x0187
            U0.C4883j.c()
        L_0x0187:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x0194
            r15.p(r11)
            goto L_0x0197
        L_0x0194:
            r15.t()
        L_0x0197:
            U0.m r11 = U0.F1.a(r15)
            nI.p r5 = r10.c()
            U0.F1.c(r11, r6, r5)
            nI.p r5 = r10.e()
            U0.F1.c(r11, r8, r5)
            nI.p r5 = r10.b()
            boolean r6 = r11.i()
            if (r6 != 0) goto L_0x01c1
            java.lang.Object r6 = r11.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r8)
            if (r6 != 0) goto L_0x01cf
        L_0x01c1:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r11.u(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r11.w(r6, r5)
        L_0x01cf:
            nI.p r5 = r10.d()
            U0.F1.c(r11, r9, r5)
            s0.h r5 = s0.C5862h.f28810a
            r11 = 0
            java.lang.Object[] r6 = new java.lang.Object[r11]
            r7 = -2003995211(0xffffffff888d75b5, float:-8.513802E-34)
            r15.W(r7)
            java.lang.Object r7 = r15.D()
            U0.m$a r17 = U0.C4889m.f14007a
            java.lang.Object r8 = r17.a()
            if (r7 != r8) goto L_0x01f5
            cC.i r7 = new cC.i
            r7.<init>()
            r15.u(r7)
        L_0x01f5:
            r9 = r7
            nI.a r9 = (nI.C17631a) r9
            r15.P()
            r18 = 3072(0xc00, float:4.305E-42)
            r19 = 6
            r7 = 0
            r8 = 0
            r10 = r15
            r20 = r11
            r11 = r18
            r34 = r12
            r12 = r19
            java.lang.Object r6 = f1.C5301c.e(r6, r7, r8, r9, r10, r11, r12)
            r12 = r6
            U0.r0 r12 = (U0.C4899r0) r12
            boolean r6 = t(r12)
            androidx.compose.ui.d r7 = TC.e.i(r34)
            float r8 = c2.h.B(r32)
            r11 = 0
            r10 = 0
            r9 = 1
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.D.k(r7, r11, r8, r9, r10)
            r7 = -2003984904(0xffffffff888d9df8, float:-8.523267E-34)
            r15.W(r7)
            boolean r7 = r15.V(r12)
            java.lang.Object r8 = r15.D()
            if (r7 != 0) goto L_0x023a
            java.lang.Object r7 = r17.a()
            if (r8 != r7) goto L_0x0242
        L_0x023a:
            cC.j r8 = new cC.j
            r8.<init>(r12)
            r15.u(r8)
        L_0x0242:
            r7 = r8
            nI.a r7 = (nI.C17631a) r7
            r15.P()
            r17 = 0
            r19 = 0
            r8 = r13
            r9 = r18
            r10 = r15
            r11 = r17
            r17 = r12
            r12 = r19
            z(r6, r7, r8, r9, r10, r11, r12)
            boolean r7 = t(r17)
            cC.r$a r6 = new cC.r$a
            r6.<init>(r13)
            r8 = 54
            r9 = -1937428607(0xffffffff8c852f81, float:-2.0520485E-31)
            r10 = 1
            c1.a r12 = c1.c.e(r9, r10, r6, r15, r8)
            r17 = 1572870(0x180006, float:2.20406E-39)
            r18 = 30
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r6 = r5
            r13 = r15
            r5 = r14
            r14 = r17
            r17 = r3
            r3 = r15
            r15 = r18
            l0.d.e(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r6 = -2003971781(0xffffffff888dd13b, float:-8.535319E-34)
            r3.W(r6)
            int r6 = YH.C16877v.p(r33)
            if (r5 >= r6) goto L_0x02a5
            r6 = r34
            r5 = 1
            r7 = 0
            r8 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r6, r7, r5, r8)
            androidx.compose.ui.d r6 = TC.e.i(r6)
            r11 = 0
            r12 = 6
            r7 = 0
            r8 = 0
            r10 = r3
            SC.C13643u0.c(r6, r7, r8, r10, r11, r12)
            goto L_0x02a6
        L_0x02a5:
            r5 = 1
        L_0x02a6:
            r3.P()
            r3.x()
            r15 = r3
            r14 = r16
            r3 = r17
            goto L_0x0145
        L_0x02b3:
            r17 = r3
            r3 = r15
            r3.P()
            r3.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x02c5
            U0.C4895p.R()
        L_0x02c5:
            r8 = r17
        L_0x02c7:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x02d5
            cC.k r4 = new cC.k
            r4.<init>(r0, r8, r1, r2)
            r3.a(r4)
        L_0x02d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cC.r.r(KJ.c, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C4899r0 s() {
        return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    private static final boolean t(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void u(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C4899r0 r0Var) {
        u(r0Var, !t(r0Var));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(C15987c cVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        r(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void x(bC.C14001b.a r16, androidx.compose.ui.d r17, U0.C4889m r18, int r19, int r20) {
        /*
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = 2
            r4 = 8
            r5 = 6
            r6 = -835234398(0xffffffffce3755a2, float:-7.6896064E8)
            r7 = r18
            U0.m r13 = r7.k(r6)
            r7 = r2 & 1
            if (r7 == 0) goto L_0x001a
            r7 = r1 | 6
            goto L_0x0033
        L_0x001a:
            r7 = r1 & 6
            if (r7 != 0) goto L_0x0032
            r7 = r1 & 8
            if (r7 != 0) goto L_0x0027
            boolean r7 = r13.V(r0)
            goto L_0x002b
        L_0x0027:
            boolean r7 = r13.F(r0)
        L_0x002b:
            if (r7 == 0) goto L_0x002f
            r7 = 4
            goto L_0x0030
        L_0x002f:
            r7 = r3
        L_0x0030:
            r7 = r7 | r1
            goto L_0x0033
        L_0x0032:
            r7 = r1
        L_0x0033:
            r3 = r3 & r2
            r8 = 16
            if (r3 == 0) goto L_0x003d
            r7 = r7 | 48
        L_0x003a:
            r9 = r17
            goto L_0x004e
        L_0x003d:
            r9 = r1 & 48
            if (r9 != 0) goto L_0x003a
            r9 = r17
            boolean r10 = r13.V(r9)
            if (r10 == 0) goto L_0x004c
            r10 = 32
            goto L_0x004d
        L_0x004c:
            r10 = r8
        L_0x004d:
            r7 = r7 | r10
        L_0x004e:
            r10 = r7 & 19
            r11 = 18
            if (r10 != r11) goto L_0x0061
            boolean r10 = r13.l()
            if (r10 != 0) goto L_0x005b
            goto L_0x0061
        L_0x005b:
            r13.L()
            r3 = r9
            goto L_0x0237
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x0067
        L_0x0066:
            r3 = r9
        L_0x0067:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x0073
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.AmenityContent (StoreDetailsOpeningHoursScreen.kt:354)"
            U0.C4895p.S(r6, r7, r9, r10)
        L_0x0073:
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            float r14 = (float) r8
            float r7 = c2.h.B(r14)
            androidx.compose.foundation.layout.d$f r6 = r6.n(r7)
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$b r7 = r7.k()
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r13, r5)
            r15 = 0
            int r7 = U0.C4883j.a(r13, r15)
            U0.y r8 = r13.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r13, r3)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r12 = r13.m()
            if (r12 != 0) goto L_0x00a4
            U0.C4883j.c()
        L_0x00a4:
            r13.I()
            boolean r12 = r13.i()
            if (r12 == 0) goto L_0x00b1
            r13.p(r11)
            goto L_0x00b4
        L_0x00b1:
            r13.t()
        L_0x00b4:
            U0.m r11 = U0.F1.a(r13)
            nI.p r12 = r10.c()
            U0.F1.c(r11, r6, r12)
            nI.p r6 = r10.e()
            U0.F1.c(r11, r8, r6)
            nI.p r6 = r10.b()
            boolean r8 = r11.i()
            if (r8 != 0) goto L_0x00de
            java.lang.Object r8 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
            if (r8 != 0) goto L_0x00ec
        L_0x00de:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r11.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11.w(r7, r6)
        L_0x00ec:
            nI.p r6 = r10.d()
            U0.F1.c(r11, r9, r6)
            s0.h r6 = s0.C5862h.f28810a
            r6 = 1800524442(0x6b51d29a, float:2.5366003E26)
            r13.W(r6)
            KJ.c r6 = r16.e()
            java.util.Iterator r6 = r6.iterator()
        L_0x0103:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x015e
            java.lang.Object r7 = r6.next()
            XH.v r7 = (XH.v) r7
            java.lang.Object r8 = r7.c()
            IC.e r8 = (IC.C13023e) r8
            int r9 = IC.C13023e.f110931a
            java.lang.String r8 = r8.a(r13, r9)
            r9 = 1800528739(0x6b51e363, float:2.537393E26)
            r13.W(r9)
            java.lang.Object r7 = r7.d()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = YH.C16877v.y(r7, r10)
            r9.<init>(r10)
            java.util.Iterator r7 = r7.iterator()
        L_0x0136:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x014c
            java.lang.Object r10 = r7.next()
            IC.e r10 = (IC.C13023e) r10
            int r11 = IC.C13023e.f110931a
            java.lang.String r10 = r10.a(r13, r11)
            r9.add(r10)
            goto L_0x0136
        L_0x014c:
            r13.P()
            KJ.c r9 = KJ.C15985a.h(r9)
            r11 = 0
            r12 = 4
            r10 = 0
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r13
            S(r7, r8, r9, r10, r11, r12)
            goto L_0x0103
        L_0x015e:
            r13.P()
            r6 = 1800531402(0x6b51edca, float:2.5378842E26)
            r13.W(r6)
            KJ.c r6 = r16.a()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0228
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.foundation.layout.d$f r4 = r6.n(r4)
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            float r8 = c2.h.B(r14)
            r11 = 13
            r12 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r6, r7, r8, r9, r10, r11, r12)
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$b r7 = r7.k()
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r7, r13, r5)
            int r5 = U0.C4883j.a(r13, r15)
            U0.y r7 = r13.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r13, r6)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r13.m()
            if (r10 != 0) goto L_0x01b1
            U0.C4883j.c()
        L_0x01b1:
            r13.I()
            boolean r10 = r13.i()
            if (r10 == 0) goto L_0x01be
            r13.p(r9)
            goto L_0x01c1
        L_0x01be:
            r13.t()
        L_0x01c1:
            U0.m r9 = U0.F1.a(r13)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r4, r10)
            nI.p r4 = r8.e()
            U0.F1.c(r9, r7, r4)
            nI.p r4 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x01eb
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x01f9
        L_0x01eb:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r9.u(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.w(r5, r4)
        L_0x01f9:
            nI.p r4 = r8.d()
            U0.F1.c(r9, r6, r4)
            s0.h r4 = s0.C5862h.f28810a
            r4 = -1615567035(0xffffffff9fb46745, float:-7.640381E-20)
            r13.W(r4)
            KJ.c r4 = r16.a()
            java.util.Iterator r4 = r4.iterator()
        L_0x0210:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0222
            java.lang.Object r5 = r4.next()
            XH.v r5 = (XH.v) r5
            int r6 = IC.C13023e.f110931a
            P(r5, r13, r6)
            goto L_0x0210
        L_0x0222:
            r13.P()
            r13.x()
        L_0x0228:
            r13.P()
            r13.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0237
            U0.C4895p.R()
        L_0x0237:
            U0.Y0 r4 = r13.n()
            if (r4 == 0) goto L_0x0245
            cC.h r5 = new cC.h
            r5.<init>(r0, r3, r1, r2)
            r4.a(r5)
        L_0x0245:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cC.r.x(bC.b$a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C14001b.a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        x(aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void z(boolean r60, nI.C17631a<XH.C16807N> r61, bC.C14001b.a r62, androidx.compose.ui.d r63, U0.C4889m r64, int r65, int r66) {
        /*
            r1 = r60
            r3 = r62
            r5 = r65
            r0 = 2
            r2 = 4
            r4 = 6
            r6 = 766929008(0x2db66870, float:2.0737384E-11)
            r7 = r64
            U0.m r15 = r7.k(r6)
            r7 = r66 & 1
            if (r7 == 0) goto L_0x0019
            r7 = r5 | 6
            goto L_0x0029
        L_0x0019:
            r7 = r5 & 6
            if (r7 != 0) goto L_0x0028
            boolean r7 = r15.b(r1)
            if (r7 == 0) goto L_0x0025
            r7 = r2
            goto L_0x0026
        L_0x0025:
            r7 = r0
        L_0x0026:
            r7 = r7 | r5
            goto L_0x0029
        L_0x0028:
            r7 = r5
        L_0x0029:
            r0 = r66 & 2
            if (r0 == 0) goto L_0x0032
            r7 = r7 | 48
        L_0x002f:
            r0 = r61
            goto L_0x0044
        L_0x0032:
            r0 = r5 & 48
            if (r0 != 0) goto L_0x002f
            r0 = r61
            boolean r8 = r15.F(r0)
            if (r8 == 0) goto L_0x0041
            r8 = 32
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r7 = r7 | r8
        L_0x0044:
            r2 = r66 & 4
            if (r2 == 0) goto L_0x004b
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x004b:
            r2 = r5 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0064
            r2 = r5 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x0058
            boolean r2 = r15.V(r3)
            goto L_0x005c
        L_0x0058:
            boolean r2 = r15.F(r3)
        L_0x005c:
            if (r2 == 0) goto L_0x0061
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r7 = r7 | r2
        L_0x0064:
            r2 = r66 & 8
            if (r2 == 0) goto L_0x006e
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r8 = r63
        L_0x006c:
            r13 = r7
            goto L_0x0081
        L_0x006e:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x006a
            r8 = r63
            boolean r9 = r15.V(r8)
            if (r9 == 0) goto L_0x007d
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r7 = r7 | r9
            goto L_0x006c
        L_0x0081:
            r7 = r13 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r7 != r9) goto L_0x0095
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x008e
            goto L_0x0095
        L_0x008e:
            r15.L()
            r4 = r8
            r7 = r15
            goto L_0x0337
        L_0x0095:
            if (r2 == 0) goto L_0x009a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x009b
        L_0x009a:
            r2 = r8
        L_0x009b:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00a7
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.storedetails.impl.openinghours.presentation.ui.AmenityHeader (StoreDetailsOpeningHoursScreen.kt:384)"
            U0.C4895p.S(r6, r13, r7, r8)
        L_0x00a7:
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r7 = 981986929(0x3a87ee71, float:0.0010370744)
            r15.W(r7)
            if (r1 == 0) goto L_0x00b4
            int r7 = Oo.b.f84742p
            goto L_0x00b6
        L_0x00b4:
            int r7 = Oo.b.f84731o
        L_0x00b6:
            r12 = 0
            java.lang.String r18 = J1.j.b(r7, r15, r12)
            r15.P()
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            r16 = r6
            r20 = r61
            androidx.compose.ui.d r7 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.ui.d r7 = r7.s(r2)
            androidx.compose.foundation.layout.d r22 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r8 = r22.f()
            i1.c$a r34 = i1.C5437c.f24302a
            i1.c$c r9 = r34.l()
            E1.I r8 = androidx.compose.foundation.layout.G.b(r8, r9, r15, r12)
            int r9 = U0.C4883j.a(r15, r12)
            U0.y r10 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r7)
            G1.g$a r23 = G1.C4504g.f6515W
            nI.a r11 = r23.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x00fd
            U0.C4883j.c()
        L_0x00fd:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x010a
            r15.p(r11)
            goto L_0x010d
        L_0x010a:
            r15.t()
        L_0x010d:
            U0.m r11 = U0.F1.a(r15)
            nI.p r14 = r23.c()
            U0.F1.c(r11, r8, r14)
            nI.p r8 = r23.e()
            U0.F1.c(r11, r10, r8)
            nI.p r8 = r23.b()
            boolean r10 = r11.i()
            if (r10 != 0) goto L_0x0137
            java.lang.Object r10 = r11.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r14)
            if (r10 != 0) goto L_0x0145
        L_0x0137:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11.w(r9, r8)
        L_0x0145:
            nI.p r8 = r23.d()
            U0.F1.c(r11, r7, r8)
            s0.N r14 = s0.C5843N.f28726a
            int r7 = r62.b()
            t1.c r7 = J1.e.c(r7, r15, r12)
            i1.c$c r8 = r34.i()
            androidx.compose.ui.d r9 = r14.c(r6, r8)
            tK.v r8 = tK.C18030v.f147664a
            int r10 = tK.C18030v.f147665b
            tK.h r8 = r8.a(r15, r10)
            long r10 = r8.G0()
            r16 = 48
            r17 = 0
            r8 = 0
            r12 = r15
            r35 = r13
            r13 = r16
            r63 = r14
            r4 = 16
            r14 = r17
            O0.V.a(r7, r8, r9, r10, r12, r13, r14)
            float r4 = (float) r4
            float r7 = c2.h.B(r4)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.y(r6, r7)
            r8 = 6
            s0.C5844O.a(r7, r15, r8)
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r63
            r17 = r6
            androidx.compose.ui.d r7 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            androidx.compose.foundation.layout.d$m r8 = r22.g()
            i1.c$b r9 = r34.k()
            r14 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5080k.a(r8, r9, r15, r14)
            int r9 = U0.C4883j.a(r15, r14)
            U0.y r10 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r7)
            nI.a r11 = r23.a()
            U0.f r12 = r15.m()
            if (r12 != 0) goto L_0x01c0
            U0.C4883j.c()
        L_0x01c0:
            r15.I()
            boolean r12 = r15.i()
            if (r12 == 0) goto L_0x01cd
            r15.p(r11)
            goto L_0x01d0
        L_0x01cd:
            r15.t()
        L_0x01d0:
            U0.m r11 = U0.F1.a(r15)
            nI.p r12 = r23.c()
            U0.F1.c(r11, r8, r12)
            nI.p r8 = r23.e()
            U0.F1.c(r11, r10, r8)
            nI.p r8 = r23.b()
            boolean r10 = r11.i()
            if (r10 != 0) goto L_0x01fa
            java.lang.Object r10 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r12)
            if (r10 != 0) goto L_0x0208
        L_0x01fa:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11.w(r9, r8)
        L_0x0208:
            nI.p r8 = r23.d()
            U0.F1.c(r11, r7, r8)
            s0.h r7 = s0.C5862h.f28810a
            IC.e r7 = r62.c()
            int r12 = IC.C13023e.f110931a
            java.lang.String r7 = r7.a(r15, r12)
            TC.b$b$f r8 = TC.C13679b.C2857b.f.f116688a
            r31 = 0
            r32 = 262140(0x3fffc, float:3.67336E-40)
            r9 = 0
            r10 = 0
            r16 = 0
            r36 = r12
            r12 = r16
            r16 = 0
            r14 = r16
            r64 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 48
            r29 = r64
            SC.C13607l.j(r7, r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            bC.b$c r7 = r62.d()
            r15 = r64
            r14 = 0
            XH.v r7 = f0(r7, r15, r14)
            java.lang.Object r8 = r7.a()
            p1.v0 r8 = (p1.C5747v0) r8
            long r38 = r8.y()
            java.lang.Object r7 = r7.b()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.String r7 = J1.j.b(r7, r15, r14)
            r8 = 1699602024(0x654dde68, float:6.0761738E22)
            r15.W(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            bC.b$c r9 = r62.d()
            IC.e r9 = r9.a()
            r10 = 1699605540(0x654dec24, float:6.077757E22)
            r15.W(r10)
            if (r9 != 0) goto L_0x0290
            goto L_0x02a0
        L_0x0290:
            java.lang.String r10 = " • "
            r8.append(r10)
            r10 = r36
            java.lang.String r9 = r9.a(r15, r10)
            r8.append(r9)
            XH.N r9 = XH.C16807N.f139792a
        L_0x02a0:
            r15.P()
            java.lang.String r8 = r8.toString()
            r15.P()
            N1.G r9 = new N1.G
            r37 = r9
            r58 = 65534(0xfffe, float:9.1833E-41)
            r59 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r37.<init>(r38, r40, r42, r43, r44, r45, r46, r47, r49, r50, r51, r52, r54, r55, r56, r57, r58, r59)
            N1.d r7 = IC.C13021c.e(r8, r7, r9)
            TC.b$a$b r8 = TC.C13679b.a.C2856b.f116680a
            r32 = 0
            r33 = 524284(0x7fffc, float:7.34678E-40)
            r9 = 0
            r10 = 0
            r12 = 0
            r16 = 0
            r14 = r16
            r64 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 48
            r30 = r64
            SC.C13607l.h(r7, r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r64.x()
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.y(r6, r4)
            r7 = r64
            r8 = 6
            s0.C5844O.a(r4, r7, r8)
            i1.c$c r4 = r34.i()
            r8 = r63
            androidx.compose.ui.d r4 = r8.c(r6, r4)
            r6 = r35 & 14
            r8 = 0
            H(r1, r4, r7, r6, r8)
            r7.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0336
            U0.C4895p.R()
        L_0x0336:
            r4 = r2
        L_0x0337:
            U0.Y0 r7 = r7.n()
            if (r7 == 0) goto L_0x0350
            cC.g r8 = new cC.g
            r0 = r8
            r1 = r60
            r2 = r61
            r3 = r62
            r5 = r65
            r6 = r66
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0350:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cC.r.z(boolean, nI.a, bC.b$a, androidx.compose.ui.d, U0.m, int, int):void");
    }
}
