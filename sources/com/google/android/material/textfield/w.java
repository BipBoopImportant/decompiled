package com.google.android.material.textfield;

import Ea.C9071e;
import Ea.C9076j;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;

class w extends r {

    /* renamed from: e  reason: collision with root package name */
    private int f67554e = C9071e.f59446a;

    /* renamed from: f  reason: collision with root package name */
    private EditText f67555f;

    /* renamed from: g  reason: collision with root package name */
    private final View.OnClickListener f67556g = new v(this);

    w(EndCompoundLayout endCompoundLayout, int i10) {
        super(endCompoundLayout);
        if (i10 != 0) {
            this.f67554e = i10;
        }
    }

    private boolean w() {
        EditText editText = this.f67555f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        EditText editText = this.f67555f;
        if (editText != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (w()) {
                this.f67555f.setTransformationMethod((TransformationMethod) null);
            } else {
                this.f67555f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                this.f67555f.setSelection(selectionEnd);
            }
            r();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return C9076j.f59556M;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f67554e;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f67556g;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return !w();
    }

    /* access modifiers changed from: package-private */
    public void n(EditText editText) {
        this.f67555f = editText;
        r();
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (x(this.f67555f)) {
            this.f67555f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* access modifiers changed from: package-private */
    public void u() {
        EditText editText = this.f67555f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
