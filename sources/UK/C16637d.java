package UK;

import GK.C15773A;
import GK.C15774B;
import GK.C15776D;
import GK.C15780H;
import GK.C15781I;
import GK.C15786e;
import GK.C15787f;
import GK.C15799r;
import GK.z;
import HJ.C15854t;
import HK.C15864d;
import KK.C15993a;
import KK.C15996d;
import UK.C16640g;
import WK.C16771f;
import WK.C16772g;
import WK.C16773h;
import XH.C16807N;
import YH.C16877v;
import com.optimizely.ab.config.Group;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17974j;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\u0018\u0000 {2\u00020\u00012\u00020\u0002:\u0005=?148BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010!\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J!\u0010'\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b'\u0010(J\u001d\u0010-\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u001b¢\u0006\u0004\b/\u0010\u001dJ\u0017\u00101\u001a\u00020\u001b2\u0006\u00100\u001a\u00020)H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u0015H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u0015H\u0016¢\u0006\u0004\b7\u00105J\u0017\u00108\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u0015H\u0016¢\u0006\u0004\b8\u00105J\u001f\u0010;\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020)H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00122\u0006\u00100\u001a\u00020)H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0015H\u0016¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u00172\b\u0010:\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\bA\u0010BJ'\u0010D\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u00172\b\u0010:\u001a\u0004\u0018\u00010)2\u0006\u0010C\u001a\u00020\u000b¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0012H\u0000¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u001bH\u0000¢\u0006\u0004\bH\u0010\u001dJ#\u0010K\u001a\u00020\u001b2\n\u00108\u001a\u00060Ij\u0002`J2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010MR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b?\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010QR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010RR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u0010SR\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010RR\u0014\u0010U\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010WR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010h\u001a\u00020e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010TR\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010iR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00150j8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010kR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020m0j8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010kR\u0016\u0010o\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010RR\u0016\u0010q\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010pR\u0016\u0010s\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010rR\u0018\u0010t\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010TR\u0016\u0010u\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010pR\u0016\u0010v\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010rR\u0016\u0010w\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010rR\u0016\u0010x\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010rR\u0016\u0010z\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\by\u0010p¨\u0006|"}, d2 = {"LUK/d;", "LGK/H;", "LUK/g$a;", "LKK/e;", "taskRunner", "LGK/B;", "originalRequest", "LGK/I;", "listener", "Ljava/util/Random;", "random", "", "pingIntervalMillis", "LUK/e;", "extensions", "minimumDeflateSize", "<init>", "(LKK/e;LGK/B;LGK/I;Ljava/util/Random;JLUK/e;J)V", "", "s", "(LUK/e;)Z", "LWK/h;", "data", "", "formatOpcode", "v", "(LWK/h;I)Z", "LXH/N;", "u", "()V", "cancel", "LGK/z;", "client", "o", "(LGK/z;)V", "LGK/D;", "response", "LLK/c;", "exchange", "m", "(LGK/D;LLK/c;)V", "", "name", "LUK/d$d;", "streams", "r", "(Ljava/lang/String;LUK/d$d;)V", "t", "text", "c", "(Ljava/lang/String;)V", "bytes", "d", "(LWK/h;)V", "payload", "g", "e", "code", "reason", "h", "(ILjava/lang/String;)V", "a", "(Ljava/lang/String;)Z", "b", "(LWK/h;)Z", "f", "(ILjava/lang/String;)Z", "cancelAfterCloseMillis", "n", "(ILjava/lang/String;J)Z", "w", "()Z", "x", "Ljava/lang/Exception;", "Lkotlin/Exception;", "p", "(Ljava/lang/Exception;LGK/D;)V", "LGK/B;", "LGK/I;", "q", "()LGK/I;", "Ljava/util/Random;", "J", "LUK/e;", "Ljava/lang/String;", "key", "LGK/e;", "LGK/e;", "call", "LKK/a;", "i", "LKK/a;", "writerTask", "LUK/g;", "j", "LUK/g;", "reader", "LUK/h;", "k", "LUK/h;", "writer", "LKK/d;", "l", "LKK/d;", "taskQueue", "LUK/d$d;", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "pongQueue", "", "messageAndCloseQueue", "queueSize", "Z", "enqueuedClose", "I", "receivedCloseCode", "receivedCloseReason", "failed", "sentPingCount", "receivedPingCount", "receivedPongCount", "y", "awaitingPong", "z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: UK.d  reason: case insensitive filesystem */
public final class C16637d implements C15780H, C16640g.a {

    /* renamed from: A  reason: collision with root package name */
    private static final List<C15773A> f139184A = C16877v.e(C15773A.HTTP_1_1);

    /* renamed from: z  reason: collision with root package name */
    public static final b f139185z = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C15774B f139186a;

    /* renamed from: b  reason: collision with root package name */
    private final C15781I f139187b;

    /* renamed from: c  reason: collision with root package name */
    private final Random f139188c;

    /* renamed from: d  reason: collision with root package name */
    private final long f139189d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public C16638e f139190e;

    /* renamed from: f  reason: collision with root package name */
    private long f139191f;

    /* renamed from: g  reason: collision with root package name */
    private final String f139192g;

    /* renamed from: h  reason: collision with root package name */
    private C15786e f139193h;

    /* renamed from: i  reason: collision with root package name */
    private C15993a f139194i;

    /* renamed from: j  reason: collision with root package name */
    private C16640g f139195j;

    /* renamed from: k  reason: collision with root package name */
    private C16641h f139196k;

    /* renamed from: l  reason: collision with root package name */
    private C15996d f139197l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public String f139198m;

    /* renamed from: n  reason: collision with root package name */
    private C3407d f139199n;

    /* renamed from: o  reason: collision with root package name */
    private final ArrayDeque<C16773h> f139200o = new ArrayDeque<>();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final ArrayDeque<Object> f139201p = new ArrayDeque<>();

    /* renamed from: q  reason: collision with root package name */
    private long f139202q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f139203r;

    /* renamed from: s  reason: collision with root package name */
    private int f139204s = -1;

    /* renamed from: t  reason: collision with root package name */
    private String f139205t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f139206u;

    /* renamed from: v  reason: collision with root package name */
    private int f139207v;

    /* renamed from: w  reason: collision with root package name */
    private int f139208w;

    /* renamed from: x  reason: collision with root package name */
    private int f139209x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f139210y;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"LUK/d$a;", "", "", "code", "LWK/h;", "reason", "", "cancelAfterCloseMillis", "<init>", "(ILWK/h;J)V", "a", "I", "b", "()I", "LWK/h;", "c", "()LWK/h;", "J", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: UK.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f139211a;

        /* renamed from: b  reason: collision with root package name */
        private final C16773h f139212b;

        /* renamed from: c  reason: collision with root package name */
        private final long f139213c;

        public a(int i10, C16773h hVar, long j10) {
            this.f139211a = i10;
            this.f139212b = hVar;
            this.f139213c = j10;
        }

        public final long a() {
            return this.f139213c;
        }

        public final int b() {
            return this.f139211a;
        }

        public final C16773h c() {
            return this.f139212b;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LUK/d$b;", "", "<init>", "()V", "", "CANCEL_AFTER_CLOSE_MILLIS", "J", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "", "LGK/A;", "ONLY_HTTP1", "Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: UK.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"LUK/d$c;", "", "", "formatOpcode", "LWK/h;", "data", "<init>", "(ILWK/h;)V", "a", "I", "b", "()I", "LWK/h;", "()LWK/h;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: UK.d$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f139214a;

        /* renamed from: b  reason: collision with root package name */
        private final C16773h f139215b;

        public c(int i10, C16773h hVar) {
            C17542s.j(hVar, "data");
            this.f139214a = i10;
            this.f139215b = hVar;
        }

        public final C16773h a() {
            return this.f139215b;
        }

        public final int b() {
            return this.f139214a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LUK/d$d;", "Ljava/io/Closeable;", "", "client", "LWK/g;", "source", "LWK/f;", "sink", "<init>", "(ZLWK/g;LWK/f;)V", "a", "Z", "c", "()Z", "b", "LWK/g;", "e", "()LWK/g;", "LWK/f;", "d", "()LWK/f;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: UK.d$d  reason: collision with other inner class name */
    public static abstract class C3407d implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f139216a;

        /* renamed from: b  reason: collision with root package name */
        private final C16772g f139217b;

        /* renamed from: c  reason: collision with root package name */
        private final C16771f f139218c;

        public C3407d(boolean z10, C16772g gVar, C16771f fVar) {
            C17542s.j(gVar, "source");
            C17542s.j(fVar, "sink");
            this.f139216a = z10;
            this.f139217b = gVar;
            this.f139218c = fVar;
        }

        public final boolean c() {
            return this.f139216a;
        }

        public final C16771f d() {
            return this.f139218c;
        }

        public final C16772g e() {
            return this.f139217b;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LUK/d$e;", "LKK/a;", "<init>", "(LUK/d;)V", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: UK.d$e */
    private final class e extends C15993a {
        public e() {
            super(C16637d.this.f139198m + " writer", false, 2, (DefaultConstructorMarker) null);
        }

        public long f() {
            try {
                return C16637d.this.w() ? 0 : -1;
            } catch (IOException e10) {
                C16637d.this.p(e10, (C15776D) null);
                return -1;
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"UK/d$f", "LGK/f;", "LGK/e;", "call", "LGK/D;", "response", "LXH/N;", "e", "(LGK/e;LGK/D;)V", "Ljava/io/IOException;", "c", "(LGK/e;Ljava/io/IOException;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: UK.d$f */
    public static final class f implements C15787f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16637d f139220a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15774B f139221b;

        f(C16637d dVar, C15774B b10) {
            this.f139220a = dVar;
            this.f139221b = b10;
        }

        public void c(C15786e eVar, IOException iOException) {
            C17542s.j(eVar, "call");
            C17542s.j(iOException, "e");
            this.f139220a.p(iOException, (C15776D) null);
        }

        public void e(C15786e eVar, C15776D d10) {
            C17542s.j(eVar, "call");
            C17542s.j(d10, "response");
            LK.c h10 = d10.h();
            try {
                this.f139220a.m(d10, h10);
                C17542s.g(h10);
                C3407d n10 = h10.n();
                C16638e a10 = C16638e.f139225g.a(d10.q());
                this.f139220a.f139190e = a10;
                if (!this.f139220a.s(a10)) {
                    C16637d dVar = this.f139220a;
                    synchronized (dVar) {
                        dVar.f139201p.clear();
                        dVar.f(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    this.f139220a.r(C15864d.f135364i + " WebSocket " + this.f139221b.k().r(), n10);
                    this.f139220a.q().g(this.f139220a, d10);
                    this.f139220a.t();
                } catch (Exception e10) {
                    this.f139220a.p(e10, (C15776D) null);
                }
            } catch (IOException e11) {
                this.f139220a.p(e11, d10);
                C15864d.m(d10);
                if (h10 != null) {
                    h10.v();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"UK/d$g", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: UK.d$g */
    public static final class g extends C15993a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16637d f139222e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f139223f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str, C16637d dVar, long j10) {
            super(str, false, 2, (DefaultConstructorMarker) null);
            this.f139222e = dVar;
            this.f139223f = j10;
        }

        public long f() {
            this.f139222e.x();
            return this.f139223f;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"KK/c", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: UK.d$h */
    public static final class h extends C15993a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16637d f139224e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, C16637d dVar) {
            super(str, z10);
            this.f139224e = dVar;
        }

        public long f() {
            this.f139224e.cancel();
            return -1;
        }
    }

    public C16637d(KK.e eVar, C15774B b10, C15781I i10, Random random, long j10, C16638e eVar2, long j11) {
        C17542s.j(eVar, "taskRunner");
        C17542s.j(b10, "originalRequest");
        C17542s.j(i10, "listener");
        C17542s.j(random, Group.RANDOM_POLICY);
        this.f139186a = b10;
        this.f139187b = i10;
        this.f139188c = random;
        this.f139189d = j10;
        this.f139190e = eVar2;
        this.f139191f = j11;
        this.f139197l = eVar.i();
        if (C17542s.e("GET", b10.h())) {
            C16773h.a aVar = C16773h.f139664d;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            C16807N n10 = C16807N.f139792a;
            this.f139192g = C16773h.a.f(aVar, bArr, 0, 0, 3, (Object) null).a();
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + b10.h()).toString());
    }

    /* access modifiers changed from: private */
    public final boolean s(C16638e eVar) {
        if (!eVar.f139231f && eVar.f139227b == null) {
            return eVar.f139229d == null || new C17974j(8, 15).A(eVar.f139229d.intValue());
        }
        return false;
    }

    private final void u() {
        if (!C15864d.f135363h || Thread.holdsLock(this)) {
            C15993a aVar = this.f139194i;
            if (aVar != null) {
                C15996d.j(this.f139197l, aVar, 0, 2, (Object) null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean v(WK.C16773h r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f139206u     // Catch:{ all -> 0x0022 }
            r1 = 0
            if (r0 != 0) goto L_0x003e
            boolean r0 = r6.f139203r     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x000b
            goto L_0x003e
        L_0x000b:
            long r2 = r6.f139202q     // Catch:{ all -> 0x0022 }
            int r0 = r7.W()     // Catch:{ all -> 0x0022 }
            long r4 = (long) r0     // Catch:{ all -> 0x0022 }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.f(r7, r8)     // Catch:{ all -> 0x0022 }
            monitor-exit(r6)
            return r1
        L_0x0022:
            r7 = move-exception
            goto L_0x0040
        L_0x0024:
            long r0 = r6.f139202q     // Catch:{ all -> 0x0022 }
            int r2 = r7.W()     // Catch:{ all -> 0x0022 }
            long r2 = (long) r2     // Catch:{ all -> 0x0022 }
            long r0 = r0 + r2
            r6.f139202q = r0     // Catch:{ all -> 0x0022 }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.f139201p     // Catch:{ all -> 0x0022 }
            UK.d$c r1 = new UK.d$c     // Catch:{ all -> 0x0022 }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x0022 }
            r0.add(r1)     // Catch:{ all -> 0x0022 }
            r6.u()     // Catch:{ all -> 0x0022 }
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x003e:
            monitor-exit(r6)
            return r1
        L_0x0040:
            monitor-exit(r6)     // Catch:{ all -> 0x0022 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: UK.C16637d.v(WK.h, int):boolean");
    }

    public boolean a(String str) {
        C17542s.j(str, "text");
        return v(C16773h.f139664d.d(str), 1);
    }

    public boolean b(C16773h hVar) {
        C17542s.j(hVar, "bytes");
        return v(hVar, 2);
    }

    public void c(String str) {
        C17542s.j(str, "text");
        this.f139187b.f(this, str);
    }

    public void cancel() {
        C15786e eVar = this.f139193h;
        C17542s.g(eVar);
        eVar.cancel();
    }

    public void d(C16773h hVar) {
        C17542s.j(hVar, "bytes");
        this.f139187b.e(this, hVar);
    }

    public synchronized void e(C16773h hVar) {
        C17542s.j(hVar, "payload");
        this.f139209x++;
        this.f139210y = false;
    }

    public boolean f(int i10, String str) {
        return n(i10, str, 60000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void g(WK.C16773h r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.C17542s.j(r2, r0)     // Catch:{ all -> 0x0017 }
            boolean r0 = r1.f139206u     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0029
            boolean r0 = r1.f139203r     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0019
            java.util.ArrayDeque<java.lang.Object> r0 = r1.f139201p     // Catch:{ all -> 0x0017 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0019
            goto L_0x0029
        L_0x0017:
            r2 = move-exception
            goto L_0x002b
        L_0x0019:
            java.util.ArrayDeque<WK.h> r0 = r1.f139200o     // Catch:{ all -> 0x0017 }
            r0.add(r2)     // Catch:{ all -> 0x0017 }
            r1.u()     // Catch:{ all -> 0x0017 }
            int r2 = r1.f139208w     // Catch:{ all -> 0x0017 }
            int r2 = r2 + 1
            r1.f139208w = r2     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)
            return
        L_0x0029:
            monitor-exit(r1)
            return
        L_0x002b:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: UK.C16637d.g(WK.h):void");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [UK.h, UK.g, UK.d$d] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            r0 = -1
            if (r5 == r0) goto L_0x0071
            monitor-enter(r4)
            int r1 = r4.f139204s     // Catch:{ all -> 0x0031 }
            if (r1 != r0) goto L_0x0067
            r4.f139204s = r5     // Catch:{ all -> 0x0031 }
            r4.f139205t = r6     // Catch:{ all -> 0x0031 }
            boolean r0 = r4.f139203r     // Catch:{ all -> 0x0031 }
            r1 = 0
            if (r0 == 0) goto L_0x0033
            java.util.ArrayDeque<java.lang.Object> r0 = r4.f139201p     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0033
            UK.d$d r0 = r4.f139199n     // Catch:{ all -> 0x0031 }
            r4.f139199n = r1     // Catch:{ all -> 0x0031 }
            UK.g r2 = r4.f139195j     // Catch:{ all -> 0x0031 }
            r4.f139195j = r1     // Catch:{ all -> 0x0031 }
            UK.h r3 = r4.f139196k     // Catch:{ all -> 0x0031 }
            r4.f139196k = r1     // Catch:{ all -> 0x0031 }
            KK.d r1 = r4.f139197l     // Catch:{ all -> 0x0031 }
            r1.n()     // Catch:{ all -> 0x0031 }
            r1 = r0
            goto L_0x0035
        L_0x0031:
            r5 = move-exception
            goto L_0x006f
        L_0x0033:
            r2 = r1
            r3 = r2
        L_0x0035:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0031 }
            monitor-exit(r4)
            GK.I r0 = r4.f139187b     // Catch:{ all -> 0x0045 }
            r0.b(r4, r5, r6)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0047
            GK.I r0 = r4.f139187b     // Catch:{ all -> 0x0045 }
            r0.a(r4, r5, r6)     // Catch:{ all -> 0x0045 }
            goto L_0x0047
        L_0x0045:
            r5 = move-exception
            goto L_0x0057
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            HK.C15864d.m(r1)
        L_0x004c:
            if (r2 == 0) goto L_0x0051
            HK.C15864d.m(r2)
        L_0x0051:
            if (r3 == 0) goto L_0x0056
            HK.C15864d.m(r3)
        L_0x0056:
            return
        L_0x0057:
            if (r1 == 0) goto L_0x005c
            HK.C15864d.m(r1)
        L_0x005c:
            if (r2 == 0) goto L_0x0061
            HK.C15864d.m(r2)
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            HK.C15864d.m(r3)
        L_0x0066:
            throw r5
        L_0x0067:
            java.lang.String r5 = "already closed"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0031 }
            r6.<init>(r5)     // Catch:{ all -> 0x0031 }
            throw r6     // Catch:{ all -> 0x0031 }
        L_0x006f:
            monitor-exit(r4)
            throw r5
        L_0x0071:
            java.lang.String r5 = "Failed requirement."
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: UK.C16637d.h(int, java.lang.String):void");
    }

    public final void m(C15776D d10, LK.c cVar) {
        C17542s.j(d10, "response");
        if (d10.g() == 101) {
            String o10 = C15776D.o(d10, "Connection", (String) null, 2, (Object) null);
            if (C15854t.H("Upgrade", o10, true)) {
                String o11 = C15776D.o(d10, "Upgrade", (String) null, 2, (Object) null);
                if (C15854t.H("websocket", o11, true)) {
                    String o12 = C15776D.o(d10, "Sec-WebSocket-Accept", (String) null, 2, (Object) null);
                    C16773h.a aVar = C16773h.f139664d;
                    String a10 = aVar.d(this.f139192g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").U().a();
                    if (!C17542s.e(a10, o12)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a10 + "' but was '" + o12 + '\'');
                    } else if (cVar == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + o11 + '\'');
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + o10 + '\'');
            }
        } else {
            throw new ProtocolException("Expected HTTP 101 response but was '" + d10.g() + ' ' + d10.s() + '\'');
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean n(int r6, java.lang.String r7, long r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            UK.f r0 = UK.C16639f.f139232a     // Catch:{ all -> 0x0035 }
            r0.c(r6)     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x0037
            WK.h$a r0 = WK.C16773h.f139664d     // Catch:{ all -> 0x0035 }
            WK.h r0 = r0.d(r7)     // Catch:{ all -> 0x0035 }
            int r1 = r0.W()     // Catch:{ all -> 0x0035 }
            long r1 = (long) r1     // Catch:{ all -> 0x0035 }
            r3 = 123(0x7b, double:6.1E-322)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0035 }
            r6.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r8 = "reason.size() > 123: "
            r6.append(r8)     // Catch:{ all -> 0x0035 }
            r6.append(r7)     // Catch:{ all -> 0x0035 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0035 }
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0035 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0035 }
            r7.<init>(r6)     // Catch:{ all -> 0x0035 }
            throw r7     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r6 = move-exception
            goto L_0x0056
        L_0x0037:
            r0 = 0
        L_0x0038:
            boolean r7 = r5.f139206u     // Catch:{ all -> 0x0035 }
            if (r7 != 0) goto L_0x0053
            boolean r7 = r5.f139203r     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x0041
            goto L_0x0053
        L_0x0041:
            r7 = 1
            r5.f139203r = r7     // Catch:{ all -> 0x0035 }
            java.util.ArrayDeque<java.lang.Object> r1 = r5.f139201p     // Catch:{ all -> 0x0035 }
            UK.d$a r2 = new UK.d$a     // Catch:{ all -> 0x0035 }
            r2.<init>(r6, r0, r8)     // Catch:{ all -> 0x0035 }
            r1.add(r2)     // Catch:{ all -> 0x0035 }
            r5.u()     // Catch:{ all -> 0x0035 }
            monitor-exit(r5)
            return r7
        L_0x0053:
            monitor-exit(r5)
            r6 = 0
            return r6
        L_0x0056:
            monitor-exit(r5)     // Catch:{ all -> 0x0035 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: UK.C16637d.n(int, java.lang.String, long):boolean");
    }

    public final void o(z zVar) {
        C17542s.j(zVar, "client");
        if (this.f139186a.d("Sec-WebSocket-Extensions") != null) {
            p(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), (C15776D) null);
            return;
        }
        z c10 = zVar.H().i(C15799r.f135090b).P(f139184A).c();
        C15774B b10 = this.f139186a.i().e("Upgrade", "websocket").e("Connection", "Upgrade").e("Sec-WebSocket-Key", this.f139192g).e("Sec-WebSocket-Version", "13").e("Sec-WebSocket-Extensions", "permessage-deflate").b();
        LK.e eVar = new LK.e(c10, b10, true);
        this.f139193h = eVar;
        C17542s.g(eVar);
        eVar.N0(new f(this, b10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4.f139187b.c(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r0 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        HK.C15864d.m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r2 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        HK.C15864d.m(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r3 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        HK.C15864d.m(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(java.lang.Exception r5, GK.C15776D r6) {
        /*
            r4 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            monitor-enter(r4)
            boolean r0 = r4.f139206u     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)
            return
        L_0x000c:
            r0 = 1
            r4.f139206u = r0     // Catch:{ all -> 0x004a }
            UK.d$d r0 = r4.f139199n     // Catch:{ all -> 0x004a }
            r1 = 0
            r4.f139199n = r1     // Catch:{ all -> 0x004a }
            UK.g r2 = r4.f139195j     // Catch:{ all -> 0x004a }
            r4.f139195j = r1     // Catch:{ all -> 0x004a }
            UK.h r3 = r4.f139196k     // Catch:{ all -> 0x004a }
            r4.f139196k = r1     // Catch:{ all -> 0x004a }
            KK.d r1 = r4.f139197l     // Catch:{ all -> 0x004a }
            r1.n()     // Catch:{ all -> 0x004a }
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x004a }
            monitor-exit(r4)
            GK.I r1 = r4.f139187b     // Catch:{ all -> 0x0039 }
            r1.c(r4, r5, r6)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x002e
            HK.C15864d.m(r0)
        L_0x002e:
            if (r2 == 0) goto L_0x0033
            HK.C15864d.m(r2)
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            HK.C15864d.m(r3)
        L_0x0038:
            return
        L_0x0039:
            r5 = move-exception
            if (r0 == 0) goto L_0x003f
            HK.C15864d.m(r0)
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            HK.C15864d.m(r2)
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            HK.C15864d.m(r3)
        L_0x0049:
            throw r5
        L_0x004a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: UK.C16637d.p(java.lang.Exception, GK.D):void");
    }

    public final C15781I q() {
        return this.f139187b;
    }

    public final void r(String str, C3407d dVar) {
        C17542s.j(str, "name");
        C17542s.j(dVar, "streams");
        C16638e eVar = this.f139190e;
        C17542s.g(eVar);
        synchronized (this) {
            try {
                this.f139198m = str;
                this.f139199n = dVar;
                this.f139196k = new C16641h(dVar.c(), dVar.d(), this.f139188c, eVar.f139226a, eVar.a(dVar.c()), this.f139191f);
                this.f139194i = new e();
                long j10 = this.f139189d;
                if (j10 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                    C15996d dVar2 = this.f139197l;
                    dVar2.i(new g(str + " ping", this, nanos), nanos);
                }
                if (!this.f139201p.isEmpty()) {
                    u();
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f139195j = new C16640g(dVar.c(), dVar.e(), this, eVar.f139226a, eVar.a(!dVar.c()));
    }

    public final void t() {
        while (this.f139204s == -1) {
            C16640g gVar = this.f139195j;
            C17542s.g(gVar);
            gVar.c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r2 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        kotlin.jvm.internal.C17542s.g(r0);
        r0.g(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        if ((r4 instanceof UK.C16637d.c) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008c, code lost:
        r4 = (UK.C16637d.c) r4;
        kotlin.jvm.internal.C17542s.g(r0);
        r0.e(r4.b(), r4.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r12.f139202q -= (long) r4.a().W();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b2, code lost:
        if ((r4 instanceof UK.C16637d.a) == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b4, code lost:
        r4 = (UK.C16637d.a) r4;
        kotlin.jvm.internal.C17542s.g(r0);
        r0.c(r4.b(), r4.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c4, code lost:
        if (r5 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        r0 = r12.f139187b;
        kotlin.jvm.internal.C17542s.g(r7);
        r0.a(r12, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        if (r5 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d0, code lost:
        HK.C15864d.m(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d3, code lost:
        if (r8 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d5, code lost:
        HK.C15864d.m(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        if (r9 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        HK.C15864d.m(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dd, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e3, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e4, code lost:
        if (r5 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e6, code lost:
        HK.C15864d.m(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e9, code lost:
        if (r8 != null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00eb, code lost:
        HK.C15864d.m(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ee, code lost:
        if (r9 != null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f0, code lost:
        HK.C15864d.m(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f3, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w() {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f139206u     // Catch:{ all -> 0x0038 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r12)
            return r1
        L_0x0008:
            UK.h r0 = r12.f139196k     // Catch:{ all -> 0x0038 }
            java.util.ArrayDeque<WK.h> r2 = r12.f139200o     // Catch:{ all -> 0x0038 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0038 }
            r3 = 1
            r4 = 0
            r5 = -1
            if (r2 != 0) goto L_0x0073
            java.util.ArrayDeque<java.lang.Object> r6 = r12.f139201p     // Catch:{ all -> 0x0038 }
            java.lang.Object r6 = r6.poll()     // Catch:{ all -> 0x0038 }
            boolean r7 = r6 instanceof UK.C16637d.a     // Catch:{ all -> 0x0038 }
            if (r7 == 0) goto L_0x0069
            int r1 = r12.f139204s     // Catch:{ all -> 0x0038 }
            java.lang.String r7 = r12.f139205t     // Catch:{ all -> 0x0038 }
            if (r1 == r5) goto L_0x003b
            UK.d$d r5 = r12.f139199n     // Catch:{ all -> 0x0038 }
            r12.f139199n = r4     // Catch:{ all -> 0x0038 }
            UK.g r8 = r12.f139195j     // Catch:{ all -> 0x0038 }
            r12.f139195j = r4     // Catch:{ all -> 0x0038 }
            UK.h r9 = r12.f139196k     // Catch:{ all -> 0x0038 }
            r12.f139196k = r4     // Catch:{ all -> 0x0038 }
            KK.d r4 = r12.f139197l     // Catch:{ all -> 0x0038 }
            r4.n()     // Catch:{ all -> 0x0038 }
        L_0x0036:
            r4 = r6
            goto L_0x0078
        L_0x0038:
            r0 = move-exception
            goto L_0x00f4
        L_0x003b:
            r5 = r6
            UK.d$a r5 = (UK.C16637d.a) r5     // Catch:{ all -> 0x0038 }
            long r8 = r5.a()     // Catch:{ all -> 0x0038 }
            KK.d r5 = r12.f139197l     // Catch:{ all -> 0x0038 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            r10.<init>()     // Catch:{ all -> 0x0038 }
            java.lang.String r11 = r12.f139198m     // Catch:{ all -> 0x0038 }
            r10.append(r11)     // Catch:{ all -> 0x0038 }
            java.lang.String r11 = " cancel"
            r10.append(r11)     // Catch:{ all -> 0x0038 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0038 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0038 }
            long r8 = r11.toNanos(r8)     // Catch:{ all -> 0x0038 }
            UK.d$h r11 = new UK.d$h     // Catch:{ all -> 0x0038 }
            r11.<init>(r10, r3, r12)     // Catch:{ all -> 0x0038 }
            r5.i(r11, r8)     // Catch:{ all -> 0x0038 }
            r5 = r4
            r8 = r5
            r9 = r8
            goto L_0x0036
        L_0x0069:
            if (r6 != 0) goto L_0x006d
            monitor-exit(r12)
            return r1
        L_0x006d:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = r5
            r5 = r9
            goto L_0x0036
        L_0x0073:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = r5
            r5 = r9
        L_0x0078:
            XH.N r6 = XH.C16807N.f139792a     // Catch:{ all -> 0x0038 }
            monitor-exit(r12)
            if (r2 == 0) goto L_0x0088
            kotlin.jvm.internal.C17542s.g(r0)     // Catch:{ all -> 0x0086 }
            WK.h r2 = (WK.C16773h) r2     // Catch:{ all -> 0x0086 }
            r0.g(r2)     // Catch:{ all -> 0x0086 }
            goto L_0x00ce
        L_0x0086:
            r0 = move-exception
            goto L_0x00e4
        L_0x0088:
            boolean r2 = r4 instanceof UK.C16637d.c     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x00b0
            UK.d$c r4 = (UK.C16637d.c) r4     // Catch:{ all -> 0x0086 }
            kotlin.jvm.internal.C17542s.g(r0)     // Catch:{ all -> 0x0086 }
            int r1 = r4.b()     // Catch:{ all -> 0x0086 }
            WK.h r2 = r4.a()     // Catch:{ all -> 0x0086 }
            r0.e(r1, r2)     // Catch:{ all -> 0x0086 }
            monitor-enter(r12)     // Catch:{ all -> 0x0086 }
            long r0 = r12.f139202q     // Catch:{ all -> 0x00ad }
            WK.h r2 = r4.a()     // Catch:{ all -> 0x00ad }
            int r2 = r2.W()     // Catch:{ all -> 0x00ad }
            long r6 = (long) r2     // Catch:{ all -> 0x00ad }
            long r0 = r0 - r6
            r12.f139202q = r0     // Catch:{ all -> 0x00ad }
            monitor-exit(r12)     // Catch:{ all -> 0x0086 }
            goto L_0x00ce
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x00b0:
            boolean r2 = r4 instanceof UK.C16637d.a     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x00de
            UK.d$a r4 = (UK.C16637d.a) r4     // Catch:{ all -> 0x0086 }
            kotlin.jvm.internal.C17542s.g(r0)     // Catch:{ all -> 0x0086 }
            int r2 = r4.b()     // Catch:{ all -> 0x0086 }
            WK.h r4 = r4.c()     // Catch:{ all -> 0x0086 }
            r0.c(r2, r4)     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x00ce
            GK.I r0 = r12.f139187b     // Catch:{ all -> 0x0086 }
            kotlin.jvm.internal.C17542s.g(r7)     // Catch:{ all -> 0x0086 }
            r0.a(r12, r1, r7)     // Catch:{ all -> 0x0086 }
        L_0x00ce:
            if (r5 == 0) goto L_0x00d3
            HK.C15864d.m(r5)
        L_0x00d3:
            if (r8 == 0) goto L_0x00d8
            HK.C15864d.m(r8)
        L_0x00d8:
            if (r9 == 0) goto L_0x00dd
            HK.C15864d.m(r9)
        L_0x00dd:
            return r3
        L_0x00de:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0086 }
            r0.<init>()     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x00e4:
            if (r5 == 0) goto L_0x00e9
            HK.C15864d.m(r5)
        L_0x00e9:
            if (r8 == 0) goto L_0x00ee
            HK.C15864d.m(r8)
        L_0x00ee:
            if (r9 == 0) goto L_0x00f3
            HK.C15864d.m(r9)
        L_0x00f3:
            throw r0
        L_0x00f4:
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: UK.C16637d.w():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0024, code lost:
        if (r1 == -1) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0026, code lost:
        p(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r7.f139189d + "ms (after " + (r1 - 1) + " successful ping/pongs)"), (GK.C15776D) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r0.f(WK.C16773h.f139665e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        p(r0, (GK.C15776D) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f139206u     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            UK.h r0 = r7.f139196k     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r1 = r7.f139210y     // Catch:{ all -> 0x0015 }
            r2 = -1
            if (r1 == 0) goto L_0x0017
            int r1 = r7.f139207v     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r0 = move-exception
            goto L_0x005b
        L_0x0017:
            r1 = r2
        L_0x0018:
            int r3 = r7.f139207v     // Catch:{ all -> 0x0015 }
            r4 = 1
            int r3 = r3 + r4
            r7.f139207v = r3     // Catch:{ all -> 0x0015 }
            r7.f139210y = r4     // Catch:{ all -> 0x0015 }
            XH.N r3 = XH.C16807N.f139792a     // Catch:{ all -> 0x0015 }
            monitor-exit(r7)
            r3 = 0
            if (r1 == r2) goto L_0x0050
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.append(r5)
            long r5 = r7.f139189d
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.p(r0, r3)
            return
        L_0x0050:
            WK.h r1 = WK.C16773h.f139665e     // Catch:{ IOException -> 0x0056 }
            r0.f(r1)     // Catch:{ IOException -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r0 = move-exception
            r7.p(r0, r3)
        L_0x005a:
            return
        L_0x005b:
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: UK.C16637d.x():void");
    }
}
