package qv;

import HJ.C15854t;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "message", "", "cause", "a", "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;", "logger-jdk"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.a  reason: case insensitive filesystem */
public final class C11818a {
    public static final String a(String str, Throwable th2) {
        if (str == null && th2 == null) {
            throw new IllegalArgumentException("A message and/or a throwable must be provided");
        } else if (th2 == null) {
            return str;
        } else {
            if (str == null || C15854t.v0(str)) {
                return f.a(th2);
            }
            String a10 = f.a(th2);
            return str + "\n" + a10;
        }
    }
}
