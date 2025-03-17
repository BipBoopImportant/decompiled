package ia;

public final class G5 {

    /* renamed from: a  reason: collision with root package name */
    private static F5 f53253a;

    public static synchronized C8386x5 a(C8351s5 s5Var) {
        C8386x5 x5Var;
        synchronized (G5.class) {
            try {
                if (f53253a == null) {
                    f53253a = new F5((E5) null);
                }
                x5Var = (C8386x5) f53253a.b(s5Var);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return x5Var;
    }

    public static synchronized C8386x5 b(String str) {
        C8386x5 a10;
        synchronized (G5.class) {
            a10 = a(C8351s5.d("vision-common").c());
        }
        return a10;
    }
}
