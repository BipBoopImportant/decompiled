package b5;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public class t {

    /* renamed from: a  reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f45489a;

    public t(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f45489a = webkitToCompatConverterBoundaryInterface;
    }

    public SafeBrowsingResponse a(InvocationHandler invocationHandler) {
        return s.a(this.f45489a.convertSafeBrowsingResponse(invocationHandler));
    }

    public InvocationHandler b(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f45489a.convertSafeBrowsingResponse((Object) safeBrowsingResponse);
    }

    public WebResourceError c(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f45489a.convertWebResourceError(invocationHandler);
    }

    public InvocationHandler d(WebResourceError webResourceError) {
        return this.f45489a.convertWebResourceError((Object) webResourceError);
    }
}
