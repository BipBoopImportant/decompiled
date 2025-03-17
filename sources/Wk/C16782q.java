package WK;

import XK.q;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198G¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010(\u001a\u00060$j\u0002`%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"LWK/q;", "LWK/L;", "sink", "<init>", "(LWK/L;)V", "LXH/N;", "d", "()V", "LWK/e;", "buffer", "", "byteCount", "c", "(LWK/e;J)V", "source", "s3", "flush", "LWK/O;", "y", "()LWK/O;", "close", "LWK/G;", "a", "LWK/G;", "Ljava/util/zip/Deflater;", "Lokio/Deflater;", "b", "Ljava/util/zip/Deflater;", "deflater", "()Ljava/util/zip/Deflater;", "LWK/i;", "LWK/i;", "deflaterSink", "", "Z", "closed", "Ljava/util/zip/CRC32;", "Lokio/internal/CRC32;", "e", "Ljava/util/zip/CRC32;", "crc", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.q  reason: case insensitive filesystem */
public final class C16782q implements L {

    /* renamed from: a  reason: collision with root package name */
    private final C16764G f139698a;

    /* renamed from: b  reason: collision with root package name */
    private final Deflater f139699b;

    /* renamed from: c  reason: collision with root package name */
    private final C16774i f139700c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f139701d;

    /* renamed from: e  reason: collision with root package name */
    private final CRC32 f139702e = new CRC32();

    public C16782q(L l10) {
        C17542s.j(l10, "sink");
        C16764G g10 = new C16764G(l10);
        this.f139698a = g10;
        Deflater deflater = new Deflater(q.b(), true);
        this.f139699b = deflater;
        this.f139700c = new C16774i((C16771f) g10, deflater);
        C16770e eVar = g10.f139602b;
        eVar.J1(8075);
        eVar.Z1(8);
        eVar.Z1(0);
        eVar.d0(0);
        eVar.Z1(0);
        eVar.Z1(0);
    }

    private final void c(C16770e eVar, long j10) {
        I i10 = eVar.f139653a;
        C17542s.g(i10);
        while (j10 > 0) {
            int min = (int) Math.min(j10, (long) (i10.f139612c - i10.f139611b));
            this.f139702e.update(i10.f139610a, i10.f139611b, min);
            j10 -= (long) min;
            i10 = i10.f139615f;
            C17542s.g(i10);
        }
    }

    private final void d() {
        this.f139698a.c((int) this.f139702e.getValue());
        this.f139698a.c((int) this.f139699b.getBytesRead());
    }

    public void close() {
        if (!this.f139701d) {
            try {
                this.f139700c.d();
                d();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f139699b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f139698a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f139701d = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() {
        this.f139700c.flush();
    }

    public void s3(C16770e eVar, long j10) {
        C17542s.j(eVar, "source");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (i10 != 0) {
            c(eVar, j10);
            this.f139700c.s3(eVar, j10);
        }
    }

    public O y() {
        return this.f139698a.y();
    }
}
