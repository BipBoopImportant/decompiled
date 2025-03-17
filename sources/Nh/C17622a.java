package nH;

/* renamed from: nH.a  reason: case insensitive filesystem */
public final class C17622a<T> implements C17624c<T> {

    /* renamed from: a  reason: collision with root package name */
    private C17628g<T> f144806a;

    public static <T> void a(C17628g<T> gVar, C17628g<T> gVar2) {
        b((C17622a) gVar, gVar2);
    }

    private static <T> void b(C17622a<T> aVar, C17628g<T> gVar) {
        C17627f.b(gVar);
        if (aVar.f144806a == null) {
            aVar.f144806a = gVar;
            return;
        }
        throw new IllegalStateException();
    }

    public T get() {
        C17628g<T> gVar = this.f144806a;
        if (gVar != null) {
            return gVar.get();
        }
        throw new IllegalStateException();
    }
}
