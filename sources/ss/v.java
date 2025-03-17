package ss;

import B0.C4373q;
import Ds.t;
import Ds.u;
import E1.C4478k;
import E1.I;
import G1.C4504g;
import IC.C13023e;
import IC.C13026h;
import KJ.C15988d;
import N1.G;
import N1.P;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13593h1;
import SC.C13597i1;
import SC.C13605k1;
import SC.C13607l;
import SC.F0;
import SC.G0;
import SC.H0;
import TC.C13679b;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.y;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5074e;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gs.C11352b;
import gs.e;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5749w0;
import p1.i1;
import r0.m;
import s0.C5844O;
import s0.C5852X;
import s0.C5857c;
import t0.C5938c;
import t0.x;
import t1.C5942c;
import tK.C18027s;
import tK.C18029u;
import uI.C18059h;
import uK.C18146a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a9\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001aM\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0012\u0010\u0011\u001aC\u0010\u0015\u001a\u00020\u0003*\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00142\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u001b\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001e\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 ²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u0002"}, d2 = {"LDs/u;", "viewModel", "Lkotlin/Function0;", "LXH/N;", "onBack", "Lkotlin/Function1;", "", "navigateTo", "w", "(LDs/u;LnI/a;LnI/l;LU0/m;I)V", "LDs/u$b;", "uiState", "LDs/t;", "onEvent", "v", "(LDs/u$b;LnI/l;LnI/a;LnI/l;LU0/m;I)V", "n", "(LU0/m;I)V", "p", "Ls0/c;", "LDs/u$b$c;", "r", "(Ls0/c;LDs/u$b$c;LnI/l;LnI/l;LU0/m;I)V", "onCloseClicked", "Landroidx/compose/ui/d;", "modifier", "content", "l", "(LnI/a;Landroidx/compose/ui/d;LnI/q;LU0/m;II)V", "onQuitClicked", "j", "(LnI/a;LU0/m;I)V", "inbox-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.compose.NotificationDetailsScreenKt$NotificationDetailsContent$1$1", f = "NotificationDetailsScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f102663c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u.b.c f102664d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f102665e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<t, C16807N> f102666f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u.b.c cVar, C17642l<? super String, C16807N> lVar, C17642l<? super t, C16807N> lVar2, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f102664d = cVar;
            this.f102665e = lVar;
            this.f102666f = lVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f102664d, this.f102665e, this.f102666f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f102663c == 0) {
                y.b(obj);
                String f10 = this.f102664d.f();
                if (f10 != null) {
                    C17642l<String, C16807N> lVar = this.f102665e;
                    C17642l<t, C16807N> lVar2 = this.f102666f;
                    lVar.invoke(f10);
                    lVar2.invoke(t.b.f80275a);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u.b.c f102667a;

        b(u.b.c cVar) {
            this.f102667a = cVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(u.b.c cVar, e.a aVar) {
            C17542s.j(aVar, "$this$ikeaImageRequest");
            aVar.j(cVar.h());
            aVar.k(Integer.valueOf(C18146a.f148160N5));
            return C16807N.f139792a;
        }

        public final void b(C5938c cVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1561246922, i11, -1, "com.ingka.ikea.inbox.impl.compose.NotificationDetailsContent.<anonymous>.<anonymous>.<anonymous> (NotificationDetailsScreen.kt:139)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d d10 = androidx.compose.foundation.b.d(C5074e.b(J.h(aVar, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), C18027s.a().m0(), (i1) null, 2, (Object) null);
                mVar2.W(-836268356);
                boolean V10 = mVar2.V(this.f102667a);
                u.b.c cVar2 = this.f102667a;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new w(cVar2);
                    mVar2.u(D10);
                }
                mVar.P();
                C11352b.b(gs.f.a((C17642l) D10, mVar2, 0), this.f102667a.i(), d10, (C5942c) null, (C5942c) null, (C5942c) null, (C5437c) null, C4478k.f5915a.a(), 0.0f, (C5749w0) null, 0, mVar, gs.e.f97946h | 12582912, 0, 1912);
                C5844O.a(J.i(aVar, h.B((float) 4)), mVar2, 6);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u.b.c f102668a;

        c(u.b.c cVar) {
            this.f102668a = cVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1499160033, i11, -1, "com.ingka.ikea.inbox.impl.compose.NotificationDetailsContent.<anonymous>.<anonymous>.<anonymous> (NotificationDetailsScreen.kt:154)");
                }
                C13607l.j(this.f102668a.g(), C13679b.C2857b.a.f116683a, TC.e.i(androidx.compose.ui.d.f18749a), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262136);
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
    static final class d implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u.b.c f102669a;

        d(u.b.c cVar) {
            this.f102669a = cVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(619890942, i11, -1, "com.ingka.ikea.inbox.impl.compose.NotificationDetailsContent.<anonymous>.<anonymous>.<anonymous> (NotificationDetailsScreen.kt:161)");
                }
                Bl.c.c(C13026h.c(this.f102669a.c()), TC.e.i(androidx.compose.ui.d.f18749a), (G) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, (C15988d<String, C4373q>) null, (C17642l<? super P, C16807N>) null, (C13679b) null, mVar, C13023e.f110931a, 0, 262140);
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
    /* synthetic */ class e extends C17540p implements C17642l<t, C16807N> {
        e(Object obj) {
            super(1, obj, u.class, "onEvent", "onEvent$inbox_implementation_release(Lcom/ingka/ikea/inbox/impl/viewmodel/NotificationDetailsEvents;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((t) obj);
            return C16807N.f139792a;
        }

        public final void t(t tVar) {
            C17542s.j(tVar, "p0");
            ((u) this.receiver).H(tVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u.b f102670a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<t, C16807N> f102671b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f102672c;

        f(u.b bVar, C17642l<? super t, C16807N> lVar, C17642l<? super String, C16807N> lVar2) {
            this.f102670a = bVar;
            this.f102671b = lVar;
            this.f102672c = lVar2;
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$ClosableBoxContent");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(cVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(182254881, i10, -1, "com.ingka.ikea.inbox.impl.compose.NotificationDetailsScreen.<anonymous> (NotificationDetailsScreen.kt:82)");
                }
                u.b bVar = this.f102670a;
                if (C17542s.e(bVar, u.b.a.f80290a)) {
                    mVar.W(835981499);
                    v.n(mVar, 0);
                    mVar.P();
                } else if (bVar instanceof u.b.C1515b) {
                    mVar.W(835983990);
                    v.p(mVar, 0);
                    mVar.P();
                } else if (bVar instanceof u.b.c) {
                    mVar.W(145790157);
                    v.r(cVar, (u.b.c) this.f102670a, this.f102671b, this.f102672c, mVar, i10 & 14);
                    mVar.P();
                } else {
                    mVar.W(835979533);
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

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    private static final void j(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1353967371);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1353967371, i11, -1, "com.ingka.ikea.inbox.impl.compose.BackButton (NotificationDetailsScreen.kt:203)");
            }
            F0.b(C18146a.f148719y, J1.j.b(Oo.b.f84665i, k10, 0), D.i(C5852X.e(androidx.compose.ui.d.f18749a), C18029u.f147649a.d()), false, H0.PrimaryInverseStatic, G0.Small, (m) null, false, aVar, k10, ((i11 << 24) & 234881024) | 221184, 200);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new u(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17631a aVar, int i10, C4889m mVar, int i11) {
        j(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void l(C17631a<C16807N> aVar, androidx.compose.ui.d dVar, q<? super C5857c, ? super C4889m, ? super Integer, C16807N> qVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(aVar, "onCloseClicked");
        C17542s.j(qVar, "content");
        C4889m k10 = mVar.k(-435001988);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.F(qVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-435001988, i12, -1, "com.ingka.ikea.inbox.impl.compose.ClosableBoxContent (NotificationDetailsScreen.kt:194)");
            }
            androidx.compose.ui.d f10 = J.f(dVar, 0.0f, 1, (Object) null);
            I h10 = C5077h.h(C5437c.f24302a.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, f10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
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
            F1.c(a12, h10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar2.d());
            qVar.invoke(C5079j.f18125a, k10, Integer.valueOf(((i12 >> 3) & 112) | 6));
            j(aVar, k10, i12 & 14);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        androidx.compose.ui.d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new s(aVar, dVar2, qVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C17631a aVar, androidx.compose.ui.d dVar, q qVar, int i10, int i11, C4889m mVar, int i12) {
        l(aVar, dVar, qVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void n(C4889m mVar, int i10) {
        C4889m mVar2;
        int i11 = i10;
        C4889m k10 = mVar.k(483551153);
        if (i11 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(483551153, i11, -1, "com.ingka.ikea.inbox.impl.compose.ErrorMessage (NotificationDetailsScreen.kt:97)");
            }
            androidx.compose.ui.d i12 = D.i(J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), h.B((float) 24));
            I h10 = C5077h.h(C5437c.f24302a.e(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, i12);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
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
            F1.c(a12, h10, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar.d());
            C5079j jVar = C5079j.f18125a;
            mVar2 = k10;
            C13607l.i(C13026h.c(J1.j.b(Oo.b.f84812v3, k10, 0)), C13679b.C2857b.C2858b.f116684a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, j.h(j.f14783b.a()), (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, C13023e.f110931a | 48, 0, 261116);
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
            n10.a(new r(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o(int i10, C4889m mVar, int i11) {
        n(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void p(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-1822239182);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1822239182, i10, -1, "com.ingka.ikea.inbox.impl.compose.Loading (NotificationDetailsScreen.kt:108)");
            }
            androidx.compose.ui.d f10 = J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null);
            I h10 = C5077h.h(C5437c.f24302a.e(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, f10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
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
            F1.c(a12, h10, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar.d());
            C5079j jVar = C5079j.f18125a;
            C13605k1.b((androidx.compose.ui.d) null, (C13597i1) null, C13593h1.Large, k10, 384, 3);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new t(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N q(int i10, C4889m mVar, int i11) {
        p(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(s0.C5857c r30, Ds.u.b.c r31, nI.C17642l<? super Ds.t, XH.C16807N> r32, nI.C17642l<? super java.lang.String, XH.C16807N> r33, U0.C4889m r34, int r35) {
        /*
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r35
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "uiState"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "navigateTo"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = 717874250(0x2ac9e44a, float:3.586318E-13)
            r6 = r34
            U0.m r15 = r6.k(r0)
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0036
            boolean r6 = r15.V(r1)
            if (r6 == 0) goto L_0x0033
            r6 = 4
            goto L_0x0034
        L_0x0033:
            r6 = 2
        L_0x0034:
            r6 = r6 | r5
            goto L_0x0037
        L_0x0036:
            r6 = r5
        L_0x0037:
            r7 = r5 & 48
            r8 = 16
            r14 = 32
            if (r7 != 0) goto L_0x0049
            boolean r7 = r15.V(r2)
            if (r7 == 0) goto L_0x0047
            r7 = r14
            goto L_0x0048
        L_0x0047:
            r7 = r8
        L_0x0048:
            r6 = r6 | r7
        L_0x0049:
            r7 = r5 & 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x005a
            boolean r7 = r15.F(r3)
            if (r7 == 0) goto L_0x0057
            r7 = r13
            goto L_0x0059
        L_0x0057:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r6 = r6 | r7
        L_0x005a:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            r9 = 2048(0x800, float:2.87E-42)
            if (r7 != 0) goto L_0x006b
            boolean r7 = r15.F(r4)
            if (r7 == 0) goto L_0x0068
            r7 = r9
            goto L_0x006a
        L_0x0068:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x006a:
            r6 = r6 | r7
        L_0x006b:
            r7 = r6 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r7 != r10) goto L_0x007f
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x0078
            goto L_0x007f
        L_0x0078:
            r15.L()
            r19 = r15
            goto L_0x01f4
        L_0x007f:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x008b
            r7 = -1
            java.lang.String r10 = "com.ingka.ikea.inbox.impl.compose.NotificationDetailsContent (NotificationDetailsScreen.kt:121)"
            U0.C4895p.S(r0, r6, r7, r10)
        L_0x008b:
            java.lang.String r0 = r31.f()
            r7 = 177488419(0xa944223, float:1.427676E-32)
            r15.W(r7)
            r12 = r6 & 112(0x70, float:1.57E-43)
            r11 = 0
            r10 = 1
            if (r12 != r14) goto L_0x009d
            r7 = r10
            goto L_0x009e
        L_0x009d:
            r7 = r11
        L_0x009e:
            r14 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != r9) goto L_0x00a4
            r9 = r10
            goto L_0x00a5
        L_0x00a4:
            r9 = r11
        L_0x00a5:
            r7 = r7 | r9
            r14 = r6 & 896(0x380, float:1.256E-42)
            if (r14 != r13) goto L_0x00ac
            r6 = r10
            goto L_0x00ad
        L_0x00ac:
            r6 = r11
        L_0x00ad:
            r6 = r6 | r7
            java.lang.Object r7 = r15.D()
            r9 = 0
            if (r6 != 0) goto L_0x00bd
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x00c5
        L_0x00bd:
            ss.v$a r7 = new ss.v$a
            r7.<init>(r2, r4, r3, r9)
            r15.u(r7)
        L_0x00c5:
            nI.p r7 = (nI.p) r7
            r15.P()
            U0.P.g(r0, r7, r15, r11)
            java.lang.String r0 = r31.e()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00d9
            r0 = r10
            goto L_0x00da
        L_0x00d9:
            r0 = r11
        L_0x00da:
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r6 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.f(r7, r6, r10, r9)
            if (r0 == 0) goto L_0x00ec
            tK.u r17 = tK.C18029u.f147649a
            float r17 = r17.k()
            r21 = r17
            goto L_0x00f3
        L_0x00ec:
            float r6 = (float) r11
            float r6 = c2.h.B(r6)
            r21 = r6
        L_0x00f3:
            r22 = 7
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            s0.E r18 = androidx.compose.foundation.layout.D.e(r18, r19, r20, r21, r22, r23)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            androidx.compose.foundation.layout.d$f r19 = r6.n(r8)
            r6 = 177504025(0xa947f19, float:1.429969E-32)
            r15.W(r6)
            r8 = 32
            if (r12 != r8) goto L_0x0118
            r6 = r10
            goto L_0x0119
        L_0x0118:
            r6 = r11
        L_0x0119:
            java.lang.Object r8 = r15.D()
            if (r6 != 0) goto L_0x0127
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x012f
        L_0x0127:
            ss.o r8 = new ss.o
            r8.<init>(r2)
            r15.u(r8)
        L_0x012f:
            r20 = r8
            nI.l r20 = (nI.C17642l) r20
            r15.P()
            r21 = 24582(0x6006, float:3.4447E-41)
            r22 = 234(0xea, float:3.28E-43)
            r8 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r6 = r16
            r27 = r7
            r7 = r8
            r16 = 32
            r8 = r18
            r9 = r23
            r10 = r19
            r18 = r11
            r11 = r24
            r28 = r12
            r12 = r25
            r13 = r26
            r29 = r14
            r14 = r20
            r34 = r15
            r16 = r21
            r17 = r22
            t0.C5937b.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x01e9
            r7 = r27
            r0 = 1
            r6 = 0
            r8 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r7, r8, r0, r6)
            androidx.compose.ui.d r7 = TC.e.i(r6)
            tK.u r6 = tK.C18029u.f147649a
            float r9 = r6.a()
            float r11 = r6.d()
            r12 = 5
            r13 = 0
            r8 = 0
            r10 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r7, r8, r9, r10, r11, r12, r13)
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c r7 = r7.b()
            androidx.compose.ui.d r6 = r1.a(r6, r7)
            java.lang.String r7 = "TestTag-NotificationCTA"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r6, r7)
            java.lang.String r6 = r31.d()
            r8 = 177547695(0xa9529af, float:1.4363858E-32)
            r15 = r34
            r15.W(r8)
            r9 = r29
            r8 = 256(0x100, float:3.59E-43)
            if (r9 != r8) goto L_0x01b0
            r11 = r0
        L_0x01ab:
            r9 = r28
            r8 = 32
            goto L_0x01b3
        L_0x01b0:
            r11 = r18
            goto L_0x01ab
        L_0x01b3:
            if (r9 != r8) goto L_0x01b6
            goto L_0x01b8
        L_0x01b6:
            r0 = r18
        L_0x01b8:
            r0 = r0 | r11
            java.lang.Object r8 = r15.D()
            if (r0 != 0) goto L_0x01c7
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r8 != r0) goto L_0x01cf
        L_0x01c7:
            ss.p r8 = new ss.p
            r8.<init>(r3, r2)
            r15.u(r8)
        L_0x01cf:
            r0 = r8
            nI.a r0 = (nI.C17631a) r0
            r15.P()
            r17 = 0
            r18 = 508(0x1fc, float:7.12E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r19 = r15
            r15 = r0
            r16 = r19
            SC.L.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x01eb
        L_0x01e9:
            r19 = r34
        L_0x01eb:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01f4
            U0.C4895p.R()
        L_0x01f4:
            U0.Y0 r6 = r19.n()
            if (r6 == 0) goto L_0x020d
            ss.q r7 = new ss.q
            r0 = r7
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r35
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.v.r(s0.c, Ds.u$b$c, nI.l, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N s(u.b.c cVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        x xVar2 = xVar;
        x.i(xVar2, (Object) null, (Object) null, c1.c.c(-1561246922, true, new b(cVar)), 3, (Object) null);
        x.i(xVar2, (Object) null, (Object) null, c1.c.c(-1499160033, true, new c(cVar)), 3, (Object) null);
        x.i(xVar2, (Object) null, (Object) null, c1.c.c(619890942, true, new d(cVar)), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C17642l lVar, u.b.c cVar) {
        lVar.invoke(new t.a(cVar.e()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C5857c cVar, u.b.c cVar2, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        r(cVar, cVar2, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void v(u.b bVar, C17642l<? super t, C16807N> lVar, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C17542s.j(bVar, "uiState");
        C17542s.j(lVar, "onEvent");
        C17542s.j(aVar, "onBack");
        C17542s.j(lVar2, "navigateTo");
        C4889m k10 = mVar.k(-1387202276);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= k10.F(lVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1387202276, i11, -1, "com.ingka.ikea.inbox.impl.compose.NotificationDetailsScreen (NotificationDetailsScreen.kt:78)");
            }
            l(aVar, (androidx.compose.ui.d) null, c1.c.e(182254881, true, new f(bVar, lVar, lVar2), k10, 54), k10, ((i11 >> 6) & 14) | 384, 2);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new n(bVar, lVar, aVar, lVar2, i10));
        }
    }

    public static final void w(u uVar, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(uVar, "viewModel");
        C17542s.j(aVar, "onBack");
        C17542s.j(lVar, "navigateTo");
        C4889m k10 = mVar.k(-195137037);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(uVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(lVar) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-195137037, i12, -1, "com.ingka.ikea.inbox.impl.compose.NotificationDetailsScreen (NotificationDetailsScreen.kt:61)");
            }
            u.b x10 = x(j3.a.c(uVar.m(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7));
            k10.W(-531211840);
            boolean F10 = k10.F(uVar);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new e(uVar);
                k10.u(D10);
            }
            k10.P();
            v(x10, (C17642l) ((C18059h) D10), aVar, lVar, k10, (i12 << 3) & 8064);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new m(uVar, aVar, lVar, i10));
        }
    }

    private static final u.b x(A1<? extends u.b> a12) {
        return (u.b) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N y(u uVar, C17631a aVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        w(uVar, aVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(u.b bVar, C17642l lVar, C17631a aVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        v(bVar, lVar, aVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
