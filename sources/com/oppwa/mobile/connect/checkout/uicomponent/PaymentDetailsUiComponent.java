package com.oppwa.mobile.connect.checkout.uicomponent;

import android.view.View;
import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentInteraction;

public interface PaymentDetailsUiComponent<T extends UiComponentInteraction> extends UiComponent<T> {
    void onInputValidation(EditText editText, String str);

    void onViewVisibilityChange(View view, int i10);
}
