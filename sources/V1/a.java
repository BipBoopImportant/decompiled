package V1;

import N1.C4669d;
import N1.C4677l;
import N1.D;
import N1.G;
import N1.a0;
import N1.b0;
import S1.C;
import S1.C4813f;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U1.e;
import W1.c;
import Y1.k;
import Y1.o;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c2.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p1.g1;
import r1.g;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0010\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LN1/d;", "Lc2/d;", "density", "LS1/m$b;", "fontFamilyResolver", "LV1/v;", "urlSpanCache", "Landroid/text/SpannableString;", "b", "(LN1/d;Lc2/d;LS1/m$b;LV1/v;)Landroid/text/SpannableString;", "LN1/G;", "spanStyle", "", "start", "end", "LXH/N;", "a", "(Landroid/text/SpannableString;LN1/G;IILc2/d;LS1/m$b;)V", "LN1/d$c;", "LN1/l;", "LN1/l$b;", "c", "(LN1/d$c;)LN1/d$c;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    private static final void a(SpannableString spannableString, G g10, int i10, int i11, d dVar, C4820m.b bVar) {
        c.k(spannableString, g10.g(), i10, i11);
        c.o(spannableString, g10.k(), dVar, i10, i11);
        if (!(g10.n() == null && g10.l() == null)) {
            C n10 = g10.n();
            if (n10 == null) {
                n10 = C.f13316b.d();
            }
            C4830x l10 = g10.l();
            spannableString.setSpan(new StyleSpan(C4813f.c(n10, l10 != null ? l10.i() : C4830x.f13449b.b())), i10, i11, 33);
        }
        if (g10.i() != null) {
            if (g10.i() instanceof S1.G) {
                spannableString.setSpan(new TypefaceSpan(((S1.G) g10.i()).q()), i10, i11, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                C4820m i12 = g10.i();
                C4831y m10 = g10.m();
                Object value = C4820m.b.b(bVar, i12, (C) null, 0, m10 != null ? m10.m() : C4831y.f13453b.a(), 6, (Object) null).getValue();
                C17542s.h(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(k.f14581a.a((Typeface) value), i10, i11, 33);
            }
        }
        if (g10.s() != null) {
            k s10 = g10.s();
            k.a aVar = k.f14792b;
            if (s10.d(aVar.d())) {
                spannableString.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (g10.s().d(aVar.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
        }
        if (g10.u() != null) {
            spannableString.setSpan(new ScaleXSpan(g10.u().b()), i10, i11, 33);
        }
        c.s(spannableString, g10.p(), i10, i11);
        c.h(spannableString, g10.d(), i10, i11);
    }

    public static final SpannableString b(C4669d dVar, d dVar2, C4820m.b bVar, v vVar) {
        C4669d dVar3 = dVar;
        v vVar2 = vVar;
        SpannableString spannableString = new SpannableString(dVar.j());
        List<C4669d.c<G>> h10 = dVar.h();
        if (h10 != null) {
            int size = h10.size();
            for (int i10 = 0; i10 < size; i10++) {
                C4669d.c cVar = h10.get(i10);
                a(spannableString, G.b((G) cVar.a(), 0, 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (D) null, (g) null, 65503, (Object) null), cVar.b(), cVar.c(), dVar2, bVar);
            }
        }
        List<C4669d.c<a0>> k10 = dVar3.k(0, dVar.length());
        int size2 = k10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C4669d.c cVar2 = k10.get(i11);
            spannableString.setSpan(W1.e.a((a0) cVar2.a()), cVar2.b(), cVar2.c(), 33);
        }
        List<C4669d.c<b0>> l10 = dVar3.l(0, dVar.length());
        int size3 = l10.size();
        for (int i12 = 0; i12 < size3; i12++) {
            C4669d.c cVar3 = l10.get(i12);
            spannableString.setSpan(vVar2.c((b0) cVar3.a()), cVar3.b(), cVar3.c(), 33);
        }
        List<C4669d.c<C4677l>> d10 = dVar3.d(0, dVar.length());
        int size4 = d10.size();
        for (int i13 = 0; i13 < size4; i13++) {
            C4669d.c cVar4 = d10.get(i13);
            if (cVar4.h() != cVar4.f()) {
                C4677l lVar = (C4677l) cVar4.g();
                if (lVar instanceof C4677l.b) {
                    lVar.a();
                    spannableString.setSpan(vVar2.b(c(cVar4)), cVar4.h(), cVar4.f(), 33);
                } else {
                    spannableString.setSpan(vVar2.a(cVar4), cVar4.h(), cVar4.f(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final C4669d.c<C4677l.b> c(C4669d.c<C4677l> cVar) {
        C4677l g10 = cVar.g();
        C17542s.h(g10, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new C4669d.c<>((C4677l.b) g10, cVar.h(), cVar.f());
    }
}
