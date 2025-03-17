package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.k;
import i.C5421a;
import j.C5443a;

public class AppCompatRadioButton extends RadioButton implements k {

    /* renamed from: a  reason: collision with root package name */
    private final C4992d f16083a;

    /* renamed from: b  reason: collision with root package name */
    private final C4990b f16084b;

    /* renamed from: c  reason: collision with root package name */
    private final C5003o f16085c;

    /* renamed from: d  reason: collision with root package name */
    private C4995g f16086d;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5421a.f23878H);
    }

    private C4995g getEmojiTextViewHelper() {
        if (this.f16086d == null) {
            this.f16086d = new C4995g(this);
        }
        return this.f16086d;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4990b bVar = this.f16084b;
        if (bVar != null) {
            bVar.b();
        }
        C5003o oVar = this.f16085c;
        if (oVar != null) {
            oVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4990b bVar = this.f16084b;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4990b bVar = this.f16084b;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C4992d dVar = this.f16083a;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C4992d dVar = this.f16083a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16085c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16085c.k();
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4990b bVar = this.f16084b;
        if (bVar != null) {
            bVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C4990b bVar = this.f16084b;
        if (bVar != null) {
            bVar.g(i10);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C4992d dVar = this.f16083a;
        if (dVar != null) {
            dVar.e();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5003o oVar = this.f16085c;
        if (oVar != null) {
            oVar.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5003o oVar = this.f16085c;
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
        C4990b bVar = this.f16084b;
        if (bVar != null) {
            bVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4990b bVar = this.f16084b;
        if (bVar != null) {
            bVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C4992d dVar = this.f16083a;
        if (dVar != null) {
            dVar.f(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C4992d dVar = this.f16083a;
        if (dVar != null) {
            dVar.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f16085c.w(colorStateList);
        this.f16085c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f16085c.x(mode);
        this.f16085c.b();
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        H.a(this, getContext());
        C4992d dVar = new C4992d(this);
        this.f16083a = dVar;
        dVar.d(attributeSet, i10);
        C4990b bVar = new C4990b(this);
        this.f16084b = bVar;
        bVar.e(attributeSet, i10);
        C5003o oVar = new C5003o(this);
        this.f16085c = oVar;
        oVar.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    public void setButtonDrawable(int i10) {
        setButtonDrawable(C5443a.b(getContext(), i10));
    }
}
