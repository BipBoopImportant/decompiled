package WK;

import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LWK/D;", "LWK/L;", "Ljava/io/OutputStream;", "out", "LWK/O;", "timeout", "<init>", "(Ljava/io/OutputStream;LWK/O;)V", "LWK/e;", "source", "", "byteCount", "LXH/N;", "s3", "(LWK/e;J)V", "flush", "()V", "close", "y", "()LWK/O;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/io/OutputStream;", "b", "LWK/O;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.D  reason: case insensitive filesystem */
final class C16761D implements L {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f139590a;

    /* renamed from: b  reason: collision with root package name */
    private final O f139591b;

    public C16761D(OutputStream outputStream, O o10) {
        C17542s.j(outputStream, "out");
        C17542s.j(o10, "timeout");
        this.f139590a = outputStream;
        this.f139591b = o10;
    }

    public void close() {
        this.f139590a.close();
    }

    public void flush() {
        this.f139590a.flush();
    }

    public void s3(C16770e eVar, long j10) {
        C17542s.j(eVar, "source");
        C16767b.b(eVar.size(), 0, j10);
        while (j10 > 0) {
            this.f139591b.f();
            I i10 = eVar.f139653a;
            C17542s.g(i10);
            int min = (int) Math.min(j10, (long) (i10.f139612c - i10.f139611b));
            this.f139590a.write(i10.f139610a, i10.f139611b, min);
            i10.f139611b += min;
            long j11 = (long) min;
            j10 -= j11;
            eVar.p0(eVar.size() - j11);
            if (i10.f139611b == i10.f139612c) {
                eVar.f139653a = i10.b();
                J.b(i10);
            }
        }
    }

    public String toString() {
        return "sink(" + this.f139590a + ')';
    }

    public O y() {
        return this.f139591b;
    }
}
