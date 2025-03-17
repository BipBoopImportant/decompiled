package com.oppwa.mobile.connect.provider.threeds.v2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adjust.sdk.Constants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.utils.Logger;

class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a f122122a;

    /* renamed from: b  reason: collision with root package name */
    private WebView f122123b;

    public c(Context context, a aVar) {
        this.f122122a = aVar;
        this.f122123b = new WebView(context);
        a();
    }

    class a extends WebViewClient {
        a() {
        }

        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            c.this.f122122a.a(c.this.a(i10, str));
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("http") || str.startsWith(Constants.SCHEME)) {
                return false;
            }
            c.this.f122122a.a((PaymentError) null);
            return true;
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            c.this.f122122a.a(c.this.a(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription())));
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a() {
        this.f122123b.getSettings().setJavaScriptEnabled(true);
        a(this.f122123b);
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        this.f122123b.loadData(str, "text/html", Constants.ENCODING);
    }

    private void a(WebView webView) {
        webView.setWebViewClient(new a());
    }

    /* access modifiers changed from: private */
    public PaymentError a(int i10, String str) {
        String str2 = "ThreeDS2 challenge completion page loading failed: " + i10 + " - " + str;
        Logger.error("ThreeDS2", str2);
        return PaymentError.getThreeDS2Error(str2);
    }
}
