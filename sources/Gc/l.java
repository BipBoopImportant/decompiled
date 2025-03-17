package Gc;

import com.google.protobuf.C9592z;

public enum l implements C9592z.c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    
    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final C9592z.d<l> internalValueMap = null;
    private final int value;

    class a implements C9592z.d<l> {
        a() {
        }

        /* renamed from: b */
        public l a(int i10) {
            return l.b(i10);
        }
    }

    private static final class b implements C9592z.e {

        /* renamed from: a  reason: collision with root package name */
        static final C9592z.e f60596a = null;

        static {
            f60596a = new b();
        }

        private b() {
        }

        public boolean a(int i10) {
            return l.b(i10) != null;
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
            return SESSION_VERBOSITY_NONE;
        }
        if (i10 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static C9592z.e j() {
        return b.f60596a;
    }

    public final int d() {
        return this.value;
    }
}
