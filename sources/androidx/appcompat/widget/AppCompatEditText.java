package androidx.appcompat.widget;

import I2.C4600b0;
import I2.C4603d;
import I2.K;
import L2.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.i;
import androidx.core.widget.j;
import i.C5421a;

public class AppCompatEditText extends EditText implements K {
    private final C4994f mAppCompatEmojiEditTextHelper;
    private final C4990b mBackgroundTintHelper;
    private final j mDefaultOnReceiveContentListener;
    private a mSuperCaller;
    private final C5002n mTextClassifierHelper;
    private final C5003o mTextHelper;

    class a {
        a() {
        }

        public TextClassifier a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    private a getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new a();
        }
        return this.mSuperCaller;
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

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.mTextClassifierHelper;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.n r0 = r2.mTextClassifierHelper
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.a()
            return r0
        L_0x0010:
            androidx.appcompat.widget.AppCompatEditText$a r0 = r2.getSuperCaller()
            android.view.textclassifier.TextClassifier r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatEditText.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    /* access modifiers changed from: package-private */
    public void initEmojiKeyListener(C4994f fVar) {
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

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.c();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] C10;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, onCreateInputConnection, editorInfo);
        InputConnection a10 = C4996h.a(onCreateInputConnection, editorInfo, this);
        if (!(a10 == null || Build.VERSION.SDK_INT > 30 || (C10 = C4600b0.C(this)) == null)) {
            L2.a.c(editorInfo, C10);
            a10 = c.c(this, a10, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.e(a10, editorInfo);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 && i10 < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (C5000l.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public C4603d onReceiveContent(C4603d dVar) {
        return this.mDefaultOnReceiveContentListener.a(this, dVar);
    }

    public boolean onTextContextMenuItem(int i10) {
        if (C5000l.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
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

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.mAppCompatEmojiEditTextHelper.f(z10);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
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

    public void setTextClassifier(TextClassifier textClassifier) {
        C5002n nVar;
        if (Build.VERSION.SDK_INT >= 28 || (nVar = this.mTextClassifierHelper) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            nVar.b(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5421a.f23873C);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        H.a(this, getContext());
        C4990b bVar = new C4990b(this);
        this.mBackgroundTintHelper = bVar;
        bVar.e(attributeSet, i10);
        C5003o oVar = new C5003o(this);
        this.mTextHelper = oVar;
        oVar.m(attributeSet, i10);
        oVar.b();
        this.mTextClassifierHelper = new C5002n(this);
        this.mDefaultOnReceiveContentListener = new j();
        C4994f fVar = new C4994f(this);
        this.mAppCompatEmojiEditTextHelper = fVar;
        fVar.d(attributeSet, i10);
        initEmojiKeyListener(fVar);
    }
}
