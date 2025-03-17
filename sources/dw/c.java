package Dw;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LDw/c;", "", "", "serializedValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "PREPARING", "READY_FOR_PICKUP", "COLLECTED", "UNKNOWN", "ongoinginstoreordersrepository_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum c {
    PREPARING("PREPARING"),
    READY_FOR_PICKUP("READY_FOR_PICKUP"),
    COLLECTED("COLLECTED"),
    UNKNOWN("UNKNOWN");
    
    private final String serializedValue;

    static {
        c[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private c(String str) {
        this.serializedValue = str;
    }

    public static C17220a<c> b() {
        return $ENTRIES;
    }

    public final String j() {
        return this.serializedValue;
    }
}
