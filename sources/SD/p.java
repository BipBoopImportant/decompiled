package sd;

import ld.C10011d;

public abstract class p extends m {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f76525a = {1, 1, 1};

    /* renamed from: b  reason: collision with root package name */
    static final int[] f76526b = {1, 1, 1, 1, 1};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f76527c = {1, 1, 1, 1, 1, 1};

    /* renamed from: d  reason: collision with root package name */
    static final int[][] f76528d;

    /* renamed from: e  reason: collision with root package name */
    static final int[][] f76529e;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f76528d = iArr;
        int[][] iArr2 = new int[20][];
        f76529e = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f76528d[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f76529e[i10] = iArr4;
        }
    }

    static boolean a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return b(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int charAt = charSequence.charAt(i11) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C10011d.a();
            }
            i10 += charAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int charAt2 = charSequence.charAt(i13) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C10011d.a();
            }
            i12 += charAt2;
        }
        return (1000 - i12) % 10;
    }
}
