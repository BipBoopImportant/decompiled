package II;

import HJ.C15854t;
import JI.C15965f;
import VI.C16692x;
import WI.C16730a;
import WI.C16731b;
import cJ.C17065b;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: II.f  reason: case insensitive filesystem */
public final class C15897f implements C16692x {

    /* renamed from: c  reason: collision with root package name */
    public static final a f135483c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f135484a;

    /* renamed from: b  reason: collision with root package name */
    private final C16730a f135485b;

    /* renamed from: II.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15897f a(Class<?> cls) {
            C17542s.j(cls, "klass");
            C16731b bVar = new C16731b();
            C15894c.f135481a.b(cls, bVar);
            C16730a n10 = bVar.n();
            if (n10 == null) {
                return null;
            }
            return new C15897f(cls, n10, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C15897f(Class cls, C16730a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, aVar);
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f135484a.getName();
        C17542s.i(name, "getName(...)");
        sb2.append(C15854t.P(name, '.', '/', false, 4, (Object) null));
        sb2.append(".class");
        return sb2.toString();
    }

    public C16730a b() {
        return this.f135485b;
    }

    public void c(C16692x.c cVar, byte[] bArr) {
        C17542s.j(cVar, "visitor");
        C15894c.f135481a.b(this.f135484a, cVar);
    }

    public void d(C16692x.d dVar, byte[] bArr) {
        C17542s.j(dVar, "visitor");
        C15894c.f135481a.i(this.f135484a, dVar);
    }

    public final Class<?> e() {
        return this.f135484a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15897f) && C17542s.e(this.f135484a, ((C15897f) obj).f135484a);
    }

    public int hashCode() {
        return this.f135484a.hashCode();
    }

    public C17065b k() {
        return C15965f.e(this.f135484a);
    }

    public String toString() {
        return C15897f.class.getName() + ": " + this.f135484a;
    }

    private C15897f(Class<?> cls, C16730a aVar) {
        this.f135484a = cls;
        this.f135485b = aVar;
    }
}
