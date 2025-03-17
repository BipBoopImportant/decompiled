package ga;

public final class X {

    /* renamed from: a  reason: collision with root package name */
    private static W f51383a;

    public static synchronized O a(K k10) {
        O o10;
        synchronized (X.class) {
            try {
                if (f51383a == null) {
                    f51383a = new W((V) null);
                }
                o10 = (O) f51383a.b(k10);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return o10;
    }

    public static synchronized O b(String str) {
        O a10;
        synchronized (X.class) {
            a10 = a(K.d("common").c());
        }
        return a10;
    }
}
