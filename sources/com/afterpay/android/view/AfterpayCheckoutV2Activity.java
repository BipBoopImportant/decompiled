package com.afterpay.android.view;

import HJ.C15838d;
import XH.C16807N;
import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.activity.v;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.c;
import com.afterpay.android.Afterpay;
import com.afterpay.android.internal.AfterpayCheckoutCompletion;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.V;
import nI.C17631a;
import nI.C17642l;
import t6.C8834c;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001e\u0010\u0003R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u001f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b#\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/afterpay/android/view/AfterpayCheckoutV2Activity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "LXH/N;", "s0", "Landroid/net/Uri;", "url", "t0", "(Landroid/net/Uri;)V", "Lkotlin/Function0;", "retryAction", "Landroidx/appcompat/app/c$a;", "kotlin.jvm.PlatformType", "J", "(LnI/a;)Landroidx/appcompat/app/c$a;", "q0", "r0", "Lcom/afterpay/android/internal/AfterpayCheckoutCompletion;", "completion", "N", "(Lcom/afterpay/android/internal/AfterpayCheckoutCompletion;)V", "Lt6/c;", "status", "O", "(Lt6/c;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Landroid/webkit/WebView;", "v", "Landroid/webkit/WebView;", "bootstrapWebView", "w", "loadingWebView", "x", "checkoutWebView", "", "y", "Ljava/lang/String;", "bootstrapUrl", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AfterpayCheckoutV2Activity extends AppCompatActivity {
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public WebView f46035v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public WebView f46036w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public WebView f46037x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public String f46038y;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f46039a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.afterpay.android.internal.AfterpayCheckoutCompletion$Status[] r0 = com.afterpay.android.internal.AfterpayCheckoutCompletion.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.afterpay.android.internal.AfterpayCheckoutCompletion$Status r1 = com.afterpay.android.internal.AfterpayCheckoutCompletion.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.afterpay.android.internal.AfterpayCheckoutCompletion$Status r1 = com.afterpay.android.internal.AfterpayCheckoutCompletion.Status.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f46039a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afterpay.android.view.AfterpayCheckoutV2Activity.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AfterpayCheckoutV2Activity f46040c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AfterpayCheckoutV2Activity afterpayCheckoutV2Activity) {
            super(0);
            this.f46040c = afterpayCheckoutV2Activity;
        }

        public final void invoke() {
            WebView C10 = this.f46040c.f46035v;
            String str = null;
            if (C10 == null) {
                C17542s.z("bootstrapWebView");
                C10 = null;
            }
            String B10 = this.f46040c.f46038y;
            if (B10 == null) {
                C17542s.z("bootstrapUrl");
            } else {
                str = B10;
            }
            C10.loadUrl(str);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    static final class c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AfterpayCheckoutV2Activity f46041c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AfterpayCheckoutV2Activity afterpayCheckoutV2Activity) {
            super(0);
            this.f46041c = afterpayCheckoutV2Activity;
        }

        public final void invoke() {
            this.f46041c.s0();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* synthetic */ class d extends C17540p implements C17631a<C16807N> {
        d(Object obj) {
            super(0, obj, AfterpayCheckoutV2Activity.class, "loadCheckoutToken", "loadCheckoutToken()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((AfterpayCheckoutV2Activity) this.receiver).s0();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* synthetic */ class e extends C17540p implements C17631a<C16807N> {
        e(Object obj) {
            super(0, obj, AfterpayCheckoutV2Activity.class, "handleBootstrapError", "handleBootstrapError()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((AfterpayCheckoutV2Activity) this.receiver).q0();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/webkit/WebView;", "it", "LXH/N;", "a", "(Landroid/webkit/WebView;)V"}, k = 3, mv = {1, 7, 1})
    static final class f extends C17544u implements C17642l<WebView, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AfterpayCheckoutV2Activity f46042c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AfterpayCheckoutV2Activity afterpayCheckoutV2Activity) {
            super(1);
            this.f46042c = afterpayCheckoutV2Activity;
        }

        public final void a(WebView webView) {
            C17542s.j(webView, "it");
            this.f46042c.f46037x = webView;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((WebView) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    static final class g extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FrameLayout f46043c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AfterpayCheckoutV2Activity f46044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(FrameLayout frameLayout, AfterpayCheckoutV2Activity afterpayCheckoutV2Activity) {
            super(0);
            this.f46043c = frameLayout;
            this.f46044d = afterpayCheckoutV2Activity;
        }

        public final void invoke() {
            FrameLayout frameLayout = this.f46043c;
            WebView D10 = this.f46044d.f46036w;
            if (D10 == null) {
                C17542s.z("loadingWebView");
                D10 = null;
            }
            frameLayout.removeView(D10);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* synthetic */ class h extends C17540p implements C17631a<C16807N> {
        h(Object obj) {
            super(0, obj, AfterpayCheckoutV2Activity.class, "handleCheckoutError", "handleCheckoutError()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((AfterpayCheckoutV2Activity) this.receiver).r0();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* synthetic */ class i extends C17540p implements C17642l<Uri, C16807N> {
        i(Object obj) {
            super(1, obj, AfterpayCheckoutV2Activity.class, "open", "open(Landroid/net/Uri;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((Uri) obj);
            return C16807N.f139792a;
        }

        public final void t(Uri uri) {
            C17542s.j(uri, "p0");
            ((AfterpayCheckoutV2Activity) this.receiver).t0(uri);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* synthetic */ class j extends C17540p implements C17642l<AfterpayCheckoutCompletion, C16807N> {
        j(Object obj) {
            super(1, obj, AfterpayCheckoutV2Activity.class, "finish", "finish(Lcom/afterpay/android/internal/AfterpayCheckoutCompletion;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((AfterpayCheckoutCompletion) obj);
            return C16807N.f139792a;
        }

        public final void t(AfterpayCheckoutCompletion afterpayCheckoutCompletion) {
            C17542s.j(afterpayCheckoutCompletion, "p0");
            ((AfterpayCheckoutV2Activity) this.receiver).N(afterpayCheckoutCompletion);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* synthetic */ class k extends C17540p implements C17642l<C8834c, C16807N> {
        k(Object obj) {
            super(1, obj, AfterpayCheckoutV2Activity.class, "finish", "finish(Lcom/afterpay/android/CancellationStatus;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C8834c) obj);
            return C16807N.f139792a;
        }

        public final void t(C8834c cVar) {
            C17542s.j(cVar, "p0");
            ((AfterpayCheckoutV2Activity) this.receiver).O(cVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/afterpay/android/view/AfterpayCheckoutV2Activity$l", "Landroidx/activity/v;", "LXH/N;", "handleOnBackPressed", "()V", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class l extends v {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AfterpayCheckoutV2Activity f46045b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(AfterpayCheckoutV2Activity afterpayCheckoutV2Activity) {
            super(true);
            this.f46045b = afterpayCheckoutV2Activity;
        }

        public void handleOnBackPressed() {
            this.f46045b.O(C8834c.USER_INITIATED);
        }
    }

    private final c.a J(C17631a<C16807N> aVar) {
        c.a aVar2 = new c.a(this);
        Afterpay afterpay = Afterpay.f45951a;
        c.a title = aVar2.setTitle(afterpay.i().n());
        V v10 = V.f144353a;
        String format = String.format(afterpay.i().j(), Arrays.copyOf(new Object[]{getResources().getString(afterpay.b().b())}, 1));
        C17542s.i(format, "format(format, *args)");
        return title.f(format).l(afterpay.i().m(), new d(aVar)).g(afterpay.i().b(), new e()).i(new f(this));
    }

    /* access modifiers changed from: private */
    public static final void K(C17631a aVar, DialogInterface dialogInterface, int i10) {
        C17542s.j(aVar, "$retryAction");
        aVar.invoke();
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void L(DialogInterface dialogInterface, int i10) {
        dialogInterface.cancel();
    }

    /* access modifiers changed from: private */
    public static final void M(AfterpayCheckoutV2Activity afterpayCheckoutV2Activity, DialogInterface dialogInterface) {
        C17542s.j(afterpayCheckoutV2Activity, "this$0");
        afterpayCheckoutV2Activity.O(C8834c.USER_INITIATED);
    }

    /* access modifiers changed from: private */
    public final void N(AfterpayCheckoutCompletion afterpayCheckoutCompletion) {
        int i10 = a.f46039a[afterpayCheckoutCompletion.b().ordinal()];
        if (i10 == 1) {
            setResult(-1, v6.i.g(new Intent(), afterpayCheckoutCompletion.a()));
            finish();
        } else if (i10 == 2) {
            O(C8834c.USER_INITIATED);
        }
    }

    /* access modifiers changed from: private */
    public final void O(C8834c cVar) {
        setResult(0, v6.i.d(new Intent(), cVar));
        finish();
    }

    /* access modifiers changed from: private */
    public final void q0() {
        J(new b(this)).p();
    }

    /* access modifiers changed from: private */
    public final void r0() {
        WebView webView = this.f46037x;
        if (webView != null) {
            webView.loadUrl("about:blank");
        }
        J(new c(this)).p();
    }

    /* access modifiers changed from: private */
    public final void s0() {
        Afterpay afterpay = Afterpay.f45951a;
        if (!afterpay.e()) {
            O(C8834c.LANGUAGE_NOT_SUPPORTED);
            return;
        }
        afterpay.c();
        O(C8834c.NO_CHECKOUT_HANDLER);
    }

    /* access modifiers changed from: private */
    public final void t0(Uri uri) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getOnBackPressedDispatcher().i(this, new l(this));
        String string = getString(t6.g.f56644c);
        C17542s.i(string, "getString(R.string.afterpay_url_checkout_express)");
        this.f46038y = string;
        setContentView(t6.f.f56640a);
        getWindow().setLayout(-1, -1);
        View findViewById = findViewById(t6.e.f56637a);
        WebView webView = (WebView) findViewById;
        byte[] bytes = "\n        <html>\n\n        <head>\n            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n            <style type=\"text/css\">\n                .loading::after,\n                .shipping-options__loading-icon::after {\n                    position: absolute;\n                    top: 50%;\n                    left: 50%;\n                    -webkit-transform: translateX(-50%) translateY(-50%);\n                    transform: translateX(-50%) translateY(-50%);\n                    content: \"\";\n                    width: 5em;\n                    height: 5em;\n                    z-index: 1000000;\n                    overflow: hidden;\n                    border-left: 6px solid #CCCCCC;\n                    border-right: 6px solid #CCCCCC;\n                    border-bottom: 6px solid #CCCCCC;\n                    border-top: 6px solid #25659F;\n                    border-radius: 100%;\n                    /* overflow: hidden; */\n                    -webkit-animation-name: rotate;\n                    animation-name: rotate;\n                    -webkit-animation-duration: 1s;\n                    animation-duration: 1s;\n                    -webkit-animation-timing-function: linear;\n                    animation-timing-function: linear;\n                    -webkit-animation-iteration-count: infinite;\n                    animation-iteration-count: infinite;\n                }\n\n                .loading::after {\n                    border-left-color: #000;\n                    border-right-color: #000;\n                    border-bottom-color: #000;\n                    border-top-color: #b2fce4;\n                }\n\n                *,\n                ::before,\n                ::after {\n                    box-sizing: border-box;\n                }\n\n                [class*=\"column-\"] {\n                    display: inline-block;\n                    vertical-align: top;\n                    height: 100%;\n                    width: 100%;\n                    padding: 0.5em 0;\n                }\n\n                [class*=\"column-\"] {\n                    display: table-cell;\n                    vertical-align: middle;\n                }\n\n                [class*=\"column-\"].middle {\n                    vertical-align: middle;\n                    text-align: center;\n                }\n\n                .column-100 {\n                    width: 100%;\n                }\n\n                [class*=\"column-\"] {\n                    padding: 0;\n                }\n\n                body {\n                    background-color: #ffffff;\n                    font-family: \"Open Sans\", \"Arial\", sans-serif;\n                    color: #2D3134;\n                    margin: 0;\n                    padding: 0;\n                    height: 100%;\n                    line-height: 1.3125;\n                    font-size: 1em;\n                    -webkit-font-smoothing: antialiased;\n                }\n\n                @keyframes rotate {\n                    from {\n                        -webkit-transform: translate(-50%, -50%) rotate(0deg);\n                        transform: translate(-50%, -50%) rotate(0deg);\n                    }\n\n                    to {\n                        -webkit-transform: translate(-50%, -50%) rotate(359deg);\n                        transform: translate(-50%, -50%) rotate(359deg);\n                    }\n                }\n            </style>\n        </head>\n\n        <body>\n            <div class=\"column-100 middle loading\"></div>\n        </body>\n\n        </html>\n        ".getBytes(C15838d.f135279b);
        C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
        webView.loadData(Base64.encodeToString(bytes, 1), "text/html", "base64");
        C17542s.i(findViewById, "findViewById<WebView>(R.…tml\", \"base64\")\n        }");
        this.f46036w = webView;
        View findViewById2 = findViewById(t6.e.f56638b);
        C17542s.i(findViewById2, "findViewById(R.id.afterpay_webView)");
        this.f46035v = (WebView) findViewById2;
        FrameLayout frameLayout = (FrameLayout) findViewById(t6.e.f56639c);
        WebView webView2 = this.f46035v;
        String str = null;
        if (webView2 == null) {
            C17542s.z("bootstrapWebView");
            webView2 = null;
        }
        v6.l.a(webView2);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView2.getSettings().setSupportMultipleWindows(true);
        webView2.setWebViewClient(new k(new d(this), new e(this)));
        C17542s.i(frameLayout, "frameLayout");
        webView2.setWebChromeClient(new j(this, frameLayout, new f(this), new g(frameLayout, this), new h(this), new i(this)));
        webView2.addJavascriptInterface(new i(this, webView2, new j(this), new k(this)), "Android");
        String str2 = this.f46038y;
        if (str2 == null) {
            C17542s.z("bootstrapUrl");
        } else {
            str = str2;
        }
        webView2.loadUrl(str);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        WebView webView = this.f46035v;
        if (webView == null) {
            C17542s.z("bootstrapWebView");
            webView = null;
        }
        webView.stopLoading();
        webView.getSettings().setJavaScriptEnabled(false);
        WebView webView2 = this.f46037x;
        if (webView2 != null) {
            webView2.stopLoading();
            webView2.getSettings().setJavaScriptEnabled(false);
        }
        super.onDestroy();
    }
}
