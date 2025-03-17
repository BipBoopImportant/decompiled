package O0;

import E1.I;
import E1.a0;
import G1.C4504g;
import Q0.w;
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
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import androidx.recyclerview.widget.RecyclerView;
import bI.C17035a;
import c2.C5267b;
import c2.h;
import c2.i;
import c2.n;
import c2.t;
import com.google.ar.core.ImageMetadata;
import e2.C5295b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;
import nI.q;
import pI.C17752b;
import s0.C5834E;
import tI.C17978n;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÁ\u0001\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aR\u0010#\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001ar\u0010.\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a¡\u0001\u0010?\u001a\u00020\u0003*\u0002002\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00162\u0006\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001032\b\u00107\u001a\u0004\u0018\u0001032\b\u00108\u001a\u0004\u0018\u0001032\b\u00109\u001a\u0004\u0018\u0001032\b\u0010:\u001a\u0004\u0018\u0001032\u0006\u0010;\u001a\u0002032\b\u0010<\u001a\u0004\u0018\u0001032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010=\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000eH\u0002¢\u0006\u0004\b?\u0010@\u001a\u0001\u0010B\u001a\u00020\u0003*\u0002002\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00162\u0006\u0010A\u001a\u0002032\b\u00106\u001a\u0004\u0018\u0001032\b\u00107\u001a\u0004\u0018\u0001032\b\u00108\u001a\u0004\u0018\u0001032\b\u00109\u001a\u0004\u0018\u0001032\b\u0010:\u001a\u0004\u0018\u0001032\u0006\u0010;\u001a\u0002032\b\u0010<\u001a\u0004\u0018\u0001032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\bB\u0010C\"\u001a\u0010H\u001a\u00020D8\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010G\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "textField", "label", "Lkotlin/Function1;", "placeholder", "leading", "trailing", "prefix", "suffix", "", "singleLine", "", "animationProgress", "container", "supporting", "Ls0/E;", "paddingValues", "a", "(Landroidx/compose/ui/d;LnI/p;LnI/p;LnI/q;LnI/p;LnI/p;LnI/p;LnI/p;ZFLnI/p;LnI/p;Ls0/E;LU0/m;II)V", "", "from", "l", "(II)I", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "Lc2/b;", "constraints", "h", "(IIIIIIIJ)I", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "density", "g", "(IIIIIIIIFJFLs0/E;)I", "LE1/a0$a;", "width", "totalHeight", "LE1/a0;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "i", "(LE1/a0$a;IILE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;ZIIFF)V", "textPlaceable", "j", "(LE1/a0$a;IILE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;ZFLs0/E;)V", "Lc2/h;", "F", "getTextFieldWithLabelVerticalPadding", "()F", "TextFieldWithLabelVerticalPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f10399a = h.B((float) 8);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f10400c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10401d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10402e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q<d, C4889m, Integer, C16807N> f10403f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10404g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10405h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10406i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10407j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f10408k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ float f10409l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10410m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10411n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C5834E f10412o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f10413p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f10414q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, q<? super d, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, p<? super C4889m, ? super Integer, C16807N> pVar6, boolean z10, float f10, p<? super C4889m, ? super Integer, C16807N> pVar7, p<? super C4889m, ? super Integer, C16807N> pVar8, C5834E e10, int i10, int i11) {
            super(2);
            this.f10400c = dVar;
            this.f10401d = pVar;
            this.f10402e = pVar2;
            this.f10403f = qVar;
            this.f10404g = pVar3;
            this.f10405h = pVar4;
            this.f10406i = pVar5;
            this.f10407j = pVar6;
            this.f10408k = z10;
            this.f10409l = f10;
            this.f10410m = pVar7;
            this.f10411n = pVar8;
            this.f10412o = e10;
            this.f10413p = i10;
            this.f10414q = i11;
        }

        public final void a(C4889m mVar, int i10) {
            b1.a(this.f10400c, this.f10401d, this.f10402e, this.f10403f, this.f10404g, this.f10405h, this.f10406i, this.f10407j, this.f10408k, this.f10409l, this.f10410m, this.f10411n, this.f10412o, mVar, M0.a(this.f10413p | 1), M0.a(this.f10414q));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, q<? super d, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, p<? super C4889m, ? super Integer, C16807N> pVar6, boolean z10, float f10, p<? super C4889m, ? super Integer, C16807N> pVar7, p<? super C4889m, ? super Integer, C16807N> pVar8, C5834E e10, C4889m mVar, int i10, int i11) {
        int i12;
        int i13;
        C5834E e11;
        int i14;
        float f11;
        d dVar2 = dVar;
        p<? super C4889m, ? super Integer, C16807N> pVar9 = pVar;
        p<? super C4889m, ? super Integer, C16807N> pVar10 = pVar2;
        q<? super d, ? super C4889m, ? super Integer, C16807N> qVar2 = qVar;
        p<? super C4889m, ? super Integer, C16807N> pVar11 = pVar3;
        p<? super C4889m, ? super Integer, C16807N> pVar12 = pVar4;
        p<? super C4889m, ? super Integer, C16807N> pVar13 = pVar5;
        p<? super C4889m, ? super Integer, C16807N> pVar14 = pVar6;
        boolean z11 = z10;
        float f12 = f10;
        p<? super C4889m, ? super Integer, C16807N> pVar15 = pVar7;
        p<? super C4889m, ? super Integer, C16807N> pVar16 = pVar8;
        C5834E e12 = e10;
        int i15 = i10;
        int i16 = i11;
        C4889m k10 = mVar.k(-1830307184);
        int i17 = 4;
        if ((i15 & 6) == 0) {
            i12 = i15 | (k10.V(dVar2) ? 4 : 2);
        } else {
            i12 = i15;
        }
        int i18 = 16;
        if ((i15 & 48) == 0) {
            i12 |= k10.F(pVar9) ? 32 : 16;
        }
        int i19 = 128;
        if ((i15 & 384) == 0) {
            i12 |= k10.F(pVar10) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i12 |= k10.F(qVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i15 & 24576) == 0) {
            i12 |= k10.F(pVar11) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i12 |= k10.F(pVar12) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i15) == 0) {
            i12 |= k10.F(pVar13) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i15) == 0) {
            i12 |= k10.F(pVar14) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i12 |= k10.b(z11) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i12 |= k10.c(f12) ? 536870912 : 268435456;
        }
        int i20 = i12;
        if ((i16 & 6) == 0) {
            if (!k10.F(pVar15)) {
                i17 = 2;
            }
            i13 = i16 | i17;
        } else {
            i13 = i16;
        }
        if ((i16 & 48) == 0) {
            if (k10.F(pVar16)) {
                i18 = 32;
            }
            i13 |= i18;
        }
        if ((i16 & 384) == 0) {
            e11 = e10;
            if (k10.V(e11)) {
                i19 = 256;
            }
            i13 |= i19;
        } else {
            e11 = e10;
        }
        int i21 = i13;
        if ((i20 & 306783379) == 306783378 && (i21 & 147) == 146 && k10.l()) {
            k10.L();
            p<? super C4889m, ? super Integer, C16807N> pVar17 = pVar;
            p<? super C4889m, ? super Integer, C16807N> pVar18 = pVar8;
            float f13 = f12;
        } else {
            if (C4895p.J()) {
                C4895p.S(-1830307184, i20, i21, "androidx.compose.material3.TextFieldLayout (TextField.kt:453)");
            }
            boolean z12 = ((1879048192 & i20) == 536870912) | ((234881024 & i20) == 67108864) | ((i21 & 896) == 256);
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new c1(z11, f12, e11);
                k10.u(D10);
            }
            c1 c1Var = (c1) D10;
            t tVar = (t) k10.Q(C5100f0.k());
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e13 = c.e(k10, dVar2);
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
            F1.c(a12, c1Var, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e13, aVar.d());
            pVar15.invoke(k10, Integer.valueOf(i21 & 14));
            k10.W(1341517187);
            if (pVar11 != null) {
                d s11 = androidx.compose.ui.layout.a.b(d.f18749a, "Leading").s(w.k());
                I h10 = C5077h.h(C5437c.f24302a.e(), false);
                int a13 = C4883j.a(k10, 0);
                C4912y s12 = k10.s();
                d e14 = c.e(k10, s11);
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
                F1.c(a15, e14, aVar.d());
                C5079j jVar = C5079j.f18125a;
                pVar11.invoke(k10, Integer.valueOf((i20 >> 12) & 14));
                k10.x();
            }
            k10.P();
            k10.W(1341526310);
            if (pVar12 != null) {
                d s13 = androidx.compose.ui.layout.a.b(d.f18749a, "Trailing").s(w.k());
                I h11 = C5077h.h(C5437c.f24302a.e(), false);
                int a16 = C4883j.a(k10, 0);
                C4912y s14 = k10.s();
                d e15 = c.e(k10, s13);
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
                F1.c(a18, e15, aVar.d());
                C5079j jVar2 = C5079j.f18125a;
                pVar12.invoke(k10, Integer.valueOf((i20 >> 15) & 14));
                k10.x();
            }
            k10.P();
            float g10 = D.g(e11, tVar);
            float f14 = D.f(e11, tVar);
            if (pVar11 != null) {
                i14 = 0;
                g10 = h.B(C17978n.d(h.B(g10 - w.j()), h.B((float) 0)));
            } else {
                i14 = 0;
            }
            if (pVar12 != null) {
                f14 = h.B(C17978n.d(h.B(f14 - w.j()), h.B((float) i14)));
            }
            k10.W(1341556924);
            if (pVar13 != null) {
                d m10 = D.m(J.C(J.k(androidx.compose.ui.layout.a.b(d.f18749a, "Prefix"), w.o(), 0.0f, 2, (Object) null), (C5437c.C0386c) null, false, 3, (Object) null), g10, 0.0f, w.p(), 0.0f, 10, (Object) null);
                I h12 = C5077h.h(C5437c.f24302a.o(), false);
                int a19 = C4883j.a(k10, 0);
                C4912y s15 = k10.s();
                d e16 = c.e(k10, m10);
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
                F1.c(a21, s15, aVar.e());
                p<C4504g, Integer, C16807N> b13 = aVar.b();
                if (a21.i() || !C17542s.e(a21.D(), Integer.valueOf(a19))) {
                    a21.u(Integer.valueOf(a19));
                    a21.w(Integer.valueOf(a19), b13);
                }
                F1.c(a21, e16, aVar.d());
                C5079j jVar3 = C5079j.f18125a;
                pVar13.invoke(k10, Integer.valueOf((i20 >> 18) & 14));
                k10.x();
            }
            k10.P();
            k10.W(1341568890);
            if (pVar14 != null) {
                d m11 = D.m(J.C(J.k(androidx.compose.ui.layout.a.b(d.f18749a, "Suffix"), w.o(), 0.0f, 2, (Object) null), (C5437c.C0386c) null, false, 3, (Object) null), w.p(), 0.0f, f14, 0.0f, 10, (Object) null);
                I h13 = C5077h.h(C5437c.f24302a.o(), false);
                int a22 = C4883j.a(k10, 0);
                C4912y s16 = k10.s();
                d e17 = c.e(k10, m11);
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
                F1.c(a24, s16, aVar.e());
                p<C4504g, Integer, C16807N> b14 = aVar.b();
                if (a24.i() || !C17542s.e(a24.D(), Integer.valueOf(a22))) {
                    a24.u(Integer.valueOf(a22));
                    a24.w(Integer.valueOf(a22), b14);
                }
                F1.c(a24, e17, aVar.d());
                C5079j jVar4 = C5079j.f18125a;
                pVar14.invoke(k10, Integer.valueOf((i20 >> 21) & 14));
                k10.x();
            }
            k10.P();
            k10.W(1341581092);
            if (pVar10 != null) {
                d m12 = D.m(J.C(J.k(androidx.compose.ui.layout.a.b(d.f18749a, "Label"), i.c(w.o(), w.m(), f10), 0.0f, 2, (Object) null), (C5437c.C0386c) null, false, 3, (Object) null), g10, 0.0f, f14, 0.0f, 10, (Object) null);
                I h14 = C5077h.h(C5437c.f24302a.o(), false);
                int a25 = C4883j.a(k10, 0);
                C4912y s17 = k10.s();
                d e18 = c.e(k10, m12);
                C17631a<C4504g> a26 = aVar.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a26);
                } else {
                    k10.t();
                }
                C4889m a27 = F1.a(k10);
                f11 = g10;
                F1.c(a27, h14, aVar.c());
                F1.c(a27, s17, aVar.e());
                p<C4504g, Integer, C16807N> b15 = aVar.b();
                if (a27.i() || !C17542s.e(a27.D(), Integer.valueOf(a25))) {
                    a27.u(Integer.valueOf(a25));
                    a27.w(Integer.valueOf(a25), b15);
                }
                F1.c(a27, e18, aVar.d());
                C5079j jVar5 = C5079j.f18125a;
                pVar10.invoke(k10, Integer.valueOf((i20 >> 6) & 14));
                k10.x();
            } else {
                float f15 = f10;
                f11 = g10;
            }
            k10.P();
            d.a aVar2 = d.f18749a;
            d C10 = J.C(J.k(aVar2, w.o(), 0.0f, 2, (Object) null), (C5437c.C0386c) null, false, 3, (Object) null);
            float B10 = pVar13 == null ? f11 : h.B((float) 0);
            if (pVar14 != null) {
                f14 = h.B((float) 0);
            }
            d m13 = D.m(C10, B10, 0.0f, f14, 0.0f, 10, (Object) null);
            k10.W(1341611627);
            q<? super d, ? super C4889m, ? super Integer, C16807N> qVar3 = qVar;
            if (qVar3 != null) {
                qVar3.invoke(androidx.compose.ui.layout.a.b(aVar2, "Hint").s(m13), k10, Integer.valueOf((i20 >> 6) & 112));
            }
            k10.P();
            d s18 = androidx.compose.ui.layout.a.b(aVar2, "TextField").s(m13);
            C5437c.a aVar3 = C5437c.f24302a;
            I h15 = C5077h.h(aVar3.o(), true);
            int a28 = C4883j.a(k10, 0);
            C4912y s19 = k10.s();
            d e19 = c.e(k10, s18);
            C17631a<C4504g> a29 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a29);
            } else {
                k10.t();
            }
            C4889m a30 = F1.a(k10);
            F1.c(a30, h15, aVar.c());
            F1.c(a30, s19, aVar.e());
            p<C4504g, Integer, C16807N> b16 = aVar.b();
            if (a30.i() || !C17542s.e(a30.D(), Integer.valueOf(a28))) {
                a30.u(Integer.valueOf(a28));
                a30.w(Integer.valueOf(a28), b16);
            }
            F1.c(a30, e19, aVar.d());
            C5079j jVar6 = C5079j.f18125a;
            pVar.invoke(k10, Integer.valueOf((i20 >> 3) & 14));
            k10.x();
            k10.W(1341622624);
            p<? super C4889m, ? super Integer, C16807N> pVar19 = pVar8;
            if (pVar19 != null) {
                d h16 = D.h(J.C(J.k(androidx.compose.ui.layout.a.b(aVar2, "Supporting"), w.n(), 0.0f, 2, (Object) null), (C5437c.C0386c) null, false, 3, (Object) null), a1.b(a1.f10253a, 0.0f, 0.0f, 0.0f, 0.0f, 15, (Object) null));
                I h17 = C5077h.h(aVar3.o(), false);
                int a31 = C4883j.a(k10, 0);
                C4912y s20 = k10.s();
                d e20 = c.e(k10, h16);
                C17631a<C4504g> a32 = aVar.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a32);
                } else {
                    k10.t();
                }
                C4889m a33 = F1.a(k10);
                F1.c(a33, h17, aVar.c());
                F1.c(a33, s20, aVar.e());
                p<C4504g, Integer, C16807N> b17 = aVar.b();
                if (a33.i() || !C17542s.e(a33.D(), Integer.valueOf(a31))) {
                    a33.u(Integer.valueOf(a31));
                    a33.w(Integer.valueOf(a31), b17);
                }
                F1.c(a33, e20, aVar.d());
                pVar19.invoke(k10, Integer.valueOf((i21 >> 3) & 14));
                k10.x();
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            a aVar4 = r0;
            a aVar5 = new a(dVar, pVar, pVar2, qVar, pVar3, pVar4, pVar5, pVar6, z10, f10, pVar7, pVar8, e10, i10, i11);
            n10.a(aVar4);
        }
    }

    /* access modifiers changed from: private */
    public static final int g(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, long j10, float f11, C5834E e10) {
        boolean z10 = i11 > 0;
        float B10 = h.B(e10.d() + e10.a()) * f11;
        if (z10) {
            B10 = C5295b.b(h.B(w.r() * ((float) 2)) * f11, B10, f10);
        }
        return Math.max(C5267b.m(j10), Math.max(i12, Math.max(i13, C17752b.e(B10 + ((float) C5295b.c(0, i11, f10)) + ((float) C17035a.j(i10, i16, i14, i15, C5295b.c(i11, 0, f10)))))) + i17);
    }

    /* access modifiers changed from: private */
    public static final int h(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10) {
        int i17 = i12 + i13;
        return Math.max(i10 + Math.max(i14 + i17, Math.max(i16 + i17, i15)) + i11, C5267b.n(j10));
    }

    /* access modifiers changed from: private */
    public static final void i(a0.a aVar, int i10, int i11, a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4, a0 a0Var5, a0 a0Var6, a0 a0Var7, a0 a0Var8, a0 a0Var9, boolean z10, int i12, int i13, float f10, float f11) {
        a0.a.k(aVar, a0Var8, n.f23044b.a(), 0.0f, 2, (Object) null);
        int t10 = i11 - w.t(a0Var9);
        if (a0Var4 != null) {
            a0.a.m(aVar, a0Var4, 0, C5437c.f24302a.i().a(a0Var4.z0(), t10), 0.0f, 4, (Object) null);
        }
        if (a0Var2 != null) {
            int a10 = z10 ? C5437c.f24302a.i().a(a0Var2.z0(), t10) : C17752b.e(w.r() * f11);
            a0.a.m(aVar, a0Var2, w.v(a0Var4), a10 - C17752b.e(((float) (a10 - i12)) * f10), 0.0f, 4, (Object) null);
        }
        if (a0Var6 != null) {
            a0.a.m(aVar, a0Var6, w.v(a0Var4), i13, 0.0f, 4, (Object) null);
        }
        int v10 = w.v(a0Var4) + w.v(a0Var6);
        a0.a.m(aVar, a0Var, v10, i13, 0.0f, 4, (Object) null);
        if (a0Var3 != null) {
            a0.a.m(aVar, a0Var3, v10, i13, 0.0f, 4, (Object) null);
        }
        if (a0Var7 != null) {
            a0.a.m(aVar, a0Var7, (i10 - w.v(a0Var5)) - a0Var7.E0(), i13, 0.0f, 4, (Object) null);
        }
        if (a0Var5 != null) {
            a0.a.m(aVar, a0Var5, i10 - a0Var5.E0(), C5437c.f24302a.i().a(a0Var5.z0(), t10), 0.0f, 4, (Object) null);
        }
        if (a0Var9 != null) {
            a0.a.m(aVar, a0Var9, 0, t10, 0.0f, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void j(a0.a aVar, int i10, int i11, a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4, a0 a0Var5, a0 a0Var6, a0 a0Var7, a0 a0Var8, boolean z10, float f10, C5834E e10) {
        a0 a0Var9 = a0Var2;
        a0 a0Var10 = a0Var5;
        a0 a0Var11 = a0Var6;
        boolean z11 = z10;
        a0.a.k(aVar, a0Var7, n.f23044b.a(), 0.0f, 2, (Object) null);
        int t10 = i11 - w.t(a0Var8);
        int e11 = C17752b.e(e10.d() * f10);
        if (a0Var3 != null) {
            a0.a.m(aVar, a0Var3, 0, C5437c.f24302a.i().a(a0Var3.z0(), t10), 0.0f, 4, (Object) null);
        }
        if (a0Var10 != null) {
            a0.a.m(aVar, a0Var5, w.v(a0Var3), k(z11, t10, e11, a0Var10), 0.0f, 4, (Object) null);
        }
        int v10 = w.v(a0Var3) + w.v(a0Var5);
        a0.a.m(aVar, a0Var, v10, k(z11, t10, e11, a0Var), 0.0f, 4, (Object) null);
        if (a0Var9 != null) {
            a0.a.m(aVar, a0Var2, v10, k(z11, t10, e11, a0Var9), 0.0f, 4, (Object) null);
        }
        if (a0Var11 != null) {
            a0.a.m(aVar, a0Var6, (i10 - w.v(a0Var4)) - a0Var6.E0(), k(z11, t10, e11, a0Var11), 0.0f, 4, (Object) null);
        }
        if (a0Var4 != null) {
            a0.a.m(aVar, a0Var4, i10 - a0Var4.E0(), C5437c.f24302a.i().a(a0Var4.z0(), t10), 0.0f, 4, (Object) null);
        }
        if (a0Var8 != null) {
            a0.a.m(aVar, a0Var8, 0, t10, 0.0f, 4, (Object) null);
        }
    }

    private static final int k(boolean z10, int i10, int i11, a0 a0Var) {
        return z10 ? C5437c.f24302a.i().a(a0Var.z0(), i10) : i11;
    }

    /* access modifiers changed from: private */
    public static final int l(int i10, int i11) {
        return i10 == Integer.MAX_VALUE ? i10 : i10 - i11;
    }
}
