package h4;

import java.nio.ByteBuffer;
import java.util.UUID;
import t3.B;
import t3.q;

public final class o {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f51579a;

        /* renamed from: b  reason: collision with root package name */
        public final int f51580b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f51581c;

        /* renamed from: d  reason: collision with root package name */
        public final UUID[] f51582d;

        a(UUID uuid, int i10, byte[] bArr, UUID[] uuidArr) {
            this.f51579a = uuid;
            this.f51580b = i10;
            this.f51581c = bArr;
            this.f51582d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, (UUID[]) null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        B b10 = new B(bArr);
        if (b10.g() < 32) {
            return null;
        }
        b10.W(0);
        int a10 = b10.a();
        int q10 = b10.q();
        if (q10 != a10) {
            q.h("PsshAtomUtil", "Advertised atom size (" + q10 + ") does not match buffer size: " + a10);
            return null;
        }
        int q11 = b10.q();
        if (q11 != 1886614376) {
            q.h("PsshAtomUtil", "Atom type is not pssh: " + q11);
            return null;
        }
        int m10 = C7925b.m(b10.q());
        if (m10 > 1) {
            q.h("PsshAtomUtil", "Unsupported pssh version: " + m10);
            return null;
        }
        UUID uuid = new UUID(b10.A(), b10.A());
        if (m10 == 1) {
            int L10 = b10.L();
            uuidArr = new UUID[L10];
            for (int i10 = 0; i10 < L10; i10++) {
                uuidArr[i10] = new UUID(b10.A(), b10.A());
            }
        } else {
            uuidArr = null;
        }
        int L11 = b10.L();
        int a11 = b10.a();
        if (L11 != a11) {
            q.h("PsshAtomUtil", "Atom data size (" + L11 + ") does not match the bytes left: " + a11);
            return null;
        }
        byte[] bArr2 = new byte[L11];
        b10.l(bArr2, 0, L11);
        return new a(uuid, m10, bArr2, uuidArr);
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        if (uuid.equals(d10.f51579a)) {
            return d10.f51581c;
        }
        q.h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d10.f51579a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        return d10.f51579a;
    }

    public static int g(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return -1;
        }
        return d10.f51580b;
    }
}
