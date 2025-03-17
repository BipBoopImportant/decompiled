package G;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

class b extends FilterOutputStream {

    /* renamed from: a  reason: collision with root package name */
    final OutputStream f6049a;

    /* renamed from: b  reason: collision with root package name */
    private ByteOrder f6050b;

    b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f6049a = outputStream;
        this.f6050b = byteOrder;
    }

    public void c(ByteOrder byteOrder) {
        this.f6050b = byteOrder;
    }

    public void d(int i10) {
        this.f6049a.write(i10);
    }

    public void e(int i10) {
        ByteOrder byteOrder = this.f6050b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f6049a.write(i10 & 255);
            this.f6049a.write((i10 >>> 8) & 255);
            this.f6049a.write((i10 >>> 16) & 255);
            this.f6049a.write((i10 >>> 24) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f6049a.write((i10 >>> 24) & 255);
            this.f6049a.write((i10 >>> 16) & 255);
            this.f6049a.write((i10 >>> 8) & 255);
            this.f6049a.write(i10 & 255);
        }
    }

    public void f(short s10) {
        ByteOrder byteOrder = this.f6050b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f6049a.write(s10 & 255);
            this.f6049a.write((s10 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f6049a.write((s10 >>> 8) & 255);
            this.f6049a.write(s10 & 255);
        }
    }

    public void g(long j10) {
        e((int) j10);
    }

    public void h(int i10) {
        f((short) i10);
    }

    public void write(byte[] bArr) {
        this.f6049a.write(bArr);
    }

    public void write(byte[] bArr, int i10, int i11) {
        this.f6049a.write(bArr, i10, i11);
    }
}
