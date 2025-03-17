package r2;

import android.view.View;
import k2.n;

/* renamed from: r2.c  reason: case insensitive filesystem */
public abstract class C5820c extends n {

    /* renamed from: r2.c$a */
    public static class a extends C5820c {
        public void h(View view, float f10) {
        }

        public void i(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    public abstract void h(View view, float f10);
}
