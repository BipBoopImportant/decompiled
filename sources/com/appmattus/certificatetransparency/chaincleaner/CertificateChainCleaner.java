package com.appmattus.certificatetransparency.chaincleaner;

import XH.C16824o;
import XH.C16825p;
import com.appmattus.certificatetransparency.chaincleaner.AndroidCertificateChainCleaner;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleaner;", "", "clean", "", "Ljava/security/cert/X509Certificate;", "chain", "hostname", "", "Companion", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CertificateChainCleaner {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleaner$Companion;", "", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleaner;", "get", "(Ljavax/net/ssl/X509TrustManager;)Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleaner;", "Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;", "androidCertificateChainCleanerFactory$delegate", "LXH/o;", "getAndroidCertificateChainCleanerFactory", "()Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;", "androidCertificateChainCleanerFactory", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final C16824o<CertificateChainCleanerFactory> androidCertificateChainCleanerFactory$delegate = C16825p.b(new a());

        private Companion() {
        }

        /* access modifiers changed from: private */
        public static final CertificateChainCleanerFactory androidCertificateChainCleanerFactory_delegate$lambda$0() {
            try {
                AndroidCertificateChainCleaner.Factory newInstance = AndroidCertificateChainCleaner.Factory.class.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                C17542s.h(newInstance, "null cannot be cast to non-null type com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleanerFactory");
                return newInstance;
            } catch (Exception unused) {
                return null;
            }
        }

        private final CertificateChainCleanerFactory getAndroidCertificateChainCleanerFactory() {
            return androidCertificateChainCleanerFactory$delegate.getValue();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
            r0 = r0.get(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleaner get(javax.net.ssl.X509TrustManager r2) {
            /*
                r1 = this;
                java.lang.String r0 = "trustManager"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleanerFactory r0 = r1.getAndroidCertificateChainCleanerFactory()
                if (r0 == 0) goto L_0x0011
                com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleaner r0 = r0.get(r2)
                if (r0 != 0) goto L_0x0016
            L_0x0011:
                com.appmattus.certificatetransparency.chaincleaner.BasicCertificateChainCleaner r0 = new com.appmattus.certificatetransparency.chaincleaner.BasicCertificateChainCleaner
                r0.<init>(r2)
            L_0x0016:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleaner.Companion.get(javax.net.ssl.X509TrustManager):com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleaner");
        }
    }

    List<X509Certificate> clean(List<? extends X509Certificate> list, String str);
}
