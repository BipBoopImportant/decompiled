package AJ;

import DI.n0;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import vJ.e;

/* renamed from: AJ.d  reason: case insensitive filesystem */
final class C15443d {

    /* renamed from: a  reason: collision with root package name */
    private final n0 f133154a;

    /* renamed from: b  reason: collision with root package name */
    private final C18096U f133155b;

    /* renamed from: c  reason: collision with root package name */
    private final C18096U f133156c;

    public C15443d(n0 n0Var, C18096U u10, C18096U u11) {
        C17542s.j(n0Var, "typeParameter");
        C17542s.j(u10, "inProjection");
        C17542s.j(u11, "outProjection");
        this.f133154a = n0Var;
        this.f133155b = u10;
        this.f133156c = u11;
    }

    public final C18096U a() {
        return this.f133155b;
    }

    public final C18096U b() {
        return this.f133156c;
    }

    public final n0 c() {
        return this.f133154a;
    }

    public final boolean d() {
        return e.f149048a.d(this.f133155b, this.f133156c);
    }
}
