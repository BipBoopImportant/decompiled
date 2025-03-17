package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.h0  reason: case insensitive filesystem */
final class C7189h0 extends C7223t<Integer> implements C7201l0<Integer>, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final C7189h0 f48403d;

    /* renamed from: b  reason: collision with root package name */
    private int[] f48404b;

    /* renamed from: c  reason: collision with root package name */
    private int f48405c;

    static {
        C7189h0 h0Var = new C7189h0();
        f48403d = h0Var;
        h0Var.zzv();
    }

    C7189h0() {
        this(new int[10], 0);
    }

    private final void j(int i10) {
        if (i10 < 0 || i10 >= this.f48405c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private final String k(int i10) {
        int i11 = this.f48405c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    private final void m(int i10, int i11) {
        int i12;
        b();
        if (i10 < 0 || i10 > (i12 = this.f48405c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        int[] iArr = this.f48404b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[(((i12 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f48404b, i10, iArr2, i10 + 1, this.f48405c - i10);
            this.f48404b = iArr2;
        }
        this.f48404b[i10] = i11;
        this.f48405c++;
        this.modCount++;
    }

    public final /* synthetic */ C7201l0 R0(int i10) {
        if (i10 >= this.f48405c) {
            return new C7189h0(Arrays.copyOf(this.f48404b, i10), this.f48405c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        m(i10, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        b();
        C7192i0.a(collection);
        if (!(collection instanceof C7189h0)) {
            return super.addAll(collection);
        }
        C7189h0 h0Var = (C7189h0) collection;
        int i10 = h0Var.f48405c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f48405c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f48404b;
            if (i12 > iArr.length) {
                this.f48404b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(h0Var.f48404b, 0, this.f48404b, this.f48405c, h0Var.f48405c);
            this.f48405c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7189h0)) {
            return super.equals(obj);
        }
        C7189h0 h0Var = (C7189h0) obj;
        if (this.f48405c != h0Var.f48405c) {
            return false;
        }
        int[] iArr = h0Var.f48404b;
        for (int i10 = 0; i10 < this.f48405c; i10++) {
            if (this.f48404b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    public final int getInt(int i10) {
        j(i10);
        return this.f48404b[i10];
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f48405c; i11++) {
            i10 = (i10 * 31) + this.f48404b[i11];
        }
        return i10;
    }

    public final void i(int i10) {
        m(this.f48405c, i10);
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        j(i10);
        int[] iArr = this.f48404b;
        int i11 = iArr[i10];
        int i12 = this.f48405c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, i12 - i10);
        }
        this.f48405c--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            int[] iArr = this.f48404b;
            System.arraycopy(iArr, i11, iArr, i10, this.f48405c - i11);
            this.f48405c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        j(i10);
        int[] iArr = this.f48404b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.f48405c;
    }

    private C7189h0(int[] iArr, int i10) {
        this.f48404b = iArr;
        this.f48405c = i10;
    }

    public final boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f48405c; i10++) {
            if (obj.equals(Integer.valueOf(this.f48404b[i10]))) {
                int[] iArr = this.f48404b;
                System.arraycopy(iArr, i10 + 1, iArr, i10, this.f48405c - i10);
                this.f48405c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
