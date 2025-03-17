package E5;

import com.sugarcube.app.base.data.source.CatalogRepository;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rJ'\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001b¨\u0006\u001d"}, d2 = {"LE5/j;", "Ljava/io/InputStream;", "delegate", "<init>", "(Ljava/io/InputStream;)V", "", "bytesRead", "c", "(I)I", "read", "()I", "", "b", "([B)I", "off", "len", "([BII)I", "", "n", "skip", "(J)J", "available", "LXH/N;", "close", "()V", "a", "Ljava/io/InputStream;", "I", "availableBytes", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class j extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f34886a;

    /* renamed from: b  reason: collision with root package name */
    private int f34887b = CatalogRepository.FETCH_FLAG_SDB;

    public j(InputStream inputStream) {
        this.f34886a = inputStream;
    }

    private final int c(int i10) {
        if (i10 == -1) {
            this.f34887b = 0;
        }
        return i10;
    }

    public int available() {
        return this.f34887b;
    }

    public void close() {
        this.f34886a.close();
    }

    public int read() {
        return c(this.f34886a.read());
    }

    public long skip(long j10) {
        return this.f34886a.skip(j10);
    }

    public int read(byte[] bArr) {
        return c(this.f34886a.read(bArr));
    }

    public int read(byte[] bArr, int i10, int i11) {
        return c(this.f34886a.read(bArr, i10, i11));
    }
}
