package com.google.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.h  reason: case insensitive filesystem */
public abstract class C9575h implements Iterable<Byte>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final C9575h f69286b = new j(C9592z.f69432d);

    /* renamed from: c  reason: collision with root package name */
    private static final f f69287c = (C9571d.c() ? new k((a) null) : new d((a) null));

    /* renamed from: d  reason: collision with root package name */
    private static final Comparator<C9575h> f69288d = new b();

    /* renamed from: a  reason: collision with root package name */
    private int f69289a = 0;

    /* renamed from: com.google.protobuf.h$a */
    class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private int f69290a = 0;

        /* renamed from: b  reason: collision with root package name */
        private final int f69291b;

        a() {
            this.f69291b = C9575h.this.size();
        }

        public byte b() {
            int i10 = this.f69290a;
            if (i10 < this.f69291b) {
                this.f69290a = i10 + 1;
                return C9575h.this.r(i10);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f69290a < this.f69291b;
        }
    }

    /* renamed from: com.google.protobuf.h$b */
    class b implements Comparator<C9575h> {
        b() {
        }

        /* renamed from: a */
        public int compare(C9575h hVar, C9575h hVar2) {
            g t10 = hVar.iterator();
            g t11 = hVar2.iterator();
            while (t10.hasNext() && t11.hasNext()) {
                int compareTo = Integer.valueOf(C9575h.D(t10.b())).compareTo(Integer.valueOf(C9575h.D(t11.b())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(hVar.size()).compareTo(Integer.valueOf(hVar2.size()));
        }
    }

    /* renamed from: com.google.protobuf.h$c */
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

    /* renamed from: com.google.protobuf.h$d */
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

    /* renamed from: com.google.protobuf.h$e */
    private static final class e extends j {

        /* renamed from: f  reason: collision with root package name */
        private final int f69293f;

        /* renamed from: g  reason: collision with root package name */
        private final int f69294g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            C9575h.k(i10, i10 + i11, bArr.length);
            this.f69293f = i10;
            this.f69294g = i11;
        }

        /* access modifiers changed from: protected */
        public int M() {
            return this.f69293f;
        }

        public byte i(int i10) {
            C9575h.j(i10, size());
            return this.f69297e[this.f69293f + i10];
        }

        /* access modifiers changed from: package-private */
        public byte r(int i10) {
            return this.f69297e[this.f69293f + i10];
        }

        public int size() {
            return this.f69294g;
        }
    }

    /* renamed from: com.google.protobuf.h$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: com.google.protobuf.h$g */
    public interface g extends Iterator<Byte> {
        byte b();
    }

    /* renamed from: com.google.protobuf.h$h  reason: collision with other inner class name */
    static final class C1193h {

        /* renamed from: a  reason: collision with root package name */
        private final C9578k f69295a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f69296b;

        /* synthetic */ C1193h(int i10, a aVar) {
            this(i10);
        }

        public C9575h a() {
            this.f69295a.c();
            return new j(this.f69296b);
        }

        public C9578k b() {
            return this.f69295a;
        }

        private C1193h(int i10) {
            byte[] bArr = new byte[i10];
            this.f69296b = bArr;
            this.f69295a = C9578k.c0(bArr);
        }
    }

    /* renamed from: com.google.protobuf.h$i */
    static abstract class i extends C9575h {
        i() {
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C9575h.super.iterator();
        }
    }

    /* renamed from: com.google.protobuf.h$j */
    private static class j extends i {

        /* renamed from: e  reason: collision with root package name */
        protected final byte[] f69297e;

        j(byte[] bArr) {
            bArr.getClass();
            this.f69297e = bArr;
        }

        /* access modifiers changed from: protected */
        public final int A(int i10, int i11, int i12) {
            return C9592z.i(i10, this.f69297e, M() + i11, i12);
        }

        public final C9575h C(int i10, int i11) {
            int k10 = C9575h.k(i10, i11, size());
            return k10 == 0 ? C9575h.f69286b : new e(this.f69297e, M() + i10, k10);
        }

        /* access modifiers changed from: protected */
        public final String F(Charset charset) {
            return new String(this.f69297e, M(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        public final void K(C9574g gVar) {
            gVar.a(this.f69297e, M(), size());
        }

        /* access modifiers changed from: package-private */
        public final boolean L(C9575h hVar, int i10, int i11) {
            if (i11 <= hVar.size()) {
                int i12 = i10 + i11;
                if (i12 > hVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + hVar.size());
                } else if (!(hVar instanceof j)) {
                    return hVar.C(i10, i12).equals(C(0, i11));
                } else {
                    j jVar = (j) hVar;
                    byte[] bArr = this.f69297e;
                    byte[] bArr2 = jVar.f69297e;
                    int M10 = M() + i11;
                    int M11 = M();
                    int M12 = jVar.M() + i10;
                    while (M11 < M10) {
                        if (bArr[M11] != bArr2[M12]) {
                            return false;
                        }
                        M11++;
                        M12++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int M() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C9575h) || size() != ((C9575h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int B10 = B();
            int B11 = jVar.B();
            if (B10 == 0 || B11 == 0 || B10 == B11) {
                return L(jVar, 0, size());
            }
            return false;
        }

        public byte i(int i10) {
            return this.f69297e[i10];
        }

        /* access modifiers changed from: package-private */
        public byte r(int i10) {
            return this.f69297e[i10];
        }

        public final boolean s() {
            int M10 = M();
            return t0.n(this.f69297e, M10, size() + M10);
        }

        public int size() {
            return this.f69297e.length;
        }

        public final C9576i y() {
            return C9576i.h(this.f69297e, M(), size(), true);
        }
    }

    /* renamed from: com.google.protobuf.h$k */
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

    C9575h() {
    }

    /* access modifiers changed from: private */
    public static int D(byte b10) {
        return b10 & 255;
    }

    private String H() {
        if (size() <= 50) {
            return m0.a(this);
        }
        return m0.a(C(0, 47)) + "...";
    }

    static C9575h I(byte[] bArr) {
        return new j(bArr);
    }

    static C9575h J(byte[] bArr, int i10, int i11) {
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

    public static C9575h m(byte[] bArr) {
        return p(bArr, 0, bArr.length);
    }

    public static C9575h p(byte[] bArr, int i10, int i11) {
        k(i10, i10 + i11, bArr.length);
        return new j(f69287c.a(bArr, i10, i11));
    }

    public static C9575h q(String str) {
        return new j(str.getBytes(C9592z.f69430b));
    }

    static C1193h x(int i10) {
        return new C1193h(i10, (a) null);
    }

    /* access modifiers changed from: protected */
    public abstract int A(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public final int B() {
        return this.f69289a;
    }

    public abstract C9575h C(int i10, int i11);

    public final String E(Charset charset) {
        return size() == 0 ? "" : F(charset);
    }

    /* access modifiers changed from: protected */
    public abstract String F(Charset charset);

    public final String G() {
        return E(C9592z.f69430b);
    }

    /* access modifiers changed from: package-private */
    public abstract void K(C9574g gVar);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f69289a;
        if (i10 == 0) {
            int size = size();
            i10 = A(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f69289a = i10;
        }
        return i10;
    }

    public abstract byte i(int i10);

    /* access modifiers changed from: package-private */
    public abstract byte r(int i10);

    public abstract boolean s();

    public abstract int size();

    /* renamed from: t */
    public g iterator() {
        return new a();
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), H()});
    }

    public abstract C9576i y();
}
