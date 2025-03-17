package uJ;

import fI.C17221b;

public enum Q0 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);
    
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;
    private final String label;
    private final int superpositionFactor;

    static {
        Q0[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private Q0(String str, boolean z10, boolean z11, int i10) {
        this.label = str;
        this.allowsInPosition = z10;
        this.allowsOutPosition = z11;
        this.superpositionFactor = i10;
    }

    public final boolean b() {
        return this.allowsOutPosition;
    }

    public final String j() {
        return this.label;
    }

    public String toString() {
        return this.label;
    }
}
