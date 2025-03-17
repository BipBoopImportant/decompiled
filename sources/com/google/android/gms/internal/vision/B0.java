package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class B0 extends C7469b0<Double> implements C7466a1<Double>, L1, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final B0 f49164d;

    /* renamed from: b  reason: collision with root package name */
    private double[] f49165b;

    /* renamed from: c  reason: collision with root package name */
    private int f49166c;

    static {
        B0 b02 = new B0(new double[0], 0);
        f49164d = b02;
        b02.zzb();
    }

    B0() {
        this(new double[10], 0);
    }

    private final void j(int i10) {
        if (i10 < 0 || i10 >= this.f49166c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private final String k(int i10) {
        int i11 = this.f49166c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f49166c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        double[] dArr = this.f49165b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[(((i11 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f49165b, i10, dArr2, i10 + 1, this.f49166c - i10);
            this.f49165b = dArr2;
        }
        this.f49165b[i10] = doubleValue;
        this.f49166c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        b();
        U0.d(collection);
        if (!(collection instanceof B0)) {
            return super.addAll(collection);
        }
        B0 b02 = (B0) collection;
        int i10 = b02.f49166c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f49166c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f49165b;
            if (i12 > dArr.length) {
                this.f49165b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(b02.f49165b, 0, this.f49165b, this.f49166c, b02.f49166c);
            this.f49166c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ C7466a1 c(int i10) {
        if (i10 >= this.f49166c) {
            return new B0(Arrays.copyOf(this.f49165b, i10), this.f49166c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return super.equals(obj);
        }
        B0 b02 = (B0) obj;
        if (this.f49166c != b02.f49166c) {
            return false;
        }
        double[] dArr = b02.f49165b;
        for (int i10 = 0; i10 < this.f49166c; i10++) {
            if (Double.doubleToLongBits(this.f49165b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        j(i10);
        return Double.valueOf(this.f49165b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f49166c; i11++) {
            i10 = (i10 * 31) + U0.b(Double.doubleToLongBits(this.f49165b[i11]));
        }
        return i10;
    }

    public final void i(double d10) {
        b();
        int i10 = this.f49166c;
        double[] dArr = this.f49165b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[(((i10 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f49165b = dArr2;
        }
        double[] dArr3 = this.f49165b;
        int i11 = this.f49166c;
        this.f49166c = i11 + 1;
        dArr3[i11] = d10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f49165b[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        j(i10);
        double[] dArr = this.f49165b;
        double d10 = dArr[i10];
        int i11 = this.f49166c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f49166c--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            double[] dArr = this.f49165b;
            System.arraycopy(dArr, i11, dArr, i10, this.f49166c - i11);
            this.f49166c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        b();
        j(i10);
        double[] dArr = this.f49165b;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.f49166c;
    }

    private B0(double[] dArr, int i10) {
        this.f49165b = dArr;
        this.f49166c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        i(((Double) obj).doubleValue());
        return true;
    }
}
