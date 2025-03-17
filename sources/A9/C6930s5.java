package a9;

import G8.g;
import com.google.protobuf.C9575h;
import d9.C7767m;
import d9.I;
import d9.Y;
import d9.b0;
import d9.i0;
import d9.j0;
import kotlin.jvm.internal.C17542s;
import z8.C9036b;

/* renamed from: a9.s5  reason: case insensitive filesystem */
public final class C6930s5 {
    public static Y a(C9036b bVar) {
        C17542s.j(bVar, "viewLight");
        i0.a aVar = i0.f50795b;
        Y.a r10 = Y.r();
        C17542s.i(r10, "newBuilder()");
        i0 a10 = aVar.a(r10);
        a10.f(bVar.r());
        C17542s.j(bVar, "viewLight");
        j0.a aVar2 = j0.f50799b;
        b0.a t10 = b0.t();
        C17542s.i(t10, "newBuilder()");
        j0 a11 = aVar2.a(t10);
        a11.j(bVar.p());
        a11.k(bVar.q());
        a11.i(bVar.w());
        a11.g(bVar.l());
        String u10 = bVar.u();
        if (u10 != null) {
            a11.e(u10);
            byte[] k10 = bVar.k();
            if (k10 != null) {
                C9575h m10 = C9575h.m(k10);
                C17542s.i(m10, "copyFrom(encodeBitmap)");
                a11.d(m10);
            }
        } else {
            a11.c(g.o(bVar.g()));
        }
        a11.b(bVar.t());
        a11.h(bVar.E());
        a11.f(bVar.A());
        a10.g(a11.a());
        Y.b b10 = Y.b.b(bVar.F() ? 3 : 2);
        C17542s.i(b10, "forNumber(viewFormat)");
        a10.d(b10);
        if (!(bVar.i() == null && bVar.m() == null)) {
            C7767m.a aVar3 = C7767m.f50807b;
            I.a k11 = I.k();
            C17542s.i(k11, "newBuilder()");
            C7767m a12 = aVar3.a(k11);
            String i10 = bVar.i();
            String str = "";
            if (i10 == null) {
                i10 = str;
            }
            a12.b(i10);
            String m11 = bVar.m();
            if (m11 != null) {
                str = m11;
            }
            a12.c(str);
            a10.e(a12.a());
        }
        for (C9036b a13 : bVar.h()) {
            a10.b(a10.c(), a(a13));
        }
        return a10.a();
    }
}
