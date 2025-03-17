package HI;

import DI.x0;
import DI.y0;
import kotlin.jvm.internal.C17542s;

/* renamed from: HI.b  reason: case insensitive filesystem */
public final class C15818b extends y0 {

    /* renamed from: c  reason: collision with root package name */
    public static final C15818b f135270c = new C15818b();

    private C15818b() {
        super("protected_and_package", true);
    }

    public Integer a(y0 y0Var) {
        C17542s.j(y0Var, "visibility");
        if (C17542s.e(this, y0Var)) {
            return 0;
        }
        if (y0Var == x0.b.f133872c) {
            return null;
        }
        return Integer.valueOf(x0.f133868a.b(y0Var) ? 1 : -1);
    }

    public String b() {
        return "protected/*protected and package*/";
    }

    public y0 d() {
        return x0.g.f133877c;
    }
}
