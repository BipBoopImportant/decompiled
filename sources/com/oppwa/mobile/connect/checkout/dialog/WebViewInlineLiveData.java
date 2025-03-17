package com.oppwa.mobile.connect.checkout.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.lifecycle.K;
import com.oppwa.mobile.connect.provider.AsyncPaymentWebViewClient;

public class WebViewInlineLiveData extends K<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private WebView f121103a;

    /* renamed from: b  reason: collision with root package name */
    private Bundle f121104b;

    @SuppressLint({"SetJavaScriptEnabled"})
    public WebViewInlineLiveData(Context context) {
        WebView webView = new WebView(context);
        this.f121103a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f121103a.setWebViewClient(new AsyncPaymentWebViewClient(this));
    }

    public void loadUrl(String str) {
        if (this.f121103a.getUrl() == null) {
            this.f121103a.loadUrl(str);
        }
    }

    /* access modifiers changed from: protected */
    public void onActive() {
        postValue(this.f121104b);
    }

    public void postValue(Bundle bundle) {
        this.f121104b = bundle;
        if (hasActiveObservers()) {
            super.postValue(this.f121104b);
        }
    }
}
