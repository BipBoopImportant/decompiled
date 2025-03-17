package V9;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    private static c f40494c;

    /* renamed from: a  reason: collision with root package name */
    private final b f40495a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final e f40496b = new e();

    static {
        c cVar = new c();
        synchronized (c.class) {
            f40494c = cVar;
        }
    }

    private c() {
    }

    public static b a() {
        return b().f40495a;
    }

    private static c b() {
        c cVar;
        synchronized (c.class) {
            cVar = f40494c;
        }
        return cVar;
    }
}
