package com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.sepa;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public final /* synthetic */ class b implements InputValidator.Watcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DirectDebitSepaUiComponentContainer f121486a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f121487b;

    public /* synthetic */ b(DirectDebitSepaUiComponentContainer directDebitSepaUiComponentContainer, EditText editText) {
        this.f121486a = directDebitSepaUiComponentContainer;
        this.f121487b = editText;
    }

    public final void onValidationResult(String str) {
        this.f121486a.a(this.f121487b, str);
    }
}
