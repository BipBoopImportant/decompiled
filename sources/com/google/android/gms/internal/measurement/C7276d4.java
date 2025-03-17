package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.d4  reason: case insensitive filesystem */
public abstract class C7276d4 implements Serializable, Iterable<Byte> {

    /* renamed from: b  reason: collision with root package name */
    public static final C7276d4 f48892b = new C7348l4(O4.f48770b);

    /* renamed from: c  reason: collision with root package name */
    private static final C7312h4 f48893c = new C7374o4();

    /* renamed from: a  reason: collision with root package name */
    private int f48894a = 0;

    static {
        new C7303g4();
    }

    C7276d4() {
    }

    static C7330j4 A(int i10) {
        return new C7330j4(i10);
    }

    static /* synthetic */ int j(byte b10) {
        return b10 & 255;
    }

    static int k(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
        }
    }

    public static C7276d4 p(String str) {
        return new C7348l4(str.getBytes(O4.f48769a));
    }

    public static C7276d4 q(byte[] bArr) {
        return r(bArr, 0, bArr.length);
    }

    public static C7276d4 r(byte[] bArr, int i10, int i11) {
        k(i10, i10 + i11, bArr.length);
        return new C7348l4(f48893c.a(bArr, i10, i11));
    }

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f48894a;
        if (i10 == 0) {
            int x10 = x();
            i10 = y(x10, 0, x10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f48894a = i10;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public final int i() {
        return this.f48894a;
    }

    public /* synthetic */ Iterator iterator() {
        return new C7267c4(this);
    }

    public abstract C7276d4 m(int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract void s(C7249a4 a4Var);

    /* access modifiers changed from: package-private */
    public abstract byte t(int i10);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(x());
        if (x() <= 50) {
            str = V5.a(this);
        } else {
            str = V5.a(m(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{hexString, valueOf, str});
    }

    public abstract int x();

    /* access modifiers changed from: protected */
    public abstract int y(int i10, int i11, int i12);
}
