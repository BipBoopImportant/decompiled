package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class V1 implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private Object f48270a;

    /* renamed from: b  reason: collision with root package name */
    private List<Object> f48271b = new ArrayList();

    V1() {
    }

    private final byte[] a() {
        byte[] bArr = new byte[c()];
        b(R1.q(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final V1 clone() {
        Object clone;
        V1 v12 = new V1();
        try {
            List<Object> list = this.f48271b;
            if (list == null) {
                v12.f48271b = null;
            } else {
                v12.f48271b.addAll(list);
            }
            Object obj = this.f48270a;
            if (obj != null) {
                if (obj instanceof X1) {
                    clone = (X1) ((X1) obj).clone();
                } else if (obj instanceof byte[]) {
                    clone = ((byte[]) obj).clone();
                } else {
                    int i10 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length][];
                        v12.f48270a = bArr2;
                        while (i10 < bArr.length) {
                            bArr2[i10] = (byte[]) bArr[i10].clone();
                            i10++;
                        }
                    } else if (obj instanceof boolean[]) {
                        clone = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        clone = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        clone = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        clone = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        clone = ((double[]) obj).clone();
                    } else if (obj instanceof X1[]) {
                        X1[] x1Arr = (X1[]) obj;
                        X1[] x1Arr2 = new X1[x1Arr.length];
                        v12.f48270a = x1Arr2;
                        while (i10 < x1Arr.length) {
                            x1Arr2[i10] = (X1) x1Arr[i10].clone();
                            i10++;
                        }
                    }
                }
                v12.f48270a = clone;
            }
            return v12;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(R1 r12) {
        if (this.f48270a == null) {
            Iterator<Object> it = this.f48271b.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final int c() {
        if (this.f48270a == null) {
            Iterator<Object> it = this.f48271b.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        List<Object> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1)) {
            return false;
        }
        V1 v12 = (V1) obj;
        if (this.f48270a == null || v12.f48270a == null) {
            List<Object> list2 = this.f48271b;
            if (list2 != null && (list = v12.f48271b) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(a(), v12.a());
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            throw null;
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(a()) + 527;
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
