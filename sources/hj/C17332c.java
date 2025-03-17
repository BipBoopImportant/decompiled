package hJ;

import AI.C15429j;
import DI.C15561h;
import DI.n0;
import YH.C16877v;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import uJ.E0;
import uJ.Q0;
import vJ.g;
import vJ.n;

/* renamed from: hJ.c  reason: case insensitive filesystem */
public final class C17332c implements C17331b {

    /* renamed from: a  reason: collision with root package name */
    private final E0 f143423a;

    /* renamed from: b  reason: collision with root package name */
    private n f143424b;

    public C17332c(E0 e02) {
        C17542s.j(e02, "projection");
        this.f143423a = e02;
        d().c();
        Q0 q02 = Q0.INVARIANT;
    }

    public Collection<C18096U> a() {
        Object type = d().c() == Q0.OUT_VARIANCE ? d().getType() : p().J();
        C17542s.g(type);
        return C16877v.e(type);
    }

    public E0 d() {
        return this.f143423a;
    }

    public /* bridge */ /* synthetic */ C15561h e() {
        return (C15561h) g();
    }

    public boolean f() {
        return false;
    }

    public Void g() {
        return null;
    }

    public List<n0> getParameters() {
        return C16877v.n();
    }

    public final n h() {
        return this.f143424b;
    }

    /* renamed from: i */
    public C17332c b(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        E0 b10 = d().b(gVar);
        C17542s.i(b10, "refine(...)");
        return new C17332c(b10);
    }

    public final void j(n nVar) {
        this.f143424b = nVar;
    }

    public C15429j p() {
        C15429j p10 = d().getType().N0().p();
        C17542s.i(p10, "getBuiltIns(...)");
        return p10;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + d() + ')';
    }
}
