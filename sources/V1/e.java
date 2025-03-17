package V1;

import G2.t;
import N1.A;
import N1.C4669d;
import N1.C4686v;
import N1.G;
import N1.Y;
import S1.C4820m;
import Y1.l;
import c2.d;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aW\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"LY1/l;", "textDirection", "LU1/e;", "localeList", "", "d", "(ILU1/e;)I", "", "text", "LN1/Y;", "style", "", "LN1/d$c;", "LN1/G;", "spanStyles", "LN1/A;", "placeholders", "Lc2/d;", "density", "LS1/m$b;", "fontFamilyResolver", "LN1/v;", "a", "(Ljava/lang/String;LN1/Y;Ljava/util/List;Ljava/util/List;Lc2/d;LS1/m$b;)LN1/v;", "", "c", "(LN1/Y;)Z", "hasEmojiCompat", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final C4686v a(String str, Y y10, List<C4669d.c<G>> list, List<C4669d.c<A>> list2, d dVar, C4820m.b bVar) {
        return new d(str, y10, list, list2, bVar, dVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean c(N1.Y r1) {
        /*
            N1.E r1 = r1.w()
            if (r1 == 0) goto L_0x0015
            N1.C r1 = r1.a()
            if (r1 == 0) goto L_0x0015
            int r1 = r1.b()
            N1.j r1 = N1.C4675j.d(r1)
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            N1.j$a r0 = N1.C4675j.f9464b
            int r0 = r0.c()
            if (r1 != 0) goto L_0x0020
            r1 = 0
            goto L_0x0028
        L_0x0020:
            int r1 = r1.j()
            boolean r1 = N1.C4675j.g(r1, r0)
        L_0x0028:
            r1 = r1 ^ 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.e.c(N1.Y):boolean");
    }

    public static final int d(int i10, U1.e eVar) {
        Locale locale;
        l.a aVar = l.f14797b;
        if (l.j(i10, aVar.b())) {
            return 2;
        }
        if (!l.j(i10, aVar.c())) {
            if (l.j(i10, aVar.d())) {
                return 0;
            }
            if (l.j(i10, aVar.e())) {
                return 1;
            }
            if (l.j(i10, aVar.a()) ? true : l.j(i10, aVar.f())) {
                if (eVar == null || (locale = eVar.k(0).a()) == null) {
                    locale = Locale.getDefault();
                }
                int a10 = t.a(locale);
                if (a10 == 0 || a10 != 1) {
                    return 2;
                }
            } else {
                throw new IllegalStateException("Invalid TextDirection.");
            }
        }
        return 3;
    }
}
