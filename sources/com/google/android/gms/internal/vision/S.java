package com.google.android.gms.internal.vision;

public enum S implements T0 {
    UNKNOWN_FORMAT(0),
    CONTACT_INFO(1),
    EMAIL(2),
    ISBN(3),
    PHONE(4),
    PRODUCT(5),
    SMS(6),
    TEXT(7),
    URL(8),
    WIFI(9),
    GEO(10),
    CALENDAR_EVENT(11),
    DRIVER_LICENSE(12),
    BOARDING_PASS(13);
    
    private static final W0<S> zzo = null;
    private final int zzp;

    static {
        zzo = new V();
    }

    private S(int i10) {
        this.zzp = i10;
    }

    public static S a(int i10) {
        switch (i10) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return CONTACT_INFO;
            case 2:
                return EMAIL;
            case 3:
                return ISBN;
            case 4:
                return PHONE;
            case 5:
                return PRODUCT;
            case 6:
                return SMS;
            case 7:
                return TEXT;
            case 8:
                return URL;
            case 9:
                return WIFI;
            case 10:
                return GEO;
            case 11:
                return CALENDAR_EVENT;
            case 12:
                return DRIVER_LICENSE;
            case 13:
                return BOARDING_PASS;
            default:
                return null;
        }
    }

    public static V0 b() {
        return U.f49275a;
    }

    public final String toString() {
        return "<" + S.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzp + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzp;
    }
}
