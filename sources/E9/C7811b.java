package e9;

import com.google.protobuf.C9592z;

/* renamed from: e9.b  reason: case insensitive filesystem */
public enum C7811b implements C9592z.c {
    PLATFORM_UNSPECIFIED(0),
    PLATFORM_IOS(1),
    PLATFORM_ANDROID(2),
    PLATFORM_WEB(3),
    UNRECOGNIZED(-1);
    
    public static final int PLATFORM_ANDROID_VALUE = 2;
    public static final int PLATFORM_IOS_VALUE = 1;
    public static final int PLATFORM_UNSPECIFIED_VALUE = 0;
    public static final int PLATFORM_WEB_VALUE = 3;
    private static final C9592z.d<C7811b> internalValueMap = null;
    private final int value;

    /* renamed from: e9.b$a */
    public class a implements C9592z.d<C7811b> {
        /* renamed from: b */
        public C7811b a(int i10) {
            return C7811b.b(i10);
        }
    }

    static {
        internalValueMap = new a();
    }

    private C7811b(int i10) {
        this.value = i10;
    }

    public static C7811b b(int i10) {
        if (i10 == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i10 == 1) {
            return PLATFORM_IOS;
        }
        if (i10 == 2) {
            return PLATFORM_ANDROID;
        }
        if (i10 != 3) {
            return null;
        }
        return PLATFORM_WEB;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
