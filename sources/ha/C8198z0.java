package ha;

/* renamed from: ha.z0  reason: case insensitive filesystem */
public final class C8198z0 {
    static Object[] a(Object[] objArr, int i10) {
        int i11 = 0;
        while (i11 < i10) {
            if (objArr[i11] != null) {
                i11++;
            } else {
                throw new NullPointerException("at index " + i11);
            }
        }
        return objArr;
    }
}
