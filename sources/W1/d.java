package W1;

import N1.D;
import N1.G;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U1.e;
import V1.g;
import Y1.a;
import Y1.k;
import Y1.o;
import Y1.s;
import android.graphics.Typeface;
import c2.v;
import c2.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.r;
import o1.C5673m;
import p1.C5747v0;
import p1.g1;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aW\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"LV1/g;", "LN1/G;", "style", "Lkotlin/Function4;", "LS1/m;", "LS1/C;", "LS1/x;", "LS1/y;", "Landroid/graphics/Typeface;", "resolveTypeface", "Lc2/d;", "density", "", "requiresLetterSpacing", "a", "(LV1/g;LN1/G;LnI/r;Lc2/d;Z)LN1/G;", "Lc2/v;", "letterSpacing", "Lp1/v0;", "background", "LY1/a;", "baselineShift", "c", "(JZJLY1/a;)LN1/G;", "LY1/s;", "textMotion", "LXH/N;", "e", "(LV1/g;LY1/s;)V", "d", "(LN1/G;)Z", "", "blurRadius", "b", "(F)F", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final G a(g gVar, G g10, r<? super C4820m, ? super C, ? super C4830x, ? super C4831y, ? extends Typeface> rVar, c2.d dVar, boolean z10) {
        long g11 = v.g(g10.k());
        x.a aVar = x.f23061b;
        if (x.g(g11, aVar.b())) {
            gVar.setTextSize(dVar.O0(g10.k()));
        } else if (x.g(g11, aVar.a())) {
            gVar.setTextSize(gVar.getTextSize() * v.h(g10.k()));
        }
        if (d(g10)) {
            C4820m i10 = g10.i();
            C n10 = g10.n();
            if (n10 == null) {
                n10 = C.f13316b.d();
            }
            C4830x l10 = g10.l();
            C4830x c10 = C4830x.c(l10 != null ? l10.i() : C4830x.f13449b.b());
            C4831y m10 = g10.m();
            gVar.setTypeface((Typeface) rVar.l(i10, n10, c10, C4831y.e(m10 != null ? m10.m() : C4831y.f13453b.a())));
        }
        if (g10.p() != null && !C17542s.e(g10.p(), e.f14214c.a())) {
            a.f14644a.b(gVar, g10.p());
        }
        if (g10.j() != null && !C17542s.e(g10.j(), "")) {
            gVar.setFontFeatureSettings(g10.j());
        }
        if (g10.u() != null && !C17542s.e(g10.u(), o.f14810c.a())) {
            gVar.setTextScaleX(gVar.getTextScaleX() * g10.u().b());
            gVar.setTextSkewX(gVar.getTextSkewX() + g10.u().c());
        }
        gVar.f(g10.g());
        gVar.e(g10.f(), C5673m.f26722b.a(), g10.c());
        gVar.h(g10.r());
        gVar.i(g10.s());
        gVar.g(g10.h());
        if (x.g(v.g(g10.o()), aVar.b()) && v.h(g10.o()) != 0.0f) {
            float textSize = gVar.getTextSize() * gVar.getTextScaleX();
            float O02 = dVar.O0(g10.o());
            if (textSize != 0.0f) {
                gVar.setLetterSpacing(O02 / textSize);
            }
        } else if (x.g(v.g(g10.o()), aVar.a())) {
            gVar.setLetterSpacing(v.h(g10.o()));
        }
        return c(g10.o(), z10, g10.d(), g10.e());
    }

    public static final float b(float f10) {
        if (f10 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    private static final G c(long j10, boolean z10, long j11, a aVar) {
        long j12 = j11;
        boolean z11 = false;
        boolean z12 = z10 && x.g(v.g(j10), x.f23061b.b()) && v.h(j10) != 0.0f;
        C5747v0.a aVar2 = C5747v0.f27350b;
        boolean z13 = !C5747v0.q(j12, aVar2.i()) && !C5747v0.q(j12, aVar2.h());
        if (aVar != null) {
            if (!a.g(aVar.j(), a.f14735b.a())) {
                z11 = true;
            }
        }
        if (!z12 && !z13 && !z11) {
            return null;
        }
        long a10 = z12 ? j10 : v.f23057b.a();
        if (!z13) {
            j12 = aVar2.i();
        }
        return new G(0, 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, a10, z11 ? aVar : null, (o) null, (e) null, j12, (k) null, (g1) null, (D) null, (r1.g) null, 63103, (DefaultConstructorMarker) null);
    }

    public static final boolean d(G g10) {
        return (g10.i() == null && g10.l() == null && g10.n() == null) ? false : true;
    }

    public static final void e(g gVar, s sVar) {
        if (sVar == null) {
            sVar = s.f14818c.a();
        }
        gVar.setFlags(sVar.c() ? gVar.getFlags() | 128 : gVar.getFlags() & -129);
        int b10 = sVar.b();
        s.b.a aVar = s.b.f14823a;
        if (s.b.e(b10, aVar.b())) {
            gVar.setFlags(gVar.getFlags() | 64);
            gVar.setHinting(0);
        } else if (s.b.e(b10, aVar.a())) {
            gVar.getFlags();
            gVar.setHinting(1);
        } else if (s.b.e(b10, aVar.c())) {
            gVar.getFlags();
            gVar.setHinting(0);
        } else {
            gVar.getFlags();
        }
    }
}
