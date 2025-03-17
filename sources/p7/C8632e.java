package p7;

import GK.C15793l;
import QJ.Q;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import XH.y;
import YH.C16877v;
import YH.X;
import a7.C6750e;
import a7.k;
import a7.m;
import b7.b;
import c7.C7100a;
import com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleaner;
import com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleanerFactory;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import j7.C8407a;
import j7.C8408b;
import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import q7.C8680b;
import q7.C8683e;
import r7.C8702d;
import r7.C8703e;
import r7.C8704f;
import r7.C8705g;
import tI.C17978n;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001Bu\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020 0\u0015¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010.¨\u0006/"}, d2 = {"Lp7/e;", "", "", "Lq7/b;", "includeHosts", "excludeHosts", "Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;", "certificateChainCleanerFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lr7/f;", "logListService", "Lc7/a;", "Lr7/e;", "logListDataSource", "La7/e;", "policy", "Lb7/b;", "diskCache", "<init>", "(Ljava/util/Set;Ljava/util/Set;Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;Ljavax/net/ssl/X509TrustManager;Lr7/f;Lc7/a;La7/e;Lb7/b;)V", "", "Ljava/security/cert/X509Certificate;", "certificates", "La7/m;", "f", "(Ljava/util/List;)La7/m;", "", "host", "", "d", "(Ljava/lang/String;)Z", "Ljava/security/cert/Certificate;", "g", "(Ljava/lang/String;Ljava/util/List;)La7/m;", "a", "Ljava/util/Set;", "b", "c", "Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;", "Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleaner;", "LXH/o;", "e", "()Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleaner;", "cleaner", "Lc7/a;", "La7/e;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: p7.e  reason: case insensitive filesystem */
public class C8632e {

    /* renamed from: a  reason: collision with root package name */
    private final Set<C8680b> f55418a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<C8680b> f55419b;

    /* renamed from: c  reason: collision with root package name */
    private final CertificateChainCleanerFactory f55420c;

    /* renamed from: d  reason: collision with root package name */
    private final C16824o f55421d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C7100a<C8703e> f55422e;

    /* renamed from: f  reason: collision with root package name */
    private final C6750e f55423f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lr7/e;", "<anonymous>", "(LQJ/Q;)Lr7/e;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.appmattus.certificatetransparency.internal.verifier.CertificateTransparencyBase$hasValidSignedCertificateTimestamp$result$1", f = "CertificateTransparencyBase.kt", l = {112}, m = "invokeSuspend")
    /* renamed from: p7.e$a */
    static final class a extends l implements p<Q, C17164e<? super C8703e>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f55424c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C8632e f55425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C8632e eVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f55425d = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f55425d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C8703e> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f55424c;
            if (i10 == 0) {
                y.b(obj);
                C7100a b10 = this.f55425d.f55422e;
                this.f55424c = 1;
                obj = b10.a(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public C8632e(Set<C8680b> set, Set<C8680b> set2, CertificateChainCleanerFactory certificateChainCleanerFactory, X509TrustManager x509TrustManager, C8704f fVar, C7100a<C8703e> aVar, C6750e eVar, b bVar) {
        C7100a<C8703e> aVar2;
        Set<C8680b> set3 = set;
        C17542s.j(set, "includeHosts");
        C17542s.j(set2, "excludeHosts");
        this.f55418a = set3;
        this.f55419b = set2;
        this.f55420c = certificateChainCleanerFactory;
        for (C8680b bVar2 : set3) {
            if (bVar2.a()) {
                throw new IllegalArgumentException("Certificate transparency is enabled by default on all domain names");
            } else if (this.f55419b.contains(bVar2)) {
                throw new IllegalArgumentException("Certificate transparency inclusions must not match exclude directly");
            }
        }
        if (aVar != null && fVar != null) {
            throw new IllegalArgumentException("LogListService is ignored when overriding logListDataSource");
        } else if (aVar == null || bVar == null) {
            X509TrustManager x509TrustManager2 = x509TrustManager;
            this.f55421d = C16825p.b(new C8631d(x509TrustManager, this));
            if (aVar == null) {
                C8702d dVar = C8702d.f55741a;
                aVar2 = C8702d.e(dVar, fVar == null ? C8702d.h(dVar, (String) null, (C17631a) null, 0, x509TrustManager, (C15793l) null, 23, (Object) null) : fVar, bVar, (PublicKey) null, (C17631a) null, 12, (Object) null);
            } else {
                aVar2 = aVar;
            }
            this.f55422e = aVar2;
            this.f55423f = eVar == null ? new l() : eVar;
        } else {
            throw new IllegalArgumentException("DiskCache is ignored when overriding logListDataSource");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: javax.net.ssl.TrustManager[]} */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r5 = r5.get(r4);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleaner c(javax.net.ssl.X509TrustManager r4, p7.C8632e r5) {
        /*
            if (r4 != 0) goto L_0x0035
            java.lang.String r4 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r4 = javax.net.ssl.TrustManagerFactory.getInstance(r4)
            r0 = 0
            r4.init(r0)
            javax.net.ssl.TrustManager[] r4 = r4.getTrustManagers()
            java.lang.String r0 = "getTrustManagers(...)"
            kotlin.jvm.internal.C17542s.i(r4, r0)
            int r0 = r4.length
            r1 = 0
        L_0x0019:
            if (r1 >= r0) goto L_0x002d
            r2 = r4[r1]
            boolean r3 = r2 instanceof javax.net.ssl.X509TrustManager
            if (r3 == 0) goto L_0x002a
            java.lang.String r4 = "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"
            kotlin.jvm.internal.C17542s.h(r2, r4)
            r4 = r2
            javax.net.ssl.X509TrustManager r4 = (javax.net.ssl.X509TrustManager) r4
            goto L_0x0035
        L_0x002a:
            int r1 = r1 + 1
            goto L_0x0019
        L_0x002d:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Array contains no element matching the predicate."
            r4.<init>(r5)
            throw r4
        L_0x0035:
            com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleanerFactory r5 = r5.f55420c
            if (r5 == 0) goto L_0x003f
            com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleaner r5 = r5.get(r4)
            if (r5 != 0) goto L_0x0045
        L_0x003f:
            com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleaner$Companion r5 = com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleaner.Companion
            com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleaner r5 = r5.get(r4)
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C8632e.c(javax.net.ssl.X509TrustManager, p7.e):com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleaner");
    }

    private final boolean d(String str) {
        Iterable iterable = this.f55419b;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C8680b) it.next()).b(str)) {
                    Iterable<C8680b> iterable2 = this.f55418a;
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (C8680b b10 : iterable2) {
                            if (b10.b(str)) {
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private final CertificateChainCleaner e() {
        return (CertificateChainCleaner) this.f55421d.getValue();
    }

    private final m f(List<? extends X509Certificate> list) {
        C8703e eVar;
        Object obj;
        try {
            eVar = (C8703e) C16312j.b((C17168i) null, new a(this, (C17164e<? super a>) null), 1, (Object) null);
        } catch (Exception e10) {
            eVar = new C8703e.b.d(e10);
        }
        if (eVar instanceof C8703e.c) {
            Iterable<C8705g> b10 = ((C8703e.c) eVar).b();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(b10, 10)), 16));
            for (C8705g gVar : b10) {
                linkedHashMap.put(C8407a.f54060a.b(gVar.a()), new o(gVar));
            }
            X509Certificate x509Certificate = (X509Certificate) list.get(0);
            if (!C8408b.a(x509Certificate)) {
                return m.b.c.f41536b;
            }
            try {
                Iterable b11 = j7.l.b(x509Certificate);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C17978n.e(X.e(C16877v.y(b11, 10)), 16));
                for (Object next : b11) {
                    linkedHashMap2.put(C8407a.f54060a.b(((C8683e) next).b().a()), next);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(X.e(linkedHashMap2.size()));
                for (Object next2 : linkedHashMap2.entrySet()) {
                    Object key = ((Map.Entry) next2).getKey();
                    Map.Entry entry = (Map.Entry) next2;
                    C8683e eVar2 = (C8683e) entry.getValue();
                    o oVar = (o) linkedHashMap.get((String) entry.getKey());
                    if (oVar == null || (obj = oVar.i(eVar2, list)) == null) {
                        obj = k.f41529a;
                    }
                    linkedHashMap3.put(key, obj);
                }
                m a10 = this.f55423f.a(x509Certificate, linkedHashMap3);
                return a10 instanceof m.c ? ((eVar instanceof C8703e.c.a) || (eVar instanceof C8703e.c.b)) ? new m.c.d((m.c) a10, eVar) : a10 : a10;
            } catch (IOException e11) {
                return new m.b.f(e11);
            }
        } else if (eVar instanceof C8703e.a) {
            return new m.c.b((C8703e.a) eVar);
        } else {
            if (eVar instanceof C8703e.b) {
                return new m.b.a((C8703e.b) eVar);
            }
            if (eVar == null) {
                return new m.b.a(C8703e.b.f.f55752a);
            }
            throw new t();
        }
    }

    public final m g(String str, List<? extends Certificate> list) {
        C17542s.j(str, "host");
        C17542s.j(list, "certificates");
        if (!d(str)) {
            return new m.c.a(str);
        }
        if (list.isEmpty()) {
            return m.b.C0732b.f41535b;
        }
        CertificateChainCleaner e10 = e();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof X509Certificate) {
                arrayList.add(next);
            }
        }
        List<X509Certificate> clean = e10.clean(arrayList, str);
        return clean.isEmpty() ? m.b.C0732b.f41535b : f(clean);
    }
}
