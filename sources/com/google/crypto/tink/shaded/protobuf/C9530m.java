package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.m  reason: case insensitive filesystem */
final class C9530m extends C9520c<Double> implements A.b, RandomAccess, b0 {

    /* renamed from: d  reason: collision with root package name */
    private static final C9530m f68066d;

    /* renamed from: b  reason: collision with root package name */
    private double[] f68067b;

    /* renamed from: c  reason: collision with root package name */
    private int f68068c;

    static {
        C9530m mVar = new C9530m(new double[0], 0);
        f68066d = mVar;
        mVar.o();
    }

    C9530m() {
        this(new double[10], 0);
    }

    private void m(int i10, double d10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f68068c)) {
            throw new IndexOutOfBoundsException(s(i10));
        }
        double[] dArr = this.f68067b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[(((i11 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f68067b, i10, dArr2, i10 + 1, this.f68068c - i10);
            this.f68067b = dArr2;
        }
        this.f68067b[i10] = d10;
        this.f68068c++;
        this.modCount++;
    }

    private void p(int i10) {
        if (i10 < 0 || i10 >= this.f68068c) {
            throw new IndexOutOfBoundsException(s(i10));
        }
    }

    private String s(int i10) {
        return "Index:" + i10 + ", Size:" + this.f68068c;
    }

    public double A(int i10, double d10) {
        b();
        p(i10);
        double[] dArr = this.f68067b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        b();
        A.a(collection);
        if (!(collection instanceof C9530m)) {
            return super.addAll(collection);
        }
        C9530m mVar = (C9530m) collection;
        int i10 = mVar.f68068c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f68068c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f68067b;
            if (i12 > dArr.length) {
                this.f68067b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(mVar.f68067b, 0, this.f68067b, this.f68068c, mVar.f68068c);
            this.f68068c = i12;
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
        if (!(obj instanceof C9530m)) {
            return super.equals(obj);
        }
        C9530m mVar = (C9530m) obj;
        if (this.f68068c != mVar.f68068c) {
            return false;
        }
        double[] dArr = mVar.f68067b;
        for (int i10 = 0; i10 < this.f68068c; i10++) {
            if (Double.doubleToLongBits(this.f68067b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f68068c; i11++) {
            i10 = (i10 * 31) + A.f(Double.doubleToLongBits(this.f68067b[i11]));
        }
        return i10;
    }

    /* renamed from: i */
    public void add(int i10, Double d10) {
        m(i10, d10.doubleValue());
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f68067b[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean add(Double d10) {
        k(d10.doubleValue());
        return true;
    }

    public void k(double d10) {
        b();
        int i10 = this.f68068c;
        double[] dArr = this.f68067b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[(((i10 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f68067b = dArr2;
        }
        double[] dArr3 = this.f68067b;
        int i11 = this.f68068c;
        this.f68068c = i11 + 1;
        dArr3[i11] = d10;
    }

    /* renamed from: q */
    public Double get(int i10) {
        return Double.valueOf(r(i10));
    }

    public double r(int i10) {
        p(i10);
        return this.f68067b[i10];
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            double[] dArr = this.f68067b;
            System.arraycopy(dArr, i11, dArr, i10, this.f68068c - i11);
            this.f68068c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f68068c;
    }

    /* renamed from: t */
    public A.b f(int i10) {
        if (i10 >= this.f68068c) {
            return new C9530m(Arrays.copyOf(this.f68067b, i10), this.f68068c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: x */
    public Double remove(int i10) {
        b();
        p(i10);
        double[] dArr = this.f68067b;
        double d10 = dArr[i10];
        int i11 = this.f68068c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f68068c--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    /* renamed from: y */
    public Double set(int i10, Double d10) {
        return Double.valueOf(A(i10, d10.doubleValue()));
    }

    private C9530m(double[] dArr, int i10) {
        this.f68067b = dArr;
        this.f68068c = i10;
    }
}
