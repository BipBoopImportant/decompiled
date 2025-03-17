package J7;

import C7.i;
import I7.h;
import I7.o;
import I7.p;
import I7.s;
import java.io.InputStream;
import java.net.URL;

public class g implements o<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final o<h, InputStream> f37402a;

    public static class a implements p<URL, InputStream> {
        public o<URL, InputStream> d(s sVar) {
            return new g(sVar.d(h.class, InputStream.class));
        }

        public void teardown() {
        }
    }

    public g(o<h, InputStream> oVar) {
        this.f37402a = oVar;
    }

    /* renamed from: c */
    public o.a<InputStream> b(URL url, int i10, int i11, i iVar) {
        return this.f37402a.b(new h(url), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean a(URL url) {
        return true;
    }
}
