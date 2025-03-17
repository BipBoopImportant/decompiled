package wK;

import E1.C4488v;
import E1.C4489w;
import E1.I;
import G1.C4504g;
import N1.P;
import O0.E;
import O0.V;
import O0.V0;
import O0.X0;
import O0.d1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4910x;
import U0.C4912y;
import U0.F1;
import U0.J0;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.v;
import Y1.j;
import Y1.k;
import YH.C16877v;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5100f0;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import c2.h;
import c2.n;
import c2.o;
import c2.r;
import c2.s;
import c2.t;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import m0.C5534c;
import m0.C5548j;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5667g;
import p1.C5728l0;
import p1.C5747v0;
import p1.i1;
import s0.C5843N;
import s0.C5857c;
import s0.C5861g;
import tK.C18028t;
import tK.C18029u;
import tK.C18030v;
import vK.C18205e;
import wK.C18364ia;

@Metadata(d1 = {"\u0000T\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aa\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aM\u0010\u0014\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001aQ\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aC\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a/\u0010 \u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0003¢\u0006\u0004\b \u0010!\u001a!\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010%\u001a\u00020\u000e*\u00020$2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010'\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010(\u001a+\u0010+\u001a\u00020\u0005*\u00020\u00052\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b+\u0010,¨\u00060²\u0006\u000e\u0010-\u001a\u00020\u00078\n@\nX\u0002²\u0006\f\u0010\u001e\u001a\u00020\u00078\nX\u0002²\u0006\f\u0010\u001f\u001a\u00020\u00078\nX\u0002²\u0006\f\u0010/\u001a\u00020.8\nX\u0002"}, d2 = {"", "LwK/ia;", "tabList", "", "selectedTabIndex", "Landroidx/compose/ui/d;", "modifier", "", "fluid", "Lp1/v0;", "shadowColor", "LwK/ka;", "variant", "Lkotlin/Function1;", "LXH/N;", "onItemSelected", "z", "(Ljava/util/List;ILandroidx/compose/ui/d;ZJLwK/ka;LnI/l;LU0/m;II)V", "Ls0/g;", "lastIndex", "i", "(Ls0/g;LwK/ka;IILjava/util/List;LnI/l;LU0/m;I)V", "onClick", "m", "(LwK/ka;Ljava/util/List;IIJLnI/l;LU0/m;I)V", "tab", "index", "selected", "q", "(LwK/ia;IZLandroidx/compose/ui/d;LnI/l;LU0/m;I)V", "pressed", "hover", "x", "(LwK/ia;ZZZLU0/m;I)V", "v", "(Landroidx/compose/ui/d;LwK/ka;LU0/m;II)V", "Ls0/c;", "k", "(Ls0/c;JLU0/m;I)V", "G", "(Landroidx/compose/ui/d;Z)Landroidx/compose/ui/d;", "LO0/V0;", "currentTabPosition", "F", "(Landroidx/compose/ui/d;LO0/V0;II)Landroidx/compose/ui/d;", "isVisible", "", "indicatorOffset", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.ta  reason: case insensitive filesystem */
public final class C18496ta {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.ta$a */
    static final class a implements q<List<? extends V0>, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f151644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f151645b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C18388ka f151646c;

        a(int i10, int i11, C18388ka kaVar) {
            this.f151644a = i10;
            this.f151645b = i11;
            this.f151646c = kaVar;
        }

        public final void a(List<V0> list, C4889m mVar, int i10) {
            C17542s.j(list, "tabPositions");
            if (C4895p.J()) {
                C4895p.S(-1355742261, i10, -1, "net.ikea.skapa.ui.components.FluidTabRowLayout.<anonymous> (Tabs.kt:102)");
            }
            C18496ta.v(C18496ta.F(androidx.compose.ui.d.f18749a, list.get(this.f151644a), this.f151644a, this.f151645b), this.f151646c, mVar, 0, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((List) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.ta$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<C18364ia> f151647a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f151648b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5861g f151649c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f151650d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, C16807N> f151651e;

        b(List<? extends C18364ia> list, int i10, C5861g gVar, int i11, C17642l<? super Integer, C16807N> lVar) {
            this.f151647a = list;
            this.f151648b = i10;
            this.f151649c = gVar;
            this.f151650d = i11;
            this.f151651e = lVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(488378827, i11, -1, "net.ikea.skapa.ui.components.FluidTabRowLayout.<anonymous> (Tabs.kt:108)");
                }
                int i12 = this.f151648b;
                C5861g gVar = this.f151649c;
                int i13 = this.f151650d;
                C17642l<Integer, C16807N> lVar = this.f151651e;
                int i14 = 0;
                for (Object next : this.f151647a) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        C16877v.x();
                    }
                    C18364ia iaVar = (C18364ia) next;
                    C17642l<Integer, C16807N> lVar2 = lVar;
                    C18496ta.q(iaVar, i14, i14 == i12, D.h(C5861g.c(gVar, androidx.compose.ui.d.f18749a, 1.0f, false, 2, (Object) null), C18376ja.f151110a.g(i14, i13)), lVar, mVar, 0);
                    i14 = i15;
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.ta$c */
    static final class c implements q<List<? extends V0>, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f151652a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f151653b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C18388ka f151654c;

        c(int i10, int i11, C18388ka kaVar) {
            this.f151652a = i10;
            this.f151653b = i11;
            this.f151654c = kaVar;
        }

        public final void a(List<V0> list, C4889m mVar, int i10) {
            C17542s.j(list, "tabPositions");
            if (C4895p.J()) {
                C4895p.S(-1896814467, i10, -1, "net.ikea.skapa.ui.components.ScrollableTabRowLayout.<anonymous>.<anonymous> (Tabs.kt:144)");
            }
            C18496ta.v(C18496ta.F(androidx.compose.ui.d.f18749a, list.get(this.f151652a), this.f151652a, this.f151653b), this.f151654c, mVar, 0, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((List) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.ta$d */
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<C18364ia> f151655a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f151656b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f151657c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f151658d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, C16807N> f151659e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f151660f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f151661g;

        d(List<? extends C18364ia> list, int i10, boolean z10, int i11, C17642l<? super Integer, C16807N> lVar, long j10, C4899r0<Boolean> r0Var) {
            this.f151655a = list;
            this.f151656b = i10;
            this.f151657c = z10;
            this.f151658d = i11;
            this.f151659e = lVar;
            this.f151660f = j10;
            this.f151661g = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(boolean z10, c2.d dVar, long j10, C4899r0 r0Var, C4488v vVar) {
            C17542s.j(vVar, "layoutCoordinates");
            long a10 = vVar.a();
            long g10 = C4489w.g(vVar);
            boolean z11 = false;
            if (!z10 ? dVar.x1(C5667g.m(g10) + ((float) r.h(a10))) <= ((float) r.h(j10)) : dVar.x1(C5667g.m(g10) + ((float) r.h(a10))) > 0.0f) {
                z11 = true;
            }
            C18496ta.o(r0Var, z11);
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            c2.d dVar;
            C4899r0<Boolean> r0Var;
            androidx.compose.ui.d dVar2;
            d.a aVar;
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1926358403, i11, -1, "net.ikea.skapa.ui.components.ScrollableTabRowLayout.<anonymous>.<anonymous> (Tabs.kt:147)");
                }
                Object Q10 = mVar2.Q(C5100f0.e());
                List<C18364ia> list = this.f151655a;
                int i12 = this.f151656b;
                boolean z10 = this.f151657c;
                int i13 = this.f151658d;
                C17642l<Integer, C16807N> lVar = this.f151659e;
                long j10 = this.f151660f;
                C4899r0<Boolean> r0Var2 = this.f151661g;
                c2.d dVar3 = (c2.d) Q10;
                mVar2.W(1048277582);
                int i14 = 0;
                for (Object next : list) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        C16877v.x();
                    }
                    C18364ia iaVar = (C18364ia) next;
                    mVar2.W(1048279453);
                    if (i14 == i12) {
                        d.a aVar2 = androidx.compose.ui.d.f18749a;
                        mVar2.W(925122199);
                        boolean b10 = mVar2.b(z10) | mVar2.V(dVar3);
                        Object D10 = mVar.D();
                        if (b10 || D10 == C4889m.f14007a.a()) {
                            c2.d dVar4 = dVar3;
                            dVar = dVar3;
                            aVar = aVar2;
                            C18508ua uaVar = r10;
                            r0Var = r0Var2;
                            C18508ua uaVar2 = new C18508ua(z10, dVar4, j10, r0Var2);
                            mVar2.u(uaVar);
                            D10 = uaVar;
                        } else {
                            dVar = dVar3;
                            aVar = aVar2;
                            r0Var = r0Var2;
                        }
                        mVar.P();
                        dVar2 = androidx.compose.ui.layout.c.a(aVar, (C17642l) D10);
                    } else {
                        dVar = dVar3;
                        r0Var = r0Var2;
                        dVar2 = androidx.compose.ui.d.f18749a;
                    }
                    mVar.P();
                    long j11 = j10;
                    boolean z11 = i14 == i13;
                    androidx.compose.ui.d s10 = D.h(androidx.compose.ui.d.f18749a, C18376ja.f151110a.g(i14, i12)).s(dVar2);
                    C17642l<Integer, C16807N> lVar2 = lVar;
                    C18496ta.q(iaVar, i14, z11, s10, lVar, mVar, 0);
                    i13 = i13;
                    dVar3 = dVar;
                    j10 = j11;
                    z10 = z10;
                    i14 = i15;
                    r0Var2 = r0Var;
                }
                mVar.P();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.ta$e */
    static final class e implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C18364ia f151662a;

        e(C18364ia iaVar) {
            this.f151662a = iaVar;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(125825298, i11, -1, "net.ikea.skapa.ui.components.TabLayout.<anonymous> (Tabs.kt:231)");
                }
                C5437c.C0386c i12 = C5437c.f24302a.i();
                d.a aVar = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d k10 = J.k(aVar, C18376ja.f151110a.d(), 0.0f, 2, (Object) null);
                C18029u uVar = C18029u.f147649a;
                androidx.compose.ui.d k11 = D.k(k10, uVar.f(), 0.0f, 2, (Object) null);
                C18364ia iaVar = this.f151662a;
                I b10 = G.b(C5073d.f18068a.f(), i12, mVar2, 48);
                int a10 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, k11);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar2.a();
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
                F1.c(a12, b10, aVar2.c());
                F1.c(a12, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b11 = aVar2.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e10, aVar2.d());
                C5843N n10 = C5843N.f28726a;
                mVar2.W(1104409687);
                if (iaVar instanceof C18364ia.a) {
                    V.a(J1.e.c(((C18364ia.a) iaVar).c(), mVar2, 0), (String) null, D.m(aVar, 0.0f, 0.0f, uVar.j(), 0.0f, 11, (Object) null), 0, mVar, 48, 8);
                }
                mVar.P();
                d1.b(iaVar.b(), (androidx.compose.ui.d) null, ((C5747v0) mVar2.Q(E.a())).y(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, C18030v.f147664a.b(mVar2, C18030v.f147665b).c().e(), mVar, 0, 0, 65530);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: wK.ta$f */
    public static final class f extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ V0 f151663c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(V0 v02) {
            super(1);
            this.f151663c = v02;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("tabIndicatorOffset");
            v0Var.c(this.f151663c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.ta$g */
    static final class g implements q<androidx.compose.ui.d, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f151664a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f151665b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ V0 f151666c;

        g(int i10, int i11, V0 v02) {
            this.f151664a = i10;
            this.f151665b = i11;
            this.f151666c = v02;
        }

        private static final float c(A1<Float> a12) {
            return a12.getValue().floatValue();
        }

        /* access modifiers changed from: private */
        public static final n e(A1 a12, c2.d dVar) {
            C17542s.j(dVar, "$this$offset");
            return n.b(o.a((int) c(a12), 0));
        }

        public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, C4889m mVar, int i10) {
            androidx.compose.ui.d dVar2 = dVar;
            C4889m mVar2 = mVar;
            C17542s.j(dVar2, "$this$composed");
            mVar2.W(484603208);
            if (C4895p.J()) {
                C4895p.S(484603208, i10, -1, "net.ikea.skapa.ui.components.skapaTabIndicatorOffset.<anonymous> (Tabs.kt:292)");
            }
            Object Q10 = mVar2.Q(C5100f0.e());
            int i11 = this.f151664a;
            int i12 = this.f151665b;
            V0 v02 = this.f151666c;
            c2.d dVar3 = (c2.d) Q10;
            C18376ja jaVar = C18376ja.f151110a;
            v<h, h> f10 = jaVar.f(i11, i12);
            float G10 = f10.a().G();
            float G11 = f10.b().G();
            A1<Float> d10 = C5534c.d(dVar3.H1(G10) + dVar3.H1(v02.a()), C5548j.j(300, 0, C18028t.f147640a.a(), 2, (Object) null), 0.0f, "Tab animation", (C17642l<? super Float, C16807N>) null, mVar, 3072, 20);
            androidx.compose.ui.d E10 = J.E(dVar2, C5437c.f24302a.d(), false, 2, (Object) null);
            mVar2.W(-10313315);
            boolean V10 = mVar2.V(d10);
            Object D10 = mVar.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new C18520va(d10);
                mVar2.u(D10);
            }
            mVar.P();
            androidx.compose.ui.d m10 = D.m(J.y(A.a(E10, (C17642l) D10), h.B(v02.c() - G11)), 0.0f, 0.0f, 0.0f, jaVar.b(), 7, (Object) null);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return m10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(List list, int i10, androidx.compose.ui.d dVar, boolean z10, long j10, C18388ka kaVar, C17642l lVar, int i11, int i12, C4889m mVar, int i13) {
        z(list, i10, dVar, z10, j10, kaVar, lVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.ui.d F(androidx.compose.ui.d dVar, V0 v02, int i10, int i11) {
        return androidx.compose.ui.c.b(dVar, C5133t0.b() ? new f(v02) : C5133t0.a(), new g(i10, i11, v02));
    }

    private static final androidx.compose.ui.d G(androidx.compose.ui.d dVar, boolean z10) {
        return z10 ? J.h(dVar, 0.0f, 1, (Object) null) : dVar;
    }

    private static final void i(C5861g gVar, C18388ka kaVar, int i10, int i11, List<? extends C18364ia> list, C17642l<? super Integer, C16807N> lVar, C4889m mVar, int i12) {
        int i13;
        C4889m mVar2;
        C18388ka kaVar2 = kaVar;
        int i14 = i10;
        int i15 = i11;
        int i16 = i12;
        C4889m k10 = mVar.k(118600803);
        C5861g gVar2 = gVar;
        if ((i16 & 6) == 0) {
            i13 = (k10.V(gVar2) ? 4 : 2) | i16;
        } else {
            i13 = i16;
        }
        if ((i16 & 48) == 0) {
            i13 |= k10.V(kaVar2) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i13 |= k10.d(i14) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i13 |= k10.d(i15) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        List<? extends C18364ia> list2 = list;
        if ((i16 & 24576) == 0) {
            i13 |= k10.F(list2) ? 16384 : 8192;
        }
        C17642l<? super Integer, C16807N> lVar2 = lVar;
        if ((196608 & i16) == 0) {
            i13 |= k10.F(lVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        int i17 = i13;
        if ((74899 & i17) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(118600803, i17, -1, "net.ikea.skapa.ui.components.FluidTabRowLayout (Tabs.kt:95)");
            }
            long h10 = C5747v0.f27350b.h();
            long H02 = C18030v.f147664a.a(k10, C18030v.f147665b).H0();
            C5264a e10 = c1.c.e(-1355742261, true, new a(i14, i15, kaVar2), k10, 54);
            p<C4889m, Integer, C16807N> a10 = C18404m2.f151219a.a();
            b bVar = r3;
            b bVar2 = new b(list, i10, gVar, i11, lVar);
            mVar2 = k10;
            X0.c(i10, (androidx.compose.ui.d) null, h10, H02, e10, a10, c1.c.e(488378827, true, bVar, k10, 54), k10, ((i17 >> 6) & 14) | 1794432, 2);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C18412ma(gVar, kaVar, i10, i11, list, lVar, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C5861g gVar, C18388ka kaVar, int i10, int i11, List list, C17642l lVar, int i12, C4889m mVar, int i13) {
        i(gVar, kaVar, i10, i11, list, lVar, mVar, M0.a(i12 | 1));
        return C16807N.f139792a;
    }

    private static final void k(C5857c cVar, long j10, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1646472776);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.e(j10) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1646472776, i11, -1, "net.ikea.skapa.ui.components.ScrollBlurIndicator (Tabs.kt:262)");
            }
            k10.W(401114192);
            List q10 = k10.Q(C5100f0.k()) == t.Ltr ? C16877v.q(C5747v0.k(C5747v0.f27350b.h()), C5747v0.k(j10)) : C16877v.q(C5747v0.k(C18030v.f147664a.a(k10, C18030v.f147665b).k0()), C5747v0.k(C5747v0.f27350b.h()));
            k10.P();
            C5077h.a(androidx.compose.foundation.b.b(cVar.a(J.t(androidx.compose.ui.d.f18749a, C18376ja.f151110a.d()), C5437c.f24302a.n()), C5728l0.a.c(C5728l0.f27325b, q10, 0.0f, 0.0f, 0, 14, (Object) null), (i1) null, 0.0f, 6, (Object) null), k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18472ra(cVar, j10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C5857c cVar, long j10, int i10, C4889m mVar, int i11) {
        k(cVar, j10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void m(C18388ka kaVar, List<? extends C18364ia> list, int i10, int i11, long j10, C17642l<? super Integer, C16807N> lVar, C4889m mVar, int i12) {
        int i13;
        C4889m mVar2;
        C18388ka kaVar2 = kaVar;
        int i14 = i10;
        int i15 = i11;
        long j11 = j10;
        int i16 = i12;
        C4889m k10 = mVar.k(1086710679);
        if ((i16 & 6) == 0) {
            i13 = (k10.V(kaVar2) ? 4 : 2) | i16;
        } else {
            i13 = i16;
        }
        List<? extends C18364ia> list2 = list;
        if ((i16 & 48) == 0) {
            i13 |= k10.F(list2) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i13 |= k10.d(i14) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i13 |= k10.d(i15) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i16 & 24576) == 0) {
            i13 |= k10.e(j11) ? 16384 : 8192;
        }
        C17642l<? super Integer, C16807N> lVar2 = lVar;
        if ((196608 & i16) == 0) {
            i13 |= k10.F(lVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        int i17 = i13;
        if ((74899 & i17) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1086710679, i17, -1, "net.ikea.skapa.ui.components.ScrollableTabRowLayout (Tabs.kt:131)");
            }
            Configuration configuration = (Configuration) k10.Q(AndroidCompositionLocals_androidKt.f());
            k10.W(2022719414);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = r.b(s.a(configuration.screenWidthDp, configuration.screenHeightDp));
                k10.u(D10);
            }
            long k11 = ((r) D10).k();
            k10.P();
            k10.W(2022722601);
            Object D11 = k10.D();
            if (D11 == aVar.a()) {
                D11 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                k10.u(D11);
            }
            C4899r0 r0Var = (C4899r0) D11;
            k10.P();
            boolean f10 = C18205e.f(k10, 0);
            d.a aVar2 = androidx.compose.ui.d.f18749a;
            I h10 = C5077h.h(C5437c.f24302a.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar2);
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
            F1.c(a12, h10, aVar3.c());
            F1.c(a12, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar3.d());
            C5079j jVar = C5079j.f18125a;
            long h11 = C5747v0.f27350b.h();
            long H02 = C18030v.f147664a.a(k10, C18030v.f147665b).H0();
            float B10 = h.B((float) 0);
            C5264a e11 = c1.c.e(-1896814467, true, new c(i14, i15, kaVar2), k10, 54);
            p<C4889m, Integer, C16807N> b11 = C18404m2.f151219a.b();
            d dVar = r2;
            C5079j jVar2 = jVar;
            int i18 = i17;
            d dVar2 = new d(list, i11, f10, i10, lVar, k11, r0Var);
            C4889m mVar3 = k10;
            X0.a(i10, (androidx.compose.ui.d) null, h11, H02, B10, e11, b11, c1.c.e(-1926358403, true, dVar, k10, 54), mVar3, ((i18 >> 6) & 14) | 14377344, 2);
            mVar2 = mVar3;
            mVar2.W(615889491);
            if (!n(r0Var)) {
                k(jVar2, j10, mVar2, ((i18 >> 9) & 112) | 6);
            } else {
                long j12 = j10;
            }
            mVar2.P();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
            long j13 = j11;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C18424na(kaVar, list, i10, i11, j10, lVar, i12));
        }
    }

    private static final boolean n(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void o(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C18388ka kaVar, List list, int i10, int i11, long j10, C17642l lVar, int i12, C4889m mVar, int i13) {
        m(kaVar, list, i10, i11, j10, lVar, mVar, M0.a(i12 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void q(wK.C18364ia r34, int r35, boolean r36, androidx.compose.ui.d r37, nI.C17642l<? super java.lang.Integer, XH.C16807N> r38, U0.C4889m r39, int r40) {
        /*
            r2 = r35
            r4 = r37
            r5 = r38
            r6 = r40
            r0 = 778852589(0x2e6c58ed, float:5.373917E-11)
            r1 = r39
            U0.m r1 = r1.k(r0)
            r3 = 6
            r7 = r6 & 6
            r13 = r34
            if (r7 != 0) goto L_0x0023
            boolean r7 = r1.V(r13)
            if (r7 == 0) goto L_0x0020
            r7 = 4
            goto L_0x0021
        L_0x0020:
            r7 = 2
        L_0x0021:
            r7 = r7 | r6
            goto L_0x0024
        L_0x0023:
            r7 = r6
        L_0x0024:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x0034
            boolean r8 = r1.d(r2)
            if (r8 == 0) goto L_0x0031
            r8 = 32
            goto L_0x0033
        L_0x0031:
            r8 = 16
        L_0x0033:
            r7 = r7 | r8
        L_0x0034:
            r8 = r6 & 384(0x180, float:5.38E-43)
            r12 = r36
            if (r8 != 0) goto L_0x0046
            boolean r8 = r1.b(r12)
            if (r8 == 0) goto L_0x0043
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r7 = r7 | r8
        L_0x0046:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0056
            boolean r8 = r1.V(r4)
            if (r8 == 0) goto L_0x0053
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r7 = r7 | r8
        L_0x0056:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0066
            boolean r8 = r1.F(r5)
            if (r8 == 0) goto L_0x0063
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0065
        L_0x0063:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0065:
            r7 = r7 | r8
        L_0x0066:
            r8 = r7 & 9363(0x2493, float:1.312E-41)
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r11) goto L_0x0078
            boolean r8 = r1.l()
            if (r8 != 0) goto L_0x0073
            goto L_0x0078
        L_0x0073:
            r1.L()
            goto L_0x01e4
        L_0x0078:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0084
            r8 = -1
            java.lang.String r11 = "net.ikea.skapa.ui.components.Tab (Tabs.kt:187)"
            U0.C4895p.S(r0, r7, r8, r11)
        L_0x0084:
            r0 = 1905294923(0x71907e4b, float:1.4309926E30)
            r1.W(r0)
            java.lang.Object r0 = r1.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r11 = r8.a()
            if (r0 != r11) goto L_0x009d
            r0.m r0 = r0.l.a()
            r1.u(r0)
        L_0x009d:
            r0.m r0 = (r0.m) r0
            r1.P()
            U0.A1 r11 = r0.p.a(r0, r1, r3)
            U0.A1 r23 = r0.i.a(r0, r1, r3)
            U0.A1 r25 = r0.C5814f.a(r0, r1, r3)
            r14 = 0
            r15 = 1
            r3 = 0
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.d(r4, r14, r15, r3)
            r10 = 3
            androidx.compose.ui.d r14 = zK.C18766k.b(r9, r14, r14, r10, r3)
            boolean r18 = r34.a()
            r3 = 1905312509(0x7190c2fd, float:1.4336502E30)
            r1.W(r3)
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r7
            r9 = 0
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r3 != r15) goto L_0x00cf
            r3 = 1
            goto L_0x00d0
        L_0x00cf:
            r3 = r9
        L_0x00d0:
            r15 = r7 & 112(0x70, float:1.57E-43)
            r10 = 32
            if (r15 != r10) goto L_0x00d8
            r15 = 1
            goto L_0x00d9
        L_0x00d8:
            r15 = r9
        L_0x00d9:
            r3 = r3 | r15
            java.lang.Object r10 = r1.D()
            if (r3 != 0) goto L_0x00e6
            java.lang.Object r3 = r8.a()
            if (r10 != r3) goto L_0x00ee
        L_0x00e6:
            wK.oa r10 = new wK.oa
            r10.<init>(r5, r2)
            r1.u(r10)
        L_0x00ee:
            r20 = r10
            nI.a r20 = (nI.C17631a) r20
            r1.P()
            r21 = 16
            r22 = 0
            r17 = 0
            r19 = 0
            r15 = r36
            r16 = r0
            androidx.compose.ui.d r0 = androidx.compose.foundation.selection.a.b(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r3 = s(r23)
            boolean r8 = r34.a()
            androidx.compose.ui.d r0 = zK.C18756a.i(r0, r3, r8)
            r3 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.d r24 = i1.m.a(r0, r3)
            boolean r26 = r34.a()
            tK.d r0 = tK.C18013d.f147437a
            A0.f r27 = r0.e()
            r32 = 72
            r33 = 0
            r28 = 0
            r29 = 1
            r30 = 0
            r31 = 0
            androidx.compose.ui.d r0 = zK.C18756a.b(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$b r3 = r3.g()
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r8 = r8.a()
            r10 = 54
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r8, r3, r1, r10)
            int r8 = U0.C4883j.a(r1, r9)
            U0.y r9 = r1.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r1, r0)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r14 = r10.a()
            U0.f r15 = r1.m()
            if (r15 != 0) goto L_0x015e
            U0.C4883j.c()
        L_0x015e:
            r1.I()
            boolean r15 = r1.i()
            if (r15 == 0) goto L_0x016b
            r1.p(r14)
            goto L_0x016e
        L_0x016b:
            r1.t()
        L_0x016e:
            U0.m r14 = U0.F1.a(r1)
            nI.p r15 = r10.c()
            U0.F1.c(r14, r3, r15)
            nI.p r3 = r10.e()
            U0.F1.c(r14, r9, r3)
            nI.p r3 = r10.b()
            boolean r9 = r14.i()
            if (r9 != 0) goto L_0x0198
            java.lang.Object r9 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r15)
            if (r9 != 0) goto L_0x01a6
        L_0x0198:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r14.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r14.w(r8, r3)
        L_0x01a6:
            nI.p r3 = r10.d()
            U0.F1.c(r14, r0, r3)
            s0.h r0 = s0.C5862h.f28810a
            boolean r9 = r(r11)
            boolean r10 = s(r23)
            r0 = r7 & 14
            r3 = 3
            int r3 = r7 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r7 = r34
            r8 = r36
            r11 = r1
            r12 = r0
            x(r7, r8, r9, r10, r11, r12)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            wK.ja r3 = wK.C18376ja.f151110a
            float r3 = r3.c()
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r3)
            r3 = 6
            s0.C5844O.a(r0, r1, r3)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01e4
            U0.C4895p.R()
        L_0x01e4:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x01ff
            wK.pa r8 = new wK.pa
            r0 = r8
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18496ta.q(wK.ia, int, boolean, androidx.compose.ui.d, nI.l, U0.m, int):void");
    }

    private static final boolean r(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final boolean s(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C17642l lVar, int i10) {
        lVar.invoke(Integer.valueOf(i10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C18364ia iaVar, int i10, boolean z10, androidx.compose.ui.d dVar, C17642l lVar, int i11, C4889m mVar, int i12) {
        q(iaVar, i10, z10, dVar, lVar, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void v(androidx.compose.ui.d dVar, C18388ka kaVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-619116430);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(kaVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-619116430, i12, -1, "net.ikea.skapa.ui.components.TabIndicator (Tabs.kt:252)");
            }
            C18376ja jaVar = C18376ja.f151110a;
            C5077h.a(androidx.compose.foundation.b.c(J.i(dVar, jaVar.c()), jaVar.e(kaVar, k10, ((i12 >> 3) & 14) | 48), A0.g.h()), k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18460qa(dVar, kaVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N w(androidx.compose.ui.d dVar, C18388ka kaVar, int i10, int i11, C4889m mVar, int i12) {
        v(dVar, kaVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void x(C18364ia iaVar, boolean z10, boolean z11, boolean z12, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(929873362);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(iaVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.b(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.b(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= k10.b(z12) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(929873362, i11, -1, "net.ikea.skapa.ui.components.TabLayout (Tabs.kt:226)");
            }
            C4910x.a(E.a().d(C5747v0.k(C18376ja.f151110a.a(iaVar.a(), z10, z11, z12, k10, (i11 & 112) | 24576 | (i11 & 896) | (i11 & 7168)))), c1.c.e(125825298, true, new e(iaVar), k10, 54), k10, J0.f13770i | 48);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18484sa(iaVar, z10, z11, z12, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C18364ia iaVar, boolean z10, boolean z11, boolean z12, int i10, C4889m mVar, int i11) {
        x(iaVar, z10, z11, z12, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void z(java.util.List<? extends wK.C18364ia> r20, int r21, androidx.compose.ui.d r22, boolean r23, long r24, wK.C18388ka r26, nI.C17642l<? super java.lang.Integer, XH.C16807N> r27, U0.C4889m r28, int r29, int r30) {
        /*
            r9 = r20
            r10 = r27
            r11 = r29
            java.lang.String r0 = "tabList"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "onItemSelected"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            r0 = 1739800423(0x67b33f67, float:1.6929463E24)
            r1 = r28
            U0.m r12 = r1.k(r0)
            r1 = r30 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r11 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x002f
            boolean r1 = r12.F(r9)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r11
            goto L_0x0030
        L_0x002f:
            r1 = r11
        L_0x0030:
            r2 = r30 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            r13 = r21
            goto L_0x004b
        L_0x0039:
            r2 = r11 & 48
            r13 = r21
            if (r2 != 0) goto L_0x004b
            boolean r2 = r12.d(r13)
            if (r2 == 0) goto L_0x0048
            r2 = 32
            goto L_0x004a
        L_0x0048:
            r2 = 16
        L_0x004a:
            r1 = r1 | r2
        L_0x004b:
            r2 = r30 & 4
            if (r2 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r3 = r22
            goto L_0x0066
        L_0x0054:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0051
            r3 = r22
            boolean r4 = r12.V(r3)
            if (r4 == 0) goto L_0x0063
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r4
        L_0x0066:
            r4 = r30 & 8
            if (r4 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r5 = r23
            goto L_0x0081
        L_0x006f:
            r5 = r11 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x006c
            r5 = r23
            boolean r6 = r12.b(r5)
            if (r6 == 0) goto L_0x007e
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r6
        L_0x0081:
            r6 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x009a
            r6 = r30 & 16
            if (r6 != 0) goto L_0x0094
            r6 = r24
            boolean r8 = r12.e(r6)
            if (r8 == 0) goto L_0x0096
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0094:
            r6 = r24
        L_0x0096:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r1 = r1 | r8
            goto L_0x009c
        L_0x009a:
            r6 = r24
        L_0x009c:
            r8 = r30 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L_0x00a6
            r1 = r1 | r14
        L_0x00a3:
            r14 = r26
            goto L_0x00b7
        L_0x00a6:
            r14 = r14 & r11
            if (r14 != 0) goto L_0x00a3
            r14 = r26
            boolean r15 = r12.V(r14)
            if (r15 == 0) goto L_0x00b4
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r1 = r1 | r15
        L_0x00b7:
            r15 = r30 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00c0
            r1 = r1 | r16
            goto L_0x00d0
        L_0x00c0:
            r15 = r11 & r16
            if (r15 != 0) goto L_0x00d0
            boolean r15 = r12.F(r10)
            if (r15 == 0) goto L_0x00cd
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r1 = r1 | r15
        L_0x00d0:
            r15 = 599187(0x92493, float:8.3964E-40)
            r15 = r15 & r1
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r15 != r0) goto L_0x00e8
            boolean r0 = r12.l()
            if (r0 != 0) goto L_0x00e0
            goto L_0x00e8
        L_0x00e0:
            r12.L()
            r4 = r5
            r5 = r6
            r7 = r14
            goto L_0x0241
        L_0x00e8:
            r12.G()
            r0 = r11 & 1
            r15 = 0
            if (r0 == 0) goto L_0x0109
            boolean r0 = r12.O()
            if (r0 == 0) goto L_0x00f7
            goto L_0x0109
        L_0x00f7:
            r12.L()
            r0 = r30 & 16
            if (r0 == 0) goto L_0x0102
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r0
        L_0x0102:
            r8 = r5
            r17 = r6
            r19 = r14
            r14 = r3
            goto L_0x0138
        L_0x0109:
            if (r2 == 0) goto L_0x010e
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x010f
        L_0x010e:
            r0 = r3
        L_0x010f:
            if (r4 == 0) goto L_0x0112
            r5 = r15
        L_0x0112:
            r2 = r30 & 16
            if (r2 == 0) goto L_0x0127
            tK.v r2 = tK.C18030v.f147664a
            int r3 = tK.C18030v.f147665b
            tK.h r2 = r2.a(r12, r3)
            long r2 = r2.k0()
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r4
            r6 = r2
        L_0x0127:
            if (r8 == 0) goto L_0x0132
            wK.ka r2 = wK.C18388ka.Emphasised
            r14 = r0
            r19 = r2
            r8 = r5
            r17 = r6
            goto L_0x0138
        L_0x0132:
            r8 = r5
            r17 = r6
            r19 = r14
            r14 = r0
        L_0x0138:
            r12.y()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x014a
            r0 = -1
            java.lang.String r2 = "net.ikea.skapa.ui.components.Tabs (Tabs.kt:74)"
            r3 = 1739800423(0x67b33f67, float:1.6929463E24)
            U0.C4895p.S(r3, r1, r0, r2)
        L_0x014a:
            int r3 = YH.C16877v.p(r20)
            androidx.compose.ui.d r0 = G(r14, r8)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r2 = r2.g()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r4 = r4.k()
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r4, r12, r15)
            int r4 = U0.C4883j.a(r12, r15)
            U0.y r5 = r12.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r12, r0)
            G1.g$a r6 = G1.C4504g.f6515W
            nI.a r7 = r6.a()
            U0.f r15 = r12.m()
            if (r15 != 0) goto L_0x017d
            U0.C4883j.c()
        L_0x017d:
            r12.I()
            boolean r15 = r12.i()
            if (r15 == 0) goto L_0x018a
            r12.p(r7)
            goto L_0x018d
        L_0x018a:
            r12.t()
        L_0x018d:
            U0.m r7 = U0.F1.a(r12)
            nI.p r15 = r6.c()
            U0.F1.c(r7, r2, r15)
            nI.p r2 = r6.e()
            U0.F1.c(r7, r5, r2)
            nI.p r2 = r6.b()
            boolean r5 = r7.i()
            if (r5 != 0) goto L_0x01b7
            java.lang.Object r5 = r7.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r15)
            if (r5 != 0) goto L_0x01c5
        L_0x01b7:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.w(r4, r2)
        L_0x01c5:
            nI.p r2 = r6.d()
            U0.F1.c(r7, r0, r2)
            s0.h r0 = s0.C5862h.f28810a
            r2 = 458752(0x70000, float:6.42848E-40)
            r4 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x0201
            r5 = 1866927532(0x6f470dac, float:6.1604045E28)
            r12.W(r5)
            int r5 = r1 >> 12
            r5 = r5 & 112(0x70, float:1.57E-43)
            r6 = 6
            r5 = r5 | r6
            int r6 = r1 << 3
            r6 = r6 & 896(0x380, float:1.256E-42)
            r5 = r5 | r6
            int r6 = r1 << 12
            r4 = r4 & r6
            r4 = r4 | r5
            int r1 = r1 >> 3
            r1 = r1 & r2
            r7 = r4 | r1
            r1 = r19
            r2 = r21
            r4 = r20
            r5 = r27
            r6 = r12
            i(r0, r1, r2, r3, r4, r5, r6, r7)
            r12.P()
            r16 = r8
            goto L_0x022e
        L_0x0201:
            r0 = 1867037210(0x6f48ba1a, float:6.2121985E28)
            r12.W(r0)
            int r0 = r1 >> 15
            r0 = r0 & 14
            int r5 = r1 << 3
            r6 = r5 & 112(0x70, float:1.57E-43)
            r0 = r0 | r6
            r5 = r5 & 896(0x380, float:1.256E-42)
            r0 = r0 | r5
            r4 = r4 & r1
            r0 = r0 | r4
            int r1 = r1 >> 3
            r1 = r1 & r2
            r15 = r0 | r1
            r0 = r19
            r1 = r20
            r2 = r21
            r4 = r17
            r6 = r27
            r7 = r12
            r16 = r8
            r8 = r15
            m(r0, r1, r2, r3, r4, r6, r7, r8)
            r12.P()
        L_0x022e:
            r12.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x023a
            U0.C4895p.R()
        L_0x023a:
            r3 = r14
            r4 = r16
            r5 = r17
            r7 = r19
        L_0x0241:
            U0.Y0 r12 = r12.n()
            if (r12 == 0) goto L_0x025a
            wK.la r14 = new wK.la
            r0 = r14
            r1 = r20
            r2 = r21
            r8 = r27
            r9 = r29
            r10 = r30
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            r12.a(r14)
        L_0x025a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18496ta.z(java.util.List, int, androidx.compose.ui.d, boolean, long, wK.ka, nI.l, U0.m, int, int):void");
    }
}
