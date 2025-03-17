package com.afterpay.android.view;

import XH.C16807N;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Message;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import v6.l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001\u0019B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0017\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010 R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001e¨\u0006$"}, d2 = {"Lcom/afterpay/android/view/j;", "Landroid/webkit/WebChromeClient;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "viewGroup", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "LXH/N;", "onOpenWebView", "Lkotlin/Function0;", "onPageFinished", "receivedError", "Landroid/net/Uri;", "openExternalLink", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;LnI/l;LnI/a;LnI/a;LnI/l;)V", "view", "", "isDialog", "isUserGesture", "Landroid/os/Message;", "resultMsg", "onCreateWindow", "(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z", "a", "Landroid/content/Context;", "b", "Landroid/view/ViewGroup;", "c", "LnI/l;", "d", "LnI/a;", "e", "f", "Companion", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class j extends WebChromeClient {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f46068a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f46069b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<WebView, C16807N> f46070c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C17631a<C16807N> f46071d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C17631a<C16807N> f46072e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C17642l<Uri, C16807N> f46073f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/afterpay/android/view/j$a;", "", "<init>", "()V", "", "URL_KEY", "Ljava/lang/String;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/afterpay/android/view/j$b", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "LXH/N;", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebView f46074a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f46075b;

        b(WebView webView, j jVar) {
            this.f46074a = webView;
            this.f46075b = jVar;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f46074a.setVisibility(0);
            this.f46075b.f46071d.invoke();
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                this.f46075b.f46072e.invoke();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/afterpay/android/view/j$c", "Landroid/webkit/WebChromeClient;", "Landroid/webkit/WebView;", "view", "", "isDialog", "isUserGesture", "Landroid/os/Message;", "resultMsg", "onCreateWindow", "(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class c extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f46076a;

        c(j jVar) {
            this.f46076a = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r3 = r1.getHandler();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onCreateWindow(android.webkit.WebView r1, boolean r2, boolean r3, android.os.Message r4) {
            /*
                r0 = this;
                r2 = 0
                if (r1 == 0) goto L_0x000e
                android.os.Handler r3 = r1.getHandler()
                if (r3 == 0) goto L_0x000e
                android.os.Message r3 = r3.obtainMessage()
                goto L_0x000f
            L_0x000e:
                r3 = r2
            L_0x000f:
                if (r1 == 0) goto L_0x0014
                r1.requestFocusNodeHref(r3)
            L_0x0014:
                if (r3 == 0) goto L_0x0022
                android.os.Bundle r1 = r3.getData()
                if (r1 == 0) goto L_0x0022
                java.lang.String r2 = "url"
                java.lang.String r2 = r1.getString(r2)
            L_0x0022:
                if (r2 == 0) goto L_0x0036
                com.afterpay.android.view.j r1 = r0.f46076a
                nI.l r1 = r1.f46073f
                android.net.Uri r2 = android.net.Uri.parse(r2)
                java.lang.String r3 = "parse(it)"
                kotlin.jvm.internal.C17542s.i(r2, r3)
                r1.invoke(r2)
            L_0x0036:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afterpay.android.view.j.c.onCreateWindow(android.webkit.WebView, boolean, boolean, android.os.Message):boolean");
        }
    }

    public j(Context context, ViewGroup viewGroup, C17642l<? super WebView, C16807N> lVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17642l<? super Uri, C16807N> lVar2) {
        C17542s.j(context, "context");
        C17542s.j(viewGroup, "viewGroup");
        C17542s.j(lVar, "onOpenWebView");
        C17542s.j(aVar, "onPageFinished");
        C17542s.j(aVar2, "receivedError");
        C17542s.j(lVar2, "openExternalLink");
        this.f46068a = context;
        this.f46069b = viewGroup;
        this.f46070c = lVar;
        this.f46071d = aVar;
        this.f46072e = aVar2;
        this.f46073f = lVar2;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView webView2 = new WebView(this.f46068a);
        l.a(webView2);
        webView2.setVisibility(4);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.getSettings().setSupportMultipleWindows(true);
        webView2.getSettings().setDomStorageEnabled(true);
        webView2.setWebViewClient(new b(webView2, this));
        webView2.setWebChromeClient(new c(this));
        this.f46069b.addView(webView2);
        WebView.WebViewTransport webViewTransport = null;
        Object obj = message != null ? message.obj : null;
        if (obj instanceof WebView.WebViewTransport) {
            webViewTransport = (WebView.WebViewTransport) obj;
        }
        if (webViewTransport == null) {
            return false;
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        this.f46070c.invoke(webView2);
        return true;
    }
}
