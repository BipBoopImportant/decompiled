package I7;

import C7.f;
import Y7.k;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

public class h implements f {

    /* renamed from: b  reason: collision with root package name */
    private final i f37009b;

    /* renamed from: c  reason: collision with root package name */
    private final URL f37010c;

    /* renamed from: d  reason: collision with root package name */
    private final String f37011d;

    /* renamed from: e  reason: collision with root package name */
    private String f37012e;

    /* renamed from: f  reason: collision with root package name */
    private URL f37013f;

    /* renamed from: g  reason: collision with root package name */
    private volatile byte[] f37014g;

    /* renamed from: h  reason: collision with root package name */
    private int f37015h;

    public h(URL url) {
        this(url, i.f37017b);
    }

    private byte[] d() {
        if (this.f37014g == null) {
            this.f37014g = c().getBytes(f.f33749a);
        }
        return this.f37014g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f37012e)) {
            String str = this.f37011d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) k.d(this.f37010c)).toString();
            }
            this.f37012e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f37012e;
    }

    private URL g() {
        if (this.f37013f == null) {
            this.f37013f = new URL(f());
        }
        return this.f37013f;
    }

    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f37011d;
        return str != null ? str : ((URL) k.d(this.f37010c)).toString();
    }

    public Map<String, String> e() {
        return this.f37009b.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return c().equals(hVar.c()) && this.f37009b.equals(hVar.f37009b);
    }

    public String h() {
        return f();
    }

    public int hashCode() {
        if (this.f37015h == 0) {
            int hashCode = c().hashCode();
            this.f37015h = hashCode;
            this.f37015h = (hashCode * 31) + this.f37009b.hashCode();
        }
        return this.f37015h;
    }

    public URL i() {
        return g();
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f37017b);
    }

    public h(URL url, i iVar) {
        this.f37010c = (URL) k.d(url);
        this.f37011d = null;
        this.f37009b = (i) k.d(iVar);
    }

    public h(String str, i iVar) {
        this.f37010c = null;
        this.f37011d = k.b(str);
        this.f37009b = (i) k.d(iVar);
    }
}
