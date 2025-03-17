package N5;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"LN5/b;", "", "", "readEnabled", "writeEnabled", "<init>", "(Ljava/lang/String;IZZ)V", "Z", "b", "()Z", "j", "ENABLED", "READ_ONLY", "WRITE_ONLY", "DISABLED", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum b {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);
    
    private final boolean readEnabled;
    private final boolean writeEnabled;

    static {
        b[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private b(boolean z10, boolean z11) {
        this.readEnabled = z10;
        this.writeEnabled = z11;
    }

    public final boolean b() {
        return this.readEnabled;
    }

    public final boolean j() {
        return this.writeEnabled;
    }
}
