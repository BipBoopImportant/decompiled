package WK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "", "beginIndex", "endIndex", "", "a", "(Ljava/lang/String;II)J", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class P {
    public static final long a(String str, int i10, int i11) {
        int i12;
        C17542s.j(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        } else if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        } else if (i11 <= str.length()) {
            long j10 = 0;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt < 128) {
                    j10++;
                } else {
                    if (charAt < 2048) {
                        i12 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i12 = 3;
                    } else {
                        int i13 = i10 + 1;
                        char charAt2 = i13 < i11 ? str.charAt(i13) : 0;
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            j10++;
                            i10 = i13;
                        } else {
                            j10 += (long) 4;
                            i10 += 2;
                        }
                    }
                    j10 += (long) i12;
                }
                i10++;
            }
            return j10;
        } else {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
    }

    public static /* synthetic */ long b(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return a(str, i10, i11);
    }
}
