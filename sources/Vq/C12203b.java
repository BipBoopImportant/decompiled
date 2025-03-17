package vq;

import HJ.C15854t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.episod.datalayer.network.models.ClientDetails;
import com.ingka.ikea.episod.datalayer.network.models.Consent;
import com.ingka.ikea.episod.datalayer.network.models.EpisodEventPayload;
import com.ingka.ikea.episod.datalayer.network.models.EventDetails;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import dK.C17172a;
import dK.C17174c;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import uq.C12079e;
import uq.h;
import uq.j;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001\u0016B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0015H@¢\u0006\u0004\b\u001a\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\"\u0010*\u001a\u00020$8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lvq/b;", "Lvq/a;", "LAq/a;", "remoteDataSource", "LBq/a;", "dispatcherProvider", "Luq/h;", "logger", "Luq/e;", "episodConfig", "Luq/f;", "episodContract", "LdK/a;", "clock", "<init>", "(LAq/a;LBq/a;Luq/h;Luq/e;Luq/f;LdK/a;)V", "", "f", "(LdI/e;)Ljava/lang/Object;", "", "isTest", "LXH/N;", "a", "(Z)V", "b", "()Ljava/lang/String;", "e", "LAq/a;", "LBq/a;", "c", "Luq/h;", "d", "LdK/a;", "Lcom/ingka/ikea/episod/datalayer/network/models/EpisodEventPayload;", "Lcom/ingka/ikea/episod/datalayer/network/models/EpisodEventPayload;", "sessionStartPayload", "", "J", "getOffset$episod_core_release", "()J", "setOffset$episod_core_release", "(J)V", "offset", "g", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vq.b  reason: case insensitive filesystem */
public final class C12203b implements C12202a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f105266g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Aq.a f105267a;

    /* renamed from: b  reason: collision with root package name */
    private final Bq.a f105268b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final h f105269c;

    /* renamed from: d  reason: collision with root package name */
    private final C17172a f105270d;

    /* renamed from: e  reason: collision with root package name */
    private final EpisodEventPayload f105271e;

    /* renamed from: f  reason: collision with root package name */
    private volatile long f105272f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lvq/b$a;", "", "<init>", "()V", "", "EPISOD_ENGINE_ORIGIN", "Ljava/lang/String;", "SESSION_START_EVENT", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vq.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @f(c = "com.ingka.ikea.episod.datalayer.DateTimeRepositoryImpl", f = "DateTimeRepository.kt", l = {89}, m = "calculateOffset$episod_core_release")
    /* renamed from: vq.b$b  reason: collision with other inner class name */
    static final class C2502b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f105273c;

        /* renamed from: d  reason: collision with root package name */
        long f105274d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f105275e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C12203b f105276f;

        /* renamed from: g  reason: collision with root package name */
        int f105277g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2502b(C12203b bVar, C17164e<? super C2502b> eVar) {
            super(eVar);
            this.f105276f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f105275e = obj;
            this.f105277g |= Integer.MIN_VALUE;
            return this.f105276f.e(this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"vq/b$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vq.b$c */
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12203b f105278a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, C12203b bVar) {
            super(aVar);
            this.f105278a = bVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            this.f105278a.f105269c.b("Error setting offset", th2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
    @f(c = "com.ingka.ikea.episod.datalayer.DateTimeRepositoryImpl$initialize$2", f = "DateTimeRepository.kt", l = {75}, m = "invokeSuspend")
    /* renamed from: vq.b$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f105279c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12203b f105280d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C12203b bVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f105280d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f105280d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f105279c;
            if (i10 == 0) {
                y.b(obj);
                C12203b bVar = this.f105280d;
                this.f105279c = 1;
                if (bVar.e(this) == f10) {
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @f(c = "com.ingka.ikea.episod.datalayer.DateTimeRepositoryImpl", f = "DateTimeRepository.kt", l = {97}, m = "sendSessionStartEvent")
    /* renamed from: vq.b$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f105281c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12203b f105282d;

        /* renamed from: e  reason: collision with root package name */
        int f105283e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C12203b bVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f105282d = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f105281c = obj;
            this.f105283e |= Integer.MIN_VALUE;
            return this.f105282d.f(this);
        }
    }

    public C12203b(Aq.a aVar, Bq.a aVar2, h hVar, C12079e eVar, uq.f fVar, C17172a aVar3) {
        Aq.a aVar4 = aVar;
        Bq.a aVar5 = aVar2;
        h hVar2 = hVar;
        C17172a aVar6 = aVar3;
        C17542s.j(aVar4, "remoteDataSource");
        C17542s.j(aVar5, "dispatcherProvider");
        C17542s.j(hVar2, "logger");
        C17542s.j(eVar, "episodConfig");
        C17542s.j(fVar, "episodContract");
        C17542s.j(aVar6, "clock");
        this.f105267a = aVar4;
        this.f105268b = aVar5;
        this.f105269c = hVar2;
        this.f105270d = aVar6;
        this.f105271e = new EpisodEventPayload("2.3.1", eVar.c(), fVar.b(), fVar.c(), fVar.a(), (String) null, "session_start", "episod_engine", "app", j.a().f(), new EventDetails(C16877v.n(), "", (String) null, (String) null, (String) null, (String) null, (String) null, 124, (DefaultConstructorMarker) null), new ClientDetails(fVar.d(), new Consent(fVar.e().a(), fVar.e().b(), fVar.e().c()), eVar.f(), "Device brand", "Device model"), 32, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(dI.C17164e<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof vq.C12203b.e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            vq.b$e r0 = (vq.C12203b.e) r0
            int r1 = r0.f105283e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f105283e = r1
            goto L_0x0018
        L_0x0013:
            vq.b$e r0 = new vq.b$e
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f105281c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f105283e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            XH.y.b(r7)     // Catch:{ q | IOException -> 0x0058 }
            goto L_0x0052
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0032:
            XH.y.b(r7)
            Eq.a r7 = Eq.a.f80751a     // Catch:{ q | IOException -> 0x0058 }
            kK.c r7 = r7.a()     // Catch:{ q | IOException -> 0x0058 }
            com.ingka.ikea.episod.datalayer.network.models.EpisodEventPayload$a r2 = com.ingka.ikea.episod.datalayer.network.models.EpisodEventPayload.Companion     // Catch:{ q | IOException -> 0x0058 }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ q | IOException -> 0x0058 }
            com.ingka.ikea.episod.datalayer.network.models.EpisodEventPayload r5 = r6.f105271e     // Catch:{ q | IOException -> 0x0058 }
            java.lang.String r7 = r7.b(r2, r5)     // Catch:{ q | IOException -> 0x0058 }
            Aq.a r2 = r6.f105267a     // Catch:{ q | IOException -> 0x0058 }
            r0.f105283e = r4     // Catch:{ q | IOException -> 0x0058 }
            java.lang.Object r7 = r2.a(r7, r0)     // Catch:{ q | IOException -> 0x0058 }
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            com.ingka.ikea.episod.datalayer.network.models.EpisodResponse r7 = (com.ingka.ikea.episod.datalayer.network.models.EpisodResponse) r7     // Catch:{ q | IOException -> 0x0058 }
            java.lang.String r3 = r7.a()     // Catch:{ q | IOException -> 0x0058 }
        L_0x0058:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vq.C12203b.f(dI.e):java.lang.Object");
    }

    public void a(boolean z10) {
        if (!z10) {
            F0 unused = C16314k.d(S.a(this.f105268b.a()), new c(N.f137593c0, this), (T) null, new d(this, (C17164e<? super d>) null), 2, (Object) null);
        }
    }

    public String b() {
        return C15854t.Q(C17174c.Companion.b(this.f105270d.a().b() + this.f105272f).toString(), "Z", "+00:00", false, 4, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(dI.C17164e<? super XH.C16807N> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof vq.C12203b.C2502b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            vq.b$b r0 = (vq.C12203b.C2502b) r0
            int r1 = r0.f105277g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f105277g = r1
            goto L_0x0018
        L_0x0013:
            vq.b$b r0 = new vq.b$b
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f105275e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f105277g
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            long r1 = r0.f105274d
            java.lang.Object r0 = r0.f105273c
            vq.b r0 = (vq.C12203b) r0
            XH.y.b(r7)
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0037:
            XH.y.b(r7)
            dK.a r7 = r6.f105270d
            dK.c r7 = r7.a()
            long r4 = r7.b()
            r0.f105273c = r6
            r0.f105274d = r4
            r0.f105277g = r3
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r0 = r6
            r1 = r4
        L_0x0053:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x005a
            XH.N r7 = XH.C16807N.f139792a
            return r7
        L_0x005a:
            dK.c$a r3 = dK.C17174c.Companion
            dK.c r7 = r3.d(r7)
            long r3 = r7.b()
            long r3 = r3 - r1
            r0.f105272f = r3
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vq.C12203b.e(dI.e):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12203b(Aq.a aVar, Bq.a aVar2, h hVar, C12079e eVar, uq.f fVar, C17172a aVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, hVar, eVar, fVar, (i10 & 32) != 0 ? C17172a.C3482a.f142972a : aVar3);
    }
}
