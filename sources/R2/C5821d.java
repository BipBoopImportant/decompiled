package r2;

import android.view.View;
import k2.f;
import k2.s;

/* renamed from: r2.d  reason: case insensitive filesystem */
public abstract class C5821d extends s {

    /* renamed from: r2.d$a */
    public static class a extends C5821d {
        public boolean e(View view, float f10, long j10, f fVar) {
            return this.f25166h;
        }

        public boolean f(View view, f fVar, float f10, long j10, double d10, double d11) {
            view.setRotation(d(f10, j10, view, fVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f25166h;
        }
    }

    public float d(float f10, long j10, View view, f fVar) {
        long j11 = j10;
        View view2 = view;
        f fVar2 = fVar;
        this.f25159a.e((double) f10, this.f25165g);
        float[] fArr = this.f25165g;
        float f11 = fArr[1];
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i10 == 0) {
            this.f25166h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f25168j)) {
            float a10 = fVar2.a(view2, this.f25164f, 0);
            this.f25168j = a10;
            if (Float.isNaN(a10)) {
                this.f25168j = 0.0f;
            }
        }
        float f12 = (float) ((((double) this.f25168j) + ((((double) (j11 - this.f25167i)) * 1.0E-9d) * ((double) f11))) % 1.0d);
        this.f25168j = f12;
        fVar2.b(view2, this.f25164f, 0, f12);
        this.f25167i = j11;
        float f13 = this.f25165g[0];
        float a11 = (a(this.f25168j) * f13) + this.f25165g[2];
        this.f25166h = (f13 == 0.0f && i10 == 0) ? false : true;
        return a11;
    }

    public abstract boolean e(View view, float f10, long j10, f fVar);
}
