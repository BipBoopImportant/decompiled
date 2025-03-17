package Y7;

import java.io.FilterInputStream;
import java.io.InputStream;

public class i extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private int f41018a = Integer.MIN_VALUE;

    public i(InputStream inputStream) {
        super(inputStream);
    }

    private long c(long j10) {
        int i10 = this.f41018a;
        if (i10 == 0) {
            return -1;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : (long) i10;
    }

    private void d(long j10) {
        int i10 = this.f41018a;
        if (i10 != Integer.MIN_VALUE && j10 != -1) {
            this.f41018a = (int) (((long) i10) - j10);
        }
    }

    public int available() {
        int i10 = this.f41018a;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f41018a = i10;
    }

    public int read() {
        if (c(1) == -1) {
            return -1;
        }
        int read = super.read();
        d(1);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.f41018a = Integer.MIN_VALUE;
    }

    public long skip(long j10) {
        long c10 = c(j10);
        if (c10 == -1) {
            return 0;
        }
        long skip = super.skip(c10);
        d(skip);
        return skip;
    }

    public int read(byte[] bArr, int i10, int i11) {
        int c10 = (int) c((long) i11);
        if (c10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, c10);
        d((long) read);
        return read;
    }
}
