package yn;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import HJ.C15854t;
import KJ.C15987c;
import O0.V;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13585f1;
import SC.C13589g1;
import SC.C13598i2;
import SC.C13607l;
import SC.C13643u0;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import TC.C13679b;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import android.graphics.Color;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.u;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.core.model.Image;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import gs.C11352b;
import gs.e;
import i1.C5437c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import n0.C5599e;
import n0.C5607m;
import nI.C17631a;
import nI.C17642l;
import p1.C5747v0;
import p1.C5749w0;
import p1.C5751x0;
import p1.i1;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import s0.C5834E;
import s0.C5842M;
import s0.C5843N;
import s0.C5852X;
import s0.C5861g;
import s0.C5862h;
import s0.C5872r;
import t0.C5934A;
import t0.C5935B;
import t0.C5937b;
import t0.C5938c;
import t0.x;
import t1.C5942c;
import tK.C18030v;
import uK.C18146a;
import vn.C12197b;
import wn.C12289d;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ay\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aa\u0010\u0016\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n2\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a9\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001aK\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b\u001f\u0010 \u001aK\u0010!\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b!\u0010 \u001a\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010%\u001a!\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0003H\u0003¢\u0006\u0004\b'\u0010(\u001a?\u0010-\u001a\u00020\b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b-\u0010.\u001a9\u0010/\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b/\u0010\u0019\u001a9\u00100\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b0\u0010\u0019\u001aA\u00101\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b1\u00102\u001a9\u00103\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b3\u0010\u0019\u001a)\u00106\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u0002042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b6\u00107\u001a;\u00108\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0003¢\u0006\u0004\b8\u00109\u001aW\u0010<\u001a\u00020\b*\u00020:2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010;\u001a\u00020\u00032\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b<\u0010=¨\u0006A²\u0006\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00038\n@\nX\u0002²\u0006\u000e\u0010>\u001a\u00020\u00058\n@\nX\u0002²\u0006\u000e\u0010?\u001a\u00020\u00058\n@\nX\u0002²\u0006\u000e\u0010?\u001a\u00020\u00058\n@\nX\u0002²\u0006\u000e\u0010@\u001a\u00020\u00058\n@\nX\u0002²\u0006\u000e\u0010@\u001a\u00020\u00058\n@\nX\u0002"}, d2 = {"LAn/j;", "filtersState", "LU0/A1;", "", "selectedFilterIdState", "", "isLoading", "Lkotlin/Function1;", "LXH/N;", "onSortOptionSelected", "Lkotlin/Function2;", "onFilterSelected", "Lkotlin/Function0;", "onClearAllClicked", "onViewProductsClicked", "Y", "(LAn/j;LU0/A1;ZLnI/l;LnI/p;LnI/a;LnI/a;LU0/m;I)V", "selectedFilterId", "Lvn/b;", "filter", "caption", "onAccordionClick", "T", "(Ljava/lang/String;Lvn/b;Ljava/lang/String;LnI/p;LnI/l;ZLU0/m;I)V", "y", "(Lvn/b;LnI/p;ZLU0/m;I)V", "Lvn/b$b;", "filterValue", "filterId", "Landroidx/compose/ui/d;", "modifier", "A", "(Lvn/b$b;LnI/p;Ljava/lang/String;ZLandroidx/compose/ui/d;LU0/m;II)V", "F", "colorHex", "", "A0", "(Ljava/lang/String;)Ljava/lang/Integer;", "Lp1/v0;", "z0", "(Lvn/b$b;Ljava/lang/String;LU0/m;I)Lp1/v0;", "visualElement", "filterName", "filterCount", "enabled", "w", "(LnI/p;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/d;LU0/m;II)V", "R", "P", "K", "(Lvn/b$b;LnI/p;Ljava/lang/String;ZLU0/m;I)V", "h0", "Lt0/A;", "lazyListState", "f0", "(Ljava/lang/String;Lt0/A;LAn/j;LU0/m;I)V", "u", "(LnI/a;LAn/j;ZLnI/a;LU0/m;I)V", "Lt0/x;", "accordionId", "B0", "(Lt0/x;LAn/j;LnI/l;Ljava/lang/String;Ljava/lang/String;LnI/l;)V", "filterExpanded", "selectedState", "checkboxState", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yn.f0  reason: case insensitive filesystem */
public final class C12434f0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.f0$a */
    static final class a implements nI.q<C5872r, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12197b f106862a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nI.p<String, String, C16807N> f106863b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f106864c;

        a(C12197b bVar, nI.p<? super String, ? super String, C16807N> pVar, boolean z10) {
            this.f106862a = bVar;
            this.f106863b = pVar;
            this.f106864c = z10;
        }

        public final void a(C5872r rVar, C4889m mVar, int i10) {
            C17542s.j(rVar, "$this$FlowRow");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-301737223, i10, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.ColorFilters.<anonymous> (FiltersDrawer.kt:230)");
                }
                nI.p<String, String, C16807N> pVar = this.f106863b;
                C12197b bVar = this.f106862a;
                boolean z10 = this.f106864c;
                for (C12197b.C2499b bVar2 : this.f106862a.o()) {
                    if (bVar2.d() != null) {
                        mVar.W(-210018125);
                        C12434f0.A(bVar2, pVar, bVar.getId(), z10, (androidx.compose.ui.d) null, mVar, 0, 16);
                        mVar.P();
                    } else {
                        mVar.W(-209755400);
                        C12434f0.F(bVar2, pVar, bVar.getId(), z10, (androidx.compose.ui.d) null, mVar, 0, 16);
                        mVar.P();
                    }
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
            a((C5872r) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.composables.FiltersDrawerKt$ColorImageSelection$1$1", f = "FiltersDrawer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: yn.f0$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106865c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12197b.C2499b f106866d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f106867e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C12197b.C2499b bVar, C4899r0<Boolean> r0Var, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f106866d = bVar;
            this.f106867e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f106866d, this.f106867e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f106865c == 0) {
                y.b(obj);
                C12434f0.C(this.f106867e, this.f106866d.g());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.f0$c */
    static final class c implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12197b.C2499b f106868a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f106869b;

        c(C12197b.C2499b bVar, C4899r0<Boolean> r0Var) {
            this.f106868a = bVar;
            this.f106869b = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C12197b.C2499b bVar, e.a aVar) {
            C17542s.j(aVar, "$this$ikeaImageRequest");
            Image d10 = bVar.d();
            C17542s.g(d10);
            aVar.j(d10.getUrl());
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            androidx.compose.ui.d dVar;
            int i11;
            C4889m mVar2 = mVar;
            int i12 = i10;
            if ((i12 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-516022783, i12, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.ColorImageSelection.<anonymous> (FiltersDrawer.kt:268)");
                }
                androidx.compose.ui.d dVar2 = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d a10 = m1.e.a(J.t(dVar2, c2.h.B((float) 60)), A0.g.h());
                C5437c e10 = C5437c.f24302a.e();
                C12197b.C2499b bVar = this.f106868a;
                C4899r0<Boolean> r0Var = this.f106869b;
                I h10 = C5077h.h(e10, false);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e11 = androidx.compose.ui.c.e(mVar2, a10);
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
                F1.c(a13, h10, aVar.c());
                F1.c(a13, s10, aVar.e());
                nI.p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e11, aVar.d());
                C5079j jVar = C5079j.f18125a;
                mVar2.W(1008555018);
                boolean F10 = mVar2.F(bVar);
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new C12437g0(bVar);
                    mVar2.u(D10);
                }
                mVar.P();
                gs.e a14 = gs.f.a((C17642l) D10, mVar2, 0);
                mVar2.W(1008560624);
                if (C12434f0.B(r0Var)) {
                    float B10 = c2.h.B((float) 1);
                    C18030v vVar = C18030v.f147664a;
                    int i13 = C18030v.f147665b;
                    dVar = C5599e.g(C5599e.g(dVar2, B10, vVar.a(mVar2, i13).j0(), A0.g.h()), c2.h.B((float) 3), vVar.a(mVar2, i13).k0(), A0.g.h());
                } else {
                    dVar = dVar2;
                }
                mVar.P();
                C4899r0<Boolean> r0Var2 = r0Var;
                C12197b.C2499b bVar2 = bVar;
                androidx.compose.ui.d dVar3 = dVar2;
                C4889m mVar3 = mVar2;
                C11352b.b(a14, (String) null, dVar, (C5942c) null, (C5942c) null, (C5942c) null, (C5437c) null, (C4478k) null, 0.0f, (C5749w0) null, 0, mVar, gs.e.f97946h | 48, 0, 2040);
                mVar3.W(1008581551);
                if (!bVar2.b()) {
                    i11 = 0;
                    C5077h.a(androidx.compose.foundation.b.d(J.f(dVar3, 0.0f, 1, (Object) null), C5747v0.o(C18030v.f147664a.a(mVar3, C18030v.f147665b).E0(), 0.75f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (i1) null, 2, (Object) null), mVar3, 0);
                } else {
                    i11 = 0;
                }
                mVar.P();
                mVar3.W(1008590983);
                if (C12434f0.B(r0Var2)) {
                    V.a(J1.e.c(C18146a.f148601q1, mVar3, i11), J1.j.b(Oo.b.f84397I, mVar3, i11), (androidx.compose.ui.d) null, C18030v.f147664a.a(mVar3, C18030v.f147665b).x0(), mVar, 0, 4);
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
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.composables.FiltersDrawerKt$ColorSelection$1$1", f = "FiltersDrawer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: yn.f0$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106870c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12197b.C2499b f106871d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f106872e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C12197b.C2499b bVar, C4899r0<Boolean> r0Var, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f106871d = bVar;
            this.f106872e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f106871d, this.f106872e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f106870c == 0) {
                y.b(obj);
                C12434f0.H(this.f106872e, this.f106871d.g());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.f0$e */
    static final class e implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5747v0 f106873a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106874b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C12197b.C2499b f106875c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f106876d;

        e(C5747v0 v0Var, long j10, C12197b.C2499b bVar, C4899r0<Boolean> r0Var) {
            this.f106873a = v0Var;
            this.f106874b = j10;
            this.f106875c = bVar;
            this.f106876d = r0Var;
        }

        public final void a(C4889m mVar, int i10) {
            androidx.compose.ui.d dVar;
            long F02;
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1995130932, i10, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.ColorSelection.<anonymous> (FiltersDrawer.kt:358)");
                }
                androidx.compose.ui.d dVar2 = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d a10 = m1.e.a(J.t(dVar2, c2.h.B((float) 60)), A0.g.h());
                mVar.W(-1771114326);
                if (C12434f0.G(this.f106876d)) {
                    float B10 = c2.h.B((float) 1);
                    C18030v vVar = C18030v.f147664a;
                    int i11 = C18030v.f147665b;
                    dVar = C5599e.g(C5599e.g(dVar2, B10, vVar.a(mVar, i11).j0(), A0.g.h()), c2.h.B((float) 3), vVar.a(mVar, i11).k0(), A0.g.h());
                } else {
                    dVar = dVar2;
                }
                mVar.P();
                androidx.compose.ui.d d10 = androidx.compose.foundation.b.d(a10.s(dVar).s(this.f106873a == null ? dVar2 : androidx.compose.foundation.b.d(C5599e.g(dVar2, c2.h.B((float) 1), this.f106873a.y(), A0.g.h()), this.f106874b, (i1) null, 2, (Object) null)), this.f106874b, (i1) null, 2, (Object) null);
                mVar.W(-1771071586);
                if (!this.f106875c.b()) {
                    dVar2 = androidx.compose.foundation.b.d(dVar2, C5747v0.o(C18030v.f147664a.a(mVar, C18030v.f147665b).E0(), 0.75f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (i1) null, 2, (Object) null);
                }
                mVar.P();
                androidx.compose.ui.d s10 = d10.s(dVar2);
                C5437c e10 = C5437c.f24302a.e();
                long j10 = this.f106874b;
                C4899r0<Boolean> r0Var = this.f106876d;
                I h10 = C5077h.h(e10, false);
                int a11 = C4883j.a(mVar, 0);
                C4912y s11 = mVar.s();
                androidx.compose.ui.d e11 = androidx.compose.ui.c.e(mVar, s10);
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
                F1.c(a13, h10, aVar.c());
                F1.c(a13, s11, aVar.e());
                nI.p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e11, aVar.d());
                C5079j jVar = C5079j.f18125a;
                mVar.W(-391950535);
                if (C12434f0.G(r0Var)) {
                    C5942c c10 = J1.e.c(C18146a.f148601q1, mVar, 0);
                    String b11 = J1.j.b(Oo.b.f84397I, mVar, 0);
                    if (C5751x0.j(j10) > 0.5f) {
                        mVar.W(734710864);
                        F02 = C18030v.f147664a.a(mVar, C18030v.f147665b).x0();
                        mVar.P();
                    } else {
                        mVar.W(734801136);
                        F02 = C18030v.f147664a.a(mVar, C18030v.f147665b).F0();
                        mVar.P();
                    }
                    V.a(c10, b11, (androidx.compose.ui.d) null, F02, mVar, 0, 4);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.composables.FiltersDrawerKt$FilterCheckbox$1$1", f = "FiltersDrawer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: yn.f0$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106877c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12197b.C2499b f106878d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f106879e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C12197b.C2499b bVar, C4899r0<Boolean> r0Var, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f106878d = bVar;
            this.f106879e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f106878d, this.f106879e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f106877c == 0) {
                y.b(obj);
                C12434f0.M(this.f106879e, this.f106878d.g());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.f0$g */
    static final class g implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12197b.C2499b f106880a;

        g(C12197b.C2499b bVar) {
            this.f106880a = bVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(Image image, e.a aVar) {
            C17542s.j(aVar, "$this$ikeaImageRequest");
            aVar.j(image.getUrl());
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1133439021, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.FilterCheckbox.<anonymous> (FiltersDrawer.kt:556)");
                }
                Image d10 = this.f106880a.d();
                if (d10 != null) {
                    mVar2.W(664561903);
                    boolean F10 = mVar2.F(d10);
                    Object D10 = mVar.D();
                    if (F10 || D10 == C4889m.f14007a.a()) {
                        D10 = new C12440h0(d10);
                        mVar2.u(D10);
                    }
                    mVar.P();
                    C11352b.b(gs.f.a((C17642l) D10, mVar2, 0), (String) null, J.i(androidx.compose.ui.d.f18749a, c2.h.B((float) 24)), (C5942c) null, (C5942c) null, (C5942c) null, (C5437c) null, (C4478k) null, 0.0f, C5749w0.a.b(C5749w0.f27365b, C18030v.f147664a.a(mVar2, C18030v.f147665b).G0(), 0, 2, (Object) null), 0, mVar, gs.e.f97946h | 432, 0, 1528);
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
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.composables.FiltersDrawerKt$FilterWithAccordion$1$1", f = "FiltersDrawer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: yn.f0$h */
    static final class h extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106881c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f106882d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12197b f106883e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f106884f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(String str, C12197b bVar, C4899r0<Boolean> r0Var, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f106882d = str;
            this.f106883e = bVar;
            this.f106884f = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f106882d, this.f106883e, this.f106884f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f106881c == 0) {
                y.b(obj);
                C12434f0.V(this.f106884f, C17542s.e(this.f106882d, this.f106883e.getId()));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.f0$i */
    static final class i implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12197b f106885a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nI.p<String, String, C16807N> f106886b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f106887c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yn.f0$i$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f106888a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    vn.b$a[] r0 = vn.C12197b.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    vn.b$a r1 = vn.C12197b.a.MULTI_TYPE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    vn.b$a r1 = vn.C12197b.a.MULTI_VALUE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    vn.b$a r1 = vn.C12197b.a.COLOR     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    vn.b$a r1 = vn.C12197b.a.INVALID     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f106888a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: yn.C12434f0.i.a.<clinit>():void");
            }
        }

        i(C12197b bVar, nI.p<? super String, ? super String, C16807N> pVar, boolean z10) {
            this.f106885a = bVar;
            this.f106886b = pVar;
            this.f106887c = z10;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1162346487, i10, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.FilterWithAccordion.<anonymous> (FiltersDrawer.kt:186)");
                }
                C12197b bVar = this.f106885a;
                nI.p<String, String, C16807N> pVar = this.f106886b;
                boolean z10 = this.f106887c;
                d.a aVar = androidx.compose.ui.d.f18749a;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar, 0);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, aVar);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar2.a();
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
                F1.c(a13, a10, aVar2.c());
                F1.c(a13, s10, aVar2.e());
                nI.p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar2.d());
                C5862h hVar = C5862h.f28810a;
                int i11 = a.f106888a[bVar.j().ordinal()];
                if (i11 == 1) {
                    mVar.W(-505224815);
                    C12434f0.P(bVar, pVar, z10, mVar, 0);
                    mVar.P();
                } else if (i11 == 2) {
                    mVar.W(-504946032);
                    C12434f0.R(bVar, pVar, z10, mVar, 0);
                    mVar.P();
                } else if (i11 == 3) {
                    mVar.W(-504672240);
                    C12434f0.y(bVar, pVar, z10, mVar, 0);
                    mVar.P();
                } else if (i11 == 4) {
                    mVar.W(-293365738);
                    mVar.P();
                } else {
                    mVar.W(-293393965);
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

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.composables.FiltersDrawerKt$FiltersDrawer$1$1", f = "FiltersDrawer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: yn.f0$j */
    static final class j extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106889c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1<String> f106890d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<String> f106891e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(A1<String> a12, C4899r0<String> r0Var, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f106890d = a12;
            this.f106891e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new j(this.f106890d, this.f106891e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f106889c == 0) {
                y.b(obj);
                C12434f0.e0(this.f106891e, this.f106890d.getValue());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.f0$k */
    static final class k implements C17642l<String, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4899r0<String> f106892a;

        k(C4899r0<String> r0Var) {
            this.f106892a = r0Var;
        }

        public final void a(String str) {
            C12434f0.e0(this.f106892a, str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.f0$l */
    static final class l implements C17642l<C12197b.C2499b, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f106893a = new l();

        l() {
        }

        /* renamed from: a */
        public final CharSequence invoke(C12197b.C2499b bVar) {
            C17542s.j(bVar, "it");
            return bVar.e();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.f0$m */
    static final class m implements C17642l<C12197b.C2499b, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f106894a = new m();

        m() {
        }

        /* renamed from: a */
        public final CharSequence invoke(C12197b.C2499b bVar) {
            C17542s.j(bVar, "it");
            return bVar.e();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: yn.f0$n */
    public static final class n extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ nI.p f106895c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f106896d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(nI.p pVar, List list) {
            super(1);
            this.f106895c = pVar;
            this.f106896d = list;
        }

        public final Object a(int i10) {
            return this.f106895c.invoke(Integer.valueOf(i10), this.f106896d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: yn.f0$o */
    public static final class o extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f106897c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(List list) {
            super(1);
            this.f106897c = list;
        }

        public final Object a(int i10) {
            this.f106897c.get(i10);
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: yn.f0$p */
    public static final class p extends C17544u implements nI.r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f106898c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ nI.p f106899d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f106900e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0 f106901f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(List list, nI.p pVar, boolean z10, C4899r0 r0Var) {
            super(4);
            this.f106898c = list;
            this.f106899d = pVar;
            this.f106900e = z10;
            this.f106901f = r0Var;
        }

        public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (mVar.V(cVar) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i12 & 147) != 146 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
                }
                C12197b bVar = (C12197b) this.f106898c.get(i10);
                mVar.W(600585384);
                ArrayList arrayList = new ArrayList();
                for (Object next : bVar.o()) {
                    if (((C12197b.C2499b) next).g()) {
                        arrayList.add(next);
                    }
                }
                mVar.W(1127753693);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = m.f106894a;
                    mVar.u(D10);
                }
                mVar.P();
                String G02 = C16877v.G0(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) D10, 31, (Object) null);
                ArrayList arrayList2 = new ArrayList();
                for (C12197b.c b10 : bVar.n()) {
                    C16877v.E(arrayList2, b10.b());
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object next2 : arrayList2) {
                    if (((C12197b.C2499b) next2).g()) {
                        arrayList3.add(next2);
                    }
                }
                mVar.W(1127758173);
                Object D11 = mVar.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D11 == aVar.a()) {
                    D11 = l.f106893a;
                    mVar.u(D11);
                }
                mVar.P();
                String str = G02 + C16877v.G0(arrayList3, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) D11, 31, (Object) null);
                if (bVar.o().size() == 1) {
                    mVar.W(600889772);
                    C12434f0.h0(bVar, this.f106899d, this.f106900e, mVar, 0);
                    mVar.P();
                } else {
                    mVar.W(601127387);
                    String w02 = C12434f0.Z(this.f106901f);
                    nI.p pVar = this.f106899d;
                    mVar.W(1127778827);
                    Object D12 = mVar.D();
                    if (D12 == aVar.a()) {
                        D12 = new k(this.f106901f);
                        mVar.u(D12);
                    }
                    mVar.P();
                    C12434f0.T(w02, bVar, str, pVar, (C17642l) D12, this.f106900e, mVar, 24576);
                    mVar.P();
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

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.composables.FiltersDrawerKt$HandleAutoScroll$1$1", f = "FiltersDrawer.kt", l = {611, 615}, m = "invokeSuspend")
    /* renamed from: yn.f0$q */
    static final class q extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106902c;

        /* renamed from: d  reason: collision with root package name */
        int f106903d;

        /* renamed from: e  reason: collision with root package name */
        int f106904e;

        /* renamed from: f  reason: collision with root package name */
        Object f106905f;

        /* renamed from: g  reason: collision with root package name */
        Object f106906g;

        /* renamed from: h  reason: collision with root package name */
        Object f106907h;

        /* renamed from: i  reason: collision with root package name */
        int f106908i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f106909j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C5934A f106910k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ An.j f106911l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(String str, C5934A a10, An.j jVar, C17164e<? super q> eVar) {
            super(2, eVar);
            this.f106909j = str;
            this.f106910k = a10;
            this.f106911l = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new q(this.f106909j, this.f106910k, this.f106911l, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((q) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            int i10;
            Object f10 = C17187b.f();
            int i11 = this.f106908i;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        Iterator it = (Iterator) this.f106907h;
                        String str = (String) this.f106906g;
                        List list = (List) this.f106905f;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                y.b(obj);
            } else {
                y.b(obj);
                if (C17542s.e(this.f106909j, "sortOptions") || this.f106909j == null) {
                    C5934A a10 = this.f106910k;
                    this.f106908i = 1;
                    if (C5934A.m(a10, 0, 0, this, 2, (Object) null) == f10) {
                        return f10;
                    }
                } else {
                    C15987c<C12197b> g10 = this.f106911l.g();
                    String str2 = this.f106909j;
                    Iterator<C12197b> it2 = g10.iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i10 = -1;
                            break;
                        } else if (C17542s.e(it2.next().getId(), str2)) {
                            i10 = i12;
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (i10 != -1) {
                        this.f106905f = g10;
                        this.f106906g = str2;
                        this.f106907h = it2;
                        this.f106902c = i10;
                        this.f106903d = 0;
                        this.f106904e = i12;
                        this.f106908i = 2;
                        if (C5934A.m(this.f106910k, i10 + 1, 0, this, 2, (Object) null) == f10) {
                            return f10;
                        }
                    }
                }
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.composables.FiltersDrawerKt$SingleFilterItem$1$1", f = "FiltersDrawer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: yn.f0$r */
    static final class r extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106912c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12197b.C2499b f106913d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f106914e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(C12197b.C2499b bVar, C4899r0<Boolean> r0Var, C17164e<? super r> eVar) {
            super(2, eVar);
            this.f106913d = bVar;
            this.f106914e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new r(this.f106913d, this.f106914e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((r) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f106912c == 0) {
                y.b(obj);
                C12434f0.j0(this.f106914e, this.f106913d.g());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.f0$s */
    static final class s implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ An.j f106915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f106916b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f106917c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f106918d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f106919e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.composables.FiltersDrawerKt$sortOptions$1$1$1", f = "FiltersDrawer.kt", l = {}, m = "invokeSuspend")
        /* renamed from: yn.f0$s$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f106920c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f106921d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f106922e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f106923f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C4899r0<Boolean> r0Var, String str, String str2, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f106921d = r0Var;
                this.f106922e = str;
                this.f106923f = str2;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f106921d, this.f106922e, this.f106923f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f106920c == 0) {
                    y.b(obj);
                    this.f106921d.setValue(kotlin.coroutines.jvm.internal.b.a(C17542s.e(this.f106922e, this.f106923f)));
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yn.f0$s$b */
        static final class b implements nI.p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ An.j f106924a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ vn.c f106925b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l<String, C16807N> f106926c;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.composables.FiltersDrawerKt$sortOptions$1$2$1$2$1", f = "FiltersDrawer.kt", l = {}, m = "invokeSuspend")
            /* renamed from: yn.f0$s$b$a */
            static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f106927c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C17642l<String, C16807N> f106928d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ vn.c f106929e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(C17642l<? super String, C16807N> lVar, vn.c cVar, C17164e<? super a> eVar) {
                    super(2, eVar);
                    this.f106928d = lVar;
                    this.f106929e = cVar;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new a(this.f106928d, this.f106929e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    C17187b.f();
                    if (this.f106927c == 0) {
                        y.b(obj);
                        C17642l<String, C16807N> lVar = this.f106928d;
                        vn.c cVar = this.f106929e;
                        lVar.invoke(cVar != null ? cVar.c() : null);
                        return C16807N.f139792a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            b(An.j jVar, vn.c cVar, C17642l<? super String, C16807N> lVar) {
                this.f106924a = jVar;
                this.f106925b = cVar;
                this.f106926c = lVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(C17642l lVar, C17642l lVar2, C13598i2 i2Var) {
                C17542s.j(i2Var, "it");
                lVar.invoke(i2Var.b());
                lVar2.invoke(i2Var.b());
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: nI.l} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(U0.C4889m r18, int r19) {
                /*
                    r17 = this;
                    r0 = r17
                    r10 = r18
                    r1 = r19
                    r2 = r1 & 3
                    r3 = 2
                    if (r2 != r3) goto L_0x0017
                    boolean r2 = r18.l()
                    if (r2 != 0) goto L_0x0012
                    goto L_0x0017
                L_0x0012:
                    r18.L()
                    goto L_0x0192
                L_0x0017:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x0026
                    r2 = -1
                    java.lang.String r4 = "com.ingka.ikea.browseandsearch.plp.impl.composables.sortOptions.<anonymous>.<anonymous> (FiltersDrawer.kt:689)"
                    r5 = 75218145(0x47bbce1, float:2.9591637E-36)
                    U0.C4895p.S(r5, r1, r2, r4)
                L_0x0026:
                    An.j r1 = r0.f106924a
                    vn.c r2 = r0.f106925b
                    nI.l<java.lang.String, XH.N> r4 = r0.f106926c
                    androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
                    androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
                    androidx.compose.foundation.layout.d$m r6 = r6.g()
                    i1.c$a r7 = i1.C5437c.f24302a
                    i1.c$b r7 = r7.k()
                    r8 = 0
                    E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r10, r8)
                    int r7 = U0.C4883j.a(r10, r8)
                    U0.y r9 = r18.s()
                    androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r10, r5)
                    G1.g$a r11 = G1.C4504g.f6515W
                    nI.a r12 = r11.a()
                    U0.f r13 = r18.m()
                    if (r13 != 0) goto L_0x005a
                    U0.C4883j.c()
                L_0x005a:
                    r18.I()
                    boolean r13 = r18.i()
                    if (r13 == 0) goto L_0x0067
                    r10.p(r12)
                    goto L_0x006a
                L_0x0067:
                    r18.t()
                L_0x006a:
                    U0.m r12 = U0.F1.a(r18)
                    nI.p r13 = r11.c()
                    U0.F1.c(r12, r6, r13)
                    nI.p r6 = r11.e()
                    U0.F1.c(r12, r9, r6)
                    nI.p r6 = r11.b()
                    boolean r9 = r12.i()
                    if (r9 != 0) goto L_0x0094
                    java.lang.Object r9 = r12.D()
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
                    boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r13)
                    if (r9 != 0) goto L_0x00a2
                L_0x0094:
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
                    r12.u(r9)
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    r12.w(r7, r6)
                L_0x00a2:
                    nI.p r6 = r11.d()
                    U0.F1.c(r12, r5, r6)
                    s0.h r5 = s0.C5862h.f28810a
                    KJ.c r1 = r1.h()
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r6 = 10
                    int r6 = YH.C16877v.y(r1, r6)
                    r5.<init>(r6)
                    java.util.Iterator r1 = r1.iterator()
                L_0x00be:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L_0x00e0
                    java.lang.Object r6 = r1.next()
                    vn.c r6 = (vn.c) r6
                    SC.i2 r7 = new SC.i2
                    java.lang.String r12 = r6.c()
                    java.lang.String r13 = r6.a()
                    r15 = 4
                    r16 = 0
                    r14 = 0
                    r11 = r7
                    r11.<init>(r12, r13, r14, r15, r16)
                    r5.add(r7)
                    goto L_0x00be
                L_0x00e0:
                    KJ.c r1 = KJ.C15985a.h(r5)
                    r5 = 1245342967(0x4a3a6cf7, float:3054397.8)
                    r10.W(r5)
                    java.lang.Object r5 = r18.D()
                    U0.m$a r6 = U0.C4889m.f14007a
                    java.lang.Object r7 = r6.a()
                    r9 = 0
                    if (r5 != r7) goto L_0x0106
                    if (r2 == 0) goto L_0x00fe
                    java.lang.String r5 = r2.c()
                    goto L_0x00ff
                L_0x00fe:
                    r5 = r9
                L_0x00ff:
                    U0.r0 r5 = U0.u1.e(r5, r9, r3, r9)
                    r10.u(r5)
                L_0x0106:
                    U0.r0 r5 = (U0.C4899r0) r5
                    r18.P()
                    java.lang.Object r3 = r5.q()
                    java.lang.String r3 = (java.lang.String) r3
                    nI.l r5 = r5.l()
                    r7 = 1245346254(0x4a3a79ce, float:3055219.5)
                    r10.W(r7)
                    boolean r7 = r10.V(r5)
                    boolean r11 = r10.F(r2)
                    r7 = r7 | r11
                    java.lang.Object r11 = r18.D()
                    if (r7 != 0) goto L_0x0130
                    java.lang.Object r7 = r6.a()
                    if (r11 != r7) goto L_0x0138
                L_0x0130:
                    yn.f0$s$b$a r11 = new yn.f0$s$b$a
                    r11.<init>(r5, r2, r9)
                    r10.u(r11)
                L_0x0138:
                    nI.p r11 = (nI.p) r11
                    r18.P()
                    U0.P.g(r2, r11, r10, r8)
                    r2 = 1245353502(0x4a3a961e, float:3057031.5)
                    r10.W(r2)
                    boolean r2 = r10.V(r5)
                    boolean r7 = r10.V(r4)
                    r2 = r2 | r7
                    java.lang.Object r7 = r18.D()
                    if (r2 != 0) goto L_0x015b
                    java.lang.Object r2 = r6.a()
                    if (r7 != r2) goto L_0x0163
                L_0x015b:
                    yn.j0 r7 = new yn.j0
                    r7.<init>(r5, r4)
                    r10.u(r7)
                L_0x0163:
                    r4 = r7
                    nI.l r4 = (nI.C17642l) r4
                    r18.P()
                    androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                    r5 = 0
                    r6 = 1
                    androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r2, r5, r6, r9)
                    SC.h2 r6 = SC.C13594h2.Subtle
                    r2 = 199680(0x30c00, float:2.79811E-40)
                    int r7 = SC.C13598i2.f116299d
                    r8 = r7 | r2
                    r9 = 16
                    r7 = 0
                    r2 = r3
                    r3 = r4
                    r4 = r5
                    r5 = r7
                    r7 = r18
                    SC.C13590g2.d(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    r18.x()
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x0192
                    U0.C4895p.R()
                L_0x0192:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: yn.C12434f0.s.b.b(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        s(An.j jVar, String str, String str2, C17642l<? super String, C16807N> lVar, C17642l<? super String, C16807N> lVar2) {
            this.f106915a = jVar;
            this.f106916b = str;
            this.f106917c = str2;
            this.f106918d = lVar;
            this.f106919e = lVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C4899r0 r0Var, C17642l lVar, String str, boolean z10) {
            r0Var.setValue(Boolean.valueOf(z10));
            if (!z10) {
                str = null;
            }
            lVar.invoke(str);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(t0.C5938c r20, U0.C4889m r21, int r22) {
            /*
                r19 = this;
                r0 = r19
                r14 = r21
                r1 = r22
                java.lang.String r2 = "$this$item"
                r3 = r20
                kotlin.jvm.internal.C17542s.j(r3, r2)
                r2 = r1 & 17
                r3 = 16
                if (r2 != r3) goto L_0x001f
                boolean r2 = r21.l()
                if (r2 != 0) goto L_0x001a
                goto L_0x001f
            L_0x001a:
                r21.L()
                goto L_0x012a
            L_0x001f:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x002e
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.browseandsearch.plp.impl.composables.sortOptions.<anonymous> (FiltersDrawer.kt:670)"
                r4 = -1453553203(0xffffffffa95c89cd, float:-4.8969336E-14)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x002e:
                An.j r1 = r0.f106915a
                KJ.c r1 = r1.h()
                java.util.Iterator r1 = r1.iterator()
            L_0x0038:
                boolean r2 = r1.hasNext()
                r3 = 0
                if (r2 == 0) goto L_0x004d
                java.lang.Object r2 = r1.next()
                r4 = r2
                vn.c r4 = (vn.c) r4
                boolean r4 = r4.b()
                if (r4 == 0) goto L_0x0038
                goto L_0x004e
            L_0x004d:
                r2 = r3
            L_0x004e:
                vn.c r2 = (vn.c) r2
                java.lang.String r1 = r0.f106916b
                java.lang.String r4 = r0.f106917c
                boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r4)
                r4 = 1076055344(0x40234d30, float:2.5515862)
                r14.W(r4)
                java.lang.Object r4 = r21.D()
                U0.m$a r5 = U0.C4889m.f14007a
                java.lang.Object r6 = r5.a()
                if (r4 != r6) goto L_0x0076
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r4 = 2
                U0.r0 r4 = U0.u1.e(r1, r3, r4, r3)
                r14.u(r4)
            L_0x0076:
                U0.r0 r4 = (U0.C4899r0) r4
                r21.P()
                r1 = 1076057456(0x40235570, float:2.5520897)
                r14.W(r1)
                nI.l<java.lang.String, XH.N> r1 = r0.f106918d
                boolean r1 = r14.V(r1)
                java.lang.String r6 = r0.f106917c
                boolean r6 = r14.V(r6)
                r1 = r1 | r6
                nI.l<java.lang.String, XH.N> r6 = r0.f106918d
                java.lang.String r7 = r0.f106917c
                java.lang.Object r8 = r21.D()
                if (r1 != 0) goto L_0x009e
                java.lang.Object r1 = r5.a()
                if (r8 != r1) goto L_0x00a6
            L_0x009e:
                yn.i0 r8 = new yn.i0
                r8.<init>(r4, r6, r7)
                r14.u(r8)
            L_0x00a6:
                r6 = r8
                nI.l r6 = (nI.C17642l) r6
                r21.P()
                java.lang.String r1 = r0.f106916b
                r7 = 1076063324(0x40236c5c, float:2.5534887)
                r14.W(r7)
                java.lang.String r7 = r0.f106916b
                boolean r7 = r14.V(r7)
                java.lang.String r8 = r0.f106917c
                boolean r8 = r14.V(r8)
                r7 = r7 | r8
                java.lang.String r8 = r0.f106916b
                java.lang.String r9 = r0.f106917c
                java.lang.Object r10 = r21.D()
                if (r7 != 0) goto L_0x00d1
                java.lang.Object r5 = r5.a()
                if (r10 != r5) goto L_0x00d9
            L_0x00d1:
                yn.f0$s$a r10 = new yn.f0$s$a
                r10.<init>(r4, r8, r9, r3)
                r14.u(r10)
            L_0x00d9:
                nI.p r10 = (nI.p) r10
                r21.P()
                r5 = 0
                U0.P.g(r1, r10, r14, r5)
                int r1 = wn.C12289d.f105904x
                java.lang.String r1 = J1.j.b(r1, r14, r5)
                java.lang.Object r4 = r4.getValue()
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r18 = r4.booleanValue()
                if (r2 == 0) goto L_0x00f8
                java.lang.String r3 = r2.a()
            L_0x00f8:
                r5 = r3
                yn.f0$s$b r3 = new yn.f0$s$b
                An.j r4 = r0.f106915a
                nI.l<java.lang.String, XH.N> r7 = r0.f106919e
                r3.<init>(r4, r2, r7)
                r2 = 54
                r4 = 75218145(0x47bbce1, float:2.9591637E-36)
                r7 = 1
                c1.a r13 = c1.c.e(r4, r7, r3, r14, r2)
                r16 = 384(0x180, float:5.38E-43)
                r17 = 4044(0xfcc, float:5.667E-42)
                r3 = 0
                r4 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r15 = 0
                r2 = r6
                r6 = r18
                r14 = r21
                SC.C13627q.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x012a
                U0.C4895p.R()
            L_0x012a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yn.C12434f0.s.b(t0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A(vn.C12197b.C2499b r24, nI.p<? super java.lang.String, ? super java.lang.String, XH.C16807N> r25, java.lang.String r26, boolean r27, androidx.compose.ui.d r28, U0.C4889m r29, int r30, int r31) {
        /*
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r6 = r30
            java.lang.String r0 = "filterValue"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onFilterSelected"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "filterId"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            r0 = 1075575955(0x401bfc93, float:2.437291)
            r5 = r29
            U0.m r5 = r5.k(r0)
            r7 = r31 & 1
            r8 = 2
            if (r7 == 0) goto L_0x002a
            r7 = r6 | 6
            goto L_0x003a
        L_0x002a:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0039
            boolean r7 = r5.F(r1)
            if (r7 == 0) goto L_0x0036
            r7 = 4
            goto L_0x0037
        L_0x0036:
            r7 = r8
        L_0x0037:
            r7 = r7 | r6
            goto L_0x003a
        L_0x0039:
            r7 = r6
        L_0x003a:
            r9 = r31 & 2
            r10 = 32
            if (r9 == 0) goto L_0x0043
            r7 = r7 | 48
            goto L_0x0052
        L_0x0043:
            r9 = r6 & 48
            if (r9 != 0) goto L_0x0052
            boolean r9 = r5.F(r2)
            if (r9 == 0) goto L_0x004f
            r9 = r10
            goto L_0x0051
        L_0x004f:
            r9 = 16
        L_0x0051:
            r7 = r7 | r9
        L_0x0052:
            r9 = r31 & 4
            r11 = 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x005b
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005b:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x006a
            boolean r9 = r5.V(r3)
            if (r9 == 0) goto L_0x0067
            r9 = r11
            goto L_0x0069
        L_0x0067:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r7 = r7 | r9
        L_0x006a:
            r9 = r31 & 8
            if (r9 == 0) goto L_0x0071
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x0071:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0081
            boolean r9 = r5.b(r4)
            if (r9 == 0) goto L_0x007e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r7 = r7 | r9
        L_0x0081:
            r9 = r31 & 16
            if (r9 == 0) goto L_0x008a
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0087:
            r12 = r28
            goto L_0x009c
        L_0x008a:
            r12 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0087
            r12 = r28
            boolean r13 = r5.V(r12)
            if (r13 == 0) goto L_0x0099
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r7 = r7 | r13
        L_0x009c:
            r13 = r7 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00ae
            boolean r13 = r5.l()
            if (r13 != 0) goto L_0x00a9
            goto L_0x00ae
        L_0x00a9:
            r5.L()
            goto L_0x01a7
        L_0x00ae:
            if (r9 == 0) goto L_0x00b4
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r15 = r9
            goto L_0x00b5
        L_0x00b4:
            r15 = r12
        L_0x00b5:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00c1
            r9 = -1
            java.lang.String r12 = "com.ingka.ikea.browseandsearch.plp.impl.composables.ColorImageSelection (FiltersDrawer.kt:257)"
            U0.C4895p.S(r0, r7, r9, r12)
        L_0x00c1:
            r0 = -2134100869(0xffffffff80cc347b, float:-1.8753268E-38)
            r5.W(r0)
            java.lang.Object r0 = r5.D()
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r12 = r9.a()
            r13 = 0
            if (r0 != r12) goto L_0x00e3
            boolean r0 = r24.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            U0.r0 r0 = U0.u1.e(r0, r13, r8, r13)
            r5.u(r0)
        L_0x00e3:
            U0.r0 r0 = (U0.C4899r0) r0
            r5.P()
            r8 = -2134097614(0xffffffff80cc4132, float:-1.8757829E-38)
            r5.W(r8)
            boolean r8 = r5.F(r1)
            java.lang.Object r12 = r5.D()
            if (r8 != 0) goto L_0x00fe
            java.lang.Object r8 = r9.a()
            if (r12 != r8) goto L_0x0106
        L_0x00fe:
            yn.f0$b r12 = new yn.f0$b
            r12.<init>(r1, r0, r13)
            r5.u(r12)
        L_0x0106:
            nI.p r12 = (nI.p) r12
            r5.P()
            r8 = r7 & 14
            U0.P.g(r1, r12, r5, r8)
            yn.f0$c r8 = new yn.f0$c
            r8.<init>(r1, r0)
            r12 = 54
            r13 = -516022783(0xffffffffe13e1e01, float:-2.1919021E20)
            r14 = 1
            c1.a r8 = c1.c.e(r13, r14, r8, r5, r12)
            java.lang.String r12 = r24.f()
            int r13 = r24.a()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            boolean r16 = r24.b()
            r14 = -2134032245(0xffffffff80cd408b, float:-1.884943E-38)
            r5.W(r14)
            boolean r14 = r24.b()
            if (r14 == 0) goto L_0x0188
            if (r4 != 0) goto L_0x0188
            androidx.compose.ui.d$a r17 = androidx.compose.ui.d.f18749a
            r14 = -2134029949(0xffffffff80cd4983, float:-1.8852648E-38)
            r5.W(r14)
            r14 = r7 & 112(0x70, float:1.57E-43)
            r18 = 0
            if (r14 != r10) goto L_0x014d
            r10 = 1
            goto L_0x014f
        L_0x014d:
            r10 = r18
        L_0x014f:
            r7 = r7 & 896(0x380, float:1.256E-42)
            if (r7 != r11) goto L_0x0155
            r14 = 1
            goto L_0x0157
        L_0x0155:
            r14 = r18
        L_0x0157:
            r7 = r10 | r14
            boolean r10 = r5.F(r1)
            r7 = r7 | r10
            java.lang.Object r10 = r5.D()
            if (r7 != 0) goto L_0x016a
            java.lang.Object r7 = r9.a()
            if (r10 != r7) goto L_0x0172
        L_0x016a:
            yn.O r10 = new yn.O
            r10.<init>(r2, r3, r1, r0)
            r5.u(r10)
        L_0x0172:
            r21 = r10
            nI.a r21 = (nI.C17631a) r21
            r5.P()
            r22 = 7
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.d.d(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x018a
        L_0x0188:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
        L_0x018a:
            r5.P()
            androidx.compose.ui.d r11 = r15.s(r0)
            r0 = 6
            r14 = 0
            r7 = r8
            r8 = r12
            r9 = r13
            r10 = r16
            r12 = r5
            r13 = r0
            w(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01a6
            U0.C4895p.R()
        L_0x01a6:
            r12 = r15
        L_0x01a7:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x01c3
            yn.P r9 = new yn.P
            r0 = r9
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r12
            r6 = r30
            r7 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x01c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn.C12434f0.A(vn.b$b, nI.p, java.lang.String, boolean, androidx.compose.ui.d, U0.m, int, int):void");
    }

    private static final Integer A0(String str) {
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException e10) {
            qv.e eVar = qv.e.ERROR;
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
                    String a10 = C11818a.a((String) null, e10);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "FiltersDrawer";
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, e10, str4);
                str2 = str4;
                str3 = str5;
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static final boolean B(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void B0(x xVar, An.j jVar, C17642l<? super String, C16807N> lVar, String str, String str2, C17642l<? super String, C16807N> lVar2) {
        if (!jVar.h().isEmpty()) {
            xVar.b(str2, str2, c1.c.c(-1453553203, true, new s(jVar, str, str2, lVar2, lVar)));
        }
    }

    /* access modifiers changed from: private */
    public static final void C(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N D(nI.p pVar, String str, C12197b.C2499b bVar, C4899r0 r0Var) {
        C(r0Var, !B(r0Var));
        pVar.invoke(str, bVar.c());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C12197b.C2499b bVar, nI.p pVar, String str, boolean z10, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        A(bVar, pVar, str, z10, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void F(vn.C12197b.C2499b r24, nI.p<? super java.lang.String, ? super java.lang.String, XH.C16807N> r25, java.lang.String r26, boolean r27, androidx.compose.ui.d r28, U0.C4889m r29, int r30, int r31) {
        /*
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r30
            java.lang.String r0 = "filterValue"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "onFilterSelected"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "filterId"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            r0 = -1619192222(0xffffffff9f7d1662, float:-5.359335E-20)
            r1 = r29
            U0.m r15 = r1.k(r0)
            r1 = r31 & 1
            r2 = 2
            if (r1 == 0) goto L_0x002a
            r1 = r10 | 6
            goto L_0x003a
        L_0x002a:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0039
            boolean r1 = r15.F(r6)
            if (r1 == 0) goto L_0x0036
            r1 = 4
            goto L_0x0037
        L_0x0036:
            r1 = r2
        L_0x0037:
            r1 = r1 | r10
            goto L_0x003a
        L_0x0039:
            r1 = r10
        L_0x003a:
            r3 = r31 & 2
            r11 = 32
            if (r3 == 0) goto L_0x0043
            r1 = r1 | 48
            goto L_0x0052
        L_0x0043:
            r3 = r10 & 48
            if (r3 != 0) goto L_0x0052
            boolean r3 = r15.F(r7)
            if (r3 == 0) goto L_0x004f
            r3 = r11
            goto L_0x0051
        L_0x004f:
            r3 = 16
        L_0x0051:
            r1 = r1 | r3
        L_0x0052:
            r3 = r31 & 4
            if (r3 == 0) goto L_0x0059
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0069
        L_0x0059:
            r3 = r10 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0069
            boolean r3 = r15.V(r8)
            if (r3 == 0) goto L_0x0066
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r3
        L_0x0069:
            r3 = r31 & 8
            if (r3 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x0070:
            r3 = r10 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0080
            boolean r3 = r15.b(r9)
            if (r3 == 0) goto L_0x007d
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r3
        L_0x0080:
            r3 = r31 & 16
            if (r3 == 0) goto L_0x008a
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0086:
            r4 = r28
        L_0x0088:
            r13 = r1
            goto L_0x009d
        L_0x008a:
            r4 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0086
            r4 = r28
            boolean r5 = r15.V(r4)
            if (r5 == 0) goto L_0x0099
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r1 = r1 | r5
            goto L_0x0088
        L_0x009d:
            r1 = r13 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r5) goto L_0x00b1
            boolean r1 = r15.l()
            if (r1 != 0) goto L_0x00aa
            goto L_0x00b1
        L_0x00aa:
            r15.L()
            r5 = r4
            r0 = r15
            goto L_0x01e3
        L_0x00b1:
            if (r3 == 0) goto L_0x00b7
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r14 = r1
            goto L_0x00b8
        L_0x00b7:
            r14 = r4
        L_0x00b8:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00c4
            r1 = -1
            java.lang.String r3 = "com.ingka.ikea.browseandsearch.plp.impl.composables.ColorSelection (FiltersDrawer.kt:336)"
            U0.C4895p.S(r0, r13, r1, r3)
        L_0x00c4:
            r0 = -2065511332(0xffffffff84e2cc5c, float:-5.332002E-36)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r1 = r16.a()
            r3 = 0
            if (r0 != r1) goto L_0x00e6
            boolean r0 = r24.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            U0.r0 r0 = U0.u1.e(r0, r3, r2, r3)
            r15.u(r0)
        L_0x00e6:
            r5 = r0
            U0.r0 r5 = (U0.C4899r0) r5
            r15.P()
            r0 = -2065508077(0xffffffff84e2d913, float:-5.3331696E-36)
            r15.W(r0)
            boolean r0 = r15.F(r6)
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x0102
            java.lang.Object r0 = r16.a()
            if (r1 != r0) goto L_0x010a
        L_0x0102:
            yn.f0$d r1 = new yn.f0$d
            r1.<init>(r6, r5, r3)
            r15.u(r1)
        L_0x010a:
            nI.p r1 = (nI.p) r1
            r15.P()
            r0 = r13 & 14
            U0.P.g(r6, r1, r15, r0)
            java.lang.String r1 = r24.h()
            if (r1 != 0) goto L_0x011c
            java.lang.String r1 = "#ffffff"
        L_0x011c:
            java.lang.Integer r2 = A0(r1)
            r3 = -2065502649(0xffffffff84e2ee47, float:-5.3351168E-36)
            r15.W(r3)
            if (r2 != 0) goto L_0x0135
            tK.v r2 = tK.C18030v.f147664a
            int r3 = tK.C18030v.f147665b
            tK.h r2 = r2.a(r15, r3)
            long r2 = r2.F0()
            goto L_0x013d
        L_0x0135:
            int r2 = r2.intValue()
            long r2 = p1.C5751x0.b(r2)
        L_0x013d:
            r15.P()
            p1.v0 r1 = z0(r6, r1, r15, r0)
            yn.f0$e r4 = new yn.f0$e
            r0 = r4
            r12 = r4
            r4 = r24
            r28 = r5
            r0.<init>(r1, r2, r4, r5)
            r0 = 54
            r1 = 1995130932(0x76eb4834, float:2.3860434E33)
            r2 = 1
            c1.a r0 = c1.c.e(r1, r2, r12, r15, r0)
            java.lang.String r12 = r24.f()
            int r1 = r24.a()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r3 = r24.b()
            r4 = -2065410132(0xffffffff84e457ac, float:-5.3683056E-36)
            r15.W(r4)
            boolean r4 = r24.b()
            if (r4 == 0) goto L_0x01c1
            if (r9 != 0) goto L_0x01c1
            androidx.compose.ui.d$a r17 = androidx.compose.ui.d.f18749a
            r4 = -2065407836(0xffffffff84e460a4, float:-5.3691293E-36)
            r15.W(r4)
            r4 = r13 & 112(0x70, float:1.57E-43)
            r5 = 0
            if (r4 != r11) goto L_0x0186
            r4 = r2
            goto L_0x0187
        L_0x0186:
            r4 = r5
        L_0x0187:
            r11 = r13 & 896(0x380, float:1.256E-42)
            r13 = 256(0x100, float:3.59E-43)
            if (r11 != r13) goto L_0x018e
            goto L_0x018f
        L_0x018e:
            r2 = r5
        L_0x018f:
            r2 = r2 | r4
            boolean r4 = r15.F(r6)
            r2 = r2 | r4
            java.lang.Object r4 = r15.D()
            if (r2 != 0) goto L_0x01a1
            java.lang.Object r2 = r16.a()
            if (r4 != r2) goto L_0x01ab
        L_0x01a1:
            yn.Q r4 = new yn.Q
            r2 = r28
            r4.<init>(r7, r8, r6, r2)
            r15.u(r4)
        L_0x01ab:
            r21 = r4
            nI.a r21 = (nI.C17631a) r21
            r15.P()
            r22 = 7
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.d.d(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x01c3
        L_0x01c1:
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
        L_0x01c3:
            r15.P()
            androidx.compose.ui.d r2 = r14.s(r2)
            r17 = 6
            r18 = 0
            r11 = r0
            r13 = r1
            r1 = r14
            r14 = r3
            r0 = r15
            r15 = r2
            r16 = r0
            w(r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x01e2
            U0.C4895p.R()
        L_0x01e2:
            r5 = r1
        L_0x01e3:
            U0.Y0 r11 = r0.n()
            if (r11 == 0) goto L_0x01fe
            yn.S r12 = new yn.S
            r0 = r12
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r6 = r30
            r7 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.a(r12)
        L_0x01fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn.C12434f0.F(vn.b$b, nI.p, java.lang.String, boolean, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean G(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void H(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N I(nI.p pVar, String str, C12197b.C2499b bVar, C4899r0 r0Var) {
        H(r0Var, !G(r0Var));
        pVar.invoke(str, bVar.c());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J(C12197b.C2499b bVar, nI.p pVar, String str, boolean z10, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        F(bVar, pVar, str, z10, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void K(C12197b.C2499b bVar, nI.p<? super String, ? super String, C16807N> pVar, String str, boolean z10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C12197b.C2499b bVar2 = bVar;
        nI.p<? super String, ? super String, C16807N> pVar2 = pVar;
        String str2 = str;
        boolean z11 = z10;
        int i12 = i10;
        C17542s.j(bVar2, "filterValue");
        C17542s.j(pVar2, "onFilterSelected");
        C17542s.j(str2, "filterId");
        C4889m k10 = mVar.k(-1833122191);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(bVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(pVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(str2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.b(z11) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1833122191, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.FilterCheckbox (FiltersDrawer.kt:531)");
            }
            k10.W(-2011075922);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = u1.e(Boolean.valueOf(bVar.g()), (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            k10.W(-2011072667);
            boolean F10 = k10.F(bVar2);
            Object D11 = k10.D();
            if (F10 || D11 == aVar.a()) {
                D11 = new f(bVar2, r0Var, (C17164e<? super f>) null);
                k10.u(D11);
            }
            k10.P();
            P.g(bVar2, (nI.p) D11, k10, i11 & 14);
            String f10 = bVar.f();
            String valueOf = String.valueOf(bVar.a());
            C13569b1.b bVar3 = new C13569b1.b(L(r0Var));
            boolean z12 = false;
            boolean z13 = bVar.b() && !z11;
            float B10 = c2.h.B((float) 0);
            k10.W(-2011062899);
            boolean z14 = (i11 & 112) == 32;
            if ((i11 & 896) == 256) {
                z12 = true;
            }
            boolean F11 = z14 | z12 | k10.F(bVar2);
            Object D12 = k10.D();
            if (F11 || D12 == aVar.a()) {
                D12 = new C12411T(pVar2, str2, bVar2, r0Var);
                k10.u(D12);
            }
            k10.P();
            mVar2 = k10;
            C13585f1.c(f10, (C17631a) D12, (androidx.compose.ui.d) null, (String) null, (C13573c1) null, bVar3, valueOf, c1.c.e(-1133439021, true, new g(bVar2), k10, 54), (C13589g1) null, B10, false, z13, (r0.m) null, mVar2, (C13569b1.b.f116144c << 15) | 817889280, 0, 5404);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C12412U(bVar, pVar, str, z10, i10));
        }
    }

    private static final boolean L(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void M(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N N(nI.p pVar, String str, C12197b.C2499b bVar, C4899r0 r0Var) {
        M(r0Var, !L(r0Var));
        pVar.invoke(str, bVar.c());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C12197b.C2499b bVar, nI.p pVar, String str, boolean z10, int i10, C4889m mVar, int i11) {
        K(bVar, pVar, str, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void P(C12197b bVar, nI.p<? super String, ? super String, C16807N> pVar, boolean z10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C12197b bVar2 = bVar;
        nI.p<? super String, ? super String, C16807N> pVar2 = pVar;
        boolean z11 = z10;
        int i12 = i10;
        C4889m k10 = mVar.k(1274726187);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(bVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(pVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.b(z11) ? 256 : 128;
        }
        int i13 = i11;
        if ((i13 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1274726187, i13, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.FilterTypes (FiltersDrawer.kt:515)");
            }
            for (C12197b.c cVar : bVar.n()) {
                C13607l.j(cVar.a(), C13679b.C2857b.c.f116685a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super N1.P, C16807N>) null, k10, 48, 0, 262140);
                k10.W(-1846598659);
                for (C12197b.C2499b K10 : cVar.b()) {
                    K(K10, pVar, bVar.getId(), z10, k10, (i13 & 112) | ((i13 << 3) & 7168));
                    i13 = i13;
                    k10 = k10;
                }
                int i14 = i13;
                k10.P();
            }
            mVar2 = k10;
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C12400L(bVar2, pVar2, z11, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(C12197b bVar, nI.p pVar, boolean z10, int i10, C4889m mVar, int i11) {
        P(bVar, pVar, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void R(C12197b bVar, nI.p<? super String, ? super String, C16807N> pVar, boolean z10, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-902223968);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.b(z10) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-902223968, i12, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.FilterValues (FiltersDrawer.kt:504)");
            }
            for (C12197b.C2499b K10 : bVar.o()) {
                K(K10, pVar, bVar.getId(), z10, k10, (i12 & 112) | ((i12 << 3) & 7168));
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12404N(bVar, pVar, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N S(C12197b bVar, nI.p pVar, boolean z10, int i10, C4889m mVar, int i11) {
        R(bVar, pVar, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: nI.l} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void T(java.lang.String r25, vn.C12197b r26, java.lang.String r27, nI.p<? super java.lang.String, ? super java.lang.String, XH.C16807N> r28, nI.C17642l<? super java.lang.String, XH.C16807N> r29, boolean r30, U0.C4889m r31, int r32) {
        /*
            r1 = r25
            r2 = r26
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r32
            r0 = -899429387(0xffffffffca63cbf5, float:-3732221.2)
            r3 = r31
            U0.m r3 = r3.k(r0)
            r8 = r7 & 6
            r9 = 2
            if (r8 != 0) goto L_0x0025
            boolean r8 = r3.V(r1)
            if (r8 == 0) goto L_0x0022
            r8 = 4
            goto L_0x0023
        L_0x0022:
            r8 = r9
        L_0x0023:
            r8 = r8 | r7
            goto L_0x0026
        L_0x0025:
            r8 = r7
        L_0x0026:
            r11 = r7 & 48
            if (r11 != 0) goto L_0x0036
            boolean r11 = r3.F(r2)
            if (r11 == 0) goto L_0x0033
            r11 = 32
            goto L_0x0035
        L_0x0033:
            r11 = 16
        L_0x0035:
            r8 = r8 | r11
        L_0x0036:
            r11 = r7 & 384(0x180, float:5.38E-43)
            r12 = r27
            if (r11 != 0) goto L_0x0048
            boolean r11 = r3.V(r12)
            if (r11 == 0) goto L_0x0045
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0047
        L_0x0045:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0047:
            r8 = r8 | r11
        L_0x0048:
            r11 = r7 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0058
            boolean r11 = r3.F(r4)
            if (r11 == 0) goto L_0x0055
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0057
        L_0x0055:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0057:
            r8 = r8 | r11
        L_0x0058:
            r11 = r7 & 24576(0x6000, float:3.4438E-41)
            r13 = 16384(0x4000, float:2.2959E-41)
            if (r11 != 0) goto L_0x0069
            boolean r11 = r3.F(r5)
            if (r11 == 0) goto L_0x0066
            r11 = r13
            goto L_0x0068
        L_0x0066:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0068:
            r8 = r8 | r11
        L_0x0069:
            r11 = 196608(0x30000, float:2.75506E-40)
            r11 = r11 & r7
            if (r11 != 0) goto L_0x007a
            boolean r11 = r3.b(r6)
            if (r11 == 0) goto L_0x0077
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0079
        L_0x0077:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x0079:
            r8 = r8 | r11
        L_0x007a:
            r11 = r8
            r8 = 74899(0x12493, float:1.04956E-40)
            r8 = r8 & r11
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r14) goto L_0x0090
            boolean r8 = r3.l()
            if (r8 != 0) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            r3.L()
            goto L_0x016a
        L_0x0090:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x009c
            r8 = -1
            java.lang.String r14 = "com.ingka.ikea.browseandsearch.plp.impl.composables.FilterWithAccordion (FiltersDrawer.kt:168)"
            U0.C4895p.S(r0, r11, r8, r14)
        L_0x009c:
            java.lang.String r0 = r26.getId()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r1, r0)
            r8 = 387722427(0x171c2cbb, float:5.0462776E-25)
            r3.W(r8)
            java.lang.Object r8 = r3.D()
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r15 = r14.a()
            r10 = 0
            if (r8 != r15) goto L_0x00c2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            U0.r0 r8 = U0.u1.e(r0, r10, r9, r10)
            r3.u(r8)
        L_0x00c2:
            r0 = r8
            U0.r0 r0 = (U0.C4899r0) r0
            r3.P()
            r8 = 387724386(0x171c3462, float:5.0472435E-25)
            r3.W(r8)
            r9 = 57344(0xe000, float:8.0356E-41)
            r8 = r11 & r9
            r15 = 1
            if (r8 != r13) goto L_0x00d8
            r8 = r15
            goto L_0x00d9
        L_0x00d8:
            r8 = 0
        L_0x00d9:
            boolean r13 = r3.F(r2)
            r8 = r8 | r13
            java.lang.Object r13 = r3.D()
            if (r8 != 0) goto L_0x00ea
            java.lang.Object r8 = r14.a()
            if (r13 != r8) goto L_0x00f2
        L_0x00ea:
            yn.d0 r13 = new yn.d0
            r13.<init>(r5, r2, r0)
            r3.u(r13)
        L_0x00f2:
            r21 = r13
            nI.l r21 = (nI.C17642l) r21
            r3.P()
            r8 = 387729330(0x171c47b2, float:5.049681E-25)
            r3.W(r8)
            r8 = r11 & 14
            r13 = 4
            if (r8 != r13) goto L_0x0107
            r16 = r15
            goto L_0x0109
        L_0x0107:
            r16 = 0
        L_0x0109:
            boolean r13 = r3.F(r2)
            r13 = r16 | r13
            java.lang.Object r9 = r3.D()
            if (r13 != 0) goto L_0x011b
            java.lang.Object r13 = r14.a()
            if (r9 != r13) goto L_0x0123
        L_0x011b:
            yn.f0$h r9 = new yn.f0$h
            r9.<init>(r1, r2, r0, r10)
            r3.u(r9)
        L_0x0123:
            nI.p r9 = (nI.p) r9
            r3.P()
            U0.P.g(r1, r9, r3, r8)
            java.lang.String r8 = r26.h()
            boolean r13 = U(r0)
            yn.f0$i r0 = new yn.f0$i
            r0.<init>(r2, r4, r6)
            r9 = 54
            r10 = -1162346487(0xffffffffbab80009, float:-0.0014038096)
            c1.a r20 = c1.c.e(r10, r15, r0, r3, r9)
            int r0 = r11 << 6
            r9 = 57344(0xe000, float:8.0356E-41)
            r22 = r0 & r9
            r23 = 384(0x180, float:5.38E-43)
            r24 = 4044(0xfcc, float:5.667E-42)
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r9 = r21
            r12 = r27
            r21 = r3
            SC.C13627q.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x016a
            U0.C4895p.R()
        L_0x016a:
            U0.Y0 r8 = r3.n()
            if (r8 == 0) goto L_0x0187
            yn.e0 r9 = new yn.e0
            r0 = r9
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0187:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn.C12434f0.T(java.lang.String, vn.b, java.lang.String, nI.p, nI.l, boolean, U0.m, int):void");
    }

    private static final boolean U(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void V(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N W(C17642l lVar, C12197b bVar, C4899r0 r0Var, boolean z10) {
        V(r0Var, z10);
        lVar.invoke(z10 ? bVar.getId() : null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N X(String str, C12197b bVar, String str2, nI.p pVar, C17642l lVar, boolean z10, int i10, C4889m mVar, int i11) {
        T(str, bVar, str2, pVar, lVar, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void Y(An.j jVar, A1<String> a12, boolean z10, C17642l<? super String, C16807N> lVar, nI.p<? super String, ? super String, C16807N> pVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C5934A a10;
        An.j jVar2 = jVar;
        A1<String> a13 = a12;
        C17642l<? super String, C16807N> lVar2 = lVar;
        nI.p<? super String, ? super String, C16807N> pVar2 = pVar;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C17542s.j(jVar2, "filtersState");
        C17542s.j(a13, "selectedFilterIdState");
        C17542s.j(lVar2, "onSortOptionSelected");
        C17542s.j(pVar2, "onFilterSelected");
        C17542s.j(aVar3, "onClearAllClicked");
        C17542s.j(aVar4, "onViewProductsClicked");
        C4889m k10 = mVar.k(247750762);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(jVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(a13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.b(z10) ? 256 : 128;
        } else {
            boolean z11 = z10;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(lVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(pVar2) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(aVar3) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.F(aVar4) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        int i13 = i11;
        if ((599187 & i13) != 599186 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(247750762, i13, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.FiltersDrawer (FiltersDrawer.kt:88)");
            }
            C5934A c10 = C5935B.c(0, 0, k10, 0, 3);
            k10.W(-2018808192);
            Object D10 = k10.D();
            C4889m.a aVar5 = C4889m.f14007a;
            if (D10 == aVar5.a()) {
                D10 = u1.e((Object) null, (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            String value = a12.getValue();
            k10.W(-2018805004);
            boolean z12 = (i13 & 112) == 32;
            Object D11 = k10.D();
            if (z12 || D11 == aVar5.a()) {
                D11 = new j(a13, r0Var, (C17164e<? super j>) null);
                k10.u(D11);
            }
            k10.P();
            P.g(value, (nI.p) D11, k10, 0);
            f0(Z(r0Var), c10, jVar2, k10, (i13 << 6) & 896);
            d.a aVar6 = androidx.compose.ui.d.f18749a;
            C5934A a11 = c10;
            androidx.compose.ui.d f10 = J.f(D.m(C5852X.e(androidx.compose.foundation.b.d(aVar6, C18030v.f147664a.a(k10, C18030v.f147665b).k(), (i1) null, 2, (Object) null)), 0.0f, c2.h.B((float) 16), 0.0f, 0.0f, 13, (Object) null), 0.0f, 1, (Object) null);
            I a14 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a15 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, f10);
            C4504g.a aVar7 = C4504g.f6515W;
            C17631a<C4504g> a16 = aVar7.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a16);
            } else {
                k10.t();
            }
            C4889m a17 = F1.a(k10);
            F1.c(a17, a14, aVar7.c());
            F1.c(a17, s10, aVar7.e());
            nI.p<C4504g, Integer, C16807N> b10 = aVar7.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b10);
            }
            F1.c(a17, e10, aVar7.d());
            androidx.compose.ui.d c11 = C5861g.c(C5862h.f28810a, aVar6, 1.0f, false, 2, (Object) null);
            k10.W(-775957816);
            int i14 = i13 & 896;
            boolean z13 = ((i13 & 7168) == 2048) | ((i13 & 14) == 4) | ((57344 & i13) == 16384) | (i14 == 256);
            Object D12 = k10.D();
            if (z13 || D12 == aVar5.a()) {
                a10 = a11;
                C12398K k11 = r0;
                C12398K k12 = new C12398K(jVar, lVar, r0Var, pVar, z10);
                k10.u(k11);
                D12 = k11;
            } else {
                a10 = a11;
            }
            k10.P();
            int i15 = i13;
            mVar2 = k10;
            C5937b.a(c11, a10, (C5834E) null, false, (C5073d.m) null, (C5437c.b) null, (p0.s) null, false, (C17642l) D12, mVar2, 0, 252);
            C13643u0.c((androidx.compose.ui.d) null, 0.0f, 0, mVar2, 0, 7);
            u(aVar, jVar, z10, aVar2, mVar2, ((i15 >> 15) & 14) | ((i15 << 3) & 112) | i14 | ((i15 >> 9) & 7168));
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
            n10.a(new C12414W(jVar, a12, z10, lVar, pVar, aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final String Z(C4899r0<String> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N a0(An.j jVar, C17642l lVar, C4899r0 r0Var, nI.p pVar, boolean z10, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        B0(xVar, jVar, lVar, Z(r0Var), "sortOptions", new C12417Z(r0Var));
        C15987c<C12197b> g10 = jVar.g();
        xVar.e(g10.size(), new n(new C12419a0(), g10), new o(g10), c1.c.c(-1091073711, true, new p(g10, pVar, z10, r0Var)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N b0(C4899r0 r0Var, String str) {
        e0(r0Var, str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object c0(int i10, C12197b bVar) {
        C17542s.j(bVar, "<unused var>");
        return Integer.valueOf(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N d0(An.j jVar, A1 a12, boolean z10, C17642l lVar, nI.p pVar, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        Y(jVar, a12, z10, lVar, pVar, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void e0(C4899r0<String> r0Var, String str) {
        r0Var.setValue(str);
    }

    private static final void f0(String str, C5934A a10, An.j jVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1296331690);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(a10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.V(jVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1296331690, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.HandleAutoScroll (FiltersDrawer.kt:607)");
            }
            k10.W(1572839528);
            int i12 = i11 & 14;
            boolean z10 = false;
            boolean z11 = (i12 == 4) | ((i11 & 112) == 32);
            if ((i11 & 896) == 256) {
                z10 = true;
            }
            boolean z12 = z11 | z10;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new q(str, a10, jVar, (C17164e<? super q>) null);
                k10.u(D10);
            }
            k10.P();
            P.g(str, (nI.p) D10, k10, i12);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12415X(str, a10, jVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g0(String str, C5934A a10, An.j jVar, int i10, C4889m mVar, int i11) {
        f0(str, a10, jVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h0(vn.C12197b r23, nI.p<? super java.lang.String, ? super java.lang.String, XH.C16807N> r24, boolean r25, U0.C4889m r26, int r27) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r27
            java.lang.String r4 = "filter"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            java.lang.String r4 = "onFilterSelected"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            r4 = -306019975(0xffffffffedc28179, float:-7.524577E27)
            r5 = r26
            U0.m r15 = r5.k(r4)
            r5 = r3 & 6
            r12 = 2
            if (r5 != 0) goto L_0x002b
            boolean r5 = r15.F(r0)
            if (r5 == 0) goto L_0x0028
            r5 = 4
            goto L_0x0029
        L_0x0028:
            r5 = r12
        L_0x0029:
            r5 = r5 | r3
            goto L_0x002c
        L_0x002b:
            r5 = r3
        L_0x002c:
            r6 = r3 & 48
            r13 = 32
            if (r6 != 0) goto L_0x003d
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x003a
            r6 = r13
            goto L_0x003c
        L_0x003a:
            r6 = 16
        L_0x003c:
            r5 = r5 | r6
        L_0x003d:
            r6 = r3 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004d
            boolean r6 = r15.b(r2)
            if (r6 == 0) goto L_0x004a
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x004c
        L_0x004a:
            r6 = 128(0x80, float:1.794E-43)
        L_0x004c:
            r5 = r5 | r6
        L_0x004d:
            r14 = r5
            r5 = r14 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0062
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x005b
            goto L_0x0062
        L_0x005b:
            r15.L()
            r22 = r15
            goto L_0x014a
        L_0x0062:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x006e
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.browseandsearch.plp.impl.composables.SingleFilterItem (FiltersDrawer.kt:575)"
            U0.C4895p.S(r4, r14, r5, r6)
        L_0x006e:
            java.util.List r4 = r23.o()
            java.lang.Object r4 = YH.C16877v.w0(r4)
            vn.b$b r4 = (vn.C12197b.C2499b) r4
            r10 = 0
            r11 = 7
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = r15
            SC.C13643u0.c(r5, r6, r7, r9, r10, r11)
            r5 = -212936678(0xfffffffff34ed81a, float:-1.6387882E31)
            r15.W(r5)
            java.lang.Object r5 = r15.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r7 = r6.a()
            r8 = 0
            if (r5 != r7) goto L_0x00a4
            boolean r5 = r4.g()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            U0.r0 r5 = U0.u1.e(r5, r8, r12, r8)
            r15.u(r5)
        L_0x00a4:
            U0.r0 r5 = (U0.C4899r0) r5
            r15.P()
            r7 = -212933795(0xfffffffff34ee35d, float:-1.6391367E31)
            r15.W(r7)
            boolean r7 = r15.F(r4)
            java.lang.Object r9 = r15.D()
            if (r7 != 0) goto L_0x00bf
            java.lang.Object r7 = r6.a()
            if (r9 != r7) goto L_0x00c7
        L_0x00bf:
            yn.f0$r r9 = new yn.f0$r
            r9.<init>(r4, r5, r8)
            r15.u(r9)
        L_0x00c7:
            nI.p r9 = (nI.p) r9
            r15.P()
            r7 = 0
            U0.P.g(r4, r9, r15, r7)
            java.lang.String r10 = r4.f()
            int r8 = r4.a()
            java.lang.String r11 = java.lang.String.valueOf(r8)
            SC.b1$b r12 = new SC.b1$b
            boolean r8 = i0(r5)
            r12.<init>(r8)
            boolean r8 = r23.g()
            r9 = 1
            if (r8 == 0) goto L_0x00f1
            if (r2 != 0) goto L_0x00f1
            r16 = r9
            goto L_0x00f3
        L_0x00f1:
            r16 = r7
        L_0x00f3:
            r8 = -212924026(0xfffffffff34f0986, float:-1.6403177E31)
            r15.W(r8)
            r8 = r14 & 112(0x70, float:1.57E-43)
            if (r8 != r13) goto L_0x00fe
            r7 = r9
        L_0x00fe:
            boolean r8 = r15.F(r0)
            r7 = r7 | r8
            boolean r8 = r15.F(r4)
            r7 = r7 | r8
            java.lang.Object r8 = r15.D()
            if (r7 != 0) goto L_0x0114
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x011c
        L_0x0114:
            yn.b0 r8 = new yn.b0
            r8.<init>(r1, r0, r4, r5)
            r15.u(r8)
        L_0x011c:
            r6 = r8
            nI.a r6 = (nI.C17631a) r6
            r15.P()
            int r4 = SC.C13569b1.b.f116144c
            int r19 = r4 << 15
            r20 = 0
            r21 = 6044(0x179c, float:8.47E-42)
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = 0
            r18 = r12
            r12 = r4
            r13 = 0
            r14 = 0
            r4 = 0
            r22 = r15
            r15 = r4
            r17 = 0
            r5 = r10
            r10 = r18
            r18 = r22
            SC.C13585f1.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x014a
            U0.C4895p.R()
        L_0x014a:
            U0.Y0 r4 = r22.n()
            if (r4 == 0) goto L_0x0158
            yn.c0 r5 = new yn.c0
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn.C12434f0.h0(vn.b, nI.p, boolean, U0.m, int):void");
    }

    private static final boolean i0(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void j0(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N k0(nI.p pVar, C12197b bVar, C12197b.C2499b bVar2, C4899r0 r0Var) {
        j0(r0Var, !i0(r0Var));
        pVar.invoke(bVar.getId(), bVar2.c());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l0(C12197b bVar, nI.p pVar, boolean z10, int i10, C4889m mVar, int i11) {
        h0(bVar, pVar, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void u(C17631a<C16807N> aVar, An.j jVar, boolean z10, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        boolean z11 = z10;
        int i12 = i10;
        C4889m k10 = mVar.k(161127711);
        C17631a<C16807N> aVar3 = aVar;
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        An.j jVar2 = jVar;
        if ((i12 & 48) == 0) {
            i11 |= k10.V(jVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.b(z11) ? 256 : 128;
        }
        C17631a<C16807N> aVar4 = aVar2;
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(161127711, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.ButtonFooter (FiltersDrawer.kt:626)");
            }
            d.a aVar5 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d i13 = D.i(aVar5, c2.h.B((float) 16));
            I b10 = G.b(C5073d.f18068a.n(c2.h.B((float) 8)), C5437c.f24302a.l(), k10, 6);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, i13);
            C4504g.a aVar6 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar6.a();
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
            F1.c(a12, b10, aVar6.c());
            F1.c(a12, s10, aVar6.e());
            nI.p<C4504g, Integer, C16807N> b11 = aVar6.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar6.d());
            C5843N n10 = C5843N.f28726a;
            String b12 = J1.j.b(C12289d.f105896p, k10, 0);
            androidx.compose.ui.d e11 = C5842M.e(n10, aVar5, 1.0f, false, 2, (Object) null);
            M m10 = M.Small;
            L.b(b12, e11, !z11, N.Secondary, m10, false, (Integer) null, (K0) null, (r0.m) null, aVar, k10, ((i11 << 27) & 1879048192) | 27648, 480);
            k10.W(72799069);
            StringBuilder sb2 = new StringBuilder();
            String b13 = J1.j.b(Oo.b.f84642f9, k10, 0);
            if (b13.length() > 0) {
                StringBuilder sb3 = new StringBuilder();
                String valueOf = String.valueOf(b13.charAt(0));
                C17542s.h(valueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                C17542s.i(upperCase, "toUpperCase(...)");
                sb3.append(upperCase);
                String substring = b13.substring(1);
                C17542s.i(substring, "substring(...)");
                sb3.append(substring);
                b13 = sb3.toString();
            }
            sb2.append(b13);
            sb2.append(" ");
            sb2.append(String.valueOf(jVar.i()));
            String sb4 = sb2.toString();
            k10.P();
            mVar2 = k10;
            L.b(sb4, C5842M.e(n10, aVar5, 1.0f, false, 2, (Object) null), false, (N) null, m10, z10, (Integer) null, (K0) null, (r0.m) null, aVar2, k10, ((i11 << 9) & ImageMetadata.JPEG_GPS_COORDINATES) | 24576 | ((i11 << 18) & 1879048192), 460);
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
            n11.a(new C12416Y(aVar, jVar, z10, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C17631a aVar, An.j jVar, boolean z10, C17631a aVar2, int i10, C4889m mVar, int i11) {
        u(aVar, jVar, z10, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void w(nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r37, java.lang.String r38, java.lang.String r39, boolean r40, androidx.compose.ui.d r41, U0.C4889m r42, int r43, int r44) {
        /*
            r1 = r37
            r4 = r40
            r6 = r43
            r0 = 16
            r2 = 2
            r3 = 4
            r5 = 48
            r7 = 270204753(0x101aff51, float:3.0567833E-29)
            r8 = r42
            U0.m r11 = r8.k(r7)
            r8 = r44 & 1
            if (r8 == 0) goto L_0x001c
            r8 = r6 | 6
            goto L_0x002c
        L_0x001c:
            r8 = r6 & 6
            if (r8 != 0) goto L_0x002b
            boolean r8 = r11.F(r1)
            if (r8 == 0) goto L_0x0028
            r8 = r3
            goto L_0x0029
        L_0x0028:
            r8 = r2
        L_0x0029:
            r8 = r8 | r6
            goto L_0x002c
        L_0x002b:
            r8 = r6
        L_0x002c:
            r2 = r44 & 2
            if (r2 == 0) goto L_0x0034
            r8 = r8 | r5
        L_0x0031:
            r2 = r38
            goto L_0x0045
        L_0x0034:
            r2 = r6 & 48
            if (r2 != 0) goto L_0x0031
            r2 = r38
            boolean r9 = r11.V(r2)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0044
        L_0x0043:
            r9 = r0
        L_0x0044:
            r8 = r8 | r9
        L_0x0045:
            r3 = r44 & 4
            if (r3 == 0) goto L_0x004e
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r3 = r39
            goto L_0x0060
        L_0x004e:
            r3 = r6 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004b
            r3 = r39
            boolean r9 = r11.V(r3)
            if (r9 == 0) goto L_0x005d
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r8 = r8 | r9
        L_0x0060:
            r9 = r44 & 8
            if (r9 == 0) goto L_0x0067
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x0077
        L_0x0067:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0077
            boolean r9 = r11.b(r4)
            if (r9 == 0) goto L_0x0074
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r8 = r8 | r9
        L_0x0077:
            r0 = r44 & 16
            if (r0 == 0) goto L_0x0081
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r9 = r41
        L_0x007f:
            r12 = r8
            goto L_0x0094
        L_0x0081:
            r9 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x007d
            r9 = r41
            boolean r10 = r11.V(r9)
            if (r10 == 0) goto L_0x0090
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r8 = r8 | r10
            goto L_0x007f
        L_0x0094:
            r8 = r12 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r10) goto L_0x00a7
            boolean r8 = r11.l()
            if (r8 != 0) goto L_0x00a1
            goto L_0x00a7
        L_0x00a1:
            r11.L()
            r5 = r11
            goto L_0x0230
        L_0x00a7:
            if (r0 == 0) goto L_0x00ac
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00ad
        L_0x00ac:
            r0 = r9
        L_0x00ad:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00b9
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.browseandsearch.plp.impl.composables.ColorFilterWithTexts (FiltersDrawer.kt:470)"
            U0.C4895p.S(r7, r12, r8, r9)
        L_0x00b9:
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$b r7 = r7.g()
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r8 = r8.g()
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r8, r7, r11, r5)
            r8 = 0
            int r8 = U0.C4883j.a(r11, r8)
            U0.y r9 = r11.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r11, r0)
            G1.g$a r13 = G1.C4504g.f6515W
            nI.a r14 = r13.a()
            U0.f r15 = r11.m()
            if (r15 != 0) goto L_0x00e5
            U0.C4883j.c()
        L_0x00e5:
            r11.I()
            boolean r15 = r11.i()
            if (r15 == 0) goto L_0x00f2
            r11.p(r14)
            goto L_0x00f5
        L_0x00f2:
            r11.t()
        L_0x00f5:
            U0.m r14 = U0.F1.a(r11)
            nI.p r15 = r13.c()
            U0.F1.c(r14, r7, r15)
            nI.p r7 = r13.e()
            U0.F1.c(r14, r9, r7)
            nI.p r7 = r13.b()
            boolean r9 = r14.i()
            if (r9 != 0) goto L_0x011f
            java.lang.Object r9 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r15)
            if (r9 != 0) goto L_0x012d
        L_0x011f:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r14.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r14.w(r8, r7)
        L_0x012d:
            nI.p r7 = r13.d()
            U0.F1.c(r14, r10, r7)
            s0.h r7 = s0.C5862h.f28810a
            r7 = r12 & 14
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1.invoke(r11, r7)
            TC.b$a$c r7 = TC.C13679b.a.c.f116681a
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            r8 = 10
            float r8 = (float) r8
            float r15 = c2.h.B(r8)
            r18 = 13
            r19 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.D.m(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x0171
            r8 = 914434442(0x3681298a, float:3.8493354E-6)
            r11.W(r8)
            tK.v r8 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r8 = r8.a(r11, r9)
            long r8 = r8.G0()
            r11.P()
        L_0x016e:
            r34 = r8
            goto L_0x0187
        L_0x0171:
            r8 = 914502146(0x36823202, float:3.8801236E-6)
            r11.W(r8)
            tK.v r8 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r8 = r8.a(r11, r9)
            long r8 = r8.K()
            r11.P()
            goto L_0x016e
        L_0x0187:
            int r8 = r12 >> 3
            r8 = r8 & 14
            r8 = r8 | 432(0x1b0, float:6.05E-43)
            r31 = r8
            r32 = 0
            r33 = 262128(0x3fff0, float:3.6732E-40)
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r8 = r38
            r9 = r7
            r41 = r11
            r36 = r12
            r11 = r34
            r30 = r41
            SC.C13607l.j(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            if (r4 == 0) goto L_0x01d9
            r8 = 914704266(0x3685478a, float:3.972037E-6)
            r11 = r41
            r11.W(r8)
            tK.v r8 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r8 = r8.a(r11, r9)
            long r8 = r8.G0()
            r11.P()
        L_0x01d6:
            r34 = r8
            goto L_0x01f1
        L_0x01d9:
            r11 = r41
            r8 = 914771970(0x36865002, float:4.0028253E-6)
            r11.W(r8)
            tK.v r8 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r8 = r8.a(r11, r9)
            long r8 = r8.K()
            r11.P()
            goto L_0x01d6
        L_0x01f1:
            int r8 = r36 >> 6
            r8 = r8 & 14
            r31 = r8 | 48
            r32 = 0
            r33 = 262132(0x3fff4, float:3.67325E-40)
            r10 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r8 = r39
            r9 = r7
            r5 = r11
            r11 = r34
            r30 = r5
            SC.C13607l.j(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r5.x()
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x022f
            U0.C4895p.R()
        L_0x022f:
            r9 = r0
        L_0x0230:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x024c
            yn.V r10 = new yn.V
            r0 = r10
            r1 = r37
            r2 = r38
            r3 = r39
            r4 = r40
            r5 = r9
            r6 = r43
            r7 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r10)
        L_0x024c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn.C12434f0.w(nI.p, java.lang.String, java.lang.String, boolean, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N x(nI.p pVar, String str, String str2, boolean z10, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        w(pVar, str, str2, z10, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void y(C12197b bVar, nI.p<? super String, ? super String, C16807N> pVar, boolean z10, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-790802690);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.b(z10) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-790802690, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.ColorFilters (FiltersDrawer.kt:224)");
            }
            C5073d dVar = C5073d.f18068a;
            androidx.compose.foundation.layout.p.a(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), dVar.o(c2.h.B((float) 16), C5437c.f24302a.g()), dVar.n(c2.h.B((float) 32)), 0, 0, (u) null, c1.c.e(-301737223, true, new a(bVar, pVar, z10), k10, 54), k10, 1573302, 56);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12402M(bVar, pVar, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N z(C12197b bVar, nI.p pVar, boolean z10, int i10, C4889m mVar, int i11) {
        y(bVar, pVar, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final C5747v0 z0(C12197b.C2499b bVar, String str, C4889m mVar, int i10) {
        mVar.W(-526745489);
        if (C4895p.J()) {
            C4895p.S(-526745489, i10, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.getBorderColorForVisibility (FiltersDrawer.kt:450)");
        }
        C5747v0 v0Var = null;
        if (!bVar.g()) {
            mVar.W(1573561490);
            boolean z10 = false;
            boolean z11 = C5607m.a(mVar, 0) && C17542s.e(str, "#000000");
            mVar.P();
            if (z11) {
                mVar.W(1535814110);
                long g02 = C18030v.f147664a.a(mVar, C18030v.f147665b).g0();
                mVar.P();
                v0Var = C5747v0.k(g02);
            } else {
                mVar.W(1573565395);
                if (!C5607m.a(mVar, 0) && C17542s.e(str, "#ffffff")) {
                    z10 = true;
                }
                mVar.P();
                if (z10) {
                    mVar.W(1535936126);
                    long g03 = C18030v.f147664a.a(mVar, C18030v.f147665b).g0();
                    mVar.P();
                    v0Var = C5747v0.k(g03);
                }
            }
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return v0Var;
    }
}
