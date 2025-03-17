package WK;

import java.io.RandomAccessFile;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LWK/v;", "LWK/j;", "", "readWrite", "Ljava/io/RandomAccessFile;", "randomAccessFile", "<init>", "(ZLjava/io/RandomAccessFile;)V", "", "o", "()J", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "n", "(J[BII)I", "LXH/N;", "q", "(J[BII)V", "l", "()V", "i", "e", "Ljava/io/RandomAccessFile;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends C16775j {

    /* renamed from: e  reason: collision with root package name */
    private final RandomAccessFile f139717e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        C17542s.j(randomAccessFile, "randomAccessFile");
        this.f139717e = randomAccessFile;
    }

    /* access modifiers changed from: protected */
    public synchronized void i() {
        this.f139717e.close();
    }

    /* access modifiers changed from: protected */
    public synchronized void l() {
        this.f139717e.getFD().sync();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int n(long r2, byte[] r4, int r5, int r6) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.C17542s.j(r4, r0)     // Catch:{ all -> 0x001f }
            java.io.RandomAccessFile r0 = r1.f139717e     // Catch:{ all -> 0x001f }
            r0.seek(r2)     // Catch:{ all -> 0x001f }
            r2 = 0
        L_0x000c:
            if (r2 >= r6) goto L_0x0021
            java.io.RandomAccessFile r3 = r1.f139717e     // Catch:{ all -> 0x001f }
            int r0 = r6 - r2
            int r3 = r3.read(r4, r5, r0)     // Catch:{ all -> 0x001f }
            r0 = -1
            if (r3 != r0) goto L_0x001d
            if (r2 != 0) goto L_0x0021
            monitor-exit(r1)
            return r0
        L_0x001d:
            int r2 = r2 + r3
            goto L_0x000c
        L_0x001f:
            r2 = move-exception
            goto L_0x0023
        L_0x0021:
            monitor-exit(r1)
            return r2
        L_0x0023:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: WK.v.n(long, byte[], int, int):int");
    }

    /* access modifiers changed from: protected */
    public synchronized long o() {
        return this.f139717e.length();
    }

    /* access modifiers changed from: protected */
    public synchronized void q(long j10, byte[] bArr, int i10, int i11) {
        C17542s.j(bArr, "array");
        this.f139717e.seek(j10);
        this.f139717e.write(bArr, i10, i11);
    }
}
