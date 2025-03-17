package com.contentsquare.android.sdk;

import E8.c;
import F8.g;
import G8.d;
import X8.b;
import XH.t;
import YH.C16877v;
import a9.B6;
import a9.C6783a1;
import a9.C6785a3;
import a9.C6796b6;
import a9.C6806d0;
import a9.C6827f5;
import a9.C6833g3;
import a9.C6843h5;
import a9.C6852i6;
import a9.C6863k1;
import a9.C6869l;
import a9.C6870l0;
import a9.C6880m2;
import a9.C6891n5;
import a9.C6894o0;
import a9.C6899o5;
import a9.C6903p1;
import a9.C6907p5;
import a9.C6916q6;
import a9.C6942u1;
import a9.C6946u5;
import a9.C6954v5;
import a9.C6956w;
import a9.C6962w5;
import a9.C6985z4;
import a9.E;
import a9.F2;
import a9.G;
import a9.G5;
import a9.H1;
import a9.I4;
import a9.I6;
import a9.N4;
import a9.N5;
import a9.P0;
import a9.Q5;
import a9.R3;
import a9.V1;
import a9.V5;
import a9.W4;
import a9.Y4;
import a9.Z;
import a9.Z0;
import a9.b7;
import a9.r;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.contentsquare.android.internal.features.initialize.ContentsquareModule;
import com.contentsquare.android.internal.features.sessionreplay.processing.SessionReplayProcessor;
import com.contentsquare.android.sdk.C7131j;
import java.util.List;
import k8.C8465a;
import kotlin.jvm.internal.C17542s;
import u8.C8886a;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    public final Application f46881a;

    /* renamed from: b  reason: collision with root package name */
    public final a f46882b;

    /* renamed from: c  reason: collision with root package name */
    public final c f46883c;

    /* renamed from: d  reason: collision with root package name */
    public final E f46884d;

    /* renamed from: e  reason: collision with root package name */
    public final Y4 f46885e;

    /* renamed from: f  reason: collision with root package name */
    public final d f46886f;

    /* renamed from: g  reason: collision with root package name */
    public final C6903p1 f46887g;

    /* renamed from: h  reason: collision with root package name */
    public final D8.c f46888h = new D8.c("SessionReplayRulesCoordinator");

    public static final class a {
    }

    public A(Application application, c cVar, E e10) {
        C17542s.j(application, "application");
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(e10, "configuration");
        a aVar = new a();
        Y4 y42 = new Y4();
        d dVar = new d(application);
        C6903p1 p1Var = new C6903p1();
        C17542s.j(application, "application");
        C17542s.j(aVar, "sessionReplayNonStatic");
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(e10, "configuration");
        C17542s.j(y42, "randomGenerator");
        C17542s.j(dVar, "buildInformation");
        C17542s.j(p1Var, "samplingModeTracker");
        this.f46881a = application;
        this.f46882b = aVar;
        this.f46883c = cVar;
        this.f46884d = e10;
        this.f46885e = y42;
        this.f46886f = dVar;
        this.f46887g = p1Var;
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        int i10;
        String str;
        List q10;
        boolean z13 = z10;
        boolean z14 = z12;
        this.f46888h.f("Starting evaluate with canRestartSessionReplay = " + z13 + " and newSession = " + z11 + "and isLowMemoryTriggered = " + z14);
        P0 p02 = P0.EVALUATE;
        C17542s.j(p02, "<this>");
        P0 a10 = C6870l0.a(p02, "LowMemoryRule", new Q5(z14));
        c cVar = this.f46883c;
        C17542s.j(a10, "<this>");
        C17542s.j(cVar, "preferenceStore");
        P0 a11 = C6870l0.a(a10, "FirstScreenViewRule", new C6827f5(cVar));
        c cVar2 = this.f46883c;
        C17542s.j(a11, "<this>");
        C17542s.j(cVar2, "preferenceStore");
        P0 a12 = C6870l0.a(a11, "FirstScreenViewAfterPauseRule", new W4(cVar2));
        c cVar3 = this.f46883c;
        C17542s.j(a12, "<this>");
        C17542s.j(cVar3, "preferenceStore");
        P0 a13 = C6870l0.a(a12, "ForceStartRule", new C6962w5(cVar3));
        E e10 = this.f46884d;
        C17542s.j(a13, "<this>");
        C17542s.j(e10, "configuration");
        P0 a14 = C6870l0.a(a13, "WaitingForConfigurationRule", new B6(e10));
        c cVar4 = this.f46883c;
        C17542s.j(a14, "<this>");
        C17542s.j(cVar4, "preferenceStore");
        P0 a15 = C6870l0.a(a14, "TrackingEnableRule", new C6796b6(cVar4));
        c cVar5 = this.f46883c;
        C17542s.j(a15, "<this>");
        C17542s.j(cVar5, "preferenceStore");
        P0 a16 = C6870l0.a(a15, "ForgetMeRule", new G5(cVar5));
        c cVar6 = this.f46883c;
        C17542s.j(a16, "<this>");
        C17542s.j(cVar6, "preferenceStore");
        P0 a17 = C6870l0.a(a16, "PauseTrackingRule", new V5(cVar6));
        c cVar7 = this.f46883c;
        C17542s.j(a17, "<this>");
        C17542s.j(cVar7, "preferenceStore");
        P0 a18 = C6870l0.a(a17, "ForceStartRule", new C6891n5(cVar7));
        E e11 = this.f46884d;
        d dVar = this.f46886f;
        C17542s.j(a18, "<this>");
        C17542s.j(e11, "configuration");
        C17542s.j(dVar, "buildInformation");
        P0 a19 = C6870l0.a(a18, "BlockedAppRule", new R3(e11, dVar));
        E e12 = this.f46884d;
        C17542s.j(a19, "<this>");
        C17542s.j(e12, "configuration");
        P0 a20 = C6870l0.a(a19, "FeatureFlagRule", new Z0(e12));
        C17542s.j(a20, "<this>");
        P0 a21 = C6870l0.a(a20, "CanRestartRule", new N4(z13));
        E e13 = this.f46884d;
        c cVar8 = this.f46883c;
        Y4 y42 = this.f46885e;
        C6903p1 p1Var = this.f46887g;
        D8.c cVar9 = C6907p5.f42800a;
        C17542s.j(a21, "<this>");
        C17542s.j(e13, "configuration");
        C17542s.j(cVar8, "preferenceStore");
        C17542s.j(y42, "randomGenerator");
        C17542s.j(p1Var, "samplingModeTracker");
        C6843h5 h5Var = r2;
        C6843h5 h5Var2 = new C6843h5(cVar8, e13, y42, p1Var, z11);
        int ordinal = C6870l0.a(a21, "RecordingRateRule", h5Var).ordinal();
        if (ordinal == 0) {
            i10 = 1;
        } else if (ordinal == 1) {
            i10 = 2;
        } else if (ordinal == 2 || ordinal == 3) {
            i10 = 3;
        } else {
            throw new t();
        }
        D8.c cVar10 = this.f46888h;
        int a22 = b7.a(i10);
        if (a22 == 0) {
            str = "start the session replay";
        } else if (a22 == 1) {
            str = "stop the session replay";
        } else if (a22 == 2) {
            str = "do nothing";
        } else {
            throw new t();
        }
        cVar10.f("Evaluation done, will ".concat(str));
        if (i10 == 1) {
            a aVar = this.f46882b;
            Application application = this.f46881a;
            C6863k1 k1Var = this.f46887g.f42791a;
            aVar.getClass();
            C17542s.j(application, "application");
            C17542s.j(k1Var, "samplingMode");
            C7131j jVar = C7131j.f47442k;
            C17542s.j(application, "application");
            C17542s.j(k1Var, "samplingMode");
            if (C7131j.f47446o == null) {
                C7131j.f47444m.h("SessionReplay.init need to be called before start.");
                return;
            }
            try {
                if (C7131j.f47442k == null) {
                    ContentsquareModule c10 = ContentsquareModule.c(application);
                    C17542s.i(c10, "getInstance(application)");
                    C8886a b10 = C8886a.f56874d.b(application);
                    G8.t tVar = new G8.t();
                    Z e14 = c10.e();
                    C17542s.i(e14, "csModule.sessionReplayProperties");
                    C6985z4 z4Var = new C6985z4(tVar, e14);
                    C6806d0 d0Var = new C6806d0();
                    C6899o5 o5Var = new C6899o5(d0Var);
                    C6869l lVar = new C6869l(d0Var);
                    C6880m2 m2Var = new C6880m2(d0Var);
                    C6894o0 o0Var = new C6894o0(d0Var);
                    V1 v12 = new V1(d0Var);
                    String str2 = "SessionReplay link updated: ";
                    r rVar = new r(d0Var);
                    V1 v13 = v12;
                    E e15 = C7131j.f47446o;
                    C17542s.g(e15);
                    C6954v5 v5Var = new C6954v5(d0Var, tVar, e15);
                    E e16 = C7131j.f47446o;
                    C17542s.g(e16);
                    C6852i6 i6Var = new C6852i6(d0Var, tVar, e16);
                    C8465a c11 = b.j(application).c();
                    C6806d0 d0Var2 = d0Var;
                    C17542s.i(c11, "getInstance(application).bridgeManager");
                    C6852i6 i6Var2 = i6Var;
                    r rVar2 = rVar;
                    C6869l lVar2 = lVar;
                    C6894o0 o0Var2 = o0Var;
                    I6 i62 = new I6(tVar, new Handler(Looper.getMainLooper()), 50);
                    C6946u5 a23 = c10.a();
                    C17542s.i(a23, "csModule.captureTouchEvent");
                    C6806d0 d0Var3 = d0Var2;
                    C6956w wVar = new C6956w(application, tVar, i62, a23, new G(b10.d()), d0Var3);
                    N5 u1Var = c11.l() ? new C6942u1(c11) : new I4(b10.d());
                    if (c11.l()) {
                        q10 = C16877v.q(u1Var, wVar);
                    } else {
                        C6946u5 a24 = c10.a();
                        C17542s.i(a24, "csModule.captureTouchEvent");
                        q10 = C16877v.q(u1Var, wVar, new C6833g3(application, a24, d0Var3));
                    }
                    List list = q10;
                    g d10 = b10.d();
                    C6916q6 q6Var = new C6916q6();
                    C6785a3 a3Var = C7131j.f47443l;
                    C6783a1 d11 = c10.d();
                    C17542s.i(d11, "csModule.liveActivityProvider");
                    String absolutePath = application.getApplicationContext().getFilesDir().getAbsolutePath();
                    C17542s.i(absolutePath, "application.applicationC…ext.filesDir.absolutePath");
                    F2 f22 = new F2(absolutePath);
                    E e17 = C7131j.f47446o;
                    C17542s.g(e17);
                    SessionReplayProcessor a25 = C7131j.a.a(k1Var, d0Var3, d10, application, q6Var, a3Var, d11, f22, z4Var, e17, list, c11, u1Var);
                    Z e18 = c10.e();
                    C17542s.i(e18, "csModule.sessionReplayProperties");
                    C7131j.f47442k = new C7131j(o5Var, lVar2, m2Var, o0Var2, rVar2, v13, v5Var, i6Var2, new C6985z4(tVar, e18), a25);
                    a25.startProcess(z11);
                    D8.c cVar11 = C7131j.f47444m;
                    cVar11.j("Session Replay is starting");
                    C7131j jVar2 = C7131j.f47442k;
                    C17542s.g(jVar2);
                    String a26 = jVar2.f47455i.a();
                    H2.a<String> aVar2 = C7131j.f47445n;
                    if (aVar2 != null) {
                        aVar2.accept(a26);
                    }
                    cVar11.j(str2 + a26);
                }
                C7131j.f47444m.f("Session Replay already started.");
            } catch (Exception e19) {
                H1.a(C7131j.f47444m, "Something went wrong, Session Replay couldn't be started.", e19);
            }
        } else if (i10 == 2) {
            this.f46887g.f42791a = C6863k1.RANDOM_SAMPLING;
            this.f46882b.getClass();
            C7131j jVar3 = C7131j.f47442k;
            C7131j.a.b();
            return;
        }
    }
}
