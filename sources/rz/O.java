package rz;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lrz/O;", "", "", "value", "analytics", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "b", "BARCODE", "AS_IS", "QR", "MANUAL_INPUT", "DATA_MATRIX", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum O {
    BARCODE("bc", "barcode"),
    AS_IS("dm", "data_matrix"),
    QR("qr", "qr"),
    MANUAL_INPUT("mi", (int) null),
    DATA_MATRIX("dm", "data_matrix");
    
    private final String analytics;
    private final String value;

    static {
        O[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private O(String str, String str2) {
        this.value = str;
        this.analytics = str2;
    }

    public static C17220a<O> j() {
        return $ENTRIES;
    }

    public final String b() {
        return this.analytics;
    }

    public final String m() {
        return this.value;
    }
}
