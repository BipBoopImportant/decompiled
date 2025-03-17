package d9;

import com.google.protobuf.C9592z;

public enum N implements C9592z.c {
    NETWORK_STATUS_UNSPECIFIED(0),
    NETWORK_STATUS_OFFLINE(1),
    NETWORK_STATUS_WIFI(2),
    NETWORK_STATUS_CELLULAR(3),
    UNRECOGNIZED(-1);
    
    public static final int NETWORK_STATUS_CELLULAR_VALUE = 3;
    public static final int NETWORK_STATUS_OFFLINE_VALUE = 1;
    public static final int NETWORK_STATUS_UNSPECIFIED_VALUE = 0;
    public static final int NETWORK_STATUS_WIFI_VALUE = 2;
    private static final C9592z.d<N> internalValueMap = null;
    private final int value;

    public class a implements C9592z.d<N> {
        /* renamed from: b */
        public N a(int i10) {
            return N.b(i10);
        }
    }

    static {
        internalValueMap = new a();
    }

    private N(int i10) {
        this.value = i10;
    }

    public static N b(int i10) {
        if (i10 == 0) {
            return NETWORK_STATUS_UNSPECIFIED;
        }
        if (i10 == 1) {
            return NETWORK_STATUS_OFFLINE;
        }
        if (i10 == 2) {
            return NETWORK_STATUS_WIFI;
        }
        if (i10 != 3) {
            return null;
        }
        return NETWORK_STATUS_CELLULAR;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
