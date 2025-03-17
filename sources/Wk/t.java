package WK;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010!¨\u0006#"}, d2 = {"LWK/t;", "LWK/N;", "LWK/g;", "source", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(LWK/g;Ljava/util/zip/Inflater;)V", "(LWK/N;Ljava/util/zip/Inflater;)V", "LXH/N;", "e", "()V", "LWK/e;", "sink", "", "byteCount", "u0", "(LWK/e;J)J", "c", "", "d", "()Z", "LWK/O;", "y", "()LWK/O;", "close", "a", "LWK/g;", "b", "Ljava/util/zip/Inflater;", "", "I", "bufferBytesHeldByInflater", "Z", "closed", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements N {

    /* renamed from: a  reason: collision with root package name */
    private final C16772g f139711a;

    /* renamed from: b  reason: collision with root package name */
    private final Inflater f139712b;

    /* renamed from: c  reason: collision with root package name */
    private int f139713c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f139714d;

    public t(C16772g gVar, Inflater inflater) {
        C17542s.j(gVar, "source");
        C17542s.j(inflater, "inflater");
        this.f139711a = gVar;
        this.f139712b = inflater;
    }

    private final void e() {
        int i10 = this.f139713c;
        if (i10 != 0) {
            int remaining = i10 - this.f139712b.getRemaining();
            this.f139713c -= remaining;
            this.f139711a.M((long) remaining);
        }
    }

    public final long c(C16770e eVar, long j10) {
        C17542s.j(eVar, "sink");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (this.f139714d) {
            throw new IllegalStateException("closed");
        } else if (i10 == 0) {
            return 0;
        } else {
            try {
                I I02 = eVar.I0(1);
                d();
                int inflate = this.f139712b.inflate(I02.f139610a, I02.f139612c, (int) Math.min(j10, (long) (8192 - I02.f139612c)));
                e();
                if (inflate > 0) {
                    I02.f139612c += inflate;
                    long j11 = (long) inflate;
                    eVar.p0(eVar.size() + j11);
                    return j11;
                }
                if (I02.f139611b == I02.f139612c) {
                    eVar.f139653a = I02.b();
                    J.b(I02);
                }
                return 0;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
    }

    public void close() {
        if (!this.f139714d) {
            this.f139712b.end();
            this.f139714d = true;
            this.f139711a.close();
        }
    }

    public final boolean d() {
        if (!this.f139712b.needsInput()) {
            return false;
        }
        if (this.f139711a.Y1()) {
            return true;
        }
        I i10 = this.f139711a.p().f139653a;
        C17542s.g(i10);
        int i11 = i10.f139612c;
        int i12 = i10.f139611b;
        int i13 = i11 - i12;
        this.f139713c = i13;
        this.f139712b.setInput(i10.f139610a, i12, i13);
        return false;
    }

    public long u0(C16770e eVar, long j10) {
        C17542s.j(eVar, "sink");
        do {
            long c10 = c(eVar, j10);
            if (c10 > 0) {
                return c10;
            }
            if (this.f139712b.finished() || this.f139712b.needsDictionary()) {
                return -1;
            }
        } while (!this.f139711a.Y1());
        throw new EOFException("source exhausted prematurely");
    }

    public O y() {
        return this.f139711a.y();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public t(N n10, Inflater inflater) {
        this(y.d(n10), inflater);
        C17542s.j(n10, "source");
        C17542s.j(inflater, "inflater");
    }
}
