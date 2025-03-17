package IJ;

import com.sugarcube.core.logger.DslKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "shortName", "LIJ/e;", "e", "(Ljava/lang/String;)LIJ/e;", "", "isoChar", "", "isTimeComponent", "d", "(CZ)LIJ/e;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* renamed from: IJ.g  reason: case insensitive filesystem */
class C15911g extends C15910f {
    public static final C15909e d(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return C15909e.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        } else if (c10 == 'H') {
            return C15909e.HOURS;
        } else {
            if (c10 == 'M') {
                return C15909e.MINUTES;
            }
            if (c10 == 'S') {
                return C15909e.SECONDS;
            }
            throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
        }
    }

    public static final C15909e e(String str) {
        C17542s.j(str, "shortName");
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals("us")) {
                                    return C15909e.MICROSECONDS;
                                }
                            } else if (str.equals("ns")) {
                                return C15909e.NANOSECONDS;
                            }
                        } else if (str.equals("ms")) {
                            return C15909e.MILLISECONDS;
                        }
                    } else if (str.equals("s")) {
                        return C15909e.SECONDS;
                    }
                } else if (str.equals(DslKt.INDICATOR_MAIN)) {
                    return C15909e.MINUTES;
                }
            } else if (str.equals("h")) {
                return C15909e.HOURS;
            }
        } else if (str.equals("d")) {
            return C15909e.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + str);
    }
}
