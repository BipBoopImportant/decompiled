package P3;

import kb.C9967v;
import kb.e0;
import t3.B;

final class f implements C6684a {

    /* renamed from: a  reason: collision with root package name */
    public final C9967v<C6684a> f39362a;

    /* renamed from: b  reason: collision with root package name */
    private final int f39363b;

    private f(int i10, C9967v<C6684a> vVar) {
        this.f39363b = i10;
        this.f39362a = vVar;
    }

    private static C6684a a(int i10, int i11, B b10) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, b10);
            case 1751742049:
                return c.b(b10);
            case 1752331379:
                return d.c(b10);
            case 1852994675:
                return h.a(b10);
            default:
                return null;
        }
    }

    public static f c(int i10, B b10) {
        C9967v.a aVar = new C9967v.a();
        int g10 = b10.g();
        int i11 = -2;
        while (b10.a() > 8) {
            int u10 = b10.u();
            int f10 = b10.f() + b10.u();
            b10.V(f10);
            C6684a c10 = u10 == 1414744396 ? c(b10.u(), b10) : a(u10, i11, b10);
            if (c10 != null) {
                if (c10.getType() == 1752331379) {
                    i11 = ((d) c10).b();
                }
                aVar.a(c10);
            }
            b10.W(f10);
            b10.V(g10);
        }
        return new f(i10, aVar.k());
    }

    public <T extends C6684a> T b(Class<T> cls) {
        e0<C6684a> q10 = this.f39362a.iterator();
        while (q10.hasNext()) {
            T t10 = (C6684a) q10.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    public int getType() {
        return this.f39363b;
    }
}
