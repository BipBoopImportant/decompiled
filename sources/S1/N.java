package S1;

import S1.C4830x;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LS1/N;", "LS1/L;", "<init>", "()V", "", "genericFontFamily", "LS1/C;", "fontWeight", "LS1/x;", "fontStyle", "Landroid/graphics/Typeface;", "c", "(Ljava/lang/String;LS1/C;I)Landroid/graphics/Typeface;", "a", "(LS1/C;I)Landroid/graphics/Typeface;", "LS1/G;", "name", "b", "(LS1/G;LS1/C;I)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class N implements L {
    private final Typeface c(String str, C c10, int i10) {
        C4830x.a aVar = C4830x.f13449b;
        if (C4830x.f(i10, aVar.b()) && C17542s.e(c10, C.f13316b.d()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c10.F(), C4830x.f(i10, aVar.a()));
    }

    public Typeface a(C c10, int i10) {
        return c((String) null, c10, i10);
    }

    public Typeface b(G g10, C c10, int i10) {
        return c(g10.q(), c10, i10);
    }
}
