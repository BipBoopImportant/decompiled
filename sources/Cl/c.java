package CL;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final float f133590a;

    /* renamed from: b  reason: collision with root package name */
    private final float f133591b;

    /* renamed from: c  reason: collision with root package name */
    private float f133592c;

    /* renamed from: d  reason: collision with root package name */
    private float f133593d;

    /* renamed from: e  reason: collision with root package name */
    private float f133594e;

    /* renamed from: f  reason: collision with root package name */
    private float f133595f;

    /* renamed from: g  reason: collision with root package name */
    private float f133596g;

    /* renamed from: h  reason: collision with root package name */
    private float f133597h;

    /* renamed from: i  reason: collision with root package name */
    private float f133598i;

    /* renamed from: j  reason: collision with root package name */
    private float f133599j;

    public c(float f10, float f11) {
        this.f133590a = f10;
        this.f133591b = f11;
    }

    public void a(float f10, float f11) {
        float f12 = this.f133594e;
        this.f133592c = f12;
        float f13 = this.f133595f;
        this.f133593d = f13;
        this.f133594e = f10;
        this.f133595f = f11;
        this.f133596g = f12 - f10;
        this.f133597h = f13 - f11;
        this.f133598i = this.f133590a - f10;
        this.f133599j = this.f133591b - f11;
    }

    public float b() {
        return this.f133594e;
    }

    public float c() {
        return this.f133595f;
    }

    public float d() {
        return this.f133598i;
    }

    public float e() {
        return this.f133599j;
    }
}
