package XI;

import eJ.C17199j;

public enum k implements C17199j.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);
    
    private static C17199j.b<k> internalValueMap;
    private final int value;

    static class a implements C17199j.b<k> {
        a() {
        }

        /* renamed from: b */
        public k a(int i10) {
            return k.a(i10);
        }
    }

    static {
        internalValueMap = new a();
    }

    private k(int i10, int i11) {
        this.value = i11;
    }

    public static k a(int i10) {
        if (i10 == 0) {
            return FINAL;
        }
        if (i10 == 1) {
            return OPEN;
        }
        if (i10 == 2) {
            return ABSTRACT;
        }
        if (i10 != 3) {
            return null;
        }
        return SEALED;
    }

    public final int d() {
        return this.value;
    }
}
