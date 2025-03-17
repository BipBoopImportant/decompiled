package com.afterpay.android.internal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import t6.e;
import t6.f;
import v6.i;
import v6.l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/afterpay/android/internal/AfterpayInfoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "LXH/N;", "r0", "q0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/webkit/WebView;", "v", "Landroid/webkit/WebView;", "webView", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AfterpayInfoActivity extends AppCompatActivity {

    /* renamed from: v  reason: collision with root package name */
    private WebView f45996v;

    private final void q0() {
        setResult(-1);
        finish();
    }

    private final void r0() {
        Intent intent = getIntent();
        C17542s.i(intent, "intent");
        String c10 = i.c(intent);
        if (c10 == null) {
            q0();
            return;
        }
        WebView webView = this.f45996v;
        if (webView == null) {
            C17542s.z("webView");
            webView = null;
        }
        webView.loadUrl(c10);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(f.f56641b);
        getWindow().setLayout(-1, -1);
        View findViewById = findViewById(e.f56638b);
        C17542s.i(findViewById, "findViewById<WebView>(R.id.afterpay_webView)");
        this.f45996v = l.a((WebView) findViewById);
        r0();
    }
}
