package b5;

import a5.b;
import aL.C17032a;
import android.webkit.WebResourceError;
import b5.C7059a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

public class n extends b {

    /* renamed from: a  reason: collision with root package name */
    private WebResourceError f45422a;

    /* renamed from: b  reason: collision with root package name */
    private WebResourceErrorBoundaryInterface f45423b;

    public n(InvocationHandler invocationHandler) {
        this.f45423b = (WebResourceErrorBoundaryInterface) C17032a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceErrorBoundaryInterface c() {
        if (this.f45423b == null) {
            this.f45423b = (WebResourceErrorBoundaryInterface) C17032a.a(WebResourceErrorBoundaryInterface.class, p.c().d(this.f45422a));
        }
        return this.f45423b;
    }

    private WebResourceError d() {
        if (this.f45422a == null) {
            this.f45422a = p.c().c(Proxy.getInvocationHandler(this.f45423b));
        }
        return this.f45422a;
    }

    public CharSequence a() {
        C7059a.b bVar = o.f45480v;
        if (bVar.b()) {
            return C7060b.a(d());
        }
        if (bVar.c()) {
            return c().getDescription();
        }
        throw o.a();
    }

    public int b() {
        C7059a.b bVar = o.f45481w;
        if (bVar.b()) {
            return C7060b.b(d());
        }
        if (bVar.c()) {
            return c().getErrorCode();
        }
        throw o.a();
    }

    public n(WebResourceError webResourceError) {
        this.f45422a = webResourceError;
    }
}
