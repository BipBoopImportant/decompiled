package Cb;

import com.google.crypto.tink.shaded.protobuf.A;

public enum z implements A.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final A.d<z> internalValueMap = null;
    private final int value;

    class a implements A.d<z> {
        a() {
        }

        /* renamed from: b */
        public z a(int i10) {
            return z.a(i10);
        }
    }

    static {
        internalValueMap = new a();
    }

    private z(int i10) {
        this.value = i10;
    }

    public static z a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i10 == 1) {
            return ENABLED;
        }
        if (i10 == 2) {
            return DISABLED;
        }
        if (i10 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
