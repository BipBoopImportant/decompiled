package com.oppwa.mobile.connect.checkout.dialog;

import android.text.TextWatcher;
import android.view.View;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.m1  reason: case insensitive filesystem */
public final /* synthetic */ class C14089m1 implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardPaymentInfoFragment f121275a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextWatcher f121276b;

    public /* synthetic */ C14089m1(CardPaymentInfoFragment cardPaymentInfoFragment, TextWatcher textWatcher) {
        this.f121275a = cardPaymentInfoFragment;
        this.f121276b = textWatcher;
    }

    public final void onFocusChange(View view, boolean z10) {
        this.f121275a.a(this.f121276b, view, z10);
    }
}
