package vq;

import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.S;
import QJ.T;
import QJ.b1;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.episod.datalayer.network.models.EpisodEventPayload;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import uq.C12079e;
import xq.C12335d;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u0012H\u0000¢\u0006\u0004\b$\u0010\u0014J\u0011\u0010%\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0004\b%\u0010\"J\u000f\u0010&\u001a\u00020\u0012H\u0000¢\u0006\u0004\b&\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R(\u0010>\u001a\u0002018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b9\u00103\u0012\u0004\b=\u0010\u0014\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010D\u001a\u00020\u00158\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010?\u0012\u0004\bC\u0010\u0014\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u0018R\u0014\u0010H\u001a\u00020E8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020E8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010GR*\u0010Q\u001a\u0004\u0018\u00010K8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b@\u0010L\u0012\u0004\bP\u0010\u0014\u001a\u0004\bI\u0010M\"\u0004\bN\u0010OR*\u0010T\u001a\u0004\u0018\u00010K8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b%\u0010L\u0012\u0004\bS\u0010\u0014\u001a\u0004\bF\u0010M\"\u0004\bR\u0010O¨\u0006U"}, d2 = {"Lvq/d;", "Lvq/c;", "LAq/a;", "remoteDataSource", "Lxq/d;", "localDataSource", "Luq/h;", "logger", "Luq/e;", "config", "LCq/a;", "episodEventMapper", "LGq/a;", "appLifecycleManager", "LBq/a;", "dispatcherProvider", "<init>", "(LAq/a;Lxq/d;Luq/h;Luq/e;LCq/a;LGq/a;LBq/a;)V", "LXH/N;", "o", "()V", "", "isTest", "a", "(Z)V", "Luq/g;", "event", "b", "(Luq/g;)V", "", "j", "(Luq/g;)Ljava/lang/String;", "LQJ/F0;", "s", "()LQJ/F0;", "p", "q", "n", "r", "LAq/a;", "Lxq/d;", "c", "Luq/h;", "d", "LCq/a;", "e", "LGq/a;", "f", "LBq/a;", "", "g", "I", "batchSize", "", "h", "J", "batchTime", "i", "()I", "u", "(I)V", "getPreviousRowCount$episod_core_release$annotations", "previousRowCount", "Z", "m", "()Z", "t", "isAppInForeground$episod_core_release$annotations", "isAppInForeground", "LQJ/N;", "k", "LQJ/N;", "workHandler", "l", "triggersHandler", "LQJ/Q;", "LQJ/Q;", "()LQJ/Q;", "setWorkScope$episod_core_release", "(LQJ/Q;)V", "getWorkScope$episod_core_release$annotations", "workScope", "setTriggersScope$episod_core_release", "getTriggersScope$episod_core_release$annotations", "triggersScope", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vq.d  reason: case insensitive filesystem */
public final class C12205d implements C12204c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Aq.a f105284a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C12335d f105285b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final uq.h f105286c;

    /* renamed from: d  reason: collision with root package name */
    private final Cq.a f105287d;

    /* renamed from: e  reason: collision with root package name */
    private final Gq.a f105288e;

    /* renamed from: f  reason: collision with root package name */
    private final Bq.a f105289f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final int f105290g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final long f105291h;

    /* renamed from: i  reason: collision with root package name */
    private int f105292i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f105293j = true;

    /* renamed from: k  reason: collision with root package name */
    private final N f105294k;

    /* renamed from: l  reason: collision with root package name */
    private final N f105295l;

    /* renamed from: m  reason: collision with root package name */
    private Q f105296m;

    /* renamed from: n  reason: collision with root package name */
    private Q f105297n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.episod.datalayer.EpisodRepositoryImpl$launchTimeBatchThread$1", f = "EpisodRepository.kt", l = {150}, m = "invokeSuspend")
    /* renamed from: vq.d$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f105298c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12205d f105299d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C12205d dVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f105299d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f105299d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r5.f105298c
                r2 = 1
                if (r1 == 0) goto L_0x0017
                if (r1 != r2) goto L_0x000f
                XH.y.b(r6)
                goto L_0x0031
            L_0x000f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0017:
                XH.y.b(r6)
            L_0x001a:
                vq.d r6 = r5.f105299d
                boolean r6 = r6.m()
                if (r6 == 0) goto L_0x0042
                vq.d r6 = r5.f105299d
                long r3 = r6.f105291h
                r5.f105298c = r2
                java.lang.Object r6 = QJ.C16297b0.b(r3, r5)
                if (r6 != r0) goto L_0x0031
                return r0
            L_0x0031:
                vq.d r6 = r5.f105299d
                uq.h r6 = r6.f105286c
                java.lang.String r1 = "Time trigger activated"
                r6.a(r1)
                vq.d r6 = r5.f105299d
                r6.s()
                goto L_0x001a
            L_0x0042:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: vq.C12205d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.episod.datalayer.EpisodRepositoryImpl$observeDatabaseChanges$1$1", f = "EpisodRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: vq.d$b */
    static final class b extends l implements p<Integer, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f105300c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ int f105301d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12205d f105302e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C12205d dVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f105302e = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f105302e, eVar);
            bVar.f105301d = ((Number) obj).intValue();
            return bVar;
        }

        public final Object i(int i10, C17164e<? super C16807N> eVar) {
            return ((b) create(Integer.valueOf(i10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Number) obj).intValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f105300c == 0) {
                y.b(obj);
                int i10 = this.f105301d;
                uq.h f10 = this.f105302e.f105286c;
                f10.a("Database has " + i10 + " items");
                if (i10 >= this.f105302e.f105290g && i10 > this.f105302e.i()) {
                    this.f105302e.f105286c.a("Size trigger activated");
                    this.f105302e.s();
                }
                this.f105302e.u(i10);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vq.d$c */
    static final class c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C12205d f105303c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: vq.d$c$a */
        static final class a extends C17544u implements C17642l<Throwable, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C12205d f105304c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C12205d dVar) {
                super(1);
                this.f105304c = dVar;
            }

            public final void a(Throwable th2) {
                Q l10 = this.f105304c.l();
                if (l10 != null) {
                    S.e(l10, (CancellationException) null, 1, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C12205d dVar) {
            super(0);
            this.f105303c = dVar;
        }

        public final void invoke() {
            this.f105303c.t(false);
            Q k10 = this.f105303c.k();
            if (k10 != null) {
                S.e(k10, (CancellationException) null, 1, (Object) null);
            }
            F0 s10 = this.f105303c.s();
            if (s10 != null) {
                s10.s(new a(this.f105303c));
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vq.d$d  reason: collision with other inner class name */
    static final class C2503d extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C12205d f105305c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2503d(C12205d dVar) {
            super(0);
            this.f105305c = dVar;
        }

        public final void invoke() {
            this.f105305c.t(true);
            this.f105305c.r();
            this.f105305c.o();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.episod.datalayer.EpisodRepositoryImpl$sendBatchEpisodEvents$1", f = "EpisodRepository.kt", l = {93, 101, 103}, m = "invokeSuspend")
    /* renamed from: vq.d$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f105306c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12205d f105307d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C12205d dVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f105307d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f105307d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00d2 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r11.f105306c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0027
                if (r1 == r4) goto L_0x0023
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                XH.y.b(r12)
                goto L_0x00d3
            L_0x0016:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001e:
                XH.y.b(r12)
                goto L_0x00b9
            L_0x0023:
                XH.y.b(r12)
                goto L_0x0039
            L_0x0027:
                XH.y.b(r12)
                vq.d r12 = r11.f105307d
                xq.d r12 = r12.f105285b
                r11.f105306c = r4
                java.lang.Object r12 = r12.d(r11)
                if (r12 != r0) goto L_0x0039
                return r0
            L_0x0039:
                r1 = r12
                java.util.List r1 = (java.util.List) r1
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L_0x0045
                goto L_0x0046
            L_0x0045:
                r12 = 0
            L_0x0046:
                java.util.List r12 = (java.util.List) r12
                if (r12 != 0) goto L_0x004d
                XH.N r12 = XH.C16807N.f139792a
                return r12
            L_0x004d:
                r1 = r12
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                vq.d r4 = r11.f105307d
                java.util.Iterator r1 = r1.iterator()
                r5 = 0
            L_0x0057:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x008c
                java.lang.Object r6 = r1.next()
                int r7 = r5 + 1
                if (r5 >= 0) goto L_0x0068
                YH.C16877v.x()
            L_0x0068:
                java.lang.String r6 = (java.lang.String) r6
                uq.h r8 = r4.f105286c
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "Event "
                r9.append(r10)
                r9.append(r5)
                java.lang.String r5 = ": "
                r9.append(r5)
                r9.append(r6)
                java.lang.String r5 = r9.toString()
                r8.a(r5)
                r5 = r7
                goto L_0x0057
            L_0x008c:
                java.lang.String r12 = wq.C12298a.a(r12)
                vq.d r1 = r11.f105307d
                uq.h r1 = r1.f105286c
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Batch: "
                r4.append(r5)
                r4.append(r12)
                java.lang.String r4 = r4.toString()
                r1.a(r4)
                vq.d r1 = r11.f105307d
                Aq.a r1 = r1.f105284a
                r11.f105306c = r3
                java.lang.Object r12 = r1.b(r12, r11)
                if (r12 != r0) goto L_0x00b9
                return r0
            L_0x00b9:
                vq.d r12 = r11.f105307d
                uq.h r12 = r12.f105286c
                java.lang.String r1 = "Batch sent successfully"
                r12.a(r1)
                vq.d r12 = r11.f105307d
                xq.d r12 = r12.f105285b
                r11.f105306c = r2
                java.lang.Object r12 = r12.c(r11)
                if (r12 != r0) goto L_0x00d3
                return r0
            L_0x00d3:
                vq.d r12 = r11.f105307d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r12.u(r0)
                XH.N r12 = XH.C16807N.f139792a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: vq.C12205d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.episod.datalayer.EpisodRepositoryImpl$sendEpisodEvent$1", f = "EpisodRepository.kt", l = {80}, m = "invokeSuspend")
    /* renamed from: vq.d$f */
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f105308c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12205d f105309d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ uq.g f105310e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C12205d dVar, uq.g gVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f105309d = dVar;
            this.f105310e = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f105309d, this.f105310e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f105308c;
            if (i10 == 0) {
                y.b(obj);
                String j10 = this.f105309d.j(this.f105310e);
                C12335d e10 = this.f105309d.f105285b;
                this.f105308c = 1;
                if (e10.a(j10, this) == f10) {
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

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"vq/d$g", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vq.d$g */
    public static final class g extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12205d f105311a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(N.a aVar, C12205d dVar) {
            super(aVar);
            this.f105311a = dVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            this.f105311a.f105286c.b("Exception handling events", th2);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"vq/d$h", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vq.d$h */
    public static final class h extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12205d f105312a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(N.a aVar, C12205d dVar) {
            super(aVar);
            this.f105312a = dVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            this.f105312a.f105286c.b("Trigger management exception", th2);
            this.f105312a.r();
            this.f105312a.o();
        }
    }

    public C12205d(Aq.a aVar, C12335d dVar, uq.h hVar, C12079e eVar, Cq.a aVar2, Gq.a aVar3, Bq.a aVar4) {
        C17542s.j(aVar, "remoteDataSource");
        C17542s.j(dVar, "localDataSource");
        C17542s.j(hVar, "logger");
        C17542s.j(eVar, "config");
        C17542s.j(aVar2, "episodEventMapper");
        C17542s.j(aVar3, "appLifecycleManager");
        C17542s.j(aVar4, "dispatcherProvider");
        this.f105284a = aVar;
        this.f105285b = dVar;
        this.f105286c = hVar;
        this.f105287d = aVar2;
        this.f105288e = aVar3;
        this.f105289f = aVar4;
        this.f105290g = eVar.a();
        C15906b.a aVar5 = C15906b.f135496b;
        this.f105291h = C15906b.K(C15908d.s(eVar.b(), C15909e.MINUTES));
        N.a aVar6 = N.f137593c0;
        this.f105294k = new g(aVar6, this);
        this.f105295l = new h(aVar6, this);
    }

    /* access modifiers changed from: private */
    public final void o() {
        p();
        q();
        n();
    }

    public void a(boolean z10) {
        r();
        if (!z10) {
            o();
        }
    }

    public void b(uq.g gVar) {
        C17542s.j(gVar, "event");
        Q q10 = this.f105296m;
        if (q10 != null) {
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new f(this, gVar, (C17164e<? super f>) null), 3, (Object) null);
        }
    }

    public final int i() {
        return this.f105292i;
    }

    public final String j(uq.g gVar) {
        C17542s.j(gVar, "event");
        EpisodEventPayload b10 = this.f105287d.b(gVar);
        C17514c a10 = Eq.a.f80751a.a();
        a10.a();
        return a10.b(EpisodEventPayload.Companion.serializer(), b10);
    }

    public final Q k() {
        return this.f105297n;
    }

    public final Q l() {
        return this.f105296m;
    }

    public final boolean m() {
        return this.f105293j;
    }

    public final F0 n() {
        Q q10 = this.f105297n;
        if (q10 != null) {
            return C16314k.d(q10, (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
        }
        return null;
    }

    public final F0 p() {
        Q q10 = this.f105297n;
        if (q10 != null) {
            return C16534i.M(C16534i.R(this.f105285b.b(), new b(this, (C17164e<? super b>) null)), q10);
        }
        return null;
    }

    public final void q() {
        this.f105288e.a(new c(this), new C2503d(this));
    }

    public final void r() {
        Q q10 = this.f105297n;
        if (q10 != null) {
            S.e(q10, (CancellationException) null, 1, (Object) null);
        }
        this.f105297n = S.a(this.f105289f.a().plus(this.f105295l));
        this.f105296m = S.a(this.f105289f.a().plus(b1.b((F0) null, 1, (Object) null)).plus(this.f105294k));
    }

    public final F0 s() {
        Q q10 = this.f105296m;
        if (q10 != null) {
            return C16314k.d(q10, (C17168i) null, (T) null, new e(this, (C17164e<? super e>) null), 3, (Object) null);
        }
        return null;
    }

    public final void t(boolean z10) {
        this.f105293j = z10;
    }

    public final void u(int i10) {
        this.f105292i = i10;
    }
}
