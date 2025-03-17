package com.oppwa.mobile.connect.checkout.uicomponent.card;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public final /* synthetic */ class d implements InputValidator.Watcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardUiComponentContainer f121516a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f121517b;

    public /* synthetic */ d(CardUiComponentContainer cardUiComponentContainer, EditText editText) {
        this.f121516a = cardUiComponentContainer;
        this.f121517b = editText;
    }

    public final void onValidationResult(String str) {
        this.f121516a.b(this.f121517b, str);
    }
}
