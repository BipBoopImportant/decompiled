package s0;

import E1.C4469b;
import E1.C4483p;
import E1.L;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.WithAlignmentLineBlockElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.ui.d;
import i1.C5437c;
import kotlin.Metadata;
import nI.C17642l;
import tI.C17978n;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0004*\u00020\u0004H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ls0/N;", "Ls0/M;", "<init>", "()V", "Landroidx/compose/ui/d;", "", "weight", "", "fill", "a", "(Landroidx/compose/ui/d;FZ)Landroidx/compose/ui/d;", "Li1/c$c;", "alignment", "c", "(Landroidx/compose/ui/d;Li1/c$c;)Landroidx/compose/ui/d;", "LE1/p;", "alignmentLine", "f", "(Landroidx/compose/ui/d;LE1/p;)Landroidx/compose/ui/d;", "b", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "Lkotlin/Function1;", "LE1/L;", "", "alignmentLineBlock", "d", "(Landroidx/compose/ui/d;LnI/l;)Landroidx/compose/ui/d;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.N  reason: case insensitive filesystem */
public final class C5843N implements C5842M {

    /* renamed from: a  reason: collision with root package name */
    public static final C5843N f28726a = new C5843N();

    private C5843N() {
    }

    public d a(d dVar, float f10, boolean z10) {
        if (((double) f10) > 0.0d) {
            return dVar.s(new LayoutWeightElement(C17978n.h(f10, Float.MAX_VALUE), z10));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    public d b(d dVar) {
        return f(dVar, C4469b.a());
    }

    public d c(d dVar, C5437c.C0386c cVar) {
        return dVar.s(new VerticalAlignElement(cVar));
    }

    public d d(d dVar, C17642l<? super L, Integer> lVar) {
        return dVar.s(new WithAlignmentLineBlockElement(lVar));
    }

    public d f(d dVar, C4483p pVar) {
        return dVar.s(new WithAlignmentLineElement(pVar));
    }
}
