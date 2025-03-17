package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class H4 extends X3<Float> implements R4<Float>, D5, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final float[] f48671d;

    /* renamed from: b  reason: collision with root package name */
    private float[] f48672b;

    /* renamed from: c  reason: collision with root package name */
    private int f48673c;

    static {
        float[] fArr = new float[0];
        f48671d = fArr;
        new H4(fArr, 0, false);
    }

    H4() {
        this(f48671d, 0, true);
    }

    private static int m(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String p(int i10) {
        int i11 = this.f48673c;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void q(int i10) {
        if (i10 < 0 || i10 >= this.f48673c) {
            throw new IndexOutOfBoundsException(p(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f48673c)) {
            throw new IndexOutOfBoundsException(p(i10));
        }
        float[] fArr = this.f48672b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[m(fArr.length)];
            System.arraycopy(this.f48672b, 0, fArr2, 0, i10);
            System.arraycopy(this.f48672b, i10, fArr2, i10 + 1, this.f48673c - i10);
            this.f48672b = fArr2;
        }
        this.f48672b[i10] = floatValue;
        this.f48673c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        b();
        O4.e(collection);
        if (!(collection instanceof H4)) {
            return super.addAll(collection);
        }
        H4 h42 = (H4) collection;
        int i10 = h42.f48673c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f48673c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f48672b;
            if (i12 > fArr.length) {
                this.f48672b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(h42.f48672b, 0, this.f48672b, this.f48673c, h42.f48673c);
            this.f48673c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ R4 c(int i10) {
        if (i10 >= this.f48673c) {
            return new H4(i10 == 0 ? f48671d : Arrays.copyOf(this.f48672b, i10), this.f48673c, true);
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
        if (!(obj instanceof H4)) {
            return super.equals(obj);
        }
        H4 h42 = (H4) obj;
        if (this.f48673c != h42.f48673c) {
            return false;
        }
        float[] fArr = h42.f48672b;
        for (int i10 = 0; i10 < this.f48673c; i10++) {
            if (Float.floatToIntBits(this.f48672b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        return Float.valueOf(j(i10));
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f48673c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f48672b[i11]);
        }
        return i10;
    }

    public final void i(float f10) {
        b();
        int i10 = this.f48673c;
        float[] fArr = this.f48672b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[m(fArr.length)];
            System.arraycopy(this.f48672b, 0, fArr2, 0, this.f48673c);
            this.f48672b = fArr2;
        }
        float[] fArr3 = this.f48672b;
        int i11 = this.f48673c;
        this.f48673c = i11 + 1;
        fArr3[i11] = f10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f48672b[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    public final float j(int i10) {
        q(i10);
        return this.f48672b[i10];
    }

    /* access modifiers changed from: package-private */
    public final void k(int i10) {
        float[] fArr = this.f48672b;
        if (i10 > fArr.length) {
            if (fArr.length == 0) {
                this.f48672b = new float[Math.max(i10, 10)];
                return;
            }
            int length = fArr.length;
            while (length < i10) {
                length = m(length);
            }
            this.f48672b = Arrays.copyOf(this.f48672b, length);
        }
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        q(i10);
        float[] fArr = this.f48672b;
        float f10 = fArr[i10];
        int i11 = this.f48673c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f48673c--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            float[] fArr = this.f48672b;
            System.arraycopy(fArr, i11, fArr, i10, this.f48673c - i11);
            this.f48673c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        b();
        q(i10);
        float[] fArr = this.f48672b;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.f48673c;
    }

    private H4(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f48672b = fArr;
        this.f48673c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        i(((Float) obj).floatValue());
        return true;
    }
}
