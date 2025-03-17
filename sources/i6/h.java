package I6;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private float f36969a;

    /* renamed from: b  reason: collision with root package name */
    private int f36970b;

    public void a(float f10) {
        float f11 = this.f36969a + f10;
        this.f36969a = f11;
        int i10 = this.f36970b + 1;
        this.f36970b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f36969a = f11 / 2.0f;
            this.f36970b = i10 / 2;
        }
    }
}
