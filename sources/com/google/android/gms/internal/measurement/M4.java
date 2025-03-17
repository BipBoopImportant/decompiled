package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class M4 extends X3<Integer> implements P4, D5, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f48749d;

    /* renamed from: e  reason: collision with root package name */
    private static final M4 f48750e;

    /* renamed from: b  reason: collision with root package name */
    private int[] f48751b;

    /* renamed from: c  reason: collision with root package name */
    private int f48752c;

    static {
        int[] iArr = new int[0];
        f48749d = iArr;
        f48750e = new M4(iArr, 0, false);
    }

    M4() {
        this(f48749d, 0, true);
    }

    public static M4 j() {
        return f48750e;
    }

    private static int p(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String q(int i10) {
        int i11 = this.f48752c;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void r(int i10) {
        if (i10 < 0 || i10 >= this.f48752c) {
            throw new IndexOutOfBoundsException(q(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f48752c)) {
            throw new IndexOutOfBoundsException(q(i10));
        }
        int[] iArr = this.f48751b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[p(iArr.length)];
            System.arraycopy(this.f48751b, 0, iArr2, 0, i10);
            System.arraycopy(this.f48751b, i10, iArr2, i10 + 1, this.f48752c - i10);
            this.f48751b = iArr2;
        }
        this.f48751b[i10] = intValue;
        this.f48752c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        b();
        O4.e(collection);
        if (!(collection instanceof M4)) {
            return super.addAll(collection);
        }
        M4 m42 = (M4) collection;
        int i10 = m42.f48752c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f48752c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f48751b;
            if (i12 > iArr.length) {
                this.f48751b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(m42.f48751b, 0, this.f48751b, this.f48752c, m42.f48752c);
            this.f48752c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M4)) {
            return super.equals(obj);
        }
        M4 m42 = (M4) obj;
        if (this.f48752c != m42.f48752c) {
            return false;
        }
        int[] iArr = m42.f48751b;
        for (int i10 = 0; i10 < this.f48752c; i10++) {
            if (this.f48751b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        return Integer.valueOf(i(i10));
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f48752c; i11++) {
            i10 = (i10 * 31) + this.f48751b[i11];
        }
        return i10;
    }

    public final int i(int i10) {
        r(i10);
        return this.f48751b[i10];
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f48751b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        b();
        int i11 = this.f48752c;
        int[] iArr = this.f48751b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[p(iArr.length)];
            System.arraycopy(this.f48751b, 0, iArr2, 0, this.f48752c);
            this.f48751b = iArr2;
        }
        int[] iArr3 = this.f48751b;
        int i12 = this.f48752c;
        this.f48752c = i12 + 1;
        iArr3[i12] = i10;
    }

    /* access modifiers changed from: package-private */
    public final void m(int i10) {
        int[] iArr = this.f48751b;
        if (i10 > iArr.length) {
            if (iArr.length == 0) {
                this.f48751b = new int[Math.max(i10, 10)];
                return;
            }
            int length = iArr.length;
            while (length < i10) {
                length = p(length);
            }
            this.f48751b = Arrays.copyOf(this.f48751b, length);
        }
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        r(i10);
        int[] iArr = this.f48751b;
        int i11 = iArr[i10];
        int i12 = this.f48752c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f48752c--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            int[] iArr = this.f48751b;
            System.arraycopy(iArr, i11, iArr, i10, this.f48752c - i11);
            this.f48752c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        r(i10);
        int[] iArr = this.f48751b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.f48752c;
    }

    /* renamed from: z */
    public final P4 c(int i10) {
        if (i10 >= this.f48752c) {
            return new M4(i10 == 0 ? f48749d : Arrays.copyOf(this.f48751b, i10), this.f48752c, true);
        }
        throw new IllegalArgumentException();
    }

    private M4(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f48751b = iArr;
        this.f48752c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        k(((Integer) obj).intValue());
        return true;
    }
}
