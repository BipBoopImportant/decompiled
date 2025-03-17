package N7;

import E7.r;
import E7.v;
import P7.c;
import Y7.k;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public abstract class g<T extends Drawable> implements v<T>, r {

    /* renamed from: a  reason: collision with root package name */
    protected final T f39161a;

    public g(T t10) {
        this.f39161a = (Drawable) k.d(t10);
    }

    public void b() {
        T t10 = this.f39161a;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof c) {
            ((c) t10).e().prepareToDraw();
        }
    }

    /* renamed from: e */
    public final T get() {
        Drawable.ConstantState constantState = this.f39161a.getConstantState();
        return constantState == null ? this.f39161a : constantState.newDrawable();
    }
}
