package rz;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lrz/X;", "", "", "serializedName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "COUPON_BAG_ERROR_EXPIRED", "COUPON_BAG_ERROR_FAMILY", "COUPON_BAG_ERROR_INVALID", "COUPON_BAG_ERROR_NOT_STARTED", "COUPON_BAG_ERROR_REDEEMED", "COUPON_BAG_ERROR_INTERNAL", "COUPON_GENERIC_ERROR", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum X {
    COUPON_BAG_ERROR_EXPIRED("COUPON_BAG_ERROR_EXPIRED"),
    COUPON_BAG_ERROR_FAMILY("COUPON_BAG_ERROR_FAMILY"),
    COUPON_BAG_ERROR_INVALID("COUPON_BAG_ERROR_INVALID"),
    COUPON_BAG_ERROR_NOT_STARTED("COUPON_BAG_ERROR_NOT_STARTED"),
    COUPON_BAG_ERROR_REDEEMED("COUPON_BAG_ERROR_REDEEMED"),
    COUPON_BAG_ERROR_INTERNAL("COUPON_BAG_ERROR_INTERNAL"),
    COUPON_GENERIC_ERROR("COUPON_GENERIC_ERROR");
    
    private final String serializedName;

    static {
        X[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private X(String str) {
        this.serializedName = str;
    }

    public static C17220a<X> b() {
        return $ENTRIES;
    }

    public final String j() {
        return this.serializedName;
    }
}
