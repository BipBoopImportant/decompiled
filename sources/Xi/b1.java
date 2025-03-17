package xI;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C17530f;
import kotlin.jvm.internal.C17532h;
import kotlin.jvm.internal.C17539o;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.C17547x;
import kotlin.jvm.internal.C17549z;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Q;
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
import vI.C18193f;

public class b1 extends Q {
    private static C18629d0 l(C17530f fVar) {
        C18058g owner = fVar.getOwner();
        return owner instanceof C18629d0 ? (C18629d0) owner : C18642k.f152431d;
    }

    public C18059h a(C17539o oVar) {
        return new C18639i0(l(oVar), oVar.getName(), oVar.getSignature(), oVar.getBoundReceiver());
    }

    public C18055d b(Class cls) {
        return C18636h.m(cls);
    }

    public C18058g c(Class cls, String str) {
        return C18636h.n(cls);
    }

    public C18061j d(C17547x xVar) {
        return new C18643k0(l(xVar), xVar.getName(), xVar.getSignature(), xVar.getBoundReceiver());
    }

    public C18062k e(C17549z zVar) {
        return new C18647m0(l(zVar), zVar.getName(), zVar.getSignature(), zVar.getBoundReceiver());
    }

    public C18065n f(D d10) {
        return new B0(l(d10), d10.getName(), d10.getSignature(), d10.getBoundReceiver());
    }

    public C18066o g(F f10) {
        return new E0(l(f10), f10.getName(), f10.getSignature(), f10.getBoundReceiver());
    }

    public C18067p h(H h10) {
        return new H0(l(h10), h10.getName(), h10.getSignature());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = xI.j1.c(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String i(kotlin.jvm.internal.C17538n r2) {
        /*
            r1 = this;
            uI.h r0 = wI.d.a(r2)
            if (r0 == 0) goto L_0x0017
            xI.i0 r0 = xI.j1.c(r0)
            if (r0 == 0) goto L_0x0017
            xI.e1 r2 = xI.e1.f152401a
            DI.z r0 = r0.d0()
            java.lang.String r2 = r2.h(r0)
            return r2
        L_0x0017:
            java.lang.String r2 = super.i(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xI.b1.i(kotlin.jvm.internal.n):java.lang.String");
    }

    public String j(C17544u uVar) {
        return i(uVar);
    }

    public C18068q k(C18057f fVar, List<C18070s> list, boolean z10) {
        return fVar instanceof C17532h ? C18636h.k(((C17532h) fVar).l(), list, z10) : C18193f.b(fVar, list, z10, Collections.emptyList());
    }
}
