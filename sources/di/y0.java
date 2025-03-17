package DI;

import kotlin.jvm.internal.C17542s;

public abstract class y0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f133881a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f133882b;

    protected y0(String str, boolean z10) {
        C17542s.j(str, "name");
        this.f133881a = str;
        this.f133882b = z10;
    }

    public Integer a(y0 y0Var) {
        C17542s.j(y0Var, "visibility");
        return x0.f133868a.a(this, y0Var);
    }

    public String b() {
        return this.f133881a;
    }

    public final boolean c() {
        return this.f133882b;
    }

    public y0 d() {
        return this;
    }

    public final String toString() {
        return b();
    }
}
