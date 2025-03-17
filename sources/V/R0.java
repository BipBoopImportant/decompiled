package v;

import C.C4410s;
import w.C6172g;

public final class R0 {
    public static C4410s a(C6172g gVar) {
        int d10 = gVar.d();
        int i10 = 1;
        if (d10 != 1) {
            i10 = 2;
            if (d10 != 2) {
                i10 = 3;
                if (d10 != 3) {
                    i10 = 4;
                    if (d10 != 4) {
                        i10 = 5;
                        if (d10 != 5) {
                            i10 = d10 != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new C4410s(i10, (Throwable) gVar);
    }
}
