package com.oppwa.mobile.connect.checkout.dialog;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.p  reason: case insensitive filesystem */
abstract class C14096p implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    boolean f121281a = false;

    /* renamed from: b  reason: collision with root package name */
    private final InputFilter[] f121282b = new InputFilter[0];

    /* renamed from: c  reason: collision with root package name */
    private int f121283c;

    C14096p() {
    }

    /* access modifiers changed from: protected */
    public abstract void a(Editable editable);

    public void afterTextChanged(Editable editable) {
        if (this.f121281a) {
            this.f121281a = false;
            this.f121283c = editable.length();
        } else if (editable.length() - this.f121283c == -1) {
            this.f121283c = editable.length();
            a(editable);
        } else {
            this.f121283c = editable.length();
            InputFilter[] filters = editable.getFilters();
            editable.setFilters(this.f121282b);
            b(editable).setFilters(filters);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Editable b(Editable editable);

    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
