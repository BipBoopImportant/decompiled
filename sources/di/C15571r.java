package DI;

import kotlin.jvm.internal.C17542s;

/* renamed from: DI.r  reason: case insensitive filesystem */
public abstract class C15571r extends C15574u {

    /* renamed from: a  reason: collision with root package name */
    private final y0 f133848a;

    public C15571r(y0 y0Var) {
        C17542s.j(y0Var, "delegate");
        this.f133848a = y0Var;
    }

    public y0 b() {
        return this.f133848a;
    }

    public String c() {
        return b().b();
    }

    public C15574u f() {
        C15574u j10 = C15573t.j(b().d());
        C17542s.i(j10, "toDescriptorVisibility(...)");
        return j10;
    }
}
