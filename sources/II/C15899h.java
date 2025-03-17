package II;

import HJ.C15854t;
import cJ.C17065b;

/* renamed from: II.h  reason: case insensitive filesystem */
public final class C15899h {
    /* access modifiers changed from: private */
    public static final String b(C17065b bVar) {
        String P10 = C15854t.P(bVar.g().a(), '.', '$', false, 4, (Object) null);
        if (bVar.f().c()) {
            return P10;
        }
        return bVar.f() + '.' + P10;
    }
}
