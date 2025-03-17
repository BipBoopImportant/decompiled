package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.e0  reason: case insensitive filesystem */
final class C7180e0 extends C7223t<Float> implements C7201l0<Float>, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final C7180e0 f48352d;

    /* renamed from: b  reason: collision with root package name */
    private float[] f48353b;

    /* renamed from: c  reason: collision with root package name */
    private int f48354c;

    static {
        C7180e0 e0Var = new C7180e0();
        f48352d = e0Var;
        e0Var.zzv();
    }

    C7180e0() {
        this(new float[10], 0);
    }

    private final void j(int i10, float f10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f48354c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        float[] fArr = this.f48353b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[(((i11 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f48353b, i10, fArr2, i10 + 1, this.f48354c - i10);
            this.f48353b = fArr2;
        }
        this.f48353b[i10] = f10;
        this.f48354c++;
        this.modCount++;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f48354c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private final String m(int i10) {
        int i11 = this.f48354c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    public final /* synthetic */ C7201l0 R0(int i10) {
        if (i10 >= this.f48354c) {
            return new C7180e0(Arrays.copyOf(this.f48353b, i10), this.f48354c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        j(i10, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        b();
        C7192i0.a(collection);
        if (!(collection instanceof C7180e0)) {
            return super.addAll(collection);
        }
        C7180e0 e0Var = (C7180e0) collection;
        int i10 = e0Var.f48354c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f48354c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f48353b;
            if (i12 > fArr.length) {
                this.f48353b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(e0Var.f48353b, 0, this.f48353b, this.f48354c, e0Var.f48354c);
            this.f48354c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7180e0)) {
            return super.equals(obj);
        }
        C7180e0 e0Var = (C7180e0) obj;
        if (this.f48354c != e0Var.f48354c) {
            return false;
        }
        float[] fArr = e0Var.f48353b;
        for (int i10 = 0; i10 < this.f48354c; i10++) {
            if (this.f48353b[i10] != fArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Float.valueOf(this.f48353b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f48354c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f48353b[i11]);
        }
        return i10;
    }

    public final void i(float f10) {
        j(this.f48354c, f10);
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        k(i10);
        float[] fArr = this.f48353b;
        float f10 = fArr[i10];
        int i11 = this.f48354c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, i11 - i10);
        }
        this.f48354c--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            float[] fArr = this.f48353b;
            System.arraycopy(fArr, i11, fArr, i10, this.f48354c - i11);
            this.f48354c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        b();
        k(i10);
        float[] fArr = this.f48353b;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.f48354c;
    }

    private C7180e0(float[] fArr, int i10) {
        this.f48353b = fArr;
        this.f48354c = i10;
    }

    public final boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f48354c; i10++) {
            if (obj.equals(Float.valueOf(this.f48353b[i10]))) {
                float[] fArr = this.f48353b;
                System.arraycopy(fArr, i10 + 1, fArr, i10, this.f48354c - i10);
                this.f48354c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
