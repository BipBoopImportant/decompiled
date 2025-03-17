package VI;

import VI.C16673e;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;

/* renamed from: VI.g  reason: case insensitive filesystem */
public final class C16675g<A, C> extends C16673e.a<A> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<C16659A, List<A>> f139359a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<C16659A, C> f139360b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<C16659A, C> f139361c;

    public C16675g(Map<C16659A, ? extends List<? extends A>> map, Map<C16659A, ? extends C> map2, Map<C16659A, ? extends C> map3) {
        C17542s.j(map, "memberAnnotations");
        C17542s.j(map2, "propertyConstants");
        C17542s.j(map3, "annotationParametersDefaultValues");
        this.f139359a = map;
        this.f139360b = map2;
        this.f139361c = map3;
    }

    public Map<C16659A, List<A>> a() {
        return this.f139359a;
    }

    public final Map<C16659A, C> b() {
        return this.f139361c;
    }

    public final Map<C16659A, C> c() {
        return this.f139360b;
    }
}
