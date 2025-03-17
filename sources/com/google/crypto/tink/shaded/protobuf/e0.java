package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

final class e0<E> extends C9520c<E> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final e0<Object> f67977d;

    /* renamed from: b  reason: collision with root package name */
    private E[] f67978b;

    /* renamed from: c  reason: collision with root package name */
    private int f67979c;

    static {
        e0<Object> e0Var = new e0<>(new Object[0], 0);
        f67977d = e0Var;
        e0Var.o();
    }

    private e0(E[] eArr, int i10) {
        this.f67978b = eArr;
        this.f67979c = i10;
    }

    private static <E> E[] i(int i10) {
        return new Object[i10];
    }

    public static <E> e0<E> j() {
        return f67977d;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f67979c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f67979c;
    }

    public boolean add(E e10) {
        b();
        int i10 = this.f67979c;
        E[] eArr = this.f67978b;
        if (i10 == eArr.length) {
            this.f67978b = Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f67978b;
        int i11 = this.f67979c;
        this.f67979c = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }

    public E get(int i10) {
        k(i10);
        return this.f67978b[i10];
    }

    /* renamed from: p */
    public e0<E> f(int i10) {
        if (i10 >= this.f67979c) {
            return new e0<>(Arrays.copyOf(this.f67978b, i10), this.f67979c);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i10) {
        b();
        k(i10);
        E[] eArr = this.f67978b;
        E e10 = eArr[i10];
        int i11 = this.f67979c;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f67979c--;
        this.modCount++;
        return e10;
    }

    public E set(int i10, E e10) {
        b();
        k(i10);
        E[] eArr = this.f67978b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public int size() {
        return this.f67979c;
    }

    public void add(int i10, E e10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f67979c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        E[] eArr = this.f67978b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] i12 = i(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f67978b, 0, i12, 0, i10);
            System.arraycopy(this.f67978b, i10, i12, i10 + 1, this.f67979c - i10);
            this.f67978b = i12;
        }
        this.f67978b[i10] = e10;
        this.f67979c++;
        this.modCount++;
    }
}
