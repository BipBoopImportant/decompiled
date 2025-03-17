package com.oppwa.mobile.connect.checkout.dialog.fragment.copyandpay;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.BaseFragment;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutHelper;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.databinding.OppFragmentCopyAndPayBinding;

public class CopyAndPayFragment extends BaseFragment {
    public static final String BRANDS_VALIDATION_KEY = "brandsValidation";
    public static final String BRAND_KEY = "brand";
    public static final String CARD_BRANDS_KEY = "cardBrands";
    public static final String CHECKOUT_SETTINGS_KEY = "checkoutSettings";
    public static final String IS_PAYMENT_SELECTION_SKIPPED_KEY = "isPaymentSelectionSkipped";
    public static final String IS_TOKEN_KEY = "isToken";

    /* renamed from: d  reason: collision with root package name */
    protected OppFragmentCopyAndPayBinding f121202d;

    /* renamed from: e  reason: collision with root package name */
    private CheckoutSettings f121203e;

    public CopyAndPayFragment() {
        super(R.layout.opp_fragment_copy_and_pay);
    }

    /* access modifiers changed from: private */
    public void a(WebView webView) {
        if (webView.getParent() == null) {
            this.f121202d.webViewContainer.addView(webView);
        }
    }

    private void c() {
        if (requireArguments().getBoolean(IS_PAYMENT_SELECTION_SKIPPED_KEY)) {
            this.f121202d.header.backButton.setVisibility(8);
            return;
        }
        this.f121202d.header.backButton.setVisibility(0);
        this.f121202d.header.backButton.setOnClickListener(new e(this));
    }

    private void d() {
        CopyAndPayViewModel copyAndPayViewModel = (CopyAndPayViewModel) new i0((k0) this, (i0.c) new b(requireActivity(), requireArguments())).a(CopyAndPayViewModel.class);
        copyAndPayViewModel.getWebViewLiveData().observe(getViewLifecycleOwner(), new f(this));
        copyAndPayViewModel.getResultLiveData().observe(getViewLifecycleOwner(), new g(this));
    }

    /* access modifiers changed from: protected */
    public void b(Bundle bundle) {
        if (bundle != null) {
            getParentFragmentManager().Q1(BaseFragment.class.getName(), bundle);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OppFragmentCopyAndPayBinding inflate = OppFragmentCopyAndPayBinding.inflate(layoutInflater, viewGroup, false);
        this.f121202d = inflate;
        return inflate.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f121203e = (CheckoutSettings) requireArguments().getParcelable("checkoutSettings");
        d();
        b();
        a(R.string.checkout_payment_details);
        c();
    }

    private void b() {
        if (this.f121203e.getLocale() != null) {
            CheckoutHelper.setLocale(requireActivity(), this.f121203e.getLocale());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        requireActivity().onBackPressed();
    }
}
