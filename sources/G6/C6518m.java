package G6;

import B6.d;
import D6.q;
import H6.c;
import java.util.ArrayList;
import w6.C8927i;

/* renamed from: G6.m  reason: case insensitive filesystem */
class C6518m {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36203a = c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f36204b = c.a.a("shapes");

    static d a(c cVar, C8927i iVar) {
        ArrayList arrayList = new ArrayList();
        cVar.e();
        double d10 = 0.0d;
        String str = null;
        String str2 = null;
        char c10 = 0;
        double d11 = 0.0d;
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36203a);
            if (n10 == 0) {
                c10 = cVar.C1().charAt(0);
            } else if (n10 == 1) {
                d11 = cVar.d2();
            } else if (n10 == 2) {
                d10 = cVar.d2();
            } else if (n10 == 3) {
                str = cVar.C1();
            } else if (n10 == 4) {
                str2 = cVar.C1();
            } else if (n10 != 5) {
                cVar.o();
                cVar.a0();
            } else {
                cVar.e();
                while (cVar.hasNext()) {
                    if (cVar.n(f36204b) != 0) {
                        cVar.o();
                        cVar.a0();
                    } else {
                        cVar.d();
                        while (cVar.hasNext()) {
                            arrayList.add((q) C6513h.a(cVar, iVar));
                        }
                        cVar.f();
                    }
                }
                cVar.g();
            }
        }
        cVar.g();
        return new d(arrayList, c10, d11, d10, str, str2);
    }
}
