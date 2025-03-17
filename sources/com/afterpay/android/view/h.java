package com.afterpay.android.view;

import HJ.C15854t;
import XH.C16807N;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.afterpay.android.view.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001a\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/afterpay/android/view/h;", "Landroid/webkit/WebViewClient;", "Lkotlin/Function0;", "LXH/N;", "receivedError", "Lkotlin/Function1;", "Lcom/afterpay/android/view/l;", "completed", "", "shouldLoadRedirectUrls", "<init>", "(LnI/a;LnI/l;Z)V", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "", "url", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "a", "LnI/a;", "b", "LnI/l;", "c", "Z", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class h extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<C16807N> f46059a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<l, C16807N> f46060b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f46061c;

    public h(C17631a<C16807N> aVar, C17642l<? super l, C16807N> lVar, boolean z10) {
        C17542s.j(aVar, "receivedError");
        C17542s.j(lVar, "completed");
        this.f46059a = aVar;
        this.f46060b = lVar;
        this.f46061c = z10;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (!C15854t.I(str, "about:blank", false, 2, (Object) null)) {
            Uri parse = Uri.parse(str);
            l.b bVar = l.Companion;
            C17542s.i(parse, "uri");
            l a10 = bVar.a(parse);
            if (a10 != null) {
                this.f46060b.invoke(a10);
            }
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            this.f46059a.invoke();
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        l a10;
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null || (a10 = l.Companion.a(url)) == null || this.f46061c) {
            return false;
        }
        this.f46060b.invoke(a10);
        return true;
    }
}
