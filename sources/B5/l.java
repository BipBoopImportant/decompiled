package b5;

import a5.C6743a;
import aL.C17032a;
import android.webkit.SafeBrowsingResponse;
import b5.C7059a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

public class l extends C6743a {

    /* renamed from: a  reason: collision with root package name */
    private SafeBrowsingResponse f45417a;

    /* renamed from: b  reason: collision with root package name */
    private SafeBrowsingResponseBoundaryInterface f45418b;

    public l(InvocationHandler invocationHandler) {
        this.f45418b = (SafeBrowsingResponseBoundaryInterface) C17032a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface b() {
        if (this.f45418b == null) {
            this.f45418b = (SafeBrowsingResponseBoundaryInterface) C17032a.a(SafeBrowsingResponseBoundaryInterface.class, p.c().b(this.f45417a));
        }
        return this.f45418b;
    }

    private SafeBrowsingResponse c() {
        if (this.f45417a == null) {
            this.f45417a = p.c().a(Proxy.getInvocationHandler(this.f45418b));
        }
        return this.f45417a;
    }

    public void a(boolean z10) {
        C7059a.f fVar = o.f45484z;
        if (fVar.b()) {
            C7063e.a(c(), z10);
        } else if (fVar.c()) {
            b().showInterstitial(z10);
        } else {
            throw o.a();
        }
    }

    public l(SafeBrowsingResponse safeBrowsingResponse) {
        this.f45417a = safeBrowsingResponse;
    }
}
