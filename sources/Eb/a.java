package Eb;

import Db.k;
import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f60176a;

    private a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f60176a = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static a b(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            return new a(bArr, i10, i11);
        }
        throw new NullPointerException("data must be non-null");
    }

    public int c() {
        return this.f60176a.length;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Arrays.equals(((a) obj).f60176a, this.f60176a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f60176a);
    }

    public String toString() {
        return "Bytes(" + k.b(this.f60176a) + ")";
    }
}
