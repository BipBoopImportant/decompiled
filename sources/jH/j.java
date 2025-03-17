package JH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "", "a", "(C)Z", "", "", "b", "(Ljava/lang/String;)[C", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {
    public static final boolean a(char c10) {
        return Character.toLowerCase(c10) == c10;
    }

    public static final char[] b(String str) {
        C17542s.j(str, "<this>");
        int length = str.length();
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
        }
        return cArr;
    }
}
