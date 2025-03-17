package b9;

import com.google.protobuf.C9592z;

public enum l implements C9592z.c {
    OS_UNSPECIFIED(0),
    OS_IOS(1),
    OS_ANDROID(2),
    UNRECOGNIZED(-1);
    
    public static final int OS_ANDROID_VALUE = 2;
    public static final int OS_IOS_VALUE = 1;
    public static final int OS_UNSPECIFIED_VALUE = 0;
    private static final C9592z.d<l> internalValueMap = null;
    private final int value;

    public class a implements C9592z.d<l> {
        /* renamed from: b */
        public l a(int i10) {
            return l.b(i10);
        }
    }

    static {
        internalValueMap = new a();
    }

    private l(int i10) {
        this.value = i10;
    }

    public static l b(int i10) {
        if (i10 == 0) {
            return OS_UNSPECIFIED;
        }
        if (i10 == 1) {
            return OS_IOS;
        }
        if (i10 != 2) {
            return null;
        }
        return OS_ANDROID;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
