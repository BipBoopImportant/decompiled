package MK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"LMK/f;", "", "<init>", "()V", "", "method", "", "e", "(Ljava/lang/String;)Z", "b", "a", "d", "c", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f136460a = new f();

    private f() {
    }

    public static final boolean b(String str) {
        C17542s.j(str, "method");
        return !C17542s.e(str, "GET") && !C17542s.e(str, "HEAD");
    }

    public static final boolean e(String str) {
        C17542s.j(str, "method");
        return C17542s.e(str, "POST") || C17542s.e(str, "PUT") || C17542s.e(str, "PATCH") || C17542s.e(str, "PROPPATCH") || C17542s.e(str, "REPORT");
    }

    public final boolean a(String str) {
        C17542s.j(str, "method");
        return C17542s.e(str, "POST") || C17542s.e(str, "PATCH") || C17542s.e(str, "PUT") || C17542s.e(str, "DELETE") || C17542s.e(str, "MOVE");
    }

    public final boolean c(String str) {
        C17542s.j(str, "method");
        return !C17542s.e(str, "PROPFIND");
    }

    public final boolean d(String str) {
        C17542s.j(str, "method");
        return C17542s.e(str, "PROPFIND");
    }
}
