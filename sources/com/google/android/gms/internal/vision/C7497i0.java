package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.vision.i0  reason: case insensitive filesystem */
public abstract class C7497i0 implements Serializable, Iterable<Byte> {

    /* renamed from: b  reason: collision with root package name */
    public static final C7497i0 f49335b = new C7535t0(U0.f49278c);

    /* renamed from: c  reason: collision with root package name */
    private static final C7521o0 f49336c = (C7465a0.b() ? new C7532s0((C7493h0) null) : new C7513m0((C7493h0) null));

    /* renamed from: d  reason: collision with root package name */
    private static final Comparator<C7497i0> f49337d = new C7505k0();

    /* renamed from: a  reason: collision with root package name */
    private int f49338a = 0;

    C7497i0() {
    }

    static C7529r0 B(int i10) {
        return new C7529r0(i10, (C7493h0) null);
    }

    public static C7497i0 p(String str) {
        return new C7535t0(str.getBytes(U0.f49276a));
    }

    public static C7497i0 q(byte[] bArr, int i10, int i11) {
        y(i10, i10 + i11, bArr.length);
        return new C7535t0(f49336c.a(bArr, i10, i11));
    }

    /* access modifiers changed from: private */
    public static int x(byte b10) {
        return b10 & 255;
    }

    static int y(int i10, int i11, int i12) {
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

    public final String A() {
        return i() == 0 ? "" : r(U0.f49276a);
    }

    /* access modifiers changed from: protected */
    public final int C() {
        return this.f49338a;
    }

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f49338a;
        if (i10 == 0) {
            int i11 = i();
            i10 = k(i11, 0, i11);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f49338a = i10;
        }
        return i10;
    }

    public abstract int i();

    public /* synthetic */ Iterator iterator() {
        return new C7493h0(this);
    }

    /* access modifiers changed from: protected */
    public abstract int k(int i10, int i11, int i12);

    public abstract C7497i0 m(int i10, int i11);

    /* access modifiers changed from: protected */
    public abstract String r(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void s(C7485f0 f0Var);

    /* access modifiers changed from: package-private */
    public abstract byte t(int i10);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(i()), i() <= 50 ? C7487f2.a(this) : String.valueOf(C7487f2.a(m(0, 47))).concat("...")});
    }

    public abstract boolean zzc();
}
