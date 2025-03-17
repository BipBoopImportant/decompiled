package com.contentsquare.android.api.bridge.xpf;

import X8.b;
import a9.A0;
import a9.C6784a2;
import a9.C6799c1;
import a9.U6;
import android.webkit.WebView;
import k8.C8465a;
import k8.e;
import k8.f;
import k8.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/contentsquare/android/api/bridge/xpf/XpfInterface;", "", "<init>", "()V", "Lcom/contentsquare/android/api/bridge/xpf/ExternalBridgeInterface;", "externalBridge", "LXH/N;", "registerExternalBridge", "(Lcom/contentsquare/android/api/bridge/xpf/ExternalBridgeInterface;)V", "unregisterExternalBridge", "Landroid/webkit/WebView;", "webView", "", "id", "registerWebView", "(Landroid/webkit/WebView;J)V", "unregisterWebView", "(Landroid/webkit/WebView;)V", "Lk8/h;", "webViewIdProvider", "Lk8/h;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class XpfInterface {
    public static final XpfInterface INSTANCE = new XpfInterface();
    private static final h webViewIdProvider = new h((A0) null, 1, (DefaultConstructorMarker) null);

    private XpfInterface() {
    }

    private final void registerExternalBridge(ExternalBridgeInterface externalBridgeInterface) {
        U6.f42329a.c(true, new e(externalBridgeInterface));
    }

    /* access modifiers changed from: private */
    public static final void registerExternalBridge$lambda$0(ExternalBridgeInterface externalBridgeInterface, C6799c1 c1Var) {
        C17542s.j(externalBridgeInterface, "$externalBridge");
        b i10 = b.i();
        C8465a c10 = i10 != null ? i10.c() : null;
        if (c10 != null) {
            c10.w(externalBridgeInterface);
        }
    }

    private final void registerWebView(WebView webView, long j10) {
        h hVar = webViewIdProvider;
        hVar.b(webView, j10);
        C6784a2.d(webView, hVar);
    }

    private final void unregisterExternalBridge(ExternalBridgeInterface externalBridgeInterface) {
        U6.f42329a.c(true, new f(externalBridgeInterface));
    }

    /* access modifiers changed from: private */
    public static final void unregisterExternalBridge$lambda$1(ExternalBridgeInterface externalBridgeInterface, C6799c1 c1Var) {
        C17542s.j(externalBridgeInterface, "$externalBridge");
        b i10 = b.i();
        C8465a c10 = i10 != null ? i10.c() : null;
        if (c10 != null) {
            c10.y(externalBridgeInterface);
        }
    }

    private final void unregisterWebView(WebView webView) {
        webViewIdProvider.c(webView);
        C6784a2.c(webView);
    }
}
