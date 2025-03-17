package CL;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final float f133608a;

    /* renamed from: b  reason: collision with root package name */
    private final float f133609b;

    /* renamed from: c  reason: collision with root package name */
    private final float f133610c;

    /* renamed from: d  reason: collision with root package name */
    private final float f133611d;

    /* renamed from: e  reason: collision with root package name */
    private final float f133612e;

    /* renamed from: f  reason: collision with root package name */
    private final float f133613f;

    public e(float f10, float f11, float f12, float f13) {
        this.f133608a = f10;
        this.f133609b = f11;
        this.f133610c = f12;
        this.f133611d = f13;
        this.f133612e = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
        this.f133613f = (float) Math.sqrt((double) ((f12 * f12) + (f13 * f13)));
    }

    public float a() {
        return this.f133610c;
    }

    public float b() {
        return this.f133613f;
    }

    public float c() {
        return this.f133611d;
    }

    public float d() {
        return this.f133608a;
    }

    public float e() {
        return this.f133609b;
    }
}
