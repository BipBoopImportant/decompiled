package rd;

final class o extends c {
    o() {
    }

    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c10 = hVar.c();
            hVar.f76390f++;
            c(c10, sb2);
            if (sb2.length() % 3 == 0) {
                c.h(hVar, sb2);
                if (j.n(hVar.d(), hVar.f76390f, f()) != f()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        g(hVar, sb2);
    }

    /* access modifiers changed from: package-private */
    public int c(char c10, StringBuilder sb2) {
        if (c10 == 13) {
            sb2.append(0);
        } else if (c10 == ' ') {
            sb2.append(3);
        } else if (c10 == '*') {
            sb2.append(1);
        } else if (c10 == '>') {
            sb2.append(2);
        } else if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) (c10 - ','));
        } else if (c10 < 'A' || c10 > 'Z') {
            j.e(c10);
        } else {
            sb2.append((char) (c10 - '3'));
        }
        return 1;
    }

    public int f() {
        return 3;
    }

    /* access modifiers changed from: package-private */
    public void g(h hVar, StringBuilder sb2) {
        hVar.p();
        int a10 = hVar.g().a() - hVar.a();
        hVar.f76390f -= sb2.length();
        if (hVar.f() > 1 || a10 > 1 || hVar.f() != a10) {
            hVar.r(254);
        }
        if (hVar.e() < 0) {
            hVar.o(0);
        }
    }
}
