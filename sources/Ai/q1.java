package Ai;

import D4.C6447v;
import Dl.n;
import E1.I;
import Ei.C10702w;
import Ei.C10703x;
import G1.C4504g;
import HJ.C15854t;
import Hx.f;
import IC.C13023e;
import KJ.C15985a;
import KJ.C15987c;
import N1.P;
import O0.C4762x0;
import O0.e1;
import O0.g1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.B1;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13585f1;
import SC.C13589g1;
import SC.C13607l;
import SC.C13643u0;
import SC.H2;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import SC.W1;
import SC.Z1;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.t;
import Y1.j;
import Y1.k;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.sugarcube.core.logger.DslKt;
import dI.C17168i;
import i1.C5437c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import ol.u;
import ol.v;
import p1.i1;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import r0.m;
import s0.C5834E;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5848T;
import s0.C5857c;
import s0.C5861g;
import s0.C5862h;
import t0.C5938c;
import t0.x;
import tK.C18030v;
import wi.C12272a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a[\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aM\u0010\u0016\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0018\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u000e\u001a1\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00122\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LEi/x$a;", "purchaseHistoryState", "Lkotlin/Function0;", "LXH/N;", "onTopAppBarBackClicked", "onSearchOrderClicked", "onErrorDismissed", "Lkotlin/Function2;", "LHx/f;", "", "onPurchaseClicked", "r", "(LEi/x$a;LnI/a;LnI/a;LnI/a;LnI/p;LU0/m;I)V", "w", "(LnI/a;LU0/m;I)V", "p", "(LU0/m;I)V", "LE4/a;", "LEi/w;", "lazyItems", "", "isOrderLookupEnabled", "t", "(LE4/a;ZLnI/p;LnI/a;LU0/m;I)V", "y", "purchaseItemSummary", "l", "(LEi/w;LnI/p;LU0/m;I)V", "Landroidx/compose/ui/d;", "modifier", "n", "(LEi/w;Landroidx/compose/ui/d;LU0/m;II)V", "onPrimaryActionClicked", "j", "(Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "purchasehistory-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10702w f78766a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<f, String, C16807N> f78767b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.q1$a$a  reason: collision with other inner class name */
        static final class C1450a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C10702w f78768a;

            C1450a(C10702w wVar) {
                this.f78768a = wVar;
            }

            public final void a(C4889m mVar, int i10) {
                int i11 = i10;
                if ((i11 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1870657331, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseEntry.<anonymous>.<anonymous>.<anonymous> (PurchaseHistoryScreen.kt:298)");
                    }
                    C13607l.j(this.f78768a.h().a(mVar, C13023e.f110931a), C13679b.C2857b.f.f116688a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
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
        static final class b implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C10702w f78769a;

            b(C10702w wVar) {
                this.f78769a = wVar;
            }

            public final void a(C4889m mVar, int i10) {
                int i11 = i10;
                if ((i11 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(595733776, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseEntry.<anonymous>.<anonymous>.<anonymous> (PurchaseHistoryScreen.kt:304)");
                    }
                    C13607l.j(this.f78769a.i(), C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
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
        static final class c implements q<C5842M, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C10702w f78770a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p<f, String, C16807N> f78771b;

            c(C10702w wVar, p<? super f, ? super String, C16807N> pVar) {
                this.f78770a = wVar;
                this.f78771b = pVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(p pVar, C10702w wVar) {
                pVar.invoke(wVar.j(), wVar.d());
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(s0.C5842M r13, U0.C4889m r14, int r15) {
                /*
                    r12 = this;
                    java.lang.String r0 = "$this$SkapaListViewItem"
                    kotlin.jvm.internal.C17542s.j(r13, r0)
                    r13 = r15 & 17
                    r0 = 16
                    if (r13 != r0) goto L_0x0017
                    boolean r13 = r14.l()
                    if (r13 != 0) goto L_0x0012
                    goto L_0x0017
                L_0x0012:
                    r14.L()
                    goto L_0x0090
                L_0x0017:
                    boolean r13 = U0.C4895p.J()
                    if (r13 == 0) goto L_0x0026
                    r13 = -1
                    java.lang.String r0 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseEntry.<anonymous>.<anonymous>.<anonymous> (PurchaseHistoryScreen.kt:310)"
                    r1 = -1353182298(0xffffffffaf5813a6, float:-1.9652066E-10)
                    U0.C4895p.S(r1, r15, r13, r0)
                L_0x0026:
                    androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
                    java.lang.String r15 = "ENTRY_BUTTON"
                    androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r13, r15)
                    int r0 = uK.C18146a.f148109K
                    int r13 = wi.C12272a.f105798a
                    r15 = 0
                    java.lang.String r1 = J1.j.b(r13, r14, r15)
                    SC.G0 r5 = SC.G0.Small
                    Ei.w r13 = r12.f78770a
                    boolean r13 = r13.l()
                    if (r13 == 0) goto L_0x0045
                    SC.H0 r13 = SC.H0.Emphasised
                L_0x0043:
                    r4 = r13
                    goto L_0x0048
                L_0x0045:
                    SC.H0 r13 = SC.H0.Secondary
                    goto L_0x0043
                L_0x0048:
                    r13 = -2109646120(0xffffffff82415ad8, float:-1.4205471E-37)
                    r14.W(r13)
                    nI.p<Hx.f, java.lang.String, XH.N> r13 = r12.f78771b
                    boolean r13 = r14.V(r13)
                    Ei.w r15 = r12.f78770a
                    boolean r15 = r14.F(r15)
                    r13 = r13 | r15
                    nI.p<Hx.f, java.lang.String, XH.N> r15 = r12.f78771b
                    Ei.w r3 = r12.f78770a
                    java.lang.Object r6 = r14.D()
                    if (r13 != 0) goto L_0x006d
                    U0.m$a r13 = U0.C4889m.f14007a
                    java.lang.Object r13 = r13.a()
                    if (r6 != r13) goto L_0x0075
                L_0x006d:
                    Ai.r1 r6 = new Ai.r1
                    r6.<init>(r15, r3)
                    r14.u(r6)
                L_0x0075:
                    r8 = r6
                    nI.a r8 = (nI.C17631a) r8
                    r14.P()
                    r10 = 12779904(0xc30180, float:1.790846E-38)
                    r11 = 72
                    r3 = 0
                    r6 = 0
                    r7 = 0
                    r9 = r14
                    SC.F0.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    boolean r13 = U0.C4895p.J()
                    if (r13 == 0) goto L_0x0090
                    U0.C4895p.R()
                L_0x0090:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Ai.q1.a.c.b(s0.M, U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C10702w f78772a;

            d(C10702w wVar) {
                this.f78772a = wVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-679189779, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseEntry.<anonymous>.<anonymous>.<anonymous> (PurchaseHistoryScreen.kt:331)");
                    }
                    q1.n(this.f78772a, D.m(androidx.compose.ui.d.f18749a, 0.0f, h.B((float) 4), 0.0f, 0.0f, 13, (Object) null), mVar, C13023e.f110931a | 48, 0);
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

        a(C10702w wVar, p<? super f, ? super String, C16807N> pVar) {
            this.f78766a = wVar;
            this.f78767b = pVar;
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(gVar, "$this$SkapaOutlinedCard");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1444005192, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseEntry.<anonymous> (PurchaseHistoryScreen.kt:293)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                float f10 = (float) 16;
                androidx.compose.ui.d k10 = D.k(aVar, 0.0f, h.B(f10), 1, (Object) null);
                C10702w wVar = this.f78766a;
                p<f, String, C16807N> pVar = this.f78767b;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, k10);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar2.a();
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
                F1.c(a13, a10, aVar2.c());
                F1.c(a13, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar2.d());
                C5862h hVar = C5862h.f28810a;
                boolean k11 = wVar.k();
                C10702w wVar2 = wVar;
                float f11 = f10;
                d.a aVar3 = aVar;
                C13585f1.d(c1.c.e(1870657331, true, new C1450a(wVar), mVar2, 54), (C17631a<C16807N>) null, (androidx.compose.ui.d) null, c1.c.e(595733776, true, new b(wVar), mVar2, 54), (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, c1.c.e(-1353182298, true, new c(wVar, pVar), mVar2, 54), c1.c.e(-679189779, true, new d(wVar), mVar2, 54), (C13589g1) null, 0.0f, k11, (m) null, mVar, 1772598, 0, 1428);
                mVar2.W(-1893966208);
                if (!wVar2.c().isEmpty()) {
                    androidx.compose.ui.d i12 = TC.e.i(C5116k1.a(aVar3, "ARTICLE_THUMBNAILS"));
                    C15987c<String> c10 = wVar2.c();
                    ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
                    int i13 = 0;
                    for (T next : c10) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C16877v.x();
                        }
                        arrayList.add(new Dl.b(String.valueOf(i13), (String) null, (String) next, 0, 8, (DefaultConstructorMarker) null));
                        i13 = i14;
                    }
                    Dl.m.n(C15985a.h(arrayList), i12, h.B((float) 40), h.B(f11), n.NONE, mVar, Dl.b.f79786f | 28032, 0);
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

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78773a;

        b(C17631a<C16807N> aVar) {
            this.f78773a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1214863952, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseHistoryScreen.<anonymous> (PurchaseHistoryScreen.kt:89)");
                }
                q1.w(this.f78773a, mVar, 0);
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
    static final class c implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10703x.a f78774a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78775b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<f, String, C16807N> f78776c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78777d;

        c(C10703x.a aVar, C17631a<C16807N> aVar2, p<? super f, ? super String, C16807N> pVar, C17631a<C16807N> aVar3) {
            this.f78774a = aVar;
            this.f78775b = aVar2;
            this.f78776c = pVar;
            this.f78777d = aVar3;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            int i11;
            C5834E e11 = e10;
            C4889m mVar2 = mVar;
            C17542s.j(e11, "padding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(e11) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(739865755, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseHistoryScreen.<anonymous> (PurchaseHistoryScreen.kt:94)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d h10 = D.h(J.f(aVar, 0.0f, 1, (Object) null), e11);
                C10703x.a aVar2 = this.f78774a;
                C17631a<C16807N> aVar3 = this.f78775b;
                p<f, String, C16807N> pVar = this.f78776c;
                C17631a<C16807N> aVar4 = this.f78777d;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e12 = androidx.compose.ui.c.e(mVar2, h10);
                C4504g.a aVar5 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar5.a();
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
                F1.c(a13, a10, aVar5.c());
                F1.c(a13, s10, aVar5.e());
                p<C4504g, Integer, C16807N> b10 = aVar5.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e12, aVar5.d());
                C5862h hVar = C5862h.f28810a;
                if (aVar2 instanceof C10703x.a.c) {
                    mVar2.W(53184586);
                    q1.p(mVar2, 0);
                    mVar.P();
                } else if (aVar2 instanceof C10703x.a.b) {
                    mVar2.W(53355644);
                    Z1.d(J1.j.b(Oo.b.f84536V8, mVar2, 0), new W1(J1.j.b(Oo.b.f84616d5, mVar2, 0), aVar3), aVar3, C5116k1.a(aVar, "ERROR_TEST_TAG"), (androidx.compose.ui.window.h) null, C10611w.f78825a.a(), mVar, (W1.f116045c << 3) | 199680, 16);
                    mVar.P();
                } else if (aVar2 instanceof C10703x.a.C1536a) {
                    mVar2.W(54239020);
                    C10703x.a.C1536a aVar6 = (C10703x.a.C1536a) aVar2;
                    q1.t(E4.b.b(aVar6.a(), (C17168i) null, mVar2, 0, 1), aVar6.b(), pVar, aVar4, mVar, E4.a.f34837h);
                    mVar.P();
                } else {
                    mVar2.W(278808771);
                    mVar.P();
                    throw new t();
                }
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
    static final class d implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ R0.e f78778a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f78779b;

        d(R0.e eVar, boolean z10) {
            this.f78778a = eVar;
            this.f78779b = z10;
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            int i11;
            C5857c cVar2 = cVar;
            C4889m mVar2 = mVar;
            C17542s.j(cVar2, "$this$PullToRefreshBox");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(cVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(376130941, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchasesList.<anonymous> (PurchaseHistoryScreen.kt:183)");
                }
                R0.b bVar = R0.b.f12188a;
                androidx.compose.ui.d a10 = cVar2.a(androidx.compose.ui.d.f18749a, C5437c.f24302a.m());
                C18030v vVar = C18030v.f147664a;
                int i12 = C18030v.f147665b;
                long G02 = vVar.a(mVar2, i12).G0();
                bVar.a(this.f78778a, this.f78779b, a10, vVar.a(mVar2, i12).k(), G02, 0.0f, mVar, R0.b.f12192e << 18, 32);
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
    static final class e implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E4.a<C10702w> f78780a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f78781b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78782c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<f, String, C16807N> f78783d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements q<C5938c, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f78784a;

            a(C17631a<C16807N> aVar) {
                this.f78784a = aVar;
            }

            public final void a(C5938c cVar, C4889m mVar, int i10) {
                C17542s.j(cVar, "$this$item");
                if ((i10 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1236967943, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchasesList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PurchaseHistoryScreen.kt:210)");
                    }
                    q1.y(this.f78784a, mVar, 0);
                    C13643u0.c(D.k(androidx.compose.ui.d.f18749a, 0.0f, h.B((float) 8), 1, (Object) null), 0.0f, 0, mVar, 6, 6);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements r<C5938c, Integer, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ E4.a<C10702w> f78785a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p<f, String, C16807N> f78786b;

            b(E4.a<C10702w> aVar, p<? super f, ? super String, C16807N> pVar) {
                this.f78785a = aVar;
                this.f78786b = pVar;
            }

            public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
                C17542s.j(cVar, "$this$items");
                if ((i11 & 48) == 0) {
                    i11 |= mVar.d(i10) ? 32 : 16;
                }
                if ((i11 & 145) != 144 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1657441867, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchasesList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PurchaseHistoryScreen.kt:223)");
                    }
                    C10702w f10 = this.f78785a.f(i10);
                    if (f10 != null) {
                        q1.l(f10, this.f78786b, mVar, C13023e.f110931a);
                    }
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
                return C16807N.f139792a;
            }
        }

        e(E4.a<C10702w> aVar, boolean z10, C17631a<C16807N> aVar2, p<? super f, ? super String, C16807N> pVar) {
            this.f78780a = aVar;
            this.f78781b = z10;
            this.f78782c = aVar2;
            this.f78783d = pVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(boolean z10, E4.a aVar, C17631a aVar2, p pVar, x xVar) {
            C17542s.j(xVar, "$this$LazyColumn");
            if (z10) {
                x.i(xVar, (Object) null, (Object) null, c1.c.c(-1236967943, true, new a(aVar2)), 3, (Object) null);
            }
            x.a(xVar, aVar.g(), (C17642l) null, (C17642l) null, c1.c.c(1657441867, true, new b(aVar, pVar)), 6, (Object) null);
            if (aVar.i().d() instanceof C6447v.b) {
                x.i(xVar, (Object) null, (Object) null, C10611w.f78825a.b(), 3, (Object) null);
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(E4.a aVar) {
            aVar.l();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(s0.C5857c r19, U0.C4889m r20, int r21) {
            /*
                r18 = this;
                r0 = r18
                r13 = r20
                r1 = r21
                java.lang.String r2 = "$this$PullToRefreshBox"
                r3 = r19
                kotlin.jvm.internal.C17542s.j(r3, r2)
                r2 = r1 & 17
                r3 = 16
                if (r2 != r3) goto L_0x001f
                boolean r2 = r20.l()
                if (r2 != 0) goto L_0x001a
                goto L_0x001f
            L_0x001a:
                r20.L()
                goto L_0x0273
            L_0x001f:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x002e
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchasesList.<anonymous> (PurchaseHistoryScreen.kt:201)"
                r4 = -1775352194(0xffffffff962e467e, float:-1.4077851E-25)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x002e:
                androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
                r14 = 0
                r15 = 1
                r12 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.f(r6, r14, r15, r12)
                E4.a<Ei.w> r11 = r0.f78780a
                boolean r2 = r0.f78781b
                nI.a<XH.N> r3 = r0.f78782c
                nI.p<Hx.f, java.lang.String, XH.N> r4 = r0.f78783d
                androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r5 = r5.g()
                i1.c$a r7 = i1.C5437c.f24302a
                i1.c$b r7 = r7.k()
                r10 = 0
                E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r7, r13, r10)
                int r7 = U0.C4883j.a(r13, r10)
                U0.y r8 = r20.s()
                androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r13, r1)
                G1.g$a r9 = G1.C4504g.f6515W
                nI.a r10 = r9.a()
                U0.f r16 = r20.m()
                if (r16 != 0) goto L_0x006b
                U0.C4883j.c()
            L_0x006b:
                r20.I()
                boolean r16 = r20.i()
                if (r16 == 0) goto L_0x0078
                r13.p(r10)
                goto L_0x007b
            L_0x0078:
                r20.t()
            L_0x007b:
                U0.m r10 = U0.F1.a(r20)
                nI.p r12 = r9.c()
                U0.F1.c(r10, r5, r12)
                nI.p r5 = r9.e()
                U0.F1.c(r10, r8, r5)
                nI.p r5 = r9.b()
                boolean r8 = r10.i()
                if (r8 != 0) goto L_0x00a5
                java.lang.Object r8 = r10.D()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
                boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
                if (r8 != 0) goto L_0x00b3
            L_0x00a5:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r10.u(r8)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r10.w(r7, r5)
            L_0x00b3:
                nI.p r5 = r9.d()
                U0.F1.c(r10, r1, r5)
                s0.h r5 = s0.C5862h.f28810a
                r9 = 2
                r10 = 0
                r7 = 1065353216(0x3f800000, float:1.0)
                r8 = 0
                r12 = 0
                androidx.compose.ui.d r1 = s0.C5861g.c(r5, r6, r7, r8, r9, r10)
                int r5 = E4.a.f34837h
                t0.A r5 = ul.e.a(r11, r13, r5)
                r6 = 1171005683(0x45cc20f3, float:6532.1187)
                r13.W(r6)
                boolean r6 = r13.b(r2)
                boolean r7 = r13.V(r3)
                r6 = r6 | r7
                boolean r7 = r13.F(r11)
                r6 = r6 | r7
                boolean r7 = r13.V(r4)
                r6 = r6 | r7
                java.lang.Object r7 = r20.D()
                if (r6 != 0) goto L_0x00f3
                U0.m$a r6 = U0.C4889m.f14007a
                java.lang.Object r6 = r6.a()
                if (r7 != r6) goto L_0x00fb
            L_0x00f3:
                Ai.s1 r7 = new Ai.s1
                r7.<init>(r2, r11, r3, r4)
                r13.u(r7)
            L_0x00fb:
                r9 = r7
                nI.l r9 = (nI.C17642l) r9
                r20.P()
                r16 = 0
                r17 = 252(0xfc, float:3.53E-43)
                r3 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 0
                r2 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r10
                r10 = r20
                r19 = r11
                r11 = r16
                r14 = 0
                r12 = r17
                t0.C5937b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r1 = 1171047804(0x45ccc57c, float:6552.6855)
                r13.W(r1)
                D4.g r1 = r19.i()
                qv.e r8 = qv.e.DEBUG
                qv.d r2 = qv.d.f102012a
                java.util.List r2 = r2.a()
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x0139:
                boolean r4 = r2.hasNext()
                r9 = 0
                if (r4 == 0) goto L_0x0151
                java.lang.Object r4 = r2.next()
                r5 = r4
                qv.b r5 = (qv.C11819b) r5
                boolean r5 = r5.b(r8, r9)
                if (r5 == 0) goto L_0x0139
                r3.add(r4)
                goto L_0x0139
            L_0x0151:
                java.util.Iterator r10 = r3.iterator()
                r2 = r14
                r12 = r2
            L_0x0157:
                boolean r3 = r10.hasNext()
                if (r3 == 0) goto L_0x01ef
                java.lang.Object r3 = r10.next()
                qv.b r3 = (qv.C11819b) r3
                r6 = 0
                if (r12 != 0) goto L_0x0193
                D4.v r4 = r1.d()
                D4.v r5 = r1.a()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r11 = "Loading refresh: "
                r7.append(r11)
                r7.append(r4)
                java.lang.String r4 = ", append: "
                r7.append(r4)
                r7.append(r5)
                java.lang.String r4 = r7.toString()
                java.lang.String r4 = qv.C11818a.a(r4, r6)
                if (r4 != 0) goto L_0x018e
                goto L_0x01ef
            L_0x018e:
                java.lang.String r4 = qv.C11820c.a(r4)
                r12 = r4
            L_0x0193:
                if (r2 != 0) goto L_0x01e3
                java.lang.Class r2 = r1.getClass()
                java.lang.String r2 = r2.getName()
                kotlin.jvm.internal.C17542s.g(r2)
                r4 = 36
                r5 = 2
                java.lang.String r4 = HJ.C15854t.s1(r2, r4, r14, r5, r14)
                r7 = 46
                java.lang.String r4 = HJ.C15854t.o1(r4, r7, r14, r5, r14)
                int r5 = r4.length()
                if (r5 != 0) goto L_0x01b4
                goto L_0x01ba
            L_0x01b4:
                java.lang.String r2 = "Kt"
                java.lang.String r2 = HJ.C15854t.P0(r4, r2)
            L_0x01ba:
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                java.lang.String r5 = "main"
                boolean r4 = HJ.C15854t.b0(r4, r5, r15)
                if (r4 == 0) goto L_0x01cd
                java.lang.String r4 = "m"
                goto L_0x01cf
            L_0x01cd:
                java.lang.String r4 = "b"
            L_0x01cf:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r4)
                java.lang.String r4 = "|"
                r5.append(r4)
                r5.append(r2)
                java.lang.String r2 = r5.toString()
            L_0x01e3:
                r11 = r2
                r2 = r3
                r3 = r8
                r4 = r11
                r5 = r9
                r7 = r12
                r2.a(r3, r4, r5, r6, r7)
                r2 = r11
                goto L_0x0157
            L_0x01ef:
                D4.v r2 = r1.a()
                boolean r2 = r2 instanceof D4.C6447v.b
                r3 = 6
                if (r2 == 0) goto L_0x020e
                r1 = -515802221(0xffffffffe1417b93, float:-2.2307038E20)
                r13.W(r1)
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                java.lang.String r2 = "LOADING_PROGRESS_TEST_TAG"
                androidx.compose.ui.d r1 = androidx.compose.ui.platform.C5116k1.a(r1, r2)
                r2 = 0
                wl.C12279b.b(r1, r13, r3, r2)
                r20.P()
                goto L_0x0264
            L_0x020e:
                r2 = 0
                D4.v r4 = r1.a()
                boolean r4 = r4 instanceof D4.C6447v.a
                if (r4 != 0) goto L_0x022a
                D4.v r1 = r1.d()
                boolean r1 = r1 instanceof D4.C6447v.a
                if (r1 == 0) goto L_0x0220
                goto L_0x022a
            L_0x0220:
                r1 = -515241524(0xffffffffe14a09cc, float:-2.3293427E20)
                r13.W(r1)
                r20.P()
                goto L_0x0264
            L_0x022a:
                r1 = -515535187(0xffffffffe1458ead, float:-2.2776809E20)
                r13.W(r1)
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                r4 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r1, r4, r15, r14)
                r4 = 399016647(0x17c882c7, float:1.295771E-24)
                r13.W(r4)
                r4 = r19
                boolean r5 = r13.F(r4)
                java.lang.Object r6 = r20.D()
                if (r5 != 0) goto L_0x0251
                U0.m$a r5 = U0.C4889m.f14007a
                java.lang.Object r5 = r5.a()
                if (r6 != r5) goto L_0x0259
            L_0x0251:
                Ai.t1 r6 = new Ai.t1
                r6.<init>(r4)
                r13.u(r6)
            L_0x0259:
                nI.a r6 = (nI.C17631a) r6
                r20.P()
                Ai.q1.j(r1, r6, r13, r3, r2)
                r20.P()
            L_0x0264:
                r20.P()
                r20.x()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0273
                U0.C4895p.R()
            L_0x0273:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ai.q1.e.c(s0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void j(androidx.compose.ui.d dVar, C17631a<C16807N> aVar, C4889m mVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        C4889m mVar2;
        C17631a<C16807N> aVar2 = aVar;
        int i13 = i10;
        int i14 = i11;
        C17542s.j(aVar2, "onPrimaryActionClicked");
        C4889m k10 = mVar.k(-1989397806);
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
        if ((2 & i14) != 0) {
            i12 |= 48;
        } else if ((i13 & 48) == 0) {
            i12 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            d.a aVar3 = i15 != 0 ? androidx.compose.ui.d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-1989397806, i12, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ErrorMessage (PurchaseHistoryScreen.kt:406)");
            }
            androidx.compose.ui.d i16 = D.i(aVar3, h.B((float) 16));
            C5437c.a aVar4 = C5437c.f24302a;
            I h10 = C5077h.h(aVar4.b(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, i16);
            C4504g.a aVar5 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar5.a();
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
            F1.c(a12, h10, aVar5.c());
            F1.c(a12, s10, aVar5.e());
            p<C4504g, Integer, C16807N> b10 = aVar5.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar5.d());
            C5079j jVar = C5079j.f18125a;
            C5073d.f d10 = C5073d.f18068a.d();
            C5437c.C0386c i17 = aVar4.i();
            d.a aVar6 = androidx.compose.ui.d.f18749a;
            I b11 = G.b(d10, i17, k10, 54);
            int a13 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, aVar6);
            C17631a<C4504g> a14 = aVar5.a();
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
            F1.c(a15, b11, aVar5.c());
            F1.c(a15, s11, aVar5.e());
            p<C4504g, Integer, C16807N> b12 = aVar5.b();
            if (a15.i() || !C17542s.e(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.w(Integer.valueOf(a13), b12);
            }
            F1.c(a15, e11, aVar5.d());
            C13607l.j(J1.j.b(Oo.b.f84536V8, k10, 0), C13679b.a.C2856b.f116680a, C5842M.e(C5843N.f28726a, aVar6, 1.0f, false, 2, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, 48, 0, 262136);
            androidx.compose.ui.d dVar3 = aVar3;
            mVar2 = k10;
            L.b(J1.j.b(Oo.b.f84750p7, k10, 0), (androidx.compose.ui.d) null, false, N.Secondary, M.Small, false, (Integer) null, (K0) null, (m) null, aVar, k10, ((i12 << 24) & 1879048192) | 27648, 486);
            mVar2.x();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = dVar3;
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C10594n1(dVar2, aVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k(androidx.compose.ui.d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        j(dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void l(C10702w wVar, p<? super f, ? super String, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(wVar, "purchaseItemSummary");
        C17542s.j(pVar, "onPurchaseClicked");
        C4889m k10 = mVar.k(-1023898489);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(wVar) : k10.F(wVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(pVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1023898489, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseEntry (PurchaseHistoryScreen.kt:287)");
            }
            B1.b(D.k(TC.e.i(androidx.compose.ui.d.f18749a), 0.0f, h.B((float) 8), 1, (Object) null), (i1) null, c1.c.e(-1444005192, true, new a(wVar, pVar), k10, 54), k10, 384, 2);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10591m1(wVar, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C10702w wVar, p pVar, int i10, C4889m mVar, int i11) {
        l(wVar, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n(Ei.C10702w r34, androidx.compose.ui.d r35, U0.C4889m r36, int r37, int r38) {
        /*
            r0 = r34
            r1 = r37
            r2 = r38
            r3 = 2
            r4 = 8
            r5 = -593449665(0xffffffffdca0ad3f, float:-3.61811859E17)
            r6 = r36
            U0.m r15 = r6.k(r5)
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
            if (r3 == 0) goto L_0x003a
            r6 = r6 | 48
        L_0x0037:
            r7 = r35
            goto L_0x004c
        L_0x003a:
            r7 = r1 & 48
            if (r7 != 0) goto L_0x0037
            r7 = r35
            boolean r8 = r15.V(r7)
            if (r8 == 0) goto L_0x0049
            r8 = 32
            goto L_0x004b
        L_0x0049:
            r8 = 16
        L_0x004b:
            r6 = r6 | r8
        L_0x004c:
            r8 = r6 & 19
            r9 = 18
            if (r8 != r9) goto L_0x0060
            boolean r8 = r15.l()
            if (r8 != 0) goto L_0x0059
            goto L_0x0060
        L_0x0059:
            r15.L()
            r3 = r7
            r5 = r15
            goto L_0x01fb
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x0066
        L_0x0065:
            r3 = r7
        L_0x0066:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0072
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseEntryInformationContent (PurchaseHistoryScreen.kt:364)"
            U0.C4895p.S(r5, r6, r7, r8)
        L_0x0072:
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r5.g()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$b r6 = r6.k()
            r7 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r15, r7)
            int r6 = U0.C4883j.a(r15, r7)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r15.m()
            if (r11 != 0) goto L_0x009e
            U0.C4883j.c()
        L_0x009e:
            r15.I()
            boolean r11 = r15.i()
            if (r11 == 0) goto L_0x00ab
            r15.p(r10)
            goto L_0x00ae
        L_0x00ab:
            r15.t()
        L_0x00ae:
            U0.m r10 = U0.F1.a(r15)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r5, r11)
            nI.p r5 = r9.e()
            U0.F1.c(r10, r7, r5)
            nI.p r5 = r9.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x00d8
            java.lang.Object r7 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x00e6
        L_0x00d8:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r10.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.w(r6, r5)
        L_0x00e6:
            nI.p r5 = r9.d()
            U0.F1.c(r10, r8, r5)
            s0.h r5 = s0.C5862h.f28810a
            r5 = -872411747(0xffffffffcc000d9d, float:-3.3568372E7)
            r15.W(r5)
            boolean r5 = r34.k()
            if (r5 == 0) goto L_0x013d
            IC.e r5 = r34.g()
            int r6 = IC.C13023e.f110931a
            java.lang.String r6 = r5.a(r15, r6)
            TC.b$a$c r7 = TC.C13679b.a.c.f116681a
            tK.v r5 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r15, r8)
            long r9 = r5.I0()
            r30 = 0
            r31 = 262132(0x3fff4, float:3.67325E-40)
            r8 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r5 = 0
            r35 = r15
            r15 = r5
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
            goto L_0x013f
        L_0x013d:
            r35 = r15
        L_0x013f:
            r35.P()
            java.lang.String r6 = r34.f()
            r5 = -872402506(0xffffffffcc0031b6, float:-3.3605336E7)
            r9 = r35
            r9.W(r5)
            if (r6 != 0) goto L_0x0152
            r5 = r9
            goto L_0x01b1
        L_0x0152:
            TC.b$a$c r7 = TC.C13679b.a.c.f116681a
            boolean r5 = r34.k()
            if (r5 == 0) goto L_0x0172
            r5 = -1040606185(0xffffffffc1f99c17, float:-31.201216)
            r9.W(r5)
            tK.v r5 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r9, r8)
            long r10 = r5.I0()
            r9.P()
        L_0x016f:
            r32 = r10
            goto L_0x0188
        L_0x0172:
            r5 = -1040530545(0xffffffffc1fac38f, float:-31.345488)
            r9.W(r5)
            tK.v r5 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r9, r8)
            long r10 = r5.K()
            r9.P()
            goto L_0x016f
        L_0x0188:
            r30 = 0
            r31 = 262132(0x3fff4, float:3.67325E-40)
            r8 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
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
            r5 = r9
            r9 = r32
            r28 = r5
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x01b1:
            r5.P()
            IC.e r6 = r34.e()
            r7 = -872390224(0xffffffffcc0061b0, float:-3.3654464E7)
            r5.W(r7)
            if (r6 != 0) goto L_0x01c1
            goto L_0x01ec
        L_0x01c1:
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            java.lang.String r8 = "INFORMATION_MESSAGE"
            androidx.compose.ui.d r9 = androidx.compose.ui.platform.C5116k1.a(r7, r8)
            float r4 = (float) r4
            float r11 = c2.h.B(r4)
            r14 = 13
            r15 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.m(r9, r10, r11, r12, r13, r14, r15)
            int r4 = IC.C13023e.f110931a
            java.lang.String r6 = r6.a(r5, r4)
            SC.m r7 = SC.C13611m.INFORMATIVE
            r13 = 200112(0x30db0, float:2.80417E-40)
            r14 = 16
            r8 = 0
            r10 = 0
            r11 = 1
            r12 = r5
            SC.R0.e(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x01ec:
            r5.P()
            r5.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x01fb
            U0.C4895p.R()
        L_0x01fb:
            U0.Y0 r4 = r5.n()
            if (r4 == 0) goto L_0x0209
            Ai.p1 r5 = new Ai.p1
            r5.<init>(r0, r3, r1, r2)
            r4.a(r5)
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.q1.n(Ei.w, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C10702w wVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        n(wVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void p(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-1624984896);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1624984896, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseHistoryFullScreenLoading (PurchaseHistoryScreen.kt:151)");
            }
            androidx.compose.ui.d a10 = C5116k1.a(TC.e.i(androidx.compose.ui.d.f18749a), "LOADING_TEST_TAG");
            I a11 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, a10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a13);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, a11, aVar.c());
            F1.c(a14, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar.d());
            C5862h hVar = C5862h.f28810a;
            k10.W(-215495017);
            for (int i11 = 0; i11 < 4; i11++) {
                d.a aVar2 = androidx.compose.ui.d.f18749a;
                C5844O.a(J.i(aVar2, h.B((float) 32)), k10, 6);
                H2.b(J.i(aVar2, h.B((float) 184)), false, k10, 6, 2);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10579i1(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N q(int i10, C4889m mVar, int i11) {
        p(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void r(C10703x.a aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17631a<C16807N> aVar4, p<? super f, ? super String, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C10703x.a aVar5 = aVar;
        C17631a<C16807N> aVar6 = aVar2;
        C17631a<C16807N> aVar7 = aVar3;
        C17631a<C16807N> aVar8 = aVar4;
        p<? super f, ? super String, C16807N> pVar2 = pVar;
        int i12 = i10;
        C17542s.j(aVar5, "purchaseHistoryState");
        C17542s.j(aVar6, "onTopAppBarBackClicked");
        C17542s.j(aVar7, "onSearchOrderClicked");
        C17542s.j(aVar8, "onErrorDismissed");
        C17542s.j(pVar2, "onPurchaseClicked");
        C4889m k10 = mVar.k(-1118299252);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(aVar5) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar6) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar7) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar8) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(pVar2) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1118299252, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseHistoryScreen (PurchaseHistoryScreen.kt:86)");
            }
            mVar2 = k10;
            C4762x0.a((androidx.compose.ui.d) null, c1.c.e(1214863952, true, new b(aVar6), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(739865755, true, new c(aVar5, aVar8, pVar2, aVar7), k10, 54), mVar2, 805306416, 509);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C10576h1(aVar, aVar2, aVar3, aVar4, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C10703x.a aVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, p pVar, int i10, C4889m mVar, int i11) {
        r(aVar, aVar2, aVar3, aVar4, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void t(E4.a<C10702w> aVar, boolean z10, p<? super f, ? super String, C16807N> pVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        E4.a<C10702w> aVar3 = aVar;
        boolean z11 = z10;
        p<? super f, ? super String, C16807N> pVar2 = pVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C4889m k10 = mVar.k(1258526500);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(aVar3) : k10.F(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(pVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1258526500, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchasesList (PurchaseHistoryScreen.kt:171)");
            }
            boolean z12 = aVar.i().d() instanceof C6447v.b;
            k10.W(-579942085);
            Object D10 = k10.D();
            C4889m.a aVar5 = C4889m.f14007a;
            if (D10 == aVar5.a()) {
                D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            boolean z13 = z12 && ((Boolean) r0Var.getValue()).booleanValue();
            R0.e r10 = R0.c.r(k10, 0);
            androidx.compose.ui.d f10 = J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null);
            k10.W(-579920769);
            boolean b10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && k10.F(aVar3))) | k10.b(z12);
            Object D11 = k10.D();
            if (b10 || D11 == aVar5.a()) {
                D11 = new C10582j1(r0Var, z12, aVar3);
                k10.u(D11);
            }
            k10.P();
            mVar2 = k10;
            R0.c.d(z13, (C17631a) D11, f10, r10, (C5437c) null, c1.c.e(376130941, true, new d(r10, z13), k10, 54), c1.c.e(-1775352194, true, new e(aVar3, z11, aVar4, pVar2), k10, 54), k10, 1769856, 16);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C10585k1(aVar, z10, pVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C4899r0 r0Var, boolean z10, E4.a aVar) {
        String str;
        r0Var.setValue(Boolean.TRUE);
        boolean z11 = !z10;
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("onRefresh, allow: " + z11, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "PurchasesList";
            } else {
                str = str3;
            }
            bVar.a(eVar, str, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str;
        }
        if (!z10) {
            aVar.k();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(E4.a aVar, boolean z10, p pVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        t(aVar, z10, pVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void w(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "onTopAppBarBackClicked");
        C4889m k10 = mVar.k(-1438659833);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1438659833, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchasesTopAppBar (PurchaseHistoryScreen.kt:142)");
            }
            ol.p.c(v.BACK, aVar, (androidx.compose.ui.d) null, J1.j.b(C12272a.f105818g1, k10, 0), (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, k10, ((i11 << 3) & 112) | 6, 500);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10588l1(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N x(C17631a aVar, int i10, C4889m mVar, int i11) {
        w(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void y(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C17631a<C16807N> aVar2 = aVar;
        C4889m k10 = mVar.k(800274725);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.F(aVar2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(800274725, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.SearchOrderContent (PurchaseHistoryScreen.kt:271)");
            }
            mVar2 = k10;
            C13585f1.c(J1.j.b(C12272a.f105779Q0, k10, 0), aVar, C5116k1.a(androidx.compose.ui.d.f18749a, "SEARCH_ICON_BUTTON"), J1.j.b(C12272a.f105781R0, k10, 0), (C13573c1) null, C13569b1.d.f116148b, (String) null, (p<? super C4889m, ? super Integer, C16807N>) null, (C13589g1) null, 0.0f, true, false, (m) null, mVar2, ((i11 << 3) & 112) | 384 | (C13569b1.d.f116149c << 15), 6, 7120);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C10597o1(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N z(C17631a aVar, int i10, C4889m mVar, int i11) {
        y(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
