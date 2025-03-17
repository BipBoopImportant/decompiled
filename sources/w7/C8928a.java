package w7;

import GK.C15774B;
import GK.C15775C;
import GK.C15776D;
import GK.C15777E;
import GK.C15786e;
import GK.C15802u;
import GK.C15803v;
import GK.C15805x;
import GK.z;
import VK.C16697a;
import YH.X;
import com.auth0.android.request.internal.g;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.C8930c;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001\u0019BI\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB=\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8AX\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lw7/a;", "Lw7/e;", "", "connectTimeout", "readTimeout", "", "", "defaultHeaders", "", "enableLogging", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "<init>", "(IILjava/util/Map;ZLjavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V", "(IILjava/util/Map;Z)V", "LGK/v;", "url", "Lw7/g;", "options", "LGK/e;", "b", "(LGK/v;Lw7/g;)LGK/e;", "Lw7/h;", "a", "(Ljava/lang/String;Lw7/g;)Lw7/h;", "Ljava/util/Map;", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "LGK/z;", "c", "LGK/z;", "getOkHttpClient$auth0_release", "()LGK/z;", "okHttpClient", "d", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: w7.a  reason: case insensitive filesystem */
public final class C8928a implements C8932e {

    /* renamed from: d  reason: collision with root package name */
    public static final C0921a f57333d = new C0921a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final C15805x f57334e = C15805x.f135130e.a("application/json; charset=utf-8");

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f57335a;

    /* renamed from: b  reason: collision with root package name */
    private final Gson f57336b;

    /* renamed from: c  reason: collision with root package name */
    private final z f57337c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw7/a$a;", "", "<init>", "()V", "", "DEFAULT_TIMEOUT_SECONDS", "I", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w7.a$a  reason: collision with other inner class name */
    public static final class C0921a {
        public /* synthetic */ C0921a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0921a() {
        }
    }

    public C8928a(int i10, int i11, Map<String, String> map, boolean z10, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        C17542s.j(map, "defaultHeaders");
        this.f57335a = map;
        this.f57336b = g.f46454a.a();
        z.a aVar = new z.a();
        if (z10) {
            aVar.a(new C16697a((C16697a.b) null, 1, (DefaultConstructorMarker) null).d(C16697a.C3418a.BODY));
        }
        long j10 = (long) i10;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.f(j10, timeUnit);
        aVar.R((long) i11, timeUnit);
        if (!(sSLSocketFactory == null || x509TrustManager == null)) {
            aVar.T(sSLSocketFactory, x509TrustManager);
        }
        this.f57337c = aVar.c();
    }

    private final C15786e b(C15803v vVar, g gVar) {
        C15774B.a aVar = new C15774B.a();
        C15803v.a k10 = vVar.k();
        if (gVar.b() instanceof C8930c.b) {
            Map<String, Object> c10 = gVar.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : c10.entrySet()) {
                if (next.getValue() instanceof String) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object value = entry.getValue();
                C17542s.h(value, "null cannot be cast to non-null type kotlin.String");
                arrayList.add(k10.d((String) entry.getKey(), (String) value));
            }
            aVar.g(gVar.b().toString(), (C15775C) null);
        } else {
            C15775C.a aVar2 = C15775C.f134790a;
            String w10 = this.f57336b.w(gVar.c());
            C17542s.i(w10, "gson.toJson(options.parameters)");
            aVar.g(gVar.b().toString(), aVar2.g(w10, f57334e));
        }
        return this.f57337c.b(aVar.m(k10.e()).f(C15802u.f135106b.g(X.s(this.f57335a, gVar.a()))).b());
    }

    public h a(String str, g gVar) {
        C17542s.j(str, "url");
        C17542s.j(gVar, "options");
        C15776D execute = FirebasePerfOkHttpClient.execute(b(C15803v.f135109k.d(str), gVar));
        int g10 = execute.g();
        C15777E c10 = execute.c();
        C17542s.g(c10);
        return new h(g10, c10.c(), execute.q().s());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8928a(int i10, int i11, Map map, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 10 : i10, (i12 & 2) != 0 ? 10 : i11, (i12 & 4) != 0 ? X.j() : map, (i12 & 8) != 0 ? false : z10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8928a(int i10, int i11, Map<String, String> map, boolean z10) {
        this(i10, i11, map, z10, (SSLSocketFactory) null, (X509TrustManager) null);
        C17542s.j(map, "defaultHeaders");
    }
}
