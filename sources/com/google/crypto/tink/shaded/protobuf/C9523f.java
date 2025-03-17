package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.f  reason: case insensitive filesystem */
final class C9523f extends C9520c<Boolean> implements A.a, RandomAccess, b0 {

    /* renamed from: d  reason: collision with root package name */
    private static final C9523f f67980d;

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f67981b;

    /* renamed from: c  reason: collision with root package name */
    private int f67982c;

    static {
        C9523f fVar = new C9523f(new boolean[0], 0);
        f67980d = fVar;
        fVar.o();
    }

    C9523f() {
        this(new boolean[10], 0);
    }

    private void k(int i10, boolean z10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f67982c)) {
            throw new IndexOutOfBoundsException(s(i10));
        }
        boolean[] zArr = this.f67981b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[(((i11 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f67981b, i10, zArr2, i10 + 1, this.f67982c - i10);
            this.f67981b = zArr2;
        }
        this.f67981b[i10] = z10;
        this.f67982c++;
        this.modCount++;
    }

    private void p(int i10) {
        if (i10 < 0 || i10 >= this.f67982c) {
            throw new IndexOutOfBoundsException(s(i10));
        }
    }

    private String s(int i10) {
        return "Index:" + i10 + ", Size:" + this.f67982c;
    }

    public boolean A(int i10, boolean z10) {
        b();
        p(i10);
        boolean[] zArr = this.f67981b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        b();
        A.a(collection);
        if (!(collection instanceof C9523f)) {
            return super.addAll(collection);
        }
        C9523f fVar = (C9523f) collection;
        int i10 = fVar.f67982c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f67982c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f67981b;
            if (i12 > zArr.length) {
                this.f67981b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(fVar.f67981b, 0, this.f67981b, this.f67982c, fVar.f67982c);
            this.f67982c = i12;
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
        if (!(obj instanceof C9523f)) {
            return super.equals(obj);
        }
        C9523f fVar = (C9523f) obj;
        if (this.f67982c != fVar.f67982c) {
            return false;
        }
        boolean[] zArr = fVar.f67981b;
        for (int i10 = 0; i10 < this.f67982c; i10++) {
            if (this.f67981b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f67982c; i11++) {
            i10 = (i10 * 31) + A.c(this.f67981b[i11]);
        }
        return i10;
    }

    /* renamed from: i */
    public void add(int i10, Boolean bool) {
        k(i10, bool.booleanValue());
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f67981b[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean add(Boolean bool) {
        m(bool.booleanValue());
        return true;
    }

    public void m(boolean z10) {
        b();
        int i10 = this.f67982c;
        boolean[] zArr = this.f67981b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i10 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f67981b = zArr2;
        }
        boolean[] zArr3 = this.f67981b;
        int i11 = this.f67982c;
        this.f67982c = i11 + 1;
        zArr3[i11] = z10;
    }

    /* renamed from: q */
    public Boolean get(int i10) {
        return Boolean.valueOf(r(i10));
    }

    public boolean r(int i10) {
        p(i10);
        return this.f67981b[i10];
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            boolean[] zArr = this.f67981b;
            System.arraycopy(zArr, i11, zArr, i10, this.f67982c - i11);
            this.f67982c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f67982c;
    }

    /* renamed from: t */
    public A.a f(int i10) {
        if (i10 >= this.f67982c) {
            return new C9523f(Arrays.copyOf(this.f67981b, i10), this.f67982c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: x */
    public Boolean remove(int i10) {
        b();
        p(i10);
        boolean[] zArr = this.f67981b;
        boolean z10 = zArr[i10];
        int i11 = this.f67982c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f67982c--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    /* renamed from: y */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(A(i10, bool.booleanValue()));
    }

    private C9523f(boolean[] zArr, int i10) {
        this.f67981b = zArr;
        this.f67982c = i10;
    }
}
