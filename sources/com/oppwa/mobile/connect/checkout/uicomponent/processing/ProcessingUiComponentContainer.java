package com.oppwa.mobile.connect.checkout.uicomponent.processing;

import androidx.activity.v;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;

public class ProcessingUiComponentContainer extends UiComponentContainer<ProcessingUiComponent> implements ProcessingUiComponentInteraction {

    /* renamed from: e  reason: collision with root package name */
    private final v f121540e = new a(true);

    class a extends v {
        a(boolean z10) {
            super(z10);
        }

        public void handleOnBackPressed() {
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        ((ProcessingUiComponent) j()).onUiComponentCreated(this);
    }

    public void onResume() {
        super.onResume();
        requireActivity().getOnBackPressedDispatcher().i(this, this.f121540e);
    }
}
