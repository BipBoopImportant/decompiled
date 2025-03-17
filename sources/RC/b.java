package rc;

public class b implements C10214a {

    /* renamed from: a  reason: collision with root package name */
    private static b f76380a;

    private b() {
    }

    public static b b() {
        if (f76380a == null) {
            f76380a = new b();
        }
        return f76380a;
    }

    public long a() {
        return System.currentTimeMillis();
    }
}
