package Ua;

import android.graphics.RectF;
import java.util.Arrays;

public final class i implements C9282c {

    /* renamed from: a  reason: collision with root package name */
    private final float f64057a;

    public i(float f10) {
        this.f64057a = f10;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    public float a(RectF rectF) {
        return this.f64057a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return this.f64057a == ((i) obj).f64057a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f64057a)});
    }
}
