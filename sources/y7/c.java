package Y7;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final long f41002a;

    /* renamed from: b  reason: collision with root package name */
    private int f41003b;

    private c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f41002a = j10;
    }

    private int c(int i10) {
        if (i10 >= 0) {
            this.f41003b += i10;
        } else if (this.f41002a - ((long) this.f41003b) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f41002a + ", but read: " + this.f41003b);
        }
        return i10;
    }

    public static InputStream d(InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    public synchronized int available() {
        return (int) Math.max(this.f41002a - ((long) this.f41003b), (long) this.in.available());
    }

    public synchronized int read() {
        int read;
        read = super.read();
        c(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i10, int i11) {
        return c(super.read(bArr, i10, i11));
    }
}
