package W7;

import W7.d;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

public class b implements d<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f40537a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f40538b;

    public b(int i10, boolean z10) {
        this.f40537a = i10;
        this.f40538b = z10;
    }

    /* renamed from: b */
    public boolean a(Drawable drawable, d.a aVar) {
        Drawable d10 = aVar.d();
        if (d10 == null) {
            d10 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{d10, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f40538b);
        transitionDrawable.startTransition(this.f40537a);
        aVar.a(transitionDrawable);
        return true;
    }
}
