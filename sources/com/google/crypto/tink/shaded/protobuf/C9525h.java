package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h  reason: case insensitive filesystem */
public abstract class C9525h implements Iterable<Byte>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final C9525h f67987b = new j(A.f67909d);

    /* renamed from: c  reason: collision with root package name */
    private static final f f67988c = (C9521d.c() ? new k((a) null) : new d((a) null));

    /* renamed from: d  reason: collision with root package name */
    private static final Comparator<C9525h> f67989d = new b();

    /* renamed from: a  reason: collision with root package name */
    private int f67990a = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$a */
    class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private int f67991a = 0;

        /* renamed from: b  reason: collision with root package name */
        private final int f67992b;

        a() {
            this.f67992b = C9525h.this.size();
        }

        public byte b() {
            int i10 = this.f67991a;
            if (i10 < this.f67992b) {
                this.f67991a = i10 + 1;
                return C9525h.this.s(i10);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f67991a < this.f67992b;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$b */
    class b implements Comparator<C9525h> {
        b() {
        }

        /* renamed from: a */
        public int compare(C9525h hVar, C9525h hVar2) {
            g x10 = hVar.iterator();
            g x11 = hVar2.iterator();
            while (x10.hasNext() && x11.hasNext()) {
                int compareTo = Integer.valueOf(C9525h.F(x10.b())).compareTo(Integer.valueOf(C9525h.F(x11.b())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(hVar.size()).compareTo(Integer.valueOf(hVar2.size()));
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$c */
    static abstract class c implements g {
        c() {
        }

        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(b());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$d */
    private static final class d implements f {
        private d() {
        }

        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$e */
    private static final class e extends j {

        /* renamed from: f  reason: collision with root package name */
        private final int f67994f;

        /* renamed from: g  reason: collision with root package name */
        private final int f67995g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            C9525h.k(i10, i10 + i11, bArr.length);
            this.f67994f = i10;
            this.f67995g = i11;
        }

        /* access modifiers changed from: protected */
        public int P() {
            return this.f67994f;
        }

        public byte i(int i10) {
            C9525h.j(i10, size());
            return this.f67998e[this.f67994f + i10];
        }

        /* access modifiers changed from: protected */
        public void r(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f67998e, P() + i10, bArr, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public byte s(int i10) {
            return this.f67998e[this.f67994f + i10];
        }

        public int size() {
            return this.f67995g;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$g */
    public interface g extends Iterator<Byte> {
        byte b();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$h  reason: collision with other inner class name */
    static final class C1176h {

        /* renamed from: a  reason: collision with root package name */
        private final C9528k f67996a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f67997b;

        /* synthetic */ C1176h(int i10, a aVar) {
            this(i10);
        }

        public C9525h a() {
            this.f67996a.c();
            return new j(this.f67997b);
        }

        public C9528k b() {
            return this.f67996a;
        }

        private C1176h(int i10) {
            byte[] bArr = new byte[i10];
            this.f67997b = bArr;
            this.f67996a = C9528k.c0(bArr);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$i */
    static abstract class i extends C9525h {
        i() {
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C9525h.super.iterator();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$j */
    private static class j extends i {

        /* renamed from: e  reason: collision with root package name */
        protected final byte[] f67998e;

        j(byte[] bArr) {
            bArr.getClass();
            this.f67998e = bArr;
        }

        public final C9526i A() {
            return C9526i.j(this.f67998e, P(), size(), true);
        }

        /* access modifiers changed from: protected */
        public final int B(int i10, int i11, int i12) {
            return A.i(i10, this.f67998e, P() + i11, i12);
        }

        public final C9525h D(int i10, int i11) {
            int k10 = C9525h.k(i10, i11, size());
            return k10 == 0 ? C9525h.f67987b : new e(this.f67998e, P() + i10, k10);
        }

        /* access modifiers changed from: protected */
        public final String H(Charset charset) {
            return new String(this.f67998e, P(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        public final void M(C9524g gVar) {
            gVar.a(this.f67998e, P(), size());
        }

        /* access modifiers changed from: package-private */
        public final boolean O(C9525h hVar, int i10, int i11) {
            if (i11 <= hVar.size()) {
                int i12 = i10 + i11;
                if (i12 > hVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + hVar.size());
                } else if (!(hVar instanceof j)) {
                    return hVar.D(i10, i12).equals(D(0, i11));
                } else {
                    j jVar = (j) hVar;
                    byte[] bArr = this.f67998e;
                    byte[] bArr2 = jVar.f67998e;
                    int P10 = P() + i11;
                    int P11 = P();
                    int P12 = jVar.P() + i10;
                    while (P11 < P10) {
                        if (bArr[P11] != bArr2[P12]) {
                            return false;
                        }
                        P11++;
                        P12++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int P() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C9525h) || size() != ((C9525h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int C10 = C();
            int C11 = jVar.C();
            if (C10 == 0 || C11 == 0 || C10 == C11) {
                return O(jVar, 0, size());
            }
            return false;
        }

        public byte i(int i10) {
            return this.f67998e[i10];
        }

        /* access modifiers changed from: protected */
        public void r(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f67998e, i10, bArr, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public byte s(int i10) {
            return this.f67998e[i10];
        }

        public int size() {
            return this.f67998e.length;
        }

        public final boolean t() {
            int P10 = P();
            return t0.n(this.f67998e, P10, size() + P10);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$k */
    private static final class k implements f {
        private k() {
        }

        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    C9525h() {
    }

    /* access modifiers changed from: private */
    public static int F(byte b10) {
        return b10 & 255;
    }

    private String J() {
        if (size() <= 50) {
            return m0.a(this);
        }
        return m0.a(D(0, 47)) + "...";
    }

    static C9525h K(byte[] bArr) {
        return new j(bArr);
    }

    static C9525h L(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void j(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return;
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
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

    public static C9525h m(byte[] bArr) {
        return p(bArr, 0, bArr.length);
    }

    public static C9525h p(byte[] bArr, int i10, int i11) {
        k(i10, i10 + i11, bArr.length);
        return new j(f67988c.a(bArr, i10, i11));
    }

    public static C9525h q(String str) {
        return new j(str.getBytes(A.f67907b));
    }

    static C1176h y(int i10) {
        return new C1176h(i10, (a) null);
    }

    public abstract C9526i A();

    /* access modifiers changed from: protected */
    public abstract int B(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public final int C() {
        return this.f67990a;
    }

    public abstract C9525h D(int i10, int i11);

    public final byte[] E() {
        int size = size();
        if (size == 0) {
            return A.f67909d;
        }
        byte[] bArr = new byte[size];
        r(bArr, 0, 0, size);
        return bArr;
    }

    public final String G(Charset charset) {
        return size() == 0 ? "" : H(charset);
    }

    /* access modifiers changed from: protected */
    public abstract String H(Charset charset);

    public final String I() {
        return G(A.f67907b);
    }

    /* access modifiers changed from: package-private */
    public abstract void M(C9524g gVar);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f67990a;
        if (i10 == 0) {
            int size = size();
            i10 = B(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f67990a = i10;
        }
        return i10;
    }

    public abstract byte i(int i10);

    /* access modifiers changed from: protected */
    public abstract void r(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract byte s(int i10);

    public abstract int size();

    public abstract boolean t();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), J()});
    }

    /* renamed from: x */
    public g iterator() {
        return new a();
    }
}
