package OK;

import HK.C15864d;
import OK.C16174d;
import WK.C16770e;
import WK.C16772g;
import WK.C16773h;
import WK.N;
import WK.O;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17972h;
import tI.C17978n;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0003'),B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J/\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J/\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J/\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J/\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J/\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J/\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0010J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u00100¨\u00062"}, d2 = {"LOK/h;", "Ljava/io/Closeable;", "LWK/g;", "source", "", "client", "<init>", "(LWK/g;Z)V", "LOK/h$c;", "handler", "", "length", "flags", "streamId", "LXH/N;", "i", "(LOK/h$c;III)V", "padding", "", "LOK/c;", "h", "(IIII)Ljava/util/List;", "f", "o", "n", "(LOK/h$c;I)V", "s", "t", "q", "l", "g", "u", "e", "(LOK/h$c;)V", "requireSettings", "d", "(ZLOK/h$c;)Z", "close", "()V", "a", "LWK/g;", "b", "Z", "LOK/h$b;", "c", "LOK/h$b;", "continuation", "LOK/d$a;", "LOK/d$a;", "hpackReader", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: OK.h  reason: case insensitive filesystem */
public final class C16178h implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f137062e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f137063f;

    /* renamed from: a  reason: collision with root package name */
    private final C16772g f137064a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f137065b;

    /* renamed from: c  reason: collision with root package name */
    private final b f137066c;

    /* renamed from: d  reason: collision with root package name */
    private final C16174d.a f137067d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOK/h$a;", "", "<init>", "()V", "", "length", "flags", "padding", "b", "(III)I", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return C16178h.f137063f;
        }

        public final int b(int i10, int i11, int i12) {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\"\u0010#\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\"\u0010%\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b$\u0010\u001bR\"\u0010(\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001b¨\u0006)"}, d2 = {"LOK/h$b;", "LWK/N;", "LWK/g;", "source", "<init>", "(LWK/g;)V", "LXH/N;", "d", "()V", "LWK/e;", "sink", "", "byteCount", "u0", "(LWK/e;J)J", "LWK/O;", "y", "()LWK/O;", "close", "a", "LWK/g;", "", "b", "I", "getLength", "()I", "g", "(I)V", "length", "c", "getFlags", "e", "flags", "getStreamId", "i", "streamId", "f", "left", "getPadding", "h", "padding", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.h$b */
    public static final class b implements N {

        /* renamed from: a  reason: collision with root package name */
        private final C16772g f137068a;

        /* renamed from: b  reason: collision with root package name */
        private int f137069b;

        /* renamed from: c  reason: collision with root package name */
        private int f137070c;

        /* renamed from: d  reason: collision with root package name */
        private int f137071d;

        /* renamed from: e  reason: collision with root package name */
        private int f137072e;

        /* renamed from: f  reason: collision with root package name */
        private int f137073f;

        public b(C16772g gVar) {
            C17542s.j(gVar, "source");
            this.f137068a = gVar;
        }

        private final void d() {
            int i10 = this.f137071d;
            int L10 = C15864d.L(this.f137068a);
            this.f137072e = L10;
            this.f137069b = L10;
            int d10 = C15864d.d(this.f137068a.readByte(), 255);
            this.f137070c = C15864d.d(this.f137068a.readByte(), 255);
            a aVar = C16178h.f137062e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(C16175e.f136971a.c(true, this.f137071d, this.f137069b, d10, this.f137070c));
            }
            int readInt = this.f137068a.readInt() & Integer.MAX_VALUE;
            this.f137071d = readInt;
            if (d10 != 9) {
                throw new IOException(d10 + " != TYPE_CONTINUATION");
            } else if (readInt != i10) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        public final int c() {
            return this.f137072e;
        }

        public void close() {
        }

        public final void e(int i10) {
            this.f137070c = i10;
        }

        public final void f(int i10) {
            this.f137072e = i10;
        }

        public final void g(int i10) {
            this.f137069b = i10;
        }

        public final void h(int i10) {
            this.f137073f = i10;
        }

        public final void i(int i10) {
            this.f137071d = i10;
        }

        public long u0(C16770e eVar, long j10) {
            C17542s.j(eVar, "sink");
            while (true) {
                int i10 = this.f137072e;
                if (i10 == 0) {
                    this.f137068a.M((long) this.f137073f);
                    this.f137073f = 0;
                    if ((this.f137070c & 4) != 0) {
                        return -1;
                    }
                    d();
                } else {
                    long u02 = this.f137068a.u0(eVar, Math.min(j10, (long) i10));
                    if (u02 == -1) {
                        return -1;
                    }
                    this.f137072e -= (int) u02;
                    return u02;
                }
            }
        }

        public O y() {
            return this.f137068a.y();
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J/\u0010.\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010/J-\u00102\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"LOK/h$c;", "", "", "inFinished", "", "streamId", "LWK/g;", "source", "length", "LXH/N;", "c", "(ZILWK/g;I)V", "associatedStreamId", "", "LOK/c;", "headerBlock", "a", "(ZIILjava/util/List;)V", "LOK/b;", "errorCode", "j", "(ILOK/b;)V", "clearPrevious", "LOK/m;", "settings", "e", "(ZLOK/m;)V", "i", "()V", "ack", "payload1", "payload2", "k", "(ZII)V", "lastGoodStreamId", "LWK/h;", "debugData", "f", "(ILOK/b;LWK/h;)V", "", "windowSizeIncrement", "b", "(IJ)V", "streamDependency", "weight", "exclusive", "m", "(IIIZ)V", "promisedStreamId", "requestHeaders", "h", "(IILjava/util/List;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.h$c */
    public interface c {
        void a(boolean z10, int i10, int i11, List<C16173c> list);

        void b(int i10, long j10);

        void c(boolean z10, int i10, C16772g gVar, int i11);

        void e(boolean z10, m mVar);

        void f(int i10, C16172b bVar, C16773h hVar);

        void h(int i10, int i11, List<C16173c> list);

        void i();

        void j(int i10, C16172b bVar);

        void k(boolean z10, int i10, int i11);

        void m(int i10, int i11, int i12, boolean z10);
    }

    static {
        Logger logger = Logger.getLogger(C16175e.class.getName());
        C17542s.i(logger, "getLogger(Http2::class.java.name)");
        f137063f = logger;
    }

    public C16178h(C16772g gVar, boolean z10) {
        C17542s.j(gVar, "source");
        this.f137064a = gVar;
        this.f137065b = z10;
        b bVar = new b(gVar);
        this.f137066c = bVar;
        this.f137067d = new C16174d.a(bVar, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 4, (DefaultConstructorMarker) null);
    }

    private final void f(c cVar, int i10, int i11, int i12) {
        if (i12 != 0) {
            int i13 = 0;
            boolean z10 = (i11 & 1) != 0;
            if ((i11 & 32) == 0) {
                if ((i11 & 8) != 0) {
                    i13 = C15864d.d(this.f137064a.readByte(), 255);
                }
                cVar.c(z10, i12, this.f137064a, f137062e.b(i10, i11, i13));
                this.f137064a.M((long) i13);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void g(c cVar, int i10, int i11, int i12) {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        } else if (i12 == 0) {
            int readInt = this.f137064a.readInt();
            int readInt2 = this.f137064a.readInt();
            int i13 = i10 - 8;
            C16172b a10 = C16172b.Companion.a(readInt2);
            if (a10 != null) {
                C16773h hVar = C16773h.f139665e;
                if (i13 > 0) {
                    hVar = this.f137064a.E1((long) i13);
                }
                cVar.f(readInt, a10, hVar);
                return;
            }
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    private final List<C16173c> h(int i10, int i11, int i12, int i13) {
        this.f137066c.f(i10);
        b bVar = this.f137066c;
        bVar.g(bVar.c());
        this.f137066c.h(i11);
        this.f137066c.e(i12);
        this.f137066c.i(i13);
        this.f137067d.k();
        return this.f137067d.e();
    }

    private final void i(c cVar, int i10, int i11, int i12) {
        if (i12 != 0) {
            int i13 = 0;
            boolean z10 = (i11 & 1) != 0;
            if ((i11 & 8) != 0) {
                i13 = C15864d.d(this.f137064a.readByte(), 255);
            }
            if ((i11 & 32) != 0) {
                n(cVar, i12);
                i10 -= 5;
            }
            cVar.a(z10, i12, -1, h(f137062e.b(i10, i11, i13), i13, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void l(c cVar, int i10, int i11, int i12) {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        } else if (i12 == 0) {
            int readInt = this.f137064a.readInt();
            int readInt2 = this.f137064a.readInt();
            boolean z10 = true;
            if ((i11 & 1) == 0) {
                z10 = false;
            }
            cVar.k(z10, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    private final void n(c cVar, int i10) {
        int readInt = this.f137064a.readInt();
        cVar.m(i10, readInt & Integer.MAX_VALUE, C15864d.d(this.f137064a.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private final void o(c cVar, int i10, int i11, int i12) {
        if (i10 != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        } else if (i12 != 0) {
            n(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    private final void q(c cVar, int i10, int i11, int i12) {
        if (i12 != 0) {
            int d10 = (i11 & 8) != 0 ? C15864d.d(this.f137064a.readByte(), 255) : 0;
            cVar.h(i12, this.f137064a.readInt() & Integer.MAX_VALUE, h(f137062e.b(i10 - 4, i11, d10), d10, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void s(c cVar, int i10, int i11, int i12) {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        } else if (i12 != 0) {
            int readInt = this.f137064a.readInt();
            C16172b a10 = C16172b.Companion.a(readInt);
            if (a10 != null) {
                cVar.j(i12, a10);
                return;
            }
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    private final void t(c cVar, int i10, int i11, int i12) {
        int readInt;
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        } else if ((i11 & 1) != 0) {
            if (i10 == 0) {
                cVar.i();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i10 % 6 == 0) {
            m mVar = new m();
            C17972h v10 = C17978n.v(C17978n.w(0, i10), 6);
            int p10 = v10.p();
            int q10 = v10.q();
            int s10 = v10.s();
            if ((s10 > 0 && p10 <= q10) || (s10 < 0 && q10 <= p10)) {
                while (true) {
                    int e10 = C15864d.e(this.f137064a.readShort(), 65535);
                    readInt = this.f137064a.readInt();
                    if (e10 != 2) {
                        if (e10 == 3) {
                            e10 = 4;
                        } else if (e10 != 4) {
                            if (e10 == 5 && (readInt < 16384 || readInt > 16777215)) {
                            }
                        } else if (readInt >= 0) {
                            e10 = 7;
                        } else {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                    } else if (!(readInt == 0 || readInt == 1)) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    mVar.h(e10, readInt);
                    if (p10 == q10) {
                        break;
                    }
                    p10 += s10;
                }
                throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
            }
            cVar.e(false, mVar);
        } else {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i10);
        }
    }

    private final void u(c cVar, int i10, int i11, int i12) {
        if (i10 == 4) {
            long f10 = C15864d.f(this.f137064a.readInt(), 2147483647L);
            if (f10 != 0) {
                cVar.b(i12, f10);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
    }

    public void close() {
        this.f137064a.close();
    }

    public final boolean d(boolean z10, c cVar) {
        C17542s.j(cVar, "handler");
        try {
            this.f137064a.t1(9);
            int L10 = C15864d.L(this.f137064a);
            if (L10 <= 16384) {
                int d10 = C15864d.d(this.f137064a.readByte(), 255);
                int d11 = C15864d.d(this.f137064a.readByte(), 255);
                int readInt = this.f137064a.readInt() & Integer.MAX_VALUE;
                Logger logger = f137063f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C16175e.f136971a.c(true, readInt, L10, d10, d11));
                }
                if (!z10 || d10 == 4) {
                    switch (d10) {
                        case 0:
                            f(cVar, L10, d11, readInt);
                            return true;
                        case 1:
                            i(cVar, L10, d11, readInt);
                            return true;
                        case 2:
                            o(cVar, L10, d11, readInt);
                            return true;
                        case 3:
                            s(cVar, L10, d11, readInt);
                            return true;
                        case 4:
                            t(cVar, L10, d11, readInt);
                            return true;
                        case 5:
                            q(cVar, L10, d11, readInt);
                            return true;
                        case 6:
                            l(cVar, L10, d11, readInt);
                            return true;
                        case 7:
                            g(cVar, L10, d11, readInt);
                            return true;
                        case 8:
                            u(cVar, L10, d11, readInt);
                            return true;
                        default:
                            this.f137064a.M((long) L10);
                            return true;
                    }
                } else {
                    throw new IOException("Expected a SETTINGS frame but was " + C16175e.f136971a.b(d10));
                }
            } else {
                throw new IOException("FRAME_SIZE_ERROR: " + L10);
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void e(c cVar) {
        C17542s.j(cVar, "handler");
        if (!this.f137065b) {
            C16772g gVar = this.f137064a;
            C16773h hVar = C16175e.f136972b;
            C16773h E12 = gVar.E1((long) hVar.W());
            Logger logger = f137063f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C15864d.t("<< CONNECTION " + E12.G(), new Object[0]));
            }
            if (!C17542s.e(hVar, E12)) {
                throw new IOException("Expected a connection header but was " + E12.c0());
            }
        } else if (!d(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }
}
