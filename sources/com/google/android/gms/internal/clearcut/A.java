package com.google.android.gms.internal.clearcut;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class A implements Serializable, Iterable<Byte> {

    /* renamed from: b  reason: collision with root package name */
    public static final A f48133b = new H(C7192i0.f48410c);

    /* renamed from: c  reason: collision with root package name */
    private static final E f48134c = (C7226u.b() ? new I((B) null) : new C((B) null));

    /* renamed from: a  reason: collision with root package name */
    private int f48135a = 0;

    A() {
    }

    static int q(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder(37);
            sb4.append("End index: ");
            sb4.append(i11);
            sb4.append(" >= ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public static A r(byte[] bArr, int i10, int i11) {
        return new H(f48134c.a(bArr, i10, i11));
    }

    public static A s(String str) {
        return new H(str.getBytes(C7192i0.f48408a));
    }

    static F x(int i10) {
        return new F(i10, (B) null);
    }

    /* access modifiers changed from: protected */
    public abstract int b(int i10, int i11, int i12);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f48135a;
        if (i10 == 0) {
            int size = size();
            i10 = b(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f48135a = i10;
        }
        return i10;
    }

    public abstract A i(int i10, int i11);

    public /* synthetic */ Iterator iterator() {
        return new B(this);
    }

    /* access modifiers changed from: protected */
    public abstract String j(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void k(C7241z zVar);

    public abstract boolean m();

    /* access modifiers changed from: protected */
    public final int p() {
        return this.f48135a;
    }

    public abstract int size();

    public abstract byte t(int i10);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public final String y() {
        return size() == 0 ? "" : j(C7192i0.f48408a);
    }
}
