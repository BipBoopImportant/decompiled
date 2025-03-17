package k8;

import a9.A0;
import a9.M2;
import android.webkit.WebView;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lk8/h;", "La9/A0;", "defaultWebViewIdProvider", "<init>", "(La9/A0;)V", "Landroid/webkit/WebView;", "webView", "", "a", "(Landroid/webkit/WebView;)J", "id", "LXH/N;", "b", "(Landroid/webkit/WebView;J)V", "c", "(Landroid/webkit/WebView;)V", "La9/A0;", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "registeredWebViewIds", "library_release"}, k = 1, mv = {1, 8, 0})
public final class h implements A0 {

    /* renamed from: a  reason: collision with root package name */
    private final A0 f54366a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakHashMap<WebView, Long> f54367b;

    public h(A0 a02) {
        C17542s.j(a02, "defaultWebViewIdProvider");
        this.f54366a = a02;
        this.f54367b = new WeakHashMap<>();
    }

    public long a(WebView webView) {
        C17542s.j(webView, "webView");
        Long l10 = this.f54367b.get(webView);
        return l10 == null ? this.f54366a.a(webView) : l10.longValue();
    }

    public final void b(WebView webView, long j10) {
        C17542s.j(webView, "webView");
        this.f54367b.put(webView, Long.valueOf(j10));
    }

    public final void c(WebView webView) {
        C17542s.j(webView, "webView");
        this.f54367b.remove(webView);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(A0 a02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new M2() : a02);
    }
}
