package ia;

public final class K5 {

    /* renamed from: a  reason: collision with root package name */
    private static K5 f53322a;

    private K5() {
    }

    public static synchronized K5 a() {
        K5 k52;
        synchronized (K5.class) {
            try {
                if (f53322a == null) {
                    f53322a = new K5();
                }
                k52 = f53322a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return k52;
    }

    public static final boolean b() {
        return J5.a("mlkit-dev-profiling");
    }
}
