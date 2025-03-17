package com.google.protobuf;

import com.google.protobuf.C9592z;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.w  reason: case insensitive filesystem */
final class C9589w extends C9570c<Float> implements C9592z.f, RandomAccess, b0 {

    /* renamed from: d  reason: collision with root package name */
    private static final C9589w f69422d = new C9589w(new float[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    private float[] f69423b;

    /* renamed from: c  reason: collision with root package name */
    private int f69424c;

    C9589w() {
        this(new float[10], 0, true);
    }

    private void m(int i10, float f10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f69424c)) {
            throw new IndexOutOfBoundsException(s(i10));
        }
        float[] fArr = this.f69423b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[(((i11 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f69423b, i10, fArr2, i10 + 1, this.f69424c - i10);
            this.f69423b = fArr2;
        }
        this.f69423b[i10] = f10;
        this.f69424c++;
        this.modCount++;
    }

    private void p(int i10) {
        if (i10 < 0 || i10 >= this.f69424c) {
            throw new IndexOutOfBoundsException(s(i10));
        }
    }

    private String s(int i10) {
        return "Index:" + i10 + ", Size:" + this.f69424c;
    }

    public float A(int i10, float f10) {
        b();
        p(i10);
        float[] fArr = this.f69423b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        b();
        C9592z.a(collection);
        if (!(collection instanceof C9589w)) {
            return super.addAll(collection);
        }
        C9589w wVar = (C9589w) collection;
        int i10 = wVar.f69424c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f69424c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f69423b;
            if (i12 > fArr.length) {
                this.f69423b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(wVar.f69423b, 0, this.f69423b, this.f69424c, wVar.f69424c);
            this.f69424c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9589w)) {
            return super.equals(obj);
        }
        C9589w wVar = (C9589w) obj;
        if (this.f69424c != wVar.f69424c) {
            return false;
        }
        float[] fArr = wVar.f69423b;
        for (int i10 = 0; i10 < this.f69424c; i10++) {
            if (Float.floatToIntBits(this.f69423b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f69424c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f69423b[i11]);
        }
        return i10;
    }

    /* renamed from: i */
    public void add(int i10, Float f10) {
        m(i10, f10.floatValue());
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f69423b[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean add(Float f10) {
        k(f10.floatValue());
        return true;
    }

    public void k(float f10) {
        b();
        int i10 = this.f69424c;
        float[] fArr = this.f69423b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[(((i10 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f69423b = fArr2;
        }
        float[] fArr3 = this.f69423b;
        int i11 = this.f69424c;
        this.f69424c = i11 + 1;
        fArr3[i11] = f10;
    }

    /* renamed from: q */
    public Float get(int i10) {
        return Float.valueOf(r(i10));
    }

    public float r(int i10) {
        p(i10);
        return this.f69423b[i10];
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            float[] fArr = this.f69423b;
            System.arraycopy(fArr, i11, fArr, i10, this.f69424c - i11);
            this.f69424c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f69424c;
    }

    /* renamed from: t */
    public C9592z.f f(int i10) {
        if (i10 >= this.f69424c) {
            return new C9589w(Arrays.copyOf(this.f69423b, i10), this.f69424c, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: x */
    public Float remove(int i10) {
        b();
        p(i10);
        float[] fArr = this.f69423b;
        float f10 = fArr[i10];
        int i11 = this.f69424c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f69424c--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    /* renamed from: y */
    public Float set(int i10, Float f10) {
        return Float.valueOf(A(i10, f10.floatValue()));
    }

    private C9589w(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f69423b = fArr;
        this.f69424c = i10;
    }
}
