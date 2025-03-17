package B3;

import N3.C6662H;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import nb.C10079i;
import r3.b;
import t3.C5950a;
import t3.N;
import y3.f;

public final class Y {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f33012d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f33013e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f33014a = b.f28643a;

    /* renamed from: b  reason: collision with root package name */
    private int f33015b = 2;

    /* renamed from: c  reason: collision with root package name */
    private int f33016c = 0;

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i10;
        ByteBuffer byteBuffer2 = byteBuffer;
        byte[] bArr2 = bArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i11 = limit - position;
        int i12 = (i11 + 255) / 255;
        int i13 = i12 + 27 + i11;
        if (this.f33015b == 2) {
            int length = bArr2 != null ? bArr2.length + 28 : f33012d.length;
            i13 += f33013e.length + length;
            i10 = length;
        } else {
            i10 = 0;
        }
        ByteBuffer c10 = c(i13);
        if (this.f33015b == 2) {
            if (bArr2 != null) {
                e(c10, bArr2);
            } else {
                c10.put(f33012d);
            }
            c10.put(f33013e);
        }
        int j10 = this.f33016c + C6662H.j(byteBuffer);
        this.f33016c = j10;
        ByteBuffer byteBuffer3 = c10;
        f(c10, (long) j10, this.f33015b, i12, false);
        for (int i14 = 0; i14 < i12; i14++) {
            if (i11 >= 255) {
                byteBuffer3.put((byte) -1);
                i11 -= 255;
            } else {
                byteBuffer3.put((byte) i11);
                i11 = 0;
            }
        }
        while (position < limit) {
            byteBuffer3.put(byteBuffer2.get(position));
            position++;
        }
        byteBuffer2.position(byteBuffer.limit());
        byteBuffer3.flip();
        if (this.f33015b == 2) {
            byte[] array = byteBuffer3.array();
            byte[] bArr3 = f33013e;
            byteBuffer3.putInt(i10 + bArr3.length + 22, N.x(array, byteBuffer3.arrayOffset() + i10 + bArr3.length, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, N.x(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.f33015b++;
        return byteBuffer3;
    }

    private ByteBuffer c(int i10) {
        if (this.f33014a.capacity() < i10) {
            this.f33014a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f33014a.clear();
        }
        return this.f33014a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0, 0, 1, true);
        byteBuffer.put(C10079i.a((long) bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, N.x(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void f(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z10 ? (byte) 2 : 0);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(C10079i.a((long) i11));
    }

    public void a(f fVar, List<byte[]> list) {
        C5950a.e(fVar.f32279d);
        if (fVar.f32279d.limit() - fVar.f32279d.position() != 0) {
            this.f33014a = b(fVar.f32279d, (this.f33015b == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
            fVar.v();
            fVar.K(this.f33014a.remaining());
            fVar.f32279d.put(this.f33014a);
            fVar.L();
        }
    }

    public void d() {
        this.f33014a = b.f28643a;
        this.f33016c = 0;
        this.f33015b = 2;
    }
}
