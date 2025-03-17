package Y7;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class d extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    private static final Queue<d> f41004c = l.f(0);

    /* renamed from: a  reason: collision with root package name */
    private InputStream f41005a;

    /* renamed from: b  reason: collision with root package name */
    private IOException f41006b;

    d() {
    }

    public static d d(InputStream inputStream) {
        d poll;
        Queue<d> queue = f41004c;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.f(inputStream);
        return poll;
    }

    public int available() {
        return this.f41005a.available();
    }

    public IOException c() {
        return this.f41006b;
    }

    public void close() {
        this.f41005a.close();
    }

    public void e() {
        this.f41006b = null;
        this.f41005a = null;
        Queue<d> queue = f41004c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void f(InputStream inputStream) {
        this.f41005a = inputStream;
    }

    public void mark(int i10) {
        this.f41005a.mark(i10);
    }

    public boolean markSupported() {
        return this.f41005a.markSupported();
    }

    public int read() {
        try {
            return this.f41005a.read();
        } catch (IOException e10) {
            this.f41006b = e10;
            throw e10;
        }
    }

    public synchronized void reset() {
        this.f41005a.reset();
    }

    public long skip(long j10) {
        try {
            return this.f41005a.skip(j10);
        } catch (IOException e10) {
            this.f41006b = e10;
            throw e10;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.f41005a.read(bArr);
        } catch (IOException e10) {
            this.f41006b = e10;
            throw e10;
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f41005a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f41006b = e10;
            throw e10;
        }
    }
}
