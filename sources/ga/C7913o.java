package ga;

/* renamed from: ga.o  reason: case insensitive filesystem */
final class C7913o {

    /* renamed from: a  reason: collision with root package name */
    private final Object f51402a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f51403b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f51404c;

    C7913o(Object obj, Object obj2, Object obj3) {
        this.f51402a = obj;
        this.f51403b = obj2;
        this.f51404c = obj3;
    }

    /* access modifiers changed from: package-private */
    public final IllegalArgumentException a() {
        String valueOf = String.valueOf(this.f51402a);
        String valueOf2 = String.valueOf(this.f51403b);
        String valueOf3 = String.valueOf(this.f51402a);
        String valueOf4 = String.valueOf(this.f51404c);
        return new IllegalArgumentException("Multiple entries with same key: " + valueOf + "=" + valueOf2 + " and " + valueOf3 + "=" + valueOf4);
    }
}
