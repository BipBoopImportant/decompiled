package com.oppwa.mobile.connect.checkout.dialog;

import android.view.View;
import com.oppwa.mobile.connect.payment.token.Token;

public final /* synthetic */ class j2 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C14049a0 f121260a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Token f121261b;

    public /* synthetic */ j2(C14049a0 a0Var, Token token) {
        this.f121260a = a0Var;
        this.f121261b = token;
    }

    public final void onClick(View view) {
        this.f121260a.a(this.f121261b, view);
    }
}
