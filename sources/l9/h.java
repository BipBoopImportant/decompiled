package l9;

import j9.c;
import java.util.Arrays;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final c f54891a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f54892b;

    public h(c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f54891a = cVar;
            this.f54892b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public byte[] a() {
        return this.f54892b;
    }

    public c b() {
        return this.f54891a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f54891a.equals(hVar.f54891a)) {
            return false;
        }
        return Arrays.equals(this.f54892b, hVar.f54892b);
    }

    public int hashCode() {
        return ((this.f54891a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f54892b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f54891a + ", bytes=[...]}";
    }
}
