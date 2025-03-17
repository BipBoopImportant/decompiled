package C3;

import C3.C6407A;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kb.C9968w;
import q3.C5797h;
import t3.C5950a;
import t3.N;
import w3.g;
import w3.k;

public final class K implements M {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f33566a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33567b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33568c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f33569d;

    public K(String str, boolean z10, g.a aVar) {
        C5950a.a(!z10 || !TextUtils.isEmpty(str));
        this.f33566a = aVar;
        this.f33567b = str;
        this.f33568c = z10;
        this.f33569d = new HashMap();
    }

    public byte[] a(UUID uuid, C6407A.d dVar) {
        return x.a(this.f33566a.a(), dVar.b() + "&signedRequest=" + N.H(dVar.a()), (byte[]) null, Collections.emptyMap());
    }

    public byte[] b(UUID uuid, C6407A.a aVar) {
        String b10 = aVar.b();
        if (this.f33568c || TextUtils.isEmpty(b10)) {
            b10 = this.f33567b;
        }
        if (!TextUtils.isEmpty(b10)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = C5797h.f28133e;
            hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : C5797h.f28131c.equals(uuid) ? "application/json" : "application/octet-stream");
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f33569d) {
                hashMap.putAll(this.f33569d);
            }
            return x.a(this.f33566a.a(), b10, aVar.a(), hashMap);
        }
        k.b bVar = new k.b();
        Uri uri = Uri.EMPTY;
        throw new N(bVar.i(uri).a(), uri, C9968w.n(), 0, new IllegalStateException("No license URL"));
    }

    public void c(String str, String str2) {
        C5950a.e(str);
        C5950a.e(str2);
        synchronized (this.f33569d) {
            this.f33569d.put(str, str2);
        }
    }
}
