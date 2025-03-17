package eJ;

import eJ.C17198i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eJ.g  reason: case insensitive filesystem */
public class C17196g {

    /* renamed from: b  reason: collision with root package name */
    private static final C17196g f143039b = new C17196g(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, C17198i.f<?, ?>> f143040a;

    /* renamed from: eJ.g$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f143041a;

        /* renamed from: b  reason: collision with root package name */
        private final int f143042b;

        a(Object obj, int i10) {
            this.f143041a = obj;
            this.f143042b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f143041a == aVar.f143041a && this.f143042b == aVar.f143042b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f143041a) * 65535) + this.f143042b;
        }
    }

    C17196g() {
        this.f143040a = new HashMap();
    }

    public static C17196g c() {
        return f143039b;
    }

    public static C17196g d() {
        return new C17196g();
    }

    public final void a(C17198i.f<?, ?> fVar) {
        this.f143040a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public <ContainingType extends C17206q> C17198i.f<ContainingType, ?> b(ContainingType containingtype, int i10) {
        return this.f143040a.get(new a(containingtype, i10));
    }

    private C17196g(boolean z10) {
        this.f143040a = Collections.emptyMap();
    }
}
