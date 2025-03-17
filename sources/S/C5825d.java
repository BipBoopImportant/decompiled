package s;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: s.d  reason: case insensitive filesystem */
final class C5825d {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f28700a;

    /* renamed from: b  reason: collision with root package name */
    private String f28701b;

    /* renamed from: c  reason: collision with root package name */
    private List<byte[]> f28702c;

    private C5825d(byte[] bArr, String str, List<byte[]> list) {
        this.f28700a = bArr;
        this.f28701b = str;
        this.f28702c = new ArrayList(list.size());
        for (byte[] next : list) {
            this.f28702c.add(Arrays.copyOf(next, next.length));
        }
    }

    /* access modifiers changed from: private */
    public static int b(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i10 = 0; i10 < Math.min(bArr.length, bArr2.length); i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return 0;
    }

    static C5825d c(String str, List<byte[]> list) {
        return new C5825d(d(str, list), str, list);
    }

    private static byte[] d(String str, List<byte[]> list) {
        Collections.sort(list, new C5824c());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] next : list) {
            dataOutputStream.writeInt(next.length);
            dataOutputStream.write(next);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] e() {
        byte[] bArr = this.f28700a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5825d.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f28700a, ((C5825d) obj).f28700a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f28700a);
    }
}
