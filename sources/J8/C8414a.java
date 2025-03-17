package j8;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.contentsquare.android.sdk.H;

/* renamed from: j8.a  reason: case insensitive filesystem */
public final /* synthetic */ class C8414a implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f54068a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ H f54069b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f54070c;

    public /* synthetic */ C8414a(WebView webView, H h10, String str) {
        this.f54068a = webView;
        this.f54069b = h10;
        this.f54070c = str;
    }

    public final void onReceiveValue(Object obj) {
        C8415b.e(this.f54068a, this.f54069b, this.f54070c, (String) obj);
    }
}
