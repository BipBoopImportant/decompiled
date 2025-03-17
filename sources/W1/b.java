package W1;

import N1.A;
import N1.B;
import N1.C4669d;
import android.text.Spannable;
import androidx.emoji2.text.j;
import c2.d;
import c2.v;
import c2.x;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0015\u001a\u00020\u000b*\u00020\u00108BX\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u001b\u001a\u00020\u000b*\u00020\u00168BX\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroid/text/Spannable;", "", "LN1/d$c;", "LN1/A;", "placeholders", "Lc2/d;", "density", "LXH/N;", "d", "(Landroid/text/Spannable;Ljava/util/List;Lc2/d;)V", "placeholder", "", "start", "end", "c", "(Landroid/text/Spannable;LN1/A;IILc2/d;)V", "Lc2/v;", "a", "(J)I", "getSpanUnit--R2X_6o$annotations", "(J)V", "spanUnit", "LN1/B;", "b", "(I)I", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "spanVerticalAlign", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    private static final int a(long j10) {
        long g10 = v.g(j10);
        x.a aVar = x.f23061b;
        if (x.g(g10, aVar.b())) {
            return 0;
        }
        return x.g(g10, aVar.a()) ? 1 : 2;
    }

    private static final int b(int i10) {
        B.a aVar = B.f9272a;
        if (B.i(i10, aVar.a())) {
            return 0;
        }
        if (B.i(i10, aVar.g())) {
            return 1;
        }
        if (B.i(i10, aVar.b())) {
            return 2;
        }
        if (B.i(i10, aVar.c())) {
            return 3;
        }
        if (B.i(i10, aVar.f())) {
            return 4;
        }
        if (B.i(i10, aVar.d())) {
            return 5;
        }
        if (B.i(i10, aVar.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    private static final void c(Spannable spannable, A a10, int i10, int i11, d dVar) {
        for (Object obj : spannable.getSpans(i10, i11, j.class)) {
            spannable.removeSpan((j) obj);
        }
        c.u(spannable, new Q1.j(v.h(a10.c()), a(a10.c()), v.h(a10.a()), a(a10.a()), dVar.D1() * dVar.getDensity(), b(a10.b())), i10, i11);
    }

    public static final void d(Spannable spannable, List<C4669d.c<A>> list, d dVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4669d.c cVar = list.get(i10);
            c(spannable, (A) cVar.a(), cVar.b(), cVar.c(), dVar);
        }
    }
}
