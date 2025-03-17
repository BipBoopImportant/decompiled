package q3;

import java.io.IOException;

public class B extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27845a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27846b;

    protected B(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f27845a = z10;
        this.f27846b = i10;
    }

    public static B a(String str, Throwable th2) {
        return new B(str, th2, true, 1);
    }

    public static B b(String str, Throwable th2) {
        return new B(str, th2, true, 0);
    }

    public static B c(String str) {
        return new B(str, (Throwable) null, false, 1);
    }

    public String getMessage() {
        return super.getMessage() + " {contentIsMalformed=" + this.f27845a + ", dataType=" + this.f27846b + "}";
    }
}
