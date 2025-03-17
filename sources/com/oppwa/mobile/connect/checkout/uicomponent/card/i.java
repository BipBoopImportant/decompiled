package com.oppwa.mobile.connect.checkout.uicomponent.card;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public final /* synthetic */ class i implements InputValidator.Watcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardUiComponentContainer f121523a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f121524b;

    public /* synthetic */ i(CardUiComponentContainer cardUiComponentContainer, EditText editText) {
        this.f121523a = cardUiComponentContainer;
        this.f121524b = editText;
    }

    public final void onValidationResult(String str) {
        this.f121523a.c(this.f121524b, str);
    }
}
