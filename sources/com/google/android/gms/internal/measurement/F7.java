package com.google.android.gms.internal.measurement;

public enum F7 {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    private F7(int i10) {
    }

    public static F7 a(int i10) {
        return i10 != 2 ? i10 != 3 ? i10 != 5 ? i10 != 6 ? INFO : ERROR : WARN : DEBUG : VERBOSE;
    }
}
