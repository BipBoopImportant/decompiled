package G6;

import H6.c;

/* renamed from: G6.n  reason: case insensitive filesystem */
class C6519n {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36205a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    static B6.c a(c cVar) {
        cVar.e();
        String str = null;
        String str2 = null;
        float f10 = 0.0f;
        String str3 = null;
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36205a);
            if (n10 == 0) {
                str = cVar.C1();
            } else if (n10 == 1) {
                str3 = cVar.C1();
            } else if (n10 == 2) {
                str2 = cVar.C1();
            } else if (n10 != 3) {
                cVar.o();
                cVar.a0();
            } else {
                f10 = (float) cVar.d2();
            }
        }
        cVar.g();
        return new B6.c(str, str3, str2, f10);
    }
}
