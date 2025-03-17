package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

final class J5<E> extends X3<E> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final Object[] f48694d;

    /* renamed from: e  reason: collision with root package name */
    private static final J5<Object> f48695e;

    /* renamed from: b  reason: collision with root package name */
    private E[] f48696b;

    /* renamed from: c  reason: collision with root package name */
    private int f48697c;

    static {
        Object[] objArr = new Object[0];
        f48694d = objArr;
        f48695e = new J5<>(objArr, 0, false);
    }

    J5() {
        this(f48694d, 0, true);
    }

    private static int j(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    public static <E> J5<E> k() {
        return f48695e;
    }

    private final String m(int i10) {
        int i11 = this.f48697c;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void p(int i10) {
        if (i10 < 0 || i10 >= this.f48697c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    public final void add(int i10, E e10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f48697c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        E[] eArr = this.f48696b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = new Object[j(eArr.length)];
            System.arraycopy(this.f48696b, 0, eArr2, 0, i10);
            System.arraycopy(this.f48696b, i10, eArr2, i10 + 1, this.f48697c - i10);
            this.f48696b = eArr2;
        }
        this.f48696b[i10] = e10;
        this.f48697c++;
        this.modCount++;
    }

    public final /* synthetic */ R4 c(int i10) {
        if (i10 >= this.f48697c) {
            return new J5(i10 == 0 ? f48694d : Arrays.copyOf(this.f48696b, i10), this.f48697c, true);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i10) {
        p(i10);
        return this.f48696b[i10];
    }

    /* access modifiers changed from: package-private */
    public final void i(int i10) {
        E[] eArr = this.f48696b;
        if (i10 > eArr.length) {
            if (eArr.length == 0) {
                this.f48696b = new Object[Math.max(i10, 10)];
                return;
            }
            int length = eArr.length;
            while (length < i10) {
                length = j(length);
            }
            this.f48696b = Arrays.copyOf(this.f48696b, length);
        }
    }

    public final E remove(int i10) {
        b();
        p(i10);
        E[] eArr = this.f48696b;
        E e10 = eArr[i10];
        int i11 = this.f48697c;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f48697c--;
        this.modCount++;
        return e10;
    }

    public final E set(int i10, E e10) {
        b();
        p(i10);
        E[] eArr = this.f48696b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.f48697c;
    }

    private J5(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.f48696b = eArr;
        this.f48697c = i10;
    }

    public final boolean add(E e10) {
        b();
        int i10 = this.f48697c;
        E[] eArr = this.f48696b;
        if (i10 == eArr.length) {
            this.f48696b = Arrays.copyOf(this.f48696b, j(eArr.length));
        }
        E[] eArr2 = this.f48696b;
        int i11 = this.f48697c;
        this.f48697c = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }
}
