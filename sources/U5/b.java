package U5;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import T5.r;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U5.e;
import V5.c;
import V5.l;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import coil3.compose.internal.ContentPainterElement;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import k6.C8441h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5749w0;
import r1.f;
import t1.C5942c;

@Metadata(d1 = {"\u0000p\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aß\u0001\u0010 \u001a\u00020\u000e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!\u001a¡\u0001\u0010%\u001a\u00020\u000e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0\f2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b%\u0010&\u001a\u0001\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0\f2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"", "model", "", "contentDescription", "LT5/r;", "imageLoader", "Landroidx/compose/ui/d;", "modifier", "Lt1/c;", "placeholder", "error", "fallback", "Lkotlin/Function1;", "LU5/e$c$c;", "LXH/N;", "onLoading", "LU5/e$c$d;", "onSuccess", "LU5/e$c$b;", "onError", "Li1/c;", "alignment", "LE1/k;", "contentScale", "", "alpha", "Lp1/w0;", "colorFilter", "Lp1/E0;", "filterQuality", "", "clipToBounds", "c", "(Ljava/lang/Object;Ljava/lang/String;LT5/r;Landroidx/compose/ui/d;Lt1/c;Lt1/c;Lt1/c;LnI/l;LnI/l;LnI/l;Li1/c;LE1/k;FLp1/w0;IZLU0/m;III)V", "LU5/e$c;", "transform", "onState", "d", "(Ljava/lang/Object;Ljava/lang/String;LT5/r;Landroidx/compose/ui/d;LnI/l;LnI/l;Li1/c;LE1/k;FLp1/w0;IZLU0/m;III)V", "LV5/c;", "state", "b", "(LV5/c;Ljava/lang/String;Landroidx/compose/ui/d;LnI/l;LnI/l;Li1/c;LE1/k;FLp1/w0;IZLU0/m;II)V", "coil-compose-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    private static final void b(c cVar, String str, d dVar, C17642l<? super e.c, ? extends e.c> lVar, C17642l<? super e.c, C16807N> lVar2, C5437c cVar2, C4478k kVar, float f10, C5749w0 w0Var, int i10, boolean z10, C4889m mVar, int i11, int i12) {
        int i13;
        int i14;
        C4889m mVar2;
        d dVar2 = dVar;
        C4478k kVar2 = kVar;
        int i15 = i11;
        C4889m k10 = mVar.k(1236588022);
        int i16 = 4;
        c cVar3 = cVar;
        if ((i15 & 6) == 0) {
            i13 = (k10.V(cVar3) ? 4 : 2) | i15;
        } else {
            i13 = i15;
        }
        String str2 = str;
        if ((i15 & 48) == 0) {
            i13 |= k10.V(str2) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i13 |= k10.V(dVar2) ? 256 : 128;
        }
        C17642l<? super e.c, ? extends e.c> lVar3 = lVar;
        if ((i15 & 3072) == 0) {
            i13 |= k10.F(lVar3) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        C17642l<? super e.c, C16807N> lVar4 = lVar2;
        if ((i15 & 24576) == 0) {
            i13 |= k10.F(lVar4) ? 16384 : 8192;
        }
        C5437c cVar4 = cVar2;
        if ((196608 & i15) == 0) {
            i13 |= k10.V(cVar4) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i15) == 0) {
            i13 |= k10.V(kVar2) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        float f11 = f10;
        if ((12582912 & i15) == 0) {
            i13 |= k10.c(f11) ? 8388608 : 4194304;
        }
        C5749w0 w0Var2 = w0Var;
        if ((100663296 & i15) == 0) {
            i13 |= k10.V(w0Var2) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i13 |= k10.d(i10) ? 536870912 : 268435456;
        } else {
            int i17 = i10;
        }
        boolean z11 = z10;
        if ((i12 & 6) == 0) {
            if (!k10.b(z11)) {
                i16 = 2;
            }
            i14 = i12 | i16;
        } else {
            i14 = i12;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 3) == 2 && k10.l()) {
            k10.L();
            mVar2 = k10;
        } else {
            if (C4895p.J()) {
                C4895p.S(1236588022, i13, i14, "coil3.compose.AsyncImage (AsyncImage.kt:152)");
            }
            C8441h m10 = l.m(cVar.b(), kVar2, k10, (i13 >> 15) & 112);
            l.v(m10);
            mVar2 = k10;
            d s10 = dVar2.s(new ContentPainterElement(m10, cVar.a(), cVar.c(), lVar, lVar2, i10, cVar2, kVar, f10, w0Var, z10, l.j(k10, 0), str, (DefaultConstructorMarker) null));
            I f12 = l.f();
            int a10 = C4883j.a(mVar2, 0);
            d e10 = androidx.compose.ui.c.e(mVar2, s10);
            C4912y s11 = mVar2.s();
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
            if (mVar2.m() == null) {
                C4883j.c();
            }
            mVar2.I();
            if (mVar2.i()) {
                mVar2.p(a11);
            } else {
                mVar2.t();
            }
            C4889m a12 = F1.a(mVar2);
            F1.c(a12, f12, aVar.c());
            F1.c(a12, s11, aVar.e());
            F1.c(a12, e10, aVar.d());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new a(cVar, str, dVar, lVar, lVar2, cVar2, kVar, f10, w0Var, i10, z10, i11, i12));
        }
    }

    public static final void c(Object obj, String str, r rVar, d dVar, C5942c cVar, C5942c cVar2, C5942c cVar3, C17642l<? super e.c.C0658c, C16807N> lVar, C17642l<? super e.c.d, C16807N> lVar2, C17642l<? super e.c.b, C16807N> lVar3, C5437c cVar4, C4478k kVar, float f10, C5749w0 w0Var, int i10, boolean z10, C4889m mVar, int i11, int i12, int i13) {
        boolean z11;
        int i14 = i11;
        int i15 = i12;
        int i16 = i13;
        d dVar2 = (i16 & 8) != 0 ? d.f18749a : dVar;
        C5749w0 w0Var2 = null;
        C5942c cVar5 = (i16 & 16) != 0 ? null : cVar;
        C5942c cVar6 = (i16 & 32) != 0 ? null : cVar2;
        C5942c cVar7 = (i16 & 64) != 0 ? cVar6 : cVar3;
        C17642l<? super e.c.C0658c, C16807N> lVar4 = (i16 & 128) != 0 ? null : lVar;
        C17642l<? super e.c.d, C16807N> lVar5 = (i16 & 256) != 0 ? null : lVar2;
        C17642l<? super e.c.b, C16807N> lVar6 = (i16 & 512) != 0 ? null : lVar3;
        C5437c e10 = (i16 & 1024) != 0 ? C5437c.f24302a.e() : cVar4;
        C4478k e11 = (i16 & RecyclerView.n.FLAG_MOVED) != 0 ? C4478k.f5915a.e() : kVar;
        float f11 = (i16 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 1.0f : f10;
        if ((i16 & 8192) == 0) {
            w0Var2 = w0Var;
        }
        int b10 = (i16 & 16384) != 0 ? f.f28623w0.b() : i10;
        boolean z12 = (i16 & 32768) != 0 ? true : z10;
        if (C4895p.J()) {
            z11 = z12;
            C4895p.S(-1128374444, i14, i15, "coil3.compose.AsyncImage (AsyncImage.kt:72)");
        } else {
            z11 = z12;
        }
        int i17 = i15 << 15;
        b(new c(obj, (c) mVar.Q(p.c()), rVar), str, dVar2, l.r(cVar5, cVar6, cVar7), l.h(lVar4, lVar5, lVar6), e10, e11, f11, w0Var2, b10, z11, mVar, (i14 & 112) | ((i14 >> 3) & 896) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), (i15 >> 15) & 14);
        if (C4895p.J()) {
            C4895p.R();
        }
    }

    public static final void d(Object obj, String str, r rVar, d dVar, C17642l<? super e.c, ? extends e.c> lVar, C17642l<? super e.c, C16807N> lVar2, C5437c cVar, C4478k kVar, float f10, C5749w0 w0Var, int i10, boolean z10, C4889m mVar, int i11, int i12, int i13) {
        int i14 = i11;
        int i15 = i12;
        int i16 = i13;
        d.a aVar = (i16 & 8) != 0 ? d.f18749a : dVar;
        C17642l<e.c, e.c> a10 = (i16 & 16) != 0 ? e.f40189y.a() : lVar;
        C17642l<? super e.c, C16807N> lVar3 = (i16 & 32) != 0 ? null : lVar2;
        C5437c e10 = (i16 & 64) != 0 ? C5437c.f24302a.e() : cVar;
        C4478k e11 = (i16 & 128) != 0 ? C4478k.f5915a.e() : kVar;
        float f11 = (i16 & 256) != 0 ? 1.0f : f10;
        C5749w0 w0Var2 = (i16 & 512) != 0 ? null : w0Var;
        int b10 = (i16 & 1024) != 0 ? f.f28623w0.b() : i10;
        boolean z11 = (i16 & RecyclerView.n.FLAG_MOVED) != 0 ? true : z10;
        if (C4895p.J()) {
            C4895p.S(40041566, i14, i15, "coil3.compose.AsyncImage (AsyncImage.kt:125)");
        }
        int i17 = i14 >> 3;
        b(new c(obj, (c) mVar.Q(p.c()), rVar), str, aVar, a10, lVar3, e10, e11, f11, w0Var2, b10, z11, mVar, (i14 & 112) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (i17 & 234881024) | ((i15 << 27) & 1879048192), (i15 >> 3) & 14);
        if (C4895p.J()) {
            C4895p.R();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(c cVar, String str, d dVar, C17642l lVar, C17642l lVar2, C5437c cVar2, C4478k kVar, float f10, C5749w0 w0Var, int i10, boolean z10, int i11, int i12, C4889m mVar, int i13) {
        b(cVar, str, dVar, lVar, lVar2, cVar2, kVar, f10, w0Var, i10, z10, mVar, M0.a(i11 | 1), M0.a(i12));
        return C16807N.f139792a;
    }
}
