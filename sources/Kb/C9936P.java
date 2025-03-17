package kb;

import java.util.Arrays;
import java.util.Map;

/* renamed from: kb.P  reason: case insensitive filesystem */
final class C9936P {
    static <T> T[] a(Object[] objArr, int i10, int i11, T[] tArr) {
        return Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    static <T> T[] b(T[] tArr, int i10) {
        if (tArr.length != 0) {
            tArr = Arrays.copyOf(tArr, 0);
        }
        return Arrays.copyOf(tArr, i10);
    }

    static <K, V> Map<K, V> c(int i10) {
        return C9956k.A(i10);
    }
}
