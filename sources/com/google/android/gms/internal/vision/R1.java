package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.RandomAccess;

final class R1<E> extends C7469b0<E> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final R1<Object> f49264d;

    /* renamed from: b  reason: collision with root package name */
    private E[] f49265b;

    /* renamed from: c  reason: collision with root package name */
    private int f49266c;

    static {
        R1<Object> r12 = new R1<>(new Object[0], 0);
        f49264d = r12;
        r12.zzb();
    }

    private R1(E[] eArr, int i10) {
        this.f49265b = eArr;
        this.f49266c = i10;
    }

    private final void i(int i10) {
        if (i10 < 0 || i10 >= this.f49266c) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    private final String j(int i10) {
        int i11 = this.f49266c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    public static <E> R1<E> k() {
        return f49264d;
    }

    public final boolean add(E e10) {
        b();
        int i10 = this.f49266c;
        E[] eArr = this.f49265b;
        if (i10 == eArr.length) {
            this.f49265b = Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f49265b;
        int i11 = this.f49266c;
        this.f49266c = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }

    public final /* synthetic */ C7466a1 c(int i10) {
        if (i10 >= this.f49266c) {
            return new R1(Arrays.copyOf(this.f49265b, i10), this.f49266c);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i10) {
        i(i10);
        return this.f49265b[i10];
    }

    public final E remove(int i10) {
        b();
        i(i10);
        E[] eArr = this.f49265b;
        E e10 = eArr[i10];
        int i11 = this.f49266c;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f49266c--;
        this.modCount++;
        return e10;
    }

    public final E set(int i10, E e10) {
        b();
        i(i10);
        E[] eArr = this.f49265b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.f49266c;
    }

    public final void add(int i10, E e10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f49266c)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        E[] eArr = this.f49265b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = new Object[(((i11 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f49265b, i10, eArr2, i10 + 1, this.f49266c - i10);
            this.f49265b = eArr2;
        }
        this.f49265b[i10] = e10;
        this.f49266c++;
        this.modCount++;
    }
}
