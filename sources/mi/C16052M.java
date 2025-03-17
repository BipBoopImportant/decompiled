package MI;

import cJ.C17066c;
import cJ.C17068e;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import tJ.C17986f;
import tJ.C17988h;

/* renamed from: MI.M  reason: case insensitive filesystem */
public final class C16052M<T> implements C16050K<T> {

    /* renamed from: b  reason: collision with root package name */
    private final Map<C17066c, T> f136341b;

    /* renamed from: c  reason: collision with root package name */
    private final C17986f f136342c;

    /* renamed from: d  reason: collision with root package name */
    private final C17988h<C17066c, T> f136343d;

    public C16052M(Map<C17066c, ? extends T> map) {
        C17542s.j(map, "states");
        this.f136341b = map;
        C17986f fVar = new C17986f("Java nullability annotation states");
        this.f136342c = fVar;
        C17988h<C17066c, T> e10 = fVar.e(new C16051L(this));
        C17542s.i(e10, "createMemoizedFunctionWithNullableValues(...)");
        this.f136343d = e10;
    }

    /* access modifiers changed from: private */
    public static final Object c(C16052M m10, C17066c cVar) {
        C17542s.g(cVar);
        return C17068e.a(cVar, m10.f136341b);
    }

    public T a(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        return this.f136343d.invoke(cVar);
    }
}
