package Bi;

import android.webkit.JsResult;
import android.webkit.WebView;
import h9.C7940a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LBi/a;", "Lh9/a;", "<init>", "()V", "Landroid/webkit/WebView;", "view", "", "url", "message", "Landroid/webkit/JsResult;", "result", "", "onJsBeforeUnload", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Bi.a  reason: case insensitive filesystem */
public final class C10619a extends C7940a {
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (jsResult == null) {
            return true;
        }
        jsResult.confirm();
        return true;
    }
}
