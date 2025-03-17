package eJ;

import eJ.C17193d;
import java.io.OutputStream;
import java.util.NoSuchElementException;

/* renamed from: eJ.p  reason: case insensitive filesystem */
class C17205p extends C17193d {

    /* renamed from: b  reason: collision with root package name */
    protected final byte[] f143081b;

    /* renamed from: c  reason: collision with root package name */
    private int f143082c = 0;

    /* renamed from: eJ.p$b */
    private class b implements C17193d.a {

        /* renamed from: a  reason: collision with root package name */
        private int f143083a;

        /* renamed from: b  reason: collision with root package name */
        private final int f143084b;

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(b());
        }

        public byte b() {
            try {
                byte[] bArr = C17205p.this.f143081b;
                int i10 = this.f143083a;
                this.f143083a = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        public boolean hasNext() {
            return this.f143083a < this.f143084b;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            this.f143083a = 0;
            this.f143084b = C17205p.this.size();
        }
    }

    C17205p(byte[] bArr) {
        this.f143081b = bArr;
    }

    static int O(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public C17194e A() {
        return C17194e.g(this);
    }

    /* access modifiers changed from: protected */
    public int C(int i10, int i11, int i12) {
        return O(i10, this.f143081b, M() + i11, i12);
    }

    /* access modifiers changed from: protected */
    public int D(int i10, int i11, int i12) {
        int M10 = M() + i11;
        return C17214y.g(i10, this.f143081b, M10, i12 + M10);
    }

    /* access modifiers changed from: protected */
    public int E() {
        return this.f143082c;
    }

    public String G(String str) {
        return new String(this.f143081b, M(), size(), str);
    }

    /* access modifiers changed from: package-private */
    public void J(OutputStream outputStream, int i10, int i11) {
        outputStream.write(this.f143081b, M() + i10, i11);
    }

    public byte K(int i10) {
        return this.f143081b[i10];
    }

    /* access modifiers changed from: package-private */
    public boolean L(C17205p pVar, int i10, int i11) {
        if (i11 > pVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i10 + i11 <= pVar.size()) {
            byte[] bArr = this.f143081b;
            byte[] bArr2 = pVar.f143081b;
            int M10 = M() + i11;
            int M11 = M();
            int M12 = pVar.M() + i10;
            while (M11 < M10) {
                if (bArr[M11] != bArr2[M12]) {
                    return false;
                }
                M11++;
                M12++;
            }
            return true;
        } else {
            int size2 = pVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* access modifiers changed from: protected */
    public int M() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17193d) || size() != ((C17193d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C17205p) {
            return L((C17205p) obj, 0, size());
        }
        if (obj instanceof C17210u) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(valueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int i10 = this.f143082c;
        if (i10 == 0) {
            int size = size();
            i10 = C(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f143082c = i10;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public void r(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f143081b, i10, bArr, i11, i12);
    }

    /* access modifiers changed from: protected */
    public int s() {
        return 0;
    }

    public int size() {
        return this.f143081b.length;
    }

    /* access modifiers changed from: protected */
    public boolean t() {
        return true;
    }

    public boolean x() {
        int M10 = M();
        return C17214y.f(this.f143081b, M10, size() + M10);
    }

    /* renamed from: y */
    public C17193d.a iterator() {
        return new b();
    }
}
