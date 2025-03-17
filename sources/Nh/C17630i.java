package nH;

/* renamed from: nH.i  reason: case insensitive filesystem */
public final class C17630i<T> implements C17628g<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f144814c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile C17628g<T> f144815a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f144816b = f144814c;

    private C17630i(C17628g<T> gVar) {
        this.f144815a = gVar;
    }

    public static <T> C17628g<T> a(C17628g<T> gVar) {
        return ((gVar instanceof C17630i) || (gVar instanceof C17623b)) ? gVar : new C17630i((C17628g) C17627f.b(gVar));
    }

    public T get() {
        T t10 = this.f144816b;
        if (t10 != f144814c) {
            return t10;
        }
        C17628g<T> gVar = this.f144815a;
        if (gVar == null) {
            return this.f144816b;
        }
        T t11 = gVar.get();
        this.f144816b = t11;
        this.f144815a = null;
        return t11;
    }
}
