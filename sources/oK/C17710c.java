package oK;

import com.sugarcube.app.base.data.source.CatalogRepository;
import com.sugarcube.core.logger.DslKt;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001b¨\u0006\u001d"}, d2 = {"LoK/c;", "Ljava/io/InputStream;", "delegate", "<init>", "(Ljava/io/InputStream;)V", "", "bytesRead", "c", "(I)I", "available", "()I", "read", "", "b", "([B)I", "off", "len", "([BII)I", "LXH/N;", "close", "()V", "", "n", "skip", "(J)J", "a", "Ljava/io/InputStream;", "I", "availableBytes", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oK.c  reason: case insensitive filesystem */
final class C17710c extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f145325a;

    /* renamed from: b  reason: collision with root package name */
    private int f145326b = CatalogRepository.FETCH_FLAG_SDB;

    public C17710c(InputStream inputStream) {
        C17542s.j(inputStream, "delegate");
        this.f145325a = inputStream;
    }

    private final int c(int i10) {
        if (i10 == -1) {
            this.f145326b = 0;
        }
        return i10;
    }

    public int available() {
        return this.f145326b;
    }

    public void close() {
        this.f145325a.close();
    }

    public int read() {
        return c(this.f145325a.read());
    }

    public long skip(long j10) {
        return this.f145325a.skip(j10);
    }

    public int read(byte[] bArr) {
        C17542s.j(bArr, DslKt.INDICATOR_BACKGROUND);
        return c(this.f145325a.read(bArr));
    }

    public int read(byte[] bArr, int i10, int i11) {
        C17542s.j(bArr, DslKt.INDICATOR_BACKGROUND);
        return c(this.f145325a.read(bArr, i10, i11));
    }
}
