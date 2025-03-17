package J6;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private float f37376a;

    /* renamed from: b  reason: collision with root package name */
    private float f37377b;

    public d(float f10, float f11) {
        this.f37376a = f10;
        this.f37377b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f37376a == f10 && this.f37377b == f11;
    }

    public float b() {
        return this.f37376a;
    }

    public float c() {
        return this.f37377b;
    }

    public void d(float f10, float f11) {
        this.f37376a = f10;
        this.f37377b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
