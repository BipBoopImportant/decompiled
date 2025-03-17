package Ua;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: Ua.a  reason: case insensitive filesystem */
public final class C9280a implements C9282c {

    /* renamed from: a  reason: collision with root package name */
    private final float f64003a;

    public C9280a(float f10) {
        this.f64003a = f10;
    }

    public float a(RectF rectF) {
        return this.f64003a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9280a)) {
            return false;
        }
        return this.f64003a == ((C9280a) obj).f64003a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f64003a)});
    }
}
