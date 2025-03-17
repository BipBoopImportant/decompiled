package IC;

import G2.b;
import HJ.C15854t;
import J1.j;
import N1.C4669d;
import N1.D;
import N1.G;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.C4889m;
import U0.C4895p;
import U1.e;
import Y1.a;
import Y1.k;
import Y1.o;
import YH.C16877v;
import android.content.Context;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.g1;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import r1.g;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "originalText", "styledText", "LN1/G;", "style", "LN1/d;", "e", "(Ljava/lang/String;Ljava/lang/String;LN1/G;)LN1/d;", "", "stringId", "a", "(ILU0/m;I)LN1/d;", "htmlString", "b", "(Ljava/lang/String;LU0/m;I)LN1/d;", "stringArg", "styleForArg", "c", "(ILjava/lang/String;LN1/G;LU0/m;I)LN1/d;", "Landroid/text/Spanned;", "text", "d", "(Landroid/text/Spanned;)LN1/d;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: IC.c  reason: case insensitive filesystem */
public final class C13021c {
    public static final C4669d a(int i10, C4889m mVar, int i11) {
        mVar.W(1921749511);
        if (C4895p.J()) {
            C4895p.S(1921749511, i11, -1, "com.ingka.ikea.ui.common.annotatedStringFromHtmlResource (StringComposables.kt:51)");
        }
        C4669d b10 = b(((Context) mVar.Q(AndroidCompositionLocals_androidKt.g())).getResources().getText(i10).toString(), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return b10;
    }

    public static final C4669d b(String str, C4889m mVar, int i10) {
        C17542s.j(str, "htmlString");
        mVar.W(2048759700);
        if (C4895p.J()) {
            C4895p.S(2048759700, i10, -1, "com.ingka.ikea.ui.common.annotatedStringFromHtmlString (StringComposables.kt:63)");
        }
        mVar.W(322604508);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && mVar.V(str)) || (i10 & 6) == 4;
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            Spanned a10 = b.a(str, 0);
            C17542s.i(a10, "fromHtml(...)");
            D10 = d(a10);
            mVar.u(D10);
        }
        C4669d dVar = (C4669d) D10;
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return dVar;
    }

    public static final C4669d c(int i10, String str, G g10, C4889m mVar, int i11) {
        C17542s.j(str, "stringArg");
        C17542s.j(g10, "styleForArg");
        mVar.W(2141257213);
        if (C4895p.J()) {
            C4895p.S(2141257213, i11, -1, "com.ingka.ikea.ui.common.annotatedStringWithStyledArg (StringComposables.kt:82)");
        }
        String c10 = j.c(i10, new Object[]{str}, mVar, i11 & 14);
        int s02 = C15854t.s0(c10, str, 0, false, 6, (Object) null);
        C4669d dVar = new C4669d(c10, C16877v.e(new C4669d.c(g10, s02, str.length() + s02)), (List) null, 4, (DefaultConstructorMarker) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return dVar;
    }

    private static final C4669d d(Spanned spanned) {
        Spanned spanned2 = spanned;
        ArrayList arrayList = new ArrayList();
        Object[] spans = spanned2.getSpans(0, spanned.length(), UnderlineSpan.class);
        C17542s.i(spans, "getSpans(...)");
        ArrayList arrayList2 = new ArrayList(spans.length);
        for (Object obj : spans) {
            UnderlineSpan underlineSpan = (UnderlineSpan) obj;
            G g10 = r10;
            G g11 = new G(0, 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (a) null, (o) null, (e) null, 0, k.f14792b.d(), (g1) null, (D) null, (g) null, 61439, (DefaultConstructorMarker) null);
            arrayList2.add(new C4669d.c(g10, spanned2.getSpanStart(underlineSpan), spanned2.getSpanEnd(underlineSpan)));
        }
        arrayList.addAll(arrayList2);
        Object[] spans2 = spanned2.getSpans(0, spanned.length(), StyleSpan.class);
        C17542s.i(spans2, "getSpans(...)");
        ArrayList arrayList3 = new ArrayList(spans2.length);
        for (Object obj2 : spans2) {
            StyleSpan styleSpan = (StyleSpan) obj2;
            G g12 = r8;
            G g13 = new G(0, 0, C.f13316b.a(), (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (a) null, (o) null, (e) null, 0, (k) null, (g1) null, (D) null, (g) null, 65531, (DefaultConstructorMarker) null);
            arrayList3.add(new C4669d.c(g12, spanned2.getSpanStart(styleSpan), spanned2.getSpanEnd(styleSpan)));
        }
        arrayList.addAll(arrayList3);
        return new C4669d(spanned.toString(), arrayList, (List) null, 4, (DefaultConstructorMarker) null);
    }

    public static final C4669d e(String str, String str2, G g10) {
        C17542s.j(str, "originalText");
        C17542s.j(str2, "styledText");
        C17542s.j(g10, "style");
        C4669d.a aVar = new C4669d.a(0, 1, (DefaultConstructorMarker) null);
        int s02 = C15854t.s0(str, str2, 0, false, 6, (Object) null);
        int length = str2.length() + s02;
        aVar.j(str);
        if (s02 <= -1 || length > str.length()) {
            IllegalStateException illegalStateException = new IllegalStateException("Could not find the " + str2 + " in the " + str);
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                if (str4 == null) {
                    String name = C4669d.a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str4, false, illegalStateException, str3);
            }
        } else {
            aVar.d(g10, s02, length);
        }
        return aVar.q();
    }
}
