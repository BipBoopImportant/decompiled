package O0;

import E1.H;
import E1.I;
import E1.K;
import E1.a0;
import G1.C4504g;
import L1.o;
import L1.x;
import Q0.s;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
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
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.C5267b;
import c2.r;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import l0.u;
import m0.C5525D;
import m0.C5548j;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5747v0;
import pI.C17752b;
import s0.C5842M;
import s0.C5843N;
import s0.C5848T;
import s0.C5851W;
import tI.C17978n;
import z0.C6270a;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\u001aX\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a}\u0010\u001b\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a_\u0010!\u001a\u00020\u000b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0011H\u0003¢\u0006\u0004\b!\u0010\"\u001a8\u0010+\u001a\u00020**\u00020#2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010$2\u0006\u0010)\u001a\u00020(H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001aP\u0010.\u001a\u00020**\u00020#2\u0006\u0010-\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010$2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/\"\u0014\u00101\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u00100\"\u001a\u00104\u001a\u00020\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u00100\u001a\u0004\b2\u00103\"\u001a\u00107\u001a\u00020\u00058\u0000X\u0004¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00103\"\u0014\u00109\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00100\"\u001a\u0010;\u001a\u00020\u00058\u0000X\u0004¢\u0006\f\n\u0004\b!\u00100\u001a\u0004\b:\u00103\"\u0014\u0010=\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u00100\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B²\u0006\f\u0010>\u001a\u00020\u00028\nX\u0002²\u0006\f\u0010?\u001a\u00020\u00028\nX\u0002²\u0006\u000e\u0010A\u001a\u00020@8\n@\nX\u0002"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lp1/v0;", "containerColor", "contentColor", "Lc2/h;", "tonalElevation", "Ls0/T;", "windowInsets", "Lkotlin/Function1;", "Ls0/M;", "LXH/N;", "content", "a", "(Landroidx/compose/ui/d;JJFLs0/T;LnI/q;LU0/m;II)V", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "LO0/h0;", "colors", "Lr0/m;", "interactionSource", "b", "(Ls0/M;ZLnI/a;LnI/p;Landroidx/compose/ui/d;ZLnI/p;ZLO0/h0;Lr0/m;LU0/m;II)V", "indicatorRipple", "indicator", "", "animationProgress", "e", "(LnI/p;LnI/p;LnI/p;LnI/p;ZLnI/a;LU0/m;I)V", "LE1/K;", "LE1/a0;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Lc2/b;", "constraints", "LE1/J;", "n", "(LE1/K;LE1/a0;LE1/a0;LE1/a0;J)LE1/J;", "labelPlaceable", "o", "(LE1/K;LE1/a0;LE1/a0;LE1/a0;LE1/a0;JZF)LE1/J;", "F", "NavigationBarHeight", "m", "()F", "NavigationBarItemHorizontalPadding", "c", "getNavigationBarIndicatorToLabelPadding", "NavigationBarIndicatorToLabelPadding", "d", "IndicatorHorizontalPadding", "l", "IndicatorVerticalPadding", "f", "IndicatorVerticalOffset", "iconColor", "textColor", "", "itemWidth", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.j0  reason: case insensitive filesystem */
public final class C4735j0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f10974a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f10975b = c2.h.B((float) 8);

    /* renamed from: c  reason: collision with root package name */
    private static final float f10976c = c2.h.B((float) 4);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final float f10977d;

    /* renamed from: e  reason: collision with root package name */
    private static final float f10978e;

    /* renamed from: f  reason: collision with root package name */
    private static final float f10979f = c2.h.B((float) 12);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j0$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5848T f10980c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q<C5842M, C4889m, Integer, C16807N> f10981d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5848T t10, q<? super C5842M, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f10980c = t10;
            this.f10981d = qVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(105663120, i10, -1, "androidx.compose.material3.NavigationBar.<anonymous> (NavigationBar.kt:123)");
                }
                androidx.compose.ui.d a10 = C6270a.a(J.b(C5851W.d(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), this.f10980c), 0.0f, C4735j0.f10974a, 1, (Object) null));
                C5073d.f n10 = C5073d.f18068a.n(C4735j0.m());
                C5437c.C0386c i11 = C5437c.f24302a.i();
                q<C5842M, C4889m, Integer, C16807N> qVar = this.f10981d;
                I b10 = G.b(n10, i11, mVar, 54);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, a10);
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
                F1.c(a13, b10, aVar.c());
                F1.c(a13, s10, aVar.e());
                p<C4504g, Integer, C16807N> b11 = aVar.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b11);
                }
                F1.c(a13, e10, aVar.d());
                qVar.invoke(C5843N.f28726a, mVar, 6);
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
    /* renamed from: O0.j0$b */
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10982c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f10983d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f10984e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f10985f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5848T f10986g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ q<C5842M, C4889m, Integer, C16807N> f10987h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f10988i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f10989j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.d dVar, long j10, long j11, float f10, C5848T t10, q<? super C5842M, ? super C4889m, ? super Integer, C16807N> qVar, int i10, int i11) {
            super(2);
            this.f10982c = dVar;
            this.f10983d = j10;
            this.f10984e = j11;
            this.f10985f = f10;
            this.f10986g = t10;
            this.f10987h = qVar;
            this.f10988i = i10;
            this.f10989j = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4735j0.a(this.f10982c, this.f10983d, this.f10984e, this.f10985f, this.f10986g, this.f10987h, mVar, M0.a(this.f10988i | 1), this.f10989j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/r;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j0$c */
    static final class c extends C17544u implements C17642l<r, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4894o0 f10990c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C4894o0 o0Var) {
            super(1);
            this.f10990c = o0Var;
        }

        public final void a(long j10) {
            C4735j0.d(this.f10990c, r.h(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).k());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j0$d */
    static final class d extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<Float> f10991c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(A1<Float> a12) {
            super(0);
            this.f10991c = a12;
        }

        /* renamed from: b */
        public final Float invoke() {
            return this.f10991c.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j0$e */
    static final class e extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<Float> f10992c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4731h0 f10993d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "LXH/N;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.j0$e$a */
        static final class a extends C17544u implements C17642l<androidx.compose.ui.graphics.c, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ A1<Float> f10994c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(A1<Float> a12) {
                super(1);
                this.f10994c = a12;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                cVar.d(this.f10994c.getValue().floatValue());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((androidx.compose.ui.graphics.c) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(A1<Float> a12, C4731h0 h0Var) {
            super(2);
            this.f10992c = a12;
            this.f10993d = h0Var;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-474426875, i10, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:265)");
                }
                androidx.compose.ui.d b10 = androidx.compose.ui.layout.a.b(androidx.compose.ui.d.f18749a, "indicator");
                boolean V10 = mVar.V(this.f10992c);
                A1<Float> a12 = this.f10992c;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(a12);
                    mVar.u(D10);
                }
                C5077h.a(androidx.compose.foundation.b.c(androidx.compose.ui.graphics.b.a(b10, (C17642l) D10), this.f10993d.b(), D0.d(S0.n.f12987a.d(), mVar, 6)), mVar, 0);
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
    /* renamed from: O0.j0$f */
    static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q0.n f10995c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Q0.n nVar) {
            super(2);
            this.f10995c = nVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(691730997, i10, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:257)");
                }
                C5077h.a(androidx.compose.foundation.j.b(m1.e.a(androidx.compose.ui.layout.a.b(androidx.compose.ui.d.f18749a, "indicatorRipple"), D0.d(S0.n.f12987a.d(), mVar, 6)), this.f10995c, C4756u0.d(false, 0.0f, 0, mVar, 0, 7)), mVar, 0);
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
    /* renamed from: O0.j0$g */
    static final class g extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5842M f10996c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f10997d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10998e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10999f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11000g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f11001h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11002i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f11003j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C4731h0 f11004k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ r0.m f11005l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f11006m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f11007n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C5842M m10, boolean z10, C17631a<C16807N> aVar, p<? super C4889m, ? super Integer, C16807N> pVar, androidx.compose.ui.d dVar, boolean z11, p<? super C4889m, ? super Integer, C16807N> pVar2, boolean z12, C4731h0 h0Var, r0.m mVar, int i10, int i11) {
            super(2);
            this.f10996c = m10;
            this.f10997d = z10;
            this.f10998e = aVar;
            this.f10999f = pVar;
            this.f11000g = dVar;
            this.f11001h = z11;
            this.f11002i = pVar2;
            this.f11003j = z12;
            this.f11004k = h0Var;
            this.f11005l = mVar;
            this.f11006m = i10;
            this.f11007n = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4735j0.b(this.f10996c, this.f10997d, this.f10998e, this.f10999f, this.f11000g, this.f11001h, this.f11002i, this.f11003j, this.f11004k, this.f11005l, mVar, M0.a(this.f11006m | 1), this.f11007n);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j0$h */
    static final class h extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4731h0 f11008c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f11009d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f11010e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11011f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f11012g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11013h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.j0$h$a */
        static final class a extends C17544u implements C17642l<x, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f11014c = new a();

            a() {
                super(1);
            }

            public final void a(x xVar) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((x) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C4731h0 h0Var, boolean z10, boolean z11, p<? super C4889m, ? super Integer, C16807N> pVar, boolean z12, p<? super C4889m, ? super Integer, C16807N> pVar2) {
            super(2);
            this.f11008c = h0Var;
            this.f11009d = z10;
            this.f11010e = z11;
            this.f11011f = pVar;
            this.f11012g = z12;
            this.f11013h = pVar2;
        }

        private static final long b(A1<C5747v0> a12) {
            return a12.getValue().y();
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1419576100, i10, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:186)");
                }
                A1<C5747v0> a10 = u.a(this.f11008c.c(this.f11009d, this.f11010e), C5548j.j(100, 0, (C5525D) null, 6, (Object) null), (String) null, (C17642l<? super C5747v0, C16807N>) null, mVar, 48, 12);
                androidx.compose.ui.d a11 = (this.f11011f == null || (!this.f11012g && !this.f11009d)) ? androidx.compose.ui.d.f18749a : o.a(androidx.compose.ui.d.f18749a, a.f11014c);
                p<C4889m, Integer, C16807N> pVar = this.f11013h;
                I h10 = C5077h.h(C5437c.f24302a.o(), false);
                int a12 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, a11);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a13 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a13);
                } else {
                    mVar.t();
                }
                C4889m a14 = F1.a(mVar);
                F1.c(a14, h10, aVar.c());
                F1.c(a14, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.w(Integer.valueOf(a12), b10);
                }
                F1.c(a14, e10, aVar.d());
                C5079j jVar = C5079j.f18125a;
                C4910x.a(E.a().d(C5747v0.k(b(a10))), pVar, mVar, J0.f13770i);
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
    /* renamed from: O0.j0$i */
    static final class i extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4731h0 f11015c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f11016d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f11017e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11018f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C4731h0 h0Var, boolean z10, boolean z11, p<? super C4889m, ? super Integer, C16807N> pVar) {
            super(2);
            this.f11015c = h0Var;
            this.f11016d = z10;
            this.f11017e = z11;
            this.f11018f = pVar;
        }

        private static final long b(A1<C5747v0> a12) {
            return a12.getValue().y();
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1644987592, i10, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:201)");
                }
                s.a(b(u.a(this.f11015c.d(this.f11016d, this.f11017e), C5548j.j(100, 0, (C5525D) null, 6, (Object) null), (String) null, (C17642l<? super C5747v0, C16807N>) null, mVar, 48, 12)), j1.c(S0.n.f12987a.l(), mVar, 6), this.f11018f, mVar, 0);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "LXH/N;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j0$j */
    static final class j extends C17544u implements C17642l<androidx.compose.ui.graphics.c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f11019c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f11020d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(boolean z10, C17631a<Float> aVar) {
            super(1);
            this.f11019c = z10;
            this.f11020d = aVar;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            cVar.d(this.f11019c ? 1.0f : this.f11020d.invoke().floatValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j0$k */
    static final class k implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f11021a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11022b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f11023c;

        k(C17631a<Float> aVar, p<? super C4889m, ? super Integer, C16807N> pVar, boolean z10) {
            this.f11021a = aVar;
            this.f11022b = pVar;
            this.f11023c = z10;
        }

        public final E1.J i(K k10, List<? extends H> list, long j10) {
            Object obj;
            a0 a0Var;
            K k11 = k10;
            List<? extends H> list2 = list;
            float floatValue = this.f11021a.invoke().floatValue();
            long d10 = C5267b.d(j10, 0, 0, 0, 0, 10, (Object) null);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                H h10 = (H) list2.get(i10);
                if (C17542s.e(androidx.compose.ui.layout.a.a(h10), "icon")) {
                    a0 i02 = h10.i0(d10);
                    float f10 = (float) 2;
                    int E02 = i02.E0() + k11.K0(c2.h.B(C4735j0.f10977d * f10));
                    int e10 = C17752b.e(((float) E02) * floatValue);
                    int z02 = i02.z0() + k11.K0(c2.h.B(C4735j0.l() * f10));
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        H h11 = (H) list2.get(i11);
                        if (C17542s.e(androidx.compose.ui.layout.a.a(h11), "indicatorRipple")) {
                            a0 i03 = h11.i0(C5267b.f23024b.c(E02, z02));
                            int size3 = list.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size3) {
                                    obj = null;
                                    break;
                                }
                                obj = list2.get(i12);
                                if (C17542s.e(androidx.compose.ui.layout.a.a((H) obj), "indicator")) {
                                    break;
                                }
                                i12++;
                            }
                            H h12 = (H) obj;
                            a0 i04 = h12 != null ? h12.i0(C5267b.f23024b.c(e10, z02)) : null;
                            if (this.f11022b != null) {
                                int size4 = list.size();
                                int i13 = 0;
                                while (i13 < size4) {
                                    H h13 = (H) list2.get(i13);
                                    if (C17542s.e(androidx.compose.ui.layout.a.a(h13), "label")) {
                                        a0Var = h13.i0(d10);
                                    } else {
                                        i13++;
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            a0Var = null;
                            if (this.f11022b == null) {
                                return C4735j0.n(k10, i02, i03, i04, j10);
                            }
                            C17542s.g(a0Var);
                            return C4735j0.o(k10, a0Var, i02, i03, i04, j10, this.f11023c, floatValue);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.j0$l */
    static final class l extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11024c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11025d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11026e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11027f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f11028g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f11029h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f11030i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, boolean z10, C17631a<Float> aVar, int i10) {
            super(2);
            this.f11024c = pVar;
            this.f11025d = pVar2;
            this.f11026e = pVar3;
            this.f11027f = pVar4;
            this.f11028g = z10;
            this.f11029h = aVar;
            this.f11030i = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C4735j0.e(this.f11024c, this.f11025d, this.f11026e, this.f11027f, this.f11028g, this.f11029h, mVar, M0.a(this.f11030i | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j0$m */
    static final class m extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f11031c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a0 f11032d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f11033e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f11034f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a0 f11035g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f11036h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f11037i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f11038j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f11039k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a0 a0Var, a0 a0Var2, int i10, int i11, a0 a0Var3, int i12, int i13, int i14, int i15) {
            super(1);
            this.f11031c = a0Var;
            this.f11032d = a0Var2;
            this.f11033e = i10;
            this.f11034f = i11;
            this.f11035g = a0Var3;
            this.f11036h = i12;
            this.f11037i = i13;
            this.f11038j = i14;
            this.f11039k = i15;
        }

        public final void a(a0.a aVar) {
            a0 a0Var = this.f11031c;
            if (a0Var != null) {
                int i10 = this.f11038j;
                int i11 = this.f11039k;
                a0.a.m(aVar, a0Var, (i10 - a0Var.E0()) / 2, (i11 - a0Var.z0()) / 2, 0.0f, 4, (Object) null);
            }
            a0.a.m(aVar, this.f11032d, this.f11033e, this.f11034f, 0.0f, 4, (Object) null);
            a0.a.m(aVar, this.f11035g, this.f11036h, this.f11037i, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j0$n */
    static final class n extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f11040c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f11041d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f11042e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a0 f11043f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f11044g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f11045h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f11046i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ a0 f11047j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f11048k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ float f11049l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a0 f11050m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f11051n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ float f11052o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f11053p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ K f11054q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a0 a0Var, boolean z10, float f10, a0 a0Var2, int i10, float f11, float f12, a0 a0Var3, int i11, float f13, a0 a0Var4, int i12, float f14, int i13, K k10) {
            super(1);
            this.f11040c = a0Var;
            this.f11041d = z10;
            this.f11042e = f10;
            this.f11043f = a0Var2;
            this.f11044g = i10;
            this.f11045h = f11;
            this.f11046i = f12;
            this.f11047j = a0Var3;
            this.f11048k = i11;
            this.f11049l = f13;
            this.f11050m = a0Var4;
            this.f11051n = i12;
            this.f11052o = f14;
            this.f11053p = i13;
            this.f11054q = k10;
        }

        public final void a(a0.a aVar) {
            a0 a0Var = this.f11040c;
            if (a0Var != null) {
                int i10 = this.f11053p;
                float f10 = this.f11049l;
                K k10 = this.f11054q;
                float f11 = this.f11046i;
                a0.a.m(aVar, a0Var, (i10 - a0Var.E0()) / 2, C17752b.e((f10 - ((float) k10.K0(C4735j0.l()))) + f11), 0.0f, 4, (Object) null);
            }
            if (this.f11041d || this.f11042e != 0.0f) {
                a0.a.m(aVar, this.f11043f, this.f11044g, C17752b.e(this.f11045h + this.f11046i), 0.0f, 4, (Object) null);
            }
            a0.a.m(aVar, this.f11047j, this.f11048k, C17752b.e(this.f11049l + this.f11046i), 0.0f, 4, (Object) null);
            a0.a.m(aVar, this.f11050m, this.f11051n, C17752b.e(this.f11052o + this.f11046i), 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    static {
        S0.n nVar = S0.n.f12987a;
        f10974a = nVar.h();
        float f10 = (float) 2;
        f10977d = c2.h.B(c2.h.B(nVar.e() - nVar.i()) / f10);
        f10978e = c2.h.B(c2.h.B(nVar.c() - nVar.i()) / f10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.d r25, long r26, long r28, float r30, s0.C5848T r31, nI.q<? super s0.C5842M, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r32, U0.C4889m r33, int r34, int r35) {
        /*
            r8 = r32
            r9 = r34
            r0 = 1596802123(0x5f2d444b, float:1.2485187E19)
            r1 = r33
            U0.m r1 = r1.k(r0)
            r2 = r35 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r9 | 6
            r4 = r3
            r3 = r25
            goto L_0x002b
        L_0x0017:
            r3 = r9 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r25
            boolean r4 = r1.V(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r9
            goto L_0x002b
        L_0x0028:
            r3 = r25
            r4 = r9
        L_0x002b:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0044
            r5 = r35 & 2
            if (r5 != 0) goto L_0x003e
            r5 = r26
            boolean r7 = r1.e(r5)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x003e:
            r5 = r26
        L_0x0040:
            r7 = 16
        L_0x0042:
            r4 = r4 | r7
            goto L_0x0046
        L_0x0044:
            r5 = r26
        L_0x0046:
            r7 = r9 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005d
            r7 = r35 & 4
            r10 = r28
            if (r7 != 0) goto L_0x0059
            boolean r7 = r1.e(r10)
            if (r7 == 0) goto L_0x0059
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r7
            goto L_0x005f
        L_0x005d:
            r10 = r28
        L_0x005f:
            r7 = r35 & 8
            if (r7 == 0) goto L_0x0068
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r12 = r30
            goto L_0x007a
        L_0x0068:
            r12 = r9 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0065
            r12 = r30
            boolean r13 = r1.c(r12)
            if (r13 == 0) goto L_0x0077
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r13
        L_0x007a:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0093
            r13 = r35 & 16
            if (r13 != 0) goto L_0x008d
            r13 = r31
            boolean r14 = r1.V(r13)
            if (r14 == 0) goto L_0x008f
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008d:
            r13 = r31
        L_0x008f:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r4 = r4 | r14
            goto L_0x0095
        L_0x0093:
            r13 = r31
        L_0x0095:
            r14 = r35 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009d
            r4 = r4 | r15
            goto L_0x00ad
        L_0x009d:
            r14 = r9 & r15
            if (r14 != 0) goto L_0x00ad
            boolean r14 = r1.F(r8)
            if (r14 == 0) goto L_0x00aa
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r4 = r4 | r14
        L_0x00ad:
            r14 = 74899(0x12493, float:1.04956E-40)
            r14 = r14 & r4
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00c4
            boolean r14 = r1.l()
            if (r14 != 0) goto L_0x00bd
            goto L_0x00c4
        L_0x00bd:
            r1.L()
            r2 = r3
            r7 = r12
            goto L_0x017b
        L_0x00c4:
            r1.G()
            r14 = r9 & 1
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            if (r14 == 0) goto L_0x00f2
            boolean r14 = r1.O()
            if (r14 == 0) goto L_0x00d5
            goto L_0x00f2
        L_0x00d5:
            r1.L()
            r2 = r35 & 2
            if (r2 == 0) goto L_0x00de
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00de:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x00e4
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00e4:
            r2 = r35 & 16
            if (r2 == 0) goto L_0x00e9
            r4 = r4 & r15
        L_0x00e9:
            r2 = r3
        L_0x00ea:
            r7 = r12
            r14 = r13
        L_0x00ec:
            r23 = r10
            r10 = r4
            r3 = r23
            goto L_0x012d
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x00f8
        L_0x00f7:
            r2 = r3
        L_0x00f8:
            r3 = r35 & 2
            r14 = 6
            if (r3 == 0) goto L_0x0105
            O0.g0 r3 = O0.C4729g0.f10783a
            long r5 = r3.a(r1, r14)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0105:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x0116
            O0.X r3 = O0.X.f10101a
            O0.t r3 = r3.a(r1, r14)
            long r10 = O0.C4755u.b(r3, r5)
            r3 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r3
        L_0x0116:
            if (r7 == 0) goto L_0x011f
            O0.g0 r3 = O0.C4729g0.f10783a
            float r3 = r3.b()
            r12 = r3
        L_0x011f:
            r3 = r35 & 16
            if (r3 == 0) goto L_0x00ea
            O0.g0 r3 = O0.C4729g0.f10783a
            s0.T r3 = r3.c(r1, r14)
            r4 = r4 & r15
            r14 = r3
            r7 = r12
            goto L_0x00ec
        L_0x012d:
            r1.y()
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x013c
            r11 = -1
            java.lang.String r12 = "androidx.compose.material3.NavigationBar (NavigationBar.kt:116)"
            U0.C4895p.S(r0, r10, r11, r12)
        L_0x013c:
            O0.j0$a r0 = new O0.j0$a
            r0.<init>(r14, r8)
            r11 = 54
            r12 = 105663120(0x64c4a90, float:3.8422915E-35)
            r13 = 1
            c1.a r19 = c1.c.e(r12, r13, r0, r1, r11)
            r0 = r10 & 14
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r11
            int r10 = r10 << 3
            r11 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 | r11
            r11 = r10 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r11
            r21 = r0 | r10
            r22 = 98
            r11 = 0
            r17 = 0
            r18 = 0
            r10 = r2
            r12 = r5
            r0 = r14
            r14 = r3
            r16 = r7
            r20 = r1
            O0.P0.a(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22)
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x0179
            U0.C4895p.R()
        L_0x0179:
            r13 = r0
            r10 = r3
        L_0x017b:
            U0.Y0 r12 = r1.n()
            if (r12 == 0) goto L_0x0195
            O0.j0$b r14 = new O0.j0$b
            r0 = r14
            r1 = r2
            r2 = r5
            r4 = r10
            r6 = r7
            r7 = r13
            r8 = r32
            r9 = r34
            r10 = r35
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10)
            r12.a(r14)
        L_0x0195:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4735j0.a(androidx.compose.ui.d, long, long, float, s0.T, nI.q, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(s0.C5842M r28, boolean r29, nI.C17631a<XH.C16807N> r30, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r31, androidx.compose.ui.d r32, boolean r33, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r34, boolean r35, O0.C4731h0 r36, r0.m r37, U0.C4889m r38, int r39, int r40) {
        /*
            r2 = r29
            r11 = r39
            r12 = r40
            r1 = 16
            r3 = 32
            r4 = 4
            r5 = 1
            r6 = 6
            r7 = 128(0x80, float:1.794E-43)
            r8 = -663510974(0xffffffffd873a042, float:-1.07147851E15)
            r9 = r38
            U0.m r9 = r9.k(r8)
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 & r12
            r15 = 2
            if (r10 == 0) goto L_0x0024
            r10 = r11 | 6
            r13 = r10
            r10 = r28
            goto L_0x0038
        L_0x0024:
            r10 = r11 & 6
            if (r10 != 0) goto L_0x0035
            r10 = r28
            boolean r13 = r9.V(r10)
            if (r13 == 0) goto L_0x0032
            r13 = r4
            goto L_0x0033
        L_0x0032:
            r13 = r15
        L_0x0033:
            r13 = r13 | r11
            goto L_0x0038
        L_0x0035:
            r10 = r28
            r13 = r11
        L_0x0038:
            r14 = r12 & 1
            if (r14 == 0) goto L_0x003f
            r13 = r13 | 48
            goto L_0x004d
        L_0x003f:
            r14 = r11 & 48
            if (r14 != 0) goto L_0x004d
            boolean r14 = r9.b(r2)
            if (r14 == 0) goto L_0x004b
            r14 = r3
            goto L_0x004c
        L_0x004b:
            r14 = r1
        L_0x004c:
            r13 = r13 | r14
        L_0x004d:
            r14 = r12 & 2
            if (r14 == 0) goto L_0x0056
            r13 = r13 | 384(0x180, float:5.38E-43)
        L_0x0053:
            r14 = r30
            goto L_0x0069
        L_0x0056:
            r14 = r11 & 384(0x180, float:5.38E-43)
            if (r14 != 0) goto L_0x0053
            r14 = r30
            boolean r16 = r9.F(r14)
            if (r16 == 0) goto L_0x0065
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r16 = r7
        L_0x0067:
            r13 = r13 | r16
        L_0x0069:
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0071
            r13 = r13 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r4 = r31
            goto L_0x0084
        L_0x0071:
            r4 = r11 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x006e
            r4 = r31
            boolean r16 = r9.F(r4)
            if (r16 == 0) goto L_0x0080
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r13 = r13 | r16
        L_0x0084:
            r16 = r12 & 8
            if (r16 == 0) goto L_0x008d
            r13 = r13 | 24576(0x6000, float:3.4438E-41)
        L_0x008a:
            r15 = r32
            goto L_0x00a0
        L_0x008d:
            r15 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x008a
            r15 = r32
            boolean r18 = r9.V(r15)
            if (r18 == 0) goto L_0x009c
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r13 = r13 | r18
        L_0x00a0:
            r1 = r1 & r12
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x00aa
            r13 = r13 | r18
            r8 = r33
            goto L_0x00bd
        L_0x00aa:
            r18 = r11 & r18
            r8 = r33
            if (r18 != 0) goto L_0x00bd
            boolean r19 = r9.b(r8)
            if (r19 == 0) goto L_0x00b9
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r13 = r13 | r19
        L_0x00bd:
            r3 = r3 & r12
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r3 == 0) goto L_0x00c7
            r13 = r13 | r19
            r6 = r34
            goto L_0x00da
        L_0x00c7:
            r19 = r11 & r19
            r6 = r34
            if (r19 != 0) goto L_0x00da
            boolean r20 = r9.F(r6)
            if (r20 == 0) goto L_0x00d6
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r13 = r13 | r20
        L_0x00da:
            r20 = r12 & 64
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            if (r20 == 0) goto L_0x00e5
            r13 = r13 | r21
            r5 = r35
            goto L_0x00f8
        L_0x00e5:
            r21 = r11 & r21
            r5 = r35
            if (r21 != 0) goto L_0x00f8
            boolean r22 = r9.b(r5)
            if (r22 == 0) goto L_0x00f4
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f4:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r13 = r13 | r22
        L_0x00f8:
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            r22 = r11 & r22
            if (r22 != 0) goto L_0x0116
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x010d
            r0 = r36
            boolean r23 = r9.V(r0)
            if (r23 == 0) goto L_0x010f
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0111
        L_0x010d:
            r0 = r36
        L_0x010f:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0111:
            r13 = r13 | r23
        L_0x0113:
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0119
        L_0x0116:
            r0 = r36
            goto L_0x0113
        L_0x0119:
            r7 = r7 & r12
            r23 = 805306368(0x30000000, float:4.656613E-10)
            if (r7 == 0) goto L_0x0123
            r13 = r13 | r23
            r0 = r37
            goto L_0x0136
        L_0x0123:
            r23 = r11 & r23
            r0 = r37
            if (r23 != 0) goto L_0x0136
            boolean r23 = r9.V(r0)
            if (r23 == 0) goto L_0x0132
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0134
        L_0x0132:
            r23 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0134:
            r13 = r13 | r23
        L_0x0136:
            r23 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r13 & r23
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r4) goto L_0x0154
            boolean r0 = r9.l()
            if (r0 != 0) goto L_0x0147
            goto L_0x0154
        L_0x0147:
            r9.L()
            r10 = r36
            r22 = r37
            r7 = r6
            r6 = r8
            r8 = r5
            r5 = r15
            goto L_0x03bd
        L_0x0154:
            r9.G()
            r0 = 1
            r4 = r11 & 1
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r4 == 0) goto L_0x0177
            boolean r4 = r9.O()
            if (r4 == 0) goto L_0x0166
            goto L_0x0177
        L_0x0166:
            r9.L()
            r1 = 128(0x80, float:1.794E-43)
            r1 = r1 & r12
            if (r1 == 0) goto L_0x016f
            r13 = r13 & r0
        L_0x016f:
            r4 = r32
            r1 = r36
        L_0x0173:
            r0 = r37
            r3 = r13
            goto L_0x019b
        L_0x0177:
            if (r16 == 0) goto L_0x017c
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x017e
        L_0x017c:
            r4 = r32
        L_0x017e:
            if (r1 == 0) goto L_0x0181
            r8 = 1
        L_0x0181:
            if (r3 == 0) goto L_0x0184
            r6 = 0
        L_0x0184:
            r1 = 128(0x80, float:1.794E-43)
            if (r20 == 0) goto L_0x0189
            r5 = 1
        L_0x0189:
            r1 = r1 & r12
            if (r1 == 0) goto L_0x0195
            O0.i0 r1 = O0.C4733i0.f10846a
            r3 = 6
            O0.h0 r1 = r1.a(r9, r3)
            r13 = r13 & r0
            goto L_0x0197
        L_0x0195:
            r1 = r36
        L_0x0197:
            if (r7 == 0) goto L_0x0173
            r3 = r13
            r0 = 0
        L_0x019b:
            r9.y()
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x01ad
            r7 = -1
            java.lang.String r13 = "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)"
            r15 = -663510974(0xffffffffd873a042, float:-1.07147851E15)
            U0.C4895p.S(r15, r3, r7, r13)
        L_0x01ad:
            r7 = -103235253(0xfffffffff9d8c14b, float:-1.4068207E35)
            r9.W(r7)
            if (r0 != 0) goto L_0x01cb
            java.lang.Object r7 = r9.D()
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r13 = r13.a()
            if (r7 != r13) goto L_0x01c8
            r0.m r7 = r0.l.a()
            r9.u(r7)
        L_0x01c8:
            r0.m r7 = (r0.m) r7
            goto L_0x01cc
        L_0x01cb:
            r7 = r0
        L_0x01cc:
            r9.P()
            O0.j0$h r13 = new O0.j0$h
            r32 = r13
            r33 = r1
            r34 = r29
            r35 = r8
            r36 = r6
            r37 = r5
            r38 = r31
            r32.<init>(r33, r34, r35, r36, r37, r38)
            r15 = -1419576100(0xffffffffab62fcdc, float:-8.064224E-13)
            r22 = r0
            r0 = 54
            r10 = 1
            c1.a r23 = c1.c.e(r15, r10, r13, r9, r0)
            r13 = -103209106(0xfffffffff9d9276e, float:-1.4094102E35)
            r9.W(r13)
            if (r6 != 0) goto L_0x01f8
            r10 = 0
            goto L_0x0205
        L_0x01f8:
            O0.j0$i r13 = new O0.j0$i
            r13.<init>(r1, r2, r8, r6)
            r15 = 1644987592(0x620c84c8, float:6.48028E20)
            c1.a r13 = c1.c.e(r15, r10, r13, r9, r0)
            r10 = r13
        L_0x0205:
            r9.P()
            java.lang.Object r13 = r9.D()
            U0.m$a r24 = U0.C4889m.f14007a
            java.lang.Object r15 = r24.a()
            r0 = 0
            if (r13 != r15) goto L_0x021c
            U0.o0 r13 = U0.C4877g1.a(r0)
            r9.u(r13)
        L_0x021c:
            r15 = r13
            U0.o0 r15 = (U0.C4894o0) r15
            L1.i$a r13 = L1.i.f8936b
            int r13 = r13.g()
            r18 = 0
            L1.i r13 = L1.i.h(r13)
            r32 = r4
            r33 = r29
            r34 = r7
            r35 = r18
            r36 = r8
            r37 = r13
            r38 = r30
            androidx.compose.ui.d r13 = androidx.compose.foundation.selection.a.a(r32, r33, r34, r35, r36, r37, r38)
            float r0 = f10974a
            r25 = r4
            r4 = 0
            r26 = r6
            r27 = r8
            r6 = 0
            r8 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.b(r13, r4, r0, r8, r6)
            r6 = 2
            r8 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r32 = r28
            r33 = r0
            r34 = r13
            r35 = r18
            r36 = r6
            r37 = r8
            androidx.compose.ui.d r0 = s0.C5842M.e(r32, r33, r34, r35, r36, r37)
            java.lang.Object r6 = r9.D()
            java.lang.Object r8 = r24.a()
            if (r6 != r8) goto L_0x0274
            O0.j0$c r6 = new O0.j0$c
            r6.<init>(r15)
            r9.u(r6)
        L_0x0274:
            nI.l r6 = (nI.C17642l) r6
            androidx.compose.ui.d r0 = androidx.compose.ui.layout.g.a(r0, r6)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c r6 = r6.e()
            r8 = 1
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r8)
            r8 = 0
            int r13 = U0.C4883j.a(r9, r8)
            U0.y r8 = r9.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r9, r0)
            G1.g$a r18 = G1.C4504g.f6515W
            nI.a r4 = r18.a()
            U0.f r20 = r9.m()
            if (r20 != 0) goto L_0x02a1
            U0.C4883j.c()
        L_0x02a1:
            r9.I()
            boolean r20 = r9.i()
            if (r20 == 0) goto L_0x02ae
            r9.p(r4)
            goto L_0x02b1
        L_0x02ae:
            r9.t()
        L_0x02b1:
            U0.m r4 = U0.F1.a(r9)
            nI.p r11 = r18.c()
            U0.F1.c(r4, r6, r11)
            nI.p r6 = r18.e()
            U0.F1.c(r4, r8, r6)
            nI.p r6 = r18.b()
            boolean r8 = r4.i()
            if (r8 != 0) goto L_0x02db
            java.lang.Object r8 = r4.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x02e9
        L_0x02db:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r4.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r4.w(r8, r6)
        L_0x02e9:
            nI.p r6 = r18.d()
            U0.F1.c(r4, r0, r6)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            if (r2 == 0) goto L_0x02f8
            r0 = 1065353216(0x3f800000, float:1.0)
            r13 = r0
            goto L_0x02f9
        L_0x02f8:
            r13 = 0
        L_0x02f9:
            r0 = 100
            r4 = 0
            r6 = 0
            r8 = 6
            m0.y0 r0 = m0.C5548j.j(r0, r6, r4, r8, r4)
            r19 = 48
            r20 = 28
            r6 = 0
            r16 = 0
            r8 = 0
            r14 = r0
            r11 = r15
            r0 = 2
            r15 = r6
            r17 = r8
            r18 = r9
            U0.A1 r6 = m0.C5534c.d(r13, r14, r15, r16, r17, r18, r19, r20)
            U0.I0 r8 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r8 = r9.Q(r8)
            c2.d r8 = (c2.d) r8
            S0.n r13 = S0.n.f12987a
            float r13 = r13.e()
            int r13 = r8.K0(r13)
            int r11 = c(r11)
            int r11 = r11 - r13
            float r11 = (float) r11
            float r0 = (float) r0
            float r11 = r11 / r0
            float r0 = f10979f
            float r0 = r8.H1(r0)
            long r13 = o1.C5668h.a(r11, r0)
            XH.N r0 = XH.C16807N.f139792a
            boolean r0 = r9.V(r7)
            boolean r8 = r9.e(r13)
            r0 = r0 | r8
            java.lang.Object r8 = r9.D()
            if (r0 != 0) goto L_0x0353
            java.lang.Object r0 = r24.a()
            if (r8 != r0) goto L_0x035b
        L_0x0353:
            Q0.n r8 = new Q0.n
            r8.<init>(r7, r13, r4)
            r9.u(r8)
        L_0x035b:
            Q0.n r8 = (Q0.n) r8
            O0.j0$f r0 = new O0.j0$f
            r0.<init>(r8)
            r4 = 691730997(0x293afa35, float:4.1517317E-14)
            r7 = 54
            r8 = 1
            c1.a r13 = c1.c.e(r4, r8, r0, r9, r7)
            O0.j0$e r0 = new O0.j0$e
            r0.<init>(r6, r1)
            r4 = -474426875(0xffffffffe3b8d205, float:-6.818669E21)
            c1.a r14 = c1.c.e(r4, r8, r0, r9, r7)
            boolean r0 = r9.V(r6)
            java.lang.Object r4 = r9.D()
            if (r0 != 0) goto L_0x0388
            java.lang.Object r0 = r24.a()
            if (r4 != r0) goto L_0x0390
        L_0x0388:
            O0.j0$d r4 = new O0.j0$d
            r4.<init>(r6)
            r9.u(r4)
        L_0x0390:
            r18 = r4
            nI.a r18 = (nI.C17631a) r18
            int r0 = r3 >> 9
            r3 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r3
            r0 = r0 | 438(0x1b6, float:6.14E-43)
            r15 = r23
            r16 = r10
            r17 = r5
            r19 = r9
            r20 = r0
            e(r13, r14, r15, r16, r17, r18, r19, r20)
            r9.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x03b5
            U0.C4895p.R()
        L_0x03b5:
            r10 = r1
            r8 = r5
            r5 = r25
            r7 = r26
            r6 = r27
        L_0x03bd:
            U0.Y0 r13 = r9.n()
            if (r13 == 0) goto L_0x03db
            O0.j0$g r14 = new O0.j0$g
            r0 = r14
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r9 = r10
            r10 = r22
            r11 = r39
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x03db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4735j0.b(s0.M, boolean, nI.a, nI.p, androidx.compose.ui.d, boolean, nI.p, boolean, O0.h0, r0.m, U0.m, int, int):void");
    }

    private static final int c(C4894o0 o0Var) {
        return o0Var.e();
    }

    /* access modifiers changed from: private */
    public static final void d(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final void e(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, boolean z10, C17631a<Float> aVar, C4889m mVar, int i10) {
        int i11;
        boolean z11;
        int i12;
        p<? super C4889m, ? super Integer, C16807N> pVar5 = pVar;
        p<? super C4889m, ? super Integer, C16807N> pVar6 = pVar2;
        p<? super C4889m, ? super Integer, C16807N> pVar7 = pVar3;
        p<? super C4889m, ? super Integer, C16807N> pVar8 = pVar4;
        boolean z12 = z10;
        C17631a<Float> aVar2 = aVar;
        int i13 = i10;
        C4889m k10 = mVar.k(-1427075886);
        if ((i13 & 6) == 0) {
            i11 = (k10.F(pVar5) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.F(pVar6) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(pVar7) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i11 |= k10.F(pVar8) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i11 |= k10.b(z12) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i11 |= k10.F(aVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i11) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1427075886, i11, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:516)");
            }
            int i14 = 458752 & i11;
            int i15 = 57344 & i11;
            boolean z13 = (i14 == 131072) | ((i11 & 7168) == 2048) | (i15 == 16384);
            Object D10 = k10.D();
            if (z13 || D10 == C4889m.f14007a.a()) {
                D10 = new k(aVar2, pVar8, z12);
                k10.u(D10);
            }
            I i16 = (I) D10;
            d.a aVar3 = androidx.compose.ui.d.f18749a;
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar3);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar4.a();
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
            F1.c(a12, i16, aVar4.c());
            F1.c(a12, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b10 = aVar4.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar4.d());
            pVar5.invoke(k10, Integer.valueOf(i11 & 14));
            pVar6.invoke(k10, Integer.valueOf((i11 >> 3) & 14));
            androidx.compose.ui.d b11 = androidx.compose.ui.layout.a.b(aVar3, "icon");
            C5437c.a aVar5 = C5437c.f24302a;
            I h10 = C5077h.h(aVar5.o(), false);
            int a13 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, b11);
            C17631a<C4504g> a14 = aVar4.a();
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
            F1.c(a15, h10, aVar4.c());
            F1.c(a15, s11, aVar4.e());
            p<C4504g, Integer, C16807N> b12 = aVar4.b();
            if (a15.i() || !C17542s.e(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.w(Integer.valueOf(a13), b12);
            }
            F1.c(a15, e11, aVar4.d());
            C5079j jVar = C5079j.f18125a;
            pVar7.invoke(k10, Integer.valueOf((i11 >> 6) & 14));
            k10.x();
            k10.W(1087198243);
            if (pVar8 != null) {
                androidx.compose.ui.d b13 = androidx.compose.ui.layout.a.b(aVar3, "label");
                if (i15 == 16384) {
                    i12 = 131072;
                    z11 = true;
                } else {
                    i12 = 131072;
                    z11 = false;
                }
                boolean z14 = z11 | (i14 == i12);
                Object D11 = k10.D();
                if (z14 || D11 == C4889m.f14007a.a()) {
                    D11 = new j(z12, aVar2);
                    k10.u(D11);
                }
                androidx.compose.ui.d k11 = D.k(androidx.compose.ui.graphics.b.a(b13, (C17642l) D11), c2.h.B(f10975b / ((float) 2)), 0.0f, 2, (Object) null);
                I h11 = C5077h.h(aVar5.o(), false);
                int a16 = C4883j.a(k10, 0);
                C4912y s12 = k10.s();
                androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, k11);
                C17631a<C4504g> a17 = aVar4.a();
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
                F1.c(a18, h11, aVar4.c());
                F1.c(a18, s12, aVar4.e());
                p<C4504g, Integer, C16807N> b14 = aVar4.b();
                if (a18.i() || !C17542s.e(a18.D(), Integer.valueOf(a16))) {
                    a18.u(Integer.valueOf(a16));
                    a18.w(Integer.valueOf(a16), b14);
                }
                F1.c(a18, e12, aVar4.d());
                pVar8.invoke(k10, Integer.valueOf((i11 >> 9) & 14));
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
            n10.a(new l(pVar, pVar2, pVar3, pVar4, z10, aVar, i10));
        }
    }

    public static final float l() {
        return f10978e;
    }

    public static final float m() {
        return f10975b;
    }

    /* access modifiers changed from: private */
    public static final E1.J n(K k10, a0 a0Var, a0 a0Var2, a0 a0Var3, long j10) {
        int l10 = C5267b.l(j10);
        K k11 = k10;
        int h10 = c2.c.h(j10, k10.K0(f10974a));
        return K.v0(k10, l10, h10, (Map) null, new m(a0Var3, a0Var, (l10 - a0Var.E0()) / 2, (h10 - a0Var.z0()) / 2, a0Var2, (l10 - a0Var2.E0()) / 2, (h10 - a0Var2.z0()) / 2, l10, h10), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final E1.J o(K k10, a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4, long j10, boolean z10, float f10) {
        K k11 = k10;
        float f11 = f10978e;
        float z02 = ((float) a0Var2.z0()) + k11.H1(f11);
        float f12 = f10976c;
        float H12 = z02 + k11.H1(f12) + ((float) a0Var.z0());
        float f13 = (float) 2;
        float d10 = C17978n.d((((float) C5267b.m(j10)) - H12) / f13, k11.H1(f11));
        float f14 = H12 + (d10 * f13);
        float z03 = ((z10 ? d10 : (f14 - ((float) a0Var2.z0())) / f13) - d10) * (((float) 1) - f10);
        float z04 = ((float) a0Var2.z0()) + d10 + k11.H1(f11) + k11.H1(f12);
        int l10 = C5267b.l(j10);
        return K.v0(k10, l10, C17752b.e(f14), (Map) null, new n(a0Var4, z10, f10, a0Var, (l10 - a0Var.E0()) / 2, z04, z03, a0Var2, (l10 - a0Var2.E0()) / 2, d10, a0Var3, (l10 - a0Var3.E0()) / 2, d10 - k11.H1(f11), l10, k10), 4, (Object) null);
    }
}
