package Ua;

/* renamed from: Ua.e  reason: case insensitive filesystem */
public class C9284e extends C9283d {

    /* renamed from: a  reason: collision with root package name */
    float f64006a = -1.0f;

    public void a(m mVar, float f10, float f11, float f12) {
        mVar.o(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        double d10 = (double) f12;
        double d11 = (double) f11;
        mVar.m((float) (Math.sin(Math.toRadians((double) f10)) * d10 * d11), (float) (Math.sin(Math.toRadians((double) (90.0f - f10))) * d10 * d11));
    }
}
