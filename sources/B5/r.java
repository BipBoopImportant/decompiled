package b5;

import aL.C17032a;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public class r implements q {

    /* renamed from: a  reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f45488a;

    public r(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f45488a = webViewProviderFactoryBoundaryInterface;
    }

    public String[] a() {
        return this.f45488a.getSupportedFeatures();
    }

    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C17032a.a(StaticsBoundaryInterface.class, this.f45488a.getStatics());
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C17032a.a(WebkitToCompatConverterBoundaryInterface.class, this.f45488a.getWebkitToCompatConverter());
    }
}
