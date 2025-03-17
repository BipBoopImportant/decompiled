package com.oppwa.mobile.connect.checkout.uicomponent.card;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public final /* synthetic */ class a implements InputValidator.Watcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardUiComponentContainer f121512a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f121513b;

    public /* synthetic */ a(CardUiComponentContainer cardUiComponentContainer, EditText editText) {
        this.f121512a = cardUiComponentContainer;
        this.f121513b = editText;
    }

    public final void onValidationResult(String str) {
        this.f121512a.e(this.f121513b, str);
    }
}
