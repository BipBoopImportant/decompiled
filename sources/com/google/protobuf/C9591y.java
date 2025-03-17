package com.google.protobuf;

import com.google.protobuf.C9592z;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.y  reason: case insensitive filesystem */
final class C9591y extends C9570c<Integer> implements C9592z.g, RandomAccess, b0 {

    /* renamed from: d  reason: collision with root package name */
    private static final C9591y f69426d = new C9591y(new int[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    private int[] f69427b;

    /* renamed from: c  reason: collision with root package name */
    private int f69428c;

    C9591y() {
        this(new int[10], 0, true);
    }

    private void k(int i10, int i11) {
        int i12;
        b();
        if (i10 < 0 || i10 > (i12 = this.f69428c)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        int[] iArr = this.f69427b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[(((i12 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f69427b, i10, iArr2, i10 + 1, this.f69428c - i10);
            this.f69427b = iArr2;
        }
        this.f69427b[i10] = i11;
        this.f69428c++;
        this.modCount++;
    }

    public static C9591y m() {
        return f69426d;
    }

    private void p(int i10) {
        if (i10 < 0 || i10 >= this.f69428c) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    private String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f69428c;
    }

    public void P1(int i10) {
        b();
        int i11 = this.f69428c;
        int[] iArr = this.f69427b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f69427b = iArr2;
        }
        int[] iArr3 = this.f69427b;
        int i12 = this.f69428c;
        this.f69428c = i12 + 1;
        iArr3[i12] = i10;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        b();
        C9592z.a(collection);
        if (!(collection instanceof C9591y)) {
            return super.addAll(collection);
        }
        C9591y yVar = (C9591y) collection;
        int i10 = yVar.f69428c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f69428c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f69427b;
            if (i12 > iArr.length) {
                this.f69427b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(yVar.f69427b, 0, this.f69427b, this.f69428c, yVar.f69428c);
            this.f69428c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9591y)) {
            return super.equals(obj);
        }
        C9591y yVar = (C9591y) obj;
        if (this.f69428c != yVar.f69428c) {
            return false;
        }
        int[] iArr = yVar.f69427b;
        for (int i10 = 0; i10 < this.f69428c; i10++) {
            if (this.f69427b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public int getInt(int i10) {
        p(i10);
        return this.f69427b[i10];
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f69428c; i11++) {
            i10 = (i10 * 31) + this.f69427b[i11];
        }
        return i10;
    }

    /* renamed from: i */
    public void add(int i10, Integer num) {
        k(i10, num.intValue());
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f69427b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean add(Integer num) {
        P1(num.intValue());
        return true;
    }

    /* renamed from: q */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            int[] iArr = this.f69427b;
            System.arraycopy(iArr, i11, iArr, i10, this.f69428c - i11);
            this.f69428c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Integer remove(int i10) {
        b();
        p(i10);
        int[] iArr = this.f69427b;
        int i11 = iArr[i10];
        int i12 = this.f69428c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f69428c--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    public int size() {
        return this.f69428c;
    }

    /* renamed from: t */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(x(i10, num.intValue()));
    }

    public int x(int i10, int i11) {
        b();
        p(i10);
        int[] iArr = this.f69427b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    private C9591y(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f69427b = iArr;
        this.f69428c = i10;
    }

    public C9592z.g f(int i10) {
        if (i10 >= this.f69428c) {
            return new C9591y(Arrays.copyOf(this.f69427b, i10), this.f69428c, true);
        }
        throw new IllegalArgumentException();
    }
}
