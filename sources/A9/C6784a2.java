package a9;

import XH.C16824o;
import XH.C16825p;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.contentsquare.android.sdk.B;
import com.contentsquare.android.sdk.H;
import j8.C8415b;
import j8.h;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import u8.C8886a;

/* renamed from: a9.a2  reason: case insensitive filesystem */
public final class C6784a2 {

    /* renamed from: a  reason: collision with root package name */
    public static final C6784a2 f42434a = new C6784a2();

    /* renamed from: b  reason: collision with root package name */
    public static final C16824o f42435b = C16825p.b(e.f42445c);

    /* renamed from: c  reason: collision with root package name */
    public static final B f42436c = new B(new T(G1.f42019f));

    /* renamed from: d  reason: collision with root package name */
    public static final C16824o f42437d = C16825p.b(f.f42446c);

    /* renamed from: e  reason: collision with root package name */
    public static C6807d1 f42438e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f42439f;

    /* renamed from: g  reason: collision with root package name */
    public static final WeakHashMap<WebView, H> f42440g = new WeakHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public static final Handler f42441h = new Handler(Looper.getMainLooper());

    /* renamed from: i  reason: collision with root package name */
    public static final C16824o f42442i = C16825p.b(d.f42444c);

    /* renamed from: a9.a2$a */
    public /* synthetic */ class a extends C17540p implements C17631a<com.contentsquare.android.internal.features.webviewbridge.assets.a> {
        public a(Object obj) {
            super(0, obj, C6784a2.class, "buildWebViewAssetProcessor", "buildWebViewAssetProcessor()Lcom/contentsquare/android/internal/features/webviewbridge/assets/WebViewAssetsProcessor;", 0);
        }

        public final Object invoke() {
            C6807d1 n10;
            C6807d1 n11;
            ((C6784a2) this.receiver).getClass();
            C6807d1 d1Var = C6784a2.f42438e;
            if (d1Var == null) {
                X8.b i10 = X8.b.i();
                if (!(i10 == null || (n11 = i10.n()) == null)) {
                    C6784a2.f42438e = n11;
                }
                d1Var = C6784a2.f42438e;
            }
            M0 m02 = null;
            if (d1Var == null) {
                return null;
            }
            X8.b i11 = X8.b.i();
            if ((i11 != null ? i11.t() : null) == null) {
                return null;
            }
            X8.b i12 = X8.b.i();
            if (i12 != null) {
                m02 = i12.t();
            }
            C17542s.g(m02);
            C6807d1 d1Var2 = C6784a2.f42438e;
            if (d1Var2 == null) {
                X8.b i13 = X8.b.i();
                if (!(i13 == null || (n10 = i13.n()) == null)) {
                    C6784a2.f42438e = n10;
                }
                d1Var2 = C6784a2.f42438e;
            }
            C17542s.g(d1Var2);
            return new com.contentsquare.android.internal.features.webviewbridge.assets.a(m02, d1Var2, (C6934t1) C6784a2.f42442i.getValue());
        }
    }

    /* renamed from: a9.a2$b */
    public /* synthetic */ class b extends C17540p implements C17631a<C6964x> {
        public b(Object obj) {
            super(0, obj, C6784a2.class, "getCurrentTransformerMode", "getCurrentTransformerMode()Lcom/contentsquare/android/internal/features/webviewbridge/WebViewAssetTransformerMode;", 0);
        }

        public final Object invoke() {
            ((C6784a2) this.receiver).getClass();
            return C6784a2.f42439f ? C6964x.ONLY_LOCAL_ASSETS : C6964x.NONE;
        }
    }

    /* renamed from: a9.a2$c */
    public static final class c extends C17544u implements C17631a<E8.c> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f42443c = new c();

        public c() {
            super(0);
        }

        public final Object invoke() {
            C8886a a10 = C8886a.f56874d.a();
            if (a10 != null) {
                return a10.f();
            }
            return null;
        }
    }

    /* renamed from: a9.a2$d */
    public static final class d extends C17544u implements C17631a<C6934t1> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f42444c = new d();

        public d() {
            super(0);
        }

        public final Object invoke() {
            return new C6934t1(new C1(), new C6879m1());
        }
    }

    /* renamed from: a9.a2$e */
    public static final class e extends C17544u implements C17631a<D8.c> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f42445c = new e();

        public e() {
            super(0);
        }

        public final Object invoke() {
            return new D8.c("WebViewInjectionManager");
        }
    }

    /* renamed from: a9.a2$f */
    public static final class f extends C17544u implements C17631a<T0> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f42446c = new f();

        public f() {
            super(0);
        }

        public final Object invoke() {
            return new T0();
        }
    }

    public static void a() {
        WeakHashMap<WebView, H> weakHashMap = f42440g;
        if (!weakHashMap.isEmpty()) {
            C6964x xVar = f42439f ? C6964x.ONLY_LOCAL_ASSETS : C6964x.NONE;
            if (C17542s.e(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                for (Map.Entry<WebView, H> value : weakHashMap.entrySet()) {
                    ((H) value.getValue()).f46989g.b(xVar);
                }
                return;
            }
            f42441h.post(new Z1(xVar));
        }
    }

    public static final void b(C6964x xVar) {
        C17542s.j(xVar, "$transformerMode");
        f42434a.getClass();
        for (Map.Entry<WebView, H> value : f42440g.entrySet()) {
            ((H) value.getValue()).f46989g.b(xVar);
        }
    }

    public static final void c(WebView webView) {
        C17542s.j(webView, "webView");
        if (webView.getSettings().getJavaScriptEnabled()) {
            webView.removeJavascriptInterface("CSJavascriptBridge");
            f42440g.remove(webView);
        }
    }

    @SuppressLint({"WebViewApiAvailability"})
    public static final void d(WebView webView, A0 a02) {
        C17542s.j(webView, "webView");
        C17542s.j(a02, "webViewIdProvider");
        if (webView.getSettings().getJavaScriptEnabled()) {
            long a10 = a02.a(webView);
            B b10 = f42436c;
            C6784a2 a2Var = f42434a;
            a aVar = new a(a2Var);
            b bVar = new b(a2Var);
            c cVar = c.f42443c;
            a2Var.getClass();
            boolean z10 = f42439f;
            ((T0) f42437d.getValue()).getClass();
            C17542s.j(webView, "webView");
            H h10 = new H(webView, a10, b10, aVar, bVar, cVar, new L0(webView, z10), f42441h);
            webView.addJavascriptInterface(h10, "CSJavascriptBridge");
            C17542s.i(webView.getWebViewClient(), "webView.webViewClient");
            WebViewClient webViewClient = webView.getWebViewClient();
            C17542s.i(webViewClient, "webView.webViewClient");
            webView.setWebViewClient(new j8.d(webViewClient, (h) null, 2, (DefaultConstructorMarker) null));
            C8415b.f54071a.d(webView, h10, "CSJavascriptBridge");
            f42440g.put(webView, h10);
            ((D8.c) f42435b.getValue()).j("Js interface added to the webView");
            return;
        }
        f42434a.getClass();
        ((D8.c) f42435b.getValue()).j("Can't attach webview, JavaScript is not enabled on this webView.");
    }
}
