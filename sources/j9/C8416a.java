package j9;

/* renamed from: j9.a  reason: case insensitive filesystem */
final class C8416a<T> extends d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f54092a;

    /* renamed from: b  reason: collision with root package name */
    private final T f54093b;

    /* renamed from: c  reason: collision with root package name */
    private final f f54094c;

    /* renamed from: d  reason: collision with root package name */
    private final g f54095d;

    C8416a(Integer num, T t10, f fVar, g gVar, e eVar) {
        this.f54092a = num;
        if (t10 != null) {
            this.f54093b = t10;
            if (fVar != null) {
                this.f54094c = fVar;
                this.f54095d = gVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public Integer a() {
        return this.f54092a;
    }

    public e b() {
        return null;
    }

    public T c() {
        return this.f54093b;
    }

    public f d() {
        return this.f54094c;
    }

    public g e() {
        return this.f54095d;
    }

    public boolean equals(Object obj) {
        g gVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        Integer num = this.f54092a;
        if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
            if (this.f54093b.equals(dVar.c()) && this.f54094c.equals(dVar.d()) && ((gVar = this.f54095d) != null ? gVar.equals(dVar.e()) : dVar.e() == null)) {
                dVar.b();
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f54092a;
        int i10 = 0;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f54093b.hashCode()) * 1000003) ^ this.f54094c.hashCode()) * 1000003;
        g gVar = this.f54095d;
        if (gVar != null) {
            i10 = gVar.hashCode();
        }
        return (hashCode ^ i10) * 1000003;
    }

    public String toString() {
        return "Event{code=" + this.f54092a + ", payload=" + this.f54093b + ", priority=" + this.f54094c + ", productData=" + this.f54095d + ", eventContext=" + null + "}";
    }
}
