package OK;

import HK.C15864d;
import OK.C16174d;
import WK.C16770e;
import WK.C16771f;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ;2\u00020\u0001:\u0001AB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u0010J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010!J/\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0011¢\u0006\u0004\b,\u0010\u0014J%\u00100\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\f2\u0006\u00102\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00107\u001a\u00020\n¢\u0006\u0004\b8\u0010\u000eJ-\u0010;\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\fH\u0016¢\u0006\u0004\b=\u0010\u0010J+\u0010?\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010ER\u0016\u0010H\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010GR\u0016\u0010I\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010DR\u0017\u0010N\u001a\u00020J8\u0006¢\u0006\f\n\u0004\b)\u0010K\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"LOK/j;", "Ljava/io/Closeable;", "LWK/f;", "sink", "", "client", "<init>", "(LWK/f;Z)V", "", "streamId", "", "byteCount", "LXH/N;", "u", "(IJ)V", "d", "()V", "LOK/m;", "peerSettings", "c", "(LOK/m;)V", "promisedStreamId", "", "LOK/c;", "requestHeaders", "o", "(IILjava/util/List;)V", "flush", "LOK/b;", "errorCode", "q", "(ILOK/b;)V", "l", "()I", "outFinished", "LWK/e;", "source", "e", "(ZILWK/e;I)V", "flags", "buffer", "f", "(IILWK/e;I)V", "settings", "s", "ack", "payload1", "payload2", "n", "(ZII)V", "lastGoodStreamId", "", "debugData", "h", "(ILOK/b;[B)V", "windowSizeIncrement", "t", "length", "type", "g", "(IIII)V", "close", "headerBlock", "i", "(ZILjava/util/List;)V", "a", "LWK/f;", "b", "Z", "LWK/e;", "hpackBuffer", "I", "maxFrameSize", "closed", "LOK/d$b;", "LOK/d$b;", "getHpackWriter", "()LOK/d$b;", "hpackWriter", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: OK.j  reason: case insensitive filesystem */
public final class C16180j implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    public static final a f137102g = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    private static final Logger f137103h = Logger.getLogger(C16175e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final C16771f f137104a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f137105b;

    /* renamed from: c  reason: collision with root package name */
    private final C16770e f137106c;

    /* renamed from: d  reason: collision with root package name */
    private int f137107d = 16384;

    /* renamed from: e  reason: collision with root package name */
    private boolean f137108e;

    /* renamed from: f  reason: collision with root package name */
    private final C16174d.b f137109f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LOK/j$a;", "", "<init>", "()V", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C16180j(C16771f fVar, boolean z10) {
        C17542s.j(fVar, "sink");
        this.f137104a = fVar;
        this.f137105b = z10;
        C16770e eVar = new C16770e();
        this.f137106c = eVar;
        this.f137109f = new C16174d.b(0, false, eVar, 3, (DefaultConstructorMarker) null);
    }

    private final void u(int i10, long j10) {
        while (j10 > 0) {
            long min = Math.min((long) this.f137107d, j10);
            j10 -= min;
            g(i10, (int) min, 9, j10 == 0 ? 4 : 0);
            this.f137104a.s3(this.f137106c, min);
        }
    }

    public final synchronized void c(m mVar) {
        try {
            C17542s.j(mVar, "peerSettings");
            if (!this.f137108e) {
                this.f137107d = mVar.e(this.f137107d);
                if (mVar.b() != -1) {
                    this.f137109f.e(mVar.b());
                }
                g(0, 0, 4, 1);
                this.f137104a.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void close() {
        this.f137108e = true;
        this.f137104a.close();
    }

    public final synchronized void d() {
        try {
            if (this.f137108e) {
                throw new IOException("closed");
            } else if (this.f137105b) {
                Logger logger = f137103h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C15864d.t(">> CONNECTION " + C16175e.f136972b.G(), new Object[0]));
                }
                this.f137104a.j2(C16175e.f136972b);
                this.f137104a.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e(boolean z10, int i10, C16770e eVar, int i11) {
        if (!this.f137108e) {
            f(i10, z10 ? 1 : 0, eVar, i11);
        } else {
            throw new IOException("closed");
        }
    }

    public final void f(int i10, int i11, C16770e eVar, int i12) {
        g(i10, i12, 0, i11);
        if (i12 > 0) {
            C16771f fVar = this.f137104a;
            C17542s.g(eVar);
            fVar.s3(eVar, (long) i12);
        }
    }

    public final synchronized void flush() {
        if (!this.f137108e) {
            this.f137104a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        Logger logger = f137103h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C16175e.f136971a.c(false, i10, i11, i12, i13));
        }
        if (i11 > this.f137107d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f137107d + ": " + i11).toString());
        } else if ((Integer.MIN_VALUE & i10) == 0) {
            C15864d.d0(this.f137104a, i11);
            this.f137104a.Z1(i12 & 255);
            this.f137104a.Z1(i13 & 255);
            this.f137104a.d0(i10 & Integer.MAX_VALUE);
        } else {
            throw new IllegalArgumentException(("reserved bit set: " + i10).toString());
        }
    }

    public final synchronized void h(int i10, C16172b bVar, byte[] bArr) {
        try {
            C17542s.j(bVar, "errorCode");
            C17542s.j(bArr, "debugData");
            if (this.f137108e) {
                throw new IOException("closed");
            } else if (bVar.b() != -1) {
                boolean z10 = false;
                g(0, bArr.length + 8, 7, 0);
                this.f137104a.d0(i10);
                this.f137104a.d0(bVar.b());
                if (bArr.length == 0) {
                    z10 = true;
                }
                if (!z10) {
                    this.f137104a.f1(bArr);
                }
                this.f137104a.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void i(boolean z10, int i10, List<C16173c> list) {
        C17542s.j(list, "headerBlock");
        if (!this.f137108e) {
            this.f137109f.g(list);
            long size = this.f137106c.size();
            long min = Math.min((long) this.f137107d, size);
            int i11 = (size > min ? 1 : (size == min ? 0 : -1));
            int i12 = i11 == 0 ? 4 : 0;
            if (z10) {
                i12 |= 1;
            }
            g(i10, (int) min, 1, i12);
            this.f137104a.s3(this.f137106c, min);
            if (i11 > 0) {
                u(i10, size - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int l() {
        return this.f137107d;
    }

    public final synchronized void n(boolean z10, int i10, int i11) {
        if (!this.f137108e) {
            g(0, 8, 6, z10 ? 1 : 0);
            this.f137104a.d0(i10);
            this.f137104a.d0(i11);
            this.f137104a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void o(int i10, int i11, List<C16173c> list) {
        C17542s.j(list, "requestHeaders");
        if (!this.f137108e) {
            this.f137109f.g(list);
            long size = this.f137106c.size();
            int min = (int) Math.min(((long) this.f137107d) - 4, size);
            int i12 = min + 4;
            long j10 = (long) min;
            int i13 = (size > j10 ? 1 : (size == j10 ? 0 : -1));
            g(i10, i12, 5, i13 == 0 ? 4 : 0);
            this.f137104a.d0(i11 & Integer.MAX_VALUE);
            this.f137104a.s3(this.f137106c, j10);
            if (i13 > 0) {
                u(i10, size - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void q(int i10, C16172b bVar) {
        C17542s.j(bVar, "errorCode");
        if (this.f137108e) {
            throw new IOException("closed");
        } else if (bVar.b() != -1) {
            g(i10, 4, 3, 0);
            this.f137104a.d0(bVar.b());
            this.f137104a.flush();
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final synchronized void s(m mVar) {
        try {
            C17542s.j(mVar, "settings");
            if (!this.f137108e) {
                int i10 = 0;
                g(0, mVar.i() * 6, 4, 0);
                while (i10 < 10) {
                    if (mVar.f(i10)) {
                        this.f137104a.J1(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                        this.f137104a.d0(mVar.a(i10));
                    }
                    i10++;
                }
                this.f137104a.flush();
            } else {
                throw new IOException("closed");
            }
        } finally {
        }
    }

    public final synchronized void t(int i10, long j10) {
        if (this.f137108e) {
            throw new IOException("closed");
        } else if (j10 == 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        } else {
            g(i10, 4, 8, 0);
            this.f137104a.d0((int) j10);
            this.f137104a.flush();
        }
    }
}
