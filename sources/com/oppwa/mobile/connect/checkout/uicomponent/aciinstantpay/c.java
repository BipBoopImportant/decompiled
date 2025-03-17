package com.oppwa.mobile.connect.checkout.uicomponent.aciinstantpay;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public final /* synthetic */ class c implements InputValidator.Watcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AciInstantPayUiComponentContainer f121481a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f121482b;

    public /* synthetic */ c(AciInstantPayUiComponentContainer aciInstantPayUiComponentContainer, EditText editText) {
        this.f121481a = aciInstantPayUiComponentContainer;
        this.f121482b = editText;
    }

    public final void onValidationResult(String str) {
        this.f121481a.b(this.f121482b, str);
    }
}
