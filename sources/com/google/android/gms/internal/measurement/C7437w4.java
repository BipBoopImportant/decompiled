package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.w4  reason: case insensitive filesystem */
final class C7437w4 extends X3<Double> implements R4<Double>, D5, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final double[] f49112d;

    /* renamed from: b  reason: collision with root package name */
    private double[] f49113b;

    /* renamed from: c  reason: collision with root package name */
    private int f49114c;

    static {
        double[] dArr = new double[0];
        f49112d = dArr;
        new C7437w4(dArr, 0, false);
    }

    C7437w4() {
        this(f49112d, 0, true);
    }

    private static int m(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String p(int i10) {
        int i11 = this.f49114c;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void q(int i10) {
        if (i10 < 0 || i10 >= this.f49114c) {
            throw new IndexOutOfBoundsException(p(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f49114c)) {
            throw new IndexOutOfBoundsException(p(i10));
        }
        double[] dArr = this.f49113b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[m(dArr.length)];
            System.arraycopy(this.f49113b, 0, dArr2, 0, i10);
            System.arraycopy(this.f49113b, i10, dArr2, i10 + 1, this.f49114c - i10);
            this.f49113b = dArr2;
        }
        this.f49113b[i10] = doubleValue;
        this.f49114c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        b();
        O4.e(collection);
        if (!(collection instanceof C7437w4)) {
            return super.addAll(collection);
        }
        C7437w4 w4Var = (C7437w4) collection;
        int i10 = w4Var.f49114c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f49114c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f49113b;
            if (i12 > dArr.length) {
                this.f49113b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(w4Var.f49113b, 0, this.f49113b, this.f49114c, w4Var.f49114c);
            this.f49114c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ R4 c(int i10) {
        if (i10 >= this.f49114c) {
            return new C7437w4(i10 == 0 ? f49112d : Arrays.copyOf(this.f49113b, i10), this.f49114c, true);
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
        if (!(obj instanceof C7437w4)) {
            return super.equals(obj);
        }
        C7437w4 w4Var = (C7437w4) obj;
        if (this.f49114c != w4Var.f49114c) {
            return false;
        }
        double[] dArr = w4Var.f49113b;
        for (int i10 = 0; i10 < this.f49114c; i10++) {
            if (Double.doubleToLongBits(this.f49113b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        return Double.valueOf(j(i10));
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f49114c; i11++) {
            i10 = (i10 * 31) + O4.b(Double.doubleToLongBits(this.f49113b[i11]));
        }
        return i10;
    }

    public final void i(double d10) {
        b();
        int i10 = this.f49114c;
        double[] dArr = this.f49113b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[m(dArr.length)];
            System.arraycopy(this.f49113b, 0, dArr2, 0, this.f49114c);
            this.f49113b = dArr2;
        }
        double[] dArr3 = this.f49113b;
        int i11 = this.f49114c;
        this.f49114c = i11 + 1;
        dArr3[i11] = d10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f49113b[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    public final double j(int i10) {
        q(i10);
        return this.f49113b[i10];
    }

    /* access modifiers changed from: package-private */
    public final void k(int i10) {
        double[] dArr = this.f49113b;
        if (i10 > dArr.length) {
            if (dArr.length == 0) {
                this.f49113b = new double[Math.max(i10, 10)];
                return;
            }
            int length = dArr.length;
            while (length < i10) {
                length = m(length);
            }
            this.f49113b = Arrays.copyOf(this.f49113b, length);
        }
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        q(i10);
        double[] dArr = this.f49113b;
        double d10 = dArr[i10];
        int i11 = this.f49114c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f49114c--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            double[] dArr = this.f49113b;
            System.arraycopy(dArr, i11, dArr, i10, this.f49114c - i11);
            this.f49114c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        b();
        q(i10);
        double[] dArr = this.f49113b;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.f49114c;
    }

    private C7437w4(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f49113b = dArr;
        this.f49114c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        i(((Double) obj).doubleValue());
        return true;
    }
}
