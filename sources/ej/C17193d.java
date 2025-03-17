package eJ;

import com.adjust.sdk.Constants;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.slf4j.Marker;

/* renamed from: eJ.d  reason: case insensitive filesystem */
public abstract class C17193d implements Iterable<Byte> {

    /* renamed from: a  reason: collision with root package name */
    public static final C17193d f143014a = new C17205p(new byte[0]);

    /* renamed from: eJ.d$a */
    public interface a extends Iterator<Byte> {
        byte b();
    }

    C17193d() {
    }

    public static b B() {
        return new b(128);
    }

    private static C17193d b(Iterator<C17193d> it, int i10) {
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return b(it, i11).i(b(it, i10 - i11));
    }

    public static C17193d j(Iterable<C17193d> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            for (C17193d add : iterable) {
                collection.add(add);
            }
        } else {
            collection = (Collection) iterable;
        }
        return collection.isEmpty() ? f143014a : b(collection.iterator(), collection.size());
    }

    public static C17193d k(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public static C17193d m(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C17205p(bArr2);
    }

    public static C17193d p(String str) {
        try {
            return new C17205p(str.getBytes(Constants.ENCODING));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public abstract C17194e A();

    /* access modifiers changed from: protected */
    public abstract int C(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int D(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int E();

    public byte[] F() {
        int size = size();
        if (size == 0) {
            return C17199j.f143069a;
        }
        byte[] bArr = new byte[size];
        r(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String G(String str);

    public String H() {
        try {
            return G(Constants.ENCODING);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void I(OutputStream outputStream, int i10, int i11) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i11 >= 0) {
            int i12 = i10 + i11;
            if (i12 > size()) {
                StringBuilder sb3 = new StringBuilder(39);
                sb3.append("Source end offset exceeded: ");
                sb3.append(i12);
                throw new IndexOutOfBoundsException(sb3.toString());
            } else if (i11 > 0) {
                J(outputStream, i10, i11);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i11);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void J(OutputStream outputStream, int i10, int i11);

    public C17193d i(C17193d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return C17210u.O(this, dVar);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append(Marker.ANY_NON_NULL_MARKER);
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void q(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        } else if (i12 >= 0) {
            int i13 = i10 + i12;
            if (i13 <= size()) {
                int i14 = i11 + i12;
                if (i14 > bArr.length) {
                    StringBuilder sb4 = new StringBuilder(34);
                    sb4.append("Target end offset < 0: ");
                    sb4.append(i14);
                    throw new IndexOutOfBoundsException(sb4.toString());
                } else if (i12 > 0) {
                    r(bArr, i10, i11, i12);
                }
            } else {
                StringBuilder sb5 = new StringBuilder(34);
                sb5.append("Source end offset < 0: ");
                sb5.append(i13);
                throw new IndexOutOfBoundsException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder(23);
            sb6.append("Length < 0: ");
            sb6.append(i12);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    /* access modifiers changed from: protected */
    public abstract void r(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int s();

    public abstract int size();

    /* access modifiers changed from: protected */
    public abstract boolean t();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public abstract boolean x();

    /* renamed from: y */
    public abstract a iterator();

    /* renamed from: eJ.d$b */
    public static final class b extends OutputStream {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f143015f = new byte[0];

        /* renamed from: a  reason: collision with root package name */
        private final int f143016a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<C17193d> f143017b;

        /* renamed from: c  reason: collision with root package name */
        private int f143018c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f143019d;

        /* renamed from: e  reason: collision with root package name */
        private int f143020e;

        b(int i10) {
            if (i10 >= 0) {
                this.f143016a = i10;
                this.f143017b = new ArrayList<>();
                this.f143019d = new byte[i10];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        private byte[] c(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void d(int i10) {
            this.f143017b.add(new C17205p(this.f143019d));
            int length = this.f143018c + this.f143019d.length;
            this.f143018c = length;
            this.f143019d = new byte[Math.max(this.f143016a, Math.max(i10, length >>> 1))];
            this.f143020e = 0;
        }

        private void e() {
            int i10 = this.f143020e;
            byte[] bArr = this.f143019d;
            if (i10 >= bArr.length) {
                this.f143017b.add(new C17205p(this.f143019d));
                this.f143019d = f143015f;
            } else if (i10 > 0) {
                this.f143017b.add(new C17205p(c(bArr, i10)));
            }
            this.f143018c += this.f143020e;
            this.f143020e = 0;
        }

        public synchronized int f() {
            return this.f143018c + this.f143020e;
        }

        public synchronized C17193d g() {
            e();
            return C17193d.j(this.f143017b);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(f())});
        }

        public synchronized void write(int i10) {
            try {
                if (this.f143020e == this.f143019d.length) {
                    d(1);
                }
                byte[] bArr = this.f143019d;
                int i11 = this.f143020e;
                this.f143020e = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }

        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f143019d;
                int length = bArr2.length;
                int i12 = this.f143020e;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f143020e += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    d(i13);
                    System.arraycopy(bArr, i10 + length2, this.f143019d, 0, i13);
                    this.f143020e = i13;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }
}
