package JI;

import JI.E;
import TI.C16495C;
import TI.C16497a;
import YH.C16870n;
import YH.C16877v;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;

public final class H extends E implements C16495C {

    /* renamed from: b  reason: collision with root package name */
    private final WildcardType f135757b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection<C16497a> f135758c = C16877v.n();

    /* renamed from: d  reason: collision with root package name */
    private final boolean f135759d;

    public H(WildcardType wildcardType) {
        C17542s.j(wildcardType, "reflectType");
        this.f135757b = wildcardType;
    }

    public boolean E() {
        return this.f135759d;
    }

    public boolean N() {
        Type[] upperBounds = R().getUpperBounds();
        C17542s.i(upperBounds, "getUpperBounds(...)");
        return !C17542s.e(C16870n.h0(upperBounds), Object.class);
    }

    /* renamed from: S */
    public E y() {
        Type[] upperBounds = R().getUpperBounds();
        Type[] lowerBounds = R().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + R());
        } else if (lowerBounds.length == 1) {
            E.a aVar = E.f135751a;
            C17542s.g(lowerBounds);
            Object N02 = C16870n.N0(lowerBounds);
            C17542s.i(N02, "single(...)");
            return aVar.a((Type) N02);
        } else {
            if (upperBounds.length == 1) {
                C17542s.g(upperBounds);
                Type type = (Type) C16870n.N0(upperBounds);
                if (!C17542s.e(type, Object.class)) {
                    E.a aVar2 = E.f135751a;
                    C17542s.g(type);
                    return aVar2.a(type);
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public WildcardType R() {
        return this.f135757b;
    }

    public Collection<C16497a> getAnnotations() {
        return this.f135758c;
    }
}
