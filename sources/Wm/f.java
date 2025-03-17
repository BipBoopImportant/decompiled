package Wm;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import h9.C7941b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR%\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LWm/f;", "Lh9/b;", "Lkotlin/Function1;", "", "", "shouldOverrideUrl", "<init>", "(LnI/l;)V", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "d", "LnI/l;", "getShouldOverrideUrl", "()LnI/l;", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f extends C7941b {

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<String, Boolean> f89069d;

    public f(C17642l<? super String, Boolean> lVar) {
        C17542s.j(lVar, "shouldOverrideUrl");
        this.f89069d = lVar;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f89069d.invoke(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null)).booleanValue();
    }
}
