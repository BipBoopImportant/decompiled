package a9;

import D8.c;
import HJ.C15838d;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.i2  reason: case insensitive filesystem */
public final class C6848i2 {

    /* renamed from: c  reason: collision with root package name */
    public static final c f42607c = new c("StoredBatch");

    /* renamed from: a  reason: collision with root package name */
    public final String f42608a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f42609b;

    /* renamed from: a9.i2$a */
    public static final class a {
        public static int a(byte[] bArr, int i10) {
            C17542s.j(bArr, "bytes");
            return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
        }

        public static String b(byte[] bArr, int i10) {
            C17542s.j(bArr, "bytes");
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 8, bArr2, 0, i10);
            return new String(bArr2, C15838d.f135279b);
        }
    }

    public C6848i2(String str, byte[] bArr) {
        C17542s.j(str, "batchUrl");
        C17542s.j(bArr, "data");
        this.f42608a = str;
        this.f42609b = bArr;
    }

    public final byte[] a() {
        byte[] bytes = this.f42608a.getBytes(C15838d.f135279b);
        C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        int length2 = this.f42609b.length;
        int i10 = length + 12;
        byte[] bArr = new byte[(i10 + length2)];
        System.arraycopy(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1}, 0, bArr, 0, 4);
        System.arraycopy(new byte[]{(byte) (length >> 24), (byte) (length >> 16), (byte) (length >> 8), (byte) length}, 0, bArr, 4, 4);
        System.arraycopy(bytes, 0, bArr, 8, length);
        System.arraycopy(new byte[]{(byte) (length2 >> 24), (byte) (length2 >> 16), (byte) (length2 >> 8), (byte) length2}, 0, bArr, length + 8, 4);
        System.arraycopy(this.f42609b, 0, bArr, i10, length2);
        return bArr;
    }
}
