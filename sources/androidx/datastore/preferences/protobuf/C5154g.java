package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.g  reason: case insensitive filesystem */
public abstract class C5154g implements Iterable<Byte>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final C5154g f21312b = new j(C5172z.f21471d);

    /* renamed from: c  reason: collision with root package name */
    private static final f f21313c = (C5151d.c() ? new k((a) null) : new d((a) null));

    /* renamed from: d  reason: collision with root package name */
    private static final Comparator<C5154g> f21314d = new b();

    /* renamed from: a  reason: collision with root package name */
    private int f21315a = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.g$a */
    class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private int f21316a = 0;

        /* renamed from: b  reason: collision with root package name */
        private final int f21317b;

        a() {
            this.f21317b = C5154g.this.size();
        }

        public byte b() {
            int i10 = this.f21316a;
            if (i10 < this.f21317b) {
                this.f21316a = i10 + 1;
                return C5154g.this.s(i10);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f21316a < this.f21317b;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$b */
    class b implements Comparator<C5154g> {
        b() {
        }

        /* renamed from: a */
        public int compare(C5154g gVar, C5154g gVar2) {
            C0331g t10 = gVar.iterator();
            C0331g t11 = gVar2.iterator();
            while (t10.hasNext() && t11.hasNext()) {
                int compareTo = Integer.valueOf(C5154g.E(t10.b())).compareTo(Integer.valueOf(C5154g.E(t11.b())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(gVar.size()).compareTo(Integer.valueOf(gVar2.size()));
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$c */
    static abstract class c implements C0331g {
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

    /* renamed from: androidx.datastore.preferences.protobuf.g$d */
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

    /* renamed from: androidx.datastore.preferences.protobuf.g$e */
    private static final class e extends j {

        /* renamed from: f  reason: collision with root package name */
        private final int f21319f;

        /* renamed from: g  reason: collision with root package name */
        private final int f21320g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            C5154g.k(i10, i10 + i11, bArr.length);
            this.f21319f = i10;
            this.f21320g = i11;
        }

        /* access modifiers changed from: protected */
        public int K() {
            return this.f21319f;
        }

        public byte i(int i10) {
            C5154g.j(i10, size());
            return this.f21323e[this.f21319f + i10];
        }

        /* access modifiers changed from: protected */
        public void r(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f21323e, K() + i10, bArr, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public byte s(int i10) {
            return this.f21323e[this.f21319f + i10];
        }

        public int size() {
            return this.f21320g;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$g  reason: collision with other inner class name */
    public interface C0331g extends Iterator<Byte> {
        byte b();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$h */
    static final class h {

        /* renamed from: a  reason: collision with root package name */
        private final C5157j f21321a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f21322b;

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public C5154g a() {
            this.f21321a.c();
            return new j(this.f21322b);
        }

        public C5157j b() {
            return this.f21321a;
        }

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f21322b = bArr;
            this.f21321a = C5157j.f0(bArr);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$i */
    static abstract class i extends C5154g {
        /* synthetic */ i(a aVar) {
            this();
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C5154g.super.iterator();
        }

        private i() {
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$j */
    private static class j extends i {

        /* renamed from: e  reason: collision with root package name */
        protected final byte[] f21323e;

        j(byte[] bArr) {
            super((a) null);
            bArr.getClass();
            this.f21323e = bArr;
        }

        /* access modifiers changed from: protected */
        public final int A(int i10, int i11, int i12) {
            return C5172z.h(i10, this.f21323e, K() + i11, i12);
        }

        public final C5154g C(int i10, int i11) {
            int k10 = C5154g.k(i10, i11, size());
            return k10 == 0 ? C5154g.f21312b : new e(this.f21323e, K() + i10, k10);
        }

        /* access modifiers changed from: package-private */
        public final void I(C5153f fVar) {
            fVar.a(this.f21323e, K(), size());
        }

        /* access modifiers changed from: package-private */
        public final boolean J(C5154g gVar, int i10, int i11) {
            if (i11 <= gVar.size()) {
                int i12 = i10 + i11;
                if (i12 > gVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + gVar.size());
                } else if (!(gVar instanceof j)) {
                    return gVar.C(i10, i12).equals(C(0, i11));
                } else {
                    j jVar = (j) gVar;
                    byte[] bArr = this.f21323e;
                    byte[] bArr2 = jVar.f21323e;
                    int K10 = K() + i11;
                    int K11 = K();
                    int K12 = jVar.K() + i10;
                    while (K11 < K10) {
                        if (bArr[K11] != bArr2[K12]) {
                            return false;
                        }
                        K11++;
                        K12++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int K() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C5154g) || size() != ((C5154g) obj).size()) {
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
                return J(jVar, 0, size());
            }
            return false;
        }

        public byte i(int i10) {
            return this.f21323e[i10];
        }

        /* access modifiers changed from: protected */
        public void r(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f21323e, i10, bArr, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public byte s(int i10) {
            return this.f21323e[i10];
        }

        public int size() {
            return this.f21323e.length;
        }

        public final C5155h y() {
            return C5155h.k(this.f21323e, K(), size(), true);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$k */
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

    C5154g() {
    }

    /* access modifiers changed from: private */
    public static int E(byte b10) {
        return b10 & 255;
    }

    private String F() {
        if (size() <= 50) {
            return m0.a(this);
        }
        return m0.a(C(0, 47)) + "...";
    }

    static C5154g G(byte[] bArr) {
        return new j(bArr);
    }

    static C5154g H(byte[] bArr, int i10, int i11) {
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

    public static C5154g m(byte[] bArr) {
        return p(bArr, 0, bArr.length);
    }

    public static C5154g p(byte[] bArr, int i10, int i11) {
        k(i10, i10 + i11, bArr.length);
        return new j(f21313c.a(bArr, i10, i11));
    }

    public static C5154g q(String str) {
        return new j(str.getBytes(C5172z.f21469b));
    }

    static h x(int i10) {
        return new h(i10, (a) null);
    }

    /* access modifiers changed from: protected */
    public abstract int A(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public final int B() {
        return this.f21315a;
    }

    public abstract C5154g C(int i10, int i11);

    public final byte[] D() {
        int size = size();
        if (size == 0) {
            return C5172z.f21471d;
        }
        byte[] bArr = new byte[size];
        r(bArr, 0, 0, size);
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public abstract void I(C5153f fVar);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f21315a;
        if (i10 == 0) {
            int size = size();
            i10 = A(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f21315a = i10;
        }
        return i10;
    }

    public abstract byte i(int i10);

    /* access modifiers changed from: protected */
    public abstract void r(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract byte s(int i10);

    public abstract int size();

    /* renamed from: t */
    public C0331g iterator() {
        return new a();
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), F()});
    }

    public abstract C5155h y();
}
