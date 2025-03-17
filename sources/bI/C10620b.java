package Bi;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import h9.C7941b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR%\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LBi/b;", "Lh9/b;", "Lkotlin/Function1;", "Landroid/webkit/WebResourceRequest;", "", "interceptUrlLoading", "<init>", "(LnI/l;)V", "Landroid/webkit/WebView;", "view", "request", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "d", "LnI/l;", "getInterceptUrlLoading", "()LnI/l;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Bi.b  reason: case insensitive filesystem */
public final class C10620b extends C7941b {

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<WebResourceRequest, Boolean> f79194d;

    public C10620b(C17642l<? super WebResourceRequest, Boolean> lVar) {
        C17542s.j(lVar, "interceptUrlLoading");
        this.f79194d = lVar;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f79194d.invoke(webResourceRequest).booleanValue();
    }
}
