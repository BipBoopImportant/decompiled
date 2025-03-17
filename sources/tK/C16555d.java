package TK;

import HJ.C15854t;
import HK.C15861a;
import HK.C15864d;
import WK.P;
import YH.C16877v;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.slf4j.Marker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0013\u0010\r\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\nJ\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LTK/d;", "Ljavax/net/ssl/HostnameVerifier;", "<init>", "()V", "", "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", "", "h", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "hostname", "g", "b", "(Ljava/lang/String;)Ljava/lang/String;", "d", "(Ljava/lang/String;)Z", "pattern", "f", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "type", "", "c", "(Ljava/security/cert/X509Certificate;I)Ljava/util/List;", "host", "Ljavax/net/ssl/SSLSession;", "session", "verify", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "e", "a", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: TK.d  reason: case insensitive filesystem */
public final class C16555d implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final C16555d f138919a = new C16555d();

    private C16555d() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
        String lowerCase = str.toLowerCase(locale);
        C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> c(X509Certificate x509Certificate, int i10) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C16877v.n();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (C17542s.e(next.get(0), Integer.valueOf(i10))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C16877v.n();
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) P.b(str, 0, 0, 3, (Object) null));
    }

    private final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !C15854t.W(str, ".", false, 2, (Object) null) && !C15854t.G(str, "..", false, 2, (Object) null) && str2 != null && str2.length() != 0 && !C15854t.W(str2, ".", false, 2, (Object) null) && !C15854t.G(str2, "..", false, 2, (Object) null)) {
            if (!C15854t.G(str, ".", false, 2, (Object) null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!C15854t.G(str2, ".", false, 2, (Object) null)) {
                str2 = str2 + '.';
            }
            String b10 = b(str2);
            if (!C15854t.d0(b10, Marker.ANY_MARKER, false, 2, (Object) null)) {
                return C17542s.e(str3, b10);
            }
            if (!C15854t.W(b10, "*.", false, 2, (Object) null) || C15854t.r0(b10, '*', 1, false, 4, (Object) null) != -1 || str3.length() < b10.length() || C17542s.e("*.", b10)) {
                return false;
            }
            String substring = b10.substring(1);
            C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
            if (!C15854t.G(str3, substring, false, 2, (Object) null)) {
                return false;
            }
            int length = str3.length() - substring.length();
            return length <= 0 || C15854t.y0(str3, '.', length + -1, false, 4, (Object) null) == -1;
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String b10 = b(str);
        Iterable<String> c10 = c(x509Certificate, 2);
        if ((c10 instanceof Collection) && ((Collection) c10).isEmpty()) {
            return false;
        }
        for (String f10 : c10) {
            if (f138919a.f(b10, f10)) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String e10 = C15861a.e(str);
        Iterable<String> c10 = c(x509Certificate, 7);
        if ((c10 instanceof Collection) && ((Collection) c10).isEmpty()) {
            return false;
        }
        for (String e11 : c10) {
            if (C17542s.e(e10, C15861a.e(e11))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> a(X509Certificate x509Certificate) {
        C17542s.j(x509Certificate, "certificate");
        return C16877v.V0(c(x509Certificate, 7), c(x509Certificate, 2));
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        C17542s.j(str, "host");
        C17542s.j(x509Certificate, "certificate");
        return C15864d.i(str) ? h(str, x509Certificate) : g(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        C17542s.j(str, "host");
        C17542s.j(sSLSession, "session");
        if (!d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            C17542s.h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
