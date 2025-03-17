package Dc;

import Bc.g;
import com.google.firebase.perf.util.l;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

public class c<T> implements ResponseHandler<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ResponseHandler<? extends T> f59087a;

    /* renamed from: b  reason: collision with root package name */
    private final l f59088b;

    /* renamed from: c  reason: collision with root package name */
    private final g f59089c;

    public c(ResponseHandler<? extends T> responseHandler, l lVar, g gVar) {
        this.f59087a = responseHandler;
        this.f59088b = lVar;
        this.f59089c = gVar;
    }

    public T handleResponse(HttpResponse httpResponse) {
        this.f59089c.r(this.f59088b.c());
        this.f59089c.k(httpResponse.getStatusLine().getStatusCode());
        Long a10 = d.a(httpResponse);
        if (a10 != null) {
            this.f59089c.p(a10.longValue());
        }
        String b10 = d.b(httpResponse);
        if (b10 != null) {
            this.f59089c.o(b10);
        }
        this.f59089c.b();
        return this.f59087a.handleResponse(httpResponse);
    }
}
