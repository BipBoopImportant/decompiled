package G6;

import C6.b;
import C6.d;
import C6.f;
import C6.g;
import C6.h;
import C6.j;
import H6.c;
import J6.a;
import java.util.List;
import w6.C8927i;

/* renamed from: G6.d  reason: case insensitive filesystem */
public class C6509d {
    private static <T> List<a<T>> a(c cVar, float f10, C8927i iVar, N<T> n10) {
        return u.a(cVar, iVar, f10, n10, false);
    }

    private static <T> List<a<T>> b(c cVar, C8927i iVar, N<T> n10) {
        return u.a(cVar, iVar, 1.0f, n10, false);
    }

    static C6.a c(c cVar, C8927i iVar) {
        return new C6.a(b(cVar, iVar, C6512g.f36186a));
    }

    static j d(c cVar, C8927i iVar) {
        return new j(a(cVar, I6.j.e(), iVar, C6514i.f36188a));
    }

    public static b e(c cVar, C8927i iVar) {
        return f(cVar, iVar, true);
    }

    public static b f(c cVar, C8927i iVar, boolean z10) {
        return new b(a(cVar, z10 ? I6.j.e() : 1.0f, iVar, C6517l.f36202a));
    }

    static C6.c g(c cVar, C8927i iVar, int i10) {
        return new C6.c(b(cVar, iVar, new o(i10)));
    }

    static d h(c cVar, C8927i iVar) {
        return new d(b(cVar, iVar, r.f36212a));
    }

    static f i(c cVar, C8927i iVar) {
        return new f(u.a(cVar, iVar, I6.j.e(), B.f36164a, true));
    }

    static g j(c cVar, C8927i iVar) {
        return new g(b(cVar, iVar, G.f36169a));
    }

    static h k(c cVar, C8927i iVar) {
        return new h(a(cVar, I6.j.e(), iVar, H.f36170a));
    }
}
