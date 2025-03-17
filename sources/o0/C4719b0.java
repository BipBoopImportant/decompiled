package O0;

import E1.I;
import G1.C4504g;
import L1.i;
import S0.l;
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
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.x;
import androidx.compose.foundation.m;
import androidx.compose.foundation.o;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5135u0;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import c2.h;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17536l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import m0.B0;
import m0.C5525D;
import m0.C5537d0;
import m0.C5548j;
import m0.C5554m;
import m0.M;
import m0.N;
import m0.v0;
import m0.w0;
import m0.y0;
import m0.z0;
import n0.C5601g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p0.s;
import p1.C5747v0;
import p1.i1;
import s0.C5834E;
import s0.C5842M;
import s0.C5843N;
import s0.C5861g;
import s0.C5862h;
import s0.C5880z;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a|\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001au\u0010%\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00192\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00192\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0001¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'H\u0000¢\u0006\u0004\b*\u0010+\"\u001a\u0010/\u001a\u00020\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b-\u0010.\"\u0014\u00101\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010,\"\u0014\u00103\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010,\"\u001a\u00105\u001a\u00020\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\b4\u0010.\"\u0014\u00107\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010,\"\u0014\u00109\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u0010,\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006=²\u0006\f\u0010;\u001a\u00020:8\nX\u0002²\u0006\f\u0010<\u001a\u00020:8\nX\u0002"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lm0/d0;", "", "expandedState", "LU0/r0;", "Landroidx/compose/ui/graphics/f;", "transformOriginState", "Landroidx/compose/foundation/o;", "scrollState", "Lp1/i1;", "shape", "Lp1/v0;", "containerColor", "Lc2/h;", "tonalElevation", "shadowElevation", "Ln0/g;", "border", "Lkotlin/Function1;", "Ls0/g;", "LXH/N;", "content", "a", "(Landroidx/compose/ui/d;Lm0/d0;LU0/r0;Landroidx/compose/foundation/o;Lp1/i1;JFFLn0/g;LnI/q;LU0/m;I)V", "Lkotlin/Function0;", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "LO0/a0;", "colors", "Ls0/E;", "contentPadding", "Lr0/m;", "interactionSource", "d", "(LnI/p;LnI/a;Landroidx/compose/ui/d;LnI/p;LnI/p;ZLO0/a0;Ls0/E;Lr0/m;LU0/m;I)V", "Lc2/p;", "anchorBounds", "menuBounds", "h", "(Lc2/p;Lc2/p;)J", "F", "j", "()F", "MenuVerticalMargin", "b", "MenuListItemContainerHeight", "c", "DropdownMenuItemHorizontalPadding", "i", "DropdownMenuVerticalPadding", "e", "DropdownMenuItemDefaultMinWidth", "f", "DropdownMenuItemDefaultMaxWidth", "", "scale", "alpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.b0  reason: case insensitive filesystem */
public final class C4719b0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f10350a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f10351b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f10352c = h.B((float) 12);

    /* renamed from: d  reason: collision with root package name */
    private static final float f10353d = h.B((float) 8);

    /* renamed from: e  reason: collision with root package name */
    private static final float f10354e = h.B((float) 112);

    /* renamed from: f  reason: collision with root package name */
    private static final float f10355f = h.B((float) 280);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "LXH/N;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.b0$a */
    static final class a extends C17544u implements C17642l<androidx.compose.ui.graphics.c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f10356c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5537d0<Boolean> f10357d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<androidx.compose.ui.graphics.f> f10358e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A1<Float> f10359f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ A1<Float> f10360g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, C5537d0<Boolean> d0Var, C4899r0<androidx.compose.ui.graphics.f> r0Var, A1<Float> a12, A1<Float> a13) {
            super(1);
            this.f10356c = z10;
            this.f10357d = d0Var;
            this.f10358e = r0Var;
            this.f10359f = a12;
            this.f10360g = a13;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            float f10 = 0.8f;
            float f11 = 1.0f;
            cVar.g(!this.f10356c ? C4719b0.b(this.f10359f) : this.f10357d.b().booleanValue() ? 1.0f : 0.8f);
            if (!this.f10356c) {
                f10 = C4719b0.b(this.f10359f);
            } else if (this.f10357d.b().booleanValue()) {
                f10 = 1.0f;
            }
            cVar.m(f10);
            if (!this.f10356c) {
                f11 = C4719b0.c(this.f10360g);
            } else if (!this.f10357d.b().booleanValue()) {
                f11 = 0.0f;
            }
            cVar.d(f11);
            cVar.L0(this.f10358e.getValue().j());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.b0$b */
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10361c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o f10362d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f10363e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.d dVar, o oVar, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f10361c = dVar;
            this.f10362d = oVar;
            this.f10363e = qVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1573559053, i10, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:429)");
                }
                androidx.compose.ui.d f10 = m.f(x.b(D.k(this.f10361c, 0.0f, C4719b0.i(), 1, (Object) null), C5880z.Max), this.f10362d, false, (s) null, false, 14, (Object) null);
                q<C5861g, C4889m, Integer, C16807N> qVar = this.f10363e;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar, 0);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, f10);
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
                qVar.invoke(C5862h.f28810a, mVar, 6);
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.b0$c */
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10364c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5537d0<Boolean> f10365d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<androidx.compose.ui.graphics.f> f10366e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o f10367f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i1 f10368g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f10369h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f10370i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f10371j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C5601g f10372k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f10373l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f10374m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.d dVar, C5537d0<Boolean> d0Var, C4899r0<androidx.compose.ui.graphics.f> r0Var, o oVar, i1 i1Var, long j10, float f10, float f11, C5601g gVar, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar, int i10) {
            super(2);
            this.f10364c = dVar;
            this.f10365d = d0Var;
            this.f10366e = r0Var;
            this.f10367f = oVar;
            this.f10368g = i1Var;
            this.f10369h = j10;
            this.f10370i = f10;
            this.f10371j = f11;
            this.f10372k = gVar;
            this.f10373l = qVar;
            this.f10374m = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C4719b0.a(this.f10364c, this.f10365d, this.f10366e, this.f10367f, this.f10368g, this.f10369h, this.f10370i, this.f10371j, this.f10372k, this.f10373l, mVar, M0.a(this.f10374m | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/v0$b;", "", "Lm0/N;", "", "a", "(Lm0/v0$b;LU0/m;I)Lm0/N;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.b0$d */
    static final class d extends C17544u implements q<v0.b<Boolean>, C4889m, Integer, N<Float>> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f10375c = new d();

        d() {
            super(3);
        }

        public final N<Float> a(v0.b<Boolean> bVar, C4889m mVar, int i10) {
            mVar.W(-1355418157);
            if (C4895p.J()) {
                C4895p.S(-1355418157, i10, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:396)");
            }
            y0 j10 = bVar.h(Boolean.FALSE, Boolean.TRUE) ? C5548j.j(30, 0, (C5525D) null, 6, (Object) null) : C5548j.j(75, 0, (C5525D) null, 6, (Object) null);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return j10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((v0.b) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/v0$b;", "", "Lm0/N;", "", "a", "(Lm0/v0$b;LU0/m;I)Lm0/N;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.b0$e */
    static final class e extends C17544u implements q<v0.b<Boolean>, C4889m, Integer, N<Float>> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f10376c = new e();

        e() {
            super(3);
        }

        public final N<Float> a(v0.b<Boolean> bVar, C4889m mVar, int i10) {
            mVar.W(1033023423);
            if (C4895p.J()) {
                C4895p.S(1033023423, i10, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:381)");
            }
            y0 j10 = bVar.h(Boolean.FALSE, Boolean.TRUE) ? C5548j.j(120, 0, M.f(), 2, (Object) null) : C5548j.j(1, 74, (C5525D) null, 4, (Object) null);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return j10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((v0.b) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.b0$f */
    static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10377c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4717a0 f10378d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f10379e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10380f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5842M f10381g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10382h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.b0$f$a */
        static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10383c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(p<? super C4889m, ? super Integer, C16807N> pVar) {
                super(2);
                this.f10383c = pVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(2035552199, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:477)");
                    }
                    androidx.compose.ui.d b10 = J.b(androidx.compose.ui.d.f18749a, l.f12945a.i(), 0.0f, 2, (Object) null);
                    p<C4889m, Integer, C16807N> pVar = this.f10383c;
                    I h10 = C5077h.h(C5437c.f24302a.o(), false);
                    int a10 = C4883j.a(mVar, 0);
                    C4912y s10 = mVar.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, b10);
                    C4504g.a aVar = C4504g.f6515W;
                    C17631a<C4504g> a11 = aVar.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar.p(a11);
                    } else {
                        mVar.t();
                    }
                    C4889m a12 = F1.a(mVar);
                    F1.c(a12, h10, aVar.c());
                    F1.c(a12, s10, aVar.e());
                    p<C4504g, Integer, C16807N> b11 = aVar.b();
                    if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                        a12.u(Integer.valueOf(a10));
                        a12.w(Integer.valueOf(a10), b11);
                    }
                    F1.c(a12, e10, aVar.d());
                    C5079j jVar = C5079j.f18125a;
                    pVar.invoke(mVar, 0);
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

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.b0$f$b */
        static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5842M f10384c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10385d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10386e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10387f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C5842M m10, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3) {
                super(2);
                this.f10384c = m10;
                this.f10385d = pVar;
                this.f10386e = pVar2;
                this.f10387f = pVar3;
            }

            public final void a(C4889m mVar, int i10) {
                C4889m mVar2 = mVar;
                int i11 = i10;
                if ((i11 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1728894036, i11, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:483)");
                    }
                    androidx.compose.ui.d m10 = D.m(C5842M.e(this.f10384c, androidx.compose.ui.d.f18749a, 1.0f, false, 2, (Object) null), this.f10385d != null ? C4719b0.f10352c : h.B((float) 0), 0.0f, this.f10386e != null ? C4719b0.f10352c : h.B((float) 0), 0.0f, 10, (Object) null);
                    p<C4889m, Integer, C16807N> pVar = this.f10387f;
                    I h10 = C5077h.h(C5437c.f24302a.o(), false);
                    int a10 = C4883j.a(mVar2, 0);
                    C4912y s10 = mVar.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, m10);
                    C4504g.a aVar = C4504g.f6515W;
                    C17631a<C4504g> a11 = aVar.a();
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
                    F1.c(a12, h10, aVar.c());
                    F1.c(a12, s10, aVar.e());
                    p<C4504g, Integer, C16807N> b10 = aVar.b();
                    if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                        a12.u(Integer.valueOf(a10));
                        a12.w(Integer.valueOf(a10), b10);
                    }
                    F1.c(a12, e10, aVar.d());
                    C5079j jVar = C5079j.f18125a;
                    pVar.invoke(mVar2, 0);
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

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.b0$f$c */
        static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10388c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(p<? super C4889m, ? super Integer, C16807N> pVar) {
                super(2);
                this.f10388c = pVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(580312062, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:507)");
                    }
                    androidx.compose.ui.d b10 = J.b(androidx.compose.ui.d.f18749a, l.f12945a.k(), 0.0f, 2, (Object) null);
                    p<C4889m, Integer, C16807N> pVar = this.f10388c;
                    I h10 = C5077h.h(C5437c.f24302a.o(), false);
                    int a10 = C4883j.a(mVar, 0);
                    C4912y s10 = mVar.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, b10);
                    C4504g.a aVar = C4504g.f6515W;
                    C17631a<C4504g> a11 = aVar.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar.p(a11);
                    } else {
                        mVar.t();
                    }
                    C4889m a12 = F1.a(mVar);
                    F1.c(a12, h10, aVar.c());
                    F1.c(a12, s10, aVar.e());
                    p<C4504g, Integer, C16807N> b11 = aVar.b();
                    if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                        a12.u(Integer.valueOf(a10));
                        a12.w(Integer.valueOf(a10), b11);
                    }
                    F1.c(a12, e10, aVar.d());
                    C5079j jVar = C5079j.f18125a;
                    pVar.invoke(mVar, 0);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(p<? super C4889m, ? super Integer, C16807N> pVar, C4717a0 a0Var, boolean z10, p<? super C4889m, ? super Integer, C16807N> pVar2, C5842M m10, p<? super C4889m, ? super Integer, C16807N> pVar3) {
            super(2);
            this.f10377c = pVar;
            this.f10378d = a0Var;
            this.f10379e = z10;
            this.f10380f = pVar2;
            this.f10381g = m10;
            this.f10382h = pVar3;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1065051884, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:473)");
                }
                mVar.W(1264683960);
                if (this.f10377c != null) {
                    C4910x.a(E.a().d(C5747v0.k(this.f10378d.a(this.f10379e))), c1.c.e(2035552199, true, new a(this.f10377c), mVar, 54), mVar, J0.f13770i | 48);
                }
                mVar.P();
                J0<C5747v0> d10 = E.a().d(C5747v0.k(this.f10378d.b(this.f10379e)));
                C5264a e10 = c1.c.e(-1728894036, true, new b(this.f10381g, this.f10377c, this.f10380f, this.f10382h), mVar, 54);
                int i11 = J0.f13770i;
                C4910x.a(d10, e10, mVar, i11 | 48);
                if (this.f10380f != null) {
                    C4910x.a(E.a().d(C5747v0.k(this.f10378d.c(this.f10379e))), c1.c.e(580312062, true, new c(this.f10380f), mVar, 54), mVar, i11 | 48);
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.b0$g */
    static final class g extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10389c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10390d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10391e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10392f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10393g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f10394h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4717a0 f10395i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C5834E f10396j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ r0.m f10397k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f10398l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(p<? super C4889m, ? super Integer, C16807N> pVar, C17631a<C16807N> aVar, androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, boolean z10, C4717a0 a0Var, C5834E e10, r0.m mVar, int i10) {
            super(2);
            this.f10389c = pVar;
            this.f10390d = aVar;
            this.f10391e = dVar;
            this.f10392f = pVar2;
            this.f10393g = pVar3;
            this.f10394h = z10;
            this.f10395i = a0Var;
            this.f10396j = e10;
            this.f10397k = mVar;
            this.f10398l = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C4719b0.d(this.f10389c, this.f10390d, this.f10391e, this.f10392f, this.f10393g, this.f10394h, this.f10395i, this.f10396j, this.f10397k, mVar, M0.a(this.f10398l | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    static {
        float f10 = (float) 48;
        f10350a = h.B(f10);
        f10351b = h.B(f10);
    }

    public static final void a(androidx.compose.ui.d dVar, C5537d0<Boolean> d0Var, C4899r0<androidx.compose.ui.graphics.f> r0Var, o oVar, i1 i1Var, long j10, float f10, float f11, C5601g gVar, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar, C4889m mVar, int i10) {
        int i11;
        int i12;
        androidx.compose.ui.d dVar2 = dVar;
        C5537d0<Boolean> d0Var2 = d0Var;
        o oVar2 = oVar;
        q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar2 = qVar;
        int i13 = i10;
        C4889m k10 = mVar.k(-151448888);
        if ((i13 & 6) == 0) {
            i11 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= (i13 & 64) == 0 ? k10.V(d0Var2) : k10.F(d0Var2) ? 32 : 16;
        }
        C4899r0<androidx.compose.ui.graphics.f> r0Var2 = r0Var;
        if ((i13 & 384) == 0) {
            i11 |= k10.V(r0Var2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i11 |= k10.V(oVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        i1 i1Var2 = i1Var;
        if ((i13 & 24576) == 0) {
            i11 |= k10.V(i1Var2) ? 16384 : 8192;
        }
        long j11 = j10;
        if ((196608 & i13) == 0) {
            i11 |= k10.e(j11) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i13) == 0) {
            i11 |= k10.c(f10) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        } else {
            float f12 = f10;
        }
        if ((i13 & 12582912) == 0) {
            i11 |= k10.c(f11) ? 8388608 : 4194304;
        } else {
            float f13 = f11;
        }
        C5601g gVar2 = gVar;
        if ((i13 & 100663296) == 0) {
            i11 |= k10.V(gVar2) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i11 |= k10.F(qVar2) ? 536870912 : 268435456;
        }
        if ((i11 & 306783379) != 306783378 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-151448888, i11, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:374)");
            }
            v0<T> h10 = w0.h(d0Var2, "DropDownMenu", k10, C5537d0.f25738d | 48 | ((i11 >> 3) & 14), 0);
            e eVar = e.f10376c;
            C17536l lVar = C17536l.f144385a;
            z0<Float, C5554m> f14 = B0.f(lVar);
            boolean booleanValue = ((Boolean) h10.i()).booleanValue();
            k10.W(2139028452);
            if (C4895p.J()) {
                C4895p.S(2139028452, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            float f15 = booleanValue ? 1.0f : 0.8f;
            if (C4895p.J()) {
                C4895p.R();
            }
            k10.P();
            Float valueOf = Float.valueOf(f15);
            boolean booleanValue2 = ((Boolean) h10.p()).booleanValue();
            k10.W(2139028452);
            if (C4895p.J()) {
                C4895p.S(2139028452, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            float f16 = booleanValue2 ? 1.0f : 0.8f;
            if (C4895p.J()) {
                C4895p.R();
            }
            k10.P();
            A1<Float> d10 = w0.d(h10, valueOf, Float.valueOf(f16), (N) eVar.invoke(h10.n(), k10, 0), f14, "FloatAnimation", k10, 0);
            d dVar3 = d.f10375c;
            z0<Float, C5554m> f17 = B0.f(lVar);
            boolean booleanValue3 = ((Boolean) h10.i()).booleanValue();
            k10.W(-249413128);
            if (C4895p.J()) {
                C4895p.S(-249413128, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            float f18 = booleanValue3 ? 1.0f : 0.0f;
            if (C4895p.J()) {
                C4895p.R();
            }
            k10.P();
            Float valueOf2 = Float.valueOf(f18);
            boolean booleanValue4 = ((Boolean) h10.p()).booleanValue();
            k10.W(-249413128);
            if (C4895p.J()) {
                C4895p.S(-249413128, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            float f19 = booleanValue4 ? 1.0f : 0.0f;
            if (C4895p.J()) {
                C4895p.R();
            }
            k10.P();
            Float valueOf3 = Float.valueOf(f19);
            boolean z10 = false;
            A1<Float> d11 = w0.d(h10, valueOf2, valueOf3, (N) dVar3.invoke(h10.n(), k10, 0), f17, "FloatAnimation", k10, 0);
            boolean booleanValue5 = ((Boolean) k10.Q(C5135u0.a())).booleanValue();
            d.a aVar = androidx.compose.ui.d.f18749a;
            boolean b10 = k10.b(booleanValue5) | k10.V(d10) | ((i11 & 112) == 32 || ((i11 & 64) != 0 && k10.F(d0Var2))) | k10.V(d11);
            if ((i11 & 896) == 256) {
                z10 = true;
            }
            boolean z11 = b10 | z10;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                i12 = i11;
                a aVar2 = new a(booleanValue5, d0Var, r0Var, d10, d11);
                k10.u(aVar2);
                D10 = aVar2;
            } else {
                i12 = i11;
            }
            int i14 = i12 >> 9;
            int i15 = i12 >> 6;
            P0.a(androidx.compose.ui.graphics.b.a(aVar, (C17642l) D10), i1Var, j10, 0, f10, f11, gVar, c1.c.e(1573559053, true, new b(dVar2, oVar2, qVar2), k10, 54), k10, (i14 & 896) | (i14 & 112) | 12582912 | (57344 & i15) | (458752 & i15) | (i15 & 3670016), 8);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(dVar, d0Var, r0Var, oVar, i1Var, j10, f10, f11, gVar, qVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final float b(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final float c(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    public static final void d(p<? super C4889m, ? super Integer, C16807N> pVar, C17631a<C16807N> aVar, androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, boolean z10, C4717a0 a0Var, C5834E e10, r0.m mVar, C4889m mVar2, int i10) {
        int i11;
        C5834E e11 = e10;
        int i12 = i10;
        C4889m k10 = mVar2.k(-1564716777);
        p<? super C4889m, ? super Integer, C16807N> pVar4 = pVar;
        if ((i12 & 6) == 0) {
            i11 = (k10.F(pVar4) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        C17631a<C16807N> aVar2 = aVar;
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        androidx.compose.ui.d dVar2 = dVar;
        if ((i12 & 384) == 0) {
            i11 |= k10.V(dVar2) ? 256 : 128;
        }
        p<? super C4889m, ? super Integer, C16807N> pVar5 = pVar2;
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(pVar5) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        p<? super C4889m, ? super Integer, C16807N> pVar6 = pVar3;
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(pVar6) ? 16384 : 8192;
        }
        boolean z11 = z10;
        if ((196608 & i12) == 0) {
            i11 |= k10.b(z11) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        C4717a0 a0Var2 = a0Var;
        if ((1572864 & i12) == 0) {
            i11 |= k10.V(a0Var2) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i12) == 0) {
            i11 |= k10.V(e11) ? 8388608 : 4194304;
        }
        r0.m mVar3 = mVar;
        if ((100663296 & i12) == 0) {
            i11 |= k10.V(mVar3) ? 67108864 : 33554432;
        }
        if ((38347923 & i11) != 38347922 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1564716777, i11, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:451)");
            }
            androidx.compose.ui.d h10 = D.h(J.x(J.h(androidx.compose.foundation.d.b(dVar, mVar, C4756u0.d(true, 0.0f, 0, k10, 6, 6), z10, (String) null, (i) null, aVar, 24, (Object) null), 0.0f, 1, (Object) null), f10354e, f10351b, f10355f, 0.0f, 8, (Object) null), e11);
            I b10 = G.b(C5073d.f18068a.f(), C5437c.f24302a.i(), k10, 48);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, h10);
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
            F1.c(a12, e12, aVar3.d());
            d1.a(X.f10101a.c(k10, 6).j(), c1.c.e(1065051884, true, new f(pVar2, a0Var, z10, pVar3, C5843N.f28726a, pVar), k10, 54), k10, 48);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new g(pVar, aVar, dVar, pVar2, pVar3, z10, a0Var, e10, mVar, i10));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long h(c2.p r5, c2.p r6) {
        /*
            int r0 = r6.j()
            int r1 = r5.k()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L_0x000f
        L_0x000d:
            r0 = r3
            goto L_0x0049
        L_0x000f:
            int r0 = r6.k()
            int r1 = r5.j()
            if (r0 > r1) goto L_0x001b
            r0 = r2
            goto L_0x0049
        L_0x001b:
            int r0 = r6.p()
            if (r0 != 0) goto L_0x0022
            goto L_0x000d
        L_0x0022:
            int r0 = r5.j()
            int r1 = r6.j()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.k()
            int r4 = r6.k()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.j()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.p()
            float r1 = (float) r1
            float r0 = r0 / r1
        L_0x0049:
            int r1 = r6.m()
            int r4 = r5.e()
            if (r1 < r4) goto L_0x0055
        L_0x0053:
            r2 = r3
            goto L_0x008f
        L_0x0055:
            int r1 = r6.e()
            int r4 = r5.m()
            if (r1 > r4) goto L_0x0060
            goto L_0x008f
        L_0x0060:
            int r1 = r6.i()
            if (r1 != 0) goto L_0x0067
            goto L_0x0053
        L_0x0067:
            int r1 = r5.m()
            int r2 = r6.m()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.e()
            int r2 = r6.e()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.m()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.i()
            float r6 = (float) r6
            float r2 = r5 / r6
        L_0x008f:
            long r5 = p1.p1.a(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4719b0.h(c2.p, c2.p):long");
    }

    public static final float i() {
        return f10353d;
    }

    public static final float j() {
        return f10350a;
    }
}
