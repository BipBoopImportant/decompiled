package b5;

import java.util.HashSet;
import java.util.Set;

public abstract class m {

    /* renamed from: c  reason: collision with root package name */
    private static final Set<m> f45419c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final String f45420a;

    /* renamed from: b  reason: collision with root package name */
    private final String f45421b;

    public static class a extends m {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    public static class b extends m {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    m(String str, String str2) {
        this.f45420a = str;
        this.f45421b = str2;
        f45419c.add(this);
    }
}
