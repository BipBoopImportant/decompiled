package p7;

import GK.C15776D;
import GK.C15791j;
import GK.C15801t;
import GK.C15804w;
import YH.C16877v;
import a7.C6749d;
import a7.C6750e;
import a7.m;
import b7.b;
import c7.C7100a;
import com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleanerFactory;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import q7.C8680b;
import r7.C8703e;
import r7.C8704f;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lp7/f;", "LGK/w;", "Lp7/e;", "", "Lq7/b;", "includeHosts", "excludeHosts", "Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;", "certificateChainCleanerFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lr7/f;", "logListService", "Lc7/a;", "Lr7/e;", "logListDataSource", "La7/e;", "policy", "Lb7/b;", "diskCache", "Lkotlin/Function0;", "", "failOnError", "La7/d;", "logger", "<init>", "(Ljava/util/Set;Ljava/util/Set;Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;Ljavax/net/ssl/X509TrustManager;Lr7/f;Lc7/a;La7/e;Lb7/b;LnI/a;La7/d;)V", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "g", "LnI/a;", "h", "La7/d;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: p7.f  reason: case insensitive filesystem */
public final class C8633f extends C8632e implements C15804w {

    /* renamed from: g  reason: collision with root package name */
    private final C17631a<Boolean> f55426g;

    /* renamed from: h  reason: collision with root package name */
    private final C6749d f55427h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8633f(Set<C8680b> set, Set<C8680b> set2, CertificateChainCleanerFactory certificateChainCleanerFactory, X509TrustManager x509TrustManager, C8704f fVar, C7100a<C8703e> aVar, C6750e eVar, b bVar, C17631a<Boolean> aVar2, C6749d dVar) {
        super(set, set2, certificateChainCleanerFactory, x509TrustManager, fVar, aVar, eVar, bVar);
        C17542s.j(set, "includeHosts");
        C17542s.j(set2, "excludeHosts");
        C17542s.j(aVar2, "failOnError");
        this.f55426g = aVar2;
        this.f55427h = dVar;
    }

    public C15776D intercept(C15804w.a aVar) {
        List<Certificate> list;
        C17542s.j(aVar, "chain");
        String i10 = aVar.t().k().i();
        C15791j d10 = aVar.d();
        if (d10 != null) {
            C15801t b10 = d10.b();
            if (b10 == null || (list = b10.d()) == null) {
                list = C16877v.n();
            }
            m g10 = d10.c() instanceof SSLSocket ? g(i10, list) : new m.c.C0733c(i10);
            C6749d dVar = this.f55427h;
            if (dVar != null) {
                dVar.a(i10, g10);
            }
            if (!(g10 instanceof m.b) || !this.f55426g.invoke().booleanValue()) {
                return aVar.b(aVar.t());
            }
            throw new SSLPeerUnverifiedException("Certificate transparency failed");
        }
        throw new IllegalStateException("No connection found. Verify interceptor is added using addNetworkInterceptor");
    }
}
