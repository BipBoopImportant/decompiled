package x3;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import t3.C5950a;
import t3.N;

final class q extends BufferedOutputStream {

    /* renamed from: a  reason: collision with root package name */
    private boolean f31949a;

    public q(OutputStream outputStream) {
        super(outputStream);
    }

    public void c(OutputStream outputStream) {
        C5950a.g(this.f31949a);
        this.out = outputStream;
        this.count = 0;
        this.f31949a = false;
    }

    public void close() {
        this.f31949a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.out.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th != null) {
            N.f1(th);
        }
    }

    public q(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }
}
