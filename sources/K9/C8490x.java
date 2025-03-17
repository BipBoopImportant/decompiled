package k9;

import android.util.SparseArray;

/* renamed from: k9.x  reason: case insensitive filesystem */
public enum C8490x {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    private static final SparseArray<C8490x> valueMap = null;
    private final int value;

    static {
        C8490x xVar;
        C8490x xVar2;
        C8490x xVar3;
        C8490x xVar4;
        C8490x xVar5;
        C8490x xVar6;
        SparseArray<C8490x> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, xVar);
        sparseArray.put(1, xVar2);
        sparseArray.put(2, xVar3);
        sparseArray.put(3, xVar4);
        sparseArray.put(4, xVar5);
        sparseArray.put(-1, xVar6);
    }

    private C8490x(int i10) {
        this.value = i10;
    }
}
