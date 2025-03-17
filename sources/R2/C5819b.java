package r2;

import android.view.View;
import k2.g;

/* renamed from: r2.b  reason: case insensitive filesystem */
public abstract class C5819b extends g {

    /* renamed from: r2.b$a */
    public static class a extends C5819b {
        public void j(View view, float f10) {
        }

        public void k(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    public abstract void j(View view, float f10);
}
