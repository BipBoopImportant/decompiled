package d2;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\tJ5\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0011¨\u0006\u0012"}, d2 = {"Ld2/d;", "", "<init>", "()V", "", "start", "stop", "amount", "b", "(FFF)F", "a", "value", "c", "rangeMin", "rangeMax", "valueMin", "valueMax", "(FFFFF)F", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d2.d  reason: case insensitive filesystem */
public final class C5277d {

    /* renamed from: a  reason: collision with root package name */
    public static final C5277d f23121a = new C5277d();

    private C5277d() {
    }

    public final float a(float f10, float f11, float f12, float f13, float f14) {
        return b(f10, f11, Math.max(0.0f, Math.min(1.0f, c(f12, f13, f14))));
    }

    public final float b(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public final float c(float f10, float f11, float f12) {
        if (f10 == f11) {
            return 0.0f;
        }
        return (f12 - f10) / (f11 - f10);
    }
}
