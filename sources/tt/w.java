package Tt;

import B0.C4373q;
import E1.C4478k;
import E1.I;
import G1.C4504g;
import H0.C4545x;
import IC.C13021c;
import IC.C13023e;
import KJ.C15988d;
import N1.C4669d;
import N1.D;
import N1.G;
import N1.P;
import O0.F0;
import QJ.Q;
import QJ.T;
import Qt.z;
import Rt.b;
import Rt.c;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import SC.C13607l;
import SC.C13616n0;
import SC.C13620o0;
import SC.C13624p0;
import SC.G0;
import SC.H0;
import SC.H2;
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
import XH.t;
import XH.y;
import Y1.f;
import Y1.j;
import Y1.k;
import Y1.o;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c2.i;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import jt.b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.C10027d;
import n0.C5583F;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p0.s;
import p1.C5749w0;
import p1.g1;
import p1.i1;
import r1.g;
import s0.C5843N;
import s0.C5844O;
import s0.C5852X;
import s0.C5857c;
import s0.C5858d;
import s0.C5859e;
import s0.C5862h;
import t1.C5942c;
import tK.C18029u;
import tK.C18030v;
import uK.C18148c;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u001ac\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a]\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a]\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0013\u0010\u0010\u001a\u000f\u0010\u0014\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010!\u001a\u00020\u0003*\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b!\u0010\"\u001a?\u0010(\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\t2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\tH\u0001¢\u0006\u0004\b+\u0010,¨\u0006-²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u0002"}, d2 = {"LRt/d;", "viewModel", "Lkotlin/Function0;", "LXH/N;", "onCloseClicked", "onTimeSlotsClicked", "onLoginClicked", "onUpgradeClicked", "Lkotlin/Function1;", "", "onRegisterClicked", "E", "(LRt/d;LnI/a;LnI/a;LnI/a;LnI/a;LnI/l;LU0/m;I)V", "LRt/c;", "state", "M", "(LRt/c;LnI/a;LnI/a;LnI/a;LnI/a;LnI/a;LU0/m;I)V", "Q", "(LnI/a;LU0/m;I)V", "O", "y", "(LU0/m;I)V", "imageUrl", "u", "(Ljava/lang/String;LnI/a;LU0/m;I)V", "LSt/a;", "model", "A", "(LSt/a;LnI/a;LU0/m;I)V", "C", "(LSt/a;LU0/m;I)V", "Ls0/c;", "onClick", "s", "(Ls0/c;LnI/a;LU0/m;I)V", "dateLabel", "moreSessionsLabel", "", "isRegistered", "isOnWaitingList", "w", "(Ljava/lang/String;Ljava/lang/String;ZZLnI/a;LU0/m;I)V", "text", "q", "(Ljava/lang/String;LU0/m;I)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f87978a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f87979b;

        a(String str, C17631a<C16807N> aVar) {
            this.f87978a = str;
            this.f87979b = aVar;
        }

        public final void a(C5859e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(eVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1095737537, i10, -1, "com.ingka.ikea.instore.impl.storeevents.details.ui.ImageHeader.<anonymous> (StoreEventDetailsScreen.kt:356)");
                }
                z.c(this.f87978a, i.b(eVar.c(), eVar.d()), (androidx.compose.ui.d) null, mVar, 0, 4);
                w.s(eVar, this.f87979b, mVar, i10 & 14);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ St.a f87980a;

        b(St.a aVar) {
            this.f87980a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1754176633, i11, -1, "com.ingka.ikea.instore.impl.storeevents.details.ui.StoreEventDetailsContentDescription.<anonymous>.<anonymous> (StoreEventDetailsScreen.kt:460)");
                }
                C13607l.j(this.f87980a.c().a(mVar2, C13023e.f110931a), C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, C18030v.f147664a.a(mVar2, C18030v.f147665b).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262132);
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.storeevents.details.ui.StoreEventDetailsScreenKt$StoreEventDetailsScreen$3$1", f = "StoreEventDetailsScreen.kt", l = {118}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f87981c;

        /* renamed from: d  reason: collision with root package name */
        int f87982d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ F0 f87983e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Rt.d f87984f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f87985g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ A1<Rt.c> f87986h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(F0 f02, Rt.d dVar, C17642l<? super String, C16807N> lVar, A1<Rt.c> a12, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f87983e = f02;
            this.f87984f = dVar;
            this.f87985g = lVar;
            this.f87986h = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f87983e, this.f87984f, this.f87985g, this.f87986h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f87982d;
            if (i10 == 0) {
                y.b(obj);
                c.a d10 = w.F(this.f87986h).d();
                if (C17542s.e(d10, c.a.b.f87020a)) {
                    F0 f02 = this.f87983e;
                    this.f87981c = d10;
                    this.f87982d = 1;
                    if (f02.p(this) == f10) {
                        return f10;
                    }
                } else if (d10 instanceof c.a.d) {
                    this.f87984f.b(b.a.f87011a);
                    this.f87985g.invoke(((c.a.d) d10).a());
                } else if (!(d10 instanceof c.a.C1802a) && !C17542s.e(d10, c.a.C1803c.f87021a) && d10 != null) {
                    throw new t();
                }
            } else if (i10 == 1) {
                c.a aVar = (c.a) this.f87981c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.storeevents.details.ui.StoreEventDetailsScreenKt$StoreEventDetailsScreen$6$1$1", f = "StoreEventDetailsScreen.kt", l = {145}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f87987c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F0 f87988d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(F0 f02, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f87988d = f02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f87988d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f87987c;
            if (i10 == 0) {
                y.b(obj);
                F0 f02 = this.f87988d;
                this.f87987c = 1;
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f87989a;

        e(C17631a<C16807N> aVar) {
            this.f87989a = aVar;
        }

        public final void a(C5859e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(eVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1564415067, i10, -1, "com.ingka.ikea.instore.impl.storeevents.details.ui.StoreEventDetailsScreenUiLoading.<anonymous> (StoreEventDetailsScreen.kt:190)");
                }
                H2.b(J.u(androidx.compose.ui.d.f18749a, i.b(eVar.c(), f.f87926a.a())), false, mVar, 0, 2);
                w.s(eVar, this.f87989a, mVar, i10 & 14);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    private static final void A(St.a aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        int i12;
        int i13;
        St.a aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i14 = i10;
        C4889m k10 = mVar.k(-2017467860);
        if ((i14 & 6) == 0) {
            i11 = (k10.F(aVar3) ? 4 : 2) | i14;
        } else {
            i11 = i14;
        }
        if ((i14 & 48) == 0) {
            i11 |= k10.F(aVar4) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2017467860, i11, -1, "com.ingka.ikea.instore.impl.storeevents.details.ui.StoreEventDetailsContent (StoreEventDetailsScreen.kt:368)");
            }
            d.a aVar5 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d i15 = TC.e.i(J.h(aVar5, 0.0f, 1, (Object) null));
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, i15);
            C4504g.a aVar6 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar6.a();
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
            F1.c(a13, a10, aVar6.c());
            F1.c(a13, s10, aVar6.e());
            p<C4504g, Integer, C16807N> b10 = aVar6.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar6.d());
            C5862h hVar = C5862h.f28810a;
            C18029u uVar = C18029u.f147649a;
            C5844O.a(J.i(aVar5, uVar.g()), k10, 0);
            C13023e b11 = aVar.b();
            k10.W(144069733);
            if (b11 == null) {
                i12 = 0;
            } else {
                i12 = 0;
                C13616n0.b(b11.a(k10, C13023e.f110931a), C13620o0.IkeaFamilyPrice, (androidx.compose.ui.d) null, C13624p0.Subtle, k10, 3120, 4);
            }
            k10.P();
            C13023e h10 = aVar.h();
            int i16 = C13023e.f110931a;
            String a14 = h10.a(k10, i16);
            C13679b.C2857b.a aVar7 = C13679b.C2857b.a.f116683a;
            C.a aVar8 = C.f13316b;
            C a15 = aVar8.a();
            C18030v vVar = C18030v.f147664a;
            int i17 = C18030v.f147665b;
            C4889m mVar3 = k10;
            C13607l.j(a14, aVar7, (androidx.compose.ui.d) null, vVar.a(k10, i17).G0(), 0, (C4830x) null, a15, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 1572912, 0, 262068);
            C5844O.a(J.i(aVar5, uVar.j()), k10, i12);
            String a16 = aVar.f().a(k10, i16);
            C13679b.a.C2856b bVar = C13679b.a.C2856b.f116680a;
            int i18 = i17;
            C18030v vVar2 = vVar;
            int i19 = i18;
            C13607l.j(a16, bVar, (androidx.compose.ui.d) null, vVar2.a(k10, i18).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262132);
            C5844O.a(J.i(aVar5, uVar.g()), k10, i12);
            String a17 = aVar.j().d().a(k10, i16);
            String a18 = aVar.j().c().a(k10, i16);
            G g10 = r12;
            G g11 = new G(0, 0, aVar8.a(), (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (U1.e) null, 0, (k) null, (g1) null, (D) null, (g) null, 65531, (DefaultConstructorMarker) null);
            C4669d e11 = C13021c.e(a17, a18, g10);
            int i20 = i19;
            C18030v vVar3 = vVar2;
            C13607l.h(e11, bVar, (androidx.compose.ui.d) null, vVar3.a(k10, i20).H0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C15988d<String, C4373q>) null, (C17642l<? super P, C16807N>) null, k10, 48, 0, 524276);
            k10.W(144108828);
            if (aVar.d()) {
                i13 = i20;
                C13607l.j(J1.j.b(st.c.f102730P0, k10, i12), bVar, (androidx.compose.ui.d) null, vVar3.a(k10, i20).I0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, 48, 0, 262132);
                C5844O.a(J.i(aVar5, uVar.j()), k10, i12);
            } else {
                i13 = i20;
            }
            k10.P();
            String b12 = J1.j.b(st.c.f102700A0, k10, i12);
            C13679b.C2857b.f fVar = C13679b.C2857b.f.f116688a;
            C a19 = aVar8.a();
            int i21 = i13;
            C13607l.j(b12, fVar, (androidx.compose.ui.d) null, vVar3.a(k10, i21).G0(), 0, (C4830x) null, a19, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, 1572912, 0, 262068);
            C5844O.a(J.i(aVar5, uVar.j()), k10, i12);
            String a20 = aVar.i().a(k10, i16);
            C13023e g12 = aVar.g();
            k10.W(144133508);
            String a21 = g12 == null ? null : g12.a(k10, i16);
            k10.P();
            int i22 = i21;
            int i23 = i16;
            C18030v vVar4 = vVar3;
            int i24 = i12;
            d.a aVar9 = aVar5;
            C4889m mVar4 = k10;
            w(a20, a21, aVar.l() instanceof b.f.a.e, aVar.l() instanceof b.f.a.d, aVar2, k10, 57344 & (i11 << 9));
            C13023e g13 = aVar.g();
            mVar4.W(144141979);
            if (g13 == null) {
                mVar2 = mVar4;
            } else {
                C5844O.a(J.i(aVar9, uVar.j()), mVar4, 0);
                mVar2 = mVar4;
                C13607l.j(g13.a(mVar4, i23), C13679b.a.c.f116681a, (androidx.compose.ui.d) null, vVar4.a(mVar2, i22).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262132);
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
            n10.a(new k(aVar3, aVar4, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N B(St.a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        A(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void C(St.a aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        St.a aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(615267392);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(615267392, i11, -1, "com.ingka.ikea.instore.impl.storeevents.details.ui.StoreEventDetailsContentDescription (StoreEventDetailsScreen.kt:445)");
            }
            d.a aVar3 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d i13 = TC.e.i(J.h(aVar3, 0.0f, 1, (Object) null));
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, i13);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar4.a();
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
            F1.c(a13, a10, aVar4.c());
            F1.c(a13, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b10 = aVar4.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar4.d());
            C5862h hVar = C5862h.f28810a;
            C18029u uVar = C18029u.f147649a;
            C5844O.a(J.i(aVar3, uVar.g()), k10, 0);
            C4889m mVar3 = k10;
            C13607l.j(J1.j.b(st.c.f102821x0, k10, 0), C13679b.C2857b.f.f116688a, (androidx.compose.ui.d) null, C18030v.f147664a.a(k10, C18030v.f147665b).G0(), 0, (C4830x) null, C.f13316b.a(), (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 1572912, 0, 262068);
            mVar2 = mVar3;
            C5844O.a(J.i(aVar3, uVar.j()), mVar2, 0);
            C4545x.b((androidx.compose.ui.d) null, c1.c.e(-1754176633, true, new b(aVar2), mVar2, 54), mVar2, 48, 1);
            C5844O.a(J.i(aVar3, uVar.g()), mVar2, 0);
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
            n10.a(new i(aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N D(St.a aVar, int i10, C4889m mVar, int i11) {
        C(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: Tt.w$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: Tt.w$c} */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void E(Rt.d r20, nI.C17631a<XH.C16807N> r21, nI.C17631a<XH.C16807N> r22, nI.C17631a<XH.C16807N> r23, nI.C17631a<XH.C16807N> r24, nI.C17642l<? super java.lang.String, XH.C16807N> r25, U0.C4889m r26, int r27) {
        /*
            r6 = r20
            r15 = r21
            r5 = r22
            r4 = r23
            r3 = r24
            r2 = r25
            r1 = r27
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "onCloseClicked"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "onTimeSlotsClicked"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "onLoginClicked"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "onUpgradeClicked"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "onRegisterClicked"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = 1257244931(0x4af00903, float:7865473.5)
            r7 = r26
            U0.m r14 = r7.k(r0)
            r7 = r1 & 6
            r13 = 2
            r12 = 4
            if (r7 != 0) goto L_0x004f
            r7 = r1 & 8
            if (r7 != 0) goto L_0x0044
            boolean r7 = r14.V(r6)
            goto L_0x0048
        L_0x0044:
            boolean r7 = r14.F(r6)
        L_0x0048:
            if (r7 == 0) goto L_0x004c
            r7 = r12
            goto L_0x004d
        L_0x004c:
            r7 = r13
        L_0x004d:
            r7 = r7 | r1
            goto L_0x0050
        L_0x004f:
            r7 = r1
        L_0x0050:
            r8 = r1 & 48
            if (r8 != 0) goto L_0x0060
            boolean r8 = r14.F(r15)
            if (r8 == 0) goto L_0x005d
            r8 = 32
            goto L_0x005f
        L_0x005d:
            r8 = 16
        L_0x005f:
            r7 = r7 | r8
        L_0x0060:
            r8 = r1 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0070
            boolean r8 = r14.F(r5)
            if (r8 == 0) goto L_0x006d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x006f
        L_0x006d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x006f:
            r7 = r7 | r8
        L_0x0070:
            r8 = r1 & 3072(0xc00, float:4.305E-42)
            r11 = 2048(0x800, float:2.87E-42)
            if (r8 != 0) goto L_0x0081
            boolean r8 = r14.F(r4)
            if (r8 == 0) goto L_0x007e
            r8 = r11
            goto L_0x0080
        L_0x007e:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r7 = r7 | r8
        L_0x0081:
            r8 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0091
            boolean r8 = r14.F(r3)
            if (r8 == 0) goto L_0x008e
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r7 = r7 | r8
        L_0x0091:
            r8 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 & r1
            r10 = 131072(0x20000, float:1.83671E-40)
            if (r8 != 0) goto L_0x00a3
            boolean r8 = r14.F(r2)
            if (r8 == 0) goto L_0x00a0
            r8 = r10
            goto L_0x00a2
        L_0x00a0:
            r8 = 65536(0x10000, float:9.18355E-41)
        L_0x00a2:
            r7 = r7 | r8
        L_0x00a3:
            r9 = r7
            r7 = 74899(0x12493, float:1.04956E-40)
            r7 = r7 & r9
            r8 = 74898(0x12492, float:1.04954E-40)
            if (r7 != r8) goto L_0x00ba
            boolean r7 = r14.l()
            if (r7 != 0) goto L_0x00b4
            goto L_0x00ba
        L_0x00b4:
            r14.L()
            r2 = r14
            goto L_0x02e8
        L_0x00ba:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00c6
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.instore.impl.storeevents.details.ui.StoreEventDetailsScreen (StoreEventDetailsScreen.kt:94)"
            U0.C4895p.S(r0, r9, r7, r8)
        L_0x00c6:
            TJ.P r7 = r20.getState()
            r0 = 0
            r16 = 7
            r8 = 0
            r17 = 0
            r18 = 0
            r5 = r9
            r9 = r17
            r10 = r18
            r11 = r14
            r12 = r0
            r0 = r13
            r13 = r16
            U0.A1 r13 = j3.a.c(r7, r8, r9, r10, r11, r12, r13)
            Rt.c r7 = F(r13)
            r8 = 94862921(0x5a77e49, float:1.5750994E-35)
            r14.W(r8)
            r12 = r5 & 14
            r9 = 4
            if (r12 == r9) goto L_0x00fc
            r8 = r5 & 8
            if (r8 == 0) goto L_0x00fa
            boolean r8 = r14.F(r6)
            if (r8 == 0) goto L_0x00fa
            goto L_0x00fc
        L_0x00fa:
            r8 = 0
            goto L_0x00fd
        L_0x00fc:
            r8 = 1
        L_0x00fd:
            r10 = r5 & 7168(0x1c00, float:1.0045E-41)
            r11 = 2048(0x800, float:2.87E-42)
            if (r10 != r11) goto L_0x0105
            r10 = 1
            goto L_0x0106
        L_0x0105:
            r10 = 0
        L_0x0106:
            r8 = r8 | r10
            java.lang.Object r10 = r14.D()
            if (r8 != 0) goto L_0x0115
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x011d
        L_0x0115:
            Tt.g r10 = new Tt.g
            r10.<init>(r6, r4)
            r14.u(r10)
        L_0x011d:
            nI.a r10 = (nI.C17631a) r10
            r14.P()
            r8 = 94868336(0x5a79370, float:1.5758765E-35)
            r14.W(r8)
            if (r12 == r9) goto L_0x0137
            r8 = r5 & 8
            if (r8 == 0) goto L_0x0135
            boolean r8 = r14.F(r6)
            if (r8 == 0) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            r8 = 0
            goto L_0x0138
        L_0x0137:
            r8 = 1
        L_0x0138:
            java.lang.Object r11 = r14.D()
            if (r8 != 0) goto L_0x0146
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r11 != r8) goto L_0x014e
        L_0x0146:
            Tt.n r11 = new Tt.n
            r11.<init>(r6)
            r14.u(r11)
        L_0x014e:
            r17 = r11
            nI.a r17 = (nI.C17631a) r17
            r14.P()
            r8 = 58352(0xe3f0, float:8.1769E-41)
            r18 = r5 & r8
            r8 = r21
            r11 = r9
            r9 = r22
            r15 = 1
            r11 = r24
            r19 = r12
            r12 = r17
            r26 = r13
            r13 = r14
            r16 = r14
            r14 = r18
            M(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r7 = r16.D()
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r8 = r14.a()
            if (r7 != r8) goto L_0x018e
            dI.j r7 = dI.C17169j.f142968a
            r13 = r16
            QJ.Q r7 = U0.P.k(r7, r13)
            U0.B r8 = new U0.B
            r8.<init>(r7)
            r13.u(r8)
            r7 = r8
            goto L_0x0190
        L_0x018e:
            r13 = r16
        L_0x0190:
            U0.B r7 = (U0.B) r7
            QJ.Q r12 = r7.a()
            r7 = 0
            r8 = 6
            O0.F0 r11 = O0.C4725e0.l(r15, r7, r13, r8, r0)
            Rt.c r0 = F(r26)
            Rt.c$a r8 = r0.d()
            r0 = 94877765(0x5a7b845, float:1.5772294E-35)
            r13.W(r0)
            r9 = r26
            boolean r0 = r13.V(r9)
            boolean r10 = r13.V(r11)
            r0 = r0 | r10
            r7 = r19
            r10 = 4
            if (r7 == r10) goto L_0x01c8
            r16 = r5 & 8
            if (r16 == 0) goto L_0x01c5
            boolean r16 = r13.F(r6)
            if (r16 == 0) goto L_0x01c5
            goto L_0x01c8
        L_0x01c5:
            r16 = 0
            goto L_0x01ca
        L_0x01c8:
            r16 = r15
        L_0x01ca:
            r0 = r0 | r16
            r16 = 458752(0x70000, float:6.42848E-40)
            r15 = r5 & r16
            r10 = 131072(0x20000, float:1.83671E-40)
            if (r15 != r10) goto L_0x01d6
            r10 = 1
            goto L_0x01d7
        L_0x01d6:
            r10 = 0
        L_0x01d7:
            r0 = r0 | r10
            java.lang.Object r10 = r13.D()
            if (r0 != 0) goto L_0x01e8
            java.lang.Object r0 = r14.a()
            if (r10 != r0) goto L_0x01e5
            goto L_0x01e8
        L_0x01e5:
            r16 = r5
            goto L_0x01fb
        L_0x01e8:
            Tt.w$c r10 = new Tt.w$c
            r15 = 0
            r0 = r10
            r1 = r11
            r2 = r20
            r3 = r25
            r4 = r9
            r16 = r5
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r13.u(r10)
        L_0x01fb:
            nI.p r10 = (nI.p) r10
            r13.P()
            r0 = 0
            U0.P.g(r8, r10, r13, r0)
            r1 = 94893160(0x5a7f468, float:1.5794385E-35)
            r13.W(r1)
            Rt.c r1 = F(r9)
            Rt.c$a r1 = r1.d()
            boolean r1 = r1 instanceof Rt.c.a.C1802a
            if (r1 == 0) goto L_0x02a2
            Rt.c r1 = F(r9)
            St.a r1 = r1.f()
            if (r1 == 0) goto L_0x0225
            jt.b$f$a r1 = r1.l()
            goto L_0x0226
        L_0x0225:
            r1 = 0
        L_0x0226:
            boolean r1 = r1 instanceof jt.b.f.a.d
            r2 = 94900002(0x5a80f22, float:1.5804203E-35)
            r13.W(r2)
            r2 = 4
            if (r7 == r2) goto L_0x023e
            r2 = r16 & 8
            if (r2 == 0) goto L_0x023c
            boolean r2 = r13.F(r6)
            if (r2 == 0) goto L_0x023c
            goto L_0x023e
        L_0x023c:
            r2 = r0
            goto L_0x023f
        L_0x023e:
            r2 = 1
        L_0x023f:
            java.lang.Object r3 = r13.D()
            if (r2 != 0) goto L_0x024b
            java.lang.Object r2 = r14.a()
            if (r3 != r2) goto L_0x0253
        L_0x024b:
            Tt.o r3 = new Tt.o
            r3.<init>(r6)
            r13.u(r3)
        L_0x0253:
            r8 = r3
            nI.a r8 = (nI.C17631a) r8
            r13.P()
            r2 = 94902752(0x5a819e0, float:1.5808149E-35)
            r13.W(r2)
            r2 = 4
            if (r7 == r2) goto L_0x0270
            r2 = r16 & 8
            if (r2 == 0) goto L_0x026d
            boolean r2 = r13.F(r6)
            if (r2 == 0) goto L_0x026d
            goto L_0x0270
        L_0x026d:
            r17 = r0
            goto L_0x0272
        L_0x0270:
            r17 = 1
        L_0x0272:
            java.lang.Object r2 = r13.D()
            if (r17 != 0) goto L_0x027e
            java.lang.Object r3 = r14.a()
            if (r2 != r3) goto L_0x0286
        L_0x027e:
            Tt.p r2 = new Tt.p
            r2.<init>(r6)
            r13.u(r2)
        L_0x0286:
            r9 = r2
            nI.a r9 = (nI.C17631a) r9
            r13.P()
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            java.lang.String r3 = "store_event_details-cancel_registration_prompt"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r2, r3)
            r2 = 3072(0xc00, float:4.305E-42)
            r3 = 0
            r7 = r1
            r1 = r11
            r11 = r13
            r4 = r12
            r12 = r2
            r2 = r13
            r13 = r3
            Qt.C10905b.b(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x02a5
        L_0x02a2:
            r1 = r11
            r4 = r12
            r2 = r13
        L_0x02a5:
            r2.P()
            int r3 = st.c.f102812u0
            java.lang.String r7 = J1.j.b(r3, r2, r0)
            r0 = 94914228(0x5a846b4, float:1.5824616E-35)
            r2.W(r0)
            boolean r0 = r2.F(r4)
            boolean r3 = r2.V(r1)
            r0 = r0 | r3
            java.lang.Object r3 = r2.D()
            if (r0 != 0) goto L_0x02c9
            java.lang.Object r0 = r14.a()
            if (r3 != r0) goto L_0x02d1
        L_0x02c9:
            Tt.q r3 = new Tt.q
            r3.<init>(r4, r1)
            r2.u(r3)
        L_0x02d1:
            r10 = r3
            nI.a r10 = (nI.C17631a) r10
            r2.P()
            r12 = 0
            r13 = 4
            r9 = 0
            r8 = r1
            r11 = r2
            Qt.C10909f.c(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02e8
            U0.C4895p.R()
        L_0x02e8:
            U0.Y0 r8 = r2.n()
            if (r8 == 0) goto L_0x0305
            Tt.r r9 = new Tt.r
            r0 = r9
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0305:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Tt.w.E(Rt.d, nI.a, nI.a, nI.a, nI.a, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final Rt.c F(A1<Rt.c> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N G(Q q10, F0 f02) {
        QJ.F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new d(f02, (C17164e<? super d>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(Rt.d dVar, C17631a aVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, C17642l lVar, int i10, C4889m mVar, int i11) {
        E(dVar, aVar, aVar2, aVar3, aVar4, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I(Rt.d dVar, C17631a aVar) {
        dVar.b(Rt.a.f87010a);
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J(Rt.d dVar) {
        dVar.b(b.c.f87013a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K(Rt.d dVar) {
        dVar.b(b.C1801b.f87012a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(Rt.d dVar) {
        dVar.b(b.a.f87011a);
        return C16807N.f139792a;
    }

    private static final void M(Rt.c cVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17631a<C16807N> aVar4, C17631a<C16807N> aVar5, C4889m mVar, int i10) {
        int i11;
        C17631a<C16807N> aVar6 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(803574058);
        Rt.c cVar2 = cVar;
        if ((i12 & 6) == 0) {
            i11 = (k10.F(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar6) ? 32 : 16;
        }
        C17631a<C16807N> aVar7 = aVar2;
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar7) ? 256 : 128;
        }
        C17631a<C16807N> aVar8 = aVar3;
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar8) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        C17631a<C16807N> aVar9 = aVar4;
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(aVar9) ? 16384 : 8192;
        }
        C17631a<C16807N> aVar10 = aVar5;
        if ((196608 & i12) == 0) {
            i11 |= k10.F(aVar10) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i11) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(803574058, i11, -1, "com.ingka.ikea.instore.impl.storeevents.details.ui.StoreEventDetailsScreenUi (StoreEventDetailsScreen.kt:158)");
            }
            androidx.compose.ui.d f10 = m.f(J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), m.c(0, k10, 0, 1), false, (s) null, false, 14, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, f10);
            C4504g.a aVar11 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar11.a();
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
            F1.c(a13, a10, aVar11.c());
            F1.c(a13, s10, aVar11.e());
            p<C4504g, Integer, C16807N> b10 = aVar11.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar11.d());
            C5862h hVar = C5862h.f28810a;
            boolean e11 = cVar.e();
            if (!e11) {
                k10.W(-1610668428);
                O(cVar, aVar, aVar2, aVar3, aVar4, aVar5, k10, i11 & 524286);
                k10.P();
            } else if (e11) {
                k10.W(-1610257027);
                Q(aVar6, k10, (i11 >> 3) & 14);
                k10.P();
            } else {
                k10.W(86589090);
                k10.P();
                throw new t();
            }
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            s sVar = r0;
            s sVar2 = new s(cVar, aVar, aVar2, aVar3, aVar4, aVar5, i10);
            n10.a(sVar);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N N(Rt.c cVar, C17631a aVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, C17631a aVar5, int i10, C4889m mVar, int i11) {
        M(cVar, aVar, aVar2, aVar3, aVar4, aVar5, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void O(Rt.c cVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17631a<C16807N> aVar4, C17631a<C16807N> aVar5, C4889m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        C17631a<C16807N> aVar6 = aVar;
        C17631a<C16807N> aVar7 = aVar2;
        int i14 = i10;
        C4889m k10 = mVar.k(375975277);
        if ((i14 & 6) == 0) {
            i11 = (k10.F(cVar) ? 4 : 2) | i14;
        } else {
            Rt.c cVar2 = cVar;
            i11 = i14;
        }
        if ((i14 & 48) == 0) {
            i11 |= k10.F(aVar6) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i11 |= k10.F(aVar7) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i11 |= k10.F(aVar3) ? RecyclerView.n.FLAG_MOVED : 1024;
        } else {
            C17631a<C16807N> aVar8 = aVar3;
        }
        C17631a<C16807N> aVar9 = aVar4;
        if ((i14 & 24576) == 0) {
            i11 |= k10.F(aVar9) ? 16384 : 8192;
        }
        C17631a<C16807N> aVar10 = aVar5;
        if ((196608 & i14) == 0) {
            i11 |= k10.F(aVar10) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i11) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(375975277, i11, -1, "com.ingka.ikea.instore.impl.storeevents.details.ui.StoreEventDetailsScreenUiContent (StoreEventDetailsScreen.kt:279)");
            }
            d.a aVar11 = androidx.compose.ui.d.f18749a;
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar11);
            C4504g.a aVar12 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar12.a();
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
            F1.c(a13, a10, aVar12.c());
            F1.c(a13, s10, aVar12.e());
            p<C4504g, Integer, C16807N> b10 = aVar12.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar12.d());
            C5862h hVar = C5862h.f28810a;
            St.a f10 = cVar.f();
            String str = null;
            u(f10 != null ? f10.e() : null, aVar6, k10, i11 & 112);
            if (cVar.f() == null) {
                k10.W(-348033558);
                y(k10, 0);
                k10.P();
            } else {
                k10.W(-347914363);
                St.a f11 = cVar.f();
                A(f11, aVar7, k10, (i11 >> 3) & 112);
                C13023e a14 = f11.a();
                k10.W(1097162221);
                if (a14 == null) {
                    i12 = 0;
                } else {
                    C18029u uVar = C18029u.f147649a;
                    i12 = 0;
                    C5844O.a(J.i(aVar11, uVar.g()), k10, 0);
                    q(a14.a(k10, C13023e.f110931a), k10, 0);
                    C5844O.a(J.i(aVar11, uVar.g()), k10, 0);
                }
                k10.P();
                k10.W(1097170899);
                if (f11.k()) {
                    boolean n10 = f11.n();
                    boolean m10 = f11.m();
                    C13023e c10 = cVar.c();
                    k10.W(1097179044);
                    if (c10 != null) {
                        str = c10.a(k10, C13023e.f110931a);
                    }
                    String str2 = str;
                    k10.P();
                    i13 = i12;
                    Qt.i.e(n10, m10, str2, cVar.d() instanceof c.a.C1803c, aVar3, aVar4, aVar5, k10, (i11 << 3) & 4186112);
                } else {
                    i13 = i12;
                }
                k10.P();
                C(f11, k10, i13);
                k10.P();
            }
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new t(cVar, aVar, aVar2, aVar3, aVar4, aVar5, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N P(Rt.c cVar, C17631a aVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, C17631a aVar5, int i10, C4889m mVar, int i11) {
        O(cVar, aVar, aVar2, aVar3, aVar4, aVar5, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void Q(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(2140769339);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2140769339, i11, -1, "com.ingka.ikea.instore.impl.storeevents.details.ui.StoreEventDetailsScreenUiLoading (StoreEventDetailsScreen.kt:188)");
            }
            C5858d.a((androidx.compose.ui.d) null, (C5437c) null, false, c1.c.e(-1564415067, true, new e(aVar), k10, 54), k10, 3072, 7);
            d.a aVar2 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d a10 = C5116k1.a(TC.e.i(aVar2), "store_event_details-loading");
            I a11 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, a10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar3.a();
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
            F1.c(a14, a11, aVar3.c());
            F1.c(a14, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            C18029u uVar = C18029u.f147649a;
            C5844O.a(J.i(aVar2, uVar.g()), k10, 0);
            H2.b(J.i(J.g(aVar2, 0.3f), uVar.a()), false, k10, 0, 2);
            C5844O.a(J.i(aVar2, uVar.j()), k10, 0);
            H2.b(J.i(J.g(aVar2, 0.92f), uVar.c()), false, k10, 0, 2);
            C5844O.a(J.i(aVar2, uVar.j()), k10, 0);
            H2.b(J.i(J.g(aVar2, 0.55f), uVar.c()), false, k10, 0, 2);
            C5844O.a(J.i(aVar2, uVar.j()), k10, 0);
            H2.b(J.i(J.g(aVar2, 0.55f), uVar.c()), false, k10, 0, 2);
            C5844O.a(J.i(aVar2, uVar.g()), k10, 0);
            H2.b(J.i(J.h(aVar2, 0.0f, 1, (Object) null), uVar.g()), false, k10, 0, 2);
            C5844O.a(J.i(aVar2, uVar.g()), k10, 0);
            H2.b(J.i(J.h(aVar2, 0.0f, 1, (Object) null), uVar.c()), false, k10, 0, 2);
            C5844O.a(J.i(aVar2, uVar.j()), k10, 0);
            H2.b(J.i(J.g(aVar2, 0.7f), uVar.c()), false, k10, 0, 2);
            C5844O.a(J.i(aVar2, uVar.j()), k10, 0);
            H2.b(J.i(J.g(aVar2, 0.7f), uVar.c()), false, k10, 0, 2);
            C5844O.a(J.i(aVar2, uVar.j()), k10, 0);
            H2.b(J.i(J.g(aVar2, 0.43f), uVar.c()), false, k10, 0, 2);
            k10.x();
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
    public static final C16807N R(C17631a aVar, int i10, C4889m mVar, int i11) {
        Q(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void q(String str, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        C17542s.j(str2, "text");
        C4889m k10 = mVar.k(-573486804);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-573486804, i11, -1, "com.ingka.ikea.instore.impl.storeevents.details.ui.AdditionalInformation (StoreEventDetailsScreen.kt:545)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d a10 = C5116k1.a(TC.e.i(J.h(aVar, 0.0f, 1, (Object) null)), "store_event_details-additional_info");
            I b10 = androidx.compose.foundation.layout.G.b(C5073d.f18068a.f(), C5437c.f24302a.l(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, a10);
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
            F1.c(a13, b10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b11);
            }
            F1.c(a13, e10, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            C5942c c10 = J1.e.c(C18148c.InformationCircle.m(), k10, 0);
            C5749w0.a aVar3 = C5749w0.f27365b;
            C18030v vVar = C18030v.f147664a;
            int i12 = C18030v.f147665b;
            C5583F.a(c10, (String) null, (androidx.compose.ui.d) null, (C5437c) null, (C4478k) null, 0.0f, C5749w0.a.b(aVar3, vVar.a(k10, i12).u0(), 0, 2, (Object) null), k10, 48, 60);
            C5844O.a(J.y(aVar, C18029u.f147649a.l()), k10, 0);
            mVar2 = k10;
            C13607l.j(str, C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, vVar.a(k10, i12).H0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, (i11 & 14) | 48, 0, 262132);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new l(str, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N r(String str, int i10, C4889m mVar, int i11) {
        q(str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void s(C5857c cVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C5857c cVar2 = cVar;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(607327181);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(607327181, i11, -1, "com.ingka.ikea.instore.impl.storeevents.details.ui.CloseButton (StoreEventDetailsScreen.kt:471)");
            }
            int i13 = C10027d.f75276g;
            String b10 = J1.j.b(Oo.b.f84665i, k10, 0);
            G0 g02 = G0.Small;
            androidx.compose.ui.d e10 = C5852X.e(C5116k1.a(cVar2.a(androidx.compose.ui.d.f18749a, C5437c.f24302a.o()), "store_event_details-close_image"));
            C18029u uVar = C18029u.f147649a;
            SC.F0.b(i13, b10, androidx.compose.foundation.layout.D.m(e10, uVar.c(), uVar.g(), 0.0f, 0.0f, 12, (Object) null), false, H0.PrimaryInverse, g02, (r0.m) null, false, aVar, k10, ((i11 << 21) & 234881024) | 221184, 200);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new j(cVar2, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C5857c cVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        s(cVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void u(String str, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-358080939);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-358080939, i11, -1, "com.ingka.ikea.instore.impl.storeevents.details.ui.ImageHeader (StoreEventDetailsScreen.kt:348)");
            }
            C5858d.a(J.i(androidx.compose.foundation.b.d(androidx.compose.ui.d.f18749a, C18030v.f147664a.a(k10, C18030v.f147665b).m0(), (i1) null, 2, (Object) null), f.f87926a.a()), (C5437c) null, false, c1.c.e(-1095737537, true, new a(str, aVar), k10, 54), k10, 3072, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new v(str, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N v(String str, C17631a aVar, int i10, C4889m mVar, int i11) {
        u(str, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: SC.c1$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v43, resolved type: SC.c1$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: SC.c1$a} */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void w(java.lang.String r24, java.lang.String r25, boolean r26, boolean r27, nI.C17631a<XH.C16807N> r28, U0.C4889m r29, int r30) {
        /*
            r2 = r25
            r3 = r26
            r4 = r27
            r6 = r30
            r0 = -1760571795(0xffffffff970fce6d, float:-4.646634E-25)
            r1 = r29
            U0.m r1 = r1.k(r0)
            r5 = r6 & 6
            if (r5 != 0) goto L_0x0022
            r5 = r24
            boolean r7 = r1.V(r5)
            if (r7 == 0) goto L_0x001f
            r7 = 4
            goto L_0x0020
        L_0x001f:
            r7 = 2
        L_0x0020:
            r7 = r7 | r6
            goto L_0x0025
        L_0x0022:
            r5 = r24
            r7 = r6
        L_0x0025:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x0035
            boolean r8 = r1.V(r2)
            if (r8 == 0) goto L_0x0032
            r8 = 32
            goto L_0x0034
        L_0x0032:
            r8 = 16
        L_0x0034:
            r7 = r7 | r8
        L_0x0035:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0045
            boolean r8 = r1.b(r3)
            if (r8 == 0) goto L_0x0042
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0044
        L_0x0042:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0044:
            r7 = r7 | r8
        L_0x0045:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0055
            boolean r8 = r1.b(r4)
            if (r8 == 0) goto L_0x0052
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0054
        L_0x0052:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0054:
            r7 = r7 | r8
        L_0x0055:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            r12 = r28
            if (r8 != 0) goto L_0x0067
            boolean r8 = r1.F(r12)
            if (r8 == 0) goto L_0x0064
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0066
        L_0x0064:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0066:
            r7 = r7 | r8
        L_0x0067:
            r8 = r7 & 9363(0x2493, float:1.312E-41)
            r9 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r9) goto L_0x0079
            boolean r8 = r1.l()
            if (r8 != 0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r1.L()
            goto L_0x0164
        L_0x0079:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0085
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.instore.impl.storeevents.details.ui.NearestTimeSlot (StoreEventDetailsScreen.kt:493)"
            U0.C4895p.S(r0, r7, r8, r9)
        L_0x0085:
            r0 = 0
            if (r4 == 0) goto L_0x0095
            int r8 = uK.C18146a.f148448g2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r9 = st.c.f102813u1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x00a6
        L_0x0095:
            if (r3 == 0) goto L_0x00a4
            int r8 = uK.C18146a.f148290W0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r9 = st.c.f102786l1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x00a6
        L_0x00a4:
            r8 = r0
            r9 = r8
        L_0x00a6:
            if (r8 == 0) goto L_0x00bd
            int r14 = r8.intValue()
            SC.c1$a r8 = new SC.c1$a
            r18 = 12
            r19 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19)
        L_0x00bb:
            r11 = r8
            goto L_0x00c0
        L_0x00bd:
            SC.c1$c r8 = SC.C13573c1.c.f116171b
            goto L_0x00bb
        L_0x00c0:
            r8 = -192004104(0xfffffffff48e3ff8, float:-9.016157E31)
            r1.W(r8)
            if (r9 != 0) goto L_0x00ca
            r10 = r0
            goto L_0x00d4
        L_0x00ca:
            int r8 = r9.intValue()
            r9 = 0
            java.lang.String r8 = J1.j.b(r8, r1, r9)
            r10 = r8
        L_0x00d4:
            r1.P()
            if (r2 == 0) goto L_0x00de
            SC.b1$c r8 = SC.C13569b1.c.f116146b
        L_0x00db:
            r20 = r8
            goto L_0x00e1
        L_0x00de:
            SC.b1$g r8 = SC.C13569b1.g.f116154b
            goto L_0x00db
        L_0x00e1:
            if (r2 == 0) goto L_0x00e5
            r8 = r12
            goto L_0x00e6
        L_0x00e5:
            r8 = r0
        L_0x00e6:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r9 = 1
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            if (r3 != 0) goto L_0x0109
            if (r4 == 0) goto L_0x00f3
            goto L_0x0109
        L_0x00f3:
            r13 = -1656626974(0xffffffff9d41e0e2, float:-2.56596E-21)
            r1.W(r13)
            tK.v r13 = tK.C18030v.f147664a
            int r14 = tK.C18030v.f147665b
            tK.h r13 = r13.a(r1, r14)
            long r13 = r13.m0()
            r1.P()
            goto L_0x011e
        L_0x0109:
            r13 = -1656702242(0xffffffff9d40bade, float:-2.5507596E-21)
            r1.W(r13)
            tK.v r13 = tK.C18030v.f147664a
            int r14 = tK.C18030v.f147665b
            tK.h r13 = r13.a(r1, r14)
            long r13 = r13.G0()
            r1.P()
        L_0x011e:
            tK.d r15 = tK.C18013d.f147437a
            A0.f r2 = r15.e()
            androidx.compose.ui.d r0 = n0.C5599e.g(r0, r9, r13, r2)
            A0.f r2 = r15.e()
            androidx.compose.ui.d r0 = m1.e.a(r0, r2)
            java.lang.String r2 = "store_event_details-time_slot"
            androidx.compose.ui.d r9 = androidx.compose.ui.platform.C5116k1.a(r0, r2)
            r0 = r7 & 14
            int r2 = SC.C13573c1.f116163a
            int r2 = r2 << 12
            r0 = r0 | r2
            int r2 = SC.C13569b1.f116141a
            int r2 = r2 << 15
            r21 = r0 | r2
            r22 = 6
            r23 = 7104(0x1bc0, float:9.955E-42)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r7 = r24
            r12 = r20
            r20 = r1
            SC.C13585f1.c(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0164
            U0.C4895p.R()
        L_0x0164:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x017f
            Tt.m r8 = new Tt.m
            r0 = r8
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Tt.w.w(java.lang.String, java.lang.String, boolean, boolean, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N x(String str, String str2, boolean z10, boolean z11, C17631a aVar, int i10, C4889m mVar, int i11) {
        w(str, str2, z10, z11, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void y(C4889m mVar, int i10) {
        C4889m mVar2;
        int i11 = i10;
        C4889m k10 = mVar.k(1409650522);
        if (i11 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1409650522, i11, -1, "com.ingka.ikea.instore.impl.storeevents.details.ui.NoStoreEventAvailableContent (StoreEventDetailsScreen.kt:324)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d a10 = C5116k1.a(TC.e.i(J.h(aVar, 0.0f, 1, (Object) null)), "store_event_details-not_available");
            I a11 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, a10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar2.a();
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
            F1.c(a14, a11, aVar2.c());
            F1.c(a14, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            C18029u uVar = C18029u.f147649a;
            C5844O.a(J.i(aVar, uVar.g()), k10, 0);
            C4889m mVar3 = k10;
            C13607l.j(J1.j.b(st.c.f102726N0, k10, 0), C13679b.C2857b.a.f116683a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262140);
            C4889m mVar4 = mVar3;
            C5844O.a(J.i(aVar, uVar.j()), mVar4, 0);
            mVar2 = mVar4;
            C13607l.j(J1.j.b(st.c.f102724M0, mVar4, 0), C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262140);
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
            n10.a(new h(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N z(int i10, C4889m mVar, int i11) {
        y(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
