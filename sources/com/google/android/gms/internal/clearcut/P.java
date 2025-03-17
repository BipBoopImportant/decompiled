package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class P extends C7223t<Double> implements C7201l0<Double>, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final P f48228d;

    /* renamed from: b  reason: collision with root package name */
    private double[] f48229b;

    /* renamed from: c  reason: collision with root package name */
    private int f48230c;

    static {
        P p10 = new P();
        f48228d = p10;
        p10.zzv();
    }

    P() {
        this(new double[10], 0);
    }

    private final void j(int i10, double d10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f48230c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        double[] dArr = this.f48229b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[(((i11 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f48229b, i10, dArr2, i10 + 1, this.f48230c - i10);
            this.f48229b = dArr2;
        }
        this.f48229b[i10] = d10;
        this.f48230c++;
        this.modCount++;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f48230c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private final String m(int i10) {
        int i11 = this.f48230c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    public final /* synthetic */ C7201l0 R0(int i10) {
        if (i10 >= this.f48230c) {
            return new P(Arrays.copyOf(this.f48229b, i10), this.f48230c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        j(i10, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        b();
        C7192i0.a(collection);
        if (!(collection instanceof P)) {
            return super.addAll(collection);
        }
        P p10 = (P) collection;
        int i10 = p10.f48230c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f48230c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f48229b;
            if (i12 > dArr.length) {
                this.f48229b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(p10.f48229b, 0, this.f48229b, this.f48230c, p10.f48230c);
            this.f48230c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return super.equals(obj);
        }
        P p10 = (P) obj;
        if (this.f48230c != p10.f48230c) {
            return false;
        }
        double[] dArr = p10.f48229b;
        for (int i10 = 0; i10 < this.f48230c; i10++) {
            if (this.f48229b[i10] != dArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Double.valueOf(this.f48229b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f48230c; i11++) {
            i10 = (i10 * 31) + C7192i0.j(Double.doubleToLongBits(this.f48229b[i11]));
        }
        return i10;
    }

    public final void i(double d10) {
        j(this.f48230c, d10);
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        k(i10);
        double[] dArr = this.f48229b;
        double d10 = dArr[i10];
        int i11 = this.f48230c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, i11 - i10);
        }
        this.f48230c--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            double[] dArr = this.f48229b;
            System.arraycopy(dArr, i11, dArr, i10, this.f48230c - i11);
            this.f48230c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        b();
        k(i10);
        double[] dArr = this.f48229b;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.f48230c;
    }

    private P(double[] dArr, int i10) {
        this.f48229b = dArr;
        this.f48230c = i10;
    }

    public final boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f48230c; i10++) {
            if (obj.equals(Double.valueOf(this.f48229b[i10]))) {
                double[] dArr = this.f48229b;
                System.arraycopy(dArr, i10 + 1, dArr, i10, this.f48230c - i10);
                this.f48230c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
