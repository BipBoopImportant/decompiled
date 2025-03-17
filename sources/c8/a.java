package C8;

import D8.c;
import HJ.C15838d;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16511H;
import TJ.C16532g;
import YH.C16877v;
import YH.X;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\u0004\u0018\u00010\u0004*\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LC8/a;", "", "<init>", "()V", "", "endpoint", "", "requestData", "", "headers", "LC8/d;", "e", "(Ljava/lang/String;[BLjava/util/Map;)LC8/d;", "", "exception", "LXH/N;", "c", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "d", "(Ljava/lang/String;Ljava/util/Map;)LC8/d;", "jsonString", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)LC8/d;", "payload", "protoVersion", "h", "(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;)LC8/d;", "LD8/c;", "a", "LD8/c;", "logger", "b", "(LC8/d;)Ljava/lang/String;", "eTag", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0518a f33757b = new C0518a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static b f33758c = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final C16504A<d> f33759d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C16532g<d> f33760e;

    /* renamed from: a  reason: collision with root package name */
    private final c f33761a = new c("HttpConnection");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LC8/a$a;", "", "<init>", "()V", "LTJ/g;", "LC8/d;", "responseFlow", "LTJ/g;", "a", "()LTJ/g;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: C8.a$a  reason: collision with other inner class name */
    public static final class C0518a {
        private C0518a() {
        }

        public final C16532g<d> a() {
            return a.f33760e;
        }

        public /* synthetic */ C0518a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C16504A<d> b10 = C16511H.b(5, 0, (C16428d) null, 6, (Object) null);
        f33759d = b10;
        f33760e = b10;
    }

    private final String b(d dVar) {
        List list = dVar.e().get("ETag");
        if (list != null) {
            return (String) C16877v.y0(list);
        }
        return null;
    }

    private final void c(String str, Throwable th2) {
        c cVar = this.f33761a;
        cVar.k("[ERROR] Contentsquare failed to execute request with endpoint [" + str + "]: " + th2.getMessage() + ']');
    }

    private final d e(String str, byte[] bArr, Map<String, String> map) {
        c cVar = this.f33761a;
        cVar.f("Prepare HTTP POST for " + str);
        g gVar = new g(str, map, 0, 0, 12, (DefaultConstructorMarker) null);
        d b10 = f33758c.b(gVar, bArr);
        c cVar2 = this.f33761a;
        cVar2.f("Response HTTP POST: status " + b10.f() + " for " + gVar.a());
        int f10 = b10.f();
        if ((400 <= f10 && f10 < 600) || b10.f() == -1) {
            if (b10.d() == null) {
                b10.k(new UnsupportedOperationException("Exception while POST request: " + b10.f()));
            }
            String a10 = gVar.a();
            Throwable d10 = b10.d();
            C17542s.g(d10);
            c(a10, d10);
        }
        f33759d.a(b10);
        return b10;
    }

    public static /* synthetic */ d g(a aVar, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = X.j();
        }
        return aVar.f(str, str2, map);
    }

    public static /* synthetic */ d i(a aVar, String str, byte[] bArr, String str2, Map map, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            map = X.j();
        }
        return aVar.h(str, bArr, str2, map);
    }

    public final d d(String str, Map<String, String> map) {
        C17542s.j(str, "endpoint");
        C17542s.j(map, "headers");
        c cVar = this.f33761a;
        cVar.f("Prepare HTTP GET for " + str);
        g gVar = new g(str, map, 0, 0, 12, (DefaultConstructorMarker) null);
        d a10 = f33758c.a(gVar);
        String b10 = b(a10);
        String concat = b10 != null ? "\n Http-not-modified: cached response still valid with ETag ".concat(b10) : null;
        if (concat == null) {
            concat = "";
        }
        c cVar2 = this.f33761a;
        cVar2.f(a10.f() + " HTTP response for " + gVar.a() + ' ' + concat);
        int f10 = a10.f();
        if ((400 <= f10 && f10 < 600) || a10.f() == -1) {
            if (a10.d() == null) {
                a10.k(new UnsupportedOperationException("Exception while GET request: " + a10.f()));
            }
            c cVar3 = this.f33761a;
            Throwable d10 = a10.d();
            cVar3.i(d10, "Exception while processing Http GET request on $" + gVar.a());
            String a11 = gVar.a();
            Throwable d11 = a10.d();
            C17542s.g(d11);
            c(a11, d11);
        }
        f33759d.a(a10);
        return a10;
    }

    public final d f(String str, String str2, Map<String, String> map) {
        C17542s.j(str, "endpoint");
        C17542s.j(str2, "jsonString");
        C17542s.j(map, "headers");
        Map<String, String> z10 = X.z(map);
        StringBuilder sb2 = new StringBuilder("application/json; charset=");
        Charset charset = C15838d.f135279b;
        sb2.append(charset.name());
        z10.put("Content-Type", sb2.toString());
        byte[] bytes = str2.getBytes(charset);
        C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
        return e(str, bytes, z10);
    }

    public final d h(String str, byte[] bArr, String str2, Map<String, String> map) {
        C17542s.j(str, "endpoint");
        C17542s.j(bArr, "payload");
        C17542s.j(str2, "protoVersion");
        C17542s.j(map, "headers");
        Map<String, String> z10 = X.z(map);
        z10.put("Content-Type", "application/x-protobuf");
        z10.put("Content-Encoding", "gzip");
        z10.put("X-Proto-Schema-Version", str2);
        return e(str, bArr, z10);
    }
}
