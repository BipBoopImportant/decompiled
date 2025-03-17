package d9;

import com.google.protobuf.C9592z;

public enum Q implements C9592z.c {
    RECORDING_QUALITY_UNSPECIFIED(0),
    RECORDING_QUALITY_LOW(1),
    RECORDING_QUALITY_MEDIUM(2),
    RECORDING_QUALITY_HIGH(3),
    UNRECOGNIZED(-1);
    
    public static final int RECORDING_QUALITY_HIGH_VALUE = 3;
    public static final int RECORDING_QUALITY_LOW_VALUE = 1;
    public static final int RECORDING_QUALITY_MEDIUM_VALUE = 2;
    public static final int RECORDING_QUALITY_UNSPECIFIED_VALUE = 0;
    private static final C9592z.d<Q> internalValueMap = null;
    private final int value;

    public class a implements C9592z.d<Q> {
        /* renamed from: b */
        public Q a(int i10) {
            return Q.b(i10);
        }
    }

    static {
        internalValueMap = new a();
    }

    private Q(int i10) {
        this.value = i10;
    }

    public static Q b(int i10) {
        if (i10 == 0) {
            return RECORDING_QUALITY_UNSPECIFIED;
        }
        if (i10 == 1) {
            return RECORDING_QUALITY_LOW;
        }
        if (i10 == 2) {
            return RECORDING_QUALITY_MEDIUM;
        }
        if (i10 != 3) {
            return null;
        }
        return RECORDING_QUALITY_HIGH;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
