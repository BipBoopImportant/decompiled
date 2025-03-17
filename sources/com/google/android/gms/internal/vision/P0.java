package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class P0 extends C7469b0<Float> implements C7466a1<Float>, L1, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final P0 f49239d;

    /* renamed from: b  reason: collision with root package name */
    private float[] f49240b;

    /* renamed from: c  reason: collision with root package name */
    private int f49241c;

    static {
        P0 p02 = new P0(new float[0], 0);
        f49239d = p02;
        p02.zzb();
    }

    P0() {
        this(new float[10], 0);
    }

    private final void j(int i10) {
        if (i10 < 0 || i10 >= this.f49241c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private final String k(int i10) {
        int i11 = this.f49241c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f49241c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        float[] fArr = this.f49240b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[(((i11 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f49240b, i10, fArr2, i10 + 1, this.f49241c - i10);
            this.f49240b = fArr2;
        }
        this.f49240b[i10] = floatValue;
        this.f49241c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        b();
        U0.d(collection);
        if (!(collection instanceof P0)) {
            return super.addAll(collection);
        }
        P0 p02 = (P0) collection;
        int i10 = p02.f49241c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f49241c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f49240b;
            if (i12 > fArr.length) {
                this.f49240b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(p02.f49240b, 0, this.f49240b, this.f49241c, p02.f49241c);
            this.f49241c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ C7466a1 c(int i10) {
        if (i10 >= this.f49241c) {
            return new P0(Arrays.copyOf(this.f49240b, i10), this.f49241c);
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
        if (!(obj instanceof P0)) {
            return super.equals(obj);
        }
        P0 p02 = (P0) obj;
        if (this.f49241c != p02.f49241c) {
            return false;
        }
        float[] fArr = p02.f49240b;
        for (int i10 = 0; i10 < this.f49241c; i10++) {
            if (Float.floatToIntBits(this.f49240b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        j(i10);
        return Float.valueOf(this.f49240b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f49241c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f49240b[i11]);
        }
        return i10;
    }

    public final void i(float f10) {
        b();
        int i10 = this.f49241c;
        float[] fArr = this.f49240b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[(((i10 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f49240b = fArr2;
        }
        float[] fArr3 = this.f49240b;
        int i11 = this.f49241c;
        this.f49241c = i11 + 1;
        fArr3[i11] = f10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f49240b[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        j(i10);
        float[] fArr = this.f49240b;
        float f10 = fArr[i10];
        int i11 = this.f49241c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f49241c--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            float[] fArr = this.f49240b;
            System.arraycopy(fArr, i11, fArr, i10, this.f49241c - i11);
            this.f49241c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        b();
        j(i10);
        float[] fArr = this.f49240b;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.f49241c;
    }

    private P0(float[] fArr, int i10) {
        this.f49240b = fArr;
        this.f49241c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        i(((Float) obj).floatValue());
        return true;
    }
}
