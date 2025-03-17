package com.appmattus.certificatetransparency.internal.verifier;

import HK.C15864d;
import YH.C16870n;
import YH.C16877v;
import a7.C6749d;
import a7.C6750e;
import a7.m;
import b7.b;
import c7.C7100a;
import com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleanerFactory;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import k7.g;
import k7.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n7.C8587a;
import n7.C8588b;
import nI.C17631a;
import p7.C8632e;
import p7.k;
import q7.C8680b;
import r7.C8703e;
import r7.C8704f;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016¢\u0006\u0004\b!\u0010\"J'\u0010(\u001a\u00020'2\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#2\u0006\u0010&\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010)J/\u0010(\u001a\u00020'2\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b(\u0010,J/\u0010(\u001a\u00020'2\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b(\u0010/J/\u00100\u001a\u00020'2\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b0\u0010,J/\u00100\u001a\u00020'2\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u0010/J'\u00100\u001a\u00020'2\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#2\u0006\u0010&\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u0010)J3\u00100\u001a\b\u0012\u0004\u0012\u00020$0\u001d2\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b0\u00101J!\u00104\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u00010\u001b2\b\u00103\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u00108R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u00109R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u0004\u0018\u00010>8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u0004\u0018\u00010>8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010@¨\u0006B"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/verifier/CertificateTransparencyTrustManagerExtended;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "", "Ljavax/net/ssl/X509TrustManager;", "delegate", "", "Lq7/b;", "includeHosts", "excludeHosts", "Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;", "certificateChainCleanerFactory", "Lr7/f;", "logListService", "Lc7/a;", "Lr7/e;", "logListDataSource", "La7/e;", "policy", "Lb7/b;", "diskCache", "Lkotlin/Function0;", "", "failOnError", "La7/d;", "logger", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/util/Set;Ljava/util/Set;Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;Lr7/f;Lc7/a;La7/e;Lb7/b;LnI/a;La7/d;)V", "", "host", "", "Ljava/security/cert/Certificate;", "certificates", "La7/m;", "verifyCertificateTransparency", "(Ljava/lang/String;Ljava/util/List;)La7/m;", "", "Ljava/security/cert/X509Certificate;", "chain", "authType", "LXH/N;", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "Ljava/net/Socket;", "socket", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)V", "Ljavax/net/ssl/SSLEngine;", "engine", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)V", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "hostname1", "hostname2", "isSameTrustConfiguration", "(Ljava/lang/String;Ljava/lang/String;)Z", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "Ljavax/net/ssl/X509TrustManager;", "LnI/a;", "La7/d;", "Lp7/e;", "ctBase", "Lp7/e;", "Ljava/lang/reflect/Method;", "checkServerTrustedMethod", "Ljava/lang/reflect/Method;", "isSameTrustConfigurationMethod", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CertificateTransparencyTrustManagerExtended extends X509ExtendedTrustManager implements X509TrustManager {
    private final Method checkServerTrustedMethod;
    private final C8632e ctBase;
    private final X509TrustManager delegate;
    private final C17631a<Boolean> failOnError;
    private final Method isSameTrustConfigurationMethod;
    private final C6749d logger;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CertificateTransparencyTrustManagerExtended(javax.net.ssl.X509TrustManager r14, java.util.Set r15, java.util.Set r16, com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleanerFactory r17, r7.C8704f r18, c7.C7100a r19, a7.C6750e r20, b7.b r21, nI.C17631a r22, a7.C6749d r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x000d
            p7.j r1 = new p7.j
            r1.<init>()
            r11 = r1
            goto L_0x000f
        L_0x000d:
            r11 = r22
        L_0x000f:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0016
            r0 = 0
            r12 = r0
            goto L_0x0018
        L_0x0016:
            r12 = r23
        L_0x0018:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appmattus.certificatetransparency.internal.verifier.CertificateTransparencyTrustManagerExtended.<init>(javax.net.ssl.X509TrustManager, java.util.Set, java.util.Set, com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleanerFactory, r7.f, c7.a, a7.e, b7.b, nI.a, a7.d, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* access modifiers changed from: private */
    public static final boolean _init_$lambda$0() {
        return true;
    }

    /* access modifiers changed from: private */
    public static final String checkServerTrusted$lambda$2(C8587a aVar) {
        Object obj;
        List<C8587a> b10;
        C8587a aVar2;
        List<C8587a> b11;
        C8587a aVar3;
        C17542s.j(aVar, "$this$query");
        Iterator it = aVar.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((C8587a) C16877v.w0(((C8587a) C16877v.w0(((C8587a) obj).b())).b())).a(), "2.5.4.3")) {
                break;
            }
        }
        C8587a aVar4 = (C8587a) obj;
        if (aVar4 == null || (b10 = aVar4.b()) == null || (aVar2 = (C8587a) C16877v.w0(b10)) == null || (b11 = aVar2.b()) == null || (aVar3 = b11.get(1)) == null) {
            return null;
        }
        return aVar3.c();
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        C17542s.j(x509CertificateArr, "chain");
        C17542s.j(str, "authType");
        this.delegate.checkClientTrusted(x509CertificateArr, str);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        C17542s.j(x509CertificateArr, "chain");
        C17542s.j(str, "authType");
        C17542s.j(socket, "socket");
        X509TrustManager x509TrustManager = this.delegate;
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted(x509CertificateArr, str, socket);
        }
        String J10 = C15864d.J(socket);
        m verifyCertificateTransparency = verifyCertificateTransparency(J10, C16870n.c1(x509CertificateArr));
        C6749d dVar = this.logger;
        if (dVar != null) {
            dVar.a(J10, verifyCertificateTransparency);
        }
        if ((verifyCertificateTransparency instanceof m.b) && this.failOnError.invoke().booleanValue()) {
            throw new CertificateException("Certificate transparency failed");
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.delegate.getAcceptedIssuers();
        C17542s.i(acceptedIssuers, "getAcceptedIssuers(...)");
        return acceptedIssuers;
    }

    public final boolean isSameTrustConfiguration(String str, String str2) {
        Method method = this.isSameTrustConfigurationMethod;
        C17542s.g(method);
        Object invoke = method.invoke(this.delegate, new Object[]{str, str2});
        C17542s.h(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) invoke).booleanValue();
    }

    public m verifyCertificateTransparency(String str, List<? extends Certificate> list) {
        C17542s.j(str, "host");
        C17542s.j(list, "certificates");
        return this.ctBase.g(str, list);
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        C17542s.j(x509CertificateArr, "chain");
        C17542s.j(str, "authType");
        C17542s.j(socket, "socket");
        X509TrustManager x509TrustManager = this.delegate;
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted(x509CertificateArr, str, socket);
        }
    }

    public CertificateTransparencyTrustManagerExtended(X509TrustManager x509TrustManager, Set<C8680b> set, Set<C8680b> set2, CertificateChainCleanerFactory certificateChainCleanerFactory, C8704f fVar, C7100a<C8703e> aVar, C6750e eVar, b bVar, C17631a<Boolean> aVar2, C6749d dVar) {
        Method method;
        C17631a<Boolean> aVar3 = aVar2;
        Class<String> cls = String.class;
        C17542s.j(x509TrustManager, "delegate");
        Set<C8680b> set3 = set;
        C17542s.j(set, "includeHosts");
        C17542s.j(set2, "excludeHosts");
        C17542s.j(aVar3, "failOnError");
        this.delegate = x509TrustManager;
        this.failOnError = aVar3;
        this.logger = dVar;
        this.ctBase = new C8632e(set, set2, certificateChainCleanerFactory, x509TrustManager, fVar, aVar, eVar, bVar);
        Method method2 = null;
        try {
            method = x509TrustManager.getClass().getDeclaredMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls});
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        this.checkServerTrustedMethod = method;
        try {
            method2 = this.delegate.getClass().getDeclaredMethod("isSameTrustConfiguration", new Class[]{cls, cls});
        } catch (NoSuchMethodException unused2) {
        }
        this.isSameTrustConfigurationMethod = method2;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        C17542s.j(x509CertificateArr, "chain");
        C17542s.j(str, "authType");
        C17542s.j(sSLEngine, "engine");
        X509TrustManager x509TrustManager = this.delegate;
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted(x509CertificateArr, str, sSLEngine);
        }
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        C17542s.j(x509CertificateArr, "chain");
        C17542s.j(str, "authType");
        C17542s.j(sSLEngine, "engine");
        X509TrustManager x509TrustManager = this.delegate;
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        }
        String peerHost = sSLEngine.getPeerHost();
        C17542s.g(peerHost);
        m verifyCertificateTransparency = verifyCertificateTransparency(peerHost, C16870n.c1(x509CertificateArr));
        C6749d dVar = this.logger;
        if (dVar != null) {
            dVar.a(peerHost, verifyCertificateTransparency);
        }
        if ((verifyCertificateTransparency instanceof m.b) && this.failOnError.invoke().booleanValue()) {
            throw new CertificateException("Certificate transparency failed");
        }
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        C17542s.j(x509CertificateArr, "chain");
        C17542s.j(str, "authType");
        this.delegate.checkServerTrusted(x509CertificateArr, str);
        byte[] encoded = ((X509Certificate) C16870n.f0(x509CertificateArr)).getSubjectX500Principal().getEncoded();
        C17542s.i(encoded, "getEncoded(...)");
        String str2 = (String) C8588b.a(g.f(encoded, (h) null, 1, (Object) null), new k());
        if (str2 != null) {
            m verifyCertificateTransparency = verifyCertificateTransparency(str2, C16870n.c1(x509CertificateArr));
            C6749d dVar = this.logger;
            if (dVar != null) {
                dVar.a(str2, verifyCertificateTransparency);
            }
            if ((verifyCertificateTransparency instanceof m.b) && this.failOnError.invoke().booleanValue()) {
                throw new CertificateException("Certificate transparency failed");
            }
            return;
        }
        throw new CertificateException("No commonName found in certificate subjectDN");
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
        C17542s.j(x509CertificateArr, "chain");
        C17542s.j(str, "authType");
        C17542s.j(str2, "host");
        Method method = this.checkServerTrustedMethod;
        C17542s.g(method);
        Object invoke = method.invoke(this.delegate, new Object[]{x509CertificateArr, str, str2});
        C17542s.h(invoke, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
        List<X509Certificate> list = (List) invoke;
        m verifyCertificateTransparency = verifyCertificateTransparency(str2, C16877v.t1(list));
        C6749d dVar = this.logger;
        if (dVar != null) {
            dVar.a(str2, verifyCertificateTransparency);
        }
        if (!(verifyCertificateTransparency instanceof m.b) || !this.failOnError.invoke().booleanValue()) {
            return list;
        }
        throw new CertificateException("Certificate transparency failed");
    }
}
