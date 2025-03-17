package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public class AppCompatToggleButton extends ToggleButton {

    /* renamed from: a  reason: collision with root package name */
    private final C4990b f16121a;

    /* renamed from: b  reason: collision with root package name */
    private final C5003o f16122b;

    /* renamed from: c  reason: collision with root package name */
    private C4995g f16123c;

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    private C4995g getEmojiTextViewHelper() {
        if (this.f16123c == null) {
            this.f16123c = new C4995g(this);
        }
        return this.f16123c;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4990b bVar = this.f16121a;
        if (bVar != null) {
            bVar.b();
        }
        C5003o oVar = this.f16122b;
        if (oVar != null) {
            oVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4990b bVar = this.f16121a;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4990b bVar = this.f16121a;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16122b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16122b.k();
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4990b bVar = this.f16121a;
        if (bVar != null) {
            bVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C4990b bVar = this.f16121a;
        if (bVar != null) {
            bVar.g(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5003o oVar = this.f16122b;
        if (oVar != null) {
            oVar.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5003o oVar = this.f16122b;
        if (oVar != null) {
            oVar.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4990b bVar = this.f16121a;
        if (bVar != null) {
            bVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4990b bVar = this.f16121a;
        if (bVar != null) {
            bVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f16122b.w(colorStateList);
        this.f16122b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f16122b.x(mode);
        this.f16122b.b();
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        H.a(this, getContext());
        C4990b bVar = new C4990b(this);
        this.f16121a = bVar;
        bVar.e(attributeSet, i10);
        C5003o oVar = new C5003o(this);
        this.f16122b = oVar;
        oVar.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
