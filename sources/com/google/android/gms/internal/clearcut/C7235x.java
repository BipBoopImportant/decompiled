package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.x  reason: case insensitive filesystem */
final class C7235x extends C7223t<Boolean> implements C7201l0<Boolean>, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final C7235x f48513d;

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f48514b;

    /* renamed from: c  reason: collision with root package name */
    private int f48515c;

    static {
        C7235x xVar = new C7235x();
        f48513d = xVar;
        xVar.zzv();
    }

    C7235x() {
        this(new boolean[10], 0);
    }

    private final void j(int i10, boolean z10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f48515c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        boolean[] zArr = this.f48514b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[(((i11 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f48514b, i10, zArr2, i10 + 1, this.f48515c - i10);
            this.f48514b = zArr2;
        }
        this.f48514b[i10] = z10;
        this.f48515c++;
        this.modCount++;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f48515c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private final String m(int i10) {
        int i11 = this.f48515c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    public final /* synthetic */ C7201l0 R0(int i10) {
        if (i10 >= this.f48515c) {
            return new C7235x(Arrays.copyOf(this.f48514b, i10), this.f48515c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        j(i10, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        b();
        C7192i0.a(collection);
        if (!(collection instanceof C7235x)) {
            return super.addAll(collection);
        }
        C7235x xVar = (C7235x) collection;
        int i10 = xVar.f48515c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f48515c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f48514b;
            if (i12 > zArr.length) {
                this.f48514b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(xVar.f48514b, 0, this.f48514b, this.f48515c, xVar.f48515c);
            this.f48515c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7235x)) {
            return super.equals(obj);
        }
        C7235x xVar = (C7235x) obj;
        if (this.f48515c != xVar.f48515c) {
            return false;
        }
        boolean[] zArr = xVar.f48514b;
        for (int i10 = 0; i10 < this.f48515c; i10++) {
            if (this.f48514b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Boolean.valueOf(this.f48514b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f48515c; i11++) {
            i10 = (i10 * 31) + C7192i0.f(this.f48514b[i11]);
        }
        return i10;
    }

    public final void i(boolean z10) {
        j(this.f48515c, z10);
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        k(i10);
        boolean[] zArr = this.f48514b;
        boolean z10 = zArr[i10];
        int i11 = this.f48515c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, i11 - i10);
        }
        this.f48515c--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            boolean[] zArr = this.f48514b;
            System.arraycopy(zArr, i11, zArr, i10, this.f48515c - i11);
            this.f48515c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        k(i10);
        boolean[] zArr = this.f48514b;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    public final int size() {
        return this.f48515c;
    }

    private C7235x(boolean[] zArr, int i10) {
        this.f48514b = zArr;
        this.f48515c = i10;
    }

    public final boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f48515c; i10++) {
            if (obj.equals(Boolean.valueOf(this.f48514b[i10]))) {
                boolean[] zArr = this.f48514b;
                System.arraycopy(zArr, i10 + 1, zArr, i10, this.f48515c - i10);
                this.f48515c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
