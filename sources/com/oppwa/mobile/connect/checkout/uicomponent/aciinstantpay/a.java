package com.oppwa.mobile.connect.checkout.uicomponent.aciinstantpay;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public final /* synthetic */ class a implements InputValidator.Watcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AciInstantPayUiComponentContainer f121477a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f121478b;

    public /* synthetic */ a(AciInstantPayUiComponentContainer aciInstantPayUiComponentContainer, EditText editText) {
        this.f121477a = aciInstantPayUiComponentContainer;
        this.f121478b = editText;
    }

    public final void onValidationResult(String str) {
        this.f121477a.c(this.f121478b, str);
    }
}
