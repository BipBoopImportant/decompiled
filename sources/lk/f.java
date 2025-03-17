package LK;

import GK.C15773A;
import GK.C15774B;
import GK.C15775C;
import GK.C15776D;
import GK.C15778F;
import GK.C15782a;
import GK.C15786e;
import GK.C15788g;
import GK.C15791j;
import GK.C15799r;
import GK.C15801t;
import GK.C15803v;
import GK.z;
import HJ.C15854t;
import HK.C15864d;
import MK.g;
import NK.C16125b;
import OK.C16171a;
import OK.C16172b;
import OK.C16176f;
import OK.C16177g;
import OK.C16179i;
import OK.m;
import OK.n;
import QK.C16354j;
import TK.C16554c;
import TK.C16555d;
import UK.C16637d;
import WK.C16771f;
import WK.C16772g;
import WK.y;
import YH.C16877v;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0001hB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010#\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020)2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020)2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020)2\u0006\u0010\"\u001a\u00020!2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0011H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0011H\u0000¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u0011H\u0000¢\u0006\u0004\b5\u00103JE\u00107\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u00106\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b7\u00108J'\u0010<\u001a\u00020)2\u0006\u0010:\u001a\u0002092\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010'H\u0000¢\u0006\u0004\b<\u0010=J\u001f\u0010C\u001a\u00020B2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0000¢\u0006\u0004\bC\u0010DJ\u0017\u0010H\u001a\u00020G2\u0006\u0010F\u001a\u00020EH\u0000¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0005H\u0016¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\u0011¢\u0006\u0004\bL\u00103J\u000f\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020)2\u0006\u0010P\u001a\u00020)¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\u00112\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010[\u001a\u00020\u00112\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u0011\u0010]\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b]\u0010^J'\u0010b\u001a\u00020\u00112\u0006\u0010?\u001a\u00020>2\u0006\u0010_\u001a\u00020\u00052\u0006\u0010a\u001a\u00020`H\u0000¢\u0006\u0004\bb\u0010cJ!\u0010e\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020d2\b\u0010U\u001a\u0004\u0018\u00010`H\u0000¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010k\u001a\u00020jH\u0016¢\u0006\u0004\bk\u0010lR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bN\u0010m\u001a\u0004\bn\u0010oR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010pR\u0018\u0010r\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bU\u0010qR\u0018\u0010t\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bs\u0010qR\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010uR\u0018\u0010w\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010vR\u0018\u0010y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u0010xR\u0018\u0010|\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010{R\u0018\u0010\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010~R(\u0010\u0001\u001a\u00020)8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b\u001d\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020)8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010\u0001R&\u0010\u0001\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\u0015\n\u0004\b#\u0010e\u001a\u0006\b\u0001\u0010\u0001\"\u0005\b\u0001\u0010\u001cR\u0017\u0010\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010eR\u0017\u0010\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010eR\u0018\u0010\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010eR*\u0010\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020d0\u00010\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020)8@X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"LLK/f;", "LOK/f$c;", "LGK/j;", "LLK/g;", "connectionPool", "LGK/F;", "route", "<init>", "(LLK/g;LGK/F;)V", "", "connectTimeout", "readTimeout", "writeTimeout", "LGK/e;", "call", "LGK/r;", "eventListener", "LXH/N;", "m", "(IIILGK/e;LGK/r;)V", "k", "(IILGK/e;LGK/r;)V", "LLK/b;", "connectionSpecSelector", "pingIntervalMillis", "p", "(LLK/b;ILGK/e;LGK/r;)V", "G", "(I)V", "l", "(LLK/b;)V", "LGK/B;", "tunnelRequest", "LGK/v;", "url", "n", "(IILGK/B;LGK/v;)LGK/B;", "o", "()LGK/B;", "", "candidates", "", "D", "(Ljava/util/List;)Z", "H", "(LGK/v;)Z", "LGK/t;", "handshake", "h", "(LGK/v;LGK/t;)Z", "B", "()V", "A", "u", "connectionRetryEnabled", "i", "(IIIIZLGK/e;LGK/r;)V", "LGK/a;", "address", "routes", "v", "(LGK/a;Ljava/util/List;)Z", "LGK/z;", "client", "LMK/g;", "chain", "LMK/d;", "y", "(LGK/z;LMK/g;)LMK/d;", "LLK/c;", "exchange", "LUK/d$d;", "z", "(LLK/c;)LUK/d$d;", "C", "()LGK/F;", "g", "Ljava/net/Socket;", "c", "()Ljava/net/Socket;", "doExtensiveChecks", "w", "(Z)Z", "LOK/i;", "stream", "e", "(LOK/i;)V", "LOK/f;", "connection", "LOK/m;", "settings", "d", "(LOK/f;LOK/m;)V", "b", "()LGK/t;", "failedRoute", "Ljava/io/IOException;", "failure", "j", "(LGK/z;LGK/F;Ljava/io/IOException;)V", "LLK/e;", "I", "(LLK/e;Ljava/io/IOException;)V", "LGK/A;", "a", "()LGK/A;", "", "toString", "()Ljava/lang/String;", "LLK/g;", "getConnectionPool", "()LLK/g;", "LGK/F;", "Ljava/net/Socket;", "rawSocket", "f", "socket", "LGK/t;", "LGK/A;", "protocol", "LOK/f;", "http2Connection", "LWK/g;", "LWK/g;", "source", "LWK/f;", "LWK/f;", "sink", "Z", "s", "()Z", "F", "(Z)V", "noNewExchanges", "noCoalescedConnections", "t", "()I", "setRouteFailureCount$okhttp", "routeFailureCount", "successCount", "refusedStreamCount", "q", "allocationLimit", "", "Ljava/lang/ref/Reference;", "r", "Ljava/util/List;", "()Ljava/util/List;", "calls", "", "J", "()J", "E", "(J)V", "idleAtNs", "x", "isMultiplexed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends C16176f.c implements C15791j {

    /* renamed from: t  reason: collision with root package name */
    public static final a f136174t = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final g f136175c;

    /* renamed from: d  reason: collision with root package name */
    private final C15778F f136176d;

    /* renamed from: e  reason: collision with root package name */
    private Socket f136177e;

    /* renamed from: f  reason: collision with root package name */
    private Socket f136178f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public C15801t f136179g;

    /* renamed from: h  reason: collision with root package name */
    private C15773A f136180h;

    /* renamed from: i  reason: collision with root package name */
    private C16176f f136181i;

    /* renamed from: j  reason: collision with root package name */
    private C16772g f136182j;

    /* renamed from: k  reason: collision with root package name */
    private C16771f f136183k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f136184l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f136185m;

    /* renamed from: n  reason: collision with root package name */
    private int f136186n;

    /* renamed from: o  reason: collision with root package name */
    private int f136187o;

    /* renamed from: p  reason: collision with root package name */
    private int f136188p;

    /* renamed from: q  reason: collision with root package name */
    private int f136189q = 1;

    /* renamed from: r  reason: collision with root package name */
    private final List<Reference<e>> f136190r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private long f136191s = Long.MAX_VALUE;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LLK/f$a;", "", "<init>", "()V", "", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f136192a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f136192a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: LK.f.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "b", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<List<? extends Certificate>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15788g f136193c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15801t f136194d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15782a f136195e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C15788g gVar, C15801t tVar, C15782a aVar) {
            super(0);
            this.f136193c = gVar;
            this.f136194d = tVar;
            this.f136195e = aVar;
        }

        /* renamed from: b */
        public final List<Certificate> invoke() {
            C16554c d10 = this.f136193c.d();
            C17542s.g(d10);
            return d10.a(this.f136194d.d(), this.f136195e.l().i());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "b", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17631a<List<? extends X509Certificate>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f136196c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(0);
            this.f136196c = fVar;
        }

        /* renamed from: b */
        public final List<X509Certificate> invoke() {
            C15801t f10 = this.f136196c.f136179g;
            C17542s.g(f10);
            Iterable<Certificate> d10 = f10.d();
            ArrayList arrayList = new ArrayList(C16877v.y(d10, 10));
            for (Certificate certificate : d10) {
                C17542s.h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LK/f$e", "LUK/d$d;", "LXH/N;", "close", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends C16637d.C3407d {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f136197d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C16772g gVar, C16771f fVar, c cVar) {
            super(true, gVar, fVar);
            this.f136197d = cVar;
        }

        public void close() {
            this.f136197d.a(-1, true, true, null);
        }
    }

    public f(g gVar, C15778F f10) {
        C17542s.j(gVar, "connectionPool");
        C17542s.j(f10, PlaceTypes.ROUTE);
        this.f136175c = gVar;
        this.f136176d = f10;
    }

    private final boolean D(List<C15778F> list) {
        Iterable<C15778F> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C15778F f10 : iterable) {
            Proxy.Type type = f10.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f136176d.b().type() == type2 && C17542s.e(this.f136176d.d(), f10.d())) {
                return true;
            }
        }
        return false;
    }

    private final void G(int i10) {
        Socket socket = this.f136178f;
        C17542s.g(socket);
        C16772g gVar = this.f136182j;
        C17542s.g(gVar);
        C16771f fVar = this.f136183k;
        C17542s.g(fVar);
        socket.setSoTimeout(0);
        C16176f a10 = new C16176f.a(true, KK.e.f135927i).q(socket, this.f136176d.a().l().i(), gVar, fVar).k(this).l(i10).a();
        this.f136181i = a10;
        this.f136189q = C16176f.f136976C.a().d();
        C16176f.X0(a10, false, (KK.e) null, 3, (Object) null);
    }

    private final boolean H(C15803v vVar) {
        C15801t tVar;
        if (!C15864d.f135363h || Thread.holdsLock(this)) {
            C15803v l10 = this.f136176d.a().l();
            if (vVar.o() != l10.o()) {
                return false;
            }
            if (C17542s.e(vVar.i(), l10.i())) {
                return true;
            }
            if (this.f136185m || (tVar = this.f136179g) == null) {
                return false;
            }
            C17542s.g(tVar);
            return h(vVar, tVar);
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final boolean h(C15803v vVar, C15801t tVar) {
        List<Certificate> d10 = tVar.d();
        if (d10.isEmpty()) {
            return false;
        }
        C16555d dVar = C16555d.f138919a;
        String i10 = vVar.i();
        Certificate certificate = d10.get(0);
        C17542s.h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        return dVar.e(i10, (X509Certificate) certificate);
    }

    private final void k(int i10, int i11, C15786e eVar, C15799r rVar) {
        Socket socket;
        Proxy b10 = this.f136176d.b();
        C15782a a10 = this.f136176d.a();
        Proxy.Type type = b10.type();
        int i12 = type == null ? -1 : b.f136192a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socket = a10.j().createSocket();
            C17542s.g(socket);
        } else {
            socket = new Socket(b10);
        }
        this.f136177e = socket;
        rVar.j(eVar, this.f136176d.d(), b10);
        socket.setSoTimeout(i11);
        try {
            C16354j.f137719a.g().f(socket, this.f136176d.d(), i10);
            try {
                this.f136182j = y.d(y.m(socket));
                this.f136183k = y.c(y.i(socket));
            } catch (NullPointerException e10) {
                if (C17542s.e(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f136176d.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l(LK.C16030b r11) {
        /*
            r10 = this;
            GK.F r0 = r10.f136176d
            GK.a r0 = r0.a()
            javax.net.ssl.SSLSocketFactory r1 = r0.k()
            r2 = 0
            kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ all -> 0x0174 }
            java.net.Socket r3 = r10.f136177e     // Catch:{ all -> 0x0174 }
            GK.v r4 = r0.l()     // Catch:{ all -> 0x0174 }
            java.lang.String r4 = r4.i()     // Catch:{ all -> 0x0174 }
            GK.v r5 = r0.l()     // Catch:{ all -> 0x0174 }
            int r5 = r5.o()     // Catch:{ all -> 0x0174 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x0174 }
            java.lang.String r3 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            kotlin.jvm.internal.C17542s.h(r1, r3)     // Catch:{ all -> 0x0174 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x0174 }
            GK.l r11 = r11.a(r1)     // Catch:{ all -> 0x004c }
            boolean r3 = r11.h()     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0050
            QK.j$a r3 = QK.C16354j.f137719a     // Catch:{ all -> 0x004c }
            QK.j r3 = r3.g()     // Catch:{ all -> 0x004c }
            GK.v r4 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r4 = r4.i()     // Catch:{ all -> 0x004c }
            java.util.List r5 = r0.f()     // Catch:{ all -> 0x004c }
            r3.e(r1, r4, r5)     // Catch:{ all -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r11 = move-exception
            r2 = r1
            goto L_0x0175
        L_0x0050:
            r1.startHandshake()     // Catch:{ all -> 0x004c }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x004c }
            GK.t$a r4 = GK.C15801t.f135098e     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "sslSocketSession"
            kotlin.jvm.internal.C17542s.i(r3, r5)     // Catch:{ all -> 0x004c }
            GK.t r4 = r4.b(r3)     // Catch:{ all -> 0x004c }
            javax.net.ssl.HostnameVerifier r5 = r0.e()     // Catch:{ all -> 0x004c }
            kotlin.jvm.internal.C17542s.g(r5)     // Catch:{ all -> 0x004c }
            GK.v r7 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r7 = r7.i()     // Catch:{ all -> 0x004c }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x004c }
            if (r3 != 0) goto L_0x0108
            java.util.List r11 = r4.d()     // Catch:{ all -> 0x004c }
            r3 = r11
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x004c }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x004c }
            if (r3 != 0) goto L_0x00e4
            r3 = 0
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x004c }
            java.lang.String r3 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.C17542s.h(r11, r3)     // Catch:{ all -> 0x004c }
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x004c }
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x004c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r4.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "\n              |Hostname "
            r4.append(r5)     // Catch:{ all -> 0x004c }
            GK.v r0 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x004c }
            r4.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r4.append(r0)     // Catch:{ all -> 0x004c }
            GK.g$b r0 = GK.C15788g.f134909c     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.a(r11)     // Catch:{ all -> 0x004c }
            r4.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "\n              |    DN: "
            r4.append(r0)     // Catch:{ all -> 0x004c }
            java.security.Principal r0 = r11.getSubjectDN()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x004c }
            r4.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r4.append(r0)     // Catch:{ all -> 0x004c }
            TK.d r0 = TK.C16555d.f138919a     // Catch:{ all -> 0x004c }
            java.util.List r11 = r0.a(r11)     // Catch:{ all -> 0x004c }
            r4.append(r11)     // Catch:{ all -> 0x004c }
            java.lang.String r11 = "\n              "
            r4.append(r11)     // Catch:{ all -> 0x004c }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x004c }
            java.lang.String r11 = HJ.C15854t.o(r11, r2, r6, r2)     // Catch:{ all -> 0x004c }
            r3.<init>(r11)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x00e4:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x004c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r2.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x004c }
            GK.v r0 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x004c }
            r2.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x004c }
            r11.<init>(r0)     // Catch:{ all -> 0x004c }
            throw r11     // Catch:{ all -> 0x004c }
        L_0x0108:
            GK.g r3 = r0.a()     // Catch:{ all -> 0x004c }
            kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ all -> 0x004c }
            GK.t r5 = new GK.t     // Catch:{ all -> 0x004c }
            GK.G r6 = r4.e()     // Catch:{ all -> 0x004c }
            GK.i r7 = r4.a()     // Catch:{ all -> 0x004c }
            java.util.List r8 = r4.c()     // Catch:{ all -> 0x004c }
            LK.f$c r9 = new LK.f$c     // Catch:{ all -> 0x004c }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x004c }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x004c }
            r10.f136179g = r5     // Catch:{ all -> 0x004c }
            GK.v r0 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x004c }
            LK.f$d r4 = new LK.f$d     // Catch:{ all -> 0x004c }
            r4.<init>(r10)     // Catch:{ all -> 0x004c }
            r3.b(r0, r4)     // Catch:{ all -> 0x004c }
            boolean r11 = r11.h()     // Catch:{ all -> 0x004c }
            if (r11 == 0) goto L_0x0147
            QK.j$a r11 = QK.C16354j.f137719a     // Catch:{ all -> 0x004c }
            QK.j r11 = r11.g()     // Catch:{ all -> 0x004c }
            java.lang.String r2 = r11.h(r1)     // Catch:{ all -> 0x004c }
        L_0x0147:
            r10.f136178f = r1     // Catch:{ all -> 0x004c }
            WK.N r11 = WK.y.m(r1)     // Catch:{ all -> 0x004c }
            WK.g r11 = WK.y.d(r11)     // Catch:{ all -> 0x004c }
            r10.f136182j = r11     // Catch:{ all -> 0x004c }
            WK.L r11 = WK.y.i(r1)     // Catch:{ all -> 0x004c }
            WK.f r11 = WK.y.c(r11)     // Catch:{ all -> 0x004c }
            r10.f136183k = r11     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0166
            GK.A$a r11 = GK.C15773A.Companion     // Catch:{ all -> 0x004c }
            GK.A r11 = r11.a(r2)     // Catch:{ all -> 0x004c }
            goto L_0x0168
        L_0x0166:
            GK.A r11 = GK.C15773A.HTTP_1_1     // Catch:{ all -> 0x004c }
        L_0x0168:
            r10.f136180h = r11     // Catch:{ all -> 0x004c }
            QK.j$a r11 = QK.C16354j.f137719a
            QK.j r11 = r11.g()
            r11.b(r1)
            return
        L_0x0174:
            r11 = move-exception
        L_0x0175:
            if (r2 == 0) goto L_0x0180
            QK.j$a r0 = QK.C16354j.f137719a
            QK.j r0 = r0.g()
            r0.b(r2)
        L_0x0180:
            if (r2 == 0) goto L_0x0185
            HK.C15864d.n(r2)
        L_0x0185:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: LK.f.l(LK.b):void");
    }

    private final void m(int i10, int i11, int i12, C15786e eVar, C15799r rVar) {
        C15774B o10 = o();
        C15803v k10 = o10.k();
        int i13 = 0;
        while (i13 < 21) {
            k(i10, i11, eVar, rVar);
            o10 = n(i11, i12, o10, k10);
            if (o10 != null) {
                Socket socket = this.f136177e;
                if (socket != null) {
                    C15864d.n(socket);
                }
                this.f136177e = null;
                this.f136183k = null;
                this.f136182j = null;
                rVar.h(eVar, this.f136176d.d(), this.f136176d.b(), (C15773A) null);
                i13++;
            } else {
                return;
            }
        }
    }

    private final C15774B n(int i10, int i11, C15774B b10, C15803v vVar) {
        String str = "CONNECT " + C15864d.U(vVar, true) + " HTTP/1.1";
        while (true) {
            C16772g gVar = this.f136182j;
            C17542s.g(gVar);
            C16771f fVar = this.f136183k;
            C17542s.g(fVar);
            C16125b bVar = new C16125b((z) null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.y().g((long) i10, timeUnit);
            fVar.y().g((long) i11, timeUnit);
            bVar.A(b10.e(), str);
            bVar.a();
            C15776D.a f10 = bVar.f(false);
            C17542s.g(f10);
            C15776D c10 = f10.r(b10).c();
            bVar.z(c10);
            int g10 = c10.g();
            if (g10 != 200) {
                if (g10 == 407) {
                    C15774B a10 = this.f136176d.a().h().a(this.f136176d, c10);
                    if (a10 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if (C15854t.H("close", C15776D.o(c10, "Connection", (String) null, 2, (Object) null), true)) {
                        return a10;
                    } else {
                        b10 = a10;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c10.g());
                }
            } else if (gVar.p().Y1() && fVar.p().Y1()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private final C15774B o() {
        C15774B b10 = new C15774B.a().m(this.f136176d.a().l()).g("CONNECT", (C15775C) null).e("Host", C15864d.U(this.f136176d.a().l(), true)).e("Proxy-Connection", "Keep-Alive").e("User-Agent", "okhttp/4.12.0").b();
        C15774B a10 = this.f136176d.a().h().a(this.f136176d, new C15776D.a().r(b10).p(C15773A.HTTP_1_1).g(407).m("Preemptive Authenticate").b(C15864d.f135358c).s(-1).q(-1).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a10 == null ? b10 : a10;
    }

    private final void p(C16030b bVar, int i10, C15786e eVar, C15799r rVar) {
        if (this.f136176d.a().k() == null) {
            List<C15773A> f10 = this.f136176d.a().f();
            C15773A a10 = C15773A.H2_PRIOR_KNOWLEDGE;
            if (f10.contains(a10)) {
                this.f136178f = this.f136177e;
                this.f136180h = a10;
                G(i10);
                return;
            }
            this.f136178f = this.f136177e;
            this.f136180h = C15773A.HTTP_1_1;
            return;
        }
        rVar.C(eVar);
        l(bVar);
        rVar.B(eVar, this.f136179g);
        if (this.f136180h == C15773A.HTTP_2) {
            G(i10);
        }
    }

    public final synchronized void A() {
        this.f136185m = true;
    }

    public final synchronized void B() {
        this.f136184l = true;
    }

    public C15778F C() {
        return this.f136176d;
    }

    public final void E(long j10) {
        this.f136191s = j10;
    }

    public final void F(boolean z10) {
        this.f136184l = z10;
    }

    public final synchronized void I(e eVar, IOException iOException) {
        try {
            C17542s.j(eVar, "call");
            if (iOException instanceof n) {
                if (((n) iOException).f137123a == C16172b.REFUSED_STREAM) {
                    int i10 = this.f136188p + 1;
                    this.f136188p = i10;
                    if (i10 > 1) {
                        this.f136184l = true;
                        this.f136186n++;
                    }
                } else if (((n) iOException).f137123a != C16172b.CANCEL || !eVar.J()) {
                    this.f136184l = true;
                    this.f136186n++;
                }
            } else if (!x() || (iOException instanceof C16171a)) {
                this.f136184l = true;
                if (this.f136187o == 0) {
                    if (iOException != null) {
                        j(eVar.m(), this.f136176d, iOException);
                    }
                    this.f136186n++;
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public C15773A a() {
        C15773A a10 = this.f136180h;
        C17542s.g(a10);
        return a10;
    }

    public C15801t b() {
        return this.f136179g;
    }

    public Socket c() {
        Socket socket = this.f136178f;
        C17542s.g(socket);
        return socket;
    }

    public synchronized void d(C16176f fVar, m mVar) {
        C17542s.j(fVar, "connection");
        C17542s.j(mVar, "settings");
        this.f136189q = mVar.d();
    }

    public void e(C16179i iVar) {
        C17542s.j(iVar, "stream");
        iVar.d(C16172b.REFUSED_STREAM, (IOException) null);
    }

    public final void g() {
        Socket socket = this.f136177e;
        if (socket != null) {
            C15864d.n(socket);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x009c A[Catch:{ IOException -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(int r17, int r18, int r19, int r20, boolean r21, GK.C15786e r22, GK.C15799r r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            GK.A r0 = r7.f136180h
            if (r0 != 0) goto L_0x0157
            GK.F r0 = r7.f136176d
            GK.a r0 = r0.a()
            java.util.List r0 = r0.b()
            LK.b r10 = new LK.b
            r10.<init>(r0)
            GK.F r1 = r7.f136176d
            GK.a r1 = r1.a()
            javax.net.ssl.SSLSocketFactory r1 = r1.k()
            if (r1 != 0) goto L_0x0080
            GK.l r1 = GK.C15793l.f135052k
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0073
            GK.F r0 = r7.f136176d
            GK.a r0 = r0.a()
            GK.v r0 = r0.l()
            java.lang.String r0 = r0.i()
            QK.j$a r1 = QK.C16354j.f137719a
            QK.j r1 = r1.g()
            boolean r1 = r1.j(r0)
            if (r1 == 0) goto L_0x0052
            goto L_0x0092
        L_0x0052:
            LK.i r1 = new LK.i
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0073:
            LK.i r0 = new LK.i
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0080:
            GK.F r0 = r7.f136176d
            GK.a r0 = r0.a()
            java.util.List r0 = r0.f()
            GK.A r1 = GK.C15773A.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x014a
        L_0x0092:
            r11 = 0
            r12 = r11
        L_0x0094:
            GK.F r0 = r7.f136176d     // Catch:{ IOException -> 0x00b7 }
            boolean r0 = r0.c()     // Catch:{ IOException -> 0x00b7 }
            if (r0 == 0) goto L_0x00bf
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.m(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00b7 }
            java.net.Socket r0 = r7.f136177e     // Catch:{ IOException -> 0x00b7 }
            if (r0 != 0) goto L_0x00b0
            goto L_0x00db
        L_0x00b0:
            r13 = r17
            r14 = r18
        L_0x00b4:
            r15 = r20
            goto L_0x00c7
        L_0x00b7:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00bc:
            r15 = r20
            goto L_0x0100
        L_0x00bf:
            r13 = r17
            r14 = r18
            r7.k(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00fe }
            goto L_0x00b4
        L_0x00c7:
            r7.p(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00fc }
            GK.F r0 = r7.f136176d     // Catch:{ IOException -> 0x00fc }
            java.net.InetSocketAddress r0 = r0.d()     // Catch:{ IOException -> 0x00fc }
            GK.F r1 = r7.f136176d     // Catch:{ IOException -> 0x00fc }
            java.net.Proxy r1 = r1.b()     // Catch:{ IOException -> 0x00fc }
            GK.A r2 = r7.f136180h     // Catch:{ IOException -> 0x00fc }
            r9.h(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00fc }
        L_0x00db:
            GK.F r0 = r7.f136176d
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00f5
            java.net.Socket r0 = r7.f136177e
            if (r0 == 0) goto L_0x00e8
            goto L_0x00f5
        L_0x00e8:
            LK.i r0 = new LK.i
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00f5:
            long r0 = java.lang.System.nanoTime()
            r7.f136191s = r0
            return
        L_0x00fc:
            r0 = move-exception
            goto L_0x0100
        L_0x00fe:
            r0 = move-exception
            goto L_0x00bc
        L_0x0100:
            java.net.Socket r1 = r7.f136178f
            if (r1 == 0) goto L_0x0107
            HK.C15864d.n(r1)
        L_0x0107:
            java.net.Socket r1 = r7.f136177e
            if (r1 == 0) goto L_0x010e
            HK.C15864d.n(r1)
        L_0x010e:
            r7.f136178f = r11
            r7.f136177e = r11
            r7.f136182j = r11
            r7.f136183k = r11
            r7.f136179g = r11
            r7.f136180h = r11
            r7.f136181i = r11
            r1 = 1
            r7.f136189q = r1
            GK.F r1 = r7.f136176d
            java.net.InetSocketAddress r3 = r1.d()
            GK.F r1 = r7.f136176d
            java.net.Proxy r4 = r1.b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.i(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x013c
            LK.i r12 = new LK.i
            r12.<init>(r0)
            goto L_0x013f
        L_0x013c:
            r12.a(r0)
        L_0x013f:
            if (r21 == 0) goto L_0x0149
            boolean r0 = r10.b(r0)
            if (r0 == 0) goto L_0x0149
            goto L_0x0094
        L_0x0149:
            throw r12
        L_0x014a:
            LK.i r0 = new LK.i
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0157:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: LK.f.i(int, int, int, int, boolean, GK.e, GK.r):void");
    }

    public final void j(z zVar, C15778F f10, IOException iOException) {
        C17542s.j(zVar, "client");
        C17542s.j(f10, "failedRoute");
        C17542s.j(iOException, "failure");
        if (f10.b().type() != Proxy.Type.DIRECT) {
            C15782a a10 = f10.a();
            a10.i().connectFailed(a10.l().u(), f10.b().address(), iOException);
        }
        zVar.A().b(f10);
    }

    public final List<Reference<e>> q() {
        return this.f136190r;
    }

    public final long r() {
        return this.f136191s;
    }

    public final boolean s() {
        return this.f136184l;
    }

    public final int t() {
        return this.f136186n;
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f136176d.a().l().i());
        sb2.append(':');
        sb2.append(this.f136176d.a().l().o());
        sb2.append(", proxy=");
        sb2.append(this.f136176d.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f136176d.d());
        sb2.append(" cipherSuite=");
        C15801t tVar = this.f136179g;
        if (tVar == null || (obj = tVar.a()) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f136180h);
        sb2.append('}');
        return sb2.toString();
    }

    public final synchronized void u() {
        this.f136187o++;
    }

    public final boolean v(C15782a aVar, List<C15778F> list) {
        C17542s.j(aVar, PlaceTypes.ADDRESS);
        if (C15864d.f135363h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        } else if (this.f136190r.size() >= this.f136189q || this.f136184l || !this.f136176d.a().d(aVar)) {
            return false;
        } else {
            if (C17542s.e(aVar.l().i(), C().a().l().i())) {
                return true;
            }
            if (this.f136181i == null || list == null || !D(list) || aVar.e() != C16555d.f138919a || !H(aVar.l())) {
                return false;
            }
            try {
                C15788g a10 = aVar.a();
                C17542s.g(a10);
                String i10 = aVar.l().i();
                C15801t b10 = b();
                C17542s.g(b10);
                a10.a(i10, b10.d());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    public final boolean w(boolean z10) {
        long j10;
        if (!C15864d.f135363h || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket = this.f136177e;
            C17542s.g(socket);
            Socket socket2 = this.f136178f;
            C17542s.g(socket2);
            C16772g gVar = this.f136182j;
            C17542s.g(gVar);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            C16176f fVar = this.f136181i;
            if (fVar != null) {
                return fVar.t0(nanoTime);
            }
            synchronized (this) {
                j10 = nanoTime - this.f136191s;
            }
            if (j10 < 10000000000L || !z10) {
                return true;
            }
            return C15864d.G(socket2, gVar);
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final boolean x() {
        return this.f136181i != null;
    }

    public final MK.d y(z zVar, g gVar) {
        C17542s.j(zVar, "client");
        C17542s.j(gVar, "chain");
        Socket socket = this.f136178f;
        C17542s.g(socket);
        C16772g gVar2 = this.f136182j;
        C17542s.g(gVar2);
        C16771f fVar = this.f136183k;
        C17542s.g(fVar);
        C16176f fVar2 = this.f136181i;
        if (fVar2 != null) {
            return new C16177g(zVar, this, gVar, fVar2);
        }
        socket.setSoTimeout(gVar.n());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gVar2.y().g((long) gVar.k(), timeUnit);
        fVar.y().g((long) gVar.m(), timeUnit);
        return new C16125b(zVar, this, gVar2, fVar);
    }

    public final C16637d.C3407d z(c cVar) {
        C17542s.j(cVar, "exchange");
        Socket socket = this.f136178f;
        C17542s.g(socket);
        C16772g gVar = this.f136182j;
        C17542s.g(gVar);
        C16771f fVar = this.f136183k;
        C17542s.g(fVar);
        socket.setSoTimeout(0);
        B();
        return new e(gVar, fVar, cVar);
    }
}
