package com.oppwa.mobile.connect.checkout.uicomponent.card;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public final /* synthetic */ class g implements InputValidator.Watcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardUiComponentContainer f121520a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f121521b;

    public /* synthetic */ g(CardUiComponentContainer cardUiComponentContainer, EditText editText) {
        this.f121520a = cardUiComponentContainer;
        this.f121521b = editText;
    }

    public final void onValidationResult(String str) {
        this.f121520a.a(this.f121521b, str);
    }
}
