package kb;

import jb.l;

/* renamed from: kb.i  reason: case insensitive filesystem */
final class C9954i {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    static int b(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    static void c(boolean z10) {
        l.p(z10, "no calls to next() since the last call to remove()");
    }
}
