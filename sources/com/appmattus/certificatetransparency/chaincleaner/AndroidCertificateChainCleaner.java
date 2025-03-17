package com.appmattus.certificatetransparency.chaincleaner;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/appmattus/certificatetransparency/chaincleaner/AndroidCertificateChainCleaner;", "Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleaner;", "extensions", "Landroid/net/http/X509TrustManagerExtensions;", "<init>", "(Landroid/net/http/X509TrustManagerExtensions;)V", "clean", "", "Ljava/security/cert/X509Certificate;", "chain", "hostname", "", "Factory", "certificatetransparency-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidCertificateChainCleaner implements CertificateChainCleaner {
    private final X509TrustManagerExtensions extensions;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/appmattus/certificatetransparency/chaincleaner/AndroidCertificateChainCleaner$Factory;", "Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;", "<init>", "()V", "get", "Lcom/appmattus/certificatetransparency/chaincleaner/AndroidCertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "certificatetransparency-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements CertificateChainCleanerFactory {
        public AndroidCertificateChainCleaner get(X509TrustManager x509TrustManager) {
            C17542s.j(x509TrustManager, "trustManager");
            return new AndroidCertificateChainCleaner(new X509TrustManagerExtensions(x509TrustManager));
        }
    }

    public AndroidCertificateChainCleaner(X509TrustManagerExtensions x509TrustManagerExtensions) {
        C17542s.j(x509TrustManagerExtensions, "extensions");
        this.extensions = x509TrustManagerExtensions;
    }

    public List<X509Certificate> clean(List<? extends X509Certificate> list, String str) {
        C17542s.j(list, "chain");
        C17542s.j(str, "hostname");
        List<X509Certificate> checkServerTrusted = this.extensions.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        C17542s.i(checkServerTrusted, "checkServerTrusted(...)");
        return checkServerTrusted;
    }
}
