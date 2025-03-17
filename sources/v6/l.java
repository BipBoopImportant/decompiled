package v6;

import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroid/webkit/WebView;", "a", "(Landroid/webkit/WebView;)Landroid/webkit/WebView;", "afterpay_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class l {
    public static final WebView a(WebView webView) {
        C17542s.j(webView, "<this>");
        WebSettings settings = webView.getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + " Afterpay-Android-SDK/4.4.0");
        return webView;
    }
}
