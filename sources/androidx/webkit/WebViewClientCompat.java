package androidx.webkit;

import a5.C6743a;
import a5.b;
import a5.e;
import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import b5.l;
import b5.n;
import b5.o;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    public void onPageCommitVisible(WebView webView, String str) {
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        onReceivedError(webView, webResourceRequest, (b) new n(invocationHandler));
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, InvocationHandler invocationHandler) {
        onSafeBrowsingHit(webView, webResourceRequest, i10, (C6743a) new l(invocationHandler));
    }

    public boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        onReceivedError(webView, webResourceRequest, (b) new n(webResourceError));
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        onSafeBrowsingHit(webView, webResourceRequest, i10, (C6743a) new l(safeBrowsingResponse));
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, b bVar) {
        if (e.a("WEB_RESOURCE_ERROR_GET_CODE") && e.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            onReceivedError(webView, bVar.b(), bVar.a().toString(), webResourceRequest.getUrl().toString());
        }
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, C6743a aVar) {
        if (e.a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            aVar.a(true);
            return;
        }
        throw o.a();
    }
}
