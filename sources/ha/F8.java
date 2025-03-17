package ha;

public final class F8 {

    /* renamed from: a  reason: collision with root package name */
    private static F8 f51911a;

    private F8() {
    }

    public static synchronized F8 a() {
        F8 f82;
        synchronized (F8.class) {
            try {
                if (f51911a == null) {
                    f51911a = new F8();
                }
                f82 = f51911a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f82;
    }
}
