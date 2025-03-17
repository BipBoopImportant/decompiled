package Gc;

import com.google.protobuf.C9592z;

public enum d implements C9592z.c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    
    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final C9592z.d<d> internalValueMap = null;
    private final int value;

    class a implements C9592z.d<d> {
        a() {
        }

        /* renamed from: b */
        public d a(int i10) {
            return d.b(i10);
        }
    }

    private static final class b implements C9592z.e {

        /* renamed from: a  reason: collision with root package name */
        static final C9592z.e f60586a = null;

        static {
            f60586a = new b();
        }

        private b() {
        }

        public boolean a(int i10) {
            return d.b(i10) != null;
        }
    }

    static {
        internalValueMap = new a();
    }

    private d(int i10) {
        this.value = i10;
    }

    public static d b(int i10) {
        if (i10 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i10 == 1) {
            return FOREGROUND;
        }
        if (i10 == 2) {
            return BACKGROUND;
        }
        if (i10 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static C9592z.e j() {
        return b.f60586a;
    }

    public final int d() {
        return this.value;
    }
}
