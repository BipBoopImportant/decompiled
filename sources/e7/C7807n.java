package e7;

import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.util.NoSuchElementException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p7.C8634g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljavax/net/ssl/TrustManagerFactory;", "b", "()Ljavax/net/ssl/TrustManagerFactory;", "Ljavax/net/ssl/X509TrustManager;", "a", "()Ljavax/net/ssl/X509TrustManager;", "certificatetransparency"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: e7.n  reason: case insensitive filesystem */
public final class C7807n {
    public static final X509TrustManager a() {
        TrustManagerFactory b10 = b();
        b10.init((KeyStore) null);
        TrustManager[] trustManagers = b10.getTrustManagers();
        C17542s.i(trustManagers, "getTrustManagers(...)");
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                C17542s.h(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final TrustManagerFactory b() {
        String defaultAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
        Provider[] providers = Security.getProviders("TrustManagerFactory." + defaultAlgorithm);
        C17542s.i(providers, "getProviders(...)");
        for (Provider provider : providers) {
            if (!C17542s.e(provider.getClass(), C8634g.class)) {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(defaultAlgorithm, provider.getName());
                C17542s.i(instance, "getInstance(...)");
                return instance;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
