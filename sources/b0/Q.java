package B0;

import HJ.C15854t;
import N1.C4683s;
import N1.C4688x;
import N1.Y;
import S1.C4820m;
import YH.C16877v;
import c2.c;
import c2.d;
import c2.s;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0010\u001a\u00020\u00068\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LN1/Y;", "style", "Lc2/d;", "density", "LS1/m$b;", "fontFamilyResolver", "", "text", "", "maxLines", "Lc2/r;", "a", "(LN1/Y;Lc2/d;LS1/m$b;Ljava/lang/String;I)J", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "EmptyTextReplacement", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4601a = C15854t.M("H", 10);

    public static final long a(Y y10, d dVar, C4820m.b bVar, String str, int i10) {
        String str2 = str;
        Y y11 = y10;
        C4683s b10 = C4688x.b(str2, y11, c.b(0, 0, 0, 0, 15, (Object) null), dVar, bVar, C16877v.n(), (List) null, i10, false, 64, (Object) null);
        return s.a(M.a(b10.d()), M.a(b10.getHeight()));
    }

    public static /* synthetic */ long b(Y y10, d dVar, C4820m.b bVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = f4601a;
        }
        if ((i11 & 16) != 0) {
            i10 = 1;
        }
        return a(y10, dVar, bVar, str, i10);
    }

    public static final String c() {
        return f4601a;
    }
}
