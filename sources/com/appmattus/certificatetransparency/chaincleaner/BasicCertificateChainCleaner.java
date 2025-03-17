package com.appmattus.certificatetransparency.chaincleaner;

import XH.C16807N;
import YH.C16877v;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\u0014\u0010\u0012\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002R0\u0010\u0006\u001a$\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000b0\u000b0\n0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/appmattus/certificatetransparency/chaincleaner/BasicCertificateChainCleaner;", "Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "<init>", "(Ljavax/net/ssl/X509TrustManager;)V", "subjectToCaCerts", "", "Ljavax/security/auth/x500/X500Principal;", "kotlin.jvm.PlatformType", "", "Ljava/security/cert/X509Certificate;", "clean", "chain", "hostname", "", "findTrustedCertByIssuerAndSignature", "cert", "isSignedBy", "", "signingCert", "Companion", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BasicCertificateChainCleaner implements CertificateChainCleaner {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int MAX_SIGNERS = 9;
    private final Map<X500Principal, List<X509Certificate>> subjectToCaCerts;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/appmattus/certificatetransparency/chaincleaner/BasicCertificateChainCleaner$Companion;", "", "<init>", "()V", "MAX_SIGNERS", "", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BasicCertificateChainCleaner(X509TrustManager x509TrustManager) {
        C17542s.j(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C17542s.i(acceptedIssuers, "getAcceptedIssuers(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : acceptedIssuers) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((List) obj).add(x509Certificate);
        }
        this.subjectToCaCerts = linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.security.cert.X509Certificate} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.security.cert.X509Certificate findTrustedCertByIssuerAndSignature(java.security.cert.X509Certificate r5) {
        /*
            r4 = this;
            javax.security.auth.x500.X500Principal r0 = r5.getIssuerX500Principal()
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.List<java.security.cert.X509Certificate>> r1 = r4.subjectToCaCerts
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x002e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0015:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            kotlin.jvm.internal.C17542s.g(r3)
            boolean r3 = r4.isSignedBy(r5, r3)
            if (r3 == 0) goto L_0x0015
            r1 = r2
        L_0x002c:
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appmattus.certificatetransparency.chaincleaner.BasicCertificateChainCleaner.findTrustedCertByIssuerAndSignature(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
    }

    private final boolean isSignedBy(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!C17542s.e(x509Certificate.getIssuerX500Principal(), x509Certificate2.getSubjectX500Principal())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public List<X509Certificate> clean(List<? extends X509Certificate> list, String str) {
        Object obj;
        C17542s.j(list, "chain");
        C17542s.j(str, "hostname");
        if (!list.isEmpty()) {
            ArrayDeque arrayDeque = new ArrayDeque(list);
            ArrayList arrayList = new ArrayList();
            Object removeFirst = arrayDeque.removeFirst();
            C17542s.i(removeFirst, "removeFirst(...)");
            arrayList.add(removeFirst);
            boolean z10 = false;
            for (int i10 = 0; i10 < 9; i10++) {
                X509Certificate x509Certificate = (X509Certificate) C16877v.I0(arrayList);
                X509Certificate findTrustedCertByIssuerAndSignature = findTrustedCertByIssuerAndSignature(x509Certificate);
                if (findTrustedCertByIssuerAndSignature != null) {
                    if (arrayList.size() > 1 || !C17542s.e(x509Certificate, findTrustedCertByIssuerAndSignature)) {
                        arrayList.add(findTrustedCertByIssuerAndSignature);
                    }
                    if (isSignedBy(findTrustedCertByIssuerAndSignature, findTrustedCertByIssuerAndSignature)) {
                        return arrayList;
                    }
                    z10 = true;
                } else {
                    Iterator it = arrayDeque.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        X509Certificate x509Certificate2 = (X509Certificate) obj;
                        C17542s.g(x509Certificate2);
                        if (isSignedBy(x509Certificate, x509Certificate2)) {
                            break;
                        }
                    }
                    X509Certificate x509Certificate3 = (X509Certificate) obj;
                    if (x509Certificate3 != null) {
                        arrayDeque.remove(x509Certificate3);
                        arrayList.add(x509Certificate3);
                        C16807N n10 = C16807N.f139792a;
                    } else if (z10) {
                        return arrayList;
                    } else {
                        throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                    }
                }
            }
            throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
        }
        throw new SSLPeerUnverifiedException("Certificate chain is empty");
    }
}
