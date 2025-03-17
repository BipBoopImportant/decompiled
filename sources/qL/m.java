package QL;

import java.util.Objects;

public class m extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final int f137760a;

    /* renamed from: b  reason: collision with root package name */
    private final String f137761b;

    /* renamed from: c  reason: collision with root package name */
    private final transient x<?> f137762c;

    public m(x<?> xVar) {
        super(b(xVar));
        this.f137760a = xVar.b();
        this.f137761b = xVar.f();
        this.f137762c = xVar;
    }

    private static String b(x<?> xVar) {
        Objects.requireNonNull(xVar, "response == null");
        return "HTTP " + xVar.b() + " " + xVar.f();
    }

    public int a() {
        return this.f137760a;
    }
}
