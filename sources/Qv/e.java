package qv;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lqv/e;", "", "", "numeric", "<init>", "(Ljava/lang/String;II)V", "I", "getNumeric", "()I", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "ASSERT", "logger-domain"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum e {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6),
    ASSERT(7);
    
    private final int numeric;

    static {
        e[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private e(int i10) {
        this.numeric = i10;
    }
}
