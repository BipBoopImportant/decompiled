package com.oppwa.mobile.connect.checkout.dialog;

import android.view.KeyEvent;
import android.widget.TextView;

public final /* synthetic */ class X0 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BlikPaymentInfoFragment f121107a;

    public /* synthetic */ X0(BlikPaymentInfoFragment blikPaymentInfoFragment) {
        this.f121107a = blikPaymentInfoFragment;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return this.f121107a.a(textView, i10, keyEvent);
    }
}
