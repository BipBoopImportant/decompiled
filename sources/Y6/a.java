package Y6;

import GK.C15776D;
import GK.C15780H;
import GK.C15781I;
import GK.z;
import QJ.C16339x;
import S6.e;
import SJ.C16423B;
import WK.C16773h;
import XH.C16807N;
import com.optimizely.ab.config.FeatureVariable;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"LY6/a;", "LY6/d;", "LGK/H$a;", "webSocketFactory", "<init>", "(LGK/H$a;)V", "()V", "", "url", "", "LN6/d;", "headers", "LY6/c;", "a", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LGK/H$a;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final C15780H.a f40880a;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @f(c = "com.apollographql.apollo3.network.ws.DefaultWebSocketEngine", f = "OkHttpWebSocketEngine.kt", l = {74}, m = "open")
    /* renamed from: Y6.a$a  reason: collision with other inner class name */
    static final class C0684a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f40881c;

        /* renamed from: d  reason: collision with root package name */
        Object f40882d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f40883e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f40884f;

        /* renamed from: g  reason: collision with root package name */
        int f40885g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0684a(a aVar, C17164e<? super C0684a> eVar) {
            super(eVar);
            this.f40884f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f40883e = obj;
            this.f40885g |= Integer.MIN_VALUE;
            return this.f40884f.a((String) null, (List<N6.d>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    static final class b extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15780H f40886c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C15780H h10) {
            super(1);
            this.f40886c = h10;
        }

        public final void a(Throwable th2) {
            this.f40886c.f(1001, (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Y6/a$c", "LY6/c;", "", "j", "(LdI/e;)Ljava/lang/Object;", "LWK/h;", "data", "LXH/N;", "b", "(LWK/h;)V", "string", "a", "(Ljava/lang/String;)V", "close", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U6.b<String> f40887a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15780H f40888b;

        c(U6.b<String> bVar, C15780H h10) {
            this.f40887a = bVar;
            this.f40888b = h10;
        }

        public void a(String str) {
            C17542s.j(str, FeatureVariable.STRING_TYPE);
            if (!this.f40888b.a(str)) {
                C16423B.a.a(this.f40887a, (Throwable) null, 1, (Object) null);
            }
        }

        public void b(C16773h hVar) {
            C17542s.j(hVar, "data");
            if (!this.f40888b.b(hVar)) {
                C16423B.a.a(this.f40887a, (Throwable) null, 1, (Object) null);
            }
        }

        public void close() {
            this.f40888b.f(1000, (String) null);
        }

        public Object j(C17164e<? super String> eVar) {
            return this.f40887a.j(eVar);
        }
    }

    @Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Y6/a$d", "LGK/I;", "LGK/H;", "webSocket", "LGK/D;", "response", "LXH/N;", "g", "(LGK/H;LGK/D;)V", "", "text", "f", "(LGK/H;Ljava/lang/String;)V", "LWK/h;", "bytes", "e", "(LGK/H;LWK/h;)V", "", "t", "c", "(LGK/H;Ljava/lang/Throwable;LGK/D;)V", "", "code", "reason", "b", "(LGK/H;ILjava/lang/String;)V", "a", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d extends C15781I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16339x<C16807N> f40889a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ U6.b<String> f40890b;

        d(C16339x<C16807N> xVar, U6.b<String> bVar) {
            this.f40889a = xVar;
            this.f40890b = bVar;
        }

        public void a(C15780H h10, int i10, String str) {
            C17542s.j(h10, "webSocket");
            C17542s.j(str, "reason");
            C16423B.a.a(this.f40890b, (Throwable) null, 1, (Object) null);
        }

        public void b(C15780H h10, int i10, String str) {
            C17542s.j(h10, "webSocket");
            C17542s.j(str, "reason");
            this.f40889a.J(C16807N.f139792a);
            this.f40890b.a(new e(i10, str, (Throwable) null, 4, (DefaultConstructorMarker) null));
        }

        public void c(C15780H h10, Throwable th2, C15776D d10) {
            C17542s.j(h10, "webSocket");
            C17542s.j(th2, "t");
            this.f40889a.J(C16807N.f139792a);
            this.f40890b.a(th2);
        }

        public void e(C15780H h10, C16773h hVar) {
            C17542s.j(h10, "webSocket");
            C17542s.j(hVar, "bytes");
            this.f40890b.k(hVar.c0());
        }

        public void f(C15780H h10, String str) {
            C17542s.j(h10, "webSocket");
            C17542s.j(str, "text");
            this.f40890b.k(str);
        }

        public void g(C15780H h10, C15776D d10) {
            C17542s.j(h10, "webSocket");
            C17542s.j(d10, "response");
            this.f40889a.J(C16807N.f139792a);
        }
    }

    public a(C15780H.a aVar) {
        C17542s.j(aVar, "webSocketFactory");
        this.f40880a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r7, java.util.List<N6.d> r8, dI.C17164e<? super Y6.c> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof Y6.a.C0684a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            Y6.a$a r0 = (Y6.a.C0684a) r0
            int r1 = r0.f40885g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f40885g = r1
            goto L_0x0018
        L_0x0013:
            Y6.a$a r0 = new Y6.a$a
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f40883e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f40885g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r7 = r0.f40882d
            GK.H r7 = (GK.C15780H) r7
            java.lang.Object r8 = r0.f40881c
            U6.b r8 = (U6.b) r8
            XH.y.b(r9)
            goto L_0x007c
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            XH.y.b(r9)
            U6.b r9 = new U6.b
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4 = 6
            r5 = 0
            SJ.j r2 = SJ.C16437m.b(r2, r5, r5, r4, r5)
            r9.<init>(r2)
            QJ.x r2 = QJ.C16343z.b(r5, r3, r5)
            GK.B$a r4 = new GK.B$a
            r4.<init>()
            GK.B$a r7 = r4.n(r7)
            GK.u r8 = W6.b.b(r8)
            GK.B$a r7 = r7.f(r8)
            GK.B r7 = r7.b()
            GK.H$a r8 = r6.f40880a
            Y6.a$d r4 = new Y6.a$d
            r4.<init>(r2, r9)
            GK.H r7 = r8.a(r7, r4)
            r0.f40881c = r9
            r0.f40882d = r7
            r0.f40885g = r3
            java.lang.Object r8 = r2.f(r0)
            if (r8 != r1) goto L_0x007b
            return r1
        L_0x007b:
            r8 = r9
        L_0x007c:
            Y6.a$b r9 = new Y6.a$b
            r9.<init>(r7)
            r8.c(r9)
            Y6.a$c r9 = new Y6.a$c
            r9.<init>(r8, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y6.a.a(java.lang.String, java.util.List, dI.e):java.lang.Object");
    }

    public a() {
        this(new z());
    }
}
