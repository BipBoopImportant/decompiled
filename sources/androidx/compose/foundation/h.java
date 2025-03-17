package androidx.compose.foundation;

import androidx.compose.ui.d;
import kotlin.Metadata;
import r0.m;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "Lr0/m;", "interactionSource", "", "enabled", "a", "(Landroidx/compose/ui/d;Lr0/m;Z)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {
    public static final d a(d dVar, m mVar, boolean z10) {
        return dVar.s(z10 ? new HoverableElement(mVar) : d.f18749a);
    }

    public static /* synthetic */ d b(d dVar, m mVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(dVar, mVar, z10);
    }
}
