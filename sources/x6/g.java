package X6;

import M6.k;
import M6.r;
import M6.w;
import M6.x;
import N6.h;
import N6.i;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import WK.C16772g;
import X6.e;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 =2\u00020\u0001:\u0003$+1B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJE\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\u000e*\u00020\r*\b\u0012\u0004\u0012\u00028\u00000\u00152\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J3\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b$\u0010%JA\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0018\u0010<\u001a\u000609R\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"LX6/g;", "LW6/a;", "LN6/h;", "httpRequestComposer", "LX6/c;", "engine", "", "LX6/e;", "interceptors", "", "exposeErrorBody", "<init>", "(LN6/h;LX6/c;Ljava/util/List;Z)V", "LM6/w$a;", "D", "LM6/w;", "operation", "LM6/k;", "customScalarAdapters", "LN6/i;", "httpResponse", "LM6/g;", "l", "(LM6/w;LM6/k;LN6/i;)LM6/g;", "LTJ/g;", "k", "(LM6/w;LM6/k;LN6/i;)LTJ/g;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "", "millisStart", "m", "(LM6/g;Ljava/util/UUID;LN6/i;J)LM6/g;", "LM6/f;", "request", "a", "(LM6/f;)LTJ/g;", "LN6/g;", "httpRequest", "g", "(LM6/f;LN6/g;LM6/k;)LTJ/g;", "LXH/N;", "b", "()V", "LN6/h;", "LX6/c;", "h", "()LX6/c;", "c", "Ljava/util/List;", "j", "()Ljava/util/List;", "d", "Z", "i", "()Z", "LX6/g$c;", "e", "LX6/g$c;", "engineInterceptor", "f", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class g implements W6.a {

    /* renamed from: f  reason: collision with root package name */
    public static final b f40715f = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h f40716a;

    /* renamed from: b  reason: collision with root package name */
    private final c f40717b;

    /* renamed from: c  reason: collision with root package name */
    private final List<e> f40718c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f40719d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final c f40720e;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010 ¨\u0006!"}, d2 = {"LX6/g$a;", "", "<init>", "()V", "", "serverUrl", "e", "(Ljava/lang/String;)LX6/g$a;", "", "exposeErrorBody", "b", "(Z)LX6/g$a;", "LX6/c;", "httpEngine", "c", "(LX6/c;)LX6/g$a;", "", "LX6/e;", "interceptors", "d", "(Ljava/util/List;)LX6/g$a;", "LX6/g;", "a", "()LX6/g;", "LN6/h;", "LN6/h;", "httpRequestComposer", "Ljava/lang/String;", "LX6/c;", "engine", "", "Ljava/util/List;", "Z", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private h f40721a;

        /* renamed from: b  reason: collision with root package name */
        private String f40722b;

        /* renamed from: c  reason: collision with root package name */
        private c f40723c;

        /* renamed from: d  reason: collision with root package name */
        private final List<e> f40724d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private boolean f40725e;

        public final g a() {
            h hVar = this.f40721a;
            if (hVar == null || this.f40722b == null) {
                if (hVar == null) {
                    String str = this.f40722b;
                    hVar = str != null ? new N6.b(str) : null;
                    if (hVar == null) {
                        throw new IllegalStateException("No HttpRequestComposer found. Use 'httpRequestComposer' or 'serverUrl'");
                    }
                }
                h hVar2 = hVar;
                c cVar = this.f40723c;
                if (cVar == null) {
                    cVar = new a(0, 1, (DefaultConstructorMarker) null);
                }
                return new g(hVar2, cVar, this.f40724d, this.f40725e, (DefaultConstructorMarker) null);
            }
            throw new IllegalStateException("It is an error to set both 'httpRequestComposer' and 'serverUrl'");
        }

        public final a b(boolean z10) {
            this.f40725e = z10;
            return this;
        }

        public final a c(c cVar) {
            C17542s.j(cVar, "httpEngine");
            this.f40723c = cVar;
            return this;
        }

        public final a d(List<? extends e> list) {
            C17542s.j(list, "interceptors");
            this.f40724d.clear();
            this.f40724d.addAll(list);
            return this;
        }

        public final a e(String str) {
            C17542s.j(str, "serverUrl");
            this.f40722b = str;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LX6/g$b;", "", "<init>", "()V", "", "throwable", "LS6/a;", "b", "(Ljava/lang/Throwable;)LS6/a;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final S6.a b(Throwable th2) {
            return th2 instanceof S6.a ? (S6.a) th2 : new S6.d("Failed to parse GraphQL http network response", th2);
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"LX6/g$c;", "LX6/e;", "<init>", "(LX6/g;)V", "LN6/g;", "request", "LX6/f;", "chain", "LN6/i;", "a", "(LN6/g;LX6/f;LdI/e;)Ljava/lang/Object;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class c implements e {
        public c() {
        }

        public Object a(N6.g gVar, f fVar, C17164e<? super i> eVar) {
            return g.this.h().a(gVar, eVar);
        }

        public void b() {
            e.a.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LM6/w$a;", "D", "LTJ/h;", "LM6/g;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1", f = "HttpNetworkTransport.kt", l = {65, 85, 90}, m = "invokeSuspend")
    static final class d extends l implements p<C16533h<? super M6.g<D>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        long f40727c;

        /* renamed from: d  reason: collision with root package name */
        int f40728d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f40729e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f40730f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ N6.g f40731g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ M6.f<D> f40732h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ k f40733i;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a implements C16532g<M6.g<D>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f40734a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f40735b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ M6.f f40736c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ i f40737d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f40738e;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            /* renamed from: X6.g$d$a$a  reason: collision with other inner class name */
            public static final class C0677a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f40739a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ g f40740b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ M6.f f40741c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ i f40742d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ long f40743e;

                @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2", f = "HttpNetworkTransport.kt", l = {223}, m = "emit")
                /* renamed from: X6.g$d$a$a$a  reason: collision with other inner class name */
                public static final class C0678a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f40744c;

                    /* renamed from: d  reason: collision with root package name */
                    int f40745d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C0677a f40746e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0678a(C0677a aVar, C17164e eVar) {
                        super(eVar);
                        this.f40746e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f40744c = obj;
                        this.f40745d |= Integer.MIN_VALUE;
                        return this.f40746e.emit((Object) null, this);
                    }
                }

                public C0677a(C16533h hVar, g gVar, M6.f fVar, i iVar, long j10) {
                    this.f40739a = hVar;
                    this.f40740b = gVar;
                    this.f40741c = fVar;
                    this.f40742d = iVar;
                    this.f40743e = j10;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r11, dI.C17164e r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof X6.g.d.a.C0677a.C0678a
                        if (r0 == 0) goto L_0x0013
                        r0 = r12
                        X6.g$d$a$a$a r0 = (X6.g.d.a.C0677a.C0678a) r0
                        int r1 = r0.f40745d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f40745d = r1
                        goto L_0x0018
                    L_0x0013:
                        X6.g$d$a$a$a r0 = new X6.g$d$a$a$a
                        r0.<init>(r10, r12)
                    L_0x0018:
                        java.lang.Object r12 = r0.f40744c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f40745d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r12)
                        goto L_0x0052
                    L_0x0029:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L_0x0031:
                        XH.y.b(r12)
                        TJ.h r12 = r10.f40739a
                        r5 = r11
                        M6.g r5 = (M6.g) r5
                        X6.g r4 = r10.f40740b
                        M6.f r11 = r10.f40741c
                        java.util.UUID r6 = r11.g()
                        N6.i r7 = r10.f40742d
                        long r8 = r10.f40743e
                        M6.g r11 = r4.m(r5, r6, r7, r8)
                        r0.f40745d = r3
                        java.lang.Object r11 = r12.emit(r11, r0)
                        if (r11 != r1) goto L_0x0052
                        return r1
                    L_0x0052:
                        XH.N r11 = XH.C16807N.f139792a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X6.g.d.a.C0677a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public a(C16532g gVar, g gVar2, M6.f fVar, i iVar, long j10) {
                this.f40734a = gVar;
                this.f40735b = gVar2;
                this.f40736c = fVar;
                this.f40737d = iVar;
                this.f40738e = j10;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f40734a.collect(new C0677a(hVar, this.f40735b, this.f40736c, this.f40737d, this.f40738e), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar, N6.g gVar2, M6.f<D> fVar, k kVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f40730f = gVar;
            this.f40731g = gVar2;
            this.f40732h = fVar;
            this.f40733i = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f40730f, this.f40731g, this.f40732h, this.f40733i, eVar);
            dVar.f40729e = obj;
            return dVar;
        }

        public final Object invoke(C16533h<? super M6.g<D>> hVar, C17164e<? super C16807N> eVar) {
            return ((d) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r12.f40728d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r4) goto L_0x001f
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                goto L_0x001a
            L_0x0012:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001a:
                XH.y.b(r13)
                goto L_0x00bc
            L_0x001f:
                long r4 = r12.f40727c
                java.lang.Object r1 = r12.f40729e
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r13)
                r9 = r4
                goto L_0x005e
            L_0x002a:
                XH.y.b(r13)
                java.lang.Object r13 = r12.f40729e
                r1 = r13
                TJ.h r1 = (TJ.C16533h) r1
                long r5 = V6.a.a()
                X6.b r13 = new X6.b
                X6.g r7 = r12.f40730f
                java.util.List r7 = r7.j()
                java.util.Collection r7 = (java.util.Collection) r7
                X6.g r8 = r12.f40730f
                X6.g$c r8 = r8.f40720e
                java.util.List r7 = YH.C16877v.W0(r7, r8)
                r8 = 0
                r13.<init>(r7, r8)
                N6.g r7 = r12.f40731g
                r12.f40729e = r1
                r12.f40727c = r5
                r12.f40728d = r4
                java.lang.Object r13 = r13.a(r7, r12)
                if (r13 != r0) goto L_0x005d
                return r0
            L_0x005d:
                r9 = r5
            L_0x005e:
                N6.i r13 = (N6.i) r13
                int r4 = r13.c()
                r5 = 200(0xc8, float:2.8E-43)
                r11 = 0
                if (r5 > r4) goto L_0x00bf
                r5 = 300(0x12c, float:4.2E-43)
                if (r4 >= r5) goto L_0x00bf
                boolean r4 = U6.h.c(r13)
                if (r4 == 0) goto L_0x0097
                X6.g r2 = r12.f40730f
                M6.f<D> r4 = r12.f40732h
                M6.w r4 = r4.f()
                M6.k r5 = r12.f40733i
                TJ.g r5 = r2.k(r4, r5, r13)
                X6.g r6 = r12.f40730f
                M6.f<D> r7 = r12.f40732h
                X6.g$d$a r2 = new X6.g$d$a
                r4 = r2
                r8 = r13
                r4.<init>(r5, r6, r7, r8, r9)
                r12.f40729e = r11
                r12.f40728d = r3
                java.lang.Object r13 = TJ.C16534i.x(r1, r2, r12)
                if (r13 != r0) goto L_0x00bc
                return r0
            L_0x0097:
                X6.g r4 = r12.f40730f
                M6.f<D> r3 = r12.f40732h
                M6.w r3 = r3.f()
                M6.k r5 = r12.f40733i
                M6.g r5 = r4.l(r3, r5, r13)
                M6.f<D> r3 = r12.f40732h
                java.util.UUID r6 = r3.g()
                r7 = r13
                r8 = r9
                M6.g r13 = r4.m(r5, r6, r7, r8)
                r12.f40729e = r11
                r12.f40728d = r2
                java.lang.Object r13 = r1.emit(r13, r12)
                if (r13 != r0) goto L_0x00bc
                return r0
            L_0x00bc:
                XH.N r13 = XH.C16807N.f139792a
                return r13
            L_0x00bf:
                X6.g r0 = r12.f40730f
                boolean r0 = r0.i()
                if (r0 != 0) goto L_0x00d2
                WK.g r0 = r13.a()
                if (r0 == 0) goto L_0x00d0
                r0.close()
            L_0x00d0:
                r3 = r11
                goto L_0x00d7
            L_0x00d2:
                WK.g r11 = r13.a()
                goto L_0x00d0
            L_0x00d7:
                S6.b r8 = new S6.b
                int r1 = r13.c()
                java.util.List r2 = r13.b()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "Http request failed with status code `"
                r0.append(r4)
                int r13 = r13.c()
                r0.append(r13)
                r13 = 96
                r0.append(r13)
                java.lang.String r4 = r0.toString()
                r6 = 16
                r7 = 0
                r5 = 0
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: X6.g.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e implements C16532g<M6.g<D>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f40747a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f40748b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f40749c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O f40750d;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f40751a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ w f40752b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ k f40753c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ O f40754d;

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2", f = "HttpNetworkTransport.kt", l = {301}, m = "emit")
            /* renamed from: X6.g$e$a$a  reason: collision with other inner class name */
            public static final class C0679a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f40755c;

                /* renamed from: d  reason: collision with root package name */
                int f40756d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f40757e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0679a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f40757e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f40755c = obj;
                    this.f40756d |= Integer.MIN_VALUE;
                    return this.f40757e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, w wVar, k kVar, O o10) {
                this.f40751a = hVar;
                this.f40752b = wVar;
                this.f40753c = kVar;
                this.f40754d = o10;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, dI.C17164e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof X6.g.e.a.C0679a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    X6.g$e$a$a r0 = (X6.g.e.a.C0679a) r0
                    int r1 = r0.f40756d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f40756d = r1
                    goto L_0x0018
                L_0x0013:
                    X6.g$e$a$a r0 = new X6.g$e$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f40755c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f40756d
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    XH.y.b(r9)
                    goto L_0x00a6
                L_0x002a:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0032:
                    XH.y.b(r9)
                    TJ.h r9 = r7.f40751a
                    WK.g r8 = (WK.C16772g) r8
                    kotlin.jvm.internal.O r2 = r7.f40754d
                    T r4 = r2.f144348a
                    if (r4 != 0) goto L_0x0046
                    U6.d r4 = new U6.d
                    r4.<init>()
                    r2.f144348a = r4
                L_0x0046:
                    kotlin.jvm.internal.O r2 = r7.f40754d
                    T r2 = r2.f144348a
                    kotlin.jvm.internal.C17542s.g(r2)
                    U6.d r2 = (U6.d) r2
                    java.util.Map r8 = r2.f(r8)
                    kotlin.jvm.internal.O r2 = r7.f40754d
                    T r2 = r2.f144348a
                    kotlin.jvm.internal.C17542s.g(r2)
                    U6.d r2 = (U6.d) r2
                    java.util.Set r2 = r2.c()
                    kotlin.jvm.internal.O r4 = r7.f40754d
                    T r4 = r4.f144348a
                    kotlin.jvm.internal.C17542s.g(r4)
                    U6.d r4 = (U6.d) r4
                    boolean r4 = r4.b()
                    r4 = r4 ^ r3
                    kotlin.jvm.internal.O r5 = r7.f40754d
                    T r5 = r5.f144348a
                    kotlin.jvm.internal.C17542s.g(r5)
                    U6.d r5 = (U6.d) r5
                    boolean r5 = r5.d()
                    if (r5 == 0) goto L_0x007f
                    r8 = 0
                    goto L_0x009b
                L_0x007f:
                    M6.w r5 = r7.f40752b
                    Q6.f r8 = Q6.a.c(r8)
                    M6.k r6 = r7.f40753c
                    M6.k r2 = M6.C6653a.a(r6, r2)
                    M6.g r8 = M6.x.a(r5, r8, r2)
                    M6.g$a r8 = r8.a()
                    M6.g$a r8 = r8.e(r4)
                    M6.g r8 = r8.b()
                L_0x009b:
                    if (r8 == 0) goto L_0x00a6
                    r0.f40756d = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L_0x00a6
                    return r1
                L_0x00a6:
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: X6.g.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar, w wVar, k kVar, O o10) {
            this.f40747a = gVar;
            this.f40748b = wVar;
            this.f40749c = kVar;
            this.f40750d = o10;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f40747a.collect(new a(hVar, this.f40748b, this.f40749c, this.f40750d), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LM6/w$a;", "D", "LTJ/h;", "LM6/g;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.http.HttpNetworkTransport$multipleResponses$2", f = "HttpNetworkTransport.kt", l = {}, m = "invokeSuspend")
    static final class f extends l implements q<C16533h<? super M6.g<D>>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40758c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f40759d;

        f(C17164e<? super f> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super M6.g<D>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            f fVar = new f(eVar);
            fVar.f40759d = th2;
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f40758c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.b(obj);
            throw g.f40715f.b((Throwable) this.f40759d);
        }
    }

    public /* synthetic */ g(h hVar, c cVar, List list, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, cVar, list, z10);
    }

    /* access modifiers changed from: private */
    public final <D extends w.a> C16532g<M6.g<D>> k(w<D> wVar, k kVar, i iVar) {
        return C16534i.g(new e(U6.h.d(iVar), wVar, kVar, new O()), new f((C17164e<? super f>) null));
    }

    /* access modifiers changed from: private */
    public final <D extends w.a> M6.g<D> l(w<D> wVar, k kVar, i iVar) {
        try {
            C16772g a10 = iVar.a();
            C17542s.g(a10);
            return x.a(wVar, Q6.a.b(a10), kVar).a().e(true).b();
        } catch (Exception e10) {
            throw f40715f.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public final <D extends w.a> M6.g<D> m(M6.g<D> gVar, UUID uuid, i iVar, long j10) {
        return gVar.a().f(uuid).a(new d(j10, V6.a.a(), iVar.c(), iVar.b())).b();
    }

    public <D extends w.a> C16532g<M6.g<D>> a(M6.f<D> fVar) {
        C17542s.j(fVar, "request");
        r.c a10 = fVar.c().a(k.f38586f);
        C17542s.g(a10);
        return g(fVar, this.f40716a.a(fVar), (k) a10);
    }

    public void b() {
        for (e b10 : this.f40718c) {
            b10.b();
        }
        this.f40717b.b();
    }

    public final <D extends w.a> C16532g<M6.g<D>> g(M6.f<D> fVar, N6.g gVar, k kVar) {
        C17542s.j(fVar, "request");
        C17542s.j(gVar, "httpRequest");
        C17542s.j(kVar, "customScalarAdapters");
        return C16534i.H(new d(this, gVar, fVar, kVar, (C17164e<? super d>) null));
    }

    public final c h() {
        return this.f40717b;
    }

    public final boolean i() {
        return this.f40719d;
    }

    public final List<e> j() {
        return this.f40718c;
    }

    private g(h hVar, c cVar, List<? extends e> list, boolean z10) {
        this.f40716a = hVar;
        this.f40717b = cVar;
        this.f40718c = list;
        this.f40719d = z10;
        this.f40720e = new c();
    }
}
