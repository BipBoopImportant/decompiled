package w3;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import kb.C9944Y;
import kb.C9962q;
import kb.C9968w;
import lb.C10006a;
import t3.N;
import t3.q;
import w3.g;

public class m extends C6218b implements g {

    /* renamed from: e  reason: collision with root package name */
    private final boolean f31468e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f31469f;

    /* renamed from: g  reason: collision with root package name */
    private final int f31470g;

    /* renamed from: h  reason: collision with root package name */
    private final int f31471h;

    /* renamed from: i  reason: collision with root package name */
    private final String f31472i;

    /* renamed from: j  reason: collision with root package name */
    private final u f31473j;

    /* renamed from: k  reason: collision with root package name */
    private final u f31474k;

    /* renamed from: l  reason: collision with root package name */
    private final jb.m<String> f31475l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f31476m;

    /* renamed from: n  reason: collision with root package name */
    private k f31477n;

    /* renamed from: o  reason: collision with root package name */
    private HttpURLConnection f31478o;

    /* renamed from: p  reason: collision with root package name */
    private InputStream f31479p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f31480q;

    /* renamed from: r  reason: collision with root package name */
    private int f31481r;

    /* renamed from: s  reason: collision with root package name */
    private long f31482s;

    /* renamed from: t  reason: collision with root package name */
    private long f31483t;

    public static final class b implements g.a {

        /* renamed from: a  reason: collision with root package name */
        private final u f31484a = new u();

        /* renamed from: b  reason: collision with root package name */
        private C f31485b;

        /* renamed from: c  reason: collision with root package name */
        private jb.m<String> f31486c;

        /* renamed from: d  reason: collision with root package name */
        private String f31487d;

        /* renamed from: e  reason: collision with root package name */
        private int f31488e = 8000;

        /* renamed from: f  reason: collision with root package name */
        private int f31489f = 8000;

        /* renamed from: g  reason: collision with root package name */
        private boolean f31490g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f31491h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f31492i;

        /* renamed from: b */
        public m a() {
            m mVar = new m(this.f31487d, this.f31488e, this.f31489f, this.f31490g, this.f31491h, this.f31484a, this.f31486c, this.f31492i);
            C c10 = this.f31485b;
            if (c10 != null) {
                mVar.l(c10);
            }
            return mVar;
        }

        public b c(String str) {
            this.f31487d = str;
            return this;
        }
    }

    private static class c extends C9962q<String, List<String>> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, List<String>> f31493a;

        public c(Map<String, List<String>> map) {
            this.f31493a = map;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ boolean l(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ boolean m(String str) {
            return str != null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<String, List<String>> a() {
            return this.f31493a;
        }

        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        public boolean containsValue(Object obj) {
            return super.c(obj);
        }

        public Set<Map.Entry<String, List<String>>> entrySet() {
            return C9944Y.b(super.entrySet(), new n());
        }

        public boolean equals(Object obj) {
            return obj != null && super.d(obj);
        }

        public int hashCode() {
            return super.f();
        }

        public boolean isEmpty() {
            if (!super.isEmpty()) {
                return super.size() == 1 && super.containsKey((Object) null);
            }
            return true;
        }

        /* renamed from: k */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        public Set<String> keySet() {
            return C9944Y.b(super.keySet(), new o());
        }

        public int size() {
            return super.size() - (super.containsKey((Object) null) ? 1 : 0);
        }
    }

    private void A(long j10, k kVar) {
        if (j10 != 0) {
            byte[] bArr = new byte[RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT];
            while (j10 > 0) {
                int read = ((InputStream) N.i(this.f31479p)).read(bArr, 0, (int) Math.min(j10, (long) RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT));
                if (Thread.currentThread().isInterrupted()) {
                    throw new r((IOException) new InterruptedIOException(), kVar, 2000, 1);
                } else if (read != -1) {
                    j10 -= (long) read;
                    p(read);
                } else {
                    throw new r(kVar, 2008, 1);
                }
            }
        }
    }

    private void t() {
        HttpURLConnection httpURLConnection = this.f31478o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                q.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    private URL u(URL url, String str, k kVar) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new r("Unsupported protocol redirect: " + protocol, kVar, 2001, 1);
                } else if (this.f31468e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    if (this.f31469f) {
                        try {
                            return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                        } catch (MalformedURLException e10) {
                            throw new r((IOException) e10, kVar, 2001, 1);
                        }
                    } else {
                        throw new r("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", kVar, 2001, 1);
                    }
                }
            } catch (MalformedURLException e11) {
                throw new r((IOException) e11, kVar, 2001, 1);
            }
        } else {
            throw new r("Null location redirect", kVar, 2001, 1);
        }
    }

    private static boolean v(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection w(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) {
        HttpURLConnection y10 = y(url);
        y10.setConnectTimeout(this.f31470g);
        y10.setReadTimeout(this.f31471h);
        HashMap hashMap = new HashMap();
        u uVar = this.f31473j;
        if (uVar != null) {
            hashMap.putAll(uVar.a());
        }
        hashMap.putAll(this.f31474k.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            y10.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a10 = v.a(j10, j11);
        if (a10 != null) {
            y10.setRequestProperty("Range", a10);
        }
        String str = this.f31472i;
        if (str != null) {
            y10.setRequestProperty("User-Agent", str);
        }
        y10.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        y10.setInstanceFollowRedirects(z11);
        y10.setDoOutput(bArr != null);
        y10.setRequestMethod(k.c(i10));
        if (bArr != null) {
            y10.setFixedLengthStreamingMode(bArr.length);
            y10.connect();
            OutputStream outputStream = y10.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            y10.connect();
        }
        return y10;
    }

    private HttpURLConnection x(k kVar) {
        HttpURLConnection w10;
        k kVar2 = kVar;
        URL url = new URL(kVar2.f31433a.toString());
        int i10 = kVar2.f31435c;
        byte[] bArr = kVar2.f31436d;
        long j10 = kVar2.f31439g;
        long j11 = kVar2.f31440h;
        boolean d10 = kVar2.d(1);
        if (!this.f31468e && !this.f31469f && !this.f31476m) {
            return w(url, i10, bArr, j10, j11, d10, true, kVar2.f31437e);
        }
        int i11 = 0;
        URL url2 = url;
        int i12 = i10;
        byte[] bArr2 = bArr;
        while (true) {
            int i13 = i11 + 1;
            if (i11 <= 20) {
                long j12 = j10;
                long j13 = j10;
                int i14 = i12;
                int i15 = i13;
                URL url3 = url2;
                long j14 = j11;
                w10 = w(url2, i12, bArr2, j12, j11, d10, false, kVar2.f31437e);
                int responseCode = w10.getResponseCode();
                String headerField = w10.getHeaderField("Location");
                if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    URL url4 = url3;
                    w10.disconnect();
                    url2 = u(url4, headerField, kVar2);
                    i12 = i14;
                } else if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return w10;
                } else {
                    w10.disconnect();
                    if (!this.f31476m || responseCode != 302) {
                        bArr2 = null;
                        i12 = 1;
                    } else {
                        i12 = i14;
                    }
                    url2 = u(url3, headerField, kVar2);
                }
                i11 = i15;
                j10 = j13;
                j11 = j14;
            } else {
                throw new r((IOException) new NoRouteToHostException("Too many redirects: " + i13), kVar2, 2001, 1);
            }
        }
        return w10;
    }

    private int z(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f31482s;
        if (j10 != -1) {
            long j11 = j10 - this.f31483t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min((long) i11, j11);
        }
        int read = ((InputStream) N.i(this.f31479p)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f31483t += (long) read;
        p(read);
        return read;
    }

    public long b(k kVar) {
        byte[] bArr;
        this.f31477n = kVar;
        long j10 = 0;
        this.f31483t = 0;
        this.f31482s = 0;
        r(kVar);
        try {
            HttpURLConnection x10 = x(kVar);
            this.f31478o = x10;
            this.f31481r = x10.getResponseCode();
            String responseMessage = x10.getResponseMessage();
            int i10 = this.f31481r;
            long j11 = -1;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = x10.getHeaderFields();
                if (this.f31481r == 416) {
                    if (kVar.f31439g == v.c(x10.getHeaderField("Content-Range"))) {
                        this.f31480q = true;
                        s(kVar);
                        long j12 = kVar.f31440h;
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0;
                    }
                }
                InputStream errorStream = x10.getErrorStream();
                if (errorStream != null) {
                    try {
                        bArr = C10006a.b(errorStream);
                    } catch (IOException unused) {
                        bArr = N.f29467f;
                    }
                } else {
                    bArr = N.f29467f;
                }
                byte[] bArr2 = bArr;
                t();
                throw new t(this.f31481r, responseMessage, this.f31481r == 416 ? new h(2008) : null, headerFields, kVar, bArr2);
            }
            String contentType = x10.getContentType();
            jb.m<String> mVar = this.f31475l;
            if (mVar == null || mVar.apply(contentType)) {
                if (this.f31481r == 200) {
                    long j13 = kVar.f31439g;
                    if (j13 != 0) {
                        j10 = j13;
                    }
                }
                boolean v10 = v(x10);
                if (!v10) {
                    long j14 = kVar.f31440h;
                    if (j14 != -1) {
                        this.f31482s = j14;
                    } else {
                        long b10 = v.b(x10.getHeaderField("Content-Length"), x10.getHeaderField("Content-Range"));
                        if (b10 != -1) {
                            j11 = b10 - j10;
                        }
                        this.f31482s = j11;
                    }
                } else {
                    this.f31482s = kVar.f31440h;
                }
                try {
                    this.f31479p = x10.getInputStream();
                    if (v10) {
                        this.f31479p = new GZIPInputStream(this.f31479p);
                    }
                    this.f31480q = true;
                    s(kVar);
                    try {
                        A(j10, kVar);
                        return this.f31482s;
                    } catch (IOException e10) {
                        t();
                        if (e10 instanceof r) {
                            throw ((r) e10);
                        }
                        throw new r(e10, kVar, 2000, 1);
                    }
                } catch (IOException e11) {
                    t();
                    throw new r(e11, kVar, 2000, 1);
                }
            } else {
                t();
                throw new s(contentType, kVar);
            }
        } catch (IOException e12) {
            t();
            throw r.c(e12, kVar, 1);
        }
    }

    public int c(byte[] bArr, int i10, int i11) {
        try {
            return z(bArr, i10, i11);
        } catch (IOException e10) {
            throw r.c(e10, (k) N.i(this.f31477n), 2);
        }
    }

    public void close() {
        try {
            InputStream inputStream = this.f31479p;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f31479p = null;
            t();
            if (this.f31480q) {
                this.f31480q = false;
                q();
            }
            this.f31478o = null;
            this.f31477n = null;
        } catch (IOException e10) {
            throw new r(e10, (k) N.i(this.f31477n), 2000, 3);
        } catch (Throwable th2) {
            this.f31479p = null;
            t();
            if (this.f31480q) {
                this.f31480q = false;
                q();
            }
            this.f31478o = null;
            this.f31477n = null;
            throw th2;
        }
    }

    public Map<String, List<String>> e() {
        HttpURLConnection httpURLConnection = this.f31478o;
        return httpURLConnection == null ? C9968w.n() : new c(httpURLConnection.getHeaderFields());
    }

    public Uri n() {
        HttpURLConnection httpURLConnection = this.f31478o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        k kVar = this.f31477n;
        if (kVar != null) {
            return kVar.f31433a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection y(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    private m(String str, int i10, int i11, boolean z10, boolean z11, u uVar, jb.m<String> mVar, boolean z12) {
        super(true);
        this.f31472i = str;
        this.f31470g = i10;
        this.f31471h = i11;
        this.f31468e = z10;
        this.f31469f = z11;
        if (!z10 || !z11) {
            this.f31473j = uVar;
            this.f31475l = mVar;
            this.f31474k = new u();
            this.f31476m = z12;
            return;
        }
        throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
    }
}
