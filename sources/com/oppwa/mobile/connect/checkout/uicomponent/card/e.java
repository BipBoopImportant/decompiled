package com.oppwa.mobile.connect.checkout.uicomponent.card;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public final /* synthetic */ class e implements InputValidator.Watcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardUiComponentContainer f121518a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f121519b;

    public /* synthetic */ e(CardUiComponentContainer cardUiComponentContainer, EditText editText) {
        this.f121518a = cardUiComponentContainer;
        this.f121519b = editText;
    }

    public final void onValidationResult(String str) {
        this.f121518a.d(this.f121519b, str);
    }
}
