package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import i.C5421a;
import j.C5443a;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f16079d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    private final C4990b f16080a;

    /* renamed from: b  reason: collision with root package name */
    private final C5003o f16081b;

    /* renamed from: c  reason: collision with root package name */
    private final C4994f f16082c;

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5421a.f23901p);
    }

    /* access modifiers changed from: package-private */
    public void a(C4994f fVar) {
        KeyListener keyListener = getKeyListener();
        if (fVar.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a10 = fVar.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4990b bVar = this.f16080a;
        if (bVar != null) {
            bVar.b();
        }
        C5003o oVar = this.f16081b;
        if (oVar != null) {
            oVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4990b bVar = this.f16080a;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4990b bVar = this.f16080a;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16081b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16081b.k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f16082c.e(C4996h.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4990b bVar = this.f16080a;
        if (bVar != null) {
            bVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C4990b bVar = this.f16080a;
        if (bVar != null) {
            bVar.g(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5003o oVar = this.f16081b;
        if (oVar != null) {
            oVar.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5003o oVar = this.f16081b;
        if (oVar != null) {
            oVar.p();
        }
    }

    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(C5443a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f16082c.f(z10);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f16082c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4990b bVar = this.f16080a;
        if (bVar != null) {
            bVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4990b bVar = this.f16080a;
        if (bVar != null) {
            bVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f16081b.w(colorStateList);
        this.f16081b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f16081b.x(mode);
        this.f16081b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5003o oVar = this.f16081b;
        if (oVar != null) {
            oVar.q(context, i10);
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        H.a(this, getContext());
        M v10 = M.v(getContext(), attributeSet, f16079d, i10, 0);
        if (v10.s(0)) {
            setDropDownBackgroundDrawable(v10.g(0));
        }
        v10.x();
        C4990b bVar = new C4990b(this);
        this.f16080a = bVar;
        bVar.e(attributeSet, i10);
        C5003o oVar = new C5003o(this);
        this.f16081b = oVar;
        oVar.m(attributeSet, i10);
        oVar.b();
        C4994f fVar = new C4994f(this);
        this.f16082c = fVar;
        fVar.d(attributeSet, i10);
        a(fVar);
    }
}
