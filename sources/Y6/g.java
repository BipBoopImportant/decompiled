package Y6;

import M6.k;
import M6.w;
import QJ.Q;
import WK.C16770e;
import WK.C16773h;
import XH.C16807N;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001:\u0002&\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\b\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\b\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u0018\u001a\u00020\u0017*\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\f*\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b*\u00020\fH\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u001e\u0010\u000fJ%\u0010\u001f\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u001f\u0010\u000fJ-\u0010\"\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u0006\u0010!\u001a\u00020 H\u0004¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH@ø\u0001\u0000¢\u0006\u0004\b$\u0010\nJ\u0013\u0010%\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b%\u0010\nJ\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"LY6/g;", "", "LY6/c;", "webSocketConnection", "LY6/g$b;", "listener", "<init>", "(LY6/c;LY6/g$b;)V", "LXH/N;", "b", "(LdI/e;)Ljava/lang/Object;", "", "", "messageMap", "d", "(Ljava/util/Map;)V", "LM6/w$a;", "D", "LM6/f;", "request", "k", "(LM6/f;)V", "l", "LWK/h;", "m", "(Ljava/util/Map;)LWK/h;", "o", "(Ljava/util/Map;)Ljava/lang/String;", "n", "(Ljava/lang/String;)Ljava/util/Map;", "i", "j", "LY6/f;", "frameType", "h", "(Ljava/util/Map;LY6/f;)V", "e", "f", "a", "()V", "LY6/c;", "getWebSocketConnection", "()LY6/c;", "LY6/g$b;", "c", "()LY6/g$b;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private final c f40982a;

    /* renamed from: b  reason: collision with root package name */
    private final b f40983b;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LY6/g$a;", "", "LY6/c;", "webSocketConnection", "LY6/g$b;", "listener", "LQJ/Q;", "scope", "LY6/g;", "a", "(LY6/c;LY6/g$b;LQJ/Q;)LY6/g;", "", "getName", "()Ljava/lang/String;", "name", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a {
        g a(c cVar, b bVar, Q q10);

        String getName();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LY6/g$b;", "", "", "id", "", "payload", "LXH/N;", "c", "(Ljava/lang/String;Ljava/util/Map;)V", "b", "a", "(Ljava/lang/String;)V", "d", "(Ljava/util/Map;)V", "", "cause", "e", "(Ljava/lang/Throwable;)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface b {
        void a(String str);

        void b(String str, Map<String, ? extends Object> map);

        void c(String str, Map<String, ? extends Object> map);

        void d(Map<String, ? extends Object> map);

        void e(Throwable th2);
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40984a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Y6.f[] r0 = Y6.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Y6.f r1 = Y6.f.Text     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Y6.f r1 = Y6.f.Binary     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f40984a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Y6.g.c.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @f(c = "com.apollographql.apollo3.network.ws.WsProtocol", f = "WsProtocol.kt", l = {131}, m = "receiveMessageMap")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f40985c;

        /* renamed from: d  reason: collision with root package name */
        Object f40986d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f40987e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f40988f;

        /* renamed from: g  reason: collision with root package name */
        int f40989g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f40988f = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f40987e = obj;
            this.f40989g |= Integer.MIN_VALUE;
            return this.f40988f.e(this);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @f(c = "com.apollographql.apollo3.network.ws.WsProtocol", f = "WsProtocol.kt", l = {144}, m = "run$suspendImpl")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f40990c;

        /* renamed from: d  reason: collision with root package name */
        Object f40991d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f40992e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f40993f;

        /* renamed from: g  reason: collision with root package name */
        int f40994g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f40993f = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f40992e = obj;
            this.f40994g |= Integer.MIN_VALUE;
            return g.g(this.f40993f, this);
        }
    }

    public g(c cVar, b bVar) {
        C17542s.j(cVar, "webSocketConnection");
        C17542s.j(bVar, "listener");
        this.f40982a = cVar;
        this.f40983b = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        throw r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[ExcHandler: CancellationException (r4v7 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:17:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object g(Y6.g r4, dI.C17164e<? super XH.C16807N> r5) {
        /*
            boolean r0 = r5 instanceof Y6.g.e
            if (r0 == 0) goto L_0x0013
            r0 = r5
            Y6.g$e r0 = (Y6.g.e) r0
            int r1 = r0.f40994g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f40994g = r1
            goto L_0x0018
        L_0x0013:
            Y6.g$e r0 = new Y6.g$e
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f40992e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f40994g
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r4 = r0.f40991d
            Y6.g r4 = (Y6.g) r4
            java.lang.Object r2 = r0.f40990c
            Y6.g r2 = (Y6.g) r2
            XH.y.b(r5)     // Catch:{ CancellationException -> 0x0033, Exception -> 0x0031 }
            goto L_0x004e
        L_0x0031:
            r4 = move-exception
            goto L_0x0058
        L_0x0033:
            r4 = move-exception
            goto L_0x0060
        L_0x0035:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003d:
            XH.y.b(r5)
        L_0x0040:
            r0.f40990c = r4     // Catch:{ CancellationException -> 0x0033, Exception -> 0x0055 }
            r0.f40991d = r4     // Catch:{ CancellationException -> 0x0033, Exception -> 0x0055 }
            r0.f40994g = r3     // Catch:{ CancellationException -> 0x0033, Exception -> 0x0055 }
            java.lang.Object r5 = r4.e(r0)     // Catch:{ CancellationException -> 0x0033, Exception -> 0x0055 }
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r2 = r4
        L_0x004e:
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ CancellationException -> 0x0033, Exception -> 0x0031 }
            r4.d(r5)     // Catch:{ CancellationException -> 0x0033, Exception -> 0x0031 }
            r4 = r2
            goto L_0x0040
        L_0x0055:
            r5 = move-exception
            r2 = r4
            r4 = r5
        L_0x0058:
            Y6.g$b r5 = r2.f40983b
            r5.e(r4)
            XH.N r4 = XH.C16807N.f139792a
            return r4
        L_0x0060:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y6.g.g(Y6.g, dI.e):java.lang.Object");
    }

    public void a() {
        this.f40982a.close();
    }

    public abstract Object b(C17164e<? super C16807N> eVar);

    /* access modifiers changed from: protected */
    public final b c() {
        return this.f40983b;
    }

    public abstract void d(Map<String, ? extends Object> map);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(dI.C17164e<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Y6.g.d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Y6.g$d r0 = (Y6.g.d) r0
            int r1 = r0.f40989g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f40989g = r1
            goto L_0x0018
        L_0x0013:
            Y6.g$d r0 = new Y6.g$d
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f40987e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f40989g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r2 = r0.f40986d
            Y6.g r2 = (Y6.g) r2
            java.lang.Object r4 = r0.f40985c
            Y6.g r4 = (Y6.g) r4
            XH.y.b(r6)
            goto L_0x004d
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r6)
            r2 = r5
        L_0x003d:
            Y6.c r6 = r2.f40982a
            r0.f40985c = r2
            r0.f40986d = r2
            r0.f40989g = r3
            java.lang.Object r6 = r6.j(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r4 = r2
        L_0x004d:
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map r6 = r2.n(r6)
            if (r6 == 0) goto L_0x0056
            return r6
        L_0x0056:
            r2 = r4
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: Y6.g.e(dI.e):java.lang.Object");
    }

    public Object f(C17164e<? super C16807N> eVar) {
        return g(this, eVar);
    }

    /* access modifiers changed from: protected */
    public final void h(Map<String, ? extends Object> map, f fVar) {
        C17542s.j(map, "messageMap");
        C17542s.j(fVar, "frameType");
        int i10 = c.f40984a[fVar.ordinal()];
        if (i10 == 1) {
            j(map);
        } else if (i10 == 2) {
            i(map);
        }
    }

    /* access modifiers changed from: protected */
    public final void i(Map<String, ? extends Object> map) {
        C17542s.j(map, "messageMap");
        this.f40982a.b(m(map));
    }

    /* access modifiers changed from: protected */
    public final void j(Map<String, ? extends Object> map) {
        C17542s.j(map, "messageMap");
        this.f40982a.a(o(map));
    }

    public abstract <D extends w.a> void k(M6.f<D> fVar);

    public abstract <D extends w.a> void l(M6.f<D> fVar);

    /* access modifiers changed from: protected */
    public final C16773h m(Map<String, ? extends Object> map) {
        C17542s.j(map, "<this>");
        C16770e eVar = new C16770e();
        Q6.b.a(new Q6.c(eVar, (String) null), map);
        return eVar.i0();
    }

    /* access modifiers changed from: protected */
    public final Map<String, Object> n(String str) {
        C17542s.j(str, "<this>");
        try {
            Object a10 = M6.d.f38538g.a(new Q6.d(new C16770e().D0(str)), k.f38587g);
            if (a10 instanceof Map) {
                return (Map) a10;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String o(Map<String, ? extends Object> map) {
        C17542s.j(map, "<this>");
        C16770e eVar = new C16770e();
        Q6.b.a(new Q6.c(eVar, (String) null), map);
        return eVar.l0();
    }
}
