package hb;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.browser.customtabs.d;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import u2.C6012a;

public class n extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String f73551e = "n";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Uri f73552a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f73553b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public WebView f73554c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public List<Uri> f73555d = new ArrayList();

    class a extends WebViewClient {
        a() {
        }

        private boolean a(Uri uri) {
            for (Uri c10 : n.this.f73555d) {
                if (c(c10, uri)) {
                    return true;
                }
            }
            return false;
        }

        private boolean b(Uri uri) {
            Uri d10 = n.this.f73552a;
            if (!"data".equals(uri.getScheme()) && !c(uri, d10) && !a(uri)) {
                try {
                    new d.C0230d().l(n.this.f73553b).a().a(n.this, uri);
                    return true;
                } catch (ActivityNotFoundException unused) {
                    Log.e(n.f73551e, String.format("ActivityNotFoundException while launching '%s'", new Object[]{uri}));
                }
            }
            return false;
        }

        private boolean c(Uri uri, Uri uri2) {
            return uri.getScheme().equalsIgnoreCase(uri2.getScheme()) && uri.getHost().equalsIgnoreCase(uri2.getHost()) && uri.getPort() == uri2.getPort();
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            ViewGroup viewGroup = (ViewGroup) webView.getParent();
            viewGroup.removeView(webView);
            webView.destroy();
            WebView unused = n.this.f73554c = new WebView(webView.getContext());
            n.this.f73554c.setWebViewClient(this);
            n.j(n.this.f73554c.getSettings());
            viewGroup.addView(n.this.f73554c);
            Toast.makeText(webView.getContext(), "Recovering from crash", 1).show();
            n.this.f73554c.loadUrl(n.this.f73552a.toString());
            return true;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return b(Uri.parse(str));
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return b(webResourceRequest.getUrl());
        }
    }

    public static Intent h(Context context, Uri uri, d dVar) {
        Intent intent = new Intent(context, n.class);
        intent.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.LAUNCH_URL", uri);
        intent.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_STATUS_BAR_COLOR", C6012a.c(context, dVar.f73509b));
        intent.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_NAVIGATION_BAR_COLOR", C6012a.c(context, dVar.f73511d));
        if (dVar.f73519l != null) {
            intent.putStringArrayListExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_EXTRA_ORIGINS", new ArrayList(dVar.f73519l));
        }
        return intent;
    }

    private WebViewClient i() {
        return new a();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    public static void j(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        ArrayList<String> stringArrayListExtra;
        super.onCreate(bundle);
        Uri uri = (Uri) getIntent().getParcelableExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.LAUNCH_URL");
        this.f73552a = uri;
        if (Constants.SCHEME.equals(uri.getScheme())) {
            if (getIntent().hasExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_NAVIGATION_BAR_COLOR")) {
                getWindow().setNavigationBarColor(getIntent().getIntExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_NAVIGATION_BAR_COLOR", 0));
            }
            if (getIntent().hasExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_STATUS_BAR_COLOR")) {
                this.f73553b = getIntent().getIntExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_STATUS_BAR_COLOR", 0);
                getWindow().setStatusBarColor(this.f73553b);
            } else {
                this.f73553b = getWindow().getStatusBarColor();
            }
            if (getIntent().hasExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_EXTRA_ORIGINS") && (stringArrayListExtra = getIntent().getStringArrayListExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_EXTRA_ORIGINS")) != null) {
                for (String next : stringArrayListExtra) {
                    Uri parse = Uri.parse(next);
                    if (!Constants.SCHEME.equalsIgnoreCase(parse.getScheme())) {
                        String str = f73551e;
                        Log.w(str, "Only 'https' origins are accepted. Ignoring extra origin: " + next);
                    } else {
                        this.f73555d.add(parse);
                    }
                }
            }
            WebView webView = new WebView(this);
            this.f73554c = webView;
            webView.setWebViewClient(i());
            j(this.f73554c.getSettings());
            setContentView(this.f73554c, new ViewGroup.LayoutParams(-1, -1));
            if (bundle != null) {
                this.f73554c.restoreState(bundle);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Referer", "android-app://" + getPackageName() + "/");
            this.f73554c.loadUrl(this.f73552a.toString(), hashMap);
            return;
        }
        throw new IllegalArgumentException("launchUrl scheme must be 'https'");
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !this.f73554c.canGoBack()) {
            return super.onKeyDown(i10, keyEvent);
        }
        this.f73554c.goBack();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        WebView webView = this.f73554c;
        if (webView != null) {
            webView.onPause();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        WebView webView = this.f73554c;
        if (webView != null) {
            webView.onResume();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        WebView webView = this.f73554c;
        if (webView != null) {
            webView.saveState(bundle);
        }
    }
}
