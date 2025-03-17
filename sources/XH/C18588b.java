package xH;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"LxH/b;", "", "", "info", "headers", "body", "<init>", "(Ljava/lang/String;IZZZ)V", "Z", "m", "()Z", "j", "b", "ALL", "HEADERS", "BODY", "INFO", "NONE", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: xH.b  reason: case insensitive filesystem */
public enum C18588b {
    ALL(true, true, true),
    HEADERS(true, true, false),
    BODY(true, false, true),
    INFO(true, false, false),
    NONE(false, false, false);
    
    private final boolean body;
    private final boolean headers;
    private final boolean info;

    private C18588b(boolean z10, boolean z11, boolean z12) {
        this.info = z10;
        this.headers = z11;
        this.body = z12;
    }

    public final boolean b() {
        return this.body;
    }

    public final boolean j() {
        return this.headers;
    }

    public final boolean m() {
        return this.info;
    }
}
