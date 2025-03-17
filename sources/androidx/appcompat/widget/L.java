package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class L extends E {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f16254b;

    public L(Context context, Resources resources) {
        super(resources);
        this.f16254b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i10) {
        Drawable a10 = a(i10);
        Context context = this.f16254b.get();
        if (!(a10 == null || context == null)) {
            D.g().w(context, i10, a10);
        }
        return a10;
    }
}
