package androidx.appcompat.widget;

import G2.q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.i;
import j.C5443a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView {
    private final C4990b mBackgroundTintHelper;
    private C4995g mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<q> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final C5002n mTextClassifierHelper;
    private final C5003o mTextHelper;

    private interface a {
        void a(int[] iArr, int i10);

        void b(int i10);

        int c();

        int d();

        void e(int i10, float f10);

        int[] f();

        TextClassifier g();

        int h();

        void i(TextClassifier textClassifier);

        void j(int i10, int i11, int i12, int i13);

        void k(int i10);

        int l();

        void m(int i10);
    }

    class b implements a {
        b() {
        }

        public void a(int[] iArr, int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public void b(int i10) {
        }

        public int c() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        public int d() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        public void e(int i10, float f10) {
        }

        public int[] f() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        public TextClassifier g() {
            return AppCompatTextView.super.getTextClassifier();
        }

        public int h() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        public void i(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        public void j(int i10, int i11, int i12, int i13) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public void k(int i10) {
        }

        public int l() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        public void m(int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    class c extends b {
        c() {
            super();
        }

        public void b(int i10) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i10);
        }

        public void k(int i10) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i10);
        }
    }

    class d extends c {
        d() {
            super();
        }

        public void e(int i10, float f10) {
            AppCompatTextView.super.setLineHeight(i10, f10);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<q> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                i.o(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private C4995g getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C4995g(this);
        }
        return this.mEmojiTextViewHelper;
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
            return getSuperCaller().h();
        }
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            return oVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (U.f16485c) {
            return getSuperCaller().d();
        }
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            return oVar.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (U.f16485c) {
            return getSuperCaller().l();
        }
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            return oVar.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (U.f16485c) {
            return getSuperCaller().f();
        }
        C5003o oVar = this.mTextHelper;
        return oVar != null ? oVar.h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (U.f16485c) {
            return getSuperCaller().c() == 1 ? 1 : 0;
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

    public int getFirstBaselineToTopHeight() {
        return i.b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return i.c(this);
    }

    /* access modifiers changed from: package-private */
    public a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.mSuperCaller = new d();
            } else if (i10 >= 28) {
                this.mSuperCaller = new c();
            } else {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
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

    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
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
            androidx.appcompat.widget.AppCompatTextView$a r0 = r2.getSuperCaller()
            android.view.textclassifier.TextClassifier r0 = r0.g()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public q.a getTextMetricsParamsCompat() {
        return i.g(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, onCreateInputConnection, editorInfo);
        return C4996h.a(onCreateInputConnection, editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 && i10 < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
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
    public void onMeasure(int i10, int i11) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i10, i11);
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
            getSuperCaller().j(i10, i11, i12, i13);
            return;
        }
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.t(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (U.f16485c) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.u(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (U.f16485c) {
            getSuperCaller().m(i10);
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

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5003o oVar = this.mTextHelper;
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

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i10);
        } else {
            i.k(this, i10);
        }
    }

    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            i.l(this, i10);
        }
    }

    public void setLineHeight(int i10) {
        i.m(this, i10);
    }

    public void setPrecomputedText(q qVar) {
        i.o(this, qVar);
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
            getSuperCaller().i(textClassifier);
        } else {
            nVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<q> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(q.a aVar) {
        i.q(this, aVar);
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

    public void setTypeface(Typeface typeface, int i10) {
        if (!this.mIsSetTypefaceProcessing) {
            Typeface a10 = (typeface == null || i10 <= 0) ? null : x2.i.a(getContext(), typeface, i10);
            this.mIsSetTypefaceProcessing = true;
            if (a10 != null) {
                typeface = a10;
            }
            try {
                super.setTypeface(typeface, i10);
            } finally {
                this.mIsSetTypefaceProcessing = false;
            }
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public void setLineHeight(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().e(i10, f10);
        } else {
            i.n(this, i10, f10);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        H.a(this, getContext());
        C4990b bVar = new C4990b(this);
        this.mBackgroundTintHelper = bVar;
        bVar.e(attributeSet, i10);
        C5003o oVar = new C5003o(this);
        this.mTextHelper = oVar;
        oVar.m(attributeSet, i10);
        oVar.b();
        this.mTextClassifierHelper = new C5002n(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? C5443a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? C5443a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? C5443a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = C5443a.b(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b10, b11, b12, drawable);
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? C5443a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? C5443a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? C5443a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = C5443a.b(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(b10, b11, b12, drawable);
        C5003o oVar = this.mTextHelper;
        if (oVar != null) {
            oVar.p();
        }
    }
}
