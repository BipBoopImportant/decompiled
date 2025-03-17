package W1;

import HJ.C15854t;
import N1.C4669d;
import N1.C4670e;
import N1.D;
import N1.G;
import N1.Y;
import Q1.e;
import Q1.f;
import Q1.l;
import Q1.m;
import Q1.n;
import Q1.o;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import X1.b;
import XH.C16807N;
import Y1.h;
import Y1.k;
import YH.C16870n;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import c2.d;
import c2.v;
import c2.w;
import c2.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;
import nI.r;
import o1.C5667g;
import p1.C5728l0;
import p1.C5751x0;
import p1.e1;
import p1.g1;
import p1.j1;
import pI.C17752b;
import r1.g;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a6\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a.\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a_\u0010+\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\u0006\u0010\u000e\u001a\u00020\r2&\u0010*\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0$H\u0000¢\u0006\u0004\b+\u0010,\u001a)\u0010.\u001a\u00020\u0006*\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010/\u001aW\u00100\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2&\u0010*\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0$H\u0002¢\u0006\u0004\b0\u00101\u001aM\u00105\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010\"2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\u001e\u00104\u001a\u001a\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000603H\u0000¢\u0006\u0004\b5\u00106\u001a$\u00109\u001a\u0004\u0018\u0001082\u0006\u00107\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a-\u0010=\u001a\u00020\u0006*\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>\u001a-\u0010A\u001a\u00020\u0006*\u00020\u00002\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bA\u0010B\u001a.\u0010E\u001a\u00020\u0006*\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a-\u0010I\u001a\u00020\u0006*\u00020\u00002\b\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bI\u0010J\u001a-\u0010M\u001a\u00020\u0006*\u00020\u00002\b\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bM\u0010N\u001a-\u0010Q\u001a\u00020\u0006*\u00020\u00002\b\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bQ\u0010R\u001a6\u0010T\u001a\u00020\u0006*\u00020\u00002\u0006\u0010S\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bT\u0010U\u001a-\u0010X\u001a\u00020\u0006*\u00020\u00002\b\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bX\u0010Y\u001a.\u0010Z\u001a\u00020\u0006*\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bZ\u0010F\u001a0\u0010]\u001a\u00020\u0006*\u00020\u00002\b\u0010\\\u001a\u0004\u0018\u00010[2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b]\u0010^\u001a5\u0010b\u001a\u00020\u0006*\u00020\u00002\b\u0010`\u001a\u0004\u0018\u00010_2\u0006\u0010a\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bb\u0010c\u001a\u0013\u0010d\u001a\u00020\u001b*\u00020\u001eH\u0002¢\u0006\u0004\bd\u0010e\u001a\u001d\u0010g\u001a\u00020\"*\u0004\u0018\u00010\"2\u0006\u0010f\u001a\u00020\"H\u0002¢\u0006\u0004\bg\u0010h\"\u0018\u0010k\u001a\u00020\u001b*\u00020\"8BX\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006l"}, d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "LXH/N;", "u", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "LY1/q;", "textIndent", "", "contextFontSize", "Lc2/d;", "density", "y", "(Landroid/text/Spannable;LY1/q;FLc2/d;)V", "Lc2/v;", "lineHeight", "LY1/h;", "lineHeightStyle", "q", "(Landroid/text/Spannable;JFLc2/d;LY1/h;)V", "r", "(Landroid/text/Spannable;JFLc2/d;)V", "g", "(JFLc2/d;)F", "", "e", "(Lc2/d;)Z", "LN1/Y;", "contextTextStyle", "", "LN1/d$c;", "LN1/G;", "spanStyles", "Lkotlin/Function4;", "LS1/m;", "LS1/C;", "LS1/x;", "LS1/y;", "Landroid/graphics/Typeface;", "resolveTypeface", "w", "(Landroid/text/Spannable;LN1/Y;Ljava/util/List;Lc2/d;LnI/r;)V", "spanStyleRange", "v", "(Landroid/text/Spannable;LN1/d$c;Lc2/d;)V", "m", "(Landroid/text/Spannable;LN1/Y;Ljava/util/List;LnI/r;)V", "contextFontSpanStyle", "Lkotlin/Function3;", "block", "b", "(LN1/G;Ljava/util/List;LnI/q;)V", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", "a", "(JLc2/d;)Landroid/text/style/MetricAffectingSpan;", "Lp1/g1;", "shadow", "t", "(Landroid/text/Spannable;Lp1/g1;II)V", "Lr1/g;", "drawStyle", "l", "(Landroid/text/Spannable;Lr1/g;II)V", "Lp1/v0;", "color", "h", "(Landroid/text/Spannable;JII)V", "LU1/e;", "localeList", "s", "(Landroid/text/Spannable;LU1/e;II)V", "LY1/o;", "textGeometricTransform", "p", "(Landroid/text/Spannable;LY1/o;II)V", "", "fontFeatureSettings", "n", "(Landroid/text/Spannable;Ljava/lang/String;II)V", "fontSize", "o", "(Landroid/text/Spannable;JLc2/d;II)V", "LY1/k;", "textDecoration", "x", "(Landroid/text/Spannable;LY1/k;II)V", "k", "LY1/a;", "baselineShift", "i", "(Landroid/text/Spannable;LY1/a;II)V", "Lp1/l0;", "brush", "alpha", "j", "(Landroid/text/Spannable;Lp1/l0;FII)V", "d", "(LN1/Y;)Z", "spanStyle", "f", "(LN1/G;LN1/G;)LN1/G;", "c", "(LN1/G;)Z", "needsLetterSpacingSpan", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LN1/G;", "spanStyle", "", "start", "end", "LXH/N;", "a", "(LN1/G;II)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements q<G, Integer, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Spannable f14645c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r<C4820m, C, C4830x, C4831y, Typeface> f14646d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Spannable spannable, r<? super C4820m, ? super C, ? super C4830x, ? super C4831y, ? extends Typeface> rVar) {
            super(3);
            this.f14645c = spannable;
            this.f14646d = rVar;
        }

        public final void a(G g10, int i10, int i11) {
            Spannable spannable = this.f14645c;
            r<C4820m, C, C4830x, C4831y, Typeface> rVar = this.f14646d;
            C4820m i12 = g10.i();
            C n10 = g10.n();
            if (n10 == null) {
                n10 = C.f13316b.d();
            }
            C4830x l10 = g10.l();
            C4830x c10 = C4830x.c(l10 != null ? l10.i() : C4830x.f13449b.b());
            C4831y m10 = g10.m();
            spannable.setSpan(new o(rVar.l(i12, n10, c10, C4831y.e(m10 != null ? m10.m() : C4831y.f13453b.a()))), i10, i11, 33);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((G) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    private static final MetricAffectingSpan a(long j10, d dVar) {
        long g10 = v.g(j10);
        x.a aVar = x.f23061b;
        if (x.g(g10, aVar.b())) {
            return new f(dVar.O0(j10));
        }
        if (x.g(g10, aVar.a())) {
            return new e(v.h(j10));
        }
        return null;
    }

    public static final void b(G g10, List<C4669d.c<G>> list, q<? super G, ? super Integer, ? super Integer, C16807N> qVar) {
        if (list.size() > 1) {
            int size = list.size();
            int i10 = size * 2;
            Integer[] numArr = new Integer[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                numArr[i11] = 0;
            }
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                C4669d.c cVar = list.get(i12);
                numArr[i12] = Integer.valueOf(cVar.h());
                numArr[i12 + size] = Integer.valueOf(cVar.f());
            }
            C16870n.K((Comparable[]) numArr);
            int intValue = ((Number) C16870n.f0(numArr)).intValue();
            for (int i13 = 0; i13 < i10; i13++) {
                Integer num = numArr[i13];
                int intValue2 = num.intValue();
                if (intValue2 != intValue) {
                    int size3 = list.size();
                    G g11 = g10;
                    for (int i14 = 0; i14 < size3; i14++) {
                        C4669d.c cVar2 = list.get(i14);
                        if (cVar2.h() != cVar2.f() && C4670e.n(intValue, intValue2, cVar2.h(), cVar2.f())) {
                            g11 = f(g11, (G) cVar2.g());
                        }
                    }
                    if (g11 != null) {
                        qVar.invoke(g11, Integer.valueOf(intValue), num);
                    }
                    intValue = intValue2;
                }
            }
        } else if (!list.isEmpty()) {
            qVar.invoke(f(g10, (G) list.get(0).g()), Integer.valueOf(list.get(0).h()), Integer.valueOf(list.get(0).f()));
        }
    }

    private static final boolean c(G g10) {
        long g11 = v.g(g10.o());
        x.a aVar = x.f23061b;
        return x.g(g11, aVar.b()) || x.g(v.g(g10.o()), aVar.a());
    }

    private static final boolean d(Y y10) {
        return d.d(y10.N()) || y10.n() != null;
    }

    private static final boolean e(d dVar) {
        return ((double) dVar.D1()) > 1.05d;
    }

    private static final G f(G g10, G g11) {
        return g10 == null ? g11 : g10.y(g11);
    }

    private static final float g(long j10, float f10, d dVar) {
        float h10;
        long g10 = v.g(j10);
        x.a aVar = x.f23061b;
        if (x.g(g10, aVar.b())) {
            if (!e(dVar)) {
                return dVar.O0(j10);
            }
            h10 = v.h(j10) / v.h(dVar.t(f10));
        } else if (!x.g(g10, aVar.a())) {
            return Float.NaN;
        } else {
            h10 = v.h(j10);
        }
        return h10 * f10;
    }

    public static final void h(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            u(spannable, new BackgroundColorSpan(C5751x0.k(j10)), i10, i11);
        }
    }

    private static final void i(Spannable spannable, Y1.a aVar, int i10, int i11) {
        if (aVar != null) {
            u(spannable, new Q1.a(aVar.j()), i10, i11);
        }
    }

    private static final void j(Spannable spannable, C5728l0 l0Var, float f10, int i10, int i11) {
        if (l0Var == null) {
            return;
        }
        if (l0Var instanceof j1) {
            k(spannable, ((j1) l0Var).b(), i10, i11);
        } else if (l0Var instanceof e1) {
            u(spannable, new b((e1) l0Var, f10), i10, i11);
        }
    }

    public static final void k(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            u(spannable, new ForegroundColorSpan(C5751x0.k(j10)), i10, i11);
        }
    }

    private static final void l(Spannable spannable, g gVar, int i10, int i11) {
        if (gVar != null) {
            u(spannable, new X1.a(gVar), i10, i11);
        }
    }

    private static final void m(Spannable spannable, Y y10, List<C4669d.c<G>> list, r<? super C4820m, ? super C, ? super C4830x, ? super C4831y, ? extends Typeface> rVar) {
        G g10;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4669d.c<G> cVar = list.get(i10);
            C4669d.c cVar2 = cVar;
            if (d.d((G) cVar2.g()) || ((G) cVar2.g()).m() != null) {
                arrayList.add(cVar);
            }
        }
        if (d(y10)) {
            g10 = new G(0, 0, y10.o(), y10.m(), y10.n(), y10.j(), (String) null, 0, (Y1.a) null, (Y1.o) null, (U1.e) null, 0, (k) null, (g1) null, (D) null, (g) null, 65475, (DefaultConstructorMarker) null);
        } else {
            g10 = null;
        }
        b(g10, arrayList, new a(spannable, rVar));
    }

    private static final void n(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            u(spannable, new Q1.b(str), i10, i11);
        }
    }

    public static final void o(Spannable spannable, long j10, d dVar, int i10, int i11) {
        long g10 = v.g(j10);
        x.a aVar = x.f23061b;
        if (x.g(g10, aVar.b())) {
            u(spannable, new AbsoluteSizeSpan(C17752b.e(dVar.O0(j10)), false), i10, i11);
        } else if (x.g(g10, aVar.a())) {
            u(spannable, new RelativeSizeSpan(v.h(j10)), i10, i11);
        }
    }

    private static final void p(Spannable spannable, Y1.o oVar, int i10, int i11) {
        if (oVar != null) {
            u(spannable, new ScaleXSpan(oVar.b()), i10, i11);
            u(spannable, new m(oVar.c()), i10, i11);
        }
    }

    public static final void q(Spannable spannable, long j10, float f10, d dVar, h hVar) {
        float g10 = g(j10, f10, dVar);
        if (!Float.isNaN(g10)) {
            u(spannable, new Q1.h(g10, 0, (spannable.length() == 0 || C15854t.H1(spannable) == 10) ? spannable.length() + 1 : spannable.length(), h.c.f(hVar.c()), h.c.g(hVar.c()), hVar.b()), 0, spannable.length());
        }
    }

    public static final void r(Spannable spannable, long j10, float f10, d dVar) {
        float g10 = g(j10, f10, dVar);
        if (!Float.isNaN(g10)) {
            u(spannable, new Q1.g(g10), 0, spannable.length());
        }
    }

    public static final void s(Spannable spannable, U1.e eVar, int i10, int i11) {
        if (eVar != null) {
            u(spannable, a.f14644a.a(eVar), i10, i11);
        }
    }

    private static final void t(Spannable spannable, g1 g1Var, int i10, int i11) {
        if (g1Var != null) {
            u(spannable, new l(C5751x0.k(g1Var.c()), C5667g.m(g1Var.d()), C5667g.n(g1Var.d()), d.b(g1Var.b())), i10, i11);
        }
    }

    public static final void u(Spannable spannable, Object obj, int i10, int i11) {
        spannable.setSpan(obj, i10, i11, 33);
    }

    private static final void v(Spannable spannable, C4669d.c<G> cVar, d dVar) {
        int h10 = cVar.h();
        int f10 = cVar.f();
        G g10 = cVar.g();
        i(spannable, g10.e(), h10, f10);
        k(spannable, g10.g(), h10, f10);
        j(spannable, g10.f(), g10.c(), h10, f10);
        x(spannable, g10.s(), h10, f10);
        o(spannable, g10.k(), dVar, h10, f10);
        n(spannable, g10.j(), h10, f10);
        p(spannable, g10.u(), h10, f10);
        s(spannable, g10.p(), h10, f10);
        h(spannable, g10.d(), h10, f10);
        t(spannable, g10.r(), h10, f10);
        l(spannable, g10.h(), h10, f10);
    }

    public static final void w(Spannable spannable, Y y10, List<C4669d.c<G>> list, d dVar, r<? super C4820m, ? super C, ? super C4830x, ? super C4831y, ? extends Typeface> rVar) {
        MetricAffectingSpan a10;
        m(spannable, y10, list, rVar);
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C4669d.c cVar = list.get(i10);
            int h10 = cVar.h();
            int f10 = cVar.f();
            if (h10 >= 0 && h10 < spannable.length() && f10 > h10 && f10 <= spannable.length()) {
                v(spannable, cVar, dVar);
                if (c((G) cVar.g())) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C4669d.c cVar2 = list.get(i11);
                int h11 = cVar2.h();
                int f11 = cVar2.f();
                G g10 = (G) cVar2.g();
                if (h11 >= 0 && h11 < spannable.length() && f11 > h11 && f11 <= spannable.length() && (a10 = a(g10.o(), dVar)) != null) {
                    u(spannable, a10, h11, f11);
                }
            }
        }
    }

    public static final void x(Spannable spannable, k kVar, int i10, int i11) {
        if (kVar != null) {
            k.a aVar = k.f14792b;
            u(spannable, new n(kVar.d(aVar.d()), kVar.d(aVar.b())), i10, i11);
        }
    }

    public static final void y(Spannable spannable, Y1.q qVar, float f10, d dVar) {
        if (qVar == null) {
            return;
        }
        if ((!v.e(qVar.b(), w.i(0)) || !v.e(qVar.c(), w.i(0))) && !w.j(qVar.b()) && !w.j(qVar.c())) {
            long g10 = v.g(qVar.b());
            x.a aVar = x.f23061b;
            float f11 = 0.0f;
            float O02 = x.g(g10, aVar.b()) ? dVar.O0(qVar.b()) : x.g(g10, aVar.a()) ? v.h(qVar.b()) * f10 : 0.0f;
            long g11 = v.g(qVar.c());
            if (x.g(g11, aVar.b())) {
                f11 = dVar.O0(qVar.c());
            } else if (x.g(g11, aVar.a())) {
                f11 = v.h(qVar.c()) * f10;
            }
            u(spannable, new LeadingMarginSpan.Standard((int) ((float) Math.ceil((double) O02)), (int) ((float) Math.ceil((double) f11))), 0, spannable.length());
        }
    }
}
