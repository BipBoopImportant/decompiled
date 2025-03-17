package Y7;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private Class<?> f41019a;

    /* renamed from: b  reason: collision with root package name */
    private Class<?> f41020b;

    /* renamed from: c  reason: collision with root package name */
    private Class<?> f41021c;

    public j() {
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f41019a = cls;
        this.f41020b = cls2;
        this.f41021c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f41019a.equals(jVar.f41019a) && this.f41020b.equals(jVar.f41020b) && l.d(this.f41021c, jVar.f41021c);
    }

    public int hashCode() {
        int hashCode = ((this.f41019a.hashCode() * 31) + this.f41020b.hashCode()) * 31;
        Class<?> cls = this.f41021c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f41019a + ", second=" + this.f41020b + '}';
    }

    public j(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}
