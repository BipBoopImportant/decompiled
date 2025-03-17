package Ua;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: Ua.b  reason: case insensitive filesystem */
public final class C9281b implements C9282c {

    /* renamed from: a  reason: collision with root package name */
    private final C9282c f64004a;

    /* renamed from: b  reason: collision with root package name */
    private final float f64005b;

    public C9281b(float f10, C9282c cVar) {
        while (cVar instanceof C9281b) {
            cVar = ((C9281b) cVar).f64004a;
            f10 += ((C9281b) cVar).f64005b;
        }
        this.f64004a = cVar;
        this.f64005b = f10;
    }

    public float a(RectF rectF) {
        return Math.max(0.0f, this.f64004a.a(rectF) + this.f64005b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9281b)) {
            return false;
        }
        C9281b bVar = (C9281b) obj;
        return this.f64004a.equals(bVar.f64004a) && this.f64005b == bVar.f64005b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f64004a, Float.valueOf(this.f64005b)});
    }
}
