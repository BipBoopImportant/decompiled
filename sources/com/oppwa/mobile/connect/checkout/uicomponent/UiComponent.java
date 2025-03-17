package com.oppwa.mobile.connect.checkout.uicomponent;

import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentInteraction;

public interface UiComponent<T extends UiComponentInteraction> {
    void onUiComponentCreated(T t10);
}
