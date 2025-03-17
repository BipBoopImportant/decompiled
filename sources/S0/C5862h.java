package s0;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import i1.C5437c;
import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ls0/h;", "Ls0/g;", "<init>", "()V", "Landroidx/compose/ui/d;", "", "weight", "", "fill", "a", "(Landroidx/compose/ui/d;FZ)Landroidx/compose/ui/d;", "Li1/c$b;", "alignment", "b", "(Landroidx/compose/ui/d;Li1/c$b;)Landroidx/compose/ui/d;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.h  reason: case insensitive filesystem */
public final class C5862h implements C5861g {

    /* renamed from: a  reason: collision with root package name */
    public static final C5862h f28810a = new C5862h();

    private C5862h() {
    }

    public d a(d dVar, float f10, boolean z10) {
        if (((double) f10) > 0.0d) {
            return dVar.s(new LayoutWeightElement(C17978n.h(f10, Float.MAX_VALUE), z10));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    public d b(d dVar, C5437c.b bVar) {
        return dVar.s(new HorizontalAlignElement(bVar));
    }
}
