package Sa;

import Ua.C9286g;
import Ua.k;
import Ua.n;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: Sa.a  reason: case insensitive filesystem */
public class C9269a extends Drawable implements n {

    /* renamed from: a  reason: collision with root package name */
    private b f63244a;

    /* renamed from: a */
    public C9269a mutate() {
        this.f63244a = new b(this.f63244a);
        return this;
    }

    public void draw(Canvas canvas) {
        b bVar = this.f63244a;
        if (bVar.f63246b) {
            bVar.f63245a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f63244a;
    }

    public int getOpacity() {
        return this.f63244a.f63245a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f63244a.f63245a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f63244a.f63245a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e10 = C9270b.e(iArr);
        b bVar = this.f63244a;
        if (bVar.f63246b == e10) {
            return onStateChange;
        }
        bVar.f63246b = e10;
        return true;
    }

    public void setAlpha(int i10) {
        this.f63244a.f63245a.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f63244a.f63245a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f63244a.f63245a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i10) {
        this.f63244a.f63245a.setTint(i10);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f63244a.f63245a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f63244a.f63245a.setTintMode(mode);
    }

    public C9269a(k kVar) {
        this(new b(new C9286g(kVar)));
    }

    /* renamed from: Sa.a$b */
    static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        C9286g f63245a;

        /* renamed from: b  reason: collision with root package name */
        boolean f63246b;

        public b(C9286g gVar) {
            this.f63245a = gVar;
            this.f63246b = false;
        }

        /* renamed from: a */
        public C9269a newDrawable() {
            return new C9269a(new b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f63245a = (C9286g) bVar.f63245a.getConstantState().newDrawable();
            this.f63246b = bVar.f63246b;
        }
    }

    private C9269a(b bVar) {
        this.f63244a = bVar;
    }
}
