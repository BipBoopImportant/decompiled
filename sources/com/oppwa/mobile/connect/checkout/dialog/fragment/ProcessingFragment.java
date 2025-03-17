package com.oppwa.mobile.connect.checkout.dialog.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.processing.ProcessingUiComponent;
import com.oppwa.mobile.connect.checkout.uicomponent.processing.ProcessingUiComponentInteraction;
import com.oppwa.mobile.connect.databinding.OppwaProcessingFragmentBinding;

public class ProcessingFragment extends CheckoutFragment<OppwaProcessingFragmentBinding> implements ProcessingUiComponent {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        T inflate = OppwaProcessingFragmentBinding.inflate(layoutInflater, viewGroup, false);
        this.f121180a = inflate;
        return inflate.getRoot();
    }

    public void onUiComponentCreated(ProcessingUiComponentInteraction processingUiComponentInteraction) {
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((OppwaProcessingFragmentBinding) b()).header.title.setText(R.string.checkout_processing);
        ((OppwaProcessingFragmentBinding) b()).header.backButton.setVisibility(8);
        ((OppwaProcessingFragmentBinding) b()).header.closeButton.setVisibility(8);
    }
}
