package com.google.android.gms.internal.clearcut;

public enum d2 implements C7195j0 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);
    
    private static final C7198k0<d2> zzbq = null;
    private final int value;

    static {
        zzbq = new h2();
    }

    private d2(int i10) {
        this.value = i10;
    }

    public static d2 a(int i10) {
        if (i10 == 0) {
            return DEFAULT;
        }
        if (i10 == 1) {
            return UNMETERED_ONLY;
        }
        if (i10 == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i10 == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i10 != 4) {
            return null;
        }
        return NEVER;
    }

    public final int zzc() {
        return this.value;
    }
}
