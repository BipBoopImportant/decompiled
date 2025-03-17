package h9;

import XH.C16814e;
import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import h9.C7942c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0016@PX.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lh9/a;", "Landroid/webkit/WebChromeClient;", "<init>", "()V", "Landroid/webkit/WebView;", "view", "", "title", "LXH/N;", "onReceivedTitle", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "icon", "onReceivedIcon", "(Landroid/webkit/WebView;Landroid/graphics/Bitmap;)V", "", "newProgress", "onProgressChanged", "(Landroid/webkit/WebView;I)V", "Lh9/h;", "<set-?>", "a", "Lh9/h;", "()Lh9/h;", "b", "(Lh9/h;)V", "state", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
/* renamed from: h9.a  reason: case insensitive filesystem */
public class C7940a extends WebChromeClient {

    /* renamed from: b  reason: collision with root package name */
    public static final int f51664b = 8;

    /* renamed from: a  reason: collision with root package name */
    public C7947h f51665a;

    public C7947h a() {
        C7947h hVar = this.f51665a;
        if (hVar != null) {
            return hVar;
        }
        C17542s.z("state");
        return null;
    }

    public void b(C7947h hVar) {
        C17542s.j(hVar, "<set-?>");
        this.f51665a = hVar;
    }

    public void onProgressChanged(WebView webView, int i10) {
        C17542s.j(webView, "view");
        super.onProgressChanged(webView, i10);
        if (!(a().d() instanceof C7942c.a)) {
            a().k(new C7942c.C0850c(((float) i10) / 100.0f));
        }
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        C17542s.j(webView, "view");
        super.onReceivedIcon(webView, bitmap);
        a().l(bitmap);
    }

    public void onReceivedTitle(WebView webView, String str) {
        C17542s.j(webView, "view");
        super.onReceivedTitle(webView, str);
        a().m(str);
    }
}
