package com.oppwa.mobile.connect.checkout.uicomponent.card;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public final /* synthetic */ class j implements InputValidator.Watcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardUiComponentContainer f121525a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f121526b;

    public /* synthetic */ j(CardUiComponentContainer cardUiComponentContainer, EditText editText) {
        this.f121525a = cardUiComponentContainer;
        this.f121526b = editText;
    }

    public final void onValidationResult(String str) {
        this.f121525a.f(this.f121526b, str);
    }
}
