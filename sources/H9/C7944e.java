package h9;

import XH.C16814e;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lh9/e;", "", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "<init>", "(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/webkit/WebResourceRequest;", "getRequest", "()Landroid/webkit/WebResourceRequest;", "b", "Landroid/webkit/WebResourceError;", "getError", "()Landroid/webkit/WebResourceError;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
/* renamed from: h9.e  reason: case insensitive filesystem */
public final class C7944e {

    /* renamed from: a  reason: collision with root package name */
    private final WebResourceRequest f51683a;

    /* renamed from: b  reason: collision with root package name */
    private final WebResourceError f51684b;

    public C7944e(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C17542s.j(webResourceError, UiComponentContainer.RESULT_ERROR);
        this.f51683a = webResourceRequest;
        this.f51684b = webResourceError;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7944e)) {
            return false;
        }
        C7944e eVar = (C7944e) obj;
        return C17542s.e(this.f51683a, eVar.f51683a) && C17542s.e(this.f51684b, eVar.f51684b);
    }

    public int hashCode() {
        WebResourceRequest webResourceRequest = this.f51683a;
        return ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31) + this.f51684b.hashCode();
    }

    public String toString() {
        return "WebViewError(request=" + this.f51683a + ", error=" + this.f51684b + ')';
    }
}
