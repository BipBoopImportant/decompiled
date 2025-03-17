package DI;

import EI.C15649h;
import cJ.C17069f;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import tJ.C17994n;
import uJ.C18096U;
import uJ.C18113f0;
import uJ.Q0;
import uJ.y0;

/* renamed from: DI.c  reason: case insensitive filesystem */
final class C15556c implements n0 {

    /* renamed from: a  reason: collision with root package name */
    private final n0 f133829a;

    /* renamed from: b  reason: collision with root package name */
    private final C15566m f133830b;

    /* renamed from: c  reason: collision with root package name */
    private final int f133831c;

    public C15556c(n0 n0Var, C15566m mVar, int i10) {
        C17542s.j(n0Var, "originalDescriptor");
        C17542s.j(mVar, "declarationDescriptor");
        this.f133829a = n0Var;
        this.f133830b = mVar;
        this.f133831c = i10;
    }

    public boolean A() {
        return this.f133829a.A();
    }

    public C17994n M() {
        C17994n M10 = this.f133829a.M();
        C17542s.i(M10, "getStorageManager(...)");
        return M10;
    }

    public boolean Q() {
        return true;
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        return this.f133829a.a0(oVar, d10);
    }

    public C15566m b() {
        return this.f133830b;
    }

    public C15649h getAnnotations() {
        return this.f133829a.getAnnotations();
    }

    public int getIndex() {
        return this.f133831c + this.f133829a.getIndex();
    }

    public C17069f getName() {
        C17069f name = this.f133829a.getName();
        C17542s.i(name, "getName(...)");
        return name;
    }

    public List<C18096U> getUpperBounds() {
        List<C18096U> upperBounds = this.f133829a.getUpperBounds();
        C17542s.i(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    public i0 i() {
        i0 i10 = this.f133829a.i();
        C17542s.i(i10, "getSource(...)");
        return i10;
    }

    public y0 k() {
        y0 k10 = this.f133829a.k();
        C17542s.i(k10, "getTypeConstructor(...)");
        return k10;
    }

    public Q0 o() {
        Q0 o10 = this.f133829a.o();
        C17542s.i(o10, "getVariance(...)");
        return o10;
    }

    public C18113f0 r() {
        C18113f0 r10 = this.f133829a.r();
        C17542s.i(r10, "getDefaultType(...)");
        return r10;
    }

    public String toString() {
        return this.f133829a + "[inner-copy]";
    }

    public n0 a() {
        n0 a10 = this.f133829a.a();
        C17542s.i(a10, "getOriginal(...)");
        return a10;
    }
}
