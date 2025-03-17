package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.i;
import i.C5421a;
import j.C5443a;

public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: a  reason: collision with root package name */
    private final C4991c f16068a;

    /* renamed from: b  reason: collision with root package name */
    private final C4990b f16069b;

    /* renamed from: c  reason: collision with root package name */
    private final C5003o f16070c;

    /* renamed from: d  reason: collision with root package name */
    private C4995g f16071d;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5421a.f23904s);
    }

    private C4995g getEmojiTextViewHelper() {
        if (this.f16071d == null) {
            this.f16071d = new C4995g(this);
        }
        return this.f16071d;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5003o oVar = this.f16070c;
        if (oVar != null) {
            oVar.b();
        }
        C4990b bVar = this.f16069b;
        if (bVar != null) {
            bVar.b();
        }
        C4991c cVar = this.f16068a;
        if (cVar != null) {
            cVar.a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.r(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4990b bVar = this.f16069b;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4990b bVar = this.f16069b;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C4991c cVar = this.f16068a;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C4991c cVar = this.f16068a;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16070c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16070c.k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C4996h.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4990b bVar = this.f16069b;
        if (bVar != null) {
            bVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C4990b bVar = this.f16069b;
        if (bVar != null) {
            bVar.g(i10);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C4991c cVar = this.f16068a;
        if (cVar != null) {
            cVar.e();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5003o oVar = this.f16070c;
        if (oVar != null) {
            oVar.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5003o oVar = this.f16070c;
        if (oVar != null) {
            oVar.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4990b bVar = this.f16069b;
        if (bVar != null) {
            bVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4990b bVar = this.f16069b;
        if (bVar != null) {
            bVar.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C4991c cVar = this.f16068a;
        if (cVar != null) {
            cVar.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C4991c cVar = this.f16068a;
        if (cVar != null) {
            cVar.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f16070c.w(colorStateList);
        this.f16070c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f16070c.x(mode);
        this.f16070c.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5003o oVar = this.f16070c;
        if (oVar != null) {
            oVar.q(context, i10);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        H.a(this, getContext());
        C5003o oVar = new C5003o(this);
        this.f16070c = oVar;
        oVar.m(attributeSet, i10);
        oVar.b();
        C4990b bVar = new C4990b(this);
        this.f16069b = bVar;
        bVar.e(attributeSet, i10);
        C4991c cVar = new C4991c(this);
        this.f16068a = cVar;
        cVar.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(C5443a.b(getContext(), i10));
    }
}
