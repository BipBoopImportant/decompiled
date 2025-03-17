package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class m {

    private static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f21617a;

        a(ByteBuffer byteBuffer) {
            this.f21617a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public void a(int i10) {
            ByteBuffer byteBuffer = this.f21617a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        public int b() {
            return this.f21617a.getInt();
        }

        public long c() {
            return m.c(this.f21617a.getInt());
        }

        public long getPosition() {
            return (long) this.f21617a.position();
        }

        public int readUnsignedShort() {
            return m.d(this.f21617a.getShort());
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f21618a;

        /* renamed from: b  reason: collision with root package name */
        private final long f21619b;

        b(long j10, long j11) {
            this.f21618a = j10;
            this.f21619b = j11;
        }

        /* access modifiers changed from: package-private */
        public long a() {
            return this.f21618a;
        }
    }

    private interface c {
        void a(int i10);

        int b();

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) {
        long j10;
        cVar.a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.a(6);
            int i10 = 0;
            while (true) {
                if (i10 >= readUnsignedShort) {
                    j10 = -1;
                    break;
                }
                int b10 = cVar.b();
                cVar.a(4);
                j10 = cVar.c();
                cVar.a(4);
                if (1835365473 == b10) {
                    break;
                }
                i10++;
            }
            if (j10 != -1) {
                cVar.a((int) (j10 - cVar.getPosition()));
                cVar.a(12);
                long c10 = cVar.c();
                for (int i11 = 0; ((long) i11) < c10; i11++) {
                    int b11 = cVar.b();
                    long c11 = cVar.c();
                    long c12 = cVar.c();
                    if (1164798569 == b11 || 1701669481 == b11) {
                        return new b(c11 + j10, c12);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    static Z2.b b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return Z2.b.h(duplicate);
    }

    static long c(int i10) {
        return ((long) i10) & 4294967295L;
    }

    static int d(short s10) {
        return s10 & 65535;
    }
}
