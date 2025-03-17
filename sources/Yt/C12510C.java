package yt;

import XH.C16807N;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import h9.C7941b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import yt.f;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001BK\u0012*\u0010\t\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\t\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\t\u0010\u0011R;\u0010\t\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R'\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lyt/C;", "Lh9/b;", "Lkotlin/Function2;", "", "Lkotlin/Function1;", "Lyt/f$c;", "Lcom/ingka/ikea/instore/impl/foodmobile/composable/RedirectActions;", "LXH/N;", "", "shouldOverrideUrlLoading", "action", "<init>", "(LnI/p;LnI/l;)V", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "d", "LnI/p;", "getShouldOverrideUrlLoading", "()LnI/p;", "e", "LnI/l;", "getAction", "()LnI/l;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yt.C  reason: case insensitive filesystem */
final class C12510C extends C7941b {

    /* renamed from: d  reason: collision with root package name */
    private final p<String, C17642l<? super f.c, C16807N>, Boolean> f107276d;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<f.c, C16807N> f107277e;

    public C12510C(p<? super String, ? super C17642l<? super f.c, C16807N>, Boolean> pVar, C17642l<? super f.c, C16807N> lVar) {
        C17542s.j(pVar, "shouldOverrideUrlLoading");
        C17542s.j(lVar, "action");
        this.f107276d = pVar;
        this.f107277e = lVar;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f107276d.invoke(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), this.f107277e).booleanValue();
    }
}
