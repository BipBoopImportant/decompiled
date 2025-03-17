package WK;

import com.optimizely.ab.config.FeatureVariable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0015H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0015H\u0016¢\u0006\u0004\b*\u0010(J\u0017\u0010,\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010(J\u0017\u0010-\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u0015H\u0016¢\u0006\u0004\b-\u0010(J\u0017\u0010/\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0001H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0001H\u0016¢\u0006\u0004\b4\u00103J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\nH\u0016¢\u0006\u0004\b=\u00109J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0011H\u0016¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b&\u0010ER\u0016\u0010G\u001a\u00020:8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b-\u00104R\u001b\u0010K\u001a\u00020\u00068Ö\u0002X\u0004¢\u0006\f\u0012\u0004\bJ\u00109\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"LWK/G;", "LWK/f;", "LWK/L;", "sink", "<init>", "(LWK/L;)V", "LWK/e;", "source", "", "byteCount", "LXH/N;", "s3", "(LWK/e;J)V", "LWK/h;", "byteString", "j2", "(LWK/h;)LWK/f;", "", "string", "D0", "(Ljava/lang/String;)LWK/f;", "", "beginIndex", "endIndex", "M0", "(Ljava/lang/String;II)LWK/f;", "", "f1", "([B)LWK/f;", "offset", "L", "([BII)LWK/f;", "Ljava/nio/ByteBuffer;", "write", "(Ljava/nio/ByteBuffer;)I", "LWK/N;", "Y", "(LWK/N;)J", "b", "Z1", "(I)LWK/f;", "s", "J1", "i", "d0", "c", "v", "u1", "(J)LWK/f;", "D2", "n0", "()LWK/f;", "Z", "Ljava/io/OutputStream;", "o3", "()Ljava/io/OutputStream;", "flush", "()V", "", "isOpen", "()Z", "close", "LWK/O;", "y", "()LWK/O;", "toString", "()Ljava/lang/String;", "a", "LWK/L;", "LWK/e;", "bufferField", "closed", "p", "()LWK/e;", "getBuffer$annotations", "buffer", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.G  reason: case insensitive filesystem */
public final class C16764G implements C16771f {

    /* renamed from: a  reason: collision with root package name */
    public final L f139601a;

    /* renamed from: b  reason: collision with root package name */
    public final C16770e f139602b = new C16770e();

    /* renamed from: c  reason: collision with root package name */
    public boolean f139603c;

    public C16764G(L l10) {
        C17542s.j(l10, "sink");
        this.f139601a = l10;
    }

    public C16771f D0(String str) {
        C17542s.j(str, FeatureVariable.STRING_TYPE);
        if (!this.f139603c) {
            this.f139602b.D0(str);
            return n0();
        }
        throw new IllegalStateException("closed");
    }

    public C16771f D2(long j10) {
        if (!this.f139603c) {
            this.f139602b.D2(j10);
            return n0();
        }
        throw new IllegalStateException("closed");
    }

    public C16771f J1(int i10) {
        if (!this.f139603c) {
            this.f139602b.J1(i10);
            return n0();
        }
        throw new IllegalStateException("closed");
    }

    public C16771f L(byte[] bArr, int i10, int i11) {
        C17542s.j(bArr, "source");
        if (!this.f139603c) {
            this.f139602b.L(bArr, i10, i11);
            return n0();
        }
        throw new IllegalStateException("closed");
    }

    public C16771f M0(String str, int i10, int i11) {
        C17542s.j(str, FeatureVariable.STRING_TYPE);
        if (!this.f139603c) {
            this.f139602b.M0(str, i10, i11);
            return n0();
        }
        throw new IllegalStateException("closed");
    }

    public long Y(N n10) {
        C17542s.j(n10, "source");
        long j10 = 0;
        while (true) {
            long u02 = n10.u0(this.f139602b, 8192);
            if (u02 == -1) {
                return j10;
            }
            j10 += u02;
            n0();
        }
    }

    public C16771f Z() {
        if (!this.f139603c) {
            long size = this.f139602b.size();
            if (size > 0) {
                this.f139601a.s3(this.f139602b, size);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public C16771f Z1(int i10) {
        if (!this.f139603c) {
            this.f139602b.Z1(i10);
            return n0();
        }
        throw new IllegalStateException("closed");
    }

    public C16771f c(int i10) {
        if (!this.f139603c) {
            this.f139602b.Y0(i10);
            return n0();
        }
        throw new IllegalStateException("closed");
    }

    public void close() {
        if (!this.f139603c) {
            try {
                if (this.f139602b.size() > 0) {
                    L l10 = this.f139601a;
                    C16770e eVar = this.f139602b;
                    l10.s3(eVar, eVar.size());
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f139601a.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f139603c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public C16771f d0(int i10) {
        if (!this.f139603c) {
            this.f139602b.d0(i10);
            return n0();
        }
        throw new IllegalStateException("closed");
    }

    public C16771f f1(byte[] bArr) {
        C17542s.j(bArr, "source");
        if (!this.f139603c) {
            this.f139602b.f1(bArr);
            return n0();
        }
        throw new IllegalStateException("closed");
    }

    public void flush() {
        if (!this.f139603c) {
            if (this.f139602b.size() > 0) {
                L l10 = this.f139601a;
                C16770e eVar = this.f139602b;
                l10.s3(eVar, eVar.size());
            }
            this.f139601a.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f139603c;
    }

    public C16771f j2(C16773h hVar) {
        C17542s.j(hVar, "byteString");
        if (!this.f139603c) {
            this.f139602b.j2(hVar);
            return n0();
        }
        throw new IllegalStateException("closed");
    }

    public C16771f n0() {
        if (!this.f139603c) {
            long e10 = this.f139602b.e();
            if (e10 > 0) {
                this.f139601a.s3(this.f139602b, e10);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public OutputStream o3() {
        return new a(this);
    }

    public C16770e p() {
        return this.f139602b;
    }

    public void s3(C16770e eVar, long j10) {
        C17542s.j(eVar, "source");
        if (!this.f139603c) {
            this.f139602b.s3(eVar, j10);
            n0();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f139601a + ')';
    }

    public C16771f u1(long j10) {
        if (!this.f139603c) {
            this.f139602b.u1(j10);
            return n0();
        }
        throw new IllegalStateException("closed");
    }

    public int write(ByteBuffer byteBuffer) {
        C17542s.j(byteBuffer, "source");
        if (!this.f139603c) {
            int write = this.f139602b.write(byteBuffer);
            n0();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public O y() {
        return this.f139601a.y();
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"WK/G$a", "Ljava/io/OutputStream;", "", "b", "LXH/N;", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", "close", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.G$a */
    public static final class a extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16764G f139604a;

        a(C16764G g10) {
            this.f139604a = g10;
        }

        public void close() {
            this.f139604a.close();
        }

        public void flush() {
            C16764G g10 = this.f139604a;
            if (!g10.f139603c) {
                g10.flush();
            }
        }

        public String toString() {
            return this.f139604a + ".outputStream()";
        }

        public void write(int i10) {
            C16764G g10 = this.f139604a;
            if (!g10.f139603c) {
                g10.f139602b.Z1((byte) i10);
                this.f139604a.n0();
                return;
            }
            throw new IOException("closed");
        }

        public void write(byte[] bArr, int i10, int i11) {
            C17542s.j(bArr, "data");
            C16764G g10 = this.f139604a;
            if (!g10.f139603c) {
                g10.f139602b.L(bArr, i10, i11);
                this.f139604a.n0();
                return;
            }
            throw new IOException("closed");
        }
    }
}
