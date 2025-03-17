package androidx.appcompat.widget;

import a3.f;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import i.C5430j;

/* renamed from: androidx.appcompat.widget.g  reason: case insensitive filesystem */
class C4995g {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f16520a;

    /* renamed from: b  reason: collision with root package name */
    private final f f16521b;

    C4995g(TextView textView) {
        this.f16520a = textView;
        this.f16521b = new f(textView, false);
    }

    /* access modifiers changed from: package-private */
    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f16521b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f16521b.b();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f16520a.getContext().obtainStyledAttributes(attributeSet, C5430j.f24176g0, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(C5430j.f24246u0)) {
                z10 = obtainStyledAttributes.getBoolean(C5430j.f24246u0, true);
            }
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public void d(boolean z10) {
        this.f16521b.c(z10);
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z10) {
        this.f16521b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f16521b.e(transformationMethod);
    }
}
