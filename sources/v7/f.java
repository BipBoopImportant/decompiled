package V7;

import W7.d;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public abstract class f<Z> extends j<ImageView, Z> implements d.a {

    /* renamed from: h  reason: collision with root package name */
    private Animatable f40470h;

    public f(ImageView imageView) {
        super(imageView);
    }

    private void r(Z z10) {
        if (z10 instanceof Animatable) {
            Animatable animatable = (Animatable) z10;
            this.f40470h = animatable;
            animatable.start();
            return;
        }
        this.f40470h = null;
    }

    private void t(Z z10) {
        s(z10);
        r(z10);
    }

    public void a(Drawable drawable) {
        ((ImageView) this.f40473a).setImageDrawable(drawable);
    }

    public Drawable d() {
        return ((ImageView) this.f40473a).getDrawable();
    }

    public void e(Drawable drawable) {
        super.e(drawable);
        t((Object) null);
        a(drawable);
    }

    public void f(Drawable drawable) {
        super.f(drawable);
        Animatable animatable = this.f40470h;
        if (animatable != null) {
            animatable.stop();
        }
        t((Object) null);
        a(drawable);
    }

    public void g() {
        Animatable animatable = this.f40470h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public void j(Z z10, d<? super Z> dVar) {
        if (dVar == null || !dVar.a(z10, this)) {
            t(z10);
        } else {
            r(z10);
        }
    }

    public void k() {
        Animatable animatable = this.f40470h;
        if (animatable != null) {
            animatable.start();
        }
    }

    public void m(Drawable drawable) {
        super.m(drawable);
        t((Object) null);
        a(drawable);
    }

    /* access modifiers changed from: protected */
    public abstract void s(Z z10);
}
