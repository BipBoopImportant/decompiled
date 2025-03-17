package XI;

import eJ.C17199j;

public enum j implements C17199j.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);
    
    private static C17199j.b<j> internalValueMap;
    private final int value;

    static class a implements C17199j.b<j> {
        a() {
        }

        /* renamed from: b */
        public j a(int i10) {
            return j.a(i10);
        }
    }

    static {
        internalValueMap = new a();
    }

    private j(int i10, int i11) {
        this.value = i11;
    }

    public static j a(int i10) {
        if (i10 == 0) {
            return DECLARATION;
        }
        if (i10 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i10 == 2) {
            return DELEGATION;
        }
        if (i10 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    public final int d() {
        return this.value;
    }
}
