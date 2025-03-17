package O0;

import E1.C4469b;
import E1.H;
import E1.I;
import E1.K;
import E1.a0;
import G1.C4504g;
import N1.E;
import N1.Y;
import S0.s;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.j;
import Y1.k;
import Y1.o;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.C5267b;
import c2.w;
import i1.C5437c;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import m0.C5548j;
import m0.M;
import m0.N;
import m0.v0;
import m0.y0;
import n0.C5584G;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5747v0;
import p1.g1;
import r0.m;
import s0.C5861g;
import s0.C5862h;

@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0001\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001ap\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a8\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001a\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010!\u001a\u00020\u0003*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"\u001aK\u0010*\u001a\u00020\u0003*\u00020\u001c2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001fH\u0002¢\u0006\u0004\b*\u0010+\"\u0014\u0010.\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010-\"\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010-\"\u001a\u00102\u001a\u00020,8\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010-\u001a\u0004\b0\u00101\"\u0014\u00103\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010-\"\u0014\u00105\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010-\"\u0014\u00109\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u0010;\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010-\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006=²\u0006\f\u0010<\u001a\u00020\n8\nX\u0002"}, d2 = {"", "selected", "Lkotlin/Function0;", "LXH/N;", "onClick", "Landroidx/compose/ui/d;", "modifier", "enabled", "text", "icon", "Lp1/v0;", "selectedContentColor", "unselectedContentColor", "Lr0/m;", "interactionSource", "b", "(ZLnI/a;Landroidx/compose/ui/d;ZLnI/p;LnI/p;JJLr0/m;LU0/m;II)V", "Lkotlin/Function1;", "Ls0/g;", "content", "a", "(ZLnI/a;Landroidx/compose/ui/d;ZJJLr0/m;LnI/q;LU0/m;II)V", "activeColor", "inactiveColor", "d", "(JJZLnI/p;LU0/m;I)V", "c", "(LnI/p;LnI/p;LU0/m;I)V", "LE1/a0$a;", "LE1/a0;", "textOrIconPlaceable", "", "tabHeight", "o", "(LE1/a0$a;LE1/a0;I)V", "Lc2/d;", "density", "textPlaceable", "iconPlaceable", "tabWidth", "firstBaseline", "lastBaseline", "n", "(LE1/a0$a;Lc2/d;LE1/a0;LE1/a0;IIII)V", "Lc2/h;", "F", "SmallTabHeight", "LargeTabHeight", "m", "()F", "HorizontalTextPadding", "SingleLineTextBaselineWithIcon", "e", "DoubleLineTextBaselineWithIcon", "Lc2/v;", "f", "J", "IconDistanceFromBaseline", "g", "TextDistanceFromLeadingIcon", "color", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class U0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f10013a = s.f13219a.e();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float f10014b = c2.h.B((float) 72);

    /* renamed from: c  reason: collision with root package name */
    private static final float f10015c = c2.h.B((float) 16);

    /* renamed from: d  reason: collision with root package name */
    private static final float f10016d = c2.h.B((float) 14);

    /* renamed from: e  reason: collision with root package name */
    private static final float f10017e = c2.h.B((float) 6);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final long f10018f = w.i(20);

    /* renamed from: g  reason: collision with root package name */
    private static final float f10019g = c2.h.B((float) 8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/g;", "LXH/N;", "a", "(Ls0/g;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10020c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2) {
            super(3);
            this.f10020c = pVar;
            this.f10021d = pVar2;
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1540996038, i10, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:122)");
                }
                U0.c(this.f10020c, this.f10021d, mVar, 0);
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f10022c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10023d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10024e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f10025f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10026g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10027h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f10028i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f10029j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ m f10030k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f10031l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f10032m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z10, C17631a<C16807N> aVar, androidx.compose.ui.d dVar, boolean z11, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, long j10, long j11, m mVar, int i10, int i11) {
            super(2);
            this.f10022c = z10;
            this.f10023d = aVar;
            this.f10024e = dVar;
            this.f10025f = z11;
            this.f10026g = pVar;
            this.f10027h = pVar2;
            this.f10028i = j10;
            this.f10029j = j11;
            this.f10030k = mVar;
            this.f10031l = i10;
            this.f10032m = i11;
        }

        public final void a(C4889m mVar, int i10) {
            U0.b(this.f10022c, this.f10023d, this.f10024e, this.f10025f, this.f10026g, this.f10027h, this.f10028i, this.f10029j, this.f10030k, mVar, M0.a(this.f10031l | 1), this.f10032m);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10033c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f10034d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f10035e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5584G f10036f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f10037g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10038h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f10039i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.d dVar, boolean z10, m mVar, C5584G g10, boolean z11, C17631a<C16807N> aVar, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f10033c = dVar;
            this.f10034d = z10;
            this.f10035e = mVar;
            this.f10036f = g10;
            this.f10037g = z11;
            this.f10038h = aVar;
            this.f10039i = qVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-551896140, i10, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:249)");
                }
                androidx.compose.ui.d h10 = J.h(androidx.compose.foundation.selection.a.a(this.f10033c, this.f10034d, this.f10035e, this.f10036f, this.f10037g, L1.i.h(L1.i.f8936b.g()), this.f10038h), 0.0f, 1, (Object) null);
                C5437c.b g10 = C5437c.f24302a.g();
                C5073d.f b10 = C5073d.f18068a.b();
                q<C5861g, C4889m, Integer, C16807N> qVar = this.f10039i;
                I a10 = C5080k.a(b10, g10, mVar, 54);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, h10);
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
                p<C4504g, Integer, C16807N> b11 = aVar.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b11);
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
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f10040c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10041d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10042e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f10043f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f10044g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f10045h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m f10046i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f10047j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f10048k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f10049l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z10, C17631a<C16807N> aVar, androidx.compose.ui.d dVar, boolean z11, long j10, long j11, m mVar, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar, int i10, int i11) {
            super(2);
            this.f10040c = z10;
            this.f10041d = aVar;
            this.f10042e = dVar;
            this.f10043f = z11;
            this.f10044g = j10;
            this.f10045h = j11;
            this.f10046i = mVar;
            this.f10047j = qVar;
            this.f10048k = i10;
            this.f10049l = i11;
        }

        public final void a(C4889m mVar, int i10) {
            U0.a(this.f10040c, this.f10041d, this.f10042e, this.f10043f, this.f10044g, this.f10045h, this.f10046i, this.f10047j, mVar, M0.a(this.f10048k | 1), this.f10049l);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10050c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(p<? super C4889m, ? super Integer, C16807N> pVar) {
            super(2);
            this.f10050c = pVar;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(708874428, i11, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:106)");
                }
                d1.a(Y.c(j1.c(s.f13219a.f(), mVar2, 6), 0, 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (U1.e) null, 0, (k) null, (g1) null, (r1.g) null, j.f14783b.a(), 0, 0, (Y1.q) null, (E) null, (Y1.h) null, 0, 0, (Y1.s) null, 16744447, (Object) null), this.f10050c, mVar2, 0);
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    static final class f implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10051a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10052b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a0 f10053c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a0 f10054d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ K f10055e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f10056f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f10057g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ Integer f10058h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ Integer f10059i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, a0 a0Var2, K k10, int i10, int i11, Integer num, Integer num2) {
                super(1);
                this.f10053c = a0Var;
                this.f10054d = a0Var2;
                this.f10055e = k10;
                this.f10056f = i10;
                this.f10057g = i11;
                this.f10058h = num;
                this.f10059i = num2;
            }

            public final void a(a0.a aVar) {
                a0 a0Var;
                a0 a0Var2 = this.f10053c;
                if (a0Var2 != null && (a0Var = this.f10054d) != null) {
                    K k10 = this.f10055e;
                    int i10 = this.f10056f;
                    int i11 = this.f10057g;
                    Integer num = this.f10058h;
                    C17542s.g(num);
                    int intValue = num.intValue();
                    Integer num2 = this.f10059i;
                    C17542s.g(num2);
                    U0.n(aVar, k10, a0Var2, a0Var, i10, i11, intValue, num2.intValue());
                } else if (a0Var2 != null) {
                    U0.o(aVar, a0Var2, this.f10057g);
                } else {
                    a0 a0Var3 = this.f10054d;
                    if (a0Var3 != null) {
                        U0.o(aVar, a0Var3, this.f10057g);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        f(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2) {
            this.f10051a = pVar;
            this.f10052b = pVar2;
        }

        public final E1.J i(K k10, List<? extends H> list, long j10) {
            a0 a0Var;
            a0 a0Var2;
            K k11 = k10;
            List<? extends H> list2 = list;
            int i10 = 0;
            if (this.f10051a != null) {
                int size = list.size();
                int i11 = 0;
                while (i11 < size) {
                    H h10 = (H) list2.get(i11);
                    if (C17542s.e(androidx.compose.ui.layout.a.a(h10), "text")) {
                        a0Var = h10.i0(C5267b.d(j10, 0, 0, 0, 0, 11, (Object) null));
                    } else {
                        i11++;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            a0Var = null;
            if (this.f10052b != null) {
                int size2 = list.size();
                int i12 = 0;
                while (i12 < size2) {
                    H h11 = (H) list2.get(i12);
                    if (C17542s.e(androidx.compose.ui.layout.a.a(h11), "icon")) {
                        a0Var2 = h11.i0(j10);
                    } else {
                        long j11 = j10;
                        i12++;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            a0Var2 = null;
            int max = Math.max(a0Var != null ? a0Var.E0() : 0, a0Var2 != null ? a0Var2.E0() : 0);
            int K02 = k11.K0((a0Var == null || a0Var2 == null) ? U0.f10013a : U0.f10014b);
            int z02 = a0Var2 != null ? a0Var2.z0() : 0;
            if (a0Var != null) {
                i10 = a0Var.z0();
            }
            int max2 = Math.max(K02, z02 + i10 + k11.K1(U0.f10018f));
            return K.v0(k10, max, max2, (Map) null, new a(a0Var, a0Var2, k10, max, max2, a0Var != null ? Integer.valueOf(a0Var.n0(C4469b.a())) : null, a0Var != null ? Integer.valueOf(a0Var.n0(C4469b.b())) : null), 4, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10060c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10061d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f10062e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, int i10) {
            super(2);
            this.f10060c = pVar;
            this.f10061d = pVar2;
            this.f10062e = i10;
        }

        public final void a(C4889m mVar, int i10) {
            U0.c(this.f10060c, this.f10061d, mVar, M0.a(this.f10062e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f10063c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f10064d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f10065e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10066f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f10067g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(long j10, long j11, boolean z10, p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f10063c = j10;
            this.f10064d = j11;
            this.f10065e = z10;
            this.f10066f = pVar;
            this.f10067g = i10;
        }

        public final void a(C4889m mVar, int i10) {
            U0.d(this.f10063c, this.f10064d, this.f10065e, this.f10066f, mVar, M0.a(this.f10067g | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/v0$b;", "", "Lm0/N;", "Lp1/v0;", "a", "(Lm0/v0$b;LU0/m;I)Lm0/N;"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements q<v0.b<Boolean>, C4889m, Integer, N<C5747v0>> {

        /* renamed from: c  reason: collision with root package name */
        public static final i f10068c = new i();

        i() {
            super(3);
        }

        public final N<C5747v0> a(v0.b<Boolean> bVar, C4889m mVar, int i10) {
            mVar.W(-899623535);
            if (C4895p.J()) {
                C4895p.S(-899623535, i10, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:284)");
            }
            y0 i11 = bVar.h(Boolean.FALSE, Boolean.TRUE) ? C5548j.i(150, 100, M.e()) : C5548j.j(100, 0, M.e(), 2, (Object) null);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return i11;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((v0.b) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(boolean r27, nI.C17631a<XH.C16807N> r28, androidx.compose.ui.d r29, boolean r30, long r31, long r33, r0.m r35, nI.q<? super s0.C5861g, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r36, U0.C4889m r37, int r38, int r39) {
        /*
            r11 = r38
            r12 = r39
            r0 = -202735880(0xfffffffff3ea7ef8, float:-3.715737E31)
            r1 = r37
            U0.m r9 = r1.k(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r11 | 6
            r10 = r27
            goto L_0x0028
        L_0x0016:
            r1 = r11 & 6
            r10 = r27
            if (r1 != 0) goto L_0x0027
            boolean r1 = r9.b(r10)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r11
            goto L_0x0028
        L_0x0027:
            r1 = r11
        L_0x0028:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0031
            r1 = r1 | 48
            r8 = r28
            goto L_0x0043
        L_0x0031:
            r2 = r11 & 48
            r8 = r28
            if (r2 != 0) goto L_0x0043
            boolean r2 = r9.F(r8)
            if (r2 == 0) goto L_0x0040
            r2 = 32
            goto L_0x0042
        L_0x0040:
            r2 = 16
        L_0x0042:
            r1 = r1 | r2
        L_0x0043:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r3 = r29
            goto L_0x005e
        L_0x004c:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0049
            r3 = r29
            boolean r4 = r9.V(r3)
            if (r4 == 0) goto L_0x005b
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r4
        L_0x005e:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x0067
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r5 = r30
            goto L_0x0079
        L_0x0067:
            r5 = r11 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0064
            r5 = r30
            boolean r6 = r9.b(r5)
            if (r6 == 0) goto L_0x0076
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r1 = r1 | r6
        L_0x0079:
            r6 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0092
            r6 = r12 & 16
            if (r6 != 0) goto L_0x008c
            r6 = r31
            boolean r13 = r9.e(r6)
            if (r13 == 0) goto L_0x008e
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008c:
            r6 = r31
        L_0x008e:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r1 = r1 | r13
            goto L_0x0094
        L_0x0092:
            r6 = r31
        L_0x0094:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x00ae
            r13 = r12 & 32
            if (r13 != 0) goto L_0x00a8
            r13 = r33
            boolean r15 = r9.e(r13)
            if (r15 == 0) goto L_0x00aa
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00a8:
            r13 = r33
        L_0x00aa:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r1 = r1 | r15
            goto L_0x00b0
        L_0x00ae:
            r13 = r33
        L_0x00b0:
            r15 = r12 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00bb
            r1 = r1 | r16
            r0 = r35
            goto L_0x00ce
        L_0x00bb:
            r16 = r11 & r16
            r0 = r35
            if (r16 != 0) goto L_0x00ce
            boolean r17 = r9.V(r0)
            if (r17 == 0) goto L_0x00ca
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r1 = r1 | r17
        L_0x00ce:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00d9
            r1 = r1 | r17
        L_0x00d6:
            r0 = r36
            goto L_0x00ec
        L_0x00d9:
            r0 = r11 & r17
            if (r0 != 0) goto L_0x00d6
            r0 = r36
            boolean r17 = r9.F(r0)
            if (r17 == 0) goto L_0x00e8
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e8:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r1 = r1 | r17
        L_0x00ec:
            r17 = 4793491(0x492493, float:6.717112E-39)
            r0 = r1 & r17
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x0109
            boolean r0 = r9.l()
            if (r0 != 0) goto L_0x00fd
            goto L_0x0109
        L_0x00fd:
            r9.L()
            r3 = r29
            r26 = r35
            r4 = r5
            r5 = r6
            r7 = r13
            goto L_0x01d3
        L_0x0109:
            r9.G()
            r0 = r11 & 1
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = 1
            if (r0 == 0) goto L_0x0137
            boolean r0 = r9.O()
            if (r0 == 0) goto L_0x011b
            goto L_0x0137
        L_0x011b:
            r9.L()
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0124
            r1 = r1 & r17
        L_0x0124:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x012c
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r0
        L_0x012c:
            r0 = r29
        L_0x012e:
            r26 = r35
        L_0x0130:
            r21 = r5
            r22 = r6
            r24 = r13
            goto L_0x0164
        L_0x0137:
            if (r2 == 0) goto L_0x013c
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x013e
        L_0x013c:
            r0 = r29
        L_0x013e:
            if (r4 == 0) goto L_0x0141
            r5 = r3
        L_0x0141:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x0155
            U0.I0 r2 = O0.E.a()
            java.lang.Object r2 = r9.Q(r2)
            p1.v0 r2 = (p1.C5747v0) r2
            long r6 = r2.y()
            r1 = r1 & r17
        L_0x0155:
            r2 = r12 & 32
            if (r2 == 0) goto L_0x015e
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r2
            r13 = r6
        L_0x015e:
            if (r15 == 0) goto L_0x012e
            r2 = 0
            r26 = r2
            goto L_0x0130
        L_0x0164:
            r9.y()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0176
            r2 = -1
            java.lang.String r4 = "androidx.compose.material3.Tab (Tab.kt:242)"
            r5 = -202735880(0xfffffffff3ea7ef8, float:-3.715737E31)
            U0.C4895p.S(r5, r1, r2, r4)
        L_0x0176:
            int r2 = r1 >> 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | 6
            r4 = 2
            r5 = 1
            r6 = 0
            r29 = r5
            r30 = r6
            r31 = r22
            r33 = r9
            r34 = r2
            r35 = r4
            n0.G r17 = O0.C4756u0.d(r29, r30, r31, r33, r34, r35)
            O0.U0$c r2 = new O0.U0$c
            r13 = r2
            r14 = r0
            r15 = r27
            r16 = r26
            r18 = r21
            r19 = r28
            r20 = r36
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r4 = 54
            r5 = -551896140(0xffffffffdf1abbb4, float:-1.1149703E19)
            c1.a r6 = c1.c.e(r5, r3, r2, r9, r4)
            int r2 = r1 >> 12
            r3 = r2 & 14
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r1 = r1 << 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r13 = r2 | r1
            r1 = r22
            r3 = r24
            r5 = r27
            r7 = r9
            r8 = r13
            d(r1, r3, r5, r6, r7, r8)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x01cc
            U0.C4895p.R()
        L_0x01cc:
            r3 = r0
            r4 = r21
            r5 = r22
            r7 = r24
        L_0x01d3:
            U0.Y0 r13 = r9.n()
            if (r13 == 0) goto L_0x01ee
            O0.U0$d r14 = new O0.U0$d
            r0 = r14
            r1 = r27
            r2 = r28
            r9 = r26
            r10 = r36
            r11 = r38
            r12 = r39
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            r13.a(r14)
        L_0x01ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.U0.a(boolean, nI.a, androidx.compose.ui.d, boolean, long, long, r0.m, nI.q, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(boolean r29, nI.C17631a<XH.C16807N> r30, androidx.compose.ui.d r31, boolean r32, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r33, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r34, long r35, long r37, r0.m r39, U0.C4889m r40, int r41, int r42) {
        /*
            r12 = r41
            r13 = r42
            r0 = -350627181(0xffffffffeb19da93, float:-1.8599784E26)
            r1 = r40
            U0.m r1 = r1.k(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r12 | 6
            r3 = r2
            r2 = r29
            goto L_0x002b
        L_0x0017:
            r2 = r12 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r29
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r12
            goto L_0x002b
        L_0x0028:
            r2 = r29
            r3 = r12
        L_0x002b:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r4 = r30
            goto L_0x0046
        L_0x0034:
            r4 = r12 & 48
            if (r4 != 0) goto L_0x0031
            r4 = r30
            boolean r5 = r1.F(r4)
            if (r5 == 0) goto L_0x0043
            r5 = 32
            goto L_0x0045
        L_0x0043:
            r5 = 16
        L_0x0045:
            r3 = r3 | r5
        L_0x0046:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r6 = r31
            goto L_0x0061
        L_0x004f:
            r6 = r12 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r31
            boolean r7 = r1.V(r6)
            if (r7 == 0) goto L_0x005e
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r7
        L_0x0061:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r8 = r32
            goto L_0x007c
        L_0x006a:
            r8 = r12 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0067
            r8 = r32
            boolean r9 = r1.b(r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r9
        L_0x007c:
            r9 = r13 & 16
            if (r9 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r10 = r33
            goto L_0x0097
        L_0x0085:
            r10 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0082
            r10 = r33
            boolean r11 = r1.F(r10)
            if (r11 == 0) goto L_0x0094
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r11
        L_0x0097:
            r11 = r13 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x00a1
            r3 = r3 | r14
        L_0x009e:
            r14 = r34
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r12
            if (r14 != 0) goto L_0x009e
            r14 = r34
            boolean r15 = r1.F(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r15
        L_0x00b2:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r12
            if (r15 != 0) goto L_0x00cd
            r15 = r13 & 64
            if (r15 != 0) goto L_0x00c6
            r14 = r35
            boolean r16 = r1.e(r14)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c6:
            r14 = r35
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r3 = r3 | r16
            goto L_0x00cf
        L_0x00cd:
            r14 = r35
        L_0x00cf:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = r12 & r16
            if (r17 != 0) goto L_0x00e8
            r0 = r13 & 128(0x80, float:1.794E-43)
            r14 = r37
            if (r0 != 0) goto L_0x00e4
            boolean r0 = r1.e(r14)
            if (r0 == 0) goto L_0x00e4
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e6
        L_0x00e4:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e6:
            r3 = r3 | r0
            goto L_0x00ea
        L_0x00e8:
            r14 = r37
        L_0x00ea:
            r0 = r13 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f5
            r3 = r3 | r18
            r2 = r39
            goto L_0x0108
        L_0x00f5:
            r18 = r12 & r18
            r2 = r39
            if (r18 != 0) goto L_0x0108
            boolean r18 = r1.V(r2)
            if (r18 == 0) goto L_0x0104
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0104:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0106:
            r3 = r3 | r18
        L_0x0108:
            r18 = 38347923(0x2492493, float:1.4777644E-37)
            r2 = r3 & r18
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r4) goto L_0x0128
            boolean r2 = r1.l()
            if (r2 != 0) goto L_0x0119
            goto L_0x0128
        L_0x0119:
            r1.L()
            r11 = r39
            r3 = r6
            r4 = r8
            r5 = r10
            r9 = r14
            r6 = r34
            r7 = r35
            goto L_0x0214
        L_0x0128:
            r1.G()
            r2 = r12 & 1
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0157
            boolean r2 = r1.O()
            if (r2 == 0) goto L_0x013c
            goto L_0x0157
        L_0x013c:
            r1.L()
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0145
            r3 = r3 & r18
        L_0x0145:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x014d
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r0
        L_0x014d:
            r5 = r34
            r0 = r39
            r2 = r6
            r27 = r14
            r6 = r35
            goto L_0x0196
        L_0x0157:
            if (r5 == 0) goto L_0x015c
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x015d
        L_0x015c:
            r2 = r6
        L_0x015d:
            if (r7 == 0) goto L_0x0160
            r8 = r4
        L_0x0160:
            if (r9 == 0) goto L_0x0164
            r10 = r19
        L_0x0164:
            if (r11 == 0) goto L_0x0169
            r5 = r19
            goto L_0x016b
        L_0x0169:
            r5 = r34
        L_0x016b:
            r6 = r13 & 64
            if (r6 == 0) goto L_0x0180
            U0.I0 r6 = O0.E.a()
            java.lang.Object r6 = r1.Q(r6)
            p1.v0 r6 = (p1.C5747v0) r6
            long r6 = r6.y()
            r3 = r3 & r18
            goto L_0x0182
        L_0x0180:
            r6 = r35
        L_0x0182:
            r9 = r13 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x018b
            r9 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r9
            r14 = r6
        L_0x018b:
            if (r0 == 0) goto L_0x0192
            r27 = r14
            r0 = r19
            goto L_0x0196
        L_0x0192:
            r0 = r39
            r27 = r14
        L_0x0196:
            r1.y()
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x01a8
            r9 = -1
            java.lang.String r11 = "androidx.compose.material3.Tab (Tab.kt:102)"
            r14 = -350627181(0xffffffffeb19da93, float:-1.8599784E26)
            U0.C4895p.S(r14, r3, r9, r11)
        L_0x01a8:
            r9 = 79583089(0x4be5771, float:4.4749088E-36)
            r1.W(r9)
            r9 = 54
            if (r10 != 0) goto L_0x01b5
        L_0x01b2:
            r11 = r19
            goto L_0x01c2
        L_0x01b5:
            O0.U0$e r11 = new O0.U0$e
            r11.<init>(r10)
            r14 = 708874428(0x2a4090bc, float:1.710324E-13)
            c1.a r19 = c1.c.e(r14, r4, r11, r1, r9)
            goto L_0x01b2
        L_0x01c2:
            r1.P()
            O0.U0$a r14 = new O0.U0$a
            r14.<init>(r11, r5)
            r11 = 1540996038(0x5bd9bbc6, float:1.22573058E17)
            c1.a r23 = c1.c.e(r11, r4, r14, r1, r9)
            r4 = r3 & 14
            r4 = r4 | r16
            r9 = r3 & 112(0x70, float:1.57E-43)
            r4 = r4 | r9
            r9 = r3 & 896(0x380, float:1.256E-42)
            r4 = r4 | r9
            r9 = r3 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r9
            int r3 = r3 >> 6
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r3
            r4 = r4 | r9
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r3
            r4 = r4 | r9
            r9 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r9
            r25 = r4 | r3
            r26 = 0
            r14 = r29
            r15 = r30
            r16 = r2
            r17 = r8
            r18 = r6
            r20 = r27
            r22 = r0
            r24 = r1
            a(r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x020c
            U0.C4895p.R()
        L_0x020c:
            r11 = r0
            r3 = r2
            r4 = r8
            r7 = r6
            r6 = r5
            r5 = r10
            r9 = r27
        L_0x0214:
            U0.Y0 r14 = r1.n()
            if (r14 == 0) goto L_0x022b
            O0.U0$b r15 = new O0.U0$b
            r0 = r15
            r1 = r29
            r2 = r30
            r12 = r41
            r13 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13)
            r14.a(r15)
        L_0x022b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.U0.b(boolean, nI.a, androidx.compose.ui.d, boolean, nI.p, nI.p, long, long, r0.m, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void c(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(514131524);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(pVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(514131524, i11, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:306)");
            }
            int i12 = i11 & 14;
            boolean z10 = true;
            boolean z11 = i12 == 4;
            if ((i11 & 112) != 32) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new f(pVar, pVar2);
                k10.u(D10);
            }
            I i13 = (I) D10;
            d.a aVar = androidx.compose.ui.d.f18749a;
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar);
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
            F1.c(a12, i13, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar2.d());
            k10.W(871566271);
            if (pVar != null) {
                androidx.compose.ui.d k11 = D.k(androidx.compose.ui.layout.a.b(aVar, "text"), f10015c, 0.0f, 2, (Object) null);
                I h10 = C5077h.h(C5437c.f24302a.o(), false);
                int a13 = C4883j.a(k10, 0);
                C4912y s11 = k10.s();
                androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, k11);
                C17631a<C4504g> a14 = aVar2.a();
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
                F1.c(a15, h10, aVar2.c());
                F1.c(a15, s11, aVar2.e());
                p<C4504g, Integer, C16807N> b11 = aVar2.b();
                if (a15.i() || !C17542s.e(a15.D(), Integer.valueOf(a13))) {
                    a15.u(Integer.valueOf(a13));
                    a15.w(Integer.valueOf(a13), b11);
                }
                F1.c(a15, e11, aVar2.d());
                C5079j jVar = C5079j.f18125a;
                pVar.invoke(k10, Integer.valueOf(i12));
                k10.x();
            }
            k10.P();
            k10.W(871570579);
            if (pVar2 != null) {
                androidx.compose.ui.d b12 = androidx.compose.ui.layout.a.b(aVar, "icon");
                I h11 = C5077h.h(C5437c.f24302a.o(), false);
                int a16 = C4883j.a(k10, 0);
                C4912y s12 = k10.s();
                androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, b12);
                C17631a<C4504g> a17 = aVar2.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a17);
                } else {
                    k10.t();
                }
                C4889m a18 = F1.a(k10);
                F1.c(a18, h11, aVar2.c());
                F1.c(a18, s12, aVar2.e());
                p<C4504g, Integer, C16807N> b13 = aVar2.b();
                if (a18.i() || !C17542s.e(a18.D(), Integer.valueOf(a16))) {
                    a18.u(Integer.valueOf(a16));
                    a18.w(Integer.valueOf(a16), b13);
                }
                F1.c(a18, e12, aVar2.d());
                C5079j jVar2 = C5079j.f18125a;
                pVar2.invoke(k10, Integer.valueOf((i11 >> 3) & 14));
                k10.x();
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
            n10.a(new g(pVar, pVar2, i10));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: m0.z0} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(long r18, long r20, boolean r22, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r23, U0.C4889m r24, int r25) {
        /*
            r6 = r23
            r7 = r25
            r0 = 735731848(0x2bda6088, float:1.5516624E-12)
            r1 = r24
            U0.m r1 = r1.k(r0)
            r2 = r7 & 6
            r3 = 2
            r4 = r18
            if (r2 != 0) goto L_0x001f
            boolean r2 = r1.e(r4)
            if (r2 == 0) goto L_0x001c
            r2 = 4
            goto L_0x001d
        L_0x001c:
            r2 = r3
        L_0x001d:
            r2 = r2 | r7
            goto L_0x0020
        L_0x001f:
            r2 = r7
        L_0x0020:
            r8 = r7 & 48
            r14 = r20
            if (r8 != 0) goto L_0x0032
            boolean r8 = r1.e(r14)
            if (r8 == 0) goto L_0x002f
            r8 = 32
            goto L_0x0031
        L_0x002f:
            r8 = 16
        L_0x0031:
            r2 = r2 | r8
        L_0x0032:
            r8 = r7 & 384(0x180, float:5.38E-43)
            r13 = r22
            if (r8 != 0) goto L_0x0044
            boolean r8 = r1.b(r13)
            if (r8 == 0) goto L_0x0041
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r2 = r2 | r8
        L_0x0044:
            r8 = r7 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0054
            boolean r8 = r1.F(r6)
            if (r8 == 0) goto L_0x0051
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r2 = r2 | r8
        L_0x0054:
            r8 = r2 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x0066
            boolean r8 = r1.l()
            if (r8 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r1.L()
            goto L_0x016e
        L_0x0066:
            boolean r8 = U0.C4895p.J()
            r9 = -1
            if (r8 == 0) goto L_0x0072
            java.lang.String r8 = "androidx.compose.material3.TabTransition (Tab.kt:279)"
            U0.C4895p.S(r0, r2, r9, r8)
        L_0x0072:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            int r2 = r2 >> 6
            r8 = r2 & 14
            r10 = 0
            m0.v0 r8 = m0.w0.g(r0, r10, r1, r8, r3)
            O0.U0$i r0 = O0.U0.i.f10068c
            java.lang.Object r3 = r8.p()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r10 = -1997025499(0xffffffff88f7cf25, float:-1.4914471E-33)
            r1.W(r10)
            boolean r11 = U0.C4895p.J()
            java.lang.String r12 = "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)"
            r4 = 0
            if (r11 == 0) goto L_0x009d
            U0.C4895p.S(r10, r4, r9, r12)
        L_0x009d:
            if (r3 == 0) goto L_0x00a2
            r16 = r18
            goto L_0x00a4
        L_0x00a2:
            r16 = r14
        L_0x00a4:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00ad
            U0.C4895p.R()
        L_0x00ad:
            r1.P()
            q1.c r3 = p1.C5747v0.t(r16)
            boolean r5 = r1.V(r3)
            java.lang.Object r11 = r1.D()
            if (r5 != 0) goto L_0x00c6
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r11 != r5) goto L_0x00d6
        L_0x00c6:
            p1.v0$a r5 = p1.C5747v0.f27350b
            nI.l r5 = l0.h.a(r5)
            java.lang.Object r3 = r5.invoke(r3)
            r11 = r3
            m0.z0 r11 = (m0.z0) r11
            r1.u(r11)
        L_0x00d6:
            r3 = r11
            m0.z0 r3 = (m0.z0) r3
            java.lang.Object r5 = r8.i()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r1.W(r10)
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x00ef
            U0.C4895p.S(r10, r4, r9, r12)
        L_0x00ef:
            if (r5 == 0) goto L_0x00f4
            r16 = r18
            goto L_0x00f6
        L_0x00f4:
            r16 = r14
        L_0x00f6:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00ff
            U0.C4895p.R()
        L_0x00ff:
            r1.P()
            p1.v0 r5 = p1.C5747v0.k(r16)
            java.lang.Object r11 = r8.p()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r1.W(r10)
            boolean r16 = U0.C4895p.J()
            if (r16 == 0) goto L_0x011c
            U0.C4895p.S(r10, r4, r9, r12)
        L_0x011c:
            if (r11 == 0) goto L_0x0121
            r9 = r18
            goto L_0x0122
        L_0x0121:
            r9 = r14
        L_0x0122:
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x012b
            U0.C4895p.R()
        L_0x012b:
            r1.P()
            p1.v0 r10 = p1.C5747v0.k(r9)
            m0.v0$b r9 = r8.n()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.invoke(r9, r1, r4)
            r11 = r0
            m0.N r11 = (m0.N) r11
            r0 = 0
            java.lang.String r4 = "ColorAnimation"
            r9 = r5
            r12 = r3
            r13 = r4
            r14 = r1
            r15 = r0
            U0.A1 r0 = m0.w0.d(r8, r9, r10, r11, r12, r13, r14, r15)
            U0.I0 r3 = O0.E.a()
            long r4 = e(r0)
            p1.v0 r0 = p1.C5747v0.k(r4)
            U0.J0 r0 = r3.d(r0)
            int r3 = U0.J0.f13770i
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            U0.C4910x.a(r0, r6, r1, r2)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x016e
            U0.C4895p.R()
        L_0x016e:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x0187
            O0.U0$h r9 = new O0.U0$h
            r0 = r9
            r1 = r18
            r3 = r20
            r5 = r22
            r6 = r23
            r7 = r25
            r0.<init>(r1, r3, r5, r6, r7)
            r8.a(r9)
        L_0x0187:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.U0.d(long, long, boolean, nI.p, U0.m, int):void");
    }

    private static final long e(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    public static final float m() {
        return f10015c;
    }

    /* access modifiers changed from: private */
    public static final void n(a0.a aVar, c2.d dVar, a0 a0Var, a0 a0Var2, int i10, int i11, int i12, int i13) {
        c2.d dVar2 = dVar;
        int i14 = i12;
        int i15 = i13;
        int K02 = dVar.K0(i14 == i15 ? f10016d : f10017e) + dVar.K0(s.f13219a.b());
        int z02 = (a0Var2.z0() + dVar.K1(f10018f)) - i14;
        int i16 = (i11 - i15) - K02;
        a0.a aVar2 = aVar;
        a0.a.m(aVar2, a0Var, (i10 - a0Var.E0()) / 2, i16, 0.0f, 4, (Object) null);
        a0.a.m(aVar2, a0Var2, (i10 - a0Var2.E0()) / 2, i16 - z02, 0.0f, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void o(a0.a aVar, a0 a0Var, int i10) {
        a0.a.m(aVar, a0Var, 0, (i10 - a0Var.z0()) / 2, 0.0f, 4, (Object) null);
    }
}
