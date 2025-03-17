package com.oppwa.mobile.connect.checkout.uicomponent.card.token;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public final /* synthetic */ class b implements InputValidator.Watcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardTokenUiComponentContainer f121532a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f121533b;

    public /* synthetic */ b(CardTokenUiComponentContainer cardTokenUiComponentContainer, EditText editText) {
        this.f121532a = cardTokenUiComponentContainer;
        this.f121533b = editText;
    }

    public final void onValidationResult(String str) {
        this.f121532a.a(this.f121533b, str);
    }
}
