package G;

import C.B;
import androidx.camera.core.impl.Z0;
import java.util.ArrayList;

public final class o {
    public static B a(Z0 z02, B b10) {
        boolean z10;
        if (z02 == null) {
            return b10;
        }
        B.a aVar = new B.a(b10);
        boolean z11 = true;
        if (b10.c().isEmpty() || b(z02, 1, 2)) {
            z10 = false;
        } else {
            aVar.c(1);
            z10 = true;
        }
        if (!b10.b().isEmpty() && !b(z02, 3)) {
            aVar.c(2);
            z10 = true;
        }
        if (b10.d().isEmpty() || b(z02, 4)) {
            z11 = z10;
        } else {
            aVar.c(4);
        }
        if (!z11) {
            return b10;
        }
        B b11 = aVar.b();
        if (!b11.c().isEmpty() || !b11.b().isEmpty() || !b11.d().isEmpty()) {
            return aVar.b();
        }
        return null;
    }

    public static boolean b(Z0 z02, int... iArr) {
        if (z02 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return z02.g().containsAll(arrayList);
    }
}
