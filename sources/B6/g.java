package B6;

import j0.C5444A;
import w6.C8927i;

public class g {

    /* renamed from: b  reason: collision with root package name */
    private static final g f33236b = new g();

    /* renamed from: a  reason: collision with root package name */
    private final C5444A<String, C8927i> f33237a = new C5444A<>(20);

    g() {
    }

    public static g b() {
        return f33236b;
    }

    public C8927i a(String str) {
        if (str == null) {
            return null;
        }
        return this.f33237a.d(str);
    }

    public void c(String str, C8927i iVar) {
        if (str != null) {
            this.f33237a.f(str, iVar);
        }
    }
}
