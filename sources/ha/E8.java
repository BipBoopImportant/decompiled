package ha;

public final class E8 {

    /* renamed from: a  reason: collision with root package name */
    private static D8 f51879a;

    public static synchronized C8136s8 a(C8057k8 k8Var) {
        C8136s8 s8Var;
        synchronized (E8.class) {
            try {
                if (f51879a == null) {
                    f51879a = new D8((C8) null);
                }
                s8Var = (C8136s8) f51879a.b(k8Var);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return s8Var;
    }

    public static synchronized C8136s8 b(String str) {
        C8136s8 a10;
        synchronized (E8.class) {
            a10 = a(C8057k8.d(str).c());
        }
        return a10;
    }
}
