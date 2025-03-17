package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.w  reason: case insensitive filesystem */
final class C9539w extends C9520c<Float> implements A.f, RandomAccess, b0 {

    /* renamed from: d  reason: collision with root package name */
    private static final C9539w f68131d;

    /* renamed from: b  reason: collision with root package name */
    private float[] f68132b;

    /* renamed from: c  reason: collision with root package name */
    private int f68133c;

    static {
        C9539w wVar = new C9539w(new float[0], 0);
        f68131d = wVar;
        wVar.o();
    }

    C9539w() {
        this(new float[10], 0);
    }

    private void m(int i10, float f10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f68133c)) {
            throw new IndexOutOfBoundsException(s(i10));
        }
        float[] fArr = this.f68132b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[(((i11 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f68132b, i10, fArr2, i10 + 1, this.f68133c - i10);
            this.f68132b = fArr2;
        }
        this.f68132b[i10] = f10;
        this.f68133c++;
        this.modCount++;
    }

    private void p(int i10) {
        if (i10 < 0 || i10 >= this.f68133c) {
            throw new IndexOutOfBoundsException(s(i10));
        }
    }

    private String s(int i10) {
        return "Index:" + i10 + ", Size:" + this.f68133c;
    }

    public float A(int i10, float f10) {
        b();
        p(i10);
        float[] fArr = this.f68132b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        b();
        A.a(collection);
        if (!(collection instanceof C9539w)) {
            return super.addAll(collection);
        }
        C9539w wVar = (C9539w) collection;
        int i10 = wVar.f68133c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f68133c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f68132b;
            if (i12 > fArr.length) {
                this.f68132b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(wVar.f68132b, 0, this.f68132b, this.f68133c, wVar.f68133c);
            this.f68133c = i12;
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
        if (!(obj instanceof C9539w)) {
            return super.equals(obj);
        }
        C9539w wVar = (C9539w) obj;
        if (this.f68133c != wVar.f68133c) {
            return false;
        }
        float[] fArr = wVar.f68132b;
        for (int i10 = 0; i10 < this.f68133c; i10++) {
            if (Float.floatToIntBits(this.f68132b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f68133c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f68132b[i11]);
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
            if (this.f68132b[i10] == floatValue) {
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
        int i10 = this.f68133c;
        float[] fArr = this.f68132b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[(((i10 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f68132b = fArr2;
        }
        float[] fArr3 = this.f68132b;
        int i11 = this.f68133c;
        this.f68133c = i11 + 1;
        fArr3[i11] = f10;
    }

    /* renamed from: q */
    public Float get(int i10) {
        return Float.valueOf(r(i10));
    }

    public float r(int i10) {
        p(i10);
        return this.f68132b[i10];
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            float[] fArr = this.f68132b;
            System.arraycopy(fArr, i11, fArr, i10, this.f68133c - i11);
            this.f68133c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f68133c;
    }

    /* renamed from: t */
    public A.f f(int i10) {
        if (i10 >= this.f68133c) {
            return new C9539w(Arrays.copyOf(this.f68132b, i10), this.f68133c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: x */
    public Float remove(int i10) {
        b();
        p(i10);
        float[] fArr = this.f68132b;
        float f10 = fArr[i10];
        int i11 = this.f68133c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f68133c--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    /* renamed from: y */
    public Float set(int i10, Float f10) {
        return Float.valueOf(A(i10, f10.floatValue()));
    }

    private C9539w(float[] fArr, int i10) {
        this.f68132b = fArr;
        this.f68133c = i10;
    }
}
