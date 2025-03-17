package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.z  reason: case insensitive filesystem */
final class C9542z extends C9520c<Integer> implements A.g, RandomAccess, b0 {

    /* renamed from: d  reason: collision with root package name */
    private static final C9542z f68145d;

    /* renamed from: b  reason: collision with root package name */
    private int[] f68146b;

    /* renamed from: c  reason: collision with root package name */
    private int f68147c;

    static {
        C9542z zVar = new C9542z(new int[0], 0);
        f68145d = zVar;
        zVar.o();
    }

    C9542z() {
        this(new int[10], 0);
    }

    private void k(int i10, int i11) {
        int i12;
        b();
        if (i10 < 0 || i10 > (i12 = this.f68147c)) {
            throw new IndexOutOfBoundsException(q(i10));
        }
        int[] iArr = this.f68146b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[(((i12 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f68146b, i10, iArr2, i10 + 1, this.f68147c - i10);
            this.f68146b = iArr2;
        }
        this.f68146b[i10] = i11;
        this.f68147c++;
        this.modCount++;
    }

    private void m(int i10) {
        if (i10 < 0 || i10 >= this.f68147c) {
            throw new IndexOutOfBoundsException(q(i10));
        }
    }

    private String q(int i10) {
        return "Index:" + i10 + ", Size:" + this.f68147c;
    }

    public void P1(int i10) {
        b();
        int i11 = this.f68147c;
        int[] iArr = this.f68146b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f68146b = iArr2;
        }
        int[] iArr3 = this.f68146b;
        int i12 = this.f68147c;
        this.f68147c = i12 + 1;
        iArr3[i12] = i10;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        b();
        A.a(collection);
        if (!(collection instanceof C9542z)) {
            return super.addAll(collection);
        }
        C9542z zVar = (C9542z) collection;
        int i10 = zVar.f68147c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f68147c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f68146b;
            if (i12 > iArr.length) {
                this.f68146b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(zVar.f68146b, 0, this.f68146b, this.f68147c, zVar.f68147c);
            this.f68147c = i12;
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
        if (!(obj instanceof C9542z)) {
            return super.equals(obj);
        }
        C9542z zVar = (C9542z) obj;
        if (this.f68147c != zVar.f68147c) {
            return false;
        }
        int[] iArr = zVar.f68146b;
        for (int i10 = 0; i10 < this.f68147c; i10++) {
            if (this.f68146b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public int getInt(int i10) {
        m(i10);
        return this.f68146b[i10];
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f68147c; i11++) {
            i10 = (i10 * 31) + this.f68146b[i11];
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
            if (this.f68146b[i10] == intValue) {
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

    /* renamed from: p */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    /* renamed from: r */
    public A.g f(int i10) {
        if (i10 >= this.f68147c) {
            return new C9542z(Arrays.copyOf(this.f68146b, i10), this.f68147c);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            int[] iArr = this.f68146b;
            System.arraycopy(iArr, i11, iArr, i10, this.f68147c - i11);
            this.f68147c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Integer remove(int i10) {
        b();
        m(i10);
        int[] iArr = this.f68146b;
        int i11 = iArr[i10];
        int i12 = this.f68147c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f68147c--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    public int size() {
        return this.f68147c;
    }

    /* renamed from: t */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(x(i10, num.intValue()));
    }

    public int x(int i10, int i11) {
        b();
        m(i10);
        int[] iArr = this.f68146b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    private C9542z(int[] iArr, int i10) {
        this.f68146b = iArr;
        this.f68147c = i10;
    }
}
