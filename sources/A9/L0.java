package a9;

import D8.c;
import G8.g;
import HJ.C15854t;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Arrays;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import org.json.JSONException;
import org.json.JSONObject;

public final class L0 {

    /* renamed from: d  reason: collision with root package name */
    public static final v f42117d = C16796C.a(null, "");

    /* renamed from: a  reason: collision with root package name */
    public final WebView f42118a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42119b;

    /* renamed from: c  reason: collision with root package name */
    public final c f42120c = new c("WebViewJsExecutor");

    public L0(WebView webView, boolean z10) {
        C17542s.j(webView, "webView");
        this.f42118a = webView;
        this.f42119b = z10;
    }

    public static final void c(L0 l02, C17642l lVar, String str) {
        v vVar;
        C17542s.j(l02, "this$0");
        C17542s.j(lVar, "$callback");
        l02.getClass();
        if (str == null || str.length() == 0 || C15854t.H(str, "null", true)) {
            l02.f42120c.l("Failed to get tracking tag result callback from WebView");
            vVar = f42117d;
        } else {
            vVar = C16796C.a(null, str);
        }
        lVar.invoke(vVar);
    }

    public static final void g(L0 l02, C17642l lVar, String str) {
        v a10;
        C17542s.j(l02, "this$0");
        C17542s.j(lVar, "$callback");
        l02.getClass();
        if (str == null || str.length() == 0 || C15854t.H(str, "null", true)) {
            l02.e(l02.f42118a, lVar);
        } else if (l02.f42119b) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                lVar.invoke(C16796C.a(g.g(jSONObject, "serializationId"), jSONObject.optString("serializedDom")));
            } catch (JSONException e10) {
                H1.a(l02.f42120c, "Failed to serialized WebView result callback to JSON", e10);
                a10 = f42117d;
            }
        } else {
            a10 = C16796C.a(null, str);
            lVar.invoke(a10);
        }
    }

    public final void a() {
        this.f42118a.evaluateJavascript("window._uxa.push(['webview:analytics:start'])", (ValueCallback) null);
    }

    public final void b(C6964x xVar) {
        C17542s.j(xVar, "transformerMode");
        String format = String.format("window._uxa.push(['setAssetTransformerMode', '%s']);", Arrays.copyOf(new Object[]{xVar.name()}, 1));
        C17542s.i(format, "format(this, *args)");
        this.f42118a.evaluateJavascript(format, (ValueCallback) null);
    }

    public final void d(N0 n02) {
        C17542s.j(n02, "callback");
        String format = String.format("JSON.parse(window._uxa.push(['serializeWebView', { withAssets: %s }]));", Arrays.copyOf(new Object[]{String.valueOf(this.f42119b)}, 1));
        C17542s.i(format, "format(this, *args)");
        this.f42118a.evaluateJavascript(format, new J0(this, n02));
    }

    public final void e(WebView webView, C17642l<? super v<String, String>, C16807N> lVar) {
        webView.evaluateJavascript("JSON.parse(cs_wvt.push(['serializeWebView']));", new K0(this, lVar));
    }

    public final void f() {
        this.f42118a.evaluateJavascript("window._uxa.push(['webview:replay:start'])", (ValueCallback) null);
    }

    public final void h() {
        this.f42118a.evaluateJavascript("window._uxa.push(['webview:analytics:stop'])", (ValueCallback) null);
    }

    public final void i() {
        this.f42118a.evaluateJavascript("window._uxa.push(['webview:replay:stop'])", (ValueCallback) null);
    }
}
