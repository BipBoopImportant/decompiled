package B3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import t3.N;

public final class Z {
    public static ByteBuffer a(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
        int position = byteBuffer.position();
        while (byteBuffer.hasRemaining() && i12 < i13) {
            c(order, (int) ((((long) b(byteBuffer, i10)) * ((long) i12)) / ((long) i13)), i10);
            if (byteBuffer.position() == position + i11) {
                i12++;
                position = byteBuffer.position();
            }
        }
        order.put(byteBuffer);
        order.flip();
        return order;
    }

    public static int b(ByteBuffer byteBuffer, int i10) {
        if (i10 == 2) {
            return ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
        } else if (i10 == 3) {
            return (byteBuffer.get() & 255) << 24;
        } else {
            if (i10 == 4) {
                float o10 = N.o(byteBuffer.getFloat(), -1.0f, 1.0f);
                return o10 < 0.0f ? (int) ((-o10) * -2.14748365E9f) : (int) (o10 * 2.14748365E9f);
            } else if (i10 == 21) {
                return ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
            } else if (i10 == 22) {
                return ((byteBuffer.get() & 255) << 24) | (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
            } else if (i10 == 268435456) {
                return ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24);
            } else if (i10 == 1342177280) {
                return ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
            } else if (i10 == 1610612736) {
                return (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public static void c(ByteBuffer byteBuffer, int i10, int i11) {
        if (i11 == 2) {
            byteBuffer.put((byte) (i10 >> 16));
            byteBuffer.put((byte) (i10 >> 24));
        } else if (i11 == 3) {
            byteBuffer.put((byte) (i10 >> 24));
        } else if (i11 != 4) {
            if (i11 == 21) {
                byteBuffer.put((byte) (i10 >> 8));
                byteBuffer.put((byte) (i10 >> 16));
                byteBuffer.put((byte) (i10 >> 24));
            } else if (i11 == 22) {
                byteBuffer.put((byte) i10);
                byteBuffer.put((byte) (i10 >> 8));
                byteBuffer.put((byte) (i10 >> 16));
                byteBuffer.put((byte) (i10 >> 24));
            } else if (i11 == 268435456) {
                byteBuffer.put((byte) (i10 >> 24));
                byteBuffer.put((byte) (i10 >> 16));
            } else if (i11 == 1342177280) {
                byteBuffer.put((byte) (i10 >> 24));
                byteBuffer.put((byte) (i10 >> 16));
                byteBuffer.put((byte) (i10 >> 8));
            } else if (i11 == 1610612736) {
                byteBuffer.put((byte) (i10 >> 24));
                byteBuffer.put((byte) (i10 >> 16));
                byteBuffer.put((byte) (i10 >> 8));
                byteBuffer.put((byte) i10);
            } else {
                throw new IllegalStateException();
            }
        } else if (i10 < 0) {
            byteBuffer.putFloat((-((float) i10)) / -2.14748365E9f);
        } else {
            byteBuffer.putFloat(((float) i10) / 2.14748365E9f);
        }
    }
}
