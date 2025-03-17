package com.oppwa.mobile.connect.checkout.dialog;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.j1  reason: case insensitive filesystem */
public final /* synthetic */ class C14080j1 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardPaymentInfoFragment f121259a;

    public /* synthetic */ C14080j1(CardPaymentInfoFragment cardPaymentInfoFragment) {
        this.f121259a = cardPaymentInfoFragment;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return this.f121259a.a(textView, i10, keyEvent);
    }
}
