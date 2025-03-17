package com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.sepa;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public final /* synthetic */ class c implements InputValidator.Watcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DirectDebitSepaUiComponentContainer f121488a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f121489b;

    public /* synthetic */ c(DirectDebitSepaUiComponentContainer directDebitSepaUiComponentContainer, EditText editText) {
        this.f121488a = directDebitSepaUiComponentContainer;
        this.f121489b = editText;
    }

    public final void onValidationResult(String str) {
        this.f121488a.b(this.f121489b, str);
    }
}
