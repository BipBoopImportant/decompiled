package WK;

import HJ.C15854t;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0007R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0002\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u00060%j\u0002`&8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0018\u0010/\u001a\u00060,j\u0002`-8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010.¨\u00060"}, d2 = {"LWK/r;", "LWK/N;", "source", "<init>", "(LWK/N;)V", "LXH/N;", "d", "()V", "e", "LWK/e;", "buffer", "", "offset", "byteCount", "f", "(LWK/e;JJ)V", "", "name", "", "expected", "actual", "c", "(Ljava/lang/String;II)V", "sink", "u0", "(LWK/e;J)J", "LWK/O;", "y", "()LWK/O;", "close", "", "a", "B", "section", "LWK/H;", "b", "LWK/H;", "Ljava/util/zip/Inflater;", "Lokio/Inflater;", "Ljava/util/zip/Inflater;", "inflater", "LWK/t;", "LWK/t;", "inflaterSource", "Ljava/util/zip/CRC32;", "Lokio/internal/CRC32;", "Ljava/util/zip/CRC32;", "crc", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements N {

    /* renamed from: a  reason: collision with root package name */
    private byte f139703a;

    /* renamed from: b  reason: collision with root package name */
    private final C16765H f139704b;

    /* renamed from: c  reason: collision with root package name */
    private final Inflater f139705c;

    /* renamed from: d  reason: collision with root package name */
    private final t f139706d;

    /* renamed from: e  reason: collision with root package name */
    private final CRC32 f139707e = new CRC32();

    public r(N n10) {
        C17542s.j(n10, "source");
        C16765H h10 = new C16765H(n10);
        this.f139704b = h10;
        Inflater inflater = new Inflater(true);
        this.f139705c = inflater;
        this.f139706d = new t((C16772g) h10, inflater);
    }

    private final void c(String str, int i10, int i11) {
        if (i11 != i10) {
            throw new IOException(str + ": actual 0x" + C15854t.G0(C16767b.l(i11), 8, '0') + " != expected 0x" + C15854t.G0(C16767b.l(i10), 8, '0'));
        }
    }

    private final void d() {
        this.f139704b.t1(10);
        byte u10 = this.f139704b.f139606b.u(3);
        boolean z10 = ((u10 >> 1) & 1) == 1;
        if (z10) {
            f(this.f139704b.f139606b, 0, 10);
        }
        c("ID1ID2", 8075, this.f139704b.readShort());
        this.f139704b.M(8);
        if (((u10 >> 2) & 1) == 1) {
            this.f139704b.t1(2);
            if (z10) {
                f(this.f139704b.f139606b, 0, 2);
            }
            long i12 = (long) (this.f139704b.f139606b.i1() & 65535);
            this.f139704b.t1(i12);
            if (z10) {
                f(this.f139704b.f139606b, 0, i12);
            }
            this.f139704b.M(i12);
        }
        if (((u10 >> 3) & 1) == 1) {
            long c10 = this.f139704b.c((byte) 0);
            if (c10 != -1) {
                if (z10) {
                    f(this.f139704b.f139606b, 0, c10 + 1);
                }
                this.f139704b.M(c10 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((u10 >> 4) & 1) == 1) {
            long c11 = this.f139704b.c((byte) 0);
            if (c11 != -1) {
                if (z10) {
                    f(this.f139704b.f139606b, 0, c11 + 1);
                }
                this.f139704b.M(c11 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z10) {
            c("FHCRC", this.f139704b.i1(), (short) ((int) this.f139707e.getValue()));
            this.f139707e.reset();
        }
    }

    private final void e() {
        c("CRC", this.f139704b.K2(), (int) this.f139707e.getValue());
        c("ISIZE", this.f139704b.K2(), (int) this.f139705c.getBytesWritten());
    }

    private final void f(C16770e eVar, long j10, long j11) {
        I i10 = eVar.f139653a;
        C17542s.g(i10);
        while (true) {
            int i11 = i10.f139612c;
            int i12 = i10.f139611b;
            if (j10 < ((long) (i11 - i12))) {
                break;
            }
            j10 -= (long) (i11 - i12);
            i10 = i10.f139615f;
            C17542s.g(i10);
        }
        while (j11 > 0) {
            int i13 = (int) (((long) i10.f139611b) + j10);
            int min = (int) Math.min((long) (i10.f139612c - i13), j11);
            this.f139707e.update(i10.f139610a, i13, min);
            j11 -= (long) min;
            i10 = i10.f139615f;
            C17542s.g(i10);
            j10 = 0;
        }
    }

    public void close() {
        this.f139706d.close();
    }

    public long u0(C16770e eVar, long j10) {
        C17542s.j(eVar, "sink");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (i10 == 0) {
            return 0;
        } else {
            if (this.f139703a == 0) {
                d();
                this.f139703a = 1;
            }
            if (this.f139703a == 1) {
                long size = eVar.size();
                long u02 = this.f139706d.u0(eVar, j10);
                if (u02 != -1) {
                    f(eVar, size, u02);
                    return u02;
                }
                this.f139703a = 2;
            }
            if (this.f139703a == 2) {
                e();
                this.f139703a = 3;
                if (!this.f139704b.Y1()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public O y() {
        return this.f139704b.y();
    }
}
