package j7;

import java.security.PublicKey;
import java.security.cert.Certificate;
import k7.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.g;
import q7.C8681c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a&\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0000\u0002\u0010\n\u000e\b\u0000\u0012\u0002\u0018\u0000\u001a\u0006\u0010\u0000\"\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000\u0002\u0010\n\u000e\b\u0000\u0012\u0002\u0018\u0000\u001a\u0006\u0010\u0000\"\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a&\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000\u0002\u0010\n\u000e\b\u0000\u0012\u0002\u0018\u0000\u001a\u0006\u0010\u0000\"\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ljava/security/cert/Certificate;", "", "Ljava/security/cert/X509Certificate;", "c", "(Ljava/security/cert/Certificate;)Z", "b", "a", "Lq7/c;", "d", "(Ljava/security/cert/Certificate;)Lq7/c;", "preCertificate", "e", "(Ljava/security/cert/Certificate;Ljava/security/cert/Certificate;)Lq7/c;", "", "f", "(Ljava/security/cert/Certificate;)[B", "certificatetransparency"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: j7.b  reason: case insensitive filesystem */
public final class C8408b {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = ((java.security.cert.X509Certificate) r1).getNonCriticalExtensionOIDs();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(java.security.cert.Certificate r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            boolean r0 = r1 instanceof java.security.cert.X509Certificate
            if (r0 == 0) goto L_0x001b
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            java.util.Set r1 = r1.getNonCriticalExtensionOIDs()
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "1.3.6.1.4.1.11129.2.4.2"
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != r0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.C8408b.a(java.security.cert.Certificate):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = ((java.security.cert.X509Certificate) r1).getCriticalExtensionOIDs();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean b(java.security.cert.Certificate r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            boolean r0 = r1 instanceof java.security.cert.X509Certificate
            if (r0 == 0) goto L_0x001b
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            java.util.Set r1 = r1.getCriticalExtensionOIDs()
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "1.3.6.1.4.1.11129.2.4.3"
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != r0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.C8408b.b(java.security.cert.Certificate):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = ((java.security.cert.X509Certificate) r1).getExtendedKeyUsage();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean c(java.security.cert.Certificate r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            boolean r0 = r1 instanceof java.security.cert.X509Certificate
            if (r0 == 0) goto L_0x001b
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            java.util.List r1 = r1.getExtendedKeyUsage()
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "1.3.6.1.4.1.11129.2.4.4"
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != r0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.C8408b.c(java.security.cert.Certificate):boolean");
    }

    public static final C8681c d(Certificate certificate) {
        C17542s.j(certificate, "<this>");
        return new C8681c((x) null, f(certificate), (g) null, false, 5, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: o7.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: o7.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: o7.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: o7.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: o7.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final q7.C8681c e(java.security.cert.Certificate r5, java.security.cert.Certificate r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "preCertificate"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            o7.a$a r0 = o7.C8608a.f55249b
            byte[] r5 = r5.getEncoded()
            java.lang.String r1 = "getEncoded(...)"
            kotlin.jvm.internal.C17542s.i(r5, r1)
            r1 = 2
            r2 = 0
            o7.a r5 = o7.C8608a.C0886a.b(r0, r5, r2, r1, r2)
            o7.l r0 = r5.b()
            o7.j r0 = r0.r()
            if (r0 == 0) goto L_0x004d
            java.util.List r0 = r0.q()
            if (r0 == 0) goto L_0x004d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0031:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x004b
            java.lang.Object r1 = r0.next()
            r3 = r1
            o7.g r3 = (o7.g) r3
            java.lang.String r3 = r3.q()
            java.lang.String r4 = "2.5.29.35"
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r3 == 0) goto L_0x0031
            r2 = r1
        L_0x004b:
            o7.g r2 = (o7.g) r2
        L_0x004d:
            q7.c r0 = new q7.c
            o7.l r5 = r5.b()
            k7.x r5 = r5.s()
            byte[] r6 = f(r6)
            r1 = 1
            r0.<init>(r5, r6, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.C8408b.e(java.security.cert.Certificate, java.security.cert.Certificate):q7.c");
    }

    private static final byte[] f(Certificate certificate) {
        PublicKey publicKey = certificate.getPublicKey();
        C17542s.i(publicKey, "getPublicKey(...)");
        return C8413g.a(publicKey);
    }
}
