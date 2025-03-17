package com.oppwa.mobile.connect.provider;

import a5.b;
import a5.e;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.lifecycle.K;
import androidx.webkit.WebViewClientCompat;
import com.adjust.sdk.Constants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.utils.Logger;

public class AsyncPaymentWebViewClient extends WebViewClientCompat {
    public static final String LOG_TAG = "WebView";

    /* renamed from: a  reason: collision with root package name */
    private final K<Bundle> f121964a;

    public AsyncPaymentWebViewClient(K<Bundle> k10) {
        this.f121964a = k10;
    }

    private boolean b(String str) {
        if (str.startsWith("http") || str.startsWith(Constants.SCHEME)) {
            return false;
        }
        this.f121964a.postValue(a(str));
        return true;
    }

    /* access modifiers changed from: protected */
    public Bundle a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AsyncPaymentActivity.EXTRA_PARAM_CUSTOM_SCHEME_URL, str);
        return bundle;
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, b bVar) {
        super.onReceivedError(webView, webResourceRequest, bVar);
        Logger.error(LOG_TAG, a(a(webResourceRequest), bVar));
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Logger.error(LOG_TAG, a(a(webResourceRequest), webResourceResponse));
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return b(webResourceRequest.getUrl().toString());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return b(str);
    }

    private PaymentError a(String str, b bVar) {
        String str2 = "";
        String valueOf = e.a("WEB_RESOURCE_ERROR_GET_CODE") ? String.valueOf(bVar.b()) : str2;
        if (e.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION")) {
            str2 = String.valueOf(bVar.a());
        }
        return b(str, valueOf, str2);
    }

    private PaymentError b(String str, String str2, String str3) {
        return PaymentError.getPaymentProviderInternalError(a(str2, str3, str));
    }

    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        if (str2 == null) {
            str2 = "";
        }
        Logger.error(LOG_TAG, b(str2, String.valueOf(i10), str));
    }

    private PaymentError a(String str, WebResourceResponse webResourceResponse) {
        return b(str, String.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getReasonPhrase());
    }

    private String a(String str, String str2, String str3) {
        return String.format("[%s] %s; url: %s", new Object[]{str, str2, str3});
    }

    private String a(WebResourceRequest webResourceRequest) {
        if (webResourceRequest.getUrl() != null) {
            return webResourceRequest.getUrl().toString();
        }
        return "";
    }
}
