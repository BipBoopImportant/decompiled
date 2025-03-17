package UK;

import HK.C15864d;
import WK.C16770e;
import WK.C16772g;
import WK.C16773h;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0016R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0016R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0016R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0004\u0018\u0001038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"LUK/g;", "Ljava/io/Closeable;", "", "isClient", "LWK/g;", "source", "LUK/g$a;", "frameCallback", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLWK/g;LUK/g$a;ZZ)V", "LXH/N;", "e", "()V", "d", "g", "h", "f", "c", "close", "a", "Z", "b", "LWK/g;", "getSource", "()LWK/g;", "LUK/g$a;", "closed", "", "I", "opcode", "", "J", "frameLength", "i", "isFinalFrame", "j", "isControlFrame", "k", "readingCompressedMessage", "LWK/e;", "l", "LWK/e;", "controlFrameBuffer", "m", "messageFrameBuffer", "LUK/c;", "n", "LUK/c;", "messageInflater", "", "o", "[B", "maskKey", "LWK/e$a;", "p", "LWK/e$a;", "maskCursor", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: UK.g  reason: case insensitive filesystem */
public final class C16640g implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f139233a;

    /* renamed from: b  reason: collision with root package name */
    private final C16772g f139234b;

    /* renamed from: c  reason: collision with root package name */
    private final a f139235c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f139236d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f139237e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f139238f;

    /* renamed from: g  reason: collision with root package name */
    private int f139239g;

    /* renamed from: h  reason: collision with root package name */
    private long f139240h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f139241i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f139242j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f139243k;

    /* renamed from: l  reason: collision with root package name */
    private final C16770e f139244l = new C16770e();

    /* renamed from: m  reason: collision with root package name */
    private final C16770e f139245m = new C16770e();

    /* renamed from: n  reason: collision with root package name */
    private C16636c f139246n;

    /* renamed from: o  reason: collision with root package name */
    private final byte[] f139247o;

    /* renamed from: p  reason: collision with root package name */
    private final C16770e.a f139248p;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LUK/g$a;", "", "", "text", "LXH/N;", "c", "(Ljava/lang/String;)V", "LWK/h;", "bytes", "d", "(LWK/h;)V", "payload", "g", "e", "", "code", "reason", "h", "(ILjava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: UK.g$a */
    public interface a {
        void c(String str);

        void d(C16773h hVar);

        void e(C16773h hVar);

        void g(C16773h hVar);

        void h(int i10, String str);
    }

    public C16640g(boolean z10, C16772g gVar, a aVar, boolean z11, boolean z12) {
        C17542s.j(gVar, "source");
        C17542s.j(aVar, "frameCallback");
        this.f139233a = z10;
        this.f139234b = gVar;
        this.f139235c = aVar;
        this.f139236d = z11;
        this.f139237e = z12;
        C16770e.a aVar2 = null;
        this.f139247o = z10 ? null : new byte[4];
        this.f139248p = !z10 ? new C16770e.a() : aVar2;
    }

    private final void d() {
        String str;
        short s10;
        long j10 = this.f139240h;
        if (j10 > 0) {
            this.f139234b.n1(this.f139244l, j10);
            if (!this.f139233a) {
                C16770e eVar = this.f139244l;
                C16770e.a aVar = this.f139248p;
                C17542s.g(aVar);
                eVar.f0(aVar);
                this.f139248p.f(0);
                C16639f fVar = C16639f.f139232a;
                C16770e.a aVar2 = this.f139248p;
                byte[] bArr = this.f139247o;
                C17542s.g(bArr);
                fVar.b(aVar2, bArr);
                this.f139248p.close();
            }
        }
        switch (this.f139239g) {
            case 8:
                long size = this.f139244l.size();
                if (size != 1) {
                    if (size != 0) {
                        s10 = this.f139244l.readShort();
                        str = this.f139244l.l0();
                        String a10 = C16639f.f139232a.a(s10);
                        if (a10 != null) {
                            throw new ProtocolException(a10);
                        }
                    } else {
                        s10 = 1005;
                        str = "";
                    }
                    this.f139235c.h(s10, str);
                    this.f139238f = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.f139235c.g(this.f139244l.i0());
                return;
            case 10:
                this.f139235c.e(this.f139244l.i0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + C15864d.S(this.f139239g));
        }
    }

    /* JADX INFO: finally extract failed */
    private final void e() {
        boolean z10;
        if (!this.f139238f) {
            long h10 = this.f139234b.y().h();
            this.f139234b.y().b();
            try {
                int d10 = C15864d.d(this.f139234b.readByte(), 255);
                this.f139234b.y().g(h10, TimeUnit.NANOSECONDS);
                int i10 = d10 & 15;
                this.f139239g = i10;
                boolean z11 = false;
                boolean z12 = (d10 & 128) != 0;
                this.f139241i = z12;
                boolean z13 = (d10 & 8) != 0;
                this.f139242j = z13;
                if (!z13 || z12) {
                    boolean z14 = (d10 & 64) != 0;
                    if (i10 == 1 || i10 == 2) {
                        if (!z14) {
                            z10 = false;
                        } else if (this.f139236d) {
                            z10 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                        this.f139243k = z10;
                    } else if (z14) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    if ((d10 & 32) != 0) {
                        throw new ProtocolException("Unexpected rsv2 flag");
                    } else if ((d10 & 16) == 0) {
                        int d11 = C15864d.d(this.f139234b.readByte(), 255);
                        if ((d11 & 128) != 0) {
                            z11 = true;
                        }
                        if (z11 == this.f139233a) {
                            throw new ProtocolException(this.f139233a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                        }
                        long j10 = (long) (d11 & 127);
                        this.f139240h = j10;
                        if (j10 == 126) {
                            this.f139240h = (long) C15864d.e(this.f139234b.readShort(), 65535);
                        } else if (j10 == 127) {
                            long readLong = this.f139234b.readLong();
                            this.f139240h = readLong;
                            if (readLong < 0) {
                                throw new ProtocolException("Frame length 0x" + C15864d.T(this.f139240h) + " > 0x7FFFFFFFFFFFFFFF");
                            }
                        }
                        if (this.f139242j && this.f139240h > 125) {
                            throw new ProtocolException("Control frame must be less than 125B.");
                        } else if (z11) {
                            C16772g gVar = this.f139234b;
                            byte[] bArr = this.f139247o;
                            C17542s.g(bArr);
                            gVar.readFully(bArr);
                        }
                    } else {
                        throw new ProtocolException("Unexpected rsv3 flag");
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th2) {
                this.f139234b.y().g(h10, TimeUnit.NANOSECONDS);
                throw th2;
            }
        } else {
            throw new IOException("closed");
        }
    }

    private final void f() {
        while (!this.f139238f) {
            long j10 = this.f139240h;
            if (j10 > 0) {
                this.f139234b.n1(this.f139245m, j10);
                if (!this.f139233a) {
                    C16770e eVar = this.f139245m;
                    C16770e.a aVar = this.f139248p;
                    C17542s.g(aVar);
                    eVar.f0(aVar);
                    this.f139248p.f(this.f139245m.size() - this.f139240h);
                    C16639f fVar = C16639f.f139232a;
                    C16770e.a aVar2 = this.f139248p;
                    byte[] bArr = this.f139247o;
                    C17542s.g(bArr);
                    fVar.b(aVar2, bArr);
                    this.f139248p.close();
                }
            }
            if (!this.f139241i) {
                h();
                if (this.f139239g != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + C15864d.S(this.f139239g));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    private final void g() {
        int i10 = this.f139239g;
        if (i10 == 1 || i10 == 2) {
            f();
            if (this.f139243k) {
                C16636c cVar = this.f139246n;
                if (cVar == null) {
                    cVar = new C16636c(this.f139237e);
                    this.f139246n = cVar;
                }
                cVar.c(this.f139245m);
            }
            if (i10 == 1) {
                this.f139235c.c(this.f139245m.l0());
            } else {
                this.f139235c.d(this.f139245m.i0());
            }
        } else {
            throw new ProtocolException("Unknown opcode: " + C15864d.S(i10));
        }
    }

    private final void h() {
        while (!this.f139238f) {
            e();
            if (this.f139242j) {
                d();
            } else {
                return;
            }
        }
    }

    public final void c() {
        e();
        if (this.f139242j) {
            d();
        } else {
            g();
        }
    }

    public void close() {
        C16636c cVar = this.f139246n;
        if (cVar != null) {
            cVar.close();
        }
    }
}
