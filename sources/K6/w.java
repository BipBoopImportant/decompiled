package K6;

import K6.v;
import android.app.Application;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class w {

    /* renamed from: g  reason: collision with root package name */
    private static final String f37722g = w.class.toString();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public WebView f37723a;

    /* renamed from: b  reason: collision with root package name */
    Application f37724b;

    /* renamed from: c  reason: collision with root package name */
    public v f37725c;

    /* renamed from: d  reason: collision with root package name */
    String f37726d;

    /* renamed from: e  reason: collision with root package name */
    String f37727e;

    /* renamed from: f  reason: collision with root package name */
    private String f37728f = "<!DOCTYPE html><html><body><script id=\"static\">var s_e=document.createElement(\"script\"); s_e.src=\"[[URL]]\"; document.head.appendChild(s_e);</script></body></html>";

    class a implements v.a {
        a() {
        }

        public final void a() {
            w.b(w.this);
        }
    }

    class b extends WebChromeClient {
        b() {
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }
    }

    class c extends WebViewClient {
        c() {
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (com.cyberfend.cyfsecurity.a.g().t() == 2) {
                com.cyberfend.cyfsecurity.a.g().d(4);
            } else if (com.cyberfend.cyfsecurity.a.g().t() == 3) {
                com.cyberfend.cyfsecurity.a.g().d(5);
            } else {
                com.cyberfend.cyfsecurity.a.g().d(6);
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (com.cyberfend.cyfsecurity.a.g().t() == 2) {
                com.cyberfend.cyfsecurity.a.g().d(4);
            } else if (com.cyberfend.cyfsecurity.a.g().t() == 3) {
                com.cyberfend.cyfsecurity.a.g().d(5);
            } else {
                com.cyberfend.cyfsecurity.a.g().d(6);
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (com.cyberfend.cyfsecurity.a.g().t() == 2) {
                com.cyberfend.cyfsecurity.a.g().d(4);
            } else if (com.cyberfend.cyfsecurity.a.g().t() == 3) {
                com.cyberfend.cyfsecurity.a.g().d(5);
            } else {
                com.cyberfend.cyfsecurity.a.g().d(6);
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    class d implements Runnable {
        d() {
        }

        public final void run() {
            w.this.f37723a.stopLoading();
            w.this.f37723a.removeJavascriptInterface("JSBridge");
            WebView unused = w.this.f37723a = null;
        }
    }

    w(Application application, String str, String str2) {
        try {
            this.f37724b = application;
            this.f37726d = str;
            this.f37727e = str2;
            a();
        } catch (Exception e10) {
            y.a(e10);
        }
    }

    static /* synthetic */ void b(w wVar) {
        try {
            new Handler(Looper.getMainLooper()).post(new d());
            if (com.cyberfend.cyfsecurity.a.g().t() == 2) {
                com.cyberfend.cyfsecurity.a.g().d(8);
            } else if (wVar.f37727e == null) {
                com.cyberfend.cyfsecurity.a.g().d(7);
            } else {
                com.cyberfend.cyfsecurity.a.g().d(1);
            }
        } catch (Exception e10) {
            y.a(e10);
        }
    }

    private void f() {
        try {
            this.f37723a.getSettings().setJavaScriptEnabled(true);
            this.f37723a.getSettings().setCacheMode(2);
            this.f37723a.addJavascriptInterface(this.f37725c, "JSBridge");
            this.f37723a.setWebChromeClient(new b());
            this.f37723a.setWebViewClient(new c());
            Uri.Builder buildUpon = Uri.parse(this.f37726d).buildUpon();
            buildUpon.appendPath("_sec");
            buildUpon.appendPath("sdk_challenge.js");
            buildUpon.appendQueryParameter("os", "android");
            buildUpon.appendQueryParameter("starttime", this.f37725c.startTime());
            buildUpon.appendQueryParameter("systemVersion", this.f37725c.systemVersion());
            buildUpon.appendQueryParameter("model", this.f37725c.model());
            buildUpon.appendQueryParameter("deviceHardwareType", this.f37725c.hardWareType());
            buildUpon.appendQueryParameter("appIdentifier", this.f37725c.appIdentifier());
            buildUpon.appendQueryParameter("deviceId", this.f37725c.androidId());
            String str = this.f37727e;
            if (str != null) {
                buildUpon.appendQueryParameter("serverSideSignal", str);
            }
            this.f37723a.loadData(this.f37728f.replace("[[URL]]", buildUpon.toString()), "text/html; charset=UTF-8", (String) null);
        } catch (Exception e10) {
            y.a(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        try {
            this.f37723a = new WebView(this.f37724b);
            if (this.f37725c == null) {
                this.f37725c = new v(this.f37724b, new a());
            }
            if ((this.f37724b.getApplicationInfo().flags & 2) != 0) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            f();
        } catch (Exception e10) {
            y.a(e10);
        }
    }

    public final String d() {
        if (this.f37725c.f37721e.booleanValue()) {
            return this.f37725c.f37719c;
        }
        return null;
    }
}
