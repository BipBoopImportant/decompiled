package F8;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"LF8/e;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "OFFLINE", "CONNECTIVITY_ERROR", "WIFI", "MOBILE_2G", "MOBILE_3G", "MOBILE_4G", "MOBILE_5G", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum e {
    OFFLINE(-1),
    CONNECTIVITY_ERROR(0),
    WIFI(1),
    MOBILE_2G(2),
    MOBILE_3G(3),
    MOBILE_4G(4),
    MOBILE_5G(5);
    
    private final int value;

    private e(int i10) {
        this.value = i10;
    }

    public final int b() {
        return this.value;
    }
}
