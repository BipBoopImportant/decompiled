package Ai;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"LAi/D0;", "", "<init>", "()V", "", "index", "", "d", "(I)Ljava/lang/String;", "c", "b", "a", "e", "deliveryMethodIndex", "g", "(II)Ljava/lang/String;", "f", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class D0 {

    /* renamed from: a  reason: collision with root package name */
    public static final D0 f78440a = new D0();

    private D0() {
    }

    public final String a(int i10) {
        return "ORDER_TRACKING_DELIVERY_HEADER_CARRIER-" + i10;
    }

    public final String b(int i10) {
        return "ORDER_TRACKING_DELIVERY_HEADER_DATE-" + i10;
    }

    public final String c(int i10) {
        return "ORDER_TRACKING_DELIVERY_HEADER_METHOD-" + i10;
    }

    public final String d(int i10) {
        return "ORDER_TRACKING_DELIVERY_HEADER-" + i10;
    }

    public final String e(int i10) {
        return "DELIVERY_ERROR_INLINE_MESSAGE-" + i10;
    }

    public final String f(int i10) {
        return "ORDER_TRACKING_LOCATION-" + i10;
    }

    public final String g(int i10, int i11) {
        return "ORDER_TRACKING_STEP-" + i10 + "-" + i11;
    }
}
