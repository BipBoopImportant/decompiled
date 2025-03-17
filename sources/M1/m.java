package m1;

import androidx.compose.ui.d;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.I0;
import p1.c1;
import p1.i1;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aF\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/d;", "Lc2/h;", "elevation", "Lp1/i1;", "shape", "", "clip", "Lp1/v0;", "ambientColor", "spotColor", "a", "(Landroidx/compose/ui/d;FLp1/i1;ZJJ)Landroidx/compose/ui/d;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {
    public static final d a(d dVar, float f10, i1 i1Var, boolean z10, long j10, long j11) {
        float f11 = f10;
        if (h.v(f10, h.B((float) 0)) <= 0 && !z10) {
            return dVar;
        }
        d dVar2 = dVar;
        return dVar.s(new ShadowGraphicsLayerElement(f10, i1Var, z10, j10, j11, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ d b(d dVar, float f10, i1 i1Var, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        i1 a10 = (i10 & 2) != 0 ? c1.a() : i1Var;
        if ((i10 & 4) != 0) {
            z11 = false;
            float f11 = f10;
            if (h.v(f10, h.B((float) 0)) > 0) {
                z11 = true;
            }
        } else {
            float f12 = f10;
            z11 = z10;
        }
        return a(dVar, f10, a10, z11, (i10 & 8) != 0 ? I0.a() : j10, (i10 & 16) != 0 ? I0.a() : j11);
    }
}
