package j0;

import java.lang.reflect.Array;

/* renamed from: j0.c  reason: case insensitive filesystem */
class C5447c {
    static <T> T[] a(T[] tArr, int i10) {
        if (tArr.length < i10) {
            return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10);
        }
        if (tArr.length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
