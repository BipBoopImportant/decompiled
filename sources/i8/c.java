package I8;

import QJ.C16336v0;
import QJ.C16340x0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import x8.C8958b;
import y8.C8993b;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001#B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010\u0017J\r\u0010!\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\u0017J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u0014\u0010.\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0016\u00100\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0016\u00104\u001a\u0004\u0018\u0001018BX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"LI8/c;", "", "LI8/f;", "nativeNetworkEventProcessorV1", "nativeNetworkEventProcessorV2", "webViewNetworkEventProcessor", "LI8/d;", "networkEventCounter", "Lx8/b;", "libraryInterface", "LD8/c;", "logger", "<init>", "(LI8/f;LI8/f;LI8/f;LI8/d;Lx8/b;LD8/c;)V", "Ly8/b;", "rawEvent", "LXH/N;", "h", "(Ly8/b;)V", "g", "i", "()LI8/f;", "f", "()V", "", "l", "()Z", "k", "LdI/i;", "context", "n", "(Ly8/b;LdI/i;)V", "q", "r", "m", "a", "LI8/f;", "b", "c", "d", "LI8/d;", "e", "Lx8/b;", "LD8/c;", "LQJ/v0;", "LQJ/v0;", "singleThreadedNetworkDispatcher", "Z", "isStarted", "Lv8/b;", "j", "()Lv8/b;", "screenViewTracker", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final a f37090i = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final f f37091a;

    /* renamed from: b  reason: collision with root package name */
    private final f f37092b;

    /* renamed from: c  reason: collision with root package name */
    private final f f37093c;

    /* renamed from: d  reason: collision with root package name */
    private final d f37094d;

    /* renamed from: e  reason: collision with root package name */
    private final C8958b f37095e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final D8.c f37096f;

    /* renamed from: g  reason: collision with root package name */
    private final C16336v0 f37097g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f37098h;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LI8/c$a;", "", "<init>", "()V", "", "KEEP_ALIVE_SECONDS", "J", "", "NUMBER_OF_THREADS", "I", "QUEUE_SIZE", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "com.contentsquare.android.error.analysis.apierror.NetworkEventController$sendNetworkEvent$1", f = "NetworkEventController.kt", l = {}, m = "invokeSuspend")
    public static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f37099c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f37100d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8993b f37101e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, C8993b bVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f37100d = cVar;
            this.f37101e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f37100d, this.f37101e, eVar);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f37099c == 0) {
                y.b(obj);
                if (this.f37100d.l()) {
                    this.f37100d.f37096f.j("Limit of 20 API errors per screenview has been reached for the current screenview. API Error collection is paused until next screenview");
                } else {
                    String z10 = this.f37101e.z();
                    if (C17542s.e(z10, "webview")) {
                        this.f37100d.h(this.f37101e);
                    } else if (C17542s.e(z10, "native")) {
                        this.f37100d.g(this.f37101e);
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    public c(f fVar, f fVar2, f fVar3, d dVar, C8958b bVar, D8.c cVar) {
        f fVar4 = fVar;
        f fVar5 = fVar2;
        f fVar6 = fVar3;
        d dVar2 = dVar;
        C8958b bVar2 = bVar;
        D8.c cVar2 = cVar;
        C17542s.j(fVar4, "nativeNetworkEventProcessorV1");
        C17542s.j(fVar5, "nativeNetworkEventProcessorV2");
        C17542s.j(fVar6, "webViewNetworkEventProcessor");
        C17542s.j(dVar2, "networkEventCounter");
        C17542s.j(bVar2, "libraryInterface");
        C17542s.j(cVar2, "logger");
        this.f37091a = fVar4;
        this.f37092b = fVar5;
        this.f37093c = fVar6;
        this.f37094d = dVar2;
        this.f37095e = bVar2;
        this.f37096f = cVar2;
        this.f37097g = C16340x0.c(new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(20), Executors.defaultThreadFactory(), new b(this)));
    }

    private final void f() {
        v8.b j10 = j();
        if (j10 != null && j10.d()) {
            this.f37096f.j("No screenview detected. API error is linked to screenviews. Please implement screenview tracking to enable it.");
            C8958b.C0930b.a(this.f37095e, C8958b.c.WARN, "Event sent before 1st screen view: API Error", (String) null, (String) null, (String) null, (Map) null, 60, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void g(C8993b bVar) {
        C8993b a10;
        if (e.a(bVar) && k() && (a10 = i().a(bVar)) != null) {
            f();
            D8.c cVar = this.f37096f;
            cVar.f("API Error - " + a10.C() + ' ' + a10.h() + ' ' + a10.E());
            this.f37095e.j(a10);
            this.f37095e.m(a10);
            this.f37094d.a();
        }
    }

    /* access modifiers changed from: private */
    public final void h(C8993b bVar) {
        C8993b a10 = this.f37093c.a(bVar);
        if (a10 != null && e.a(a10)) {
            f();
            this.f37095e.j(a10);
            this.f37094d.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final I8.f i() {
        /*
            r1 = this;
            x8.b r0 = r1.f37095e
            A8.b r0 = r0.a()
            if (r0 == 0) goto L_0x0013
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r0 = r0.b()
            if (r0 == 0) goto L_0x0013
            com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2 r0 = r0.c()
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0019
            I8.f r0 = r1.f37092b
            goto L_0x001b
        L_0x0019:
            I8.f r0 = r1.f37091a
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I8.c.i():I8.f");
    }

    private final v8.b j() {
        return this.f37095e.d();
    }

    /* access modifiers changed from: private */
    public final boolean l() {
        v8.b j10 = j();
        if (j10 != null && j10.c()) {
            this.f37094d.c();
            v8.b j11 = j();
            if (j11 != null) {
                j11.e();
            }
        }
        return this.f37094d.b();
    }

    public static /* synthetic */ void o(c cVar, C8993b bVar, C17168i iVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = cVar.f37097g;
        }
        cVar.n(bVar, iVar);
    }

    /* access modifiers changed from: private */
    public static final void p(c cVar, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C17542s.j(cVar, "this$0");
        C8958b.C0930b.a(cVar.f37095e, C8958b.c.WARN, "Network event rejected due to queue being full", (String) null, (String) null, (String) null, (Map) null, 60, (Object) null);
    }

    public final boolean k() {
        return this.f37095e.c("api_errors");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r6 = this;
            x8.b r0 = r6.f37095e
            A8.b r0 = r0.a()
            r1 = 0
            if (r0 == 0) goto L_0x0014
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r0 = r0.b()
            if (r0 == 0) goto L_0x0014
            com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2 r0 = r0.c()
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x005d
            java.util.List r0 = r0.c()
            if (r0 == 0) goto L_0x005d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r0.next()
            com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2$CollectionRule r3 = (com.contentsquare.android.core.features.config.model.JsonConfig.ApiErrorsV2.CollectionRule) r3
            java.util.List r3 = r3.b()
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = YH.C16877v.y(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0045:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0059
            java.lang.Object r5 = r3.next()
            com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2$BodyAttributePath r5 = (com.contentsquare.android.core.features.config.model.JsonConfig.ApiErrorsV2.BodyAttributePath) r5
            java.lang.String r5 = r5.b()
            r4.add(r5)
            goto L_0x0045
        L_0x0059:
            YH.C16877v.E(r2, r4)
            goto L_0x0026
        L_0x005d:
            r2 = r1
        L_0x005e:
            R8.c r0 = R8.c.f39739a
            r3 = 2
            R8.c.g(r0, r2, r1, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I8.c.m():void");
    }

    public final void n(C8993b bVar, C17168i iVar) {
        C17542s.j(bVar, "rawEvent");
        C17542s.j(iVar, "context");
        F0 unused = C16314k.d(S.a(iVar), (C17168i) null, (T) null, new b(this, bVar, (C17164e<? super b>) null), 3, (Object) null);
    }

    public final void q() {
        if (!this.f37098h) {
            this.f37098h = true;
            this.f37096f.j("Api Error collection is enabled");
        }
    }

    public final void r() {
        if (this.f37098h) {
            this.f37098h = false;
            this.f37096f.j("Api Error collection is disabled");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, f fVar2, f fVar3, d dVar, C8958b bVar, D8.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, fVar2, fVar3, dVar, bVar, (i10 & 32) != 0 ? new D8.c("NetworkEventController") : cVar);
    }
}
