package L6;

import M6.A;
import M6.f;
import M6.k;
import M6.r;
import M6.t;
import M6.w;
import N6.d;
import N6.f;
import QJ.M;
import QJ.S;
import TJ.C16532g;
import X6.c;
import X6.e;
import X6.g;
import Y6.e;
import Y6.g;
import YH.C16877v;
import dI.C17164e;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.q;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 W2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u000226B\u0001\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\b\b\u0000\u0010\u001d*\u00020\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b!\u0010\"J+\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\b\b\u0000\u0010\u001d*\u00020\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J;\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000/0.\"\b\b\u0000\u0010\u001d*\u00020*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010-\u001a\u00020\u0014H\u0000¢\u0006\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b:\u00105R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bD\u0010FR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t8\u0016X\u0004¢\u0006\f\n\u0004\bG\u0010<\u001a\u0004\bB\u0010>R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bG\u0010JR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0016X\u0004¢\u0006\f\n\u0004\bK\u0010I\u001a\u0004\bH\u0010JR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0016X\u0004¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\b;\u0010JR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010I\u001a\u0004\bM\u0010JR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020P8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, d2 = {"LL6/b;", "", "Ljava/io/Closeable;", "Lokio/Closeable;", "LW6/a;", "networkTransport", "LM6/k;", "customScalarAdapters", "subscriptionNetworkTransport", "", "LT6/a;", "interceptors", "LM6/r;", "executionContext", "LQJ/M;", "dispatcher", "LN6/f;", "httpMethod", "LN6/d;", "httpHeaders", "", "sendApqExtensions", "sendDocument", "enableAutoPersistedQueries", "canBeBatched", "LL6/b$a;", "builder", "<init>", "(LW6/a;LM6/k;LW6/a;Ljava/util/List;LM6/r;LQJ/M;LN6/f;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;LL6/b$a;)V", "D", "LM6/A;", "query", "LL6/a;", "n", "(LM6/A;)LL6/a;", "LM6/t;", "mutation", "l", "(LM6/t;)LL6/a;", "LXH/N;", "close", "()V", "LM6/w$a;", "LM6/f;", "apolloRequest", "ignoreApolloClientHttpHeaders", "LTJ/g;", "LM6/g;", "c", "(LM6/f;Z)LTJ/g;", "a", "LW6/a;", "getNetworkTransport", "()LW6/a;", "b", "LM6/k;", "getCustomScalarAdapters", "()LM6/k;", "getSubscriptionNetworkTransport", "d", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "e", "LM6/r;", "()LM6/r;", "f", "LQJ/M;", "g", "LN6/f;", "()LN6/f;", "h", "i", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "j", "k", "getCanBeBatched", "m", "LL6/b$a;", "LL6/c;", "LL6/c;", "concurrencyInfo", "LT6/d;", "o", "LT6/d;", "networkInterceptor", "p", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b implements Closeable {

    /* renamed from: p  reason: collision with root package name */
    public static final C0604b f38312p = new C0604b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final W6.a f38313a;

    /* renamed from: b  reason: collision with root package name */
    private final k f38314b;

    /* renamed from: c  reason: collision with root package name */
    private final W6.a f38315c;

    /* renamed from: d  reason: collision with root package name */
    private final List<T6.a> f38316d;

    /* renamed from: e  reason: collision with root package name */
    private final r f38317e;

    /* renamed from: f  reason: collision with root package name */
    private final M f38318f;

    /* renamed from: g  reason: collision with root package name */
    private final f f38319g;

    /* renamed from: h  reason: collision with root package name */
    private final List<d> f38320h;

    /* renamed from: i  reason: collision with root package name */
    private final Boolean f38321i;

    /* renamed from: j  reason: collision with root package name */
    private final Boolean f38322j;

    /* renamed from: k  reason: collision with root package name */
    private final Boolean f38323k;

    /* renamed from: l  reason: collision with root package name */
    private final Boolean f38324l;

    /* renamed from: m  reason: collision with root package name */
    private final a f38325m;

    /* renamed from: n  reason: collision with root package name */
    private final c f38326n;

    /* renamed from: o  reason: collision with root package name */
    private final T6.d f38327o;

    @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0$8\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00105\u001a\u0002008\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\n\u00101\u001a\u0004\b\u001e\u00102\"\u0004\b3\u00104R\u0018\u00107\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u00106R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u00108R\u0018\u0010:\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u00106R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR=\u0010N\u001a&\b\u0001\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0K\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010I8\u0002@\u0002X\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bL\u0010MR1\u0010R\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040K\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010O8\u0002@\u0002X\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010Y\u001a\u0004\u0018\u00010S8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\b%\u0010V\"\u0004\bW\u0010XR*\u0010^\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010$8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b[\u0010\u001f\u001a\u0004\b!\u0010'\"\u0004\b\\\u0010]R$\u0010c\u001a\u0004\u0018\u00010C8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b_\u0010E\u001a\u0004\b*\u0010`\"\u0004\ba\u0010bR$\u0010f\u001a\u0004\u0018\u00010C8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bd\u0010E\u001a\u0004\b-\u0010`\"\u0004\be\u0010bR$\u0010i\u001a\u0004\u0018\u00010C8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bg\u0010E\u001a\u0004\b\u0019\u0010`\"\u0004\bh\u0010bR$\u0010l\u001a\u0004\u0018\u00010C8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bj\u0010E\u001a\u0004\b\u0016\u0010`\"\u0004\bk\u0010b\u0002\u0004\n\u0002\b\u0019¨\u0006m"}, d2 = {"LL6/b$a;", "", "<init>", "()V", "", "serverUrl", "j", "(Ljava/lang/String;)LL6/b$a;", "LX6/c;", "httpEngine", "i", "(LX6/c;)LL6/b$a;", "LY6/d;", "webSocketEngine", "k", "(LY6/d;)LL6/b$a;", "LL6/b;", "a", "()LL6/b;", "LW6/a;", "LW6/a;", "_networkTransport", "b", "subscriptionNetworkTransport", "LM6/k$a;", "c", "LM6/k$a;", "customScalarAdaptersBuilder", "", "LT6/a;", "d", "Ljava/util/List;", "_interceptors", "e", "LT6/a;", "apqInterceptor", "", "f", "getInterceptors", "()Ljava/util/List;", "interceptors", "LX6/e;", "g", "httpInterceptors", "LQJ/M;", "h", "LQJ/M;", "dispatcher", "LM6/r;", "LM6/r;", "()LM6/r;", "setExecutionContext", "(LM6/r;)V", "executionContext", "Ljava/lang/String;", "httpServerUrl", "LX6/c;", "l", "webSocketServerUrl", "", "m", "Ljava/lang/Long;", "webSocketIdleTimeoutMillis", "LY6/g$a;", "n", "LY6/g$a;", "wsProtocolFactory", "", "o", "Ljava/lang/Boolean;", "httpExposeErrorBody", "p", "LY6/d;", "Lkotlin/Function3;", "", "LdI/e;", "q", "LnI/q;", "webSocketReopenWhen", "Lkotlin/Function1;", "r", "LnI/l;", "webSocketReopenServerUrl", "LN6/f;", "s", "LN6/f;", "()LN6/f;", "setHttpMethod", "(LN6/f;)V", "httpMethod", "LN6/d;", "t", "setHttpHeaders", "(Ljava/util/List;)V", "httpHeaders", "u", "()Ljava/lang/Boolean;", "setSendApqExtensions", "(Ljava/lang/Boolean;)V", "sendApqExtensions", "v", "setSendDocument", "sendDocument", "w", "setEnableAutoPersistedQueries", "enableAutoPersistedQueries", "x", "setCanBeBatched", "canBeBatched", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private W6.a f38328a;

        /* renamed from: b  reason: collision with root package name */
        private W6.a f38329b;

        /* renamed from: c  reason: collision with root package name */
        private final k.a f38330c = new k.a();

        /* renamed from: d  reason: collision with root package name */
        private final List<T6.a> f38331d;

        /* renamed from: e  reason: collision with root package name */
        private T6.a f38332e;

        /* renamed from: f  reason: collision with root package name */
        private final List<T6.a> f38333f;

        /* renamed from: g  reason: collision with root package name */
        private final List<e> f38334g;

        /* renamed from: h  reason: collision with root package name */
        private M f38335h;

        /* renamed from: i  reason: collision with root package name */
        private r f38336i;

        /* renamed from: j  reason: collision with root package name */
        private String f38337j;

        /* renamed from: k  reason: collision with root package name */
        private c f38338k;

        /* renamed from: l  reason: collision with root package name */
        private String f38339l;

        /* renamed from: m  reason: collision with root package name */
        private Long f38340m;

        /* renamed from: n  reason: collision with root package name */
        private g.a f38341n;

        /* renamed from: o  reason: collision with root package name */
        private Boolean f38342o;

        /* renamed from: p  reason: collision with root package name */
        private Y6.d f38343p;

        /* renamed from: q  reason: collision with root package name */
        private q<? super Throwable, ? super Long, ? super C17164e<? super Boolean>, ? extends Object> f38344q;

        /* renamed from: r  reason: collision with root package name */
        private C17642l<? super C17164e<? super String>, ? extends Object> f38345r;

        /* renamed from: s  reason: collision with root package name */
        private f f38346s;

        /* renamed from: t  reason: collision with root package name */
        private List<d> f38347t;

        /* renamed from: u  reason: collision with root package name */
        private Boolean f38348u;

        /* renamed from: v  reason: collision with root package name */
        private Boolean f38349v;

        /* renamed from: w  reason: collision with root package name */
        private Boolean f38350w;

        /* renamed from: x  reason: collision with root package name */
        private Boolean f38351x;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f38331d = arrayList;
            this.f38333f = arrayList;
            this.f38334g = new ArrayList();
            this.f38336i = r.f38608b;
            U6.f.a();
        }

        public final b a() {
            W6.a a10;
            W6.a aVar;
            if (this.f38328a != null) {
                if (this.f38337j != null) {
                    throw new IllegalStateException("Apollo: 'httpServerUrl' has no effect if 'networkTransport' is set");
                } else if (this.f38338k != null) {
                    throw new IllegalStateException("Apollo: 'httpEngine' has no effect if 'networkTransport' is set");
                } else if (!this.f38334g.isEmpty()) {
                    throw new IllegalStateException("Apollo: 'addHttpInterceptor' has no effect if 'networkTransport' is set");
                } else if (this.f38342o == null) {
                    a10 = this.f38328a;
                    C17542s.g(a10);
                } else {
                    throw new IllegalStateException("Apollo: 'httpExposeErrorBody' has no effect if 'networkTransport' is set");
                }
            } else if (this.f38337j != null) {
                g.a aVar2 = new g.a();
                String str = this.f38337j;
                C17542s.g(str);
                g.a e10 = aVar2.e(str);
                c cVar = this.f38338k;
                if (cVar != null) {
                    C17542s.g(cVar);
                    e10.c(cVar);
                }
                Boolean bool = this.f38342o;
                if (bool != null) {
                    C17542s.g(bool);
                    e10.b(bool.booleanValue());
                }
                a10 = e10.d(this.f38334g).a();
            } else {
                throw new IllegalStateException("Apollo: 'serverUrl' is required");
            }
            W6.a aVar3 = a10;
            W6.a aVar4 = this.f38329b;
            if (aVar4 == null) {
                String str2 = this.f38339l;
                if (str2 == null) {
                    str2 = this.f38337j;
                }
                if (str2 == null) {
                    aVar = aVar3;
                    return new b(aVar3, this.f38330c.c(), aVar, C16877v.V0(this.f38331d, C16877v.r(this.f38332e)), d(), this.f38335h, f(), e(), g(), h(), c(), b(), this, (DefaultConstructorMarker) null);
                }
                e.b e11 = new e.b().e(str2);
                Y6.d dVar = this.f38343p;
                if (dVar != null) {
                    C17542s.g(dVar);
                    e11.g(dVar);
                }
                Long l10 = this.f38340m;
                if (l10 != null) {
                    C17542s.g(l10);
                    e11.b(l10.longValue());
                }
                g.a aVar5 = this.f38341n;
                if (aVar5 != null) {
                    C17542s.g(aVar5);
                    e11.c(aVar5);
                }
                q<? super Throwable, ? super Long, ? super C17164e<? super Boolean>, ? extends Object> qVar = this.f38344q;
                if (qVar != null) {
                    e11.d(qVar);
                }
                C17642l<? super C17164e<? super String>, ? extends Object> lVar = this.f38345r;
                if (lVar != null) {
                    e11.f(lVar);
                }
                aVar4 = e11.a();
            } else if (this.f38339l != null) {
                throw new IllegalStateException("Apollo: 'webSocketServerUrl' has no effect if 'subscriptionNetworkTransport' is set");
            } else if (this.f38343p != null) {
                throw new IllegalStateException("Apollo: 'webSocketEngine' has no effect if 'subscriptionNetworkTransport' is set");
            } else if (this.f38340m != null) {
                throw new IllegalStateException("Apollo: 'webSocketIdleTimeoutMillis' has no effect if 'subscriptionNetworkTransport' is set");
            } else if (this.f38341n != null) {
                throw new IllegalStateException("Apollo: 'wsProtocolFactory' has no effect if 'subscriptionNetworkTransport' is set");
            } else if (this.f38344q != null) {
                throw new IllegalStateException("Apollo: 'webSocketReopenWhen' has no effect if 'subscriptionNetworkTransport' is set");
            } else if (this.f38345r == null) {
                C17542s.g(aVar4);
            } else {
                throw new IllegalStateException("Apollo: 'webSocketReopenServerUrl' has no effect if 'subscriptionNetworkTransport' is set");
            }
            aVar = aVar4;
            return new b(aVar3, this.f38330c.c(), aVar, C16877v.V0(this.f38331d, C16877v.r(this.f38332e)), d(), this.f38335h, f(), e(), g(), h(), c(), b(), this, (DefaultConstructorMarker) null);
        }

        public Boolean b() {
            return this.f38351x;
        }

        public Boolean c() {
            return this.f38350w;
        }

        public r d() {
            return this.f38336i;
        }

        public List<d> e() {
            return this.f38347t;
        }

        public f f() {
            return this.f38346s;
        }

        public Boolean g() {
            return this.f38348u;
        }

        public Boolean h() {
            return this.f38349v;
        }

        public final a i(c cVar) {
            C17542s.j(cVar, "httpEngine");
            this.f38338k = cVar;
            return this;
        }

        public final a j(String str) {
            C17542s.j(str, "serverUrl");
            this.f38337j = str;
            return this;
        }

        public final a k(Y6.d dVar) {
            C17542s.j(dVar, "webSocketEngine");
            this.f38343p = dVar;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LL6/b$b;", "", "<init>", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: L6.b$b  reason: collision with other inner class name */
    public static final class C0604b {
        public /* synthetic */ C0604b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0604b() {
        }
    }

    public /* synthetic */ b(W6.a aVar, k kVar, W6.a aVar2, List list, r rVar, M m10, f fVar, List list2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, a aVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, kVar, aVar2, list, rVar, m10, fVar, list2, bool, bool2, bool3, bool4, aVar3);
    }

    public final <D extends w.a> C16532g<M6.g<D>> c(M6.f<D> fVar, boolean z10) {
        List<d> list;
        C17542s.j(fVar, "apolloRequest");
        f.a e10 = new f.a(fVar.f()).a(this.f38326n).a(this.f38314b).a(this.f38326n.c(this.f38314b).c(e()).c(fVar.c())).a(fVar.c()).o(g()).p(h()).q(i()).e(d());
        if (fVar.d() == null) {
            list = f();
        } else if (z10) {
            list = fVar.d();
        } else {
            List<d> f10 = f();
            if (f10 == null) {
                f10 = C16877v.n();
            }
            List<d> d10 = fVar.d();
            C17542s.g(d10);
            list = C16877v.V0(f10, d10);
        }
        f.a<D> n10 = e10.n(list);
        if (fVar.e() != null) {
            n10.o(fVar.e());
        }
        if (fVar.h() != null) {
            n10.p(fVar.h());
        }
        if (fVar.i() != null) {
            n10.q(fVar.i());
        }
        if (fVar.b() != null) {
            n10.e(fVar.b());
        }
        if (fVar.a() != null) {
            n10.b("X-APOLLO-CAN-BE-BATCHED", String.valueOf(fVar.a()));
        }
        return new T6.c(C16877v.W0(this.f38316d, this.f38327o), 0).a(n10.c());
    }

    public void close() {
        S.e(this.f38326n.d(), (CancellationException) null, 1, (Object) null);
        this.f38313a.b();
        this.f38315c.b();
    }

    public Boolean d() {
        return this.f38323k;
    }

    public r e() {
        return this.f38317e;
    }

    public List<d> f() {
        return this.f38320h;
    }

    public N6.f g() {
        return this.f38319g;
    }

    public Boolean h() {
        return this.f38321i;
    }

    public Boolean i() {
        return this.f38322j;
    }

    public final <D> a<D> l(t<D> tVar) {
        C17542s.j(tVar, "mutation");
        return new a<>(this, tVar);
    }

    public final <D> a<D> n(A<D> a10) {
        C17542s.j(a10, "query");
        return new a<>(this, a10);
    }

    private b(W6.a aVar, k kVar, W6.a aVar2, List<? extends T6.a> list, r rVar, M m10, N6.f fVar, List<d> list2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, a aVar3) {
        this.f38313a = aVar;
        this.f38314b = kVar;
        this.f38315c = aVar2;
        this.f38316d = list;
        this.f38317e = rVar;
        this.f38318f = m10;
        this.f38319g = fVar;
        this.f38320h = list2;
        this.f38321i = bool;
        this.f38322j = bool2;
        this.f38323k = bool3;
        this.f38324l = bool4;
        this.f38325m = aVar3;
        m10 = m10 == null ? U6.f.b() : m10;
        c cVar = new c(m10, S.a(m10));
        this.f38326n = cVar;
        this.f38327o = new T6.d(aVar, aVar2, cVar.e());
    }
}
