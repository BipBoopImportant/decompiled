package jp;

import fI.C17221b;
import java.util.regex.Pattern;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Ljp/d;", "", "Ljava/util/regex/Pattern;", "pattern", "<init>", "(Ljava/lang/String;ILjava/util/regex/Pattern;)V", "Ljava/util/regex/Pattern;", "b", "()Ljava/util/regex/Pattern;", "SUPERSCRIPT", "SUBSCRIPT", "STRIKE_THROUGH", "view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jp.d  reason: case insensitive filesystem */
public enum C11442d {
    SUPERSCRIPT(r1),
    SUBSCRIPT(r1),
    STRIKE_THROUGH(r1);
    
    private final Pattern pattern;

    static {
        C11442d[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C11442d(Pattern pattern2) {
        this.pattern = pattern2;
    }

    public final Pattern b() {
        return this.pattern;
    }
}
