package UL;

import GK.C15777E;
import QL.h;
import java.io.IOException;

/* renamed from: UL.d  reason: case insensitive filesystem */
final class C16645d implements h<C15777E, Character> {

    /* renamed from: a  reason: collision with root package name */
    static final C16645d f139265a = new C16645d();

    C16645d() {
    }

    /* renamed from: b */
    public Character a(C15777E e10) {
        String l10 = e10.l();
        if (l10.length() == 1) {
            return Character.valueOf(l10.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + l10.length());
    }
}
