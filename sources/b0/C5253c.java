package b0;

import Z.c;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C5031k0;

/* renamed from: b0.c  reason: case insensitive filesystem */
public class C5253c {
    public static C5031k0.c a(C5031k0.c cVar, Size size, Range<Integer> range) {
        return C5031k0.c.a(cVar.e(), cVar.i(), c.e(cVar.c(), cVar.b(), cVar.b(), cVar.f(), cVar.f(), size.getWidth(), cVar.k(), size.getHeight(), cVar.h(), range), cVar.f(), size.getWidth(), size.getHeight(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    public static C5031k0.c b(C5031k0 k0Var) {
        if (k0Var == null || k0Var.b().isEmpty()) {
            return null;
        }
        return k0Var.b().get(0);
    }
}
