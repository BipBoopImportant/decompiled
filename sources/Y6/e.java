package Y6;

import M6.w;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import TJ.C16504A;
import TJ.C16509F;
import TJ.C16511H;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import Y6.g;
import Z6.m;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nI.C17642l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005*\u0001J\u0018\u00002\u00020\u0001:\u0001#B\u0001\b\u0002\u0012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012*\u0010\u0013\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0010ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001f\"\b\b\u0000\u0010\u001c*\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$R-\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b!\u0010%R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R;\u0010\u0013\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00108\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000205088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020=0<8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010L\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"LY6/e;", "LW6/a;", "Lkotlin/Function1;", "LdI/e;", "", "", "serverUrl", "", "LN6/d;", "headers", "LY6/d;", "webSocketEngine", "", "idleTimeoutMillis", "LY6/g$a;", "protocolFactory", "Lkotlin/Function3;", "", "", "reopenWhen", "<init>", "(LnI/l;Ljava/util/List;LY6/d;JLY6/g$a;LnI/q;)V", "LQJ/Q;", "scope", "LXH/N;", "h", "(LQJ/Q;LdI/e;)Ljava/lang/Object;", "LM6/w$a;", "D", "LM6/f;", "request", "LTJ/g;", "LM6/g;", "a", "(LM6/f;)LTJ/g;", "b", "()V", "LnI/l;", "Ljava/util/List;", "c", "LY6/d;", "d", "J", "e", "LY6/g$a;", "f", "LnI/q;", "LSJ/j;", "LZ6/f;", "g", "LSJ/j;", "messages", "LTJ/A;", "LZ6/d;", "LTJ/A;", "mutableEvents", "LTJ/F;", "i", "LTJ/F;", "events", "LTJ/P;", "", "j", "LTJ/P;", "getSubscriptionCount", "()LTJ/P;", "subscriptionCount", "LU6/c;", "k", "LU6/c;", "backgroundDispatcher", "l", "LQJ/Q;", "coroutineScope", "Y6/e$i", "m", "LY6/e$i;", "listener", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class e implements W6.a {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<C17164e<? super String>, Object> f40905a;

    /* renamed from: b  reason: collision with root package name */
    private final List<N6.d> f40906b;

    /* renamed from: c  reason: collision with root package name */
    private final d f40907c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final long f40908d;

    /* renamed from: e  reason: collision with root package name */
    private final g.a f40909e;

    /* renamed from: f  reason: collision with root package name */
    private final q<Throwable, Long, C17164e<? super Boolean>, Object> f40910f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C16434j<Z6.f> f40911g;

    /* renamed from: h  reason: collision with root package name */
    private final C16504A<Z6.d> f40912h;

    /* renamed from: i  reason: collision with root package name */
    private final C16509F<Z6.d> f40913i;

    /* renamed from: j  reason: collision with root package name */
    private final C16519P<Integer> f40914j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final U6.c f40915k;

    /* renamed from: l  reason: collision with root package name */
    private final Q f40916l;

    /* renamed from: m  reason: collision with root package name */
    private final i f40917m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$1", f = "WebSocketNetworkTransport.kt", l = {98}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40918c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f40919d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f40920e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f40920e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f40920e, eVar);
            aVar.f40919d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[SYNTHETIC, Splitter:B:21:0x0043] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0057  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f40918c
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                java.lang.Object r0 = r6.f40919d
                java.io.Closeable r0 = (java.io.Closeable) r0
                XH.y.b(r7)     // Catch:{ all -> 0x0014 }
                goto L_0x0039
            L_0x0014:
                r7 = move-exception
                goto L_0x003e
            L_0x0016:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001e:
                XH.y.b(r7)
                java.lang.Object r7 = r6.f40919d
                QJ.Q r7 = (QJ.Q) r7
                Y6.e r1 = r6.f40920e
                U6.c r1 = r1.f40915k
                Y6.e r4 = r6.f40920e
                r6.f40919d = r1     // Catch:{ all -> 0x003c }
                r6.f40918c = r2     // Catch:{ all -> 0x003c }
                java.lang.Object r7 = r4.h(r7, r6)     // Catch:{ all -> 0x003c }
                if (r7 != r0) goto L_0x0038
                return r0
            L_0x0038:
                r0 = r1
            L_0x0039:
                XH.N r7 = XH.C16807N.f139792a     // Catch:{ all -> 0x0014 }
                goto L_0x0041
            L_0x003c:
                r7 = move-exception
                r0 = r1
            L_0x003e:
                r5 = r3
                r3 = r7
                r7 = r5
            L_0x0041:
                if (r0 == 0) goto L_0x004f
                r0.close()     // Catch:{ all -> 0x0047 }
                goto L_0x004f
            L_0x0047:
                r0 = move-exception
                if (r3 != 0) goto L_0x004c
                r3 = r0
                goto L_0x004f
            L_0x004c:
                XH.C16816g.a(r3, r0)
            L_0x004f:
                if (r3 != 0) goto L_0x0057
                kotlin.jvm.internal.C17542s.g(r7)
                XH.N r7 = XH.C16807N.f139792a
                return r7
            L_0x0057:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: Y6.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\n\u001a\u00020\u00002\u001e\u0010\u0005\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\u001c\u001a\u00020\u00002*\u0010\u001b\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0018ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R1\u0010\u0005\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b8\u0002@\u0002X\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010(R=\u0010\u001b\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00188\u0002@\u0002X\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010)\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"LY6/e$b;", "", "<init>", "()V", "", "serverUrl", "e", "(Ljava/lang/String;)LY6/e$b;", "Lkotlin/Function1;", "LdI/e;", "f", "(LnI/l;)LY6/e$b;", "LY6/d;", "webSocketEngine", "g", "(LY6/d;)LY6/e$b;", "", "idleTimeoutMillis", "b", "(J)LY6/e$b;", "LY6/g$a;", "protocolFactory", "c", "(LY6/g$a;)LY6/e$b;", "Lkotlin/Function3;", "", "", "reopenWhen", "d", "(LnI/q;)LY6/e$b;", "LY6/e;", "a", "()LY6/e;", "LnI/l;", "", "LN6/d;", "Ljava/util/List;", "headers", "LY6/d;", "Ljava/lang/Long;", "LY6/g$a;", "LnI/q;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private C17642l<? super C17164e<? super String>, ? extends Object> f40921a;

        /* renamed from: b  reason: collision with root package name */
        private List<N6.d> f40922b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private d f40923c;

        /* renamed from: d  reason: collision with root package name */
        private Long f40924d;

        /* renamed from: e  reason: collision with root package name */
        private g.a f40925e;

        /* renamed from: f  reason: collision with root package name */
        private q<? super Throwable, ? super Long, ? super C17164e<? super Boolean>, ? extends Object> f40926f;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$Builder$serverUrl$1$1", f = "WebSocketNetworkTransport.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super String>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f40927c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f40928d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str, C17164e<? super a> eVar) {
                super(1, eVar);
                this.f40928d = str;
            }

            public final C17164e<C16807N> create(C17164e<?> eVar) {
                return new a(this.f40928d, eVar);
            }

            /* renamed from: i */
            public final Object invoke(C17164e<? super String> eVar) {
                return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f40927c == 0) {
                    y.b(obj);
                    return this.f40928d;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: Y6.g$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: Y6.b$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: Y6.b$a} */
        /* JADX WARNING: type inference failed for: r1v5 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final Y6.e a() {
            /*
                r18 = this;
                r0 = r18
                Y6.e r10 = new Y6.e
                nI.l<? super dI.e<? super java.lang.String>, ? extends java.lang.Object> r2 = r0.f40921a
                if (r2 == 0) goto L_0x003b
                java.util.List<N6.d> r3 = r0.f40922b
                Y6.d r1 = r0.f40923c
                if (r1 != 0) goto L_0x0013
                Y6.a r1 = new Y6.a
                r1.<init>()
            L_0x0013:
                r4 = r1
                java.lang.Long r1 = r0.f40924d
                if (r1 == 0) goto L_0x001d
                long r5 = r1.longValue()
                goto L_0x0020
            L_0x001d:
                r5 = 60000(0xea60, double:2.9644E-319)
            L_0x0020:
                Y6.g$a r1 = r0.f40925e
                if (r1 != 0) goto L_0x0032
                Y6.b$a r1 = new Y6.b$a
                r16 = 7
                r17 = 0
                r12 = 0
                r14 = 0
                r15 = 0
                r11 = r1
                r11.<init>(r12, r14, r15, r16, r17)
            L_0x0032:
                r7 = r1
                nI.q<? super java.lang.Throwable, ? super java.lang.Long, ? super dI.e<? super java.lang.Boolean>, ? extends java.lang.Object> r8 = r0.f40926f
                r9 = 0
                r1 = r10
                r1.<init>(r2, r3, r4, r5, r7, r8, r9)
                return r10
            L_0x003b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "No serverUrl specified"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Y6.e.b.a():Y6.e");
        }

        public final b b(long j10) {
            this.f40924d = Long.valueOf(j10);
            return this;
        }

        public final b c(g.a aVar) {
            C17542s.j(aVar, "protocolFactory");
            this.f40925e = aVar;
            return this;
        }

        public final b d(q<? super Throwable, ? super Long, ? super C17164e<? super Boolean>, ? extends Object> qVar) {
            this.f40926f = qVar;
            return this;
        }

        public final b e(String str) {
            C17542s.j(str, "serverUrl");
            this.f40921a = new a(str, (C17164e<? super a>) null);
            return this;
        }

        public final b f(C17642l<? super C17164e<? super String>, ? extends Object> lVar) {
            this.f40921a = lVar;
            return this;
        }

        public final b g(d dVar) {
            C17542s.j(dVar, "webSocketEngine");
            this.f40923c = dVar;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements C16532g<Z6.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f40929a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ M6.f f40930b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f40931a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ M6.f f40932b;

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2", f = "WebSocketNetworkTransport.kt", l = {223}, m = "emit")
            /* renamed from: Y6.e$c$a$a  reason: collision with other inner class name */
            public static final class C0687a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f40933c;

                /* renamed from: d  reason: collision with root package name */
                int f40934d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f40935e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0687a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f40935e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f40933c = obj;
                    this.f40934d |= Integer.MIN_VALUE;
                    return this.f40935e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, M6.f fVar) {
                this.f40931a = hVar;
                this.f40932b = fVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof Y6.e.c.a.C0687a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    Y6.e$c$a$a r0 = (Y6.e.c.a.C0687a) r0
                    int r1 = r0.f40934d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f40934d = r1
                    goto L_0x0018
                L_0x0013:
                    Y6.e$c$a$a r0 = new Y6.e$c$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f40933c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f40934d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x005c
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f40931a
                    r2 = r7
                    Z6.d r2 = (Z6.d) r2
                    java.lang.String r4 = r2.getId()
                    M6.f r5 = r6.f40932b
                    java.util.UUID r5 = r5.g()
                    java.lang.String r5 = r5.toString()
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
                    if (r4 != 0) goto L_0x0053
                    java.lang.String r2 = r2.getId()
                    if (r2 != 0) goto L_0x005c
                L_0x0053:
                    r0.f40934d = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x005c
                    return r1
                L_0x005c:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Y6.e.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar, M6.f fVar) {
            this.f40929a = gVar;
            this.f40930b = fVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f40929a.collect(new a(hVar, this.f40930b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d implements C16532g<M6.g<D>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f40936a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ U6.d f40937b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f40938a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ U6.d f40939b;

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2", f = "WebSocketNetworkTransport.kt", l = {223}, m = "emit")
            /* renamed from: Y6.e$d$a$a  reason: collision with other inner class name */
            public static final class C0688a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f40940c;

                /* renamed from: d  reason: collision with root package name */
                int f40941d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f40942e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0688a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f40942e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f40940c = obj;
                    this.f40941d |= Integer.MIN_VALUE;
                    return this.f40942e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, U6.d dVar) {
                this.f40938a = hVar;
                this.f40939b = dVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Y6.e.d.a.C0688a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Y6.e$d$a$a r0 = (Y6.e.d.a.C0688a) r0
                    int r1 = r0.f40941d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f40941d = r1
                    goto L_0x0018
                L_0x0013:
                    Y6.e$d$a$a r0 = new Y6.e$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f40940c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f40941d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004a
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f40938a
                    r2 = r5
                    M6.g r2 = (M6.g) r2
                    U6.d r2 = r4.f40939b
                    boolean r2 = r2.d()
                    if (r2 != 0) goto L_0x004a
                    r0.f40941d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004a
                    return r1
                L_0x004a:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Y6.e.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar, U6.d dVar) {
            this.f40936a = gVar;
            this.f40937b = dVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f40936a.collect(new a(hVar, this.f40937b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: Y6.e$e  reason: collision with other inner class name */
    public static final class C0689e implements C16532g<M6.g<D>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f40943a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ M6.f f40944b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ U6.d f40945c;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: Y6.e$e$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f40946a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ M6.f f40947b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ U6.d f40948c;

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2", f = "WebSocketNetworkTransport.kt", l = {223}, m = "emit")
            /* renamed from: Y6.e$e$a$a  reason: collision with other inner class name */
            public static final class C0690a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f40949c;

                /* renamed from: d  reason: collision with root package name */
                int f40950d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f40951e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0690a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f40951e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f40949c = obj;
                    this.f40950d |= Integer.MIN_VALUE;
                    return this.f40951e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, M6.f fVar, U6.d dVar) {
                this.f40946a = hVar;
                this.f40947b = fVar;
                this.f40948c = dVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof Y6.e.C0689e.a.C0690a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    Y6.e$e$a$a r0 = (Y6.e.C0689e.a.C0690a) r0
                    int r1 = r0.f40950d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f40950d = r1
                    goto L_0x0018
                L_0x0013:
                    Y6.e$e$a$a r0 = new Y6.e$e$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f40949c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f40950d
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    XH.y.b(r7)
                    goto L_0x00b5
                L_0x002a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0032:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f40946a
                    Z6.d r6 = (Z6.d) r6
                    boolean r2 = r6 instanceof Z6.j
                    if (r2 == 0) goto L_0x00b8
                    Z6.j r6 = (Z6.j) r6
                    java.util.Map r6 = r6.a()
                    M6.f r2 = r5.f40947b
                    M6.r r2 = r2.c()
                    M6.k$b r4 = M6.k.f38586f
                    M6.r$c r2 = r2.a(r4)
                    kotlin.jvm.internal.C17542s.g(r2)
                    M6.k r2 = (M6.k) r2
                    boolean r4 = U6.e.a(r6)
                    if (r4 == 0) goto L_0x006f
                    U6.d r4 = r5.f40948c
                    java.util.Map r6 = r4.g(r6)
                    U6.d r4 = r5.f40948c
                    java.util.Set r4 = r4.c()
                    M6.k r2 = M6.C6653a.a(r2, r4)
                    XH.v r6 = XH.C16796C.a(r6, r2)
                    goto L_0x0073
                L_0x006f:
                    XH.v r6 = XH.C16796C.a(r6, r2)
                L_0x0073:
                    java.lang.Object r2 = r6.a()
                    java.util.Map r2 = (java.util.Map) r2
                    java.lang.Object r6 = r6.b()
                    M6.k r6 = (M6.k) r6
                    M6.f r4 = r5.f40947b
                    M6.w r4 = r4.f()
                    Q6.f r2 = Q6.a.c(r2)
                    M6.g r6 = M6.x.a(r4, r2, r6)
                    M6.g$a r6 = r6.a()
                    M6.f r2 = r5.f40947b
                    java.util.UUID r2 = r2.g()
                    M6.g$a r6 = r6.f(r2)
                    M6.g r6 = r6.b()
                    U6.d r2 = r5.f40948c
                    boolean r2 = r2.b()
                    if (r2 != 0) goto L_0x00ac
                    U6.d r2 = r5.f40948c
                    r2.j()
                L_0x00ac:
                    r0.f40950d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x00b5
                    return r1
                L_0x00b5:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                L_0x00b8:
                    boolean r7 = r6 instanceof Z6.i
                    if (r7 != 0) goto L_0x0117
                    boolean r7 = r6 instanceof Z6.g
                    if (r7 != 0) goto L_0x00f0
                    boolean r7 = r6 instanceof Z6.b
                    if (r7 == 0) goto L_0x00c6
                    r7 = r3
                    goto L_0x00c8
                L_0x00c6:
                    boolean r7 = r6 instanceof Z6.h
                L_0x00c8:
                    if (r7 == 0) goto L_0x00cb
                    goto L_0x00cd
                L_0x00cb:
                    boolean r3 = r6 instanceof Z6.e
                L_0x00cd:
                    if (r3 == 0) goto L_0x00ea
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Unexpected event "
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r6 = r0.toString()
                    java.lang.String r6 = r6.toString()
                    r7.<init>(r6)
                    throw r7
                L_0x00ea:
                    XH.t r6 = new XH.t
                    r6.<init>()
                    throw r6
                L_0x00f0:
                    S6.c r7 = new S6.c
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Network error while executing "
                    r0.append(r1)
                    M6.f r1 = r5.f40947b
                    M6.w r1 = r1.f()
                    java.lang.String r1 = r1.name()
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    Z6.g r6 = (Z6.g) r6
                    java.lang.Throwable r6 = r6.a()
                    r7.<init>(r0, r6)
                    throw r7
                L_0x0117:
                    S6.h r7 = new S6.h
                    M6.f r0 = r5.f40947b
                    M6.w r0 = r0.f()
                    java.lang.String r0 = r0.name()
                    Z6.i r6 = (Z6.i) r6
                    java.util.Map r6 = r6.a()
                    r7.<init>(r0, r6)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Y6.e.C0689e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C0689e(C16532g gVar, M6.f fVar, U6.d dVar) {
            this.f40943a = gVar;
            this.f40944b = fVar;
            this.f40945c = dVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f40943a.collect(new a(hVar, this.f40944b, this.f40945c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LM6/w$a;", "D", "LTJ/h;", "LZ6/d;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$1", f = "WebSocketNetworkTransport.kt", l = {272}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super Z6.d>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40952c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f40953d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ M6.f<D> f40954e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar, M6.f<D> fVar, C17164e<? super f> eVar2) {
            super(2, eVar2);
            this.f40953d = eVar;
            this.f40954e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f40953d, this.f40954e, eVar);
        }

        public final Object invoke(C16533h<? super Z6.d> hVar, C17164e<? super C16807N> eVar) {
            return ((f) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f40952c;
            if (i10 == 0) {
                y.b(obj);
                C16434j e10 = this.f40953d.f40911g;
                Z6.l lVar = new Z6.l(this.f40954e);
                this.f40952c = 1;
                if (e10.y(lVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LM6/w$a;", "D", "LTJ/h;", "LZ6/d;", "it", "", "<anonymous>", "(LTJ/h;LZ6/d;)Z"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$3", f = "WebSocketNetworkTransport.kt", l = {287, 298}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super Z6.d>, Z6.d, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40955c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f40956d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f40957e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ M6.f<D> f40958f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(M6.f<D> fVar, C17164e<? super g> eVar) {
            super(3, eVar);
            this.f40958f = fVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super Z6.d> hVar, Z6.d dVar, C17164e<? super Boolean> eVar) {
            g gVar = new g(this.f40958f, eVar);
            gVar.f40956d = hVar;
            gVar.f40957e = dVar;
            return gVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f40955c;
            boolean z10 = false;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f40956d;
                Z6.d dVar = (Z6.d) this.f40957e;
                if (!(dVar instanceof Z6.h) && !(dVar instanceof Z6.b)) {
                    if (dVar instanceof Z6.g) {
                        this.f40956d = null;
                        this.f40955c = 1;
                        if (hVar.emit(dVar, this) == f10) {
                            return f10;
                        }
                    } else if (dVar instanceof Z6.e) {
                        System.out.println("Received general error while executing operation " + this.f40958f.f().name() + ": " + ((Z6.e) dVar).a());
                    } else {
                        this.f40956d = null;
                        this.f40955c = 2;
                        if (hVar.emit(dVar, this) == f10) {
                            return f10;
                        }
                    }
                }
                return kotlin.coroutines.jvm.internal.b.a(z10);
            } else if (i10 == 1) {
                y.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(z10);
            } else if (i10 == 2) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = true;
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LM6/w$a;", "D", "LTJ/h;", "LM6/g;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$6", f = "WebSocketNetworkTransport.kt", l = {333}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super M6.g<D>>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40959c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f40960d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ M6.f<D> f40961e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar, M6.f<D> fVar, C17164e<? super h> eVar2) {
            super(3, eVar2);
            this.f40960d = eVar;
            this.f40961e = fVar;
        }

        public final Object invoke(C16533h<? super M6.g<D>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            return new h(this.f40960d, this.f40961e, eVar).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f40959c;
            if (i10 == 0) {
                y.b(obj);
                C16434j e10 = this.f40960d.f40911g;
                m mVar = new m(this.f40961e);
                this.f40959c = 1;
                if (e10.y(mVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00072\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Y6/e$i", "LY6/g$b;", "", "id", "", "", "payload", "LXH/N;", "c", "(Ljava/lang/String;Ljava/util/Map;)V", "b", "a", "(Ljava/lang/String;)V", "d", "(Ljava/util/Map;)V", "", "cause", "e", "(Ljava/lang/Throwable;)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class i implements g.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f40962a;

        i(e eVar) {
            this.f40962a = eVar;
        }

        public void a(String str) {
            C17542s.j(str, "id");
            this.f40962a.f40911g.k(new Z6.h(str));
        }

        public void b(String str, Map<String, ? extends Object> map) {
            C17542s.j(str, "id");
            this.f40962a.f40911g.k(new Z6.i(str, map));
        }

        public void c(String str, Map<String, ? extends Object> map) {
            C17542s.j(str, "id");
            C17542s.j(map, "payload");
            this.f40962a.f40911g.k(new Z6.j(str, map));
        }

        public void d(Map<String, ? extends Object> map) {
            this.f40962a.f40911g.k(new Z6.e(map));
        }

        public void e(Throwable th2) {
            C17542s.j(th2, "cause");
            this.f40962a.f40911g.k(new Z6.g(th2));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport", f = "WebSocketNetworkTransport.kt", l = {154, 159, 161, 195, 194, 204, 214, 218, 244}, m = "supervise")
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f40963c;

        /* renamed from: d  reason: collision with root package name */
        Object f40964d;

        /* renamed from: e  reason: collision with root package name */
        Object f40965e;

        /* renamed from: f  reason: collision with root package name */
        Object f40966f;

        /* renamed from: g  reason: collision with root package name */
        Object f40967g;

        /* renamed from: h  reason: collision with root package name */
        Object f40968h;

        /* renamed from: i  reason: collision with root package name */
        Object f40969i;

        /* renamed from: j  reason: collision with root package name */
        Object f40970j;

        /* renamed from: k  reason: collision with root package name */
        long f40971k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f40972l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e f40973m;

        /* renamed from: n  reason: collision with root package name */
        int f40974n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(e eVar, C17164e<? super j> eVar2) {
            super(eVar2);
            this.f40973m = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f40972l = obj;
            this.f40974n |= Integer.MIN_VALUE;
            return this.f40973m.h((Q) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$supervise$3", f = "WebSocketNetworkTransport.kt", l = {229}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40975c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O<g> f40976d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(O<g> o10, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f40976d = o10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f40976d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f40975c;
            if (i10 == 0) {
                y.b(obj);
                T t10 = this.f40976d.f144348a;
                C17542s.g(t10);
                this.f40975c = 1;
                if (((g) t10).f(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.f(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$supervise$4", f = "WebSocketNetworkTransport.kt", l = {254}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40977c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f40978d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ O<g> f40979e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ O<F0> f40980f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ O<F0> f40981g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(e eVar, O<g> o10, O<F0> o11, O<F0> o12, C17164e<? super l> eVar2) {
            super(2, eVar2);
            this.f40978d = eVar;
            this.f40979e = o10;
            this.f40980f = o11;
            this.f40981g = o12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new l(this.f40978d, this.f40979e, this.f40980f, this.f40981g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f40977c;
            if (i10 == 0) {
                y.b(obj);
                long d10 = this.f40978d.f40908d;
                this.f40977c = 1;
                if (C16297b0.b(d10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.i(this.f40979e, this.f40980f, this.f40981g);
            return C16807N.f139792a;
        }
    }

    public /* synthetic */ e(C17642l lVar, List list, d dVar, long j10, g.a aVar, q qVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, list, dVar, j10, aVar, qVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:91|92|93|94|(4:96|97|98|(9:100|110|111|112|113|114|115|(1:117)(16:118|119|120|121|122|123|(1:125)|126|127|146|(0)(0)|157|(0)(0)|164|38|(0)(0))|117))|104|(4:105|(1:168)|107|(2:167|109))|110|111|112|113|114|115|(0)|117) */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:118|119|120|121|122|123|(1:125)|126|127|146|(0)(0)|157|(0)(0)|164|38|(0)(0)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:81|(9:145|127|146|(2:149|(2:152|(2:154|(1:156)))(1:151))(1:148)|157|(1:159)(3:160|(1:162)|163)|164|38|(0))|83|(1:85)|87|88|(1:90)(15:91|92|93|94|(4:96|97|98|(9:100|110|111|112|113|114|115|(1:117)(16:118|119|120|121|122|123|(1:125)|126|127|146|(0)(0)|157|(0)(0)|164|38|(0)(0))|117))|104|(4:105|(1:168)|107|(2:167|109))|110|111|112|113|114|115|(0)|117)|90) */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0333, code lost:
        r7 = r10;
        r8 = r11;
        r10 = r12;
        r12 = r13;
        r13 = r15;
        r11 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03e0, code lost:
        r6 = r0;
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r0 = r15;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0420, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0421, code lost:
        r2 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0425, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0426, code lost:
        r2 = r3;
        r11 = r1;
        r1 = r4;
        r22 = r10;
        r10 = r5;
        r4 = r13;
        r13 = r22;
        r23 = r8;
        r8 = r7;
        r7 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0457, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x040c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0457 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01fd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(QJ.Q r26, dI.C17164e<? super XH.C16807N> r27) {
        /*
            r25 = this;
            r0 = r27
            boolean r1 = r0 instanceof Y6.e.j
            if (r1 == 0) goto L_0x0017
            r1 = r0
            Y6.e$j r1 = (Y6.e.j) r1
            int r2 = r1.f40974n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f40974n = r2
            r2 = r25
            goto L_0x001e
        L_0x0017:
            Y6.e$j r1 = new Y6.e$j
            r2 = r25
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f40972l
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r1.f40974n
            r6 = 1
            r9 = 0
            switch(r4) {
                case 0: goto L_0x01c2;
                case 1: goto L_0x0197;
                case 2: goto L_0x0174;
                case 3: goto L_0x0147;
                case 4: goto L_0x0114;
                case 5: goto L_0x00dc;
                case 6: goto L_0x00ae;
                case 7: goto L_0x007e;
                case 8: goto L_0x0053;
                case 9: goto L_0x0033;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            long r10 = r1.f40971k
            java.lang.Object r4 = r1.f40968h
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r12 = r1.f40967g
            kotlin.jvm.internal.O r12 = (kotlin.jvm.internal.O) r12
            java.lang.Object r13 = r1.f40966f
            kotlin.jvm.internal.O r13 = (kotlin.jvm.internal.O) r13
            java.lang.Object r14 = r1.f40965e
            kotlin.jvm.internal.O r14 = (kotlin.jvm.internal.O) r14
            java.lang.Object r15 = r1.f40964d
            QJ.Q r15 = (QJ.Q) r15
            java.lang.Object r5 = r1.f40963c
            Y6.e r5 = (Y6.e) r5
            XH.y.b(r0)
            r2 = r3
            goto L_0x04cf
        L_0x0053:
            long r4 = r1.f40971k
            java.lang.Object r10 = r1.f40968h
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r1.f40967g
            kotlin.jvm.internal.O r11 = (kotlin.jvm.internal.O) r11
            java.lang.Object r12 = r1.f40966f
            kotlin.jvm.internal.O r12 = (kotlin.jvm.internal.O) r12
            java.lang.Object r13 = r1.f40965e
            kotlin.jvm.internal.O r13 = (kotlin.jvm.internal.O) r13
            java.lang.Object r14 = r1.f40964d
            QJ.Q r14 = (QJ.Q) r14
            java.lang.Object r15 = r1.f40963c
            Y6.e r15 = (Y6.e) r15
            XH.y.b(r0)
            r2 = r3
            r8 = r10
            r7 = r11
            r0 = r14
        L_0x0074:
            r10 = r15
            r22 = r4
            r4 = r1
            r5 = r12
            r1 = r13
            r11 = r22
            goto L_0x0411
        L_0x007e:
            long r4 = r1.f40971k
            java.lang.Object r10 = r1.f40969i
            Z6.f r10 = (Z6.f) r10
            java.lang.Object r11 = r1.f40968h
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r12 = r1.f40967g
            kotlin.jvm.internal.O r12 = (kotlin.jvm.internal.O) r12
            java.lang.Object r13 = r1.f40966f
            kotlin.jvm.internal.O r13 = (kotlin.jvm.internal.O) r13
            java.lang.Object r14 = r1.f40965e
            kotlin.jvm.internal.O r14 = (kotlin.jvm.internal.O) r14
            java.lang.Object r15 = r1.f40964d
            QJ.Q r15 = (QJ.Q) r15
            java.lang.Object r7 = r1.f40963c
            Y6.e r7 = (Y6.e) r7
            XH.y.b(r0)     // Catch:{ Exception -> 0x00a2 }
            r2 = r3
            goto L_0x03be
        L_0x00a2:
            r0 = move-exception
            r6 = r0
            r2 = r3
            r3 = r9
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r0 = r15
        L_0x00ab:
            r15 = r7
            goto L_0x03e9
        L_0x00ae:
            long r4 = r1.f40971k
            java.lang.Object r7 = r1.f40968h
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r1.f40967g
            kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
            java.lang.Object r10 = r1.f40966f
            kotlin.jvm.internal.O r10 = (kotlin.jvm.internal.O) r10
            java.lang.Object r11 = r1.f40965e
            kotlin.jvm.internal.O r11 = (kotlin.jvm.internal.O) r11
            java.lang.Object r12 = r1.f40964d
            QJ.Q r12 = (QJ.Q) r12
            java.lang.Object r13 = r1.f40963c
            Y6.e r13 = (Y6.e) r13
            XH.y.b(r0)
            r2 = r3
        L_0x00cc:
            r0 = r12
            r22 = r4
            r4 = r1
            r5 = r10
            r1 = r11
            r10 = r13
            r11 = r22
            r24 = r8
            r8 = r7
            r7 = r24
            goto L_0x0411
        L_0x00dc:
            long r4 = r1.f40971k
            java.lang.Object r7 = r1.f40969i
            Z6.f r7 = (Z6.f) r7
            java.lang.Object r8 = r1.f40968h
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r10 = r1.f40967g
            kotlin.jvm.internal.O r10 = (kotlin.jvm.internal.O) r10
            java.lang.Object r11 = r1.f40966f
            kotlin.jvm.internal.O r11 = (kotlin.jvm.internal.O) r11
            java.lang.Object r12 = r1.f40965e
            kotlin.jvm.internal.O r12 = (kotlin.jvm.internal.O) r12
            java.lang.Object r13 = r1.f40964d
            QJ.Q r13 = (QJ.Q) r13
            java.lang.Object r14 = r1.f40963c
            Y6.e r14 = (Y6.e) r14
            XH.y.b(r0)     // Catch:{ Exception -> 0x010a }
            r2 = r3
            r15 = r13
            r13 = r11
            r11 = r8
            r22 = r10
            r10 = r7
            r7 = r14
            r14 = r12
            r12 = r22
            goto L_0x0395
        L_0x010a:
            r0 = move-exception
            r2 = r3
            r7 = r8
            r8 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            goto L_0x0434
        L_0x0114:
            long r4 = r1.f40971k
            java.lang.Object r7 = r1.f40970j
            Y6.d r7 = (Y6.d) r7
            java.lang.Object r8 = r1.f40969i
            Z6.f r8 = (Z6.f) r8
            java.lang.Object r10 = r1.f40968h
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r1.f40967g
            kotlin.jvm.internal.O r11 = (kotlin.jvm.internal.O) r11
            java.lang.Object r12 = r1.f40966f
            kotlin.jvm.internal.O r12 = (kotlin.jvm.internal.O) r12
            java.lang.Object r13 = r1.f40965e
            kotlin.jvm.internal.O r13 = (kotlin.jvm.internal.O) r13
            java.lang.Object r14 = r1.f40964d
            QJ.Q r14 = (QJ.Q) r14
            java.lang.Object r15 = r1.f40963c
            Y6.e r15 = (Y6.e) r15
            XH.y.b(r0)     // Catch:{ Exception -> 0x013d }
            r6 = r13
            r13 = r14
            goto L_0x031b
        L_0x013d:
            r0 = move-exception
            r2 = r3
            r7 = r10
            r8 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            goto L_0x0434
        L_0x0147:
            long r4 = r1.f40971k
            java.lang.Object r7 = r1.f40968h
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r1.f40967g
            kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
            java.lang.Object r10 = r1.f40966f
            kotlin.jvm.internal.O r10 = (kotlin.jvm.internal.O) r10
            java.lang.Object r11 = r1.f40965e
            kotlin.jvm.internal.O r11 = (kotlin.jvm.internal.O) r11
            java.lang.Object r12 = r1.f40964d
            QJ.Q r12 = (QJ.Q) r12
            java.lang.Object r13 = r1.f40963c
            Y6.e r13 = (Y6.e) r13
            XH.y.b(r0)
            r0 = r12
            r22 = r4
            r4 = r1
            r5 = r10
            r1 = r11
            r10 = r13
            r11 = r22
            r24 = r8
            r8 = r7
            r7 = r24
            goto L_0x028d
        L_0x0174:
            long r4 = r1.f40971k
            java.lang.Object r7 = r1.f40969i
            Z6.f r7 = (Z6.f) r7
            java.lang.Object r8 = r1.f40968h
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r10 = r1.f40967g
            kotlin.jvm.internal.O r10 = (kotlin.jvm.internal.O) r10
            java.lang.Object r11 = r1.f40966f
            kotlin.jvm.internal.O r11 = (kotlin.jvm.internal.O) r11
            java.lang.Object r12 = r1.f40965e
            kotlin.jvm.internal.O r12 = (kotlin.jvm.internal.O) r12
            java.lang.Object r13 = r1.f40964d
            QJ.Q r13 = (QJ.Q) r13
            java.lang.Object r14 = r1.f40963c
            Y6.e r14 = (Y6.e) r14
            XH.y.b(r0)
            goto L_0x0249
        L_0x0197:
            long r4 = r1.f40971k
            java.lang.Object r7 = r1.f40968h
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r1.f40967g
            kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
            java.lang.Object r10 = r1.f40966f
            kotlin.jvm.internal.O r10 = (kotlin.jvm.internal.O) r10
            java.lang.Object r11 = r1.f40965e
            kotlin.jvm.internal.O r11 = (kotlin.jvm.internal.O) r11
            java.lang.Object r12 = r1.f40964d
            QJ.Q r12 = (QJ.Q) r12
            java.lang.Object r13 = r1.f40963c
            Y6.e r13 = (Y6.e) r13
            XH.y.b(r0)
            r22 = r4
            r4 = r1
            r5 = r10
            r1 = r11
            r10 = r13
            r13 = r22
            r24 = r8
            r8 = r7
            r7 = r24
            goto L_0x0204
        L_0x01c2:
            XH.y.b(r0)
            kotlin.jvm.internal.O r0 = new kotlin.jvm.internal.O
            r0.<init>()
            kotlin.jvm.internal.O r4 = new kotlin.jvm.internal.O
            r4.<init>()
            kotlin.jvm.internal.O r5 = new kotlin.jvm.internal.O
            r5.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            r10 = r2
            r8 = r7
            r11 = 0
            r7 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r26
        L_0x01e3:
            SJ.j<Z6.f> r13 = r10.f40911g
            r4.f40963c = r10
            r4.f40964d = r0
            r4.f40965e = r1
            r4.f40966f = r5
            r4.f40967g = r7
            r4.f40968h = r8
            r4.f40969i = r9
            r4.f40971k = r11
            r4.f40974n = r6
            java.lang.Object r13 = r13.j(r4)
            if (r13 != r3) goto L_0x01fe
            return r3
        L_0x01fe:
            r22 = r11
            r12 = r0
            r0 = r13
            r13 = r22
        L_0x0204:
            Z6.f r0 = (Z6.f) r0
            boolean r11 = r0 instanceof Z6.d
            if (r11 == 0) goto L_0x02c5
            boolean r11 = r0 instanceof Z6.g
            if (r11 == 0) goto L_0x029d
            i(r7, r5, r1)
            nI.q<java.lang.Throwable, java.lang.Long, dI.e<? super java.lang.Boolean>, java.lang.Object> r11 = r10.f40910f
            if (r11 == 0) goto L_0x0263
            r15 = r0
            Z6.g r15 = (Z6.g) r15
            java.lang.Throwable r15 = r15.a()
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.b.f(r13)
            r4.f40963c = r10
            r4.f40964d = r12
            r4.f40965e = r1
            r4.f40966f = r5
            r4.f40967g = r7
            r4.f40968h = r8
            r4.f40969i = r0
            r4.f40971k = r13
            r6 = 2
            r4.f40974n = r6
            java.lang.Object r6 = r11.invoke(r15, r9, r4)
            if (r6 != r3) goto L_0x023a
            return r3
        L_0x023a:
            r11 = r5
            r22 = r7
            r7 = r0
            r0 = r6
            r23 = r12
            r12 = r1
            r1 = r4
            r4 = r13
            r14 = r10
            r13 = r23
            r10 = r22
        L_0x0249:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6 = 1
            if (r0 != r6) goto L_0x025e
            r0 = r7
            r7 = r10
            r10 = r14
            r6 = 1
        L_0x0256:
            r22 = r4
            r4 = r1
            r5 = r11
            r1 = r12
        L_0x025b:
            r11 = r22
            goto L_0x0268
        L_0x025e:
            r0 = r7
            r7 = r10
            r10 = r14
            r6 = 0
            goto L_0x0256
        L_0x0263:
            r6 = 0
            r22 = r13
            r13 = r12
            goto L_0x025b
        L_0x0268:
            if (r6 == 0) goto L_0x0291
            r14 = 1
            long r11 = r11 + r14
            SJ.j<Z6.f> r0 = r10.f40911g
            Z6.k r6 = Z6.k.f41408a
            r4.f40963c = r10
            r4.f40964d = r13
            r4.f40965e = r1
            r4.f40966f = r5
            r4.f40967g = r7
            r4.f40968h = r8
            r9 = 0
            r4.f40969i = r9
            r4.f40971k = r11
            r9 = 3
            r4.f40974n = r9
            java.lang.Object r0 = r0.y(r6, r4)
            if (r0 != r3) goto L_0x028c
            return r3
        L_0x028c:
            r0 = r13
        L_0x028d:
            r6 = 1
            r9 = 0
            goto L_0x01e3
        L_0x0291:
            TJ.A<Z6.d> r6 = r10.f40912h
            r6.a(r0)
            r0 = r13
        L_0x0297:
            r6 = 1
            r9 = 0
            r11 = 0
            goto L_0x01e3
        L_0x029d:
            boolean r6 = r0 instanceof Z6.b
            if (r6 == 0) goto L_0x02bf
            java.util.Collection r0 = r8.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x02ab:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x02bd
            java.lang.Object r6 = r0.next()
            Z6.l r6 = (Z6.l) r6
            SJ.j<Z6.f> r9 = r10.f40911g
            r9.k(r6)
            goto L_0x02ab
        L_0x02bd:
            r0 = r12
            goto L_0x0297
        L_0x02bf:
            TJ.A<Z6.d> r6 = r10.f40912h
            r6.a(r0)
            goto L_0x02bd
        L_0x02c5:
            boolean r6 = r0 instanceof Z6.a
            if (r6 == 0) goto L_0x02e8
            boolean r6 = r0 instanceof Z6.c
            if (r6 == 0) goto L_0x02d3
            i(r7, r5, r1)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x02d3:
            T r6 = r7.f144348a
            if (r6 != 0) goto L_0x0458
            boolean r6 = r0 instanceof Z6.m
            if (r6 == 0) goto L_0x02ed
            Z6.m r0 = (Z6.m) r0
            M6.f r0 = r0.a()
            java.util.UUID r0 = r0.g()
            r8.remove(r0)
        L_0x02e8:
            r2 = r3
            r3 = 0
            r6 = 1
            goto L_0x0516
        L_0x02ed:
            Y6.d r6 = r10.f40907c     // Catch:{ Exception -> 0x0425 }
            nI.l<dI.e<? super java.lang.String>, java.lang.Object> r9 = r10.f40905a     // Catch:{ Exception -> 0x0425 }
            r4.f40963c = r10     // Catch:{ Exception -> 0x0425 }
            r4.f40964d = r12     // Catch:{ Exception -> 0x0425 }
            r4.f40965e = r1     // Catch:{ Exception -> 0x0425 }
            r4.f40966f = r5     // Catch:{ Exception -> 0x0425 }
            r4.f40967g = r7     // Catch:{ Exception -> 0x0425 }
            r4.f40968h = r8     // Catch:{ Exception -> 0x0425 }
            r4.f40969i = r0     // Catch:{ Exception -> 0x0425 }
            r4.f40970j = r6     // Catch:{ Exception -> 0x0425 }
            r4.f40971k = r13     // Catch:{ Exception -> 0x0425 }
            r11 = 4
            r4.f40974n = r11     // Catch:{ Exception -> 0x0425 }
            java.lang.Object r9 = r9.invoke(r4)     // Catch:{ Exception -> 0x0425 }
            if (r9 != r3) goto L_0x030d
            return r3
        L_0x030d:
            r11 = r7
            r15 = r10
            r7 = r6
            r10 = r8
            r8 = r0
            r6 = r1
            r1 = r4
            r0 = r9
            r22 = r12
            r12 = r5
            r4 = r13
            r13 = r22
        L_0x031b:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0331 }
            java.util.List<N6.d> r9 = r15.f40906b     // Catch:{ Exception -> 0x0331 }
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ Exception -> 0x0331 }
            boolean r14 = r9 instanceof java.util.Collection     // Catch:{ Exception -> 0x0331 }
            java.lang.String r2 = "Sec-WebSocket-Protocol"
            if (r14 == 0) goto L_0x033b
            r14 = r9
            java.util.Collection r14 = (java.util.Collection) r14     // Catch:{ Exception -> 0x0331 }
            boolean r14 = r14.isEmpty()     // Catch:{ Exception -> 0x0331 }
            if (r14 == 0) goto L_0x033b
            goto L_0x035a
        L_0x0331:
            r0 = move-exception
            r2 = r3
        L_0x0333:
            r7 = r10
            r8 = r11
            r10 = r12
            r12 = r13
            r13 = r15
            r11 = r6
            goto L_0x0434
        L_0x033b:
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0331 }
        L_0x033f:
            boolean r14 = r9.hasNext()     // Catch:{ Exception -> 0x0331 }
            if (r14 == 0) goto L_0x035a
            java.lang.Object r14 = r9.next()     // Catch:{ Exception -> 0x0331 }
            N6.d r14 = (N6.d) r14     // Catch:{ Exception -> 0x0331 }
            java.lang.String r14 = r14.a()     // Catch:{ Exception -> 0x0331 }
            boolean r14 = kotlin.jvm.internal.C17542s.e(r14, r2)     // Catch:{ Exception -> 0x0331 }
            if (r14 == 0) goto L_0x033f
            java.util.List<N6.d> r2 = r15.f40906b     // Catch:{ Exception -> 0x0331 }
            r16 = r3
            goto L_0x036f
        L_0x035a:
            java.util.List<N6.d> r9 = r15.f40906b     // Catch:{ Exception -> 0x0331 }
            java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ Exception -> 0x0331 }
            N6.d r14 = new N6.d     // Catch:{ Exception -> 0x0331 }
            r16 = r3
            Y6.g$a r3 = r15.f40909e     // Catch:{ Exception -> 0x0420 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0420 }
            r14.<init>(r2, r3)     // Catch:{ Exception -> 0x0420 }
            java.util.List r2 = YH.C16877v.W0(r9, r14)     // Catch:{ Exception -> 0x0420 }
        L_0x036f:
            r1.f40963c = r15     // Catch:{ Exception -> 0x0420 }
            r1.f40964d = r13     // Catch:{ Exception -> 0x0420 }
            r1.f40965e = r6     // Catch:{ Exception -> 0x0420 }
            r1.f40966f = r12     // Catch:{ Exception -> 0x0420 }
            r1.f40967g = r11     // Catch:{ Exception -> 0x0420 }
            r1.f40968h = r10     // Catch:{ Exception -> 0x0420 }
            r1.f40969i = r8     // Catch:{ Exception -> 0x0420 }
            r3 = 0
            r1.f40970j = r3     // Catch:{ Exception -> 0x0420 }
            r1.f40971k = r4     // Catch:{ Exception -> 0x0420 }
            r3 = 5
            r1.f40974n = r3     // Catch:{ Exception -> 0x0420 }
            java.lang.Object r0 = r7.a(r0, r2, r1)     // Catch:{ Exception -> 0x0420 }
            r2 = r16
            if (r0 != r2) goto L_0x038e
            return r2
        L_0x038e:
            r14 = r6
            r7 = r15
            r15 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r8
        L_0x0395:
            Y6.c r0 = (Y6.c) r0     // Catch:{ Exception -> 0x0418 }
            Y6.g$a r3 = r7.f40909e
            Y6.e$i r6 = r7.f40917m
            Y6.g r0 = r3.a(r0, r6, r15)
            r12.f144348a = r0
            kotlin.jvm.internal.C17542s.g(r0)     // Catch:{ Exception -> 0x03df }
            r1.f40963c = r7     // Catch:{ Exception -> 0x03df }
            r1.f40964d = r15     // Catch:{ Exception -> 0x03df }
            r1.f40965e = r14     // Catch:{ Exception -> 0x03df }
            r1.f40966f = r13     // Catch:{ Exception -> 0x03df }
            r1.f40967g = r12     // Catch:{ Exception -> 0x03df }
            r1.f40968h = r11     // Catch:{ Exception -> 0x03df }
            r1.f40969i = r10     // Catch:{ Exception -> 0x03df }
            r1.f40971k = r4     // Catch:{ Exception -> 0x03df }
            r3 = 7
            r1.f40974n = r3     // Catch:{ Exception -> 0x03df }
            java.lang.Object r0 = r0.b(r1)     // Catch:{ Exception -> 0x03df }
            if (r0 != r2) goto L_0x03be
            return r2
        L_0x03be:
            QJ.T r18 = QJ.T.UNDISPATCHED
            Y6.e$k r0 = new Y6.e$k
            r3 = 0
            r0.<init>(r12, r3)
            r20 = 1
            r21 = 0
            r17 = 0
            r16 = r15
            r19 = r0
            QJ.F0 r0 = QJ.C16314k.d(r16, r17, r18, r19, r20, r21)
            r13.f144348a = r0
            r0 = r10
            r22 = r4
            r5 = r7
            r4 = r11
        L_0x03db:
            r10 = r22
            goto L_0x0464
        L_0x03df:
            r0 = move-exception
            r6 = r0
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r0 = r15
            r3 = 0
            goto L_0x00ab
        L_0x03e9:
            r11.f144348a = r3
            SJ.j<Z6.f> r7 = r15.f40911g
            Z6.g r8 = new Z6.g
            r8.<init>(r6)
            r1.f40963c = r15
            r1.f40964d = r0
            r1.f40965e = r13
            r1.f40966f = r12
            r1.f40967g = r11
            r1.f40968h = r10
            r1.f40969i = r3
            r1.f40971k = r4
            r3 = 8
            r1.f40974n = r3
            java.lang.Object r3 = r7.y(r8, r1)
            if (r3 != r2) goto L_0x040d
            return r2
        L_0x040d:
            r8 = r10
            r7 = r11
            goto L_0x0074
        L_0x0411:
            r3 = r2
            r6 = 1
            r9 = 0
        L_0x0414:
            r2 = r25
            goto L_0x01e3
        L_0x0418:
            r0 = move-exception
            r8 = r12
            r10 = r13
            r12 = r15
            r13 = r7
            r7 = r11
            r11 = r14
            goto L_0x0434
        L_0x0420:
            r0 = move-exception
            r2 = r16
            goto L_0x0333
        L_0x0425:
            r0 = move-exception
            r2 = r3
            r11 = r1
            r1 = r4
            r22 = r10
            r10 = r5
            r4 = r13
            r13 = r22
            r23 = r8
            r8 = r7
            r7 = r23
        L_0x0434:
            SJ.j<Z6.f> r3 = r13.f40911g
            Z6.g r6 = new Z6.g
            r6.<init>(r0)
            r1.f40963c = r13
            r1.f40964d = r12
            r1.f40965e = r11
            r1.f40966f = r10
            r1.f40967g = r8
            r1.f40968h = r7
            r9 = 0
            r1.f40969i = r9
            r1.f40970j = r9
            r1.f40971k = r4
            r0 = 6
            r1.f40974n = r0
            java.lang.Object r0 = r3.y(r6, r1)
            if (r0 != r2) goto L_0x00cc
            return r2
        L_0x0458:
            r2 = r3
            r15 = r12
            r12 = r7
            r22 = r13
            r14 = r1
            r1 = r4
            r13 = r5
            r4 = r8
            r5 = r10
            goto L_0x03db
        L_0x0464:
            r3 = r0
            Z6.a r3 = (Z6.a) r3
            boolean r6 = r3 instanceof Z6.l
            if (r6 == 0) goto L_0x0488
            r3 = r0
            Z6.l r3 = (Z6.l) r3
            M6.f r6 = r3.a()
            java.util.UUID r6 = r6.g()
            r4.put(r6, r0)
            T r0 = r12.f144348a
            kotlin.jvm.internal.C17542s.g(r0)
            Y6.g r0 = (Y6.g) r0
            M6.f r3 = r3.a()
            r0.k(r3)
            goto L_0x04cf
        L_0x0488:
            boolean r6 = r3 instanceof Z6.m
            if (r6 == 0) goto L_0x04a8
            Z6.m r0 = (Z6.m) r0
            M6.f r3 = r0.a()
            java.util.UUID r3 = r3.g()
            r4.remove(r3)
            T r3 = r12.f144348a
            kotlin.jvm.internal.C17542s.g(r3)
            Y6.g r3 = (Y6.g) r3
            M6.f r0 = r0.a()
            r3.l(r0)
            goto L_0x04cf
        L_0x04a8:
            boolean r0 = r3 instanceof Z6.k
            if (r0 == 0) goto L_0x04cf
            SJ.j<Z6.f> r0 = r5.f40911g
            Z6.b r3 = new Z6.b
            r3.<init>()
            r1.f40963c = r5
            r1.f40964d = r15
            r1.f40965e = r14
            r1.f40966f = r13
            r1.f40967g = r12
            r1.f40968h = r4
            r6 = 0
            r1.f40969i = r6
            r1.f40971k = r10
            r6 = 9
            r1.f40974n = r6
            java.lang.Object r0 = r0.y(r3, r1)
            if (r0 != r2) goto L_0x04cf
            return r2
        L_0x04cf:
            r9 = r1
            r1 = r14
            r0 = r15
            r14 = r10
            r10 = r4
            r11 = r5
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L_0x04fa
            Y6.e$l r19 = new Y6.e$l
            r8 = 0
            r3 = r19
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r20 = 3
            r21 = 0
            r17 = 0
            r18 = 0
            r16 = r0
            QJ.F0 r3 = QJ.C16314k.d(r16, r17, r18, r19, r20, r21)
            r1.f144348a = r3
            r4 = 0
            r6 = 1
            goto L_0x0507
        L_0x04fa:
            T r3 = r1.f144348a
            QJ.F0 r3 = (QJ.F0) r3
            r4 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0505
            QJ.F0.a.a(r3, r4, r6, r4)
        L_0x0505:
            r1.f144348a = r4
        L_0x0507:
            r3 = r2
            r8 = r10
            r10 = r11
            r7 = r12
            r5 = r13
            r11 = r14
            r2 = r25
            r22 = r9
            r9 = r4
            r4 = r22
            goto L_0x01e3
        L_0x0516:
            r9 = r3
            r0 = r12
            r11 = r13
            r3 = r2
            goto L_0x0414
        */
        throw new UnsupportedOperationException("Method not decompiled: Y6.e.h(QJ.Q, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final void i(O<g> o10, O<F0> o11, O<F0> o12) {
        g gVar = (g) o10.f144348a;
        if (gVar != null) {
            gVar.a();
        }
        o10.f144348a = null;
        F0 f02 = (F0) o11.f144348a;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        o11.f144348a = null;
        F0 f03 = (F0) o12.f144348a;
        if (f03 != null) {
            F0.a.a(f03, (CancellationException) null, 1, (Object) null);
        }
        o12.f144348a = null;
    }

    public <D extends w.a> C16532g<M6.g<D>> a(M6.f<D> fVar) {
        C17542s.j(fVar, "request");
        U6.d dVar = new U6.d();
        return C16534i.Q(new d(new C0689e(U6.g.a(new c(C16534i.T(this.f40913i, new f(this, fVar, (C17164e<? super f>) null)), fVar), new g(fVar, (C17164e<? super g>) null)), fVar, dVar), dVar), new h(this, fVar, (C17164e<? super h>) null));
    }

    public void b() {
        this.f40911g.k(Z6.c.f41398a);
    }

    private e(C17642l<? super C17164e<? super String>, ? extends Object> lVar, List<N6.d> list, d dVar, long j10, g.a aVar, q<? super Throwable, ? super Long, ? super C17164e<? super Boolean>, ? extends Object> qVar) {
        this.f40905a = lVar;
        this.f40906b = list;
        this.f40907c = dVar;
        this.f40908d = j10;
        this.f40909e = aVar;
        this.f40910f = qVar;
        this.f40911g = C16437m.b(Integer.MAX_VALUE, (C16428d) null, (C17642l) null, 6, (Object) null);
        C16504A<Z6.d> a10 = C16511H.a(0, Integer.MAX_VALUE, C16428d.SUSPEND);
        this.f40912h = a10;
        this.f40913i = C16534i.b(a10);
        this.f40914j = a10.b();
        U6.c cVar = new U6.c();
        this.f40915k = cVar;
        Q a11 = S.a(cVar.c());
        this.f40916l = a11;
        F0 unused = C16314k.d(a11, (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
        this.f40917m = new i(this);
    }
}
