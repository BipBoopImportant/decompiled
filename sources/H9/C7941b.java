package h9;

import XH.C16814e;
import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import h9.C7942c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0016@PX.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010'\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8\u0016@PX.¢\u0006\u0012\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001b\u0010$\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Lh9/b;", "Landroid/webkit/WebViewClient;", "<init>", "()V", "Landroid/webkit/WebView;", "view", "", "url", "Landroid/graphics/Bitmap;", "favicon", "LXH/N;", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "", "isReload", "doUpdateVisitedHistory", "(Landroid/webkit/WebView;Ljava/lang/String;Z)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Lh9/h;", "<set-?>", "a", "Lh9/h;", "b", "()Lh9/h;", "d", "(Lh9/h;)V", "state", "Lh9/g;", "Lh9/g;", "()Lh9/g;", "c", "(Lh9/g;)V", "navigator", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
/* renamed from: h9.b  reason: case insensitive filesystem */
public class C7941b extends WebViewClient {

    /* renamed from: c  reason: collision with root package name */
    public static final int f51666c = 8;

    /* renamed from: a  reason: collision with root package name */
    public C7947h f51667a;

    /* renamed from: b  reason: collision with root package name */
    public C7946g f51668b;

    public C7946g a() {
        C7946g gVar = this.f51668b;
        if (gVar != null) {
            return gVar;
        }
        C17542s.z("navigator");
        return null;
    }

    public C7947h b() {
        C7947h hVar = this.f51667a;
        if (hVar != null) {
            return hVar;
        }
        C17542s.z("state");
        return null;
    }

    public void c(C7946g gVar) {
        C17542s.j(gVar, "<set-?>");
        this.f51668b = gVar;
    }

    public void d(C7947h hVar) {
        C17542s.j(hVar, "<set-?>");
        this.f51667a = hVar;
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        C17542s.j(webView, "view");
        super.doUpdateVisitedHistory(webView, str, z10);
        a().d(webView.canGoBack());
        a().e(webView.canGoForward());
    }

    public void onPageFinished(WebView webView, String str) {
        C17542s.j(webView, "view");
        super.onPageFinished(webView, str);
        b().k(C7942c.a.f51670b);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C17542s.j(webView, "view");
        super.onPageStarted(webView, str, bitmap);
        b().k(new C7942c.C0850c(0.0f));
        b().b().clear();
        b().m((String) null);
        b().l((Bitmap) null);
        b().j(str);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C17542s.j(webView, "view");
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            b().b().add(new C7944e(webResourceRequest, webResourceError));
        }
    }
}
