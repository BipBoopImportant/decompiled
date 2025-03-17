package N8;

import HJ.C15854t;
import I8.a;
import J8.b;
import M8.d;
import M8.e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010*\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010%R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0014\u00102\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010-¨\u00063"}, d2 = {"LN8/f;", "", "LJ8/b;", "symmetricCryptor", "", "", "plainHeaders", "headersToEncrypt", "standardHeaders", "LM8/e;", "type", "<init>", "(LJ8/b;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;LM8/e;)V", "LN8/d;", "b", "()LN8/d;", "LM8/d;", "telemetrySender", "LXH/N;", "a", "(LM8/d;)V", "LJ8/b;", "getSymmetricCryptor", "()LJ8/b;", "Ljava/util/Map;", "getPlainHeaders", "()Ljava/util/Map;", "c", "getHeadersToEncrypt", "d", "getStandardHeaders", "e", "LM8/e;", "getType", "()LM8/e;", "", "f", "J", "standardSize", "g", "encryptedSize", "h", "plainSize", "", "i", "Z", "shouldCollectPlainHeaders", "j", "shouldCollectEncryptedHeaders", "k", "shouldCollectStandardHeaders", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f {

    /* renamed from: a  reason: collision with root package name */
    private final b f39172a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f39173b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f39174c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f39175d;

    /* renamed from: e  reason: collision with root package name */
    private final e f39176e;

    /* renamed from: f  reason: collision with root package name */
    private final long f39177f;

    /* renamed from: g  reason: collision with root package name */
    private final long f39178g;

    /* renamed from: h  reason: collision with root package name */
    private final long f39179h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f39180i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f39181j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f39182k;

    public f(b bVar, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, e eVar) {
        C17542s.j(bVar, "symmetricCryptor");
        C17542s.j(map, "plainHeaders");
        C17542s.j(map2, "headersToEncrypt");
        C17542s.j(map3, "standardHeaders");
        C17542s.j(eVar, "type");
        this.f39172a = bVar;
        this.f39173b = map;
        this.f39174c = map2;
        this.f39175d = map3;
        this.f39176e = eVar;
        long b10 = b.h(map3);
        this.f39177f = b10;
        long b11 = b.h(map2);
        this.f39178g = b11;
        long b12 = b.h(map);
        this.f39179h = b12;
        boolean z10 = false;
        this.f39180i = b12 < 8000;
        long j10 = b12 + b11;
        this.f39181j = j10 < 8000;
        this.f39182k = j10 + b10 < 8000 ? true : z10;
    }

    public final void a(d dVar) {
        C17542s.j(dVar, "telemetrySender");
        if (!this.f39180i) {
            dVar.c(this.f39176e == e.REQUEST ? "plain_request_headers_max_size_exceeded" : "plain_response_headers_max_size_exceeded", this.f39179h, 8000);
        }
        if (!this.f39181j) {
            dVar.c(this.f39176e == e.REQUEST ? "encrypted_request_headers_max_size_exceeded" : "encrypted_response_headers_max_size_exceeded", this.f39178g, 8000 - this.f39179h);
        }
    }

    public final d b() {
        Map<String, String> map;
        Map<String, String> map2 = null;
        if (this.f39180i) {
            map = this.f39173b;
            if (map.isEmpty()) {
                map = null;
            }
        } else {
            map = a.f37083a.e();
        }
        Map<String, String> map3 = this.f39174c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map3.entrySet()) {
            if (!C15854t.v0((String) next.getValue())) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        byte[] a10 = this.f39181j ? linkedHashMap.isEmpty() ? null : b.f(this.f39172a, linkedHashMap) : a.f37083a.d();
        if (this.f39182k) {
            Map<String, String> map4 = this.f39175d;
            if (!map4.isEmpty()) {
                map2 = map4;
            }
        } else {
            map2 = a.f37083a.e();
        }
        return new d(map, a10, map2);
    }
}
