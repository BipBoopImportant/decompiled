package B3;

import java.nio.ByteBuffer;
import r3.b;
import r3.d;
import t3.N;

final class b0 extends d {

    /* renamed from: i  reason: collision with root package name */
    private static final int f33031i = Float.floatToIntBits(Float.NaN);

    b0() {
    }

    private static void n(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (floatToIntBits == f33031i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public void e(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f28650b.f28647c;
        if (i11 == 21) {
            byteBuffer2 = m((i10 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i11 == 22) {
            byteBuffer2 = m(i10);
            while (position < limit) {
                n((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else if (i11 == 1342177280) {
            byteBuffer2 = m((i10 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i11 == 1610612736) {
            byteBuffer2 = m(i10);
            while (position < limit) {
                n((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public b.a i(b.a aVar) {
        int i10 = aVar.f28647c;
        if (N.D0(i10)) {
            return i10 != 4 ? new b.a(aVar.f28645a, aVar.f28646b, 4) : b.a.f28644e;
        }
        throw new b.C0454b(aVar);
    }
}
