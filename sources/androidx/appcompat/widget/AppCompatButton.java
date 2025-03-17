package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.i;
import i.C5421a;

public class AppCompatButton extends Button {
    private C4995g mAppCompatEmojiTextHelper;
    private final C4990b mBackgroundTintHelper;
    private final C5003o mTextHelper;

    public AppCompatButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private C4995g getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C4995g(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4990b bVar = this.mBackgroundTintHelper;
        if (bVar != null) {
            bVar.b();
        }
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (U.f16485c) {
            return super.getAutoSizeMaxTextSize();
        }
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            return oVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (U.f16485c) {
            return super.getAutoSizeMinTextSize();
        }
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            return oVar.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (U.f16485c) {
            return super.getAutoSizeStepGranularity();
        }
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            return oVar.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (U.f16485c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C5003o oVar = this.mTextHelper;
        return oVar != null ? oVar.h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (U.f16485c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            return oVar.i();
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.r(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4990b bVar = this.mBackgroundTintHelper;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4990b bVar = this.mBackgroundTintHelper;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.o(z10, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C5003o oVar = this.mTextHelper;
        if (oVar != null && !U.f16485c && oVar.l()) {
            this.mTextHelper.c();
        }
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (U.f16485c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.t(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (U.f16485c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.u(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (U.f16485c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.v(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4990b bVar = this.mBackgroundTintHelper;
        if (bVar != null) {
            bVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C4990b bVar = this.mBackgroundTintHelper;
        if (bVar != null) {
            bVar.g(i10);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.s(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4990b bVar = this.mBackgroundTintHelper;
        if (bVar != null) {
            bVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4990b bVar = this.mBackgroundTintHelper;
        if (bVar != null) {
            bVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.q(context, i10);
        }
    }

    public void setTextSize(int i10, float f10) {
        if (U.f16485c) {
            super.setTextSize(i10, f10);
            return;
        }
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.A(i10, f10);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5421a.f23902q);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        H.a(this, getContext());
        C4990b bVar = new C4990b(this);
        this.mBackgroundTintHelper = bVar;
        bVar.e(attributeSet, i10);
        C5003o oVar = new C5003o(this);
        this.mTextHelper = oVar;
        oVar.m(attributeSet, i10);
        oVar.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
