package Cb;

import com.google.crypto.tink.shaded.protobuf.A;

public enum I implements A.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final A.d<I> internalValueMap = null;
    private final int value;

    class a implements A.d<I> {
        a() {
        }

        /* renamed from: b */
        public I a(int i10) {
            return I.a(i10);
        }
    }

    static {
        internalValueMap = new a();
    }

    private I(int i10) {
        this.value = i10;
    }

    public static I a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
