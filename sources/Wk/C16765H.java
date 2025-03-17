package WK;

import HJ.C15835a;
import XK.C16834a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\n2\u0006\u0010\t\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u0002002\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u000200H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002002\u0006\u00109\u001a\u00020\nH\u0016¢\u0006\u0004\b:\u00102J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020;H\u0016¢\u0006\u0004\b>\u0010=J\u000f\u0010?\u001a\u00020\u001eH\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001eH\u0016¢\u0006\u0004\bA\u0010@J\u000f\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\nH\u0016¢\u0006\u0004\bD\u0010CJ\u000f\u0010E\u001a\u00020\nH\u0016¢\u0006\u0004\bE\u0010CJ\u000f\u0010F\u001a\u00020\nH\u0016¢\u0006\u0004\bF\u0010CJ\u0017\u0010G\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bG\u0010\u0013J\u0017\u0010I\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u0016H\u0016¢\u0006\u0004\bI\u0010JJ'\u0010M\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0019H\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00192\u0006\u0010K\u001a\u00020\nH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\n2\u0006\u0010T\u001a\u00020\u0019H\u0016¢\u0006\u0004\bU\u0010QJ\u001f\u0010V\u001a\u00020\n2\u0006\u0010T\u001a\u00020\u00192\u0006\u0010K\u001a\u00020\nH\u0016¢\u0006\u0004\bV\u0010SJ\u001f\u0010X\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0019H\u0016¢\u0006\u0004\bX\u0010YJ/\u0010[\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00192\u0006\u0010Z\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u001eH\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0001H\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u000eH\u0016¢\u0006\u0004\bb\u0010\u0010J\u000f\u0010c\u001a\u00020\u0011H\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u000200H\u0016¢\u0006\u0004\bh\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\bH\u0010kR\u0016\u0010n\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bI\u0010mR\u001b\u0010q\u001a\u00020\u00068Ö\u0002X\u0004¢\u0006\f\u0012\u0004\bp\u0010d\u001a\u0004\bo\u0010\b¨\u0006r"}, d2 = {"LWK/H;", "LWK/g;", "LWK/N;", "source", "<init>", "(LWK/N;)V", "LWK/e;", "S", "()LWK/e;", "sink", "", "byteCount", "u0", "(LWK/e;J)J", "", "Y1", "()Z", "LXH/N;", "t1", "(J)V", "V0", "(J)Z", "", "readByte", "()B", "LWK/h;", "E1", "(J)LWK/h;", "LWK/C;", "options", "", "z1", "(LWK/C;)I", "", "R1", "()[B", "c1", "(J)[B", "readFully", "([B)V", "Ljava/nio/ByteBuffer;", "read", "(Ljava/nio/ByteBuffer;)I", "n1", "(LWK/e;J)V", "LWK/L;", "L2", "(LWK/L;)J", "", "B1", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "w2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "Z0", "()Ljava/lang/String;", "limit", "r0", "", "readShort", "()S", "i1", "readInt", "()I", "K2", "readLong", "()J", "l1", "g2", "p3", "M", "b", "c", "(B)J", "fromIndex", "toIndex", "m0", "(BJJ)J", "bytes", "S1", "(LWK/h;)J", "d", "(LWK/h;J)J", "targetBytes", "b3", "e", "offset", "h3", "(JLWK/h;)Z", "bytesOffset", "f", "(JLWK/h;II)Z", "O", "()LWK/g;", "Ljava/io/InputStream;", "q3", "()Ljava/io/InputStream;", "isOpen", "close", "()V", "LWK/O;", "y", "()LWK/O;", "toString", "a", "LWK/N;", "LWK/e;", "bufferField", "Z", "closed", "p", "getBuffer$annotations", "buffer", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.H  reason: case insensitive filesystem */
public final class C16765H implements C16772g {

    /* renamed from: a  reason: collision with root package name */
    public final N f139605a;

    /* renamed from: b  reason: collision with root package name */
    public final C16770e f139606b = new C16770e();

    /* renamed from: c  reason: collision with root package name */
    public boolean f139607c;

    public C16765H(N n10) {
        C17542s.j(n10, "source");
        this.f139605a = n10;
    }

    public String B1(long j10) {
        t1(j10);
        return this.f139606b.B1(j10);
    }

    public C16773h E1(long j10) {
        t1(j10);
        return this.f139606b.E1(j10);
    }

    public int K2() {
        t1(4);
        return this.f139606b.K2();
    }

    public long L2(L l10) {
        C17542s.j(l10, "sink");
        long j10 = 0;
        while (this.f139605a.u0(this.f139606b, 8192) != -1) {
            long e10 = this.f139606b.e();
            if (e10 > 0) {
                j10 += e10;
                l10.s3(this.f139606b, e10);
            }
        }
        if (this.f139606b.size() <= 0) {
            return j10;
        }
        long size = j10 + this.f139606b.size();
        C16770e eVar = this.f139606b;
        l10.s3(eVar, eVar.size());
        return size;
    }

    public void M(long j10) {
        if (!this.f139607c) {
            while (j10 > 0) {
                if (this.f139606b.size() == 0 && this.f139605a.u0(this.f139606b, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, this.f139606b.size());
                this.f139606b.M(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public C16772g O() {
        return y.d(new C16763F(this));
    }

    public byte[] R1() {
        this.f139606b.Y(this.f139605a);
        return this.f139606b.R1();
    }

    public C16770e S() {
        return this.f139606b;
    }

    public long S1(C16773h hVar) {
        C17542s.j(hVar, "bytes");
        return d(hVar, 0);
    }

    public boolean V0(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (!this.f139607c) {
            while (this.f139606b.size() < j10) {
                if (this.f139605a.u0(this.f139606b, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public boolean Y1() {
        if (!this.f139607c) {
            return this.f139606b.Y1() && this.f139605a.u0(this.f139606b, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public String Z0() {
        return r0(Long.MAX_VALUE);
    }

    public long b3(C16773h hVar) {
        C17542s.j(hVar, "targetBytes");
        return e(hVar, 0);
    }

    public long c(byte b10) {
        return m0(b10, 0, Long.MAX_VALUE);
    }

    public byte[] c1(long j10) {
        t1(j10);
        return this.f139606b.c1(j10);
    }

    public void close() {
        if (!this.f139607c) {
            this.f139607c = true;
            this.f139605a.close();
            this.f139606b.c();
        }
    }

    public long d(C16773h hVar, long j10) {
        C17542s.j(hVar, "bytes");
        if (!this.f139607c) {
            while (true) {
                long w10 = this.f139606b.w(hVar, j10);
                if (w10 != -1) {
                    return w10;
                }
                long size = this.f139606b.size();
                if (this.f139605a.u0(this.f139606b, 8192) == -1) {
                    return -1;
                }
                j10 = Math.max(j10, (size - ((long) hVar.W())) + 1);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public long e(C16773h hVar, long j10) {
        C17542s.j(hVar, "targetBytes");
        if (!this.f139607c) {
            while (true) {
                long z10 = this.f139606b.z(hVar, j10);
                if (z10 != -1) {
                    return z10;
                }
                long size = this.f139606b.size();
                if (this.f139605a.u0(this.f139606b, 8192) == -1) {
                    return -1;
                }
                j10 = Math.max(j10, size);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public boolean f(long j10, C16773h hVar, int i10, int i11) {
        C17542s.j(hVar, "bytes");
        if (this.f139607c) {
            throw new IllegalStateException("closed");
        } else if (j10 < 0 || i10 < 0 || i11 < 0 || hVar.W() - i10 < i11) {
            return false;
        } else {
            for (int i12 = 0; i12 < i11; i12++) {
                long j11 = ((long) i12) + j10;
                if (!V0(1 + j11) || this.f139606b.u(j11) != hVar.B(i10 + i12)) {
                    return false;
                }
            }
            return true;
        }
    }

    public long g2() {
        int i10;
        t1(1);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!V0(j11)) {
                break;
            }
            byte u10 = this.f139606b.u(j10);
            if ((u10 >= 48 && u10 <= 57) || (j10 == 0 && u10 == 45)) {
                j10 = j11;
            } else if (i10 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a digit or '-' but was 0x");
                String num = Integer.toString(u10, C15835a.a(16));
                C17542s.i(num, "toString(...)");
                sb2.append(num);
                throw new NumberFormatException(sb2.toString());
            }
        }
        return this.f139606b.g2();
    }

    public boolean h3(long j10, C16773h hVar) {
        C17542s.j(hVar, "bytes");
        return f(j10, hVar, 0, hVar.W());
    }

    public short i1() {
        t1(2);
        return this.f139606b.i1();
    }

    public boolean isOpen() {
        return !this.f139607c;
    }

    public long l1() {
        t1(8);
        return this.f139606b.l1();
    }

    public long m0(byte b10, long j10, long j11) {
        if (this.f139607c) {
            throw new IllegalStateException("closed");
        } else if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        } else {
            while (j10 < j11) {
                long m02 = this.f139606b.m0(b10, j10, j11);
                if (m02 != -1) {
                    return m02;
                }
                long size = this.f139606b.size();
                if (size >= j11 || this.f139605a.u0(this.f139606b, 8192) == -1) {
                    return -1;
                }
                j10 = Math.max(j10, size);
            }
            return -1;
        }
    }

    public void n1(C16770e eVar, long j10) {
        C17542s.j(eVar, "sink");
        try {
            t1(j10);
            this.f139606b.n1(eVar, j10);
        } catch (EOFException e10) {
            eVar.Y(this.f139606b);
            throw e10;
        }
    }

    public C16770e p() {
        return this.f139606b;
    }

    public long p3() {
        t1(1);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!V0((long) i11)) {
                break;
            }
            byte u10 = this.f139606b.u((long) i10);
            if ((u10 >= 48 && u10 <= 57) || ((u10 >= 97 && u10 <= 102) || (u10 >= 65 && u10 <= 70))) {
                i10 = i11;
            } else if (i10 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
                String num = Integer.toString(u10, C15835a.a(16));
                C17542s.i(num, "toString(...)");
                sb2.append(num);
                throw new NumberFormatException(sb2.toString());
            }
        }
        return this.f139606b.p3();
    }

    public InputStream q3() {
        return new a(this);
    }

    public String r0(long j10) {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            long m02 = m0((byte) 10, 0, j11);
            if (m02 != -1) {
                return C16834a.f(this.f139606b, m02);
            }
            if (j11 < Long.MAX_VALUE && V0(j11) && this.f139606b.u(j11 - 1) == 13 && V0(1 + j11) && this.f139606b.u(j11) == 10) {
                return C16834a.f(this.f139606b, j11);
            }
            C16770e eVar = new C16770e();
            C16770e eVar2 = this.f139606b;
            eVar2.l(eVar, 0, Math.min((long) 32, eVar2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f139606b.size(), j10) + " content=" + eVar.i0().G() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    public int read(ByteBuffer byteBuffer) {
        C17542s.j(byteBuffer, "sink");
        if (this.f139606b.size() == 0 && this.f139605a.u0(this.f139606b, 8192) == -1) {
            return -1;
        }
        return this.f139606b.read(byteBuffer);
    }

    public byte readByte() {
        t1(1);
        return this.f139606b.readByte();
    }

    public void readFully(byte[] bArr) {
        C17542s.j(bArr, "sink");
        try {
            t1((long) bArr.length);
            this.f139606b.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f139606b.size() > 0) {
                C16770e eVar = this.f139606b;
                int e02 = eVar.e0(bArr, i10, (int) eVar.size());
                if (e02 != -1) {
                    i10 += e02;
                } else {
                    throw new AssertionError();
                }
            }
            throw e10;
        }
    }

    public int readInt() {
        t1(4);
        return this.f139606b.readInt();
    }

    public long readLong() {
        t1(8);
        return this.f139606b.readLong();
    }

    public short readShort() {
        t1(2);
        return this.f139606b.readShort();
    }

    public void t1(long j10) {
        if (!V0(j10)) {
            throw new EOFException();
        }
    }

    public String toString() {
        return "buffer(" + this.f139605a + ')';
    }

    public long u0(C16770e eVar, long j10) {
        C17542s.j(eVar, "sink");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (!this.f139607c) {
            if (this.f139606b.size() == 0) {
                if (i10 == 0) {
                    return 0;
                }
                if (this.f139605a.u0(this.f139606b, 8192) == -1) {
                    return -1;
                }
            }
            return this.f139606b.u0(eVar, Math.min(j10, this.f139606b.size()));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public String w2(Charset charset) {
        C17542s.j(charset, "charset");
        this.f139606b.Y(this.f139605a);
        return this.f139606b.w2(charset);
    }

    public O y() {
        return this.f139605a.y();
    }

    public int z1(C16760C c10) {
        C17542s.j(c10, "options");
        if (!this.f139607c) {
            while (true) {
                int g10 = C16834a.g(this.f139606b, c10, true);
                if (g10 == -2) {
                    if (this.f139605a.u0(this.f139606b, 8192) == -1) {
                        break;
                    }
                } else if (g10 != -1) {
                    this.f139606b.M((long) c10.p()[g10].W());
                    return g10;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"WK/H$a", "Ljava/io/InputStream;", "", "read", "()I", "", "data", "offset", "byteCount", "([BII)I", "available", "LXH/N;", "close", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "out", "", "transferTo", "(Ljava/io/OutputStream;)J", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.H$a */
    public static final class a extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16765H f139608a;

        a(C16765H h10) {
            this.f139608a = h10;
        }

        public int available() {
            C16765H h10 = this.f139608a;
            if (!h10.f139607c) {
                return (int) Math.min(h10.f139606b.size(), (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f139608a.close();
        }

        public int read() {
            C16765H h10 = this.f139608a;
            if (!h10.f139607c) {
                if (h10.f139606b.size() == 0) {
                    C16765H h11 = this.f139608a;
                    if (h11.f139605a.u0(h11.f139606b, 8192) == -1) {
                        return -1;
                    }
                }
                return this.f139608a.f139606b.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.f139608a + ".inputStream()";
        }

        public long transferTo(OutputStream outputStream) {
            C17542s.j(outputStream, "out");
            if (!this.f139608a.f139607c) {
                long j10 = 0;
                while (true) {
                    if (this.f139608a.f139606b.size() == 0) {
                        C16765H h10 = this.f139608a;
                        if (h10.f139605a.u0(h10.f139606b, 8192) == -1) {
                            return j10;
                        }
                    }
                    j10 += this.f139608a.f139606b.size();
                    C16770e.F1(this.f139608a.f139606b, outputStream, 0, 2, (Object) null);
                }
            } else {
                throw new IOException("closed");
            }
        }

        public int read(byte[] bArr, int i10, int i11) {
            C17542s.j(bArr, "data");
            if (!this.f139608a.f139607c) {
                C16767b.b((long) bArr.length, (long) i10, (long) i11);
                if (this.f139608a.f139606b.size() == 0) {
                    C16765H h10 = this.f139608a;
                    if (h10.f139605a.u0(h10.f139606b, 8192) == -1) {
                        return -1;
                    }
                }
                return this.f139608a.f139606b.e0(bArr, i10, i11);
            }
            throw new IOException("closed");
        }
    }
}
