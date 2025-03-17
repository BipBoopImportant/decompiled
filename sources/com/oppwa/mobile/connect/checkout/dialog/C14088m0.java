package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.checkout.meta.PaymentMethod;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.m0  reason: case insensitive filesystem */
public final /* synthetic */ class C14088m0 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseActivity f121274a;

    public /* synthetic */ C14088m0(BaseActivity baseActivity) {
        this.f121274a = baseActivity;
    }

    public final void accept(Object obj) {
        this.f121274a.a((PaymentMethod) obj);
    }
}
