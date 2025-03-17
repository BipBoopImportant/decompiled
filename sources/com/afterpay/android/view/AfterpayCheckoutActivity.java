package com.afterpay.android.view;

import XH.C16807N;
import YH.C16877v;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.activity.v;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.c;
import com.afterpay.android.Afterpay;
import com.afterpay.android.view.l;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import nI.C17631a;
import nI.C17642l;
import t6.C8834c;
import t6.f;
import v6.i;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0003R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/afterpay/android/view/AfterpayCheckoutActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "LXH/N;", "u0", "Landroid/net/Uri;", "url", "v0", "(Landroid/net/Uri;)V", "q0", "Lcom/afterpay/android/view/l;", "status", "D", "(Lcom/afterpay/android/view/l;)V", "Lt6/c;", "E", "(Lt6/c;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Landroid/webkit/WebView;", "v", "Landroid/webkit/WebView;", "webView", "Companion", "a", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AfterpayCheckoutActivity extends AppCompatActivity {
    private static final a Companion = new a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: w  reason: collision with root package name */
    private static final List<String> f46032w = C16877v.q("portal.afterpay.com", "portal.sandbox.afterpay.com", "portal.clearpay.co.uk", "portal.sandbox.clearpay.co.uk", "checkout.clearpay.com", "checkout.sandbox.clearpay.com");

    /* renamed from: v  reason: collision with root package name */
    private WebView f46033v;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/afterpay/android/view/AfterpayCheckoutActivity$a;", "", "<init>", "()V", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17631a<C16807N> {
        b(Object obj) {
            super(0, obj, AfterpayCheckoutActivity.class, "handleError", "handleError()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((AfterpayCheckoutActivity) this.receiver).q0();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17642l<l, C16807N> {
        c(Object obj) {
            super(1, obj, AfterpayCheckoutActivity.class, "finish", "finish(Lcom/afterpay/android/view/CheckoutStatus;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((l) obj);
            return C16807N.f139792a;
        }

        public final void t(l lVar) {
            C17542s.j(lVar, "p0");
            ((AfterpayCheckoutActivity) this.receiver).D(lVar);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* synthetic */ class d extends C17540p implements C17642l<Uri, C16807N> {
        d(Object obj) {
            super(1, obj, AfterpayCheckoutActivity.class, "open", "open(Landroid/net/Uri;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((Uri) obj);
            return C16807N.f139792a;
        }

        public final void t(Uri uri) {
            C17542s.j(uri, "p0");
            ((AfterpayCheckoutActivity) this.receiver).v0(uri);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/afterpay/android/view/AfterpayCheckoutActivity$e", "Landroidx/activity/v;", "LXH/N;", "handleOnBackPressed", "()V", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class e extends v {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AfterpayCheckoutActivity f46034b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AfterpayCheckoutActivity afterpayCheckoutActivity) {
            super(true);
            this.f46034b = afterpayCheckoutActivity;
        }

        public void handleOnBackPressed() {
            this.f46034b.E(C8834c.USER_INITIATED);
        }
    }

    /* access modifiers changed from: private */
    public final void D(l lVar) {
        if (lVar instanceof l.c) {
            setResult(-1, i.g(new Intent(), ((l.c) lVar).a()));
            finish();
        } else if (C17542s.e(lVar, l.a.f46079a)) {
            E(C8834c.USER_INITIATED);
        }
    }

    /* access modifiers changed from: private */
    public final void E(C8834c cVar) {
        setResult(0, i.d(new Intent(), cVar));
        finish();
    }

    /* access modifiers changed from: private */
    public final void q0() {
        WebView webView = this.f46033v;
        if (webView == null) {
            C17542s.z("webView");
            webView = null;
        }
        webView.loadUrl("about:blank");
        c.a aVar = new c.a(this);
        Afterpay afterpay = Afterpay.f45951a;
        c.a title = aVar.setTitle(afterpay.i().n());
        V v10 = V.f144353a;
        String format = String.format(afterpay.i().j(), Arrays.copyOf(new Object[]{getResources().getString(afterpay.b().b())}, 1));
        C17542s.i(format, "format(format, *args)");
        title.f(format).l(afterpay.i().m(), new a(this)).g(afterpay.i().b(), new b()).i(new c(this)).p();
    }

    /* access modifiers changed from: private */
    public static final void r0(AfterpayCheckoutActivity afterpayCheckoutActivity, DialogInterface dialogInterface, int i10) {
        C17542s.j(afterpayCheckoutActivity, "this$0");
        afterpayCheckoutActivity.u0();
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void s0(DialogInterface dialogInterface, int i10) {
        dialogInterface.cancel();
    }

    /* access modifiers changed from: private */
    public static final void t0(AfterpayCheckoutActivity afterpayCheckoutActivity, DialogInterface dialogInterface) {
        C17542s.j(afterpayCheckoutActivity, "this$0");
        afterpayCheckoutActivity.E(C8834c.USER_INITIATED);
    }

    private final void u0() {
        Intent intent = getIntent();
        C17542s.i(intent, "intent");
        String b10 = i.b(intent);
        if (b10 == null) {
            E(C8834c.NO_CHECKOUT_URL);
        } else if (C16877v.l0(f46032w, Uri.parse(b10).getHost())) {
            WebView webView = this.f46033v;
            if (webView == null) {
                C17542s.z("webView");
                webView = null;
            }
            webView.loadUrl(b10);
        } else if (C17542s.e(b10, "LANGUAGE_NOT_SUPPORTED")) {
            E(C8834c.LANGUAGE_NOT_SUPPORTED);
        } else {
            E(C8834c.INVALID_CHECKOUT_URL);
        }
    }

    /* access modifiers changed from: private */
    public final void v0(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(f.f56641b);
        getWindow().setLayout(-1, -1);
        View findViewById = findViewById(t6.e.f56638b);
        WebView webView = (WebView) findViewById;
        C17542s.i(webView, "onCreate$lambda$0");
        v6.l.a(webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.getSettings().setDomStorageEnabled(true);
        b bVar = new b(this);
        c cVar = new c(this);
        Intent intent = getIntent();
        C17542s.i(intent, "intent");
        webView.setWebViewClient(new h(bVar, cVar, i.a(intent)));
        webView.setWebChromeClient(new g(new d(this)));
        C17542s.i(findViewById, "findViewById<WebView>(R.…lLink = ::open)\n        }");
        this.f46033v = webView;
        getOnBackPressedDispatcher().i(this, new e(this));
        u0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        WebView webView = this.f46033v;
        if (webView == null) {
            C17542s.z("webView");
            webView = null;
        }
        webView.stopLoading();
        webView.getSettings().setJavaScriptEnabled(false);
        super.onDestroy();
    }
}
