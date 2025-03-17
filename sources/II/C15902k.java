package II;

import DI.C15538I;
import VI.C16679k;
import XH.C16807N;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qJ.C17826n;

/* renamed from: II.k  reason: case insensitive filesystem */
public final class C15902k {

    /* renamed from: c  reason: collision with root package name */
    public static final a f135490c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17826n f135491a;

    /* renamed from: b  reason: collision with root package name */
    private final C15892a f135492b;

    /* renamed from: II.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15902k a(ClassLoader classLoader) {
            C17542s.j(classLoader, "classLoader");
            C15898g gVar = new C15898g(classLoader);
            C16679k.a aVar = C16679k.f139386b;
            ClassLoader classLoader2 = C16807N.class.getClassLoader();
            C17542s.i(classLoader2, "getClassLoader(...)");
            C15898g gVar2 = new C15898g(classLoader2);
            C15895d dVar = new C15895d(classLoader);
            C16679k.a.C3416a a10 = aVar.a(gVar, gVar2, dVar, "runtime module for " + classLoader, C15901j.f135489b, C15903l.f135493a);
            return new C15902k(a10.a().a(), new C15892a(a10.b(), gVar), (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C15902k(C17826n nVar, C15892a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, aVar);
    }

    public final C17826n a() {
        return this.f135491a;
    }

    public final C15538I b() {
        return this.f135491a.q();
    }

    public final C15892a c() {
        return this.f135492b;
    }

    private C15902k(C17826n nVar, C15892a aVar) {
        this.f135491a = nVar;
        this.f135492b = aVar;
    }
}
