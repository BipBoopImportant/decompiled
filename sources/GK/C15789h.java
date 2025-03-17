package GK;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R%\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u00048G¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0019¨\u0006\u001b"}, d2 = {"LGK/h;", "", "", "scheme", "", "authParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "realm", "Ljava/nio/charset/Charset;", "()Ljava/nio/charset/Charset;", "charset", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.h  reason: case insensitive filesystem */
public final class C15789h {

    /* renamed from: a  reason: collision with root package name */
    private final String f134920a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f134921b;

    public C15789h(String str, Map<String, String> map) {
        String str2;
        C17542s.j(str, "scheme");
        C17542s.j(map, "authParams");
        this.f134920a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            String str4 = (String) next.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
                str2 = str3.toLowerCase(locale);
                C17542s.i(str2, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C17542s.i(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f134921b = unmodifiableMap;
    }

    public final Charset a() {
        String str = this.f134921b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                C17542s.i(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        C17542s.i(charset, "ISO_8859_1");
        return charset;
    }

    public final String b() {
        return this.f134921b.get("realm");
    }

    public final String c() {
        return this.f134920a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15789h) {
            C15789h hVar = (C15789h) obj;
            return C17542s.e(hVar.f134920a, this.f134920a) && C17542s.e(hVar.f134921b, this.f134921b);
        }
    }

    public int hashCode() {
        return ((899 + this.f134920a.hashCode()) * 31) + this.f134921b.hashCode();
    }

    public String toString() {
        return this.f134920a + " authParams=" + this.f134921b;
    }
}
