package androidx.appcompat.widget;

import a3.a;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import i.C5430j;

/* renamed from: androidx.appcompat.widget.f  reason: case insensitive filesystem */
class C4994f {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f16518a;

    /* renamed from: b  reason: collision with root package name */
    private final a f16519b;

    C4994f(EditText editText) {
        this.f16518a = editText;
        this.f16519b = new a(editText, false);
    }

    /* access modifiers changed from: package-private */
    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f16519b.a(keyListener) : keyListener;
    }

    /* access modifiers changed from: package-private */
    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f16519b.b();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void d(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f16518a.getContext().obtainStyledAttributes(attributeSet, C5430j.f24176g0, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(C5430j.f24246u0)) {
                z10 = obtainStyledAttributes.getBoolean(C5430j.f24246u0, true);
            }
            obtainStyledAttributes.recycle();
            f(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public InputConnection e(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f16519b.c(inputConnection, editorInfo);
    }

    /* access modifiers changed from: package-private */
    public void f(boolean z10) {
        this.f16519b.d(z10);
    }
}
