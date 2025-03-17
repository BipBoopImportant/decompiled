package j7;

import com.sugarcube.core.logger.DslKt;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J'\u0010\f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u0018"}, d2 = {"Lj7/d;", "Ljava/io/InputStream;", "original", "", "maxSize", "<init>", "(Ljava/io/InputStream;J)V", "", "size", "LXH/N;", "c", "(I)V", "read", "()I", "", "b", "([B)I", "off", "len", "([BII)I", "a", "Ljava/io/InputStream;", "J", "total", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: j7.d  reason: case insensitive filesystem */
public final class C8410d extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f54062a;

    /* renamed from: b  reason: collision with root package name */
    private final long f54063b;

    /* renamed from: c  reason: collision with root package name */
    private long f54064c;

    public C8410d(InputStream inputStream, long j10) {
        C17542s.j(inputStream, "original");
        this.f54062a = inputStream;
        this.f54063b = j10;
    }

    private final void c(int i10) {
        long j10 = this.f54064c + ((long) i10);
        this.f54064c = j10;
        if (j10 > this.f54063b) {
            throw new IOException("InputStream exceeded maximum size " + this.f54063b + " bytes");
        }
    }

    public int read() {
        int read = this.f54062a.read();
        if (read >= 0) {
            c(1);
        }
        return read;
    }

    public int read(byte[] bArr) {
        C17542s.j(bArr, DslKt.INDICATOR_BACKGROUND);
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) {
        C17542s.j(bArr, DslKt.INDICATOR_BACKGROUND);
        int read = this.f54062a.read(bArr, i10, i11);
        if (read >= 0) {
            c(read);
        }
        return read;
    }
}
