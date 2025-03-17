package RH;

import HJ.C15838d;
import PH.C16189c;
import SH.C16416a;
import SH.C16417b;
import SH.e;
import SH.f;
import TH.C16492f;
import XH.C16814e;
import XH.C16820k;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b#\b'\u0018\u00002\u00060\u0001j\u0002`\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH$¢\u0006\u0004\b%\u0010\nJ\r\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\nJ\u0011\u0010'\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020\u000b¢\u0006\u0004\b,\u0010\nJ\u0017\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0015H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102J)\u00105\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u00106J\u0015\u00109\u001a\u00020\u000b2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u0006H\u0000¢\u0006\u0004\b<\u0010*J\u001d\u0010?\u001a\u00020\u000b2\u0006\u0010=\u001a\u0002072\u0006\u0010\r\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u000b¢\u0006\u0004\bA\u0010\nJ\u0017\u0010B\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0011H\u0001¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u000bH\u0001¢\u0006\u0004\bD\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\nR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0004X\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010JR+\u0010R\u001a\u00020\u001f8\u0000@\u0000X\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bD\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010X\u001a\u00020\u00118\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b.\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010[\u001a\u00020\u00118\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b1\u0010S\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR\u0016\u0010\\\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010SR\u0016\u0010]\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010SR\u0014\u0010_\u001a\u00020\u00118DX\u0004¢\u0006\u0006\u001a\u0004\b^\u0010UR\u0014\u0010\u000f\u001a\u00020\u00068@X\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u000e\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006a"}, d2 = {"LRH/s;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "LTH/f;", "LSH/a;", "pool", "<init>", "(LTH/f;)V", "()V", "LXH/N;", "t", "n", "()LSH/a;", "head", "newTail", "", "chainedSizeDelta", "i", "(LSH/a;LSH/a;I)V", "", "c", "l", "(C)V", "tail", "foreignStolen", "i0", "(LSH/a;LSH/a;LTH/f;)V", "j0", "(LSH/a;LSH/a;)V", "LPH/c;", "source", "offset", "length", "s", "(Ljava/nio/ByteBuffer;II)V", "q", "flush", "U", "buffer", "o", "(LSH/a;)V", "h", "close", "value", "e", "(C)LRH/s;", "", "f", "(Ljava/lang/CharSequence;)LRH/s;", "startIndex", "endIndex", "g", "(Ljava/lang/CharSequence;II)LRH/s;", "LRH/k;", "packet", "f0", "(LRH/k;)V", "chunkBuffer", "e0", "p", "", "h0", "(LRH/k;J)V", "J", "F", "(I)LSH/a;", "d", "a", "LTH/f;", "v", "()LTH/f;", "b", "LSH/a;", "_head", "_tail", "Ljava/nio/ByteBuffer;", "x", "()Ljava/nio/ByteBuffer;", "setTailMemory-3GNKZMM$ktor_io", "(Ljava/nio/ByteBuffer;)V", "tailMemory", "I", "z", "()I", "N", "(I)V", "tailPosition", "w", "setTailEndExclusive$ktor_io", "tailEndExclusive", "tailInitialPosition", "chainedSize", "B", "_size", "u", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public abstract class s implements Appendable, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final C16492f<C16416a> f137980a;

    /* renamed from: b  reason: collision with root package name */
    private C16416a f137981b;

    /* renamed from: c  reason: collision with root package name */
    private C16416a f137982c;

    /* renamed from: d  reason: collision with root package name */
    private ByteBuffer f137983d;

    /* renamed from: e  reason: collision with root package name */
    private int f137984e;

    /* renamed from: f  reason: collision with root package name */
    private int f137985f;

    /* renamed from: g  reason: collision with root package name */
    private int f137986g;

    /* renamed from: h  reason: collision with root package name */
    private int f137987h;

    public s(C16492f<C16416a> fVar) {
        C17542s.j(fVar, "pool");
        this.f137980a = fVar;
        this.f137983d = C16189c.f137148a.a();
    }

    private final void i(C16416a aVar, C16416a aVar2, int i10) {
        C16416a aVar3 = this.f137982c;
        if (aVar3 == null) {
            this.f137981b = aVar;
            this.f137987h = 0;
        } else {
            aVar3.F(aVar);
            int i11 = this.f137984e;
            aVar3.b(i11);
            this.f137987h += i11 - this.f137986g;
        }
        this.f137982c = aVar2;
        this.f137987h += i10;
        this.f137983d = aVar2.h();
        this.f137984e = aVar2.k();
        this.f137986g = aVar2.i();
        this.f137985f = aVar2.g();
    }

    private final void i0(C16416a aVar, C16416a aVar2, C16492f<C16416a> fVar) {
        aVar.b(this.f137984e);
        int k10 = aVar.k() - aVar.i();
        int k11 = aVar2.k() - aVar2.i();
        int a10 = v.a();
        if (k11 >= a10 || k11 > (aVar.f() - aVar.g()) + (aVar.g() - aVar.k())) {
            k11 = -1;
        }
        if (k10 >= a10 || k10 > aVar2.j() || !C16417b.a(aVar2)) {
            k10 = -1;
        }
        if (k11 == -1 && k10 == -1) {
            h(aVar2);
        } else if (k10 == -1 || k11 <= k10) {
            C16369b.a(aVar, aVar2, (aVar.g() - aVar.k()) + (aVar.f() - aVar.g()));
            d();
            C16416a y10 = aVar2.y();
            if (y10 != null) {
                h(y10);
            }
            aVar2.D(fVar);
        } else if (k11 == -1 || k10 < k11) {
            j0(aVar2, aVar);
        } else {
            throw new IllegalStateException("prep = " + k10 + ", app = " + k11);
        }
    }

    private final void j0(C16416a aVar, C16416a aVar2) {
        C16369b.c(aVar, aVar2);
        C16416a aVar3 = this.f137981b;
        if (aVar3 != null) {
            if (aVar3 == aVar2) {
                this.f137981b = aVar;
            } else {
                while (true) {
                    C16416a A10 = aVar3.A();
                    C17542s.g(A10);
                    if (A10 == aVar2) {
                        break;
                    }
                    aVar3 = A10;
                }
                aVar3.F(aVar);
            }
            aVar2.D(this.f137980a);
            this.f137982c = C16375h.c(aVar);
            return;
        }
        throw new IllegalStateException("head should't be null since it is already handled in the fast-path");
    }

    private final void l(char c10) {
        int i10 = 3;
        C16416a F10 = F(3);
        try {
            ByteBuffer h10 = F10.h();
            int k10 = F10.k();
            if (c10 >= 0 && c10 < 128) {
                h10.put(k10, (byte) c10);
                i10 = 1;
            } else if (128 <= c10 && c10 < 2048) {
                h10.put(k10, (byte) (((c10 >> 6) & 31) | 192));
                h10.put(k10 + 1, (byte) ((c10 & '?') | 128));
                i10 = 2;
            } else if (2048 <= c10 && c10 < 0) {
                h10.put(k10, (byte) (((c10 >> 12) & 15) | 224));
                h10.put(k10 + 1, (byte) (((c10 >> 6) & 63) | 128));
                h10.put(k10 + 2, (byte) ((c10 & '?') | 128));
            } else if (0 > c10 || c10 >= 0) {
                f.j(c10);
                throw new C16820k();
            } else {
                h10.put(k10, (byte) (((c10 >> 18) & 7) | 240));
                h10.put(k10 + 1, (byte) (((c10 >> 12) & 63) | 128));
                h10.put(k10 + 2, (byte) (((c10 >> 6) & 63) | 128));
                h10.put(k10 + 3, (byte) ((c10 & '?') | 128));
                i10 = 4;
            }
            F10.a(i10);
            if (i10 >= 0) {
                d();
                return;
            }
            throw new IllegalStateException("The returned value shouldn't be negative");
        } catch (Throwable th2) {
            d();
            throw th2;
        }
    }

    private final C16416a n() {
        C16416a Q12 = this.f137980a.Q1();
        Q12.p(8);
        o(Q12);
        return Q12;
    }

    private final void t() {
        C16416a U10 = U();
        if (U10 != null) {
            C16416a aVar = U10;
            do {
                try {
                    s(aVar.h(), aVar.i(), aVar.k() - aVar.i());
                    aVar = aVar.A();
                } finally {
                    C16375h.d(U10, this.f137980a);
                }
            } while (aVar != null);
        }
    }

    /* access modifiers changed from: protected */
    public final int B() {
        return this.f137987h + (this.f137984e - this.f137986g);
    }

    public final C16416a F(int i10) {
        C16416a aVar;
        if (w() - z() < i10 || (aVar = this.f137982c) == null) {
            return n();
        }
        aVar.b(this.f137984e);
        return aVar;
    }

    public final void J() {
        close();
    }

    public final void N(int i10) {
        this.f137984e = i10;
    }

    public final C16416a U() {
        C16416a aVar = this.f137981b;
        if (aVar == null) {
            return null;
        }
        C16416a aVar2 = this.f137982c;
        if (aVar2 != null) {
            aVar2.b(this.f137984e);
        }
        this.f137981b = null;
        this.f137982c = null;
        this.f137984e = 0;
        this.f137985f = 0;
        this.f137986g = 0;
        this.f137987h = 0;
        this.f137983d = C16189c.f137148a.a();
        return aVar;
    }

    public final void c() {
        C16416a u10 = u();
        if (u10 == C16416a.f138260j.a()) {
            return;
        }
        if (u10.A() == null) {
            u10.s();
            u10.p(8);
            int k10 = u10.k();
            this.f137984e = k10;
            this.f137986g = k10;
            this.f137985f = u10.g();
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void close() {
        try {
            flush();
        } finally {
            q();
        }
    }

    public final void d() {
        C16416a aVar = this.f137982c;
        if (aVar != null) {
            this.f137984e = aVar.k();
        }
    }

    /* renamed from: e */
    public s append(char c10) {
        int i10 = this.f137984e;
        int i11 = 3;
        if (this.f137985f - i10 >= 3) {
            ByteBuffer byteBuffer = this.f137983d;
            if (c10 >= 0 && c10 < 128) {
                byteBuffer.put(i10, (byte) c10);
                i11 = 1;
            } else if (128 <= c10 && c10 < 2048) {
                byteBuffer.put(i10, (byte) (((c10 >> 6) & 31) | 192));
                byteBuffer.put(i10 + 1, (byte) ((c10 & '?') | 128));
                i11 = 2;
            } else if (2048 <= c10 && c10 < 0) {
                byteBuffer.put(i10, (byte) (((c10 >> 12) & 15) | 224));
                byteBuffer.put(i10 + 1, (byte) (((c10 >> 6) & 63) | 128));
                byteBuffer.put(i10 + 2, (byte) ((c10 & '?') | 128));
            } else if (0 > c10 || c10 >= 0) {
                f.j(c10);
                throw new C16820k();
            } else {
                byteBuffer.put(i10, (byte) (((c10 >> 18) & 7) | 240));
                byteBuffer.put(i10 + 1, (byte) (((c10 >> 12) & 63) | 128));
                byteBuffer.put(i10 + 2, (byte) (((c10 >> 6) & 63) | 128));
                byteBuffer.put(i10 + 3, (byte) ((c10 & '?') | 128));
                i11 = 4;
            }
            this.f137984e = i10 + i11;
            return this;
        }
        l(c10);
        return this;
    }

    public final void e0(C16416a aVar) {
        C17542s.j(aVar, "chunkBuffer");
        C16416a aVar2 = this.f137982c;
        if (aVar2 == null) {
            h(aVar);
        } else {
            i0(aVar2, aVar, this.f137980a);
        }
    }

    /* renamed from: f */
    public s append(CharSequence charSequence) {
        if (charSequence == null) {
            append("null", 0, 4);
        } else {
            append(charSequence, 0, charSequence.length());
        }
        return this;
    }

    public final void f0(k kVar) {
        C17542s.j(kVar, "packet");
        C16416a W02 = kVar.W0();
        if (W02 == null) {
            kVar.O0();
            return;
        }
        C16416a aVar = this.f137982c;
        if (aVar == null) {
            h(W02);
        } else {
            i0(aVar, W02, kVar.h0());
        }
    }

    public final void flush() {
        t();
    }

    /* renamed from: g */
    public s append(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            return append("null", i10, i11);
        }
        w.h(this, charSequence, i10, i11, C15838d.f135279b);
        return this;
    }

    public final void h(C16416a aVar) {
        C17542s.j(aVar, "head");
        C16416a c10 = C16375h.c(aVar);
        long e10 = C16375h.e(aVar) - ((long) (c10.k() - c10.i()));
        if (e10 < 2147483647L) {
            i(aVar, c10, (int) e10);
        } else {
            e.a(e10, "total size increase");
            throw new C16820k();
        }
    }

    public final void h0(k kVar, long j10) {
        int i10;
        int k10;
        C17542s.j(kVar, "p");
        while (j10 > 0) {
            long U10 = (long) (kVar.U() - kVar.f0());
            if (U10 <= j10) {
                j10 -= U10;
                C16416a T02 = kVar.T0();
                if (T02 != null) {
                    o(T02);
                } else {
                    throw new EOFException("Unexpected end of packet");
                }
            } else {
                C16416a t02 = kVar.t0(1);
                if (t02 != null) {
                    int i11 = t02.i();
                    try {
                        t.a(this, t02, (int) j10);
                        if (i10 < i11) {
                            throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                        } else if (i10 != k10) {
                            kVar.Q0(i10);
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        i10 = t02.i();
                        if (i10 >= i11) {
                            if (i10 == t02.k()) {
                                kVar.t(t02);
                            } else {
                                kVar.Q0(i10);
                            }
                            throw th;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                } else {
                    w.a(1);
                    throw new C16820k();
                }
            }
        }
    }

    public final void o(C16416a aVar) {
        C17542s.j(aVar, "buffer");
        if (aVar.A() == null) {
            i(aVar, aVar, 0);
            return;
        }
        throw new IllegalStateException("It should be a single buffer chunk.");
    }

    /* access modifiers changed from: protected */
    public abstract void q();

    /* access modifiers changed from: protected */
    public abstract void s(ByteBuffer byteBuffer, int i10, int i11);

    public final C16416a u() {
        C16416a aVar = this.f137981b;
        return aVar == null ? C16416a.f138260j.a() : aVar;
    }

    /* access modifiers changed from: protected */
    public final C16492f<C16416a> v() {
        return this.f137980a;
    }

    public final int w() {
        return this.f137985f;
    }

    public final ByteBuffer x() {
        return this.f137983d;
    }

    public final int z() {
        return this.f137984e;
    }

    public s() {
        this(C16416a.f138260j.c());
    }
}
