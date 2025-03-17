package com.google.protobuf;

import com.google.protobuf.C9592z;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.m  reason: case insensitive filesystem */
final class C9580m extends C9570c<Double> implements C9592z.b, RandomAccess, b0 {

    /* renamed from: d  reason: collision with root package name */
    private static final C9580m f69357d = new C9580m(new double[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    private double[] f69358b;

    /* renamed from: c  reason: collision with root package name */
    private int f69359c;

    C9580m() {
        this(new double[10], 0, true);
    }

    private void m(int i10, double d10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f69359c)) {
            throw new IndexOutOfBoundsException(s(i10));
        }
        double[] dArr = this.f69358b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[(((i11 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f69358b, i10, dArr2, i10 + 1, this.f69359c - i10);
            this.f69358b = dArr2;
        }
        this.f69358b[i10] = d10;
        this.f69359c++;
        this.modCount++;
    }

    private void p(int i10) {
        if (i10 < 0 || i10 >= this.f69359c) {
            throw new IndexOutOfBoundsException(s(i10));
        }
    }

    private String s(int i10) {
        return "Index:" + i10 + ", Size:" + this.f69359c;
    }

    public double A(int i10, double d10) {
        b();
        p(i10);
        double[] dArr = this.f69358b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        b();
        C9592z.a(collection);
        if (!(collection instanceof C9580m)) {
            return super.addAll(collection);
        }
        C9580m mVar = (C9580m) collection;
        int i10 = mVar.f69359c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f69359c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f69358b;
            if (i12 > dArr.length) {
                this.f69358b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(mVar.f69358b, 0, this.f69358b, this.f69359c, mVar.f69359c);
            this.f69359c = i12;
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
        if (!(obj instanceof C9580m)) {
            return super.equals(obj);
        }
        C9580m mVar = (C9580m) obj;
        if (this.f69359c != mVar.f69359c) {
            return false;
        }
        double[] dArr = mVar.f69358b;
        for (int i10 = 0; i10 < this.f69359c; i10++) {
            if (Double.doubleToLongBits(this.f69358b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f69359c; i11++) {
            i10 = (i10 * 31) + C9592z.f(Double.doubleToLongBits(this.f69358b[i11]));
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
            if (this.f69358b[i10] == doubleValue) {
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
        int i10 = this.f69359c;
        double[] dArr = this.f69358b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[(((i10 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f69358b = dArr2;
        }
        double[] dArr3 = this.f69358b;
        int i11 = this.f69359c;
        this.f69359c = i11 + 1;
        dArr3[i11] = d10;
    }

    /* renamed from: q */
    public Double get(int i10) {
        return Double.valueOf(r(i10));
    }

    public double r(int i10) {
        p(i10);
        return this.f69358b[i10];
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            double[] dArr = this.f69358b;
            System.arraycopy(dArr, i11, dArr, i10, this.f69359c - i11);
            this.f69359c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f69359c;
    }

    /* renamed from: t */
    public C9592z.b f(int i10) {
        if (i10 >= this.f69359c) {
            return new C9580m(Arrays.copyOf(this.f69358b, i10), this.f69359c, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: x */
    public Double remove(int i10) {
        b();
        p(i10);
        double[] dArr = this.f69358b;
        double d10 = dArr[i10];
        int i11 = this.f69359c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f69359c--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    /* renamed from: y */
    public Double set(int i10, Double d10) {
        return Double.valueOf(A(i10, d10.doubleValue()));
    }

    private C9580m(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f69358b = dArr;
        this.f69359c = i10;
    }
}
