package w3;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t3.C5950a;
import t3.N;
import t3.q;
import w3.g;
import w3.m;

public final class l implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Context f31454a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C> f31455b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final g f31456c;

    /* renamed from: d  reason: collision with root package name */
    private g f31457d;

    /* renamed from: e  reason: collision with root package name */
    private g f31458e;

    /* renamed from: f  reason: collision with root package name */
    private g f31459f;

    /* renamed from: g  reason: collision with root package name */
    private g f31460g;

    /* renamed from: h  reason: collision with root package name */
    private g f31461h;

    /* renamed from: i  reason: collision with root package name */
    private g f31462i;

    /* renamed from: j  reason: collision with root package name */
    private g f31463j;

    /* renamed from: k  reason: collision with root package name */
    private g f31464k;

    public static final class a implements g.a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f31465a;

        /* renamed from: b  reason: collision with root package name */
        private final g.a f31466b;

        /* renamed from: c  reason: collision with root package name */
        private C f31467c;

        public a(Context context) {
            this(context, new m.b());
        }

        /* renamed from: b */
        public l a() {
            l lVar = new l(this.f31465a, this.f31466b.a());
            C c10 = this.f31467c;
            if (c10 != null) {
                lVar.l(c10);
            }
            return lVar;
        }

        public a(Context context, g.a aVar) {
            this.f31465a = context.getApplicationContext();
            this.f31466b = (g.a) C5950a.e(aVar);
        }
    }

    public l(Context context, g gVar) {
        this.f31454a = context.getApplicationContext();
        this.f31456c = (g) C5950a.e(gVar);
    }

    private void p(g gVar) {
        for (int i10 = 0; i10 < this.f31455b.size(); i10++) {
            gVar.l(this.f31455b.get(i10));
        }
    }

    private g q() {
        if (this.f31458e == null) {
            C6217a aVar = new C6217a(this.f31454a);
            this.f31458e = aVar;
            p(aVar);
        }
        return this.f31458e;
    }

    private g r() {
        if (this.f31459f == null) {
            C6220d dVar = new C6220d(this.f31454a);
            this.f31459f = dVar;
            p(dVar);
        }
        return this.f31459f;
    }

    private g s() {
        if (this.f31462i == null) {
            e eVar = new e();
            this.f31462i = eVar;
            p(eVar);
        }
        return this.f31462i;
    }

    private g t() {
        if (this.f31457d == null) {
            p pVar = new p();
            this.f31457d = pVar;
            p(pVar);
        }
        return this.f31457d;
    }

    private g u() {
        if (this.f31463j == null) {
            z zVar = new z(this.f31454a);
            this.f31463j = zVar;
            p(zVar);
        }
        return this.f31463j;
    }

    private g v() {
        if (this.f31460g == null) {
            try {
                g gVar = (g) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor((Class[]) null).newInstance((Object[]) null);
                this.f31460g = gVar;
                p(gVar);
            } catch (ClassNotFoundException unused) {
                q.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f31460g == null) {
                this.f31460g = this.f31456c;
            }
        }
        return this.f31460g;
    }

    private g w() {
        if (this.f31461h == null) {
            D d10 = new D();
            this.f31461h = d10;
            p(d10);
        }
        return this.f31461h;
    }

    private void x(g gVar, C c10) {
        if (gVar != null) {
            gVar.l(c10);
        }
    }

    public long b(k kVar) {
        C5950a.g(this.f31464k == null);
        String scheme = kVar.f31433a.getScheme();
        if (N.H0(kVar.f31433a)) {
            String path = kVar.f31433a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f31464k = t();
            } else {
                this.f31464k = q();
            }
        } else if ("asset".equals(scheme)) {
            this.f31464k = q();
        } else if ("content".equals(scheme)) {
            this.f31464k = r();
        } else if ("rtmp".equals(scheme)) {
            this.f31464k = v();
        } else if ("udp".equals(scheme)) {
            this.f31464k = w();
        } else if ("data".equals(scheme)) {
            this.f31464k = s();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f31464k = u();
        } else {
            this.f31464k = this.f31456c;
        }
        return this.f31464k.b(kVar);
    }

    public int c(byte[] bArr, int i10, int i11) {
        return ((g) C5950a.e(this.f31464k)).c(bArr, i10, i11);
    }

    public void close() {
        g gVar = this.f31464k;
        if (gVar != null) {
            try {
                gVar.close();
            } finally {
                this.f31464k = null;
            }
        }
    }

    public Map<String, List<String>> e() {
        g gVar = this.f31464k;
        return gVar == null ? Collections.emptyMap() : gVar.e();
    }

    public void l(C c10) {
        C5950a.e(c10);
        this.f31456c.l(c10);
        this.f31455b.add(c10);
        x(this.f31457d, c10);
        x(this.f31458e, c10);
        x(this.f31459f, c10);
        x(this.f31460g, c10);
        x(this.f31461h, c10);
        x(this.f31462i, c10);
        x(this.f31463j, c10);
    }

    public Uri n() {
        g gVar = this.f31464k;
        if (gVar == null) {
            return null;
        }
        return gVar.n();
    }
}
