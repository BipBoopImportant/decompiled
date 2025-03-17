package kotlin.jvm.internal;

import java.util.List;
import uI.C18055d;
import uI.C18057f;
import uI.C18058g;
import uI.C18059h;
import uI.C18061j;
import uI.C18062k;
import uI.C18065n;
import uI.C18066o;
import uI.C18067p;
import uI.C18068q;
import uI.C18070s;

public class Q {
    public C18059h a(C17539o oVar) {
        return oVar;
    }

    public C18055d b(Class cls) {
        return new C17533i(cls);
    }

    public C18058g c(Class cls, String str) {
        return new C(cls, str);
    }

    public C18061j d(C17547x xVar) {
        return xVar;
    }

    public C18062k e(C17549z zVar) {
        return zVar;
    }

    public C18065n f(D d10) {
        return d10;
    }

    public C18066o g(F f10) {
        return f10;
    }

    public C18067p h(H h10) {
        return h10;
    }

    public String i(C17538n nVar) {
        String obj = nVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String j(C17544u uVar) {
        return i(uVar);
    }

    public C18068q k(C18057f fVar, List<C18070s> list, boolean z10) {
        return new Z(fVar, list, z10);
    }
}
