package O6;

import HJ.C15835a;
import HJ.C15854t;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\t\u001a\u00020\u00008\u0002XD¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "a", "(C)Ljava/lang/String;", "Ljava/lang/String;", "getRESERVED_CHARS$annotations", "()V", "RESERVED_CHARS", "apollo-api"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f39264a = "!#$&'\"()*+,/:;=?@[]{}% ";

    private static final String a(char c10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('%');
        String num = Integer.toString(c10, C15835a.a(16));
        C17542s.i(num, "toString(this, checkRadix(radix))");
        sb2.append(num);
        String upperCase = sb2.toString().toUpperCase(Locale.ROOT);
        C17542s.i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static final String b(String str) {
        C17542s.j(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (C15854t.c0(f39264a, charAt, false, 2, (Object) null)) {
                sb2.append(a(charAt));
            } else {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
