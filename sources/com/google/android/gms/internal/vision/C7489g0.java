package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.g0  reason: case insensitive filesystem */
final class C7489g0 extends C7469b0<Boolean> implements C7466a1<Boolean>, L1, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final C7489g0 f49322d;

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f49323b;

    /* renamed from: c  reason: collision with root package name */
    private int f49324c;

    static {
        C7489g0 g0Var = new C7489g0(new boolean[0], 0);
        f49322d = g0Var;
        g0Var.zzb();
    }

    C7489g0() {
        this(new boolean[10], 0);
    }

    private final void j(int i10) {
        if (i10 < 0 || i10 >= this.f49324c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private final String k(int i10) {
        int i11 = this.f49324c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f49324c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        boolean[] zArr = this.f49323b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[(((i11 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f49323b, i10, zArr2, i10 + 1, this.f49324c - i10);
            this.f49323b = zArr2;
        }
        this.f49323b[i10] = booleanValue;
        this.f49324c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        b();
        U0.d(collection);
        if (!(collection instanceof C7489g0)) {
            return super.addAll(collection);
        }
        C7489g0 g0Var = (C7489g0) collection;
        int i10 = g0Var.f49324c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f49324c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f49323b;
            if (i12 > zArr.length) {
                this.f49323b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(g0Var.f49323b, 0, this.f49323b, this.f49324c, g0Var.f49324c);
            this.f49324c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ C7466a1 c(int i10) {
        if (i10 >= this.f49324c) {
            return new C7489g0(Arrays.copyOf(this.f49323b, i10), this.f49324c);
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
        if (!(obj instanceof C7489g0)) {
            return super.equals(obj);
        }
        C7489g0 g0Var = (C7489g0) obj;
        if (this.f49324c != g0Var.f49324c) {
            return false;
        }
        boolean[] zArr = g0Var.f49323b;
        for (int i10 = 0; i10 < this.f49324c; i10++) {
            if (this.f49323b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        j(i10);
        return Boolean.valueOf(this.f49323b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f49324c; i11++) {
            i10 = (i10 * 31) + U0.c(this.f49323b[i11]);
        }
        return i10;
    }

    public final void i(boolean z10) {
        b();
        int i10 = this.f49324c;
        boolean[] zArr = this.f49323b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i10 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f49323b = zArr2;
        }
        boolean[] zArr3 = this.f49323b;
        int i11 = this.f49324c;
        this.f49324c = i11 + 1;
        zArr3[i11] = z10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f49323b[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        j(i10);
        boolean[] zArr = this.f49323b;
        boolean z10 = zArr[i10];
        int i11 = this.f49324c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f49324c--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            boolean[] zArr = this.f49323b;
            System.arraycopy(zArr, i11, zArr, i10, this.f49324c - i11);
            this.f49324c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        j(i10);
        boolean[] zArr = this.f49323b;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    public final int size() {
        return this.f49324c;
    }

    private C7489g0(boolean[] zArr, int i10) {
        this.f49323b = zArr;
        this.f49324c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        i(((Boolean) obj).booleanValue());
        return true;
    }
}
