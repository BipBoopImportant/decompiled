package com.oppwa.mobile.connect.checkout.dialog.fragment;

import X4.a;
import androidx.fragment.app.C5187o;
import java.util.Optional;

public class CheckoutFragment<T extends a> extends C5187o {

    /* renamed from: a  reason: collision with root package name */
    protected T f121180a;

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException a() {
        return new IllegalStateException("Missing binding.");
    }

    /* access modifiers changed from: protected */
    public T b() {
        return (a) Optional.ofNullable(this.f121180a).orElseThrow(new a());
    }
}
