package com.oppwa.mobile.connect.checkout.dialog.fragment;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f121181a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f121182b;

    public /* synthetic */ b(TextInputLayout textInputLayout, String str) {
        this.f121181a = textInputLayout;
        this.f121182b = str;
    }

    public final void onFocusChange(View view, boolean z10) {
        PaymentDetailsFragment.a(this.f121181a, this.f121182b, view, z10);
    }
}
