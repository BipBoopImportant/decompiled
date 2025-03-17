package com.appmattus.certificatetransparency.internal.verifier;

import YH.C16870n;
import YH.C16877v;
import a7.C6749d;
import a7.C6750e;
import a7.m;
import b7.b;
import c7.C7100a;
import com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleanerFactory;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.X509TrustManager;
import k7.g;
import k7.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n7.C8587a;
import n7.C8588b;
import nI.C17631a;
import p7.C8632e;
import p7.C8635h;
import q7.C8680b;
import r7.C8703e;
import r7.C8704f;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016¢\u0006\u0004\b \u0010!J'\u0010'\u001a\u00020&2\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0\"2\u0006\u0010%\u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020&2\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0\"2\u0006\u0010%\u001a\u00020\u001aH\u0016¢\u0006\u0004\b)\u0010(J3\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\u001c2\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0\"2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010\u001a2\b\u0010,\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0004\u0018\u0001078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u0004\u0018\u0001078\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u00109¨\u0006;"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/verifier/CertificateTransparencyTrustManagerBasic;", "Ljavax/net/ssl/X509TrustManager;", "", "delegate", "", "Lq7/b;", "includeHosts", "excludeHosts", "Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;", "certificateChainCleanerFactory", "Lr7/f;", "logListService", "Lc7/a;", "Lr7/e;", "logListDataSource", "La7/e;", "policy", "Lb7/b;", "diskCache", "Lkotlin/Function0;", "", "failOnError", "La7/d;", "logger", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/util/Set;Ljava/util/Set;Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;Lr7/f;Lc7/a;La7/e;Lb7/b;LnI/a;La7/d;)V", "", "host", "", "Ljava/security/cert/Certificate;", "certificates", "La7/m;", "verifyCertificateTransparency", "(Ljava/lang/String;Ljava/util/List;)La7/m;", "", "Ljava/security/cert/X509Certificate;", "chain", "authType", "LXH/N;", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "hostname1", "hostname2", "isSameTrustConfiguration", "(Ljava/lang/String;Ljava/lang/String;)Z", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "Ljavax/net/ssl/X509TrustManager;", "LnI/a;", "La7/d;", "Lp7/e;", "ctBase", "Lp7/e;", "Ljava/lang/reflect/Method;", "checkServerTrustedMethod", "Ljava/lang/reflect/Method;", "isSameTrustConfigurationMethod", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CertificateTransparencyTrustManagerBasic implements X509TrustManager {
    private final Method checkServerTrustedMethod;
    private final C8632e ctBase;
    private final X509TrustManager delegate;
    private final C17631a<Boolean> failOnError;
    private final Method isSameTrustConfigurationMethod;
    private final C6749d logger;

    public CertificateTransparencyTrustManagerBasic(X509TrustManager x509TrustManager, Set<C8680b> set, Set<C8680b> set2, CertificateChainCleanerFactory certificateChainCleanerFactory, C8704f fVar, C7100a<C8703e> aVar, C6750e eVar, b bVar, C17631a<Boolean> aVar2, C6749d dVar) {
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

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        C17542s.j(x509CertificateArr, "chain");
        C17542s.j(str, "authType");
        this.delegate.checkServerTrusted(x509CertificateArr, str);
        byte[] encoded = ((X509Certificate) C16870n.f0(x509CertificateArr)).getSubjectX500Principal().getEncoded();
        C17542s.i(encoded, "getEncoded(...)");
        String str2 = (String) C8588b.a(g.f(encoded, (h) null, 1, (Object) null), new C8635h());
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CertificateTransparencyTrustManagerBasic(javax.net.ssl.X509TrustManager r14, java.util.Set r15, java.util.Set r16, com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleanerFactory r17, r7.C8704f r18, c7.C7100a r19, a7.C6750e r20, b7.b r21, nI.C17631a r22, a7.C6749d r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x000d
            p7.i r1 = new p7.i
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
        throw new UnsupportedOperationException("Method not decompiled: com.appmattus.certificatetransparency.internal.verifier.CertificateTransparencyTrustManagerBasic.<init>(javax.net.ssl.X509TrustManager, java.util.Set, java.util.Set, com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleanerFactory, r7.f, c7.a, a7.e, b7.b, nI.a, a7.d, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
