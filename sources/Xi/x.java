package XI;

import eJ.C17199j;

public enum x implements C17199j.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);
    
    private static C17199j.b<x> internalValueMap;
    private final int value;

    static class a implements C17199j.b<x> {
        a() {
        }

        /* renamed from: b */
        public x a(int i10) {
            return x.a(i10);
        }
    }

    static {
        internalValueMap = new a();
    }

    private x(int i10, int i11) {
        this.value = i11;
    }

    public static x a(int i10) {
        if (i10 == 0) {
            return INTERNAL;
        }
        if (i10 == 1) {
            return PRIVATE;
        }
        if (i10 == 2) {
            return PROTECTED;
        }
        if (i10 == 3) {
            return PUBLIC;
        }
        if (i10 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i10 != 5) {
            return null;
        }
        return LOCAL;
    }

    public final int d() {
        return this.value;
    }
}
