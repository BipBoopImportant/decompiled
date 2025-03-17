package S1;

import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fJ\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"LS1/O;", "LS1/L;", "<init>", "()V", "", "familyName", "LS1/C;", "weight", "LS1/x;", "style", "Landroid/graphics/Typeface;", "d", "(Ljava/lang/String;LS1/C;I)Landroid/graphics/Typeface;", "genericFontFamily", "fontWeight", "fontStyle", "c", "a", "(LS1/C;I)Landroid/graphics/Typeface;", "LS1/G;", "name", "b", "(LS1/G;LS1/C;I)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class O implements L {
    private final Typeface c(String str, C c10, int i10) {
        if (C4830x.f(i10, C4830x.f13449b.b()) && C17542s.e(c10, C.f13316b.d()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int c11 = C4813f.c(c10, i10);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(c11) : Typeface.create(str, c11);
    }

    private final Typeface d(String str, C c10, int i10) {
        if (str.length() == 0) {
            return null;
        }
        Typeface c11 = c(str, c10, i10);
        if (C17542s.e(c11, Typeface.create(Typeface.DEFAULT, C4813f.c(c10, i10))) || C17542s.e(c11, c((String) null, c10, i10))) {
            return null;
        }
        return c11;
    }

    public Typeface a(C c10, int i10) {
        return c((String) null, c10, i10);
    }

    public Typeface b(G g10, C c10, int i10) {
        Typeface d10 = d(P.b(g10.q(), c10), c10, i10);
        return d10 == null ? c(g10.q(), c10, i10) : d10;
    }
}
