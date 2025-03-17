package androidx.compose.ui.draw;

import E1.C4478k;
import i1.C5437c;
import kotlin.Metadata;
import p1.C5749w0;
import t1.C5942c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/d;", "Lt1/c;", "painter", "", "sizeToIntrinsics", "Li1/c;", "alignment", "LE1/k;", "contentScale", "", "alpha", "Lp1/w0;", "colorFilter", "a", "(Landroidx/compose/ui/d;Lt1/c;ZLi1/c;LE1/k;FLp1/w0;)Landroidx/compose/ui/d;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, C5942c cVar, boolean z10, C5437c cVar2, C4478k kVar, float f10, C5749w0 w0Var) {
        return dVar.s(new PainterElement(cVar, z10, cVar2, kVar, f10, w0Var));
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, C5942c cVar, boolean z10, C5437c cVar2, C4478k kVar, float f10, C5749w0 w0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            cVar2 = C5437c.f24302a.e();
        }
        C5437c cVar3 = cVar2;
        if ((i10 & 8) != 0) {
            kVar = C4478k.f5915a.f();
        }
        C4478k kVar2 = kVar;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            w0Var = null;
        }
        return a(dVar, cVar, z11, cVar3, kVar2, f11, w0Var);
    }
}
