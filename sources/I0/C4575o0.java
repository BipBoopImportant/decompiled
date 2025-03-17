package I0;

import E1.I;
import E1.a0;
import G1.C4504g;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import androidx.recyclerview.widget.RecyclerView;
import c2.C5267b;
import c2.h;
import c2.n;
import c2.t;
import c2.w;
import com.google.ar.core.ImageMetadata;
import e2.C5295b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5673m;
import p1.C5745u0;
import pI.C17752b;
import r1.C5817c;
import s0.C5834E;
import tI.C17978n;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a¥\u0001\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0017\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aZ\u0010!\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aZ\u0010(\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010\"\u001a\u0001\u00105\u001a\u00020\u0003*\u00020)2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010.\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u00010,2\b\u00101\u001a\u0004\u0018\u00010,2\u0006\u00102\u001a\u00020,2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\f2\u0006\u00104\u001a\u0002032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b5\u00106\u001a&\u00108\u001a\u00020\u0000*\u00020\u00002\u0006\u00107\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b8\u00109\"\u0014\u0010<\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010;\"\u001a\u0010B\u001a\u00020=8\u0000X\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "textField", "Lkotlin/Function1;", "placeholder", "label", "leading", "trailing", "", "singleLine", "", "animationProgress", "Lo1/m;", "onLabelMeasured", "border", "Ls0/E;", "paddingValues", "a", "(Landroidx/compose/ui/d;LnI/p;LnI/q;LnI/p;LnI/p;LnI/p;ZFLnI/l;LnI/p;Ls0/E;LU0/m;II)V", "", "from", "k", "(II)I", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "Lc2/b;", "constraints", "density", "h", "(IIIIIFJFLs0/E;)I", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "g", "LE1/a0$a;", "height", "width", "LE1/a0;", "leadingPlaceable", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "Lc2/t;", "layoutDirection", "j", "(LE1/a0$a;IILE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;FZFLc2/t;Ls0/E;)V", "labelSize", "i", "(Landroidx/compose/ui/d;JLs0/E;)Landroidx/compose/ui/d;", "Lc2/h;", "F", "OutlinedTextFieldInnerPadding", "Lc2/v;", "b", "J", "getOutlinedTextFieldTopPadding", "()J", "OutlinedTextFieldTopPadding", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: I0.o0  reason: case insensitive filesystem */
public final class C4575o0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f8265a = h.B((float) 4);

    /* renamed from: b  reason: collision with root package name */
    private static final long f8266b = w.i(8);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I0.o0$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f8267c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8268d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q<d, C4889m, Integer, C16807N> f8269e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8270f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8271g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8272h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f8273i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f8274j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17642l<C5673m, C16807N> f8275k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8276l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C5834E f8277m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f8278n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f8279o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, q<? super d, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, boolean z10, float f10, C17642l<? super C5673m, C16807N> lVar, p<? super C4889m, ? super Integer, C16807N> pVar5, C5834E e10, int i10, int i11) {
            super(2);
            this.f8267c = dVar;
            this.f8268d = pVar;
            this.f8269e = qVar;
            this.f8270f = pVar2;
            this.f8271g = pVar3;
            this.f8272h = pVar4;
            this.f8273i = z10;
            this.f8274j = f10;
            this.f8275k = lVar;
            this.f8276l = pVar5;
            this.f8277m = e10;
            this.f8278n = i10;
            this.f8279o = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4575o0.a(this.f8267c, this.f8268d, this.f8269e, this.f8270f, this.f8271g, this.f8272h, this.f8273i, this.f8274j, this.f8275k, this.f8276l, this.f8277m, mVar, M0.a(this.f8278n | 1), M0.a(this.f8279o));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/c;", "LXH/N;", "a", "(Lr1/c;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I0.o0$b */
    static final class b extends C17544u implements C17642l<C5817c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f8280c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5834E f8281d;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: I0.o0$b$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f8282a;

            static {
                int[] iArr = new int[t.values().length];
                try {
                    iArr[t.Rtl.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f8282a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(long j10, C5834E e10) {
            super(1);
            this.f8280c = j10;
            this.f8281d = e10;
        }

        public final void a(C5817c cVar) {
            float l10 = C5673m.l(this.f8280c);
            if (l10 > 0.0f) {
                float H12 = cVar.H1(C4575o0.f8265a);
                float H13 = cVar.H1(this.f8281d.c(cVar.getLayoutDirection())) - H12;
                float f10 = (float) 2;
                float f11 = l10 + H13 + (H12 * f10);
                t layoutDirection = cVar.getLayoutDirection();
                int[] iArr = a.f8282a;
                float l11 = iArr[layoutDirection.ordinal()] == 1 ? C5673m.l(cVar.b()) - f11 : C17978n.d(H13, 0.0f);
                if (iArr[cVar.getLayoutDirection().ordinal()] == 1) {
                    f11 = C5673m.l(cVar.b()) - C17978n.d(H13, 0.0f);
                }
                float f12 = f11;
                float i10 = C5673m.i(this.f8280c);
                float f13 = (-i10) / f10;
                float f14 = i10 / f10;
                int a10 = C5745u0.f27347a.a();
                r1.d I12 = cVar.I1();
                long b10 = I12.b();
                I12.e().t();
                try {
                    I12.c().c(l11, f13, f12, f14, a10);
                    cVar.V1();
                } finally {
                    I12.e().n();
                    I12.g(b10);
                }
            } else {
                cVar.V1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5817c) obj);
            return C16807N.f139792a;
        }
    }

    public static final void a(d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, q<? super d, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, boolean z10, float f10, C17642l<? super C5673m, C16807N> lVar, p<? super C4889m, ? super Integer, C16807N> pVar5, C5834E e10, C4889m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        d dVar2 = dVar;
        p<? super C4889m, ? super Integer, C16807N> pVar6 = pVar;
        q<? super d, ? super C4889m, ? super Integer, C16807N> qVar2 = qVar;
        p<? super C4889m, ? super Integer, C16807N> pVar7 = pVar2;
        p<? super C4889m, ? super Integer, C16807N> pVar8 = pVar3;
        p<? super C4889m, ? super Integer, C16807N> pVar9 = pVar4;
        boolean z11 = z10;
        float f11 = f10;
        C17642l<? super C5673m, C16807N> lVar2 = lVar;
        p<? super C4889m, ? super Integer, C16807N> pVar10 = pVar5;
        C5834E e11 = e10;
        int i15 = i10;
        C4889m k10 = mVar.k(-2049536174);
        if ((i15 & 6) == 0) {
            i12 = (k10.V(dVar2) ? 4 : 2) | i15;
        } else {
            i12 = i15;
        }
        if ((i15 & 48) == 0) {
            i12 |= k10.F(pVar6) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i12 |= k10.F(qVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i12 |= k10.F(pVar7) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i15 & 24576) == 0) {
            i12 |= k10.F(pVar8) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i12 |= k10.F(pVar9) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i15) == 0) {
            i12 |= k10.b(z11) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i15) == 0) {
            i12 |= k10.c(f11) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i12 |= k10.F(lVar2) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i12 |= k10.F(pVar10) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (k10.V(e11) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i12 & 306783379) == 306783378 && (i13 & 3) == 2 && k10.l()) {
            k10.L();
            p<? super C4889m, ? super Integer, C16807N> pVar11 = pVar7;
        } else {
            if (C4895p.J()) {
                C4895p.S(-2049536174, i12, i13, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:507)");
            }
            boolean z12 = ((i13 & 14) == 4) | ((3670016 & i12) == 1048576) | ((234881024 & i12) == 67108864) | ((29360128 & i12) == 8388608);
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new C4577p0(lVar2, z11, f11, e11);
                k10.u(D10);
            }
            C4577p0 p0Var = (C4577p0) D10;
            t tVar = (t) k10.Q(C5100f0.k());
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e12 = c.e(k10, dVar2);
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
            F1.c(a12, p0Var, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e12, aVar.d());
            pVar10.invoke(k10, Integer.valueOf((i12 >> 27) & 14));
            if (pVar8 != null) {
                k10.W(-988654503);
                d s11 = androidx.compose.ui.layout.a.b(d.f18749a, "Leading").s(W0.e());
                I h10 = C5077h.h(C5437c.f24302a.e(), false);
                int a13 = C4883j.a(k10, 0);
                C4912y s12 = k10.s();
                d e13 = c.e(k10, s11);
                C17631a<C4504g> a14 = aVar.a();
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
                F1.c(a15, h10, aVar.c());
                F1.c(a15, s12, aVar.e());
                p<C4504g, Integer, C16807N> b11 = aVar.b();
                if (a15.i() || !C17542s.e(a15.D(), Integer.valueOf(a13))) {
                    a15.u(Integer.valueOf(a13));
                    a15.w(Integer.valueOf(a13), b11);
                }
                F1.c(a15, e13, aVar.d());
                C5079j jVar = C5079j.f18125a;
                pVar8.invoke(k10, Integer.valueOf((i12 >> 12) & 14));
                k10.x();
                k10.P();
            } else {
                k10.W(-988413292);
                k10.P();
            }
            if (pVar9 != null) {
                k10.W(-988370729);
                d s13 = androidx.compose.ui.layout.a.b(d.f18749a, "Trailing").s(W0.e());
                I h11 = C5077h.h(C5437c.f24302a.e(), false);
                int a16 = C4883j.a(k10, 0);
                C4912y s14 = k10.s();
                d e14 = c.e(k10, s13);
                C17631a<C4504g> a17 = aVar.a();
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
                F1.c(a18, h11, aVar.c());
                F1.c(a18, s14, aVar.e());
                p<C4504g, Integer, C16807N> b12 = aVar.b();
                if (a18.i() || !C17542s.e(a18.D(), Integer.valueOf(a16))) {
                    a18.u(Integer.valueOf(a16));
                    a18.w(Integer.valueOf(a16), b12);
                }
                F1.c(a18, e14, aVar.d());
                C5079j jVar2 = C5079j.f18125a;
                pVar9.invoke(k10, Integer.valueOf((i12 >> 15) & 14));
                k10.x();
                k10.P();
            } else {
                k10.W(-988127596);
                k10.P();
            }
            float g10 = D.g(e11, tVar);
            float f12 = D.f(e11, tVar);
            d.a aVar2 = d.f18749a;
            if (pVar8 != null) {
                i14 = 0;
                g10 = h.B(C17978n.d(h.B(g10 - W0.d()), h.B((float) 0)));
            } else {
                i14 = 0;
            }
            float f13 = g10;
            if (pVar9 != null) {
                f12 = h.B(C17978n.d(h.B(f12 - W0.d()), h.B((float) i14)));
            }
            d m10 = D.m(aVar2, f13, 0.0f, f12, 0.0f, 10, (Object) null);
            if (qVar2 != null) {
                k10.W(-987369863);
                qVar2.invoke(androidx.compose.ui.layout.a.b(aVar2, "Hint").s(m10), k10, Integer.valueOf((i12 >> 3) & 112));
                k10.P();
            } else {
                k10.W(-987282412);
                k10.P();
            }
            d s15 = androidx.compose.ui.layout.a.b(aVar2, "TextField").s(m10);
            C5437c.a aVar3 = C5437c.f24302a;
            I h12 = C5077h.h(aVar3.o(), true);
            int a19 = C4883j.a(k10, 0);
            C4912y s16 = k10.s();
            d e15 = c.e(k10, s15);
            C17631a<C4504g> a20 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a20);
            } else {
                k10.t();
            }
            C4889m a21 = F1.a(k10);
            F1.c(a21, h12, aVar.c());
            F1.c(a21, s16, aVar.e());
            p<C4504g, Integer, C16807N> b13 = aVar.b();
            if (a21.i() || !C17542s.e(a21.D(), Integer.valueOf(a19))) {
                a21.u(Integer.valueOf(a19));
                a21.w(Integer.valueOf(a19), b13);
            }
            F1.c(a21, e15, aVar.d());
            C5079j jVar3 = C5079j.f18125a;
            pVar6.invoke(k10, Integer.valueOf((i12 >> 3) & 14));
            k10.x();
            p<? super C4889m, ? super Integer, C16807N> pVar12 = pVar2;
            if (pVar12 != null) {
                k10.W(-987052578);
                d b14 = androidx.compose.ui.layout.a.b(aVar2, "Label");
                I h13 = C5077h.h(aVar3.o(), false);
                int a22 = C4883j.a(k10, 0);
                C4912y s17 = k10.s();
                d e16 = c.e(k10, b14);
                C17631a<C4504g> a23 = aVar.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a23);
                } else {
                    k10.t();
                }
                C4889m a24 = F1.a(k10);
                F1.c(a24, h13, aVar.c());
                F1.c(a24, s17, aVar.e());
                p<C4504g, Integer, C16807N> b15 = aVar.b();
                if (a24.i() || !C17542s.e(a24.D(), Integer.valueOf(a22))) {
                    a24.u(Integer.valueOf(a22));
                    a24.w(Integer.valueOf(a22), b15);
                }
                F1.c(a24, e16, aVar.d());
                pVar12.invoke(k10, Integer.valueOf((i12 >> 9) & 14));
                k10.x();
                k10.P();
            } else {
                k10.W(-986969932);
                k10.P();
            }
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a(dVar, pVar, qVar, pVar2, pVar3, pVar4, z10, f10, lVar, pVar5, e10, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final int g(int i10, int i11, int i12, int i13, int i14, float f10, long j10, float f11, C5834E e10) {
        int max = Math.max(i12, Math.max(i14, C5295b.c(i13, 0, f10)));
        float d10 = e10.d() * f11;
        return Math.max(C5267b.m(j10), Math.max(i10, Math.max(i11, C17752b.e(C5295b.b(d10, Math.max(d10, ((float) i13) / 2.0f), f10) + ((float) max) + (e10.a() * f11)))));
    }

    /* access modifiers changed from: private */
    public static final int h(int i10, int i11, int i12, int i13, int i14, float f10, long j10, float f11, C5834E e10) {
        int max = i10 + Math.max(i12, Math.max(C5295b.c(i13, 0, f10), i14)) + i11;
        t tVar = t.Ltr;
        return Math.max(max, Math.max(C17752b.e((((float) i13) + (h.B(e10.c(tVar) + e10.b(tVar)) * f11)) * f10), C5267b.n(j10)));
    }

    public static final d i(d dVar, long j10, C5834E e10) {
        return androidx.compose.ui.draw.b.d(dVar, new b(j10, e10));
    }

    /* access modifiers changed from: private */
    public static final void j(a0.a aVar, int i10, int i11, a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4, a0 a0Var5, a0 a0Var6, float f10, boolean z10, float f11, t tVar, C5834E e10) {
        int i12 = i10;
        float f12 = f10;
        int e11 = C17752b.e(e10.d() * f11);
        int e12 = C17752b.e(D.g(e10, tVar) * f11);
        float d10 = W0.d() * f11;
        if (a0Var != null) {
            a0.a.m(aVar, a0Var, 0, C5437c.f24302a.i().a(a0Var.z0(), i10), 0.0f, 4, (Object) null);
        }
        if (a0Var2 != null) {
            a0.a.m(aVar, a0Var2, i11 - a0Var2.E0(), C5437c.f24302a.i().a(a0Var2.z0(), i10), 0.0f, 4, (Object) null);
        }
        if (a0Var4 != null) {
            a0.a.m(aVar, a0Var4, C17752b.e(a0Var == null ? 0.0f : (((float) W0.j(a0Var)) - d10) * (((float) 1) - f12)) + e12, C5295b.c(z10 ? C5437c.f24302a.i().a(a0Var4.z0(), i10) : e11, -(a0Var4.z0() / 2), f12), 0.0f, 4, (Object) null);
        }
        a0.a.m(aVar, a0Var3, W0.j(a0Var), Math.max(z10 ? C5437c.f24302a.i().a(a0Var3.z0(), i10) : e11, W0.i(a0Var4) / 2), 0.0f, 4, (Object) null);
        if (a0Var5 != null) {
            if (z10) {
                e11 = C5437c.f24302a.i().a(a0Var5.z0(), i10);
            }
            a0.a.m(aVar, a0Var5, W0.j(a0Var), Math.max(e11, W0.i(a0Var4) / 2), 0.0f, 4, (Object) null);
        }
        a0.a.k(aVar, a0Var6, n.f23044b.a(), 0.0f, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final int k(int i10, int i11) {
        return i10 == Integer.MAX_VALUE ? i10 : i10 - i11;
    }
}
