package j8;

import F8.i;
import XH.C16814e;
import a9.L1;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\f\u0010\u0013J-\u0010\u0016\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0012J#\u0010\u0019\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J%\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ-\u0010!\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b!\u0010\"J5\u0010'\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b'\u0010(J-\u0010'\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b'\u0010+J-\u0010-\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010,\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b-\u0010.J-\u00101\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010/\u001a\u0004\u0018\u00010\u001e2\b\u00100\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b1\u0010\"J+\u00103\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u00104J-\u00108\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u0001052\b\u0010*\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b8\u00109J#\u0010;\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b;\u0010<J7\u0010@\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010\u000e2\b\u0010?\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b@\u0010AJ#\u0010D\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bD\u0010EJ#\u0010F\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bF\u0010GJ)\u0010K\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020HH\u0016¢\u0006\u0004\bK\u0010LJ7\u0010O\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010?\u001a\u0004\u0018\u00010\u000e2\b\u0010M\u001a\u0004\u0018\u00010\u000e2\b\u0010N\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\bO\u0010PJ#\u0010S\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010R\u001a\u0004\u0018\u00010QH\u0017¢\u0006\u0004\bS\u0010TJ5\u0010X\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010U\u001a\u00020#2\b\u0010W\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bX\u0010YR\"\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006b"}, d2 = {"Lj8/d;", "Landroid/webkit/WebViewClient;", "proxy", "Lj8/h;", "tagInjector", "<init>", "(Landroid/webkit/WebViewClient;Lj8/h;)V", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "", "url", "LXH/N;", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onLoadResource", "onPageCommitVisible", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Landroid/os/Message;", "cancelMsg", "continueMsg", "onTooManyRedirects", "(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V", "", "errorCode", "description", "failingUrl", "onReceivedError", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/WebResourceError;", "error", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "errorResponse", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "dontResend", "resend", "onFormResubmission", "isReload", "doUpdateVisitedHistory", "(Landroid/webkit/WebView;Ljava/lang/String;Z)V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Landroid/webkit/ClientCertRequest;", "onReceivedClientCertRequest", "(Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;)V", "Landroid/webkit/HttpAuthHandler;", "host", "realm", "onReceivedHttpAuthRequest", "(Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/KeyEvent;", "event", "shouldOverrideKeyEvent", "(Landroid/webkit/WebView;Landroid/view/KeyEvent;)Z", "onUnhandledKeyEvent", "(Landroid/webkit/WebView;Landroid/view/KeyEvent;)V", "", "oldScale", "newScale", "onScaleChanged", "(Landroid/webkit/WebView;FF)V", "account", "args", "onReceivedLoginRequest", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "threatType", "Landroid/webkit/SafeBrowsingResponse;", "callback", "onSafeBrowsingHit", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;ILandroid/webkit/SafeBrowsingResponse;)V", "a", "Landroid/webkit/WebViewClient;", "getProxy", "()Landroid/webkit/WebViewClient;", "setProxy", "(Landroid/webkit/WebViewClient;)V", "b", "Lj8/h;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private WebViewClient f54075a;

    /* renamed from: b  reason: collision with root package name */
    private final h f54076b;

    public d(WebViewClient webViewClient, h hVar) {
        C17542s.j(webViewClient, "proxy");
        C17542s.j(hVar, "tagInjector");
        this.f54075a = webViewClient;
        this.f54076b = hVar;
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        this.f54075a.doUpdateVisitedHistory(webView, str, z10);
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f54075a.onFormResubmission(webView, message, message2);
    }

    public void onLoadResource(WebView webView, String str) {
        this.f54075a.onLoadResource(webView, str);
    }

    public void onPageCommitVisible(WebView webView, String str) {
        this.f54075a.onPageCommitVisible(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        this.f54075a.onPageFinished(webView, str);
        this.f54076b.k(webView);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f54075a.onPageStarted(webView, str, bitmap);
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f54075a.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @C16814e
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.f54075a.onReceivedError(webView, i10, str, str2);
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f54075a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f54075a.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f54075a.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f54075a.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f54075a.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        if (Build.VERSION.SDK_INT >= 27) {
            this.f54075a.onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
        }
    }

    public void onScaleChanged(WebView webView, float f10, float f11) {
        this.f54075a.onScaleChanged(webView, f10, f11);
    }

    @C16814e
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        this.f54075a.onTooManyRedirects(webView, message, message2);
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.f54075a.onUnhandledKeyEvent(webView, keyEvent);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f54075a.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.f54075a.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f54075a.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(WebViewClient webViewClient, h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(webViewClient, (i10 & 2) != 0 ? new h((String) null, (String) null, (String) null, (L1) null, (i) null, 31, (DefaultConstructorMarker) null) : hVar);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f54075a.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @C16814e
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.f54075a.shouldInterceptRequest(webView, str);
    }

    @C16814e
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f54075a.shouldOverrideUrlLoading(webView, str);
    }
}
