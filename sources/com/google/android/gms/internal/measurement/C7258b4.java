package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.b4  reason: case insensitive filesystem */
final class C7258b4 extends X3<Boolean> implements R4<Boolean>, D5, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final boolean[] f48864d;

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f48865b;

    /* renamed from: c  reason: collision with root package name */
    private int f48866c;

    static {
        boolean[] zArr = new boolean[0];
        f48864d = zArr;
        new C7258b4(zArr, 0, false);
    }

    C7258b4() {
        this(f48864d, 0, true);
    }

    private static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String m(int i10) {
        int i11 = this.f48866c;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void p(int i10) {
        if (i10 < 0 || i10 >= this.f48866c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f48866c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        boolean[] zArr = this.f48865b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[k(zArr.length)];
            System.arraycopy(this.f48865b, 0, zArr2, 0, i10);
            System.arraycopy(this.f48865b, i10, zArr2, i10 + 1, this.f48866c - i10);
            this.f48865b = zArr2;
        }
        this.f48865b[i10] = booleanValue;
        this.f48866c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        b();
        O4.e(collection);
        if (!(collection instanceof C7258b4)) {
            return super.addAll(collection);
        }
        C7258b4 b4Var = (C7258b4) collection;
        int i10 = b4Var.f48866c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f48866c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f48865b;
            if (i12 > zArr.length) {
                this.f48865b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(b4Var.f48865b, 0, this.f48865b, this.f48866c, b4Var.f48866c);
            this.f48866c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ R4 c(int i10) {
        if (i10 >= this.f48866c) {
            return new C7258b4(i10 == 0 ? f48864d : Arrays.copyOf(this.f48865b, i10), this.f48866c, true);
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
        if (!(obj instanceof C7258b4)) {
            return super.equals(obj);
        }
        C7258b4 b4Var = (C7258b4) obj;
        if (this.f48866c != b4Var.f48866c) {
            return false;
        }
        boolean[] zArr = b4Var.f48865b;
        for (int i10 = 0; i10 < this.f48866c; i10++) {
            if (this.f48865b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        return Boolean.valueOf(j(i10));
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f48866c; i11++) {
            i10 = (i10 * 31) + O4.c(this.f48865b[i11]);
        }
        return i10;
    }

    public final void i(boolean z10) {
        b();
        int i10 = this.f48866c;
        boolean[] zArr = this.f48865b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[k(zArr.length)];
            System.arraycopy(this.f48865b, 0, zArr2, 0, this.f48866c);
            this.f48865b = zArr2;
        }
        boolean[] zArr3 = this.f48865b;
        int i11 = this.f48866c;
        this.f48866c = i11 + 1;
        zArr3[i11] = z10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f48865b[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean j(int i10) {
        p(i10);
        return this.f48865b[i10];
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        p(i10);
        boolean[] zArr = this.f48865b;
        boolean z10 = zArr[i10];
        int i11 = this.f48866c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f48866c--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            boolean[] zArr = this.f48865b;
            System.arraycopy(zArr, i11, zArr, i10, this.f48866c - i11);
            this.f48866c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        p(i10);
        boolean[] zArr = this.f48865b;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    public final int size() {
        return this.f48866c;
    }

    private C7258b4(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f48865b = zArr;
        this.f48866c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        i(((Boolean) obj).booleanValue());
        return true;
    }
}
