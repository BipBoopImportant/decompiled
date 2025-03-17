package p7;

import YH.C16877v;
import a7.i;
import a7.l;
import com.adjust.sdk.Constants;
import i7.C8217c;
import j7.C8407a;
import j7.C8408b;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import k7.h;
import k7.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.C8608a;
import o7.g;
import o7.j;
import o7.l;
import o7.q;
import q7.C8681c;
import q7.C8683e;
import q7.C8684f;
import r7.C8705g;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%J\u001b\u0010(\u001a\u00020'*\u00020&2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b(\u0010)J%\u0010+\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016¢\u0006\u0004\b+\u0010,J'\u0010.\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\bH\u0000¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100¨\u00061"}, d2 = {"Lp7/o;", "", "Lr7/g;", "logServer", "<init>", "(Lr7/g;)V", "Ljava/security/cert/X509Certificate;", "preCertificate", "Lq7/c;", "issuerInformation", "Lo7/l;", "a", "(Ljava/security/cert/X509Certificate;Lq7/c;)Lo7/l;", "Lo7/j;", "extensions", "Lo7/g;", "replacementX509authorityKeyIdentifier", "", "b", "(Lo7/j;Lo7/g;)Ljava/util/List;", "Lq7/e;", "sct", "", "toVerify", "La7/l;", "h", "(Lq7/e;[B)La7/l;", "Lo7/a;", "", "c", "(Lo7/a;)Z", "certificate", "e", "(Ljava/security/cert/X509Certificate;Lq7/e;)[B", "preCertBytes", "issuerKeyHash", "f", "([B[BLq7/e;)[B", "Ljava/io/OutputStream;", "LXH/N;", "d", "(Ljava/io/OutputStream;Lq7/e;)V", "chain", "i", "(Lq7/e;Ljava/util/List;)La7/l;", "issuerInfo", "g", "(Lq7/e;Ljava/security/cert/X509Certificate;Lq7/c;)La7/l;", "Lr7/g;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final a f55435b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C8705g f55436a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lp7/o$a;", "", "<init>", "()V", "", "X509_AUTHORITY_KEY_IDENTIFIER", "Ljava/lang/String;", "", "X509_ENTRY", "J", "PRECERT_ENTRY", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public o(C8705g gVar) {
        C17542s.j(gVar, "logServer");
        this.f55436a = gVar;
    }

    private final l a(X509Certificate x509Certificate, C8681c cVar) {
        if (x509Certificate.getVersion() >= 3) {
            C8608a.C0886a aVar = C8608a.f55249b;
            byte[] encoded = x509Certificate.getEncoded();
            C17542s.i(encoded, "getEncoded(...)");
            C8608a b10 = C8608a.C0886a.b(aVar, encoded, (h) null, 2, (Object) null);
            if (!c(b10) || !cVar.a() || cVar.d() != null) {
                j r10 = b10.b().r();
                C17542s.g(r10);
                List<g> b11 = b(r10, cVar.d());
                l b12 = b10.b();
                x c10 = cVar.c();
                if (c10 == null) {
                    c10 = b12.s();
                }
                return l.p(b12, (q) null, c10, j.a.c(j.f55268i, b11, (h) null, 2, (Object) null), 1, (Object) null);
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        if (r2.equals("1.3.6.1.4.1.11129.2.4.3") == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r2.equals("1.3.6.1.4.1.11129.2.4.2") == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        r1 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<o7.g> b(o7.j r5, o7.g r6) {
        /*
            r4 = this;
            java.util.List r5 = r5.q()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x000f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x004e
            java.lang.Object r1 = r5.next()
            o7.g r1 = (o7.g) r1
            java.lang.String r2 = r1.q()
            int r3 = r2.hashCode()
            switch(r3) {
                case -455597388: goto L_0x003b;
                case 316732866: goto L_0x0030;
                case 316732867: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0048
        L_0x0027:
            java.lang.String r3 = "1.3.6.1.4.1.11129.2.4.3"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0039
            goto L_0x0048
        L_0x0030:
            java.lang.String r3 = "1.3.6.1.4.1.11129.2.4.2"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0039
            goto L_0x0048
        L_0x0039:
            r1 = 0
            goto L_0x0048
        L_0x003b:
            java.lang.String r3 = "2.5.29.35"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            if (r6 != 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r1 = r6
        L_0x0048:
            if (r1 == 0) goto L_0x000f
            r0.add(r1)
            goto L_0x000f
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.o.b(o7.j, o7.g):java.util.List");
    }

    private final boolean c(C8608a aVar) {
        List<g> q10;
        j r10 = aVar.b().r();
        if (r10 == null || (q10 = r10.q()) == null) {
            return false;
        }
        Iterable<g> iterable = q10;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (g q11 : iterable) {
            if (C17542s.e(q11.q(), "2.5.29.35")) {
                return true;
            }
        }
        return false;
    }

    private final void d(OutputStream outputStream, C8683e eVar) {
        if (eVar.c() == C8684f.V1) {
            C8217c.a(outputStream, (long) eVar.c().d(), 1);
            C8217c.a(outputStream, 0, 1);
            C8217c.a(outputStream, eVar.e().toEpochMilli(), 8);
            return;
        }
        throw new IllegalArgumentException("Can only serialize SCT v1 for now.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        jI.C17416c.a(r0, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] e(java.security.cert.X509Certificate r5, q7.C8683e r6) {
        /*
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r4.d(r0, r6)     // Catch:{ all -> 0x0035 }
            r1 = 0
            r3 = 2
            i7.C8217c.a(r0, r1, r3)     // Catch:{ all -> 0x0035 }
            byte[] r5 = r5.getEncoded()     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "getEncoded(...)"
            kotlin.jvm.internal.C17542s.i(r5, r1)     // Catch:{ all -> 0x0035 }
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            i7.C8217c.b(r0, r5, r1)     // Catch:{ all -> 0x0035 }
            byte[] r5 = r6.a()     // Catch:{ all -> 0x0035 }
            r6 = 65535(0xffff, float:9.1834E-41)
            i7.C8217c.b(r0, r5, r6)     // Catch:{ all -> 0x0035 }
            byte[] r5 = r0.toByteArray()     // Catch:{ all -> 0x0035 }
            r6 = 0
            jI.C17416c.a(r0, r6)
            java.lang.String r6 = "use(...)"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            return r5
        L_0x0035:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r6 = move-exception
            jI.C17416c.a(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.o.e(java.security.cert.X509Certificate, q7.e):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        jI.C17416c.a(r0, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] f(byte[] r5, byte[] r6, q7.C8683e r7) {
        /*
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r4.d(r0, r7)     // Catch:{ all -> 0x002f }
            r1 = 1
            r3 = 2
            i7.C8217c.a(r0, r1, r3)     // Catch:{ all -> 0x002f }
            r0.write(r6)     // Catch:{ all -> 0x002f }
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            i7.C8217c.b(r0, r5, r6)     // Catch:{ all -> 0x002f }
            byte[] r5 = r7.a()     // Catch:{ all -> 0x002f }
            r6 = 65535(0xffff, float:9.1834E-41)
            i7.C8217c.b(r0, r5, r6)     // Catch:{ all -> 0x002f }
            byte[] r5 = r0.toByteArray()     // Catch:{ all -> 0x002f }
            r6 = 0
            jI.C17416c.a(r0, r6)
            java.lang.String r6 = "use(...)"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            return r5
        L_0x002f:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r6 = move-exception
            jI.C17416c.a(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.o.f(byte[], byte[], q7.e):byte[]");
    }

    private final a7.l h(C8683e eVar, byte[] bArr) {
        String str;
        String algorithm = this.f55436a.b().getAlgorithm();
        if (C17542s.e(algorithm, "EC")) {
            str = "SHA256withECDSA";
        } else if (C17542s.e(algorithm, "RSA")) {
            str = "SHA256withRSA";
        } else {
            String algorithm2 = this.f55436a.b().getAlgorithm();
            C17542s.i(algorithm2, "getAlgorithm(...)");
            return new s(algorithm2, (NoSuchAlgorithmException) null, 2, (DefaultConstructorMarker) null);
        }
        try {
            Signature instance = Signature.getInstance(str);
            instance.initVerify(this.f55436a.b());
            instance.update(bArr);
            return instance.verify(eVar.d().a()) ? new l.a(eVar, this.f55436a.d(eVar.e())) : a7.g.f41524a;
        } catch (SignatureException e10) {
            return new r(e10);
        } catch (InvalidKeyException e11) {
            return new n(e11);
        } catch (NoSuchAlgorithmException e12) {
            return new s(str, e12);
        }
    }

    public final a7.l g(C8683e eVar, X509Certificate x509Certificate, C8681c cVar) {
        C8629b bVar;
        C17542s.j(eVar, "sct");
        C17542s.j(x509Certificate, "certificate");
        C17542s.j(cVar, "issuerInfo");
        try {
            return h(eVar, f(C16877v.n1(C16877v.t1(a(x509Certificate, cVar).f())), cVar.b(), eVar));
        } catch (IOException e10) {
            bVar = new C8629b(e10);
            return bVar;
        } catch (CertificateException e11) {
            bVar = new C8629b(e11);
            return bVar;
        }
    }

    public a7.l i(C8683e eVar, List<? extends X509Certificate> list) {
        C8681c cVar;
        C8629b bVar;
        C17542s.j(eVar, "sct");
        C17542s.j(list, "chain");
        Instant now = Instant.now();
        if (eVar.e().compareTo(now) > 0) {
            Instant e10 = eVar.e();
            C17542s.g(now);
            return new i(e10, now);
        } else if (this.f55436a.c() != null && eVar.e().compareTo(this.f55436a.c()) > 0) {
            return new a7.j(eVar.e(), this.f55436a.c());
        } else {
            if (!Arrays.equals(this.f55436a.a(), eVar.b().a())) {
                C8407a aVar = C8407a.f54060a;
                return new m(aVar.b(eVar.b().a()), aVar.b(this.f55436a.a()));
            }
            X509Certificate x509Certificate = (X509Certificate) list.get(0);
            if (!C8408b.b(x509Certificate) && !C8408b.a(x509Certificate)) {
                try {
                    return h(eVar, e(x509Certificate, eVar));
                } catch (IOException e11) {
                    bVar = new C8629b(e11);
                    return bVar;
                } catch (CertificateEncodingException e12) {
                    bVar = new C8629b(e12);
                    return bVar;
                }
            } else if (list.size() < 2) {
                return p.f55437a;
            } else {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(1);
                try {
                    if (!C8408b.c(x509Certificate2)) {
                        try {
                            cVar = C8408b.d(x509Certificate2);
                        } catch (NoSuchAlgorithmException e13) {
                            return new s(Constants.SHA256, e13);
                        }
                    } else if (list.size() < 3) {
                        return q.f55438a;
                    } else {
                        try {
                            cVar = C8408b.e(x509Certificate2, (Certificate) list.get(2));
                        } catch (CertificateEncodingException e14) {
                            return new C8629b(e14);
                        } catch (NoSuchAlgorithmException e15) {
                            return new s(Constants.SHA256, e15);
                        } catch (IOException e16) {
                            return new C8628a(e16);
                        }
                    }
                    return g(eVar, x509Certificate, cVar);
                } catch (CertificateParsingException e17) {
                    return new C8630c(e17);
                }
            }
        }
    }
}
