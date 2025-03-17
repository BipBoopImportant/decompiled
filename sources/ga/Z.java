package ga;

public final class Z {

    /* renamed from: a  reason: collision with root package name */
    private static Z f51385a;

    private Z() {
    }

    public static synchronized Z a() {
        Z z10;
        synchronized (Z.class) {
            try {
                if (f51385a == null) {
                    f51385a = new Z();
                }
                z10 = f51385a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return z10;
    }

    public static void b() {
        Y.a();
    }
}
