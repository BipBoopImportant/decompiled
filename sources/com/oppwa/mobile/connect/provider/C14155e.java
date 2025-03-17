package com.oppwa.mobile.connect.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.lifecycle.F;
import androidx.webkit.WebViewClientCompat;

/* renamed from: com.oppwa.mobile.connect.provider.e  reason: case insensitive filesystem */
class C14155e extends F<WebView> {

    /* renamed from: a  reason: collision with root package name */
    private final WebView f122007a;

    public C14155e(Context context, String str, WebViewClientCompat webViewClientCompat) {
        this.f122007a = new WebView(context);
        a(str, webViewClientCompat);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(String str, WebViewClientCompat webViewClientCompat) {
        if (webViewClientCompat != null) {
            this.f122007a.setWebViewClient(webViewClientCompat);
        }
        this.f122007a.getSettings().setJavaScriptEnabled(true);
        this.f122007a.loadUrl(str);
    }

    /* access modifiers changed from: protected */
    public void onActive() {
        super.onActive();
        postValue(this.f122007a);
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
        super.onInactive();
        a(this.f122007a);
    }

    private void a(WebView webView) {
        if (webView.getParent() instanceof ViewGroup) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
    }
}
