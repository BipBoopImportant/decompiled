package com.contentsquare.android.sdk;

import A8.b;
import E8.c;
import F8.e;
import F8.g;
import F8.j;
import XH.t;
import YH.C16870n;
import a9.C6842h4;
import a9.C6906p4;
import a9.E2;
import a9.F4;
import a9.P1;
import android.os.SystemClock;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import com.contentsquare.android.core.features.config.model.a;
import com.contentsquare.android.sdk.C7131j;
import kotlin.jvm.internal.C17542s;
import pI.C17752b;

public final class Q0 implements c.b, j {

    /* renamed from: a  reason: collision with root package name */
    public final c f47124a;

    /* renamed from: b  reason: collision with root package name */
    public final b f47125b;

    /* renamed from: c  reason: collision with root package name */
    public final g f47126c;

    /* renamed from: d  reason: collision with root package name */
    public final C6842h4 f47127d;

    /* renamed from: e  reason: collision with root package name */
    public final P1 f47128e;

    /* renamed from: f  reason: collision with root package name */
    public final D8.c f47129f;

    /* renamed from: g  reason: collision with root package name */
    public int f47130g;

    /* renamed from: h  reason: collision with root package name */
    public int f47131h;

    /* renamed from: i  reason: collision with root package name */
    public com.contentsquare.android.core.features.config.model.a f47132i;

    /* renamed from: j  reason: collision with root package name */
    public String f47133j;

    /* renamed from: k  reason: collision with root package name */
    public e f47134k;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f47135a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f47136b;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        static {
            /*
                E8.b[] r0 = E8.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                E8.b r2 = E8.b.DEVELOPER_SESSION_REPLAY_FORCE_QUALITY_LEVEL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                E8.b r3 = E8.b.DEVELOPER_SESSION_REPLAY_IMAGE_QUALITY_VALUE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                E8.b r4 = E8.b.DEVELOPER_SESSION_REPLAY_FPS_VALUE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                E8.b r4 = E8.b.RAW_CONFIGURATION_AS_JSON     // Catch:{ NoSuchFieldError -> 0x002b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r5 = 4
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f47135a = r0
                com.contentsquare.android.core.features.config.model.a[] r0 = com.contentsquare.android.core.features.config.model.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.contentsquare.android.core.features.config.model.a r4 = com.contentsquare.android.core.features.config.model.a.HIGH     // Catch:{ NoSuchFieldError -> 0x003c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                com.contentsquare.android.core.features.config.model.a r1 = com.contentsquare.android.core.features.config.model.a.MEDIUM     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                com.contentsquare.android.core.features.config.model.a r1 = com.contentsquare.android.core.features.config.model.a.LOW     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                f47136b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.Q0.a.<clinit>():void");
        }
    }

    public Q0(c cVar, b bVar, g gVar, C6842h4 h4Var) {
        P1 p12 = new P1(new E2());
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(bVar, "configuration");
        C17542s.j(gVar, "deviceInfo");
        C17542s.j(h4Var, "srEventProvider");
        C17542s.j(p12, "performanceMeasurement");
        this.f47124a = cVar;
        this.f47125b = bVar;
        this.f47126c = gVar;
        this.f47127d = h4Var;
        this.f47128e = p12;
        D8.c cVar2 = new D8.c("QualitySettings");
        this.f47129f = cVar2;
        a.C0814a aVar = com.contentsquare.android.core.features.config.model.a.Companion;
        this.f47132i = aVar.b(aVar.a());
        this.f47133j = aVar.a();
        cVar.n(this);
        this.f47134k = gVar.b();
        gVar.s(this);
        b();
        com.contentsquare.android.core.features.config.model.a aVar2 = com.contentsquare.android.core.features.config.model.a.values()[this.f47131h];
        C17542s.j(aVar2, "<set-?>");
        h4Var.f42594b = aVar2;
        cVar2.f("Parameters at instantiation:\nIs forced quality: " + cVar.b(E8.b.DEVELOPER_SESSION_REPLAY_FORCE_QUALITY_LEVEL, false) + "\nFPS: " + this.f47130g + "\nImage quality: " + this.f47131h + "\nMax millisecond ui thread usage: " + cVar.d(E8.b.DEVELOPER_SESSION_REPLAY_MAXIMUM_USAGE_ON_UI_THREAD_IN_MILLI_SEC, 40) + "\nSample number: 10");
    }

    public final void a() {
        this.f47134k = this.f47126c.b();
        C6906p4 p4Var = C6906p4.NETWORK_CHANGED;
        b();
        c(p4Var);
    }

    public final void b() {
        String str;
        JsonConfig.SessionReplay o10;
        if (this.f47124a.b(E8.b.DEVELOPER_SESSION_REPLAY_FORCE_QUALITY_LEVEL, false)) {
            c cVar = this.f47124a;
            E8.b bVar = E8.b.DEVELOPER_SESSION_REPLAY_FPS_VALUE;
            com.contentsquare.android.core.features.config.model.a aVar = com.contentsquare.android.core.features.config.model.a.MEDIUM;
            this.f47130g = cVar.d(bVar, aVar.m());
            this.f47131h = this.f47124a.d(E8.b.DEVELOPER_SESSION_REPLAY_IMAGE_QUALITY_VALUE, aVar.ordinal());
        } else {
            a.C0814a aVar2 = com.contentsquare.android.core.features.config.model.a.Companion;
            String a10 = aVar2.a();
            JsonConfig.ProjectConfiguration b10 = this.f47125b.b();
            if (!(b10 == null || (o10 = b10.o()) == null)) {
                e b11 = this.f47126c.b();
                this.f47134k = b11;
                a10 = b11 == e.WIFI ? o10.h() : o10.g();
            }
            this.f47133j = a10;
            com.contentsquare.android.core.features.config.model.a b12 = aVar2.b(a10);
            this.f47132i = b12;
            this.f47130g = b12.m();
            this.f47131h = this.f47132i.ordinal();
        }
        try {
            int i10 = a.f47136b[com.contentsquare.android.core.features.config.model.a.Companion.b(this.f47133j).ordinal()];
            if (i10 == 1) {
                str = "Best quality";
            } else if (i10 == 2) {
                str = "Standard";
            } else if (i10 == 3) {
                str = "Optimized";
            } else {
                throw new t();
            }
        } catch (IllegalArgumentException unused) {
            str = "UNKNOWN";
        }
        String str2 = this.f47126c.b() == e.WIFI ? "Wifi" : "Cellular";
        D8.c cVar2 = this.f47129f;
        cVar2.j("Session Replay quality settings applied: " + str2 + " - Data usage " + str + " (Image: " + this.f47131h + " - FPS: " + this.f47130g + ')');
    }

    public final void c(C6906p4 p4Var) {
        C6842h4 h4Var = this.f47127d;
        com.contentsquare.android.core.features.config.model.a aVar = this.f47132i;
        e eVar = this.f47134k;
        synchronized (h4Var) {
            try {
                C17542s.j(p4Var, "reason");
                C17542s.j(aVar, "currentQualityLevel");
                C17542s.j(eVar, "currentConnectionType");
                if (!(eVar == e.OFFLINE || aVar == h4Var.f42594b)) {
                    h4Var.f42593a.b(new F4(System.currentTimeMillis(), p4Var, h4Var.f42594b, aVar, h4Var.f42595c, eVar));
                    com.contentsquare.android.core.features.config.model.a aVar2 = h4Var.f42594b;
                    e eVar2 = h4Var.f42595c;
                    String str = "Sr QualityChanged event added: " + p4Var + " | " + aVar2.name() + " -> " + aVar.name();
                    if (p4Var == C6906p4.NETWORK_CHANGED) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(" | ");
                        int[] iArr = C6842h4.a.f42597a;
                        int i10 = iArr[eVar2.ordinal()];
                        sb2.append((i10 == 1 || i10 == 2) ? "Error" : i10 != 3 ? "Cellular" : "Wifi");
                        sb2.append(" -> ");
                        int i11 = iArr[eVar.ordinal()];
                        sb2.append((i11 == 1 || i11 == 2) ? "Error" : i11 != 3 ? "Cellular" : "Wifi");
                        str = sb2.toString();
                    }
                    h4Var.f42596d.f(str);
                    h4Var.f42594b = aVar;
                    h4Var.f42595c = eVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        P1 p12;
        P1 p13 = this.f47128e;
        long[] jArr = p13.f42197b;
        int i10 = p13.f42198c;
        p13.f42196a.getClass();
        jArr[i10] = SystemClock.elapsedRealtime() - p13.f42199d;
        int i11 = p13.f42198c + 1;
        p13.f42198c = i11;
        if (i11 >= p13.f42197b.length) {
            p13.f42198c = 0;
            p13.f42200e = true;
        }
        P1 p14 = this.f47128e;
        long f10 = p14.f42200e ? C17752b.f(C16870n.V(p14.f42197b)) : -1;
        if (f10 != -1) {
            D8.c cVar = this.f47129f;
            StringBuilder sb2 = new StringBuilder("Session Replay quality performance was ");
            sb2.append(f10);
            sb2.append(" ms. Forced Quality: ");
            c cVar2 = this.f47124a;
            E8.b bVar = E8.b.DEVELOPER_SESSION_REPLAY_FORCE_QUALITY_LEVEL;
            sb2.append(cVar2.b(bVar, false));
            cVar.f(sb2.toString());
            if (this.f47124a.b(bVar, false)) {
                c cVar3 = this.f47124a;
                E8.b bVar2 = E8.b.DEVELOPER_SESSION_REPLAY_FPS_VALUE;
                com.contentsquare.android.core.features.config.model.a aVar = com.contentsquare.android.core.features.config.model.a.MEDIUM;
                this.f47130g = cVar3.d(bVar2, aVar.m());
                this.f47131h = this.f47124a.d(E8.b.DEVELOPER_SESSION_REPLAY_IMAGE_QUALITY_VALUE, aVar.ordinal());
                return;
            }
            if (f10 >= ((long) this.f47124a.d(E8.b.DEVELOPER_SESSION_REPLAY_MAXIMUM_USAGE_ON_UI_THREAD_IN_MILLI_SEC, 40))) {
                int ordinal = this.f47132i.ordinal();
                if (ordinal <= 0) {
                    C7131j jVar = C7131j.f47442k;
                    C7131j.a.b();
                    this.f47129f.f("Session Replay stopped due to too much performance impact on UI thread");
                } else {
                    com.contentsquare.android.core.features.config.model.a aVar2 = com.contentsquare.android.core.features.config.model.a.values()[ordinal - 1];
                    this.f47132i = aVar2;
                    this.f47130g = aVar2.m();
                    this.f47131h = this.f47132i.ordinal();
                    c(C6906p4.CPU_USAGE);
                    D8.c cVar4 = this.f47129f;
                    cVar4.f("Session Replay quality reduced from " + com.contentsquare.android.core.features.config.model.a.values()[ordinal] + " to " + this.f47132i);
                }
                p12 = this.f47128e;
            } else {
                com.contentsquare.android.core.features.config.model.a b10 = com.contentsquare.android.core.features.config.model.a.Companion.b(this.f47133j);
                if (this.f47132i.ordinal() < b10.ordinal()) {
                    this.f47132i = b10;
                    this.f47130g = b10.m();
                    this.f47131h = this.f47132i.ordinal();
                    c(C6906p4.CPU_USAGE);
                    D8.c cVar5 = this.f47129f;
                    cVar5.f("Session Replay quality increased to " + this.f47132i);
                    p12 = this.f47128e;
                } else {
                    return;
                }
            }
            p12.f42198c = 0;
            p12.f42200e = false;
        }
    }

    public final void o(E8.b bVar) {
        C17542s.j(bVar, "key");
        int i10 = a.f47135a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            C6906p4 p4Var = C6906p4.CONFIG_APPLIED;
            b();
            c(p4Var);
        }
    }
}
