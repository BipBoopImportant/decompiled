package N7;

import E7.v;
import android.graphics.drawable.Drawable;

final class i extends g<Drawable> {
    private i(Drawable drawable) {
        super(drawable);
    }

    static v<Drawable> f(Drawable drawable) {
        if (drawable != null) {
            return new i(drawable);
        }
        return null;
    }

    public int a() {
        return Math.max(1, this.f39161a.getIntrinsicWidth() * this.f39161a.getIntrinsicHeight() * 4);
    }

    public void c() {
    }

    public Class<Drawable> d() {
        return this.f39161a.getClass();
    }
}
