package com.oppwa.mobile.connect.provider;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.activity.v;
import androidx.fragment.app.C5187o;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.databinding.OppThreedsWebFragmentBinding;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.provider.ThreeDSWebFragmentViewModel;

public class ThreeDSWebFragment extends C5187o {

    /* renamed from: a  reason: collision with root package name */
    protected OppThreedsWebFragmentBinding f121986a;

    /* renamed from: b  reason: collision with root package name */
    private v f121987b;

    class a extends v {
        a(boolean z10) {
            super(z10);
        }

        public void handleOnBackPressed() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(AsyncPaymentActivity.EXTRA_PAYMENT_ERROR, PaymentError.getThreeDS2ChallengeCanceledError());
            ThreeDSWebFragment.this.a(bundle);
        }
    }

    public ThreeDSWebFragment() {
        super(R.layout.opp_threeds_web_fragment);
    }

    private void a(String str, String str2) {
        ThreeDSWebFragmentViewModel threeDSWebFragmentViewModel = (ThreeDSWebFragmentViewModel) new i0((k0) this, (i0.c) new ThreeDSWebFragmentViewModel.Factory(requireActivity(), str, str2)).a(ThreeDSWebFragmentViewModel.class);
        threeDSWebFragmentViewModel.getResultLiveData().observe(getViewLifecycleOwner(), new C(this));
        threeDSWebFragmentViewModel.getMethodDataWebViewLiveData().observe(getViewLifecycleOwner(), new D(this));
        threeDSWebFragmentViewModel.getRedirectWebViewLiveData().observe(getViewLifecycleOwner(), new D(this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f121987b = new a(true);
        requireActivity().getOnBackPressedDispatcher().i(this, this.f121987b);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OppThreedsWebFragmentBinding inflate = OppThreedsWebFragmentBinding.inflate(layoutInflater, viewGroup, false);
        this.f121986a = inflate;
        return inflate.getRoot();
    }

    public void onDetach() {
        super.onDetach();
        this.f121987b.remove();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        a(requireArguments().getString(AsyncPaymentActivity.EXTRA_THREEDS_METHOD_REDIRECT_URL), requireArguments().getString(AsyncPaymentActivity.EXTRA_REDIRECT_URL));
    }

    /* access modifiers changed from: private */
    public void a(WebView webView) {
        if (webView.getParent() == null) {
            this.f121986a.webViewContainer.addView(webView);
        }
    }

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
        if (bundle != null) {
            getParentFragmentManager().Q1(AsyncPaymentActivity.REQUEST_KEY_ASYNC_RESULT, bundle);
        }
    }
}
