package R8;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "a", "(Ljava/lang/String;)I", "error-analysis_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final int a(String str) {
        C17542s.j(str, "<this>");
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            int i12 = 1;
            if (charAt < 128) {
                i10++;
            } else if (charAt < 2048) {
                i10++;
                i12 = 2;
            } else if (charAt < 55296 || charAt > 57343) {
                i10++;
                i12 = 3;
            } else {
                int i13 = i10 + 1;
                char charAt2 = i13 < str.length() ? str.charAt(i13) : 0;
                if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                    i10 = i13;
                } else {
                    i10 += 2;
                    i12 = 4;
                }
            }
            i11 += i12;
        }
        return i11;
    }
}
