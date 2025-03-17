package q3;

import java.util.HashSet;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    private static final HashSet<String> f28451a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private static String f28452b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (x.class) {
            if (f28451a.add(str)) {
                f28452b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (x.class) {
            str = f28452b;
        }
        return str;
    }
}
