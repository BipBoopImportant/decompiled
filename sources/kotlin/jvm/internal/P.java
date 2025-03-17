package kotlin.jvm.internal;

import java.util.Collections;
import uI.C18055d;
import uI.C18058g;
import uI.C18059h;
import uI.C18061j;
import uI.C18062k;
import uI.C18065n;
import uI.C18066o;
import uI.C18067p;
import uI.C18068q;
import uI.C18070s;
import xI.b1;

public class P {

    /* renamed from: a  reason: collision with root package name */
    private static final Q f144349a;

    /* renamed from: b  reason: collision with root package name */
    private static final C18055d[] f144350b = new C18055d[0];

    static {
        Q q10 = null;
        try {
            q10 = b1.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (q10 == null) {
            q10 = new Q();
        }
        f144349a = q10;
    }

    public static C18059h a(C17539o oVar) {
        return f144349a.a(oVar);
    }

    public static C18055d b(Class cls) {
        return f144349a.b(cls);
    }

    public static C18058g c(Class cls) {
        return f144349a.c(cls, "");
    }

    public static C18061j d(C17547x xVar) {
        return f144349a.d(xVar);
    }

    public static C18062k e(C17549z zVar) {
        return f144349a.e(zVar);
    }

    public static C18068q f(Class cls) {
        return f144349a.k(b(cls), Collections.emptyList(), true);
    }

    public static C18065n g(D d10) {
        return f144349a.f(d10);
    }

    public static C18066o h(F f10) {
        return f144349a.g(f10);
    }

    public static C18067p i(H h10) {
        return f144349a.h(h10);
    }

    public static String j(C17538n nVar) {
        return f144349a.i(nVar);
    }

    public static String k(C17544u uVar) {
        return f144349a.j(uVar);
    }

    public static C18068q l(Class cls) {
        return f144349a.k(b(cls), Collections.emptyList(), false);
    }

    public static C18068q m(Class cls, C18070s sVar) {
        return f144349a.k(b(cls), Collections.singletonList(sVar), false);
    }
}
