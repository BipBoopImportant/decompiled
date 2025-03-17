package OK;

import GK.C15802u;
import HK.C15864d;
import KK.C15993a;
import KK.C15995c;
import KK.C15996d;
import OK.C16178h;
import QK.C16354j;
import WK.C16770e;
import WK.C16771f;
import WK.C16772g;
import WK.C16773h;
import XH.C16807N;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.O;
import nI.C17631a;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0004\u0018\u0000 Á\u00012\u00020\u0001:\u0004V\\bhB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\"\u0010#J/\u0010'\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u001a¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010-\u001a\u00020)H\u0000¢\u0006\u0004\b.\u0010,J\u001f\u00100\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u001aH\u0000¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0012¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u00122\u0006\u0010-\u001a\u00020)¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0012H\u0016¢\u0006\u0004\b;\u00108J)\u0010?\u001a\u00020\u00122\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020)2\b\u0010>\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b?\u0010@J#\u0010D\u001a\u00020\u00122\b\b\u0002\u0010A\u001a\u00020\u000b2\b\b\u0002\u0010C\u001a\u00020BH\u0007¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u001a¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0012H\u0000¢\u0006\u0004\bI\u00108J\u0017\u0010J\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\bJ\u0010KJ%\u0010L\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\bL\u0010MJ-\u0010O\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010N\u001a\u00020\u000bH\u0000¢\u0006\u0004\bO\u0010PJ/\u0010S\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010R\u001a\u00020Q2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u000bH\u0000¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\bU\u0010,R\u001a\u0010Z\u001a\u00020\u000b8\u0000X\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010`\u001a\u00020[8\u0000X\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R&\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0a8\u0000X\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010l\u001a\u00020g8\u0000X\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\"\u0010r\u001a\u00020\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010v\u001a\u00020\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bs\u0010m\u001a\u0004\bt\u0010o\"\u0004\bu\u0010qR\u0016\u0010x\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bw\u0010WR\u0014\u0010C\u001a\u00020B8\u0002X\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010~\u001a\u00020{8\u0002X\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0015\u0010\u0001\u001a\u00020{8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010}R\u0016\u0010\u0001\u001a\u00020{8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010}R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010XR\u0018\u0010\u0001\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010XR\u0018\u0010\u0001\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010XR\u0018\u0010\u0001\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010XR\u0018\u0010\u0001\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010XR\u0018\u0010\u0001\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010XR\u001d\u0010\u0001\u001a\u00030\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R)\u0010¢\u0001\u001a\u00020\u001a2\u0007\u0010\u0001\u001a\u00020\u001a8\u0006@BX\u000e¢\u0006\u000f\n\u0005\b\u0001\u0010X\u001a\u0006\b \u0001\u0010¡\u0001R)\u0010¥\u0001\u001a\u00020\u001a2\u0007\u0010\u0001\u001a\u00020\u001a8\u0006@BX\u000e¢\u0006\u000f\n\u0005\b£\u0001\u0010X\u001a\u0006\b¤\u0001\u0010¡\u0001R)\u0010¨\u0001\u001a\u00020\u001a2\u0007\u0010\u0001\u001a\u00020\u001a8\u0006@BX\u000e¢\u0006\u000f\n\u0005\b¦\u0001\u0010X\u001a\u0006\b§\u0001\u0010¡\u0001R)\u0010«\u0001\u001a\u00020\u001a2\u0007\u0010\u0001\u001a\u00020\u001a8\u0006@BX\u000e¢\u0006\u000f\n\u0005\b©\u0001\u0010X\u001a\u0006\bª\u0001\u0010¡\u0001R \u0010±\u0001\u001a\u00030¬\u00018\u0000X\u0004¢\u0006\u0010\n\u0006\b­\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u001d\u0010·\u0001\u001a\u00030²\u00018\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R!\u0010½\u0001\u001a\u00070¸\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R\u001d\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060¾\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b?\u0010¿\u0001¨\u0006Â\u0001"}, d2 = {"LOK/f;", "Ljava/io/Closeable;", "LOK/f$a;", "builder", "<init>", "(LOK/f$a;)V", "", "associatedStreamId", "", "LOK/c;", "requestHeaders", "", "out", "LOK/i;", "A0", "(ILjava/util/List;Z)LOK/i;", "Ljava/io/IOException;", "e", "LXH/N;", "F", "(Ljava/io/IOException;)V", "id", "j0", "(I)LOK/i;", "streamId", "P0", "", "read", "Y0", "(J)V", "E0", "(Ljava/util/List;Z)LOK/i;", "outFinished", "alternating", "b1", "(IZLjava/util/List;)V", "LWK/e;", "buffer", "byteCount", "a1", "(IZLWK/e;J)V", "LOK/b;", "errorCode", "o1", "(ILOK/b;)V", "statusCode", "k1", "unacknowledgedBytesRead", "y1", "(IJ)V", "reply", "payload1", "payload2", "h1", "(ZII)V", "flush", "()V", "T0", "(LOK/b;)V", "close", "connectionCode", "streamCode", "cause", "B", "(LOK/b;LOK/b;Ljava/io/IOException;)V", "sendConnectionPreface", "LKK/e;", "taskRunner", "W0", "(ZLKK/e;)V", "nowNs", "t0", "(J)Z", "Q0", "O0", "(I)Z", "K0", "(ILjava/util/List;)V", "inFinished", "I0", "(ILjava/util/List;Z)V", "LWK/g;", "source", "F0", "(ILWK/g;IZ)V", "N0", "a", "Z", "J", "()Z", "client", "LOK/f$c;", "b", "LOK/f$c;", "e0", "()LOK/f$c;", "listener", "", "c", "Ljava/util/Map;", "l0", "()Ljava/util/Map;", "streams", "", "d", "Ljava/lang/String;", "N", "()Ljava/lang/String;", "connectionName", "I", "U", "()I", "R0", "(I)V", "lastGoodStreamId", "f", "f0", "setNextStreamId$okhttp", "nextStreamId", "g", "isShutdown", "h", "LKK/e;", "LKK/d;", "i", "LKK/d;", "writerQueue", "j", "pushQueue", "k", "settingsListenerQueue", "LOK/l;", "l", "LOK/l;", "pushObserver", "m", "intervalPingsSent", "n", "intervalPongsReceived", "o", "degradedPingsSent", "p", "degradedPongsReceived", "q", "awaitPongsReceived", "r", "degradedPongDeadlineNs", "LOK/m;", "s", "LOK/m;", "h0", "()LOK/m;", "okHttpSettings", "t", "i0", "S0", "(LOK/m;)V", "peerSettings", "<set-?>", "u", "getReadBytesTotal", "()J", "readBytesTotal", "v", "getReadBytesAcknowledged", "readBytesAcknowledged", "w", "getWriteBytesTotal", "writeBytesTotal", "x", "o0", "writeBytesMaximum", "Ljava/net/Socket;", "y", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "socket", "LOK/j;", "z", "LOK/j;", "p0", "()LOK/j;", "writer", "LOK/f$d;", "A", "LOK/f$d;", "getReaderRunnable", "()LOK/f$d;", "readerRunnable", "", "Ljava/util/Set;", "currentPushRequests", "C", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: OK.f  reason: case insensitive filesystem */
public final class C16176f implements Closeable {

    /* renamed from: C  reason: collision with root package name */
    public static final b f136976C = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public static final m f136977D;

    /* renamed from: A  reason: collision with root package name */
    private final d f136978A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final Set<Integer> f136979B;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f136980a;

    /* renamed from: b  reason: collision with root package name */
    private final c f136981b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Integer, C16179i> f136982c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final String f136983d;

    /* renamed from: e  reason: collision with root package name */
    private int f136984e;

    /* renamed from: f  reason: collision with root package name */
    private int f136985f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f136986g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final KK.e f136987h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C15996d f136988i;

    /* renamed from: j  reason: collision with root package name */
    private final C15996d f136989j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final C15996d f136990k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final l f136991l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public long f136992m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public long f136993n;

    /* renamed from: o  reason: collision with root package name */
    private long f136994o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public long f136995p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public long f136996q;

    /* renamed from: r  reason: collision with root package name */
    private long f136997r;

    /* renamed from: s  reason: collision with root package name */
    private final m f136998s;

    /* renamed from: t  reason: collision with root package name */
    private m f136999t;

    /* renamed from: u  reason: collision with root package name */
    private long f137000u;

    /* renamed from: v  reason: collision with root package name */
    private long f137001v;

    /* renamed from: w  reason: collision with root package name */
    private long f137002w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public long f137003x;

    /* renamed from: y  reason: collision with root package name */
    private final Socket f137004y;

    /* renamed from: z  reason: collision with root package name */
    private final C16180j f137005z;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00100\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b%\u0010-\"\u0004\b.\u0010/R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b9\u0010=\u001a\u0004\b+\u0010>\"\u0004\b?\u0010@R\"\u0010F\u001a\u00020A8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b'\u0010B\u001a\u0004\b7\u0010C\"\u0004\bD\u0010ER\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b3\u0010G\u001a\u0004\b1\u0010H\"\u0004\bI\u0010J¨\u0006K"}, d2 = {"LOK/f$a;", "", "", "client", "LKK/e;", "taskRunner", "<init>", "(ZLKK/e;)V", "Ljava/net/Socket;", "socket", "", "peerName", "LWK/g;", "source", "LWK/f;", "sink", "q", "(Ljava/net/Socket;Ljava/lang/String;LWK/g;LWK/f;)LOK/f$a;", "LOK/f$c;", "listener", "k", "(LOK/f$c;)LOK/f$a;", "", "pingIntervalMillis", "l", "(I)LOK/f$a;", "LOK/f;", "a", "()LOK/f;", "Z", "b", "()Z", "setClient$okhttp", "(Z)V", "LKK/e;", "j", "()LKK/e;", "c", "Ljava/net/Socket;", "h", "()Ljava/net/Socket;", "o", "(Ljava/net/Socket;)V", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "connectionName", "e", "LWK/g;", "i", "()LWK/g;", "p", "(LWK/g;)V", "f", "LWK/f;", "g", "()LWK/f;", "n", "(LWK/f;)V", "LOK/f$c;", "()LOK/f$c;", "setListener$okhttp", "(LOK/f$c;)V", "LOK/l;", "LOK/l;", "()LOK/l;", "setPushObserver$okhttp", "(LOK/l;)V", "pushObserver", "I", "()I", "setPingIntervalMillis$okhttp", "(I)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.f$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f137006a;

        /* renamed from: b  reason: collision with root package name */
        private final KK.e f137007b;

        /* renamed from: c  reason: collision with root package name */
        public Socket f137008c;

        /* renamed from: d  reason: collision with root package name */
        public String f137009d;

        /* renamed from: e  reason: collision with root package name */
        public C16772g f137010e;

        /* renamed from: f  reason: collision with root package name */
        public C16771f f137011f;

        /* renamed from: g  reason: collision with root package name */
        private c f137012g = c.f137016b;

        /* renamed from: h  reason: collision with root package name */
        private l f137013h = l.f137118b;

        /* renamed from: i  reason: collision with root package name */
        private int f137014i;

        public a(boolean z10, KK.e eVar) {
            C17542s.j(eVar, "taskRunner");
            this.f137006a = z10;
            this.f137007b = eVar;
        }

        public final C16176f a() {
            return new C16176f(this);
        }

        public final boolean b() {
            return this.f137006a;
        }

        public final String c() {
            String str = this.f137009d;
            if (str != null) {
                return str;
            }
            C17542s.z("connectionName");
            return null;
        }

        public final c d() {
            return this.f137012g;
        }

        public final int e() {
            return this.f137014i;
        }

        public final l f() {
            return this.f137013h;
        }

        public final C16771f g() {
            C16771f fVar = this.f137011f;
            if (fVar != null) {
                return fVar;
            }
            C17542s.z("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.f137008c;
            if (socket != null) {
                return socket;
            }
            C17542s.z("socket");
            return null;
        }

        public final C16772g i() {
            C16772g gVar = this.f137010e;
            if (gVar != null) {
                return gVar;
            }
            C17542s.z("source");
            return null;
        }

        public final KK.e j() {
            return this.f137007b;
        }

        public final a k(c cVar) {
            C17542s.j(cVar, "listener");
            this.f137012g = cVar;
            return this;
        }

        public final a l(int i10) {
            this.f137014i = i10;
            return this;
        }

        public final void m(String str) {
            C17542s.j(str, "<set-?>");
            this.f137009d = str;
        }

        public final void n(C16771f fVar) {
            C17542s.j(fVar, "<set-?>");
            this.f137011f = fVar;
        }

        public final void o(Socket socket) {
            C17542s.j(socket, "<set-?>");
            this.f137008c = socket;
        }

        public final void p(C16772g gVar) {
            C17542s.j(gVar, "<set-?>");
            this.f137010e = gVar;
        }

        public final a q(Socket socket, String str, C16772g gVar, C16771f fVar) {
            String str2;
            C17542s.j(socket, "socket");
            C17542s.j(str, "peerName");
            C17542s.j(gVar, "source");
            C17542s.j(fVar, "sink");
            o(socket);
            if (this.f137006a) {
                str2 = C15864d.f135364i + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            m(str2);
            p(gVar);
            n(fVar);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LOK/f$b;", "", "<init>", "()V", "LOK/m;", "DEFAULT_SETTINGS", "LOK/m;", "a", "()LOK/m;", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.f$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            return C16176f.f136977D;
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"LOK/f$c;", "", "<init>", "()V", "LOK/i;", "stream", "LXH/N;", "e", "(LOK/i;)V", "LOK/f;", "connection", "LOK/m;", "settings", "d", "(LOK/f;LOK/m;)V", "a", "b", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.f$c */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f137015a = new b((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        public static final c f137016b = new a();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"OK/f$c$a", "LOK/f$c;", "LOK/i;", "stream", "LXH/N;", "e", "(LOK/i;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: OK.f$c$a */
        public static final class a extends c {
            a() {
            }

            public void e(C16179i iVar) {
                C17542s.j(iVar, "stream");
                iVar.d(C16172b.REFUSED_STREAM, (IOException) null);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LOK/f$c$b;", "", "<init>", "()V", "LOK/f$c;", "REFUSE_INCOMING_STREAMS", "LOK/f$c;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: OK.f$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public void d(C16176f fVar, m mVar) {
            C17542s.j(fVar, "connection");
            C17542s.j(mVar, "settings");
        }

        public abstract void e(C16179i iVar);
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\tJ'\u0010'\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J/\u00105\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u00106J-\u00109\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"LOK/f$d;", "LOK/h$c;", "Lkotlin/Function0;", "LXH/N;", "LOK/h;", "reader", "<init>", "(LOK/f;LOK/h;)V", "p", "()V", "", "inFinished", "", "streamId", "LWK/g;", "source", "length", "c", "(ZILWK/g;I)V", "associatedStreamId", "", "LOK/c;", "headerBlock", "a", "(ZIILjava/util/List;)V", "LOK/b;", "errorCode", "j", "(ILOK/b;)V", "clearPrevious", "LOK/m;", "settings", "e", "(ZLOK/m;)V", "n", "i", "ack", "payload1", "payload2", "k", "(ZII)V", "lastGoodStreamId", "LWK/h;", "debugData", "f", "(ILOK/b;LWK/h;)V", "", "windowSizeIncrement", "b", "(IJ)V", "streamDependency", "weight", "exclusive", "m", "(IIIZ)V", "promisedStreamId", "requestHeaders", "h", "(IILjava/util/List;)V", "LOK/h;", "getReader$okhttp", "()LOK/h;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.f$d */
    public final class d implements C16178h.c, C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        private final C16178h f137017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16176f f137018b;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"KK/c", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: OK.f$d$a */
        public static final class a extends C15993a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C16176f f137019e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ O f137020f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, C16176f fVar, O o10) {
                super(str, z10);
                this.f137019e = fVar;
                this.f137020f = o10;
            }

            public long f() {
                this.f137019e.e0().d(this.f137019e, (m) this.f137020f.f144348a);
                return -1;
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"KK/c", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: OK.f$d$b */
        public static final class b extends C15993a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C16176f f137021e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C16179i f137022f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, C16176f fVar, C16179i iVar) {
                super(str, z10);
                this.f137021e = fVar;
                this.f137022f = iVar;
            }

            public long f() {
                try {
                    this.f137021e.e0().e(this.f137022f);
                    return -1;
                } catch (IOException e10) {
                    C16354j g10 = C16354j.f137719a.g();
                    g10.k("Http2Connection.Listener failure for " + this.f137021e.N(), 4, e10);
                    try {
                        this.f137022f.d(C16172b.PROTOCOL_ERROR, e10);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"KK/c", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: OK.f$d$c */
        public static final class c extends C15993a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C16176f f137023e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f137024f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f137025g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, C16176f fVar, int i10, int i11) {
                super(str, z10);
                this.f137023e = fVar;
                this.f137024f = i10;
                this.f137025g = i11;
            }

            public long f() {
                this.f137023e.h1(true, this.f137024f, this.f137025g);
                return -1;
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"KK/c", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: OK.f$d$d  reason: collision with other inner class name */
        public static final class C3363d extends C15993a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ d f137026e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f137027f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ m f137028g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3363d(String str, boolean z10, d dVar, boolean z11, m mVar) {
                super(str, z10);
                this.f137026e = dVar;
                this.f137027f = z11;
                this.f137028g = mVar;
            }

            public long f() {
                this.f137026e.n(this.f137027f, this.f137028g);
                return -1;
            }
        }

        public d(C16176f fVar, C16178h hVar) {
            C17542s.j(hVar, "reader");
            this.f137018b = fVar;
            this.f137017a = hVar;
        }

        public void a(boolean z10, int i10, int i11, List<C16173c> list) {
            C17542s.j(list, "headerBlock");
            if (this.f137018b.O0(i10)) {
                this.f137018b.I0(i10, list, z10);
                return;
            }
            C16176f fVar = this.f137018b;
            synchronized (fVar) {
                C16179i j02 = fVar.j0(i10);
                if (j02 != null) {
                    C16807N n10 = C16807N.f139792a;
                    j02.x(C15864d.R(list), z10);
                } else if (!fVar.f136986g) {
                    if (i10 > fVar.U()) {
                        if (i10 % 2 != fVar.f0() % 2) {
                            C16179i iVar = new C16179i(i10, fVar, false, z10, C15864d.R(list));
                            fVar.R0(i10);
                            fVar.l0().put(Integer.valueOf(i10), iVar);
                            C15996d i12 = fVar.f136987h.i();
                            i12.i(new b(fVar.N() + '[' + i10 + "] onStream", true, fVar, iVar), 0);
                        }
                    }
                }
            }
        }

        public void b(int i10, long j10) {
            if (i10 == 0) {
                C16176f fVar = this.f137018b;
                synchronized (fVar) {
                    fVar.f137003x = fVar.o0() + j10;
                    C17542s.h(fVar, "null cannot be cast to non-null type java.lang.Object");
                    fVar.notifyAll();
                    C16807N n10 = C16807N.f139792a;
                }
                return;
            }
            C16179i j02 = this.f137018b.j0(i10);
            if (j02 != null) {
                synchronized (j02) {
                    j02.a(j10);
                    C16807N n11 = C16807N.f139792a;
                }
            }
        }

        public void c(boolean z10, int i10, C16772g gVar, int i11) {
            C17542s.j(gVar, "source");
            if (this.f137018b.O0(i10)) {
                this.f137018b.F0(i10, gVar, i11, z10);
                return;
            }
            C16179i j02 = this.f137018b.j0(i10);
            if (j02 == null) {
                this.f137018b.o1(i10, C16172b.PROTOCOL_ERROR);
                long j10 = (long) i11;
                this.f137018b.Y0(j10);
                gVar.M(j10);
                return;
            }
            j02.w(gVar, i11);
            if (z10) {
                j02.x(C15864d.f135357b, true);
            }
        }

        public void e(boolean z10, m mVar) {
            C17542s.j(mVar, "settings");
            C15996d q10 = this.f137018b.f136988i;
            q10.i(new C3363d(this.f137018b.N() + " applyAndAckSettings", true, this, z10, mVar), 0);
        }

        public void f(int i10, C16172b bVar, C16773h hVar) {
            int i11;
            Object[] array;
            C17542s.j(bVar, "errorCode");
            C17542s.j(hVar, "debugData");
            hVar.W();
            C16176f fVar = this.f137018b;
            synchronized (fVar) {
                array = fVar.l0().values().toArray(new C16179i[0]);
                fVar.f136986g = true;
                C16807N n10 = C16807N.f139792a;
            }
            for (C16179i iVar : (C16179i[]) array) {
                if (iVar.j() > i10 && iVar.t()) {
                    iVar.y(C16172b.REFUSED_STREAM);
                    this.f137018b.P0(iVar.j());
                }
            }
        }

        public void h(int i10, int i11, List<C16173c> list) {
            C17542s.j(list, "requestHeaders");
            this.f137018b.K0(i11, list);
        }

        public void i() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            p();
            return C16807N.f139792a;
        }

        public void j(int i10, C16172b bVar) {
            C17542s.j(bVar, "errorCode");
            if (this.f137018b.O0(i10)) {
                this.f137018b.N0(i10, bVar);
                return;
            }
            C16179i P02 = this.f137018b.P0(i10);
            if (P02 != null) {
                P02.y(bVar);
            }
        }

        public void k(boolean z10, int i10, int i11) {
            if (z10) {
                C16176f fVar = this.f137018b;
                synchronized (fVar) {
                    if (i10 == 1) {
                        fVar.f136993n = fVar.f136993n + 1;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            fVar.f136996q = fVar.f136996q + 1;
                            C17542s.h(fVar, "null cannot be cast to non-null type java.lang.Object");
                            fVar.notifyAll();
                        }
                        try {
                            C16807N n10 = C16807N.f139792a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        fVar.f136995p = fVar.f136995p + 1;
                    }
                }
                return;
            }
            C15996d q10 = this.f137018b.f136988i;
            q10.i(new c(this.f137018b.N() + " ping", true, this.f137018b, i10, i11), 0);
        }

        public void m(int i10, int i11, int i12, boolean z10) {
        }

        public final void n(boolean z10, T t10) {
            long c10;
            int i10;
            C16179i[] iVarArr;
            C17542s.j(t10, "settings");
            O o10 = new O();
            C16180j p02 = this.f137018b.p0();
            C16176f fVar = this.f137018b;
            synchronized (p02) {
                synchronized (fVar) {
                    try {
                        m i02 = fVar.i0();
                        if (!z10) {
                            T mVar = new m();
                            mVar.g(i02);
                            mVar.g(t10);
                            t10 = mVar;
                        }
                        o10.f144348a = t10;
                        c10 = ((long) t10.c()) - ((long) i02.c());
                        if (c10 != 0) {
                            if (!fVar.l0().isEmpty()) {
                                iVarArr = (C16179i[]) fVar.l0().values().toArray(new C16179i[0]);
                                fVar.S0((m) o10.f144348a);
                                fVar.f136990k.i(new a(fVar.N() + " onSettings", true, fVar, o10), 0);
                                C16807N n10 = C16807N.f139792a;
                            }
                        }
                        iVarArr = null;
                        fVar.S0((m) o10.f144348a);
                        fVar.f136990k.i(new a(fVar.N() + " onSettings", true, fVar, o10), 0);
                        C16807N n102 = C16807N.f139792a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    fVar.p0().c((m) o10.f144348a);
                } catch (IOException e10) {
                    fVar.F(e10);
                }
                C16807N n11 = C16807N.f139792a;
            }
            if (iVarArr != null) {
                for (C16179i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(c10);
                        C16807N n12 = C16807N.f139792a;
                    }
                }
            }
        }

        public void p() {
            C16172b bVar;
            C16172b bVar2 = C16172b.INTERNAL_ERROR;
            e = null;
            try {
                this.f137017a.e(this);
                do {
                } while (this.f137017a.d(false, this));
                bVar = C16172b.NO_ERROR;
                try {
                    this.f137018b.B(bVar, C16172b.CANCEL, (IOException) null);
                } catch (IOException e10) {
                    e = e10;
                    try {
                        C16172b bVar3 = C16172b.PROTOCOL_ERROR;
                        this.f137018b.B(bVar3, bVar3, e);
                        C15864d.m(this.f137017a);
                    } catch (Throwable th2) {
                        th = th2;
                        this.f137018b.B(bVar, bVar2, e);
                        C15864d.m(this.f137017a);
                        throw th;
                    }
                }
            } catch (IOException e11) {
                e = e11;
                bVar = bVar2;
                C16172b bVar32 = C16172b.PROTOCOL_ERROR;
                this.f137018b.B(bVar32, bVar32, e);
                C15864d.m(this.f137017a);
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                this.f137018b.B(bVar, bVar2, e);
                C15864d.m(this.f137017a);
                throw th;
            }
            C15864d.m(this.f137017a);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"KK/c", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.f$e */
    public static final class e extends C15993a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16176f f137029e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f137030f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C16770e f137031g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f137032h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f137033i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z10, C16176f fVar, int i10, C16770e eVar, int i11, boolean z11) {
            super(str, z10);
            this.f137029e = fVar;
            this.f137030f = i10;
            this.f137031g = eVar;
            this.f137032h = i11;
            this.f137033i = z11;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r5 = this;
                OK.f r0 = r5.f137029e     // Catch:{ IOException -> 0x003e }
                OK.l r0 = r0.f136991l     // Catch:{ IOException -> 0x003e }
                int r1 = r5.f137030f     // Catch:{ IOException -> 0x003e }
                WK.e r2 = r5.f137031g     // Catch:{ IOException -> 0x003e }
                int r3 = r5.f137032h     // Catch:{ IOException -> 0x003e }
                boolean r4 = r5.f137033i     // Catch:{ IOException -> 0x003e }
                boolean r0 = r0.d(r1, r2, r3, r4)     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x0021
                OK.f r1 = r5.f137029e     // Catch:{ IOException -> 0x003e }
                OK.j r1 = r1.p0()     // Catch:{ IOException -> 0x003e }
                int r2 = r5.f137030f     // Catch:{ IOException -> 0x003e }
                OK.b r3 = OK.C16172b.CANCEL     // Catch:{ IOException -> 0x003e }
                r1.q(r2, r3)     // Catch:{ IOException -> 0x003e }
            L_0x0021:
                if (r0 != 0) goto L_0x0027
                boolean r0 = r5.f137033i     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x003e
            L_0x0027:
                OK.f r0 = r5.f137029e     // Catch:{ IOException -> 0x003e }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003e }
                OK.f r1 = r5.f137029e     // Catch:{ all -> 0x003b }
                java.util.Set r1 = r1.f136979B     // Catch:{ all -> 0x003b }
                int r2 = r5.f137030f     // Catch:{ all -> 0x003b }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003b }
                r1.remove(r2)     // Catch:{ all -> 0x003b }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                goto L_0x003e
            L_0x003b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                throw r1     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: OK.C16176f.e.f():long");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"KK/c", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.f$f  reason: collision with other inner class name */
    public static final class C3364f extends C15993a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16176f f137034e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f137035f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f137036g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f137037h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3364f(String str, boolean z10, C16176f fVar, int i10, List list, boolean z11) {
            super(str, z10);
            this.f137034e = fVar;
            this.f137035f = i10;
            this.f137036g = list;
            this.f137037h = z11;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r4 = this;
                OK.f r0 = r4.f137034e
                OK.l r0 = r0.f136991l
                int r1 = r4.f137035f
                java.util.List r2 = r4.f137036g
                boolean r3 = r4.f137037h
                boolean r0 = r0.c(r1, r2, r3)
                if (r0 == 0) goto L_0x001f
                OK.f r1 = r4.f137034e     // Catch:{ IOException -> 0x003c }
                OK.j r1 = r1.p0()     // Catch:{ IOException -> 0x003c }
                int r2 = r4.f137035f     // Catch:{ IOException -> 0x003c }
                OK.b r3 = OK.C16172b.CANCEL     // Catch:{ IOException -> 0x003c }
                r1.q(r2, r3)     // Catch:{ IOException -> 0x003c }
            L_0x001f:
                if (r0 != 0) goto L_0x0025
                boolean r0 = r4.f137037h     // Catch:{ IOException -> 0x003c }
                if (r0 == 0) goto L_0x003c
            L_0x0025:
                OK.f r0 = r4.f137034e     // Catch:{ IOException -> 0x003c }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003c }
                OK.f r1 = r4.f137034e     // Catch:{ all -> 0x0039 }
                java.util.Set r1 = r1.f136979B     // Catch:{ all -> 0x0039 }
                int r2 = r4.f137035f     // Catch:{ all -> 0x0039 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0039 }
                r1.remove(r2)     // Catch:{ all -> 0x0039 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                goto L_0x003c
            L_0x0039:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                throw r1     // Catch:{ IOException -> 0x003c }
            L_0x003c:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: OK.C16176f.C3364f.f():long");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"KK/c", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.f$g */
    public static final class g extends C15993a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16176f f137038e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f137039f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f137040g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, C16176f fVar, int i10, List list) {
            super(str, z10);
            this.f137038e = fVar;
            this.f137039f = i10;
            this.f137040g = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r3 = this;
                OK.f r0 = r3.f137038e
                OK.l r0 = r0.f136991l
                int r1 = r3.f137039f
                java.util.List r2 = r3.f137040g
                boolean r0 = r0.b(r1, r2)
                if (r0 == 0) goto L_0x0034
                OK.f r0 = r3.f137038e     // Catch:{ IOException -> 0x0034 }
                OK.j r0 = r0.p0()     // Catch:{ IOException -> 0x0034 }
                int r1 = r3.f137039f     // Catch:{ IOException -> 0x0034 }
                OK.b r2 = OK.C16172b.CANCEL     // Catch:{ IOException -> 0x0034 }
                r0.q(r1, r2)     // Catch:{ IOException -> 0x0034 }
                OK.f r0 = r3.f137038e     // Catch:{ IOException -> 0x0034 }
                monitor-enter(r0)     // Catch:{ IOException -> 0x0034 }
                OK.f r1 = r3.f137038e     // Catch:{ all -> 0x0031 }
                java.util.Set r1 = r1.f136979B     // Catch:{ all -> 0x0031 }
                int r2 = r3.f137039f     // Catch:{ all -> 0x0031 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0031 }
                r1.remove(r2)     // Catch:{ all -> 0x0031 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                goto L_0x0034
            L_0x0031:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                throw r1     // Catch:{ IOException -> 0x0034 }
            L_0x0034:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: OK.C16176f.g.f():long");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"KK/c", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.f$h */
    public static final class h extends C15993a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16176f f137041e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f137042f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C16172b f137043g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, C16176f fVar, int i10, C16172b bVar) {
            super(str, z10);
            this.f137041e = fVar;
            this.f137042f = i10;
            this.f137043g = bVar;
        }

        public long f() {
            this.f137041e.f136991l.a(this.f137042f, this.f137043g);
            synchronized (this.f137041e) {
                this.f137041e.f136979B.remove(Integer.valueOf(this.f137042f));
                C16807N n10 = C16807N.f139792a;
            }
            return -1;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"KK/c", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.f$i */
    public static final class i extends C15993a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16176f f137044e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, C16176f fVar) {
            super(str, z10);
            this.f137044e = fVar;
        }

        public long f() {
            this.f137044e.h1(false, 2, 0);
            return -1;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"OK/f$j", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.f$j */
    public static final class j extends C15993a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16176f f137045e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f137046f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(String str, C16176f fVar, long j10) {
            super(str, false, 2, (DefaultConstructorMarker) null);
            this.f137045e = fVar;
            this.f137046f = j10;
        }

        public long f() {
            boolean z10;
            synchronized (this.f137045e) {
                if (this.f137045e.f136993n < this.f137045e.f136992m) {
                    z10 = true;
                } else {
                    this.f137045e.f136992m = this.f137045e.f136992m + 1;
                    z10 = false;
                }
            }
            if (z10) {
                this.f137045e.F((IOException) null);
                return -1;
            }
            this.f137045e.h1(false, 1, 0);
            return this.f137046f;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"KK/c", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.f$k */
    public static final class k extends C15993a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16176f f137047e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f137048f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C16172b f137049g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, C16176f fVar, int i10, C16172b bVar) {
            super(str, z10);
            this.f137047e = fVar;
            this.f137048f = i10;
            this.f137049g = bVar;
        }

        public long f() {
            try {
                this.f137047e.k1(this.f137048f, this.f137049g);
                return -1;
            } catch (IOException e10) {
                this.f137047e.F(e10);
                return -1;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"KK/c", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.f$l */
    public static final class l extends C15993a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16176f f137050e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f137051f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f137052g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, C16176f fVar, int i10, long j10) {
            super(str, z10);
            this.f137050e = fVar;
            this.f137051f = i10;
            this.f137052g = j10;
        }

        public long f() {
            try {
                this.f137050e.p0().t(this.f137051f, this.f137052g);
                return -1;
            } catch (IOException e10) {
                this.f137050e.F(e10);
                return -1;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        f136977D = mVar;
    }

    public C16176f(a aVar) {
        C17542s.j(aVar, "builder");
        boolean b10 = aVar.b();
        this.f136980a = b10;
        this.f136981b = aVar.d();
        String c10 = aVar.c();
        this.f136983d = c10;
        this.f136985f = aVar.b() ? 3 : 2;
        KK.e j10 = aVar.j();
        this.f136987h = j10;
        C15996d i10 = j10.i();
        this.f136988i = i10;
        this.f136989j = j10.i();
        this.f136990k = j10.i();
        this.f136991l = aVar.f();
        m mVar = new m();
        if (aVar.b()) {
            mVar.h(7, 16777216);
        }
        this.f136998s = mVar;
        m mVar2 = f136977D;
        this.f136999t = mVar2;
        this.f137003x = (long) mVar2.c();
        this.f137004y = aVar.h();
        this.f137005z = new C16180j(aVar.g(), b10);
        this.f136978A = new d(this, new C16178h(aVar.i(), b10));
        this.f136979B = new LinkedHashSet();
        if (aVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) aVar.e());
            i10.i(new j(c10 + " ping", this, nanos), nanos);
        }
    }

    private final C16179i A0(int i10, List<C16173c> list, boolean z10) {
        int i11;
        C16179i iVar;
        boolean z11 = true;
        boolean z12 = !z10;
        synchronized (this.f137005z) {
            try {
                synchronized (this) {
                    if (this.f136985f > 1073741823) {
                        T0(C16172b.REFUSED_STREAM);
                    }
                    if (!this.f136986g) {
                        i11 = this.f136985f;
                        this.f136985f = i11 + 2;
                        iVar = new C16179i(i11, this, z12, false, (C15802u) null);
                        if (z10 && this.f137002w < this.f137003x) {
                            if (iVar.r() < iVar.q()) {
                                z11 = false;
                            }
                        }
                        if (iVar.u()) {
                            this.f136982c.put(Integer.valueOf(i11), iVar);
                        }
                        C16807N n10 = C16807N.f139792a;
                    } else {
                        throw new C16171a();
                    }
                }
                if (i10 == 0) {
                    this.f137005z.i(z12, i11, list);
                } else if (!this.f136980a) {
                    this.f137005z.o(i10, i11, list);
                } else {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
            } catch (Throwable th2) {
                throw th2;
            } finally {
            }
        }
        if (z11) {
            this.f137005z.flush();
        }
        return iVar;
    }

    /* access modifiers changed from: private */
    public final void F(IOException iOException) {
        C16172b bVar = C16172b.PROTOCOL_ERROR;
        B(bVar, bVar, iOException);
    }

    public static /* synthetic */ void X0(C16176f fVar, boolean z10, KK.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            eVar = KK.e.f135927i;
        }
        fVar.W0(z10, eVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:(2:6|7)|3f|19|(2:21|(5:23|24|25|37|26))|28|29|30|31|32|34) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0075 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(OK.C16172b r4, OK.C16172b r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "streamCode"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            boolean r0 = HK.C15864d.f135363h
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x003c
        L_0x0015:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x003c:
            r3.T0(r4)     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, OK.i> r4 = r3.f136982c     // Catch:{ all -> 0x005b }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x005b }
            r0 = 0
            if (r4 != 0) goto L_0x005d
            java.util.Map<java.lang.Integer, OK.i> r4 = r3.f136982c     // Catch:{ all -> 0x005b }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x005b }
            OK.i[] r1 = new OK.C16179i[r0]     // Catch:{ all -> 0x005b }
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch:{ all -> 0x005b }
            java.util.Map<java.lang.Integer, OK.i> r1 = r3.f136982c     // Catch:{ all -> 0x005b }
            r1.clear()     // Catch:{ all -> 0x005b }
            goto L_0x005e
        L_0x005b:
            r4 = move-exception
            goto L_0x008a
        L_0x005d:
            r4 = 0
        L_0x005e:
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x005b }
            monitor-exit(r3)
            OK.i[] r4 = (OK.C16179i[]) r4
            if (r4 == 0) goto L_0x0070
            int r1 = r4.length
        L_0x0066:
            if (r0 >= r1) goto L_0x0070
            r2 = r4[r0]
            r2.d(r5, r6)     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            int r0 = r0 + 1
            goto L_0x0066
        L_0x0070:
            OK.j r4 = r3.f137005z     // Catch:{ IOException -> 0x0075 }
            r4.close()     // Catch:{ IOException -> 0x0075 }
        L_0x0075:
            java.net.Socket r4 = r3.f137004y     // Catch:{ IOException -> 0x007a }
            r4.close()     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            KK.d r4 = r3.f136988i
            r4.n()
            KK.d r4 = r3.f136989j
            r4.n()
            KK.d r4 = r3.f136990k
            r4.n()
            return
        L_0x008a:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: OK.C16176f.B(OK.b, OK.b, java.io.IOException):void");
    }

    public final C16179i E0(List<C16173c> list, boolean z10) {
        C17542s.j(list, "requestHeaders");
        return A0(0, list, z10);
    }

    public final void F0(int i10, C16772g gVar, int i11, boolean z10) {
        C17542s.j(gVar, "source");
        C16770e eVar = new C16770e();
        long j10 = (long) i11;
        gVar.t1(j10);
        gVar.u0(eVar, j10);
        C15996d dVar = this.f136989j;
        dVar.i(new e(this.f136983d + '[' + i10 + "] onData", true, this, i10, eVar, i11, z10), 0);
    }

    public final void I0(int i10, List<C16173c> list, boolean z10) {
        C17542s.j(list, "requestHeaders");
        C15996d dVar = this.f136989j;
        dVar.i(new C3364f(this.f136983d + '[' + i10 + "] onHeaders", true, this, i10, list, z10), 0);
    }

    public final boolean J() {
        return this.f136980a;
    }

    public final void K0(int i10, List<C16173c> list) {
        C17542s.j(list, "requestHeaders");
        synchronized (this) {
            if (this.f136979B.contains(Integer.valueOf(i10))) {
                o1(i10, C16172b.PROTOCOL_ERROR);
                return;
            }
            this.f136979B.add(Integer.valueOf(i10));
            C15996d dVar = this.f136989j;
            dVar.i(new g(this.f136983d + '[' + i10 + "] onRequest", true, this, i10, list), 0);
        }
    }

    public final String N() {
        return this.f136983d;
    }

    public final void N0(int i10, C16172b bVar) {
        C17542s.j(bVar, "errorCode");
        C15996d dVar = this.f136989j;
        dVar.i(new h(this.f136983d + '[' + i10 + "] onReset", true, this, i10, bVar), 0);
    }

    public final boolean O0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized C16179i P0(int i10) {
        C16179i remove;
        remove = this.f136982c.remove(Integer.valueOf(i10));
        C17542s.h(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return remove;
    }

    public final void Q0() {
        synchronized (this) {
            long j10 = this.f136995p;
            long j11 = this.f136994o;
            if (j10 >= j11) {
                this.f136994o = j11 + 1;
                this.f136997r = System.nanoTime() + ((long) 1000000000);
                C16807N n10 = C16807N.f139792a;
                C15996d dVar = this.f136988i;
                dVar.i(new i(this.f136983d + " ping", true, this), 0);
            }
        }
    }

    public final void R0(int i10) {
        this.f136984e = i10;
    }

    public final void S0(m mVar) {
        C17542s.j(mVar, "<set-?>");
        this.f136999t = mVar;
    }

    public final void T0(C16172b bVar) {
        C17542s.j(bVar, "statusCode");
        synchronized (this.f137005z) {
            M m10 = new M();
            synchronized (this) {
                if (!this.f136986g) {
                    this.f136986g = true;
                    int i10 = this.f136984e;
                    m10.f144346a = i10;
                    C16807N n10 = C16807N.f139792a;
                    this.f137005z.h(i10, bVar, C15864d.f135356a);
                }
            }
        }
    }

    public final int U() {
        return this.f136984e;
    }

    public final void W0(boolean z10, KK.e eVar) {
        C17542s.j(eVar, "taskRunner");
        if (z10) {
            this.f137005z.d();
            this.f137005z.s(this.f136998s);
            int c10 = this.f136998s.c();
            if (c10 != 65535) {
                this.f137005z.t(0, (long) (c10 - 65535));
            }
        }
        eVar.i().i(new C15995c(this.f136983d, true, this.f136978A), 0);
    }

    public final synchronized void Y0(long j10) {
        long j11 = this.f137000u + j10;
        this.f137000u = j11;
        long j12 = j11 - this.f137001v;
        if (j12 >= ((long) (this.f136998s.c() / 2))) {
            y1(0, j12);
            this.f137001v += j12;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f137005z.l());
        r6 = (long) r2;
        r8.f137002w += r6;
        r4 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0070, code lost:
        throw r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a1(int r9, boolean r10, WK.C16770e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            OK.j r12 = r8.f137005z
            r12.e(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0071
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.f137002w     // Catch:{ InterruptedException -> 0x0062 }
            long r6 = r8.f137003x     // Catch:{ InterruptedException -> 0x0062 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0039
            java.util.Map<java.lang.Integer, OK.i> r2 = r8.f136982c     // Catch:{ InterruptedException -> 0x0062 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0062 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0062 }
            if (r2 == 0) goto L_0x0031
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.C17542s.h(r8, r2)     // Catch:{ InterruptedException -> 0x0062 }
            r8.wait()     // Catch:{ InterruptedException -> 0x0062 }
            goto L_0x0012
        L_0x002f:
            r9 = move-exception
            goto L_0x006f
        L_0x0031:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0062 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0062 }
            throw r9     // Catch:{ InterruptedException -> 0x0062 }
        L_0x0039:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x002f }
            int r2 = (int) r4     // Catch:{ all -> 0x002f }
            OK.j r4 = r8.f137005z     // Catch:{ all -> 0x002f }
            int r4 = r4.l()     // Catch:{ all -> 0x002f }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x002f }
            long r4 = r8.f137002w     // Catch:{ all -> 0x002f }
            long r6 = (long) r2     // Catch:{ all -> 0x002f }
            long r4 = r4 + r6
            r8.f137002w = r4     // Catch:{ all -> 0x002f }
            XH.N r4 = XH.C16807N.f139792a     // Catch:{ all -> 0x002f }
            monitor-exit(r8)
            long r12 = r12 - r6
            OK.j r4 = r8.f137005z
            if (r10 == 0) goto L_0x005d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x005d
            r5 = 1
            goto L_0x005e
        L_0x005d:
            r5 = r3
        L_0x005e:
            r4.e(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0062:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002f }
            r9.interrupt()     // Catch:{ all -> 0x002f }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x002f }
            r9.<init>()     // Catch:{ all -> 0x002f }
            throw r9     // Catch:{ all -> 0x002f }
        L_0x006f:
            monitor-exit(r8)
            throw r9
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OK.C16176f.a1(int, boolean, WK.e, long):void");
    }

    public final void b1(int i10, boolean z10, List<C16173c> list) {
        C17542s.j(list, "alternating");
        this.f137005z.i(z10, i10, list);
    }

    public void close() {
        B(C16172b.NO_ERROR, C16172b.CANCEL, (IOException) null);
    }

    public final c e0() {
        return this.f136981b;
    }

    public final int f0() {
        return this.f136985f;
    }

    public final void flush() {
        this.f137005z.flush();
    }

    public final m h0() {
        return this.f136998s;
    }

    public final void h1(boolean z10, int i10, int i11) {
        try {
            this.f137005z.n(z10, i10, i11);
        } catch (IOException e10) {
            F(e10);
        }
    }

    public final m i0() {
        return this.f136999t;
    }

    public final synchronized C16179i j0(int i10) {
        return this.f136982c.get(Integer.valueOf(i10));
    }

    public final void k1(int i10, C16172b bVar) {
        C17542s.j(bVar, "statusCode");
        this.f137005z.q(i10, bVar);
    }

    public final Map<Integer, C16179i> l0() {
        return this.f136982c;
    }

    public final long o0() {
        return this.f137003x;
    }

    public final void o1(int i10, C16172b bVar) {
        C17542s.j(bVar, "errorCode");
        C15996d dVar = this.f136988i;
        dVar.i(new k(this.f136983d + '[' + i10 + "] writeSynReset", true, this, i10, bVar), 0);
    }

    public final C16180j p0() {
        return this.f137005z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean t0(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f136986g     // Catch:{ all -> 0x0018 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r6)
            return r1
        L_0x0008:
            long r2 = r6.f136995p     // Catch:{ all -> 0x0018 }
            long r4 = r6.f136994o     // Catch:{ all -> 0x0018 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            long r2 = r6.f136997r     // Catch:{ all -> 0x0018 }
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x001a
            monitor-exit(r6)
            return r1
        L_0x0018:
            r7 = move-exception
            goto L_0x001d
        L_0x001a:
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x001d:
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: OK.C16176f.t0(long):boolean");
    }

    public final void y1(int i10, long j10) {
        C15996d dVar = this.f136988i;
        dVar.i(new l(this.f136983d + '[' + i10 + "] windowUpdate", true, this, i10, j10), 0);
    }
}
