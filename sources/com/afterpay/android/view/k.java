package com.afterpay.android.view;

import XH.C16807N;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0004\u0010\fJ-\u0010\u0011\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/afterpay/android/view/k;", "Landroid/webkit/WebViewClient;", "Lkotlin/Function0;", "LXH/N;", "onPageFinished", "receivedError", "<init>", "(LnI/a;LnI/a;)V", "Landroid/webkit/WebView;", "view", "", "url", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "a", "LnI/a;", "b", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class k extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<C16807N> f46077a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<C16807N> f46078b;

    public k(C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
        C17542s.j(aVar, "onPageFinished");
        C17542s.j(aVar2, "receivedError");
        this.f46077a = aVar;
        this.f46078b = aVar2;
    }

    public void onPageFinished(WebView webView, String str) {
        this.f46077a.invoke();
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            this.f46078b.invoke();
        }
    }
}
