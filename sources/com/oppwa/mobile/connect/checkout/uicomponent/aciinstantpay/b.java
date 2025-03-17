package com.oppwa.mobile.connect.checkout.uicomponent.aciinstantpay;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public final /* synthetic */ class b implements InputValidator.Watcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AciInstantPayUiComponentContainer f121479a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f121480b;

    public /* synthetic */ b(AciInstantPayUiComponentContainer aciInstantPayUiComponentContainer, EditText editText) {
        this.f121479a = aciInstantPayUiComponentContainer;
        this.f121480b = editText;
    }

    public final void onValidationResult(String str) {
        this.f121479a.a(this.f121480b, str);
    }
}
