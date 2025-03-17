package com.oppwa.mobile.connect.checkout.uicomponent.card;

import com.oppwa.mobile.connect.checkout.uicomponent.util.view.EditTextWrapper;

public final /* synthetic */ class h implements EditTextWrapper.InputWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardUiComponentContainer f121522a;

    public /* synthetic */ h(CardUiComponentContainer cardUiComponentContainer) {
        this.f121522a = cardUiComponentContainer;
    }

    public final void onInputChange(String str) {
        this.f121522a.b(str);
    }
}
