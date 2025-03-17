package t6;

import java.net.URL;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fj\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lt6/b;", "", "", "payKitClientId", "Ljava/net/URL;", "cashAppPaymentSigningUrl", "cashAppPaymentValidationUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/net/URL;Ljava/net/URL;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "m", "Ljava/net/URL;", "b", "()Ljava/net/URL;", "j", "SANDBOX", "PRODUCTION", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: t6.b  reason: case insensitive filesystem */
public enum C8833b {
    SANDBOX("CAS-CI_AFTERPAY", new URL("https://api-plus.us-sandbox.afterpay.com/v2/payments/sign-payment"), new URL("https://api-plus.us-sandbox.afterpay.com/v2/payments/validate-payment")),
    PRODUCTION("CA-CI_AFTERPAY", new URL("https://api-plus.us.afterpay.com/v2/payments/sign-payment"), new URL("https://api-plus.us.afterpay.com/v2/payments/validate-payment"));
    
    private final URL cashAppPaymentSigningUrl;
    private final URL cashAppPaymentValidationUrl;
    private final String payKitClientId;

    private C8833b(String str, URL url, URL url2) {
        this.payKitClientId = str;
        this.cashAppPaymentSigningUrl = url;
        this.cashAppPaymentValidationUrl = url2;
    }

    public final URL b() {
        return this.cashAppPaymentSigningUrl;
    }

    public final URL j() {
        return this.cashAppPaymentValidationUrl;
    }

    public final String m() {
        return this.payKitClientId;
    }

    public String toString() {
        String name = name();
        Locale locale = Locale.ROOT;
        C17542s.i(locale, "ROOT");
        String lowerCase = name.toLowerCase(locale);
        C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
