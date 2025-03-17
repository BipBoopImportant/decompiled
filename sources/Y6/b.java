package Y6;

import M6.w;
import QJ.Q;
import XH.C16796C;
import XH.C16807N;
import XH.y;
import Y6.g;
import YH.X;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import dI.C17164e;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001$B`\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012.\b\u0002\u0010\r\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u0012\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u0012\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R=\u0010\r\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\b8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"LY6/b;", "LY6/g;", "LY6/c;", "webSocketConnection", "LY6/g$b;", "listener", "", "connectionAcknowledgeTimeoutMs", "Lkotlin/Function1;", "LdI/e;", "", "", "", "connectionPayload", "LY6/f;", "frameType", "<init>", "(LY6/c;LY6/g$b;JLnI/l;LY6/f;)V", "LXH/N;", "b", "(LdI/e;)Ljava/lang/Object;", "messageMap", "d", "(Ljava/util/Map;)V", "LM6/w$a;", "D", "LM6/f;", "request", "k", "(LM6/f;)V", "l", "c", "J", "LnI/l;", "e", "LY6/f;", "a", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b extends g {

    /* renamed from: c  reason: collision with root package name */
    private final long f40891c;

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<C17164e<? super Map<String, ? extends Object>>, Object> f40892d;

    /* renamed from: e  reason: collision with root package name */
    private final f f40893e;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @f(c = "com.apollographql.apollo3.network.ws.SubscriptionWsProtocol", f = "SubscriptionWsProtocol.kt", l = {31, 38}, m = "connectionInit")
    /* renamed from: Y6.b$b  reason: collision with other inner class name */
    static final class C0686b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f40898c;

        /* renamed from: d  reason: collision with root package name */
        Object f40899d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f40900e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f40901f;

        /* renamed from: g  reason: collision with root package name */
        int f40902g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0686b(b bVar, C17164e<? super C0686b> eVar) {
            super(eVar);
            this.f40901f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f40900e = obj;
            this.f40902g |= Integer.MIN_VALUE;
            return this.f40901f.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 5, 1})
    @f(c = "com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$connectionInit$2", f = "SubscriptionWsProtocol.kt", l = {39}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40903c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f40904d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f40904d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f40904d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f40903c;
            if (i10 == 0) {
                y.b(obj);
                b bVar = this.f40904d;
                this.f40903c = 1;
                obj = bVar.e(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map = (Map) obj;
            Object obj2 = map.get("type");
            if (C17542s.e(obj2, "connection_ack")) {
                return C16807N.f139792a;
            }
            if (!C17542s.e(obj2, "connection_error")) {
                System.out.println("unknown message while waiting for connection_ack: '" + obj2);
                return C16807N.f139792a;
            }
            throw new S6.c("Connection error:\n" + map, (Object) null, 2, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar, g.b bVar, long j10, C17642l<? super C17164e<? super Map<String, ? extends Object>>, ? extends Object> lVar, f fVar) {
        super(cVar, bVar);
        C17542s.j(cVar, "webSocketConnection");
        C17542s.j(bVar, "listener");
        C17542s.j(lVar, "connectionPayload");
        C17542s.j(fVar, "frameType");
        this.f40891c = j10;
        this.f40892d = lVar;
        this.f40893e = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(dI.C17164e<? super XH.C16807N> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof Y6.b.C0686b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Y6.b$b r0 = (Y6.b.C0686b) r0
            int r1 = r0.f40902g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f40902g = r1
            goto L_0x0018
        L_0x0013:
            Y6.b$b r0 = new Y6.b$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f40900e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f40902g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            XH.y.b(r8)
            goto L_0x0086
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0034:
            java.lang.Object r2 = r0.f40899d
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r0.f40898c
            Y6.b r4 = (Y6.b) r4
            XH.y.b(r8)
            goto L_0x0063
        L_0x0040:
            XH.y.b(r8)
            java.lang.String r8 = "type"
            java.lang.String r2 = "connection_init"
            XH.v r8 = XH.C16796C.a(r8, r2)
            XH.v[] r8 = new XH.v[]{r8}
            java.util.Map r2 = YH.X.p(r8)
            nI.l<dI.e<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> r8 = r7.f40892d
            r0.f40898c = r7
            r0.f40899d = r2
            r0.f40902g = r4
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r4 = r7
        L_0x0063:
            java.util.Map r8 = (java.util.Map) r8
            if (r8 == 0) goto L_0x006c
            java.lang.String r5 = "payload"
            r2.put(r5, r8)
        L_0x006c:
            Y6.f r8 = r4.f40893e
            r4.h(r2, r8)
            long r5 = r4.f40891c
            Y6.b$c r8 = new Y6.b$c
            r2 = 0
            r8.<init>(r4, r2)
            r0.f40898c = r2
            r0.f40899d = r2
            r0.f40902g = r3
            java.lang.Object r8 = QJ.m1.c(r5, r8, r0)
            if (r8 != r1) goto L_0x0086
            return r1
        L_0x0086:
            XH.N r8 = XH.C16807N.f139792a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y6.b.b(dI.e):java.lang.Object");
    }

    public void d(Map<String, ? extends Object> map) {
        C17542s.j(map, "messageMap");
        Object obj = map.get("type");
        if (C17542s.e(obj, "data")) {
            g.b c10 = c();
            Object obj2 = map.get("id");
            C17542s.h(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = map.get("payload");
            C17542s.h(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            c10.c((String) obj2, (Map) obj3);
        } else if (C17542s.e(obj, UiComponentContainer.RESULT_ERROR)) {
            Object obj4 = map.get("id");
            if (obj4 instanceof String) {
                c().b((String) obj4, (Map) map.get("payload"));
            } else {
                c().d((Map) map.get("payload"));
            }
        } else if (C17542s.e(obj, "complete")) {
            g.b c11 = c();
            Object obj5 = map.get("id");
            C17542s.h(obj5, "null cannot be cast to non-null type kotlin.String");
            c11.a((String) obj5);
        }
    }

    public <D extends w.a> void k(M6.f<D> fVar) {
        C17542s.j(fVar, "request");
        h(X.m(C16796C.a("type", "start"), C16796C.a("id", fVar.g().toString()), C16796C.a("payload", N6.b.f39125b.g(fVar))), this.f40893e);
    }

    public <D extends w.a> void l(M6.f<D> fVar) {
        C17542s.j(fVar, "request");
        h(X.m(C16796C.a("type", "stop"), C16796C.a("id", fVar.g().toString())), this.f40893e);
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BP\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R=\u0010\t\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"LY6/b$a;", "LY6/g$a;", "", "connectionAcknowledgeTimeoutMs", "Lkotlin/Function1;", "LdI/e;", "", "", "", "connectionPayload", "LY6/f;", "frameType", "<init>", "(JLnI/l;LY6/f;)V", "LY6/c;", "webSocketConnection", "LY6/g$b;", "listener", "LQJ/Q;", "scope", "LY6/g;", "a", "(LY6/c;LY6/g$b;LQJ/Q;)LY6/g;", "J", "b", "LnI/l;", "c", "LY6/f;", "getName", "()Ljava/lang/String;", "name", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements g.a {

        /* renamed from: a  reason: collision with root package name */
        private final long f40894a;

        /* renamed from: b  reason: collision with root package name */
        private final C17642l<C17164e<? super Map<String, ? extends Object>>, Object> f40895b;

        /* renamed from: c  reason: collision with root package name */
        private final f f40896c;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
        @f(c = "com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$Factory$1", f = "SubscriptionWsProtocol.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Y6.b$a$a  reason: collision with other inner class name */
        static final class C0685a extends l implements C17642l<C17164e, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f40897c;

            C0685a(C17164e<? super C0685a> eVar) {
                super(1, eVar);
            }

            public final C17164e<C16807N> create(C17164e<?> eVar) {
                return new C0685a(eVar);
            }

            /* renamed from: i */
            public final Object invoke(C17164e eVar) {
                return ((C0685a) create(eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f40897c == 0) {
                    y.b(obj);
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public a(long j10, C17642l<? super C17164e<? super Map<String, ? extends Object>>, ? extends Object> lVar, f fVar) {
            C17542s.j(lVar, "connectionPayload");
            C17542s.j(fVar, "frameType");
            this.f40894a = j10;
            this.f40895b = lVar;
            this.f40896c = fVar;
        }

        public g a(c cVar, g.b bVar, Q q10) {
            C17542s.j(cVar, "webSocketConnection");
            C17542s.j(bVar, "listener");
            C17542s.j(q10, "scope");
            return new b(cVar, bVar, this.f40894a, this.f40895b, this.f40896c);
        }

        public String getName() {
            return "graphql-ws";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(long j10, C17642l lVar, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 10000 : j10, (i10 & 2) != 0 ? new C0685a((C17164e<? super C0685a>) null) : lVar, (i10 & 4) != 0 ? f.Text : fVar);
        }
    }
}
