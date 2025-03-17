package WK;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"¨\u0006$"}, d2 = {"LWK/i;", "LWK/L;", "LWK/f;", "sink", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(LWK/f;Ljava/util/zip/Deflater;)V", "(LWK/L;Ljava/util/zip/Deflater;)V", "", "syncFlush", "LXH/N;", "c", "(Z)V", "LWK/e;", "source", "", "byteCount", "s3", "(LWK/e;J)V", "flush", "()V", "d", "close", "LWK/O;", "y", "()LWK/O;", "", "toString", "()Ljava/lang/String;", "a", "LWK/f;", "b", "Ljava/util/zip/Deflater;", "Z", "closed", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.i  reason: case insensitive filesystem */
public final class C16774i implements L {

    /* renamed from: a  reason: collision with root package name */
    private final C16771f f139669a;

    /* renamed from: b  reason: collision with root package name */
    private final Deflater f139670b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f139671c;

    public C16774i(C16771f fVar, Deflater deflater) {
        C17542s.j(fVar, "sink");
        C17542s.j(deflater, "deflater");
        this.f139669a = fVar;
        this.f139670b = deflater;
    }

    private final void c(boolean z10) {
        I I02;
        int i10;
        C16770e p10 = this.f139669a.p();
        while (true) {
            I02 = p10.I0(1);
            if (z10) {
                try {
                    Deflater deflater = this.f139670b;
                    byte[] bArr = I02.f139610a;
                    int i11 = I02.f139612c;
                    i10 = deflater.deflate(bArr, i11, 8192 - i11, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                Deflater deflater2 = this.f139670b;
                byte[] bArr2 = I02.f139610a;
                int i12 = I02.f139612c;
                i10 = deflater2.deflate(bArr2, i12, 8192 - i12);
            }
            if (i10 > 0) {
                I02.f139612c += i10;
                p10.p0(p10.size() + ((long) i10));
                this.f139669a.n0();
            } else if (this.f139670b.needsInput()) {
                break;
            }
        }
        if (I02.f139611b == I02.f139612c) {
            p10.f139653a = I02.b();
            J.b(I02);
        }
    }

    public void close() {
        if (!this.f139671c) {
            try {
                d();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f139670b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f139669a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f139671c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void d() {
        this.f139670b.finish();
        c(false);
    }

    public void flush() {
        c(true);
        this.f139669a.flush();
    }

    public void s3(C16770e eVar, long j10) {
        C17542s.j(eVar, "source");
        C16767b.b(eVar.size(), 0, j10);
        while (j10 > 0) {
            I i10 = eVar.f139653a;
            C17542s.g(i10);
            int min = (int) Math.min(j10, (long) (i10.f139612c - i10.f139611b));
            this.f139670b.setInput(i10.f139610a, i10.f139611b, min);
            c(false);
            long j11 = (long) min;
            eVar.p0(eVar.size() - j11);
            int i11 = i10.f139611b + min;
            i10.f139611b = i11;
            if (i11 == i10.f139612c) {
                eVar.f139653a = i10.b();
                J.b(i10);
            }
            j10 -= j11;
        }
    }

    public String toString() {
        return "DeflaterSink(" + this.f139669a + ')';
    }

    public O y() {
        return this.f139669a.y();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16774i(L l10, Deflater deflater) {
        this(y.c(l10), deflater);
        C17542s.j(l10, "sink");
        C17542s.j(deflater, "deflater");
    }
}
