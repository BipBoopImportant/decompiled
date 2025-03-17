package eJ;

import eJ.C17193d;
import java.util.NoSuchElementException;
import org.slf4j.Marker;

/* renamed from: eJ.c  reason: case insensitive filesystem */
class C17192c extends C17205p {

    /* renamed from: d  reason: collision with root package name */
    private final int f143009d;

    /* renamed from: e  reason: collision with root package name */
    private final int f143010e;

    /* renamed from: eJ.c$b */
    private class b implements C17193d.a {

        /* renamed from: a  reason: collision with root package name */
        private int f143011a;

        /* renamed from: b  reason: collision with root package name */
        private final int f143012b;

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(b());
        }

        public byte b() {
            int i10 = this.f143011a;
            if (i10 < this.f143012b) {
                byte[] bArr = C17192c.this.f143081b;
                this.f143011a = i10 + 1;
                return bArr[i10];
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f143011a < this.f143012b;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int M10 = C17192c.this.M();
            this.f143011a = M10;
            this.f143012b = M10 + C17192c.this.size();
        }
    }

    C17192c(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        } else if (((long) i10) + ((long) i11) <= ((long) bArr.length)) {
            this.f143009d = i10;
            this.f143010e = i11;
        } else {
            StringBuilder sb4 = new StringBuilder(48);
            sb4.append("Offset+Length too large: ");
            sb4.append(i10);
            sb4.append(Marker.ANY_NON_NULL_MARKER);
            sb4.append(i11);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public byte K(int i10) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Index too small: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        } else if (i10 < size()) {
            return this.f143081b[this.f143009d + i10];
        } else {
            int size = size();
            StringBuilder sb3 = new StringBuilder(41);
            sb3.append("Index too large: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(size);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
    }

    /* access modifiers changed from: protected */
    public int M() {
        return this.f143009d;
    }

    /* access modifiers changed from: protected */
    public void r(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f143081b, M() + i10, bArr, i11, i12);
    }

    public int size() {
        return this.f143010e;
    }

    /* renamed from: y */
    public C17193d.a iterator() {
        return new b();
    }
}
